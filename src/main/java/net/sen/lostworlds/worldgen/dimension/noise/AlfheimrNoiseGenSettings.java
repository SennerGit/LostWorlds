package net.sen.lostworlds.worldgen.dimension.noise;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.NoiseGeneratorSettings;
import net.sen.lostworlds.LostWorldsApi;

public class AlfheimrNoiseGenSettings {
    public static final ResourceKey<NoiseGeneratorSettings> ALFHEIMR_NOISE = createKey("alfheimr_noise");

    private static ResourceKey<NoiseGeneratorSettings> createKey(final String name) {
        return ResourceKey.create(Registries.NOISE_SETTINGS, new ResourceLocation(LostWorldsApi.MODID, name));
    }
}
