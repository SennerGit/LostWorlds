package net.sen.lostworlds.worldgen.features;

import net.minecraft.core.Direction;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
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
import net.minecraft.world.level.levelgen.feature.foliageplacers.BlobFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.feature.stateproviders.WeightedStateProvider;
import net.minecraft.world.level.levelgen.feature.trunkplacers.StraightTrunkPlacer;
import net.sen.lostworlds.LostWorldsApi;
import net.sen.lostworlds.block.AlfheimrBlocks;
import net.sen.lostworlds.block.UnderworldBlocks;
import net.sen.lostworlds.block.wood.ModSaplingBlock;

public class ModVegetationFeatures {
    //Trees
    public static final ResourceKey<ConfiguredFeature<?, ?>> TREE_ELDER_WOOD_KEY = registerKey("tree_elder_wood");
    public static final ResourceKey<ConfiguredFeature<?, ?>> TREE_OLIVE_KEY = registerKey("tree_olive");
    public static final ResourceKey<ConfiguredFeature<?, ?>> TREE_MYRRH_KEY = registerKey("tree_myrrh");
    public static final ResourceKey<ConfiguredFeature<?, ?>> TREE_LAUREL_KEY = registerKey("tree_laurel");
    public static final ResourceKey<ConfiguredFeature<?, ?>> TREE_CYPRESS_KEY = registerKey("tree_cypress");

    //Flowers
    public static final ResourceKey<ConfiguredFeature<?, ?>> FLOWER_IRIS_KEY = registerKey("flower_iris");

    public static final ResourceKey<ConfiguredFeature<?, ?>> ALFHEIMR_FLOWERS_KEY = registerKey("alfheimr_flowers_key");

    //Vegetation
    public static final ResourceKey<ConfiguredFeature<?, ?>> ALFHEIMR_MAGIC_GRASS_PLACED_KEY = registerKey("alfheimr_magic_grass_placed_key");
    public static final ResourceKey<ConfiguredFeature<?, ?>> ALFHEIMR_MAGIC_GRASS_PATCH_PLACED_KEY = registerKey("alfheimr_magic_grass_patch_placed_key");
    public static final ResourceKey<ConfiguredFeature<?, ?>> ALFHEIMR_MAGIC_GRASS_SINGLE_PLACED_KEY = registerKey("alfheimr_magic_grass_single_placed_key");

    public static void bootstrap(BootstapContext<ConfiguredFeature<?, ?>> context) {
        ModSaplingBlock elderWoodSapling = ((ModSaplingBlock) UnderworldBlocks.ELDER_WOOD_SAPLING.get());
        register(context, TREE_ELDER_WOOD_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(UnderworldBlocks.ELDER_WOOD_LOG.get()),
                new StraightTrunkPlacer(5, 4, 3),
                BlockStateProvider.simple(UnderworldBlocks.ELDER_WOOD_LEAVES.get()),
                new BlobFoliagePlacer(ConstantInt.of(3), ConstantInt.of(2), 3),
                new TwoLayersFeatureSize(1, 0, 2)
        )
                .dirt(BlockStateProvider.simple(elderWoodSapling.getBlock(0)))
                .dirt(BlockStateProvider.simple(elderWoodSapling.getBlock(1)))
                .dirt(BlockStateProvider.simple(elderWoodSapling.getBlock(2)))
                .build());

        ModSaplingBlock oliveSapling = ((ModSaplingBlock) UnderworldBlocks.OLIVE_SAPLING.get());
        register(context, TREE_OLIVE_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(UnderworldBlocks.OLIVE_LOG.get()),
                new StraightTrunkPlacer(5, 4, 3),
                BlockStateProvider.simple(UnderworldBlocks.OLIVE_LEAVES.get()),
                new BlobFoliagePlacer(ConstantInt.of(3), ConstantInt.of(2), 3),
                new TwoLayersFeatureSize(1, 0, 2)
        )
                .dirt(BlockStateProvider.simple(oliveSapling.getBlock(0)))
                .dirt(BlockStateProvider.simple(oliveSapling.getBlock(1)))
                .dirt(BlockStateProvider.simple(oliveSapling.getBlock(2)))
                .build());

        ModSaplingBlock myrrhSapling = ((ModSaplingBlock) UnderworldBlocks.MYRRH_SAPLING.get());
        register(context, TREE_MYRRH_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(UnderworldBlocks.MYRRH_LOG.get()),
                new StraightTrunkPlacer(5, 4, 3),
                BlockStateProvider.simple(UnderworldBlocks.MYRRH_LEAVES.get()),
                new BlobFoliagePlacer(ConstantInt.of(3), ConstantInt.of(2), 3),
                new TwoLayersFeatureSize(1, 0, 2)
        )
                .dirt(BlockStateProvider.simple(myrrhSapling.getBlock(0)))
                .dirt(BlockStateProvider.simple(myrrhSapling.getBlock(1)))
                .dirt(BlockStateProvider.simple(myrrhSapling.getBlock(2)))
                .build());

        ModSaplingBlock laurelSapling = ((ModSaplingBlock) UnderworldBlocks.LAUREL_SAPLING.get());
        register(context, TREE_LAUREL_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(UnderworldBlocks.LAUREL_LOG.get()),
                new StraightTrunkPlacer(5, 4, 3),
                BlockStateProvider.simple(UnderworldBlocks.LAUREL_LEAVES.get()),
                new BlobFoliagePlacer(ConstantInt.of(3), ConstantInt.of(2), 3),
                new TwoLayersFeatureSize(1, 0, 2)
        )
                .dirt(BlockStateProvider.simple(laurelSapling.getBlock(0)))
                .dirt(BlockStateProvider.simple(laurelSapling.getBlock(1)))
                .dirt(BlockStateProvider.simple(laurelSapling.getBlock(2)))
                .build());

        ModSaplingBlock cypressSapling = ((ModSaplingBlock) UnderworldBlocks.CYPRESS_SAPLING.get());
        register(context, TREE_CYPRESS_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(UnderworldBlocks.CYPRESS_LOG.get()),
                new StraightTrunkPlacer(5, 4, 3),
                BlockStateProvider.simple(UnderworldBlocks.CYPRESS_LEAVES.get()),
                new BlobFoliagePlacer(ConstantInt.of(3), ConstantInt.of(2), 3),
                new TwoLayersFeatureSize(1, 0, 2)
        )
                .dirt(BlockStateProvider.simple(cypressSapling.getBlock(0)))
                .dirt(BlockStateProvider.simple(cypressSapling.getBlock(1)))
                .dirt(BlockStateProvider.simple(cypressSapling.getBlock(2)))
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

    private static <FC extends FeatureConfiguration, F extends Feature<FC>> void register(BootstapContext<ConfiguredFeature<?, ?>> context,
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
