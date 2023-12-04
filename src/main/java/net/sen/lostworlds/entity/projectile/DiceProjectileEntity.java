package net.sen.lostworlds.entity.projectile;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.projectile.ThrowableItemProjectile;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.BlockHitResult;
import net.sen.lostworlds.block.ModBlocks;
import net.sen.lostworlds.block.custom.DiceBlock;
import net.sen.lostworlds.entity.ModEntities;

public class DiceProjectileEntity extends ThrowableItemProjectile {
    public DiceProjectileEntity(EntityType<? extends ThrowableItemProjectile> pEntityType, Level pLevel) {
        super(pEntityType, pLevel);
    }
    public DiceProjectileEntity(Level pLevel) {
        super(ModEntities.DICE_PROJECTILE.get(), pLevel);
    }
    public DiceProjectileEntity(Level pLevel, LivingEntity livingEntity) {
        super(ModEntities.DICE_PROJECTILE.get(), livingEntity, pLevel);
    }

    @Override
    protected Item getDefaultItem() {
        return null;
    }

    @Override
    protected void onHitBlock(BlockHitResult pResult) {
        if (!this.level().isClientSide) {
            this.level().broadcastEntityEvent(this, ((byte) 3));
            this.level().setBlock(blockPosition(), ((DiceBlock) ModBlocks.DICE_BLOCK.get()).getRandomBlockState(), 3);
        }

        this.discard();
        super.onHitBlock(pResult);
    }
}
