package net.sen.lostworlds.datagen;

import net.minecraft.advancements.Advancement;
import net.minecraft.advancements.CriteriaTriggers;
import net.minecraft.advancements.DisplayInfo;
import net.minecraft.advancements.FrameType;
import net.minecraft.advancements.critereon.ChangeDimensionTrigger;
import net.minecraft.advancements.critereon.ContextAwarePredicate;
import net.minecraft.advancements.critereon.InventoryChangeTrigger;
import net.minecraft.advancements.critereon.PlayerTrigger;
import net.minecraft.core.HolderLookup;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.common.data.ForgeAdvancementProvider;
import net.sen.lostworlds.LostWorlds;
import net.sen.lostworlds.LostWorldsConstants;
import net.sen.lostworlds.block.ModBlocks;
import net.sen.lostworlds.item.ModItems;
import net.sen.lostworlds.worldgen.dimension.ModDimensions;

import java.util.function.Consumer;

public class ModAdvancementsProvider implements ForgeAdvancementProvider.AdvancementGenerator {
    @Override
    public void generate(HolderLookup.Provider registries, Consumer<Advancement> saver, ExistingFileHelper existingFileHelper) {
//        Advancement rootAdvancement = Advancement.Builder.advancement()
//                .display(new DisplayInfo(new ItemStack(ModItems.CRIMSON_DIAMOND.get()),
//                        Component.literal("Lost Worlds"),
//                        Component.literal("Learn the powers of different wolds"),
//                        LostWorldsConstants.modLoc("textures/item/" + ModItems.CRIMSON_DIAMOND.getId().getPath() + ".png"), FrameType.TASK,
//                        true, true, false))
//        .addCriterion("has_crimson_diamond", InventoryChangeTrigger.TriggerInstance.hasItems(ModItems.CRIMSON_DIAMOND.get()))
//                .save(saver, LostWorldsConstants.modLoc(LostWorlds.MODID), existingFileHelper);

//        Advancement dowsingRod = Advancement.Builder.advancement()
//                .display(new DisplayInfo(new ItemStack(ModItems.MAGICAL_DOWSING_ROD.get()),
//                        Component.literal("Magical Dowsing Rod"),
//                        Component.literal("Find magical objects"),
//                        null, FrameType.TASK,
//                        true, true, false))
//                .parent(rootAdvancement)
//                .addCriterion("has_dowsing_rod", InventoryChangeTrigger.TriggerInstance.hasItems(ModItems.MAGICAL_DOWSING_ROD.get()))
//                .save(saver, LostWorldsConstants.modLoc(ModItems.MAGICAL_DOWSING_ROD.getId().getPath()), existingFileHelper);

        baseAdvancements(registries, saver, existingFileHelper);
        underworldAdvancements(registries, saver, existingFileHelper);
        nidavellirAdvancements(registries, saver, existingFileHelper);
        alfheimrAdvancements(registries, saver, existingFileHelper);
        atlantisAdvancements(registries, saver, existingFileHelper);
        skyopiaAdvancements(registries, saver, existingFileHelper);

    }

    private static void baseAdvancements(HolderLookup.Provider registries, Consumer<Advancement> saver, ExistingFileHelper existingFileHelper) {
        Advancement baseRootAdvancement = createAdvancement(ModItems.BASIC_PORTAL_CORE.get(), "has_crimson_diamond",
                "Base Lost Worlds",
                "Learn the powers of different wolds",
                LostWorldsConstants.mcLoc("textures/blocks/obsidian.png"),
                saver, existingFileHelper
        );

        Advancement dowsingRod = createAdvancement(ModItems.MAGICAL_DOWSING_ROD.get(), "has_dowsing_rod",
                "Magical Dowsing Rod",
                "Find magical objects",
                null,
                baseRootAdvancement,
                saver, existingFileHelper
        );
    }

    //Underworld
    private static void underworldAdvancements(HolderLookup.Provider registries, Consumer<Advancement> saver, ExistingFileHelper existingFileHelper) {
        Advancement underworldRootAdvancement = createDimensionAdvancement(ModBlocks.UNDERWORLD_PORTAL_FRAME.get(),
                ModDimensions.UNDERWORLD_LEVEL_KEY,
                "Underworld",
                "Learn the powers of different wolds",
                LostWorldsConstants.modLoc("textures/block/" + ModBlocks.UNDERWORLD_PORTAL_FRAME.getId().getPath() + ".png"),
                saver,
                existingFileHelper
        );
    }

    //Alfheimr
    private static void alfheimrAdvancements(HolderLookup.Provider registries, Consumer<Advancement> saver, ExistingFileHelper existingFileHelper) {
        Advancement alfheimrRootAdvancement = createDimensionAdvancement(ModBlocks.ALFHEIMR_PORTAL_FRAME.get(),
                ModDimensions.ALFHEIMR_LEVEL_KEY,
                "Alfheimr",
                "Learn the powers of different wolds",
                LostWorldsConstants.modLoc("textures/block/" + ModBlocks.ALFHEIMR_PORTAL_FRAME.getId().getPath() + ".png"),
                saver,
                existingFileHelper
        );
    }

    //Nidavellir
    private static void nidavellirAdvancements(HolderLookup.Provider registries, Consumer<Advancement> saver, ExistingFileHelper existingFileHelper) {
        Advancement nidavellirRootAdvancement = createDimensionAdvancement(ModBlocks.NIDAVELLIR_PORTAL_FRAME.get(),
                ModDimensions.NIDAVELLIR_LEVEL_KEY,
                "Nidavellir",
                "Learn the powers of different wolds",
                LostWorldsConstants.modLoc("textures/block/" + ModBlocks.NIDAVELLIR_PORTAL_FRAME.getId().getPath() + ".png"),
                saver,
                existingFileHelper
        );
    }

    //Atlantis
    private static void atlantisAdvancements(HolderLookup.Provider registries, Consumer<Advancement> saver, ExistingFileHelper existingFileHelper) {
        Advancement atlantisRootAdvancement = createDimensionAdvancement(ModBlocks.ATLANTIS_PORTAL_FRAME.get(),
                ModDimensions.ATLANTIS_LEVEL_KEY,
                "Atlantis",
                "Learn the powers of different wolds",
                LostWorldsConstants.modLoc("textures/block/" + ModBlocks.ATLANTIS_PORTAL_FRAME.getId().getPath() + ".png"),
                saver,
                existingFileHelper
        );
    }

    //Skyopia
    private static void skyopiaAdvancements(HolderLookup.Provider registries, Consumer<Advancement> saver, ExistingFileHelper existingFileHelper) {
        Advancement skyopiaRootAdvancement = createDimensionAdvancement(ModBlocks.SKYOPIA_PORTAL_FRAME.get(),
                ModDimensions.SKYOPIA_LEVEL_KEY,
                "Skyopia",
                "Learn the powers of different wolds",
                LostWorldsConstants.modLoc("textures/block/" + ModBlocks.SKYOPIA_PORTAL_FRAME.getId().getPath() + ".png"),
                saver,
                existingFileHelper
        );
    }

    private static Advancement createAdvancement(Item icon, String id, String name, String description, ResourceLocation background, Consumer<Advancement> saver, ExistingFileHelper existingFileHelper) {
        Advancement newAdvancement = Advancement.Builder.advancement()
                .display(new DisplayInfo(new ItemStack(icon),
                        Component.literal(name),
                        Component.literal(description),
                        background, FrameType.TASK,
                        true, true, false))
                .addCriterion(id, InventoryChangeTrigger.TriggerInstance.hasItems(icon))
                .save(saver, LostWorldsConstants.modLoc(icon.getDescriptionId()), existingFileHelper);

        return newAdvancement;
    }

    private static Advancement createAdvancement(Item icon, String id, String name, String description, ResourceLocation background, Advancement parent, Consumer<Advancement> saver, ExistingFileHelper existingFileHelper) {
        Advancement newAdvancement = Advancement.Builder.advancement()
                .display(new DisplayInfo(new ItemStack(icon),
                        Component.literal(name),
                        Component.literal(description),
                        background, FrameType.TASK,
                        true, true, false))
                .parent(parent)
                .addCriterion(id, InventoryChangeTrigger.TriggerInstance.hasItems(icon))
                .save(saver, LostWorldsConstants.modLoc(icon.getDescriptionId()), existingFileHelper);

        return newAdvancement;
    }

    private static Advancement createDimensionAdvancement(ItemLike icon,  ResourceKey<Level> dimensionType, String name, String description, ResourceLocation background, Consumer<Advancement> saver, ExistingFileHelper existingFileHelper) {
        Advancement newAdvancement = Advancement.Builder.advancement()
                .display(new DisplayInfo(new ItemStack(icon),
                        Component.literal(name),
                        Component.literal(description),
                        background, FrameType.TASK,
                        true, true, false))
                .addCriterion("has_entered_dimension_" + dimensionType.location().getPath(), ChangeDimensionTrigger.TriggerInstance.changedDimensionTo(dimensionType))
                .save(saver, LostWorldsConstants.modLoc(icon.asItem().getDescriptionId()), existingFileHelper);

        return newAdvancement;
    }
}
