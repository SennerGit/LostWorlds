package net.sen.lostworlds.datagen;

import net.minecraft.advancements.Advancement;
import net.minecraft.advancements.DisplayInfo;
import net.minecraft.advancements.FrameType;
import net.minecraft.advancements.critereon.InventoryChangeTrigger;
import net.minecraft.core.HolderLookup;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.common.data.ForgeAdvancementProvider;
import net.sen.lostworlds.LostWorlds;
import net.sen.lostworlds.block.ModBlocks;
import net.sen.lostworlds.item.ModItems;

import java.util.function.Consumer;

public class ModAdvancementsProvider implements ForgeAdvancementProvider.AdvancementGenerator {
    @Override
    public void generate(HolderLookup.Provider registries, Consumer<Advancement> saver, ExistingFileHelper existingFileHelper) {
//        Advancement rootAdvancement = Advancement.Builder.advancement()
//                .display(new DisplayInfo(new ItemStack(ModItems.CRIMSON_DIAMOND.get()),
//                        Component.literal("Lost Worlds"),
//                        Component.literal("Learn the powers of different wolds"),
//                        new ResourceLocation(LostWorlds.MODID, "textures/item/" + ModItems.CRIMSON_DIAMOND.getId().getPath() + ".png"), FrameType.TASK,
//                        true, true, false))
//        .addCriterion("has_crimson_diamond", InventoryChangeTrigger.TriggerInstance.hasItems(ModItems.CRIMSON_DIAMOND.get()))
//                .save(saver, new ResourceLocation(LostWorlds.MODID, LostWorlds.MODID), existingFileHelper);

//        Advancement dowsingRod = Advancement.Builder.advancement()
//                .display(new DisplayInfo(new ItemStack(ModItems.MAGICAL_DOWSING_ROD.get()),
//                        Component.literal("Magical Dowsing Rod"),
//                        Component.literal("Find magical objects"),
//                        null, FrameType.TASK,
//                        true, true, false))
//                .parent(rootAdvancement)
//                .addCriterion("has_dowsing_rod", InventoryChangeTrigger.TriggerInstance.hasItems(ModItems.MAGICAL_DOWSING_ROD.get()))
//                .save(saver, new ResourceLocation(LostWorlds.MODID, ModItems.MAGICAL_DOWSING_ROD.getId().getPath()), existingFileHelper);

        Advancement rootAdvancement = createAdvancement(ModItems.CRIMSON_DIAMOND.get(), "has_crimson_diamond",
                "Lost Worlds",
                "Learn the powers of different wolds",
                new ResourceLocation(LostWorlds.MODID, "textures/block/" + ModBlocks.CRIMSON_DIAMOND_BLOCK.getId().getPath() + ".png"),
                saver, existingFileHelper
                );

        Advancement dowsingRod = createAdvancement(ModItems.MAGICAL_DOWSING_ROD.get(), "has_dowsing_rod",
                "Magical Dowsing Rod",
                "Find magical objects",
                null,
                rootAdvancement,
                saver, existingFileHelper
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
                .save(saver, new ResourceLocation(LostWorlds.MODID, icon.getDescriptionId()), existingFileHelper);

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
                .save(saver, new ResourceLocation(LostWorlds.MODID, icon.getDescriptionId()), existingFileHelper);

        return newAdvancement;
    }
}
