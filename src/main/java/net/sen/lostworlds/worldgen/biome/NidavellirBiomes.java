package net.sen.lostworlds.worldgen.biome;

import net.minecraft.core.HolderGetter;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BiomeDefaultFeatures;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.data.worldgen.placement.AquaticPlacements;
import net.minecraft.data.worldgen.placement.CavePlacements;
import net.minecraft.data.worldgen.placement.MiscOverworldPlacements;
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

public class NidavellirBiomes {
    public static final ResourceKey<Biome> NIDAVELLIR_CAVERN = register("nidavellir_cavern");
    public static final ResourceKey<Biome> NIDAVELLIR_OVERGROWN_CAVERN = register("nidavellir_overgrown_cavern");
    public static final ResourceKey<Biome> NIDAVELLIR_SUNKEN_CAVERN = register("nidavellir_sunken_cavern");
    public static final ResourceKey<Biome> NIDAVELLIR_LAVA_CAVERN = register("nidavellir_lava_cavern");
    public static final ResourceKey<Biome> NIDAVELLIR_FUNGAL_CAVERN = register("nidavellir_fungal_cavern");

    public static void bootstrap(BootstapContext<Biome> context) {
        HolderGetter<PlacedFeature> featureGetter = context.lookup(Registries.PLACED_FEATURE);
        HolderGetter<ConfiguredWorldCarver<?>> carverGetter = context.lookup(Registries.CONFIGURED_CARVER);

        context.register(NIDAVELLIR_CAVERN, biomeWithDefaults(defaultAmbientBuilder(), defaultMobSpawning(), defaultGen(featureGetter, carverGetter)).build());
        context.register(NIDAVELLIR_OVERGROWN_CAVERN, biomeWithDefaults(defaultAmbientBuilder(), defaultMobSpawning(), overgrownCavernGen(featureGetter, carverGetter)).build());
        context.register(NIDAVELLIR_SUNKEN_CAVERN, biomeWithDefaults(defaultAmbientBuilder(), defaultMobSpawning(), sunkenCavernGen(featureGetter, carverGetter)).build());
        context.register(NIDAVELLIR_LAVA_CAVERN, biomeWithDefaults(defaultAmbientBuilder(), defaultMobSpawning(), lavaCavernGen(featureGetter, carverGetter)).build());
        context.register(NIDAVELLIR_FUNGAL_CAVERN, biomeWithDefaults(defaultAmbientBuilder(), defaultMobSpawning(), fungalCavernGen(featureGetter, carverGetter)).build());
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

        return biome;
    }

    public static BiomeGenerationSettings.Builder fungalCavernGen(HolderGetter<PlacedFeature> featureGetter, HolderGetter<ConfiguredWorldCarver<?>> carverGetter) {
        BiomeGenerationSettings.Builder biome = defaultGenSettingBuilder(featureGetter, carverGetter);
        commonFeatures(biome);

        biome.addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, VegetationPlacements.MUSHROOM_ISLAND_VEGETATION);

        return biome;
    }

    public static BiomeGenerationSettings.Builder overgrownCavernGen(HolderGetter<PlacedFeature> featureGetter, HolderGetter<ConfiguredWorldCarver<?>> carverGetter) {
        BiomeGenerationSettings.Builder biome = defaultGenSettingBuilder(featureGetter, carverGetter);
        commonFeatures(biome);
        biome.addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, CavePlacements.ROOTED_AZALEA_TREE);
        biome.addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, CavePlacements.CAVE_VINES);
        biome.addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, CavePlacements.GLOW_LICHEN);
        biome.addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, CavePlacements.DRIPSTONE_CLUSTER);
        biome.addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, CavePlacements.LARGE_DRIPSTONE);
        biome.addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, CavePlacements.POINTED_DRIPSTONE);
        biome.addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, CavePlacements.SPORE_BLOSSOM);
        biome.addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, CavePlacements.LUSH_CAVES_CEILING_VEGETATION);
        biome.addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, CavePlacements.LUSH_CAVES_CLAY);
        biome.addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, MiscOverworldPlacements.FOREST_ROCK);

        return biome;
    }

    public static BiomeGenerationSettings.Builder sunkenCavernGen(HolderGetter<PlacedFeature> featureGetter, HolderGetter<ConfiguredWorldCarver<?>> carverGetter) {
        BiomeGenerationSettings.Builder biome = sunkenCavernGenSettingBuilder(featureGetter, carverGetter);
        commonFeatures(biome);

        biome.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, AquaticPlacements.WARM_OCEAN_VEGETATION);
        biome.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, AquaticPlacements.SEAGRASS_WARM);
        biome.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, AquaticPlacements.SEA_PICKLE);

        biome.addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, CavePlacements.UNDERWATER_MAGMA);
        biome.addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, MiscOverworldPlacements.SPRING_WATER);

        return biome;
    }

    public static BiomeGenerationSettings.Builder lavaCavernGen(HolderGetter<PlacedFeature> featureGetter, HolderGetter<ConfiguredWorldCarver<?>> carverGetter) {
        BiomeGenerationSettings.Builder biome = lavaCavernGenSettingBuilder(featureGetter, carverGetter);
        commonFeatures(biome);

        biome.addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, MiscOverworldPlacements.LAKE_LAVA_UNDERGROUND);
        biome.addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, MiscOverworldPlacements.SPRING_LAVA);

        return biome;
    }

    public static BiomeSpecialEffects.Builder defaultAmbientBuilder() {

        return new BiomeSpecialEffects.Builder()
                .fogColor(0x147229)
                .waterColor(0x49e8c0)
                .waterFogColor(0x28ca82)
                .skyColor(0x409cc9)
                .foliageColorOverride(0x147229)
                .grassColorOverride(0x3afc6d)
                .ambientMoodSound(AmbientMoodSettings.LEGACY_CAVE_SETTINGS) // We should probably change it
                .backgroundMusic(Musics.createGameMusic(ModSounds.BAR_BRAWL.getHolder().get()));
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
        BiomeDefaultFeatures.addForestGrass(biome);
        BiomeDefaultFeatures.addSavannaGrass(biome);
        BiomeDefaultFeatures.addDefaultGrass(biome);
        BiomeDefaultFeatures.addSavannaExtraGrass(biome);
        biome.addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, CavePlacements.AMETHYST_GEODE);
        biome.addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, CavePlacements.FOSSIL_LOWER);
        biome.addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, CavePlacements.FOSSIL_UPPER);
//        biome.addFeature(GenerationStep.Decoration.UNDERGROUND_STRUCTURES, SpawnPlacements);
        BiomeDefaultFeatures.addSurfaceFreezing(biome);
        addCaves(biome);
        addSmallStoneClusters(biome);
        return biome;
    }

    public static BiomeGenerationSettings.Builder lavaCavernGenSettingBuilder(HolderGetter<PlacedFeature> featureGetter, HolderGetter<ConfiguredWorldCarver<?>> carverGetter) {
        BiomeGenerationSettings.Builder biome = new BiomeGenerationSettings.Builder(featureGetter, carverGetter);

        BiomeDefaultFeatures.addDefaultSoftDisks(biome);
        BiomeDefaultFeatures.addForestGrass(biome);
        BiomeDefaultFeatures.addSavannaGrass(biome);
        BiomeDefaultFeatures.addDefaultGrass(biome);
        BiomeDefaultFeatures.addSavannaExtraGrass(biome);
        biome.addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, CavePlacements.AMETHYST_GEODE);
        biome.addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, CavePlacements.FOSSIL_LOWER);
        biome.addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, CavePlacements.FOSSIL_UPPER);
//        biome.addFeature(GenerationStep.Decoration.UNDERGROUND_STRUCTURES, SpawnPlacements);
        BiomeDefaultFeatures.addSurfaceFreezing(biome);
        addLavaCavernCaves(biome);
        addSmallStoneClusters(biome);
        return biome;
    }

    public static BiomeGenerationSettings.Builder sunkenCavernGenSettingBuilder(HolderGetter<PlacedFeature> featureGetter, HolderGetter<ConfiguredWorldCarver<?>> carverGetter) {
        BiomeGenerationSettings.Builder biome = new BiomeGenerationSettings.Builder(featureGetter, carverGetter);

        BiomeDefaultFeatures.addDefaultSoftDisks(biome);
        BiomeDefaultFeatures.addForestGrass(biome);
        BiomeDefaultFeatures.addSavannaGrass(biome);
        BiomeDefaultFeatures.addDefaultGrass(biome);
        BiomeDefaultFeatures.addSavannaExtraGrass(biome);
        biome.addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, CavePlacements.AMETHYST_GEODE);
        biome.addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, CavePlacements.FOSSIL_LOWER);
        biome.addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, CavePlacements.FOSSIL_UPPER);
//        biome.addFeature(GenerationStep.Decoration.UNDERGROUND_STRUCTURES, SpawnPlacements);
        BiomeDefaultFeatures.addSurfaceFreezing(biome);
        addSunkenCavernCaves(biome);
        addSmallStoneClusters(biome);
        return biome;
    }

    //Caves!
    public static void addCaves(BiomeGenerationSettings.Builder biome) {
        biome.addCarver(GenerationStep.Carving.AIR, ModConfiguredCarvers.NIDAVELLIR_CAVE);
        addLegacyOres(biome);
    }

    public static void addLavaCavernCaves(BiomeGenerationSettings.Builder biome) {
        biome.addCarver(GenerationStep.Carving.AIR, ModConfiguredCarvers.NIDAVELLIR_LAVA_CAVERN_CAVE);
        addLegacyOres(biome);
    }

    public static void addSunkenCavernCaves(BiomeGenerationSettings.Builder biome) {
        biome.addCarver(GenerationStep.Carving.AIR, ModConfiguredCarvers.NIDAVELLIR_SUNKEN_CAVERN_CAVE);
        addLegacyOres(biome);
    }

    public static void addLegacyOres(BiomeGenerationSettings.Builder biome) {
        biome.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, ModOrePlacements.PLACED_NIDAVELLIR_COAL_ORE_KEY);
        biome.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, ModOrePlacements.PLACED_NIDAVELLIR_COAL_ORE_CLUSTER_KEY);
        biome.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, ModOrePlacements.PLACED_NIDAVELLIR_IRON_ORE_KEY);
        biome.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, ModOrePlacements.PLACED_NIDAVELLIR_IRON_ORE_CLUSTER_KEY);
        biome.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, ModOrePlacements.PLACED_NIDAVELLIR_GOLD_ORE_KEY);
        biome.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, ModOrePlacements.PLACED_NIDAVELLIR_GOLD_ORE_CLUSTER_KEY);
        biome.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, ModOrePlacements.PLACED_NIDAVELLIR_REDSTONE_ORE_KEY);
        biome.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, ModOrePlacements.PLACED_NIDAVELLIR_REDSTONE_ORE_CLUSTER_KEY);
        biome.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, ModOrePlacements.PLACED_NIDAVELLIR_DIAMOND_ORE_KEY);
        biome.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, ModOrePlacements.PLACED_NIDAVELLIR_DIAMOND_ORE_CLUSTER_KEY);
        biome.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, ModOrePlacements.PLACED_NIDAVELLIR_LAPIS_ORE_KEY);
        biome.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, ModOrePlacements.PLACED_NIDAVELLIR_LAPIS_ORE_CLUSTER_KEY);
        biome.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, ModOrePlacements.PLACED_NIDAVELLIR_COPPER_ORE_KEY);
        biome.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, ModOrePlacements.PLACED_NIDAVELLIR_COPPER_ORE_CLUSTER_KEY);
        biome.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, ModOrePlacements.PLACED_NIDAVELLIR_TIN_ORE_KEY);
        biome.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, ModOrePlacements.PLACED_NIDAVELLIR_TIN_ORE_CLUSTER_KEY);
        biome.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, ModOrePlacements.PLACED_NIDAVELLIR_ZINC_ORE_KEY);
        biome.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, ModOrePlacements.PLACED_NIDAVELLIR_ZINC_ORE_CLUSTER_KEY);
        biome.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, ModOrePlacements.PLACED_NIDAVELLIR_AQUAMARINE_ORE_KEY);
        biome.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, ModOrePlacements.PLACED_NIDAVELLIR_AQUAMARINE_ORE_CLUSTER_KEY);
        biome.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, ModOrePlacements.PLACED_NIDAVELLIR_OPAL_ORE_KEY);
        biome.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, ModOrePlacements.PLACED_NIDAVELLIR_OPAL_ORE_CLUSTER_KEY);
        biome.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, ModOrePlacements.PLACED_NIDAVELLIR_RUBY_ORE_KEY);
        biome.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, ModOrePlacements.PLACED_NIDAVELLIR_RUBY_ORE_CLUSTER_KEY);
    }


    public static void addSmallStoneClusters(BiomeGenerationSettings.Builder biome) {
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
