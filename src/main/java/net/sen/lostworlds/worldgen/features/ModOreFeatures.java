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
import net.sen.lostworlds.LostWorldsConstants;
import net.sen.lostworlds.block.ModBlocks;

import java.util.List;

public class ModOreFeatures {
    //Ores!
    public static final ResourceKey<ConfiguredFeature<?, ?>> ALFHEIMR_COAL_ORE_KEY = registerKey("alfheimr_coal_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> ALFHEIMR_IRON_ORE_KEY = registerKey("alfheimr_iron_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> ALFHEIMR_GOLD_ORE_KEY = registerKey("alfheimr_gold_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> ALFHEIMR_REDSTONE_ORE_KEY = registerKey("alfheimr_redstone_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> ALFHEIMR_DIAMOND_ORE_KEY = registerKey("alfheimr_diamond_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> ALFHEIMR_LAPIS_ORE_KEY = registerKey("alfheimr_lapis_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> ALFHEIMR_COPPER_ORE_KEY = registerKey("alfheimr_copper_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> ALFHEIMR_TIN_ORE_KEY = registerKey("alfheimr_tin_ore");

    public static void bootstrap(BootstapContext<ConfiguredFeature<?, ?>> context) {
        RuleTest stoneReplaceables = new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES);
        RuleTest deepslateReplaceables = new TagMatchTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);
        RuleTest netherrackReplaceables = new BlockMatchTest(Blocks.NETHERRACK);
        RuleTest endstoneReplaceables = new BlockMatchTest(Blocks.END_STONE);

        List<OreConfiguration.TargetBlockState> overworldTinOres = List.of(
                OreConfiguration.target(stoneReplaceables, ModBlocks.TIN_ORE.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceables, ModBlocks.DEEPSLATE_TIN_ORE.get().defaultBlockState())
        );

        List<OreConfiguration.TargetBlockState> alfheimrCoalOres = List.of(
                OreConfiguration.target(stoneReplaceables, Blocks.COAL_ORE.defaultBlockState())
        );

        List<OreConfiguration.TargetBlockState> alfheimrIronOres = List.of(
                OreConfiguration.target(stoneReplaceables, Blocks.IRON_ORE.defaultBlockState())
        );

        List<OreConfiguration.TargetBlockState> alfheimrGoldOres = List.of(
                OreConfiguration.target(stoneReplaceables, Blocks.GOLD_ORE.defaultBlockState())
        );

        List<OreConfiguration.TargetBlockState> alfheimrRedstoneOres = List.of(
                OreConfiguration.target(stoneReplaceables, Blocks.REDSTONE_ORE.defaultBlockState())
        );

        List<OreConfiguration.TargetBlockState> alfheimrDiamondOres = List.of(
                OreConfiguration.target(stoneReplaceables, Blocks.DIAMOND_ORE.defaultBlockState())
        );

        List<OreConfiguration.TargetBlockState> alfheimrLapisOres = List.of(
                OreConfiguration.target(stoneReplaceables, Blocks.LAPIS_ORE.defaultBlockState())
        );

        List<OreConfiguration.TargetBlockState> alfheimrCopperOres = List.of(
                OreConfiguration.target(stoneReplaceables, Blocks.COPPER_ORE.defaultBlockState())
        );

        register(context, ALFHEIMR_TIN_ORE_KEY, Feature.ORE, new OreConfiguration(overworldTinOres, 10));
        register(context, ALFHEIMR_COAL_ORE_KEY, Feature.ORE, new OreConfiguration(alfheimrCoalOres, 10));
        register(context, ALFHEIMR_IRON_ORE_KEY, Feature.ORE, new OreConfiguration(alfheimrIronOres, 10));
        register(context, ALFHEIMR_GOLD_ORE_KEY, Feature.ORE, new OreConfiguration(alfheimrGoldOres, 10));
        register(context, ALFHEIMR_REDSTONE_ORE_KEY, Feature.ORE, new OreConfiguration(alfheimrRedstoneOres, 10));
        register(context, ALFHEIMR_DIAMOND_ORE_KEY, Feature.ORE, new OreConfiguration(alfheimrDiamondOres, 10));
        register(context, ALFHEIMR_LAPIS_ORE_KEY, Feature.ORE, new OreConfiguration(alfheimrLapisOres, 10));
        register(context, ALFHEIMR_COPPER_ORE_KEY, Feature.ORE, new OreConfiguration(alfheimrCopperOres, 10));

    }

    public static ResourceKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return ResourceKey.create(Registries.CONFIGURED_FEATURE, LostWorldsConstants.modLoc(name));
    }

    private static <FC extends FeatureConfiguration, F extends Feature<FC>> void register(BootstapContext<ConfiguredFeature<?, ?>> context,
                                                                                          ResourceKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}
