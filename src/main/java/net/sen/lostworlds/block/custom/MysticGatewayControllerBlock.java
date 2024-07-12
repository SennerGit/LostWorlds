package net.sen.lostworlds.block.custom;

import com.mojang.serialization.MapCodec;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.ItemInteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.BaseEntityBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;
import net.sen.lostworlds.block.entity.MysticGatewayControllerBlockEntity;
import org.jetbrains.annotations.Nullable;

public class MysticGatewayControllerBlock extends BaseEntityBlock {
    public static final MapCodec<MysticGatewayControllerBlock> CODEC = simpleCodec(MysticGatewayControllerBlock::new);

    @Override
    public MapCodec<MysticGatewayControllerBlock> codec() {
        return CODEC;
    }

    public MysticGatewayControllerBlock(Properties pProperties) {
        super(pProperties);
    }

    @Nullable
    @Override
    public BlockEntity newBlockEntity(BlockPos pPos, BlockState pState) {
        return new MysticGatewayControllerBlockEntity(pPos, pState);
    }

    @Override
    protected ItemInteractionResult useItemOn(ItemStack pStack, BlockState pState, Level pLevel, BlockPos pPos, Player pPlayer, InteractionHand pHand, BlockHitResult pHitResult) {
        if (!pLevel.isClientSide()) {
            BlockEntity entity = pLevel.getBlockEntity(pPos);
            if(entity instanceof MysticGatewayControllerBlockEntity) {
                pPlayer.openMenu((MysticGatewayControllerBlockEntity)entity, pPos);
            } else {
                throw new IllegalStateException("Our Container provider is missing!");
            }
        }

        return super.useItemOn(pStack, pState, pLevel, pPos, pPlayer, pHand, pHitResult);
    }
}
