package net.sen.lostworlds.magic;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.common.extensions.IForgeItem;
import org.jetbrains.annotations.Nullable;

public interface MagicItem extends IForgeItem {
    private Item self()
    {
        return (Item) this;
    }

//    default MagicProperties getMagicProperties(ItemStack stack, @Nullable LivingEntity entity)
//    {
//        return self().getFoodProperties();
//    }
}
