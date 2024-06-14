package net.sen.lostworlds.worldgen.placement;

import net.minecraft.core.Holder;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.RandomPatchFeature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.RandomPatchConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.SimpleBlockConfiguration;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.placement.*;
import net.sen.lostworlds.LostWorldsApi;
import net.sen.lostworlds.block.AlfheimrBlocks;
import net.sen.lostworlds.block.ModBlocks;
import net.sen.lostworlds.block.UnderworldBlocks;
import net.sen.lostworlds.worldgen.features.*;

import java.util.List;

public class ModDecorPlacements {
    //Stones!
    public static final ResourceKey<PlacedFeature> PLACED_ALFHEIMR_SMALL_ANDESITE_KEY = registerKey("alfheimr_small_andesite_key");
    public static final ResourceKey<PlacedFeature> PLACED_ALFHEIMR_SMALL_DIORITE_KEY = registerKey("alfheimr_small_diorite_key");
    public static final ResourceKey<PlacedFeature> PLACED_ALFHEIMR_SMALL_GRANITE_KEY = registerKey("alfheimr_small_granite_key");

    //Debrie
    public static final ResourceKey<PlacedFeature> PLACED_ALFHEIMR_STICKS_KEY = registerKey("alfheimr_sticks_key");
    public static final ResourceKey<PlacedFeature> PLACED_ALFHEIMR_ROCKS_KEY = registerKey("alfheimr_rocks_key");
    public static final ResourceKey<PlacedFeature> PLACED_ALFHEIMR_SEASHELLS_KEY = registerKey("alfheimr_seashells_key");

    public static void bootstrap(BootstapContext<PlacedFeature> context, HolderGetter<ConfiguredFeature<?, ?>> configuredFeatures) {
        register(context, PLACED_ALFHEIMR_SMALL_ANDESITE_KEY, configuredFeatures.getOrThrow(ModDecorFeatures.ALFHEIMR_SMALL_ANDESITE_KEY),
                ModOrePlacements.commonOrePlacement(12, HeightRangePlacement.uniform(
                        VerticalAnchor.absolute(-64),
                        VerticalAnchor.absolute(80)
                )));

        register(context, PLACED_ALFHEIMR_SMALL_DIORITE_KEY, configuredFeatures.getOrThrow(ModDecorFeatures.ALFHEIMR_SMALL_DIORITE_KEY),
                ModOrePlacements.commonOrePlacement(12, HeightRangePlacement.uniform(
                        VerticalAnchor.absolute(-64),
                        VerticalAnchor.absolute(80)
                )));

        register(context, PLACED_ALFHEIMR_SMALL_GRANITE_KEY, configuredFeatures.getOrThrow(ModDecorFeatures.ALFHEIMR_SMALL_GRANITE_KEY),
                ModOrePlacements.commonOrePlacement(12, HeightRangePlacement.uniform(
                        VerticalAnchor.absolute(-64),
                        VerticalAnchor.absolute(80)
                )));


        register(context, PLACED_ALFHEIMR_STICKS_KEY, configuredFeatures.getOrThrow(ModDecorFeatures.ALFHEIMR_STICKS_KEY),
                List.of(RarityFilter.onAverageOnceEvery(16), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome()));

        register(context, PLACED_ALFHEIMR_ROCKS_KEY, configuredFeatures.getOrThrow(ModDecorFeatures.ALFHEIMR_ROCKS_KEYS),
                List.of(RarityFilter.onAverageOnceEvery(16), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome()));

        register(context, PLACED_ALFHEIMR_SEASHELLS_KEY, configuredFeatures.getOrThrow(ModDecorFeatures.ALFHEIMR_SEASHELLS_KEY),
                List.of(RarityFilter.onAverageOnceEvery(16), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome()));


    }

    private static ResourceKey<PlacedFeature> registerKey(String name) {
        return ResourceKey.create(Registries.PLACED_FEATURE, LostWorldsApi.modLoc(name));
    }

    private static void register(BootstapContext<PlacedFeature> context, ResourceKey<PlacedFeature> key, Holder<ConfiguredFeature<?, ?>> configuration,
                                 List<PlacementModifier> modifiers) {
        context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
    }
}