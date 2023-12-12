package net.sen.lostworlds.worldgen.placement;

import net.minecraft.core.HolderGetter;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.placement.*;

public class ModPlacedFeatures {
    public static void bootstrap(BootstapContext<PlacedFeature> context) {
        HolderGetter<ConfiguredFeature<?, ?>> configuredFeatures = context.lookup(Registries.CONFIGURED_FEATURE);

        ModOrePlacements.bootstrap(context, configuredFeatures);
        ModVegetationPlacements.bootstrap(context, configuredFeatures);
        ModDecorPlacements.bootstrap(context, configuredFeatures);
    }
}
