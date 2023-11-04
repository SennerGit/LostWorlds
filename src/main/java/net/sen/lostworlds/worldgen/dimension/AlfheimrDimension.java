package net.sen.lostworlds.worldgen.dimension;

import com.mojang.datafixers.util.Pair;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.world.level.biome.*;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.dimension.BuiltinDimensionTypes;
import net.minecraft.world.level.dimension.DimensionType;
import net.minecraft.world.level.dimension.LevelStem;
import net.minecraft.world.level.levelgen.*;
import net.minecraft.world.level.levelgen.placement.CaveSurface;
import net.minecraft.world.level.levelgen.synth.BlendedNoise;
import net.minecraft.world.level.levelgen.synth.NormalNoise;
import net.sen.lostworlds.worldgen.biome.AlfheimrBiomes;
import net.sen.lostworlds.worldgen.biome.ModBiomes;
import net.sen.lostworlds.worldgen.biome.UnderworldBiomes;

import java.util.List;
import java.util.OptionalLong;

public class AlfheimrDimension {
    public static void alfheimrDimensionType(BootstapContext<DimensionType> context) {
        context.register(ModDimensions.ALFHEIMR_DIM_TYPE, new DimensionType(
                OptionalLong.of(12000), // fixedTime
                true, // hasSkylight
                false, // hasCeiling
                false, // ultraWarm
                false, // natural
                1.0, // coordinateScale
                true, // bedWorks
                false, // respawnAnchorWorks
                0, // minY
                256, // height
                256, // logicalHeight
                BlockTags.INFINIBURN_OVERWORLD, // infiniburn
                BuiltinDimensionTypes.OVERWORLD_EFFECTS, // effectsLocation
                1.0f, // ambientLight
                new DimensionType.MonsterSettings(false, false, ConstantInt.of(0), 0)));
    }

    public static void alfheimrDimension(BootstapContext<LevelStem> context) {
        HolderGetter<Biome> biomeRegistry = context.lookup(Registries.BIOME);
        HolderGetter<DimensionType> dimTypes = context.lookup(Registries.DIMENSION_TYPE);
        HolderGetter<NoiseGeneratorSettings> noiseGenSettings = context.lookup(Registries.NOISE_SETTINGS);

        NoiseBasedChunkGenerator wrappedChunkGenerator = new NoiseBasedChunkGenerator(
                new FixedBiomeSource(biomeRegistry.getOrThrow(UnderworldBiomes.TEST_BIOME_2)),
                noiseGenSettings.getOrThrow(NoiseGeneratorSettings.AMPLIFIED));

        NoiseBasedChunkGenerator noiseBasedChunkGenerator = new NoiseBasedChunkGenerator(
                MultiNoiseBiomeSource.createFromList(
                        new Climate.ParameterList<>(List.of(
                                Pair.of(Climate.parameters(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), biomeRegistry.getOrThrow(AlfheimrBiomes.ALFHEIMR_ENCHANTED_FOREST)),
                                Pair.of(Climate.parameters(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), biomeRegistry.getOrThrow(AlfheimrBiomes.ALFHEIMR_FAIRY_HILLS))
//                                Pair.of(Climate.parameters(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), biomeRegistry.getOrThrow(AlfheimrBiomes.ALFHEIMR_FAIRY_RINGS))
//                                Pair.of(Climate.parameters(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), biomeRegistry.getOrThrow(AlfheimrBiomes.ALFHEIMR_GLISTENING_FORESTS)),
//                                Pair.of(Climate.parameters(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), biomeRegistry.getOrThrow(AlfheimrBiomes.ALFHEIMR_CORRUPTION)),
//                                Pair.of(Climate.parameters(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), biomeRegistry.getOrThrow(AlfheimrBiomes.ALFHEIMR_CORRUPTION_MOUNTAIN)),
//                                Pair.of(Climate.parameters(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), biomeRegistry.getOrThrow(AlfheimrBiomes.ALFHEIMR_DESERT)),
//                                Pair.of(Climate.parameters(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), biomeRegistry.getOrThrow(AlfheimrBiomes.ALFHEIMR_SNOW_FOREST)),
//                                Pair.of(Climate.parameters(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), biomeRegistry.getOrThrow(AlfheimrBiomes.ALFHEIMR_HOLLOW_HILLS)),
//                                Pair.of(Climate.parameters(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), biomeRegistry.getOrThrow(AlfheimrBiomes.ALFHEIMR_SKY_PEAKS)),
//                                Pair.of(Climate.parameters(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), biomeRegistry.getOrThrow(AlfheimrBiomes.ALFHEIMR_CRYSTAL_SPRING)),
//                                Pair.of(Climate.parameters(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), biomeRegistry.getOrThrow(AlfheimrBiomes.ALFHEIMR_OCEAN)),
//                                Pair.of(Climate.parameters(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), biomeRegistry.getOrThrow(AlfheimrBiomes.ALFHEIMR_MEADOWS))
                        ))),
                noiseGenSettings.getOrThrow(NoiseGeneratorSettings.AMPLIFIED));

        LevelStem stem = new LevelStem(dimTypes.getOrThrow(ModDimensions.ALFHEIMR_DIM_TYPE), noiseBasedChunkGenerator);

        context.register(ModDimensions.ALFHEIMR_KEY, stem);
    }

//    public static NoiseGeneratorSettings alfheimrDimensionNoise(BootstapContext<NoiseGeneratorSettings> context) {
//        HolderGetter<DensityFunction> functions = context.lookup(Registries.DENSITY_FUNCTION);
//        HolderGetter<NormalNoise.NoiseParameters> noises = context.lookup(Registries.NOISE);
//        DensityFunction densityfunction = NoiseRouterData.getFunction(functions, NoiseRouterData.SHIFT_X);
//        DensityFunction densityfunction1 = NoiseRouterData.getFunction(functions, NoiseRouterData.SHIFT_Z);
//
//        NoiseGeneratorSettings noiseGeneratorSettings = new NoiseGeneratorSettings(NoiseSettings.create(
//                0, 128, 1, 2),
//                Blocks.STONE.defaultBlockState(),
//                Blocks.WATER.defaultBlockState(),
//                new NoiseRouter(
//                        DensityFunctions.zero(), //barrier
//                        DensityFunctions.zero(), //fluid level floodedness
//                        DensityFunctions.zero(), //fluid level spread
//                        DensityFunctions.zero(), //lava
//                        DensityFunctions.shiftedNoise2d(densityfunction, densityfunction1, 0.25D, noises.getOrThrow(Noises.TEMPERATURE)), //temperature
//                        DensityFunctions.shiftedNoise2d(densityfunction, densityfunction1, 0.25D, noises.getOrThrow(Noises.VEGETATION)), //vegetation
//                        NoiseRouterData.getFunction(functions, NoiseRouterData.CONTINENTS), //continents
//                        NoiseRouterData.getFunction(functions, NoiseRouterData.EROSION), //erosion
//                        DensityFunctions.rangeChoice(
//                                NoiseRouterData.getFunction(functions, NoiseRouterData.Y),
//                                0.0D,
//                                32.0D,
//                                DensityFunctions.constant(2.0D),
//                                DensityFunctions.constant(-2.0D)), //depth
//                        NoiseRouterData.getFunction(functions, NoiseRouterData.RIDGES), //ridges
//                        DensityFunctions.zero(), //initial density
//                        DensityFunctions.mul(
//                                DensityFunctions.constant(0.64D),
//                                DensityFunctions.interpolated(
//                                        DensityFunctions.blendDensity(
//                                                DensityFunctions.add(
//                                                        DensityFunctions.constant(2.5D),
//                                                        DensityFunctions.mul(
//                                                                DensityFunctions.yClampedGradient(-8, 24, 0.0D, 1.0D),
//                                                                DensityFunctions.add(
//                                                                        DensityFunctions.constant(-2.5D),
//                                                                        DensityFunctions.add(
//                                                                                DensityFunctions.constant(0.5D),
//                                                                                DensityFunctions.mul(
//                                                                                        DensityFunctions.yClampedGradient(110, 128, 1.0D, 0.0D),
//                                                                                        DensityFunctions.add(
//                                                                                                DensityFunctions.constant(-0.5F),
//                                                                                                BlendedNoise.createUnseeded(0.1D, 0.3D, 80.0D, 60.0D, 1.0D))
//                                                                                )
//                                                                        )
//                                                                )
//                                                        )
//                                                )
//                                        )
//                                )
//                        ).squeeze(), //final density
//                        DensityFunctions.zero(), //vein toggle
//                        DensityFunctions.zero(), //vein ridged
//                        DensityFunctions.zero() //vein gap
//                ),
//                SurfaceRules.sequence(
//                        //bedrock floor
//                        SurfaceRules.ifTrue(SurfaceRules.verticalGradient("minecraft:bedrock_floor", VerticalAnchor.bottom(), VerticalAnchor.aboveBottom(5)), SurfaceRules.state(Blocks.BEDROCK.defaultBlockState())),
//                        //filler depthrock
//                        SurfaceRules.ifTrue(SurfaceRules.yBlockCheck(VerticalAnchor.belowTop(5), 0), SurfaceRules.state(Blocks.STONE.defaultBlockState())),
//                        //sediment
//                        SurfaceRules.ifTrue(SurfaceRules.stoneDepthCheck(0, true, CaveSurface.FLOOR), SurfaceRules.ifTrue(SurfaceRules.not(SurfaceRules.yBlockCheck(VerticalAnchor.absolute(33), 0)), SurfaceRules.state(Blocks.STONE.defaultBlockState()))),
//
//                        //Caves
//                        SurfaceRules.ifTrue(SurfaceRules.isBiome(AlfheimrBiomes.ALFHEIMR_CRYSTAL_CAVERN, AlfheimrBiomes.ALFHEIMR_UNDERGROUND, AlfheimrBiomes.ALFHEIMR_OVERGROWN_CAVERN), SurfaceRules.ifTrue(
//                                SurfaceRules.stoneDepthCheck(0, false, CaveSurface.FLOOR),
//                                SurfaceRules.state(Blocks.STONE.defaultBlockState()))
//                        ),
//                        SurfaceRules.ifTrue(
//                                SurfaceRules.isBiome(
//                                        AlfheimrBiomes.ALFHEIMR_ENCHANTED_FOREST,
//                                        AlfheimrBiomes.ALFHEIMR_FAIRY_HILLS,
//                                        AlfheimrBiomes.ALFHEIMR_FAIRY_RINGS,
//                                        AlfheimrBiomes.ALFHEIMR_GLISTENING_FORESTS,
//                                        AlfheimrBiomes.ALFHEIMR_CORRUPTION,
//                                        AlfheimrBiomes.ALFHEIMR_CORRUPTION_MOUNTAIN,
//                                        AlfheimrBiomes.ALFHEIMR_CORRUPTED_CAVERN,
//                                        AlfheimrBiomes.ALFHEIMR_DESERT,
//                                        AlfheimrBiomes.ALFHEIMR_SNOW_FOREST,
//                                        AlfheimrBiomes.ALFHEIMR_HOLLOW_HILLS,
//                                        AlfheimrBiomes.ALFHEIMR_SKY_PEAKS,
//                                        AlfheimrBiomes.ALFHEIMR_CRYSTAL_SPRING,
//                                        AlfheimrBiomes.ALFHEIMR_MEADOWS
//                                ),
//                                SurfaceRules.ifTrue(
//                                        SurfaceRules.stoneDepthCheck(0, true, CaveSurface.FLOOR),
//                                        SurfaceRules.sequence()
//                                )
//                        )
//                ),
//                List.of(), //spawn targets
//                32,
//                false,
//                false,
//                true,
//                false
//        );
//
//        return noiseGeneratorSettings;
//    }
}
