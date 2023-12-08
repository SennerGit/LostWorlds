package net.sen.lostworlds.worldgen;

import net.minecraft.core.Holder;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.data.worldgen.placement.VegetationPlacements;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.packs.resources.Resource;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.placement.*;
import net.minecraftforge.fml.common.Mod;
import net.sen.lostworlds.LostWorlds;
import net.sen.lostworlds.LostWorldsConstants;
import net.sen.lostworlds.block.ModBlocks;

import java.util.List;

public class ModPlacedFeatures {
    public static final ResourceKey<PlacedFeature> ELDER_WOOD_KEY = registerKey("elder_wood_placed");
    public static final ResourceKey<PlacedFeature> OLIVE_KEY = registerKey("olive_placed");
    public static final ResourceKey<PlacedFeature> MYRRH_KEY = registerKey("myrrh_placed");
    public static final ResourceKey<PlacedFeature> LAUREL_KEY = registerKey("laurel_placed");
    public static final ResourceKey<PlacedFeature> CYPRESS_KEY = registerKey("cypress_placed");
    public static final ResourceKey<PlacedFeature> OVERWORLD_TIN_ORE_PLACED_KEY = registerKey("overworld_tin_ore_placed_key");
    public static final ResourceKey<PlacedFeature> OVERWORLD_IRIS_PLACED_KEY = registerKey("overworld_iris_placed_key");


    public static void bootstrap(BootstapContext<PlacedFeature> context) {
        HolderGetter<ConfiguredFeature<?, ?>> configuredFeatures = context.lookup(Registries.CONFIGURED_FEATURE);

        register(context, ELDER_WOOD_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.ELDER_WOOD_KEY),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(3, 0.1f, 2),
                        ModBlocks.ELDER_WOOD_SAPLING.get()));

        register(context, OLIVE_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.OLIVE_KEY),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(3, 0.1f, 2),
                        ModBlocks.OLIVE_SAPLING.get()));

        register(context, MYRRH_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.MYRRH_KEY),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(3, 0.1f, 2),
                        ModBlocks.MYRRH_SAPLING.get()));

        register(context, LAUREL_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.LAUREL_KEY),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(3, 0.1f, 2),
                        ModBlocks.LAUREL_SAPLING.get()));

        register(context, CYPRESS_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.CYPRESS_KEY),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(3, 0.1f, 2),
                        ModBlocks.CYPRESS_SAPLING.get()));

        register(context, OVERWORLD_TIN_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.OVERWORLD_TIN_ORE_KEY),
                ModOrePlacement.commonOrePlacement(12, HeightRangePlacement.uniform(
                                VerticalAnchor.absolute(-64),
                                VerticalAnchor.absolute(80))));

        register(context, OVERWORLD_IRIS_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.OVERWORLD_IRIS_KEY),
                List.of(RarityFilter.onAverageOnceEvery(16), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome()));
    }

    private static ResourceKey<PlacedFeature> registerKey(String name) {
        return ResourceKey.create(Registries.PLACED_FEATURE, LostWorldsConstants.modLoc(name));
    }

    private static void register(BootstapContext<PlacedFeature> context, ResourceKey<PlacedFeature> key, Holder<ConfiguredFeature<?, ?>> configuration,
                                 List<PlacementModifier> modifiers) {
        context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
    }
}
