package net.sen.lostworlds.datagen.loottable;

import net.minecraft.advancements.critereon.ItemPredicate;
import net.minecraft.advancements.critereon.StatePropertiesPredicate;
import net.minecraft.core.registries.BuiltInRegistries;
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
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;
import net.minecraftforge.registries.ForgeRegistries;
import net.sen.lostworlds.LostWorldsApi;
import net.sen.lostworlds.block.*;
import net.sen.lostworlds.block.crops.*;
import net.sen.lostworlds.item.*;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class ModBlockLootTables extends BlockLootSubProvider {
    public final List<Iterable<Block>> blockList = new ArrayList<>();

    private static final LootItemCondition.Builder SHEARS = MatchTool.toolMatches(ItemPredicate.Builder.item().of(Items.SHEARS));

    public ModBlockLootTables() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {
        this.dropSelf(UnderworldBlocks.ORICHALCUM_BLOCK);
        this.dropSelf(ModBlocks.ZINC_BLOCK);
        this.dropSelf(ModBlocks.TIN_BLOCK);
        this.dropSelf(ModBlocks.AURICHALCITE_BLOCK);
        this.dropSelf(ModBlocks.BRASS_BLOCK);
        this.dropSelf(ModBlocks.BRONZE_BLOCK);
        this.dropSelf(UnderworldBlocks.RAW_ORICHALCUM_BLOCK);
        this.dropSelf(ModBlocks.RAW_ZINC_BLOCK);
        this.dropSelf(ModBlocks.RAW_TIN_BLOCK);
        this.dropSelf(ModBlocks.SOUND_BLOCK);
        this.dropSelf(ModBlocks.ALLOY_SMELTER);

        this.dropSelf(UnderworldBlocks.ADAMANT_BLOCK);

        this.dropFlower(UnderworldBlocks.IRIS_FLOWER, UnderworldBlocks.POTTED_IRIS_FLOWER);
        this.dropFlower(AlfheimrBlocks.DARK_BLOOM_FLOWER, AlfheimrBlocks.POTTED_DARK_BLOOM_FLOWER);
        this.dropFlower(AlfheimrBlocks.DREAD_NIGHT_FLOWER, AlfheimrBlocks.POTTED_DREAD_NIGIHT_FLOWER);
        this.dropFlower(AlfheimrBlocks.BLACK_LOTUS_FLOWER, AlfheimrBlocks.POTTED_BLACK_LOTUS_FLOWER);
        this.dropFlower(AlfheimrBlocks.NIGHT_ROSE_FLOWER, AlfheimrBlocks.POTTED_NIGHT_ROSE_FLOWER);
        this.dropFlower(AlfheimrBlocks.AQUA_ROSE_FLOWER, AlfheimrBlocks.POTTED_AQUA_ROSE_FLOWER);
        this.dropFlower(AlfheimrBlocks.MOON_FLOWER, AlfheimrBlocks.POTTED_MOON_FLOWER);
        this.dropFlower(AlfheimrBlocks.CATHERINE_FLOWER, AlfheimrBlocks.POTTED_CATHERINE_FLOWER);
        this.dropFlower(AlfheimrBlocks.TAINTED_ROSE_FLOWER, AlfheimrBlocks.POTTED_TAINTED_ROSE_FLOWER);
        this.dropFlower(AlfheimrBlocks.CINNAMON_ROSE_FLOWER, AlfheimrBlocks.POTTED_CINNAMON_ROSE_FLOWER);
        this.dropFlower(AlfheimrBlocks.BUTTERFLY_FLOWER, AlfheimrBlocks.POTTED_BUTTERFLY_FLOWER);
        this.dropFlower(AlfheimrBlocks.GAIA_TULIP_FLOWER, AlfheimrBlocks.POTTED_GAIA_TULIP_FLOWER);
        this.dropFlower(AlfheimrBlocks.BEARDED_IRIS_FLOWER, AlfheimrBlocks.POTTED_BEARDED_IRIS_FLOWER);
        this.dropFlower(AlfheimrBlocks.CORNFLOWER_FLOWER, AlfheimrBlocks.POTTED_CORNFLOWER_FLOWER);
        this.dropFlower(AlfheimrBlocks.MORNING_GLORY_FLOWER, AlfheimrBlocks.POTTED_MORNING_GLORY_FLOWER);
        this.dropFlower(AlfheimrBlocks.GEORGIA_BLUE_FLOWER, AlfheimrBlocks.POTTED_GEORGIA_BLUE_FLOWER);
        this.dropFlower(AlfheimrBlocks.BLUE_POPPY_FLOWER, AlfheimrBlocks.POTTED_BLUE_POPPY_FLOWER);
        this.dropFlower(AlfheimrBlocks.TULIP_FLOWER, AlfheimrBlocks.POTTED_TULIP_FLOWER);
        this.dropFlower(AlfheimrBlocks.CARNATION_FLOWER, AlfheimrBlocks.POTTED_CARNATION_FLOWER);
        this.dropFlower(AlfheimrBlocks.LADYS_MANTLE_FLOWER, AlfheimrBlocks.POTTED_LADYS_MANTLE_FLOWER);
        this.dropFlower(AlfheimrBlocks.GREEN_ROSE_FLOWER, AlfheimrBlocks.POTTED_GREEN_ROSE_FLOWER);
        this.dropFlower(AlfheimrBlocks.CLEMATIS_FLOWER, AlfheimrBlocks.POTTED_CLEMATIS_FLOWER);
        this.dropFlower(AlfheimrBlocks.BLUE_STAR_FLOWER, AlfheimrBlocks.POTTED_BLUE_STAR_FLOWER);
        this.dropFlower(AlfheimrBlocks.SALVIA_FLOWER, AlfheimrBlocks.POTTED_SALVIA_FLOWER);
        this.dropFlower(AlfheimrBlocks.FALSE_INDIGO_FLOWER, AlfheimrBlocks.POTTED_FALSE_INDIGO_FLOWER);
        this.dropFlower(AlfheimrBlocks.WHITE_SAGE_FLOWER, AlfheimrBlocks.POTTED_WHITE_SAGE_FLOWER);
        this.dropFlower(AlfheimrBlocks.SILVER_SCHEHERAZADE_FLOWER, AlfheimrBlocks.POTTED_SILVER_SCHEHERAZADE_FLOWER);
        this.dropFlower(AlfheimrBlocks.SILVER_SPRING_FLOWER, AlfheimrBlocks.POTTED_SILVER_SPRING_FLOWER);
        this.dropFlower(AlfheimrBlocks.SILVER_SHADOWS_FLOWER, AlfheimrBlocks.POTTED_SILVER_SHADOWS_FLOWER);
        this.dropFlower(AlfheimrBlocks.GREEN_BALL_FLOWER, AlfheimrBlocks.POTTED_GREEN_BALL_FLOWER);
        this.dropFlower(AlfheimrBlocks.LIME_DAHLIA_FLOWER, AlfheimrBlocks.POTTED_LIME_DAHLIA_FLOWER);
        this.dropFlower(AlfheimrBlocks.HYDRANGEA_FLOWER, AlfheimrBlocks.POTTED_HYDRANGEA_FLOWER);
        this.dropFlower(AlfheimrBlocks.ZINNIA_FLOWER, AlfheimrBlocks.POTTED_ZINNIA_FLOWER);
        this.dropFlower(AlfheimrBlocks.BUTTERFLY_CANDY_FLOWER, AlfheimrBlocks.POTTED_BUTTERFLY_CANDY_FLOWER);
        this.dropFlower(AlfheimrBlocks.CABARET_FLOWER, AlfheimrBlocks.POTTED_CABARET_FLOWER);
        this.dropFlower(AlfheimrBlocks.DIANTHUS_FLOWER, AlfheimrBlocks.POTTED_DIANTHUS_FLOWER);
        this.dropFlower(AlfheimrBlocks.TITAN_CRANBERRY_VINCA_FLOWER, AlfheimrBlocks.POTTED_TITAN_CRANBERRY_VINCA_FLOWER);
        this.dropFlower(AlfheimrBlocks.ORANGE_ZINNIA_FLOWER, AlfheimrBlocks.POTTED_ORANGE_ZINNIA_FLOWER);
        this.dropFlower(AlfheimrBlocks.BEGONIA_FLOWER, AlfheimrBlocks.POTTED_BEGONIA_FLOWER);
        this.dropFlower(AlfheimrBlocks.CROWN_IMPERIAL_FLOWER, AlfheimrBlocks.POTTED_CROWN_IMPERIAL_FLOWER);
        this.dropFlower(AlfheimrBlocks.ORIENTAL_POPPY_FLOWER, AlfheimrBlocks.POTTED_ORIENTAL_POPPY_FLOWER);
        this.dropFlower(AlfheimrBlocks.AZALEA_FLOWER, AlfheimrBlocks.POTTED_AZALEA_FLOWER);
        this.dropFlower(AlfheimrBlocks.PINK_DELIGHT_FLOWER, AlfheimrBlocks.POTTED_PINK_DELIGHT_FLOWER);
        this.dropFlower(AlfheimrBlocks.CHRYSANTHEMUM_FLOWER, AlfheimrBlocks.POTTED_CHRYSANTHEMUM_FLOWER);
        this.dropFlower(AlfheimrBlocks.HIBISCUS_FLOWER, AlfheimrBlocks.POTTED_HIBISCUS_FLOWER);
        this.dropFlower(AlfheimrBlocks.CARDINAL_FLOWER, AlfheimrBlocks.POTTED_CARDINAL_FLOWER);
        this.dropFlower(AlfheimrBlocks.GERBERA_FLOWER, AlfheimrBlocks.POTTED_GERBERA_FLOWER);
        this.dropFlower(AlfheimrBlocks.RED_TULIP_FLOWER, AlfheimrBlocks.POTTED_RED_TULIP_FLOWER);
        this.dropFlower(AlfheimrBlocks.FREESIA_FLOWER, AlfheimrBlocks.POTTED_FREESIA_FLOWER);
        this.dropFlower(AlfheimrBlocks.GARDENIAS_FLOWER, AlfheimrBlocks.POTTED_GARDENIAS_FLOWER);
        this.dropFlower(AlfheimrBlocks.STAR_JASMINE_FLOWER, AlfheimrBlocks.POTTED_STAR_JASMINE_FLOWER);
        this.dropFlower(AlfheimrBlocks.WHITE_WARATAH_FLOWER, AlfheimrBlocks.POTTED_WHITE_WARATAH_FLOWER);
        this.dropFlower(AlfheimrBlocks.FLANNEL_FLOWER, AlfheimrBlocks.POTTED_FLANNEL_FLOWER);
        this.dropFlower(AlfheimrBlocks.BEARS_EARS_FLOWER, AlfheimrBlocks.POTTED_BEARS_EARS_FLOWER);
        this.dropFlower(AlfheimrBlocks.BIDENS_FLOWER, AlfheimrBlocks.POTTED_BIDENS_FLOWER);
        this.dropFlower(AlfheimrBlocks.BLANKET_FLOWER, AlfheimrBlocks.POTTED_BLANKET_FLOWER);
        this.dropFlower(AlfheimrBlocks.BULBINE_FLOWER, AlfheimrBlocks.POTTED_BULBINE_FLOWER);
        this.dropFlower(AlfheimrBlocks.SILVER_BRUNIA_FLOWER, AlfheimrBlocks.POTTED_SILVER_BRUNIA_FLOWER);
        this.dropFlower(AlfheimrBlocks.GRAY_ROSES_FLOWER, AlfheimrBlocks.POTTED_GRAY_ROSES_FLOWER);
        this.dropFlower(AlfheimrBlocks.MOON_CARROT_FLOWER, AlfheimrBlocks.POTTED_MOON_CARROT_FLOWER);
        this.dropFlower(AlfheimrBlocks.SILVER_BABY_FLOWER, AlfheimrBlocks.POTTED_SILVER_BABY_FLOWER);
        this.dropFlower(AlfheimrBlocks.LAVENDER_FLOWER, AlfheimrBlocks.POTTED_LAVENDER_FLOWER);
        this.dropFlower(AlfheimrBlocks.BELLFLOWER_FLOWER, AlfheimrBlocks.POTTED_BELLFLOWER_FLOWER);
        this.dropFlower(AlfheimrBlocks.LILAC_FLOWER, AlfheimrBlocks.POTTED_LILAC_FLOWER);
        this.dropFlower(AlfheimrBlocks.SWEET_PEA_FLOWER, AlfheimrBlocks.POTTED_SWEET_PEA_FLOWER);

        this.dropSelf(AlfheimrBlocks.DRUID_RITUAL_STONE);

        this.ore(UnderworldBlocks.ORICHALCUM_ORE, UnderworldItems.RAW_ORICHALCUM);
        this.ore(UnderworldBlocks.DEEPSLATE_ORICHALCUM_ORE, UnderworldItems.RAW_ORICHALCUM);

        this.ore(ModBlocks.ZINC_ORE, ModItems.RAW_ZINC);
        this.ore(ModBlocks.DEEPSLATE_ZINC_ORE, ModItems.RAW_ZINC);

        this.ore(ModBlocks.TIN_ORE, ModItems.RAW_TIN);
        this.ore(ModBlocks.DEEPSLATE_TIN_ORE, ModItems.RAW_TIN);

        this.ore(UnderworldBlocks.ADAMANT_ORE, UnderworldItems.ADAMANT);
        this.ore(UnderworldBlocks.DEEPSLATE_ADAMANT_ORE, UnderworldItems.ADAMANT);

        this.crops(UnderworldBlocks.POMEGRANATE_CROP_BLOCK, UnderworldItems.POMEGRANATE, UnderworldItems.POMEGRANATE_SEEDS, PomegranateCropBlock.AGE, PomegranateCropBlock.MAX_AGE);
        this.crops(AlfheimrBlocks.DURUM_WHEAT_CROP_BLOCK, AlfheimrItems.DURUM_WHEAT, AlfheimrItems.DURUM_WHEAT_SEEDS, DurumWheatCropBlock.AGE, DurumWheatCropBlock.MAX_AGE);
        this.crops(AlfheimrBlocks.TOMATO_CROP_BLOCK, AlfheimrItems.TOMATO, AlfheimrItems.TOMATO_SEEDS, TomatoCropBlock.AGE, TomatoCropBlock.MAX_AGE);
        this.wildCrops(AlfheimrBlocks.WILD_ONION_CROP_BLOCK, AlfheimrItems.WILD_ONION, 0.8f, AlfheimrItems.ONION_STAGE_1, OnionCropBlock.AGE, OnionCropBlock.MAX_AGE);
        this.wildCrops(AlfheimrBlocks.STAGE_1_ONION_CROP_BLOCK, AlfheimrItems.ONION_STAGE_1, 8f, AlfheimrItems.ONION_STAGE_2, OnionCropBlock.AGE, OnionCropBlock.MAX_AGE);
        this.wildCrops(AlfheimrBlocks.STAGE_2_ONION_CROP_BLOCK, AlfheimrItems.ONION_STAGE_2, 16f, AlfheimrItems.ONION_STAGE_3, OnionCropBlock.AGE, OnionCropBlock.MAX_AGE);
        this.wildCrops(AlfheimrBlocks.STAGE_3_ONION_CROP_BLOCK, AlfheimrItems.ONION_STAGE_3, 30f, AlfheimrItems.ONION, OnionCropBlock.AGE, OnionCropBlock.MAX_AGE);
        this.bulbCrops(AlfheimrBlocks.ONION_CROP_BLOCK, AlfheimrItems.ONION, OnionCropBlock.AGE, OnionCropBlock.MAX_AGE);
        this.crops(AlfheimrBlocks.DRAGON_FRUIT_CROP_BLOCK, AlfheimrItems.DRAGON_FRUIT, AlfheimrItems.DRAGON_FRUIT_SEEDS, DragonFruitCropBlock.AGE, DragonFruitCropBlock.MAX_AGE);
        this.crops(AlfheimrBlocks.CHILLI_CROP_BLOCK, AlfheimrItems.CHILLI, AlfheimrItems.CHILLI_SEEDS, ChilliCropBlock.AGE, ChilliCropBlock.MAX_AGE);

        this.dropSelf(UnderworldBlocks.UNDERWORLD_DIRT);

        this.dropSelf(AtlantisBlocks.ATLANTAS_WATER_REMOVER_BLOCK);

        this.dropSelf(UnderworldBlocks.UNDERWORLD_PORTAL_FRAME);
        this.dropSelf(NidavellirBlocks.NIDAVELLIR_PORTAL_FRAME);
        this.dropSelf(AlfheimrBlocks.ALFHEIMR_PORTAL_FRAME);
        this.dropSelf(AtlantisBlocks.ATLANTIS_PORTAL_FRAME);
        this.dropSelf(SkyopiaBlocks.SKYOPIA_PORTAL_FRAME);
        this.dropSelf(ModBlocks.MYSTIC_GATEWAYS_PORTAL_FRAME);
        this.dropSelf(ModBlocks.MYSTIC_GATEWAYS_PORTAL_CONTROLLER);
//        this.add(ModBlocks.UNDERWORLD_GRASS_BLOCK, (block -> createSingleItemTableWithSilkTouch(block, ModBlocks.UNDERWORLD_DIRT)));
//        this.dropOther(ModBlocks.UNDERWORLD_GRASS_BLOCK, ModBlocks.UNDERWORLD_DIRT);
//        this.dropWhenSilkTouch(ModBlocks.UNDERWORLD_GRASS_BLOCK);

        this.stone(NidavellirBlocks.NIDAVELLIR_SOFT_STONE, NidavellirBlocks.NIDAVELLIR_SOFT_COBBLESTONE);
        this.dropSelf(NidavellirBlocks.NIDAVELLIR_SOFT_STONE_STAIRS);
        this.dropSelf(NidavellirBlocks.NIDAVELLIR_SOFT_COBBLESTONE);
        this.dropSelf(NidavellirBlocks.NIDAVELLIR_SOFT_COBBLESTONE_STAIRS);
        this.dropSelf(NidavellirBlocks.NIDAVELLIR_SOFT_STONE_BRICKS);
        this.dropSelf(NidavellirBlocks.NIDAVELLIR_SOFT_STONE_BRICKS_STAIRS);
        this.dropSelf(NidavellirBlocks.NIDAVELLIR_SOFT_STONE_PRESSURE_PLATE);
        this.dropSelf(NidavellirBlocks.NIDAVELLIR_SOFT_STONE_BUTTON);
        this.dropSelf(NidavellirBlocks.NIDAVELLIR_SOFT_STONE_WALL);
        this.dropSelf(NidavellirBlocks.NIDAVELLIR_SOFT_COBBLESTONE_WALL);
        this.dropSelf(NidavellirBlocks.NIDAVELLIR_SOFT_SMOOTH_STONE);
        this.dropSelf(NidavellirBlocks.NIDAVELLIR_SOFT_COBBLESTONE_MOSSY);
        this.dropSelf(NidavellirBlocks.NIDAVELLIR_SOFT_STONE_BRICKS_MOSSY);
        this.dropSelf(NidavellirBlocks.NIDAVELLIR_SOFT_STONE_BRICKS_CRACKED);
        this.dropSelf(NidavellirBlocks.NIDAVELLIR_SOFT_STONE_BRICKS_CHISELED);
        this.dropSelf(NidavellirBlocks.NIDAVELLIR_SOFT_STONE_BRICKS_WALL);
        this.slab(NidavellirBlocks.NIDAVELLIR_SOFT_STONE_SLAB);
        this.slab(NidavellirBlocks.NIDAVELLIR_SOFT_COBBLESTONE_SLAB);
        this.slab(NidavellirBlocks.NIDAVELLIR_SOFT_STONE_BRICKS_SLAB);

        this.ore(NidavellirBlocks.NIDAVELLIR_SOFT_STONE_IRON_ORE, Items.RAW_IRON);
        this.ore(NidavellirBlocks.NIDAVELLIR_SOFT_STONE_GOLD_ORE, Items.RAW_GOLD);
        this.clusterOre(NidavellirBlocks.NIDAVELLIR_SOFT_STONE_COPPER_ORE, Items.RAW_COPPER, 2.0f, 5.0f);
        this.ore(NidavellirBlocks.NIDAVELLIR_SOFT_STONE_TIN_ORE, ModItems.RAW_TIN);
        this.ore(NidavellirBlocks.NIDAVELLIR_SOFT_STONE_ZINC_ORE, ModItems.RAW_ZINC);
        this.ore(NidavellirBlocks.NIDAVELLIR_SOFT_STONE_DIAMOND_ORE, Items.DIAMOND);
        this.ore(NidavellirBlocks.NIDAVELLIR_SOFT_STONE_EMERALD_ORE, Items.EMERALD);
        this.ore(NidavellirBlocks.NIDAVELLIR_SOFT_STONE_COAL_ORE, Items.COAL);
        this.clusterOre(NidavellirBlocks.NIDAVELLIR_SOFT_STONE_REDSTONE_ORE, Items.REDSTONE, 4.0f, 5.0f);
        this.clusterOre(NidavellirBlocks.NIDAVELLIR_SOFT_STONE_LAPIS_ORE, Items.LAPIS_LAZULI, 4.0f, 9.0f);
        this.clusterOre(NidavellirBlocks.NIDAVELLIR_SOFT_STONE_AQUAMARINE_ORE, ModItems.AQUAMARINE, 4.0f, 9.0f);
        this.clusterOre(NidavellirBlocks.NIDAVELLIR_SOFT_STONE_OPAL_ORE, ModItems.OPAL, 4.0f, 9.0f);
        this.clusterOre(NidavellirBlocks.NIDAVELLIR_SOFT_STONE_RUBY_ORE, ModItems.RUBY, 4.0f, 9.0f);

        this.clusterOre(NidavellirBlocks.NIDAVELLIR_SOFT_STONE_IRON_ORE_CLUSTER, Items.RAW_IRON, 4.0f, 6.0f);
        this.clusterOre(NidavellirBlocks.NIDAVELLIR_SOFT_STONE_GOLD_ORE_CLUSTER, Items.RAW_GOLD, 4.0f, 6.0f);
        this.clusterOre(NidavellirBlocks.NIDAVELLIR_SOFT_STONE_COPPER_ORE_CLUSTER, Items.RAW_COPPER, 6.0f, 12.0f);
        this.clusterOre(NidavellirBlocks.NIDAVELLIR_SOFT_STONE_TIN_ORE_CLUSTER, ModItems.RAW_TIN, 4.0f, 6.0f);
        this.clusterOre(NidavellirBlocks.NIDAVELLIR_SOFT_STONE_ZINC_ORE_CLUSTER, ModItems.RAW_ZINC, 4.0f,  6.0f);
        this.clusterOre(NidavellirBlocks.NIDAVELLIR_SOFT_STONE_DIAMOND_ORE_CLUSTER, Items.DIAMOND, 4.0f, 6.0f);
        this.clusterOre(NidavellirBlocks.NIDAVELLIR_SOFT_STONE_EMERALD_ORE_CLUSTER, Items.EMERALD, 4.0f, 6.0f);
        this.clusterOre(NidavellirBlocks.NIDAVELLIR_SOFT_STONE_COAL_ORE_CLUSTER, Items.COAL, 4.0f, 6.0f);
        this.clusterOre(NidavellirBlocks.NIDAVELLIR_SOFT_STONE_REDSTONE_ORE_CLUSTER, Items.REDSTONE, 7.0f, 16.0f);
        this.clusterOre(NidavellirBlocks.NIDAVELLIR_SOFT_STONE_LAPIS_ORE_CLUSTER, Items.LAPIS_LAZULI, 8.0f, 18.0f);
        this.clusterOre(NidavellirBlocks.NIDAVELLIR_SOFT_STONE_AQUAMARINE_ORE_CLUSTER, ModItems.AQUAMARINE, 8.0f, 18.0f);
        this.clusterOre(NidavellirBlocks.NIDAVELLIR_SOFT_STONE_OPAL_ORE_CLUSTER, ModItems.OPAL, 8.0f, 18.0f);
        this.clusterOre(NidavellirBlocks.NIDAVELLIR_SOFT_STONE_RUBY_ORE_CLUSTER, ModItems.RUBY, 8.0f, 18.0f);

        this.stone(NidavellirBlocks.NIDAVELLIR_HARD_STONE, NidavellirBlocks.NIDAVELLIR_HARD_COBBLESTONE);
        this.dropSelf(NidavellirBlocks.NIDAVELLIR_HARD_STONE_STAIRS);
        this.dropSelf(NidavellirBlocks.NIDAVELLIR_HARD_COBBLESTONE);
        this.dropSelf(NidavellirBlocks.NIDAVELLIR_HARD_COBBLESTONE_STAIRS);
        this.dropSelf(NidavellirBlocks.NIDAVELLIR_HARD_STONE_BRICKS);
        this.dropSelf(NidavellirBlocks.NIDAVELLIR_HARD_STONE_BRICKS_STAIRS);
        this.dropSelf(NidavellirBlocks.NIDAVELLIR_HARD_STONE_PRESSURE_PLATE);
        this.dropSelf(NidavellirBlocks.NIDAVELLIR_HARD_STONE_BUTTON);
        this.dropSelf(NidavellirBlocks.NIDAVELLIR_HARD_STONE_WALL);
        this.dropSelf(NidavellirBlocks.NIDAVELLIR_HARD_COBBLESTONE_WALL);
        this.dropSelf(NidavellirBlocks.NIDAVELLIR_HARD_SMOOTH_STONE);
        this.dropSelf(NidavellirBlocks.NIDAVELLIR_HARD_COBBLESTONE_MOSSY);
        this.dropSelf(NidavellirBlocks.NIDAVELLIR_HARD_STONE_BRICKS_MOSSY);
        this.dropSelf(NidavellirBlocks.NIDAVELLIR_HARD_STONE_BRICKS_CRACKED);
        this.dropSelf(NidavellirBlocks.NIDAVELLIR_HARD_STONE_BRICKS_CHISELED);
        this.dropSelf(NidavellirBlocks.NIDAVELLIR_HARD_STONE_BRICKS_WALL);
        this.slab(NidavellirBlocks.NIDAVELLIR_HARD_STONE_SLAB);
        this.slab(NidavellirBlocks.NIDAVELLIR_HARD_COBBLESTONE_SLAB);
        this.slab(NidavellirBlocks.NIDAVELLIR_HARD_STONE_BRICKS_SLAB);

        this.ore(NidavellirBlocks.NIDAVELLIR_HARD_STONE_IRON_ORE, Items.RAW_IRON);
        this.ore(NidavellirBlocks.NIDAVELLIR_HARD_STONE_GOLD_ORE, Items.RAW_GOLD);
        this.clusterOre(NidavellirBlocks.NIDAVELLIR_HARD_STONE_COPPER_ORE, Items.RAW_COPPER, 2.0f, 5.0f);
        this.ore(NidavellirBlocks.NIDAVELLIR_HARD_STONE_TIN_ORE, ModItems.RAW_TIN);
        this.ore(NidavellirBlocks.NIDAVELLIR_HARD_STONE_ZINC_ORE, ModItems.RAW_ZINC);
        this.ore(NidavellirBlocks.NIDAVELLIR_HARD_STONE_DIAMOND_ORE, Items.DIAMOND);
        this.ore(NidavellirBlocks.NIDAVELLIR_HARD_STONE_EMERALD_ORE, Items.EMERALD);
        this.ore(NidavellirBlocks.NIDAVELLIR_HARD_STONE_COAL_ORE, Items.COAL);
        this.clusterOre(NidavellirBlocks.NIDAVELLIR_HARD_STONE_REDSTONE_ORE, Items.REDSTONE, 4.0f, 5.0f);
        this.clusterOre(NidavellirBlocks.NIDAVELLIR_HARD_STONE_LAPIS_ORE, Items.LAPIS_LAZULI, 4.0f, 9.0f);
        this.clusterOre(NidavellirBlocks.NIDAVELLIR_HARD_STONE_AQUAMARINE_ORE, ModItems.AQUAMARINE, 4.0f, 9.0f);
        this.clusterOre(NidavellirBlocks.NIDAVELLIR_HARD_STONE_OPAL_ORE, ModItems.OPAL, 4.0f, 9.0f);
        this.clusterOre(NidavellirBlocks.NIDAVELLIR_HARD_STONE_RUBY_ORE, ModItems.RUBY, 4.0f, 9.0f);

        this.clusterOre(NidavellirBlocks.NIDAVELLIR_HARD_STONE_IRON_ORE_CLUSTER, Items.RAW_IRON, 4.0f, 6.0f);
        this.clusterOre(NidavellirBlocks.NIDAVELLIR_HARD_STONE_GOLD_ORE_CLUSTER, Items.RAW_GOLD, 4.0f, 6.0f);
        this.clusterOre(NidavellirBlocks.NIDAVELLIR_HARD_STONE_COPPER_ORE_CLUSTER, Items.RAW_COPPER, 6.0f, 12.0f);
        this.clusterOre(NidavellirBlocks.NIDAVELLIR_HARD_STONE_TIN_ORE_CLUSTER, ModItems.RAW_TIN, 4.0f, 6.0f);
        this.clusterOre(NidavellirBlocks.NIDAVELLIR_HARD_STONE_ZINC_ORE_CLUSTER, ModItems.RAW_ZINC, 4.0f, 6.0f);
        this.clusterOre(NidavellirBlocks.NIDAVELLIR_HARD_STONE_DIAMOND_ORE_CLUSTER, Items.DIAMOND, 4.0f, 6.0f);
        this.clusterOre(NidavellirBlocks.NIDAVELLIR_HARD_STONE_EMERALD_ORE_CLUSTER, Items.EMERALD, 4.0f, 6.0f);
        this.clusterOre(NidavellirBlocks.NIDAVELLIR_HARD_STONE_COAL_ORE_CLUSTER, Items.COAL, 4.0f, 6.0f);
        this.clusterOre(NidavellirBlocks.NIDAVELLIR_HARD_STONE_REDSTONE_ORE_CLUSTER, Items.REDSTONE, 7.0f, 16.0f);
        this.clusterOre(NidavellirBlocks.NIDAVELLIR_HARD_STONE_LAPIS_ORE_CLUSTER, Items.LAPIS_LAZULI, 8.0f, 18.0f);
        this.clusterOre(NidavellirBlocks.NIDAVELLIR_HARD_STONE_AQUAMARINE_ORE_CLUSTER, ModItems.AQUAMARINE, 8.0f, 18.0f);
        this.clusterOre(NidavellirBlocks.NIDAVELLIR_HARD_STONE_OPAL_ORE_CLUSTER, ModItems.OPAL, 8.0f, 18.0f);
        this.clusterOre(NidavellirBlocks.NIDAVELLIR_HARD_STONE_RUBY_ORE_CLUSTER, ModItems.RUBY, 8.0f, 18.0f);

        this.stone(NidavellirBlocks.NIDAVELLIR_ENHANCED_STONE, NidavellirBlocks.NIDAVELLIR_ENHANCED_COBBLESTONE);
        this.dropSelf(NidavellirBlocks.NIDAVELLIR_ENHANCED_STONE_STAIRS);
        this.dropSelf(NidavellirBlocks.NIDAVELLIR_ENHANCED_COBBLESTONE);
        this.dropSelf(NidavellirBlocks.NIDAVELLIR_ENHANCED_COBBLESTONE_STAIRS);
        this.dropSelf(NidavellirBlocks.NIDAVELLIR_ENHANCED_STONE_BRICKS);
        this.dropSelf(NidavellirBlocks.NIDAVELLIR_ENHANCED_STONE_BRICKS_STAIRS);
        this.dropSelf(NidavellirBlocks.NIDAVELLIR_ENHANCED_STONE_PRESSURE_PLATE);
        this.dropSelf(NidavellirBlocks.NIDAVELLIR_ENHANCED_STONE_BUTTON);
        this.dropSelf(NidavellirBlocks.NIDAVELLIR_ENHANCED_STONE_WALL);
        this.dropSelf(NidavellirBlocks.NIDAVELLIR_ENHANCED_COBBLESTONE_WALL);
        this.dropSelf(NidavellirBlocks.NIDAVELLIR_ENHANCED_SMOOTH_STONE);
        this.dropSelf(NidavellirBlocks.NIDAVELLIR_ENHANCED_COBBLESTONE_MOSSY);
        this.dropSelf(NidavellirBlocks.NIDAVELLIR_ENHANCED_STONE_BRICKS_MOSSY);
        this.dropSelf(NidavellirBlocks.NIDAVELLIR_ENHANCED_STONE_BRICKS_CRACKED);
        this.dropSelf(NidavellirBlocks.NIDAVELLIR_ENHANCED_STONE_BRICKS_CHISELED);
        this.dropSelf(NidavellirBlocks.NIDAVELLIR_ENHANCED_STONE_BRICKS_WALL);
        this.slab(NidavellirBlocks.NIDAVELLIR_ENHANCED_STONE_SLAB);
        this.slab(NidavellirBlocks.NIDAVELLIR_ENHANCED_COBBLESTONE_SLAB);
        this.slab(NidavellirBlocks.NIDAVELLIR_ENHANCED_STONE_BRICKS_SLAB);

        this.ore(NidavellirBlocks.NIDAVELLIR_ENHANCED_STONE_IRON_ORE, Items.RAW_IRON);
        this.ore(NidavellirBlocks.NIDAVELLIR_ENHANCED_STONE_GOLD_ORE, Items.RAW_GOLD);
        this.clusterOre(NidavellirBlocks.NIDAVELLIR_ENHANCED_STONE_COPPER_ORE, Items.RAW_COPPER, 2.0f, 5.0f);
        this.ore(NidavellirBlocks.NIDAVELLIR_ENHANCED_STONE_TIN_ORE, ModItems.RAW_TIN);
        this.ore(NidavellirBlocks.NIDAVELLIR_ENHANCED_STONE_ZINC_ORE, ModItems.RAW_ZINC);
        this.ore(NidavellirBlocks.NIDAVELLIR_ENHANCED_STONE_DIAMOND_ORE, Items.DIAMOND);
        this.ore(NidavellirBlocks.NIDAVELLIR_ENHANCED_STONE_EMERALD_ORE, Items.EMERALD);
        this.ore(NidavellirBlocks.NIDAVELLIR_ENHANCED_STONE_COAL_ORE, Items.COAL);
        this.clusterOre(NidavellirBlocks.NIDAVELLIR_ENHANCED_STONE_REDSTONE_ORE, Items.REDSTONE, 4.0f, 5.0f);
        this.clusterOre(NidavellirBlocks.NIDAVELLIR_ENHANCED_STONE_LAPIS_ORE, Items.LAPIS_LAZULI, 4.0f, 9.0f);
        this.clusterOre(NidavellirBlocks.NIDAVELLIR_ENHANCED_STONE_AQUAMARINE_ORE, ModItems.AQUAMARINE, 4.0f, 9.0f);
        this.clusterOre(NidavellirBlocks.NIDAVELLIR_ENHANCED_STONE_OPAL_ORE, ModItems.OPAL, 4.0f, 9.0f);
        this.clusterOre(NidavellirBlocks.NIDAVELLIR_ENHANCED_STONE_RUBY_ORE, ModItems.RUBY, 4.0f, 9.0f);

        this.clusterOre(NidavellirBlocks.NIDAVELLIR_ENHANCED_STONE_IRON_ORE_CLUSTER, Items.RAW_IRON, 4.0f, 6.0f);
        this.clusterOre(NidavellirBlocks.NIDAVELLIR_ENHANCED_STONE_GOLD_ORE_CLUSTER, Items.RAW_GOLD, 4.0f, 6.0f);
        this.clusterOre(NidavellirBlocks.NIDAVELLIR_ENHANCED_STONE_COPPER_ORE_CLUSTER, Items.RAW_COPPER, 6.0f, 12.0f);
        this.clusterOre(NidavellirBlocks.NIDAVELLIR_ENHANCED_STONE_TIN_ORE_CLUSTER, ModItems.RAW_TIN, 4.0f, 6.0f);
        this.clusterOre(NidavellirBlocks.NIDAVELLIR_ENHANCED_STONE_ZINC_ORE_CLUSTER, ModItems.RAW_ZINC, 4.0f, 6.0f);
        this.clusterOre(NidavellirBlocks.NIDAVELLIR_ENHANCED_STONE_DIAMOND_ORE_CLUSTER, Items.DIAMOND, 4.0f, 6.0f);
        this.clusterOre(NidavellirBlocks.NIDAVELLIR_ENHANCED_STONE_EMERALD_ORE_CLUSTER, Items.EMERALD, 4.0f, 6.0f);
        this.clusterOre(NidavellirBlocks.NIDAVELLIR_ENHANCED_STONE_COAL_ORE_CLUSTER, Items.COAL, 4.0f, 6.0f);
        this.clusterOre(NidavellirBlocks.NIDAVELLIR_ENHANCED_STONE_REDSTONE_ORE_CLUSTER, Items.REDSTONE, 7.0f, 16.0f);
        this.clusterOre(NidavellirBlocks.NIDAVELLIR_ENHANCED_STONE_LAPIS_ORE_CLUSTER, Items.LAPIS_LAZULI, 8.0f, 18.0f);
        this.clusterOre(NidavellirBlocks.NIDAVELLIR_ENHANCED_STONE_AQUAMARINE_ORE_CLUSTER, ModItems.AQUAMARINE, 18.0f, 9.0f);
        this.clusterOre(NidavellirBlocks.NIDAVELLIR_ENHANCED_STONE_OPAL_ORE_CLUSTER, ModItems.OPAL, 8.0f, 18.0f);
        this.clusterOre(NidavellirBlocks.NIDAVELLIR_ENHANCED_STONE_RUBY_ORE_CLUSTER, ModItems.RUBY, 8.0f, 18.0f);

        this.stone(NidavellirBlocks.NIDAVELLIR_DEEPSLATE_STONE, NidavellirBlocks.NIDAVELLIR_DEEPSLATE_COBBLESTONE);
        this.dropSelf(NidavellirBlocks.NIDAVELLIR_DEEPSLATE_STONE_STAIRS);
        this.dropSelf(NidavellirBlocks.NIDAVELLIR_DEEPSLATE_COBBLESTONE);
        this.dropSelf(NidavellirBlocks.NIDAVELLIR_DEEPSLATE_COBBLESTONE_STAIRS);
        this.dropSelf(NidavellirBlocks.NIDAVELLIR_DEEPSLATE_STONE_BRICKS);
        this.dropSelf(NidavellirBlocks.NIDAVELLIR_DEEPSLATE_STONE_BRICKS_STAIRS);
        this.dropSelf(NidavellirBlocks.NIDAVELLIR_DEEPSLATE_STONE_PRESSURE_PLATE);
        this.dropSelf(NidavellirBlocks.NIDAVELLIR_DEEPSLATE_STONE_BUTTON);
        this.dropSelf(NidavellirBlocks.NIDAVELLIR_DEEPSLATE_STONE_WALL);
        this.dropSelf(NidavellirBlocks.NIDAVELLIR_DEEPSLATE_COBBLESTONE_WALL);
        this.dropSelf(NidavellirBlocks.NIDAVELLIR_DEEPSLATE_SMOOTH_STONE);
        this.dropSelf(NidavellirBlocks.NIDAVELLIR_DEEPSLATE_COBBLESTONE_MOSSY);
        this.dropSelf(NidavellirBlocks.NIDAVELLIR_DEEPSLATE_STONE_BRICKS_MOSSY);
        this.dropSelf(NidavellirBlocks.NIDAVELLIR_DEEPSLATE_STONE_BRICKS_CRACKED);
        this.dropSelf(NidavellirBlocks.NIDAVELLIR_DEEPSLATE_STONE_BRICKS_CHISELED);
        this.dropSelf(NidavellirBlocks.NIDAVELLIR_DEEPSLATE_STONE_BRICKS_WALL);
        this.slab(NidavellirBlocks.NIDAVELLIR_DEEPSLATE_STONE_SLAB);
        this.slab(NidavellirBlocks.NIDAVELLIR_DEEPSLATE_COBBLESTONE_SLAB);
        this.slab(NidavellirBlocks.NIDAVELLIR_DEEPSLATE_STONE_BRICKS_SLAB);

        this.ore(NidavellirBlocks.NIDAVELLIR_DEEPSLATE_STONE_IRON_ORE, Items.RAW_IRON);
        this.ore(NidavellirBlocks.NIDAVELLIR_DEEPSLATE_STONE_GOLD_ORE, Items.RAW_GOLD);
        this.clusterOre(NidavellirBlocks.NIDAVELLIR_DEEPSLATE_STONE_COPPER_ORE, Items.RAW_COPPER, 2.0f, 5.0f);
        this.ore(NidavellirBlocks.NIDAVELLIR_DEEPSLATE_STONE_TIN_ORE, ModItems.RAW_TIN);
        this.ore(NidavellirBlocks.NIDAVELLIR_DEEPSLATE_STONE_ZINC_ORE, ModItems.RAW_ZINC);
        this.ore(NidavellirBlocks.NIDAVELLIR_DEEPSLATE_STONE_DIAMOND_ORE, Items.DIAMOND);
        this.ore(NidavellirBlocks.NIDAVELLIR_DEEPSLATE_STONE_EMERALD_ORE, Items.EMERALD);
        this.ore(NidavellirBlocks.NIDAVELLIR_DEEPSLATE_STONE_COAL_ORE, Items.COAL);
        this.clusterOre(NidavellirBlocks.NIDAVELLIR_DEEPSLATE_STONE_REDSTONE_ORE, Items.REDSTONE, 4.0f, 5.0f);
        this.clusterOre(NidavellirBlocks.NIDAVELLIR_DEEPSLATE_STONE_LAPIS_ORE, Items.LAPIS_LAZULI, 4.0f, 9.0f);
        this.clusterOre(NidavellirBlocks.NIDAVELLIR_DEEPSLATE_STONE_AQUAMARINE_ORE, ModItems.AQUAMARINE, 4.0f, 9.0f);
        this.clusterOre(NidavellirBlocks.NIDAVELLIR_DEEPSLATE_STONE_OPAL_ORE, ModItems.OPAL, 4.0f, 9.0f);
        this.clusterOre(NidavellirBlocks.NIDAVELLIR_DEEPSLATE_STONE_RUBY_ORE, ModItems.RUBY, 4.0f, 9.0f);

        this.clusterOre(NidavellirBlocks.NIDAVELLIR_DEEPSLATE_STONE_IRON_ORE_CLUSTER, Items.RAW_IRON, 4.0f, 6.0f);
        this.clusterOre(NidavellirBlocks.NIDAVELLIR_DEEPSLATE_STONE_GOLD_ORE_CLUSTER, Items.RAW_GOLD, 4.0f, 6.0f);
        this.clusterOre(NidavellirBlocks.NIDAVELLIR_DEEPSLATE_STONE_COPPER_ORE_CLUSTER, Items.RAW_COPPER, 6.0f, 12.0f);
        this.clusterOre(NidavellirBlocks.NIDAVELLIR_DEEPSLATE_STONE_TIN_ORE_CLUSTER, ModItems.RAW_TIN, 4.0f, 6.0f);
        this.clusterOre(NidavellirBlocks.NIDAVELLIR_DEEPSLATE_STONE_ZINC_ORE_CLUSTER, ModItems.RAW_ZINC, 4.0f, 6.0f);
        this.clusterOre(NidavellirBlocks.NIDAVELLIR_DEEPSLATE_STONE_DIAMOND_ORE_CLUSTER, Items.DIAMOND, 4.0f, 6.0f);
        this.clusterOre(NidavellirBlocks.NIDAVELLIR_DEEPSLATE_STONE_EMERALD_ORE_CLUSTER, Items.EMERALD, 4.0f, 6.0f);
        this.clusterOre(NidavellirBlocks.NIDAVELLIR_DEEPSLATE_STONE_COAL_ORE_CLUSTER, Items.COAL, 4.0f, 6.0f);
        this.clusterOre(NidavellirBlocks.NIDAVELLIR_DEEPSLATE_STONE_REDSTONE_ORE_CLUSTER, Items.REDSTONE, 7.0f, 16.0f);
        this.clusterOre(NidavellirBlocks.NIDAVELLIR_DEEPSLATE_STONE_LAPIS_ORE_CLUSTER, Items.LAPIS_LAZULI, 8.0f, 18.0f);
        this.clusterOre(NidavellirBlocks.NIDAVELLIR_DEEPSLATE_STONE_AQUAMARINE_ORE_CLUSTER, ModItems.AQUAMARINE, 8.0f, 18.0f);
        this.clusterOre(NidavellirBlocks.NIDAVELLIR_DEEPSLATE_STONE_OPAL_ORE_CLUSTER, ModItems.OPAL, 8.0f, 18.0f);
        this.clusterOre(NidavellirBlocks.NIDAVELLIR_DEEPSLATE_STONE_RUBY_ORE_CLUSTER, ModItems.RUBY, 8.0f, 18.0f);

        this.stone(NidavellirBlocks.NIDAVELLIR_CRIMSON_STONE, NidavellirBlocks.NIDAVELLIR_CRIMSON_COBBLESTONE);
        this.dropSelf(NidavellirBlocks.NIDAVELLIR_CRIMSON_STONE_STAIRS);
        this.dropSelf(NidavellirBlocks.NIDAVELLIR_CRIMSON_COBBLESTONE);
        this.dropSelf(NidavellirBlocks.NIDAVELLIR_CRIMSON_COBBLESTONE_STAIRS);
        this.dropSelf(NidavellirBlocks.NIDAVELLIR_CRIMSON_STONE_BRICKS);
        this.dropSelf(NidavellirBlocks.NIDAVELLIR_CRIMSON_STONE_BRICKS_STAIRS);
        this.dropSelf(NidavellirBlocks.NIDAVELLIR_CRIMSON_STONE_PRESSURE_PLATE);
        this.dropSelf(NidavellirBlocks.NIDAVELLIR_CRIMSON_STONE_BUTTON);
        this.dropSelf(NidavellirBlocks.NIDAVELLIR_CRIMSON_STONE_WALL);
        this.dropSelf(NidavellirBlocks.NIDAVELLIR_CRIMSON_COBBLESTONE_WALL);
        this.dropSelf(NidavellirBlocks.NIDAVELLIR_CRIMSON_SMOOTH_STONE);
        this.dropSelf(NidavellirBlocks.NIDAVELLIR_CRIMSON_COBBLESTONE_MOSSY);
        this.dropSelf(NidavellirBlocks.NIDAVELLIR_CRIMSON_STONE_BRICKS_MOSSY);
        this.dropSelf(NidavellirBlocks.NIDAVELLIR_CRIMSON_STONE_BRICKS_CRACKED);
        this.dropSelf(NidavellirBlocks.NIDAVELLIR_CRIMSON_STONE_BRICKS_CHISELED);
        this.dropSelf(NidavellirBlocks.NIDAVELLIR_CRIMSON_STONE_BRICKS_WALL);
        this.slab(NidavellirBlocks.NIDAVELLIR_CRIMSON_STONE_SLAB);
        this.slab(NidavellirBlocks.NIDAVELLIR_CRIMSON_COBBLESTONE_SLAB);
        this.slab(NidavellirBlocks.NIDAVELLIR_CRIMSON_STONE_BRICKS_SLAB);

        this.ore(NidavellirBlocks.NIDAVELLIR_CRIMSON_STONE_IRON_ORE, Items.RAW_IRON);
        this.ore(NidavellirBlocks.NIDAVELLIR_CRIMSON_STONE_GOLD_ORE, Items.RAW_GOLD);
        this.clusterOre(NidavellirBlocks.NIDAVELLIR_CRIMSON_STONE_COPPER_ORE, Items.RAW_COPPER, 2.0f, 5.0f);
        this.ore(NidavellirBlocks.NIDAVELLIR_CRIMSON_STONE_TIN_ORE, ModItems.RAW_TIN);
        this.ore(NidavellirBlocks.NIDAVELLIR_CRIMSON_STONE_ZINC_ORE, ModItems.RAW_ZINC);
        this.ore(NidavellirBlocks.NIDAVELLIR_CRIMSON_STONE_DIAMOND_ORE, Items.DIAMOND);
        this.ore(NidavellirBlocks.NIDAVELLIR_CRIMSON_STONE_EMERALD_ORE, Items.EMERALD);
        this.ore(NidavellirBlocks.NIDAVELLIR_CRIMSON_STONE_COAL_ORE, Items.COAL);
        this.clusterOre(NidavellirBlocks.NIDAVELLIR_CRIMSON_STONE_REDSTONE_ORE, Items.REDSTONE, 4.0f, 5.0f);
        this.clusterOre(NidavellirBlocks.NIDAVELLIR_CRIMSON_STONE_LAPIS_ORE, Items.LAPIS_LAZULI, 4.0f, 9.0f);
        this.clusterOre(NidavellirBlocks.NIDAVELLIR_CRIMSON_STONE_AQUAMARINE_ORE, ModItems.AQUAMARINE, 4.0f, 9.0f);
        this.clusterOre(NidavellirBlocks.NIDAVELLIR_CRIMSON_STONE_OPAL_ORE, ModItems.OPAL, 4.0f, 9.0f);
        this.clusterOre(NidavellirBlocks.NIDAVELLIR_CRIMSON_STONE_RUBY_ORE, ModItems.RUBY, 4.0f, 9.0f);

        this.clusterOre(NidavellirBlocks.NIDAVELLIR_CRIMSON_STONE_IRON_ORE_CLUSTER, Items.RAW_IRON, 4.0f, 6.0f);
        this.clusterOre(NidavellirBlocks.NIDAVELLIR_CRIMSON_STONE_GOLD_ORE_CLUSTER, Items.RAW_GOLD, 4.0f, 6.0f);
        this.clusterOre(NidavellirBlocks.NIDAVELLIR_CRIMSON_STONE_COPPER_ORE_CLUSTER, Items.RAW_COPPER, 6.0f, 12.0f);
        this.clusterOre(NidavellirBlocks.NIDAVELLIR_CRIMSON_STONE_TIN_ORE_CLUSTER, ModItems.RAW_TIN, 4.0f, 6.0f);
        this.clusterOre(NidavellirBlocks.NIDAVELLIR_CRIMSON_STONE_ZINC_ORE_CLUSTER, ModItems.RAW_ZINC, 4.0f, 6.0f);
        this.clusterOre(NidavellirBlocks.NIDAVELLIR_CRIMSON_STONE_DIAMOND_ORE_CLUSTER, Items.DIAMOND, 4.0f, 6.0f);
        this.clusterOre(NidavellirBlocks.NIDAVELLIR_CRIMSON_STONE_EMERALD_ORE_CLUSTER, Items.EMERALD, 4.0f, 6.0f);
        this.clusterOre(NidavellirBlocks.NIDAVELLIR_CRIMSON_STONE_COAL_ORE_CLUSTER, Items.COAL, 4.0f, 6.0f);
        this.clusterOre(NidavellirBlocks.NIDAVELLIR_CRIMSON_STONE_REDSTONE_ORE_CLUSTER, Items.REDSTONE, 7.0f, 16.0f);
        this.clusterOre(NidavellirBlocks.NIDAVELLIR_CRIMSON_STONE_LAPIS_ORE_CLUSTER, Items.LAPIS_LAZULI, 8.0f, 18.0f);
        this.clusterOre(NidavellirBlocks.NIDAVELLIR_CRIMSON_STONE_AQUAMARINE_ORE_CLUSTER, ModItems.AQUAMARINE, 8.0f, 18.0f);
        this.clusterOre(NidavellirBlocks.NIDAVELLIR_CRIMSON_STONE_OPAL_ORE_CLUSTER, ModItems.OPAL, 8.0f, 18.0f);
        this.clusterOre(NidavellirBlocks.NIDAVELLIR_CRIMSON_STONE_RUBY_ORE_CLUSTER, ModItems.RUBY, 8.0f, 18.0f);


        this.stone(UnderworldBlocks.TARTARUS_STONE, UnderworldBlocks.TARTARUS_STONE_COBBLESTONE);
        this.dropSelf(UnderworldBlocks.TARTARUS_STONE_STAIRS);
        this.dropSelf(UnderworldBlocks.TARTARUS_STONE_COBBLESTONE);
        this.dropSelf(UnderworldBlocks.TARTARUS_STONE_COBBLESTONE_STAIRS);
        this.dropSelf(UnderworldBlocks.TARTARUS_STONE_BRICKS);
        this.dropSelf(UnderworldBlocks.TARTARUS_STONE_BRICKS_STAIRS);
        this.dropSelf(UnderworldBlocks.TARTARUS_STONE_PRESSURE_PLATE);
        this.dropSelf(UnderworldBlocks.TARTARUS_STONE_BUTTON);
        this.dropSelf(UnderworldBlocks.TARTARUS_STONE_WALL);
        this.dropSelf(UnderworldBlocks.TARTARUS_STONE_COBBLESTONE_WALL);
        this.dropSelf(UnderworldBlocks.TARTARUS_STONE_SMOOTH_STONE);
        this.dropSelf(UnderworldBlocks.TARTARUS_STONE_COBBLESTONE_MOSSY);
        this.dropSelf(UnderworldBlocks.TARTARUS_STONE_BRICKS_MOSSY);
        this.dropSelf(UnderworldBlocks.TARTARUS_STONE_BRICKS_CRACKED);
        this.dropSelf(UnderworldBlocks.TARTARUS_STONE_BRICKS_CHISELED);
        this.dropSelf(UnderworldBlocks.TARTARUS_STONE_BRICKS_WALL);
        this.slab(UnderworldBlocks.TARTARUS_STONE_SLAB);
        this.slab(UnderworldBlocks.TARTARUS_STONE_COBBLESTONE_SLAB);
        this.slab(UnderworldBlocks.TARTARUS_STONE_BRICKS_SLAB);


        /*
         * TREES
        */
        //Elder Wood
        this.dropSelf(UnderworldBlocks.ELDER_WOOD_LOG);
        this.dropSelf(UnderworldBlocks.ELDER_WOOD);
        this.dropSelf(UnderworldBlocks.STRIPPED_ELDER_WOOD_LOG);
        this.dropSelf(UnderworldBlocks.STRIPPED_ELDER_WOOD);
        this.dropSelf(UnderworldBlocks.ELDER_WOOD_SAPLING);
        this.dropSelf(UnderworldBlocks.ELDER_WOOD_PLANKS);
        this.slab(UnderworldBlocks.ELDER_WOOD_PLANKS_SLAB);
        this.dropSelf(UnderworldBlocks.ELDER_WOOD_PLANKS_STAIRS);
        this.dropSelf(UnderworldBlocks.ELDER_WOOD_PLANKS_PRESSURE_PLATE);
        this.door(UnderworldBlocks.ELDER_WOOD_PLANKS_DOOR);
        this.dropSelf(UnderworldBlocks.ELDER_WOOD_PLANKS_TRAPDOOR);
        this.dropSelf(UnderworldBlocks.ELDER_WOOD_PLANKS_FENCE);
        this.dropSelf(UnderworldBlocks.ELDER_WOOD_PLANKS_FENCE_GATE);
        this.dropSelf(UnderworldBlocks.ELDER_WOOD_PLANKS_BUTTON);

        this.leaves(UnderworldBlocks.ELDER_WOOD_LEAVES);

        this.sign(UnderworldBlocks.ELDER_WOOD_PLANKS_SIGN, UnderworldBlocks.ELDER_WOOD_PLANKS_WALL_SIGN, UnderworldItems.ELDER_WOOD_SIGN);
        this.wall_sign(UnderworldBlocks.ELDER_WOOD_PLANKS_HANGING_SIGN, UnderworldBlocks.ELDER_WOOD_PLANKS_WALL_HANGING_SIGN, UnderworldItems.ELDER_WOOD_HANGING_SIGN);

        //Olive
        this.dropSelf(UnderworldBlocks.OLIVE_LOG);
        this.dropSelf(UnderworldBlocks.OLIVE_WOOD);
        this.dropSelf(UnderworldBlocks.STRIPPED_OLIVE_LOG);
        this.dropSelf(UnderworldBlocks.STRIPPED_OLIVE_WOOD);
        this.dropSelf(UnderworldBlocks.OLIVE_SAPLING);
        this.dropSelf(UnderworldBlocks.OLIVE_PLANKS);
        this.slab(UnderworldBlocks.OLIVE_PLANKS_SLAB);
        this.dropSelf(UnderworldBlocks.OLIVE_PLANKS_STAIRS);
        this.dropSelf(UnderworldBlocks.OLIVE_PLANKS_PRESSURE_PLATE);
        this.door(UnderworldBlocks.OLIVE_PLANKS_DOOR);
        this.dropSelf(UnderworldBlocks.OLIVE_PLANKS_TRAPDOOR);
        this.dropSelf(UnderworldBlocks.OLIVE_PLANKS_FENCE);
        this.dropSelf(UnderworldBlocks.OLIVE_PLANKS_FENCE_GATE);
        this.dropSelf(UnderworldBlocks.OLIVE_PLANKS_BUTTON);

        this.leaves(UnderworldBlocks.OLIVE_LEAVES);

        this.sign(UnderworldBlocks.OLIVE_PLANKS_SIGN, UnderworldBlocks.OLIVE_PLANKS_WALL_SIGN, UnderworldItems.OLIVE_SIGN);
        this.wall_sign(UnderworldBlocks.OLIVE_PLANKS_HANGING_SIGN, UnderworldBlocks.OLIVE_PLANKS_WALL_HANGING_SIGN, UnderworldItems.OLIVE_HANGING_SIGN);

        //Myrrh
        this.dropSelf(UnderworldBlocks.MYRRH_LOG);
        this.dropSelf(UnderworldBlocks.MYRRH_WOOD);
        this.dropSelf(UnderworldBlocks.STRIPPED_MYRRH_LOG);
        this.dropSelf(UnderworldBlocks.STRIPPED_MYRRH_WOOD);
        this.dropSelf(UnderworldBlocks.MYRRH_SAPLING);
        this.dropSelf(UnderworldBlocks.MYRRH_PLANKS);
        this.slab(UnderworldBlocks.MYRRH_PLANKS_SLAB);
        this.dropSelf(UnderworldBlocks.MYRRH_PLANKS_STAIRS);
        this.dropSelf(UnderworldBlocks.MYRRH_PLANKS_PRESSURE_PLATE);
        this.door(UnderworldBlocks.MYRRH_PLANKS_DOOR);
        this.dropSelf(UnderworldBlocks.MYRRH_PLANKS_TRAPDOOR);
        this.dropSelf(UnderworldBlocks.MYRRH_PLANKS_FENCE);
        this.dropSelf(UnderworldBlocks.MYRRH_PLANKS_FENCE_GATE);
        this.dropSelf(UnderworldBlocks.MYRRH_PLANKS_BUTTON);

        this.leaves(UnderworldBlocks.MYRRH_LEAVES);

        this.sign(UnderworldBlocks.MYRRH_PLANKS_SIGN, UnderworldBlocks.MYRRH_PLANKS_WALL_SIGN, UnderworldItems.MYRRH_SIGN);
        this.wall_sign(UnderworldBlocks.MYRRH_PLANKS_HANGING_SIGN, UnderworldBlocks.MYRRH_PLANKS_WALL_HANGING_SIGN, UnderworldItems.MYRRH_HANGING_SIGN);

        //Laurel
        this.dropSelf(UnderworldBlocks.LAUREL_LOG);
        this.dropSelf(UnderworldBlocks.LAUREL_WOOD);
        this.dropSelf(UnderworldBlocks.STRIPPED_LAUREL_LOG);
        this.dropSelf(UnderworldBlocks.STRIPPED_LAUREL_WOOD);
        this.dropSelf(UnderworldBlocks.LAUREL_SAPLING);
        this.dropSelf(UnderworldBlocks.LAUREL_PLANKS);
        this.slab(UnderworldBlocks.LAUREL_PLANKS_SLAB);
        this.dropSelf(UnderworldBlocks.LAUREL_PLANKS_STAIRS);
        this.dropSelf(UnderworldBlocks.LAUREL_PLANKS_PRESSURE_PLATE);
        this.door(UnderworldBlocks.LAUREL_PLANKS_DOOR);
        this.dropSelf(UnderworldBlocks.LAUREL_PLANKS_TRAPDOOR);
        this.dropSelf(UnderworldBlocks.LAUREL_PLANKS_FENCE);
        this.dropSelf(UnderworldBlocks.LAUREL_PLANKS_FENCE_GATE);
        this.dropSelf(UnderworldBlocks.LAUREL_PLANKS_BUTTON);

        this.leaves(UnderworldBlocks.LAUREL_LEAVES);

        this.sign(UnderworldBlocks.LAUREL_PLANKS_SIGN, UnderworldBlocks.LAUREL_PLANKS_WALL_SIGN, UnderworldItems.LAUREL_SIGN);
        this.wall_sign(UnderworldBlocks.LAUREL_PLANKS_HANGING_SIGN, UnderworldBlocks.LAUREL_PLANKS_WALL_HANGING_SIGN, UnderworldItems.LAUREL_HANGING_SIGN);

        //Cypress
        this.dropSelf(UnderworldBlocks.CYPRESS_LOG);
        this.dropSelf(UnderworldBlocks.CYPRESS_WOOD);
        this.dropSelf(UnderworldBlocks.STRIPPED_CYPRESS_LOG);
        this.dropSelf(UnderworldBlocks.STRIPPED_CYPRESS_WOOD);
        this.dropSelf(UnderworldBlocks.CYPRESS_SAPLING);
        this.dropSelf(UnderworldBlocks.CYPRESS_PLANKS);
        this.slab(UnderworldBlocks.CYPRESS_PLANKS_SLAB);
        this.dropSelf(UnderworldBlocks.CYPRESS_PLANKS_STAIRS);
        this.dropSelf(UnderworldBlocks.CYPRESS_PLANKS_PRESSURE_PLATE);
        this.door(UnderworldBlocks.CYPRESS_PLANKS_DOOR);
        this.dropSelf(UnderworldBlocks.CYPRESS_PLANKS_TRAPDOOR);
        this.dropSelf(UnderworldBlocks.CYPRESS_PLANKS_FENCE);
        this.dropSelf(UnderworldBlocks.CYPRESS_PLANKS_FENCE_GATE);
        this.dropSelf(UnderworldBlocks.CYPRESS_PLANKS_BUTTON);

        this.leaves(UnderworldBlocks.CYPRESS_LEAVES);

        this.sign(UnderworldBlocks.CYPRESS_PLANKS_SIGN, UnderworldBlocks.CYPRESS_PLANKS_WALL_SIGN, UnderworldItems.CYPRESS_SIGN);
        this.wall_sign(UnderworldBlocks.CYPRESS_PLANKS_HANGING_SIGN, UnderworldBlocks.CYPRESS_PLANKS_WALL_HANGING_SIGN, UnderworldItems.CYPRESS_HANGING_SIGN);

        //Mushroom
        this.dropSelf(AlfheimrBlocks.POINT_MUSHROOM_BLOCK);
        this.dropOther(AlfheimrBlocks.POTTED_POINT_MUSHROOM_BLOCK, AlfheimrBlocks.POINT_MUSHROOM_BLOCK);
        this.dropOther(AlfheimrBlocks.TOP_POINT_MUSHROOM_BLOCK, AlfheimrBlocks.POINT_MUSHROOM_BLOCK);
        this.dropOther(AlfheimrBlocks.POINT_MUSHROOM_STEM_BLOCK, AlfheimrBlocks.POINT_MUSHROOM_BLOCK);

        this.dropSelf(AlfheimrBlocks.WITCHES_MUSHROOM_BLOCK);
        this.dropOther(AlfheimrBlocks.POTTED_WITCHES_MUSHROOM_BLOCK, AlfheimrBlocks.WITCHES_MUSHROOM_BLOCK);
        this.dropOther(AlfheimrBlocks.TOP_WITCHES_MUSHROOM_BLOCK, AlfheimrBlocks.WITCHES_MUSHROOM_BLOCK);
        this.dropOther(AlfheimrBlocks.WITCHES_MUSHROOM_STEM_BLOCK, AlfheimrBlocks.WITCHES_MUSHROOM_BLOCK);

        this.dropSelf(AlfheimrBlocks.ROYAL_BLUE_MUSHROOM_BLOCK);
        this.dropOther(AlfheimrBlocks.POTTED_ROYAL_BLUE_MUSHROOM_BLOCK, AlfheimrBlocks.ROYAL_BLUE_MUSHROOM_BLOCK);
        this.dropOther(AlfheimrBlocks.TOP_ROYAL_BLUE_MUSHROOM_BLOCK, AlfheimrBlocks.ROYAL_BLUE_MUSHROOM_BLOCK);
        this.dropOther(AlfheimrBlocks.ROYAL_BLUE_MUSHROOM_STEM_BLOCK, AlfheimrBlocks.ROYAL_BLUE_MUSHROOM_BLOCK);
        this.dropOther(AlfheimrBlocks.ROYAL_BLUE_MUSHROOM_GLOW_BLOCK, AlfheimrBlocks.ROYAL_BLUE_MUSHROOM_BLOCK);

        this.dropSelf(AlfheimrBlocks.SHORT_TOP_MUSHROOM_BLOCK);
        this.dropOther(AlfheimrBlocks.POTTED_SHORT_TOP_MUSHROOM_BLOCK, AlfheimrBlocks.SHORT_TOP_MUSHROOM_BLOCK);
        this.dropOther(AlfheimrBlocks.TOP_SHORT_TOP_MUSHROOM_BLOCK, AlfheimrBlocks.SHORT_TOP_MUSHROOM_BLOCK);
        this.dropOther(AlfheimrBlocks.SHORT_TOP_MUSHROOM_STEM_BLOCK, AlfheimrBlocks.SHORT_TOP_MUSHROOM_BLOCK);

        this.dropSelf(AlfheimrBlocks.SPECTRAL_MUSHROOM_BLOCK);
        this.dropOther(AlfheimrBlocks.POTTED_SPECTRAL_MUSHROOM_BLOCK, AlfheimrBlocks.SPECTRAL_MUSHROOM_BLOCK);
        this.dropOther(AlfheimrBlocks.TOP_SPECTRAL_MUSHROOM_BLOCK, AlfheimrBlocks.SPECTRAL_MUSHROOM_BLOCK);
        this.dropOther(AlfheimrBlocks.SPECTRAL_MUSHROOM_STEM_BLOCK, AlfheimrBlocks.SPECTRAL_MUSHROOM_BLOCK);

        this.dropSelf(AlfheimrBlocks.SHADE_MUSHROOM_BLOCK);
        this.dropOther(AlfheimrBlocks.POTTED_SHADE_MUSHROOM_BLOCK, AlfheimrBlocks.SHADE_MUSHROOM_BLOCK);
        this.dropOther(AlfheimrBlocks.SHADE_MUSHROOM_VINE_BLOCK, AlfheimrBlocks.SHADE_MUSHROOM_BLOCK);

        this.dropSelf(AlfheimrBlocks.CAP_MUSHROOM_BLOCK);
        this.dropOther(AlfheimrBlocks.POTTED_CAP_MUSHROOM_BLOCK, AlfheimrBlocks.CAP_MUSHROOM_BLOCK);
        this.dropOther(AlfheimrBlocks.CAP_MUSHROOM_VINE_BLOCK, AlfheimrBlocks.CAP_MUSHROOM_BLOCK);

        this.grassDrop(AlfheimrBlocks.ALFHEIMR_MAGIC_GRASS);
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
        LootItemCondition.Builder loot_item_condition$builder1 = LootItemBlockStatePropertyCondition.hasBlockStateProperties(crop_block.get()).setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(property, age));
        this.add(crop_block.get(), this.createCropDrops(crop_block.get(), fruit.get(), seeds.get(), loot_item_condition$builder1));

    }

    public void bulbCrops(Supplier<? extends Block> crop_block, Supplier<? extends Item> fruit, Property<Integer> property, int age) {
        LootItemCondition.Builder loot_item_condition$builder1 = LootItemBlockStatePropertyCondition.hasBlockStateProperties(crop_block.get()).setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(property, age));
        this.add(crop_block.get(), this.createBulbCropDrops(crop_block.get(), fruit.get(), loot_item_condition$builder1));

    }

    public void wildCrops(Supplier<? extends Block> crop_block, Supplier<? extends Item> wildFruit, float chance, Supplier<? extends Item> fruit, Property<Integer> property, int age) {
        LootItemCondition.Builder loot_item_condition$builder1 = LootItemBlockStatePropertyCondition.hasBlockStateProperties(crop_block.get()).setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(property, age));
        this.add(crop_block.get(), this.createWildCropDrops(crop_block.get(), wildFruit.get(), chance, fruit.get(), loot_item_condition$builder1));

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


    protected LootTable.Builder createBulbCropDrops(Block pCropBlock, Item pGrownCropItem, LootItemCondition.Builder pDropGrownCropCondition) {
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
    protected @NotNull Iterable<Block> getKnownBlocks() {
//        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
//        blockList.add(ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator);
        return ForgeRegistries.BLOCKS.getValues().stream()
                .filter((block) -> LostWorldsApi.MODID.equals(Objects.requireNonNull(BuiltInRegistries.BLOCK.getKey(block)).getNamespace()))
                .collect(Collectors.toList());
    }
}
