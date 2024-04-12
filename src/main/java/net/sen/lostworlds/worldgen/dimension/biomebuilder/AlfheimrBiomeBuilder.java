package net.sen.lostworlds.worldgen.dimension.biomebuilder;

import com.google.common.collect.ImmutableCollection;
import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.biome.Climate;
import net.minecraft.world.level.biome.MultiNoiseBiomeSource;
import net.minecraft.world.level.biome.MultiNoiseBiomeSourceParameterList;
import net.sen.lostworlds.worldgen.dimension.ModDimensions;

import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Function;

//https://github.com/Tropicraft/Tropicraft/blob/1.20.1/src/main/java/net/tropicraft/core/common/dimension/biome/TropicraftBiomeBuilder.java#L74
public class AlfheimrBiomeBuilder {
    private static final MultiNoiseBiomeSourceParameterList.Preset PRESET = registerMultiNoisePreset(ModDimensions.ALFHEIMR_ID, new MultiNoiseBiomeSourceParameterList.Preset.SourceProvider() {
        @Override
        public <T> Climate.ParameterList<T> apply(Function<ResourceKey<Biome>, T> function) {
            ImmutableList.Builder<Pair<Climate.ParameterPoint, T>> points = ImmutableList.builder();
            new AlfheimrBiomeBuilder().addBiomes((point, key) -> points.add(Pair.of(point, function.apply(key))));
            return new Climate.ParameterList<>(points.build());
        }
    });
    public static final ResourceKey<MultiNoiseBiomeSourceParameterList> PARAMETER_LIST = ResourceKey.create(Registries.MULTI_NOISE_BIOME_SOURCE_PARAMETER_LIST, ModDimensions.ALFHEIMR_ID);

    public static void bootstrap(final BootstapContext<MultiNoiseBiomeSourceParameterList> context) {
        context.register(PARAMETER_LIST, new MultiNoiseBiomeSourceParameterList(PRESET, context.lookup(Registries.BIOME)));
    }

    private static MultiNoiseBiomeSourceParameterList.Preset registerMultiNoisePreset(ResourceLocation id, MultiNoiseBiomeSourceParameterList.Preset.SourceProvider sourceProvider) {
        MultiNoiseBiomeSourceParameterList.Preset preset = new MultiNoiseBiomeSourceParameterList.Preset(id, sourceProvider);
        Map<ResourceLocation, MultiNoiseBiomeSourceParameterList.Preset> byName = new Object2ObjectOpenHashMap<>(MultiNoiseBiomeSourceParameterList.Preset.BY_NAME);
        byName.put(id, preset);
        MultiNoiseBiomeSourceParameterList.Preset.BY_NAME = Map.copyOf(byName);
        return preset;
    }

    public void addBiomes(BiConsumer<Climate.ParameterPoint, ResourceKey<Biome>> consumer) {

    }
}
