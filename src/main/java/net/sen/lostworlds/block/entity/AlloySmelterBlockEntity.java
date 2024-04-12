package net.sen.lostworlds.block.entity;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.chat.Component;
import net.minecraft.world.Containers;
import net.minecraft.world.MenuProvider;
import net.minecraft.world.SimpleContainer;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.ContainerData;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.common.ForgeHooks;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.ForgeCapabilities;
import net.minecraftforge.common.util.LazyOptional;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.ItemStackHandler;
import net.sen.lostworlds.block.custom.AlloySmelterBlock;
import net.sen.lostworlds.recipe.AlloySmelterRecipe;
import net.sen.lostworlds.screen.alloysmelter.AlloySmelterMenu;
import net.sen.lostworlds.util.*;
import net.sen.lostworlds.util.tools.SlotsVector;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Map;
import java.util.Optional;

public class AlloySmelterBlockEntity extends BlockEntity implements MenuProvider {
    private static final int MAX_SLOTS = 4;
    private static final int INPUT_1_SLOT_ID = 0;
    private static final int INPUT_2_SLOT_ID = 1;
    private static final int FUEL_SLOT_ID = 2;
    private static final int OUTPUT_SLOT_ID = 3;
    public static final SlotsVector INPUT_1_SLOT = new SlotsVector(getInput1SlotId(), 37, 17);
    public static final SlotsVector INPUT_2_SLOT = new SlotsVector(getInput2SlotId(), 73, 17);
    public static final SlotsVector FUEL_SLOT = new SlotsVector(getFuelSlotId(), 56, 53);
    public static final SlotsVector OUTPUT_SLOT = new SlotsVector(getOutputSlotId(), 116, 35); //117, 36

    private int burnTime = 0;
    private int maxBurnTime = 1;
    private boolean isBurningFuel = false;
    private FuelRegistry.FuelInfo fuelInfo = FuelRegistry.NULL;

    private LazyOptional<IItemHandler> lazyItemHandler = LazyOptional.empty();

    protected final ContainerData data;
    private int progress = 0;
    private int maxProgress = 78;

    private final ItemStackHandler itemHandler = new ItemStackHandler(getMaxSlots()) {
        @Override
        protected void onContentsChanged(int slot) {
            setChanged();

            if (!level.isClientSide()) {
                level.sendBlockUpdated(getBlockPos(), getBlockState(), getBlockState(), 3);
            }
        }

        @Override
        public boolean isItemValid(int slot, @NotNull ItemStack stack) {
            return switch (slot) {
                case INPUT_1_SLOT_ID, INPUT_2_SLOT_ID, FUEL_SLOT_ID -> true;
                case OUTPUT_SLOT_ID -> false;
                default -> super.isItemValid(slot, stack);
            };
        }
    };

    private final Map<Direction, LazyOptional<WrappedHandler>> directionWrappedHandlerMap =
            new InventoryDirectionWrapper(itemHandler,
                    new InventoryDirectionEntry(Direction.DOWN, getOutputSlotId(), false),
                    new InventoryDirectionEntry(Direction.NORTH, getFuelSlotId(), true),
                    new InventoryDirectionEntry(Direction.SOUTH, getFuelSlotId(), true),
                    new InventoryDirectionEntry(Direction.EAST, getInput2SlotId(), true),
                    new InventoryDirectionEntry(Direction.WEST, getInput1SlotId(), true),
                    new InventoryDirectionEntry(Direction.UP, getFuelSlotId(), true)).directionsMap;

    public AlloySmelterBlockEntity(BlockPos pPos, BlockState pBlockState) {
        super(ModBlockEntities.ALLOY_SMELTER_BLOCK_ENTITY.get(), pPos, pBlockState);

        this.data = new ContainerData() {
            @Override
            public int get(int pIndex) {
                return switch (pIndex) {
                    case 0 -> AlloySmelterBlockEntity.this.progress;
                    case 1 -> AlloySmelterBlockEntity.this.maxProgress;
                    case 2 -> AlloySmelterBlockEntity.this.burnTime;
                    case 3 -> AlloySmelterBlockEntity.this.maxBurnTime;
                    default -> 0;
                };
            }

            @Override
            public void set(int pIndex, int pValue) {
                switch (pIndex) {
                    case 0 -> AlloySmelterBlockEntity.this.progress = pValue;
                    case 1 -> AlloySmelterBlockEntity.this.maxProgress = pValue;
                    case 2 -> AlloySmelterBlockEntity.this.burnTime = pValue;
                    case 3 -> AlloySmelterBlockEntity.this.maxBurnTime = pValue;
                }
            }

            @Override
            public int getCount() {
                return 4;
            }
        };
    }

    public void drops() {
        SimpleContainer inventory = new SimpleContainer(itemHandler.getSlots());
        for (int i = 0; i < itemHandler.getSlots(); i++) {
            inventory.setItem(i, itemHandler.getStackInSlot(i));
        }

        Containers.dropContents(this.level, this.worldPosition, inventory);
    }

    @Override
    public Component getDisplayName() {
        return Component.literal("Alloy Smelter");
    }

    @Nullable
    @Override
    public AbstractContainerMenu createMenu(int pContainerId, Inventory pPlayerInventory, Player pPlayer) {
        return new AlloySmelterMenu(pContainerId, pPlayerInventory, this, this.data);
    }

    @Override
    public @NotNull <T> LazyOptional<T> getCapability(@NotNull Capability<T> cap, @Nullable Direction side) {
        if (cap == ForgeCapabilities.ITEM_HANDLER) {
            if (side == null) {
                return lazyItemHandler.cast();
            }

            if (directionWrappedHandlerMap.containsKey(side)) {
                Direction localDir = this.getBlockState().getValue(AlloySmelterBlock.FACING);

                if (side == Direction.DOWN || side == Direction.UP) {
                    return directionWrappedHandlerMap.get(side).cast();
                }

                return switch (localDir) {
                    default -> directionWrappedHandlerMap.get(side.getOpposite()).cast();
                    case EAST -> directionWrappedHandlerMap.get(side.getClockWise()).cast();
                    case SOUTH -> directionWrappedHandlerMap.get(side).cast();
                    case WEST -> directionWrappedHandlerMap.get(side.getCounterClockWise()).cast();
                };
            }
        }

        return super.getCapability(cap, side);
    }

    @Override
    public void onLoad() {
        super.onLoad();

        lazyItemHandler = LazyOptional.of(() -> itemHandler);
    }

    @Override
    public void invalidateCaps() {
        super.invalidateCaps();

        lazyItemHandler.invalidate();
    }

    private static final String INVENTORY_KEY = "inventory";

    @Override
    protected void saveAdditional(CompoundTag pTag) {
        pTag.put(INVENTORY_KEY, itemHandler.serializeNBT());
        pTag.putInt("burnTime", burnTime);
        pTag.putInt("maxBurnTime", maxBurnTime);
        pTag.putBoolean("isBurningFuel", isBurningFuel);

        super.saveAdditional(pTag);
    }

    @Override
    public void load(CompoundTag pTag) {
        super.load(pTag);

        itemHandler.deserializeNBT(pTag.getCompound(INVENTORY_KEY));
        burnTime = pTag.getInt("burnTime");
        maxBurnTime = pTag.getInt("maxBurnTime");
        isBurningFuel = pTag.getBoolean("isBurningFuel");
    }

    public void tick(Level level, BlockPos pPos, BlockState pState) {
            if (isOutputSlotEmptyOrReceivable() && hasRecipe()) {
                increaseCraftingProcess();
                setChanged(level, pPos, pState);

                burn(level, pPos, pState, this);

                if (hasProgressFinished()) {
                    craftItem();
                    resetProgress();
                }
            } else {
                resetProgress();
            }
    }

    private void craftItem() {
        Optional<AlloySmelterRecipe> recipe = getCurrentRecipe();

        ItemStack resultItem = recipe.get().getResultItem(getLevel().registryAccess());

        this.itemHandler.extractItem(INPUT_1_SLOT.getSlotId(), 1, false);
        this.itemHandler.extractItem(INPUT_2_SLOT.getSlotId(), 1, false);

        this.itemHandler.setStackInSlot(OUTPUT_SLOT.getSlotId(), new ItemStack(resultItem.getItem(),
                this.itemHandler.getStackInSlot(getOutputSlotId()).getCount() + resultItem.getCount()));
    }

    private <T extends BlockEntity> void burn(Level level, BlockPos pos, BlockState state, T blockEntity) {
//        ItemStack burnStack = this.itemHandler.getStackInSlot(getFuelSlotId());
//
//        if (this.isBurningFuel) {
//            this.burnTime--;
//
//            if (this.fuelInfo == FuelRegistry.NULL) {
//                this.fuelInfo = FuelRegistry.GetInfo(burnStack.getItem());
//                if (this.fuelInfo == FuelRegistry.NULL)
//                {
//                    this.burnTime = 0;
//                    this.maxBurnTime = 1;
//                    this.isBurningFuel = false;
//                }
//            }
//
//            if (this.burnTime <= 0)
//            {
//                this.burnTime = 0;
//                this.maxBurnTime = 1;
//                this.isBurningFuel = false;
//            }
//        } else {
//            if (ForgeHooks.getBurnTime(itemHandler.getStackInSlot(getFuelSlotId()), RecipeType.SMELTING) > 0 && itemHandler.getStackInSlot(getFuelSlotId()).getCount() < 64)
//            {
//                //this.fuelInfo = FuelRegistry.GetInfo(burnStack.getItem());
//
//                if (this.fuelInfo != FuelRegistry.NULL) {
//                    this.burnTime = ForgeHooks.getBurnTime(itemHandler.getStackInSlot(getFuelSlotId()), RecipeType.SMELTING);
//                    this.maxBurnTime = ForgeHooks.getBurnTime(itemHandler.getStackInSlot(getFuelSlotId()), RecipeType.SMELTING);
//                    this.isBurningFuel = true;
//                    this.itemHandler.extractItem(getFuelSlotId(), 1, false);
//                }
//            }
//        }

        if(blockEntity instanceof AlloySmelterBlockEntity alloyFurnaceBlockEntity) {
            boolean dirty = false;

            //Get the recipe instance for the items in the slots
            ItemStackHandler inventory = alloyFurnaceBlockEntity.itemHandler;
            Optional<AlloySmelterRecipe> recipe = getCurrentRecipe();

            //Checks if there is a recipe for the ingredients in the slots
            if (!hasRecipe()) {
                //Checks if the fuel burn timer is running and the output slot isn't clogged
                if (alloyFurnaceBlockEntity.burnTime < alloyFurnaceBlockEntity.burnTime && alloyFurnaceBlockEntity.burnTime >= 0 && inventory.getStackInSlot(3).getCount() < 64) {
                    //If not fuel Item has been consumed it is done now
                    if (!alloyFurnaceBlockEntity.isBurningFuel) {
                        inventory.extractItem(getFuelSlotId(), 1, false);
                        alloyFurnaceBlockEntity.isBurningFuel = true;
                    }
                    //Checks if the alloy timer is running
                    if (alloyFurnaceBlockEntity.burnTime < alloyFurnaceBlockEntity.maxProgress) {
                        //turns on the fire (if it isn't already burning)...
//                        if (!level.getBlockState(pos).getValue(AlloySmelterBlock.LIT)) {
//                            level.setBlockAndUpdate(pos, state.setValue(AlloySmelterBlock.LIT, true));
//                        }

                        //...and increases the alloy timer
                        alloyFurnaceBlockEntity.progress++;
                    } else {
                        //Resets the alloy timer
                        alloyFurnaceBlockEntity.progress = 0;
                        //Put the result in the result slot
//                        ItemStack output = Objects.requireNonNull(recipe).get();
//                        inventory.insertItem(3, output.copy(), false);
                        //Checks if the recipe was flipped and removes the recipes accordingly
//                        if (flipped) {
//                            inventory.decreaseStackSize(1, recipe.getInput1().getCount());
//                            inventory.decreaseStackSize(0, recipe.getInput2().getCount());
//                        } else {
//                            inventory.decreaseStackSize(0, recipe.getInput1().getCount());
//                            inventory.decreaseStackSize(1, recipe.getInput2().getCount());
//                        }
                    }
                    dirty = true;
                } else if (ForgeHooks.getBurnTime(inventory.getStackInSlot(2), RecipeType.SMELTING) > 0 && inventory.getStackInSlot(3).getCount() < 64) {
                    //Else If there is a fuel in the fuel slot and the output slot isn't clogged:
                    //reset the fuel burn timer
                    alloyFurnaceBlockEntity.burnTime = 0;
                    alloyFurnaceBlockEntity.isBurningFuel = false;
                    //change the mx burn time to the burn time of the fuel
                    alloyFurnaceBlockEntity.maxBurnTime = ForgeHooks.getBurnTime(inventory.getStackInSlot(2), RecipeType.SMELTING);
                    dirty = true;
                } else {
                    //reset the fuel burn timer to -1 to indicate that the timer has halted
                    alloyFurnaceBlockEntity.burnTime = -1;
                    alloyFurnaceBlockEntity.isBurningFuel = false;
                    alloyFurnaceBlockEntity.maxBurnTime = 0;
//                    level.setBlockAndUpdate(pos, state.setValue(AlloyFurnaceBlock.LIT, false));
                    //decrease alloy timer
//                    if (alloyFurnaceBlockEntity.progress > 0) {
//                        alloyFurnaceBlockEntity.progress -= 2;
//                    }
                    dirty = true;
                }
            } else {
                //If there are no valid Ingredients we turn of the fire but only if there is no fuel still burning and...
//                if (level.getBlockState(pos).getValue(AlloyFurnaceBlock.LIT) && alloyFurnaceBlockEntity.currentBurnTime >= alloyFurnaceBlockEntity.currentMaxBurnTime) {
//                    level.setBlockAndUpdate(pos, state.setValue(AlloyFurnaceBlock.LIT, false));
//                }
                //...we decrease the alloy timer
//                if (alloyFurnaceBlockEntity.currentAlloyTime < alloyFurnaceBlockEntity.maxAlloyTime && alloyFurnaceBlockEntity.currentAlloyTime > 0) {
//                    alloyFurnaceBlockEntity.currentAlloyTime -= 2;
//                }
            }
            //The increase the fuel timer if fuel is (still) burning
            //But only if the timer is bigger than 0
            if (alloyFurnaceBlockEntity.burnTime < alloyFurnaceBlockEntity.maxBurnTime && alloyFurnaceBlockEntity.burnTime >= 0) {
                alloyFurnaceBlockEntity.burnTime++;
                dirty = true;
            }
            //The alloy timer should not be smaller than 0
//            if (alloyFurnaceBlockEntity.currentAlloyTime < 0) {
//                alloyFurnaceBlockEntity.currentAlloyTime = 0;
//                dirty = true;
//            }
            //if the block has changed we write the changes to the disk,
            //notify the neighbours and send the update to the client
            if(dirty){
                alloyFurnaceBlockEntity.setChanged();
                level.sendBlockUpdated(pos, state, state, 3);
            }
        }
    }

    private void resetProgress() {
        this.progress = 0;
    }

    private boolean hasProgressFinished() {
        return this.progress >= this.maxProgress;
    }

    private void increaseCraftingProcess() {
        this.progress++;
    }

    private boolean hasRecipe() {
        Optional<AlloySmelterRecipe> recipe = getCurrentRecipe();

        if (recipe.isEmpty()) {
            return false;
        }

        ItemStack resultItem = recipe.get().getResultItem(getLevel().registryAccess());

        return canInsertAmountIntoOutputSlot(resultItem.getCount()) &&
                canInsertItemIntoOutputSlot(resultItem.getItem());
    }

    private Optional<AlloySmelterRecipe> getCurrentRecipe() {
        SimpleContainer inventory = new SimpleContainer(this.itemHandler.getSlots());

        for (int i = 0; i < this.itemHandler.getSlots(); i++) {
            inventory.setItem(i, this.itemHandler.getStackInSlot(i));
        }

        return this.level.getRecipeManager().getRecipeFor(AlloySmelterRecipe.Type.INSTANCE, inventory, level);
    }

//    private boolean hasRecipeItemInInputSlot1() {
//        return this.itemHandler.getStackInSlot(INPUT_1_SLOT.getSlotId()).getItem() == ModItems.TIN_INGOT.get();
//    }

//    private boolean hasRecipeItemInInputSlot2() {
//        return this.itemHandler.getStackInSlot(INPUT_2_SLOT.getSlotId()).getItem() == Items.COPPER_INGOT;
//    }

    private boolean canInsertItemIntoOutputSlot(Item item) {
        return this.itemHandler.getStackInSlot(OUTPUT_SLOT.getSlotId()).isEmpty() || this.itemHandler.getStackInSlot(OUTPUT_SLOT.getSlotId()).is(item);
    }

    private boolean canInsertAmountIntoOutputSlot(int count) {
        return this.itemHandler.getStackInSlot(OUTPUT_SLOT.getSlotId()).getMaxStackSize() >=
                this.itemHandler.getStackInSlot(OUTPUT_SLOT.getSlotId()).getCount() + count;
    }

    private boolean isOutputSlotEmptyOrReceivable() {
        return this.itemHandler.getStackInSlot(OUTPUT_SLOT.getSlotId()).isEmpty() ||
                this.itemHandler.getStackInSlot(OUTPUT_SLOT.getSlotId()).getCount() < this.itemHandler.getStackInSlot(OUTPUT_SLOT.getSlotId()).getMaxStackSize();
    }

    public float GetBurnPercent()
    {
        return (float) burnTime / (float) maxBurnTime;
    }

//    private static int getTotalCookTime(Level pLevel, AlloySmelterBlockEntity pBlockEntity) {
//        return pBlockEntity.quickCheck.getRecipeFor(pBlockEntity, pLevel).map(AlloySmelterRecipe::getCookingTime).orElse(200);
//    }


    public static int getInput1SlotId() {return INPUT_1_SLOT_ID;}
    public static int getInput2SlotId() {return INPUT_2_SLOT_ID;}
    public static int getFuelSlotId() {return FUEL_SLOT_ID;}
    public static int getOutputSlotId() {return OUTPUT_SLOT_ID;}
    public static int getMaxSlots() {return MAX_SLOTS;}
    public int getBurnTime() {
        return burnTime;
    }
    public int getMaxBurnTime() {
        return maxBurnTime;
    }
    public boolean isBurningFuel() {
        return isBurningFuel;
    }
    public FuelRegistry.FuelInfo getFuelInfo() {
        return fuelInfo;
    }
    public LazyOptional<IItemHandler> getLazyItemHandler() {
        return lazyItemHandler;
    }
    public ContainerData getData() {
        return data;
    }
    public int getProgress() {
        return progress;
    }
    public int getMaxProgress() {
        return maxProgress;
    }
    public ItemStackHandler getItemHandler() {
        return itemHandler;
    }
    public Map<Direction, LazyOptional<WrappedHandler>> getDirectionWrappedHandlerMap() {
        return directionWrappedHandlerMap;
    }
}
