package net.sen.lostworlds.datagen.loottable;

import net.minecraft.advancements.critereon.ItemPredicate;
import net.minecraft.advancements.critereon.StatePropertiesPredicate;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.ApplyBonusCount;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.predicates.LootItemBlockStatePropertyCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemRandomChanceCondition;
import net.minecraft.world.level.storage.loot.predicates.MatchTool;
import net.minecraft.world.level.storage.loot.providers.number.NumberProvider;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;
import net.minecraftforge.registries.RegistryObject;
import net.sen.lostworlds.block.ModBlocks;
import net.sen.lostworlds.block.custom.*;
import net.sen.lostworlds.item.ModItems;

import java.util.Set;
import java.util.function.Supplier;

public class ModBlockLootTables extends BlockLootSubProvider {
    private static final LootItemCondition.Builder SHEARS = MatchTool.toolMatches(ItemPredicate.Builder.item().of(Items.SHEARS));

    public ModBlockLootTables() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {
        this.dropSelf(ModBlocks.CRIMSON_DIAMOND_BLOCK);
        this.dropSelf(ModBlocks.NETHER_STEEL_BLOCK);
        this.dropSelf(ModBlocks.ORICHALCUM_BLOCK);
        this.dropSelf(ModBlocks.ZINC_BLOCK);
        this.dropSelf(ModBlocks.TIN_BLOCK);
        this.dropSelf(ModBlocks.AURICHALCITE_BLOCK);
        this.dropSelf(ModBlocks.BRASS_BLOCK);
        this.dropSelf(ModBlocks.BRONZE_BLOCK);
        this.dropSelf(ModBlocks.RAW_NETHER_STEEL_BLOCK);
        this.dropSelf(ModBlocks.RAW_ORICHALCUM_BLOCK);
        this.dropSelf(ModBlocks.RAW_ZINC_BLOCK);
        this.dropSelf(ModBlocks.RAW_TIN_BLOCK);
        this.dropSelf(ModBlocks.SOUND_BLOCK);
        this.dropSelf(ModBlocks.ALLOY_SMELTER);

        this.dropSelf(ModBlocks.CRIMSON_STONE_STAIRS);
        this.dropSelf(ModBlocks.CRIMSON_COBBLESTONE);
        this.dropSelf(ModBlocks.CRIMSON_COBBLESTONE_STAIRS);
        this.dropSelf(ModBlocks.CRIMSON_STONE_BRICKS);
        this.dropSelf(ModBlocks.CRIMSON_STONE_BRICK_STAIRS);
        this.dropSelf(ModBlocks.CRIMSON_STONE_PRESSURE_PLATE);
        this.dropSelf(ModBlocks.CRIMSON_STONE_BUTTON);
        this.dropSelf(ModBlocks.CRIMSON_STONE_FENCE);
        this.dropSelf(ModBlocks.CRIMSON_STONE_FENCE_GATE);
        this.dropSelf(ModBlocks.CRIMSON_STONE_WALL);
        this.dropSelf(ModBlocks.CRIMSON_STONE_TRAPDOOR);
        this.slab(ModBlocks.CRIMSON_STONE_SLAB);
        this.slab(ModBlocks.CRIMSON_COBBLESTONE_SLAB);
        this.slab(ModBlocks.CRIMSON_STONE_BRICK_SLAB);
        this.door(ModBlocks.CRIMSON_STONE_DOOR);
        this.slab(ModBlocks.CRIMSON_STONE);

        this.dropSelf(ModBlocks.CRIMSON_DIAMOND_LAMP);
        this.dropSelf(ModBlocks.ADAMANT_BLOCK);

        this.dropFlower(ModBlocks.IRIS_FLOWER, ModBlocks.POTTED_IRIS_FLOWER);
        this.dropFlower(ModBlocks.DARK_BLOOM_FLOWER, ModBlocks.POTTED_DARK_BLOOM_FLOWER);
        this.dropFlower(ModBlocks.DREAD_NIGHT_FLOWER, ModBlocks.POTTED_DREAD_NIGIHT_FLOWER);
        this.dropFlower(ModBlocks.BLACK_LOTUS_FLOWER, ModBlocks.POTTED_BLACK_LOTUS_FLOWER);
        this.dropFlower(ModBlocks.NIGHT_ROSE_FLOWER, ModBlocks.POTTED_NIGHT_ROSE_FLOWER);
        this.dropFlower(ModBlocks.AQUA_ROSE_FLOWER, ModBlocks.POTTED_AQUA_ROSE_FLOWER);
        this.dropFlower(ModBlocks.MOON_FLOWER, ModBlocks.POTTED_MOON_FLOWER);
        this.dropFlower(ModBlocks.CATHERINE_FLOWER, ModBlocks.POTTED_CATHERINE_FLOWER);
        this.dropFlower(ModBlocks.TAINTED_ROSE_FLOWER, ModBlocks.POTTED_TAINTED_ROSE_FLOWER);
        this.dropFlower(ModBlocks.CINNAMON_ROSE_FLOWER, ModBlocks.POTTED_CINNAMON_ROSE_FLOWER);
        this.dropFlower(ModBlocks.BUTTERFLY_FLOWER, ModBlocks.POTTED_BUTTERFLY_FLOWER);
        this.dropFlower(ModBlocks.GAIA_TULIP_FLOWER, ModBlocks.POTTED_GAIA_TULIP_FLOWER);
        this.dropFlower(ModBlocks.BEARDED_IRIS_FLOWER, ModBlocks.POTTED_BEARDED_IRIS_FLOWER);
        this.dropFlower(ModBlocks.CORNFLOWER_FLOWER, ModBlocks.POTTED_CORNFLOWER_FLOWER);
        this.dropFlower(ModBlocks.MORNING_GLORY_FLOWER, ModBlocks.POTTED_MORNING_GLORY_FLOWER);
        this.dropFlower(ModBlocks.GEORGIA_BLUE_FLOWER, ModBlocks.POTTED_GEORGIA_BLUE_FLOWER);
        this.dropFlower(ModBlocks.BLUE_POPPY_FLOWER, ModBlocks.POTTED_BLUE_POPPY_FLOWER);
        this.dropFlower(ModBlocks.TULIP_FLOWER, ModBlocks.POTTED_TULIP_FLOWER);
        this.dropFlower(ModBlocks.CARNATION_FLOWER, ModBlocks.POTTED_CARNATION_FLOWER);
        this.dropFlower(ModBlocks.LADYS_MANTLE_FLOWER, ModBlocks.POTTED_LADYS_MANTLE_FLOWER);
        this.dropFlower(ModBlocks.GREEN_ROSE_FLOWER, ModBlocks.POTTED_GREEN_ROSE_FLOWER);
        this.dropFlower(ModBlocks.CLEMATIS_FLOWER, ModBlocks.POTTED_CLEMATIS_FLOWER);
        this.dropFlower(ModBlocks.BLUE_STAR_FLOWER, ModBlocks.POTTED_BLUE_STAR_FLOWER);
        this.dropFlower(ModBlocks.SALVIA_FLOWER, ModBlocks.POTTED_SALVIA_FLOWER);
        this.dropFlower(ModBlocks.FALSE_INDIGO_FLOWER, ModBlocks.POTTED_FALSE_INDIGO_FLOWER);
        this.dropFlower(ModBlocks.WHITE_SAGE_FLOWER, ModBlocks.POTTED_WHITE_SAGE_FLOWER);
        this.dropFlower(ModBlocks.SILVER_SCHEHERAZADE_FLOWER, ModBlocks.POTTED_SILVER_SCHEHERAZADE_FLOWER);
        this.dropFlower(ModBlocks.SILVER_SPRING_FLOWER, ModBlocks.POTTED_SILVER_SPRING_FLOWER);
        this.dropFlower(ModBlocks.SILVER_SHADOWS_FLOWER, ModBlocks.POTTED_SILVER_SHADOWS_FLOWER);
        this.dropFlower(ModBlocks.GREEN_BALL_FLOWER, ModBlocks.POTTED_GREEN_BALL_FLOWER);
        this.dropFlower(ModBlocks.LIME_DAHLIA_FLOWER, ModBlocks.POTTED_LIME_DAHLIA_FLOWER);
        this.dropFlower(ModBlocks.HYDRANGEA_FLOWER, ModBlocks.POTTED_HYDRANGEA_FLOWER);
        this.dropFlower(ModBlocks.ZINNIA_FLOWER, ModBlocks.POTTED_ZINNIA_FLOWER);
        this.dropFlower(ModBlocks.BUTTERFLY_CANDY_FLOWER, ModBlocks.POTTED_BUTTERFLY_CANDY_FLOWER);
        this.dropFlower(ModBlocks.CABARET_FLOWER, ModBlocks.POTTED_CABARET_FLOWER);
        this.dropFlower(ModBlocks.DIANTHUS_FLOWER, ModBlocks.POTTED_DIANTHUS_FLOWER);
        this.dropFlower(ModBlocks.TITAN_CRANBERRY_VINCA_FLOWER, ModBlocks.POTTED_TITAN_CRANBERRY_VINCA_FLOWER);
        this.dropFlower(ModBlocks.ORANGE_ZINNIA_FLOWER, ModBlocks.POTTED_ORANGE_ZINNIA_FLOWER);
        this.dropFlower(ModBlocks.BEGONIA_FLOWER, ModBlocks.POTTED_BEGONIA_FLOWER);
        this.dropFlower(ModBlocks.CROWN_IMPERIAL_FLOWER, ModBlocks.POTTED_CROWN_IMPERIAL_FLOWER);
        this.dropFlower(ModBlocks.ORIENTAL_POPPY_FLOWER, ModBlocks.POTTED_ORIENTAL_POPPY_FLOWER);
        this.dropFlower(ModBlocks.AZALEA_FLOWER, ModBlocks.POTTED_AZALEA_FLOWER);
        this.dropFlower(ModBlocks.PINK_DELIGHT_FLOWER, ModBlocks.POTTED_PINK_DELIGHT_FLOWER);
        this.dropFlower(ModBlocks.CHRYSANTHEMUM_FLOWER, ModBlocks.POTTED_CHRYSANTHEMUM_FLOWER);
        this.dropFlower(ModBlocks.HIBISCUS_FLOWER, ModBlocks.POTTED_HIBISCUS_FLOWER);
        this.dropFlower(ModBlocks.CARDINAL_FLOWER, ModBlocks.POTTED_CARDINAL_FLOWER);
        this.dropFlower(ModBlocks.GERBERA_FLOWER, ModBlocks.POTTED_GERBERA_FLOWER);
        this.dropFlower(ModBlocks.RED_TULIP_FLOWER, ModBlocks.POTTED_RED_TULIP_FLOWER);
        this.dropFlower(ModBlocks.FREESIA_FLOWER, ModBlocks.POTTED_FREESIA_FLOWER);
        this.dropFlower(ModBlocks.GARDENIAS_FLOWER, ModBlocks.POTTED_GARDENIAS_FLOWER);
        this.dropFlower(ModBlocks.STAR_JASMINE_FLOWER, ModBlocks.POTTED_STAR_JASMINE_FLOWER);
        this.dropFlower(ModBlocks.WHITE_WARATAH_FLOWER, ModBlocks.POTTED_WHITE_WARATAH_FLOWER);
        this.dropFlower(ModBlocks.FLANNEL_FLOWER, ModBlocks.POTTED_FLANNEL_FLOWER);
        this.dropFlower(ModBlocks.BEARS_EARS_FLOWER, ModBlocks.POTTED_BEARS_EARS_FLOWER);
        this.dropFlower(ModBlocks.BIDENS_FLOWER, ModBlocks.POTTED_BIDENS_FLOWER);
        this.dropFlower(ModBlocks.BLANKET_FLOWER, ModBlocks.POTTED_BLANKET_FLOWER);
        this.dropFlower(ModBlocks.BULBINE_FLOWER, ModBlocks.POTTED_BULBINE_FLOWER);
        this.dropFlower(ModBlocks.SILVER_BRUNIA_FLOWER, ModBlocks.POTTED_SILVER_BRUNIA_FLOWER);
        this.dropFlower(ModBlocks.GRAY_ROSES_FLOWER, ModBlocks.POTTED_GRAY_ROSES_FLOWER);
        this.dropFlower(ModBlocks.MOON_CARROT_FLOWER, ModBlocks.POTTED_MOON_CARROT_FLOWER);
        this.dropFlower(ModBlocks.SILVER_BABY_FLOWER, ModBlocks.POTTED_SILVER_BABY_FLOWER);
        this.dropFlower(ModBlocks.LAVENDER_FLOWER, ModBlocks.POTTED_LAVENDER_FLOWER);
        this.dropFlower(ModBlocks.BELLFLOWER_FLOWER, ModBlocks.POTTED_BELLFLOWER_FLOWER);
        this.dropFlower(ModBlocks.LILAC_FLOWER, ModBlocks.POTTED_LILAC_FLOWER);
        this.dropFlower(ModBlocks.SWEET_PEA_FLOWER, ModBlocks.POTTED_SWEET_PEA_FLOWER);

        this.ore(ModBlocks.NETHER_STEEL_ORE, ModItems.RAW_NETHER_STEEL);
        this.ore(ModBlocks.DEEPSLATE_NETHER_STEEL_ORE, ModItems.RAW_NETHER_STEEL);

        this.ore(ModBlocks.ORICHALCUM_ORE, ModItems.RAW_ORICHALCUM);
        this.ore(ModBlocks.DEEPSLATE_ORICHALCUM_ORE, ModItems.RAW_ORICHALCUM);

        this.ore(ModBlocks.ZINC_ORE, ModItems.RAW_ZINC);
        this.ore(ModBlocks.DEEPSLATE_ZINC_ORE, ModItems.RAW_ZINC);

        this.ore(ModBlocks.TIN_ORE, ModItems.RAW_TIN);
        this.ore(ModBlocks.DEEPSLATE_TIN_ORE, ModItems.RAW_TIN);

        this.ore(ModBlocks.ADAMANT_ORE, ModItems.ADAMANT);
        this.ore(ModBlocks.DEEPSLATE_ADAMANT_ORE, ModItems.ADAMANT);

        this.crops(ModBlocks.POMEGRANATE_CROP_BLOCK, ModItems.POMEGRANATE, ModItems.POMEGRANATE_SEEDS, PomegranateCropBlock.AGE, PomegranateCropBlock.MAX_AGE);
        this.crops(ModBlocks.DURUM_WHEAT_CROP_BLOCK, ModItems.DURUM_WHEAT, ModItems.DURUM_WHEAT_SEEDS, DurumWheatCropBlock.AGE, DurumWheatCropBlock.MAX_AGE);
        this.crops(ModBlocks.TOMATO_CROP_BLOCK, ModItems.TOMATO, ModItems.TOMATO_SEEDS, TomatoCropBlock.AGE, TomatoCropBlock.MAX_AGE);
        this.wildCrops(ModBlocks.WILD_ONION_CROP_BLOCK, ModItems.WILD_ONION, 0.8f, ModItems.ONION_STAGE_1, OnionCropBlock.AGE, OnionCropBlock.MAX_AGE);
        this.wildCrops(ModBlocks.STAGE_1_ONION_CROP_BLOCK, ModItems.ONION_STAGE_1, 8f, ModItems.ONION_STAGE_2, OnionCropBlock.AGE, OnionCropBlock.MAX_AGE);
        this.wildCrops(ModBlocks.STAGE_2_ONION_CROP_BLOCK, ModItems.ONION_STAGE_2, 16f, ModItems.ONION_STAGE_3, OnionCropBlock.AGE, OnionCropBlock.MAX_AGE);
        this.wildCrops(ModBlocks.STAGE_3_ONION_CROP_BLOCK, ModItems.ONION_STAGE_3, 30f, ModItems.ONION, OnionCropBlock.AGE, OnionCropBlock.MAX_AGE);
        this.bolbCrops(ModBlocks.ONION_CROP_BLOCK, ModItems.ONION, OnionCropBlock.AGE, OnionCropBlock.MAX_AGE);
        this.crops(ModBlocks.DRAGON_FRUIT_CROP_BLOCK, ModItems.DRAGON_FRUIT, ModItems.DRAGON_FRUIT_SEEDS, DragonFruitCropBlock.AGE, DragonFruitCropBlock.MAX_AGE);
        this.crops(ModBlocks.CHILLI_CROP_BLOCK, ModItems.CHILLI, ModItems.CHILLI_SEEDS, ChilliCropBlock.AGE, ChilliCropBlock.MAX_AGE);

        this.dropSelf(ModBlocks.UNDERWORLD_DIRT);

        this.dropSelf(ModBlocks.ATLANTAS_WATER_REMOVER_BLOCK);

        this.dropSelf(ModBlocks.UNDERWORLD_PORTAL_FRAME);
        this.dropSelf(ModBlocks.NIDAVELLIR_PORTAL_FRAME);
        this.dropSelf(ModBlocks.ALFHEIMR_PORTAL_FRAME);
        this.dropSelf(ModBlocks.ATLANTIS_PORTAL_FRAME);
        this.dropSelf(ModBlocks.SKYOPIA_PORTAL_FRAME);
//        this.add(ModBlocks.UNDERWORLD_GRASS_BLOCK, (block -> createSingleItemTableWithSilkTouch(block, ModBlocks.UNDERWORLD_DIRT)));
//        this.dropOther(ModBlocks.UNDERWORLD_GRASS_BLOCK, ModBlocks.UNDERWORLD_DIRT);
//        this.dropWhenSilkTouch(ModBlocks.UNDERWORLD_GRASS_BLOCK);

        this.stone(ModBlocks.NIDAVELLIR_SOFT_STONE, ModBlocks.NIDAVELLIR_SOFT_COBBLESTONE);
        this.dropSelf(ModBlocks.NIDAVELLIR_SOFT_STONE_STAIRS);
        this.dropSelf(ModBlocks.NIDAVELLIR_SOFT_COBBLESTONE);
        this.dropSelf(ModBlocks.NIDAVELLIR_SOFT_COBBLESTONE_STAIRS);
        this.dropSelf(ModBlocks.NIDAVELLIR_SOFT_STONE_BRICKS);
        this.dropSelf(ModBlocks.NIDAVELLIR_SOFT_STONE_BRICKS_STAIRS);
        this.dropSelf(ModBlocks.NIDAVELLIR_SOFT_STONE_PRESSURE_PLATE);
        this.dropSelf(ModBlocks.NIDAVELLIR_SOFT_STONE_BUTTON);
        this.dropSelf(ModBlocks.NIDAVELLIR_SOFT_STONE_WALL);
        this.dropSelf(ModBlocks.NIDAVELLIR_SOFT_COBBLESTONE_WALL);
        this.dropSelf(ModBlocks.NIDAVELLIR_SOFT_SMOOTH_STONE);
        this.dropSelf(ModBlocks.NIDAVELLIR_SOFT_COBBLESTONE_MOSSY);
        this.dropSelf(ModBlocks.NIDAVELLIR_SOFT_STONE_BRICKS_MOSSY);
        this.dropSelf(ModBlocks.NIDAVELLIR_SOFT_STONE_BRICKS_CRACKED);
        this.dropSelf(ModBlocks.NIDAVELLIR_SOFT_STONE_BRICKS_CHISELED);
        this.dropSelf(ModBlocks.NIDAVELLIR_SOFT_STONE_BRICKS_WALL);
        this.slab(ModBlocks.NIDAVELLIR_SOFT_STONE_SLAB);
        this.slab(ModBlocks.NIDAVELLIR_SOFT_COBBLESTONE_SLAB);
        this.slab(ModBlocks.NIDAVELLIR_SOFT_STONE_BRICKS_SLAB);

        this.ore(ModBlocks.NIDAVELLIR_SOFT_STONE_IRON_ORE, Items.RAW_IRON);
        this.ore(ModBlocks.NIDAVELLIR_SOFT_STONE_GOLD_ORE, Items.RAW_GOLD);
        this.clusterOre(ModBlocks.NIDAVELLIR_SOFT_STONE_COPPER_ORE, Items.RAW_COPPER, 2.0f, 5.0f);
        this.ore(ModBlocks.NIDAVELLIR_SOFT_STONE_TIN_ORE, ModItems.RAW_TIN);
        this.ore(ModBlocks.NIDAVELLIR_SOFT_STONE_ZINC_ORE, ModItems.RAW_ZINC);
        this.ore(ModBlocks.NIDAVELLIR_SOFT_STONE_DIAMOND_ORE, Items.DIAMOND);
        this.ore(ModBlocks.NIDAVELLIR_SOFT_STONE_EMERALD_ORE, Items.EMERALD);
        this.ore(ModBlocks.NIDAVELLIR_SOFT_STONE_COAL_ORE, Items.COAL);
        this.clusterOre(ModBlocks.NIDAVELLIR_SOFT_STONE_REDSTONE_ORE, Items.REDSTONE, 4.0f, 5.0f);
        this.clusterOre(ModBlocks.NIDAVELLIR_SOFT_STONE_LAPIS_ORE, Items.LAPIS_LAZULI, 4.0f, 9.0f);
        this.clusterOre(ModBlocks.NIDAVELLIR_SOFT_STONE_AQUAMARINE_ORE, ModItems.AQUAMARINE, 4.0f, 9.0f);
        this.clusterOre(ModBlocks.NIDAVELLIR_SOFT_STONE_OPAL_ORE, ModItems.OPAL, 4.0f, 9.0f);
        this.clusterOre(ModBlocks.NIDAVELLIR_SOFT_STONE_RUBY_ORE, ModItems.RUBY, 4.0f, 9.0f);

        this.clusterOre(ModBlocks.NIDAVELLIR_SOFT_STONE_IRON_ORE_CLUSTER, Items.RAW_IRON, 4.0f, 6.0f);
        this.clusterOre(ModBlocks.NIDAVELLIR_SOFT_STONE_GOLD_ORE_CLUSTER, Items.RAW_GOLD, 4.0f, 6.0f);
        this.clusterOre(ModBlocks.NIDAVELLIR_SOFT_STONE_COPPER_ORE_CLUSTER, Items.RAW_COPPER, 6.0f, 12.0f);
        this.clusterOre(ModBlocks.NIDAVELLIR_SOFT_STONE_TIN_ORE_CLUSTER, ModItems.RAW_TIN, 4.0f, 6.0f);
        this.clusterOre(ModBlocks.NIDAVELLIR_SOFT_STONE_ZINC_ORE_CLUSTER, ModItems.RAW_ZINC, 4.0f,  6.0f);
        this.clusterOre(ModBlocks.NIDAVELLIR_SOFT_STONE_DIAMOND_ORE_CLUSTER, Items.DIAMOND, 4.0f, 6.0f);
        this.clusterOre(ModBlocks.NIDAVELLIR_SOFT_STONE_EMERALD_ORE_CLUSTER, Items.EMERALD, 4.0f, 6.0f);
        this.clusterOre(ModBlocks.NIDAVELLIR_SOFT_STONE_COAL_ORE_CLUSTER, Items.COAL, 4.0f, 6.0f);
        this.clusterOre(ModBlocks.NIDAVELLIR_SOFT_STONE_REDSTONE_ORE_CLUSTER, Items.REDSTONE, 7.0f, 16.0f);
        this.clusterOre(ModBlocks.NIDAVELLIR_SOFT_STONE_LAPIS_ORE_CLUSTER, Items.LAPIS_LAZULI, 8.0f, 18.0f);
        this.clusterOre(ModBlocks.NIDAVELLIR_SOFT_STONE_AQUAMARINE_ORE_CLUSTER, ModItems.AQUAMARINE, 8.0f, 18.0f);
        this.clusterOre(ModBlocks.NIDAVELLIR_SOFT_STONE_OPAL_ORE_CLUSTER, ModItems.OPAL, 8.0f, 18.0f);
        this.clusterOre(ModBlocks.NIDAVELLIR_SOFT_STONE_RUBY_ORE_CLUSTER, ModItems.RUBY, 8.0f, 18.0f);

        this.stone(ModBlocks.NIDAVELLIR_HARD_STONE, ModBlocks.NIDAVELLIR_HARD_COBBLESTONE);
        this.dropSelf(ModBlocks.NIDAVELLIR_HARD_STONE_STAIRS);
        this.dropSelf(ModBlocks.NIDAVELLIR_HARD_COBBLESTONE);
        this.dropSelf(ModBlocks.NIDAVELLIR_HARD_COBBLESTONE_STAIRS);
        this.dropSelf(ModBlocks.NIDAVELLIR_HARD_STONE_BRICKS);
        this.dropSelf(ModBlocks.NIDAVELLIR_HARD_STONE_BRICKS_STAIRS);
        this.dropSelf(ModBlocks.NIDAVELLIR_HARD_STONE_PRESSURE_PLATE);
        this.dropSelf(ModBlocks.NIDAVELLIR_HARD_STONE_BUTTON);
        this.dropSelf(ModBlocks.NIDAVELLIR_HARD_STONE_WALL);
        this.dropSelf(ModBlocks.NIDAVELLIR_HARD_COBBLESTONE_WALL);
        this.dropSelf(ModBlocks.NIDAVELLIR_HARD_SMOOTH_STONE);
        this.dropSelf(ModBlocks.NIDAVELLIR_HARD_COBBLESTONE_MOSSY);
        this.dropSelf(ModBlocks.NIDAVELLIR_HARD_STONE_BRICKS_MOSSY);
        this.dropSelf(ModBlocks.NIDAVELLIR_HARD_STONE_BRICKS_CRACKED);
        this.dropSelf(ModBlocks.NIDAVELLIR_HARD_STONE_BRICKS_CHISELED);
        this.dropSelf(ModBlocks.NIDAVELLIR_HARD_STONE_BRICKS_WALL);
        this.slab(ModBlocks.NIDAVELLIR_HARD_STONE_SLAB);
        this.slab(ModBlocks.NIDAVELLIR_HARD_COBBLESTONE_SLAB);
        this.slab(ModBlocks.NIDAVELLIR_HARD_STONE_BRICKS_SLAB);

        this.ore(ModBlocks.NIDAVELLIR_HARD_STONE_IRON_ORE, Items.RAW_IRON);
        this.ore(ModBlocks.NIDAVELLIR_HARD_STONE_GOLD_ORE, Items.RAW_GOLD);
        this.clusterOre(ModBlocks.NIDAVELLIR_HARD_STONE_COPPER_ORE, Items.RAW_COPPER, 2.0f, 5.0f);
        this.ore(ModBlocks.NIDAVELLIR_HARD_STONE_TIN_ORE, ModItems.RAW_TIN);
        this.ore(ModBlocks.NIDAVELLIR_HARD_STONE_ZINC_ORE, ModItems.RAW_ZINC);
        this.ore(ModBlocks.NIDAVELLIR_HARD_STONE_DIAMOND_ORE, Items.DIAMOND);
        this.ore(ModBlocks.NIDAVELLIR_HARD_STONE_EMERALD_ORE, Items.EMERALD);
        this.ore(ModBlocks.NIDAVELLIR_HARD_STONE_COAL_ORE, Items.COAL);
        this.clusterOre(ModBlocks.NIDAVELLIR_HARD_STONE_REDSTONE_ORE, Items.REDSTONE, 4.0f, 5.0f);
        this.clusterOre(ModBlocks.NIDAVELLIR_HARD_STONE_LAPIS_ORE, Items.LAPIS_LAZULI, 4.0f, 9.0f);
        this.clusterOre(ModBlocks.NIDAVELLIR_HARD_STONE_AQUAMARINE_ORE, ModItems.AQUAMARINE, 4.0f, 9.0f);
        this.clusterOre(ModBlocks.NIDAVELLIR_HARD_STONE_OPAL_ORE, ModItems.OPAL, 4.0f, 9.0f);
        this.clusterOre(ModBlocks.NIDAVELLIR_HARD_STONE_RUBY_ORE, ModItems.RUBY, 4.0f, 9.0f);

        this.clusterOre(ModBlocks.NIDAVELLIR_HARD_STONE_IRON_ORE_CLUSTER, Items.RAW_IRON, 4.0f, 6.0f);
        this.clusterOre(ModBlocks.NIDAVELLIR_HARD_STONE_GOLD_ORE_CLUSTER, Items.RAW_GOLD, 4.0f, 6.0f);
        this.clusterOre(ModBlocks.NIDAVELLIR_HARD_STONE_COPPER_ORE_CLUSTER, Items.RAW_COPPER, 6.0f, 12.0f);
        this.clusterOre(ModBlocks.NIDAVELLIR_HARD_STONE_TIN_ORE_CLUSTER, ModItems.RAW_TIN, 4.0f, 6.0f);
        this.clusterOre(ModBlocks.NIDAVELLIR_HARD_STONE_ZINC_ORE_CLUSTER, ModItems.RAW_ZINC, 4.0f, 6.0f);
        this.clusterOre(ModBlocks.NIDAVELLIR_HARD_STONE_DIAMOND_ORE_CLUSTER, Items.DIAMOND, 4.0f, 6.0f);
        this.clusterOre(ModBlocks.NIDAVELLIR_HARD_STONE_EMERALD_ORE_CLUSTER, Items.EMERALD, 4.0f, 6.0f);
        this.clusterOre(ModBlocks.NIDAVELLIR_HARD_STONE_COAL_ORE_CLUSTER, Items.COAL, 4.0f, 6.0f);
        this.clusterOre(ModBlocks.NIDAVELLIR_HARD_STONE_REDSTONE_ORE_CLUSTER, Items.REDSTONE, 7.0f, 16.0f);
        this.clusterOre(ModBlocks.NIDAVELLIR_HARD_STONE_LAPIS_ORE_CLUSTER, Items.LAPIS_LAZULI, 8.0f, 18.0f);
        this.clusterOre(ModBlocks.NIDAVELLIR_HARD_STONE_AQUAMARINE_ORE_CLUSTER, ModItems.AQUAMARINE, 8.0f, 18.0f);
        this.clusterOre(ModBlocks.NIDAVELLIR_HARD_STONE_OPAL_ORE_CLUSTER, ModItems.OPAL, 8.0f, 18.0f);
        this.clusterOre(ModBlocks.NIDAVELLIR_HARD_STONE_RUBY_ORE_CLUSTER, ModItems.RUBY, 8.0f, 18.0f);

        this.stone(ModBlocks.NIDAVELLIR_ENHANCED_STONE, ModBlocks.NIDAVELLIR_ENHANCED_COBBLESTONE);
        this.dropSelf(ModBlocks.NIDAVELLIR_ENHANCED_STONE_STAIRS);
        this.dropSelf(ModBlocks.NIDAVELLIR_ENHANCED_COBBLESTONE);
        this.dropSelf(ModBlocks.NIDAVELLIR_ENHANCED_COBBLESTONE_STAIRS);
        this.dropSelf(ModBlocks.NIDAVELLIR_ENHANCED_STONE_BRICKS);
        this.dropSelf(ModBlocks.NIDAVELLIR_ENHANCED_STONE_BRICKS_STAIRS);
        this.dropSelf(ModBlocks.NIDAVELLIR_ENHANCED_STONE_PRESSURE_PLATE);
        this.dropSelf(ModBlocks.NIDAVELLIR_ENHANCED_STONE_BUTTON);
        this.dropSelf(ModBlocks.NIDAVELLIR_ENHANCED_STONE_WALL);
        this.dropSelf(ModBlocks.NIDAVELLIR_ENHANCED_COBBLESTONE_WALL);
        this.dropSelf(ModBlocks.NIDAVELLIR_ENHANCED_SMOOTH_STONE);
        this.dropSelf(ModBlocks.NIDAVELLIR_ENHANCED_COBBLESTONE_MOSSY);
        this.dropSelf(ModBlocks.NIDAVELLIR_ENHANCED_STONE_BRICKS_MOSSY);
        this.dropSelf(ModBlocks.NIDAVELLIR_ENHANCED_STONE_BRICKS_CRACKED);
        this.dropSelf(ModBlocks.NIDAVELLIR_ENHANCED_STONE_BRICKS_CHISELED);
        this.dropSelf(ModBlocks.NIDAVELLIR_ENHANCED_STONE_BRICKS_WALL);
        this.slab(ModBlocks.NIDAVELLIR_ENHANCED_STONE_SLAB);
        this.slab(ModBlocks.NIDAVELLIR_ENHANCED_COBBLESTONE_SLAB);
        this.slab(ModBlocks.NIDAVELLIR_ENHANCED_STONE_BRICKS_SLAB);

        this.ore(ModBlocks.NIDAVELLIR_ENHANCED_STONE_IRON_ORE, Items.RAW_IRON);
        this.ore(ModBlocks.NIDAVELLIR_ENHANCED_STONE_GOLD_ORE, Items.RAW_GOLD);
        this.clusterOre(ModBlocks.NIDAVELLIR_ENHANCED_STONE_COPPER_ORE, Items.RAW_COPPER, 2.0f, 5.0f);
        this.ore(ModBlocks.NIDAVELLIR_ENHANCED_STONE_TIN_ORE, ModItems.RAW_TIN);
        this.ore(ModBlocks.NIDAVELLIR_ENHANCED_STONE_ZINC_ORE, ModItems.RAW_ZINC);
        this.ore(ModBlocks.NIDAVELLIR_ENHANCED_STONE_DIAMOND_ORE, Items.DIAMOND);
        this.ore(ModBlocks.NIDAVELLIR_ENHANCED_STONE_EMERALD_ORE, Items.EMERALD);
        this.ore(ModBlocks.NIDAVELLIR_ENHANCED_STONE_COAL_ORE, Items.COAL);
        this.clusterOre(ModBlocks.NIDAVELLIR_ENHANCED_STONE_REDSTONE_ORE, Items.REDSTONE, 4.0f, 5.0f);
        this.clusterOre(ModBlocks.NIDAVELLIR_ENHANCED_STONE_LAPIS_ORE, Items.LAPIS_LAZULI, 4.0f, 9.0f);
        this.clusterOre(ModBlocks.NIDAVELLIR_ENHANCED_STONE_AQUAMARINE_ORE, ModItems.AQUAMARINE, 4.0f, 9.0f);
        this.clusterOre(ModBlocks.NIDAVELLIR_ENHANCED_STONE_OPAL_ORE, ModItems.OPAL, 4.0f, 9.0f);
        this.clusterOre(ModBlocks.NIDAVELLIR_ENHANCED_STONE_RUBY_ORE, ModItems.RUBY, 4.0f, 9.0f);

        this.clusterOre(ModBlocks.NIDAVELLIR_ENHANCED_STONE_IRON_ORE_CLUSTER, Items.RAW_IRON, 4.0f, 6.0f);
        this.clusterOre(ModBlocks.NIDAVELLIR_ENHANCED_STONE_GOLD_ORE_CLUSTER, Items.RAW_GOLD, 4.0f, 6.0f);
        this.clusterOre(ModBlocks.NIDAVELLIR_ENHANCED_STONE_COPPER_ORE_CLUSTER, Items.RAW_COPPER, 6.0f, 12.0f);
        this.clusterOre(ModBlocks.NIDAVELLIR_ENHANCED_STONE_TIN_ORE_CLUSTER, ModItems.RAW_TIN, 4.0f, 6.0f);
        this.clusterOre(ModBlocks.NIDAVELLIR_ENHANCED_STONE_ZINC_ORE_CLUSTER, ModItems.RAW_ZINC, 4.0f, 6.0f);
        this.clusterOre(ModBlocks.NIDAVELLIR_ENHANCED_STONE_DIAMOND_ORE_CLUSTER, Items.DIAMOND, 4.0f, 6.0f);
        this.clusterOre(ModBlocks.NIDAVELLIR_ENHANCED_STONE_EMERALD_ORE_CLUSTER, Items.EMERALD, 4.0f, 6.0f);
        this.clusterOre(ModBlocks.NIDAVELLIR_ENHANCED_STONE_COAL_ORE_CLUSTER, Items.COAL, 4.0f, 6.0f);
        this.clusterOre(ModBlocks.NIDAVELLIR_ENHANCED_STONE_REDSTONE_ORE_CLUSTER, Items.REDSTONE, 7.0f, 16.0f);
        this.clusterOre(ModBlocks.NIDAVELLIR_ENHANCED_STONE_LAPIS_ORE_CLUSTER, Items.LAPIS_LAZULI, 8.0f, 18.0f);
        this.clusterOre(ModBlocks.NIDAVELLIR_ENHANCED_STONE_AQUAMARINE_ORE_CLUSTER, ModItems.AQUAMARINE, 18.0f, 9.0f);
        this.clusterOre(ModBlocks.NIDAVELLIR_ENHANCED_STONE_OPAL_ORE_CLUSTER, ModItems.OPAL, 8.0f, 18.0f);
        this.clusterOre(ModBlocks.NIDAVELLIR_ENHANCED_STONE_RUBY_ORE_CLUSTER, ModItems.RUBY, 8.0f, 18.0f);

        this.stone(ModBlocks.NIDAVELLIR_DEEPSLATE_STONE, ModBlocks.NIDAVELLIR_DEEPSLATE_COBBLESTONE);
        this.dropSelf(ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_STAIRS);
        this.dropSelf(ModBlocks.NIDAVELLIR_DEEPSLATE_COBBLESTONE);
        this.dropSelf(ModBlocks.NIDAVELLIR_DEEPSLATE_COBBLESTONE_STAIRS);
        this.dropSelf(ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_BRICKS);
        this.dropSelf(ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_BRICKS_STAIRS);
        this.dropSelf(ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_PRESSURE_PLATE);
        this.dropSelf(ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_BUTTON);
        this.dropSelf(ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_WALL);
        this.dropSelf(ModBlocks.NIDAVELLIR_DEEPSLATE_COBBLESTONE_WALL);
        this.dropSelf(ModBlocks.NIDAVELLIR_DEEPSLATE_SMOOTH_STONE);
        this.dropSelf(ModBlocks.NIDAVELLIR_DEEPSLATE_COBBLESTONE_MOSSY);
        this.dropSelf(ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_BRICKS_MOSSY);
        this.dropSelf(ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_BRICKS_CRACKED);
        this.dropSelf(ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_BRICKS_CHISELED);
        this.dropSelf(ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_BRICKS_WALL);
        this.slab(ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_SLAB);
        this.slab(ModBlocks.NIDAVELLIR_DEEPSLATE_COBBLESTONE_SLAB);
        this.slab(ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_BRICKS_SLAB);

        this.ore(ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_IRON_ORE, Items.RAW_IRON);
        this.ore(ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_GOLD_ORE, Items.RAW_GOLD);
        this.clusterOre(ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_COPPER_ORE, Items.RAW_COPPER, 2.0f, 5.0f);
        this.ore(ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_TIN_ORE, ModItems.RAW_TIN);
        this.ore(ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_ZINC_ORE, ModItems.RAW_ZINC);
        this.ore(ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_DIAMOND_ORE, Items.DIAMOND);
        this.ore(ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_EMERALD_ORE, Items.EMERALD);
        this.ore(ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_COAL_ORE, Items.COAL);
        this.clusterOre(ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_REDSTONE_ORE, Items.REDSTONE, 4.0f, 5.0f);
        this.clusterOre(ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_LAPIS_ORE, Items.LAPIS_LAZULI, 4.0f, 9.0f);
        this.clusterOre(ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_AQUAMARINE_ORE, ModItems.AQUAMARINE, 4.0f, 9.0f);
        this.clusterOre(ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_OPAL_ORE, ModItems.OPAL, 4.0f, 9.0f);
        this.clusterOre(ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_RUBY_ORE, ModItems.RUBY, 4.0f, 9.0f);

        this.clusterOre(ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_IRON_ORE_CLUSTER, Items.RAW_IRON, 4.0f, 6.0f);
        this.clusterOre(ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_GOLD_ORE_CLUSTER, Items.RAW_GOLD, 4.0f, 6.0f);
        this.clusterOre(ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_COPPER_ORE_CLUSTER, Items.RAW_COPPER, 6.0f, 12.0f);
        this.clusterOre(ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_TIN_ORE_CLUSTER, ModItems.RAW_TIN, 4.0f, 6.0f);
        this.clusterOre(ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_ZINC_ORE_CLUSTER, ModItems.RAW_ZINC, 4.0f, 6.0f);
        this.clusterOre(ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_DIAMOND_ORE_CLUSTER, Items.DIAMOND, 4.0f, 6.0f);
        this.clusterOre(ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_EMERALD_ORE_CLUSTER, Items.EMERALD, 4.0f, 6.0f);
        this.clusterOre(ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_COAL_ORE_CLUSTER, Items.COAL, 4.0f, 6.0f);
        this.clusterOre(ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_REDSTONE_ORE_CLUSTER, Items.REDSTONE, 7.0f, 16.0f);
        this.clusterOre(ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_LAPIS_ORE_CLUSTER, Items.LAPIS_LAZULI, 8.0f, 18.0f);
        this.clusterOre(ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_AQUAMARINE_ORE_CLUSTER, ModItems.AQUAMARINE, 8.0f, 18.0f);
        this.clusterOre(ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_OPAL_ORE_CLUSTER, ModItems.OPAL, 8.0f, 18.0f);
        this.clusterOre(ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_RUBY_ORE_CLUSTER, ModItems.RUBY, 8.0f, 18.0f);

        this.stone(ModBlocks.NIDAVELLIR_CRIMSON_STONE, ModBlocks.NIDAVELLIR_CRIMSON_COBBLESTONE);
        this.dropSelf(ModBlocks.NIDAVELLIR_CRIMSON_STONE_STAIRS);
        this.dropSelf(ModBlocks.NIDAVELLIR_CRIMSON_COBBLESTONE);
        this.dropSelf(ModBlocks.NIDAVELLIR_CRIMSON_COBBLESTONE_STAIRS);
        this.dropSelf(ModBlocks.NIDAVELLIR_CRIMSON_STONE_BRICKS);
        this.dropSelf(ModBlocks.NIDAVELLIR_CRIMSON_STONE_BRICKS_STAIRS);
        this.dropSelf(ModBlocks.NIDAVELLIR_CRIMSON_STONE_PRESSURE_PLATE);
        this.dropSelf(ModBlocks.NIDAVELLIR_CRIMSON_STONE_BUTTON);
        this.dropSelf(ModBlocks.NIDAVELLIR_CRIMSON_STONE_WALL);
        this.dropSelf(ModBlocks.NIDAVELLIR_CRIMSON_COBBLESTONE_WALL);
        this.dropSelf(ModBlocks.NIDAVELLIR_CRIMSON_SMOOTH_STONE);
        this.dropSelf(ModBlocks.NIDAVELLIR_CRIMSON_COBBLESTONE_MOSSY);
        this.dropSelf(ModBlocks.NIDAVELLIR_CRIMSON_STONE_BRICKS_MOSSY);
        this.dropSelf(ModBlocks.NIDAVELLIR_CRIMSON_STONE_BRICKS_CRACKED);
        this.dropSelf(ModBlocks.NIDAVELLIR_CRIMSON_STONE_BRICKS_CHISELED);
        this.dropSelf(ModBlocks.NIDAVELLIR_CRIMSON_STONE_BRICKS_WALL);
        this.slab(ModBlocks.NIDAVELLIR_CRIMSON_STONE_SLAB);
        this.slab(ModBlocks.NIDAVELLIR_CRIMSON_COBBLESTONE_SLAB);
        this.slab(ModBlocks.NIDAVELLIR_CRIMSON_STONE_BRICKS_SLAB);

        this.ore(ModBlocks.NIDAVELLIR_CRIMSON_STONE_IRON_ORE, Items.RAW_IRON);
        this.ore(ModBlocks.NIDAVELLIR_CRIMSON_STONE_GOLD_ORE, Items.RAW_GOLD);
        this.clusterOre(ModBlocks.NIDAVELLIR_CRIMSON_STONE_COPPER_ORE, Items.RAW_COPPER, 2.0f, 5.0f);
        this.ore(ModBlocks.NIDAVELLIR_CRIMSON_STONE_TIN_ORE, ModItems.RAW_TIN);
        this.ore(ModBlocks.NIDAVELLIR_CRIMSON_STONE_ZINC_ORE, ModItems.RAW_ZINC);
        this.ore(ModBlocks.NIDAVELLIR_CRIMSON_STONE_DIAMOND_ORE, Items.DIAMOND);
        this.ore(ModBlocks.NIDAVELLIR_CRIMSON_STONE_EMERALD_ORE, Items.EMERALD);
        this.ore(ModBlocks.NIDAVELLIR_CRIMSON_STONE_COAL_ORE, Items.COAL);
        this.clusterOre(ModBlocks.NIDAVELLIR_CRIMSON_STONE_REDSTONE_ORE, Items.REDSTONE, 4.0f, 5.0f);
        this.clusterOre(ModBlocks.NIDAVELLIR_CRIMSON_STONE_LAPIS_ORE, Items.LAPIS_LAZULI, 4.0f, 9.0f);
        this.clusterOre(ModBlocks.NIDAVELLIR_CRIMSON_STONE_AQUAMARINE_ORE, ModItems.AQUAMARINE, 4.0f, 9.0f);
        this.clusterOre(ModBlocks.NIDAVELLIR_CRIMSON_STONE_OPAL_ORE, ModItems.OPAL, 4.0f, 9.0f);
        this.clusterOre(ModBlocks.NIDAVELLIR_CRIMSON_STONE_RUBY_ORE, ModItems.RUBY, 4.0f, 9.0f);

        this.clusterOre(ModBlocks.NIDAVELLIR_CRIMSON_STONE_IRON_ORE_CLUSTER, Items.RAW_IRON, 4.0f, 6.0f);
        this.clusterOre(ModBlocks.NIDAVELLIR_CRIMSON_STONE_GOLD_ORE_CLUSTER, Items.RAW_GOLD, 4.0f, 6.0f);
        this.clusterOre(ModBlocks.NIDAVELLIR_CRIMSON_STONE_COPPER_ORE_CLUSTER, Items.RAW_COPPER, 6.0f, 12.0f);
        this.clusterOre(ModBlocks.NIDAVELLIR_CRIMSON_STONE_TIN_ORE_CLUSTER, ModItems.RAW_TIN, 4.0f, 6.0f);
        this.clusterOre(ModBlocks.NIDAVELLIR_CRIMSON_STONE_ZINC_ORE_CLUSTER, ModItems.RAW_ZINC, 4.0f, 6.0f);
        this.clusterOre(ModBlocks.NIDAVELLIR_CRIMSON_STONE_DIAMOND_ORE_CLUSTER, Items.DIAMOND, 4.0f, 6.0f);
        this.clusterOre(ModBlocks.NIDAVELLIR_CRIMSON_STONE_EMERALD_ORE_CLUSTER, Items.EMERALD, 4.0f, 6.0f);
        this.clusterOre(ModBlocks.NIDAVELLIR_CRIMSON_STONE_COAL_ORE_CLUSTER, Items.COAL, 4.0f, 6.0f);
        this.clusterOre(ModBlocks.NIDAVELLIR_CRIMSON_STONE_REDSTONE_ORE_CLUSTER, Items.REDSTONE, 7.0f, 16.0f);
        this.clusterOre(ModBlocks.NIDAVELLIR_CRIMSON_STONE_LAPIS_ORE_CLUSTER, Items.LAPIS_LAZULI, 8.0f, 18.0f);
        this.clusterOre(ModBlocks.NIDAVELLIR_CRIMSON_STONE_AQUAMARINE_ORE_CLUSTER, ModItems.AQUAMARINE, 8.0f, 18.0f);
        this.clusterOre(ModBlocks.NIDAVELLIR_CRIMSON_STONE_OPAL_ORE_CLUSTER, ModItems.OPAL, 8.0f, 18.0f);
        this.clusterOre(ModBlocks.NIDAVELLIR_CRIMSON_STONE_RUBY_ORE_CLUSTER, ModItems.RUBY, 8.0f, 18.0f);


        this.stone(ModBlocks.TARTARUS_STONE, ModBlocks.TARTARUS_STONE_COBBLESTONE);
        this.dropSelf(ModBlocks.TARTARUS_STONE_STAIRS);
        this.dropSelf(ModBlocks.TARTARUS_STONE_COBBLESTONE);
        this.dropSelf(ModBlocks.TARTARUS_STONE_COBBLESTONE_STAIRS);
        this.dropSelf(ModBlocks.TARTARUS_STONE_BRICKS);
        this.dropSelf(ModBlocks.TARTARUS_STONE_BRICKS_STAIRS);
        this.dropSelf(ModBlocks.TARTARUS_STONE_PRESSURE_PLATE);
        this.dropSelf(ModBlocks.TARTARUS_STONE_BUTTON);
        this.dropSelf(ModBlocks.TARTARUS_STONE_WALL);
        this.dropSelf(ModBlocks.TARTARUS_STONE_COBBLESTONE_WALL);
        this.dropSelf(ModBlocks.TARTARUS_STONE_SMOOTH_STONE);
        this.dropSelf(ModBlocks.TARTARUS_STONE_COBBLESTONE_MOSSY);
        this.dropSelf(ModBlocks.TARTARUS_STONE_BRICKS_MOSSY);
        this.dropSelf(ModBlocks.TARTARUS_STONE_BRICKS_CRACKED);
        this.dropSelf(ModBlocks.TARTARUS_STONE_BRICKS_CHISELED);
        this.dropSelf(ModBlocks.TARTARUS_STONE_BRICKS_WALL);
        this.slab(ModBlocks.TARTARUS_STONE_SLAB);
        this.slab(ModBlocks.TARTARUS_STONE_COBBLESTONE_SLAB);
        this.slab(ModBlocks.TARTARUS_STONE_BRICKS_SLAB);


        /*
         * TREES
        */
        //Elder Wood
        this.dropSelf(ModBlocks.ELDER_WOOD_LOG);
        this.dropSelf(ModBlocks.ELDER_WOOD);
        this.dropSelf(ModBlocks.STRIPPED_ELDER_WOOD_LOG);
        this.dropSelf(ModBlocks.STRIPPED_ELDER_WOOD);
        this.dropSelf(ModBlocks.ELDER_WOOD_SAPLING);
        this.dropSelf(ModBlocks.ELDER_WOOD_PLANKS);
        this.slab(ModBlocks.ELDER_WOOD_PLANKS_SLAB);
        this.dropSelf(ModBlocks.ELDER_WOOD_PLANKS_STAIRS);
        this.dropSelf(ModBlocks.ELDER_WOOD_PLANKS_PRESSURE_PLATE);
        this.door(ModBlocks.ELDER_WOOD_PLANKS_DOOR);
        this.dropSelf(ModBlocks.ELDER_WOOD_PLANKS_TRAPDOOR);
        this.dropSelf(ModBlocks.ELDER_WOOD_PLANKS_FENCE);
        this.dropSelf(ModBlocks.ELDER_WOOD_PLANKS_FENCE_GATE);
        this.dropSelf(ModBlocks.ELDER_WOOD_PLANKS_BUTTON);

        this.leaves(ModBlocks.ELDER_WOOD_LEAVES);

        this.sign(ModBlocks.ELDER_WOOD_PLANKS_SIGN, ModBlocks.ELDER_WOOD_PLANKS_WALL_SIGN, ModItems.ELDER_WOOD_SIGN);
        this.wall_sign(ModBlocks.ELDER_WOOD_PLANKS_HANGING_SIGN, ModBlocks.ELDER_WOOD_PLANKS_WALL_HANGING_SIGN, ModItems.ELDER_WOOD_HANGING_SIGN);

        //Olive
        this.dropSelf(ModBlocks.OLIVE_LOG);
        this.dropSelf(ModBlocks.OLIVE_WOOD);
        this.dropSelf(ModBlocks.STRIPPED_OLIVE_LOG);
        this.dropSelf(ModBlocks.STRIPPED_OLIVE_WOOD);
        this.dropSelf(ModBlocks.OLIVE_SAPLING);
        this.dropSelf(ModBlocks.OLIVE_PLANKS);
        this.slab(ModBlocks.OLIVE_PLANKS_SLAB);
        this.dropSelf(ModBlocks.OLIVE_PLANKS_STAIRS);
        this.dropSelf(ModBlocks.OLIVE_PLANKS_PRESSURE_PLATE);
        this.door(ModBlocks.OLIVE_PLANKS_DOOR);
        this.dropSelf(ModBlocks.OLIVE_PLANKS_TRAPDOOR);
        this.dropSelf(ModBlocks.OLIVE_PLANKS_FENCE);
        this.dropSelf(ModBlocks.OLIVE_PLANKS_FENCE_GATE);
        this.dropSelf(ModBlocks.OLIVE_PLANKS_BUTTON);

        this.leaves(ModBlocks.OLIVE_LEAVES);

        this.sign(ModBlocks.OLIVE_PLANKS_SIGN, ModBlocks.OLIVE_PLANKS_WALL_SIGN, ModItems.OLIVE_SIGN);
        this.wall_sign(ModBlocks.OLIVE_PLANKS_HANGING_SIGN, ModBlocks.OLIVE_PLANKS_WALL_HANGING_SIGN, ModItems.OLIVE_HANGING_SIGN);

        //Myrrh
        this.dropSelf(ModBlocks.MYRRH_LOG);
        this.dropSelf(ModBlocks.MYRRH_WOOD);
        this.dropSelf(ModBlocks.STRIPPED_MYRRH_LOG);
        this.dropSelf(ModBlocks.STRIPPED_MYRRH_WOOD);
        this.dropSelf(ModBlocks.MYRRH_SAPLING);
        this.dropSelf(ModBlocks.MYRRH_PLANKS);
        this.slab(ModBlocks.MYRRH_PLANKS_SLAB);
        this.dropSelf(ModBlocks.MYRRH_PLANKS_STAIRS);
        this.dropSelf(ModBlocks.MYRRH_PLANKS_PRESSURE_PLATE);
        this.door(ModBlocks.MYRRH_PLANKS_DOOR);
        this.dropSelf(ModBlocks.MYRRH_PLANKS_TRAPDOOR);
        this.dropSelf(ModBlocks.MYRRH_PLANKS_FENCE);
        this.dropSelf(ModBlocks.MYRRH_PLANKS_FENCE_GATE);
        this.dropSelf(ModBlocks.MYRRH_PLANKS_BUTTON);

        this.leaves(ModBlocks.MYRRH_LEAVES);

        this.sign(ModBlocks.MYRRH_PLANKS_SIGN, ModBlocks.MYRRH_PLANKS_WALL_SIGN, ModItems.MYRRH_SIGN);
        this.wall_sign(ModBlocks.MYRRH_PLANKS_HANGING_SIGN, ModBlocks.MYRRH_PLANKS_WALL_HANGING_SIGN, ModItems.MYRRH_HANGING_SIGN);

        //Laurel
        this.dropSelf(ModBlocks.LAUREL_LOG);
        this.dropSelf(ModBlocks.LAUREL_WOOD);
        this.dropSelf(ModBlocks.STRIPPED_LAUREL_LOG);
        this.dropSelf(ModBlocks.STRIPPED_LAUREL_WOOD);
        this.dropSelf(ModBlocks.LAUREL_SAPLING);
        this.dropSelf(ModBlocks.LAUREL_PLANKS);
        this.slab(ModBlocks.LAUREL_PLANKS_SLAB);
        this.dropSelf(ModBlocks.LAUREL_PLANKS_STAIRS);
        this.dropSelf(ModBlocks.LAUREL_PLANKS_PRESSURE_PLATE);
        this.door(ModBlocks.LAUREL_PLANKS_DOOR);
        this.dropSelf(ModBlocks.LAUREL_PLANKS_TRAPDOOR);
        this.dropSelf(ModBlocks.LAUREL_PLANKS_FENCE);
        this.dropSelf(ModBlocks.LAUREL_PLANKS_FENCE_GATE);
        this.dropSelf(ModBlocks.LAUREL_PLANKS_BUTTON);

        this.leaves(ModBlocks.LAUREL_LEAVES);

        this.sign(ModBlocks.LAUREL_PLANKS_SIGN, ModBlocks.LAUREL_PLANKS_WALL_SIGN, ModItems.LAUREL_SIGN);
        this.wall_sign(ModBlocks.LAUREL_PLANKS_HANGING_SIGN, ModBlocks.LAUREL_PLANKS_WALL_HANGING_SIGN, ModItems.LAUREL_HANGING_SIGN);

        //Cypress
        this.dropSelf(ModBlocks.CYPRESS_LOG);
        this.dropSelf(ModBlocks.CYPRESS_WOOD);
        this.dropSelf(ModBlocks.STRIPPED_CYPRESS_LOG);
        this.dropSelf(ModBlocks.STRIPPED_CYPRESS_WOOD);
        this.dropSelf(ModBlocks.CYPRESS_SAPLING);
        this.dropSelf(ModBlocks.CYPRESS_PLANKS);
        this.slab(ModBlocks.CYPRESS_PLANKS_SLAB);
        this.dropSelf(ModBlocks.CYPRESS_PLANKS_STAIRS);
        this.dropSelf(ModBlocks.CYPRESS_PLANKS_PRESSURE_PLATE);
        this.door(ModBlocks.CYPRESS_PLANKS_DOOR);
        this.dropSelf(ModBlocks.CYPRESS_PLANKS_TRAPDOOR);
        this.dropSelf(ModBlocks.CYPRESS_PLANKS_FENCE);
        this.dropSelf(ModBlocks.CYPRESS_PLANKS_FENCE_GATE);
        this.dropSelf(ModBlocks.CYPRESS_PLANKS_BUTTON);

        this.leaves(ModBlocks.CYPRESS_LEAVES);

        this.sign(ModBlocks.CYPRESS_PLANKS_SIGN, ModBlocks.CYPRESS_PLANKS_WALL_SIGN, ModItems.CYPRESS_SIGN);
        this.wall_sign(ModBlocks.CYPRESS_PLANKS_HANGING_SIGN, ModBlocks.CYPRESS_PLANKS_WALL_HANGING_SIGN, ModItems.CYPRESS_HANGING_SIGN);

        //Mushroom
        this.dropSelf(ModBlocks.POINT_MUSHROOM_BLOCK);
        this.dropOther(ModBlocks.POTTED_POINT_MUSHROOM_BLOCK, ModBlocks.POINT_MUSHROOM_BLOCK);
        this.dropOther(ModBlocks.TOP_POINT_MUSHROOM_BLOCK, ModBlocks.POINT_MUSHROOM_BLOCK);
        this.dropOther(ModBlocks.POINT_MUSHROOM_STEM_BLOCK, ModBlocks.POINT_MUSHROOM_BLOCK);

        this.dropSelf(ModBlocks.WITCHES_MUSHROOM_BLOCK);
        this.dropOther(ModBlocks.POTTED_WITCHES_MUSHROOM_BLOCK, ModBlocks.WITCHES_MUSHROOM_BLOCK);
        this.dropOther(ModBlocks.TOP_WITCHES_MUSHROOM_BLOCK, ModBlocks.WITCHES_MUSHROOM_BLOCK);
        this.dropOther(ModBlocks.WITCHES_MUSHROOM_STEM_BLOCK, ModBlocks.WITCHES_MUSHROOM_BLOCK);

        this.dropSelf(ModBlocks.ROYAL_BLUE_MUSHROOM_BLOCK);
        this.dropOther(ModBlocks.POTTED_ROYAL_BLUE_MUSHROOM_BLOCK, ModBlocks.ROYAL_BLUE_MUSHROOM_BLOCK);
        this.dropOther(ModBlocks.TOP_ROYAL_BLUE_MUSHROOM_BLOCK, ModBlocks.ROYAL_BLUE_MUSHROOM_BLOCK);
        this.dropOther(ModBlocks.ROYAL_BLUE_MUSHROOM_STEM_BLOCK, ModBlocks.ROYAL_BLUE_MUSHROOM_BLOCK);
        this.dropOther(ModBlocks.ROYAL_BLUE_MUSHROOM_GLOW_BLOCK, ModBlocks.ROYAL_BLUE_MUSHROOM_BLOCK);

        this.dropSelf(ModBlocks.SHORT_TOP_MUSHROOM_BLOCK);
        this.dropOther(ModBlocks.POTTED_SHORT_TOP_MUSHROOM_BLOCK, ModBlocks.SHORT_TOP_MUSHROOM_BLOCK);
        this.dropOther(ModBlocks.TOP_SHORT_TOP_MUSHROOM_BLOCK, ModBlocks.SHORT_TOP_MUSHROOM_BLOCK);
        this.dropOther(ModBlocks.SHORT_TOP_MUSHROOM_STEM_BLOCK, ModBlocks.SHORT_TOP_MUSHROOM_BLOCK);

        this.dropSelf(ModBlocks.SPECTRAL_MUSHROOM_BLOCK);
        this.dropOther(ModBlocks.POTTED_SPECTRAL_MUSHROOM_BLOCK, ModBlocks.SPECTRAL_MUSHROOM_BLOCK);
        this.dropOther(ModBlocks.TOP_SPECTRAL_MUSHROOM_BLOCK, ModBlocks.SPECTRAL_MUSHROOM_BLOCK);
        this.dropOther(ModBlocks.SPECTRAL_MUSHROOM_STEM_BLOCK, ModBlocks.SPECTRAL_MUSHROOM_BLOCK);

        this.dropSelf(ModBlocks.SHADE_MUSHROOM_BLOCK);
        this.dropOther(ModBlocks.POTTED_SHADE_MUSHROOM_BLOCK, ModBlocks.SHADE_MUSHROOM_BLOCK);
        this.dropOther(ModBlocks.SHADE_MUSHROOM_VINE_BLOCK, ModBlocks.SHADE_MUSHROOM_BLOCK);

        this.dropSelf(ModBlocks.CAP_MUSHROOM_BLOCK);
        this.dropOther(ModBlocks.POTTED_CAP_MUSHROOM_BLOCK, ModBlocks.CAP_MUSHROOM_BLOCK);
        this.dropOther(ModBlocks.CAP_MUSHROOM_VINE_BLOCK, ModBlocks.CAP_MUSHROOM_BLOCK);

        this.grassDrop(ModBlocks.ALFHEIMR_MAGIC_GRASS);
    }

    public void dropSelf(Supplier<? extends Block> block) {
        super.dropSelf(block.get());
    }

    public void dropFlower(Supplier<? extends Block> flower, Supplier<? extends Block> pots) {
        this.dropSelf(flower);
        this.pots(pots);
    }

    public void slab(Supplier<? extends Block> slab) {
        this.add(slab.get(), this::createSlabItemTable);
    }

    public void leaves(Supplier<? extends Block> leaves) {
        this.add(leaves.get(), block -> createLeavesDrops(block, leaves.get(), NORMAL_LEAVES_SAPLING_CHANCES));
    }

    public void door(Supplier<? extends Block> door) {
        this.add(door.get(), this::createDoorTable);
    }

    public void sign(Supplier<? extends Block> block_sign, Supplier<? extends Block> block_sign_wall, Supplier<? extends Item> item_sign) {
        this.add(block_sign.get(), block -> createSingleItemTable(item_sign.get()));
        this.add(block_sign_wall.get(), block -> createSingleItemTable(item_sign.get()));
    }

    public void wall_sign(Supplier<? extends Block> block_hanging_sign, Supplier<? extends Block> block_hanging_sign_wall, Supplier<? extends Item> item_hanging_sign) {
        this.add(block_hanging_sign.get(), block -> createSingleItemTable(item_hanging_sign.get()));
        this.add(block_hanging_sign_wall.get(), block -> createSingleItemTable(item_hanging_sign.get()));
    }

    public void crops(Supplier<? extends Block> crop_block, Supplier<? extends Item> fruit, Supplier<? extends Item> seeds, Property<Integer> property, int age) {
        LootItemCondition.Builder lootitemcondition$builder1 = LootItemBlockStatePropertyCondition.hasBlockStateProperties(crop_block.get()).setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(property, age));
        this.add(crop_block.get(), this.createCropDrops(crop_block.get(), fruit.get(), seeds.get(), lootitemcondition$builder1));

    }

    public void bolbCrops(Supplier<? extends Block> crop_block, Supplier<? extends Item> fruit, Property<Integer> property, int age) {
        LootItemCondition.Builder lootitemcondition$builder1 = LootItemBlockStatePropertyCondition.hasBlockStateProperties(crop_block.get()).setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(property, age));
        this.add(crop_block.get(), this.createBolbCropDrops(crop_block.get(), fruit.get(), lootitemcondition$builder1));

    }

    public void wildCrops(Supplier<? extends Block> crop_block, Supplier<? extends Item> wildFruit, float chance, Supplier<? extends Item> fruit, Property<Integer> property, int age) {
        LootItemCondition.Builder lootitemcondition$builder1 = LootItemBlockStatePropertyCondition.hasBlockStateProperties(crop_block.get()).setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(property, age));
        this.add(crop_block.get(), this.createWildCropDrops(crop_block.get(), wildFruit.get(), chance, fruit.get(), lootitemcondition$builder1));

    }

    protected LootTable.Builder createWildCropDrops(Block pCropBlock, Item pGrownWildCropItem, float chance, Item pGrownCropItem, LootItemCondition.Builder pDropGrownCropCondition) {
//        return this.applyExplosionDecay(
//                pCropBlock,
//                LootTable
//                        .lootTable().withPool(
//                                LootPool.lootPool().setRolls()
//                                        .add(
//                                                LootItem.lootTableItem(pGrownCropItem)
//                                                        .when(pDropGrownCropCondition)
//                                                        .otherwise(
//                                                                LootItem.lootTableItem(pGrownWildCropItem)
//                                                        )
//                                        )
//                        )
//        );

//        this.add(Blocks.POTATOES,
        return this.applyExplosionDecay(
                pCropBlock,
                LootTable.lootTable().withPool(
                        LootPool.lootPool()
                                .add(
                                        LootItem.lootTableItem(pGrownWildCropItem)
                                )
                        )
                        .withPool(
                                LootPool.lootPool()
                                        .when(
                                                pDropGrownCropCondition
                                        )
                                        .add(
                                                LootItem.lootTableItem(pGrownWildCropItem)
                                                        .apply(
                                                                ApplyBonusCount.addBonusBinomialDistributionCount(
                                                                        Enchantments.BLOCK_FORTUNE,
                                                                        0.5714286F,
                                                                        3
                                                                )
                                                        )
                                        )
                        ).withPool(
                                LootPool.lootPool()
                                        .when(pDropGrownCropCondition)
                                        .add(
                                                LootItem.lootTableItem(pGrownCropItem)
                                                        .when(LootItemRandomChanceCondition.randomChance(chance)
                                                        )
                                        )
                        )
        );

    }


    protected LootTable.Builder createBolbCropDrops(Block pCropBlock, Item pGrownCropItem, LootItemCondition.Builder pDropGrownCropCondition) {
        return this.applyExplosionDecay(
                pCropBlock,
                LootTable.lootTable().withPool(
                                LootPool.lootPool()
                                        .add(
                                                LootItem.lootTableItem(pGrownCropItem)
                                        )
                        )
                        .withPool(
                                LootPool.lootPool()
                                        .when(
                                                pDropGrownCropCondition
                                        )
                                        .add(
                                                LootItem.lootTableItem(pGrownCropItem)
                                                        .apply(
                                                                ApplyBonusCount.addBonusBinomialDistributionCount(
                                                                        Enchantments.BLOCK_FORTUNE,
                                                                        0.5714286F,
                                                                        3
                                                                )
                                                        )
                                        )
                        )
        );
    }

    private void grassDrop(Supplier<Block> grassBlock) {
        this.add(grassBlock.get(), BlockLootSubProvider::createShearsOnlyDrop);
    }

//    private static LootTable.Builder tallGrassDrop(Block originalBlock, Block newBlock) {
//        LootPoolEntryContainer.Builder<?> builder = LootItem.lootTableItem(newBlock).apply(SetItemCountFunction.setCount(ConstantValue.exactly(1))).when(SHEARS);
//        return LootTable.lootTable().withPool(LootPool.lootPool().add(builder).when(LootItemBlockStatePropertyCondition.hasBlockStateProperties(originalBlock).setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(DoublePlantBlock.HALF, DoubleBlockHalf.LOWER))).when(LocationCheck.checkLocation(LocationPredicate.Builder.location().setBlock(BlockPredicate.Builder.block().of(originalBlock).setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(DoublePlantBlock.HALF, DoubleBlockHalf.UPPER).build()).build()), new BlockPos(0, 1, 0)))).withPool(LootPool.lootPool().add(builder).when(LootItemBlockStatePropertyCondition.hasBlockStateProperties(originalBlock).setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(DoublePlantBlock.HALF, DoubleBlockHalf.UPPER))).when(LocationCheck.checkLocation(LocationPredicate.Builder.location().setBlock(BlockPredicate.Builder.block().of(originalBlock).setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(DoublePlantBlock.HALF, DoubleBlockHalf.LOWER).build()).build()), new BlockPos(0, -1, 0))));
//    }

    public void dropOther(Supplier<? extends Block> brokenBlock, ItemLike droppedBlock) {
        super.dropOther(brokenBlock.get(), droppedBlock);
    }

    public void dropOther(Supplier<? extends Block> brokenBlock, Supplier<? extends ItemLike> droppedBlock) {
        super.dropOther(brokenBlock.get(), droppedBlock.get());
    }

    public void dropAsSilk(Supplier<? extends Block> block) {
        super.dropWhenSilkTouch(block.get());
    }

    public void dropWithSilk(Supplier<? extends Block> block, Supplier<? extends ItemLike> drop) {
        add(block.get(), (result) -> createSingleItemTableWithSilkTouch(result, drop.get()));
    }

    public void ore(Supplier<? extends Block> block, Supplier<? extends Item> drop) {
        super.add(block.get(), (result) -> createOreDrop(result, drop.get()));
    }

    public void ore(Supplier<? extends Block> block, Item drop) {
        super.add(block.get(), (result) -> createOreDrop(result, drop));
    }

    public void stone(Supplier<? extends Block> stone, Supplier<? extends Block> cobblestone) {
        this.add(stone.get(), block -> createSingleItemTableWithSilkTouch(stone.get(), cobblestone.get()));
    }

    public void pots(Supplier<? extends Block> pottedFlower) {
        this.add(pottedFlower.get(), createPotFlowerItemTable(pottedFlower.get()));
    }

    public void clusterOre(Supplier<? extends Block> block, Item drop, float minDrop, float maxDrop) {
        this.add(block.get(), (ore) -> createSilkTouchDispatchTable(ore, applyExplosionDecay(ore, LootItem.lootTableItem(drop).apply(SetItemCountFunction.setCount(UniformGenerator.between(minDrop, maxDrop))).apply(ApplyBonusCount.addOreBonusCount(Enchantments.BLOCK_FORTUNE)))));
    }

    public void clusterOre(Supplier<? extends Block> block, Supplier<? extends Item> drop, float minDrop, float maxDrop) {
        this.add(block.get(), (ore) -> createSilkTouchDispatchTable(ore, applyExplosionDecay(ore, LootItem.lootTableItem(drop.get()).apply(SetItemCountFunction.setCount(UniformGenerator.between(minDrop, maxDrop))).apply(ApplyBonusCount.addOreBonusCount(Enchantments.BLOCK_FORTUNE)))));
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
