package net.sen.lostworlds.item;

import net.minecraft.world.item.Item;
import net.minecraft.client.renderer.item.ItemProperties;
import net.sen.lostworlds.LostWorldsApi;

public class ModItemProperties {
    public static void addCustomItemProperties() {
        ItemProperties.register(ModItems.DATA_TABLET.get(), LostWorldsApi.modLoc("on"),
                (pStack, pLevel, pEntity, pSeed) -> pStack.hasTag() ? 1f : 0f);

        ItemProperties.register(ModItems.WAYGATE_CRYSTAL.get(), LostWorldsApi.modLoc("on"),
                (pStack, pLevel, pEntity, pSeed) -> pStack.hasTag() ? 1f : 0f);

        makeBow(ModItems.CUSTOM_BOW.get());
        makeShield(ModItems.ALEXANDRITE_SHIELD.get());
    }

    private static void makeBow(Item item) {
        ItemProperties.register(item, LostWorldsApi.mcLoc("pull"), (p_174635_, p_174636_, p_174637_, p_174638_) -> {
            if (p_174637_ == null) {
                return 0.0F;
            } else {
                return p_174637_.getUseItem() != p_174635_ ? 0.0F : (float) (p_174635_.getUseDuration() - p_174637_.getUseItemRemainingTicks()) / 20.0F;
            }
        });

        ItemProperties.register(item, LostWorldsApi.mcLoc("pulling"), (p_174630_, p_174631_, p_174632_, p_174633_) -> {
            return p_174632_ != null && p_174632_.isUsingItem() && p_174632_.getUseItem() == p_174630_ ? 1.0F : 0.0F;
        });
    }

    private static void makeShield(Item item) {
        ItemProperties.register(item, LostWorldsApi.mcLoc("blocking"), (p_174575_, p_174576_, p_174577_, p_174578_) -> {
            return p_174577_ != null && p_174577_.isUsingItem() && p_174577_.getUseItem() == p_174575_ ? 1.0F : 0.0F;
        });
    }
}
