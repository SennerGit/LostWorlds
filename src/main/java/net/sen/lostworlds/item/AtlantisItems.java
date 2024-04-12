package net.sen.lostworlds.item;

import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.HorseArmorItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.material.Fluids;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.sen.lostworlds.LostWorldsApi;
import net.sen.lostworlds.entity.AtlantisEntities;
import net.sen.lostworlds.item.custom.MagicalItem;
import net.sen.lostworlds.item.custom.ModFishBucket;
import net.sen.lostworlds.magic.MagicProperties;

public class AtlantisItems {
    public static final DeferredRegister<Item> ATLANTIS_ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, LostWorldsApi.MODID);

    //Entity Bucket
    public static final RegistryObject<Item> CLOWNFISH_BUCKET = ATLANTIS_ITEMS.register("clownfish_bucket", () -> new ModFishBucket(AtlantisEntities.CLOWNFISH, Fluids.WATER, new Item.Properties()));
    public static final RegistryObject<Item> TANG_FISH_BUCKET = ATLANTIS_ITEMS.register("tang_fish_bucket", () -> new ModFishBucket(AtlantisEntities.TANG_FISH, Fluids.WATER, new Item.Properties()));

    //Misc
    public static final RegistryObject<Item> SHARK_TOOTH = ATLANTIS_ITEMS.register("shark_tooth", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CLOWNFISH = ATLANTIS_ITEMS.register("clownfish", () -> new Item(new Item.Properties())); //.food(ModFoodProperties.CLOWNFISH)
    public static final RegistryObject<Item> COOKED_CLOWNFISH = ATLANTIS_ITEMS.register("cooked_clownfish", () -> new Item(new Item.Properties())); //.food(ModFoodProperties.COOKED_CLOWNFISH)
    public static final RegistryObject<Item> RAW_TUNA = ATLANTIS_ITEMS.register("raw_tuna", () -> new Item(new Item.Properties())); //.food(ModFoodProperties.COOKED_CLOWNFISH)
    public static final RegistryObject<Item> COOKED_TUNA = ATLANTIS_ITEMS.register("cooked_tuna", () -> new Item(new Item.Properties())); //.food(ModFoodProperties.COOKED_CLOWNFISH)
    public static final RegistryObject<Item> TANG_FISH = ATLANTIS_ITEMS.register("tang_fish", () -> new Item(new Item.Properties())); //.food(ModFoodProperties.COOKED_CLOWNFISH)
    public static final RegistryObject<Item> COOKED_TANG_FISH = ATLANTIS_ITEMS.register("cooked_tang_fish", () -> new Item(new Item.Properties())); //.food(ModFoodProperties.COOKED_CLOWNFISH)

    public static RegistryObject<Item> registerItem(String name) {
        return ATLANTIS_ITEMS.register(name, () -> new Item(new Item.Properties()));
    }

    public static RegistryObject<Item> registerItem(String name, Item.Properties properties) {
        return ATLANTIS_ITEMS.register(name, () -> new Item(properties));
    }

    public static RegistryObject<Item> registerFoodItem(String name, FoodProperties foodProperties) {
        return ATLANTIS_ITEMS.register(name, () -> new Item(new Item.Properties().food(foodProperties)));
    }
    public static RegistryObject<Item> registerFoodItem(String name, Item.Properties properties, FoodProperties foodProperties) {
        return ATLANTIS_ITEMS.register(name, () -> new Item(properties.food(foodProperties)));
    }

    public static RegistryObject<Item> registerMagicalItem(String name, MagicProperties magicProperties) {
        return ATLANTIS_ITEMS.register(name, () -> new MagicalItem(new Item.Properties(), magicProperties));
    }

    public static RegistryObject<Item> registerHorseArmour(String name, int pProtection, int pMaxDamage) {
        return ATLANTIS_ITEMS.register(name + "_horse_armor", () -> new HorseArmorItem(
                pProtection,
                LostWorldsApi.modLoc("textures/entity/horse/armor/horse_armor_" + name + ".png"),
                new Item.Properties().durability(pMaxDamage)));
    }

    public static void register(IEventBus eventBus) {
        ATLANTIS_ITEMS.register(eventBus);
    }
}
