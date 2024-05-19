package net.sen.lostworlds.worldgen.tree.custom.trunkplacer;

import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.core.BlockPos;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.LevelSimulatedReader;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.levelgen.feature.configurations.TreeConfiguration;
import net.minecraft.world.level.levelgen.feature.foliageplacers.FoliagePlacer;
import net.minecraft.world.level.levelgen.feature.trunkplacers.TrunkPlacer;
import net.minecraft.world.level.levelgen.feature.trunkplacers.TrunkPlacerType;

import java.util.List;
import java.util.function.BiConsumer;

public class BloodCherryTrunkPlacer extends TrunkPlacer {
    public static final Codec<BloodCherryTrunkPlacer> CODEC = RecordCodecBuilder.create(instance ->
            trunkPlacerParts(instance).apply(instance, BloodCherryTrunkPlacer::new));

    public BloodCherryTrunkPlacer(int pBaseHeight, int pHeightRandA, int pHeightRandB) {
        super(pBaseHeight, pHeightRandA, pHeightRandB);
    }

    @Override
    protected TrunkPlacerType<?> type() {
        return ModTrunkPlacerTypes.BLOOD_CHERRY_TRUNK_PLACER.get();
    }

    @Override
    public List<FoliagePlacer.FoliageAttachment> placeTrunk(LevelSimulatedReader pLevel, BiConsumer<BlockPos, BlockState> pBlockSetter, RandomSource pRandom, int pFreeTreeHeight, BlockPos pPos, TreeConfiguration pConfig) {
        TrunkPlacer.setDirtAt(pLevel, pBlockSetter, pRandom, pPos.below(), pConfig);

        for (int i = 0; i < pFreeTreeHeight; ++i) {
            if (i > 4 && pRandom.nextInt(3) > 0 && i < 9) {
                this.branch(pLevel, pRandom, pBlockSetter, pPos.getX(), pPos.getY() + i, pPos.getZ(), i / 4 - 1, pConfig);
            }
            this.placeLog(pLevel, pBlockSetter, pRandom, pPos.above(i), pConfig);
        }

        return ImmutableList.of(new FoliagePlacer.FoliageAttachment(pPos.above(pFreeTreeHeight), 0, false));

//        setDirtAt(pLevel, pBlockSetter, pRandom, pPos.below(), pConfig);
//        int height = pFreeTreeHeight + pRandom.nextInt(heightRandA, heightRandA + 3) + pRandom.nextInt(heightRandB - 1, heightRandB + 1);
//
//        for (int i = 0; i < height; i++) {
//            if (i % 2 == 0 && pRandom.nextBoolean()) {
//                if (pRandom.nextFloat() > 0.25f) {
//                    for (int x = 0; x < 4; x++) {
//                        placeLog(pLevel, pBlockSetter, pRandom, pPos.above(i).relative(Direction.DOWN, x), pConfig);
//                    }
//                }
//                if (pRandom.nextFloat() > 0.25f) {
//                    for (int x = 0; x < 4; x++) {
//                        placeLog(pLevel, pBlockSetter, pRandom, pPos.above(i).relative(Direction.SOUTH, x), pConfig);
//                    }
//                }
//                if (pRandom.nextFloat() > 0.25f) {
//                    for (int x = 0; x < 4; x++) {
//                        placeLog(pLevel, pBlockSetter, pRandom, pPos.above(i).relative(Direction.EAST, x), pConfig);
//                    }
//                }
//                if (pRandom.nextFloat() > 0.25f) {
//                    for (int x = 0; x < 4; x++) {
//                        placeLog(pLevel, pBlockSetter, pRandom, pPos.above(i).relative(Direction.WEST, x), pConfig);
//                    }
//                }
//            }
//        }
//
//        return ImmutableList.of(new FoliagePlacer.FoliageAttachment(pPos.above(height), 0, false));
    }

    private void branch(LevelSimulatedReader pLevel, RandomSource pRandom, BiConsumer<BlockPos, BlockState> pBlockSetter, int i, int j, int k, int slant, TreeConfiguration pConfig) {
        int directionX = pRandom.nextInt(3) - 1;
        int directionZ = pRandom.nextInt(3) - 1;

        for (int n = 0; n < pRandom.nextInt(2); ++n) {
            i += directionX;
            j += slant;
            k += directionZ;

            this.placeLog(pLevel, pBlockSetter, pRandom, new BlockPos(i, j, k), pConfig);
        }
    }
}
