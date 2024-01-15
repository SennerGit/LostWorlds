package net.sen.lostworlds.datagen;

import net.minecraft.advancements.Advancement;
import net.minecraft.advancements.CriterionTriggerInstance;
import net.minecraft.advancements.DisplayInfo;
import net.minecraft.advancements.FrameType;
import net.minecraft.advancements.critereon.ChangeDimensionTrigger;
import net.minecraft.advancements.critereon.InventoryChangeTrigger;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.Level;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.common.data.ForgeAdvancementProvider;
import net.sen.lostworlds.LostWorldsApi;
import net.sen.lostworlds.block.ModBlocks;
import net.sen.lostworlds.item.ModItems;
import net.sen.lostworlds.worldgen.dimension.ModDimensions;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;

public class ModAdvancementsProvider extends ForgeAdvancementProvider {
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

    public static class BaseAdvancements implements ForgeAdvancementProvider.AdvancementGenerator {
        @Override
        public void generate(HolderLookup.Provider pRegistries, Consumer<Advancement> saver, ExistingFileHelper existingFileHelper) {
            Advancement root = createAdvancement(
                    "base/root",
                    ModItems.BASIC_PORTAL_CORE.get(),
                    "advancement.lostworlds.base.root.name",
                    "advancement.lostworlds.base.root.desc",
                    LostWorldsApi.mcLoc("textures/blocks/obsidian.png"),
                    InventoryChangeTrigger.TriggerInstance.hasItems(ModItems.BASIC_PORTAL_CORE.get()),
                    saver,
                    existingFileHelper
            );

            createAdvancement(
                    "base/has_dowsing_rod",
                    ModItems.MAGICAL_DOWSING_ROD.get(),
                    "advancement.lostworlds.base.dowsing_rod.name",
                    "advancement.lostworlds.base.dowsing_rod.desc",
                    null,
                    root,
                    InventoryChangeTrigger.TriggerInstance.hasItems(ModItems.MAGICAL_DOWSING_ROD.get()),
                    saver,
                    existingFileHelper
            );
        }
    }
    public static class UnderworldAdvancements implements ForgeAdvancementProvider.AdvancementGenerator {
        @Override
        public void generate(HolderLookup.Provider pRegistries, Consumer<Advancement> saver, ExistingFileHelper existingFileHelper) {
            Advancement root = createAdvancement(
                    "underworld/root",
                    Item.byBlock(ModBlocks.UNDERWORLD_PORTAL_FRAME.get()),
                    "advancement.lostworlds.underworld.root.name",
                    "advancement.lostworlds.underworld.root.desc",
                    LostWorldsApi.modLoc("textures/block/" + ModBlocks.UNDERWORLD_PORTAL_FRAME.getId().getPath() + ".png"),
                    "has_entered_dimension_" + ModDimensions.UNDERWORLD_LEVEL_KEY.location().getPath(),
                    ChangeDimensionTrigger.TriggerInstance.changedDimensionTo(ModDimensions.UNDERWORLD_LEVEL_KEY),
                    saver,
                    existingFileHelper
            );
        }
    }
    public static class NidavellirAdvancements implements ForgeAdvancementProvider.AdvancementGenerator {
        @Override
        public void generate(HolderLookup.Provider pRegistries, Consumer<Advancement> saver, ExistingFileHelper existingFileHelper) {
            Advancement root = createAdvancement(
                    "nidavellir/root",
                    Item.byBlock(ModBlocks.NIDAVELLIR_PORTAL_FRAME.get()),
                    "advancement.lostworlds.nidavellir.root.name",
                    "advancement.lostworlds.nidavellir.root.desc",
                    LostWorldsApi.modLoc("textures/block/" + ModBlocks.NIDAVELLIR_PORTAL_FRAME.getId().getPath() + ".png"),
                    "has_entered_dimension_" + ModDimensions.NIDAVELLIR_LEVEL_KEY.location().getPath(),
                    ChangeDimensionTrigger.TriggerInstance.changedDimensionTo(ModDimensions.NIDAVELLIR_LEVEL_KEY),
                    saver,
                    existingFileHelper
            );
        }
    }
    public static class AlfheimrAdvancements implements ForgeAdvancementProvider.AdvancementGenerator {
        @Override
        public void generate(HolderLookup.Provider pRegistries, Consumer<Advancement> saver, ExistingFileHelper existingFileHelper) {
            Advancement root = createAdvancement(
                    "alfheimr/root",
                    Item.byBlock(ModBlocks.ALFHEIMR_PORTAL_FRAME.get()),
                    "advancement.lostworlds.alfheimr.root.name",
                    "advancement.lostworlds.alfheimr.root.desc",
                    LostWorldsApi.modLoc("textures/block/" + ModBlocks.ALFHEIMR_PORTAL_FRAME.getId().getPath() + ".png"),
                    "has_entered_dimension_" + ModDimensions.ALFHEIMR_LEVEL_KEY.location().getPath(),
                    ChangeDimensionTrigger.TriggerInstance.changedDimensionTo(ModDimensions.ALFHEIMR_LEVEL_KEY),
                    saver,
                    existingFileHelper
            );
        }
    }
    public static class AtlantisAdvancements implements ForgeAdvancementProvider.AdvancementGenerator {
        @Override
        public void generate(HolderLookup.Provider pRegistries, Consumer<Advancement> saver, ExistingFileHelper existingFileHelper) {
            Advancement root = createAdvancement(
                    "atlantis/root",
                    Item.byBlock(ModBlocks.ATLANTIS_PORTAL_FRAME.get()),
                    "advancement.lostworlds.atlantis.root.name",
                    "advancement.lostworlds.atlantis.root.desc",
                    LostWorldsApi.modLoc("textures/block/" + ModBlocks.ATLANTIS_PORTAL_FRAME.getId().getPath() + ".png"),
                    "has_entered_dimension_" + ModDimensions.ATLANTIS_LEVEL_KEY.location().getPath(),
                    ChangeDimensionTrigger.TriggerInstance.changedDimensionTo(ModDimensions.ATLANTIS_LEVEL_KEY),
                    saver,
                    existingFileHelper
            );
        }
    }
    public static class SkyopiaAdvancements implements ForgeAdvancementProvider.AdvancementGenerator {
        @Override
        public void generate(HolderLookup.Provider pRegistries, Consumer<Advancement> saver, ExistingFileHelper existingFileHelper) {
            Advancement root = createAdvancement(
                    "skyopia/root",
                    Item.byBlock(ModBlocks.SKYOPIA_PORTAL_FRAME.get()),
                    "advancement.lostworlds.skyopia.root.name",
                    "advancement.lostworlds.skyopia.root.desc",
                    LostWorldsApi.modLoc("textures/block/" + ModBlocks.SKYOPIA_PORTAL_FRAME.getId().getPath() + ".png"),
                    "has_entered_dimension_" + ModDimensions.SKYOPIA_LEVEL_KEY.location().getPath(),
                    ChangeDimensionTrigger.TriggerInstance.changedDimensionTo(ModDimensions.SKYOPIA_LEVEL_KEY),
                    saver,
                    existingFileHelper
            );
        }
    }

    private static Advancement createAdvancement(String id, Item icon, String name, String description, ResourceLocation background, CriterionTriggerInstance trigger, Consumer<Advancement> saver, ExistingFileHelper existingFileHelper) {
        Advancement newAdvancement = Advancement.Builder.advancement()
                .display(rootDisplay(icon, name, description, background))
                .addCriterion(id, trigger)
                .save(saver, LostWorldsApi.modLoc(id), existingFileHelper);

        return newAdvancement;
    }

    private static Advancement createAdvancement(String id, Item icon, String name, String description, ResourceLocation background, String trigger_id, CriterionTriggerInstance trigger, Consumer<Advancement> saver, ExistingFileHelper existingFileHelper) {
        Advancement newAdvancement = Advancement.Builder.advancement()
                .display(rootDisplay(icon, name, description, background))
                .addCriterion(trigger_id, trigger)
                .save(saver, LostWorldsApi.modLoc(id), existingFileHelper);

        return newAdvancement;
    }

    private static Advancement createAdvancement(String id, Item icon, String name, String description, ResourceLocation background, Advancement parent, CriterionTriggerInstance trigger, Consumer<Advancement> saver, ExistingFileHelper existingFileHelper) {
        Advancement newAdvancement = Advancement.Builder.advancement()
                .display(rootDisplay(icon, name, description, background))
                .parent(parent)
                .addCriterion(id, trigger)
                .save(saver, LostWorldsApi.modLoc(id), existingFileHelper);

        return newAdvancement;
    }

    private static Advancement createAdvancement(String id, Item icon, String name, String description, ResourceLocation background, Advancement parent, String trigger_id, CriterionTriggerInstance trigger, Consumer<Advancement> saver, ExistingFileHelper existingFileHelper) {
        Advancement newAdvancement = Advancement.Builder.advancement()
                .display(rootDisplay(icon, name, description, background))
                .parent(parent)
                .addCriterion(trigger_id, trigger)
                .save(saver, LostWorldsApi.modLoc(id), existingFileHelper);

        return newAdvancement;
    }

    protected static DisplayInfo rootDisplay(ItemLike icon, String titleKey, String descKey, ResourceLocation background) {
        return new DisplayInfo(
                new ItemStack(icon.asItem()),
                Component.translatable(titleKey),
                Component.translatable(descKey),
                background,
                FrameType.TASK,
                false,
                false,
                false
        );
    }
}
