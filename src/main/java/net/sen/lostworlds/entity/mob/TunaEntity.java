package net.sen.lostworlds.entity.mob;

import com.google.common.collect.Maps;
import net.minecraft.Util;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.*;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.goal.AvoidEntityGoal;
import net.minecraft.world.entity.ai.goal.PanicGoal;
import net.minecraft.world.entity.ai.goal.RandomSwimmingGoal;
import net.minecraft.world.entity.animal.Animal;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.ServerLevelAccessor;
import net.minecraft.world.phys.Vec3;
import net.sen.lostworlds.LostWorlds;
import net.sen.lostworlds.LostWorldsConstants;
import net.sen.lostworlds.entity.custom.AbstractSchoolingBigFish;
import net.sen.lostworlds.entity.custom.AbstractSchoolingFishVarients;
import net.sen.lostworlds.entity.variant.TangFishVariant;
import net.sen.lostworlds.entity.variant.TunaSizeVariant;
import net.sen.lostworlds.entity.variant.TunaTextureVariant;

import javax.annotation.Nullable;
import java.util.Map;

public class TunaEntity extends AbstractSchoolingBigFish {
    private static final Map<TunaSizeVariant, ResourceLocation> SIZE_BY_VARIANT =
            Util.make(Maps.newEnumMap(TunaSizeVariant.class), map -> {
                map.put(TunaSizeVariant.TINY,
                        LostWorldsConstants.modLoc("entities/tuna"));
                map.put(TunaSizeVariant.SMALL,
                        LostWorldsConstants.modLoc("entities/tuna_small"));
                map.put(TunaSizeVariant.MID,
                        LostWorldsConstants.modLoc("entities/tuna_mid"));
                map.put(TunaSizeVariant.LARGE,
                        LostWorldsConstants.modLoc("entities/tuna_large"));
                map.put(TunaSizeVariant.GIANT,
                        LostWorldsConstants.modLoc("entities/tuna_giant"));
            });

    private static final EntityDataAccessor<Integer> DATA_ID_TEXTURE_VARIANT =
            SynchedEntityData.defineId(TunaEntity.class, EntityDataSerializers.INT);

    private static final EntityDataAccessor<Integer> DATA_ID_SIZE_VARIANT =
            SynchedEntityData.defineId(TunaEntity.class, EntityDataSerializers.INT);

    public final AnimationState idleAnimationState = new AnimationState();
    private int idleAnimationTimeout = 0;

    public TunaEntity(EntityType<? extends AbstractSchoolingBigFish> pEntityType, Level pLevel) {
        super(pEntityType, pLevel);
    }
    
    /*
    AI
     */
    @Override
    protected void registerGoals() {
        super.registerGoals();
        this.goalSelector.addGoal(0, new PanicGoal(this, 1.25D));
        this.goalSelector.addGoal(2, new AvoidEntityGoal<>(this, Player.class, 8.0F, 1.6D, 1.4D, EntitySelector.NO_SPECTATORS::test));
        this.goalSelector.addGoal(4, new FishSwimGoal(this));
    }
    public void travel(Vec3 travelVector) {
        if (this.isEffectiveAi() && this.isInWater()) {
            this.moveRelative(this.getSpeed(), travelVector);
            this.move(MoverType.SELF, this.getDeltaMovement());
            this.setDeltaMovement(this.getDeltaMovement().scale(0.9D));
            if (this.getTarget() == null) {
                this.setDeltaMovement(this.getDeltaMovement().add(0.0D, -0.005D, 0.0D));
            }
        } else {
            super.travel(travelVector);
        }

    }

    public void aiStep() {
        if (!this.isInWater() && this.onGround() && this.verticalCollision) {
            this.setDeltaMovement(this.getDeltaMovement().add((double)((this.random.nextFloat() * 2.0F - 1.0F) * 0.05F), (double)0.4F, (double)((this.random.nextFloat() * 2.0F - 1.0F) * 0.05F)));
            this.setOnGround(false);
            this.hasImpulse = true;
            this.playSound(this.getFlopSound(), this.getSoundVolume(), this.getVoicePitch());
        }

        super.aiStep();
    }

    protected boolean canRandomSwim() {
        return true;
    }

    /*
    ANIMATION
     */
    private void setupAnimationStates() {
        if (this.idleAnimationTimeout <= 0) {
            this.idleAnimationTimeout = this.random.nextInt(40) + 80;
            this.idleAnimationState.start(this.tickCount);
        } else {
            --this.idleAnimationTimeout;
        }
    }

    protected void updateWalkAnimation(float v) {
        float f;
        if (this.getPose() == Pose.STANDING) {
            f = Math.min(v * 6.0F, 1.0F);
        } else {
            f = 0.0F;
        }

        this.walkAnimation.update(f, 0.2F);
    }

    @Override
    public void tick() {
        super.tick();

        if (this.level().isClientSide()) {
            this.setupAnimationStates();
        }
    }

    /*
    SOUNDS
     */
    @Nullable
    @Override
    protected SoundEvent getAmbientSound() {
        return SoundEvents.COD_AMBIENT;
    }

    @Nullable
    @Override
    protected SoundEvent getHurtSound(DamageSource pDamageSource) {
        return SoundEvents.COD_HURT;
    }

    @Nullable
    @Override
    protected SoundEvent getDeathSound() {
        return SoundEvents.COD_DEATH;
    }

    @Override
    protected SoundEvent getFlopSound() {
        return SoundEvents.COD_FLOP;
    }

    /*
     * Variants
     */
    @Override
    protected void defineSynchedData() {
        super.defineSynchedData();
        this.entityData.define(DATA_ID_TEXTURE_VARIANT, 0);
        this.entityData.define(DATA_ID_SIZE_VARIANT, 0);
    }

    public TunaTextureVariant getTunaTextureVariant() {
        return TunaTextureVariant.byId(this.getTextureVariant() & 255);
    }

    private int getTextureVariant() {
        return this.entityData.get(DATA_ID_TEXTURE_VARIANT);
    }

    public TunaSizeVariant getTunaSizeVariant() {
        return TunaSizeVariant.byId(this.getSizeVariant() & 255);
    }

    private int getSizeVariant() {
        return this.entityData.get(DATA_ID_SIZE_VARIANT);
    }

    public void setTunaTextureVariant(TunaTextureVariant variant) {
        this.entityData.set(DATA_ID_TEXTURE_VARIANT, variant.getId() & 255);
    }


    public void setTunaSizeVariant(TunaSizeVariant variant) {
        this.entityData.set(DATA_ID_SIZE_VARIANT, variant.getId() & 255);
    }

    private void setTextureVariant(int pTypeVariant) {
        this.entityData.set(DATA_ID_TEXTURE_VARIANT, pTypeVariant);
    }

    private void setSizeVariant(int pTypeVariant) {
        this.entityData.set(DATA_ID_SIZE_VARIANT, pTypeVariant);
    }

    @Override
    public SpawnGroupData finalizeSpawn(ServerLevelAccessor pLevel, DifficultyInstance pDifficulty, MobSpawnType pReason, @org.jetbrains.annotations.Nullable SpawnGroupData pSpawnData, @org.jetbrains.annotations.Nullable CompoundTag pDataTag) {
        TunaTextureVariant textureVariant = Util.getRandom(TunaTextureVariant.values(), this.random);
        TunaSizeVariant sizeVariant = Util.getRandom(TunaSizeVariant.values(), this.random);

        this.setTunaTextureVariant(textureVariant);
        this.setTunaSizeVariant(sizeVariant);
        return super.finalizeSpawn(pLevel, pDifficulty, pReason, pSpawnData, pDataTag);
    }

    @Override
    public void readAdditionalSaveData(CompoundTag pCompound) {
        super.readAdditionalSaveData(pCompound);
        this.entityData.set(DATA_ID_TEXTURE_VARIANT, pCompound.getInt("texture_variant"));
        this.entityData.set(DATA_ID_SIZE_VARIANT, pCompound.getInt("size_variant"));
    }

    @Override
    public void addAdditionalSaveData(CompoundTag pCompound) {
        super.addAdditionalSaveData(pCompound);
        pCompound.putInt("texture_variant", this.getTextureVariant());
        pCompound.putInt("size_variant", this.getSizeVariant());
    }

    @Override
    protected ResourceLocation getDefaultLootTable() {
        return SIZE_BY_VARIANT.get(getTunaSizeVariant());
    }

    /*
        GOALS
         */
    static class FishSwimGoal extends RandomSwimmingGoal {
        private final TunaEntity fish;

        public FishSwimGoal(TunaEntity pFish) {
            super(pFish, 1.0D, 40);
            this.fish = pFish;
        }

        /**
         * Returns whether execution should begin. You can also read and cache any state necessary for execution in this
         * method as well.
         */
        public boolean canUse() {
            return this.fish.canRandomSwim() && super.canUse();
        }
    }
}
