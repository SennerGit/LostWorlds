package net.sen.lostworlds.worldgen.dimension;

import net.minecraft.world.level.levelgen.*;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.dimension.DimensionType;
import net.minecraft.world.level.dimension.LevelStem;
import net.sen.lostworlds.LostWorldsApi;

public class ModDimensions {
    //Underworld
    public static final ResourceKey<LevelStem> UNDERWORLD_KEY =
            ResourceKey.create(Registries.LEVEL_STEM, LostWorldsApi.modLoc("underworld"));
    public static final ResourceKey<Level> UNDERWORLD_LEVEL_KEY =
            ResourceKey.create(Registries.DIMENSION, LostWorldsApi.modLoc("underworld"));
    public static final ResourceKey<DimensionType> UNDERWORLD_DIM_TYPE =
            ResourceKey.create(Registries.DIMENSION_TYPE, LostWorldsApi.modLoc("underworld_type"));

    public static final ResourceKey<NoiseGeneratorSettings> UNDERWORLD_NOISE_KEY =
            ResourceKey.create(Registries.NOISE_SETTINGS, LostWorldsApi.modLoc("underworld_noise_key"));

    //Nidavellir
    public static final ResourceKey<LevelStem> NIDAVELLIR_KEY = ResourceKey.create(Registries.LEVEL_STEM,
            LostWorldsApi.modLoc("nidavellir"));
    public static final ResourceKey<Level> NIDAVELLIR_LEVEL_KEY = ResourceKey.create(Registries.DIMENSION,
            LostWorldsApi.modLoc("nidavellir"));
    public static final ResourceKey<NoiseGeneratorSettings> NIDAVELLIR_NOISE_KEY = ResourceKey.create(Registries.NOISE_SETTINGS,
            LostWorldsApi.modLoc("nidavellir_noise_key"));
    public static final ResourceKey<DimensionType> NIDAVELLIR_DIM_TYPE = ResourceKey.create(Registries.DIMENSION_TYPE,
            LostWorldsApi.modLoc("nidavellir_type"));

    //Alfheimr
    public static final ResourceKey<LevelStem> ALFHEIMR_KEY = ResourceKey.create(Registries.LEVEL_STEM,
            LostWorldsApi.modLoc("alfheimr"));
    public static final ResourceKey<Level> ALFHEIMR_LEVEL_KEY = ResourceKey.create(Registries.DIMENSION,
            LostWorldsApi.modLoc("alfheimr"));
    public static final ResourceKey<DimensionType> ALFHEIMR_DIM_TYPE = ResourceKey.create(Registries.DIMENSION_TYPE,
            LostWorldsApi.modLoc("alfheimr_type"));
    public static final ResourceKey<NoiseGeneratorSettings> ALFHEIMR_NOISE_KEY = ResourceKey.create(Registries.NOISE_SETTINGS,
            LostWorldsApi.modLoc("alfheimr_noise_key"));

    //Atlantis
    public static final ResourceKey<LevelStem> ATLANTIS_KEY = ResourceKey.create(Registries.LEVEL_STEM,
            LostWorldsApi.modLoc("atlantis"));
    public static final ResourceKey<Level> ATLANTIS_LEVEL_KEY = ResourceKey.create(Registries.DIMENSION,
            LostWorldsApi.modLoc("atlantis"));
    public static final ResourceKey<DimensionType> ATLANTIS_DIM_TYPE = ResourceKey.create(Registries.DIMENSION_TYPE,
            LostWorldsApi.modLoc("atlantis_type"));
    public static final ResourceKey<NoiseGeneratorSettings> ATLANTIS_NOISE_KEY = ResourceKey.create(Registries.NOISE_SETTINGS,
            LostWorldsApi.modLoc("atlantis_noise_key"));

    //Skyopia
    public static final ResourceKey<LevelStem> SKYOPIA_KEY = ResourceKey.create(Registries.LEVEL_STEM,
            LostWorldsApi.modLoc("skyopia"));
    public static final ResourceKey<Level> SKYOPIA_LEVEL_KEY = ResourceKey.create(Registries.DIMENSION,
            LostWorldsApi.modLoc("skyopia"));
    public static final ResourceKey<DimensionType> SKYOPIA_DIM_TYPE = ResourceKey.create(Registries.DIMENSION_TYPE,
            LostWorldsApi.modLoc("skyopia_type"));
    public static final ResourceKey<NoiseGeneratorSettings> SKYOPIA_NOISE_KEY = ResourceKey.create(Registries.NOISE_SETTINGS,
            LostWorldsApi.modLoc("skyopia_noise_key"));

    public static void bootstrapType(BootstapContext<DimensionType> context) {
        UnderworldDimension.underworldDimensionType(context);
        NidavellirDimension.nidavellirDimensionType(context);
        AlfheimrDimension.alfheimrDimensionType(context);
        AtlantisDimension.atlantisDimensionType(context);
        SkyopiaDimension.skyopiaDimensionType(context);
    }


    public static void bootstrapNoise(BootstapContext<NoiseGeneratorSettings> context) {
        context.register(UNDERWORLD_NOISE_KEY, UnderworldDimension.underworldDimensionNoise(context));
        context.register(NIDAVELLIR_NOISE_KEY, NidavellirDimension.nidavellirDimensionNoise(context));
        context.register(ALFHEIMR_NOISE_KEY, AlfheimrDimension.alfheimrDimensionNoise(context));
        context.register(ATLANTIS_NOISE_KEY, AtlantisDimension.atlantisDimensionNoise(context));
//        context.register(SKYOPIA_NOISE_KEY, SkyopiaDimension.skyopiaDimensionNoise(context));
    }

   public static void bootstrapStem(BootstapContext<LevelStem> context) {
       UnderworldDimension.underworldDimension(context);
       NidavellirDimension.nidavellirDimensionLevelStem(context);
       AlfheimrDimension.alfheimrDimension(context);
       AtlantisDimension.atlantisDimension(context);
       SkyopiaDimension.skyopiaDimension(context);
    }

   public static void bootstrapDensityFunctions(BootstapContext<DensityFunction> context) {
       UnderworldDimension.underworldDensityFunction(context);
       AtlantisDimension.atlantisDensityFunction(context);
       AlfheimrDimension.alfheimrDensityFunction(context);
    }
}
