package net.sen.lostworlds.worldgen.features;

import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.structure.templatesystem.BlockMatchTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.TagMatchTest;
import net.sen.lostworlds.LostWorldsApi;

import java.util.List;

public class ModDecorFeatures {
    //Stones
    public static final ResourceKey<ConfiguredFeature<?, ?>> ALFHEIMR_SMALL_ANDESITE_KEY = registerKey("alfheimr_small_andesite");
    public static final ResourceKey<ConfiguredFeature<?, ?>> ALFHEIMR_SMALL_DIORITE_KEY = registerKey("alfheimr_small_diorite");
    public static final ResourceKey<ConfiguredFeature<?, ?>> ALFHEIMR_SMALL_GRANITE_KEY = registerKey("alfheimr_small_granite");

    public static void bootstrap(BootstapContext<ConfiguredFeature<?, ?>> context) {
        RuleTest stoneReplaceables = new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES);
        RuleTest deepslateReplaceables = new TagMatchTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);
        RuleTest netherrackReplaceables = new BlockMatchTest(Blocks.NETHERRACK);
        RuleTest endstoneReplaceables = new BlockMatchTest(Blocks.END_STONE);

        List<OreConfiguration.TargetBlockState> alfheimrAndesiteOres = List.of(
                OreConfiguration.target(stoneReplaceables, Blocks.ANDESITE.defaultBlockState())
        );

        List<OreConfiguration.TargetBlockState> alfheimrDioriteOres = List.of(
                OreConfiguration.target(stoneReplaceables, Blocks.DIORITE.defaultBlockState())
        );

        List<OreConfiguration.TargetBlockState> alfheimrGraniteOres = List.of(
                OreConfiguration.target(stoneReplaceables, Blocks.GRANITE.defaultBlockState())
        );

        register(context, ALFHEIMR_SMALL_ANDESITE_KEY, Feature.ORE, new OreConfiguration(alfheimrAndesiteOres, 10));
        register(context, ALFHEIMR_SMALL_DIORITE_KEY, Feature.ORE, new OreConfiguration(alfheimrDioriteOres, 10));
        register(context, ALFHEIMR_SMALL_GRANITE_KEY, Feature.ORE, new OreConfiguration(alfheimrGraniteOres, 10));

    }

    public static ResourceKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return ResourceKey.create(Registries.CONFIGURED_FEATURE, LostWorldsApi.modLoc(name));
    }

    private static <FC extends FeatureConfiguration, F extends Feature<FC>> void register(BootstapContext<ConfiguredFeature<?, ?>> context,
                                                                                          ResourceKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}
