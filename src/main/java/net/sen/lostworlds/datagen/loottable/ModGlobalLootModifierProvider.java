package net.sen.lostworlds.datagen.loottable;

import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.PackOutput;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.storage.loot.predicates.LootItemBlockStatePropertyCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemRandomChanceCondition;
import net.neoforged.neoforge.common.data.GlobalLootModifierProvider;
import net.sen.lostworlds.api.LostWorldsApi;
import net.sen.lostworlds.registry.blocks.AlfheimrBlocks;
import net.sen.lostworlds.registry.items.AlfheimrItems;

import java.util.concurrent.CompletableFuture;
import java.util.function.Supplier;

public class ModGlobalLootModifierProvider extends GlobalLootModifierProvider {
    public ModGlobalLootModifierProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries, LostWorldsApi.MODID);
    }

    @Override
    protected void start() {
//        breakFromGrass(ModItems.POMEGRANATE_SEEDS, 0.35f);
//        breakFromAlfheimrGrass(ModItems.POMEGRANATE_SEEDS, 0.35f);

//        breakFromAlfheimrGrass(AlfheimrItems.DURUM_WHEAT_SEEDS, 0.35f);
//        breakFromAlfheimrGrass(AlfheimrItems.TOMATO_SEEDS, 0.35f);
//        breakFromAlfheimrGrass(AlfheimrItems.DRAGON_FRUIT_SEEDS, 0.35f);
//        breakFromAlfheimrGrass(AlfheimrItems.CHILLI_SEEDS, 0.35f);
//        breakFromAlfheimrGrass(AlfheimrItems.WILD_ONION, 0.35f);

//        mineshaftLoot(ModItems.POMEGRANATE_SEEDS);
//        suspiciousSand(ModItems.POMEGRANATE_SEEDS);
    }

//    public void breakFromGrass(Supplier<Item> veg, float chance) {
//        add(getItemName(veg.get()) + "_from_grass", new AddItemModifier(new LootItemCondition[] {
//                LootItemBlockStatePropertyCondition.hasBlockStateProperties(Blocks.GRASS_BLOCK).build(),
//                LootItemRandomChanceCondition.randomChance(chance).build()},
//                veg.get()));
//        add(getItemName(veg.get()) + "_from_fern", new AddItemModifier(new LootItemCondition[] {
//                LootItemBlockStatePropertyCondition.hasBlockStateProperties(Blocks.FERN).build(),
//                LootItemRandomChanceCondition.randomChance(0.35f).build()},
//                veg.get()));
//    }
//
//    public void breakFromAlfheimrGrass(Supplier<Item> veg, float chance) {
//        add(getItemName(veg.get()) + "_from_alfheimr_magic_grass", new AddItemModifier(new LootItemCondition[] {
//                LootItemBlockStatePropertyCondition.hasBlockStateProperties(AlfheimrBlocks.ALFHEIMR_MAGIC_GRASS.get()).build(),
//                LootItemRandomChanceCondition.randomChance(chance).build()},
//                veg.get()));
//    }

//    public void mineshaftLoot(Supplier<Item> item) {
//        add(getItemName(item.get()) + "_from_abandoned_mineshaft", new AddItemModifier(new LootItemCondition[] {
//                new LootTableIdCondition.Builder(LostWorldsApi.mcLoc("chests/abandoned_mineshaft")).build()},
//                item.get()));
//    }

//    public void suspiciousSand(Supplier<Item> item) {
//        add(getItemName(item.get()) + "_from_suspicious_sand", new AddSusSandItemModifier(new LootItemCondition[] {
//                new LootTableIdCondition.Builder(LostWorldsApi.mcLoc("archaeology/desert_pyramid")).build()},
//                item.get()));
//    }

    protected static String getItemName(ItemLike pItemLike) {
        return BuiltInRegistries.ITEM.getKey(pItemLike.asItem()).getPath();
    }
}
