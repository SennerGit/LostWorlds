package net.sen.lostworlds.worldgen.dimension;

import com.mojang.datafixers.util.Pair;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.biome.Climate;
import net.minecraft.world.level.biome.MultiNoiseBiomeSource;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.dimension.BuiltinDimensionTypes;
import net.minecraft.world.level.dimension.DimensionType;
import net.minecraft.world.level.dimension.LevelStem;
import net.minecraft.world.level.levelgen.*;
import net.minecraft.world.level.levelgen.synth.BlendedNoise;
import net.minecraft.world.level.levelgen.synth.NormalNoise;
import net.sen.lostworlds.registry.blocks.NidavellirBlocks;
import net.sen.lostworlds.worldgen.biome.util.layer.NidavellirBiomes;
import net.sen.lostworlds.worldgen.dimension.surfacerules.NidavellirSurfaceRules;

import java.util.List;
import java.util.OptionalLong;

public class NidavellirDimension {
    public static void nidavellirDimensionType(BootstrapContext<DimensionType> context) {
        context.register(ModDimensions.NIDAVELLIR_DIM_TYPE, new DimensionType(
                OptionalLong.of(12000), // fixedTime
                false, // hasSkylight
                false, // hasCeiling
                false, // ultraWarm
                false, // natural
                1.0, // coordinateScale
                true, // bedWorks
                false, // respawnAnchorWorks
                -128, // minY
                256, // height
                256, // logicalHeight
                BlockTags.INFINIBURN_OVERWORLD, // infiniburn
                BuiltinDimensionTypes.OVERWORLD_EFFECTS, // effectsLocation
                1.0f, // ambientLight
                new DimensionType.MonsterSettings(false, false, ConstantInt.of(0), 0)));
    }

    public static void nidavellirDimensionLevelStem(BootstrapContext<LevelStem> context) {
        HolderGetter<Biome> biomeRegistry = context.lookup(Registries.BIOME);
        HolderGetter<DimensionType> dimTypes = context.lookup(Registries.DIMENSION_TYPE);
        HolderGetter<NoiseGeneratorSettings> noiseGenSettings = context.lookup(Registries.NOISE_SETTINGS);

        NoiseBasedChunkGenerator noiseBasedChunkGenerator = new NoiseBasedChunkGenerator(
                MultiNoiseBiomeSource.createFromList(
                        new Climate.ParameterList<>(List.of(
                                Pair.of(Climate.parameters(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), biomeRegistry.getOrThrow(NidavellirBiomes.NIDAVELLIR_CAVERN)),
                                Pair.of(Climate.parameters(0.1F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), biomeRegistry.getOrThrow(NidavellirBiomes.NIDAVELLIR_OVERGROWN_CAVERN)),
                                Pair.of(Climate.parameters(0.2F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), biomeRegistry.getOrThrow(NidavellirBiomes.NIDAVELLIR_SUNKEN_CAVERN)),
                                Pair.of(Climate.parameters(0.3F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), biomeRegistry.getOrThrow(NidavellirBiomes.NIDAVELLIR_LAVA_CAVERN)),
                                Pair.of(Climate.parameters(0.4F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), biomeRegistry.getOrThrow(NidavellirBiomes.NIDAVELLIR_FUNGAL_CAVERN))
                        ))),
                noiseGenSettings.getOrThrow(ModDimensions.NIDAVELLIR_NOISE_KEY));

        LevelStem stem = new LevelStem(dimTypes.getOrThrow(ModDimensions.NIDAVELLIR_DIM_TYPE), noiseBasedChunkGenerator);

        context.register(ModDimensions.NIDAVELLIR_KEY, stem);
    }

    public static NoiseGeneratorSettings nidavellirDimensionNoise(BootstrapContext<NoiseGeneratorSettings> context) {
        HolderGetter<DensityFunction> functions = context.lookup(Registries.DENSITY_FUNCTION);
        HolderGetter<NormalNoise.NoiseParameters> noises = context.lookup(Registries.NOISE);

        return new NoiseGeneratorSettings(
                NoiseSettings.create(
                    -128,
                    256,
                    1,
                    2
                ),
                NidavellirBlocks.NIDAVELLIR_SOFT_STONE.get().defaultBlockState(),
                Blocks.WATER.defaultBlockState(),
                nidavellirDimensionNoiseRouter(functions, noises),
                NidavellirSurfaceRules.nidavellirSurfaceRules(),
                List.of(), //spawn targets
                32,
                false,
                false,
                true,
                false
        );
    }

    private static NoiseRouter nidavellirDimensionNoiseRouter(final HolderGetter<DensityFunction> functions, final HolderGetter<NormalNoise.NoiseParameters> noises) {
        DensityFunction densityfunction = NoiseRouterData.getFunction(functions, NoiseRouterData.SHIFT_X);
        DensityFunction densityfunction1 = NoiseRouterData.getFunction(functions, NoiseRouterData.SHIFT_Z);

        return new NoiseRouter(
                DensityFunctions.zero(), //barrier
                DensityFunctions.zero(), //fluid level floodedness
                DensityFunctions.zero(), //fluid level spread
                DensityFunctions.zero(), //lava
                DensityFunctions.shiftedNoise2d(densityfunction, densityfunction1, 0.25D, noises.getOrThrow(Noises.TEMPERATURE)), //temperature
                DensityFunctions.shiftedNoise2d(densityfunction, densityfunction1, 0.25D, noises.getOrThrow(Noises.VEGETATION)), //vegetation
                NoiseRouterData.getFunction(functions, NoiseRouterData.CONTINENTS), //continents
                NoiseRouterData.getFunction(functions, NoiseRouterData.EROSION), //erosion
                DensityFunctions.rangeChoice(
                        NoiseRouterData.getFunction(functions, NoiseRouterData.Y),
                        0.0D,
                        32.0D,
                        DensityFunctions.constant(2.0D),
                        DensityFunctions.constant(-2.0D)), //depth
                NoiseRouterData.getFunction(functions, NoiseRouterData.RIDGES), //ridges
                DensityFunctions.zero(), //initial density
                DensityFunctions.mul(
                        DensityFunctions.constant(0.64D),
                        DensityFunctions.interpolated(
                                DensityFunctions.blendDensity(
                                        DensityFunctions.add(
                                                DensityFunctions.constant(2.5D),
                                                DensityFunctions.mul(
                                                        DensityFunctions.yClampedGradient(-8, 24, 0.0D, 1.0D),
                                                        DensityFunctions.add(
                                                                DensityFunctions.constant(-2.5D),
                                                                DensityFunctions.add(
                                                                        DensityFunctions.constant(0.5D),
                                                                        DensityFunctions.mul(
                                                                                DensityFunctions.yClampedGradient(110, 128, 1.0D, 0.0D),
                                                                                DensityFunctions.add(
                                                                                        DensityFunctions.constant(-0.5F),
                                                                                        BlendedNoise.createUnseeded(0.1D, 0.3D, 80.0D, 60.0D, 1.0D))
                                                                        )
                                                                )
                                                        )
                                                )
                                        )
                                )
                        )
                ).squeeze(), //final density
                DensityFunctions.zero(), //vein toggle
                DensityFunctions.zero(), //vein ridged
                DensityFunctions.zero() //vein gap
        );
    }

}
