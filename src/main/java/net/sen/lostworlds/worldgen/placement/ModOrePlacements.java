package net.sen.lostworlds.worldgen.placement;

import net.minecraft.core.Holder;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.placement.*;
import net.sen.lostworlds.api.LostWorldsApi;
import net.sen.lostworlds.worldgen.features.*;

import java.util.List;

public class ModOrePlacements {
    //Ores!
    public static final ResourceKey<PlacedFeature> PLACED_ALFHEIMR_COAL_ORE_KEY = registerKey("alfheimr_coal_ore_key");
    public static final ResourceKey<PlacedFeature> PLACED_ALFHEIMR_IRON_ORE_KEY = registerKey("alfheimr_iron_ore_key");
    public static final ResourceKey<PlacedFeature> PLACED_ALFHEIMR_GOLD_ORE_KEY = registerKey("alfheimr_gold_ore_key");
    public static final ResourceKey<PlacedFeature> PLACED_ALFHEIMR_REDSTONE_ORE_KEY = registerKey("alfheimr_redstone_ore_key");
    public static final ResourceKey<PlacedFeature> PLACED_ALFHEIMR_DIAMOND_ORE_KEY = registerKey("alfheimr_diamond_ore_key");
    public static final ResourceKey<PlacedFeature> PLACED_ALFHEIMR_LAPIS_ORE_KEY = registerKey("alfheimr_lapis_ore_key");
    public static final ResourceKey<PlacedFeature> PLACED_ALFHEIMR_COPPER_ORE_KEY = registerKey("alfheimr_copper_ore_key");
    public static final ResourceKey<PlacedFeature> PLACED_ALFHEIMR_TIN_ORE_KEY = registerKey("alfheimr_tin_ore_key");

    public static final ResourceKey<PlacedFeature> PLACED_NIDAVELLIR_COAL_ORE_KEY = registerKey("nidavellir_coal_ore_key");
    public static final ResourceKey<PlacedFeature> PLACED_NIDAVELLIR_COAL_ORE_CLUSTER_KEY = registerKey("nidavellir_coal_ore_cluster_key");
    public static final ResourceKey<PlacedFeature> PLACED_NIDAVELLIR_IRON_ORE_KEY = registerKey("nidavellir_iron_ore_key");
    public static final ResourceKey<PlacedFeature> PLACED_NIDAVELLIR_IRON_ORE_CLUSTER_KEY = registerKey("nidavellir_iron_ore_cluster_key");
    public static final ResourceKey<PlacedFeature> PLACED_NIDAVELLIR_GOLD_ORE_KEY = registerKey("nidavellir_gold_ore_key");
    public static final ResourceKey<PlacedFeature> PLACED_NIDAVELLIR_GOLD_ORE_CLUSTER_KEY = registerKey("nidavellir_gold_ore_cluster_key");
    public static final ResourceKey<PlacedFeature> PLACED_NIDAVELLIR_REDSTONE_ORE_KEY = registerKey("nidavellir_redstone_ore_key");
    public static final ResourceKey<PlacedFeature> PLACED_NIDAVELLIR_REDSTONE_ORE_CLUSTER_KEY = registerKey("nidavellir_redstone_ore_cluster_key");
    public static final ResourceKey<PlacedFeature> PLACED_NIDAVELLIR_DIAMOND_ORE_KEY = registerKey("nidavellir_diamond_ore_key");
    public static final ResourceKey<PlacedFeature> PLACED_NIDAVELLIR_DIAMOND_ORE_CLUSTER_KEY = registerKey("nidavellir_diamond_ore_cluster_key");
    public static final ResourceKey<PlacedFeature> PLACED_NIDAVELLIR_LAPIS_ORE_KEY = registerKey("nidavellir_lapis_ore_key");
    public static final ResourceKey<PlacedFeature> PLACED_NIDAVELLIR_LAPIS_ORE_CLUSTER_KEY = registerKey("nidavellir_lapis_ore_cluster_key");
    public static final ResourceKey<PlacedFeature> PLACED_NIDAVELLIR_COPPER_ORE_KEY = registerKey("nidavellir_copper_ore_key");
    public static final ResourceKey<PlacedFeature> PLACED_NIDAVELLIR_COPPER_ORE_CLUSTER_KEY = registerKey("nidavellir_copper_ore_cluster_key");
    public static final ResourceKey<PlacedFeature> PLACED_NIDAVELLIR_TIN_ORE_KEY = registerKey("nidavellir_tin_ore_key");
    public static final ResourceKey<PlacedFeature> PLACED_NIDAVELLIR_TIN_ORE_CLUSTER_KEY = registerKey("nidavellir_tin_ore_cluster_key");
    public static final ResourceKey<PlacedFeature> PLACED_NIDAVELLIR_ZINC_ORE_KEY = registerKey("nidavellir_zinc_ore_key");
    public static final ResourceKey<PlacedFeature> PLACED_NIDAVELLIR_ZINC_ORE_CLUSTER_KEY = registerKey("nidavellir_zinc_ore_cluster_key");
    public static final ResourceKey<PlacedFeature> PLACED_NIDAVELLIR_AQUAMARINE_ORE_KEY = registerKey("nidavellir_aquamarine_ore_key");
    public static final ResourceKey<PlacedFeature> PLACED_NIDAVELLIR_AQUAMARINE_ORE_CLUSTER_KEY = registerKey("nidavellir_aquamarine_ore_cluster_key");
    public static final ResourceKey<PlacedFeature> PLACED_NIDAVELLIR_OPAL_ORE_KEY = registerKey("nidavellir_opal_ore_key");
    public static final ResourceKey<PlacedFeature> PLACED_NIDAVELLIR_OPAL_ORE_CLUSTER_KEY = registerKey("nidavellir_opal_ore_cluster_key");
    public static final ResourceKey<PlacedFeature> PLACED_NIDAVELLIR_RUBY_ORE_KEY = registerKey("nidavellir_ruby_ore_key");
    public static final ResourceKey<PlacedFeature> PLACED_NIDAVELLIR_RUBY_ORE_CLUSTER_KEY = registerKey("nidavellir_ruby_ore_cluster_key");

    public static void bootstrap(BootstrapContext<PlacedFeature> context, HolderGetter<ConfiguredFeature<?, ?>> configuredFeatures) {

        register(context, PLACED_ALFHEIMR_TIN_ORE_KEY, configuredFeatures.getOrThrow(ModOreFeatures.ALFHEIMR_TIN_ORE_KEY),
                ModOrePlacements.commonOrePlacement(12, HeightRangePlacement.uniform(
                        VerticalAnchor.absolute(-64),
                        VerticalAnchor.absolute(80))));

        register(context, PLACED_ALFHEIMR_COAL_ORE_KEY, configuredFeatures.getOrThrow(ModOreFeatures.ALFHEIMR_COAL_ORE_KEY),
                ModOrePlacements.commonOrePlacement(12, HeightRangePlacement.uniform(
                        VerticalAnchor.absolute(-64),
                        VerticalAnchor.absolute(80)
                )));

        register(context, PLACED_ALFHEIMR_IRON_ORE_KEY, configuredFeatures.getOrThrow(ModOreFeatures.ALFHEIMR_IRON_ORE_KEY),
                ModOrePlacements.commonOrePlacement(12, HeightRangePlacement.uniform(
                        VerticalAnchor.absolute(-64),
                        VerticalAnchor.absolute(80)
                )));

        register(context, PLACED_ALFHEIMR_GOLD_ORE_KEY, configuredFeatures.getOrThrow(ModOreFeatures.ALFHEIMR_GOLD_ORE_KEY),
                ModOrePlacements.commonOrePlacement(12, HeightRangePlacement.uniform(
                        VerticalAnchor.absolute(-64),
                        VerticalAnchor.absolute(80)
                )));

        register(context, PLACED_ALFHEIMR_REDSTONE_ORE_KEY, configuredFeatures.getOrThrow(ModOreFeatures.ALFHEIMR_REDSTONE_ORE_KEY),
                ModOrePlacements.commonOrePlacement(12, HeightRangePlacement.uniform(
                        VerticalAnchor.absolute(-64),
                        VerticalAnchor.absolute(80)
                )));

        register(context, PLACED_ALFHEIMR_DIAMOND_ORE_KEY, configuredFeatures.getOrThrow(ModOreFeatures.ALFHEIMR_DIAMOND_ORE_KEY),
                ModOrePlacements.commonOrePlacement(12, HeightRangePlacement.uniform(
                        VerticalAnchor.absolute(-64),
                        VerticalAnchor.absolute(80)
                )));

        register(context, PLACED_ALFHEIMR_LAPIS_ORE_KEY, configuredFeatures.getOrThrow(ModOreFeatures.ALFHEIMR_LAPIS_ORE_KEY),
                ModOrePlacements.commonOrePlacement(12, HeightRangePlacement.uniform(
                        VerticalAnchor.absolute(-64),
                        VerticalAnchor.absolute(80)
                )));

        register(context, PLACED_ALFHEIMR_COPPER_ORE_KEY, configuredFeatures.getOrThrow(ModOreFeatures.ALFHEIMR_COPPER_ORE_KEY),
                ModOrePlacements.commonOrePlacement(12, HeightRangePlacement.uniform(
                        VerticalAnchor.absolute(-64),
                        VerticalAnchor.absolute(80)
                )));

        /*
        NIDAVELLIR
         */
        register(context, PLACED_NIDAVELLIR_TIN_ORE_KEY, configuredFeatures.getOrThrow(ModOreFeatures.NIDAVELLIR_TIN_ORE_KEY),
                ModOrePlacements.commonOrePlacement(12, HeightRangePlacement.uniform(
                        VerticalAnchor.absolute(-64),
                        VerticalAnchor.absolute(80))));

        register(context, PLACED_NIDAVELLIR_TIN_ORE_CLUSTER_KEY, configuredFeatures.getOrThrow(ModOreFeatures.NIDAVELLIR_TIN_ORE_CLUSTER_KEY),
                ModOrePlacements.commonOrePlacement(12, HeightRangePlacement.uniform(
                        VerticalAnchor.absolute(-64),
                        VerticalAnchor.absolute(80))));

        register(context, PLACED_NIDAVELLIR_ZINC_ORE_KEY, configuredFeatures.getOrThrow(ModOreFeatures.NIDAVELLIR_ZINC_ORE_KEY),
                ModOrePlacements.commonOrePlacement(12, HeightRangePlacement.uniform(
                        VerticalAnchor.absolute(-64),
                        VerticalAnchor.absolute(80))));

        register(context, PLACED_NIDAVELLIR_ZINC_ORE_CLUSTER_KEY, configuredFeatures.getOrThrow(ModOreFeatures.NIDAVELLIR_ZINC_ORE_CLUSTER_KEY),
                ModOrePlacements.commonOrePlacement(12, HeightRangePlacement.uniform(
                        VerticalAnchor.absolute(-64),
                        VerticalAnchor.absolute(80))));

        register(context, PLACED_NIDAVELLIR_COAL_ORE_KEY, configuredFeatures.getOrThrow(ModOreFeatures.NIDAVELLIR_COAL_ORE_KEY),
                ModOrePlacements.commonOrePlacement(12, HeightRangePlacement.uniform(
                        VerticalAnchor.absolute(-64),
                        VerticalAnchor.absolute(80)
                )));

        register(context, PLACED_NIDAVELLIR_COAL_ORE_CLUSTER_KEY, configuredFeatures.getOrThrow(ModOreFeatures.NIDAVELLIR_COAL_ORE_CLUSTER_KEY),
                ModOrePlacements.commonOrePlacement(12, HeightRangePlacement.uniform(
                        VerticalAnchor.absolute(-64),
                        VerticalAnchor.absolute(80)
                )));

        register(context, PLACED_NIDAVELLIR_IRON_ORE_KEY, configuredFeatures.getOrThrow(ModOreFeatures.NIDAVELLIR_IRON_ORE_KEY),
                ModOrePlacements.commonOrePlacement(12, HeightRangePlacement.uniform(
                        VerticalAnchor.absolute(-64),
                        VerticalAnchor.absolute(80)
                )));

        register(context, PLACED_NIDAVELLIR_IRON_ORE_CLUSTER_KEY, configuredFeatures.getOrThrow(ModOreFeatures.NIDAVELLIR_IRON_ORE_CLUSTER_KEY),
                ModOrePlacements.commonOrePlacement(12, HeightRangePlacement.uniform(
                        VerticalAnchor.absolute(-64),
                        VerticalAnchor.absolute(80)
                )));

        register(context, PLACED_NIDAVELLIR_GOLD_ORE_KEY, configuredFeatures.getOrThrow(ModOreFeatures.NIDAVELLIR_GOLD_ORE_KEY),
                ModOrePlacements.commonOrePlacement(12, HeightRangePlacement.uniform(
                        VerticalAnchor.absolute(-64),
                        VerticalAnchor.absolute(80)
                )));

        register(context, PLACED_NIDAVELLIR_GOLD_ORE_CLUSTER_KEY, configuredFeatures.getOrThrow(ModOreFeatures.NIDAVELLIR_GOLD_ORE_CLUSTER_KEY),
                ModOrePlacements.commonOrePlacement(12, HeightRangePlacement.uniform(
                        VerticalAnchor.absolute(-64),
                        VerticalAnchor.absolute(80)
                )));

        register(context, PLACED_NIDAVELLIR_REDSTONE_ORE_KEY, configuredFeatures.getOrThrow(ModOreFeatures.NIDAVELLIR_REDSTONE_ORE_KEY),
                ModOrePlacements.commonOrePlacement(12, HeightRangePlacement.uniform(
                        VerticalAnchor.absolute(-64),
                        VerticalAnchor.absolute(80)
                )));

        register(context, PLACED_NIDAVELLIR_REDSTONE_ORE_CLUSTER_KEY, configuredFeatures.getOrThrow(ModOreFeatures.NIDAVELLIR_REDSTONE_ORE_CLUSTER_KEY),
                ModOrePlacements.commonOrePlacement(12, HeightRangePlacement.uniform(
                        VerticalAnchor.absolute(-64),
                        VerticalAnchor.absolute(80)
                )));

        register(context, PLACED_NIDAVELLIR_DIAMOND_ORE_KEY, configuredFeatures.getOrThrow(ModOreFeatures.NIDAVELLIR_DIAMOND_ORE_KEY),
                ModOrePlacements.commonOrePlacement(12, HeightRangePlacement.uniform(
                        VerticalAnchor.absolute(-64),
                        VerticalAnchor.absolute(80)
                )));

        register(context, PLACED_NIDAVELLIR_DIAMOND_ORE_CLUSTER_KEY, configuredFeatures.getOrThrow(ModOreFeatures.NIDAVELLIR_DIAMOND_ORE_CLUSTER_KEY),
                ModOrePlacements.commonOrePlacement(12, HeightRangePlacement.uniform(
                        VerticalAnchor.absolute(-64),
                        VerticalAnchor.absolute(80)
                )));

        register(context, PLACED_NIDAVELLIR_LAPIS_ORE_KEY, configuredFeatures.getOrThrow(ModOreFeatures.NIDAVELLIR_LAPIS_ORE_KEY),
                ModOrePlacements.commonOrePlacement(12, HeightRangePlacement.uniform(
                        VerticalAnchor.absolute(-64),
                        VerticalAnchor.absolute(80)
                )));

        register(context, PLACED_NIDAVELLIR_LAPIS_ORE_CLUSTER_KEY, configuredFeatures.getOrThrow(ModOreFeatures.NIDAVELLIR_LAPIS_ORE_CLUSTER_KEY),
                ModOrePlacements.commonOrePlacement(12, HeightRangePlacement.uniform(
                        VerticalAnchor.absolute(-64),
                        VerticalAnchor.absolute(80)
                )));

        register(context, PLACED_NIDAVELLIR_COPPER_ORE_KEY, configuredFeatures.getOrThrow(ModOreFeatures.NIDAVELLIR_COPPER_ORE_KEY),
                ModOrePlacements.commonOrePlacement(12, HeightRangePlacement.uniform(
                        VerticalAnchor.absolute(-64),
                        VerticalAnchor.absolute(80)
                )));

        register(context, PLACED_NIDAVELLIR_COPPER_ORE_CLUSTER_KEY, configuredFeatures.getOrThrow(ModOreFeatures.NIDAVELLIR_COPPER_ORE_CLUSTER_KEY),
                ModOrePlacements.commonOrePlacement(12, HeightRangePlacement.uniform(
                        VerticalAnchor.absolute(-64),
                        VerticalAnchor.absolute(80)
                )));

        register(context, PLACED_NIDAVELLIR_AQUAMARINE_ORE_KEY, configuredFeatures.getOrThrow(ModOreFeatures.NIDAVELLIR_AQUAMARINE_ORE_KEY),
                ModOrePlacements.commonOrePlacement(12, HeightRangePlacement.uniform(
                        VerticalAnchor.absolute(-64),
                        VerticalAnchor.absolute(80)
                )));

        register(context, PLACED_NIDAVELLIR_AQUAMARINE_ORE_CLUSTER_KEY, configuredFeatures.getOrThrow(ModOreFeatures.NIDAVELLIR_AQUAMARINE_ORE_CLUSTER_KEY),
                ModOrePlacements.commonOrePlacement(12, HeightRangePlacement.uniform(
                        VerticalAnchor.absolute(-64),
                        VerticalAnchor.absolute(80)
                )));

        register(context, PLACED_NIDAVELLIR_OPAL_ORE_KEY, configuredFeatures.getOrThrow(ModOreFeatures.NIDAVELLIR_OPAL_ORE_KEY),
                ModOrePlacements.commonOrePlacement(12, HeightRangePlacement.uniform(
                        VerticalAnchor.absolute(-64),
                        VerticalAnchor.absolute(80)
                )));

        register(context, PLACED_NIDAVELLIR_OPAL_ORE_CLUSTER_KEY, configuredFeatures.getOrThrow(ModOreFeatures.NIDAVELLIR_OPAL_ORE_CLUSTER_KEY),
                ModOrePlacements.commonOrePlacement(12, HeightRangePlacement.uniform(
                        VerticalAnchor.absolute(-64),
                        VerticalAnchor.absolute(80)
                )));

        register(context, PLACED_NIDAVELLIR_RUBY_ORE_KEY, configuredFeatures.getOrThrow(ModOreFeatures.NIDAVELLIR_RUBY_ORE_KEY),
                ModOrePlacements.commonOrePlacement(12, HeightRangePlacement.uniform(
                        VerticalAnchor.absolute(-64),
                        VerticalAnchor.absolute(80)
                )));

        register(context, PLACED_NIDAVELLIR_RUBY_ORE_CLUSTER_KEY, configuredFeatures.getOrThrow(ModOreFeatures.NIDAVELLIR_RUBY_ORE_CLUSTER_KEY),
                ModOrePlacements.commonOrePlacement(12, HeightRangePlacement.uniform(
                        VerticalAnchor.absolute(-64),
                        VerticalAnchor.absolute(80)
                )));
    }

    public static List<PlacementModifier> orePlacement(PlacementModifier p_195347_, PlacementModifier p_195348_) {
        return List.of(p_195347_, InSquarePlacement.spread(), p_195348_, BiomeFilter.biome());
    }

    public static List<PlacementModifier> commonOrePlacement(int pCount, PlacementModifier pHeightRange) {
        return orePlacement(CountPlacement.of(pCount), pHeightRange);
    }

    public static List<PlacementModifier> rareOrePlacement(int pChance, PlacementModifier pHeightRange) {
        return orePlacement(RarityFilter.onAverageOnceEvery(pChance), pHeightRange);
    }

    private static ResourceKey<PlacedFeature> registerKey(String name) {
        return ResourceKey.create(Registries.PLACED_FEATURE, LostWorldsApi.modLoc(name));
    }

    private static void register(BootstrapContext<PlacedFeature> context, ResourceKey<PlacedFeature> key, Holder<ConfiguredFeature<?, ?>> configuration,
                                 List<PlacementModifier> modifiers) {
        context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
    }
}
