package net.sen.lostworlds.worldgen.dimension.surfacerules;

import com.google.common.collect.ImmutableList;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.Noises;
import net.minecraft.world.level.levelgen.SurfaceRules;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.placement.CaveSurface;
import net.sen.lostworlds.block.ModBlocks;
import net.sen.lostworlds.worldgen.biome.NidavellirBiomes;

public class NidavellirSurfaceRules {
    public static SurfaceRules.RuleSource nidavellirSurfaceRules() {
        ImmutableList.Builder<SurfaceRules.RuleSource> builder = ImmutableList.builder();
        builder
                .add(bedrockSurface())
                .add(stoneSoftSurface())
                .add(stoneHardSurface())
                .add(stoneEnhancedSurface())
                .add(stoneDeepslateSurface())
                .add(stoneCrimsonSurface())
//                .add()
//                .add(caveSurface());
                ;

        return SurfaceRules.sequence(builder.build().toArray(SurfaceRules.RuleSource[]::new));
    }

    private static SurfaceRules.RuleSource bedrockSurface() {
        return SurfaceRules.sequence(
                SurfaceRules.ifTrue(SurfaceRules.verticalGradient("minecraft:bedrock_floor", VerticalAnchor.bottom(), VerticalAnchor.aboveBottom(5)), SurfaceRules.state(Blocks.BEDROCK.defaultBlockState())),
                SurfaceRules.ifTrue(SurfaceRules.not(SurfaceRules.verticalGradient("minecraft:bedrock_roof", VerticalAnchor.belowTop(5), VerticalAnchor.top())), SurfaceRules.state(Blocks.BEDROCK.defaultBlockState()))
        );
    }

    private static SurfaceRules.RuleSource stoneSoftSurface() {
        return SurfaceRules.sequence(
                SurfaceRules.ifTrue(
                        SurfaceRules.yBlockCheck(
                                VerticalAnchor.belowTop(5),
                                0
                        ),
                        SurfaceRules.state(
                                ModBlocks.NIDAVELLIR_SOFT_STONE.get().defaultBlockState()
                        )
                )
        );
    }

    private static SurfaceRules.RuleSource stoneHardSurface() {
        return SurfaceRules.sequence(
                SurfaceRules.ifTrue(SurfaceRules.yBlockCheck(VerticalAnchor.belowTop(67), 0), SurfaceRules.state(ModBlocks.NIDAVELLIR_HARD_STONE.get().defaultBlockState()))
        );
    }

    private static SurfaceRules.RuleSource stoneEnhancedSurface() {
        return SurfaceRules.sequence(
                SurfaceRules.ifTrue(SurfaceRules.yBlockCheck(VerticalAnchor.belowTop(98), 0), SurfaceRules.state(ModBlocks.NIDAVELLIR_ENHANCED_STONE.get().defaultBlockState()))
        );
    }

    private static SurfaceRules.RuleSource stoneDeepslateSurface() {
        return SurfaceRules.sequence(
                SurfaceRules.ifTrue(SurfaceRules.stoneDepthCheck(0, true, CaveSurface.FLOOR), SurfaceRules.ifTrue(SurfaceRules.not(SurfaceRules.yBlockCheck(VerticalAnchor.absolute(128), 0)), SurfaceRules.state(ModBlocks.NIDAVELLIR_DEEPSLATE_STONE.get().defaultBlockState())))
        );
    }

    private static SurfaceRules.RuleSource stoneCrimsonSurface() {
        return SurfaceRules.sequence(
                SurfaceRules.ifTrue(SurfaceRules.stoneDepthCheck(0, true, CaveSurface.FLOOR), SurfaceRules.ifTrue(SurfaceRules.not(SurfaceRules.yBlockCheck(VerticalAnchor.absolute(60), 0)), SurfaceRules.state(ModBlocks.NIDAVELLIR_CRIMSON_STONE.get().defaultBlockState())))
        );
    }

    private static SurfaceRules.RuleSource caveSurface() {

        return SurfaceRules.sequence(
                SurfaceRules.ifTrue(SurfaceRules.isBiome(NidavellirBiomes.NIDAVELLIR_CAVERN), SurfaceRules.ifTrue(
                        SurfaceRules.stoneDepthCheck(0, false, CaveSurface.FLOOR),
                        SurfaceRules.state(ModBlocks.NIDAVELLIR_SOFT_STONE.get().defaultBlockState()))
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
