package net.sen.lostworlds.item.custom;

import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.chat.Component;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import net.sen.lostworlds.LostWorlds;
import org.checkerframework.checker.units.qual.C;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class DataTabletItem extends Item {
    public DataTabletItem(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level pLevel, Player pPlayer, InteractionHand pUsedHand) {
//        if(pPlayer.getItemInHand(pUsedHand).hasFoil()) {
//            pPlayer.getItemInHand(pUsedHand).setTag(new CompoundTag());
//        }

        return super.use(pLevel, pPlayer, pUsedHand);
    }

//    @Override
//    public boolean isFoil(ItemStack pStack) {
//        return pStack.hasTag();
//    }

//    @Override
//    public void appendHoverText(ItemStack pStack, TooltipContext pContext, List<Component> pTooltipComponents, TooltipFlag pTooltipFlag) {
//        if(pStack.hasTag()) {
//            String currentFoundOre = pStack.getTag().getString("lostworlds.found_ore");
//            pTooltipComponents.add(Component.literal(currentFoundOre));
//        }
//
//        super.appendHoverText(pStack, pContext, pTooltipComponents, pTooltipFlag);
//    }
}
