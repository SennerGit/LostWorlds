package net.sen.lostworlds.worldgen.dimension;

import net.minecraft.world.level.levelgen.*;
import net.sen.lostworlds.LostWorlds;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.dimension.DimensionType;
import net.minecraft.world.level.dimension.LevelStem;

public class ModDimensions {
    //Underworld
    public static final ResourceKey<LevelStem> UNDERWORLD_KEY =
            ResourceKey.create(Registries.LEVEL_STEM, new ResourceLocation(LostWorlds.MODID, "underworld"));
    public static final ResourceKey<Level> UNDERWORLD_LEVEL_KEY =
            ResourceKey.create(Registries.DIMENSION, new ResourceLocation(LostWorlds.MODID, "underworld"));
    public static final ResourceKey<DimensionType> UNDERWORLD_DIM_TYPE =
            ResourceKey.create(Registries.DIMENSION_TYPE, new ResourceLocation(LostWorlds.MODID, "underworld_type"));

    public static final ResourceKey<NoiseGeneratorSettings> UNDERWORLD_NOISE_KEY =
            ResourceKey.create(Registries.NOISE_SETTINGS, new ResourceLocation("underworld_noise_key"));

    //Nidavellir
    public static final ResourceKey<LevelStem> NIDAVELLIR_KEY = ResourceKey.create(Registries.LEVEL_STEM,
            new ResourceLocation(LostWorlds.MODID, "nidavellir"));
    public static final ResourceKey<Level> NIDAVELLIR_LEVEL_KEY = ResourceKey.create(Registries.DIMENSION,
            new ResourceLocation(LostWorlds.MODID, "nidavellir"));
    public static final ResourceKey<NoiseGeneratorSettings> NIDAVELLIR_NOISE_KEY = ResourceKey.create(Registries.NOISE_SETTINGS,
            new ResourceLocation(LostWorlds.MODID, "nidavellir_noise_key"));
    public static final ResourceKey<DimensionType> NIDAVELLIR_DIM_TYPE = ResourceKey.create(Registries.DIMENSION_TYPE,
            new ResourceLocation(LostWorlds.MODID, "nidavellir_type"));

    //Alfheimr
    public static final ResourceKey<LevelStem> ALFHEIMR_KEY = ResourceKey.create(Registries.LEVEL_STEM,
            new ResourceLocation(LostWorlds.MODID, "alfheimr"));
    public static final ResourceKey<Level> ALFHEIMR_LEVEL_KEY = ResourceKey.create(Registries.DIMENSION,
            new ResourceLocation(LostWorlds.MODID, "alfheimr"));
    public static final ResourceKey<DimensionType> ALFHEIMR_DIM_TYPE = ResourceKey.create(Registries.DIMENSION_TYPE,
            new ResourceLocation(LostWorlds.MODID, "alfheimr_type"));

    //Alfheimr
    public static final ResourceKey<LevelStem> ATLANTIS_KEY = ResourceKey.create(Registries.LEVEL_STEM,
            new ResourceLocation(LostWorlds.MODID, "atlantis"));
    public static final ResourceKey<Level> ATLANTIS_LEVEL_KEY = ResourceKey.create(Registries.DIMENSION,
            new ResourceLocation(LostWorlds.MODID, "atlantis"));
    public static final ResourceKey<DimensionType> ATLANTIS_DIM_TYPE = ResourceKey.create(Registries.DIMENSION_TYPE,
            new ResourceLocation(LostWorlds.MODID, "atlantis_type"));
    public static final ResourceKey<NoiseGeneratorSettings> ATLANTIS_NOISE_KEY = ResourceKey.create(Registries.NOISE_SETTINGS,
            new ResourceLocation(LostWorlds.MODID, "atlantis_noise_key"));

    //Alfheimr
    public static final ResourceKey<LevelStem> SKYOPIA_KEY = ResourceKey.create(Registries.LEVEL_STEM,
            new ResourceLocation(LostWorlds.MODID, "skyopia"));
    public static final ResourceKey<Level> SKYOPIA_LEVEL_KEY = ResourceKey.create(Registries.DIMENSION,
            new ResourceLocation(LostWorlds.MODID, "skyopia"));
    public static final ResourceKey<DimensionType> SKYOPIA_DIM_TYPE = ResourceKey.create(Registries.DIMENSION_TYPE,
            new ResourceLocation(LostWorlds.MODID, "skyopia_type"));

    public static void bootstrapType(BootstapContext<DimensionType> context) {
        UnderworldDimension.underworldDimensionType(context);
        NidavellirDimension.nidavellirDimensionType(context);
        AlfheimrDimension.alfheimrDimensionType(context);
        AtlantisDimension.atlantisDimensionType(context);
        SkyopiaDimension.skyopiaDimensionType(context);
    }


    public static void bootstrapNoise(BootstapContext<NoiseGeneratorSettings> context) {
        context.register(UNDERWORLD_NOISE_KEY, UnderworldDimension.underworldNoise(context));
        context.register(NIDAVELLIR_NOISE_KEY, NidavellirDimension.nidavellirDimensionNoise(context));
        context.register(ATLANTIS_NOISE_KEY, AtlantisDimension.atlantisDimensionNoise(context));
    }

   public static void bootstrapStem(BootstapContext<LevelStem> context) {
       UnderworldDimension.underworldDimension(context);
       NidavellirDimension.nidavellirDimensionLevelStem(context);
       AlfheimrDimension.alfheimrDimension(context);
       AtlantisDimension.atlantisDimension(context);
       SkyopiaDimension.skyopiaDimension(context);
    }

   public static void bootstrapDensityFunctions(BootstapContext<DensityFunction> context) {
       AtlantisDimension.atlantisDensityFunction(context);
    }
}
