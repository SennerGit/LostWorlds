package net.sen.lostworlds.block.custom;

import com.mojang.serialization.MapCodec;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.ItemInteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.phys.BlockHitResult;
import net.sen.lostworlds.block.custom.tileentity.WaterRemoverBlockTileEntity;
import org.jetbrains.annotations.Nullable;

public class WaterRemoverBlock extends BaseEntityBlock {
    public static final MapCodec<WaterRemoverBlock> CODEC = simpleCodec(WaterRemoverBlock::new);
    @Override
    protected MapCodec<? extends WaterRemoverBlock> codec() {
        return CODEC;
    }

    public static final BooleanProperty LIT = BooleanProperty.create("clicked");
    public static final int MAX_DEPTH = 6;
    public static final int MAX_COUNT = 257;
    private static final Direction[] ALL_DIRECTIONS = Direction.values();

    public WaterRemoverBlock(BlockBehaviour.Properties properties) {
        super(properties);
    }

    @Override
    protected ItemInteractionResult useItemOn(ItemStack pStack, BlockState pState, Level pLevel, BlockPos pPos, Player pPlayer, InteractionHand pHand, BlockHitResult pHitResult) {
        if (!pLevel.isClientSide() && pHand == InteractionHand.MAIN_HAND) {
            boolean currentState = pState.getValue(LIT);
            pLevel.setBlock(pPos, pState.setValue(LIT, !currentState), 3);
        }

        return ItemInteractionResult.SUCCESS;
    }

    @Override
    public void tick(BlockState pState, ServerLevel pLevel, BlockPos pPos, RandomSource pRandom) {
        if (pState.getValue(LIT)) {
            this.tryAbsorbWater(pLevel, pPos);
        }
    }

    @Override
    public void onBlockStateChange(LevelReader level, BlockPos pos, BlockState oldState, BlockState newState) {
        super.onBlockStateChange(level, pos, oldState, newState);
    }



    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> pBuilder) {
        super.createBlockStateDefinition(pBuilder);
        pBuilder.add(LIT);
    }

    @Override
    public void neighborChanged(BlockState pState, Level pLevel, BlockPos pPos, Block pBlock, BlockPos pFromPos, boolean pIsMoving) {
        if (LIT.equals(this)) {
            this.tryAbsorbWater(pLevel, pPos);
            super.neighborChanged(pState, pLevel, pPos, pBlock, pFromPos, pIsMoving);
        }
    }

    protected void tryAbsorbWater(Level pLevel, BlockPos pPos) {
        if (this.removeWaterBreadthFirstSearch(pLevel, pPos)) {
//            pLevel.setBlock(pPos, Blocks.WET_SPONGE.defaultBlockState(), 2);
            pLevel.levelEvent(2001, pPos, Block.getId(Blocks.WATER.defaultBlockState()));
        }

    }

    private boolean removeWaterBreadthFirstSearch(Level pLevel, BlockPos pPos) {
        BlockState spongeState = pLevel.getBlockState(pPos);
        return BlockPos.breadthFirstTraversal(pPos, MAX_DEPTH, MAX_COUNT, (blockPos, blockPosConsumer) -> {
            for(Direction direction : ALL_DIRECTIONS) {
                blockPosConsumer.accept(blockPos.relative(direction));
            }

        }, (blockPos) -> {
            if (blockPos.equals(pPos)) {
                return true;
            } else {
                BlockState blockstate = pLevel.getBlockState(blockPos);
                FluidState fluidstate = pLevel.getFluidState(blockPos);
                if (!spongeState.canBeHydrated(pLevel, pPos, fluidstate, blockPos)) {
                    return false;
                } else {
                    Block block = blockstate.getBlock();
                    if (block instanceof BucketPickup) {
                        BucketPickup bucketpickup = (BucketPickup)block;
                        if (!bucketpickup.pickupBlock(null, pLevel, blockPos, blockstate).isEmpty()) {
                            return true;
                        }
                    }

                    if (blockstate.getBlock() instanceof LiquidBlock) {
                        pLevel.setBlock(blockPos, Blocks.AIR.defaultBlockState(), 3);
                    } else {
                        if (!blockstate.is(Blocks.KELP) && !blockstate.is(Blocks.KELP_PLANT) && !blockstate.is(Blocks.SEAGRASS) && !blockstate.is(Blocks.TALL_SEAGRASS)) {
                            return false;
                        }

                        BlockEntity blockentity = blockstate.hasBlockEntity() ? pLevel.getBlockEntity(blockPos) : null;
                        dropResources(blockstate, pLevel, blockPos, blockentity);
                        pLevel.setBlock(blockPos, Blocks.AIR.defaultBlockState(), 3);
                    }

                    return true;
                }
            }
        }) > 1;
    }

    @Nullable
    @Override
    public BlockEntity newBlockEntity(BlockPos pPos, BlockState pState) {
        return new WaterRemoverBlockTileEntity(pPos, pState);
    }
}
