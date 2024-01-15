/*
Code from:
https://github.com/Ellpeck/NaturesAura/blob/main/src/main/java/de/ellpeck/naturesaura/blocks/tiles/BlockEntityNatureAltar.java#L89
*/
package net.sen.lostworlds.block.tile;

import net.minecraft.core.BlockPos;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.sen.lostworlds.multiblocks.ModMultiblocks;
import net.sen.lostworlds.multiblocks.Multiblock;

public class BlockEntityDruidRitual extends BlockEntityImpl implements ITickableBlockEntity {
    @OnlyIn(Dist.CLIENT)
    public int bobTimer;
    public boolean isComplete;

//    private AltarRecipe currentRecipe;
    private int timer;
    private int lastAura;
    private boolean firstTick = true;

    public BlockEntityDruidRitual(BlockEntityType<?> type, BlockPos pos, BlockState state) {
        super(type, pos, state);
    }

    @Override
    public void tick() {
        if (!this.level.isClientSide) {
            if (this.level.getGameTime() % 40 == 0 || this.firstTick) {
                var complete = ModMultiblocks.DRUID_RITUAL.isComplete(this.level, this.worldPosition);
                if (complete != this.isComplete) {
                    this.isComplete = complete;
                    this.sendToClients();
                }
                this.firstTick = false;
            }
        }
    }
}
