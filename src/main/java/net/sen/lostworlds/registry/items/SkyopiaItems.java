package net.sen.lostworlds.registry.items;

import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.sen.lostworlds.api.LostWorldsApi;
import net.sen.lostworlds.item.custom.MagicalItem;
import net.sen.lostworlds.magic.MagicProperties;

public class SkyopiaItems {
    public static final DeferredRegister.Items SKYOPIA_ITEMS = DeferredRegister.createItems(LostWorldsApi.MODID);

    /*
     * WOOD TYPES
     */

    public static DeferredItem<Item> registerItem(String name) {
        return SKYOPIA_ITEMS.register(name, () -> new Item(new Item.Properties()));
    }
    public static DeferredItem<Item> registerItem(String name, Item.Properties properties) {
        return SKYOPIA_ITEMS.register(name, () -> new Item(properties));
    }

    public static DeferredItem<Item> registerFoodItem(String name, FoodProperties foodProperties) {
        return SKYOPIA_ITEMS.register(name, () -> new Item(new Item.Properties().food(foodProperties)));
    }
    public static DeferredItem<Item> registerFoodItem(String name, Item.Properties properties, FoodProperties foodProperties) {
        return SKYOPIA_ITEMS.register(name, () -> new Item(properties.food(foodProperties)));
    }

    public static DeferredItem<Item> registerMagicalItem(String name, MagicProperties magicProperties) {
        return SKYOPIA_ITEMS.register(name, () -> new MagicalItem(new Item.Properties(), magicProperties));
    }

    public static void register(IEventBus eventBus) {
        SKYOPIA_ITEMS.register(eventBus);
    }
}
