package net.sen.lostworlds.fluid;

import net.minecraft.core.cauldron.CauldronInteraction;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.sen.lostworlds.registry.blocks.UnderworldBlocks;
import net.sen.lostworlds.registry.items.ModItems;

public interface ModCauldronInteractions extends CauldronInteraction {
    CauldronInteraction FILL_STYX = ((pState, pLevel, pPos, pPlayer, pHand, pStack) ->
            CauldronInteraction.emptyBucket(pLevel, pPos, pPlayer, pHand, pStack, UnderworldBlocks.STYX_CAULDRON.get().defaultBlockState(), SoundEvents.BUCKET_EMPTY));

    CauldronInteraction EMPTY_STYX = ((pState, pLevel, pPos, pPlayer, pHand, pStack) ->
            CauldronInteraction.fillBucket(pState, pLevel, pPos, pPlayer, pHand, pStack, new ItemStack(ModItems.STYX_WATER_BUCKET.get()), blockState -> true, SoundEvents.BUCKET_EMPTY));

    CauldronInteraction.InteractionMap STYX = CauldronInteraction.newInteractionMap("styx");

    static void register() {
        EMPTY.map().put(ModItems.STYX_WATER_BUCKET.get(), FILL_STYX);
        WATER.map().put(ModItems.STYX_WATER_BUCKET.get(), FILL_STYX);
        LAVA.map().put(ModItems.STYX_WATER_BUCKET.get(), FILL_STYX);
        POWDER_SNOW.map().put(ModItems.STYX_WATER_BUCKET.get(), FILL_STYX);
        STYX.map().put(ModItems.STYX_WATER_BUCKET.get(), FILL_STYX);

        STYX.map().put(Items.BUCKET, EMPTY_STYX);

        CauldronInteraction.addDefaultInteractions(STYX.map());
    }
}
