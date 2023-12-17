package net.sen.lostworlds.worldgen.biome;

import net.minecraft.core.HolderGetter;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BiomeDefaultFeatures;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.data.worldgen.placement.VegetationPlacements;
import net.minecraft.resources.ResourceKey;
import net.minecraft.sounds.Musics;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.level.biome.*;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.carver.ConfiguredWorldCarver;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.sen.lostworlds.LostWorldsConstants;
import net.sen.lostworlds.entity.ModEntities;
import net.sen.lostworlds.sound.ModSounds;
import net.sen.lostworlds.worldgen.placement.*;
import net.sen.lostworlds.worldgen.biome.carver.ModConfiguredCarvers;

public class NidavellirBiomes {
    public static final ResourceKey<Biome> NIDAVELLIR_CAVERN = register("nidavellir_cavern");

    public static void bootstrap(BootstapContext<Biome> context) {
        HolderGetter<PlacedFeature> featureGetter = context.lookup(Registries.PLACED_FEATURE);
        HolderGetter<ConfiguredWorldCarver<?>> carverGetter = context.lookup(Registries.CONFIGURED_CARVER);

        context.register(NIDAVELLIR_CAVERN, biomeWithDefaults(defaultAmbientBuilder(), defaultMobSpawning(), defaultGen(featureGetter, carverGetter)).build());
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
        biome.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, VegetationPlacements.PATCH_SUGAR_CANE);
        BiomeDefaultFeatures.addSurfaceFreezing(biome);
        addCaves(biome);
        addSmallStoneClusters(biome);
        return biome;
    }

    //Caves!
    public static void addCaves(BiomeGenerationSettings.Builder biome) {
        biome.addCarver(GenerationStep.Carving.AIR, ModConfiguredCarvers.NIDAVELLIR_CAVE);
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
    }


    public static void addSmallStoneClusters(BiomeGenerationSettings.Builder biome) {
    }

    public static void commonFeatures(BiomeGenerationSettings.Builder biome) {
        commonFeaturesWithoutBuildings(biome);
    }

    public static void commonFeaturesWithoutBuildings(BiomeGenerationSettings.Builder biome) {
    }

    public static ResourceKey<Biome> register(String name) {
        return ResourceKey.create(Registries.BIOME, LostWorldsConstants.modLoc(name));
    }
}
