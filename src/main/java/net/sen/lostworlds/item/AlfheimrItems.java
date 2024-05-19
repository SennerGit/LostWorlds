package net.sen.lostworlds.item;

import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.sen.lostworlds.LostWorldsApi;
import net.sen.lostworlds.block.AlfheimrBlocks;
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
    //Black Birch
    public static final RegistryObject<Item> BLACK_BIRCH_SIGN = ALFHEIMR_ITEMS.register("black_birch_sign", () -> new SignItem(new Item.Properties().craftRemainder(Items.OAK_SIGN).stacksTo(16), AlfheimrBlocks.BLACK_BIRCH_PLANKS_SIGN.get(), AlfheimrBlocks.BLACK_BIRCH_PLANKS_WALL_SIGN.get()));
    public static final RegistryObject<Item> BLACK_BIRCH_HANGING_SIGN = ALFHEIMR_ITEMS.register("black_birch_hanging_sign", () -> new HangingSignItem(AlfheimrBlocks.BLACK_BIRCH_PLANKS_HANGING_SIGN.get(), AlfheimrBlocks.BLACK_BIRCH_PLANKS_WALL_HANGING_SIGN.get(), new Item.Properties().craftRemainder(Items.OAK_SIGN).stacksTo(16)));

    //White Oak
    public static final RegistryObject<Item> WHITE_OAK_SIGN = ALFHEIMR_ITEMS.register("white_oak_sign", () -> new SignItem(new Item.Properties().craftRemainder(Items.OAK_SIGN).stacksTo(16), AlfheimrBlocks.WHITE_OAK_PLANKS_SIGN.get(), AlfheimrBlocks.WHITE_OAK_PLANKS_WALL_SIGN.get()));
    public static final RegistryObject<Item> WHITE_OAK_HANGING_SIGN = ALFHEIMR_ITEMS.register("white_oak_hanging_sign", () -> new HangingSignItem(AlfheimrBlocks.WHITE_OAK_PLANKS_HANGING_SIGN.get(), AlfheimrBlocks.WHITE_OAK_PLANKS_WALL_HANGING_SIGN.get(), new Item.Properties().craftRemainder(Items.OAK_SIGN).stacksTo(16)));

    //Bur Oak
    public static final RegistryObject<Item> BUR_OAK_SIGN = ALFHEIMR_ITEMS.register("bur_oak_sign", () -> new SignItem(new Item.Properties().craftRemainder(Items.OAK_SIGN).stacksTo(16), AlfheimrBlocks.BUR_OAK_PLANKS_SIGN.get(), AlfheimrBlocks.BUR_OAK_PLANKS_WALL_SIGN.get()));
    public static final RegistryObject<Item> BUR_OAK_HANGING_SIGN = ALFHEIMR_ITEMS.register("bur_oak_hanging_sign", () -> new HangingSignItem(AlfheimrBlocks.BUR_OAK_PLANKS_HANGING_SIGN.get(), AlfheimrBlocks.BUR_OAK_PLANKS_WALL_HANGING_SIGN.get(), new Item.Properties().craftRemainder(Items.OAK_SIGN).stacksTo(16)));
    
    //Blood Cherry
    public static final RegistryObject<Item> BLOOD_CHERRY_SIGN = ALFHEIMR_ITEMS.register("blood_cherry_sign", () -> new SignItem(new Item.Properties().craftRemainder(Items.OAK_SIGN).stacksTo(16), AlfheimrBlocks.BLOOD_CHERRY_PLANKS_SIGN.get(), AlfheimrBlocks.BLOOD_CHERRY_PLANKS_WALL_SIGN.get()));
    public static final RegistryObject<Item> BLOOD_CHERRY_HANGING_SIGN = ALFHEIMR_ITEMS.register("blood_cherry_hanging_sign", () -> new HangingSignItem(AlfheimrBlocks.BLOOD_CHERRY_PLANKS_HANGING_SIGN.get(), AlfheimrBlocks.BLOOD_CHERRY_PLANKS_WALL_HANGING_SIGN.get(), new Item.Properties().craftRemainder(Items.OAK_SIGN).stacksTo(16)));
    
    //Sacred Tree
    public static final RegistryObject<Item> SACRED_TREE_SIGN = ALFHEIMR_ITEMS.register("sacred_tree_sign", () -> new SignItem(new Item.Properties().craftRemainder(Items.OAK_SIGN).stacksTo(16), AlfheimrBlocks.SACRED_TREE_PLANKS_SIGN.get(), AlfheimrBlocks.SACRED_TREE_PLANKS_WALL_SIGN.get()));
    public static final RegistryObject<Item> SACRED_TREE_HANGING_SIGN = ALFHEIMR_ITEMS.register("sacred_tree_hanging_sign", () -> new HangingSignItem(AlfheimrBlocks.SACRED_TREE_PLANKS_HANGING_SIGN.get(), AlfheimrBlocks.SACRED_TREE_PLANKS_WALL_HANGING_SIGN.get(), new Item.Properties().craftRemainder(Items.OAK_SIGN).stacksTo(16)));
    
    //Willow
    public static final RegistryObject<Item> WILLOW_SIGN = ALFHEIMR_ITEMS.register("willow_sign", () -> new SignItem(new Item.Properties().craftRemainder(Items.OAK_SIGN).stacksTo(16), AlfheimrBlocks.WILLOW_PLANKS_SIGN.get(), AlfheimrBlocks.WILLOW_PLANKS_WALL_SIGN.get()));
    public static final RegistryObject<Item> WILLOW_HANGING_SIGN = ALFHEIMR_ITEMS.register("willow_hanging_sign", () -> new HangingSignItem(AlfheimrBlocks.WILLOW_PLANKS_HANGING_SIGN.get(), AlfheimrBlocks.WILLOW_PLANKS_WALL_HANGING_SIGN.get(), new Item.Properties().craftRemainder(Items.OAK_SIGN).stacksTo(16)));
    
    //Deadwood
    public static final RegistryObject<Item> DEADWOOD_SIGN = ALFHEIMR_ITEMS.register("deadwood_sign", () -> new SignItem(new Item.Properties().craftRemainder(Items.OAK_SIGN).stacksTo(16), AlfheimrBlocks.DEADWOOD_PLANKS_SIGN.get(), AlfheimrBlocks.DEADWOOD_PLANKS_WALL_SIGN.get()));
    public static final RegistryObject<Item> DEADWOOD_HANGING_SIGN = ALFHEIMR_ITEMS.register("deadwood_hanging_sign", () -> new HangingSignItem(AlfheimrBlocks.DEADWOOD_PLANKS_HANGING_SIGN.get(), AlfheimrBlocks.DEADWOOD_PLANKS_WALL_HANGING_SIGN.get(), new Item.Properties().craftRemainder(Items.OAK_SIGN).stacksTo(16)));
    
    //Ebony Kingswood
    public static final RegistryObject<Item> EBONY_KINGSWOOD_SIGN = ALFHEIMR_ITEMS.register("ebony_kingswood_sign", () -> new SignItem(new Item.Properties().craftRemainder(Items.OAK_SIGN).stacksTo(16), AlfheimrBlocks.EBONY_KINGSWOOD_PLANKS_SIGN.get(), AlfheimrBlocks.EBONY_KINGSWOOD_PLANKS_WALL_SIGN.get()));
    public static final RegistryObject<Item> EBONY_KINGSWOOD_HANGING_SIGN = ALFHEIMR_ITEMS.register("ebony_kingswood_hanging_sign", () -> new HangingSignItem(AlfheimrBlocks.EBONY_KINGSWOOD_PLANKS_HANGING_SIGN.get(), AlfheimrBlocks.EBONY_KINGSWOOD_PLANKS_WALL_HANGING_SIGN.get(), new Item.Properties().craftRemainder(Items.OAK_SIGN).stacksTo(16)));
    
    //Ivory Kingswood
    public static final RegistryObject<Item> IVORY_KINGSWOOD_SIGN = ALFHEIMR_ITEMS.register("ivory_kingswood_sign", () -> new SignItem(new Item.Properties().craftRemainder(Items.OAK_SIGN).stacksTo(16), AlfheimrBlocks.IVORY_KINGSWOOD_PLANKS_SIGN.get(), AlfheimrBlocks.IVORY_KINGSWOOD_PLANKS_WALL_SIGN.get()));
    public static final RegistryObject<Item> IVORY_KINGSWOOD_HANGING_SIGN = ALFHEIMR_ITEMS.register("ivory_kingswood_hanging_sign", () -> new HangingSignItem(AlfheimrBlocks.IVORY_KINGSWOOD_PLANKS_HANGING_SIGN.get(), AlfheimrBlocks.IVORY_KINGSWOOD_PLANKS_WALL_HANGING_SIGN.get(), new Item.Properties().craftRemainder(Items.OAK_SIGN).stacksTo(16)));
    
    //Weaver
    public static final RegistryObject<Item> WEAVER_SIGN = ALFHEIMR_ITEMS.register("weaver_sign", () -> new SignItem(new Item.Properties().craftRemainder(Items.OAK_SIGN).stacksTo(16), AlfheimrBlocks.WEAVER_PLANKS_SIGN.get(), AlfheimrBlocks.WEAVER_PLANKS_WALL_SIGN.get()));
    public static final RegistryObject<Item> WEAVER_HANGING_SIGN = ALFHEIMR_ITEMS.register("weaver_hanging_sign", () -> new HangingSignItem(AlfheimrBlocks.WEAVER_PLANKS_HANGING_SIGN.get(), AlfheimrBlocks.WEAVER_PLANKS_WALL_HANGING_SIGN.get(), new Item.Properties().craftRemainder(Items.OAK_SIGN).stacksTo(16)));
    
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
