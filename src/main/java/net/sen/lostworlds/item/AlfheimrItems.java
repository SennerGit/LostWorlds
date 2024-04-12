package net.sen.lostworlds.item;

import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.HorseArmorItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemNameBlockItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.sen.lostworlds.LostWorldsApi;
import net.sen.lostworlds.block.AlfheimrBlocks;
import net.sen.lostworlds.item.custom.MagicalItem;
import net.sen.lostworlds.magic.MagicProperties;

public class AlfheimrItems {
    public static final DeferredRegister<Item> ALFHEIMR_ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, LostWorldsApi.MODID);

    /*
     * Food and Stuff
     */
    public static final RegistryObject<Item> DURUM_WHEAT = ALFHEIMR_ITEMS.register("durum_wheat", () -> new Item(new Item.Properties().food(ModFoodProperties.DURUM_WHEAT)));
    public static final RegistryObject<Item> TOMATO = ALFHEIMR_ITEMS.register("tomato", () -> new Item(new Item.Properties().food(ModFoodProperties.TOMATO)));
    public static final RegistryObject<Item> WILD_ONION = ALFHEIMR_ITEMS.register("wild_onion", () -> new ItemNameBlockItem(AlfheimrBlocks.WILD_ONION_CROP_BLOCK.get(), new Item.Properties().food(ModFoodProperties.WILD_ONION)));
    public static final RegistryObject<Item> ONION_STAGE_1 = ALFHEIMR_ITEMS.register("onion_stage_1", () -> new ItemNameBlockItem(AlfheimrBlocks.STAGE_1_ONION_CROP_BLOCK.get(), new Item.Properties().food(ModFoodProperties.ONION_STAGE_1)));
    public static final RegistryObject<Item> ONION_STAGE_2 = ALFHEIMR_ITEMS.register("onion_stage_2", () -> new ItemNameBlockItem(AlfheimrBlocks.STAGE_2_ONION_CROP_BLOCK.get(), new Item.Properties().food(ModFoodProperties.ONION_STAGE_2)));
    public static final RegistryObject<Item> ONION_STAGE_3 = ALFHEIMR_ITEMS.register("onion_stage_3", () -> new ItemNameBlockItem(AlfheimrBlocks.STAGE_3_ONION_CROP_BLOCK.get(), new Item.Properties().food(ModFoodProperties.ONION_STAGE_3)));
    public static final RegistryObject<Item> ONION = ALFHEIMR_ITEMS.register("onion", () -> new ItemNameBlockItem(AlfheimrBlocks.ONION_CROP_BLOCK.get(), new Item.Properties().food(ModFoodProperties.ONION)));
    public static final RegistryObject<Item> DRAGON_FRUIT = ALFHEIMR_ITEMS.register("dragon_fruit", () -> new Item(new Item.Properties().food(ModFoodProperties.DRAGON_FRUIT)));
    public static final RegistryObject<Item> CHILLI = ALFHEIMR_ITEMS.register("chilli", () -> new Item(new Item.Properties().food(ModFoodProperties.CHILLI)));

    /*
     PLANTS
     */
    public static final RegistryObject<Item> DURUM_WHEAT_SEEDS = ALFHEIMR_ITEMS.register("durum_wheat_seeds", () -> new ItemNameBlockItem(AlfheimrBlocks.DURUM_WHEAT_CROP_BLOCK.get(), new Item.Properties()));
    public static final RegistryObject<Item> TOMATO_SEEDS = ALFHEIMR_ITEMS.register("tomato_seeds", () -> new ItemNameBlockItem(AlfheimrBlocks.TOMATO_CROP_BLOCK.get(), new Item.Properties()));
    public static final RegistryObject<Item> DRAGON_FRUIT_SEEDS = ALFHEIMR_ITEMS.register("dragon_fruit_seeds", () -> new ItemNameBlockItem(AlfheimrBlocks.DRAGON_FRUIT_CROP_BLOCK.get(), new Item.Properties()));
    public static final RegistryObject<Item> CHILLI_SEEDS = ALFHEIMR_ITEMS.register("chilli_seeds", () -> new ItemNameBlockItem(AlfheimrBlocks.CHILLI_CROP_BLOCK.get(), new Item.Properties()));

    /*
     * WOOD TYPES
     */

    public static RegistryObject<Item> registerItem(String name) {
        return ALFHEIMR_ITEMS.register(name, () -> new Item(new Item.Properties()));
    }
    public static RegistryObject<Item> registerItem(String name, Item.Properties properties) {
        return ALFHEIMR_ITEMS.register(name, () -> new Item(properties));
    }

    public static RegistryObject<Item> registerFoodItem(String name, FoodProperties foodProperties) {
        return ALFHEIMR_ITEMS.register(name, () -> new Item(new Item.Properties().food(foodProperties)));
    }
    public static RegistryObject<Item> registerFoodItem(String name, Item.Properties properties, FoodProperties foodProperties) {
        return ALFHEIMR_ITEMS.register(name, () -> new Item(properties.food(foodProperties)));
    }

    public static RegistryObject<Item> registerMagicalItem(String name, MagicProperties magicProperties) {
        return ALFHEIMR_ITEMS.register(name, () -> new MagicalItem(new Item.Properties(), magicProperties));
    }

    public static RegistryObject<Item> registerHorseArmour(String name, int pProtection, int pMaxDamage) {
        return ALFHEIMR_ITEMS.register(name + "_horse_armor", () -> new HorseArmorItem(
                pProtection,
                LostWorldsApi.modLoc("textures/entity/horse/armor/horse_armor_" + name + ".png"),
                new Item.Properties().durability(pMaxDamage)));

    }

    public static void register(IEventBus eventBus) {
        ALFHEIMR_ITEMS.register(eventBus);
    }
}
