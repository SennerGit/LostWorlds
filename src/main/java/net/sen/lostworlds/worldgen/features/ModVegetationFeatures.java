package net.sen.lostworlds.worldgen.features;

import net.minecraft.core.Direction;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.resources.ResourceKey;
import net.minecraft.util.random.SimpleWeightedRandomList;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.levelgen.blockpredicates.BlockPredicate;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.RandomPatchConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.SimpleBlockConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.TreeConfiguration;
import net.minecraft.world.level.levelgen.feature.featuresize.TwoLayersFeatureSize;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.feature.stateproviders.WeightedStateProvider;
import net.sen.lostworlds.api.LostWorldsApi;
import net.sen.lostworlds.registry.blocks.AlfheimrBlocks;
import net.sen.lostworlds.registry.blocks.UnderworldBlocks;
import net.sen.lostworlds.block.wood.ModSaplingBlock;
import net.sen.lostworlds.worldgen.tree.custom.foliageplacer.*;
import net.sen.lostworlds.worldgen.tree.custom.trunkplacer.*;

public class ModVegetationFeatures {
    //Trees
    public static final ResourceKey<ConfiguredFeature<?, ?>> TREE_ELDER_WOOD_KEY = registerKey("tree_elder_wood");
    public static final ResourceKey<ConfiguredFeature<?, ?>> TREE_OLIVE_KEY = registerKey("tree_olive");
    public static final ResourceKey<ConfiguredFeature<?, ?>> TREE_MYRRH_KEY = registerKey("tree_myrrh");
    public static final ResourceKey<ConfiguredFeature<?, ?>> TREE_LAUREL_KEY = registerKey("tree_laurel");
    public static final ResourceKey<ConfiguredFeature<?, ?>> TREE_CYPRESS_KEY = registerKey("tree_cypress");
    public static final ResourceKey<ConfiguredFeature<?, ?>> TREE_BLACK_BIRCH_KEY = registerKey("tree_black_birch");
    public static final ResourceKey<ConfiguredFeature<?, ?>> TREE_WHITE_OAK_KEY = registerKey("tree_white_oak");
    public static final ResourceKey<ConfiguredFeature<?, ?>> TREE_BUR_OAK_KEY = registerKey("tree_bur_oak");
    public static final ResourceKey<ConfiguredFeature<?, ?>> TREE_BLOOD_CHERRY_KEY = registerKey("tree_blood_cherry");
    public static final ResourceKey<ConfiguredFeature<?, ?>> TREE_SACRED_TREE_KEY = registerKey("tree_sacred_tree");
    public static final ResourceKey<ConfiguredFeature<?, ?>> TREE_WILLOW_KEY = registerKey("tree_willow");
    public static final ResourceKey<ConfiguredFeature<?, ?>> TREE_DEADWOOD_KEY = registerKey("tree_deadwood");
    public static final ResourceKey<ConfiguredFeature<?, ?>> TREE_EBONY_KINGSWOOD_KEY = registerKey("tree_ebony_kingswood");
    public static final ResourceKey<ConfiguredFeature<?, ?>> TREE_IVORY_KINGSWOOD_KEY = registerKey("tree_ivory_kingswood");
    public static final ResourceKey<ConfiguredFeature<?, ?>> TREE_WEAVER_KEY = registerKey("tree_weaver");

    //Flowers
    public static final ResourceKey<ConfiguredFeature<?, ?>> FLOWER_IRIS_KEY = registerKey("flower_iris");

    public static final ResourceKey<ConfiguredFeature<?, ?>> ALFHEIMR_FLOWERS_KEY = registerKey("alfheimr_flowers_key");

    //Vegetation
    public static final ResourceKey<ConfiguredFeature<?, ?>> ALFHEIMR_MAGIC_GRASS_PLACED_KEY = registerKey("alfheimr_magic_grass_placed_key");
    public static final ResourceKey<ConfiguredFeature<?, ?>> ALFHEIMR_MAGIC_GRASS_PATCH_PLACED_KEY = registerKey("alfheimr_magic_grass_patch_placed_key");
    public static final ResourceKey<ConfiguredFeature<?, ?>> ALFHEIMR_MAGIC_GRASS_SINGLE_PLACED_KEY = registerKey("alfheimr_magic_grass_single_placed_key");

    private final static int LEAF_SHAG_FACTOR = 24;

    public static void bootstrap(BootstrapContext<ConfiguredFeature<?, ?>> context) {
        //Elder Wood
        ModSaplingBlock elderWoodSapling = ((ModSaplingBlock) UnderworldBlocks.ELDER_WOOD_SAPLING.get());
        register(context, TREE_ELDER_WOOD_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(UnderworldBlocks.ELDER_WOOD_LOG.get()),
                new BranchingTrunkPlacer(5, 4, 4, 3, new BranchesConfig(BlockStateProvider.simple(UnderworldBlocks.ELDER_WOOD.get()), 3, 1, 10, 1, 0.3, 0.2), false),
                BlockStateProvider.simple(UnderworldBlocks.ELDER_WOOD_LEAVES.get()),
                new LeafSpheroidFoliagePlacer(4.5f, 1.5f, ConstantInt.of(0), 1, 0, -0.25f, LEAF_SHAG_FACTOR),
                new TwoLayersFeatureSize(1, 0, 2)
        )
                .dirt(BlockStateProvider.simple(elderWoodSapling.getBlock(0)))
                .dirt(BlockStateProvider.simple(elderWoodSapling.getBlock(1)))
                .dirt(BlockStateProvider.simple(elderWoodSapling.getBlock(2)))
                .build());

        //Olive
        ModSaplingBlock oliveSapling = ((ModSaplingBlock) UnderworldBlocks.OLIVE_SAPLING.get());
        register(context, TREE_OLIVE_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(UnderworldBlocks.OLIVE_LOG.get()),
                new BranchingTrunkPlacer(5, 4, 4, 3, new BranchesConfig(BlockStateProvider.simple(UnderworldBlocks.OLIVE_WOOD.get()), 3, 1, 10, 1, 0.3, 0.2), false),
                BlockStateProvider.simple(UnderworldBlocks.OLIVE_LEAVES.get()),
                new LeafSpheroidFoliagePlacer(4.5f, 1.5f, ConstantInt.of(0), 1, 0, -0.25f, LEAF_SHAG_FACTOR),
                new TwoLayersFeatureSize(1, 0, 2)
        )
                .dirt(BlockStateProvider.simple(oliveSapling.getBlock(0)))
                .dirt(BlockStateProvider.simple(oliveSapling.getBlock(1)))
                .dirt(BlockStateProvider.simple(oliveSapling.getBlock(2)))
                .build());

        //Myrrh
        ModSaplingBlock myrrhSapling = ((ModSaplingBlock) UnderworldBlocks.MYRRH_SAPLING.get());
        register(context, TREE_MYRRH_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(UnderworldBlocks.MYRRH_LOG.get()),
                new BranchingTrunkPlacer(5, 4, 4, 3, new BranchesConfig(BlockStateProvider.simple(UnderworldBlocks.MYRRH_WOOD.get()), 3, 1, 10, 1, 0.3, 0.2), false),
                BlockStateProvider.simple(UnderworldBlocks.MYRRH_LEAVES.get()),
                new LeafSpheroidFoliagePlacer(4.5f, 1.5f, ConstantInt.of(0), 1, 0, -0.25f, LEAF_SHAG_FACTOR),
                new TwoLayersFeatureSize(1, 0, 2)
        )
                .dirt(BlockStateProvider.simple(myrrhSapling.getBlock(0)))
                .dirt(BlockStateProvider.simple(myrrhSapling.getBlock(1)))
                .dirt(BlockStateProvider.simple(myrrhSapling.getBlock(2)))
                .build());

        //Laurel
        ModSaplingBlock laurelSapling = ((ModSaplingBlock) UnderworldBlocks.LAUREL_SAPLING.get());
        register(context, TREE_LAUREL_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(UnderworldBlocks.LAUREL_LOG.get()),
                new BranchingTrunkPlacer(5, 4, 4, 3, new BranchesConfig(BlockStateProvider.simple(UnderworldBlocks.LAUREL_WOOD.get()), 3, 1, 10, 1, 0.3, 0.2), false),
                BlockStateProvider.simple(UnderworldBlocks.LAUREL_LEAVES.get()),
                new LeafSpheroidFoliagePlacer(4.5f, 1.5f, ConstantInt.of(0), 1, 0, -0.25f, LEAF_SHAG_FACTOR),
                new TwoLayersFeatureSize(1, 0, 2)
        )
                .dirt(BlockStateProvider.simple(laurelSapling.getBlock(0)))
                .dirt(BlockStateProvider.simple(laurelSapling.getBlock(1)))
                .dirt(BlockStateProvider.simple(laurelSapling.getBlock(2)))
                .build());

        //Cypress
        ModSaplingBlock cypressSapling = ((ModSaplingBlock) UnderworldBlocks.CYPRESS_SAPLING.get());
        register(context, TREE_CYPRESS_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(UnderworldBlocks.CYPRESS_LOG.get()),
                new BranchingTrunkPlacer(5, 4, 4, 3, new BranchesConfig(BlockStateProvider.simple(UnderworldBlocks.CYPRESS_WOOD.get()), 3, 1, 10, 1, 0.3, 0.2), false),
                BlockStateProvider.simple(UnderworldBlocks.CYPRESS_LEAVES.get()),
                new LeafSpheroidFoliagePlacer(4.5f, 1.5f, ConstantInt.of(0), 1, 0, -0.25f, LEAF_SHAG_FACTOR),
                new TwoLayersFeatureSize(1, 0, 2)
        )
                .dirt(BlockStateProvider.simple(cypressSapling.getBlock(0)))
                .dirt(BlockStateProvider.simple(cypressSapling.getBlock(1)))
                .dirt(BlockStateProvider.simple(cypressSapling.getBlock(2)))
                .build());

        //Black Birch
        ModSaplingBlock blackBirchSapling = ((ModSaplingBlock) AlfheimrBlocks.BLACK_BIRCH_SAPLING.get());
        register(context, TREE_BLACK_BIRCH_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(AlfheimrBlocks.BLACK_BIRCH_LOG.get()),
                new BranchingTrunkPlacer(5, 4, 4, 3, new BranchesConfig(BlockStateProvider.simple(AlfheimrBlocks.BLACK_BIRCH_WOOD.get()), 3, 1, 10, 1, 0.3, 0.2), false),
                BlockStateProvider.simple(AlfheimrBlocks.BLACK_BIRCH_LEAVES.get()),
                new LeafSpheroidFoliagePlacer(4.5f, 1.5f, ConstantInt.of(0), 1, 0, -0.25f, LEAF_SHAG_FACTOR),
                new TwoLayersFeatureSize(1, 0, 2)
        )
                .dirt(BlockStateProvider.simple(blackBirchSapling.getBlock(0)))
                .dirt(BlockStateProvider.simple(blackBirchSapling.getBlock(1)))
                .dirt(BlockStateProvider.simple(blackBirchSapling.getBlock(2)))
                .build());

        //White Oak
        ModSaplingBlock whiteOakSapling = ((ModSaplingBlock) AlfheimrBlocks.WHITE_OAK_SAPLING.get());
        register(context, TREE_WHITE_OAK_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(AlfheimrBlocks.WHITE_OAK_LOG.get()),
                new BranchingTrunkPlacer(5, 4, 4, 3, new BranchesConfig(BlockStateProvider.simple(AlfheimrBlocks.WHITE_OAK_WOOD.get()), 3, 1, 10, 1, 0.3, 0.2), false),
                BlockStateProvider.simple(AlfheimrBlocks.WHITE_OAK_LEAVES.get()),
                new LeafSpheroidFoliagePlacer(4.5f, 1.5f, ConstantInt.of(0), 1, 0, -0.25f, LEAF_SHAG_FACTOR),
                new TwoLayersFeatureSize(1, 0, 2)
        )
                .dirt(BlockStateProvider.simple(whiteOakSapling.getBlock(0)))
                .dirt(BlockStateProvider.simple(whiteOakSapling.getBlock(1)))
                .dirt(BlockStateProvider.simple(whiteOakSapling.getBlock(2)))
                .build());

        //Bur Oak
        ModSaplingBlock burOakSapling = ((ModSaplingBlock) AlfheimrBlocks.BUR_OAK_SAPLING.get());
        register(context, TREE_BUR_OAK_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(AlfheimrBlocks.BUR_OAK_LOG.get()),
                new BranchingTrunkPlacer(5, 4, 4, 3, new BranchesConfig(BlockStateProvider.simple(AlfheimrBlocks.BUR_OAK_WOOD.get()), 3, 1, 10, 1, 0.3, 0.2), false),
                BlockStateProvider.simple(AlfheimrBlocks.BUR_OAK_LEAVES.get()),
                new LeafSpheroidFoliagePlacer(4.5f, 1.5f, ConstantInt.of(0), 1, 0, -0.25f, LEAF_SHAG_FACTOR),
                new TwoLayersFeatureSize(1, 0, 2)
        )
                .dirt(BlockStateProvider.simple(burOakSapling.getBlock(0)))
                .dirt(BlockStateProvider.simple(burOakSapling.getBlock(1)))
                .dirt(BlockStateProvider.simple(burOakSapling.getBlock(2)))
                .build());

        //Blood Cherry
        ModSaplingBlock bloodCherrySapling = ((ModSaplingBlock) AlfheimrBlocks.BLOOD_CHERRY_SAPLING.get());
        register(context, TREE_BLOOD_CHERRY_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(AlfheimrBlocks.BLOOD_CHERRY_LOG.get()),
                new BranchingTrunkPlacer(5, 4, 4, 3, new BranchesConfig(BlockStateProvider.simple(AlfheimrBlocks.BLOOD_CHERRY_WOOD.get()), 3, 1, 10, 1, 0.3, 0.2), false),
                BlockStateProvider.simple(AlfheimrBlocks.BLOOD_CHERRY_LEAVES.get()),
                new LeafSpheroidFoliagePlacer(4.5f, 1.5f, ConstantInt.of(0), 1, 0, -0.25f, LEAF_SHAG_FACTOR),
                new TwoLayersFeatureSize(1, 0, 2)
        )
                .dirt(BlockStateProvider.simple(bloodCherrySapling.getBlock(0)))
                .dirt(BlockStateProvider.simple(bloodCherrySapling.getBlock(1)))
                .dirt(BlockStateProvider.simple(bloodCherrySapling.getBlock(2)))
                .build());

        //Sacred Tree
        ModSaplingBlock sacredTreeSapling = ((ModSaplingBlock) AlfheimrBlocks.SACRED_TREE_SAPLING.get());
        register(context, TREE_SACRED_TREE_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(AlfheimrBlocks.SACRED_TREE_LOG.get()),
                new BranchingTrunkPlacer(5, 4, 4, 3, new BranchesConfig(BlockStateProvider.simple(AlfheimrBlocks.SACRED_TREE_WOOD.get()), 3, 1, 10, 1, 0.3, 0.2), false),
                BlockStateProvider.simple(AlfheimrBlocks.SACRED_TREE_LEAVES.get()),
                new LeafSpheroidFoliagePlacer(4.5f, 1.5f, ConstantInt.of(0), 1, 0, -0.25f, LEAF_SHAG_FACTOR),
                new TwoLayersFeatureSize(1, 0, 2)
        )
                .dirt(BlockStateProvider.simple(sacredTreeSapling.getBlock(0)))
                .dirt(BlockStateProvider.simple(sacredTreeSapling.getBlock(1)))
                .dirt(BlockStateProvider.simple(sacredTreeSapling.getBlock(2)))
                .build());

        //Willow
        ModSaplingBlock willowSapling = ((ModSaplingBlock) AlfheimrBlocks.WILLOW_SAPLING.get());
        register(context, TREE_WILLOW_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(AlfheimrBlocks.WILLOW_LOG.get()),
                new BranchingTrunkPlacer(5, 4, 4, 3, new BranchesConfig(BlockStateProvider.simple(AlfheimrBlocks.WILLOW_WOOD.get()), 3, 1, 10, 1, 0.3, 0.2), false),
                BlockStateProvider.simple(AlfheimrBlocks.WILLOW_LEAVES.get()),
                new LeafSpheroidFoliagePlacer(4.5f, 1.5f, ConstantInt.of(0), 1, 0, -0.25f, LEAF_SHAG_FACTOR),
                new TwoLayersFeatureSize(1, 0, 2)
        )
                .dirt(BlockStateProvider.simple(willowSapling.getBlock(0)))
                .dirt(BlockStateProvider.simple(willowSapling.getBlock(1)))
                .dirt(BlockStateProvider.simple(willowSapling.getBlock(2)))
                .build());

        //Deadwood
        ModSaplingBlock deadwoodSapling = ((ModSaplingBlock) AlfheimrBlocks.DEADWOOD_SAPLING.get());
        register(context, TREE_DEADWOOD_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(AlfheimrBlocks.DEADWOOD_LOG.get()),
                new BranchingTrunkPlacer(5, 4, 4, 3, new BranchesConfig(BlockStateProvider.simple(AlfheimrBlocks.DEADWOOD_WOOD.get()), 3, 1, 10, 1, 0.3, 0.2), false),
                BlockStateProvider.simple(AlfheimrBlocks.DEADWOOD_LEAVES.get()),
                new LeafSpheroidFoliagePlacer(4.5f, 1.5f, ConstantInt.of(0), 1, 0, -0.25f, LEAF_SHAG_FACTOR),
                new TwoLayersFeatureSize(1, 0, 2)
        )
                .dirt(BlockStateProvider.simple(deadwoodSapling.getBlock(0)))
                .dirt(BlockStateProvider.simple(deadwoodSapling.getBlock(1)))
                .dirt(BlockStateProvider.simple(deadwoodSapling.getBlock(2)))
                .build());

        //Ebony Kingswood
        ModSaplingBlock ebonyKingswoodSapling = ((ModSaplingBlock) AlfheimrBlocks.EBONY_KINGSWOOD_SAPLING.get());
        register(context, TREE_EBONY_KINGSWOOD_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(AlfheimrBlocks.EBONY_KINGSWOOD_LOG.get()),
                new BranchingTrunkPlacer(5, 4, 4, 3, new BranchesConfig(BlockStateProvider.simple(AlfheimrBlocks.EBONY_KINGSWOOD_WOOD.get()), 3, 1, 10, 1, 0.3, 0.2), false),
                BlockStateProvider.simple(AlfheimrBlocks.EBONY_KINGSWOOD_LEAVES.get()),
                new LeafSpheroidFoliagePlacer(4.5f, 1.5f, ConstantInt.of(0), 1, 0, -0.25f, LEAF_SHAG_FACTOR),
                new TwoLayersFeatureSize(1, 0, 2)
        )
                .dirt(BlockStateProvider.simple(ebonyKingswoodSapling.getBlock(0)))
                .dirt(BlockStateProvider.simple(ebonyKingswoodSapling.getBlock(1)))
                .dirt(BlockStateProvider.simple(ebonyKingswoodSapling.getBlock(2)))
                .build());

        //Ivory Kingswood
        ModSaplingBlock ivoryKingswoodSapling = ((ModSaplingBlock) AlfheimrBlocks.IVORY_KINGSWOOD_SAPLING.get());
        register(context, TREE_IVORY_KINGSWOOD_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(AlfheimrBlocks.IVORY_KINGSWOOD_LOG.get()),
                new BranchingTrunkPlacer(5, 4, 4, 3, new BranchesConfig(BlockStateProvider.simple(AlfheimrBlocks.IVORY_KINGSWOOD_WOOD.get()), 3, 1, 10, 1, 0.3, 0.2), false),
                BlockStateProvider.simple(AlfheimrBlocks.IVORY_KINGSWOOD_LEAVES.get()),
                new LeafSpheroidFoliagePlacer(4.5f, 1.5f, ConstantInt.of(0), 1, 0, -0.25f, LEAF_SHAG_FACTOR),
                new TwoLayersFeatureSize(1, 0, 2)
        )
                .dirt(BlockStateProvider.simple(ivoryKingswoodSapling.getBlock(0)))
                .dirt(BlockStateProvider.simple(ivoryKingswoodSapling.getBlock(1)))
                .dirt(BlockStateProvider.simple(ivoryKingswoodSapling.getBlock(2)))
                .build());

        //Weaver
        ModSaplingBlock weaverSapling = ((ModSaplingBlock) AlfheimrBlocks.WEAVER_SAPLING.get());
        register(context, TREE_WEAVER_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(AlfheimrBlocks.WEAVER_LOG.get()),
                new BranchingTrunkPlacer(5, 4, 4, 3, new BranchesConfig(BlockStateProvider.simple(AlfheimrBlocks.WEAVER_WOOD.get()), 3, 1, 10, 1, 0.3, 0.2), false),
                BlockStateProvider.simple(AlfheimrBlocks.WEAVER_LEAVES.get()),
                new LeafSpheroidFoliagePlacer(4.5f, 1.5f, ConstantInt.of(0), 1, 0, -0.25f, LEAF_SHAG_FACTOR),
                new TwoLayersFeatureSize(1, 0, 2)
        )
                .dirt(BlockStateProvider.simple(weaverSapling.getBlock(0)))
                .dirt(BlockStateProvider.simple(weaverSapling.getBlock(1)))
                .dirt(BlockStateProvider.simple(weaverSapling.getBlock(2)))
                .build());

        //Flowers
        register(context, FLOWER_IRIS_KEY, Feature.FLOWER,
                new RandomPatchConfiguration(32, 6, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(UnderworldBlocks.IRIS_FLOWER.get())))));

        register(context, ALFHEIMR_FLOWERS_KEY, Feature.FLOWER,
                grassPatch(
                        new WeightedStateProvider(
                                SimpleWeightedRandomList.<BlockState>builder()
                                        .add(AlfheimrBlocks.DARK_BLOOM_FLOWER.get().defaultBlockState(), 2)
                                        .add(AlfheimrBlocks.DREAD_NIGHT_FLOWER.get().defaultBlockState(), 2)
                                        .add(AlfheimrBlocks.BLACK_LOTUS_FLOWER.get().defaultBlockState(), 2)
                                        .add(AlfheimrBlocks.NIGHT_ROSE_FLOWER.get().defaultBlockState(), 2)
                                        .add(AlfheimrBlocks.AQUA_ROSE_FLOWER.get().defaultBlockState(), 2)
                                        .add(AlfheimrBlocks.MOON_FLOWER.get().defaultBlockState(), 2)
                                        .add(AlfheimrBlocks.CATHERINE_FLOWER.get().defaultBlockState(), 2)
                                        .add(AlfheimrBlocks.TAINTED_ROSE_FLOWER.get().defaultBlockState(), 2)
                                        .add(AlfheimrBlocks.CINNAMON_ROSE_FLOWER.get().defaultBlockState(), 2)
                                        .add(AlfheimrBlocks.BUTTERFLY_FLOWER.get().defaultBlockState(), 2)
                                        .add(AlfheimrBlocks.GAIA_TULIP_FLOWER.get().defaultBlockState(), 2)
                                        .add(AlfheimrBlocks.BEARDED_IRIS_FLOWER.get().defaultBlockState(), 2)
                                        .add(AlfheimrBlocks.CORNFLOWER_FLOWER.get().defaultBlockState(), 2)
                                        .add(AlfheimrBlocks.MORNING_GLORY_FLOWER.get().defaultBlockState(), 2)
                                        .add(AlfheimrBlocks.GEORGIA_BLUE_FLOWER.get().defaultBlockState(), 2)
                                        .add(AlfheimrBlocks.BLUE_POPPY_FLOWER.get().defaultBlockState(), 2)
                                        .add(AlfheimrBlocks.TULIP_FLOWER.get().defaultBlockState(), 2)
                                        .add(AlfheimrBlocks.CARNATION_FLOWER.get().defaultBlockState(), 2)
                                        .add(AlfheimrBlocks.LADYS_MANTLE_FLOWER.get().defaultBlockState(), 2)
                                        .add(AlfheimrBlocks.GREEN_ROSE_FLOWER.get().defaultBlockState(), 2)
                                        .add(AlfheimrBlocks.CLEMATIS_FLOWER.get().defaultBlockState(), 2)
                                        .add(AlfheimrBlocks.BLUE_STAR_FLOWER.get().defaultBlockState(), 2)
                                        .add(AlfheimrBlocks.SALVIA_FLOWER.get().defaultBlockState(), 2)
                                        .add(AlfheimrBlocks.FALSE_INDIGO_FLOWER.get().defaultBlockState(), 2)
                                        .add(AlfheimrBlocks.WHITE_SAGE_FLOWER.get().defaultBlockState(), 2)
                                        .add(AlfheimrBlocks.SILVER_SCHEHERAZADE_FLOWER.get().defaultBlockState(), 2)
                                        .add(AlfheimrBlocks.SILVER_SPRING_FLOWER.get().defaultBlockState(), 2)
                                        .add(AlfheimrBlocks.SILVER_SHADOWS_FLOWER.get().defaultBlockState(), 2)
                                        .add(AlfheimrBlocks.GREEN_BALL_FLOWER.get().defaultBlockState(), 2)
                                        .add(AlfheimrBlocks.LIME_DAHLIA_FLOWER.get().defaultBlockState(), 2)
                                        .add(AlfheimrBlocks.HYDRANGEA_FLOWER.get().defaultBlockState(), 2)
                                        .add(AlfheimrBlocks.ZINNIA_FLOWER.get().defaultBlockState(), 2)
                                        .add(AlfheimrBlocks.BUTTERFLY_CANDY_FLOWER.get().defaultBlockState(), 2)
                                        .add(AlfheimrBlocks.CABARET_FLOWER.get().defaultBlockState(), 2)
                                        .add(AlfheimrBlocks.DIANTHUS_FLOWER.get().defaultBlockState(), 2)
                                        .add(AlfheimrBlocks.TITAN_CRANBERRY_VINCA_FLOWER.get().defaultBlockState(), 2)
                                        .add(AlfheimrBlocks.ORANGE_ZINNIA_FLOWER.get().defaultBlockState(), 2)
                                        .add(AlfheimrBlocks.BEGONIA_FLOWER.get().defaultBlockState(), 2)
                                        .add(AlfheimrBlocks.CROWN_IMPERIAL_FLOWER.get().defaultBlockState(), 2)
                                        .add(AlfheimrBlocks.ORIENTAL_POPPY_FLOWER.get().defaultBlockState(), 2)
                                        .add(AlfheimrBlocks.AZALEA_FLOWER.get().defaultBlockState(), 2)
                                        .add(AlfheimrBlocks.PINK_DELIGHT_FLOWER.get().defaultBlockState(), 2)
                                        .add(AlfheimrBlocks.CHRYSANTHEMUM_FLOWER.get().defaultBlockState(), 2)
                                        .add(AlfheimrBlocks.HIBISCUS_FLOWER.get().defaultBlockState(), 2)
                                        .add(AlfheimrBlocks.CARDINAL_FLOWER.get().defaultBlockState(), 2)
                                        .add(AlfheimrBlocks.GERBERA_FLOWER.get().defaultBlockState(), 2)
                                        .add(AlfheimrBlocks.RED_TULIP_FLOWER.get().defaultBlockState(), 2)
                                        .add(AlfheimrBlocks.FREESIA_FLOWER.get().defaultBlockState(), 2)
                                        .add(AlfheimrBlocks.GARDENIAS_FLOWER.get().defaultBlockState(), 2)
                                        .add(AlfheimrBlocks.STAR_JASMINE_FLOWER.get().defaultBlockState(), 2)
                                        .add(AlfheimrBlocks.WHITE_WARATAH_FLOWER.get().defaultBlockState(), 2)
                                        .add(AlfheimrBlocks.FLANNEL_FLOWER.get().defaultBlockState(), 2)
                                        .add(AlfheimrBlocks.BEARS_EARS_FLOWER.get().defaultBlockState(), 2)
                                        .add(AlfheimrBlocks.BIDENS_FLOWER.get().defaultBlockState(), 2)
                                        .add(AlfheimrBlocks.BLANKET_FLOWER.get().defaultBlockState(), 2)
                                        .add(AlfheimrBlocks.BULBINE_FLOWER.get().defaultBlockState(), 2)
                                        .add(AlfheimrBlocks.SILVER_BRUNIA_FLOWER.get().defaultBlockState(), 2)
                                        .add(AlfheimrBlocks.GRAY_ROSES_FLOWER.get().defaultBlockState(), 2)
                                        .add(AlfheimrBlocks.MOON_CARROT_FLOWER.get().defaultBlockState(), 2)
                                        .add(AlfheimrBlocks.SILVER_BABY_FLOWER.get().defaultBlockState(), 2)
                                        .add(AlfheimrBlocks.LAVENDER_FLOWER.get().defaultBlockState(), 2)
                                        .add(AlfheimrBlocks.BELLFLOWER_FLOWER.get().defaultBlockState(), 2)
                                        .add(AlfheimrBlocks.LILAC_FLOWER.get().defaultBlockState(), 2)
                                        .add(AlfheimrBlocks.SWEET_PEA_FLOWER.get().defaultBlockState(), 2)
                        ),
                        64
                )
        );

        //Vegetation
        register(context, ALFHEIMR_MAGIC_GRASS_PLACED_KEY, Feature.RANDOM_PATCH,
                grassPatch(BlockStateProvider.simple(AlfheimrBlocks.ALFHEIMR_MAGIC_GRASS.get()), 32));

        FeatureUtils.register(context, ALFHEIMR_MAGIC_GRASS_SINGLE_PLACED_KEY, Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(AlfheimrBlocks.ALFHEIMR_MAGIC_GRASS.get().defaultBlockState())));

        register(context, ALFHEIMR_MAGIC_GRASS_PATCH_PLACED_KEY, Feature.RANDOM_PATCH,
                new RandomPatchConfiguration(
                        32,
                        7,
                        3,
                        PlacementUtils.filtered(
                                Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(
                                        new WeightedStateProvider(
                                            SimpleWeightedRandomList.<BlockState>builder().add(
                                                    AlfheimrBlocks.ALFHEIMR_MAGIC_GRASS.get().defaultBlockState(),
                                                    3
                                            )
                                        )
                                ),
                                BlockPredicate.allOf(
                                        BlockPredicate.ONLY_IN_AIR_PREDICATE,
                                        BlockPredicate.not(
                                                BlockPredicate.matchesBlocks(
                                                        Direction.DOWN.getNormal(),
                                                        Blocks.PODZOL
                                                )
                                        )
                                )
                        )
                )
        );
    }

    public static ResourceKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return ResourceKey.create(Registries.CONFIGURED_FEATURE, LostWorldsApi.modLoc(name));
    }

    private static <FC extends FeatureConfiguration, F extends Feature<FC>> void register(BootstrapContext<ConfiguredFeature<?, ?>> context,
                                                                                          ResourceKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }

    private static RandomPatchConfiguration grassPatch(BlockStateProvider blockStateProvider, int pTries) {
        return FeatureUtils.simpleRandomPatchConfiguration(pTries, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(blockStateProvider)));
    }

    private static BlockStateProvider flowerBatch(Block... flowers) {
        for (Block blockSupplier : flowers) {
            BlockStateProvider.simple(
                    blockSupplier
            );
        }

        return null;
    }
}
