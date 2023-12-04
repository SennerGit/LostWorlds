package net.sen.lostworlds.block.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.common.ToolAction;
import net.sen.lostworlds.block.ModBlocks;
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
        strippedWoodMap.put(0, new WoodStrippedRecipe(ModBlocks.ELDER_WOOD_LOG.get(), ModBlocks.STRIPPED_ELDER_WOOD_LOG.get()));
        strippedWoodMap.put(1, new WoodStrippedRecipe(ModBlocks.ELDER_WOOD.get(), ModBlocks.STRIPPED_ELDER_WOOD.get()));
        strippedWoodMap.put(2, new WoodStrippedRecipe(ModBlocks.OLIVE_LOG.get(), ModBlocks.STRIPPED_OLIVE_LOG.get()));
        strippedWoodMap.put(3, new WoodStrippedRecipe(ModBlocks.OLIVE_WOOD.get(), ModBlocks.STRIPPED_OLIVE_WOOD.get()));
        strippedWoodMap.put(4, new WoodStrippedRecipe(ModBlocks.MYRRH_LOG.get(), ModBlocks.STRIPPED_MYRRH_LOG.get()));
        strippedWoodMap.put(5, new WoodStrippedRecipe(ModBlocks.MYRRH_WOOD.get(), ModBlocks.STRIPPED_MYRRH_WOOD.get()));
        strippedWoodMap.put(6, new WoodStrippedRecipe(ModBlocks.LAUREL_LOG.get(), ModBlocks.STRIPPED_LAUREL_LOG.get()));
        strippedWoodMap.put(7, new WoodStrippedRecipe(ModBlocks.LAUREL_WOOD.get(), ModBlocks.STRIPPED_LAUREL_WOOD.get()));
        strippedWoodMap.put(8, new WoodStrippedRecipe(ModBlocks.CYPRESS_LOG.get(), ModBlocks.STRIPPED_CYPRESS_LOG.get()));
        strippedWoodMap.put(9, new WoodStrippedRecipe(ModBlocks.CYPRESS_WOOD.get(), ModBlocks.STRIPPED_CYPRESS_WOOD.get()));

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
