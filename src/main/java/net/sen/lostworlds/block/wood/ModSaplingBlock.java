package net.sen.lostworlds.block.wood;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SaplingBlock;
import net.minecraft.world.level.block.grower.AbstractTreeGrower;
import net.minecraft.world.level.block.state.BlockState;
import net.sen.lostworlds.LostWorlds;

import java.util.ArrayList;
import java.util.List;

public class ModSaplingBlock extends SaplingBlock {
    private static ArrayList<Block> blocks = new ArrayList<>();

    public ModSaplingBlock(AbstractTreeGrower pTreeGrower, Properties pProperties, Block... blocks) {
        super(pTreeGrower, pProperties);

        for (int i = 0; i < blocks.length; i++) {
            this.blocks.add(blocks[i]);
        }
    }

    @Override
    protected boolean mayPlaceOn(BlockState pState, BlockGetter pLevel, BlockPos pPos) {
//        LostWorlds.LOGGER.debug(pState.getBlock().getDescriptionId());
        for (Block block : blocks) {
            if (block == pState.getBlock()) {
                return pState.is(block);
            }
        }

        return pState.is(Blocks.GRASS);
    }

    public static ArrayList<Block> getBlocks() {
        return blocks;
    }

    public static Block getBlock(int index) {
        return blocks.get(index);
    }
}
