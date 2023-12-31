package net.sen.lostworlds.item.custom;

import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.stats.Stats;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.sen.lostworlds.entity.projectile.DiceProjectileEntity;


public class DiceItem extends Item {
    public DiceItem(Item.Properties properties) {
        super(properties);
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level pLevel, Player pPlayer, InteractionHand pUsedHand) {
        ItemStack itemstack = pPlayer.getItemInHand(pUsedHand);
        pLevel.playSound((Player)null, pPlayer.getX(), pPlayer.getY(), pPlayer.getZ(),
                SoundEvents.SNOWBALL_THROW, SoundSource.NEUTRAL, 0.5F,
                0.4F / (pLevel.getRandom().nextFloat() * 0.4F + 0.8F));
        if (!pLevel.isClientSide) {
            DiceProjectileEntity diceProjectile = new DiceProjectileEntity(pLevel, pPlayer);
            diceProjectile.setItem(itemstack);
            diceProjectile.shootFromRotation(pPlayer, pPlayer.getXRot(), pPlayer.getYRot(),
                    0.0F, 1.5F, 0F);
            pLevel.addFreshEntity(diceProjectile);
        }

        pPlayer.awardStat(Stats.ITEM_USED.get(this));
        if (!pPlayer.getAbilities().instabuild) {
            itemstack.shrink(1);
        }

        return super.use(pLevel, pPlayer, pUsedHand);
    }
}
