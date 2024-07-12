package net.sen.lostworlds.worldgen.dimension;

import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.level.biome.*;
import net.minecraft.world.level.dimension.BuiltinDimensionTypes;
import net.minecraft.world.level.dimension.DimensionType;
import net.minecraft.world.level.dimension.LevelStem;
import net.minecraft.world.level.levelgen.*;
import net.sen.lostworlds.worldgen.dimension.biomebuilder.AlfheimrBiomeBuilder;
import java.util.OptionalLong;

public class AlfheimrDimension {
    public static final int MAX_HEIGHT = 384;
    public static final int MIN_HEIGHT = -64;
    public static final int SEA_LEVEL = 128;

    public static void alfheimrDimensionType(BootstrapContext<DimensionType> context) {
        context.register(ModDimensions.ALFHEIMR_DIM_TYPE, new DimensionType(
                OptionalLong.of(12000), // fixedTime
                true, // hasSkylight
                false, // hasCeiling
                false, // ultraWarm
                true, // natural
                0.6, // coordinateScale
                true, // bedWorks
                false, // respawnAnchorWorks
                MIN_HEIGHT, // minY
                MAX_HEIGHT, // height
                MAX_HEIGHT, // logicalHeight
                BlockTags.INFINIBURN_OVERWORLD, // infiniburn
                BuiltinDimensionTypes.OVERWORLD_EFFECTS, // effectsLocation
                0.0f, // ambientLight
                new DimensionType.MonsterSettings(false, true, UniformInt.of(0, 7), 0)
        ));
    }

    public static void alfheimrLevelStem(final BootstrapContext<LevelStem> context) {
        context.register(ModDimensions.ALFHEIMR_KEY, new LevelStem(
                context.lookup(Registries.DIMENSION_TYPE).getOrThrow(ModDimensions.ALFHEIMR_DIM_TYPE),
                new NoiseBasedChunkGenerator(
                        MultiNoiseBiomeSource.createFromPreset(context.lookup(Registries.MULTI_NOISE_BIOME_SOURCE_PARAMETER_LIST).getOrThrow(AlfheimrBiomeBuilder.PARAMETER_LIST)),
                        context.lookup(Registries.NOISE_SETTINGS).getOrThrow(ModDimensions.ALFHEIMR_NOISE_KEY)
                )
        ));
    }


}
