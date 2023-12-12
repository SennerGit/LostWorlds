package net.sen.lostworlds.worldgen.placement;

import net.minecraft.core.Holder;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.placement.HeightRangePlacement;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.placement.PlacementModifier;
import net.sen.lostworlds.LostWorldsConstants;
import net.sen.lostworlds.worldgen.features.*;

import java.util.List;

public class ModDecorPlacements {
    //Stones!
    public static final ResourceKey<PlacedFeature> PLACED_ALFHEIMR_SMALL_ANDESITE_KEY = registerKey("alfheimr_small_andesite_key");
    public static final ResourceKey<PlacedFeature> PLACED_ALFHEIMR_SMALL_DIORITE_KEY = registerKey("alfheimr_small_diorite_key");
    public static final ResourceKey<PlacedFeature> PLACED_ALFHEIMR_SMALL_GRANITE_KEY = registerKey("alfheimr_small_granite_key");

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
    }

    private static ResourceKey<PlacedFeature> registerKey(String name) {
        return ResourceKey.create(Registries.PLACED_FEATURE, LostWorldsConstants.modLoc(name));
    }

    private static void register(BootstapContext<PlacedFeature> context, ResourceKey<PlacedFeature> key, Holder<ConfiguredFeature<?, ?>> configuration,
                                 List<PlacementModifier> modifiers) {
        context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
    }
}