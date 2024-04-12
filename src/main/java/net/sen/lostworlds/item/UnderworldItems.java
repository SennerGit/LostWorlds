package net.sen.lostworlds.item;

import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.sen.lostworlds.LostWorldsApi;
import net.sen.lostworlds.block.UnderworldBlocks;
import net.sen.lostworlds.item.custom.CrimsonSwordItem;
import net.sen.lostworlds.item.custom.MagicalItem;
import net.sen.lostworlds.item.custom.ModArmorItem;
import net.sen.lostworlds.magic.MagicProperties;

public class UnderworldItems {
    public static final DeferredRegister<Item> UNDERWORLD_ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, LostWorldsApi.MODID);

    /*
    INGOTS
     */
    //Orichalcum
    //https://en.wikipedia.org/wiki/Orichalcum
    public static final RegistryObject<Item> ORICHALCUM_INGOT = UNDERWORLD_ITEMS.register("orichalcum_ingot", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_ORICHALCUM = UNDERWORLD_ITEMS.register("raw_orichalcum", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ORICHALCUM_NUGGET = UNDERWORLD_ITEMS.register("orichalcum_nugget", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ORICHALCUM_SWORD = UNDERWORLD_ITEMS.register("orichalcum_sword", () -> new CrimsonSwordItem(ModToolTiers.ORICHALCUM, 2, 3, new Item.Properties().durability(256)));
    public static final RegistryObject<Item> ORICHALCUM_PICKAXE = UNDERWORLD_ITEMS.register("orichalcum_pickaxe", () -> new PickaxeItem(ModToolTiers.ORICHALCUM, 1, 2,new Item.Properties().durability(256)));
    public static final RegistryObject<Item> ORICHALCUM_SHOVEL = UNDERWORLD_ITEMS.register("orichalcum_shovel", () -> new ShovelItem(ModToolTiers.ORICHALCUM, 1,  2,new Item.Properties().durability(256)));
    public static final RegistryObject<Item> ORICHALCUM_AXE = UNDERWORLD_ITEMS.register("orichalcum_axe", () -> new AxeItem(ModToolTiers.ORICHALCUM, 3, 4,new Item.Properties().durability(256)));
    public static final RegistryObject<Item> ORICHALCUM_HOE = UNDERWORLD_ITEMS.register("orichalcum_hoe", () -> new HoeItem(ModToolTiers.ORICHALCUM, 1, 2,new Item.Properties().durability(256)));

    public static final RegistryObject<Item> ORICHALCUM_HELMET = UNDERWORLD_ITEMS.register("orichalcum_helmet", () -> new ModArmorItem(ModArmourMaterials.ORICHALCUM, ArmorItem.Type.HELMET, new Item.Properties().durability(256)));
    public static final RegistryObject<Item> ORICHALCUM_CHESTPLATE = UNDERWORLD_ITEMS.register("orichalcum_chestplate", () -> new ModArmorItem(ModArmourMaterials.ORICHALCUM, ArmorItem.Type.CHESTPLATE, new Item.Properties().durability(256)));
    public static final RegistryObject<Item> ORICHALCUM_LEGGINGS = UNDERWORLD_ITEMS.register("orichalcum_leggings", () -> new ModArmorItem(ModArmourMaterials.ORICHALCUM, ArmorItem.Type.LEGGINGS, new Item.Properties().durability(256)));
    public static final RegistryObject<Item> ORICHALCUM_BOOTS = UNDERWORLD_ITEMS.register("orichalcum_boots", () -> new ModArmorItem(ModArmourMaterials.ORICHALCUM, ArmorItem.Type.BOOTS, new Item.Properties().durability(256)));
    public static final RegistryObject<Item> ORICHALCUM_HORSE_ARMOR = registerHorseArmour("orichalcum", 12, 256);

    //Adamant
    //https://en.wikipedia.org/wiki/Adamant
    public static final RegistryObject<Item> ADAMANT = UNDERWORLD_ITEMS.register("adamant_ingot", () -> new Item(new Item.Properties()));

    /*
     * Food and Stuff
     */
    //Food
    public static final RegistryObject<Item> POMEGRANATE = UNDERWORLD_ITEMS.register("pomegranate", () -> new Item(new Item.Properties().food(ModFoodProperties.POMEGRANATE)));
    public static final RegistryObject<Item> OLIVE = UNDERWORLD_ITEMS.register("olive", () -> new Item(new Item.Properties().food(ModFoodProperties.OLIVE)));
    
    /*
    PLANTS
    */
    public static final RegistryObject<Item> POMEGRANATE_SEEDS = UNDERWORLD_ITEMS.register("pomegranate_seeds", () -> new ItemNameBlockItem(UnderworldBlocks.POMEGRANATE_CROP_BLOCK.get(), new Item.Properties()));

    /*
     * WOOD TYPES
     */
    //Elder Wood
    public static final RegistryObject<Item> ELDER_WOOD_SIGN = UNDERWORLD_ITEMS.register("elder_wood_sign", () -> new SignItem(new Item.Properties().craftRemainder(Items.OAK_SIGN).stacksTo(16), UnderworldBlocks.ELDER_WOOD_PLANKS_SIGN.get(), UnderworldBlocks.ELDER_WOOD_PLANKS_WALL_SIGN.get()));
    public static final RegistryObject<Item> ELDER_WOOD_HANGING_SIGN = UNDERWORLD_ITEMS.register("elder_wood_hanging_sign", () -> new HangingSignItem(UnderworldBlocks.ELDER_WOOD_PLANKS_HANGING_SIGN.get(), UnderworldBlocks.ELDER_WOOD_PLANKS_WALL_HANGING_SIGN.get(), new Item.Properties().craftRemainder(Items.OAK_SIGN).stacksTo(16)));

    //Olive
    public static final RegistryObject<Item> OLIVE_SIGN = UNDERWORLD_ITEMS.register("olive_sign", () -> new SignItem(new Item.Properties().craftRemainder(Items.OAK_SIGN).stacksTo(16), UnderworldBlocks.OLIVE_PLANKS_SIGN.get(), UnderworldBlocks.OLIVE_PLANKS_WALL_SIGN.get()));
    public static final RegistryObject<Item> OLIVE_HANGING_SIGN = UNDERWORLD_ITEMS.register("olive_hanging_sign", () -> new HangingSignItem(UnderworldBlocks.OLIVE_PLANKS_HANGING_SIGN.get(), UnderworldBlocks.OLIVE_PLANKS_WALL_HANGING_SIGN.get(), new Item.Properties().craftRemainder(Items.OAK_SIGN).stacksTo(16)));

    //Myrrh
    public static final RegistryObject<Item> MYRRH_SIGN = UNDERWORLD_ITEMS.register("myrrh_sign", () -> new SignItem(new Item.Properties().craftRemainder(Items.OAK_SIGN).stacksTo(16), UnderworldBlocks.MYRRH_PLANKS_SIGN.get(), UnderworldBlocks.MYRRH_PLANKS_WALL_SIGN.get()));
    public static final RegistryObject<Item> MYRRH_HANGING_SIGN = UNDERWORLD_ITEMS.register("myrrh_hanging_sign", () -> new HangingSignItem(UnderworldBlocks.MYRRH_PLANKS_HANGING_SIGN.get(), UnderworldBlocks.MYRRH_PLANKS_WALL_HANGING_SIGN.get(), new Item.Properties().craftRemainder(Items.OAK_SIGN).stacksTo(16)));

    //Laurel
    public static final RegistryObject<Item> LAUREL_SIGN = UNDERWORLD_ITEMS.register("laurel_sign", () -> new SignItem(new Item.Properties().craftRemainder(Items.OAK_SIGN).stacksTo(16), UnderworldBlocks.LAUREL_PLANKS_SIGN.get(), UnderworldBlocks.LAUREL_PLANKS_WALL_SIGN.get()));
    public static final RegistryObject<Item> LAUREL_HANGING_SIGN = UNDERWORLD_ITEMS.register("laurel_hanging_sign", () -> new HangingSignItem(UnderworldBlocks.LAUREL_PLANKS_HANGING_SIGN.get(), UnderworldBlocks.LAUREL_PLANKS_WALL_HANGING_SIGN.get(), new Item.Properties().craftRemainder(Items.OAK_SIGN).stacksTo(16)));

    //Cypress
    public static final RegistryObject<Item> CYPRESS_SIGN = UNDERWORLD_ITEMS.register("cypress_sign", () -> new SignItem(new Item.Properties().craftRemainder(Items.OAK_SIGN).stacksTo(16), UnderworldBlocks.CYPRESS_PLANKS_SIGN.get(), UnderworldBlocks.CYPRESS_PLANKS_WALL_SIGN.get()));
    public static final RegistryObject<Item> CYPRESS_HANGING_SIGN = UNDERWORLD_ITEMS.register("cypress_hanging_sign", () -> new HangingSignItem(UnderworldBlocks.CYPRESS_PLANKS_HANGING_SIGN.get(), UnderworldBlocks.CYPRESS_PLANKS_WALL_HANGING_SIGN.get(), new Item.Properties().craftRemainder(Items.OAK_SIGN).stacksTo(16)));

    public static RegistryObject<Item> registerItem(String name) {
        return UNDERWORLD_ITEMS.register(name, () -> new Item(new Item.Properties()));
    }
    public static RegistryObject<Item> registerItem(String name, Item.Properties properties) {
        return UNDERWORLD_ITEMS.register(name, () -> new Item(properties));
    }

    public static RegistryObject<Item> registerFoodItem(String name, FoodProperties foodProperties) {
        return UNDERWORLD_ITEMS.register(name, () -> new Item(new Item.Properties().food(foodProperties)));
    }
    public static RegistryObject<Item> registerFoodItem(String name, Item.Properties properties, FoodProperties foodProperties) {
        return UNDERWORLD_ITEMS.register(name, () -> new Item(properties.food(foodProperties)));
    }

    public static RegistryObject<Item> registerMagicalItem(String name, MagicProperties magicProperties) {
        return UNDERWORLD_ITEMS.register(name, () -> new MagicalItem(new Item.Properties(), magicProperties));
    }

    public static RegistryObject<Item> registerHorseArmour(String name, int pProtection, int pMaxDamage) {
        return UNDERWORLD_ITEMS.register(name + "_horse_armor", () -> new HorseArmorItem(
                pProtection,
                LostWorldsApi.modLoc("textures/entity/horse/armor/horse_armor_" + name + ".png"),
                new Item.Properties().durability(pMaxDamage)));

    }

    public static void register(IEventBus eventBus) {
        UNDERWORLD_ITEMS.register(eventBus);
    }
}
