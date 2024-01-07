package net.sen.lostworlds.util.helpers;

import com.mojang.datafixers.util.Pair;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.food.FoodData;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.GameRules;
import net.minecraft.world.level.Level;
import net.sen.lostworlds.item.custom.MagicalItem;
import net.sen.lostworlds.magic.MagicProperties;

public class MagicTypeHelper {
    public static boolean isMagical(ItemStack itemStack, Player player) {
        if (itemStack.getItem() instanceof MagicalItem magicalItem)
        {
            return magicalItem.getMagicProperties() != null;
        }
        else return false;
//        return itemStack.getItem().getMagicProperties(itemStack, player) != null;
    }

    public static MagicProperties getMagicProperties(ItemStack itemStack, Player player) {
        MagicalItem magicalItem;
        if (itemStack.getItem() instanceof MagicalItem magicalItemFromItem)
            return magicalItemFromItem.getMagicProperties();
        return null;
    }

//    public static MagicProperties getMagicValue(ItemStack itemStack, Player player) {
//        MagicalItem magicalItem = itemStack.getItem();
//    }
}
