package net.sen.lostworlds.registry.items;

import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.material.Fluids;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.sen.lostworlds.api.LostWorldsApi;
import net.sen.lostworlds.entity.AtlantisEntities;
import net.sen.lostworlds.item.custom.MagicalItem;
import net.sen.lostworlds.item.custom.ModFishBucket;
import net.sen.lostworlds.magic.MagicProperties;

public class AtlantisItems {
    public static final DeferredRegister.Items ATLANTIS_ITEMS = DeferredRegister.createItems(LostWorldsApi.MODID);

    //Entity Bucket
    public static final DeferredItem<Item> CLOWNFISH_BUCKET = ATLANTIS_ITEMS.register("clownfish_bucket", () -> new ModFishBucket(AtlantisEntities.CLOWNFISH.get(), Fluids.WATER, new Item.Properties()));
    public static final DeferredItem<Item> TANG_FISH_BUCKET = ATLANTIS_ITEMS.register("tang_fish_bucket", () -> new ModFishBucket(AtlantisEntities.TANG_FISH.get(), Fluids.WATER, new Item.Properties()));

    //Misc
    public static final DeferredItem<Item> SHARK_TOOTH = ATLANTIS_ITEMS.register("shark_tooth", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> CLOWNFISH = ATLANTIS_ITEMS.register("clownfish", () -> new Item(new Item.Properties())); //.food(ModFoodProperties.CLOWNFISH)
    public static final DeferredItem<Item> COOKED_CLOWNFISH = ATLANTIS_ITEMS.register("cooked_clownfish", () -> new Item(new Item.Properties())); //.food(ModFoodProperties.COOKED_CLOWNFISH)
    public static final DeferredItem<Item> RAW_TUNA = ATLANTIS_ITEMS.register("raw_tuna", () -> new Item(new Item.Properties())); //.food(ModFoodProperties.COOKED_CLOWNFISH)
    public static final DeferredItem<Item> COOKED_TUNA = ATLANTIS_ITEMS.register("cooked_tuna", () -> new Item(new Item.Properties())); //.food(ModFoodProperties.COOKED_CLOWNFISH)
    public static final DeferredItem<Item> TANG_FISH = ATLANTIS_ITEMS.register("tang_fish", () -> new Item(new Item.Properties())); //.food(ModFoodProperties.COOKED_CLOWNFISH)
    public static final DeferredItem<Item> COOKED_TANG_FISH = ATLANTIS_ITEMS.register("cooked_tang_fish", () -> new Item(new Item.Properties())); //.food(ModFoodProperties.COOKED_CLOWNFISH)

    public static DeferredItem<Item> registerItem(String name) {
        return ATLANTIS_ITEMS.register(name, () -> new Item(new Item.Properties()));
    }

    public static DeferredItem<Item> registerItem(String name, Item.Properties properties) {
        return ATLANTIS_ITEMS.register(name, () -> new Item(properties));
    }

    public static DeferredItem<Item> registerFoodItem(String name, FoodProperties foodProperties) {
        return ATLANTIS_ITEMS.register(name, () -> new Item(new Item.Properties().food(foodProperties)));
    }
    public static DeferredItem<Item> registerFoodItem(String name, Item.Properties properties, FoodProperties foodProperties) {
        return ATLANTIS_ITEMS.register(name, () -> new Item(properties.food(foodProperties)));
    }

    public static DeferredItem<Item> registerMagicalItem(String name, MagicProperties magicProperties) {
        return ATLANTIS_ITEMS.register(name, () -> new MagicalItem(new Item.Properties(), magicProperties));
    }

    public static void register(IEventBus eventBus) {
        ATLANTIS_ITEMS.register(eventBus);
    }
}
