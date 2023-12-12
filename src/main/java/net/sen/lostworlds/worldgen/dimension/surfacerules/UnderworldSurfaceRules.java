package net.sen.lostworlds.worldgen.dimension.surfacerules;

import com.google.common.collect.ImmutableList;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.Noises;
import net.minecraft.world.level.levelgen.SurfaceRules;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.placement.CaveSurface;
import net.sen.lostworlds.worldgen.biome.UnderworldBiomes;

public class UnderworldSurfaceRules {

    public static SurfaceRules.RuleSource underworldSurfaceRules() {
        ImmutableList.Builder<SurfaceRules.RuleSource> builder = ImmutableList.builder();
        builder
                .add(SurfaceRules.ifTrue(SurfaceRules.verticalGradient("minecraft:bedrock_floor", VerticalAnchor.bottom(), VerticalAnchor.aboveBottom(5)), SurfaceRules.state(Blocks.BEDROCK.defaultBlockState())))
//                .add()
                .add(basicSurface())
                .add(overworldLike());

        return SurfaceRules.sequence(builder.build().toArray(SurfaceRules.RuleSource[]::new));
    }

    private static SurfaceRules.RuleSource basicSurface() {

        return SurfaceRules.sequence(
                //filler depthrock
//                        SurfaceRules.ifTrue(SurfaceRules.yBlockCheck(VerticalAnchor.belowTop(5), 0), SurfaceRules.state(Blocks.STONE.defaultBlockState())),
                //sediment
//                        SurfaceRules.ifTrue(SurfaceRules.stoneDepthCheck(0, true, CaveSurface.FLOOR), SurfaceRules.ifTrue(SurfaceRules.not(SurfaceRules.yBlockCheck(VerticalAnchor.absolute(33), 0)), SurfaceRules.state(Blocks.STONE.defaultBlockState()))),
                //frozen deepturf
                SurfaceRules.ifTrue(SurfaceRules.isBiome(UnderworldBiomes.ASPHODEL_MEADOWS), SurfaceRules.ifTrue(
                        SurfaceRules.stoneDepthCheck(0, false, CaveSurface.FLOOR),
                        SurfaceRules.state(Blocks.STONE.defaultBlockState()))
                )
        );
    }

    private static SurfaceRules.RuleSource overworldLike() {

        return SurfaceRules.sequence(
                SurfaceRules.ifTrue(
                        SurfaceRules.ON_FLOOR,
                        SurfaceRules.sequence(
                                SurfaceRules.ifTrue(
                                        SurfaceRules.isBiome(
                                                UnderworldBiomes.RIVER_STYX
                                        ),
                                        SurfaceRules.sequence(
                                                SurfaceRules.ifTrue(
                                                        SurfaceRules.ON_CEILING,
                                                        SurfaceRules.state(Blocks.SANDSTONE.defaultBlockState())
                                                ),
                                                SurfaceRules.ifTrue(
                                                        SurfaceRules.waterBlockCheck(
                                                                -1,
                                                                0
                                                        ),
                                                        SurfaceRules.state(Blocks.GRASS_BLOCK.defaultBlockState())
                                                ),
                                                SurfaceRules.state(Blocks.SAND.defaultBlockState())
                                        )
                                ),
                                SurfaceRules.ifTrue(
                                        SurfaceRules.isBiome(
                                                UnderworldBiomes.ASPHODEL_MEADOWS
                                        ),
                                        SurfaceRules.sequence(
                                                SurfaceRules.ifTrue(
                                                        SurfaceRules.waterBlockCheck(
                                                                -1,
                                                                0
                                                        ),
                                                        SurfaceRules.state(Blocks.GRASS_BLOCK.defaultBlockState())
                                                ),
                                                SurfaceRules.state(Blocks.DIRT.defaultBlockState())
                                        )
                                ),
                                SurfaceRules.ifTrue(
                                        SurfaceRules.waterBlockCheck(
                                                -1,
                                                0
                                        ),
                                        SurfaceRules.sequence(
                                                SurfaceRules.ifTrue(
                                                        SurfaceRules.yStartCheck(
                                                                VerticalAnchor.absolute(
                                                                        -4
                                                                ),
                                                                1
                                                        ),
                                                        SurfaceRules.state(Blocks.GRASS_BLOCK.defaultBlockState())
                                                )
                                        )
                                ),
                                SurfaceRules.ifTrue(
                                        SurfaceRules.not(
                                                SurfaceRules.yStartCheck(
                                                        VerticalAnchor.absolute(
                                                                -4
                                                        ),
                                                        1
                                                )
                                        ),
                                        SurfaceRules.sequence(
                                                SurfaceRules.ifTrue(
                                                        SurfaceRules.not(
                                                                SurfaceRules.waterBlockCheck(
                                                                        -1,
                                                                        0
                                                                )
                                                        ),
                                                        SurfaceRules.state(Blocks.DIRT.defaultBlockState())
                                                )
                                        )
                                )
                        )
                ),
                SurfaceRules.ifTrue(
                        SurfaceRules.waterBlockCheck(
                                -6,
                                -1
                        ),
                        SurfaceRules.sequence(
                                SurfaceRules.ifTrue(
                                        SurfaceRules.yStartCheck(
                                                VerticalAnchor.absolute(
                                                        -4
                                                ),
                                                1
                                        ),
                                        SurfaceRules.sequence(
                                                SurfaceRules.ifTrue(
                                                        SurfaceRules.UNDER_FLOOR,
                                                        SurfaceRules.state(Blocks.DIRT.defaultBlockState())
                                                )
                                        )
                                )
                        )
                )
        );
    }

    private static SurfaceRules.RuleSource makeStateRule(Block block) {
        return SurfaceRules.state(block.defaultBlockState());
    }

    private static SurfaceRules.ConditionSource surfaceNoiseAbove(double p_194809_) {
        return SurfaceRules.noiseCondition(Noises.SURFACE, p_194809_ / 8.25D, Double.MAX_VALUE);
    }
}
