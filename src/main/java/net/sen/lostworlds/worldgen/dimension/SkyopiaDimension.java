package net.sen.lostworlds.worldgen.dimension;

import com.mojang.datafixers.util.Pair;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.world.level.biome.*;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.dimension.BuiltinDimensionTypes;
import net.minecraft.world.level.dimension.DimensionType;
import net.minecraft.world.level.dimension.LevelStem;
import net.minecraft.world.level.levelgen.*;
import net.minecraft.world.level.levelgen.placement.CaveSurface;
import net.minecraft.world.level.levelgen.synth.NormalNoise;
import net.sen.lostworlds.LostWorldsApi;

import java.util.List;
import java.util.OptionalLong;

public class SkyopiaDimension {
    public static void skyopiaDimensionType(BootstapContext<DimensionType> context) {
        context.register(ModDimensions.SKYOPIA_DIM_TYPE, new DimensionType(
                OptionalLong.of(18000), // fixedTime
                true, // hasSkylight
                false, // hasCeiling
                false, // ultraWarm
                true, // natural
                0.8, // coordinateScale
                true, // bedWorks
                true, // respawnAnchorWorks
                0, // minY
                512, // height
                512, // logicalHeight
                BlockTags.INFINIBURN_OVERWORLD, // infiniburn
                BuiltinDimensionTypes.OVERWORLD_EFFECTS, // effectsLocation
                0.1f, // ambientLight
                new DimensionType.MonsterSettings(false, false, ConstantInt.of(7), 15)));
    }

    public static void skyopiaDimension(BootstapContext<LevelStem> context) {
        HolderGetter<Biome> biomeRegistry = context.lookup(Registries.BIOME);
        HolderGetter<DimensionType> dimTypes = context.lookup(Registries.DIMENSION_TYPE);
        HolderGetter<NoiseGeneratorSettings> noiseGenSettings = context.lookup(Registries.NOISE_SETTINGS);

        NoiseBasedChunkGenerator wrappedChunkGenerator = new NoiseBasedChunkGenerator(
                new FixedBiomeSource(biomeRegistry.getOrThrow(Biomes.PLAINS)),
                noiseGenSettings.getOrThrow(NoiseGeneratorSettings.FLOATING_ISLANDS));

        NoiseBasedChunkGenerator noiseBasedChunkGenerator = new NoiseBasedChunkGenerator(
                MultiNoiseBiomeSource.createFromList(
                        new Climate.ParameterList<>(List.of(Pair.of(
                                        Climate.parameters(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), biomeRegistry.getOrThrow(Biomes.PLAINS))
                        ))),
                noiseGenSettings.getOrThrow(NoiseGeneratorSettings.FLOATING_ISLANDS));

        LevelStem stem = new LevelStem(dimTypes.getOrThrow(ModDimensions.SKYOPIA_DIM_TYPE), noiseBasedChunkGenerator);

        context.register(ModDimensions.SKYOPIA_KEY, stem);
    }

    public static NoiseGeneratorSettings skyopiaDimensionNoise(BootstapContext<NoiseGeneratorSettings> context) {
        HolderGetter<DensityFunction> functions = context.lookup(Registries.DENSITY_FUNCTION);
        HolderGetter<NormalNoise.NoiseParameters> noises = context.lookup(Registries.NOISE);

        return new NoiseGeneratorSettings(
                NoiseSettings.create(0, 256, 2, 1),
                Blocks.STONE.defaultBlockState(),
                Blocks.WATER.defaultBlockState(),
                skyopiaNoiseRouter(functions, noises),
                skyopiaSurfaceRules(),
                List.of(), //spawn targets
                -64,
                false,
                false,
                false,
                true
        );
    }

    private static SurfaceRules.RuleSource skyopiaSurfaceRules() {
        return SurfaceRules.sequence(
                SurfaceRules.sequence(
                        SurfaceRules.ifTrue(SurfaceRules.stoneDepthCheck(0, false, 0, CaveSurface.FLOOR), SurfaceRules.sequence(
                                SurfaceRules.ifTrue(
                                        SurfaceRules.isBiome(Biomes.WOODED_BADLANDS),
                                        SurfaceRules.ifTrue(
                                                SurfaceRules.yBlockCheck(VerticalAnchor.absolute(97), 2),
                                                SurfaceRules.sequence(
                                                        SurfaceRules.ifTrue(
                                                                SurfaceRules.noiseCondition(Noises.SURFACE, -0.5454d, -0.909d),
                                                                SurfaceRules.state(Blocks.COARSE_DIRT.defaultBlockState())
                                                        ),
                                                        SurfaceRules.ifTrue(
                                                                SurfaceRules.noiseCondition(Noises.SURFACE, 0.1818d, -0.1818d),
                                                                SurfaceRules.state(Blocks.COARSE_DIRT.defaultBlockState())
                                                        ),
                                                        SurfaceRules.ifTrue(
                                                                SurfaceRules.noiseCondition(Noises.SURFACE, 0.909d, 0.5454d),
                                                                SurfaceRules.state(Blocks.COARSE_DIRT.defaultBlockState())
                                                        ),
                                                        SurfaceRules.sequence(
                                                                SurfaceRules.ifTrue(
                                                                        SurfaceRules.waterStartCheck(0, 0),
                                                                        SurfaceRules.state(Blocks.GRASS_BLOCK.defaultBlockState())
                                                                ),
                                                                SurfaceRules.state(Blocks.DIRT.defaultBlockState())
                                                        )
                                                )
                                        )
                                )
                        ))
                )

                //bedrock floor
//                SurfaceRules.ifTrue(SurfaceRules.verticalGradient("minecraft:bedrock_floor", VerticalAnchor.bottom(), VerticalAnchor.aboveBottom(5)), SurfaceRules.state(Blocks.BEDROCK.defaultBlockState())),
                //filler depthrock
//                        SurfaceRules.ifTrue(SurfaceRules.yBlockCheck(VerticalAnchor.belowTop(5), 0), SurfaceRules.state(Blocks.STONE.defaultBlockState())),
                //sediment
//                        SurfaceRules.ifTrue(SurfaceRules.stoneDepthCheck(0, true, CaveSurface.FLOOR), SurfaceRules.ifTrue(SurfaceRules.not(SurfaceRules.yBlockCheck(VerticalAnchor.absolute(33), 0)), SurfaceRules.state(Blocks.STONE.defaultBlockState()))),
                //frozen deepturf
//                SurfaceRules.ifTrue(SurfaceRules.isBiome(Biomes.WOODED_BADLANDS), SurfaceRules.ifTrue(
//                        SurfaceRules.stoneDepthCheck(0, false, CaveSurface.FLOOR),
//                        SurfaceRules.state(Blocks.STONE.defaultBlockState()))
//                )
        );
    }

    private static final DensityFunction BLENDING_FACTOR = DensityFunctions.constant(10.0);
    private static final DensityFunction BLENDING_JAGGEDNESS = DensityFunctions.zero();

    private static final ResourceKey<DensityFunction> Y = vanillaKey("y");
    private static final ResourceKey<DensityFunction> SHIFT_X = vanillaKey("shift_x");
    private static final ResourceKey<DensityFunction> SHIFT_Z = vanillaKey("shift_z");
    private static final ResourceKey<DensityFunction> BASE_3D_NOISE_OVERWORLD = vanillaKey("overworld/base_3d_noise");
    private static final ResourceKey<NormalNoise.NoiseParameters> BASE_3D_NOISE_END = vanillaKeyNoise("end/base_3d_noise");
    private static final ResourceKey<DensityFunction> SPAGHETTI_ROUGHNESS_FUNCTION = vanillaKey("overworld/caves/spaghetti_roughness_function");
    private static final ResourceKey<DensityFunction> ENTRANCES = vanillaKey("overworld/caves/entrances");
    private static final ResourceKey<DensityFunction> NOODLE = vanillaKey("overworld/caves/noodle");
    private static final ResourceKey<DensityFunction> PILLARS = vanillaKey("overworld/caves/pillars");
    private static final ResourceKey<DensityFunction> SPAGHETTI_2D = vanillaKey("overworld/caves/spaghetti_2d");

    private static NoiseRouter skyopiaNoiseRouter(final HolderGetter<DensityFunction> densityFunctions, final HolderGetter<NormalNoise.NoiseParameters> noiseParameters) {
        DensityFunction aquiferBarrier = DensityFunctions.zero();
        DensityFunction aquiferFluidLevelFloodedness = DensityFunctions.zero();
        DensityFunction aquiferFluidLevelSpread = DensityFunctions.zero();
        DensityFunction aquiferLava = DensityFunctions.zero();
        DensityFunction shiftX = getFunction(densityFunctions, SHIFT_X);
        DensityFunction shiftZ = getFunction(densityFunctions, SHIFT_Z);
        DensityFunction temperature = DensityFunctions.shiftedNoise2d(shiftX, shiftZ, 0.25, noiseParameters.getOrThrow(Noises.TEMPERATURE));
        DensityFunction vegetation = DensityFunctions.shiftedNoise2d(shiftX, shiftZ, 0.25, noiseParameters.getOrThrow(Noises.VEGETATION));
        DensityFunction continents = DensityFunctions.zero();
        DensityFunction erosion = DensityFunctions.zero();
        DensityFunction depth = DensityFunctions.zero();
        DensityFunction factor = getFunction(densityFunctions, NoiseRouterData.FACTOR);
        DensityFunction ridges = getFunction(densityFunctions, NoiseRouterData.RIDGES);
        DensityFunction initialDensityWithoutJaggedness = noiseGradientDensity(DensityFunctions.cache2d(factor), depth);
        DensityFunction finalDensity = DensityFunctions.mul(
                DensityFunctions.constant(0.64d),
                DensityFunctions.interpolated(DensityFunctions.blendDensity(DensityFunctions.add(
                 DensityFunctions.constant(-0.234375),
                 DensityFunctions.mul(
                         DensityFunctions.yClampedGradient(
                                 0,
                                 4,
                                 1.0,
                                 32
                         ),
                         DensityFunctions.add(
                                 DensityFunctions.constant(0.234375),
                                 DensityFunctions.add(
                                         DensityFunctions.constant(-23.4375),
                                         DensityFunctions.mul(
                                                 DensityFunctions.yClampedGradient(
                                                         1,
                                                         184,
                                                         0.0,
                                                         440
                                                 ),
                                                 DensityFunctions.add(
                                                         DensityFunctions.constant(23.4375),
                                                         DensityFunctions.noise(noiseParameters.getOrThrow(BASE_3D_NOISE_END))
                                                 )
                                         )
                                 )
                         )
                 )
                )))
        ).squeeze();
        DensityFunction veinToggle = DensityFunctions.zero();
        DensityFunction veinRidged = DensityFunctions.zero();
        DensityFunction veinGap = DensityFunctions.zero();

        return new NoiseRouter(
                aquiferBarrier,
                aquiferFluidLevelFloodedness,
                aquiferFluidLevelSpread,
                aquiferLava,
                temperature,
                vegetation,
                continents,
                erosion,
                depth,
                ridges,
                initialDensityWithoutJaggedness,
                finalDensity,
                veinToggle,
                veinRidged,
                veinGap
        );
    }

    private static DensityFunction getFunction(HolderGetter<DensityFunction> registry, ResourceKey<DensityFunction> key) {
        return wrap(registry.getOrThrow(key));
    }

    private static DensityFunction wrap(Holder.Reference<DensityFunction> holder) {
        return new DensityFunctions.HolderHolder(holder);
    }

    private static DensityFunction yLimitedInterpolatable(DensityFunction p_209472_, DensityFunction p_209473_, int p_209474_, int p_209475_, int p_209476_) {
        return DensityFunctions.interpolated(DensityFunctions.rangeChoice(p_209472_, p_209474_, p_209475_ + 1, p_209473_, DensityFunctions.constant(p_209476_)));
    }

    private static DensityFunction noiseGradientDensity(DensityFunction p_212272_, DensityFunction p_212273_) {
        DensityFunction densityfunction = DensityFunctions.mul(p_212273_, p_212272_);
        return DensityFunctions.mul(DensityFunctions.constant(4.0), densityfunction.quarterNegative());
    }

    private static ResourceKey<DensityFunction> vanillaKey(String name) {
        return ResourceKey.create(Registries.DENSITY_FUNCTION, LostWorldsApi.mcLoc(name));
    }

    private static ResourceKey<NormalNoise.NoiseParameters> vanillaKeyNoise(String name) {
        return ResourceKey.create(Registries.NOISE, LostWorldsApi.mcLoc(name));
    }

    private static ResourceKey<DensityFunction> createKey(final String name) {
        return ResourceKey.create(Registries.DENSITY_FUNCTION, LostWorldsApi.modLoc(name));
    }
}
