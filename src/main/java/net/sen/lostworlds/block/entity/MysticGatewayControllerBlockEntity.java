package net.sen.lostworlds.block.entity;

import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.world.MenuProvider;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.ContainerData;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.sen.lostworlds.screen.MysticGatewayControllerMenu;
import org.jetbrains.annotations.Nullable;

public class MysticGatewayControllerBlockEntity extends BlockEntity implements MenuProvider {
    protected final ContainerData data;

    public MysticGatewayControllerBlockEntity(BlockPos pPos, BlockState pBlockState) {
        super(ModBlockEntities.MYSTIC_GATEWAY_CONTROLLER_BLOCK_ENTITY.get(), pPos, pBlockState);

        this.data = new ContainerData() {
            @Override
            public int get(int pIndex) {
                return 0;
            }

            @Override
            public void set(int pIndex, int pValue) {

            }

            @Override
            public int getCount() {
                return 0;
            }
        };
    }

    @Override
    public Component getDisplayName() {
        return Component.literal("Mystic Gateways Controller");
    }

    @Nullable
    @Override
    public AbstractContainerMenu createMenu(int pContainerId, Inventory pPlayerInventory, Player pPlayer) {
        return new MysticGatewayControllerMenu(pContainerId, pPlayerInventory, this, this.data);
    }
}
