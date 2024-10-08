//package net.sen.lostworlds.enchantment;
//
//import net.minecraft.core.BlockPos;
//import net.minecraft.core.HolderSet;
//import net.minecraft.core.component.DataComponentMap;
//import net.minecraft.network.chat.Component;
//import net.minecraft.server.level.ServerLevel;
//import net.minecraft.world.entity.*;
//import net.minecraft.world.entity.player.Player;
//import net.minecraft.world.item.ItemStack;
//import net.minecraft.world.item.Rarity;
//import net.minecraft.world.item.enchantment.Enchantment;
//import net.minecraft.world.level.ClipContext;
//
//public class LightningStrikeEnchantment extends Enchantment {
//    protected LightningStrikeEnchantment(Component description, Enchantment.EnchantmentDefinition definition, HolderSet<Enchantment> exclusiveSet, DataComponentMap effects) {
//        super(description, definition, exclusiveSet, effects);
//    }
//
//    @Override
//    public void doPostAttack(LivingEntity pAttacker, Entity pTarget, int pLevel) {
//        if (!pAttacker.level().isClientSide()) {
//            ServerLevel level = ((ServerLevel) pAttacker.level());
//            BlockPos position = pTarget.blockPosition();
//
//            if (pLevel == 1) {
//                EntityType.LIGHTNING_BOLT.spawn(level, null, (Player) null, position, MobSpawnType.TRIGGERED, true, true);
//            }
//
//            if (pLevel == 2) {
//                EntityType.LIGHTNING_BOLT.spawn(level, null, (Player) null, position, MobSpawnType.TRIGGERED, true, true);
//                EntityType.LIGHTNING_BOLT.spawn(level, null, (Player) null, position, MobSpawnType.TRIGGERED, true, true);
//            }
//        }
//
//        super.doPostAttack(pAttacker, pTarget, pLevel);
//    }
//
//    @Override
//    public int getMaxLevel() {
//        return 2;
//    }
//}
