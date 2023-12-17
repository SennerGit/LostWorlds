package net.sen.lostworlds.datagen.loottable;

import net.minecraft.advancements.critereon.StatePropertiesPredicate;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.predicates.LootItemBlockStatePropertyCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraft.world.level.storage.loot.providers.number.ConstantValue;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;
import net.minecraftforge.registries.RegistryObject;
import net.sen.lostworlds.block.ModBlocks;
import net.sen.lostworlds.block.custom.PomegranateCropBlock;
import net.sen.lostworlds.item.ModItems;

import java.util.Set;

public class ModBlockLootTables extends BlockLootSubProvider {
    public ModBlockLootTables() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {
        this.dropSelf(ModBlocks.CRIMSON_DIAMOND_BLOCK.get());
        this.dropSelf(ModBlocks.NETHER_STEEL_BLOCK.get());
        this.dropSelf(ModBlocks.ORICHALCUM_BLOCK.get());
        this.dropSelf(ModBlocks.ZINC_BLOCK.get());
        this.dropSelf(ModBlocks.TIN_BLOCK.get());
        this.dropSelf(ModBlocks.AURICHALCITE_BLOCK.get());
        this.dropSelf(ModBlocks.BRASS_BLOCK.get());
        this.dropSelf(ModBlocks.BRONZE_BLOCK.get());
        this.dropSelf(ModBlocks.RAW_NETHER_STEEL_BLOCK.get());
        this.dropSelf(ModBlocks.RAW_ORICHALCUM_BLOCK.get());
        this.dropSelf(ModBlocks.RAW_ZINC_BLOCK.get());
        this.dropSelf(ModBlocks.RAW_TIN_BLOCK.get());
        this.dropSelf(ModBlocks.SOUND_BLOCK.get());
        this.dropSelf(ModBlocks.ALLOY_SMELTER.get());

        this.dropSelf(ModBlocks.CRIMSON_STONE_STAIRS.get());
        this.dropSelf(ModBlocks.CRIMSON_COBBLESTONE.get());
        this.dropSelf(ModBlocks.CRIMSON_COBBLESTONE_STAIRS.get());
        this.dropSelf(ModBlocks.CRIMSON_STONE_BRICKS.get());
        this.dropSelf(ModBlocks.CRIMSON_STONE_BRICK_STAIRS.get());
        this.dropSelf(ModBlocks.CRIMSON_STONE_PRESSURE_PLATE.get());
        this.dropSelf(ModBlocks.CRIMSON_STONE_BUTTON.get());
        this.dropSelf(ModBlocks.CRIMSON_STONE_FENCE.get());
        this.dropSelf(ModBlocks.CRIMSON_STONE_FENCE_GATE.get());
        this.dropSelf(ModBlocks.CRIMSON_STONE_WALL.get());
        this.dropSelf(ModBlocks.CRIMSON_STONE_TRAPDOOR.get());
        this.add(ModBlocks.CRIMSON_STONE_SLAB.get(), block -> createSlabItemTable(ModBlocks.CRIMSON_STONE_SLAB.get()));
        this.add(ModBlocks.CRIMSON_COBBLESTONE_SLAB.get(), block -> createSlabItemTable(ModBlocks.CRIMSON_COBBLESTONE_SLAB.get()));
        this.add(ModBlocks.CRIMSON_STONE_BRICK_SLAB.get(), block -> createSlabItemTable(ModBlocks.CRIMSON_STONE_BRICK_SLAB.get()));
        this.add(ModBlocks.CRIMSON_STONE_DOOR.get(), block -> createDoorTable(ModBlocks.CRIMSON_STONE_DOOR.get()));
        this.add(ModBlocks.CRIMSON_STONE.get(), block -> createSingleItemTableWithSilkTouch(ModBlocks.CRIMSON_STONE.get(), ModBlocks.CRIMSON_COBBLESTONE.get()));

        this.dropSelf(ModBlocks.CRIMSON_DIAMOND_LAMP.get());
        this.dropSelf(ModBlocks.ADAMANT_BLOCK.get());

        this.dropSelf(ModBlocks.IRIS_FLOWER.get());
        this.add(ModBlocks.POTTED_IRIS_FLOWER.get(), createPotFlowerItemTable(ModBlocks.POTTED_IRIS_FLOWER.get()));


        this.add(ModBlocks.NETHER_STEEL_ORE.get(), block -> createOreDrop(ModBlocks.NETHER_STEEL_ORE.get(), ModItems.RAW_NETHER_STEEL.get()));
        this.add(ModBlocks.DEEPSLATE_NETHER_STEEL_ORE.get(), block -> createOreDrop(ModBlocks.DEEPSLATE_NETHER_STEEL_ORE.get(), ModItems.RAW_NETHER_STEEL.get()));

        this.add(ModBlocks.ORICHALCUM_ORE.get(), block -> createOreDrop(ModBlocks.ORICHALCUM_ORE.get(), ModItems.RAW_ORICHALCUM.get()));
        this.add(ModBlocks.DEEPSLATE_ORICHALCUM_ORE.get(), block -> createOreDrop(ModBlocks.DEEPSLATE_ORICHALCUM_ORE.get(), ModItems.RAW_ORICHALCUM.get()));

        this.add(ModBlocks.ZINC_ORE.get(), block -> createOreDrop(ModBlocks.ZINC_ORE.get(), ModItems.RAW_ZINC.get()));
        this.add(ModBlocks.DEEPSLATE_ZINC_ORE.get(), block -> createOreDrop(ModBlocks.DEEPSLATE_ZINC_ORE.get(), ModItems.RAW_ZINC.get()));

        this.add(ModBlocks.TIN_ORE.get(), block -> createOreDrop(ModBlocks.TIN_ORE.get(), ModItems.RAW_TIN.get()));
        this.add(ModBlocks.DEEPSLATE_TIN_ORE.get(), block -> createOreDrop(ModBlocks.DEEPSLATE_TIN_ORE.get(), ModItems.RAW_TIN.get()));

        this.add(ModBlocks.ADAMANT_ORE.get(), block -> createOreDrop(ModBlocks.ADAMANT_ORE.get(), ModItems.ADAMANT.get()));
        this.add(ModBlocks.DEEPSLATE_ADAMANT_ORE.get(), block -> createOreDrop(ModBlocks.DEEPSLATE_ADAMANT_ORE.get(), ModItems.ADAMANT.get()));

        LootItemCondition.Builder lootitemcondition$builder1 = LootItemBlockStatePropertyCondition.hasBlockStateProperties(ModBlocks.POMEGRANATE_CROP_BLOCK.get()).setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(PomegranateCropBlock.AGE, PomegranateCropBlock.MAX_AGE));
        this.add(ModBlocks.POMEGRANATE_CROP_BLOCK.get(), this.createCropDrops(ModBlocks.POMEGRANATE_CROP_BLOCK.get(), ModItems.POMEGRANATE.get(), ModItems.POMEGRANATE_SEEDS.get(), lootitemcondition$builder1));

        this.dropSelf(ModBlocks.UNDERWORLD_DIRT.get());

        this.dropSelf(ModBlocks.ATLANTAS_WATER_REMOVER_BLOCK.get());

        this.dropSelf(ModBlocks.UNDERWORLD_PORTAL_FRAME.get());
        this.dropSelf(ModBlocks.NIDAVELLIR_PORTAL_FRAME.get());
        this.dropSelf(ModBlocks.ALFHEIMR_PORTAL_FRAME.get());
        this.dropSelf(ModBlocks.ATLANTIS_PORTAL_FRAME.get());
        this.dropSelf(ModBlocks.SKYOPIA_PORTAL_FRAME.get());
//        this.add(ModBlocks.UNDERWORLD_GRASS_BLOCK.get(), (block -> createSingleItemTableWithSilkTouch(block, ModBlocks.UNDERWORLD_DIRT.get())));
//        this.dropOther(ModBlocks.UNDERWORLD_GRASS_BLOCK.get(), ModBlocks.UNDERWORLD_DIRT.get());
//        this.dropWhenSilkTouch(ModBlocks.UNDERWORLD_GRASS_BLOCK.get());

        this.add(ModBlocks.NIDAVELLIR_SOFT_STONE.get(), block -> createSingleItemTableWithSilkTouch(ModBlocks.NIDAVELLIR_SOFT_STONE.get(), ModBlocks.NIDAVELLIR_SOFT_COBBLESTONE.get()));
        this.dropSelf(ModBlocks.NIDAVELLIR_SOFT_STONE_STAIRS.get());
        this.dropSelf(ModBlocks.NIDAVELLIR_SOFT_COBBLESTONE.get());
        this.dropSelf(ModBlocks.NIDAVELLIR_SOFT_COBBLESTONE_STAIRS.get());
        this.dropSelf(ModBlocks.NIDAVELLIR_SOFT_STONE_BRICKS.get());
        this.dropSelf(ModBlocks.NIDAVELLIR_SOFT_STONE_BRICKS_STAIRS.get());
        this.dropSelf(ModBlocks.NIDAVELLIR_SOFT_STONE_PRESSURE_PLATE.get());
        this.dropSelf(ModBlocks.NIDAVELLIR_SOFT_STONE_BUTTON.get());
        this.dropSelf(ModBlocks.NIDAVELLIR_SOFT_STONE_WALL.get());
        this.dropSelf(ModBlocks.NIDAVELLIR_SOFT_COBBLESTONE_WALL.get());
        this.dropSelf(ModBlocks.NIDAVELLIR_SOFT_SMOOTH_STONE.get());
        this.dropSelf(ModBlocks.NIDAVELLIR_SOFT_COBBLESTONE_MOSSY.get());
        this.dropSelf(ModBlocks.NIDAVELLIR_SOFT_STONE_BRICKS_MOSSY.get());
        this.dropSelf(ModBlocks.NIDAVELLIR_SOFT_STONE_BRICKS_CRACKED.get());
        this.dropSelf(ModBlocks.NIDAVELLIR_SOFT_STONE_BRICKS_CHISELED.get());
        this.dropSelf(ModBlocks.NIDAVELLIR_SOFT_STONE_BRICKS_WALL.get());
        this.add(ModBlocks.NIDAVELLIR_SOFT_STONE_SLAB.get(), block -> createSlabItemTable(ModBlocks.NIDAVELLIR_SOFT_STONE_SLAB.get()));
        this.add(ModBlocks.NIDAVELLIR_SOFT_COBBLESTONE_SLAB.get(), block -> createSlabItemTable(ModBlocks.NIDAVELLIR_SOFT_COBBLESTONE_SLAB.get()));
        this.add(ModBlocks.NIDAVELLIR_SOFT_STONE_BRICKS_SLAB.get(), block -> createSlabItemTable(ModBlocks.NIDAVELLIR_SOFT_STONE_BRICKS_SLAB.get()));

        this.add(ModBlocks.NIDAVELLIR_SOFT_STONE_IRON_ORE.get(), block -> createOreDrop(ModBlocks.NIDAVELLIR_SOFT_STONE_IRON_ORE.get(), Items.RAW_IRON));
        this.add(ModBlocks.NIDAVELLIR_SOFT_STONE_GOLD_ORE.get(), block -> createOreDrop(ModBlocks.NIDAVELLIR_SOFT_STONE_GOLD_ORE.get(), Items.RAW_GOLD));
        this.add(ModBlocks.NIDAVELLIR_SOFT_STONE_COPPER_ORE.get(), block -> createOreDrop(ModBlocks.NIDAVELLIR_SOFT_STONE_COPPER_ORE.get(), Items.RAW_COPPER).withPool(LootPool.lootPool().setRolls(UniformGenerator.between(2.0f, 5.0f))));
        this.add(ModBlocks.NIDAVELLIR_SOFT_STONE_TIN_ORE.get(), block -> createOreDrop(ModBlocks.NIDAVELLIR_SOFT_STONE_TIN_ORE.get(), ModItems.RAW_TIN.get()));
        this.add(ModBlocks.NIDAVELLIR_SOFT_STONE_ZINC_ORE.get(), block -> createOreDrop(ModBlocks.NIDAVELLIR_SOFT_STONE_ZINC_ORE.get(), ModItems.RAW_ZINC.get()));
        this.add(ModBlocks.NIDAVELLIR_SOFT_STONE_DIAMOND_ORE.get(), block -> createOreDrop(ModBlocks.NIDAVELLIR_SOFT_STONE_DIAMOND_ORE.get(), Items.DIAMOND));
        this.add(ModBlocks.NIDAVELLIR_SOFT_STONE_EMERALD_ORE.get(), block -> createOreDrop(ModBlocks.NIDAVELLIR_SOFT_STONE_EMERALD_ORE.get(), Items.EMERALD));
        this.add(ModBlocks.NIDAVELLIR_SOFT_STONE_COAL_ORE.get(), block -> createOreDrop(ModBlocks.NIDAVELLIR_SOFT_STONE_COAL_ORE.get(), Items.COAL));
        this.add(ModBlocks.NIDAVELLIR_SOFT_STONE_REDSTONE_ORE.get(), block -> createOreDrop(ModBlocks.NIDAVELLIR_SOFT_STONE_REDSTONE_ORE.get(), Items.REDSTONE).withPool(LootPool.lootPool().setRolls(UniformGenerator.between(4.0f, 5.0f))));
        this.add(ModBlocks.NIDAVELLIR_SOFT_STONE_LAPIS_ORE.get(), block -> createOreDrop(ModBlocks.NIDAVELLIR_SOFT_STONE_LAPIS_ORE.get(), Items.LAPIS_LAZULI).withPool(LootPool.lootPool().setRolls(UniformGenerator.between(4.0f, 9.0f))));

        this.add(ModBlocks.NIDAVELLIR_SOFT_STONE_IRON_ORE_CLUSTER.get(), block -> createOreDrop(ModBlocks.NIDAVELLIR_SOFT_STONE_IRON_ORE_CLUSTER.get(), Items.RAW_IRON).withPool(LootPool.lootPool().setRolls(UniformGenerator.between(4.0f, 6.0f))));
        this.add(ModBlocks.NIDAVELLIR_SOFT_STONE_GOLD_ORE_CLUSTER.get(), block -> createOreDrop(ModBlocks.NIDAVELLIR_SOFT_STONE_GOLD_ORE_CLUSTER.get(), Items.RAW_GOLD).withPool(LootPool.lootPool().setRolls(UniformGenerator.between(4.0f, 6.0f))));
        this.add(ModBlocks.NIDAVELLIR_SOFT_STONE_COPPER_ORE_CLUSTER.get(), block -> createOreDrop(ModBlocks.NIDAVELLIR_SOFT_STONE_COPPER_ORE_CLUSTER.get(), Items.RAW_COPPER).withPool(LootPool.lootPool().setRolls(UniformGenerator.between(6.0f, 12.0f))));
        this.add(ModBlocks.NIDAVELLIR_SOFT_STONE_TIN_ORE_CLUSTER.get(), block -> createOreDrop(ModBlocks.NIDAVELLIR_SOFT_STONE_TIN_ORE_CLUSTER.get(), ModItems.RAW_TIN.get()).withPool(LootPool.lootPool().setRolls(UniformGenerator.between(4.0f, 6.0f))));
        this.add(ModBlocks.NIDAVELLIR_SOFT_STONE_ZINC_ORE_CLUSTER.get(), block -> createOreDrop(ModBlocks.NIDAVELLIR_SOFT_STONE_ZINC_ORE_CLUSTER.get(), ModItems.RAW_ZINC.get()).withPool(LootPool.lootPool().setRolls(UniformGenerator.between(4.0f, 6.0f))));
        this.add(ModBlocks.NIDAVELLIR_SOFT_STONE_DIAMOND_ORE_CLUSTER.get(), block -> createOreDrop(ModBlocks.NIDAVELLIR_SOFT_STONE_DIAMOND_ORE_CLUSTER.get(), Items.DIAMOND).withPool(LootPool.lootPool().setRolls(UniformGenerator.between(4.0f, 6.0f))));
        this.add(ModBlocks.NIDAVELLIR_SOFT_STONE_EMERALD_ORE_CLUSTER.get(), block -> createOreDrop(ModBlocks.NIDAVELLIR_SOFT_STONE_EMERALD_ORE_CLUSTER.get(), Items.EMERALD).withPool(LootPool.lootPool().setRolls(UniformGenerator.between(4.0f, 6.0f))));
        this.add(ModBlocks.NIDAVELLIR_SOFT_STONE_COAL_ORE_CLUSTER.get(), block -> createOreDrop(ModBlocks.NIDAVELLIR_SOFT_STONE_COAL_ORE_CLUSTER.get(), Items.COAL).withPool(LootPool.lootPool().setRolls(UniformGenerator.between(4.0f, 6.0f))));
        this.add(ModBlocks.NIDAVELLIR_SOFT_STONE_REDSTONE_ORE_CLUSTER.get(), block -> createOreDrop(ModBlocks.NIDAVELLIR_SOFT_STONE_REDSTONE_ORE_CLUSTER.get(), Items.REDSTONE).withPool(LootPool.lootPool().setRolls(UniformGenerator.between(7.0f, 16.0f))));
        this.add(ModBlocks.NIDAVELLIR_SOFT_STONE_LAPIS_ORE_CLUSTER.get(), block -> createOreDrop(ModBlocks.NIDAVELLIR_SOFT_STONE_LAPIS_ORE_CLUSTER.get(), Items.LAPIS_LAZULI).withPool(LootPool.lootPool().setRolls(UniformGenerator.between(8.0f, 18.0f))));

        this.add(ModBlocks.NIDAVELLIR_HARD_STONE.get(), block -> createSingleItemTableWithSilkTouch(ModBlocks.NIDAVELLIR_HARD_STONE.get(), ModBlocks.NIDAVELLIR_HARD_COBBLESTONE.get()));
        this.dropSelf(ModBlocks.NIDAVELLIR_HARD_STONE_STAIRS.get());
        this.dropSelf(ModBlocks.NIDAVELLIR_HARD_COBBLESTONE.get());
        this.dropSelf(ModBlocks.NIDAVELLIR_HARD_COBBLESTONE_STAIRS.get());
        this.dropSelf(ModBlocks.NIDAVELLIR_HARD_STONE_BRICKS.get());
        this.dropSelf(ModBlocks.NIDAVELLIR_HARD_STONE_BRICKS_STAIRS.get());
        this.dropSelf(ModBlocks.NIDAVELLIR_HARD_STONE_PRESSURE_PLATE.get());
        this.dropSelf(ModBlocks.NIDAVELLIR_HARD_STONE_BUTTON.get());
        this.dropSelf(ModBlocks.NIDAVELLIR_HARD_STONE_WALL.get());
        this.dropSelf(ModBlocks.NIDAVELLIR_HARD_COBBLESTONE_WALL.get());
        this.dropSelf(ModBlocks.NIDAVELLIR_HARD_SMOOTH_STONE.get());
        this.dropSelf(ModBlocks.NIDAVELLIR_HARD_COBBLESTONE_MOSSY.get());
        this.dropSelf(ModBlocks.NIDAVELLIR_HARD_STONE_BRICKS_MOSSY.get());
        this.dropSelf(ModBlocks.NIDAVELLIR_HARD_STONE_BRICKS_CRACKED.get());
        this.dropSelf(ModBlocks.NIDAVELLIR_HARD_STONE_BRICKS_CHISELED.get());
        this.dropSelf(ModBlocks.NIDAVELLIR_HARD_STONE_BRICKS_WALL.get());
        this.add(ModBlocks.NIDAVELLIR_HARD_STONE_SLAB.get(), block -> createSlabItemTable(ModBlocks.NIDAVELLIR_HARD_STONE_SLAB.get()));
        this.add(ModBlocks.NIDAVELLIR_HARD_COBBLESTONE_SLAB.get(), block -> createSlabItemTable(ModBlocks.NIDAVELLIR_HARD_COBBLESTONE_SLAB.get()));
        this.add(ModBlocks.NIDAVELLIR_HARD_STONE_BRICKS_SLAB.get(), block -> createSlabItemTable(ModBlocks.NIDAVELLIR_HARD_STONE_BRICKS_SLAB.get()));

        this.add(ModBlocks.NIDAVELLIR_HARD_STONE_IRON_ORE.get(), block -> createOreDrop(ModBlocks.NIDAVELLIR_HARD_STONE_IRON_ORE.get(), Items.RAW_IRON));
        this.add(ModBlocks.NIDAVELLIR_HARD_STONE_GOLD_ORE.get(), block -> createOreDrop(ModBlocks.NIDAVELLIR_HARD_STONE_GOLD_ORE.get(), Items.RAW_GOLD));
        this.add(ModBlocks.NIDAVELLIR_HARD_STONE_COPPER_ORE.get(), block -> createOreDrop(ModBlocks.NIDAVELLIR_HARD_STONE_COPPER_ORE.get(), Items.RAW_COPPER).withPool(LootPool.lootPool().setRolls(UniformGenerator.between(2.0f, 5.0f))));
        this.add(ModBlocks.NIDAVELLIR_HARD_STONE_TIN_ORE.get(), block -> createOreDrop(ModBlocks.NIDAVELLIR_HARD_STONE_TIN_ORE.get(), ModItems.RAW_TIN.get()));
        this.add(ModBlocks.NIDAVELLIR_HARD_STONE_ZINC_ORE.get(), block -> createOreDrop(ModBlocks.NIDAVELLIR_HARD_STONE_ZINC_ORE.get(), ModItems.RAW_ZINC.get()));
        this.add(ModBlocks.NIDAVELLIR_HARD_STONE_DIAMOND_ORE.get(), block -> createOreDrop(ModBlocks.NIDAVELLIR_HARD_STONE_DIAMOND_ORE.get(), Items.DIAMOND));
        this.add(ModBlocks.NIDAVELLIR_HARD_STONE_EMERALD_ORE.get(), block -> createOreDrop(ModBlocks.NIDAVELLIR_HARD_STONE_EMERALD_ORE.get(), Items.EMERALD));
        this.add(ModBlocks.NIDAVELLIR_HARD_STONE_COAL_ORE.get(), block -> createOreDrop(ModBlocks.NIDAVELLIR_HARD_STONE_COAL_ORE.get(), Items.COAL));
        this.add(ModBlocks.NIDAVELLIR_HARD_STONE_REDSTONE_ORE.get(), block -> createOreDrop(ModBlocks.NIDAVELLIR_HARD_STONE_REDSTONE_ORE.get(), Items.REDSTONE).withPool(LootPool.lootPool().setRolls(UniformGenerator.between(4.0f, 5.0f))));
        this.add(ModBlocks.NIDAVELLIR_HARD_STONE_LAPIS_ORE.get(), block -> createOreDrop(ModBlocks.NIDAVELLIR_HARD_STONE_LAPIS_ORE.get(), Items.LAPIS_LAZULI).withPool(LootPool.lootPool().setRolls(UniformGenerator.between(4.0f, 9.0f))));

        this.add(ModBlocks.NIDAVELLIR_HARD_STONE_IRON_ORE_CLUSTER.get(), block -> createOreDrop(ModBlocks.NIDAVELLIR_HARD_STONE_IRON_ORE_CLUSTER.get(), Items.RAW_IRON).withPool(LootPool.lootPool().setRolls(UniformGenerator.between(4.0f, 6.0f))));
        this.add(ModBlocks.NIDAVELLIR_HARD_STONE_GOLD_ORE_CLUSTER.get(), block -> createOreDrop(ModBlocks.NIDAVELLIR_HARD_STONE_GOLD_ORE_CLUSTER.get(), Items.RAW_GOLD).withPool(LootPool.lootPool().setRolls(UniformGenerator.between(4.0f, 6.0f))));
        this.add(ModBlocks.NIDAVELLIR_HARD_STONE_COPPER_ORE_CLUSTER.get(), block -> createOreDrop(ModBlocks.NIDAVELLIR_HARD_STONE_COPPER_ORE_CLUSTER.get(), Items.RAW_COPPER).withPool(LootPool.lootPool().setRolls(UniformGenerator.between(6.0f, 12.0f))));
        this.add(ModBlocks.NIDAVELLIR_HARD_STONE_TIN_ORE_CLUSTER.get(), block -> createOreDrop(ModBlocks.NIDAVELLIR_HARD_STONE_TIN_ORE_CLUSTER.get(), ModItems.RAW_TIN.get()).withPool(LootPool.lootPool().setRolls(UniformGenerator.between(4.0f, 6.0f))));
        this.add(ModBlocks.NIDAVELLIR_HARD_STONE_ZINC_ORE_CLUSTER.get(), block -> createOreDrop(ModBlocks.NIDAVELLIR_HARD_STONE_ZINC_ORE_CLUSTER.get(), ModItems.RAW_ZINC.get()).withPool(LootPool.lootPool().setRolls(UniformGenerator.between(4.0f, 6.0f))));
        this.add(ModBlocks.NIDAVELLIR_HARD_STONE_DIAMOND_ORE_CLUSTER.get(), block -> createOreDrop(ModBlocks.NIDAVELLIR_HARD_STONE_DIAMOND_ORE_CLUSTER.get(), Items.DIAMOND).withPool(LootPool.lootPool().setRolls(UniformGenerator.between(4.0f, 6.0f))));
        this.add(ModBlocks.NIDAVELLIR_HARD_STONE_EMERALD_ORE_CLUSTER.get(), block -> createOreDrop(ModBlocks.NIDAVELLIR_HARD_STONE_EMERALD_ORE_CLUSTER.get(), Items.EMERALD).withPool(LootPool.lootPool().setRolls(UniformGenerator.between(4.0f, 6.0f))));
        this.add(ModBlocks.NIDAVELLIR_HARD_STONE_COAL_ORE_CLUSTER.get(), block -> createOreDrop(ModBlocks.NIDAVELLIR_HARD_STONE_COAL_ORE_CLUSTER.get(), Items.COAL).withPool(LootPool.lootPool().setRolls(UniformGenerator.between(4.0f, 6.0f))));
        this.add(ModBlocks.NIDAVELLIR_HARD_STONE_REDSTONE_ORE_CLUSTER.get(), block -> createOreDrop(ModBlocks.NIDAVELLIR_HARD_STONE_REDSTONE_ORE_CLUSTER.get(), Items.REDSTONE).withPool(LootPool.lootPool().setRolls(UniformGenerator.between(7.0f, 16.0f))));
        this.add(ModBlocks.NIDAVELLIR_HARD_STONE_LAPIS_ORE_CLUSTER.get(), block -> createOreDrop(ModBlocks.NIDAVELLIR_HARD_STONE_LAPIS_ORE_CLUSTER.get(), Items.LAPIS_LAZULI).withPool(LootPool.lootPool().setRolls(UniformGenerator.between(8.0f, 18.0f))));

        this.add(ModBlocks.NIDAVELLIR_ENHANCED_STONE.get(), block -> createSingleItemTableWithSilkTouch(ModBlocks.NIDAVELLIR_ENHANCED_STONE.get(), ModBlocks.NIDAVELLIR_ENHANCED_COBBLESTONE.get()));
        this.dropSelf(ModBlocks.NIDAVELLIR_ENHANCED_STONE_STAIRS.get());
        this.dropSelf(ModBlocks.NIDAVELLIR_ENHANCED_COBBLESTONE.get());
        this.dropSelf(ModBlocks.NIDAVELLIR_ENHANCED_COBBLESTONE_STAIRS.get());
        this.dropSelf(ModBlocks.NIDAVELLIR_ENHANCED_STONE_BRICKS.get());
        this.dropSelf(ModBlocks.NIDAVELLIR_ENHANCED_STONE_BRICKS_STAIRS.get());
        this.dropSelf(ModBlocks.NIDAVELLIR_ENHANCED_STONE_PRESSURE_PLATE.get());
        this.dropSelf(ModBlocks.NIDAVELLIR_ENHANCED_STONE_BUTTON.get());
        this.dropSelf(ModBlocks.NIDAVELLIR_ENHANCED_STONE_WALL.get());
        this.dropSelf(ModBlocks.NIDAVELLIR_ENHANCED_COBBLESTONE_WALL.get());
        this.dropSelf(ModBlocks.NIDAVELLIR_ENHANCED_SMOOTH_STONE.get());
        this.dropSelf(ModBlocks.NIDAVELLIR_ENHANCED_COBBLESTONE_MOSSY.get());
        this.dropSelf(ModBlocks.NIDAVELLIR_ENHANCED_STONE_BRICKS_MOSSY.get());
        this.dropSelf(ModBlocks.NIDAVELLIR_ENHANCED_STONE_BRICKS_CRACKED.get());
        this.dropSelf(ModBlocks.NIDAVELLIR_ENHANCED_STONE_BRICKS_CHISELED.get());
        this.dropSelf(ModBlocks.NIDAVELLIR_ENHANCED_STONE_BRICKS_WALL.get());
        this.add(ModBlocks.NIDAVELLIR_ENHANCED_STONE_SLAB.get(), block -> createSlabItemTable(ModBlocks.NIDAVELLIR_ENHANCED_STONE_SLAB.get()));
        this.add(ModBlocks.NIDAVELLIR_ENHANCED_COBBLESTONE_SLAB.get(), block -> createSlabItemTable(ModBlocks.NIDAVELLIR_ENHANCED_COBBLESTONE_SLAB.get()));
        this.add(ModBlocks.NIDAVELLIR_ENHANCED_STONE_BRICKS_SLAB.get(), block -> createSlabItemTable(ModBlocks.NIDAVELLIR_ENHANCED_STONE_BRICKS_SLAB.get()));

        this.add(ModBlocks.NIDAVELLIR_ENHANCED_STONE_IRON_ORE.get(), block -> createOreDrop(ModBlocks.NIDAVELLIR_ENHANCED_STONE_IRON_ORE.get(), Items.RAW_IRON));
        this.add(ModBlocks.NIDAVELLIR_ENHANCED_STONE_GOLD_ORE.get(), block -> createOreDrop(ModBlocks.NIDAVELLIR_ENHANCED_STONE_GOLD_ORE.get(), Items.RAW_GOLD));
        this.add(ModBlocks.NIDAVELLIR_ENHANCED_STONE_COPPER_ORE.get(), block -> createOreDrop(ModBlocks.NIDAVELLIR_ENHANCED_STONE_COPPER_ORE.get(), Items.RAW_COPPER).withPool(LootPool.lootPool().setRolls(UniformGenerator.between(2.0f, 5.0f))));
        this.add(ModBlocks.NIDAVELLIR_ENHANCED_STONE_TIN_ORE.get(), block -> createOreDrop(ModBlocks.NIDAVELLIR_ENHANCED_STONE_TIN_ORE.get(), ModItems.RAW_TIN.get()));
        this.add(ModBlocks.NIDAVELLIR_ENHANCED_STONE_ZINC_ORE.get(), block -> createOreDrop(ModBlocks.NIDAVELLIR_ENHANCED_STONE_ZINC_ORE.get(), ModItems.RAW_ZINC.get()));
        this.add(ModBlocks.NIDAVELLIR_ENHANCED_STONE_DIAMOND_ORE.get(), block -> createOreDrop(ModBlocks.NIDAVELLIR_ENHANCED_STONE_DIAMOND_ORE.get(), Items.DIAMOND));
        this.add(ModBlocks.NIDAVELLIR_ENHANCED_STONE_EMERALD_ORE.get(), block -> createOreDrop(ModBlocks.NIDAVELLIR_ENHANCED_STONE_EMERALD_ORE.get(), Items.EMERALD));
        this.add(ModBlocks.NIDAVELLIR_ENHANCED_STONE_COAL_ORE.get(), block -> createOreDrop(ModBlocks.NIDAVELLIR_ENHANCED_STONE_COAL_ORE.get(), Items.COAL));
        this.add(ModBlocks.NIDAVELLIR_ENHANCED_STONE_REDSTONE_ORE.get(), block -> createOreDrop(ModBlocks.NIDAVELLIR_ENHANCED_STONE_REDSTONE_ORE.get(), Items.REDSTONE).withPool(LootPool.lootPool().setRolls(UniformGenerator.between(4.0f, 5.0f))));
        this.add(ModBlocks.NIDAVELLIR_ENHANCED_STONE_LAPIS_ORE.get(), block -> createOreDrop(ModBlocks.NIDAVELLIR_ENHANCED_STONE_LAPIS_ORE.get(), Items.LAPIS_LAZULI).withPool(LootPool.lootPool().setRolls(UniformGenerator.between(4.0f, 9.0f))));

        this.add(ModBlocks.NIDAVELLIR_ENHANCED_STONE_IRON_ORE_CLUSTER.get(), block -> createOreDrop(ModBlocks.NIDAVELLIR_ENHANCED_STONE_IRON_ORE_CLUSTER.get(), Items.RAW_IRON).withPool(LootPool.lootPool().setRolls(UniformGenerator.between(4.0f, 6.0f))));
        this.add(ModBlocks.NIDAVELLIR_ENHANCED_STONE_GOLD_ORE_CLUSTER.get(), block -> createOreDrop(ModBlocks.NIDAVELLIR_ENHANCED_STONE_GOLD_ORE_CLUSTER.get(), Items.RAW_GOLD).withPool(LootPool.lootPool().setRolls(UniformGenerator.between(4.0f, 6.0f))));
        this.add(ModBlocks.NIDAVELLIR_ENHANCED_STONE_COPPER_ORE_CLUSTER.get(), block -> createOreDrop(ModBlocks.NIDAVELLIR_ENHANCED_STONE_COPPER_ORE_CLUSTER.get(), Items.RAW_COPPER).withPool(LootPool.lootPool().setRolls(UniformGenerator.between(6.0f, 12.0f))));
        this.add(ModBlocks.NIDAVELLIR_ENHANCED_STONE_TIN_ORE_CLUSTER.get(), block -> createOreDrop(ModBlocks.NIDAVELLIR_ENHANCED_STONE_TIN_ORE_CLUSTER.get(), ModItems.RAW_TIN.get()).withPool(LootPool.lootPool().setRolls(UniformGenerator.between(4.0f, 6.0f))));
        this.add(ModBlocks.NIDAVELLIR_ENHANCED_STONE_ZINC_ORE_CLUSTER.get(), block -> createOreDrop(ModBlocks.NIDAVELLIR_ENHANCED_STONE_ZINC_ORE_CLUSTER.get(), ModItems.RAW_ZINC.get()).withPool(LootPool.lootPool().setRolls(UniformGenerator.between(4.0f, 6.0f))));
        this.add(ModBlocks.NIDAVELLIR_ENHANCED_STONE_DIAMOND_ORE_CLUSTER.get(), block -> createOreDrop(ModBlocks.NIDAVELLIR_ENHANCED_STONE_DIAMOND_ORE_CLUSTER.get(), Items.DIAMOND).withPool(LootPool.lootPool().setRolls(UniformGenerator.between(4.0f, 6.0f))));
        this.add(ModBlocks.NIDAVELLIR_ENHANCED_STONE_EMERALD_ORE_CLUSTER.get(), block -> createOreDrop(ModBlocks.NIDAVELLIR_ENHANCED_STONE_EMERALD_ORE_CLUSTER.get(), Items.EMERALD).withPool(LootPool.lootPool().setRolls(UniformGenerator.between(4.0f, 6.0f))));
        this.add(ModBlocks.NIDAVELLIR_ENHANCED_STONE_COAL_ORE_CLUSTER.get(), block -> createOreDrop(ModBlocks.NIDAVELLIR_ENHANCED_STONE_COAL_ORE_CLUSTER.get(), Items.COAL).withPool(LootPool.lootPool().setRolls(UniformGenerator.between(4.0f, 6.0f))));
        this.add(ModBlocks.NIDAVELLIR_ENHANCED_STONE_REDSTONE_ORE_CLUSTER.get(), block -> createOreDrop(ModBlocks.NIDAVELLIR_ENHANCED_STONE_REDSTONE_ORE_CLUSTER.get(), Items.REDSTONE).withPool(LootPool.lootPool().setRolls(UniformGenerator.between(7.0f, 16.0f))));
        this.add(ModBlocks.NIDAVELLIR_ENHANCED_STONE_LAPIS_ORE_CLUSTER.get(), block -> createOreDrop(ModBlocks.NIDAVELLIR_ENHANCED_STONE_LAPIS_ORE_CLUSTER.get(), Items.LAPIS_LAZULI).withPool(LootPool.lootPool().setRolls(UniformGenerator.between(8.0f, 18.0f))));

        this.add(ModBlocks.NIDAVELLIR_DEEPSLATE_STONE.get(), block -> createSingleItemTableWithSilkTouch(ModBlocks.NIDAVELLIR_DEEPSLATE_STONE.get(), ModBlocks.NIDAVELLIR_DEEPSLATE_COBBLESTONE.get()));
        this.dropSelf(ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_STAIRS.get());
        this.dropSelf(ModBlocks.NIDAVELLIR_DEEPSLATE_COBBLESTONE.get());
        this.dropSelf(ModBlocks.NIDAVELLIR_DEEPSLATE_COBBLESTONE_STAIRS.get());
        this.dropSelf(ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_BRICKS.get());
        this.dropSelf(ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_BRICKS_STAIRS.get());
        this.dropSelf(ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_PRESSURE_PLATE.get());
        this.dropSelf(ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_BUTTON.get());
        this.dropSelf(ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_WALL.get());
        this.dropSelf(ModBlocks.NIDAVELLIR_DEEPSLATE_COBBLESTONE_WALL.get());
        this.dropSelf(ModBlocks.NIDAVELLIR_DEEPSLATE_SMOOTH_STONE.get());
        this.dropSelf(ModBlocks.NIDAVELLIR_DEEPSLATE_COBBLESTONE_MOSSY.get());
        this.dropSelf(ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_BRICKS_MOSSY.get());
        this.dropSelf(ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_BRICKS_CRACKED.get());
        this.dropSelf(ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_BRICKS_CHISELED.get());
        this.dropSelf(ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_BRICKS_WALL.get());
        this.add(ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_SLAB.get(), block -> createSlabItemTable(ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_SLAB.get()));
        this.add(ModBlocks.NIDAVELLIR_DEEPSLATE_COBBLESTONE_SLAB.get(), block -> createSlabItemTable(ModBlocks.NIDAVELLIR_DEEPSLATE_COBBLESTONE_SLAB.get()));
        this.add(ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_BRICKS_SLAB.get(), block -> createSlabItemTable(ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_BRICKS_SLAB.get()));

        this.add(ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_IRON_ORE.get(), block -> createOreDrop(ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_IRON_ORE.get(), Items.RAW_IRON));
        this.add(ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_GOLD_ORE.get(), block -> createOreDrop(ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_GOLD_ORE.get(), Items.RAW_GOLD));
        this.add(ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_COPPER_ORE.get(), block -> createOreDrop(ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_COPPER_ORE.get(), Items.RAW_COPPER).withPool(LootPool.lootPool().setRolls(UniformGenerator.between(2.0f, 5.0f))));
        this.add(ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_TIN_ORE.get(), block -> createOreDrop(ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_TIN_ORE.get(), ModItems.RAW_TIN.get()));
        this.add(ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_ZINC_ORE.get(), block -> createOreDrop(ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_ZINC_ORE.get(), ModItems.RAW_ZINC.get()));
        this.add(ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_DIAMOND_ORE.get(), block -> createOreDrop(ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_DIAMOND_ORE.get(), Items.DIAMOND));
        this.add(ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_EMERALD_ORE.get(), block -> createOreDrop(ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_EMERALD_ORE.get(), Items.EMERALD));
        this.add(ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_COAL_ORE.get(), block -> createOreDrop(ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_COAL_ORE.get(), Items.COAL));
        this.add(ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_REDSTONE_ORE.get(), block -> createOreDrop(ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_REDSTONE_ORE.get(), Items.REDSTONE).withPool(LootPool.lootPool().setRolls(UniformGenerator.between(4.0f, 5.0f))));
        this.add(ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_LAPIS_ORE.get(), block -> createOreDrop(ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_LAPIS_ORE.get(), Items.LAPIS_LAZULI).withPool(LootPool.lootPool().setRolls(UniformGenerator.between(4.0f, 9.0f))));

        this.add(ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_IRON_ORE_CLUSTER.get(), block -> createOreDrop(ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_IRON_ORE_CLUSTER.get(), Items.RAW_IRON).withPool(LootPool.lootPool().setRolls(UniformGenerator.between(4.0f, 6.0f))));
        this.add(ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_GOLD_ORE_CLUSTER.get(), block -> createOreDrop(ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_GOLD_ORE_CLUSTER.get(), Items.RAW_GOLD).withPool(LootPool.lootPool().setRolls(UniformGenerator.between(4.0f, 6.0f))));
        this.add(ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_COPPER_ORE_CLUSTER.get(), block -> createOreDrop(ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_COPPER_ORE_CLUSTER.get(), Items.RAW_COPPER).withPool(LootPool.lootPool().setRolls(UniformGenerator.between(6.0f, 12.0f))));
        this.add(ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_TIN_ORE_CLUSTER.get(), block -> createOreDrop(ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_TIN_ORE_CLUSTER.get(), ModItems.RAW_TIN.get()).withPool(LootPool.lootPool().setRolls(UniformGenerator.between(4.0f, 6.0f))));
        this.add(ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_ZINC_ORE_CLUSTER.get(), block -> createOreDrop(ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_ZINC_ORE_CLUSTER.get(), ModItems.RAW_ZINC.get()).withPool(LootPool.lootPool().setRolls(UniformGenerator.between(4.0f, 6.0f))));
        this.add(ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_DIAMOND_ORE_CLUSTER.get(), block -> createOreDrop(ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_DIAMOND_ORE_CLUSTER.get(), Items.DIAMOND).withPool(LootPool.lootPool().setRolls(UniformGenerator.between(4.0f, 6.0f))));
        this.add(ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_EMERALD_ORE_CLUSTER.get(), block -> createOreDrop(ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_EMERALD_ORE_CLUSTER.get(), Items.EMERALD).withPool(LootPool.lootPool().setRolls(UniformGenerator.between(4.0f, 6.0f))));
        this.add(ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_COAL_ORE_CLUSTER.get(), block -> createOreDrop(ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_COAL_ORE_CLUSTER.get(), Items.COAL).withPool(LootPool.lootPool().setRolls(UniformGenerator.between(4.0f, 6.0f))));
        this.add(ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_REDSTONE_ORE_CLUSTER.get(), block -> createOreDrop(ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_REDSTONE_ORE_CLUSTER.get(), Items.REDSTONE).withPool(LootPool.lootPool().setRolls(UniformGenerator.between(7.0f, 16.0f))));
        this.add(ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_LAPIS_ORE_CLUSTER.get(), block -> createOreDrop(ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_LAPIS_ORE_CLUSTER.get(), Items.LAPIS_LAZULI).withPool(LootPool.lootPool().setRolls(UniformGenerator.between(8.0f, 18.0f))));

        this.add(ModBlocks.NIDAVELLIR_CRIMSON_STONE.get(), block -> createSingleItemTableWithSilkTouch(ModBlocks.NIDAVELLIR_CRIMSON_STONE.get(), ModBlocks.NIDAVELLIR_CRIMSON_COBBLESTONE.get()));
        this.dropSelf(ModBlocks.NIDAVELLIR_CRIMSON_STONE_STAIRS.get());
        this.dropSelf(ModBlocks.NIDAVELLIR_CRIMSON_COBBLESTONE.get());
        this.dropSelf(ModBlocks.NIDAVELLIR_CRIMSON_COBBLESTONE_STAIRS.get());
        this.dropSelf(ModBlocks.NIDAVELLIR_CRIMSON_STONE_BRICKS.get());
        this.dropSelf(ModBlocks.NIDAVELLIR_CRIMSON_STONE_BRICKS_STAIRS.get());
        this.dropSelf(ModBlocks.NIDAVELLIR_CRIMSON_STONE_PRESSURE_PLATE.get());
        this.dropSelf(ModBlocks.NIDAVELLIR_CRIMSON_STONE_BUTTON.get());
        this.dropSelf(ModBlocks.NIDAVELLIR_CRIMSON_STONE_WALL.get());
        this.dropSelf(ModBlocks.NIDAVELLIR_CRIMSON_COBBLESTONE_WALL.get());
        this.dropSelf(ModBlocks.NIDAVELLIR_CRIMSON_SMOOTH_STONE.get());
        this.dropSelf(ModBlocks.NIDAVELLIR_CRIMSON_COBBLESTONE_MOSSY.get());
        this.dropSelf(ModBlocks.NIDAVELLIR_CRIMSON_STONE_BRICKS_MOSSY.get());
        this.dropSelf(ModBlocks.NIDAVELLIR_CRIMSON_STONE_BRICKS_CRACKED.get());
        this.dropSelf(ModBlocks.NIDAVELLIR_CRIMSON_STONE_BRICKS_CHISELED.get());
        this.dropSelf(ModBlocks.NIDAVELLIR_CRIMSON_STONE_BRICKS_WALL.get());
        this.add(ModBlocks.NIDAVELLIR_CRIMSON_STONE_SLAB.get(), block -> createSlabItemTable(ModBlocks.NIDAVELLIR_CRIMSON_STONE_SLAB.get()));
        this.add(ModBlocks.NIDAVELLIR_CRIMSON_COBBLESTONE_SLAB.get(), block -> createSlabItemTable(ModBlocks.NIDAVELLIR_CRIMSON_COBBLESTONE_SLAB.get()));
        this.add(ModBlocks.NIDAVELLIR_CRIMSON_STONE_BRICKS_SLAB.get(), block -> createSlabItemTable(ModBlocks.NIDAVELLIR_CRIMSON_STONE_BRICKS_SLAB.get()));

        this.add(ModBlocks.NIDAVELLIR_CRIMSON_STONE_IRON_ORE.get(), block -> createOreDrop(ModBlocks.NIDAVELLIR_CRIMSON_STONE_IRON_ORE.get(), Items.RAW_IRON));
        this.add(ModBlocks.NIDAVELLIR_CRIMSON_STONE_GOLD_ORE.get(), block -> createOreDrop(ModBlocks.NIDAVELLIR_CRIMSON_STONE_GOLD_ORE.get(), Items.RAW_GOLD));
        this.add(ModBlocks.NIDAVELLIR_CRIMSON_STONE_COPPER_ORE.get(), block -> createOreDrop(ModBlocks.NIDAVELLIR_CRIMSON_STONE_COPPER_ORE.get(), Items.RAW_COPPER).withPool(LootPool.lootPool().setRolls(UniformGenerator.between(2.0f, 5.0f))));
        this.add(ModBlocks.NIDAVELLIR_CRIMSON_STONE_TIN_ORE.get(), block -> createOreDrop(ModBlocks.NIDAVELLIR_CRIMSON_STONE_TIN_ORE.get(), ModItems.RAW_TIN.get()));
        this.add(ModBlocks.NIDAVELLIR_CRIMSON_STONE_ZINC_ORE.get(), block -> createOreDrop(ModBlocks.NIDAVELLIR_CRIMSON_STONE_ZINC_ORE.get(), ModItems.RAW_ZINC.get()));
        this.add(ModBlocks.NIDAVELLIR_CRIMSON_STONE_DIAMOND_ORE.get(), block -> createOreDrop(ModBlocks.NIDAVELLIR_CRIMSON_STONE_DIAMOND_ORE.get(), Items.DIAMOND));
        this.add(ModBlocks.NIDAVELLIR_CRIMSON_STONE_EMERALD_ORE.get(), block -> createOreDrop(ModBlocks.NIDAVELLIR_CRIMSON_STONE_EMERALD_ORE.get(), Items.EMERALD));
        this.add(ModBlocks.NIDAVELLIR_CRIMSON_STONE_COAL_ORE.get(), block -> createOreDrop(ModBlocks.NIDAVELLIR_CRIMSON_STONE_COAL_ORE.get(), Items.COAL));
        this.add(ModBlocks.NIDAVELLIR_CRIMSON_STONE_REDSTONE_ORE.get(), block -> createOreDrop(ModBlocks.NIDAVELLIR_CRIMSON_STONE_REDSTONE_ORE.get(), Items.REDSTONE).withPool(LootPool.lootPool().setRolls(UniformGenerator.between(4.0f, 5.0f))));
        this.add(ModBlocks.NIDAVELLIR_CRIMSON_STONE_LAPIS_ORE.get(), block -> createOreDrop(ModBlocks.NIDAVELLIR_CRIMSON_STONE_LAPIS_ORE.get(), Items.LAPIS_LAZULI).withPool(LootPool.lootPool().setRolls(UniformGenerator.between(4.0f, 9.0f))));

        this.add(ModBlocks.NIDAVELLIR_CRIMSON_STONE_IRON_ORE_CLUSTER.get(), block -> createOreDrop(ModBlocks.NIDAVELLIR_CRIMSON_STONE_IRON_ORE_CLUSTER.get(), Items.RAW_IRON).withPool(LootPool.lootPool().setRolls(UniformGenerator.between(4.0f, 6.0f))));
        this.add(ModBlocks.NIDAVELLIR_CRIMSON_STONE_GOLD_ORE_CLUSTER.get(), block -> createOreDrop(ModBlocks.NIDAVELLIR_CRIMSON_STONE_GOLD_ORE_CLUSTER.get(), Items.RAW_GOLD).withPool(LootPool.lootPool().setRolls(UniformGenerator.between(4.0f, 6.0f))));
        this.add(ModBlocks.NIDAVELLIR_CRIMSON_STONE_COPPER_ORE_CLUSTER.get(), block -> createOreDrop(ModBlocks.NIDAVELLIR_CRIMSON_STONE_COPPER_ORE_CLUSTER.get(), Items.RAW_COPPER).withPool(LootPool.lootPool().setRolls(UniformGenerator.between(6.0f, 12.0f))));
        this.add(ModBlocks.NIDAVELLIR_CRIMSON_STONE_TIN_ORE_CLUSTER.get(), block -> createOreDrop(ModBlocks.NIDAVELLIR_CRIMSON_STONE_TIN_ORE_CLUSTER.get(), ModItems.RAW_TIN.get()).withPool(LootPool.lootPool().setRolls(UniformGenerator.between(4.0f, 6.0f))));
        this.add(ModBlocks.NIDAVELLIR_CRIMSON_STONE_ZINC_ORE_CLUSTER.get(), block -> createOreDrop(ModBlocks.NIDAVELLIR_CRIMSON_STONE_ZINC_ORE_CLUSTER.get(), ModItems.RAW_ZINC.get()).withPool(LootPool.lootPool().setRolls(UniformGenerator.between(4.0f, 6.0f))));
        this.add(ModBlocks.NIDAVELLIR_CRIMSON_STONE_DIAMOND_ORE_CLUSTER.get(), block -> createOreDrop(ModBlocks.NIDAVELLIR_CRIMSON_STONE_DIAMOND_ORE_CLUSTER.get(), Items.DIAMOND).withPool(LootPool.lootPool().setRolls(UniformGenerator.between(4.0f, 6.0f))));
        this.add(ModBlocks.NIDAVELLIR_CRIMSON_STONE_EMERALD_ORE_CLUSTER.get(), block -> createOreDrop(ModBlocks.NIDAVELLIR_CRIMSON_STONE_EMERALD_ORE_CLUSTER.get(), Items.EMERALD).withPool(LootPool.lootPool().setRolls(UniformGenerator.between(4.0f, 6.0f))));
        this.add(ModBlocks.NIDAVELLIR_CRIMSON_STONE_COAL_ORE_CLUSTER.get(), block -> createOreDrop(ModBlocks.NIDAVELLIR_CRIMSON_STONE_COAL_ORE_CLUSTER.get(), Items.COAL).withPool(LootPool.lootPool().setRolls(UniformGenerator.between(4.0f, 6.0f))));
        this.add(ModBlocks.NIDAVELLIR_CRIMSON_STONE_REDSTONE_ORE_CLUSTER.get(), block -> createOreDrop(ModBlocks.NIDAVELLIR_CRIMSON_STONE_REDSTONE_ORE_CLUSTER.get(), Items.REDSTONE).withPool(LootPool.lootPool().setRolls(UniformGenerator.between(7.0f, 16.0f))));
        this.add(ModBlocks.NIDAVELLIR_CRIMSON_STONE_LAPIS_ORE_CLUSTER.get(), block -> createOreDrop(ModBlocks.NIDAVELLIR_CRIMSON_STONE_LAPIS_ORE_CLUSTER.get(), Items.LAPIS_LAZULI).withPool(LootPool.lootPool().setRolls(UniformGenerator.between(8.0f, 18.0f))));


        this.add(ModBlocks.TARTARUS_STONE.get(), block -> createSingleItemTableWithSilkTouch(ModBlocks.TARTARUS_STONE.get(), ModBlocks.TARTARUS_STONE_COBBLESTONE.get()));
        this.dropSelf(ModBlocks.TARTARUS_STONE_STAIRS.get());
        this.dropSelf(ModBlocks.TARTARUS_STONE_COBBLESTONE.get());
        this.dropSelf(ModBlocks.TARTARUS_STONE_COBBLESTONE_STAIRS.get());
        this.dropSelf(ModBlocks.TARTARUS_STONE_BRICKS.get());
        this.dropSelf(ModBlocks.TARTARUS_STONE_BRICKS_STAIRS.get());
        this.dropSelf(ModBlocks.TARTARUS_STONE_PRESSURE_PLATE.get());
        this.dropSelf(ModBlocks.TARTARUS_STONE_BUTTON.get());
        this.dropSelf(ModBlocks.TARTARUS_STONE_WALL.get());
        this.dropSelf(ModBlocks.TARTARUS_STONE_COBBLESTONE_WALL.get());
        this.dropSelf(ModBlocks.TARTARUS_STONE_SMOOTH_STONE.get());
        this.dropSelf(ModBlocks.TARTARUS_STONE_COBBLESTONE_MOSSY.get());
        this.dropSelf(ModBlocks.TARTARUS_STONE_BRICKS_MOSSY.get());
        this.dropSelf(ModBlocks.TARTARUS_STONE_BRICKS_CRACKED.get());
        this.dropSelf(ModBlocks.TARTARUS_STONE_BRICKS_CHISELED.get());
        this.dropSelf(ModBlocks.TARTARUS_STONE_BRICKS_WALL.get());
        this.add(ModBlocks.TARTARUS_STONE_SLAB.get(), block -> createSlabItemTable(ModBlocks.TARTARUS_STONE_SLAB.get()));
        this.add(ModBlocks.TARTARUS_STONE_COBBLESTONE_SLAB.get(), block -> createSlabItemTable(ModBlocks.TARTARUS_STONE_COBBLESTONE_SLAB.get()));
        this.add(ModBlocks.TARTARUS_STONE_BRICKS_SLAB.get(), block -> createSlabItemTable(ModBlocks.TARTARUS_STONE_BRICKS_SLAB.get()));


        /*
         * TREES
        */
        //Elder Wood
        this.dropSelf(ModBlocks.ELDER_WOOD_LOG.get());
        this.dropSelf(ModBlocks.ELDER_WOOD.get());
        this.dropSelf(ModBlocks.STRIPPED_ELDER_WOOD_LOG.get());
        this.dropSelf(ModBlocks.STRIPPED_ELDER_WOOD.get());
        this.dropSelf(ModBlocks.ELDER_WOOD_SAPLING.get());
        this.dropSelf(ModBlocks.ELDER_WOOD_PLANKS.get());
        this.add(ModBlocks.ELDER_WOOD_PLANKS_SLAB.get(), block -> createSlabItemTable(ModBlocks.ELDER_WOOD_PLANKS_SLAB.get()));
        this.dropSelf(ModBlocks.ELDER_WOOD_PLANKS_STAIRS.get());
        this.dropSelf(ModBlocks.ELDER_WOOD_PLANKS_PRESSURE_PLATE.get());
        this.add(ModBlocks.ELDER_WOOD_PLANKS_DOOR.get(), block -> createDoorTable(ModBlocks.ELDER_WOOD_PLANKS_DOOR.get()));
        this.dropSelf(ModBlocks.ELDER_WOOD_PLANKS_TRAPDOOR.get());
        this.dropSelf(ModBlocks.ELDER_WOOD_PLANKS_FENCE.get());
        this.dropSelf(ModBlocks.ELDER_WOOD_PLANKS_FENCE_GATE.get());
        this.dropSelf(ModBlocks.ELDER_WOOD_PLANKS_BUTTON.get());

        this.add(ModBlocks.ELDER_WOOD_LEAVES.get(), block -> createLeavesDrops(block, ModBlocks.ELDER_WOOD_LEAVES.get(), NORMAL_LEAVES_SAPLING_CHANCES));

        this.add(ModBlocks.ELDER_WOOD_PLANKS_SIGN.get(), block ->
                createSingleItemTable(ModItems.ELDER_WOOD_SIGN.get()));
        this.add(ModBlocks.ELDER_WOOD_PLANKS_WALL_SIGN.get(), block ->
                createSingleItemTable(ModItems.ELDER_WOOD_SIGN.get()));
        this.add(ModBlocks.ELDER_WOOD_PLANKS_HANGING_SIGN.get(), block ->
                createSingleItemTable(ModItems.ELDER_WOOD_HANGING_SIGN.get()));
        this.add(ModBlocks.ELDER_WOOD_PLANKS_WALL_HANGING_SIGN.get(), block ->
                createSingleItemTable(ModItems.ELDER_WOOD_HANGING_SIGN.get()));

        //Olive
        this.dropSelf(ModBlocks.OLIVE_LOG.get());
        this.dropSelf(ModBlocks.OLIVE_WOOD.get());
        this.dropSelf(ModBlocks.STRIPPED_OLIVE_LOG.get());
        this.dropSelf(ModBlocks.STRIPPED_OLIVE_WOOD.get());
        this.dropSelf(ModBlocks.OLIVE_SAPLING.get());
        this.dropSelf(ModBlocks.OLIVE_PLANKS.get());
        this.add(ModBlocks.OLIVE_PLANKS_SLAB.get(), block -> createSlabItemTable(ModBlocks.OLIVE_PLANKS_SLAB.get()));
        this.dropSelf(ModBlocks.OLIVE_PLANKS_STAIRS.get());
        this.dropSelf(ModBlocks.OLIVE_PLANKS_PRESSURE_PLATE.get());
        this.add(ModBlocks.OLIVE_PLANKS_DOOR.get(), block -> createDoorTable(ModBlocks.OLIVE_PLANKS_DOOR.get()));
        this.dropSelf(ModBlocks.OLIVE_PLANKS_TRAPDOOR.get());
        this.dropSelf(ModBlocks.OLIVE_PLANKS_FENCE.get());
        this.dropSelf(ModBlocks.OLIVE_PLANKS_FENCE_GATE.get());
        this.dropSelf(ModBlocks.OLIVE_PLANKS_BUTTON.get());

        this.add(ModBlocks.OLIVE_LEAVES.get(), block -> createLeavesDrops(block, ModBlocks.OLIVE_LEAVES.get(), NORMAL_LEAVES_SAPLING_CHANCES));

        this.add(ModBlocks.OLIVE_PLANKS_SIGN.get(), block ->
                createSingleItemTable(ModItems.OLIVE_SIGN.get()));
        this.add(ModBlocks.OLIVE_PLANKS_WALL_SIGN.get(), block ->
                createSingleItemTable(ModItems.OLIVE_SIGN.get()));
        this.add(ModBlocks.OLIVE_PLANKS_HANGING_SIGN.get(), block ->
                createSingleItemTable(ModItems.OLIVE_HANGING_SIGN.get()));
        this.add(ModBlocks.OLIVE_PLANKS_WALL_HANGING_SIGN.get(), block ->
                createSingleItemTable(ModItems.OLIVE_HANGING_SIGN.get()));

        //Myrrh
        this.dropSelf(ModBlocks.MYRRH_LOG.get());
        this.dropSelf(ModBlocks.MYRRH_WOOD.get());
        this.dropSelf(ModBlocks.STRIPPED_MYRRH_LOG.get());
        this.dropSelf(ModBlocks.STRIPPED_MYRRH_WOOD.get());
        this.dropSelf(ModBlocks.MYRRH_SAPLING.get());
        this.dropSelf(ModBlocks.MYRRH_PLANKS.get());
        this.add(ModBlocks.MYRRH_PLANKS_SLAB.get(), block -> createSlabItemTable(ModBlocks.MYRRH_PLANKS_SLAB.get()));
        this.dropSelf(ModBlocks.MYRRH_PLANKS_STAIRS.get());
        this.dropSelf(ModBlocks.MYRRH_PLANKS_PRESSURE_PLATE.get());
        this.add(ModBlocks.MYRRH_PLANKS_DOOR.get(), block -> createDoorTable(ModBlocks.MYRRH_PLANKS_DOOR.get()));
        this.dropSelf(ModBlocks.MYRRH_PLANKS_TRAPDOOR.get());
        this.dropSelf(ModBlocks.MYRRH_PLANKS_FENCE.get());
        this.dropSelf(ModBlocks.MYRRH_PLANKS_FENCE_GATE.get());
        this.dropSelf(ModBlocks.MYRRH_PLANKS_BUTTON.get());

        this.add(ModBlocks.MYRRH_LEAVES.get(), block -> createLeavesDrops(block, ModBlocks.MYRRH_LEAVES.get(), NORMAL_LEAVES_SAPLING_CHANCES));

        this.add(ModBlocks.MYRRH_PLANKS_SIGN.get(), block ->
                createSingleItemTable(ModItems.MYRRH_SIGN.get()));
        this.add(ModBlocks.MYRRH_PLANKS_WALL_SIGN.get(), block ->
                createSingleItemTable(ModItems.MYRRH_SIGN.get()));
        this.add(ModBlocks.MYRRH_PLANKS_HANGING_SIGN.get(), block ->
                createSingleItemTable(ModItems.MYRRH_HANGING_SIGN.get()));
        this.add(ModBlocks.MYRRH_PLANKS_WALL_HANGING_SIGN.get(), block ->
                createSingleItemTable(ModItems.MYRRH_HANGING_SIGN.get()));

        //Laurel
        this.dropSelf(ModBlocks.LAUREL_LOG.get());
        this.dropSelf(ModBlocks.LAUREL_WOOD.get());
        this.dropSelf(ModBlocks.STRIPPED_LAUREL_LOG.get());
        this.dropSelf(ModBlocks.STRIPPED_LAUREL_WOOD.get());
        this.dropSelf(ModBlocks.LAUREL_SAPLING.get());
        this.dropSelf(ModBlocks.LAUREL_PLANKS.get());
        this.add(ModBlocks.LAUREL_PLANKS_SLAB.get(), block -> createSlabItemTable(ModBlocks.LAUREL_PLANKS_SLAB.get()));
        this.dropSelf(ModBlocks.LAUREL_PLANKS_STAIRS.get());
        this.dropSelf(ModBlocks.LAUREL_PLANKS_PRESSURE_PLATE.get());
        this.add(ModBlocks.LAUREL_PLANKS_DOOR.get(), block -> createDoorTable(ModBlocks.LAUREL_PLANKS_DOOR.get()));
        this.dropSelf(ModBlocks.LAUREL_PLANKS_TRAPDOOR.get());
        this.dropSelf(ModBlocks.LAUREL_PLANKS_FENCE.get());
        this.dropSelf(ModBlocks.LAUREL_PLANKS_FENCE_GATE.get());
        this.dropSelf(ModBlocks.LAUREL_PLANKS_BUTTON.get());

        this.add(ModBlocks.LAUREL_LEAVES.get(), block -> createLeavesDrops(block, ModBlocks.LAUREL_LEAVES.get(), NORMAL_LEAVES_SAPLING_CHANCES));

        this.add(ModBlocks.LAUREL_PLANKS_SIGN.get(), block ->
                createSingleItemTable(ModItems.LAUREL_SIGN.get()));
        this.add(ModBlocks.LAUREL_PLANKS_WALL_SIGN.get(), block ->
                createSingleItemTable(ModItems.LAUREL_SIGN.get()));
        this.add(ModBlocks.LAUREL_PLANKS_HANGING_SIGN.get(), block ->
                createSingleItemTable(ModItems.LAUREL_HANGING_SIGN.get()));
        this.add(ModBlocks.LAUREL_PLANKS_WALL_HANGING_SIGN.get(), block ->
                createSingleItemTable(ModItems.LAUREL_HANGING_SIGN.get()));


        //Cypress
        this.dropSelf(ModBlocks.CYPRESS_LOG.get());
        this.dropSelf(ModBlocks.CYPRESS_WOOD.get());
        this.dropSelf(ModBlocks.STRIPPED_CYPRESS_LOG.get());
        this.dropSelf(ModBlocks.STRIPPED_CYPRESS_WOOD.get());
        this.dropSelf(ModBlocks.CYPRESS_SAPLING.get());
        this.dropSelf(ModBlocks.CYPRESS_PLANKS.get());
        this.add(ModBlocks.CYPRESS_PLANKS_SLAB.get(), block -> createSlabItemTable(ModBlocks.CYPRESS_PLANKS_SLAB.get()));
        this.dropSelf(ModBlocks.CYPRESS_PLANKS_STAIRS.get());
        this.dropSelf(ModBlocks.CYPRESS_PLANKS_PRESSURE_PLATE.get());
        this.add(ModBlocks.CYPRESS_PLANKS_DOOR.get(), block -> createDoorTable(ModBlocks.CYPRESS_PLANKS_DOOR.get()));
        this.dropSelf(ModBlocks.CYPRESS_PLANKS_TRAPDOOR.get());
        this.dropSelf(ModBlocks.CYPRESS_PLANKS_FENCE.get());
        this.dropSelf(ModBlocks.CYPRESS_PLANKS_FENCE_GATE.get());
        this.dropSelf(ModBlocks.CYPRESS_PLANKS_BUTTON.get());

        this.add(ModBlocks.CYPRESS_LEAVES.get(), block -> createLeavesDrops(block, ModBlocks.CYPRESS_LEAVES.get(), NORMAL_LEAVES_SAPLING_CHANCES));

        this.add(ModBlocks.CYPRESS_PLANKS_SIGN.get(), block ->
                createSingleItemTable(ModItems.CYPRESS_SIGN.get()));
        this.add(ModBlocks.CYPRESS_PLANKS_WALL_SIGN.get(), block ->
                createSingleItemTable(ModItems.CYPRESS_SIGN.get()));
        this.add(ModBlocks.CYPRESS_PLANKS_HANGING_SIGN.get(), block ->
                createSingleItemTable(ModItems.CYPRESS_HANGING_SIGN.get()));
        this.add(ModBlocks.CYPRESS_PLANKS_WALL_HANGING_SIGN.get(), block ->
                createSingleItemTable(ModItems.CYPRESS_HANGING_SIGN.get()));

    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
