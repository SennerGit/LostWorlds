package net.sen.lostworlds.worldgen.placement;

import net.minecraft.core.Holder;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.data.worldgen.placement.VegetationPlacements;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.placement.*;
import net.sen.lostworlds.LostWorldsApi;
import net.sen.lostworlds.block.AlfheimrBlocks;
import net.sen.lostworlds.block.ModBlocks;
import net.sen.lostworlds.block.UnderworldBlocks;
import net.sen.lostworlds.worldgen.features.*;

import java.util.List;

public class ModVegetationPlacements {
    //Trees
    public static final ResourceKey<PlacedFeature> TREE_ELDER_WOOD_KEY = registerKey("elder_wood_placed");
    public static final ResourceKey<PlacedFeature> TREE_OLIVE_KEY = registerKey("olive_placed");
    public static final ResourceKey<PlacedFeature> TREE_MYRRH_KEY = registerKey("myrrh_placed");
    public static final ResourceKey<PlacedFeature> TREE_LAUREL_KEY = registerKey("laurel_placed");
    public static final ResourceKey<PlacedFeature> TREE_CYPRESS_KEY = registerKey("cypress_placed");
    public static final ResourceKey<PlacedFeature> TREE_BLACK_BIRCH_KEY = registerKey("black_birch_placed");
    public static final ResourceKey<PlacedFeature> TREE_WHITE_OAK_KEY = registerKey("white_oak_placed");
    public static final ResourceKey<PlacedFeature> TREE_BUR_OAK_KEY = registerKey("bur_oak_placed");
    public static final ResourceKey<PlacedFeature> TREE_BLOOD_CHERRY_KEY = registerKey("blood_cherry_placed");
    public static final ResourceKey<PlacedFeature> TREE_SACRED_TREE_KEY = registerKey("sacred_tree_placed");
    public static final ResourceKey<PlacedFeature> TREE_WILLOW_KEY = registerKey("willow_placed");
    public static final ResourceKey<PlacedFeature> TREE_DEADWOOD_KEY = registerKey("deadwood_placed");
    public static final ResourceKey<PlacedFeature> TREE_EBONY_KINGSWOOD_KEY = registerKey("ebony_kingswood_placed");
    public static final ResourceKey<PlacedFeature> TREE_IVORY_KINGSWOOD_KEY = registerKey("ivory_kingswood_placed");
    public static final ResourceKey<PlacedFeature> TREE_WEAVER_KEY = registerKey("weaver_placed");

    //Flowers
    public static final ResourceKey<PlacedFeature> FLOWER_IRIS_PLACED_KEY = registerKey("flower_iris_placed_key");
    public static final ResourceKey<PlacedFeature> ALFHEIMR_FLOWERS_KEY = registerKey("alfheimr_flowers_key");

    //Vegetation
    public static final ResourceKey<PlacedFeature> ALFHEIMR_MAGIC_GRASS_PLACED_KEY = registerKey("alfheimr_magic_grass_placed_key");
    public static final ResourceKey<PlacedFeature> ALFHEIMR_MAGIC_GRASS_SINGLE_PLACED_KEY = registerKey("alfheimr_magic_grass_single_placed_key");
    public static final ResourceKey<PlacedFeature> ALFHEIMR_MAGIC_GRASS_PATCH_PLACED_KEY = registerKey("alfheimr_magic_grass_patch_placed_key");

    public static void bootstrap(BootstapContext<PlacedFeature> context, HolderGetter<ConfiguredFeature<?, ?>> configuredFeatures) {
        register(context, TREE_ELDER_WOOD_KEY, configuredFeatures.getOrThrow(ModVegetationFeatures.TREE_ELDER_WOOD_KEY),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(3, 0.1f, 2),
                        UnderworldBlocks.ELDER_WOOD_SAPLING.get()));

        register(context, TREE_OLIVE_KEY, configuredFeatures.getOrThrow(ModVegetationFeatures.TREE_OLIVE_KEY),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(3, 0.1f, 2),
                        UnderworldBlocks.OLIVE_SAPLING.get()));

        register(context, TREE_MYRRH_KEY, configuredFeatures.getOrThrow(ModVegetationFeatures.TREE_MYRRH_KEY),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(3, 0.1f, 2),
                        UnderworldBlocks.MYRRH_SAPLING.get()));

        register(context, TREE_LAUREL_KEY, configuredFeatures.getOrThrow(ModVegetationFeatures.TREE_LAUREL_KEY),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(3, 0.1f, 2),
                        UnderworldBlocks.LAUREL_SAPLING.get()));

        register(context, TREE_CYPRESS_KEY, configuredFeatures.getOrThrow(ModVegetationFeatures.TREE_CYPRESS_KEY),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(3, 0.1f, 2),
                        UnderworldBlocks.CYPRESS_SAPLING.get()));

        register(context, TREE_BLACK_BIRCH_KEY, configuredFeatures.getOrThrow(ModVegetationFeatures.TREE_BLACK_BIRCH_KEY),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(3, 0.1f, 2),
                        AlfheimrBlocks.BLACK_BIRCH_SAPLING.get()));

        register(context, TREE_WHITE_OAK_KEY, configuredFeatures.getOrThrow(ModVegetationFeatures.TREE_WHITE_OAK_KEY),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(3, 0.1f, 2),
                        AlfheimrBlocks.WHITE_OAK_SAPLING.get()));

        register(context, TREE_BUR_OAK_KEY, configuredFeatures.getOrThrow(ModVegetationFeatures.TREE_BUR_OAK_KEY),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(3, 0.1f, 2),
                        AlfheimrBlocks.BUR_OAK_SAPLING.get()));

        register(context, TREE_BLOOD_CHERRY_KEY, configuredFeatures.getOrThrow(ModVegetationFeatures.TREE_BLOOD_CHERRY_KEY),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(3, 0.1f, 2),
                        AlfheimrBlocks.BLOOD_CHERRY_SAPLING.get()));

        register(context, TREE_SACRED_TREE_KEY, configuredFeatures.getOrThrow(ModVegetationFeatures.TREE_SACRED_TREE_KEY),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(3, 0.1f, 2),
                        AlfheimrBlocks.SACRED_TREE_SAPLING.get()));

        register(context, TREE_WILLOW_KEY, configuredFeatures.getOrThrow(ModVegetationFeatures.TREE_WILLOW_KEY),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(3, 0.1f, 2),
                        AlfheimrBlocks.WILLOW_SAPLING.get()));

        register(context, TREE_DEADWOOD_KEY, configuredFeatures.getOrThrow(ModVegetationFeatures.TREE_DEADWOOD_KEY),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(3, 0.1f, 2),
                        AlfheimrBlocks.DEADWOOD_SAPLING.get()));

        register(context, TREE_EBONY_KINGSWOOD_KEY, configuredFeatures.getOrThrow(ModVegetationFeatures.TREE_EBONY_KINGSWOOD_KEY),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(3, 0.1f, 2),
                        AlfheimrBlocks.EBONY_KINGSWOOD_SAPLING.get()));

        register(context, TREE_IVORY_KINGSWOOD_KEY, configuredFeatures.getOrThrow(ModVegetationFeatures.TREE_IVORY_KINGSWOOD_KEY),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(3, 0.1f, 2),
                        AlfheimrBlocks.IVORY_KINGSWOOD_SAPLING.get()));

        register(context, TREE_WEAVER_KEY, configuredFeatures.getOrThrow(ModVegetationFeatures.TREE_WEAVER_KEY),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(3, 0.1f, 2),
                        AlfheimrBlocks.WEAVER_SAPLING.get()));

        //Flowers
        register(context, FLOWER_IRIS_PLACED_KEY, configuredFeatures.getOrThrow(ModVegetationFeatures.FLOWER_IRIS_KEY),
                List.of(RarityFilter.onAverageOnceEvery(16), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome()));

        register(context, ALFHEIMR_FLOWERS_KEY, configuredFeatures.getOrThrow(ModVegetationFeatures.ALFHEIMR_FLOWERS_KEY),
                List.of(RarityFilter.onAverageOnceEvery(16), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome()));

        //Vegetation
        register(context, ALFHEIMR_MAGIC_GRASS_PLACED_KEY, configuredFeatures.getOrThrow(ModVegetationFeatures.ALFHEIMR_MAGIC_GRASS_PLACED_KEY),
                List.of(RarityFilter.onAverageOnceEvery(16), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome()));
        register(context, ALFHEIMR_MAGIC_GRASS_SINGLE_PLACED_KEY, configuredFeatures.getOrThrow(ModVegetationFeatures.ALFHEIMR_MAGIC_GRASS_SINGLE_PLACED_KEY),
                List.of(RarityFilter.onAverageOnceEvery(16), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome()));
        register(context, ALFHEIMR_MAGIC_GRASS_PATCH_PLACED_KEY, configuredFeatures.getOrThrow(ModVegetationFeatures.ALFHEIMR_MAGIC_GRASS_PATCH_PLACED_KEY),
                List.of(RarityFilter.onAverageOnceEvery(16), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome()));

    }

        private static ResourceKey<PlacedFeature> registerKey(String name) {
        return ResourceKey.create(Registries.PLACED_FEATURE, LostWorldsApi.modLoc(name));
    }

    private static void register(BootstapContext<PlacedFeature> context, ResourceKey<PlacedFeature> key, Holder<ConfiguredFeature<?, ?>> configuration,
                                 List<PlacementModifier> modifiers) {
        context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
    }
}
