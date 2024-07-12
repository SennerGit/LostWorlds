package net.sen.lostworlds.worldgen.biome.util.layer;

import net.minecraft.core.HolderGetter;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BiomeDefaultFeatures;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.data.worldgen.placement.VegetationPlacements;
import net.minecraft.resources.ResourceKey;
import net.minecraft.sounds.Musics;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.level.biome.*;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.carver.ConfiguredWorldCarver;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.sen.lostworlds.api.LostWorldsApi;
import net.sen.lostworlds.entity.ModEntities;
import net.sen.lostworlds.sound.ModSounds;
import net.sen.lostworlds.worldgen.placement.*;
import net.sen.lostworlds.worldgen.biome.util.layer.carver.ModConfiguredCarvers;

public class UnderworldBiomes {
    public static final ResourceKey<Biome> ASPHODEL_MEADOWS = register("underworld_asphodel_meadows");
    public static final ResourceKey<Biome> DOMINION_OF_HADES = register("underworld_dominion_of_hades");
    public static final ResourceKey<Biome> ELYSIAN_FIELDS = register("underworld_elysian_fields");
    public static final ResourceKey<Biome> ISLES_OF_THE_BLESSED = register("underworld_isles_of_the_blessed");
    public static final ResourceKey<Biome> LANDS_OF_DREAMS = register("underworld_lands_of_dreams");
    public static final ResourceKey<Biome> RIVER_STYX = register("underworld_river_styx");
    public static final ResourceKey<Biome> STYGAN_MARSH = register("underworld_stygan_marsh");
    public static final ResourceKey<Biome> TARTARUS = register("underworld_tartarus");

    public static void bootstrap(BootstrapContext<Biome> context) {
        HolderGetter<PlacedFeature> featureGetter = context.lookup(Registries.PLACED_FEATURE);
        HolderGetter<ConfiguredWorldCarver<?>> carverGetter = context.lookup(Registries.CONFIGURED_CARVER);

        context.register(ASPHODEL_MEADOWS, biomeWithDefaults(defaultAmbientBuilder(), defaultMobSpawning(), defaultGen(featureGetter, carverGetter)).build());
        context.register(DOMINION_OF_HADES, biomeWithDefaults(defaultAmbientBuilder(), defaultMobSpawning(), defaultGen(featureGetter, carverGetter)).build());
        context.register(ELYSIAN_FIELDS, biomeWithDefaults(defaultAmbientBuilder(), defaultMobSpawning(), defaultGen(featureGetter, carverGetter)).build());
        context.register(ISLES_OF_THE_BLESSED, biomeWithDefaults(defaultAmbientBuilder(), defaultMobSpawning(), defaultGen(featureGetter, carverGetter)).build());
        context.register(LANDS_OF_DREAMS, biomeWithDefaults(defaultAmbientBuilder(), defaultMobSpawning(), defaultGen(featureGetter, carverGetter)).build());
        context.register(RIVER_STYX, biomeWithDefaults(defaultAmbientBuilder(), defaultMobSpawning(), defaultGen(featureGetter, carverGetter)).build());
        context.register(STYGAN_MARSH, biomeWithDefaults(defaultAmbientBuilder(), defaultMobSpawning(), defaultGen(featureGetter, carverGetter)).build());
        context.register(TARTARUS, biomeWithDefaults(tartarusAmbientBuilder(), defaultMobSpawning(), defaultGen(featureGetter, carverGetter)).build());
    }

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
//        addHollowOakTrees(biome);
//        addForestVegetationAlt(biome);
        commonFeatures(biome);

        biome.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, ModVegetationPlacements.TREE_ELDER_WOOD_KEY);
        biome.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, ModVegetationPlacements.TREE_OLIVE_KEY);
        biome.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, ModVegetationPlacements.TREE_MYRRH_KEY);
        biome.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, ModVegetationPlacements.TREE_LAUREL_KEY);
        biome.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, ModVegetationPlacements.TREE_CYPRESS_KEY);
        biome.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, ModVegetationPlacements.FLOWER_IRIS_PLACED_KEY);
//        biome.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, VegetationPlacements.TREES_BIRCH_AND_OAK);
//
//        biome.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, TFPlacedFeatures.PLACED_VANILLA_TF_TREES);
//        biome.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, TFPlacedFeatures.PLACED_TWILIGHT_OAK_TREE);
//        biome.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, TFPlacedFeatures.PLACED_LARGE_TWILIGHT_OAK_TREE);
//        addCanopyTrees(biome);

        return biome;
    }

    public static BiomeSpecialEffects.Builder defaultAmbientBuilder() {
        BiomeSpecialEffects.Builder biomeBuilder = new BiomeSpecialEffects.Builder()
                .waterColor(0x684167)
                .waterFogColor(0x3F2E3D)
                .skyColor(0x24011B)
                .grassColorOverride(0x310025)
                .foliageColorOverride(0x3F0037)
                .fogColor(0x2D0029)
                .ambientMoodSound(AmbientMoodSettings.LEGACY_CAVE_SETTINGS)
//                .backgroundMusic(Musics.createGameMusic(ModSounds.BAR_BRAWL.getHolder().get()))
                ;

        return biomeBuilder;
    }

    public static BiomeSpecialEffects.Builder tartarusAmbientBuilder() {
        BiomeSpecialEffects.Builder biomeBuilder = new BiomeSpecialEffects.Builder()
                .waterColor(0xD2B136)
                .waterFogColor(0x7A5217)
                .skyColor(0xFFF047)
                .grassColorOverride(0x9D814B)
                .foliageColorOverride(0x715D0E)
                .fogColor(0xD2B136)
                .ambientMoodSound(AmbientMoodSettings.LEGACY_CAVE_SETTINGS)
//                .backgroundMusic(Musics.createGameMusic(ModSounds.BAR_BRAWL.getHolder().get()))
                ;

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
        BiomeDefaultFeatures.addForestGrass(biome);
        BiomeDefaultFeatures.addSavannaGrass(biome);
        BiomeDefaultFeatures.addDefaultGrass(biome);
        BiomeDefaultFeatures.addSavannaExtraGrass(biome);
        biome.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, VegetationPlacements.PATCH_SUGAR_CANE);
        BiomeDefaultFeatures.addSurfaceFreezing(biome);
        withWoodRoots(biome);
        addCaves(biome);
        addSmallStoneClusters(biome);
        return biome;
    }

    public static void withWoodRoots(BiomeGenerationSettings.Builder biome) {
//        biome.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, TFPlacedFeatures.PLACED_WOOD_ROOTS_SPREAD);
    }

    //Caves!
    public static void addCaves(BiomeGenerationSettings.Builder biome) {
        biome.addCarver(GenerationStep.Carving.AIR, ModConfiguredCarvers.UNDERWORLD_CAVE);
//        biome.addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, TFPlacedFeatures.PLACED_PLANT_ROOTS);
//        biome.addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, TFPlacedFeatures.PLACED_TORCH_BERRIES);
//        biome.addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, TFPlacedFeatures.PLACED_VANILLA_ROOTS);
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
//        biome.addFeature(GenerationStep.Decoration.SURFACE_STRUCTURES, TFPlacedFeatures.PLACED_DRUID_HUT);
//        biome.addFeature(GenerationStep.Decoration.SURFACE_STRUCTURES, TFPlacedFeatures.PLACED_WELL_PLACER);
//        biome.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, TFPlacedFeatures.PLACED_GROVE_RUINS);
//        biome.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, TFPlacedFeatures.PLACED_FOUNDATION);

        commonFeaturesWithoutBuildings(biome);
    }

    public static void commonFeaturesWithoutBuildings(BiomeGenerationSettings.Builder biome) {
//        biome.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, TFPlacedFeatures.PLACED_STONE_CIRCLE);
//        biome.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, TFPlacedFeatures.PLACED_OUTSIDE_STALAGMITE);
//        biome.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, TFPlacedFeatures.PLACED_MONOLITH);
//        biome.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, TFPlacedFeatures.PLACED_HOLLOW_STUMP);
//        biome.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, TFPlacedFeatures.PLACED_HOLLOW_LOG);
    }

    public static void globalOverworldGeneration(BiomeGenerationSettings.Builder builder) {
        BiomeDefaultFeatures.addDefaultCarversAndLakes(builder);
        BiomeDefaultFeatures.addDefaultCrystalFormations(builder);
        BiomeDefaultFeatures.addDefaultMonsterRoom(builder);
        BiomeDefaultFeatures.addDefaultUndergroundVariety(builder);
        BiomeDefaultFeatures.addDefaultSprings(builder);
        BiomeDefaultFeatures.addSurfaceFreezing(builder);
    }

    public static ResourceKey<Biome> register(String name) {
        return ResourceKey.create(Registries.BIOME, LostWorldsApi.modLoc(name));
    }
}
