package net.sen.lostworlds.worldgen.dimension;

import com.mojang.datafixers.util.Pair;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.data.worldgen.NoiseData;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.level.biome.*;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.dimension.BuiltinDimensionTypes;
import net.minecraft.world.level.dimension.DimensionType;
import net.minecraft.world.level.dimension.LevelStem;
import net.minecraft.world.level.levelgen.*;
import net.minecraft.world.level.levelgen.placement.CaveSurface;
import net.minecraft.world.level.levelgen.synth.NormalNoise;
import net.minecraft.world.level.levelgen.synth.NormalNoise.NoiseParameters;
import net.sen.lostworlds.LostWorlds;
import net.sen.lostworlds.worldgen.biome.AtlantisBiomes;
import net.sen.lostworlds.worldgen.dimension.TerrainProvider.AtlantisTerrainProvider;

import java.util.List;
import java.util.OptionalLong;
import java.util.function.UnaryOperator;

public class AtlantisDimension {
    public static final int SEA_LEVEL = 384;

    public static void atlantisDimensionType(BootstapContext<DimensionType> context) {
        context.register(ModDimensions.ATLANTIS_DIM_TYPE, new DimensionType(
                OptionalLong.of(12000), // fixedTime
                true, // hasSkylight
                false, // hasCeiling
                false, // ultraWarm
                false, // natural
                1.0, // coordinateScale
                true, // bedWorks
                false, // respawnAnchorWorks
                -64, // minY
                384, // height
                384, // logicalHeight
                BlockTags.INFINIBURN_OVERWORLD, // infiniburn
                BuiltinDimensionTypes.OVERWORLD_EFFECTS, // effectsLocation
                0f, // ambientLight
                new DimensionType.MonsterSettings(false, false, UniformInt.of(0, 7), 0)));
    }

    public static void atlantisDimension(BootstapContext<LevelStem> context) {
        HolderGetter<Biome> biomeRegistry = context.lookup(Registries.BIOME);
        HolderGetter<DimensionType> dimTypes = context.lookup(Registries.DIMENSION_TYPE);
        HolderGetter<NoiseGeneratorSettings> noiseGenSettings = context.lookup(Registries.NOISE_SETTINGS);

        NoiseBasedChunkGenerator wrappedChunkGenerator = new NoiseBasedChunkGenerator(
                new FixedBiomeSource(biomeRegistry.getOrThrow(AtlantisBiomes.ATLANTIS_OCEAN)),
                noiseGenSettings.getOrThrow(ModDimensions.ATLANTIS_NOISE_KEY));

        NoiseBasedChunkGenerator noiseBasedChunkGenerator = new NoiseBasedChunkGenerator(
                MultiNoiseBiomeSource.createFromList(
                        new Climate.ParameterList<>(List.of(
                                Pair.of(Climate.parameters(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), biomeRegistry.getOrThrow(AtlantisBiomes.ATLANTIS_OCEAN))
                        ))),
                noiseGenSettings.getOrThrow(ModDimensions.ATLANTIS_NOISE_KEY));

        LevelStem stem = new LevelStem(dimTypes.getOrThrow(ModDimensions.ATLANTIS_DIM_TYPE), noiseBasedChunkGenerator);

        context.register(ModDimensions.ATLANTIS_KEY, stem);
    }

    public static NoiseGeneratorSettings atlantisDimensionNoise(BootstapContext<NoiseGeneratorSettings> context) {
        HolderGetter<DensityFunction> functions = context.lookup(Registries.DENSITY_FUNCTION);
        HolderGetter<NoiseParameters> noises = context.lookup(Registries.NOISE);

        NoiseGeneratorSettings noiseGeneratorSettings = new NoiseGeneratorSettings(NoiseSettings.create(
                -64, 384, 1, 2),
                Blocks.STONE.defaultBlockState(),
                Blocks.WATER.defaultBlockState(),
                atlantisNoiseRouter(functions, noises),
                SurfaceRules.sequence(
                        //bedrock floor
                        SurfaceRules.ifTrue(SurfaceRules.verticalGradient("minecraft:bedrock_floor", VerticalAnchor.bottom(), VerticalAnchor.aboveBottom(5)), SurfaceRules.state(Blocks.BEDROCK.defaultBlockState())),
                        //filler depthrock
//                        SurfaceRules.ifTrue(SurfaceRules.yBlockCheck(VerticalAnchor.belowTop(5), 0), SurfaceRules.state(Blocks.STONE.defaultBlockState())),
                        //sediment
//                        SurfaceRules.ifTrue(SurfaceRules.stoneDepthCheck(0, true, CaveSurface.FLOOR), SurfaceRules.ifTrue(SurfaceRules.not(SurfaceRules.yBlockCheck(VerticalAnchor.absolute(33), 0)), SurfaceRules.state(Blocks.STONE.defaultBlockState()))),
                        //frozen deepturf
                        SurfaceRules.ifTrue(SurfaceRules.isBiome(AtlantisBiomes.ATLANTIS_OCEAN), SurfaceRules.ifTrue(
                                SurfaceRules.stoneDepthCheck(0, false, CaveSurface.FLOOR),
                                SurfaceRules.state(Blocks.STONE.defaultBlockState()))
                        )
                ),
                List.of(), //spawn targets
                SEA_LEVEL,
                false,
                true,
                true,
                false
        );

        return noiseGeneratorSettings;
    }

    private static final DensityFunction BLENDING_FACTOR = DensityFunctions.constant(10.0);
    private static final DensityFunction BLENDING_JAGGEDNESS = DensityFunctions.zero();

    private static final ResourceKey<DensityFunction> BASE_3D_NOISE_OVERWORLD = vanillaKey("overworld/base_3d_noise");
    private static final ResourceKey<DensityFunction> SPAGHETTI_ROUGHNESS_FUNCTION = vanillaKey("overworld/caves/spaghetti_roughness_function");
    private static final ResourceKey<DensityFunction> ENTRANCES = vanillaKey("overworld/caves/entrances");
    private static final ResourceKey<DensityFunction> NOODLE = vanillaKey("overworld/caves/noodle");
    private static final ResourceKey<DensityFunction> PILLARS = vanillaKey("overworld/caves/pillars");
    private static final ResourceKey<DensityFunction> SPAGHETTI_2D = vanillaKey("overworld/caves/spaghetti_2d");

    public static final ResourceKey<DensityFunction> OFFSET = createKey("atlantis/offset");
    public static final ResourceKey<DensityFunction> FACTOR = createKey("atlantis/factor");
    public static final ResourceKey<DensityFunction> DEPTH = createKey("atlantis/depth");
    public static final ResourceKey<DensityFunction> JAGGEDNESS = createKey("atlantis/jaggedness");
    public static final ResourceKey<DensityFunction> SLOPED_CHEESE = createKey("atlantis/sloped_cheese");

    public static void atlantisDensityFunction(BootstapContext<DensityFunction> context) {
        final HolderGetter<DensityFunction> densityFunctions = context.lookup(Registries.DENSITY_FUNCTION);

        final DensityFunctions.Spline.Coordinate continents = new DensityFunctions.Spline.Coordinate(densityFunctions.getOrThrow(NoiseRouterData.CONTINENTS));
        final DensityFunctions.Spline.Coordinate erosion = new DensityFunctions.Spline.Coordinate(densityFunctions.getOrThrow(NoiseRouterData.EROSION));
        final DensityFunctions.Spline.Coordinate ridges = new DensityFunctions.Spline.Coordinate(densityFunctions.getOrThrow(NoiseRouterData.RIDGES_FOLDED));
        final DensityFunctions.Spline.Coordinate weirdness = new DensityFunctions.Spline.Coordinate(densityFunctions.getOrThrow(NoiseRouterData.RIDGES));

        final Holder.Reference<DensityFunction> offset = context.register(OFFSET, splineWithBlending(DensityFunctions.add(
                DensityFunctions.constant(-0.50375F),
                DensityFunctions.spline(AtlantisTerrainProvider.offset(
                        continents,
                        erosion,
                        ridges
                ))
        ), DensityFunctions.blendOffset()));

        final Holder.Reference<DensityFunction> factor = context.register(FACTOR, splineWithBlending(DensityFunctions.spline(AtlantisTerrainProvider.factor(
                continents,
                erosion,
                weirdness,
                ridges
        )), BLENDING_FACTOR));

        final Holder.Reference<DensityFunction> depth = context.register(DEPTH, DensityFunctions.add(DensityFunctions.yClampedGradient(-64, 320, 1.5, -1.5), wrap(offset)));

        final Holder.Reference<DensityFunction> jaggedness = context.register(JAGGEDNESS, splineWithBlending(DensityFunctions.spline(AtlantisTerrainProvider.jaggedness(
                continents,
                erosion,
                weirdness,
                ridges
        )), BLENDING_JAGGEDNESS));

        final DensityFunction jagged = DensityFunctions.mul(wrap(jaggedness), DensityFunctions.noise(context.lookup(Registries.NOISE).getOrThrow(Noises.JAGGED), 1500.0, 0.0).halfNegative());

        context.register(SLOPED_CHEESE, DensityFunctions.add(
                noiseGradientDensity(wrap(factor), DensityFunctions.add(wrap(depth), jagged)),
                wrap(densityFunctions.getOrThrow(BASE_3D_NOISE_OVERWORLD))
        ));
    }

    public static NoiseRouter atlantisNoiseRouter(final HolderGetter<DensityFunction> densityFunctions, final HolderGetter<NoiseParameters> noiseParameters) {
        DensityFunction aquiferBarrier = DensityFunctions.noise(noiseParameters.getOrThrow(Noises.AQUIFER_BARRIER), 1, 0.5); //barrier
        DensityFunction aquiferFluidLevelFloodedness = DensityFunctions.noise(noiseParameters.getOrThrow(Noises.AQUIFER_FLUID_LEVEL_FLOODEDNESS), 1, 0.67); //fluid level floodedness
        DensityFunction aquiferFluidLevelSpread = DensityFunctions.noise(noiseParameters.getOrThrow(Noises.AQUIFER_FLUID_LEVEL_SPREAD), 1, 0.7142857142857143); //fluid level spread
        DensityFunction aquiferLava = DensityFunctions.zero(); //lava
        DensityFunction Y = NoiseRouterData.getFunction(densityFunctions, NoiseRouterData.Y);
        DensityFunction shiftX = NoiseRouterData.getFunction(densityFunctions, NoiseRouterData.SHIFT_X);
        DensityFunction shiftZ = NoiseRouterData.getFunction(densityFunctions, NoiseRouterData.SHIFT_Z);
        DensityFunction temperature = DensityFunctions.shiftedNoise2d(shiftX, shiftZ, 0.25D, noiseParameters.getOrThrow(Noises.TEMPERATURE)); //temperature
        DensityFunction vegetation = DensityFunctions.shiftedNoise2d(shiftX, shiftZ, 0.25D, noiseParameters.getOrThrow(Noises.VEGETATION)); //vegetation
        DensityFunction factor = getFunction(densityFunctions, FACTOR);
        DensityFunction depth = DensityFunctions.rangeChoice(
                NoiseRouterData.getFunction(densityFunctions, NoiseRouterData.Y),
                0.0D,
                32.0D,
                DensityFunctions.constant(2.0D),
                DensityFunctions.constant(-2.0D)); //depth
        DensityFunction densityFunction = DensityFunctions.mul(depth, DensityFunctions.cache2d(factor));
        DensityFunction initialDensityWithoutJaggedness = noiseGradientDensity(DensityFunctions.cache2d(factor), depth); //.cache2d(factor), depth); //initial density
        DensityFunction slopedCheese = getFunction(densityFunctions, SLOPED_CHEESE);
        DensityFunction densityfunction12 = DensityFunctions.min(slopedCheese, DensityFunctions.mul(DensityFunctions.constant(5.0), getFunction(densityFunctions, ENTRANCES)));
        DensityFunction densityfunction13 = DensityFunctions.rangeChoice(slopedCheese, -1000000.0, 1.5625, densityfunction12, underground(densityFunctions, noiseParameters, slopedCheese));
        DensityFunction finalDensity = DensityFunctions.min(postProcess(slideAtlantics(densityfunction13)), getFunction(densityFunctions, NOODLE)); //final density
        DensityFunction veinToggle = DensityFunctions.interpolated(DensityFunctions.rangeChoice(Y, -60, 51, DensityFunctions.noise(noiseParameters.getOrThrow(Noises.ORE_VEININESS), 1.5, 1.5), DensityFunctions.zero())); //vein toggle

        DensityFunction veinRidged =
                DensityFunctions.add(
                        DensityFunctions.constant(-0.07999999821186066),
                        DensityFunctions.max(
                                DensityFunctions.interpolated(
                                        DensityFunctions.rangeChoice(
                                                Y,
                                                -60,
                                                51,
                                                DensityFunctions.noise(
                                                        noiseParameters.getOrThrow(Noises.ORE_VEIN_A),
                                                        4.0,
                                                        4.0
                                                ),
                                                DensityFunctions.zero()
                                        )
                                ).abs(),
                                DensityFunctions.interpolated(
                                        DensityFunctions.rangeChoice(
                                                Y,
                                                -60,
                                                51,
                                                DensityFunctions.noise(
                                                        noiseParameters.getOrThrow(Noises.ORE_VEIN_B),
                                                        4,
                                                        4
                                                ),
                                                DensityFunctions.zero()
                                        )
                                ).abs()
                        )
                ); //vein ridged
        DensityFunction veinGap = DensityFunctions.noise(noiseParameters.getOrThrow(Noises.ORE_GAP), 1, 1); //vein gap

        NoiseRouter newNoiseRouter = new NoiseRouter(
                aquiferBarrier,
                aquiferFluidLevelFloodedness,
                aquiferFluidLevelSpread,
                aquiferLava,
                temperature,
                vegetation,
                NoiseRouterData.getFunction(densityFunctions, NoiseRouterData.CONTINENTS), //continents
                NoiseRouterData.getFunction(densityFunctions, NoiseRouterData.EROSION), //erosion
                depth,
                NoiseRouterData.getFunction(densityFunctions, NoiseRouterData.RIDGES), //ridges
                initialDensityWithoutJaggedness,
                finalDensity,
                veinToggle,
                veinRidged,
                veinGap
        );

        return newNoiseRouter;
    }

    private static DensityFunction underground(HolderGetter<DensityFunction> densityFunctions, HolderGetter<NoiseParameters> noiseParameters, DensityFunction slopedCheese) {
        DensityFunction spaghetti2d = getFunction(densityFunctions, SPAGHETTI_2D);
        DensityFunction spaghettiRoughness = getFunction(densityFunctions, SPAGHETTI_ROUGHNESS_FUNCTION);
        DensityFunction caveLayer = DensityFunctions.noise(noiseParameters.getOrThrow(Noises.CAVE_LAYER), 8.0);
        DensityFunction densityfunction3 = DensityFunctions.mul(DensityFunctions.constant(4.0), caveLayer.square());
        DensityFunction caveCheese = DensityFunctions.noise(noiseParameters.getOrThrow(Noises.CAVE_CHEESE), 1.0 / 1.5);
        DensityFunction densityfunction5 = DensityFunctions.add(
                DensityFunctions.add(
                        DensityFunctions.constant(0.27),
                        caveCheese
                ).clamp(-1.0, 1.0),
                DensityFunctions.add(
                        DensityFunctions.constant(1.5),
                        DensityFunctions.mul(DensityFunctions.constant(-0.64), slopedCheese)
                ).clamp(0.0, 0.5)
        );
        DensityFunction densityfunction6 = DensityFunctions.add(densityfunction3, densityfunction5);
        DensityFunction caves = DensityFunctions.min(DensityFunctions.min(densityfunction6, getFunction(densityFunctions, ENTRANCES)), DensityFunctions.add(spaghetti2d, spaghettiRoughness));
        DensityFunction pillars = getFunction(densityFunctions, PILLARS);
        DensityFunction pillarsThreshold = DensityFunctions.rangeChoice(pillars, -1000000.0, 0.03, DensityFunctions.constant(-1000000.0), pillars);
        return DensityFunctions.max(caves, pillarsThreshold);
    }

    private static DensityFunction getFunction(HolderGetter<DensityFunction> registry, ResourceKey<DensityFunction> key) {
        return wrap(registry.getOrThrow(key));
    }

    private static DensityFunction postProcess(DensityFunction function) {
        DensityFunction blendedFunction = DensityFunctions.blendDensity(function);
        return DensityFunctions.mul(DensityFunctions.interpolated(blendedFunction), DensityFunctions.constant(0.64)).squeeze();
    }

    private static DensityFunction slideAtlantics(DensityFunction function) {
        return slide(function, -64, 384, 80, 64, -0.078125, 0, 24, 0.1171875);
    }
    private static DensityFunction slide(DensityFunction function, int minY, int height, int topSliderLowerOffset, int topSlideUpperOffset, double topSlideTarget, int bottomSlideLowerOffset, int bottomSlideUpperOffset, double bottomSlideTarget) {
        DensityFunction topSlideFactor = DensityFunctions.yClampedGradient(minY + height - topSliderLowerOffset, minY + height - topSlideUpperOffset, 1.0, 0.0);
        DensityFunction bottomSlideFactor = DensityFunctions.yClampedGradient(minY + bottomSlideLowerOffset, minY + bottomSlideUpperOffset, 0.0, 1.0);
        return DensityFunctions.lerp(bottomSlideFactor, bottomSlideTarget, DensityFunctions.lerp(topSlideFactor, topSlideTarget, function));
    }

    private static DensityFunction splineWithBlending(DensityFunction densityFunction, DensityFunction function) {
        DensityFunction densityfunction = DensityFunctions.lerp(DensityFunctions.blendAlpha(), function, densityFunction);
        return DensityFunctions.flatCache(DensityFunctions.cache2d(densityfunction));
    }

    private static DensityFunctions.HolderHolder wrap(Holder.Reference<DensityFunction> holder) {
        return new DensityFunctions.HolderHolder(holder);
    }

    private static DensityFunction noiseGradientDensity(DensityFunction p_212272_, DensityFunction p_212273_) {
        DensityFunction densityfunction = DensityFunctions.mul(p_212273_, p_212272_);
        return DensityFunctions.mul(
                DensityFunctions.constant(4.0D),
                densityfunction.quarterNegative());
    }

    private static ResourceKey<DensityFunction> vanillaKey(String name) {
        return ResourceKey.create(Registries.DENSITY_FUNCTION, new ResourceLocation(name));
    }

    private static ResourceKey<DensityFunction> createKey(final String name) {
        return ResourceKey.create(Registries.DENSITY_FUNCTION, new ResourceLocation(LostWorlds.MODID, name));
    }

//    public static NoiseGeneratorSettings atlantisDimensionNoise(BootstapContext<NoiseGeneratorSettings> context) {
//        NoiseSettings settings = NoiseSettings.create(-64, 384, 1, 2);
//
//        NoiseGeneratorSettings noiseGeneratorSettings = new NoiseGeneratorSettings(
//                settings,
//                Blocks.STONE.defaultBlockState(),
//                Blocks.WATER.defaultBlockState(),
//                ModNoiseRouterData.atlantis(context.lookup(Registries.DENSITY_FUNCTION), context.lookup(Registries.NOISE)),
//                AtlantasSurfaceRuleData.waterWorld(),
//                List.of(),
//                SEA_LEVEL,
//                false,
//                true,
//                true,
//                true
//        );
//
//        return noiseGeneratorSettings;
//    }
}
