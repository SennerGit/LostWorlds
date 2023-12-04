package net.sen.lostworlds.worldgen;

import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.*;
import net.minecraft.world.level.levelgen.feature.featuresize.TwoLayersFeatureSize;
import net.minecraft.world.level.levelgen.feature.foliageplacers.BlobFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.feature.trunkplacers.StraightTrunkPlacer;
import net.minecraft.world.level.levelgen.structure.templatesystem.BlockMatchTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.TagMatchTest;
import net.minecraftforge.common.Tags;
import net.sen.lostworlds.LostWorlds;
import net.sen.lostworlds.block.ModBlocks;
import net.sen.lostworlds.block.custom.ModSaplingBlock;

import java.util.List;

public class ModConfiguredFeatures {
    public static final ResourceKey<ConfiguredFeature<?, ?>> ELDER_WOOD_KEY = registerKey("elder_wood");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OLIVE_KEY = registerKey("olive");
    public static final ResourceKey<ConfiguredFeature<?, ?>> MYRRH_KEY = registerKey("myrrh");
    public static final ResourceKey<ConfiguredFeature<?, ?>> LAUREL_KEY = registerKey("laurel");
    public static final ResourceKey<ConfiguredFeature<?, ?>> CYPRESS_KEY = registerKey("cypress");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_TIN_ORE_KEY = registerKey("overworld_tin_ore_key");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_IRIS_KEY = registerKey("overworld_iris_key");

    public static void bootstrap(BootstapContext<ConfiguredFeature<?, ?>> context) {
        RuleTest stoneReplaceables = new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES);
        RuleTest deepslateReplaceables = new TagMatchTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);
        RuleTest netherrackReplaceables = new BlockMatchTest(Blocks.NETHERRACK);
        RuleTest endstoneReplaceables = new BlockMatchTest(Blocks.END_STONE);

        List<OreConfiguration.TargetBlockState> overworldTinOres = List.of(
                OreConfiguration.target(stoneReplaceables, ModBlocks.TIN_ORE.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceables, ModBlocks.DEEPSLATE_TIN_ORE.get().defaultBlockState())
        );

        ModSaplingBlock elderWoodSapling = ((ModSaplingBlock) ModBlocks.ELDER_WOOD_SAPLING.get());
        register(context, ELDER_WOOD_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
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
        register(context, OLIVE_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
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
        register(context, MYRRH_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
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
        register(context, LAUREL_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
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
        register(context, CYPRESS_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
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

        register(context, OVERWORLD_TIN_ORE_KEY, Feature.ORE, new OreConfiguration(overworldTinOres, 10));

        register(context, OVERWORLD_IRIS_KEY, Feature.FLOWER,
                new RandomPatchConfiguration(32, 6, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.IRIS_FLOWER.get())))));
//        register(context, OVERWORLD_TIN_ORE_KEY, Feature.ORE, new OreConfiguration(overworldTinOres, 20));
    }

    public static ResourceKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return ResourceKey.create(Registries.CONFIGURED_FEATURE, new ResourceLocation(LostWorlds.MODID, name));
    }

    private static <FC extends FeatureConfiguration, F extends Feature<FC>> void register(BootstapContext<ConfiguredFeature<?, ?>> context,
                                                                                          ResourceKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }

}
