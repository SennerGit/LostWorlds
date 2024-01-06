package net.sen.lostworlds.worldgen.dimension;

import com.mojang.datafixers.util.Pair;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.biome.Climate;
import net.minecraft.world.level.biome.FixedBiomeSource;
import net.minecraft.world.level.biome.MultiNoiseBiomeSource;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.dimension.BuiltinDimensionTypes;
import net.minecraft.world.level.dimension.DimensionType;
import net.minecraft.world.level.dimension.LevelStem;
import net.minecraft.world.level.levelgen.*;
import net.minecraft.world.level.levelgen.synth.NormalNoise;
import net.sen.lostworlds.LostWorldsConstants;
import net.sen.lostworlds.worldgen.biome.UnderworldBiomes;
import net.sen.lostworlds.worldgen.dimension.TerrainProvider.UnderworldTerrainProvider;
import net.sen.lostworlds.worldgen.dimension.surfacerules.UnderworldSurfaceRules;

import java.util.List;
import java.util.OptionalLong;

public class UnderworldDimension {
    private static final DensityFunction BLENDING_FACTOR = DensityFunctions.constant(10.0);
    private static final DensityFunction BLENDING_JAGGEDNESS = DensityFunctions.zero();

    private static final ResourceKey<DensityFunction> BASE_3D_NOISE_OVERWORLD = vanillaKey("base_3d_noise");
    private static final ResourceKey<DensityFunction> SPAGHETTI_ROUGHNESS_FUNCTION = vanillaKey("caves/spaghetti_roughness_function");
    private static final ResourceKey<DensityFunction> ENTRANCES = vanillaKey("caves/entrances");
    private static final ResourceKey<DensityFunction> NOODLE = vanillaKey("caves/noodle");
    private static final ResourceKey<DensityFunction> PILLARS = vanillaKey("caves/pillars");
    private static final ResourceKey<DensityFunction> SPAGHETTI_2D = vanillaKey("caves/spaghetti_2d");

    public static final ResourceKey<DensityFunction> OFFSET = createKey("offset");
    public static final ResourceKey<DensityFunction> FACTOR = createKey("factor");
    public static final ResourceKey<DensityFunction> DEPTH = createKey("depth");
    public static final ResourceKey<DensityFunction> JAGGEDNESS = createKey("jaggedness");
    public static final ResourceKey<DensityFunction> SLOPED_CHEESE = createKey("sloped_cheese");
    
//    public static void UnderworldDimension(BootstapContext<LevelStem> context) {
//        HolderGetter<Biome> biomeRegistry = context.lookup(Registries.BIOME);
//        HolderGetter<DimensionType> dimTypes = context.lookup(Registries.DIMENSION_TYPE);
//        HolderGetter<NoiseGeneratorSettings> noiseGenSettings = context.lookup(Registries.NOISE_SETTINGS);
//
//        NoiseBasedChunkGenerator wrappedChunkGenerator = new NoiseBasedChunkGenerator(
//                new FixedBiomeSource(biomeRegistry.getOrThrow(UnderworldBiomes.ASPHODEL_MEADOWS)),
//                noiseGenSettings.getOrThrow(ModDimensions.UNDERWORLD_NOISE_KEY));
//
//        NoiseBasedChunkGenerator noiseBasedChunkGenerator = new NoiseBasedChunkGenerator(
//                MultiNoiseBiomeSource.createFromList(
//                        new Climate.ParameterList<>(List.of(
//                                Pair.of(Climate.parameters(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), biomeRegistry.getOrThrow(UnderworldBiomes.ASPHODEL_MEADOWS))
//                        ))),
//                noiseGenSettings.getOrThrow(ModDimensions.UNDERWORLD_NOISE_KEY));
//
//        LevelStem stem = new LevelStem(dimTypes.getOrThrow(ModDimensions.UNDERWORLD_DIM_TYPE), noiseBasedChunkGenerator);
//
//        context.register(ModDimensions.UNDERWORLD_KEY, stem);
//    }



    public static void underworldDimension(BootstapContext<LevelStem> context) {
        HolderGetter<Biome> biomeRegistry = context.lookup(Registries.BIOME);
        HolderGetter<DimensionType> dimTypes = context.lookup(Registries.DIMENSION_TYPE);
        HolderGetter<NoiseGeneratorSettings> noiseGenSettings = context.lookup(Registries.NOISE_SETTINGS);

        NoiseBasedChunkGenerator wrappedChunkGenerator = new NoiseBasedChunkGenerator(
                new FixedBiomeSource(biomeRegistry.getOrThrow(UnderworldBiomes.DOMINION_OF_HADES)),
                noiseGenSettings.getOrThrow(NoiseGeneratorSettings.AMPLIFIED));

        NoiseBasedChunkGenerator noiseBasedChunkGenerator = new NoiseBasedChunkGenerator(
                MultiNoiseBiomeSource.createFromList(
                        new Climate.ParameterList<>(
                                List.of(
                                        Pair.of(Climate.parameters(0.0F, 0.0F, 0.4F, 0.2F, 0.0F, 0.0F, 0.0F), biomeRegistry.getOrThrow(UnderworldBiomes.ASPHODEL_MEADOWS)),
                                        Pair.of(Climate.parameters(0.1F, 0.2F, 0.4F, 0.2F, 0.0F, 0.0F, 0.0F), biomeRegistry.getOrThrow(UnderworldBiomes.DOMINION_OF_HADES)),
                                        Pair.of(Climate.parameters(0.2F, 0.2F, 0.4F, 0.2F, 0.0F, 0.0F, 0.0F), biomeRegistry.getOrThrow(UnderworldBiomes.ELYSIAN_FIELDS)),
                                        Pair.of(Climate.parameters(0.3F, 0.2F, 0.4F, 0.2F, 0.0F, 0.0F, 0.0F), biomeRegistry.getOrThrow(UnderworldBiomes.ISLES_OF_THE_BLESSED)),
                                        Pair.of(Climate.parameters(0.4F, 0.2F, 0.4F, 0.2F, 0.0F, 0.0F, 0.0F), biomeRegistry.getOrThrow(UnderworldBiomes.LANDS_OF_DREAMS)),
                                        Pair.of(Climate.parameters(0.5F, 0.2F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), biomeRegistry.getOrThrow(UnderworldBiomes.RIVER_STYX)),
                                        Pair.of(Climate.parameters(0.6F, 0.2F, 0.4F, 0.2F, 0.0F, 0.0F, 0.0F), biomeRegistry.getOrThrow(UnderworldBiomes.STYGAN_MARSH)),
                                        Pair.of(Climate.parameters(0.7F, 0.4F, 0.6F, 0.6F, 0.5F, 0.4F, 1.0F), biomeRegistry.getOrThrow(UnderworldBiomes.TARTARUS))
                                )
                        )
                ),
                noiseGenSettings.getOrThrow(ModDimensions.UNDERWORLD_NOISE_KEY));
//                noiseGenSettings.getOrThrow(NoiseGeneratorSettings.AMPLIFIED));

        LevelStem stem = new LevelStem(dimTypes.getOrThrow(ModDimensions.UNDERWORLD_DIM_TYPE), noiseBasedChunkGenerator);

        context.register(ModDimensions.UNDERWORLD_KEY, stem);
    }

    public static void underworldDensityFunction(BootstapContext<DensityFunction> context) {
        final HolderGetter<DensityFunction> densityFunctions = context.lookup(Registries.DENSITY_FUNCTION);

        final DensityFunctions.Spline.Coordinate continents = new DensityFunctions.Spline.Coordinate(densityFunctions.getOrThrow(NoiseRouterData.CONTINENTS));
        final DensityFunctions.Spline.Coordinate erosion = new DensityFunctions.Spline.Coordinate(densityFunctions.getOrThrow(NoiseRouterData.EROSION));
        final DensityFunctions.Spline.Coordinate ridges = new DensityFunctions.Spline.Coordinate(densityFunctions.getOrThrow(NoiseRouterData.RIDGES_FOLDED));
        final DensityFunctions.Spline.Coordinate weirdness = new DensityFunctions.Spline.Coordinate(densityFunctions.getOrThrow(NoiseRouterData.RIDGES));

        final Holder.Reference<DensityFunction> offset = context.register(OFFSET, splineWithBlending(DensityFunctions.add(
                DensityFunctions.constant(-0.50375F),
                DensityFunctions.spline(UnderworldTerrainProvider.offset(
                        continents,
                        erosion,
                        ridges
                ))
        ), DensityFunctions.blendOffset()));

        final Holder.Reference<DensityFunction> factor = context.register(FACTOR, splineWithBlending(DensityFunctions.spline(UnderworldTerrainProvider.factor(
                continents,
                erosion,
                weirdness,
                ridges
        )), BLENDING_FACTOR));

        final Holder.Reference<DensityFunction> depth = context.register(DEPTH, DensityFunctions.add(DensityFunctions.yClampedGradient(
                -64,
                320,
                1.5,
                -1.5
        ), wrap(offset)));

        final Holder.Reference<DensityFunction> jaggedness = context.register(JAGGEDNESS, splineWithBlending(DensityFunctions.spline(UnderworldTerrainProvider.jaggedness(
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

    public static void underworldDimensionType(BootstapContext<DimensionType> context) {
        context.register(ModDimensions.UNDERWORLD_DIM_TYPE, new DimensionType(
                OptionalLong.of(12000), // fixedTime
                true, // hasSkylight
                false, // hasCeiling
                false, // ultraWarm
                true, // natural
                0.8, // coordinateScale
                true, // bedWorks
                false, // respawnAnchorWorks
                -64, // minY
                384, // height
                384, // logicalHeight
                BlockTags.INFINIBURN_OVERWORLD, // infiniburn
                BuiltinDimensionTypes.OVERWORLD_EFFECTS, // effectsLocation
                0.0f, // ambientLight
                new DimensionType.MonsterSettings(false, false, UniformInt.of(0, 7), 0)));
    }

    public static NoiseGeneratorSettings underworldDimensionNoise(BootstapContext<?> context) {
        HolderGetter<DensityFunction> functions = context.lookup(Registries.DENSITY_FUNCTION);
        HolderGetter<NormalNoise.NoiseParameters> noises = context.lookup(Registries.NOISE);

        NoiseGeneratorSettings noiseGeneratorSettings = new NoiseGeneratorSettings(
                NoiseSettings.create(
                    -64,
                    384,
                    1,
                    2
                ),
                Blocks.STONE.defaultBlockState(),
                Blocks.WATER.defaultBlockState(),
                underworldNoiseRouter(functions, noises),
                UnderworldSurfaceRules.underworldSurfaceRules(),
                List.of(), //spawn targets
                128,
                false,
                true,
                true,
                false
        );

        return noiseGeneratorSettings;
//        new NoiseGeneratorSettings(UNDERWORLD_NOISE_SETTINGS, Blocks.NETHERRACK.defaultBlockState(), Blocks.LAVA.defaultBlockState(), nether(context.lookup(Registries.DENSITY_FUNCTION), context.lookup(Registries.NOISE)), SurfaceRuleData.nether(), List.of(), 32, false, false, false, true);
    }

    private static NoiseRouter underworldNoiseRouter(HolderGetter<DensityFunction> densityFunctions, HolderGetter<NormalNoise.NoiseParameters> noiseParameters) {
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

        return new NoiseRouter(
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
    }

    //Basic Generators
    protected static NoiseRouter nether(HolderGetter<DensityFunction> pDensityFunctions, HolderGetter<NormalNoise.NoiseParameters> pNoiseParameters) {
        return noNewCaves(pDensityFunctions, pNoiseParameters, slideNetherLike(pDensityFunctions, 0, 128));
    }

    private static DensityFunction noiseGradientDensity(DensityFunction p_212272_, DensityFunction p_212273_) {
        DensityFunction densityfunction = DensityFunctions.mul(p_212273_, p_212272_);
        return DensityFunctions.mul(
                DensityFunctions.constant(4.0D),
                densityfunction.quarterNegative());
    }

    private static NoiseRouter noNewCaves(HolderGetter<DensityFunction> pDensityFunctions, HolderGetter<NormalNoise.NoiseParameters> pNoiseParameters, DensityFunction p_256378_) {
        DensityFunction densityfunction = getFunction(pDensityFunctions, SHIFT_X);
        DensityFunction densityfunction1 = getFunction(pDensityFunctions, SHIFT_Z);
        DensityFunction densityfunction2 = DensityFunctions.shiftedNoise2d(densityfunction, densityfunction1, 0.25D, pNoiseParameters.getOrThrow(Noises.TEMPERATURE));
        DensityFunction densityfunction3 = DensityFunctions.shiftedNoise2d(densityfunction, densityfunction1, 0.25D, pNoiseParameters.getOrThrow(Noises.VEGETATION));
        DensityFunction densityfunction4 = postProcess(p_256378_);
        return new NoiseRouter(DensityFunctions.zero(), DensityFunctions.zero(), DensityFunctions.zero(), DensityFunctions.zero(), densityfunction2, densityfunction3, DensityFunctions.zero(), DensityFunctions.zero(), DensityFunctions.zero(), DensityFunctions.zero(), DensityFunctions.zero(), densityfunction4, DensityFunctions.zero(), DensityFunctions.zero(), DensityFunctions.zero());
    }

    private static DensityFunction slideAtlantics(DensityFunction function) {
        return slide(function, -64, 384, 80, 64, -0.078125, 0, 24, 0.1171875);
    }

    private static DensityFunctions.HolderHolder wrap(Holder.Reference<DensityFunction> holder) {
        return new DensityFunctions.HolderHolder(holder);
    }

    private static DensityFunction underground(HolderGetter<DensityFunction> densityFunctions, HolderGetter<NormalNoise.NoiseParameters> noiseParameters, DensityFunction slopedCheese) {
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

    private static DensityFunction splineWithBlending(DensityFunction densityFunction, DensityFunction function) {
        DensityFunction densityfunction = DensityFunctions.lerp(DensityFunctions.blendAlpha(), function, densityFunction);
        return DensityFunctions.flatCache(DensityFunctions.cache2d(densityfunction));
    }

    private static final ResourceKey<DensityFunction> SHIFT_X = createKey("shift_x");
    private static final ResourceKey<DensityFunction> SHIFT_Z = createKey("shift_z");

    private static DensityFunction postProcess(DensityFunction pDensityFunction) {
        DensityFunction densityfunction = DensityFunctions.blendDensity(pDensityFunction);
        return DensityFunctions.mul(DensityFunctions.interpolated(densityfunction), DensityFunctions.constant(0.64D)).squeeze();
    }

    private static DensityFunction slideNetherLike(HolderGetter<DensityFunction> pDensityFunctions, int pMinY, int pMaxY) {
        return slide(getFunction(pDensityFunctions, BASE_3D_NOISE_NETHER), pMinY, pMaxY, 24, 0, 0.9375D, -8, 24, 2.5D);
    }

    private static final ResourceKey<DensityFunction> BASE_3D_NOISE_NETHER = createKey("nether/base_3d_noise");

    private static DensityFunction getFunction(HolderGetter<DensityFunction> pDensityFunctions, ResourceKey<DensityFunction> pKey) {
        return new DensityFunctions.HolderHolder(pDensityFunctions.getOrThrow(pKey));
    }

    private static DensityFunction slide(DensityFunction pDensityFunction, int pMinY, int pMaxY, int p_224447_, int p_224448_, double p_224449_, int p_224450_, int p_224451_, double p_224452_) {
        DensityFunction densityfunction1 = DensityFunctions.yClampedGradient(pMinY + pMaxY - p_224447_, pMinY + pMaxY - p_224448_, 1.0D, 0.0D);
        DensityFunction $$9 = DensityFunctions.lerp(densityfunction1, p_224449_, pDensityFunction);
        DensityFunction densityfunction2 = DensityFunctions.yClampedGradient(pMinY + p_224450_, pMinY + p_224451_, 0.0D, 1.0D);
        return DensityFunctions.lerp(densityfunction2, p_224452_, $$9);
    }

    private static ResourceKey<DensityFunction> createKey(String pLocation) {
        return ResourceKey.create(Registries.DENSITY_FUNCTION, LostWorldsConstants.modLoc("underworld/" + pLocation));
    }

    private static ResourceKey<DensityFunction> vanillaKey(String name) {
        return ResourceKey.create(Registries.DENSITY_FUNCTION, LostWorldsConstants.mcLoc("overworld/" + name));
    }
}
