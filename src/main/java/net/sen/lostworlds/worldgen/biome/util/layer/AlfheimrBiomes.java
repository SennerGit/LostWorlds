package net.sen.lostworlds.worldgen.biome.util.layer;

import com.google.common.collect.ImmutableList;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BiomeDefaultFeatures;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.data.worldgen.placement.AquaticPlacements;
import net.minecraft.data.worldgen.placement.VegetationPlacements;
import net.minecraft.resources.ResourceKey;
import net.minecraft.sounds.Musics;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.level.biome.*;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.carver.ConfiguredWorldCarver;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.sen.lostworlds.LostWorldsApi;
import net.sen.lostworlds.entity.ModEntities;
import net.sen.lostworlds.sound.ModSounds;
import net.sen.lostworlds.worldgen.biome.util.layer.carver.ModConfiguredCarvers;
import net.sen.lostworlds.worldgen.placement.*;
import org.apache.commons.compress.utils.Lists;

import java.util.List;

public class AlfheimrBiomes {
    private static List<ResourceKey<Biome>> BIOMES = Lists.newArrayList();

    /*
    ALFHEIMR
    */
    //OFFLAND
    public static final ResourceKey<Biome> ALFHEIMR_FROZEN_OCEAN = register("alfheimr_frozen_ocean");
    public static final ResourceKey<Biome> ALFHEIMR_DEEP_FROZEN_OCEAN = register("alfheimr_deep_frozen_ocean");
    public static final ResourceKey<Biome> ALFHEIMR_COLD_OCEAN = register("alfheimr_cold_ocean");
    public static final ResourceKey<Biome> ALFHEIMR_DEEP_COLD_OCEAN = register("alfheimr_deep_cold_ocean");
    public static final ResourceKey<Biome> ALFHEIMR_OCEAN = register("alfheimr_ocean");
    public static final ResourceKey<Biome> ALFHEIMR_DEEP_OCEAN = register("alfheimr_deep_ocean");
    public static final ResourceKey<Biome> ALFHEIMR_LUKEWARM_OCEAN = register("alfheimr_lukewarm_ocean");
    public static final ResourceKey<Biome> ALFHEIMR_DEEP_LUKEWARM_OCEAN = register("alfheimr_deep_lukewarm_ocean");
    public static final ResourceKey<Biome> ALFHEIMR_WARM_OCEAN = register("alfheimr_warm_ocean");
    public static final ResourceKey<Biome> ALFHEIMR_DEEP_WARM_OCEAN = register("alfheimr_deep_warm_ocean");

    public static final ResourceKey<Biome> ALFHEIMR_FROZEN_CORRUPTION_OCEAN = register("alfheimr_frozen_corruption_ocean");
    public static final ResourceKey<Biome> ALFHEIMR_DEEP_FROZEN_CORRUPTION_OCEAN = register("alfheimr_deep_frozen_corruption_ocean");
    public static final ResourceKey<Biome> ALFHEIMR_COLD_CORRUPTION_OCEAN = register("alfheimr_cold_corruption_ocean");
    public static final ResourceKey<Biome> ALFHEIMR_DEEP_COLD_CORRUPTION_OCEAN = register("alfheimr_deep_cold_corruption_ocean");
    public static final ResourceKey<Biome> ALFHEIMR_CORRUPTION_OCEAN = register("alfheimr_corruption_ocean");
    public static final ResourceKey<Biome> ALFHEIMR_DEEP_CORRUPTION_OCEAN = register("alfheimr_deep_corruption_ocean");
    public static final ResourceKey<Biome> ALFHEIMR_LUKEWARM_CORRUPTION_OCEAN = register("alfheimr_lukewarm_corruption_ocean");
    public static final ResourceKey<Biome> ALFHEIMR_DEEP_LUKEWARM_CORRUPTION_OCEAN = register("alfheimr_deep_lukewarm_corruption_ocean");
    public static final ResourceKey<Biome> ALFHEIMR_WARM_CORRUPTION_OCEAN = register("alfheimr_warm_corruption_ocean");
    public static final ResourceKey<Biome> ALFHEIMR_DEEP_WARM_CORRUPTION_OCEAN = register("alfheimr_deep_warm_corruption_ocean");

    public static final ResourceKey<Biome> ALFHEIMR_FROZEN_CURSED_OCEAN = register("alfheimr_frozen_cursed_ocean");
    public static final ResourceKey<Biome> ALFHEIMR_DEEP_FROZEN_CURSED_OCEAN = register("alfheimr_deep_frozen_cursed_ocean");
    public static final ResourceKey<Biome> ALFHEIMR_COLD_CURSED_OCEAN = register("alfheimr_cold_cursed_ocean");
    public static final ResourceKey<Biome> ALFHEIMR_DEEP_COLD_CURSED_OCEAN = register("alfheimr_deep_cold_cursed_ocean");
    public static final ResourceKey<Biome> ALFHEIMR_CURSED_OCEAN = register("alfheimr_cursed_ocean");
    public static final ResourceKey<Biome> ALFHEIMR_DEEP_CURSED_OCEAN = register("alfheimr_deep_cursed_ocean");
    public static final ResourceKey<Biome> ALFHEIMR_LUKEWARM_CURSED_OCEAN = register("alfheimr_lukewarm_cursed_ocean");
    public static final ResourceKey<Biome> ALFHEIMR_DEEP_LUKEWARM_CURSED_OCEAN = register("alfheimr_deep_lukewarm_cursed_ocean");
    public static final ResourceKey<Biome> ALFHEIMR_WARM_CURSED_OCEAN = register("alfheimr_warm_cursed_ocean");
    public static final ResourceKey<Biome> ALFHEIMR_DEEP_WARM_CURSED_OCEAN = register("alfheimr_deep_warm_cursed_ocean");

    public static final ResourceKey<Biome> ALFHEIMR_FROZEN_ENCHANTED_OCEAN = register("alfheimr_frozen_enchanted_ocean");
    public static final ResourceKey<Biome> ALFHEIMR_DEEP_FROZEN_ENCHANTED_OCEAN = register("alfheimr_deep_frozen_enchanted_ocean");
    public static final ResourceKey<Biome> ALFHEIMR_COLD_ENCHANTED_OCEAN = register("alfheimr_cold_enchanted_ocean");
    public static final ResourceKey<Biome> ALFHEIMR_DEEP_COLD_ENCHANTED_OCEAN = register("alfheimr_deep_cold_enchanted_ocean");
    public static final ResourceKey<Biome> ALFHEIMR_ENCHANTED_OCEAN = register("alfheimr_enchanted_ocean");
    public static final ResourceKey<Biome> ALFHEIMR_DEEP_ENCHANTED_OCEAN = register("alfheimr_deep_enchanted_ocean");
    public static final ResourceKey<Biome> ALFHEIMR_LUKEWARM_ENCHANTED_OCEAN = register("alfheimr_lukewarm_enchanted_ocean");
    public static final ResourceKey<Biome> ALFHEIMR_DEEP_LUKEWARM_ENCHANTED_OCEAN = register("alfheimr_deep_lukewarm_enchanted_ocean");
    public static final ResourceKey<Biome> ALFHEIMR_WARM_ENCHANTED_OCEAN = register("alfheimr_wamr_enchanted_ocean");
    public static final ResourceKey<Biome> ALFHEIMR_DEEP_WARM_ENCHANTED_OCEAN = register("alfheimr_deep_warm_enchanted_ocean");

    //HIGHLAND
    public static final ResourceKey<Biome> ALFHEIMR_HOLLOW_HILLS = register("alfheimr_hollow_hills");
    public static final ResourceKey<Biome> ALFHEIMR_SKY_PEAKS = register("alfheimr_sky_peaks");
    public static final ResourceKey<Biome> ALFHEIMR_STONY_HOLLOW = register("alfheimr_stony_hollow");
    public static final ResourceKey<Biome> ALFHEIMR_STONY_PEAKS = register("alfheimr_stony_peaks");
    public static final ResourceKey<Biome> ALFHEIMR_LOST_HILLS = register("alfheimr_lost_hills");
    public static final ResourceKey<Biome> ALFHEIMR_KINGDOM_HILLS = register("alfheimr_kingdom_hills");
    public static final ResourceKey<Biome> ALFHEIMR_DEADMAN_CLIFFS = register("alfheimr_deadman_cliffs");
    public static final ResourceKey<Biome> ALFHEIMR_SNOW_PEAKS = register("alfheimr_snow_peaks");
    public static final ResourceKey<Biome> ALFHEIMR_FROZEN_PEAKS = register("alfheimr_frozen_peaks");
    public static final ResourceKey<Biome> ALFHEIMR_SNOW_GROVE = register("alfheimr_snow_grove");
    public static final ResourceKey<Biome> ALFHEIMR_FROZEN_GROVE = register("alfheimr_frozen_grove");
    public static final ResourceKey<Biome> ALFHEIMR_CRYSTAL_CLIFFS = register("alfheimr_crystal_cliffs");
    public static final ResourceKey<Biome> ALFHEIMR_CRYSTAL_PEAKS = register("alfheimr_crystal_peaks");
    public static final ResourceKey<Biome> ALFHEIMR_CORRUPTION_MOUNTAIN = register("alfheimr_corruption_mountain");
    public static final ResourceKey<Biome> ALFHEIMR_CORRUPTION_GROVE = register("alfheimr_corruption_grove");
    public static final ResourceKey<Biome> ALFHEIMR_CORRUPTION_PEAKS = register("alfheimr_corruption_peaks");
    public static final ResourceKey<Biome> ALFHEIMR_CORRUPTION_CLIFFS = register("alfheimr_corruption_cliffs");

    //WOODLANDS
    public static final ResourceKey<Biome> ALFHEIMR_FOREST = register("alfheimr_forest");
    public static final ResourceKey<Biome> ALFHEIMR_DENSE_FOREST = register("alfheimr_dense_forest");
    public static final ResourceKey<Biome> ALFHEIMR_ENCHANTED_FOREST = register("alfheimr_enchanted_forest");
    public static final ResourceKey<Biome> ALFHEIMR_DENSE_ENCHANTED_FOREST = register("alfheimr_dense_enchanted_forest");
    public static final ResourceKey<Biome> ALFHEIMR_DARK_ENCHANTED_FOREST = register("alfheimr_dark_enchanted_forest");
    public static final ResourceKey<Biome> ALFHEIMR_CRYSTALLISED_FOREST = register("alfheimr_crystallised_forest");
    public static final ResourceKey<Biome> ALFHEIMR_DENSE_CRYSTALLISED_FOREST = register("alfheimr_dense_crystallised_forest");
    public static final ResourceKey<Biome> ALFHEIMR_FAIRY_HILLS = register("alfheimr_fairy_hills");
    public static final ResourceKey<Biome> ALFHEIMR_GLISTENING_FORESTS = register("alfheimr_glistening_forests");
    public static final ResourceKey<Biome> ALFHEIMR_HAUNTED_FORESTS = register("alfheimr_haunted_forests");
    public static final ResourceKey<Biome> ALFHEIMR_JUNGLE = register("alfheimr_jungle");
    public static final ResourceKey<Biome> ALFHEIMR_CURSED_JUNGLE = register("alfheimr_cursed_jungle");
    public static final ResourceKey<Biome> ALFHEIMR_SNOW_FOREST = register("alfheimr_snow_forest");
    public static final ResourceKey<Biome> ALFHEIMR_FROZEN_JUNGLE = register("alfheimr_frozen_jungle");
    public static final ResourceKey<Biome> ALFHEIMR_MUSHROOM_FOREST = register("alfheimr_mushroom_forest");
    public static final ResourceKey<Biome> ALFHEIMR_DENSE_MUSHROOM_FOREST = register("alfheimr_dense_mushroom_forest");
    public static final ResourceKey<Biome> ALFHEIMR_FAIRY_RINGS = register("alfheimr_fairy_rings");
    public static final ResourceKey<Biome> ALFHEIMR_CORRUPTION_FOREST = register("alfheimr_corruption_forest");
    public static final ResourceKey<Biome> ALFHEIMR_CORRUPTION_CRYSTAL_FOREST = register("alfheimr_corruption_crystal_forest");
    
    public static final ResourceKey<Biome> ALFHEIMR_MAGIC_VALLEY = register("alfheimr_magic_valley");
    public static final ResourceKey<Biome> ALFHEIMR_TROPICS = register("alfheimr_tropics");
    public static final ResourceKey<Biome> ALFHEIMR_MAGIC_TROPICS = register("alfheimr_magic_tropics");

    //WETLANDS
    public static final ResourceKey<Biome> ALFHEIMR_CRYSTAL_SPRING = register("alfheimr_crystal_spring");
    public static final ResourceKey<Biome> ALFHEIMR_RIVER = register("alfheimr_river");
    public static final ResourceKey<Biome> ALFHEIMR_FROZEN_RIVER = register("alfheimr_frozen_river");
    public static final ResourceKey<Biome> ALFHEIMR_STREAM = register("alfheimr_stream");
    public static final ResourceKey<Biome> ALFHEIMR_LAKE = register("alfheimr_lake");
    public static final ResourceKey<Biome> ALFHEIMR_SWAMP = register("alfheimr_swamp");
    public static final ResourceKey<Biome> ALFHEIMR_MEADOWS = register("alfheimr_meadows");
    public static final ResourceKey<Biome> ALFHEIMR_LOST_SWAMP = register("alfheimr_lost_swamp");
    public static final ResourceKey<Biome> ALFHEIMR_BEACH = register("alfheimr_beach");
    public static final ResourceKey<Biome> ALFHEIMR_FROZEN_BEACH = register("alfheimr_frozen_beach");
    public static final ResourceKey<Biome> ALFHEIMR_STONY_SHORE = register("alfheimr_stony_shore");
    public static final ResourceKey<Biome> ALFHEIMR_CRYSTAL_SHORE = register("alfheimr_crystal_shore");
    public static final ResourceKey<Biome> ALFHEIMR_CORRUPTION_SHORE = register("alfheimr_corruption_shore");

    //FLATLANDS
    public static final ResourceKey<Biome> ALFHEIMR_PLAINS = register("alfheimr_plains");
    public static final ResourceKey<Biome> ALFHEIMR_CRYSTAL_PLAINS = register("alfheimr_crystal_plains");
    public static final ResourceKey<Biome> ALFHEIMR_FLOWER_PLAINS = register("alfheimr_flower_plains");
    public static final ResourceKey<Biome> ALFHEIMR_MYSTICAL_PLAINS = register("alfheimr_mystical_plains");
    public static final ResourceKey<Biome> ALFHEIMR_SNOWY_PLAINS = register("alfheimr_snowy_plains");
    public static final ResourceKey<Biome> ALFHEIMR_CORRUPTION = register("alfheimr_corruption");
    public static final ResourceKey<Biome> ALFHEIMR_CORRUPTION_SNOWY_PLAINS = register("alfheimr_corruption_snowy_plains");

    //ARID-LANDS
    public static final ResourceKey<Biome> ALFHEIMR_DESERT = register("alfheimr_desert");
    public static final ResourceKey<Biome> ALFHEIMR_CRYSTAL_DESERT = register("alfheimr_crystal_desert");
    public static final ResourceKey<Biome> ALFHEIMR_DRAGOON_DESERT = register("alfheimr_dragoon_desert");
    public static final ResourceKey<Biome> ALFHEIMR_SAVANNA = register("alfheimr_savanna");
    public static final ResourceKey<Biome> ALFHEIMR_MYSTICAL_SAVANNA = register("alfheimr_mystical_savanna");
    public static final ResourceKey<Biome> ALFHEIMR_DRY_RAVINE = register("alfheimr_dry_ravine");
    public static final ResourceKey<Biome> ALFHEIMR_WASTELAND = register("alfheimr_wasteland");
    public static final ResourceKey<Biome> ALFHEIMR_WASTELAND_DRY_RAVINE = register("alfheimr_wasteland_dry_ravine");
    public static final ResourceKey<Biome> ALFHEIMR_WASTELAND_PEAKS = register("alfheimr_wasteland_peaks");
    public static final ResourceKey<Biome> ALFHEIMR_WASTELAND_CRYSTAL = register("alfheimr_wasteland_crystal");
    public static final ResourceKey<Biome> ALFHEIMR_BADLANDS = register("alfheimr_badlands");
    public static final ResourceKey<Biome> ALFHEIMR_CORRUPTED_BADLANDS = register("alfheimr_corrupted_badlands");

    //CAVES
    public static final ResourceKey<Biome> ALFHEIMR_CRYSTAL_CAVERN = register("alfheimr_crystal_cavern");
    public static final ResourceKey<Biome> ALFHEIMR_OVERGROWN_CAVERN = register("alfheimr_overgrown_cavern");
    public static final ResourceKey<Biome> ALFHEIMR_CORRUPTED_CAVERN = register("alfheimr_corrupted_cavern");

    public static void bootstrap(BootstapContext<Biome> context) {
        HolderGetter<PlacedFeature> placedFeatureGetter = context.lookup(Registries.PLACED_FEATURE);
        HolderGetter<ConfiguredWorldCarver<?>> carverGetter = context.lookup(Registries.CONFIGURED_CARVER);

        //OFFLAND
        context.register(ALFHEIMR_FROZEN_OCEAN, oceanWithDefaults(defaultAmbientBuilder(), oceanMobSpawning(), oceanGen(placedFeatureGetter, carverGetter, false)).build());
        context.register(ALFHEIMR_DEEP_FROZEN_OCEAN, oceanWithDefaults(defaultAmbientBuilder(), oceanMobSpawning(), oceanGen(placedFeatureGetter, carverGetter, true)).build());
        context.register(ALFHEIMR_COLD_OCEAN, oceanWithDefaults(defaultAmbientBuilder(), oceanMobSpawning(), oceanGen(placedFeatureGetter, carverGetter, false)).build());
        context.register(ALFHEIMR_DEEP_COLD_OCEAN, oceanWithDefaults(defaultAmbientBuilder(), oceanMobSpawning(), oceanGen(placedFeatureGetter, carverGetter, true)).build());
        context.register(ALFHEIMR_OCEAN, oceanWithDefaults(defaultAmbientBuilder(), oceanMobSpawning(), oceanGen(placedFeatureGetter, carverGetter, false)).build());
        context.register(ALFHEIMR_DEEP_OCEAN, oceanWithDefaults(defaultAmbientBuilder(), oceanMobSpawning(), oceanGen(placedFeatureGetter, carverGetter, true)).build());
        context.register(ALFHEIMR_LUKEWARM_OCEAN, oceanWithDefaults(defaultAmbientBuilder(), oceanMobSpawning(), oceanGen(placedFeatureGetter, carverGetter, false)).build());
        context.register(ALFHEIMR_DEEP_LUKEWARM_OCEAN, oceanWithDefaults(defaultAmbientBuilder(), oceanMobSpawning(), oceanGen(placedFeatureGetter, carverGetter, true)).build());
        context.register(ALFHEIMR_WARM_OCEAN, oceanWithDefaults(defaultAmbientBuilder(), oceanMobSpawning(), oceanGen(placedFeatureGetter, carverGetter, false)).build());
        context.register(ALFHEIMR_DEEP_WARM_OCEAN, oceanWithDefaults(defaultAmbientBuilder(), oceanMobSpawning(), oceanGen(placedFeatureGetter, carverGetter, true)).build());

        context.register(ALFHEIMR_FROZEN_CORRUPTION_OCEAN, oceanWithDefaults(defaultAmbientBuilder(), oceanMobSpawning(), oceanGen(placedFeatureGetter, carverGetter, false)).build());
        context.register(ALFHEIMR_DEEP_FROZEN_CORRUPTION_OCEAN, oceanWithDefaults(defaultAmbientBuilder(), oceanMobSpawning(), oceanGen(placedFeatureGetter, carverGetter, true)).build());
        context.register(ALFHEIMR_COLD_CORRUPTION_OCEAN, oceanWithDefaults(defaultAmbientBuilder(), oceanMobSpawning(), oceanGen(placedFeatureGetter, carverGetter, false)).build());
        context.register(ALFHEIMR_DEEP_COLD_CORRUPTION_OCEAN, oceanWithDefaults(defaultAmbientBuilder(), oceanMobSpawning(), oceanGen(placedFeatureGetter, carverGetter, true)).build());
        context.register(ALFHEIMR_CORRUPTION_OCEAN, oceanWithDefaults(defaultAmbientBuilder(), oceanMobSpawning(), oceanGen(placedFeatureGetter, carverGetter, false)).build());
        context.register(ALFHEIMR_DEEP_CORRUPTION_OCEAN, oceanWithDefaults(defaultAmbientBuilder(), oceanMobSpawning(), oceanGen(placedFeatureGetter, carverGetter, true)).build());
        context.register(ALFHEIMR_LUKEWARM_CORRUPTION_OCEAN, oceanWithDefaults(defaultAmbientBuilder(), oceanMobSpawning(), oceanGen(placedFeatureGetter, carverGetter, false)).build());
        context.register(ALFHEIMR_DEEP_LUKEWARM_CORRUPTION_OCEAN, oceanWithDefaults(defaultAmbientBuilder(), oceanMobSpawning(), oceanGen(placedFeatureGetter, carverGetter, true)).build());
        context.register(ALFHEIMR_WARM_CORRUPTION_OCEAN, oceanWithDefaults(defaultAmbientBuilder(), oceanMobSpawning(), oceanGen(placedFeatureGetter, carverGetter, false)).build());
        context.register(ALFHEIMR_DEEP_WARM_CORRUPTION_OCEAN, oceanWithDefaults(defaultAmbientBuilder(), oceanMobSpawning(), oceanGen(placedFeatureGetter, carverGetter, true)).build());

        context.register(ALFHEIMR_FROZEN_CURSED_OCEAN, oceanWithDefaults(defaultAmbientBuilder(), oceanMobSpawning(), oceanGen(placedFeatureGetter, carverGetter, false)).build());
        context.register(ALFHEIMR_DEEP_FROZEN_CURSED_OCEAN, oceanWithDefaults(defaultAmbientBuilder(), oceanMobSpawning(), oceanGen(placedFeatureGetter, carverGetter, true)).build());
        context.register(ALFHEIMR_COLD_CURSED_OCEAN, oceanWithDefaults(defaultAmbientBuilder(), oceanMobSpawning(), oceanGen(placedFeatureGetter, carverGetter, false)).build());
        context.register(ALFHEIMR_DEEP_COLD_CURSED_OCEAN, oceanWithDefaults(defaultAmbientBuilder(), oceanMobSpawning(), oceanGen(placedFeatureGetter, carverGetter, true)).build());
        context.register(ALFHEIMR_CURSED_OCEAN, oceanWithDefaults(defaultAmbientBuilder(), oceanMobSpawning(), oceanGen(placedFeatureGetter, carverGetter, false)).build());
        context.register(ALFHEIMR_DEEP_CURSED_OCEAN, oceanWithDefaults(defaultAmbientBuilder(), oceanMobSpawning(), oceanGen(placedFeatureGetter, carverGetter, true)).build());
        context.register(ALFHEIMR_LUKEWARM_CURSED_OCEAN, oceanWithDefaults(defaultAmbientBuilder(), oceanMobSpawning(), oceanGen(placedFeatureGetter, carverGetter, false)).build());
        context.register(ALFHEIMR_DEEP_LUKEWARM_CURSED_OCEAN, oceanWithDefaults(defaultAmbientBuilder(), oceanMobSpawning(), oceanGen(placedFeatureGetter, carverGetter, true)).build());
        context.register(ALFHEIMR_WARM_CURSED_OCEAN, oceanWithDefaults(defaultAmbientBuilder(), oceanMobSpawning(), oceanGen(placedFeatureGetter, carverGetter, false)).build());
        context.register(ALFHEIMR_DEEP_WARM_CURSED_OCEAN, oceanWithDefaults(defaultAmbientBuilder(), oceanMobSpawning(), oceanGen(placedFeatureGetter, carverGetter, true)).build());

        context.register(ALFHEIMR_FROZEN_ENCHANTED_OCEAN, oceanWithDefaults(defaultAmbientBuilder(), oceanMobSpawning(), oceanGen(placedFeatureGetter, carverGetter, false)).build());
        context.register(ALFHEIMR_DEEP_FROZEN_ENCHANTED_OCEAN, oceanWithDefaults(defaultAmbientBuilder(), oceanMobSpawning(), oceanGen(placedFeatureGetter, carverGetter, true)).build());
        context.register(ALFHEIMR_COLD_ENCHANTED_OCEAN, oceanWithDefaults(defaultAmbientBuilder(), oceanMobSpawning(), oceanGen(placedFeatureGetter, carverGetter, false)).build());
        context.register(ALFHEIMR_DEEP_COLD_ENCHANTED_OCEAN, oceanWithDefaults(defaultAmbientBuilder(), oceanMobSpawning(), oceanGen(placedFeatureGetter, carverGetter, true)).build());
        context.register(ALFHEIMR_ENCHANTED_OCEAN, oceanWithDefaults(defaultAmbientBuilder(), oceanMobSpawning(), oceanGen(placedFeatureGetter, carverGetter, false)).build());
        context.register(ALFHEIMR_DEEP_ENCHANTED_OCEAN, oceanWithDefaults(defaultAmbientBuilder(), oceanMobSpawning(), oceanGen(placedFeatureGetter, carverGetter, true)).build());
        context.register(ALFHEIMR_LUKEWARM_ENCHANTED_OCEAN, oceanWithDefaults(defaultAmbientBuilder(), oceanMobSpawning(), oceanGen(placedFeatureGetter, carverGetter, false)).build());
        context.register(ALFHEIMR_DEEP_LUKEWARM_ENCHANTED_OCEAN, oceanWithDefaults(defaultAmbientBuilder(), oceanMobSpawning(), oceanGen(placedFeatureGetter, carverGetter, true)).build());
        context.register(ALFHEIMR_WARM_ENCHANTED_OCEAN, oceanWithDefaults(defaultAmbientBuilder(), oceanMobSpawning(), oceanGen(placedFeatureGetter, carverGetter, false)).build());
        context.register(ALFHEIMR_DEEP_WARM_ENCHANTED_OCEAN, oceanWithDefaults(defaultAmbientBuilder(), oceanMobSpawning(), oceanGen(placedFeatureGetter, carverGetter, true)).build());

        //HIGHLAND
        context.register(ALFHEIMR_HOLLOW_HILLS, biomeWithDefaults(defaultAmbientBuilder(), defaultMobSpawning(), defaultGen(placedFeatureGetter, carverGetter)).build());
        context.register(ALFHEIMR_SKY_PEAKS, biomeWithDefaults(defaultAmbientBuilder(), defaultMobSpawning(), defaultGen(placedFeatureGetter, carverGetter)).build());
        context.register(ALFHEIMR_STONY_HOLLOW, biomeWithDefaults(defaultAmbientBuilder(), defaultMobSpawning(), defaultGen(placedFeatureGetter, carverGetter)).build());
        context.register(ALFHEIMR_STONY_PEAKS, biomeWithDefaults(defaultAmbientBuilder(), defaultMobSpawning(), defaultGen(placedFeatureGetter, carverGetter)).build());
        context.register(ALFHEIMR_LOST_HILLS, biomeWithDefaults(defaultAmbientBuilder(), defaultMobSpawning(), defaultGen(placedFeatureGetter, carverGetter)).build());
        context.register(ALFHEIMR_KINGDOM_HILLS, biomeWithDefaults(defaultAmbientBuilder(), defaultMobSpawning(), defaultGen(placedFeatureGetter, carverGetter)).build());
        context.register(ALFHEIMR_DEADMAN_CLIFFS, biomeWithDefaults(defaultAmbientBuilder(), defaultMobSpawning(), defaultGen(placedFeatureGetter, carverGetter)).build());
        context.register(ALFHEIMR_SNOW_PEAKS, biomeWithDefaults(defaultAmbientBuilder(), defaultMobSpawning(), defaultGen(placedFeatureGetter, carverGetter)).build());
        context.register(ALFHEIMR_FROZEN_PEAKS, biomeWithDefaults(defaultAmbientBuilder(), defaultMobSpawning(), defaultGen(placedFeatureGetter, carverGetter)).build());
        context.register(ALFHEIMR_SNOW_GROVE, biomeWithDefaults(defaultAmbientBuilder(), defaultMobSpawning(), defaultGen(placedFeatureGetter, carverGetter)).build());
        context.register(ALFHEIMR_FROZEN_GROVE, biomeWithDefaults(defaultAmbientBuilder(), defaultMobSpawning(), defaultGen(placedFeatureGetter, carverGetter)).build());
        context.register(ALFHEIMR_CRYSTAL_CLIFFS, biomeWithDefaults(defaultAmbientBuilder(), defaultMobSpawning(), defaultGen(placedFeatureGetter, carverGetter)).build());
        context.register(ALFHEIMR_CRYSTAL_PEAKS, biomeWithDefaults(defaultAmbientBuilder(), defaultMobSpawning(), defaultGen(placedFeatureGetter, carverGetter)).build());
        context.register(ALFHEIMR_CORRUPTION_MOUNTAIN, biomeWithDefaults(defaultAmbientBuilder(), defaultMobSpawning(), defaultGen(placedFeatureGetter, carverGetter)).build());
        context.register(ALFHEIMR_CORRUPTION_GROVE, biomeWithDefaults(defaultAmbientBuilder(), defaultMobSpawning(), defaultGen(placedFeatureGetter, carverGetter)).build());
        context.register(ALFHEIMR_CORRUPTION_PEAKS, biomeWithDefaults(defaultAmbientBuilder(), defaultMobSpawning(), defaultGen(placedFeatureGetter, carverGetter)).build());
        context.register(ALFHEIMR_CORRUPTION_CLIFFS, biomeWithDefaults(defaultAmbientBuilder(), defaultMobSpawning(), defaultGen(placedFeatureGetter, carverGetter)).build());
        context.register(ALFHEIMR_MAGIC_VALLEY, biomeWithDefaults(defaultAmbientBuilder(), defaultMobSpawning(), defaultGen(placedFeatureGetter, carverGetter)).build());
        context.register(ALFHEIMR_TROPICS, biomeWithDefaults(defaultAmbientBuilder(), defaultMobSpawning(), defaultGen(placedFeatureGetter, carverGetter)).build());
        context.register(ALFHEIMR_MAGIC_TROPICS, biomeWithDefaults(defaultAmbientBuilder(), defaultMobSpawning(), defaultGen(placedFeatureGetter, carverGetter)).build());

        //WOODLANDS
        context.register(ALFHEIMR_FOREST, biomeWithDefaults(defaultAmbientBuilder(), defaultMobSpawning(), defaultGen(placedFeatureGetter, carverGetter)).build());
        context.register(ALFHEIMR_DENSE_FOREST, biomeWithDefaults(defaultAmbientBuilder(), defaultMobSpawning(), defaultGen(placedFeatureGetter, carverGetter)).build());
        context.register(ALFHEIMR_ENCHANTED_FOREST, biomeWithDefaults(defaultAmbientBuilder(), defaultMobSpawning(), magicForestGen(placedFeatureGetter, carverGetter)).build());
        context.register(ALFHEIMR_DENSE_ENCHANTED_FOREST, biomeWithDefaults(defaultAmbientBuilder(), defaultMobSpawning(), magicForestGen(placedFeatureGetter, carverGetter)).build());
        context.register(ALFHEIMR_DARK_ENCHANTED_FOREST, biomeWithDefaults(defaultAmbientBuilder(), defaultMobSpawning(), magicForestGen(placedFeatureGetter, carverGetter)).build());
        context.register(ALFHEIMR_CRYSTALLISED_FOREST, biomeWithDefaults(defaultAmbientBuilder(), defaultMobSpawning(), defaultGen(placedFeatureGetter, carverGetter)).build());
        context.register(ALFHEIMR_DENSE_CRYSTALLISED_FOREST, biomeWithDefaults(defaultAmbientBuilder(), defaultMobSpawning(), defaultGen(placedFeatureGetter, carverGetter)).build());
        context.register(ALFHEIMR_FAIRY_HILLS, biomeWithDefaults(defaultAmbientBuilder(), defaultMobSpawning(), defaultGen(placedFeatureGetter, carverGetter)).build());
        context.register(ALFHEIMR_GLISTENING_FORESTS, biomeWithDefaults(defaultAmbientBuilder(), defaultMobSpawning(), defaultGen(placedFeatureGetter, carverGetter)).build());
        context.register(ALFHEIMR_HAUNTED_FORESTS, biomeWithDefaults(defaultAmbientBuilder(), defaultMobSpawning(), defaultGen(placedFeatureGetter, carverGetter)).build());
        context.register(ALFHEIMR_JUNGLE, biomeWithDefaults(defaultAmbientBuilder(), defaultMobSpawning(), jungleGen(placedFeatureGetter, carverGetter)).build());
        context.register(ALFHEIMR_CURSED_JUNGLE, biomeWithDefaults(defaultAmbientBuilder(), defaultMobSpawning(), jungleGen(placedFeatureGetter, carverGetter)).build());
        context.register(ALFHEIMR_SNOW_FOREST, biomeWithDefaults(defaultAmbientBuilder(), defaultMobSpawning(), defaultGen(placedFeatureGetter, carverGetter)).build());
        context.register(ALFHEIMR_FROZEN_JUNGLE, biomeWithDefaults(defaultAmbientBuilder(), defaultMobSpawning(), jungleGen(placedFeatureGetter, carverGetter)).build());
        context.register(ALFHEIMR_MUSHROOM_FOREST, biomeWithDefaults(defaultAmbientBuilder(), defaultMobSpawning(), mushroomGen(placedFeatureGetter, carverGetter)).build());
        context.register(ALFHEIMR_DENSE_MUSHROOM_FOREST, biomeWithDefaults(defaultAmbientBuilder(), defaultMobSpawning(), defaultGen(placedFeatureGetter, carverGetter)).build());
        context.register(ALFHEIMR_FAIRY_RINGS, biomeWithDefaults(defaultAmbientBuilder(), defaultMobSpawning(), fairyRingsGen(placedFeatureGetter, carverGetter)).build());
        context.register(ALFHEIMR_CORRUPTION_FOREST, biomeWithDefaults(defaultAmbientBuilder(), defaultMobSpawning(), defaultGen(placedFeatureGetter, carverGetter)).build());
        context.register(ALFHEIMR_CORRUPTION_CRYSTAL_FOREST, biomeWithDefaults(defaultAmbientBuilder(), defaultMobSpawning(), defaultGen(placedFeatureGetter, carverGetter)).build());

        //WETLANDS
        context.register(ALFHEIMR_CRYSTAL_SPRING, biomeWithDefaults(defaultAmbientBuilder(), defaultMobSpawning(), defaultGen(placedFeatureGetter, carverGetter)).build());
        context.register(ALFHEIMR_RIVER, biomeWithDefaults(defaultAmbientBuilder(), defaultMobSpawning(), defaultGen(placedFeatureGetter, carverGetter)).build());
        context.register(ALFHEIMR_FROZEN_RIVER, biomeWithDefaults(defaultAmbientBuilder(), defaultMobSpawning(), defaultGen(placedFeatureGetter, carverGetter)).build());
        context.register(ALFHEIMR_STREAM, biomeWithDefaults(defaultAmbientBuilder(), defaultMobSpawning(), defaultGen(placedFeatureGetter, carverGetter)).build());
        context.register(ALFHEIMR_LAKE, biomeWithDefaults(defaultAmbientBuilder(), defaultMobSpawning(), defaultGen(placedFeatureGetter, carverGetter)).build());
        context.register(ALFHEIMR_SWAMP, biomeWithDefaults(defaultAmbientBuilder(), defaultMobSpawning(), swampGen(placedFeatureGetter, carverGetter)).build());
        context.register(ALFHEIMR_MEADOWS, biomeWithDefaults(defaultAmbientBuilder(), defaultMobSpawning(), swampGen(placedFeatureGetter, carverGetter)).build());
        context.register(ALFHEIMR_LOST_SWAMP, biomeWithDefaults(defaultAmbientBuilder(), defaultMobSpawning(), swampGen(placedFeatureGetter, carverGetter)).build());
        context.register(ALFHEIMR_BEACH, biomeWithDefaults(defaultAmbientBuilder(), defaultMobSpawning(), beachGen(placedFeatureGetter, carverGetter)).build());
        context.register(ALFHEIMR_FROZEN_BEACH, biomeWithDefaults(defaultAmbientBuilder(), defaultMobSpawning(), beachGen(placedFeatureGetter, carverGetter)).build());
        context.register(ALFHEIMR_STONY_SHORE, biomeWithDefaults(defaultAmbientBuilder(), defaultMobSpawning(), defaultGen(placedFeatureGetter, carverGetter)).build());
        context.register(ALFHEIMR_CRYSTAL_SHORE, biomeWithDefaults(defaultAmbientBuilder(), defaultMobSpawning(), defaultGen(placedFeatureGetter, carverGetter)).build());
        context.register(ALFHEIMR_CORRUPTION_SHORE, biomeWithDefaults(defaultAmbientBuilder(), defaultMobSpawning(), defaultGen(placedFeatureGetter, carverGetter)).build());

        //FLATLANDS
        context.register(ALFHEIMR_PLAINS, biomeWithDefaults(defaultAmbientBuilder(), defaultMobSpawning(), defaultGen(placedFeatureGetter, carverGetter)).build());
        context.register(ALFHEIMR_CRYSTAL_PLAINS, biomeWithDefaults(defaultAmbientBuilder(), defaultMobSpawning(), defaultGen(placedFeatureGetter, carverGetter)).build());
        context.register(ALFHEIMR_FLOWER_PLAINS, biomeWithDefaults(defaultAmbientBuilder(), defaultMobSpawning(), defaultGen(placedFeatureGetter, carverGetter)).build());
        context.register(ALFHEIMR_MYSTICAL_PLAINS, biomeWithDefaults(defaultAmbientBuilder(), defaultMobSpawning(), defaultGen(placedFeatureGetter, carverGetter)).build());
        context.register(ALFHEIMR_SNOWY_PLAINS, biomeWithDefaults(defaultAmbientBuilder(), defaultMobSpawning(), defaultGen(placedFeatureGetter, carverGetter)).build());
        context.register(ALFHEIMR_CORRUPTION, biomeWithDefaults(defaultAmbientBuilder(), defaultMobSpawning(), defaultGen(placedFeatureGetter, carverGetter)).build());
        context.register(ALFHEIMR_CORRUPTION_SNOWY_PLAINS, biomeWithDefaults(defaultAmbientBuilder(), defaultMobSpawning(), defaultGen(placedFeatureGetter, carverGetter)).build());

        //ARID-LANDS
        context.register(ALFHEIMR_DESERT, biomeWithDefaults(defaultAmbientBuilder(), defaultMobSpawning(), desertGen(placedFeatureGetter, carverGetter)).build());
        context.register(ALFHEIMR_CRYSTAL_DESERT, biomeWithDefaults(defaultAmbientBuilder(), defaultMobSpawning(), desertGen(placedFeatureGetter, carverGetter)).build());
        context.register(ALFHEIMR_DRAGOON_DESERT, biomeWithDefaults(defaultAmbientBuilder(), defaultMobSpawning(), desertGen(placedFeatureGetter, carverGetter)).build());
        context.register(ALFHEIMR_SAVANNA, biomeWithDefaults(defaultAmbientBuilder(), defaultMobSpawning(), barronGen(placedFeatureGetter, carverGetter)).build());
        context.register(ALFHEIMR_MYSTICAL_SAVANNA, biomeWithDefaults(defaultAmbientBuilder(), defaultMobSpawning(), barronGen(placedFeatureGetter, carverGetter)).build());
        context.register(ALFHEIMR_DRY_RAVINE, biomeWithDefaults(defaultAmbientBuilder(), defaultMobSpawning(), barronGen(placedFeatureGetter, carverGetter)).build());
        context.register(ALFHEIMR_WASTELAND, biomeWithDefaults(defaultAmbientBuilder(), defaultMobSpawning(), barronGen(placedFeatureGetter, carverGetter)).build());
        context.register(ALFHEIMR_WASTELAND_DRY_RAVINE, biomeWithDefaults(defaultAmbientBuilder(), defaultMobSpawning(), barronGen(placedFeatureGetter, carverGetter)).build());
        context.register(ALFHEIMR_WASTELAND_PEAKS, biomeWithDefaults(defaultAmbientBuilder(), defaultMobSpawning(), barronGen(placedFeatureGetter, carverGetter)).build());
        context.register(ALFHEIMR_WASTELAND_CRYSTAL, biomeWithDefaults(defaultAmbientBuilder(), defaultMobSpawning(), barronGen(placedFeatureGetter, carverGetter)).build());
        context.register(ALFHEIMR_BADLANDS, biomeWithDefaults(defaultAmbientBuilder(), defaultMobSpawning(), barronGen(placedFeatureGetter, carverGetter)).build());
        context.register(ALFHEIMR_CORRUPTED_BADLANDS, biomeWithDefaults(defaultAmbientBuilder(), defaultMobSpawning(), barronGen(placedFeatureGetter, carverGetter)).build());

        //CAVES
        context.register(ALFHEIMR_CRYSTAL_CAVERN, biomeWithDefaults(defaultAmbientBuilder(), defaultMobSpawning(), defaultGen(placedFeatureGetter, carverGetter)).build());
        context.register(ALFHEIMR_OVERGROWN_CAVERN, biomeWithDefaults(defaultAmbientBuilder(), defaultMobSpawning(), defaultGen(placedFeatureGetter, carverGetter)).build());
        context.register(ALFHEIMR_CORRUPTED_CAVERN, biomeWithDefaults(defaultAmbientBuilder(), defaultMobSpawning(), defaultGen(placedFeatureGetter, carverGetter)).build());
    }

    // Defaults
    public static Biome.BiomeBuilder biomeWithDefaults(BiomeSpecialEffects.Builder biomeAmbience, MobSpawnSettings.Builder mobSpawnInfo, BiomeGenerationSettings.Builder biomeGenerationSettings) {
        return new Biome.BiomeBuilder()
                .hasPrecipitation(true)
                .temperature(0.5F)
                .downfall(0.5F)
                .specialEffects(biomeAmbience.build())
                .mobSpawnSettings(mobSpawnInfo.build())
                .generationSettings(biomeGenerationSettings.build())
                .temperatureAdjustment(Biome.TemperatureModifier.NONE);
    }
    public static Biome.BiomeBuilder oceanWithDefaults(BiomeSpecialEffects.Builder biomeAmbience, MobSpawnSettings.Builder mobSpawnInfo, BiomeGenerationSettings.Builder biomeGenerationSettings) {
        return new Biome.BiomeBuilder()
                .hasPrecipitation(true)
                .temperature(0.5F)
                .downfall(0.5F)
                .specialEffects(biomeAmbience.build())
                .mobSpawnSettings(mobSpawnInfo.build())
                .generationSettings(biomeGenerationSettings.build())
                .temperatureAdjustment(Biome.TemperatureModifier.NONE);
    }

    public static BiomeGenerationSettings.Builder defaultGen(HolderGetter<PlacedFeature> featureGetter, HolderGetter<ConfiguredWorldCarver<?>> carverGetter) {
        BiomeGenerationSettings.Builder biome = defaultGenSettingBuilder(featureGetter, carverGetter);
        commonFeatures(biome);
        biome.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, ModVegetationPlacements.TREE_BLACK_BIRCH_KEY);
        biome.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, ModVegetationPlacements.TREE_BUR_OAK_KEY);
        biome.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, ModVegetationPlacements.TREE_WHITE_OAK_KEY);
        biome.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, ModVegetationPlacements.ALFHEIMR_MAGIC_GRASS_PLACED_KEY);
        biome.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, ModVegetationPlacements.ALFHEIMR_MAGIC_GRASS_SINGLE_PLACED_KEY);
        biome.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, ModVegetationPlacements.ALFHEIMR_MAGIC_GRASS_PATCH_PLACED_KEY);
        biome.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, ModVegetationPlacements.ALFHEIMR_FLOWERS_KEY);

        biome.addFeature(GenerationStep.Decoration.RAW_GENERATION, ModDecorPlacements.PLACED_ALFHEIMR_ROCKS_KEY);
        biome.addFeature(GenerationStep.Decoration.RAW_GENERATION, ModDecorPlacements.PLACED_ALFHEIMR_STICKS_KEY);

        return biome;
    }


    public static BiomeGenerationSettings.Builder beachGen(HolderGetter<PlacedFeature> featureGetter, HolderGetter<ConfiguredWorldCarver<?>> carverGetter) {
        BiomeGenerationSettings.Builder biome = defaultGenSettingBuilder(featureGetter, carverGetter);
        commonFeatures(biome);

        biome.addFeature(GenerationStep.Decoration.RAW_GENERATION, ModDecorPlacements.PLACED_ALFHEIMR_ROCKS_KEY);
        biome.addFeature(GenerationStep.Decoration.RAW_GENERATION, ModDecorPlacements.PLACED_ALFHEIMR_STICKS_KEY);
        biome.addFeature(GenerationStep.Decoration.RAW_GENERATION, ModDecorPlacements.PLACED_ALFHEIMR_SEASHELLS_KEY);

        return biome;
    }


    public static BiomeGenerationSettings.Builder desertGen(HolderGetter<PlacedFeature> featureGetter, HolderGetter<ConfiguredWorldCarver<?>> carverGetter) {
        BiomeGenerationSettings.Builder biome = defaultGenSettingBuilder(featureGetter, carverGetter);
        commonFeatures(biome);

        biome.addFeature(GenerationStep.Decoration.RAW_GENERATION, ModDecorPlacements.PLACED_ALFHEIMR_ROCKS_KEY);

        return biome;
    }

    public static BiomeGenerationSettings.Builder barronGen(HolderGetter<PlacedFeature> featureGetter, HolderGetter<ConfiguredWorldCarver<?>> carverGetter) {
        BiomeGenerationSettings.Builder biome = defaultGenSettingBuilder(featureGetter, carverGetter);
        commonFeatures(biome);
        biome.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, ModVegetationPlacements.TREE_DEADWOOD_KEY);

        biome.addFeature(GenerationStep.Decoration.RAW_GENERATION, ModDecorPlacements.PLACED_ALFHEIMR_ROCKS_KEY);
        biome.addFeature(GenerationStep.Decoration.RAW_GENERATION, ModDecorPlacements.PLACED_ALFHEIMR_STICKS_KEY);

        return biome;
    }

    public static BiomeGenerationSettings.Builder swampGen(HolderGetter<PlacedFeature> featureGetter, HolderGetter<ConfiguredWorldCarver<?>> carverGetter) {
        BiomeGenerationSettings.Builder biome = defaultGenSettingBuilder(featureGetter, carverGetter);
        commonFeatures(biome);
        biome.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, ModVegetationPlacements.TREE_WILLOW_KEY);
        biome.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, ModVegetationPlacements.ALFHEIMR_MAGIC_GRASS_PLACED_KEY);
        biome.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, ModVegetationPlacements.ALFHEIMR_MAGIC_GRASS_SINGLE_PLACED_KEY);
        biome.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, ModVegetationPlacements.ALFHEIMR_MAGIC_GRASS_PATCH_PLACED_KEY);
        biome.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, ModVegetationPlacements.ALFHEIMR_FLOWERS_KEY);

        biome.addFeature(GenerationStep.Decoration.RAW_GENERATION, ModDecorPlacements.PLACED_ALFHEIMR_ROCKS_KEY);
        biome.addFeature(GenerationStep.Decoration.RAW_GENERATION, ModDecorPlacements.PLACED_ALFHEIMR_STICKS_KEY);

        return biome;
    }

    public static BiomeGenerationSettings.Builder magicForestGen(HolderGetter<PlacedFeature> featureGetter, HolderGetter<ConfiguredWorldCarver<?>> carverGetter) {
        BiomeGenerationSettings.Builder biome = defaultGenSettingBuilder(featureGetter, carverGetter);
        commonFeatures(biome);
        biome.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, ModVegetationPlacements.TREE_BLACK_BIRCH_KEY);
        biome.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, ModVegetationPlacements.TREE_BUR_OAK_KEY);
        biome.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, ModVegetationPlacements.TREE_WHITE_OAK_KEY);
        biome.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, ModVegetationPlacements.TREE_SACRED_TREE_KEY);
        biome.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, ModVegetationPlacements.ALFHEIMR_MAGIC_GRASS_PLACED_KEY);
        biome.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, ModVegetationPlacements.ALFHEIMR_MAGIC_GRASS_SINGLE_PLACED_KEY);
        biome.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, ModVegetationPlacements.ALFHEIMR_MAGIC_GRASS_PATCH_PLACED_KEY);
        biome.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, ModVegetationPlacements.ALFHEIMR_FLOWERS_KEY);

        biome.addFeature(GenerationStep.Decoration.RAW_GENERATION, ModDecorPlacements.PLACED_ALFHEIMR_ROCKS_KEY);
        biome.addFeature(GenerationStep.Decoration.RAW_GENERATION, ModDecorPlacements.PLACED_ALFHEIMR_STICKS_KEY);

        return biome;
    }

    public static BiomeGenerationSettings.Builder jungleGen(HolderGetter<PlacedFeature> featureGetter, HolderGetter<ConfiguredWorldCarver<?>> carverGetter) {
        BiomeGenerationSettings.Builder biome = defaultGenSettingBuilder(featureGetter, carverGetter);
        commonFeatures(biome);
        biome.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, VegetationPlacements.TREES_JUNGLE);
        biome.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, ModVegetationPlacements.TREE_BLACK_BIRCH_KEY);
        biome.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, ModVegetationPlacements.TREE_BUR_OAK_KEY);
        biome.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, ModVegetationPlacements.TREE_WHITE_OAK_KEY);
        biome.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, ModVegetationPlacements.TREE_ELDER_WOOD_KEY);
        biome.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, ModVegetationPlacements.ALFHEIMR_MAGIC_GRASS_PLACED_KEY);
        biome.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, ModVegetationPlacements.ALFHEIMR_MAGIC_GRASS_SINGLE_PLACED_KEY);
        biome.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, ModVegetationPlacements.ALFHEIMR_MAGIC_GRASS_PATCH_PLACED_KEY);
        biome.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, ModVegetationPlacements.ALFHEIMR_FLOWERS_KEY);

        biome.addFeature(GenerationStep.Decoration.RAW_GENERATION, ModDecorPlacements.PLACED_ALFHEIMR_ROCKS_KEY);
        biome.addFeature(GenerationStep.Decoration.RAW_GENERATION, ModDecorPlacements.PLACED_ALFHEIMR_STICKS_KEY);

        return biome;
    }

    public static BiomeGenerationSettings.Builder oceanGen(HolderGetter<PlacedFeature> featureGetter, HolderGetter<ConfiguredWorldCarver<?>> carverGetter, boolean isDeep) {
        BiomeGenerationSettings.Builder biome = defaultGenSettingBuilder(featureGetter, carverGetter);
        commonFeatures(biome);

        biome.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, ModVegetationPlacements.TREE_BLACK_BIRCH_KEY);
        biome.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, ModVegetationPlacements.TREE_BUR_OAK_KEY);
        biome.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, ModVegetationPlacements.TREE_WHITE_OAK_KEY);

        biome.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, AquaticPlacements.WARM_OCEAN_VEGETATION);
        biome.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, AquaticPlacements.SEAGRASS_WARM);
        biome.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, AquaticPlacements.SEA_PICKLE);

        return biome;
    }

    public static BiomeGenerationSettings.Builder fairyRingsGen(HolderGetter<PlacedFeature> featureGetter, HolderGetter<ConfiguredWorldCarver<?>> carverGetter) {
        BiomeGenerationSettings.Builder biome = defaultGenSettingBuilder(featureGetter, carverGetter);
        commonFeatures(biome);

        biome.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, VegetationPlacements.MUSHROOM_ISLAND_VEGETATION);
        biome.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, VegetationPlacements.RED_MUSHROOM_NORMAL);
        biome.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, VegetationPlacements.BROWN_MUSHROOM_NORMAL);

        biome.addFeature(GenerationStep.Decoration.RAW_GENERATION, ModDecorPlacements.PLACED_ALFHEIMR_ROCKS_KEY);

        return biome;
    }

    public static BiomeGenerationSettings.Builder mushroomGen(HolderGetter<PlacedFeature> featureGetter, HolderGetter<ConfiguredWorldCarver<?>> carverGetter) {
        BiomeGenerationSettings.Builder biome = defaultGenSettingBuilder(featureGetter, carverGetter);
        commonFeatures(biome);

        biome.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, VegetationPlacements.MUSHROOM_ISLAND_VEGETATION);
        biome.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, VegetationPlacements.RED_MUSHROOM_NORMAL);
        biome.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, VegetationPlacements.BROWN_MUSHROOM_NORMAL);

        biome.addFeature(GenerationStep.Decoration.RAW_GENERATION, ModDecorPlacements.PLACED_ALFHEIMR_ROCKS_KEY);

        return biome;
    }

    public static BiomeSpecialEffects.Builder defaultAmbientBuilder() {
        BiomeSpecialEffects.Builder biomeBuilder = new BiomeSpecialEffects.Builder()
                .fogColor(0x147229)
                .waterColor(0x49e8c0)
                .waterFogColor(0x28ca82)
                .skyColor(0x409cc9)
                .foliageColorOverride(0x147229)
                .grassColorOverride(0x3afc6d)
                .ambientMoodSound(AmbientMoodSettings.LEGACY_CAVE_SETTINGS) // We should probably change it
                .backgroundMusic(Musics.createGameMusic(ModSounds.BAR_BRAWL.getHolder().get()));

        return biomeBuilder;
    }

    public static MobSpawnSettings.Builder defaultMobSpawning() {
        MobSpawnSettings.Builder spawnInfo = new MobSpawnSettings.Builder();

        spawnInfo.creatureGenerationProbability(0.1f);

        spawnInfo.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(ModEntities.RHINO.get(), 12, 4, 4));

        return spawnInfo;
    }

    public static MobSpawnSettings.Builder oceanMobSpawning() {
        MobSpawnSettings.Builder spawns = new MobSpawnSettings.Builder();

        spawns.addSpawn(MobCategory.WATER_AMBIENT, new MobSpawnSettings.SpawnerData(EntityType.COD, 20, 4, 8));
        spawns.addSpawn(MobCategory.WATER_AMBIENT, new MobSpawnSettings.SpawnerData(EntityType.SQUID, 20, 4, 8));
        spawns.addSpawn(MobCategory.WATER_AMBIENT, new MobSpawnSettings.SpawnerData(EntityType.TROPICAL_FISH, 20, 4, 8));
        spawns.addSpawn(MobCategory.WATER_AMBIENT, new MobSpawnSettings.SpawnerData(EntityType.SALMON, 20, 4, 8));
        spawns.addSpawn(MobCategory.WATER_AMBIENT, new MobSpawnSettings.SpawnerData(EntityType.DOLPHIN, 20, 4, 8));
        spawns.addSpawn(MobCategory.WATER_AMBIENT, new MobSpawnSettings.SpawnerData(EntityType.PUFFERFISH, 20, 4, 8));

        return spawns;
    }
    
    public static BiomeGenerationSettings.Builder globalOverworldGeneration(HolderGetter<PlacedFeature> featureGetter, HolderGetter<ConfiguredWorldCarver<?>> carverGetter) {
        BiomeGenerationSettings.Builder biome = defaultGenSettingBuilder(featureGetter, carverGetter);
        BiomeDefaultFeatures.addDefaultCarversAndLakes(biome);
        BiomeDefaultFeatures.addDefaultCrystalFormations(biome);
        BiomeDefaultFeatures.addDefaultMonsterRoom(biome);
        BiomeDefaultFeatures.addDefaultUndergroundVariety(biome);
        BiomeDefaultFeatures.addDefaultSprings(biome);
        BiomeDefaultFeatures.addSurfaceFreezing(biome);

        return biome;
    }

    public static BiomeGenerationSettings.Builder defaultGenSettingBuilder(HolderGetter<PlacedFeature> featureGetter, HolderGetter<ConfiguredWorldCarver<?>> carverGetter) {
        BiomeGenerationSettings.Builder biome = new BiomeGenerationSettings.Builder(featureGetter, carverGetter);

        BiomeDefaultFeatures.addDefaultSoftDisks(biome);
        biome.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, VegetationPlacements.PATCH_SUGAR_CANE);
        BiomeDefaultFeatures.addSurfaceFreezing(biome);
        addCaves(biome);
        addSmallStoneClusters(biome);

        return biome;
    }

    //Caves!
    public static void addCaves(BiomeGenerationSettings.Builder biome) {
        biome.addCarver(GenerationStep.Carving.AIR, ModConfiguredCarvers.ALFHEIMR_CAVE);
        addLegacyOres(biome);
    }

    public static void addLegacyOres(BiomeGenerationSettings.Builder biome) {
        biome.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, ModOrePlacements.PLACED_ALFHEIMR_COAL_ORE_KEY);
        biome.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, ModOrePlacements.PLACED_ALFHEIMR_IRON_ORE_KEY);
        biome.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, ModOrePlacements.PLACED_ALFHEIMR_GOLD_ORE_KEY);
        biome.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, ModOrePlacements.PLACED_ALFHEIMR_REDSTONE_ORE_KEY);
        biome.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, ModOrePlacements.PLACED_ALFHEIMR_DIAMOND_ORE_KEY);
        biome.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, ModOrePlacements.PLACED_ALFHEIMR_LAPIS_ORE_KEY);
        biome.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, ModOrePlacements.PLACED_ALFHEIMR_COPPER_ORE_KEY);
    }


    public static void addSmallStoneClusters(BiomeGenerationSettings.Builder biome) {
        biome.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, ModDecorPlacements.PLACED_ALFHEIMR_SMALL_ANDESITE_KEY);
        biome.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, ModDecorPlacements.PLACED_ALFHEIMR_SMALL_DIORITE_KEY);
        biome.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, ModDecorPlacements.PLACED_ALFHEIMR_SMALL_GRANITE_KEY);
    }

    public static void commonFeatures(BiomeGenerationSettings.Builder biome) {
        commonFeaturesWithoutBuildings(biome);
    }

    public static void commonFeaturesWithoutBuildings(BiomeGenerationSettings.Builder biome) {
    }

    public static List<ResourceKey<Biome>> getBiomes() {
        return ImmutableList.copyOf(BIOMES);
    }

    public static ResourceKey<Biome> register(String name) {
        ResourceKey<Biome> key = ResourceKey.create(Registries.BIOME, LostWorldsApi.modLoc(name));
        BIOMES.add(key);
        return key;
    }

    private static void registerBiome(BootstapContext<Biome> context, ResourceKey<Biome> key, Biome biome)
    {
        context.register(key, biome);
    }
}