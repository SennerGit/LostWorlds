package net.sen.lostworlds.entity.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.tags.FluidTags;
import net.minecraft.util.RandomSource;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.MobType;
import net.minecraft.world.entity.PathfinderMob;
import net.minecraft.world.entity.monster.Enemy;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ProjectileWeaponItem;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.pathfinder.BlockPathTypes;

import java.util.function.Predicate;

public abstract class WaterMonster extends PathfinderMob implements Enemy {
    protected WaterMonster(EntityType<? extends WaterMonster> pEntityType, Level pLevel) {
        super(pEntityType, pLevel);
        this.setPathfindingMalus(BlockPathTypes.WATER, 0.0f);
        this.xpReward = 5;
    }

    public SoundSource getSoundSource() {
        return SoundSource.HOSTILE;
    }
    protected SoundEvent getSwimSound() {
        return SoundEvents.HOSTILE_SWIM;
    }

    protected SoundEvent getSwimSplashSound() {
        return SoundEvents.HOSTILE_SPLASH;
    }

    protected SoundEvent getHurtSound(DamageSource pDamageSource) {
        return SoundEvents.HOSTILE_HURT;
    }

    protected SoundEvent getDeathSound() {
        return SoundEvents.HOSTILE_DEATH;
    }


    public boolean canBreatheUnderwater() {
        return true;
    }

    public MobType getMobType() {
        return MobType.WATER;
    }
    public boolean checkSpawnObstruction(LevelReader pLevel) {
        return pLevel.isUnobstructed(this);
    }

    /*
    Monster Behaviour
     */

    /**
     * Called every tick so the entity can update its state as required. For example, zombies and skeletons use this to
     * react to sunlight and start to burn.
     */
//    public void aiStep() {
//        this.updateSwingTime();
//        super.aiStep();
//    }

    protected boolean shouldDespawnInPeaceful() {
        return true;
    }

    /**
     * Entity won't drop experience points if this returns false
     */
    public boolean shouldDropExperience() {
        return true;
    }

    /**
     * Entity won't drop items if this returns false
     */
    protected boolean shouldDropLoot() {
        return true;
    }

    public boolean isPreventingPlayerRest(Player pPlayer) {
        return true;
    }

    public ItemStack getProjectile(ItemStack pShootable) {
        if (pShootable.getItem() instanceof ProjectileWeaponItem) {
            Predicate<ItemStack> predicate = ((ProjectileWeaponItem)pShootable.getItem()).getSupportedHeldProjectiles();
            ItemStack itemstack = ProjectileWeaponItem.getHeldProjectile(this, predicate);
            return net.minecraftforge.common.ForgeHooks.getProjectile(this, pShootable, itemstack.isEmpty() ? new ItemStack(Items.ARROW) : itemstack);
        } else {
            return net.minecraftforge.common.ForgeHooks.getProjectile(this, pShootable, ItemStack.EMPTY);
        }
    }

    /*
    Water Behaviour
     */
    /**
     * Get number of ticks, at least during which the living entity will be silent.
     */
    public int getAmbientSoundInterval() {
        return 120;
    }

    protected void handleAirSupply(int pAirSupply) {
        if (this.isAlive() && !this.isInWaterOrBubble()) {
            this.setAirSupply(pAirSupply - 1);
            if (this.getAirSupply() == -20) {
                this.setAirSupply(0);
                this.hurt(this.damageSources().drown(), 2.0F);
            }
        } else {
            this.setAirSupply(300);
        }

    }

    /**
     * Gets called every tick from main Entity class
     */
    public void baseTick() {
        int i = this.getAirSupply();
        super.baseTick();
        this.handleAirSupply(i);
    }

    public boolean isPushedByFluid() {
        return false;
    }

    public static boolean checkSurfaceWaterMonsterSpawnRules(EntityType<? extends WaterMonster> pWaterMonster, LevelAccessor pLevel, MobSpawnType pSpawnType, BlockPos pPos, RandomSource pRandom) {
        int i = pLevel.getSeaLevel();
        int j = i - 13;
        return pPos.getY() >= j && pPos.getY() <= i && pLevel.getFluidState(pPos.below()).is(FluidTags.WATER) && pLevel.getBlockState(pPos.above()).is(Blocks.WATER);
    }
}
