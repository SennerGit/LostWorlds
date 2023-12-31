package net.sen.lostworlds.datagen.modonomicon;

import com.klikli_dev.modonomicon.Modonomicon;
import com.klikli_dev.modonomicon.api.ModonomiconConstants;
import com.klikli_dev.modonomicon.book.Book;
import com.klikli_dev.modonomicon.client.gui.BookGuiManager;
import com.klikli_dev.modonomicon.data.BookDataManager;
import com.klikli_dev.modonomicon.item.ModonomiconItem;
import net.minecraft.ChatFormatting;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.nbt.NbtUtils;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import net.minecraftforge.common.capabilities.ICapabilityProvider;
import net.sen.lostworlds.LostWorlds;
import net.sen.lostworlds.LostWorldsConstants;
import net.sen.lostworlds.item.ModItems;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class LostWorldsBookItem extends ModonomiconItem {
    public static final ResourceLocation LOST_WORLDS_BOOK = LostWorldsConstants.modLoc("lost_worlds_book");
    public LostWorldsBookItem(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level pLevel, Player pPlayer, InteractionHand pUsedHand) {
        ItemStack itemInHand = pPlayer.getItemInHand(pUsedHand);

        if (pLevel.isClientSide) {
            if (itemInHand.hasTag()) {
                Book book = BookDataManager.get().getBook(LOST_WORLDS_BOOK);
                BookGuiManager.get().openBook(book.getId());
            } else {
                Modonomicon.LOG.error("ModonomiconItem: ItemStack has no tag!");
            }
        }

        return InteractionResultHolder.sidedSuccess(itemInHand, pLevel.isClientSide);
    }

    @Override
    public Component getName(ItemStack pStack) {
        Book book = BookDataManager.get().getBook(LOST_WORLDS_BOOK);
        if (book != null) {
            return Component.translatable(book.getName());
        }

        return super.getName(pStack);
    }

    @Override
    public void appendHoverText(ItemStack stack, Level worldIn, List<Component> tooltip, TooltipFlag flagIn) {
        //super.appendHoverText(stack, worldIn, tooltip, flagIn);

        Book book = BookDataManager.get().getBook(LOST_WORLDS_BOOK);
        if (book != null) {
            if (flagIn.isAdvanced()) {
                tooltip.add(Component.literal("Book ID: ").withStyle(ChatFormatting.DARK_GRAY)
                        .append(Component.literal(book.getId().toString()).withStyle(ChatFormatting.RED)));
            }

            if (!book.getTooltip().isBlank()) {
                tooltip.add(Component.translatable(book.getTooltip()).withStyle(ChatFormatting.GRAY));
            }
        } else {
            tooltip.add(Component.translatable(ModonomiconConstants.I18n.Tooltips.ITEM_NO_BOOK_FOUND_FOR_STACK,
                            !stack.hasTag() ? Component.literal("{}") : NbtUtils.toPrettyComponent(stack.getTag()))
                    .withStyle(ChatFormatting.DARK_GRAY));
        }
    }

    @Override
    public ItemStack getCraftingRemainingItem(ItemStack itemStack) {
        return itemStack.copy();
    }

    @Override
    public @Nullable ICapabilityProvider initCapabilities(ItemStack stack, @Nullable CompoundTag nbt) {
        stack.getOrCreateTag().putString(ModonomiconConstants.Nbt.ITEM_BOOK_ID_TAG, LOST_WORLDS_BOOK.toString());
        return super.initCapabilities(stack, nbt);
    }
}
