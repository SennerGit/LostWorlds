package net.sen.lostworlds.datagen;

import net.minecraft.advancements.*;
import net.minecraft.advancements.AdvancementHolder;
import net.minecraft.advancements.critereon.ChangeDimensionTrigger;
import net.minecraft.advancements.critereon.InventoryChangeTrigger;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Blocks;
import net.neoforged.neoforge.common.data.AdvancementProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.sen.lostworlds.api.LostWorldsApi;
import net.sen.lostworlds.registry.items.ModItems;
import net.sen.lostworlds.registry.blocks.*;
import net.sen.lostworlds.worldgen.dimension.ModDimensions;

import java.util.List;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;

public class ModAdvancementsProvider extends AdvancementProvider {
    public ModAdvancementsProvider(DataGenerator generatorIn, CompletableFuture<HolderLookup.Provider> registries, ExistingFileHelper existingFileHelper) {
        super(generatorIn.getPackOutput(), registries, existingFileHelper, List.of(
                new BaseAdvancements(),
                new UnderworldAdvancements(),
                new NidavellirAdvancements(),
                new AlfheimrAdvancements(),
                new AtlantisAdvancements(),
                new SkyopiaAdvancements()
        ));
    }

    public static class BaseAdvancements implements AdvancementProvider.AdvancementGenerator {
        @Override
        public void generate(HolderLookup.Provider pRegistries, Consumer<AdvancementHolder> saver, ExistingFileHelper existingFileHelper) {
            AdvancementHolder root = createAdvancementCraftingParent(
                    "base",
                    "root",
                    ModItems.BASIC_PORTAL_CORE.get(),
                    Item.byBlock(Blocks.OBSIDIAN),
                    ModItems.BASIC_PORTAL_CORE.get(),
                    saver,
                    existingFileHelper
            );

            createAdvancementCrafting(
                    "base",
                    "has_dowsing_rod",
                    root,
                    ModItems.MAGICAL_DOWSING_ROD.get(),
                    ModItems.MAGICAL_DOWSING_ROD.get(),
                    saver,
                    existingFileHelper
            );
        }
    }
    public static class UnderworldAdvancements implements AdvancementProvider.AdvancementGenerator {
        @Override
        public void generate(HolderLookup.Provider pRegistries, Consumer<AdvancementHolder> saver, ExistingFileHelper existingFileHelper) {
            AdvancementHolder root = createAdvancementDimensionParent(
                    "underworld",
                    "root",
                    Item.byBlock(UnderworldBlocks.UNDERWORLD_PORTAL_FRAME.get()),
                    Item.byBlock(UnderworldBlocks.UNDERWORLD_PORTAL.get()),
                    ModDimensions.UNDERWORLD_LEVEL_KEY,
                    saver,
                    existingFileHelper
            );
        }
    }
    public static class NidavellirAdvancements implements AdvancementProvider.AdvancementGenerator {
        @Override
        public void generate(HolderLookup.Provider pRegistries, Consumer<AdvancementHolder> saver, ExistingFileHelper existingFileHelper) {
            AdvancementHolder root = createAdvancementDimensionParent(
                    "nidavellir",
                    "root",
                    Item.byBlock(NidavellirBlocks.NIDAVELLIR_PORTAL_FRAME.get()),
                    Item.byBlock(NidavellirBlocks.NIDAVELLIR_PORTAL.get()),
                    ModDimensions.NIDAVELLIR_LEVEL_KEY,
                    saver,
                    existingFileHelper
            );
        }
    }
    public static class AlfheimrAdvancements implements AdvancementProvider.AdvancementGenerator {
        @Override
        public void generate(HolderLookup.Provider pRegistries, Consumer<AdvancementHolder> saver, ExistingFileHelper existingFileHelper) {
            AdvancementHolder root = createAdvancementDimensionParent(
                    "alfheimr",
                    "root",
                    Item.byBlock(AlfheimrBlocks.ALFHEIMR_PORTAL_FRAME.get()),
                    Item.byBlock(AlfheimrBlocks.ALFHEIMR_PORTAL.get()),
                    ModDimensions.ALFHEIMR_LEVEL_KEY,
                    saver,
                    existingFileHelper
            );
        }
    }
    public static class AtlantisAdvancements implements AdvancementProvider.AdvancementGenerator {
        @Override
        public void generate(HolderLookup.Provider pRegistries, Consumer<AdvancementHolder> saver, ExistingFileHelper existingFileHelper) {
            AdvancementHolder root = createAdvancementDimensionParent(
                    "atlantis",
                    "root",
                    Item.byBlock(AtlantisBlocks.ATLANTIS_PORTAL_FRAME.get()),
                    Item.byBlock(AtlantisBlocks.ATLANTIS_PORTAL.get()),
                    ModDimensions.ATLANTIS_LEVEL_KEY,
                    saver,
                    existingFileHelper
            );
        }
    }
    public static class SkyopiaAdvancements implements AdvancementProvider.AdvancementGenerator {
        @Override
        public void generate(HolderLookup.Provider pRegistries, Consumer<AdvancementHolder> saver, ExistingFileHelper existingFileHelper) {
            AdvancementHolder root = createAdvancementDimensionParent(
                    "skyopia",
                    "root",
                    Item.byBlock(SkyopiaBlocks.SKYOPIA_PORTAL_FRAME.get()),
                    Item.byBlock(SkyopiaBlocks.SKYOPIA_PORTAL.get()),
                    ModDimensions.SKYOPIA_LEVEL_KEY,
                    saver,
                    existingFileHelper
            );
        }
    }

    private static AdvancementHolder createAdvancementDimensionParent(String tree, String id, Item iconBlock, Item backgroundBlock, ResourceKey<Level> levelResourceKey, Consumer<AdvancementHolder> saver, ExistingFileHelper existingFileHelper) {
        String newId = new String(tree + "/" + id);

        AdvancementHolder newAdvancement = Advancement.Builder.advancement()
                .display(rootDisplay(
                        iconBlock,
                        advancementLoc(tree, id, "name"),
                        advancementLoc(tree, id, "desc"),
                        Optional.of(LostWorldsApi.modLoc("textures/block/" + Item.getId(backgroundBlock) + ".png"))
                ))
                .addCriterion("has_entered_dimension_" + levelResourceKey.location().getPath(), ChangeDimensionTrigger.TriggerInstance.changedDimensionTo(levelResourceKey))
                .save(saver, LostWorldsApi.modLoc(newId), existingFileHelper);

        return newAdvancement;
    }
    private static AdvancementHolder createAdvancementCraftingParent(String tree, String id, Item iconBlock, Item backgroundBlock, Item goal, Consumer<AdvancementHolder> saver, ExistingFileHelper existingFileHelper) {
        String newId = new String(tree + "/" + id);

        AdvancementHolder newAdvancement = Advancement.Builder.advancement()
                .display(rootDisplay(
                        iconBlock,
                        advancementLoc(tree, id, "name"),
                        advancementLoc(tree, id, "desc"),
                        Optional.of(LostWorldsApi.modLoc("textures/block/" + Item.getId(backgroundBlock) + ".png"))
                ))
                .addCriterion("has_crafted_" + Item.getId(goal), InventoryChangeTrigger.TriggerInstance.hasItems(goal))
                .save(saver, LostWorldsApi.modLoc(newId), existingFileHelper);

        return newAdvancement;
    }

    private static AdvancementHolder createAdvancementCrafting(String tree, String id, AdvancementHolder parent, Item iconBlock, Item goal, Consumer<AdvancementHolder> saver, ExistingFileHelper existingFileHelper) {
        String newId = new String(tree + "/" + id);

        AdvancementHolder newAdvancement = Advancement.Builder.advancement()
                .display(rootDisplay(
                        iconBlock,
                        advancementLoc(tree, id, "name"),
                        advancementLoc(tree, id, "desc"),
                        null
                ))
                .parent(parent)
                .addCriterion("has_crafted_" + Item.getId(goal), InventoryChangeTrigger.TriggerInstance.hasItems(goal))
                .save(saver, LostWorldsApi.modLoc(newId), existingFileHelper);

        return newAdvancement;
    }

    protected static DisplayInfo rootDisplay(ItemLike icon, String titleKey, String descKey, Optional<ResourceLocation> background) {
        return new DisplayInfo(
                new ItemStack(icon.asItem()),
                Component.translatable(titleKey),
                Component.translatable(descKey),
                background,
                AdvancementType.TASK,
                false,
                false,
                false
        );
    }

    private static String advancementLoc(String name, String base, String type) {
        return "advancement." + LostWorldsApi.MODID + "." + name + "." + base + "." + type;
    }
}
