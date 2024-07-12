package net.sen.lostworlds.client.gui;

import com.google.common.collect.ImmutableMap;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.datafixers.util.Either;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Font;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.client.gui.screens.inventory.tooltip.ClientTooltipComponent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.api.distmarker.OnlyIn;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.neoforge.client.event.RenderTooltipEvent;
import net.neoforged.neoforge.common.NeoForge;
import net.sen.lostworlds.api.LostWorldsApi;
import net.sen.lostworlds.event.MagicValueEvent;
import net.sen.lostworlds.client.event.TooltipOverlayEvent;
import net.sen.lostworlds.magic.MagicElementTypeEnum;
import net.sen.lostworlds.magic.MagicProperties;
import net.sen.lostworlds.util.guiObj;
import net.sen.lostworlds.util.helpers.MagicTypeHelper;

import java.util.List;
import java.util.Map;

@OnlyIn(Dist.CLIENT)
public class TooltipOverlayHandler {
    private static final ResourceLocation MC_ICONS = LostWorldsApi.mcLoc("textures/gui/icons.png");
    private static final ResourceLocation MOD_ICONS = LostWorldsApi.modLoc("textures/gui/magic_tooltip_icons.png");
    public static final int TOOLTIP_REAL_HEIGHT_OFFSET_BOTTOM = 3;
    public static final int TOOLTIP_REAL_HEIGHT_OFFSET_TOP = -3;
    public static final int TOOLTIP_REAL_WIDTH_OFFSET_RIGHT = 3;

    //Leave it like this so if i make the files individual its easy to implement that
    private static final Map<MagicElementTypeEnum, guiObj> MAGIC_ELEMENTS_UI_MAP = (new ImmutableMap.Builder<MagicElementTypeEnum, guiObj>())
            .put(MagicElementTypeEnum.RAW, new guiObj(MOD_ICONS, 0, 0))
            .put(MagicElementTypeEnum.BLOOD, new guiObj(MOD_ICONS, 16, 0))
            .put(MagicElementTypeEnum.ENDER, new guiObj(MOD_ICONS, 32, 0))
            .put(MagicElementTypeEnum.NATURE, new guiObj(MOD_ICONS, 48, 0))
            .put(MagicElementTypeEnum.FIRE, new guiObj(MOD_ICONS, 64, 0))
            .put(MagicElementTypeEnum.WATER, new guiObj(MOD_ICONS, 0, 16))
            .put(MagicElementTypeEnum.METAL, new guiObj(MOD_ICONS, 16, 16))
            .put(MagicElementTypeEnum.EARTH, new guiObj(MOD_ICONS, 32, 16))
            .put(MagicElementTypeEnum.CRYSTAL, new guiObj(MOD_ICONS, 48, 16))
            .put(MagicElementTypeEnum.ICE, new guiObj(MOD_ICONS, 64, 16))
            .put(MagicElementTypeEnum.AIR, new guiObj(MOD_ICONS, 0, 32))
            .put(MagicElementTypeEnum.LIGHTNING, new guiObj(MOD_ICONS, 16, 32))
            .put(MagicElementTypeEnum.REDSTONE, new guiObj(MOD_ICONS, 32, 32))
            .put(MagicElementTypeEnum.WITHER, new guiObj(MOD_ICONS, 48, 32))
            .put(MagicElementTypeEnum.SPECTRAL, new guiObj(MOD_ICONS, 64, 32))
            .put(MagicElementTypeEnum.DIMENSIONAL, new guiObj(MOD_ICONS, 0, 48))
            .put(MagicElementTypeEnum.POISON, new guiObj(MOD_ICONS, 16, 48))
            .put(MagicElementTypeEnum.DREAMS, new guiObj(MOD_ICONS, 32, 48))
            .put(MagicElementTypeEnum.BLESSED, new guiObj(MOD_ICONS, 48, 48))
            .put(MagicElementTypeEnum.CURSED, new guiObj(MOD_ICONS, 64, 48))
            .put(MagicElementTypeEnum.WILD, new guiObj(MOD_ICONS, 0, 64))
            .build();

    public static void init() {
        NeoForge.EVENT_BUS.register(new TooltipOverlayHandler());
    }

    public static class MagicTooltipRenderer implements ClientTooltipComponent {
        private MagicTooltip magicTooltip;

        public MagicTooltipRenderer(MagicTooltip magicTooltip) {
            this.magicTooltip = magicTooltip;
        }

        @Override
        public int getHeight() {
            return 9 + 1 + 7 + 3;
        }

        @Override
        public int getWidth(Font pFont) {
            int magicBarWidth = magicTooltip.getMagicProperties().getMagicElementTypeEnum().size() * 9;

            return magicBarWidth + 2;
        }

        @Override
        public void renderImage(Font pFont, int pX, int pY, GuiGraphics pGuiGraphics) {
            ItemStack itemStack = magicTooltip.getItemStack();
            Minecraft mc = Minecraft.getInstance();

            if (!shouldShowTooltip(itemStack, mc.player))
                return;

            Screen gui = mc.screen;

            if (gui == null)
                return;

            MagicProperties magicProperties = magicTooltip.getMagicProperties();

            TooltipOverlayEvent.Render renderEvent = new TooltipOverlayEvent.Render(itemStack, pX, pY, pGuiGraphics, magicProperties);
            NeoForge.EVENT_BUS.post(renderEvent);
            if (renderEvent.isCanceled())
                return;

            pX = renderEvent.x;
            pY = renderEvent.y;
            pGuiGraphics = renderEvent.guiGraphics;

            RenderSystem.enableDepthTest();
            RenderSystem.enableBlend();
            RenderSystem.defaultBlendFunc();

            int offsetX = pX;
            int offsetY = pY;

            List<MagicElementTypeEnum> magicElementTypeEnum = magicProperties.getMagicElementTypeEnum();
            int magicElementTypeCount = magicElementTypeEnum.size();

            offsetX += (magicElementTypeCount - 1) * 9;

            for (int i = 0; i < magicElementTypeEnum.size(); i++) {
                ResourceLocation resourceLocation = MAGIC_ELEMENTS_UI_MAP.get(magicElementTypeEnum.get(i)).getResourceLocation();
                int iconU = MAGIC_ELEMENTS_UI_MAP.get(magicElementTypeEnum.get(i)).getIconU();
                int iconV = MAGIC_ELEMENTS_UI_MAP.get(magicElementTypeEnum.get(i)).getIconV();

                int x = i > 0 ? i * 16 : 0;

                pGuiGraphics.blit(
                        resourceLocation,
                        offsetX + x,
                        offsetY,
                        iconU,
                        iconV,
                        16,
                        16
                );
            }

            RenderSystem.disableBlend();
            RenderSystem.setShaderColor(1.0f, 1.0f, 1.0f, 1.0f);
            RenderSystem.setShaderTexture(0, MC_ICONS);

            RenderSystem.disableDepthTest();
        }
    }

    @SubscribeEvent
    public void gatherTooltips(RenderTooltipEvent.GatherComponents event) {
        if (event.isCanceled())
            return;

        ItemStack hoveredStack = event.getItemStack();
        Minecraft mc = Minecraft.getInstance();

        Item item = hoveredStack.getItem();
        MagicProperties magicalProperties = MagicTypeHelper.getMagicProperties(hoveredStack, mc.player);


        if (!shouldShowTooltip(hoveredStack, mc.player))
            return;

//        MagicProperties magicalProperties = MagicTypeHelper.getMagicValue(hoveredStack, mc.player);

        MagicValueEvent magicValueEvent = new MagicValueEvent(mc.player, hoveredStack, magicalProperties);
        NeoForge.EVENT_BUS.post(magicValueEvent);

        TooltipOverlayEvent.Pre prerenderEvent = new TooltipOverlayEvent.Pre(hoveredStack, magicalProperties);
        NeoForge.EVENT_BUS.post(prerenderEvent);
        if (prerenderEvent.isCanceled())
            return;

        MagicTooltip magicToolTip = new MagicTooltip(prerenderEvent.itemStack, magicalProperties, mc.player);
        if (magicToolTip.shouldRenderMagicIcons()) {
            event.getTooltipElements().add(Either.right(magicToolTip));
        }
    }

    private static boolean shouldShowTooltip(ItemStack hoveredStack, Player player)
    {
        if (hoveredStack.isEmpty())
            return false;

//        boolean shouldShowTooltip = (ModConfig.SHOW_FOOD_VALUES_IN_TOOLTIP.get() && KeyHelper.isShiftKeyDown()) || ModConfig.ALWAYS_SHOW_FOOD_VALUES_TOOLTIP.get();
//        if (!shouldShowTooltip)
//            return false;

        if (!MagicTypeHelper.isMagical(hoveredStack, player))
            return false;

        return true;
    }
}
