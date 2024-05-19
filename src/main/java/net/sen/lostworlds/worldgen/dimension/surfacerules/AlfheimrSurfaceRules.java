package net.sen.lostworlds.worldgen.dimension.surfacerules;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.Noises;
import net.minecraft.world.level.levelgen.SurfaceRules;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.sen.lostworlds.worldgen.biome.util.layer.AlfheimrBiomes;
import org.jetbrains.annotations.NotNull;

import static net.minecraft.world.level.levelgen.SurfaceRules.*;

public class AlfheimrSurfaceRules {
    private static SurfaceRules.RuleSource BEDROCK = makeStateRule(Blocks.BEDROCK);
    private static final SurfaceRules.RuleSource GRASS_BLOCK = makeStateRule(Blocks.GRASS_BLOCK);
    private static final SurfaceRules.RuleSource DIRT = makeStateRule(Blocks.DIRT);
    private static final SurfaceRules.RuleSource PODZOL = makeStateRule(Blocks.PODZOL);
    private static final SurfaceRules.RuleSource COARSE_DIRT = makeStateRule(Blocks.COARSE_DIRT);
    private static final SurfaceRules.RuleSource GRAVEL = makeStateRule(Blocks.GRAVEL);
    private static final SurfaceRules.RuleSource CLAY = makeStateRule(Blocks.CLAY);
    private static final SurfaceRules.RuleSource SAND = makeStateRule(Blocks.SAND);
    private static final SurfaceRules.RuleSource SANDSTONE = makeStateRule(Blocks.SANDSTONE);
    private static final SurfaceRules.RuleSource SNOW = makeStateRule(Blocks.SNOW_BLOCK);

    private static SurfaceRules.RuleSource makeStateRule(Block block) {
        return SurfaceRules.state(block.defaultBlockState());
    }
    public static SurfaceRules.RuleSource alfheimrSurfaceRules() {
        SurfaceRules.RuleSource bedrockLayer = SurfaceRules.ifTrue(SurfaceRules.verticalGradient("bedrock_floor", VerticalAnchor.bottom(), VerticalAnchor.aboveBottom(5)), BEDROCK);

        ConditionSource notUnderWater = waterBlockCheck(-1, 0);

        ConditionSource isSandy = isBiome(AlfheimrBiomes.ALFHEIMR_OCEAN);
        RuleSource sandRules = sequence(ifTrue(not(notUnderWater), SAND), SAND);

        return SurfaceRules.sequence(
                SurfaceRules.ifTrue(isSandy, sandRules),
                bedrockLayer,
                enchantedSurface(),
                desertSurface(),
                overworldLike()
        );
    }

    @NotNull
    private static SurfaceRules.RuleSource enchantedSurface() {
        SurfaceRules.RuleSource podzolFloor = SurfaceRules.sequence(
                SurfaceRules.ifTrue(SurfaceRules.waterBlockCheck(-1, 0), PODZOL),
                DIRT
        );

        SurfaceRules.RuleSource coarseDirtFloor = SurfaceRules.ifTrue(SurfaceRules.ON_FLOOR, SurfaceRules.sequence(
                SurfaceRules.ifTrue(surfaceNoiseAbove(2.25D), COARSE_DIRT),
                SurfaceRules.ifTrue(surfaceNoiseAbove(-2.25D), podzolFloor)
        ));

        return SurfaceRules.ifTrue(isBiome(
                AlfheimrBiomes.ALFHEIMR_ENCHANTED_FOREST
        ), coarseDirtFloor);
    }

    @NotNull
    private static SurfaceRules.RuleSource desertSurface() {
        SurfaceRules.RuleSource podzolFloor = SurfaceRules.sequence(
                SurfaceRules.ifTrue(SurfaceRules.waterBlockCheck(-1, 0), SAND),
                SAND
        );

        SurfaceRules.RuleSource sandFloor = SurfaceRules.ifTrue(SurfaceRules.ON_FLOOR, SurfaceRules.sequence(
                SurfaceRules.ifTrue(surfaceNoiseAbove(2.25D), SAND),
                SurfaceRules.ifTrue(surfaceNoiseAbove(-2.25D), podzolFloor)
        ));

        return SurfaceRules.ifTrue(isBiome(
                AlfheimrBiomes.ALFHEIMR_DESERT
        ), sandFloor);
    }

    @NotNull
    private static SurfaceRules.RuleSource overworldLike() {
        SurfaceRules.RuleSource riverLakeBeds = SurfaceRules.ifTrue(isBiome(
                AlfheimrBiomes.ALFHEIMR_RIVER,
                AlfheimrBiomes.ALFHEIMR_STREAM
        ), SurfaceRules.sequence(
                SurfaceRules.ifTrue(SurfaceRules.ON_CEILING, SANDSTONE),
                SurfaceRules.ifTrue(SurfaceRules.waterBlockCheck(-1, 0), GRASS_BLOCK),
                SAND
        ));

        SurfaceRules.RuleSource swampBeds = SurfaceRules.ifTrue(isBiome(
                AlfheimrBiomes.ALFHEIMR_MEADOWS
        ), SurfaceRules.sequence(
                SurfaceRules.ifTrue(SurfaceRules.waterBlockCheck(-1, 0), GRASS_BLOCK),
                DIRT
        ));

        SurfaceRules.RuleSource grassAboveSeaLevel = SurfaceRules.ifTrue(SurfaceRules.yStartCheck(VerticalAnchor.absolute(-4), 1), GRASS_BLOCK);
        SurfaceRules.RuleSource grassSurface = SurfaceRules.ifTrue(SurfaceRules.waterBlockCheck(-1, 0), grassAboveSeaLevel);

        SurfaceRules.RuleSource underwaterSurface = SurfaceRules.ifTrue(
                SurfaceRules.not(SurfaceRules.yStartCheck(VerticalAnchor.absolute(-4), 1)),
                SurfaceRules.ifTrue(
                        SurfaceRules.not(SurfaceRules.waterBlockCheck(-1, 0)),
                        DIRT
                )
        );

        SurfaceRules.RuleSource onFloor = SurfaceRules.ifTrue(SurfaceRules.ON_FLOOR, SurfaceRules.sequence(
                riverLakeBeds,
                swampBeds,
                grassSurface,
                underwaterSurface
        ));

        SurfaceRules.RuleSource underFloor = SurfaceRules.ifTrue(
                SurfaceRules.waterStartCheck(-6, -1),
                SurfaceRules.ifTrue(
                        SurfaceRules.yStartCheck(VerticalAnchor.absolute(-4), 1),
                        SurfaceRules.ifTrue(SurfaceRules.UNDER_FLOOR, DIRT)
                )
        );

        return SurfaceRules.sequence(onFloor, underFloor);
    }

    private static SurfaceRules.ConditionSource surfaceNoiseAbove(double p_194809_) {
        return SurfaceRules.noiseCondition(Noises.SURFACE, p_194809_ / 8.25D, Double.MAX_VALUE);
    }
}
