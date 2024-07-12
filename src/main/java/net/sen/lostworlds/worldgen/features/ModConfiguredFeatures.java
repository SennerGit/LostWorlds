package net.sen.lostworlds.worldgen.features;

import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;

public class ModConfiguredFeatures {
    public static void bootstrap(BootstrapContext<ConfiguredFeature<?, ?>> context) {
        ModOreFeatures.bootstrap(context);
        ModVegetationFeatures.bootstrap(context);
        ModDecorFeatures.bootstrap(context);
    }
}
