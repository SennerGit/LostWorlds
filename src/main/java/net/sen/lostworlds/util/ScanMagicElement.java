//package net.sen.lostworlds.util;
//
//import net.minecraft.core.BlockPos;
//import net.minecraft.world.entity.Entity;
//import net.minecraft.world.entity.player.Player;
//import net.minecraft.world.item.ItemStack;
//import net.minecraft.world.level.ItemLike;
//import net.minecraft.world.level.block.Block;
//import net.sen.lostworlds.magic.MagicElement;
//
//public class ScanMagicElement implements IScanThing{
//    MagicElement magicElement;
//
//    public ScanMagicElement(MagicElement magicElement) {
//        this.magicElement = magicElement;
//    }
//
//    @Override
//    public boolean checkThing(Player player, Object obj) {
//        if (obj == null) return false;
//
//        MagicElementList al = null;
//
//        if (obj instanceof Entity && !(obj instanceof ItemLike)) {
//            al = MagicElementHelper.getEntityMagicElements((Entity) obj);
//        } else {
//            ItemStack is = null;
//            if (obj instanceof ItemStack)
//                is = (ItemStack) obj;
//            if (obj instanceof ItemLike && ((ItemLike)obj).asItem() != null)
//                is = ((ItemLike)obj).getItem();
//            if (obj instanceof BlockPos) {
//                Block b = player.world.getBlockState((BlockPos) obj).getBlock();
//                is = new ItemStack(b,1,b.getMetaFromState(player.world.getBlockState((BlockPos) obj)));
//            }
//
//            if (is!=null) {
//                al = MagicElementHelper.getObjectMagicElements(is);
//            }
//        }
//
//        return al!=null && al.getAmount(MagicElement)>0;
//    }
//}
