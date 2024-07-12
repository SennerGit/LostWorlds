package net.sen.lostworlds.block.wood;

import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SaplingBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.grower.TreeGrower;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.material.PushReaction;

import java.util.ArrayList;
import java.util.List;

public class ModSaplingBlock extends SaplingBlock {
    private static ArrayList<Block> blocks = new ArrayList<>();

    private final boolean needLight;

    public ModSaplingBlock(TreeGrower pTreeGrower, boolean needLight, Block... blocks) {
        super(pTreeGrower, Properties.of()
                .mapColor(MapColor.PLANT)
                .pushReaction(PushReaction.DESTROY)
                .strength(0F)
                .randomTicks()
                .sound(SoundType.GRASS)
                .noOcclusion()
                .noCollission()
        );

        for (int i = 0; i < blocks.length; i++) {
            this.blocks.add(blocks[i]);
        }

        this.needLight = needLight;
    }

    @Override
    protected boolean mayPlaceOn(BlockState pState, BlockGetter pLevel, BlockPos pPos) {
//        LostWorlds.LOGGER.debug(pState.getBlock().getDescriptionId());
        for (Block block : blocks) {
            if (block == pState.getBlock()) {
                return pState.is(block);
            }
        }

        return pState.is(Blocks.GRASS_BLOCK);
    }

    public static ArrayList<Block> getBlocks() {
        return blocks;
    }

    public static Block getBlock(int index) {
        return blocks.get(index);
    }



    @Override
    public void randomTick(BlockState state, ServerLevel level, BlockPos pos, RandomSource random) {
        super.randomTick(state, level, pos, random);
        if (!level.isAreaLoaded(pos, 1))
            return;
        //remove light check so our trees grow in any light level
        if (!needLight)
        this.advanceTree(level, pos, state, random);
    }
}
