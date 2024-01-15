package net.sen.lostworlds.worldgen.features;

import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;

public class ModConfiguredFeatures {
    public static void bootstrap(BootstapContext<ConfiguredFeature<?, ?>> context) {
        ModOreFeatures.bootstrap(context);
        ModVegetationFeatures.bootstrap(context);
        ModDecorFeatures.bootstrap(context);
    }
}
