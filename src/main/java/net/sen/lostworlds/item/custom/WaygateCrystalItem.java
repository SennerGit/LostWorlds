package net.sen.lostworlds.item.custom;

import net.minecraft.client.resources.language.I18n;
import net.minecraft.core.BlockPos;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.chat.Component;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.sen.lostworlds.registry.blocks.ModBlocks;
import net.sen.lostworlds.util.InventoryUtil;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class WaygateCrystalItem extends Item {
    public WaygateCrystalItem(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level pLevel, Player pPlayer, InteractionHand pUsedHand) {
//        if(pPlayer.getItemInHand(pUsedHand).hasTag()) {
//            pPlayer.getItemInHand(pUsedHand).setTag(new CompoundTag());
//        }

        return super.use(pLevel, pPlayer, pUsedHand);
    }

    @Override
    public InteractionResult useOn(UseOnContext pContext) {
        if (!pContext.getLevel().isClientSide) {
            BlockPos positionClicked = pContext.getClickedPos();
            Player player = pContext.getPlayer();
            ItemStack waygateCrystal = player.getInventory().getItem(InventoryUtil.getFirstInventoryIndex(player, this));

            boolean foundGate = false;

            BlockState blockState = pContext.getLevel().getBlockState(positionClicked);
            if (player.isCrouching()) {
                if (isValuableBlock(blockState)) {
                    outputValuableCoordinates(positionClicked, player, blockState.getBlock());
                    foundGate = true;

                    addData(player, positionClicked, blockState.getBlock());
                } else {
                    outputNoValueFound(player);

//                    if(waygateCrystal.hasTag())
//                        waygateCrystal.setTag(new CompoundTag());
                }
            }
        }

        return InteractionResult.SUCCESS;
    }

//    @Override
//    public boolean isFoil(ItemStack pStack) {
//        return pStack.hasTag();
//    }

//    @Override
//    public void appendHoverText(ItemStack pStack, @Nullable Level pLevel,
//                                List<Component> pTooltipComponents, TooltipFlag pIsAdvanced) {
//        if(pStack.hasTag()) {
//            String waygateLocation = pStack.getTag().getString("lostworlds.waygate.location");
//            pTooltipComponents.add(Component.literal(waygateLocation));
//        }
//
//        super.appendHoverText(pStack, pLevel, pTooltipComponents, pIsAdvanced);
//    }

    private void addData(Player player, BlockPos below, Block block) {
        ItemStack waygateCrystal = player.getInventory().getItem(InventoryUtil.getFirstInventoryIndex(player, this));

        CompoundTag data = new CompoundTag();
        data.putString("lostworlds.waygate.location","Valuable Found: " + I18n.get(block.getDescriptionId())
                + " at (" + below.getX() + ", " + below.getY() + ", " + below.getZ() + ")");

//        waygateCrystal.setTag(data);
    }

    private void outputNoValueFound(Player player) {
        player.sendSystemMessage(Component.translatable("item.lostworlds.magical_dowsing_rod.no_valuables"));
    }

    private void outputValuableCoordinates(BlockPos below, Player player, Block block) {
        player.sendSystemMessage(Component.literal("Valuable Found: " + I18n.get(block.getDescriptionId())
                + " at (" + below.getX() + ", " + below.getY() + ", " + below.getZ() + ")"));
    }

    private boolean isValuableBlock(BlockState blockState) {
        return blockState.is(ModBlocks.MYSTIC_GATEWAYS_PORTAL_CONTROLLER.get());
    }
}
