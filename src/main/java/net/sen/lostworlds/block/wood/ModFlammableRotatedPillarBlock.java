package net.sen.lostworlds.block.wood;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.neoforged.neoforge.common.ToolAction;
import net.sen.lostworlds.registry.blocks.UnderworldBlocks;
import org.jetbrains.annotations.Nullable;

import java.util.HashMap;
import java.util.Map;

public class ModFlammableRotatedPillarBlock extends RotatedPillarBlock {

    public ModFlammableRotatedPillarBlock(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
        return true;
    }

    @Override
    public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
        return 5;
    }

    @Override
    public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
        return 5;
    }


    @Override
    public @Nullable BlockState getToolModifiedState(BlockState state, UseOnContext context, ToolAction toolAction, boolean simulate) {
        Map<Integer, WoodStrippedRecipe> strippedWoodMap = new HashMap<Integer, WoodStrippedRecipe>();
        strippedWoodMap.put(0, new WoodStrippedRecipe(UnderworldBlocks.ELDER_WOOD_LOG.get(), UnderworldBlocks.STRIPPED_ELDER_WOOD_LOG.get()));
        strippedWoodMap.put(1, new WoodStrippedRecipe(UnderworldBlocks.ELDER_WOOD.get(), UnderworldBlocks.STRIPPED_ELDER_WOOD.get()));
        strippedWoodMap.put(2, new WoodStrippedRecipe(UnderworldBlocks.OLIVE_LOG.get(), UnderworldBlocks.STRIPPED_OLIVE_LOG.get()));
        strippedWoodMap.put(3, new WoodStrippedRecipe(UnderworldBlocks.OLIVE_WOOD.get(), UnderworldBlocks.STRIPPED_OLIVE_WOOD.get()));
        strippedWoodMap.put(4, new WoodStrippedRecipe(UnderworldBlocks.MYRRH_LOG.get(), UnderworldBlocks.STRIPPED_MYRRH_LOG.get()));
        strippedWoodMap.put(5, new WoodStrippedRecipe(UnderworldBlocks.MYRRH_WOOD.get(), UnderworldBlocks.STRIPPED_MYRRH_WOOD.get()));
        strippedWoodMap.put(6, new WoodStrippedRecipe(UnderworldBlocks.LAUREL_LOG.get(), UnderworldBlocks.STRIPPED_LAUREL_LOG.get()));
        strippedWoodMap.put(7, new WoodStrippedRecipe(UnderworldBlocks.LAUREL_WOOD.get(), UnderworldBlocks.STRIPPED_LAUREL_WOOD.get()));
        strippedWoodMap.put(8, new WoodStrippedRecipe(UnderworldBlocks.CYPRESS_LOG.get(), UnderworldBlocks.STRIPPED_CYPRESS_LOG.get()));
        strippedWoodMap.put(9, new WoodStrippedRecipe(UnderworldBlocks.CYPRESS_WOOD.get(), UnderworldBlocks.STRIPPED_CYPRESS_WOOD.get()));

        if (context.getItemInHand().getItem() instanceof AxeItem axeItem) {
            for (int i = 0; i < strippedWoodMap.size(); i++) {
                if (state.is(strippedWoodMap.get(i).getBaseBlock())) {
                    return strippedWoodMap.get(i).getBaseStrippedBlock().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
                }
            }
        }
        return super.getToolModifiedState(state, context, toolAction, simulate);
    }
}

class WoodStrippedRecipe {
    private Block baseBlock;
    private Block baseStrippedBlock;

    WoodStrippedRecipe(Block baseBlock, Block baseStrippedBlock) {
        this.baseBlock = baseBlock;
        this.baseStrippedBlock = baseStrippedBlock;
    }

    public Block getBaseBlock() {
        return baseBlock;
    }

    public void setBaseBlock(Block baseBlock) {
        this.baseBlock = baseBlock;
    }

    public Block getBaseStrippedBlock() {
        return baseStrippedBlock;
    }

    public void setBaseStrippedBlock(Block baseStrippedBlock) {
        this.baseStrippedBlock = baseStrippedBlock;
    }
}
