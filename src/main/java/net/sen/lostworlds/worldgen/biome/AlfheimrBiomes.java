package net.sen.lostworlds.worldgen.biome;

import net.minecraft.core.HolderGetter;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BiomeDefaultFeatures;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.data.worldgen.placement.VegetationPlacements;
import net.minecraft.resources.ResourceKey;
import net.minecraft.sounds.Musics;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.level.biome.*;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.carver.ConfiguredWorldCarver;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.sen.lostworlds.LostWorldsApi;
import net.sen.lostworlds.entity.ModEntities;
import net.sen.lostworlds.sound.ModSounds;
import net.sen.lostworlds.worldgen.placement.*;
import net.sen.lostworlds.worldgen.biome.carver.ModConfiguredCarvers;

public class AlfheimrBiomes {
    /*
    ALFHEIMR
    */
    //Forest
    public static final ResourceKey<Biome> ALFHEIMR_ENCHANTED_FOREST = register("alfheimr_enchanted_forest");
    public static final ResourceKey<Biome> ALFHEIMR_FAIRY_HILLS = register("alfheimr_fairy_hills");
    public static final ResourceKey<Biome> ALFHEIMR_FAIRY_RINGS = register("alfheimr_fairy_rings");
    public static final ResourceKey<Biome> ALFHEIMR_GLISTENING_FORESTS = register("alfheimr_glistening_forests");

    //Underground
    public static final ResourceKey<Biome> ALFHEIMR_CRYSTAL_CAVERN = register("alfheimr_crystal_cavern");
    public static final ResourceKey<Biome> ALFHEIMR_UNDERGROUND = register("alfheimr_underground");
    public static final ResourceKey<Biome> ALFHEIMR_OVERGROWN_CAVERN = register("alfheimr_overgrown_cavern");

    //Corruption
    public static final ResourceKey<Biome> ALFHEIMR_CORRUPTION = register("alfheimr_corruption");
    public static final ResourceKey<Biome> ALFHEIMR_CORRUPTION_MOUNTAIN = register("alfheimr_corruption_mountain");
    public static final ResourceKey<Biome> ALFHEIMR_CORRUPTED_CAVERN = register("alfheimr_corrupted_cavern");

    //Desert
    public static final ResourceKey<Biome> ALFHEIMR_DESERT = register("alfheimr_desert");

    //Snow
    public static final ResourceKey<Biome> ALFHEIMR_SNOW_FOREST = register("alfheimr_snow_forest");

    //Mountains
    public static final ResourceKey<Biome> ALFHEIMR_HOLLOW_HILLS = register("alfheimr_hollow_hills");
    public static final ResourceKey<Biome> ALFHEIMR_SKY_PEAKS = register("alfheimr_sky_peaks");

    //Water
    public static final ResourceKey<Biome> ALFHEIMR_CRYSTAL_SPRING = register("alfheimr_crystal_spring");
    public static final ResourceKey<Biome> ALFHEIMR_OCEAN = register("alfheimr_ocean");
    public static final ResourceKey<Biome> ALFHEIMR_RIVER = register("alfheimr_river");
    public static final ResourceKey<Biome> ALFHEIMR_STREAM = register("alfheimr_stream");

    //Swamp
    public static final ResourceKey<Biome> ALFHEIMR_MEADOWS = register("alfheimr_meadows");

    public static void bootstrap(BootstapContext<Biome> context) {
        HolderGetter<PlacedFeature> featureGetter = context.lookup(Registries.PLACED_FEATURE);
        HolderGetter<ConfiguredWorldCarver<?>> carverGetter = context.lookup(Registries.CONFIGURED_CARVER);

        context.register(ALFHEIMR_ENCHANTED_FOREST, biomeWithDefaults(defaultAmbientBuilder(), defaultMobSpawning(), defaultGen(featureGetter, carverGetter)).build());
        context.register(ALFHEIMR_FAIRY_HILLS, biomeWithDefaults(defaultAmbientBuilder(), defaultMobSpawning(), defaultGen(featureGetter, carverGetter)).build());
        context.register(ALFHEIMR_FAIRY_RINGS, biomeWithDefaults(defaultAmbientBuilder(), defaultMobSpawning(), fairyRingsGen(featureGetter, carverGetter)).build());
        context.register(ALFHEIMR_GLISTENING_FORESTS, biomeWithDefaults(defaultAmbientBuilder(), defaultMobSpawning(), defaultGen(featureGetter, carverGetter)).build());
        context.register(ALFHEIMR_CRYSTAL_CAVERN, biomeWithDefaults(defaultAmbientBuilder(), defaultMobSpawning(), defaultGen(featureGetter, carverGetter)).build());
        context.register(ALFHEIMR_UNDERGROUND, biomeWithDefaults(defaultAmbientBuilder(), defaultMobSpawning(), defaultGen(featureGetter, carverGetter)).build());
        context.register(ALFHEIMR_OVERGROWN_CAVERN, biomeWithDefaults(defaultAmbientBuilder(), defaultMobSpawning(), defaultGen(featureGetter, carverGetter)).build());
        context.register(ALFHEIMR_CORRUPTION, biomeWithDefaults(defaultAmbientBuilder(), defaultMobSpawning(), defaultGen(featureGetter, carverGetter)).build());
        context.register(ALFHEIMR_CORRUPTION_MOUNTAIN, biomeWithDefaults(defaultAmbientBuilder(), defaultMobSpawning(), defaultGen(featureGetter, carverGetter)).build());
        context.register(ALFHEIMR_CORRUPTED_CAVERN, biomeWithDefaults(defaultAmbientBuilder(), defaultMobSpawning(), defaultGen(featureGetter, carverGetter)).build());
        context.register(ALFHEIMR_DESERT, biomeWithDefaults(defaultAmbientBuilder(), defaultMobSpawning(), defaultGen(featureGetter, carverGetter)).build());
        context.register(ALFHEIMR_SNOW_FOREST, biomeWithDefaults(defaultAmbientBuilder(), defaultMobSpawning(), defaultGen(featureGetter, carverGetter)).build());
        context.register(ALFHEIMR_HOLLOW_HILLS, biomeWithDefaults(defaultAmbientBuilder(), defaultMobSpawning(), defaultGen(featureGetter, carverGetter)).build());
        context.register(ALFHEIMR_SKY_PEAKS, biomeWithDefaults(defaultAmbientBuilder(), defaultMobSpawning(), defaultGen(featureGetter, carverGetter)).build());
        context.register(ALFHEIMR_CRYSTAL_SPRING, biomeWithDefaults(defaultAmbientBuilder(), defaultMobSpawning(), defaultGen(featureGetter, carverGetter)).build());
        context.register(ALFHEIMR_OCEAN, biomeWithDefaults(defaultAmbientBuilder(), defaultMobSpawning(), defaultGen(featureGetter, carverGetter)).build());
        context.register(ALFHEIMR_RIVER, biomeWithDefaults(defaultAmbientBuilder(), defaultMobSpawning(), defaultGen(featureGetter, carverGetter)).build());
        context.register(ALFHEIMR_STREAM, biomeWithDefaults(defaultAmbientBuilder(), defaultMobSpawning(), defaultGen(featureGetter, carverGetter)).build());
        context.register(ALFHEIMR_MEADOWS, biomeWithDefaults(defaultAmbientBuilder(), defaultMobSpawning(), defaultGen(featureGetter, carverGetter)).build());
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

    public static BiomeGenerationSettings.Builder defaultGen(HolderGetter<PlacedFeature> featureGetter, HolderGetter<ConfiguredWorldCarver<?>> carverGetter) {
        BiomeGenerationSettings.Builder biome = defaultGenSettingBuilder(featureGetter, carverGetter);
        commonFeatures(biome);
        biome.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, VegetationPlacements.TREES_JUNGLE);
        biome.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, VegetationPlacements.TREES_SPARSE_JUNGLE);
        biome.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, ModVegetationPlacements.ALFHEIMR_MAGIC_GRASS_PLACED_KEY);
        biome.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, ModVegetationPlacements.ALFHEIMR_MAGIC_GRASS_SINGLE_PLACED_KEY);
        biome.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, ModVegetationPlacements.ALFHEIMR_MAGIC_GRASS_PATCH_PLACED_KEY);
        biome.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, ModVegetationPlacements.ALFHEIMR_FLOWERS_KEY);

        return biome;
    }

    public static BiomeGenerationSettings.Builder fairyRingsGen(HolderGetter<PlacedFeature> featureGetter, HolderGetter<ConfiguredWorldCarver<?>> carverGetter) {
        BiomeGenerationSettings.Builder biome = defaultGenSettingBuilder(featureGetter, carverGetter);
        commonFeatures(biome);
        biome.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, VegetationPlacements.MUSHROOM_ISLAND_VEGETATION);
        biome.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, VegetationPlacements.RED_MUSHROOM_NORMAL);
        biome.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, VegetationPlacements.BROWN_MUSHROOM_NORMAL);

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

    public static ResourceKey<Biome> register(String name) {
        return ResourceKey.create(Registries.BIOME, LostWorldsApi.modLoc(name));
    }
}
