package net.sen.lostworlds.block.custom;

import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.CropBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.sen.lostworlds.item.ModItems;

public class OnionCropBlock extends ModCropBlock {
    public static final int MAX_AGE = 6;
    public static final int MAX_STAGE = 4;
    public static final IntegerProperty AGE = IntegerProperty.create("age", 0, MAX_AGE);
    public static IntegerProperty STAGE = IntegerProperty.create("stage", 0, MAX_STAGE);

    public OnionCropBlock(BlockBehaviour.Properties properties, int stage){
        super(properties);
        defaultBlockState().setValue(STAGE, stage);
//        this.getStageProperty().getValue(stage);

    }

    @Override
    protected ItemLike getBaseSeedId() {
        if (STAGE.equals(1)) {
            return ModItems.ONION_STAGE_1.get();
        }else if (STAGE.equals(2)) {
            return ModItems.ONION_STAGE_2.get();
        }else if (STAGE.equals(3)) {
            return ModItems.ONION_STAGE_3.get();
        }else if (STAGE.equals(4)) {
            return ModItems.ONION.get();
        }
        else {
            return ModItems.WILD_ONION.get();
        }
    }

    @Override
    public IntegerProperty getAgeProperty() {
        return AGE;
    }
    public IntegerProperty getStageProperty() {
        return STAGE;
    }

    @Override
    public int getMaxAge() {
        return MAX_AGE;
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> pBuilder) {
        pBuilder.add(AGE);
        pBuilder.add(STAGE);
    }
}
