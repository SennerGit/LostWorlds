package net.sen.lostworlds.event;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.PathfinderMob;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.GameRules;
import net.minecraft.world.level.Level;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.neoforge.event.entity.living.LivingDropsEvent;

import java.util.Collection;

public class MobDropHandler {
    @SubscribeEvent
    public void onLivingDrops(LivingDropsEvent event) {
        LivingEntity entity = event.getEntity();
        Level level = entity.getCommandSenderWorld();

        if (!level.getGameRules().getBoolean(GameRules.RULE_DOMOBLOOT))
            return;

        Collection<ItemEntity> drops = event.getDrops();
        Entity attacker = event.getSource().getEntity();
        double itemDropChance = 0.6;

        if (entity instanceof PathfinderMob && Math.random() < itemDropChance) {
            drops.add(new ItemEntity(level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Items.SUGAR)));
        }

        if (attacker instanceof Player player) {

        }
    }
}
