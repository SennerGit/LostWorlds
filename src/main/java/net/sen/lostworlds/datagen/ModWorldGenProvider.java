package net.sen.lostworlds.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.core.RegistrySetBuilder;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.DatapackBuiltinEntriesProvider;
import net.sen.lostworlds.LostWorldsApi;
import net.sen.lostworlds.worldgen.features.ModConfiguredFeatures;
import net.sen.lostworlds.worldgen.placement.ModPlacedFeatures;
import net.sen.lostworlds.worldgen.biome.ModBiomes;
import net.sen.lostworlds.worldgen.biome.carver.ModConfiguredCarvers;
import net.sen.lostworlds.worldgen.dimension.ModDimensions;

import java.util.Set;
import java.util.concurrent.CompletableFuture;

public class ModWorldGenProvider extends DatapackBuiltinEntriesProvider {
    public static final RegistrySetBuilder BUILDER = new RegistrySetBuilder()
            .add(Registries.CONFIGURED_FEATURE, ModConfiguredFeatures::bootstrap)
            .add(Registries.PLACED_FEATURE, ModPlacedFeatures::bootstrap)
            .add(Registries.BIOME, ModBiomes::bootstrap)
            .add(Registries.LEVEL_STEM, ModDimensions::bootstrapStem)
            .add(Registries.DIMENSION_TYPE, ModDimensions::bootstrapType)
            .add(Registries.NOISE_SETTINGS, ModDimensions::bootstrapNoise)
            .add(Registries.DENSITY_FUNCTION, ModDimensions::bootstrapDensityFunctions)
            .add(Registries.CONFIGURED_CARVER, ModConfiguredCarvers::bootstrap);

    public ModWorldGenProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries, BUILDER, Set.of(LostWorldsApi.MODID));
    }
}
