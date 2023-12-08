package net.sen.lostworlds.datagen.loottable;

import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.storage.loot.predicates.LootItemBlockStatePropertyCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemEntityPropertyCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemRandomChanceCondition;
import net.minecraftforge.common.data.GlobalLootModifierProvider;
import net.minecraftforge.common.loot.LootTableIdCondition;
import net.sen.lostworlds.LostWorlds;
import net.sen.lostworlds.LostWorldsConstants;
import net.sen.lostworlds.item.ModItems;
import net.sen.lostworlds.loot.AddItemModifier;
import net.sen.lostworlds.loot.AddSusSandItemModifier;
import net.sen.lostworlds.util.ModTags;

public class ModGlobalLootModifierProvider extends GlobalLootModifierProvider {
    public ModGlobalLootModifierProvider(PackOutput output) {
        super(output, LostWorldsConstants.MODID);
    }

    @Override
    protected void start() {
        add("pomegranate_seeds_from_grass", new AddItemModifier(new LootItemCondition[] {
                LootItemBlockStatePropertyCondition.hasBlockStateProperties(Blocks.GRASS).build(),
                LootItemRandomChanceCondition.randomChance(0.35f).build()},
                ModItems.POMEGRANATE_SEEDS.get()));
        add("pomegranate_seeds_from_fern", new AddItemModifier(new LootItemCondition[] {
                LootItemBlockStatePropertyCondition.hasBlockStateProperties(Blocks.FERN).build(),
                LootItemRandomChanceCondition.randomChance(0.35f).build()},
                ModItems.POMEGRANATE_SEEDS.get()));
        add("pomegranate_seeds_from_abandoned_mineshaft", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(LostWorldsConstants.mcLoc("chests/abandoned_mineshaft")).build()},
                ModItems.POMEGRANATE_SEEDS.get()));

        add("pomegranate_seeds_from_suspicious_sand", new AddSusSandItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(LostWorldsConstants.mcLoc("archaeology/desert_pyramid")).build()},
                ModItems.POMEGRANATE_SEEDS.get()));
    }
}
