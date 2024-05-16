package net.sen.lostworlds.worldgen.dimension;

import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.server.level.ServerChunkCache;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.Mth;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.biome.*;
import net.minecraft.world.level.chunk.LevelChunk;
import net.minecraft.world.level.dimension.BuiltinDimensionTypes;
import net.minecraft.world.level.dimension.DimensionType;
import net.minecraft.world.level.dimension.LevelStem;
import net.minecraft.world.level.levelgen.*;
import net.minecraftforge.common.ForgeHooks;
import net.minecraftforge.event.ForgeEventFactory;
import net.sen.lostworlds.worldgen.dimension.biomebuilder.AlfheimrBiomeBuilder;
import net.sen.lostworlds.worldgen.portal.AlfheimrTeleporter;

import javax.annotation.Nullable;
import java.util.OptionalLong;

import static net.minecraft.server.packs.repository.PackSource.WORLD;
import static net.sen.lostworlds.LostWorlds.LOGGER;

public class AlfheimrDimension {
    public static final int MAX_HEIGHT = 384;
    public static final int MIN_HEIGHT = -64;
    public static final int SEA_LEVEL = 128;

    public static void alfheimrDimensionType(BootstapContext<DimensionType> context) {
        context.register(ModDimensions.ALFHEIMR_DIM_TYPE, new DimensionType(
                OptionalLong.of(12000), // fixedTime
                true, // hasSkylight
                false, // hasCeiling
                false, // ultraWarm
                true, // natural
                0.6, // coordinateScale
                true, // bedWorks
                false, // respawnAnchorWorks
                MIN_HEIGHT, // minY
                MAX_HEIGHT, // height
                MAX_HEIGHT, // logicalHeight
                BlockTags.INFINIBURN_OVERWORLD, // infiniburn
                BuiltinDimensionTypes.OVERWORLD_EFFECTS, // effectsLocation
                0.0f, // ambientLight
                new DimensionType.MonsterSettings(false, true, UniformInt.of(0, 7), 0)
        ));
    }

    public static void alfheimrLevelStem(final BootstapContext<LevelStem> context) {
//        HolderGetter<Biome> biomeRegistry = context.lookup(Registries.BIOME);
//        HolderGetter<DimensionType> dimTypes = context.lookup(Registries.DIMENSION_TYPE);
//        HolderGetter<NoiseGeneratorSettings> noiseGeneratorSettings = context.lookup(Registries.NOISE_SETTINGS);
//
//        LevelStem stem = new LevelStem(
//                dimTypes.getOrThrow(ModDimensions.ALFHEIMR_DIM_TYPE),
//                alfheimrNoiseBasedChunkGenerator(context));

        context.register(ModDimensions.ALFHEIMR_KEY, new LevelStem(
                context.lookup(Registries.DIMENSION_TYPE).getOrThrow(ModDimensions.ALFHEIMR_DIM_TYPE),
                new NoiseBasedChunkGenerator(
                        MultiNoiseBiomeSource.createFromPreset(context.lookup(Registries.MULTI_NOISE_BIOME_SOURCE_PARAMETER_LIST).getOrThrow(AlfheimrBiomeBuilder.PARAMETER_LIST)),
                        context.lookup(Registries.NOISE_SETTINGS).getOrThrow(ModDimensions.ALFHEIMR_NOISE_KEY)
                )
        ));

//        context.register(ModDimensions.ALFHEIMR_KEY, stem);
    }

//    private static NoiseBasedChunkGenerator alfheimrNoiseBasedChunkGenerator(BootstapContext<LevelStem> context) {
//        HolderGetter<Biome> biomeRegistry = context.lookup(Registries.BIOME);
//        HolderGetter<NoiseGeneratorSettings> noiseGenSettings = context.lookup(Registries.NOISE_SETTINGS);
//
////        BiomeSource biomes = MultiNoiseBiomeSource.createFromList(
////                        new Climate.ParameterList<>(List.of(
////                                Pair.of(Climate.parameters(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), biomeRegistry.getOrThrow(AlfheimrBiomes.ALFHEIMR_ENCHANTED_FOREST)),
////                                Pair.of(Climate.parameters(0.1F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), biomeRegistry.getOrThrow(AlfheimrBiomes.ALFHEIMR_FAIRY_HILLS)),
////                                Pair.of(Climate.parameters(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), biomeRegistry.getOrThrow(AlfheimrBiomes.ALFHEIMR_FAIRY_RINGS)),
//////                                Pair.of(Climate.parameters(0.2F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), biomeRegistry.getOrThrow(AlfheimrBiomes.ALFHEIMR_GLISTENING_FORESTS)),
////                                Pair.of(Climate.parameters(0.3F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), biomeRegistry.getOrThrow(AlfheimrBiomes.ALFHEIMR_CORRUPTION)),
////                                Pair.of(Climate.parameters(0.4F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), biomeRegistry.getOrThrow(AlfheimrBiomes.ALFHEIMR_CORRUPTION_MOUNTAIN)),
////                                Pair.of(Climate.parameters(0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), biomeRegistry.getOrThrow(AlfheimrBiomes.ALFHEIMR_DESERT)),
////                                Pair.of(Climate.parameters(0.6F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), biomeRegistry.getOrThrow(AlfheimrBiomes.ALFHEIMR_SNOW_FOREST)),
////                                Pair.of(Climate.parameters(0.7F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), biomeRegistry.getOrThrow(AlfheimrBiomes.ALFHEIMR_HOLLOW_HILLS)),
////                                Pair.of(Climate.parameters(0.8F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), biomeRegistry.getOrThrow(AlfheimrBiomes.ALFHEIMR_SKY_PEAKS)),
////                                Pair.of(Climate.parameters(0.9F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), biomeRegistry.getOrThrow(AlfheimrBiomes.ALFHEIMR_CRYSTAL_SPRING)),
////                                Pair.of(Climate.parameters(1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), biomeRegistry.getOrThrow(AlfheimrBiomes.ALFHEIMR_OCEAN)),
////                                Pair.of(Climate.parameters(1.1F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), biomeRegistry.getOrThrow(AlfheimrBiomes.ALFHEIMR_MEADOWS))
////                        )));
//
////        return new NoiseBasedChunkGenerator(
////                MultiNoiseBiomeSource.createFromList(
////                        new Climate.ParameterList<>(List.of(
////                                //OFFLAND
////                                Pair.of(Climate.parameters(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), biomeRegistry.getOrThrow(AlfheimrBiomes.ALFHEIMR_OCEAN)),
////                                Pair.of(Climate.parameters(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), biomeRegistry.getOrThrow(AlfheimrBiomes.ALFHEIMR_DEEP_OCEAN)),
////                                Pair.of(Climate.parameters(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), biomeRegistry.getOrThrow(AlfheimrBiomes.ALFHEIMR_WARM_OCEAN)),
////                                Pair.of(Climate.parameters(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), biomeRegistry.getOrThrow(AlfheimrBiomes.ALFHEIMR_LUKEWARM_OCEAN)),
////                                Pair.of(Climate.parameters(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), biomeRegistry.getOrThrow(AlfheimrBiomes.ALFHEIMR_DEEP_LUKEWARM_OCEAN)),
////                                Pair.of(Climate.parameters(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), biomeRegistry.getOrThrow(AlfheimrBiomes.ALFHEIMR_COLD_OCEAN)),
////                                Pair.of(Climate.parameters(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), biomeRegistry.getOrThrow(AlfheimrBiomes.ALFHEIMR_DEEP_COLD_OCEAN)),
////                                Pair.of(Climate.parameters(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), biomeRegistry.getOrThrow(AlfheimrBiomes.ALFHEIMR_ENCHANTED_OCEAN)),
////                                Pair.of(Climate.parameters(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), biomeRegistry.getOrThrow(AlfheimrBiomes.ALFHEIMR_DEEP_ENCHANTED_OCEAN)),
////                                Pair.of(Climate.parameters(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), biomeRegistry.getOrThrow(AlfheimrBiomes.ALFHEIMR_CURSED_OCEAN)),
////                                Pair.of(Climate.parameters(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), biomeRegistry.getOrThrow(AlfheimrBiomes.ALFHEIMR_DEEP_CURSED_OCEAN)),
////                                Pair.of(Climate.parameters(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), biomeRegistry.getOrThrow(AlfheimrBiomes.ALFHEIMR_CORRUPTION_OCEAN)),
////                                Pair.of(Climate.parameters(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), biomeRegistry.getOrThrow(AlfheimrBiomes.ALFHEIMR_CORRUPTION_DEEP_OCEAN)),
////                                Pair.of(Climate.parameters(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), biomeRegistry.getOrThrow(AlfheimrBiomes.ALFHEIMR_FROZEN_OCEAN)),
////                                Pair.of(Climate.parameters(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), biomeRegistry.getOrThrow(AlfheimrBiomes.ALFHEIMR_DEEP_FROZEN_OCEAN)),
////
////                                //HIGHLAND
////                                Pair.of(Climate.parameters(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), biomeRegistry.getOrThrow(AlfheimrBiomes.ALFHEIMR_HOLLOW_HILLS)),
////                                Pair.of(Climate.parameters(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), biomeRegistry.getOrThrow(AlfheimrBiomes.ALFHEIMR_SKY_PEAKS)),
////                                Pair.of(Climate.parameters(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), biomeRegistry.getOrThrow(AlfheimrBiomes.ALFHEIMR_STONY_HOLLOW)),
////                                Pair.of(Climate.parameters(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), biomeRegistry.getOrThrow(AlfheimrBiomes.ALFHEIMR_STONY_PEAKS)),
////                                Pair.of(Climate.parameters(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), biomeRegistry.getOrThrow(AlfheimrBiomes.ALFHEIMR_LOST_HILLS)),
////                                Pair.of(Climate.parameters(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), biomeRegistry.getOrThrow(AlfheimrBiomes.ALFHEIMR_KINGDOM_HILLS)),
////                                Pair.of(Climate.parameters(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), biomeRegistry.getOrThrow(AlfheimrBiomes.ALFHEIMR_DEADMAN_CLIFFS)),
////                                Pair.of(Climate.parameters(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), biomeRegistry.getOrThrow(AlfheimrBiomes.ALFHEIMR_SNOW_PEAKS)),
////                                Pair.of(Climate.parameters(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), biomeRegistry.getOrThrow(AlfheimrBiomes.ALFHEIMR_FROZEN_PEAKS)),
////                                Pair.of(Climate.parameters(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), biomeRegistry.getOrThrow(AlfheimrBiomes.ALFHEIMR_SNOW_GROVE)),
////                                Pair.of(Climate.parameters(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), biomeRegistry.getOrThrow(AlfheimrBiomes.ALFHEIMR_FROZEN_GROVE)),
////                                Pair.of(Climate.parameters(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), biomeRegistry.getOrThrow(AlfheimrBiomes.ALFHEIMR_CRYSTAL_CLIFFS)),
////                                Pair.of(Climate.parameters(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), biomeRegistry.getOrThrow(AlfheimrBiomes.ALFHEIMR_CRYSTAL_PEAKS)),
////                                Pair.of(Climate.parameters(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), biomeRegistry.getOrThrow(AlfheimrBiomes.ALFHEIMR_CORRUPTION_MOUNTAIN)),
////                                Pair.of(Climate.parameters(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), biomeRegistry.getOrThrow(AlfheimrBiomes.ALFHEIMR_CORRUPTION_GROVE)),
////                                Pair.of(Climate.parameters(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), biomeRegistry.getOrThrow(AlfheimrBiomes.ALFHEIMR_CORRUPTION_PEAKS)),
////                                Pair.of(Climate.parameters(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), biomeRegistry.getOrThrow(AlfheimrBiomes.ALFHEIMR_CORRUPTION_CLIFFS)),
////
////                                //WOODLANDS
////                                Pair.of(Climate.parameters(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), biomeRegistry.getOrThrow(AlfheimrBiomes.ALFHEIMR_FOREST)),
////                                Pair.of(Climate.parameters(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), biomeRegistry.getOrThrow(AlfheimrBiomes.ALFHEIMR_DENSE_FOREST)),
////                                Pair.of(Climate.parameters(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), biomeRegistry.getOrThrow(AlfheimrBiomes.ALFHEIMR_ENCHANTED_FOREST)),
////                                Pair.of(Climate.parameters(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), biomeRegistry.getOrThrow(AlfheimrBiomes.ALFHEIMR_DENSE_ENCHANTED_FOREST)),
////                                Pair.of(Climate.parameters(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), biomeRegistry.getOrThrow(AlfheimrBiomes.ALFHEIMR_DARK_ENCHANTED_FOREST)),
////                                Pair.of(Climate.parameters(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), biomeRegistry.getOrThrow(AlfheimrBiomes.ALFHEIMR_CRYSTALLISED_FOREST)),
////                                Pair.of(Climate.parameters(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), biomeRegistry.getOrThrow(AlfheimrBiomes.ALFHEIMR_DENSE_CRYSTALLISED_FOREST)),
////                                Pair.of(Climate.parameters(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), biomeRegistry.getOrThrow(AlfheimrBiomes.ALFHEIMR_FAIRY_HILLS)),
////                                Pair.of(Climate.parameters(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), biomeRegistry.getOrThrow(AlfheimrBiomes.ALFHEIMR_GLISTENING_FORESTS)),
////                                Pair.of(Climate.parameters(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), biomeRegistry.getOrThrow(AlfheimrBiomes.ALFHEIMR_HAUNTED_FORESTS)),
////                                Pair.of(Climate.parameters(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), biomeRegistry.getOrThrow(AlfheimrBiomes.ALFHEIMR_JUNGLE)),
////                                Pair.of(Climate.parameters(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), biomeRegistry.getOrThrow(AlfheimrBiomes.ALFHEIMR_CURSED_JUNGLE)),
////                                Pair.of(Climate.parameters(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), biomeRegistry.getOrThrow(AlfheimrBiomes.ALFHEIMR_SNOW_FOREST)),
////                                Pair.of(Climate.parameters(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), biomeRegistry.getOrThrow(AlfheimrBiomes.ALFHEIMR_FROZEN_JUNGLE)),
////                                Pair.of(Climate.parameters(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), biomeRegistry.getOrThrow(AlfheimrBiomes.ALFHEIMR_MUSHROOM_FOREST)),
////                                Pair.of(Climate.parameters(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), biomeRegistry.getOrThrow(AlfheimrBiomes.ALFHEIMR_DENSE_MUSHROOM_FOREST)),
////                                Pair.of(Climate.parameters(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), biomeRegistry.getOrThrow(AlfheimrBiomes.ALFHEIMR_FAIRY_RINGS)),
////                                Pair.of(Climate.parameters(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), biomeRegistry.getOrThrow(AlfheimrBiomes.ALFHEIMR_CORRUPTION_FOREST)),
////                                Pair.of(Climate.parameters(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), biomeRegistry.getOrThrow(AlfheimrBiomes.ALFHEIMR_CORRUPTION_CRYSTAL_FOREST)),
////
////                                //WETLANDS
////                                Pair.of(Climate.parameters(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), biomeRegistry.getOrThrow(AlfheimrBiomes.ALFHEIMR_CRYSTAL_SPRING)),
////                                Pair.of(Climate.parameters(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), biomeRegistry.getOrThrow(AlfheimrBiomes.ALFHEIMR_RIVER)),
////                                Pair.of(Climate.parameters(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), biomeRegistry.getOrThrow(AlfheimrBiomes.ALFHEIMR_FROZEN_RIVER)),
////                                Pair.of(Climate.parameters(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), biomeRegistry.getOrThrow(AlfheimrBiomes.ALFHEIMR_STREAM)),
////                                Pair.of(Climate.parameters(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), biomeRegistry.getOrThrow(AlfheimrBiomes.ALFHEIMR_LAKE)),
////                                Pair.of(Climate.parameters(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), biomeRegistry.getOrThrow(AlfheimrBiomes.ALFHEIMR_SWAMP)),
////                                Pair.of(Climate.parameters(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), biomeRegistry.getOrThrow(AlfheimrBiomes.ALFHEIMR_MEADOWS)),
////                                Pair.of(Climate.parameters(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), biomeRegistry.getOrThrow(AlfheimrBiomes.ALFHEIMR_LOST_SWAMP)),
////                                Pair.of(Climate.parameters(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), biomeRegistry.getOrThrow(AlfheimrBiomes.ALFHEIMR_BEACH)),
////                                Pair.of(Climate.parameters(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), biomeRegistry.getOrThrow(AlfheimrBiomes.ALFHEIMR_FROZEN_BEACH)),
////                                Pair.of(Climate.parameters(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), biomeRegistry.getOrThrow(AlfheimrBiomes.ALFHEIMR_STONY_SHORE)),
////                                Pair.of(Climate.parameters(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), biomeRegistry.getOrThrow(AlfheimrBiomes.ALFHEIMR_CRYSTAL_SHORE)),
////                                Pair.of(Climate.parameters(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), biomeRegistry.getOrThrow(AlfheimrBiomes.ALFHEIMR_CORRUPTION_SHORE)),
////
////                                //FLATLANDS
////                                Pair.of(Climate.parameters(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), biomeRegistry.getOrThrow(AlfheimrBiomes.ALFHEIMR_PLAINS)),
////                                Pair.of(Climate.parameters(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), biomeRegistry.getOrThrow(AlfheimrBiomes.ALFHEIMR_CRYSTAL_PLAINS)),
////                                Pair.of(Climate.parameters(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), biomeRegistry.getOrThrow(AlfheimrBiomes.ALFHEIMR_FLOWER_PLAINS)),
////                                Pair.of(Climate.parameters(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), biomeRegistry.getOrThrow(AlfheimrBiomes.ALFHEIMR_MYSTICAL_PLAINS)),
////                                Pair.of(Climate.parameters(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), biomeRegistry.getOrThrow(AlfheimrBiomes.ALFHEIMR_SNOWY_PLAINS)),
////                                Pair.of(Climate.parameters(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), biomeRegistry.getOrThrow(AlfheimrBiomes.ALFHEIMR_CORRUPTION)),
////                                Pair.of(Climate.parameters(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), biomeRegistry.getOrThrow(AlfheimrBiomes.ALFHEIMR_CORRUPTION_SNOWY_PLAINS)),
////
////                                //ARID-LANDS
////                                Pair.of(Climate.parameters(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), biomeRegistry.getOrThrow(AlfheimrBiomes.ALFHEIMR_DESERT)),
////                                Pair.of(Climate.parameters(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), biomeRegistry.getOrThrow(AlfheimrBiomes.ALFHEIMR_CRYSTAL_DESERT)),
////                                Pair.of(Climate.parameters(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), biomeRegistry.getOrThrow(AlfheimrBiomes.ALFHEIMR_DRAGOON_DESERT)),
////                                Pair.of(Climate.parameters(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), biomeRegistry.getOrThrow(AlfheimrBiomes.ALFHEIMR_SAVANNA)),
////                                Pair.of(Climate.parameters(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), biomeRegistry.getOrThrow(AlfheimrBiomes.ALFHEIMR_MYSTICAL_SAVANNA)),
////                                Pair.of(Climate.parameters(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), biomeRegistry.getOrThrow(AlfheimrBiomes.ALFHEIMR_DRY_RAVINE)),
////                                Pair.of(Climate.parameters(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), biomeRegistry.getOrThrow(AlfheimrBiomes.ALFHEIMR_WASTELAND)),
////                                Pair.of(Climate.parameters(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), biomeRegistry.getOrThrow(AlfheimrBiomes.ALFHEIMR_WASTELAND_DRY_RAVINE)),
////                                Pair.of(Climate.parameters(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), biomeRegistry.getOrThrow(AlfheimrBiomes.ALFHEIMR_WASTELAND_PEAKS)),
////                                Pair.of(Climate.parameters(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), biomeRegistry.getOrThrow(AlfheimrBiomes.ALFHEIMR_WASTELAND_CRYSTAL)),
////                                Pair.of(Climate.parameters(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), biomeRegistry.getOrThrow(AlfheimrBiomes.ALFHEIMR_BADLANDS)),
////                                Pair.of(Climate.parameters(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), biomeRegistry.getOrThrow(AlfheimrBiomes.ALFHEIMR_CORRUPTED_BADLANDS)),
////
////                                //CAVES
////                                Pair.of(Climate.parameters(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), biomeRegistry.getOrThrow(AlfheimrBiomes.ALFHEIMR_CRYSTAL_CAVERN)),
////                                Pair.of(Climate.parameters(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), biomeRegistry.getOrThrow(AlfheimrBiomes.ALFHEIMR_OVERGROWN_CAVERN)),
////                                Pair.of(Climate.parameters(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), biomeRegistry.getOrThrow(AlfheimrBiomes.ALFHEIMR_CORRUPTED_CAVERN))
////                        ))),
////                noiseGenSettings.getOrThrow(ModDimensions.ALFHEIMR_NOISE_KEY));
//
////        return new NoiseBasedChunkGenerator(
////                new AlfheimrBiomeProvider(
//////                        BiomeMaker.makeBiomeList(biomeRegistry, biomeRegistry.getOrThrow(AlfheimrBiomes.ALFHEIMR_UNDERGROUND)),
////                        makeBiomeList(biomeRegistry, biomeRegistry.getOrThrow(AlfheimrBiomes.ALFHEIMR_UNDERGROUND)),
////                        -1.25f,
////                        2.5f,
////                        context.lookup(AlfheimrBiomeLayerStack.BIOME_STACK_KEY).getOrThrow(AlfheimrBiomeLayerStack.BIOMES_ALONG_STREAMS)
////                ),
////                noiseGenSettings.getOrThrow(ModDimensions.ALFHEIMR_NOISE_KEY)
////        );
//
//
//    }

    /**
     * Method that handles teleporting the player to and from the tropics depending on certain parameters.
     * Finds the top Y position relative to the dimension the player is teleporting to and places the entity at that position.
     * <p>
     * The position will be based on finding the top Y position relative
     * to the dimension the player is teleporting to and places the entity at that position. Avoids portal generation
     * by using player.teleport() instead of player.changeDimension()
     *
     * @param player The player that will be teleported
     * @param dimensionType The Tropicraft Dimension Type for reference
     */
    public static void teleportPlayer(ServerPlayer player, ResourceKey<Level> dimensionType) {
        ServerLevel destLevel = getTeleportDestination(player, dimensionType);
        if (destLevel == null) return;

        ResourceKey<Level> destDimension = destLevel.dimension();
        if (!ForgeHooks.onTravelToDimension(player, destDimension)) return;

        int x = Mth.floor(player.getX());
        int z = Mth.floor(player.getZ());

        LevelChunk chunk = destLevel.getChunk(x >> 4, z >> 4);
        int topY = chunk.getHeight(Heightmap.Types.WORLD_SURFACE, x & 15, z & 15);
        player.teleportTo(destLevel, x + 0.5, topY + 1.0, z + 0.5, player.getYRot(), player.getXRot());

        ForgeEventFactory.firePlayerChangedDimensionEvent(player, destDimension, destDimension);
    }

    /**
     * Method that handles teleporting the player to and from the tropics depending on certain parameters.
     * Finds the top Y position relative to the dimension the player is teleporting to and places the entity at that position.
     * <p>
     * A portal will be generated on the players teleport with such position based on the portal's info position.
     *
     * @param player The player that will be teleported
     * @param dimensionType The Tropicraft Dimension Type for reference
     */
    public static void teleportPlayerWithPortal(ServerPlayer player, ResourceKey<Level> dimensionType) {
        ServerLevel destLevel = getTeleportDestination(player, dimensionType);
        if (destLevel == null) return;

        if (!player.isOnPortalCooldown()) {
            player.unRide();
            player.changeDimension(destLevel, new AlfheimrTeleporter(destLevel));

            //Note: Stops the player from teleporting right after going through the portal
            player.portalCooldown = 160;
        }
    }

    @Nullable
    private static ServerLevel getTeleportDestination(ServerPlayer player, ResourceKey<Level> dimensionType) {
        ResourceKey<Level> destination;
        if (player.level().dimension() == dimensionType) {
            destination = Level.OVERWORLD;
        } else {
            destination = dimensionType;
        }

        ServerLevel destLevel = player.server.getLevel(destination);
        if (destLevel == null) {
            LOGGER.error("Cannot teleport player to dimension {} as it does not exist!", destination.location());
            return null;
        }
        return destLevel;
    }

    public static int getSeaLevel(LevelReader reader) {
        if (reader instanceof ServerLevel serverLevel) {
            ServerChunkCache chunkProvider = serverLevel.getChunkSource();
            return chunkProvider.getGenerator().getSeaLevel();
        } else if (reader instanceof Level level) {
            if (level.dimension() == WORLD) {
                return SEA_LEVEL;
            }
        }
        return reader.getSeaLevel();
    }
}
