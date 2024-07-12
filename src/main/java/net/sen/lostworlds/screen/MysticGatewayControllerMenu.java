package net.sen.lostworlds.screen;

import net.minecraft.core.BlockPos;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.*;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BlockEntity;

import net.neoforged.neoforge.capabilities.Capabilities;
import net.sen.lostworlds.block.entity.MysticGatewayControllerBlockEntity;

public class MysticGatewayControllerMenu extends AbstractContainerMenu {
    public final MysticGatewayControllerBlockEntity blockEntity;
    public final Level level;

    private final ContainerData data;

    public MysticGatewayControllerMenu(int pContainerId, Inventory inv, FriendlyByteBuf extraData) {
        this(pContainerId, inv, inv.player.level().getBlockEntity(extraData.readBlockPos()), new SimpleContainerData(2));
    }

    public MysticGatewayControllerMenu(int pContainerId, Inventory inv, BlockEntity entity, ContainerData data) {
        super(ModMenuTypes.MYSTIC_GATEWAY_CONTROLLER_MENU.get(), pContainerId);
//        checkContainerSize(inv, MysticGatewayControllerBlockEntity.MAX_SLOTS);
        blockEntity = ((MysticGatewayControllerBlockEntity) entity);
        this.level = inv.player.level();
        this.data = data;

//        addPlayerInventory(inv);
//        addPlayerHotbar(inv);

//        this.blockEntity.getCapability(Capabilities.ItemHandler).ifPresent(iItemHandler -> {
////            this.addSlot(new SlotItemHandler(iItemHandler, INPUT_1_SLOT.getSlotId(), INPUT_1_SLOT.getPosX(), INPUT_1_SLOT.getPosY()));
////            this.addSlot(new SlotItemHandler(iItemHandler, INPUT_2_SLOT.getSlotId(), INPUT_2_SLOT.getPosX(), INPUT_2_SLOT.getPosY()));
////            this.addSlot(new SlotItemHandler(iItemHandler, FUEL_SLOT.getSlotId(), FUEL_SLOT.getPosX(), FUEL_SLOT.getPosY()));
////            this.addSlot(new SlotItemHandler(iItemHandler, OUTPUT_SLOT.getSlotId(), OUTPUT_SLOT.getPosX(), OUTPUT_SLOT.getPosY()));
//        });

        addDataSlots(data);
    }

    @Override
    public ItemStack quickMoveStack(Player pPlayer, int pIndex) {
        ItemStack itemStack = ItemStack.EMPTY;
        Slot slot = slots.get(pIndex);

        if (slot.hasItem()) {
            ItemStack slotStack = slot.getItem();
            itemStack = slotStack.copy();
            if (pIndex < 5) {
                if (!this.moveItemStackTo(slotStack, 5, this.slots.size(), true)) {
                    return ItemStack.EMPTY;
                }
            } else {
                if (!getSlot(0).hasItem()) {
                    if (!this.moveItemStackTo(slotStack.split(1), 0, 1, false)) {
                        return ItemStack.EMPTY;
                    }
                } else {
                    if (!this.moveItemStackTo(slotStack, 1, 5, false)) {
                        return ItemStack.EMPTY;
                    }
                }
            }

            if (slotStack.isEmpty()) {
                slot.set(ItemStack.EMPTY);
            } else {
                slot.setChanged();
            }
        }

        return itemStack;
    }

    @Override
    public boolean stillValid(Player pPlayer) {
        BlockPos pos = blockEntity.getBlockPos();
        return pPlayer.distanceToSqr((double) pos.getX() + 0.5, (double) pos.getY() + 0.5, (double) pos.getZ() + 0.5) <= 64;
    }
}
