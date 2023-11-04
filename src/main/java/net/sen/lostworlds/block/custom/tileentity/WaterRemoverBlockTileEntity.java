package net.sen.lostworlds.block.custom.tileentity;

import net.minecraft.core.BlockPos;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.Connection;
import net.minecraft.network.protocol.Packet;
import net.minecraft.network.protocol.game.ClientGamePacketListener;
import net.minecraft.network.protocol.game.ClientboundBlockEntityDataPacket;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.sen.lostworlds.block.ModBlockSetType;
import net.sen.lostworlds.block.ModTileEntityTypes;
import net.sen.lostworlds.block.custom.WaterRemoverBlock;
import org.jetbrains.annotations.Nullable;

public class WaterRemoverBlockTileEntity extends BlockEntity {
    public WaterRemoverBlockTileEntity(BlockPos pPos, BlockState pState) {
        super(ModTileEntityTypes.WATER_REMOVER_BLOCK_TILE_ENTITY.get(), pPos, pState);
    }

    public static void tick(Level level, BlockPos worldPosition, BlockState blockState, WaterRemoverBlockTileEntity blockTileEntity) {
        if (!blockState.getValue(WaterRemoverBlock.LIT)) {
            return;
        }
    }

    @Override
    public void load(CompoundTag pTag) {
        super.load(pTag);
    }

    @Override
    protected void saveAdditional(CompoundTag pTag) {
        super.saveAdditional(pTag);
    }

    @Override
    public CompoundTag getUpdateTag() {
        final CompoundTag tag = new CompoundTag();
        this.saveAdditional(tag);
        return tag;
    }

    @Nullable
    @Override
    public Packet<ClientGamePacketListener> getUpdatePacket() {
        return ClientboundBlockEntityDataPacket.create(this);
    }

    @Override
    public void onDataPacket(Connection net, ClientboundBlockEntityDataPacket packet) {
        super.onDataPacket(net, packet);

        if (this.level.isClientSide) {
            this.level.sendBlockUpdated(this.worldPosition, this.level.getBlockState(this.worldPosition), this.level.getBlockState(this.worldPosition), 3);
        }

        return;
    }
}
