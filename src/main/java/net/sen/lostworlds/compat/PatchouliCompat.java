package net.sen.lostworlds.compat;

import com.google.common.collect.ImmutableMap;
import com.mojang.blaze3d.systems.RenderSystem;

import net.minecraft.ChatFormatting;
import net.minecraft.client.Minecraft;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.Style;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.Recipe;
import net.minecraft.world.item.crafting.RecipeManager;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.sen.lostworlds.client.ModEventClientBusEvents;
import vazkii.patchouli.api.BookDrawScreenEvent;
import vazkii.patchouli.api.IMultiblock;
import vazkii.patchouli.api.IVariable;
import vazkii.patchouli.api.PatchouliAPI;

import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.sen.lostworlds.LostWorldsApi;
import net.sen.lostworlds.datagen.tag.ModItemTagGenerator;
import net.sen.lostworlds.multiblocks.Matcher;
import net.sen.lostworlds.client.renderers.SupporterFancyHandler;

import java.util.*;
import java.util.stream.Collectors;

public class PatchouliCompat implements ICompat{
//    public enum textureEnum {
//        LOST_WORLDS_BOOK,
//        ALFHEIMR_BOOK,
//        ATLANTIS_BOOK,
//        NIDAVELLIR_BOOK,
//        SKYOPIA_BOOK,
//        UNDERWORLD_BOOK
//    };
//    public static final Map<textureEnum, ResourceLocation> BOOK_MAP = ImmutableMap.<textureEnum, ResourceLocation>builder()
//            .put(textureEnum.LOST_WORLDS_BOOK, LostWorldsApi.modLoc("lost_worlds_book"))
//            .put(textureEnum.ALFHEIMR_BOOK, LostWorldsApi.modLoc("alfheimr_book"))
//            .put(textureEnum.ATLANTIS_BOOK, LostWorldsApi.modLoc("atlantis_book"))
//            .put(textureEnum.NIDAVELLIR_BOOK, LostWorldsApi.modLoc("nidavellir_book"))
//            .put(textureEnum.SKYOPIA_BOOK, LostWorldsApi.modLoc("skyopia_book"))
//            .put(textureEnum.UNDERWORLD_BOOK, LostWorldsApi.modLoc("underworld_book"))
//            .build();
    public static final ResourceLocation LOST_WORLDS_BOOK = LostWorldsApi.modLoc("lost_worlds_book");
    public static final ResourceLocation ALFHEIMR_BOOK = LostWorldsApi.modLoc("alfheimr_book");
    public static final ResourceLocation ATLANTIS_BOOK = LostWorldsApi.modLoc("atlantis_book");
    public static final ResourceLocation NIDAVELLIR_BOOK = LostWorldsApi.modLoc("nidavellir_book");
    public static final ResourceLocation SKYOPIA_BOOK = LostWorldsApi.modLoc("skyopia_book");
    public static final ResourceLocation UNDERWORLD_BOOK = LostWorldsApi.modLoc("underworld_book");

    private static final Map<ResourceLocation, IMultiblock> MULTIBLOCKS = new HashMap<>();

    public static void addPatchouliMultiblock(ResourceLocation name, String[][] pattern, Object... rawMatchers) {
        for (int i = 1; i < rawMatchers.length; i += 2) {
            if (rawMatchers[i] instanceof Matcher matcher) {
                Matcher.ICheck check = matcher.check();

                if (check == null) {
                    rawMatchers[i] = PatchouliAPI.get().anyMatcher();
                }
                else {
                    rawMatchers[i] = PatchouliAPI.get().predicateMatcher(matcher.defaultState(),
                            state -> check.matches(null, null, null, null, state, (char) 0));
                }
            }
        }
        PatchouliCompat.MULTIBLOCKS.put(name, PatchouliAPI.get().makeMultiblock(pattern, rawMatchers));
    }

    @SuppressWarnings("unchecked")
    public static <T extends Recipe<?>> T getRecipe(String type, String name) {
        RecipeManager manager = Minecraft.getInstance().level.getRecipeManager();
        ResourceLocation res = new ResourceLocation(name);
        ResourceLocation pre = new ResourceLocation(res.getNamespace(), type + "/" + res.getPath());
        return (T) manager.byKey(pre).orElse(null);
    }

    public static IVariable ingredientVariable(Ingredient ingredient) {
        return IVariable.wrapList(Arrays.stream(ingredient.getItems())
                .map(IVariable::from).collect(Collectors.toList()));
    }

    @Override
    public void setup(FMLCommonSetupEvent event) {
        event.enqueueWork(() -> {
            for (var entry : PatchouliCompat.MULTIBLOCKS.entrySet())
                PatchouliAPI.get().registerMultiblock(entry.getKey(), entry.getValue());
        });
    }

    @Override
    public void setupClient() {
        MinecraftForge.EVENT_BUS.register(this);
    }

    @Override
    public void addItemTags(ModItemTagGenerator provider) {

    }

    @SubscribeEvent
    @OnlyIn(Dist.CLIENT)
    public void onBookDraw(BookDrawScreenEvent event) {
        var book = event.getBook();
        var gui = event.getScreen();

//        for ()
        if (
                book == null ||
                !book.equals(PatchouliCompat.LOST_WORLDS_BOOK) ||
                !book.equals(PatchouliCompat.ALFHEIMR_BOOK) ||
                !book.equals(PatchouliCompat.ATLANTIS_BOOK) ||
                !book.equals(PatchouliCompat.NIDAVELLIR_BOOK) ||
                !book.equals(PatchouliCompat.SKYOPIA_BOOK) ||
                !book.equals(PatchouliCompat.UNDERWORLD_BOOK)
        )
            return;

        var name = gui.getMinecraft().player.getName().getString();
        var info = SupporterFancyHandler.FANCY_INFOS.get(name);
        if (info != null) {
            var x = gui.width / 2 - 272 / 2 + 20;
            var y = gui.height / 2 + 180 / 2;

            event.getGraphics().blit(ModEventClientBusEvents.BOOK_GUI, x, y, 496, 44, 16, 18, 512, 256);
            if (info.tier() == 1) {
                event.getGraphics().blit(ModEventClientBusEvents.BOOK_GUI, x, y, 496 - 16, 44, 16, 18, 512, 256);
            } else {
                var r = (info.colour() >> 16 & 255) / 255F;
                var g = (info.colour() >> 8 & 255) / 255F;
                var b = (info.colour() & 255) / 255F;
                RenderSystem.setShaderColor(r, g, b, 1);
                event.getGraphics().blit(ModEventClientBusEvents.BOOK_GUI, x, y, 496 - 32, 44, 16, 18, 512, 256);
            }

            if (event.getMouseX() >= x && event.getMouseY() >= y && event.getMouseX() < x + 16 && event.getMouseY() < y + 18)
                event.getGraphics().renderTooltip(gui.getMinecraft().font,
                        Collections.singletonList(Component.literal("Thanks for your support, " + name + "!").setStyle(Style.EMPTY.applyFormat(ChatFormatting.YELLOW))), Optional.empty(),
                        event.getMouseX(), event.getMouseY());

        }
    }
}
