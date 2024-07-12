package net.sen.lostworlds.entity.mob;

import net.minecraft.Util;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.world.entity.animal.Animal;
import net.minecraft.world.item.Item;
import net.sen.lostworlds.entity.custom.AbstractSchoolingFishVarients;
import net.sen.lostworlds.entity.variant.ClownfishVariant;
import net.sen.lostworlds.registry.items.AtlantisItems;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.*;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.ServerLevelAccessor;

import javax.annotation.Nullable;

public class ClownfishEntity extends AbstractSchoolingFishVarients {
//    private static final EntityDataAccessor<Boolean> FROM_BUCKET = SynchedEntityData.defineId(ClownfishEntity.class, EntityDataSerializers.BOOLEAN);
//    private static final EntityDataAccessor<Integer> DATA_ID_TYPE_VARIANT =
//            SynchedEntityData.defineId(ClownfishEntity.class, EntityDataSerializers.INT);

    public final AnimationState idleAnimationState = new AnimationState();
    private int idleAnimationTimeout = 0;

    public ClownfishEntity(EntityType<? extends ClownfishEntity> pEntityType, Level pLevel) {
        super(pEntityType, pLevel);
    }

//    @Override
//    protected void registerGoals() {
//        super.registerGoals();
//        this.goalSelector.addGoal(0, new PanicGoal(this, 1.25D));
//        this.goalSelector.addGoal(2, new AvoidEntityGoal<>(this, Player.class, 8.0F, 1.6D, 1.4D, EntitySelector.NO_SPECTATORS::test));
//        this.goalSelector.addGoal(4, new FishSwimGoal(this));
//    }
//    public void travel(Vec3 travelVector) {
//        if (this.isEffectiveAi() && this.isInWater()) {
//            this.moveRelative(this.getSpeed(), travelVector);
//            this.move(MoverType.SELF, this.getDeltaMovement());
//            this.setDeltaMovement(this.getDeltaMovement().scale(0.9D));
//            if (this.getTarget() == null) {
//                this.setDeltaMovement(this.getDeltaMovement().add(0.0D, -0.005D, 0.0D));
//            }
//        } else {
//            super.travel(travelVector);
//        }
//
//    }
//
//    public void aiStep() {
//        if (!this.isInWater() && this.onGround() && this.verticalCollision) {
//            this.setDeltaMovement(this.getDeltaMovement().add((double)((this.random.nextFloat() * 2.0F - 1.0F) * 0.05F), (double)0.4F, (double)((this.random.nextFloat() * 2.0F - 1.0F) * 0.05F)));
//            this.setOnGround(false);
//            this.hasImpulse = true;
//            this.playSound(this.getFlopSound(), this.getSoundVolume(), this.getVoicePitch());
//        }
//
//        super.aiStep();
//    }
//
//    protected boolean canRandomSwim() {
//        return true;
//    }

    @Override
    protected SoundEvent getFlopSound() {
        return SoundEvents.COD_FLOP;
    }

    public static AttributeSupplier.Builder createAttributes() {
        return Animal.createLivingAttributes()
                .add(Attributes.MAX_HEALTH, 10)
                .add(Attributes.MOVEMENT_SPEED, 0.15D)
                .add(Attributes.FOLLOW_RANGE, 24D)
                .add(Attributes.ARMOR_TOUGHNESS, 0.1f)
                .add(Attributes.ATTACK_DAMAGE, 2f)
                .add(Attributes.ATTACK_KNOCKBACK, 0.5f);
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

    @Override
    protected void defineSynchedData(SynchedEntityData.Builder pBuilder) {
        super.defineSynchedData(pBuilder);
//        pBuilder.define(DATA_ID_TYPE_VARIANT, 0);
//        pBuilder.define(FROM_BUCKET, false);
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

    /*
     * Variants
     */
    @Override
    public Enum<ClownfishVariant> getVariant() {
        return ClownfishVariant.byId(this.getTypeVariant() & 255);
    }

    @Override
    public void setVariant(Enum<?> variant) {
        if (variant instanceof ClownfishVariant clownfishVariant) {
            this.entityData.set(DATA_ID_TYPE_VARIANT, clownfishVariant.getId() & 255);
        }
    }

@Nullable
    @Override
    public SpawnGroupData finalizeSpawn(ServerLevelAccessor pLevel, DifficultyInstance pDifficulty, MobSpawnType pReason, @Nullable SpawnGroupData pSpawnData) {
        Enum<?> variant = Util.getRandom(ClownfishVariant.values(), this.random);
        this.setVariant(variant);
        return super.finalizeSpawn(pLevel, pDifficulty, pReason, pSpawnData);
    }

    @Override
    public SoundEvent getPickupSound() {
        return SoundEvents.BUCKET_FILL_FISH;
    }
//    public ClownfishVariant getVariant() {
//        return ClownfishVariant.byId(this.getTypeVariant() & 255);
//    }
//
//    private int getTypeVariant() {
//        return this.entityData.get(DATA_ID_TYPE_VARIANT);
//    }
//
//    public void setVariant(ClownfishVariant variant) {
//        this.entityData.set(DATA_ID_TYPE_VARIANT, variant.getId() & 255);
//    }
//
//    private void setTypeVariant(int pTypeVariant) {
//        this.entityData.set(DATA_ID_TYPE_VARIANT, pTypeVariant);
//    }
//
//    @Override
//    public SpawnGroupData finalizeSpawn(ServerLevelAccessor pLevel, DifficultyInstance pDifficulty, MobSpawnType pReason, @Nullable SpawnGroupData pSpawnData) {
//        ClownfishVariant variant = Util.getRandom(ClownfishVariant.values(), this.random);
//        this.setVariant(variant);
//        return super.finalizeSpawn(pLevel, pDifficulty, pReason, pSpawnData);
//    }
//
//    @Override
//    public void readAdditionalSaveData(CompoundTag pCompound) {
//        super.readAdditionalSaveData(pCompound);
//        this.entityData.set(DATA_ID_TYPE_VARIANT, pCompound.getInt("Variant"));
//    }
//
//    @Override
//    public void addAdditionalSaveData(CompoundTag pCompound) {
//        super.addAdditionalSaveData(pCompound);
//        pCompound.putInt("Variant", this.getTypeVariant());
//    }

    /*
    BUCKET DATA
     */
//    @Override
//    public boolean fromBucket() {
//        return this.entityData.get(FROM_BUCKET);
//    }
//
//    @Override
//    public void setFromBucket(boolean pFromBucket) {
//        this.entityData.set(FROM_BUCKET, pFromBucket);
//    }
//
    @Override
    public ItemStack getBucketItemStack() {
        Item item = AtlantisItems.CLOWNFISH_BUCKET.get();
        return new ItemStack(item);
    }
//
//    @Override
//    public void saveToBucketTag(@Nullable ItemStack bucket) {
//        if (this.hasCustomName()) {
//            bucket.setHoverName(this.getCustomName());
//        }
//
//        Bucketable.saveDefaultDataToBucketTag(this, bucket);
//        CompoundTag compoundnbt = bucket.getOrCreateTag();
//        compoundnbt.putInt("BucketVariantTag", this.getTypeVariant());
//    }
//
//    @Override
//    public void loadFromBucketTag(@Nullable CompoundTag compound) {
//        Bucketable.loadDefaultDataFromBucketTag(this, compound);
//
//        if (compound.contains("BucketVariantTag", 3)) {
//            this.setTypeVariant(compound.getInt("BucketVariantTag"));
//        }
//    }
//
//    public boolean requiresCustomPersistence() {
//        return super.requiresCustomPersistence() || this.fromBucket();
//    }
//
//    public boolean removeWhenFarAway(double p_27492_) {
//        return !this.fromBucket() && !this.hasCustomName();
//    }
//
//    @Override
//    @Nonnull
//    protected InteractionResult mobInteract(@Nonnull Player player, @Nonnull InteractionHand hand) {
//        return Bucketable.bucketMobPickup(player, hand, this).orElse(super.mobInteract(player, hand));
//    }
//
//    public float getWalkTargetValue(BlockPos pos, LevelReader worldIn) {
//        return worldIn.getFluidState(pos.below()).isEmpty() && worldIn.getFluidState(pos).is(FluidTags.WATER) ? 10.0F : super.getWalkTargetValue(pos, worldIn);
//    }
//
//    @Override
//    public SoundEvent getPickupSound() {
//        return SoundEvents.BUCKET_FILL_FISH;
//    }

    /*
    GOALS
     */
//    static class FishSwimGoal extends RandomSwimmingGoal {
//        private final ClownfishEntity fish;
//
//        public FishSwimGoal(ClownfishEntity pFish) {
//            super(pFish, 1.0D, 40);
//            this.fish = pFish;
//        }
//
//        /**
//         * Returns whether execution should begin. You can also read and cache any state necessary for execution in this
//         * method as well.
//         */
//        public boolean canUse() {
//            return this.fish.canRandomSwim() && super.canUse();
//        }
//    }
}
