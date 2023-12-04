package net.sen.lostworlds.worldgen;

import net.minecraft.core.HolderSet;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BiomeTags;
import net.minecraft.world.level.biome.MobSpawnSettings;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.world.BiomeModifier;
import net.minecraftforge.common.world.ForgeBiomeModifiers;
import net.minecraftforge.registries.ForgeRegistries;
import net.sen.lostworlds.LostWorlds;
import net.sen.lostworlds.entity.ModEntities;

import java.util.List;

public class ModBiomeModifiers {
    public static final ResourceKey<BiomeModifier> ADD_ELDER_WOOD = registerKey("add_elder_wood");
    public static final ResourceKey<BiomeModifier> ADD_OLIVE = registerKey("add_olive");
    public static final ResourceKey<BiomeModifier> ADD_MYRRH = registerKey("add_myrrh");
    public static final ResourceKey<BiomeModifier> ADD_LAUREL = registerKey("add_laurel");
    public static final ResourceKey<BiomeModifier> ADD_CYPRESS = registerKey("add_cypress");
    public static final ResourceKey<BiomeModifier> ADD_OVERWORLD_TIN_ORE = registerKey("add_overworld_tin_ore");
    public static final ResourceKey<BiomeModifier> ADD_OVERWORLD_IRIS_FLOWER = registerKey("add_overworld_iris_flower");
    public static final ResourceKey<BiomeModifier> SPAWN_RHINO = registerKey("spawn_rhino");
    public static final ResourceKey<BiomeModifier> SPAWN_SHARK = registerKey("spawn_shark");
    public static final ResourceKey<BiomeModifier> SPAWN_MORAY_EELS = registerKey("spawn_moray_eels");
    public static final ResourceKey<BiomeModifier> SPAWN_ELECTRIC_EELS = registerKey("spawn_electric_eels");
    public static final ResourceKey<BiomeModifier> SPAWN_JELLYFISH = registerKey("spawn_jellyfish");
    public static final ResourceKey<BiomeModifier> SPAWN_GIANT_SQUID = registerKey("spawn_giant_squid");
    public static final ResourceKey<BiomeModifier> SPAWN_RAY = registerKey("spawn_ray");
    public static final ResourceKey<BiomeModifier> SPAWN_GIANT_OCTOPUS = registerKey("spawn_giant_octopus");
    public static final ResourceKey<BiomeModifier> SPAWN_NUDIBRANCH_SLUG = registerKey("spawn_nudibranch_slug");
    public static final ResourceKey<BiomeModifier> SPAWN_GREAT_WHITE = registerKey("spawn_great_white");
    public static final ResourceKey<BiomeModifier> SPAWN_ANGLER_FISH = registerKey("spawn_angler_fish");
    public static final ResourceKey<BiomeModifier> SPAWN_SEAHORSE = registerKey("spawn_seahorse");
    public static final ResourceKey<BiomeModifier> SPAWN_CLOWNFISH = registerKey("spawn_clownfish");
    public static final ResourceKey<BiomeModifier> SPAWN_ATLANTIAN_GURDIAN = registerKey("spawn_atlantian_gurdian");
    public static final ResourceKey<BiomeModifier> SPAWN_SIREN = registerKey("spawn_siren");
    public static final ResourceKey<BiomeModifier> SPAWN_MERFOLK = registerKey("spawn_merfolk");
    public static final ResourceKey<BiomeModifier> SPAWN_ATLANTIAN = registerKey("spawn_atlantian");

    public static void bootstrap(BootstapContext<BiomeModifier> context) {
        var placedFeatures = context.lookup(Registries.PLACED_FEATURE);
        var biomes = context.lookup(Registries.BIOME);

        context.register(ADD_ELDER_WOOD, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(Tags.Biomes.IS_PLAINS),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.ELDER_WOOD_KEY)),
                GenerationStep.Decoration.VEGETAL_DECORATION
        ));

        context.register(ADD_OLIVE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(Tags.Biomes.IS_PLAINS),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.OLIVE_KEY)),
                GenerationStep.Decoration.VEGETAL_DECORATION
        ));

        context.register(ADD_MYRRH, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(Tags.Biomes.IS_PLAINS),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.MYRRH_KEY)),
                GenerationStep.Decoration.VEGETAL_DECORATION
        ));

        context.register(ADD_LAUREL, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(Tags.Biomes.IS_PLAINS),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.LAUREL_KEY)),
                GenerationStep.Decoration.VEGETAL_DECORATION
        ));

        context.register(ADD_CYPRESS, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(Tags.Biomes.IS_PLAINS),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.CYPRESS_KEY)),
                GenerationStep.Decoration.VEGETAL_DECORATION
        ));

        context.register(ADD_OVERWORLD_TIN_ORE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.OVERWORLD_TIN_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES
        ));

        context.register(ADD_OVERWORLD_IRIS_FLOWER, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(Tags.Biomes.IS_PLAINS),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.OVERWORLD_IRIS_PLACED_KEY)),
                GenerationStep.Decoration.VEGETAL_DECORATION
        ));

//        context.register(SPAWN_RHINO, new ForgeBiomeModifiers.AddSpawnsBiomeModifier(
//                biomes.getOrThrow(Tags.Biomes.IS_DRY_OVERWORLD),
//                List.of(new MobSpawnSettings.SpawnerData(ModEntities.RHINO.get(), 20, 1, 3))
//        ));
//
//        context.register(SPAWN_SHARK, new ForgeBiomeModifiers.AddSpawnsBiomeModifier(
//                biomes.getOrThrow(Tags.Biomes.IS_WATER),
//                List.of(new MobSpawnSettings.SpawnerData(ModEntities.SHARK.get(), 20, 1, 3))
//        ));
//
//        context.register(SPAWN_MORAY_EELS, new ForgeBiomeModifiers.AddSpawnsBiomeModifier(
//                biomes.getOrThrow(Tags.Biomes.IS_WATER),
//                List.of(new MobSpawnSettings.SpawnerData(ModEntities.MORAY_EELS.get(), 20, 1, 3))
//        ));
//
//        context.register(SPAWN_ELECTRIC_EELS, new ForgeBiomeModifiers.AddSpawnsBiomeModifier(
//                biomes.getOrThrow(Tags.Biomes.IS_WATER),
//                List.of(new MobSpawnSettings.SpawnerData(ModEntities.ELECTRIC_EELS.get(), 20, 1, 3))
//        ));
//
//        context.register(SPAWN_JELLYFISH, new ForgeBiomeModifiers.AddSpawnsBiomeModifier(
//                biomes.getOrThrow(Tags.Biomes.IS_WATER),
//                List.of(new MobSpawnSettings.SpawnerData(ModEntities.JELLYFISH.get(), 20, 1, 3))
//        ));
//
//        context.register(SPAWN_GIANT_SQUID, new ForgeBiomeModifiers.AddSpawnsBiomeModifier(
//                biomes.getOrThrow(Tags.Biomes.IS_WATER),
//                List.of(new MobSpawnSettings.SpawnerData(ModEntities.GIANT_SQUID.get(), 20, 1, 3))
//        ));
//
//        context.register(SPAWN_RAY, new ForgeBiomeModifiers.AddSpawnsBiomeModifier(
//                biomes.getOrThrow(Tags.Biomes.IS_WATER),
//                List.of(new MobSpawnSettings.SpawnerData(ModEntities.RAY.get(), 20, 1, 3))
//        ));
//
//        context.register(SPAWN_GIANT_OCTOPUS, new ForgeBiomeModifiers.AddSpawnsBiomeModifier(
//                biomes.getOrThrow(Tags.Biomes.IS_WATER),
//                List.of(new MobSpawnSettings.SpawnerData(ModEntities.GIANT_OCTOPUS.get(), 20, 1, 3))
//        ));
//
//        context.register(SPAWN_NUDIBRANCH_SLUG, new ForgeBiomeModifiers.AddSpawnsBiomeModifier(
//                biomes.getOrThrow(Tags.Biomes.IS_WATER),
//                List.of(new MobSpawnSettings.SpawnerData(ModEntities.NUDIBRANCH_SLUG.get(), 20, 1, 3))
//        ));
//
//        context.register(SPAWN_GREAT_WHITE, new ForgeBiomeModifiers.AddSpawnsBiomeModifier(
//                biomes.getOrThrow(Tags.Biomes.IS_WATER),
//                List.of(new MobSpawnSettings.SpawnerData(ModEntities.GREAT_WHITE.get(), 20, 1, 3))
//        ));
//
//        context.register(SPAWN_ANGLER_FISH, new ForgeBiomeModifiers.AddSpawnsBiomeModifier(
//                biomes.getOrThrow(Tags.Biomes.IS_WATER),
//                List.of(new MobSpawnSettings.SpawnerData(ModEntities.ANGLER_FISH.get(), 20, 1, 3))
//        ));
//
//        context.register(SPAWN_SEAHORSE, new ForgeBiomeModifiers.AddSpawnsBiomeModifier(
//                biomes.getOrThrow(Tags.Biomes.IS_WATER),
//                List.of(new MobSpawnSettings.SpawnerData(ModEntities.SEAHORSE.get(), 20, 1, 3))
//        ));
//
//        context.register(SPAWN_CLOWNFISH, new ForgeBiomeModifiers.AddSpawnsBiomeModifier(
//                biomes.getOrThrow(Tags.Biomes.IS_WATER),
//                List.of(new MobSpawnSettings.SpawnerData(ModEntities.CLOWNFISH.get(), 20, 1, 3))
//        ));
//
//        context.register(SPAWN_ATLANTIAN_GURDIAN, new ForgeBiomeModifiers.AddSpawnsBiomeModifier(
//                biomes.getOrThrow(Tags.Biomes.IS_WATER),
//                List.of(new MobSpawnSettings.SpawnerData(ModEntities.ATLANTIAN_GURDIAN.get(), 20, 1, 3))
//        ));
//
//        context.register(SPAWN_SIREN, new ForgeBiomeModifiers.AddSpawnsBiomeModifier(
//                biomes.getOrThrow(Tags.Biomes.IS_WATER),
//                List.of(new MobSpawnSettings.SpawnerData(ModEntities.SIREN.get(), 20, 1, 3))
//        ));
//
//        context.register(SPAWN_MERFOLK, new ForgeBiomeModifiers.AddSpawnsBiomeModifier(
//                biomes.getOrThrow(Tags.Biomes.IS_WATER),
//                List.of(new MobSpawnSettings.SpawnerData(ModEntities.MERFOLK.get(), 20, 1, 3))
//        ));
//
//        context.register(SPAWN_ATLANTIAN, new ForgeBiomeModifiers.AddSpawnsBiomeModifier(
//                biomes.getOrThrow(Tags.Biomes.IS_WATER),
//                List.of(new MobSpawnSettings.SpawnerData(ModEntities.ATLANTIAN.get(), 20, 1, 3))
//        ));
    }

    private static ResourceKey<BiomeModifier> registerKey(String name) {
        return ResourceKey.create(ForgeRegistries.Keys.BIOME_MODIFIERS, new ResourceLocation(LostWorlds.MODID, name));
    }
}
