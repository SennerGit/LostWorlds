package net.sen.lostworlds.worldgen.dimension.noise;

import net.minecraft.core.Holder;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.data.worldgen.SurfaceRuleData;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.DensityFunction;
import net.minecraft.world.level.levelgen.NoiseGeneratorSettings;
import net.minecraft.world.level.levelgen.NoiseSettings;
import net.minecraft.world.level.levelgen.SurfaceRules;
import net.minecraft.world.level.levelgen.synth.NormalNoise;
import net.sen.lostworlds.api.LostWorldsApi;
import net.sen.lostworlds.worldgen.dimension.AlfheimrDimension;
import net.sen.lostworlds.worldgen.dimension.ModDimensions;
import net.sen.lostworlds.worldgen.dimension.surfacerules.AlfheimrSurfaceRules;

import java.util.List;

public class AlfheimrNoiseGenSettings {
    public static final ResourceKey<NoiseGeneratorSettings> ALFHEIMR_NOISE = createKey("alfheimr_noise");

    public static void bootstrap(final BootstrapContext<NoiseGeneratorSettings> context) {
        HolderGetter<DensityFunction> densityFunctions = context.lookup(Registries.DENSITY_FUNCTION);
        HolderGetter<NormalNoise.NoiseParameters> noiseParameters = context.lookup(Registries.NOISE);
        context.register(ModDimensions.ALFHEIMR_NOISE_KEY, alfheimrDimensionNoise(densityFunctions, noiseParameters, true));
    }

    public static NoiseGeneratorSettings alfheimrDimensionNoise(HolderGetter<DensityFunction> densityFunctions, HolderGetter<NormalNoise.NoiseParameters> noiseParameters, boolean surface) {
        NoiseSettings alfheimrNoise = NoiseSettings.create (
                AlfheimrDimension.MIN_HEIGHT,
                AlfheimrDimension.MAX_HEIGHT,
                1,
                2
        );

        final SurfaceRules.RuleSource surfaceRule = surface ? AlfheimrSurfaceRules.alfheimrSurfaceRules() : SurfaceRuleData.overworld();
        return new NoiseGeneratorSettings(
                alfheimrNoise,
                Blocks.STONE.defaultBlockState(),
                Blocks.WATER.defaultBlockState(),
                AlfheimrNoiseRouter.alfheimrNoiseRouter(densityFunctions, noiseParameters),
                surfaceRule,
                List.of(), //spawn targets
                AlfheimrDimension.SEA_LEVEL,
                false,
                true,
                true,
                true
        );
    }

    private static ResourceKey<NoiseGeneratorSettings> createKey(final String name) {
        return ResourceKey.create(Registries.NOISE_SETTINGS, LostWorldsApi.modLoc(name));
    }
}
