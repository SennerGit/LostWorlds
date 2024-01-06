package net.sen.lostworlds.datagen.loottable;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.PackOutput;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.storage.loot.predicates.LootItemBlockStatePropertyCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemEntityPropertyCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemRandomChanceCondition;
import net.minecraftforge.common.data.GlobalLootModifierProvider;
import net.minecraftforge.common.loot.LootTableIdCondition;
import net.sen.lostworlds.LostWorlds;
import net.sen.lostworlds.LostWorldsConstants;
import net.sen.lostworlds.block.ModBlocks;
import net.sen.lostworlds.item.ModItems;
import net.sen.lostworlds.loot.AddItemModifier;
import net.sen.lostworlds.loot.AddSusSandItemModifier;
import net.sen.lostworlds.util.ModTags;

import java.util.function.Supplier;

public class ModGlobalLootModifierProvider extends GlobalLootModifierProvider {
    public ModGlobalLootModifierProvider(PackOutput output) {
        super(output, LostWorldsConstants.MODID);
    }

    @Override
    protected void start() {
//        breakFromGrass(ModItems.POMEGRANATE_SEEDS, 0.35f);
//        breakFromAlfheimrGrass(ModItems.POMEGRANATE_SEEDS, 0.35f);
        breakFromAlfheimrGrass(ModItems.DURUM_WHEAT_SEEDS, 0.35f);
        breakFromAlfheimrGrass(ModItems.TOMATO_SEEDS, 0.35f);
        breakFromAlfheimrGrass(ModItems.DRAGON_FRUIT_SEEDS, 0.35f);
        breakFromAlfheimrGrass(ModItems.CHILLI_SEEDS, 0.35f);
        breakFromAlfheimrGrass(ModItems.WILD_ONION, 0.35f);
//        mineshaftLoot(ModItems.POMEGRANATE_SEEDS);
//        suspiciousSand(ModItems.POMEGRANATE_SEEDS);
    }

    public void breakFromGrass(Supplier<Item> veg, float chance) {
        add(getItemName(veg.get()) + "_from_grass", new AddItemModifier(new LootItemCondition[] {
                LootItemBlockStatePropertyCondition.hasBlockStateProperties(Blocks.GRASS).build(),
                LootItemRandomChanceCondition.randomChance(chance).build()},
                veg.get()));
        add(getItemName(veg.get()) + "_from_fern", new AddItemModifier(new LootItemCondition[] {
                LootItemBlockStatePropertyCondition.hasBlockStateProperties(Blocks.FERN).build(),
                LootItemRandomChanceCondition.randomChance(0.35f).build()},
                veg.get()));
    }

    public void breakFromAlfheimrGrass(Supplier<Item> veg, float chance) {
        add(getItemName(veg.get()) + "_from_alfheimr_magic_grass", new AddItemModifier(new LootItemCondition[] {
                LootItemBlockStatePropertyCondition.hasBlockStateProperties(ModBlocks.ALFHEIMR_MAGIC_GRASS.get()).build(),
                LootItemRandomChanceCondition.randomChance(chance).build()},
                veg.get()));
    }

    public void mineshaftLoot(Supplier<Item> item) {
        add(getItemName(item.get()) + "_from_abandoned_mineshaft", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(LostWorldsConstants.mcLoc("chests/abandoned_mineshaft")).build()},
                item.get()));
    }

    public void suspiciousSand(Supplier<Item> item) {
        add(getItemName(item.get()) + "_from_suspicious_sand", new AddSusSandItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(LostWorldsConstants.mcLoc("archaeology/desert_pyramid")).build()},
                item.get()));
    }

    protected static String getItemName(ItemLike pItemLike) {
        return BuiltInRegistries.ITEM.getKey(pItemLike.asItem()).getPath();
    }
}
