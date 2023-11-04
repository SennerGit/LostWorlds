package net.sen.lostworlds.entity.ai;

import net.minecraft.world.InteractionHand;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.PathfinderMob;
import net.minecraft.world.entity.ai.goal.MeleeAttackGoal;
import net.sen.lostworlds.entity.custom.RhinoEntity;
import net.sen.lostworlds.util.tools.MinecraftMaths;

public class RhinoAttackGoal extends MeleeAttackGoal {
    private final RhinoEntity entity;
    private int attackDelay = MinecraftMaths.secondsInTicks(2);
    private int ticksUntilNextAttack = MinecraftMaths.secondsInTicks(2);
    private boolean shouldCountTillNextAttack = false;

    public RhinoAttackGoal(PathfinderMob rhinoEntity, double speedModifier, boolean followingTargetEventIfNotSeen) {
        super(rhinoEntity, speedModifier, followingTargetEventIfNotSeen);

        this.entity = ((RhinoEntity) rhinoEntity);
    }

    @Override
    protected void checkAndPerformAttack(LivingEntity pEnemy, double pDistToEnemySqr) {
        if (isEnemyWithInAttackDistance(pEnemy, pDistToEnemySqr)) {
            shouldCountTillNextAttack = true;
            
            if (isTimeToStartAttaclAnimation()) {
                entity.setAttacking(true);
            }

            if (isTimeToAttack()) {
                this.mob.getLookControl().setLookAt(pEnemy.getX(), pEnemy.getY(), pEnemy.getZ());
                performAttack(pEnemy);
            }
        } else {
            resetAttackCooldown();
            shouldCountTillNextAttack = false;
            entity.setAttacking(false);
            entity.attackAnimationTimeout = 0;
        }
    }

    private boolean isTimeToStartAttaclAnimation() {
        return this.ticksUntilNextAttack <= attackDelay;
    }

    private boolean isEnemyWithInAttackDistance(LivingEntity pEnemy, double pDistToEnemySqr) {
        return pDistToEnemySqr <= this.getAttackReachSqr(pEnemy);
    }

    protected void resetAttackCooldown() {
        this.ticksUntilNextAttack = this.adjustedTickDelay(attackDelay * 2);
    }

    @Override
    protected boolean isTimeToAttack() {
        return this.ticksUntilNextAttack <= 0;
    }

    @Override
    public int getTicksUntilNextAttack() {
        return ticksUntilNextAttack;
    }

    protected void performAttack(LivingEntity pEnemy) {
        this.resetAttackCooldown();
        this.mob.swing(InteractionHand.MAIN_HAND);
        this.mob.doHurtTarget(pEnemy);
    }

    @Override
    public void start() {
        super.start();
        this.attackDelay = MinecraftMaths.secondsInTicks(2);
        this.ticksUntilNextAttack = MinecraftMaths.secondsInTicks(2);
    }

    @Override
    public void tick() {
        super.tick();

        if (shouldCountTillNextAttack) {
            this.ticksUntilNextAttack = Math.max(this.ticksUntilNextAttack - 1, 0);
        }
    }

    @Override
    public void stop() {
        this.entity.setAttacking(false);

        super.stop();
    }
}
