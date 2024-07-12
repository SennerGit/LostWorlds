package net.sen.lostworlds.registry.items;

import net.minecraft.world.item.Item;
import net.minecraft.client.renderer.item.ItemProperties;
import net.sen.lostworlds.api.LostWorldsApi;

public class ModItemProperties {
    public static void addCustomItemProperties() {
        ItemProperties.register(ModItems.DATA_TABLET.get(), LostWorldsApi.modLoc("on"),
                (stack, level, entity, seed) -> stack.isEmpty() ? 1f : 0f);

        ItemProperties.register(ModItems.WAYGATE_CRYSTAL.get(), LostWorldsApi.modLoc("on"),
                (stack, level, entity, seed) -> stack.isEmpty() ? 1f : 0f);

        makeBow(ModItems.CUSTOM_BOW.get());
        makeShield(ModItems.ALEXANDRITE_SHIELD.get());
    }

    private static void makeBow(Item item) {
        ItemProperties.register(item, LostWorldsApi.mcLoc("pull"), (stack, level, entity, seed) -> {
            if (entity == null) {
                return 0.0F;
            } else {
                return entity.getUseItem() != stack ? 0.0F : (float) (stack.getUseDuration(entity) - entity.getUseItemRemainingTicks()) / 20.0F;
            }
        });

        ItemProperties.register(item, LostWorldsApi.mcLoc("pulling"), (stack, level, entity, seed) -> {
            return entity != null && entity.isUsingItem() && entity.getUseItem() == stack ? 1.0F : 0.0F;
        });
    }

    private static void makeShield(Item item) {
        ItemProperties.register(item, LostWorldsApi.mcLoc("blocking"), (stack, level, entity, seed) -> {
            return entity != null && entity.isUsingItem() && entity.getUseItem() == stack ? 1.0F : 0.0F;
        });
    }
}
