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
    
    public static final ResourceKey<ConfiguredFeature<?, ?>> NIDAVELLIR_COAL_ORE_KEY = registerKey("nidavellir_coal_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> NIDAVELLIR_COAL_ORE_CLUSTER_KEY = registerKey("nidavellir_coal_ore_cluster");
    public static final ResourceKey<ConfiguredFeature<?, ?>> NIDAVELLIR_IRON_ORE_KEY = registerKey("nidavellir_iron_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> NIDAVELLIR_IRON_ORE_CLUSTER_KEY = registerKey("nidavellir_iron_ore_cluster");
    public static final ResourceKey<ConfiguredFeature<?, ?>> NIDAVELLIR_GOLD_ORE_KEY = registerKey("nidavellir_gold_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> NIDAVELLIR_GOLD_ORE_CLUSTER_KEY = registerKey("nidavellir_gold_ore_cluster");
    public static final ResourceKey<ConfiguredFeature<?, ?>> NIDAVELLIR_REDSTONE_ORE_KEY = registerKey("nidavellir_redstone_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> NIDAVELLIR_REDSTONE_ORE_CLUSTER_KEY = registerKey("nidavellir_redstone_ore_cluster");
    public static final ResourceKey<ConfiguredFeature<?, ?>> NIDAVELLIR_DIAMOND_ORE_KEY = registerKey("nidavellir_diamond_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> NIDAVELLIR_DIAMOND_ORE_CLUSTER_KEY = registerKey("nidavellir_diamond_ore_cluster");
    public static final ResourceKey<ConfiguredFeature<?, ?>> NIDAVELLIR_LAPIS_ORE_KEY = registerKey("nidavellir_lapis_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> NIDAVELLIR_LAPIS_ORE_CLUSTER_KEY = registerKey("nidavellir_lapis_ore_cluster");
    public static final ResourceKey<ConfiguredFeature<?, ?>> NIDAVELLIR_COPPER_ORE_KEY = registerKey("nidavellir_copper_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> NIDAVELLIR_COPPER_ORE_CLUSTER_KEY = registerKey("nidavellir_copper_ore_cluster");
    public static final ResourceKey<ConfiguredFeature<?, ?>> NIDAVELLIR_TIN_ORE_KEY = registerKey("nidavellir_tin_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> NIDAVELLIR_TIN_ORE_CLUSTER_KEY = registerKey("nidavellir_tin_ore_cluster");
    public static final ResourceKey<ConfiguredFeature<?, ?>> NIDAVELLIR_ZINC_ORE_KEY = registerKey("nidavellir_zinc_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> NIDAVELLIR_ZINC_ORE_CLUSTER_KEY = registerKey("nidavellir_zinc_ore_cluster");
    public static final ResourceKey<ConfiguredFeature<?, ?>> NIDAVELLIR_AQUAMARINE_ORE_KEY = registerKey("nidavellir_aquamarine_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> NIDAVELLIR_AQUAMARINE_ORE_CLUSTER_KEY = registerKey("nidavellir_aquamarine_ore_cluster");
    public static final ResourceKey<ConfiguredFeature<?, ?>> NIDAVELLIR_OPAL_ORE_KEY = registerKey("nidavellir_opal_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> NIDAVELLIR_OPAL_ORE_CLUSTER_KEY = registerKey("nidavellir_opal_ore_cluster");
    public static final ResourceKey<ConfiguredFeature<?, ?>> NIDAVELLIR_RUBY_ORE_KEY = registerKey("nidavellir_ruby_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> NIDAVELLIR_RUBY_ORE_CLUSTER_KEY = registerKey("nidavellir_ruby_ore_cluster");

    public static void bootstrap(BootstapContext<ConfiguredFeature<?, ?>> context) {
        RuleTest stoneReplaceables = new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES);
        RuleTest deepslateReplaceables = new TagMatchTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);
        RuleTest netherrackReplaceables = new BlockMatchTest(Blocks.NETHERRACK);
        RuleTest endstoneReplaceables = new BlockMatchTest(Blocks.END_STONE);
        RuleTest softStoneReplaceables = new BlockMatchTest(ModBlocks.NIDAVELLIR_SOFT_STONE.get());
        RuleTest hardStoneReplaceables = new BlockMatchTest(ModBlocks.NIDAVELLIR_HARD_STONE.get());
        RuleTest enhancedStoneReplaceables = new BlockMatchTest(ModBlocks.NIDAVELLIR_ENHANCED_STONE.get());
        RuleTest deepslateStoneReplaceables = new BlockMatchTest(ModBlocks.NIDAVELLIR_DEEPSLATE_STONE.get());
        RuleTest crimsonStoneReplaceables = new BlockMatchTest(ModBlocks.NIDAVELLIR_CRIMSON_STONE.get());
        
        //ALFHEIMR
        List<OreConfiguration.TargetBlockState> alfheimrTinOres = List.of(
                OreConfiguration.target(stoneReplaceables, ModBlocks.TIN_ORE.get().defaultBlockState())
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
        
        //NIDAVELLIR
        List<OreConfiguration.TargetBlockState> nidavellirTinOres = List.of(
                OreConfiguration.target(softStoneReplaceables, ModBlocks.NIDAVELLIR_SOFT_STONE_TIN_ORE.get().defaultBlockState()),
                OreConfiguration.target(hardStoneReplaceables, ModBlocks.NIDAVELLIR_HARD_STONE_TIN_ORE.get().defaultBlockState()),
                OreConfiguration.target(enhancedStoneReplaceables, ModBlocks.NIDAVELLIR_ENHANCED_STONE_TIN_ORE.get().defaultBlockState()),
                OreConfiguration.target(deepslateStoneReplaceables, ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_TIN_ORE.get().defaultBlockState()),
                OreConfiguration.target(crimsonStoneReplaceables, ModBlocks.NIDAVELLIR_CRIMSON_STONE_TIN_ORE.get().defaultBlockState())
        );
        
        List<OreConfiguration.TargetBlockState> nidavellirTinOreClusters = List.of(
                OreConfiguration.target(softStoneReplaceables, ModBlocks.NIDAVELLIR_SOFT_STONE_TIN_ORE_CLUSTER.get().defaultBlockState()),
                OreConfiguration.target(hardStoneReplaceables, ModBlocks.NIDAVELLIR_HARD_STONE_TIN_ORE_CLUSTER.get().defaultBlockState()),
                OreConfiguration.target(enhancedStoneReplaceables, ModBlocks.NIDAVELLIR_ENHANCED_STONE_TIN_ORE_CLUSTER.get().defaultBlockState()),
                OreConfiguration.target(deepslateStoneReplaceables, ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_TIN_ORE_CLUSTER.get().defaultBlockState()),
                OreConfiguration.target(crimsonStoneReplaceables, ModBlocks.NIDAVELLIR_CRIMSON_STONE_TIN_ORE_CLUSTER.get().defaultBlockState())
        );

        List<OreConfiguration.TargetBlockState> nidavellirZincOres = List.of(
                OreConfiguration.target(softStoneReplaceables, ModBlocks.NIDAVELLIR_SOFT_STONE_ZINC_ORE.get().defaultBlockState()),
                OreConfiguration.target(hardStoneReplaceables, ModBlocks.NIDAVELLIR_HARD_STONE_ZINC_ORE.get().defaultBlockState()),
                OreConfiguration.target(enhancedStoneReplaceables, ModBlocks.NIDAVELLIR_ENHANCED_STONE_ZINC_ORE.get().defaultBlockState()),
                OreConfiguration.target(deepslateStoneReplaceables, ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_ZINC_ORE.get().defaultBlockState()),
                OreConfiguration.target(crimsonStoneReplaceables, ModBlocks.NIDAVELLIR_CRIMSON_STONE_ZINC_ORE.get().defaultBlockState())
        );

        List<OreConfiguration.TargetBlockState> nidavellirZincOreClusters = List.of(
                OreConfiguration.target(softStoneReplaceables, ModBlocks.NIDAVELLIR_SOFT_STONE_ZINC_ORE_CLUSTER.get().defaultBlockState()),
                OreConfiguration.target(hardStoneReplaceables, ModBlocks.NIDAVELLIR_HARD_STONE_ZINC_ORE_CLUSTER.get().defaultBlockState()),
                OreConfiguration.target(enhancedStoneReplaceables, ModBlocks.NIDAVELLIR_ENHANCED_STONE_ZINC_ORE_CLUSTER.get().defaultBlockState()),
                OreConfiguration.target(deepslateStoneReplaceables, ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_ZINC_ORE_CLUSTER.get().defaultBlockState()),
                OreConfiguration.target(crimsonStoneReplaceables, ModBlocks.NIDAVELLIR_CRIMSON_STONE_ZINC_ORE_CLUSTER.get().defaultBlockState())
        );

        List<OreConfiguration.TargetBlockState> nidavellirCoalOres = List.of(
                OreConfiguration.target(softStoneReplaceables, ModBlocks.NIDAVELLIR_SOFT_STONE_COAL_ORE.get().defaultBlockState()),
                OreConfiguration.target(hardStoneReplaceables, ModBlocks.NIDAVELLIR_HARD_STONE_COAL_ORE.get().defaultBlockState()),
                OreConfiguration.target(enhancedStoneReplaceables, ModBlocks.NIDAVELLIR_ENHANCED_STONE_COAL_ORE.get().defaultBlockState()),
                OreConfiguration.target(deepslateStoneReplaceables, ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_COAL_ORE.get().defaultBlockState()),
                OreConfiguration.target(crimsonStoneReplaceables, ModBlocks.NIDAVELLIR_CRIMSON_STONE_COAL_ORE.get().defaultBlockState())
        );

        List<OreConfiguration.TargetBlockState> nidavellirCoalOreClusters = List.of(
                OreConfiguration.target(softStoneReplaceables, ModBlocks.NIDAVELLIR_SOFT_STONE_COAL_ORE_CLUSTER.get().defaultBlockState()),
                OreConfiguration.target(hardStoneReplaceables, ModBlocks.NIDAVELLIR_HARD_STONE_COAL_ORE_CLUSTER.get().defaultBlockState()),
                OreConfiguration.target(enhancedStoneReplaceables, ModBlocks.NIDAVELLIR_ENHANCED_STONE_COAL_ORE_CLUSTER.get().defaultBlockState()),
                OreConfiguration.target(deepslateStoneReplaceables, ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_COAL_ORE_CLUSTER.get().defaultBlockState()),
                OreConfiguration.target(crimsonStoneReplaceables, ModBlocks.NIDAVELLIR_CRIMSON_STONE_COAL_ORE_CLUSTER.get().defaultBlockState())
        );

        List<OreConfiguration.TargetBlockState> nidavellirIronOres = List.of(
                OreConfiguration.target(softStoneReplaceables, ModBlocks.NIDAVELLIR_SOFT_STONE_IRON_ORE.get().defaultBlockState()),
                OreConfiguration.target(hardStoneReplaceables, ModBlocks.NIDAVELLIR_HARD_STONE_IRON_ORE.get().defaultBlockState()),
                OreConfiguration.target(enhancedStoneReplaceables, ModBlocks.NIDAVELLIR_ENHANCED_STONE_IRON_ORE.get().defaultBlockState()),
                OreConfiguration.target(deepslateStoneReplaceables, ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_IRON_ORE.get().defaultBlockState()),
                OreConfiguration.target(crimsonStoneReplaceables, ModBlocks.NIDAVELLIR_CRIMSON_STONE_IRON_ORE.get().defaultBlockState())
        );

        List<OreConfiguration.TargetBlockState> nidavellirIronOreClusters = List.of(
                OreConfiguration.target(softStoneReplaceables, ModBlocks.NIDAVELLIR_SOFT_STONE_IRON_ORE_CLUSTER.get().defaultBlockState()),
                OreConfiguration.target(hardStoneReplaceables, ModBlocks.NIDAVELLIR_HARD_STONE_IRON_ORE_CLUSTER.get().defaultBlockState()),
                OreConfiguration.target(enhancedStoneReplaceables, ModBlocks.NIDAVELLIR_ENHANCED_STONE_IRON_ORE_CLUSTER.get().defaultBlockState()),
                OreConfiguration.target(deepslateStoneReplaceables, ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_IRON_ORE_CLUSTER.get().defaultBlockState()),
                OreConfiguration.target(crimsonStoneReplaceables, ModBlocks.NIDAVELLIR_CRIMSON_STONE_IRON_ORE_CLUSTER.get().defaultBlockState())
        );

        List<OreConfiguration.TargetBlockState> nidavellirGoldOres = List.of(
                OreConfiguration.target(softStoneReplaceables, ModBlocks.NIDAVELLIR_SOFT_STONE_GOLD_ORE.get().defaultBlockState()),
                OreConfiguration.target(hardStoneReplaceables, ModBlocks.NIDAVELLIR_HARD_STONE_GOLD_ORE.get().defaultBlockState()),
                OreConfiguration.target(enhancedStoneReplaceables, ModBlocks.NIDAVELLIR_ENHANCED_STONE_GOLD_ORE.get().defaultBlockState()),
                OreConfiguration.target(deepslateStoneReplaceables, ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_GOLD_ORE.get().defaultBlockState()),
                OreConfiguration.target(crimsonStoneReplaceables, ModBlocks.NIDAVELLIR_CRIMSON_STONE_GOLD_ORE.get().defaultBlockState())
        );

        List<OreConfiguration.TargetBlockState> nidavellirGoldOreClusters = List.of(
                OreConfiguration.target(softStoneReplaceables, ModBlocks.NIDAVELLIR_SOFT_STONE_GOLD_ORE_CLUSTER.get().defaultBlockState()),
                OreConfiguration.target(hardStoneReplaceables, ModBlocks.NIDAVELLIR_HARD_STONE_GOLD_ORE_CLUSTER.get().defaultBlockState()),
                OreConfiguration.target(enhancedStoneReplaceables, ModBlocks.NIDAVELLIR_ENHANCED_STONE_GOLD_ORE_CLUSTER.get().defaultBlockState()),
                OreConfiguration.target(deepslateStoneReplaceables, ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_GOLD_ORE_CLUSTER.get().defaultBlockState()),
                OreConfiguration.target(crimsonStoneReplaceables, ModBlocks.NIDAVELLIR_CRIMSON_STONE_GOLD_ORE_CLUSTER.get().defaultBlockState())
        );

        List<OreConfiguration.TargetBlockState> nidavellirRedstoneOres = List.of(
                OreConfiguration.target(softStoneReplaceables, ModBlocks.NIDAVELLIR_SOFT_STONE_REDSTONE_ORE.get().defaultBlockState()),
                OreConfiguration.target(hardStoneReplaceables, ModBlocks.NIDAVELLIR_HARD_STONE_REDSTONE_ORE.get().defaultBlockState()),
                OreConfiguration.target(enhancedStoneReplaceables, ModBlocks.NIDAVELLIR_ENHANCED_STONE_REDSTONE_ORE.get().defaultBlockState()),
                OreConfiguration.target(deepslateStoneReplaceables, ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_REDSTONE_ORE.get().defaultBlockState()),
                OreConfiguration.target(crimsonStoneReplaceables, ModBlocks.NIDAVELLIR_CRIMSON_STONE_REDSTONE_ORE.get().defaultBlockState())
        );

        List<OreConfiguration.TargetBlockState> nidavellirRedstoneOreClusters = List.of(
                OreConfiguration.target(softStoneReplaceables, ModBlocks.NIDAVELLIR_SOFT_STONE_REDSTONE_ORE_CLUSTER.get().defaultBlockState()),
                OreConfiguration.target(hardStoneReplaceables, ModBlocks.NIDAVELLIR_HARD_STONE_REDSTONE_ORE_CLUSTER.get().defaultBlockState()),
                OreConfiguration.target(enhancedStoneReplaceables, ModBlocks.NIDAVELLIR_ENHANCED_STONE_REDSTONE_ORE_CLUSTER.get().defaultBlockState()),
                OreConfiguration.target(deepslateStoneReplaceables, ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_REDSTONE_ORE_CLUSTER.get().defaultBlockState()),
                OreConfiguration.target(crimsonStoneReplaceables, ModBlocks.NIDAVELLIR_CRIMSON_STONE_REDSTONE_ORE_CLUSTER.get().defaultBlockState())
        );

        List<OreConfiguration.TargetBlockState> nidavellirDiamondOres = List.of(
                OreConfiguration.target(softStoneReplaceables, ModBlocks.NIDAVELLIR_SOFT_STONE_DIAMOND_ORE.get().defaultBlockState()),
                OreConfiguration.target(hardStoneReplaceables, ModBlocks.NIDAVELLIR_HARD_STONE_DIAMOND_ORE.get().defaultBlockState()),
                OreConfiguration.target(enhancedStoneReplaceables, ModBlocks.NIDAVELLIR_ENHANCED_STONE_DIAMOND_ORE.get().defaultBlockState()),
                OreConfiguration.target(deepslateStoneReplaceables, ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_DIAMOND_ORE.get().defaultBlockState()),
                OreConfiguration.target(crimsonStoneReplaceables, ModBlocks.NIDAVELLIR_CRIMSON_STONE_DIAMOND_ORE.get().defaultBlockState())
        );

        List<OreConfiguration.TargetBlockState> nidavellirDiamondOreClusters = List.of(
                OreConfiguration.target(softStoneReplaceables, ModBlocks.NIDAVELLIR_SOFT_STONE_DIAMOND_ORE_CLUSTER.get().defaultBlockState()),
                OreConfiguration.target(hardStoneReplaceables, ModBlocks.NIDAVELLIR_HARD_STONE_DIAMOND_ORE_CLUSTER.get().defaultBlockState()),
                OreConfiguration.target(enhancedStoneReplaceables, ModBlocks.NIDAVELLIR_ENHANCED_STONE_DIAMOND_ORE_CLUSTER.get().defaultBlockState()),
                OreConfiguration.target(deepslateStoneReplaceables, ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_DIAMOND_ORE_CLUSTER.get().defaultBlockState()),
                OreConfiguration.target(crimsonStoneReplaceables, ModBlocks.NIDAVELLIR_CRIMSON_STONE_DIAMOND_ORE_CLUSTER.get().defaultBlockState())
        );

        List<OreConfiguration.TargetBlockState> nidavellirLapisOres = List.of(
                OreConfiguration.target(softStoneReplaceables, ModBlocks.NIDAVELLIR_SOFT_STONE_LAPIS_ORE.get().defaultBlockState()),
                OreConfiguration.target(hardStoneReplaceables, ModBlocks.NIDAVELLIR_HARD_STONE_LAPIS_ORE.get().defaultBlockState()),
                OreConfiguration.target(enhancedStoneReplaceables, ModBlocks.NIDAVELLIR_ENHANCED_STONE_LAPIS_ORE.get().defaultBlockState()),
                OreConfiguration.target(deepslateStoneReplaceables, ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_LAPIS_ORE.get().defaultBlockState()),
                OreConfiguration.target(crimsonStoneReplaceables, ModBlocks.NIDAVELLIR_CRIMSON_STONE_LAPIS_ORE.get().defaultBlockState())
        );

        List<OreConfiguration.TargetBlockState> nidavellirLapisOreClusters = List.of(
                OreConfiguration.target(softStoneReplaceables, ModBlocks.NIDAVELLIR_SOFT_STONE_LAPIS_ORE_CLUSTER.get().defaultBlockState()),
                OreConfiguration.target(hardStoneReplaceables, ModBlocks.NIDAVELLIR_HARD_STONE_LAPIS_ORE_CLUSTER.get().defaultBlockState()),
                OreConfiguration.target(enhancedStoneReplaceables, ModBlocks.NIDAVELLIR_ENHANCED_STONE_LAPIS_ORE_CLUSTER.get().defaultBlockState()),
                OreConfiguration.target(deepslateStoneReplaceables, ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_LAPIS_ORE_CLUSTER.get().defaultBlockState()),
                OreConfiguration.target(crimsonStoneReplaceables, ModBlocks.NIDAVELLIR_CRIMSON_STONE_LAPIS_ORE_CLUSTER.get().defaultBlockState())
        );

        List<OreConfiguration.TargetBlockState> nidavellirCopperOres = List.of(
                OreConfiguration.target(softStoneReplaceables, ModBlocks.NIDAVELLIR_SOFT_STONE_COPPER_ORE.get().defaultBlockState()),
                OreConfiguration.target(hardStoneReplaceables, ModBlocks.NIDAVELLIR_HARD_STONE_COPPER_ORE.get().defaultBlockState()),
                OreConfiguration.target(enhancedStoneReplaceables, ModBlocks.NIDAVELLIR_ENHANCED_STONE_COPPER_ORE.get().defaultBlockState()),
                OreConfiguration.target(deepslateStoneReplaceables, ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_COPPER_ORE.get().defaultBlockState()),
                OreConfiguration.target(crimsonStoneReplaceables, ModBlocks.NIDAVELLIR_CRIMSON_STONE_COPPER_ORE.get().defaultBlockState())
        );

        List<OreConfiguration.TargetBlockState> nidavellirCopperOreClusters = List.of(
                OreConfiguration.target(softStoneReplaceables, ModBlocks.NIDAVELLIR_SOFT_STONE_COPPER_ORE_CLUSTER.get().defaultBlockState()),
                OreConfiguration.target(hardStoneReplaceables, ModBlocks.NIDAVELLIR_HARD_STONE_COPPER_ORE_CLUSTER.get().defaultBlockState()),
                OreConfiguration.target(enhancedStoneReplaceables, ModBlocks.NIDAVELLIR_ENHANCED_STONE_COPPER_ORE_CLUSTER.get().defaultBlockState()),
                OreConfiguration.target(deepslateStoneReplaceables, ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_COPPER_ORE_CLUSTER.get().defaultBlockState()),
                OreConfiguration.target(crimsonStoneReplaceables, ModBlocks.NIDAVELLIR_CRIMSON_STONE_COPPER_ORE_CLUSTER.get().defaultBlockState())
        );

        List<OreConfiguration.TargetBlockState> nidavellirAquamarineOres = List.of(
                OreConfiguration.target(softStoneReplaceables, ModBlocks.NIDAVELLIR_SOFT_STONE_AQUAMARINE_ORE.get().defaultBlockState()),
                OreConfiguration.target(hardStoneReplaceables, ModBlocks.NIDAVELLIR_HARD_STONE_AQUAMARINE_ORE.get().defaultBlockState()),
                OreConfiguration.target(enhancedStoneReplaceables, ModBlocks.NIDAVELLIR_ENHANCED_STONE_AQUAMARINE_ORE.get().defaultBlockState()),
                OreConfiguration.target(deepslateStoneReplaceables, ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_AQUAMARINE_ORE.get().defaultBlockState()),
                OreConfiguration.target(crimsonStoneReplaceables, ModBlocks.NIDAVELLIR_CRIMSON_STONE_AQUAMARINE_ORE.get().defaultBlockState())
        );

        List<OreConfiguration.TargetBlockState> nidavellirAquamarineOreClusters = List.of(
                OreConfiguration.target(softStoneReplaceables, ModBlocks.NIDAVELLIR_SOFT_STONE_AQUAMARINE_ORE_CLUSTER.get().defaultBlockState()),
                OreConfiguration.target(hardStoneReplaceables, ModBlocks.NIDAVELLIR_HARD_STONE_AQUAMARINE_ORE_CLUSTER.get().defaultBlockState()),
                OreConfiguration.target(enhancedStoneReplaceables, ModBlocks.NIDAVELLIR_ENHANCED_STONE_AQUAMARINE_ORE_CLUSTER.get().defaultBlockState()),
                OreConfiguration.target(deepslateStoneReplaceables, ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_AQUAMARINE_ORE_CLUSTER.get().defaultBlockState()),
                OreConfiguration.target(crimsonStoneReplaceables, ModBlocks.NIDAVELLIR_CRIMSON_STONE_AQUAMARINE_ORE_CLUSTER.get().defaultBlockState())
        );

        List<OreConfiguration.TargetBlockState> nidavellirOpalOres = List.of(
                OreConfiguration.target(softStoneReplaceables, ModBlocks.NIDAVELLIR_SOFT_STONE_OPAL_ORE.get().defaultBlockState()),
                OreConfiguration.target(hardStoneReplaceables, ModBlocks.NIDAVELLIR_HARD_STONE_OPAL_ORE.get().defaultBlockState()),
                OreConfiguration.target(enhancedStoneReplaceables, ModBlocks.NIDAVELLIR_ENHANCED_STONE_OPAL_ORE.get().defaultBlockState()),
                OreConfiguration.target(deepslateStoneReplaceables, ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_OPAL_ORE.get().defaultBlockState()),
                OreConfiguration.target(crimsonStoneReplaceables, ModBlocks.NIDAVELLIR_CRIMSON_STONE_OPAL_ORE.get().defaultBlockState())
        );

        List<OreConfiguration.TargetBlockState> nidavellirOpalOreClusters = List.of(
                OreConfiguration.target(softStoneReplaceables, ModBlocks.NIDAVELLIR_SOFT_STONE_OPAL_ORE_CLUSTER.get().defaultBlockState()),
                OreConfiguration.target(hardStoneReplaceables, ModBlocks.NIDAVELLIR_HARD_STONE_OPAL_ORE_CLUSTER.get().defaultBlockState()),
                OreConfiguration.target(enhancedStoneReplaceables, ModBlocks.NIDAVELLIR_ENHANCED_STONE_OPAL_ORE_CLUSTER.get().defaultBlockState()),
                OreConfiguration.target(deepslateStoneReplaceables, ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_OPAL_ORE_CLUSTER.get().defaultBlockState()),
                OreConfiguration.target(crimsonStoneReplaceables, ModBlocks.NIDAVELLIR_CRIMSON_STONE_OPAL_ORE_CLUSTER.get().defaultBlockState())
        );

        List<OreConfiguration.TargetBlockState> nidavellirRubyOres = List.of(
                OreConfiguration.target(softStoneReplaceables, ModBlocks.NIDAVELLIR_SOFT_STONE_RUBY_ORE.get().defaultBlockState()),
                OreConfiguration.target(hardStoneReplaceables, ModBlocks.NIDAVELLIR_HARD_STONE_RUBY_ORE.get().defaultBlockState()),
                OreConfiguration.target(enhancedStoneReplaceables, ModBlocks.NIDAVELLIR_ENHANCED_STONE_RUBY_ORE.get().defaultBlockState()),
                OreConfiguration.target(deepslateStoneReplaceables, ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_RUBY_ORE.get().defaultBlockState()),
                OreConfiguration.target(crimsonStoneReplaceables, ModBlocks.NIDAVELLIR_CRIMSON_STONE_RUBY_ORE.get().defaultBlockState())
        );

        List<OreConfiguration.TargetBlockState> nidavellirRubyOreClusters = List.of(
                OreConfiguration.target(softStoneReplaceables, ModBlocks.NIDAVELLIR_SOFT_STONE_RUBY_ORE_CLUSTER.get().defaultBlockState()),
                OreConfiguration.target(hardStoneReplaceables, ModBlocks.NIDAVELLIR_HARD_STONE_RUBY_ORE_CLUSTER.get().defaultBlockState()),
                OreConfiguration.target(enhancedStoneReplaceables, ModBlocks.NIDAVELLIR_ENHANCED_STONE_RUBY_ORE_CLUSTER.get().defaultBlockState()),
                OreConfiguration.target(deepslateStoneReplaceables, ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_RUBY_ORE_CLUSTER.get().defaultBlockState()),
                OreConfiguration.target(crimsonStoneReplaceables, ModBlocks.NIDAVELLIR_CRIMSON_STONE_RUBY_ORE_CLUSTER.get().defaultBlockState())
        );

        //ALFHEIMR
        register(context, ALFHEIMR_TIN_ORE_KEY, Feature.ORE, new OreConfiguration(alfheimrTinOres, 10));
        register(context, ALFHEIMR_COAL_ORE_KEY, Feature.ORE, new OreConfiguration(alfheimrCoalOres, 10));
        register(context, ALFHEIMR_IRON_ORE_KEY, Feature.ORE, new OreConfiguration(alfheimrIronOres, 10));
        register(context, ALFHEIMR_GOLD_ORE_KEY, Feature.ORE, new OreConfiguration(alfheimrGoldOres, 10));
        register(context, ALFHEIMR_REDSTONE_ORE_KEY, Feature.ORE, new OreConfiguration(alfheimrRedstoneOres, 10));
        register(context, ALFHEIMR_DIAMOND_ORE_KEY, Feature.ORE, new OreConfiguration(alfheimrDiamondOres, 10));
        register(context, ALFHEIMR_LAPIS_ORE_KEY, Feature.ORE, new OreConfiguration(alfheimrLapisOres, 10));
        register(context, ALFHEIMR_COPPER_ORE_KEY, Feature.ORE, new OreConfiguration(alfheimrCopperOres, 10));

        //NIDAVELLIR
        register(context, NIDAVELLIR_TIN_ORE_KEY, Feature.ORE, new OreConfiguration(nidavellirTinOres, 10));
        register(context, NIDAVELLIR_TIN_ORE_CLUSTER_KEY, Feature.ORE, new OreConfiguration(nidavellirTinOreClusters, 10));
        register(context, NIDAVELLIR_ZINC_ORE_KEY, Feature.ORE, new OreConfiguration(nidavellirZincOres, 10));
        register(context, NIDAVELLIR_ZINC_ORE_CLUSTER_KEY, Feature.ORE, new OreConfiguration(nidavellirZincOreClusters, 10));
        register(context, NIDAVELLIR_COAL_ORE_KEY, Feature.ORE, new OreConfiguration(nidavellirCoalOres, 10));
        register(context, NIDAVELLIR_COAL_ORE_CLUSTER_KEY, Feature.ORE, new OreConfiguration(nidavellirCoalOreClusters, 10));
        register(context, NIDAVELLIR_IRON_ORE_KEY, Feature.ORE, new OreConfiguration(nidavellirIronOres, 10));
        register(context, NIDAVELLIR_IRON_ORE_CLUSTER_KEY, Feature.ORE, new OreConfiguration(nidavellirIronOreClusters, 10));
        register(context, NIDAVELLIR_GOLD_ORE_KEY, Feature.ORE, new OreConfiguration(nidavellirGoldOres, 10));
        register(context, NIDAVELLIR_GOLD_ORE_CLUSTER_KEY, Feature.ORE, new OreConfiguration(nidavellirGoldOreClusters, 10));
        register(context, NIDAVELLIR_REDSTONE_ORE_KEY, Feature.ORE, new OreConfiguration(nidavellirRedstoneOres, 10));
        register(context, NIDAVELLIR_REDSTONE_ORE_CLUSTER_KEY, Feature.ORE, new OreConfiguration(nidavellirRedstoneOreClusters, 10));
        register(context, NIDAVELLIR_DIAMOND_ORE_KEY, Feature.ORE, new OreConfiguration(nidavellirDiamondOres, 10));
        register(context, NIDAVELLIR_DIAMOND_ORE_CLUSTER_KEY, Feature.ORE, new OreConfiguration(nidavellirDiamondOreClusters, 10));
        register(context, NIDAVELLIR_LAPIS_ORE_KEY, Feature.ORE, new OreConfiguration(nidavellirLapisOres, 10));
        register(context, NIDAVELLIR_LAPIS_ORE_CLUSTER_KEY, Feature.ORE, new OreConfiguration(nidavellirLapisOreClusters, 10));
        register(context, NIDAVELLIR_COPPER_ORE_KEY, Feature.ORE, new OreConfiguration(nidavellirCopperOres, 10));
        register(context, NIDAVELLIR_COPPER_ORE_CLUSTER_KEY, Feature.ORE, new OreConfiguration(nidavellirCopperOreClusters, 10));
        register(context, NIDAVELLIR_AQUAMARINE_ORE_KEY, Feature.ORE, new OreConfiguration(nidavellirAquamarineOres, 10));
        register(context, NIDAVELLIR_AQUAMARINE_ORE_CLUSTER_KEY, Feature.ORE, new OreConfiguration(nidavellirAquamarineOreClusters, 10));
        register(context, NIDAVELLIR_OPAL_ORE_KEY, Feature.ORE, new OreConfiguration(nidavellirOpalOres, 10));
        register(context, NIDAVELLIR_OPAL_ORE_CLUSTER_KEY, Feature.ORE, new OreConfiguration(nidavellirOpalOreClusters, 10));
        register(context, NIDAVELLIR_RUBY_ORE_KEY, Feature.ORE, new OreConfiguration(nidavellirRubyOres, 10));
        register(context, NIDAVELLIR_RUBY_ORE_CLUSTER_KEY, Feature.ORE, new OreConfiguration(nidavellirRubyOreClusters, 10));

    }

    public static ResourceKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return ResourceKey.create(Registries.CONFIGURED_FEATURE, LostWorldsConstants.modLoc(name));
    }

    private static <FC extends FeatureConfiguration, F extends Feature<FC>> void register(BootstapContext<ConfiguredFeature<?, ?>> context,
                                                                                          ResourceKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}
