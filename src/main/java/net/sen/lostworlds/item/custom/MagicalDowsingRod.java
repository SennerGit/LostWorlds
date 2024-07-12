package net.sen.lostworlds.item.custom;

import net.minecraft.client.gui.screens.Screen;
import net.minecraft.client.resources.language.I18n;
import net.minecraft.core.BlockPos;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.sen.lostworlds.registry.items.ModItems;
import net.sen.lostworlds.registry.ModParticles;
import net.sen.lostworlds.sound.ModSounds;
import net.sen.lostworlds.util.InventoryUtil;
import net.sen.lostworlds.util.ModTags;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class MagicalDowsingRod extends Item {
    public MagicalDowsingRod(Properties pProperties) {
        super(pProperties);
    }
    
    @Override
    public InteractionResult useOn(UseOnContext pContext) {
        if (!pContext.getLevel().isClientSide) {
            BlockPos positionClicked = pContext.getClickedPos();
            Player player = pContext.getPlayer();
            boolean foundBlock = false;

            for (int i = 0; i <= positionClicked.getY() + 64; i++) {
                BlockState blockState = pContext.getLevel().getBlockState(positionClicked.below(i));

                if (isValuableBlock(blockState)) {
                    outputValuableCoordinates(positionClicked.below(i), player, blockState.getBlock());
                    foundBlock = true;

                    if (InventoryUtil.hasPlayerStackInInventory(player, ModItems.DATA_TABLET.get())) {
                        addDataToDataTablet(player, positionClicked.below(i), blockState.getBlock());
                    }

                    pContext.getLevel().playSeededSound(null, player.getX(), player.getY(), player.getZ(),
                            ModSounds.MAGICAL_DOWSING_ROD_FOUND_ORE.get(), SoundSource.BLOCKS, 1f, 1f, 0);

                    SpawnFoundParticles(pContext, positionClicked, blockState);

                    break;
                }
            }

            if (!foundBlock) {
                outputNoValueFound(player);
            }
        }

//        pContext.getItemInHand().hurtAndBreak(1, pContext.getPlayer(),
//                player -> player.broadcastBreakEvent(player.getUsedItemHand()));

        return InteractionResult.SUCCESS;
    }

    private void SpawnFoundParticles(UseOnContext pContext, BlockPos positionClicked, BlockState blockState) {
        for (int i = 0; i < 20; i++) {
            ServerLevel level = (ServerLevel) pContext.getLevel();

            level.sendParticles(ModParticles.MAGICAL_DOWSING_ROD_PARTICLES.get(),
                    positionClicked.getX() + 0.5d, positionClicked.getY() + 1, positionClicked.getZ() + 0.5d, 1,
                    Math.cos(i * 18) * 0.15d, 0.15d, Math.sin(i * 18) * 0.15d, 0.1);
        }
    }

    private void addDataToDataTablet(Player player, BlockPos below, Block block) {
        ItemStack dataTablet = player.getInventory().getItem(InventoryUtil.getFirstInventoryIndex(player, ModItems.DATA_TABLET.get()));

        CompoundTag data = new CompoundTag();
        data.putString("lostworlds.found_ore","Valuable Found: " + I18n.get(block.getDescriptionId())
                + " at (" + below.getX() + ", " + below.getY() + ", " + below.getZ() + ")");

//        dataTablet.setTag(data);
    }

//    @Override
//    public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltipComponents, TooltipFlag pIsAdvanced) {
//        if (Screen.hasShiftDown()) {
//            pTooltipComponents.add(Component.translatable("tooltip.lostworlds.magical_dowsing_rod.tooltip.shift"));
//        } else {
//            pTooltipComponents.add(Component.translatable("tooltip.lostworlds.magical_dowsing_rod.tooltip"));
//        }
//
//        super.appendHoverText(pStack, pLevel, pTooltipComponents, pIsAdvanced);
//    }

    private void outputNoValueFound(Player player) {
        player.sendSystemMessage(Component.translatable("item.lostworlds.magical_dowsing_rod.no_valuables"));
    }

    private void outputValuableCoordinates(BlockPos below, Player player, Block block) {
        player.sendSystemMessage(Component.literal("Valuable Found: " + I18n.get(block.getDescriptionId())
        + " at (" + below.getX() + ", " + below.getY() + ", " + below.getZ() + ")"));
    }

    private boolean isValuableBlock(BlockState blockState) {
        return blockState.is(ModTags.Blocks.MAGICAL_BLOCK);
    }
}
