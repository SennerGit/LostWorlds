package net.sen.lostworlds.worldgen.features;

import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.resources.ResourceKey;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.RandomPatchConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.SimpleBlockConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.TreeConfiguration;
import net.minecraft.world.level.levelgen.feature.featuresize.TwoLayersFeatureSize;
import net.minecraft.world.level.levelgen.feature.foliageplacers.BlobFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.feature.trunkplacers.StraightTrunkPlacer;
import net.sen.lostworlds.LostWorldsConstants;
import net.sen.lostworlds.block.ModBlocks;
import net.sen.lostworlds.block.custom.ModSaplingBlock;

public class ModVegetationFeatures {
    //Trees
    public static final ResourceKey<ConfiguredFeature<?, ?>> TREE_ELDER_WOOD_KEY = registerKey("tree_elder_wood");
    public static final ResourceKey<ConfiguredFeature<?, ?>> TREE_OLIVE_KEY = registerKey("tree_olive");
    public static final ResourceKey<ConfiguredFeature<?, ?>> TREE_MYRRH_KEY = registerKey("tree_myrrh");
    public static final ResourceKey<ConfiguredFeature<?, ?>> TREE_LAUREL_KEY = registerKey("tree_laurel");
    public static final ResourceKey<ConfiguredFeature<?, ?>> TREE_CYPRESS_KEY = registerKey("tree_cypress");

    //Flowers
    public static final ResourceKey<ConfiguredFeature<?, ?>> FLOWER_IRIS_KEY = registerKey("flower_iris");

    public static void bootstrap(BootstapContext<ConfiguredFeature<?, ?>> context) {
        ModSaplingBlock elderWoodSapling = ((ModSaplingBlock) ModBlocks.ELDER_WOOD_SAPLING.get());
        register(context, TREE_ELDER_WOOD_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.ELDER_WOOD_LOG.get()),
                new StraightTrunkPlacer(5, 4, 3),
                BlockStateProvider.simple(ModBlocks.ELDER_WOOD_LEAVES.get()),
                new BlobFoliagePlacer(ConstantInt.of(3), ConstantInt.of(2), 3),
                new TwoLayersFeatureSize(1, 0, 2)
        )
                .dirt(BlockStateProvider.simple(elderWoodSapling.getBlock(0)))
                .dirt(BlockStateProvider.simple(elderWoodSapling.getBlock(1)))
                .dirt(BlockStateProvider.simple(elderWoodSapling.getBlock(2)))
                .build());

        ModSaplingBlock oliveSapling = ((ModSaplingBlock) ModBlocks.OLIVE_SAPLING.get());
        register(context, TREE_OLIVE_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.OLIVE_LOG.get()),
                new StraightTrunkPlacer(5, 4, 3),
                BlockStateProvider.simple(ModBlocks.OLIVE_LEAVES.get()),
                new BlobFoliagePlacer(ConstantInt.of(3), ConstantInt.of(2), 3),
                new TwoLayersFeatureSize(1, 0, 2)
        )
                .dirt(BlockStateProvider.simple(oliveSapling.getBlock(0)))
                .dirt(BlockStateProvider.simple(oliveSapling.getBlock(1)))
                .dirt(BlockStateProvider.simple(oliveSapling.getBlock(2)))
                .build());

        ModSaplingBlock myrrhSapling = ((ModSaplingBlock) ModBlocks.MYRRH_SAPLING.get());
        register(context, TREE_MYRRH_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.MYRRH_LOG.get()),
                new StraightTrunkPlacer(5, 4, 3),
                BlockStateProvider.simple(ModBlocks.MYRRH_LEAVES.get()),
                new BlobFoliagePlacer(ConstantInt.of(3), ConstantInt.of(2), 3),
                new TwoLayersFeatureSize(1, 0, 2)
        )
                .dirt(BlockStateProvider.simple(myrrhSapling.getBlock(0)))
                .dirt(BlockStateProvider.simple(myrrhSapling.getBlock(1)))
                .dirt(BlockStateProvider.simple(myrrhSapling.getBlock(2)))
                .build());

        ModSaplingBlock laurelSapling = ((ModSaplingBlock) ModBlocks.LAUREL_SAPLING.get());
        register(context, TREE_LAUREL_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.LAUREL_LOG.get()),
                new StraightTrunkPlacer(5, 4, 3),
                BlockStateProvider.simple(ModBlocks.LAUREL_LEAVES.get()),
                new BlobFoliagePlacer(ConstantInt.of(3), ConstantInt.of(2), 3),
                new TwoLayersFeatureSize(1, 0, 2)
        )
                .dirt(BlockStateProvider.simple(laurelSapling.getBlock(0)))
                .dirt(BlockStateProvider.simple(laurelSapling.getBlock(1)))
                .dirt(BlockStateProvider.simple(laurelSapling.getBlock(2)))
                .build());

        ModSaplingBlock cypressSapling = ((ModSaplingBlock) ModBlocks.CYPRESS_SAPLING.get());
        register(context, TREE_CYPRESS_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.CYPRESS_LOG.get()),
                new StraightTrunkPlacer(5, 4, 3),
                BlockStateProvider.simple(ModBlocks.CYPRESS_LEAVES.get()),
                new BlobFoliagePlacer(ConstantInt.of(3), ConstantInt.of(2), 3),
                new TwoLayersFeatureSize(1, 0, 2)
        )
                .dirt(BlockStateProvider.simple(cypressSapling.getBlock(0)))
                .dirt(BlockStateProvider.simple(cypressSapling.getBlock(1)))
                .dirt(BlockStateProvider.simple(cypressSapling.getBlock(2)))
                .build());

        register(context, FLOWER_IRIS_KEY, Feature.FLOWER,
                new RandomPatchConfiguration(32, 6, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.IRIS_FLOWER.get())))));
    }

    public static ResourceKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return ResourceKey.create(Registries.CONFIGURED_FEATURE, LostWorldsConstants.modLoc(name));
    }

    private static <FC extends FeatureConfiguration, F extends Feature<FC>> void register(BootstapContext<ConfiguredFeature<?, ?>> context,
                                                                                          ResourceKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}
