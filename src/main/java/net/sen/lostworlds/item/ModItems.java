package net.sen.lostworlds.item;

import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.sen.lostworlds.LostWorldsApi;
import net.sen.lostworlds.fluid.ModFluids;
import net.sen.lostworlds.item.custom.*;
import net.sen.lostworlds.magic.MagicProperties;
import net.sen.lostworlds.magic.ModMagicProperties;
import net.sen.lostworlds.sound.ModSounds;

import java.util.Properties;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, LostWorldsApi.MODID);

    /*
     *   Crimson Dimension
     */
    public static final RegistryObject<Item> MAGICAL_DOWSING_ROD = ITEMS.register("magical_dowsing_rod", () -> new MagicalDowsingRod(new Item.Properties().durability(512)));

    /*
     *   Crimson Dimension
     */
    //Crimson Diamond
    public static final RegistryObject<Item> CRIMSON_DIAMOND = ITEMS.register("crimson_diamond", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> AQUAMARINE = ITEMS.register("aquamarine", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> OPAL = ITEMS.register("opal", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RUBY = ITEMS.register("ruby", () -> new Item(new Item.Properties()));

    /*
     * World Metals
     */
    //Zinc
    //https://en.wikipedia.org/wiki/Zinc
    public static final RegistryObject<Item> ZINC_INGOT = ITEMS.register("zinc_ingot", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_ZINC = ITEMS.register("raw_zinc", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ZINC_NUGGET = ITEMS.register("zinc_nugget", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ZINC_SWORD = ITEMS.register("zinc_sword", () -> new CrimsonSwordItem(ModToolTiers.ZINC, 2, 3, new Item.Properties().durability(256)));
    public static final RegistryObject<Item> ZINC_PICKAXE = ITEMS.register("zinc_pickaxe", () -> new PickaxeItem(ModToolTiers.ZINC, 1, 2,new Item.Properties().durability(256)));
    public static final RegistryObject<Item> ZINC_SHOVEL = ITEMS.register("zinc_shovel", () -> new ShovelItem(ModToolTiers.ZINC, 1,  2,new Item.Properties().durability(256)));
    public static final RegistryObject<Item> ZINC_AXE = ITEMS.register("zinc_axe", () -> new AxeItem(ModToolTiers.ZINC, 3, 4,new Item.Properties().durability(256)));
    public static final RegistryObject<Item> ZINC_HOE = ITEMS.register("zinc_hoe", () -> new HoeItem(ModToolTiers.ZINC, 1, 2,new Item.Properties().durability(256)));

    public static final RegistryObject<Item> ZINC_HELMET = ITEMS.register("zinc_helmet", () -> new ModArmorItem(ModArmourMaterials.ZINC, ArmorItem.Type.HELMET, new Item.Properties().durability(256)));
    public static final RegistryObject<Item> ZINC_CHESTPLATE = ITEMS.register("zinc_chestplate", () -> new ModArmorItem(ModArmourMaterials.ZINC, ArmorItem.Type.CHESTPLATE, new Item.Properties().durability(256)));
    public static final RegistryObject<Item> ZINC_LEGGINGS = ITEMS.register("zinc_leggings", () -> new ModArmorItem(ModArmourMaterials.ZINC, ArmorItem.Type.LEGGINGS, new Item.Properties().durability(256)));
    public static final RegistryObject<Item> ZINC_BOOTS = ITEMS.register("zinc_boots", () -> new ModArmorItem(ModArmourMaterials.ZINC, ArmorItem.Type.BOOTS, new Item.Properties().durability(256)));
    public static final RegistryObject<Item> ZINC_HORSE_ARMOR = registerHorseArmour("zinc", 12, 256);

    //Tin
    //https://en.wikipedia.org/wiki/Tin
    public static final RegistryObject<Item> TIN_INGOT = ITEMS.register("tin_ingot", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_TIN = ITEMS.register("raw_tin", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TIN_NUGGET = ITEMS.register("tin_nugget", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TIN_SWORD = ITEMS.register("tin_sword", () -> new CrimsonSwordItem(ModToolTiers.TIN, 2, 3, new Item.Properties().durability(256)));
    public static final RegistryObject<Item> TIN_PICKAXE = ITEMS.register("tin_pickaxe", () -> new PickaxeItem(ModToolTiers.TIN, 1, 2,new Item.Properties().durability(256)));
    public static final RegistryObject<Item> TIN_SHOVEL = ITEMS.register("tin_shovel", () -> new ShovelItem(ModToolTiers.TIN, 1,  2,new Item.Properties().durability(256)));
    public static final RegistryObject<Item> TIN_AXE = ITEMS.register("tin_axe", () -> new AxeItem(ModToolTiers.TIN, 3, 4,new Item.Properties().durability(256)));
    public static final RegistryObject<Item> TIN_HOE = ITEMS.register("tin_hoe", () -> new HoeItem(ModToolTiers.TIN, 1, 2,new Item.Properties().durability(256)));

    public static final RegistryObject<Item> TIN_HELMET = ITEMS.register("tin_helmet", () -> new ModArmorItem(ModArmourMaterials.TIN, ArmorItem.Type.HELMET, new Item.Properties().durability(256)));
    public static final RegistryObject<Item> TIN_CHESTPLATE = ITEMS.register("tin_chestplate", () -> new ModArmorItem(ModArmourMaterials.TIN, ArmorItem.Type.CHESTPLATE, new Item.Properties().durability(256)));
    public static final RegistryObject<Item> TIN_LEGGINGS = ITEMS.register("tin_leggings", () -> new ModArmorItem(ModArmourMaterials.TIN, ArmorItem.Type.LEGGINGS, new Item.Properties().durability(256)));
    public static final RegistryObject<Item> TIN_BOOTS = ITEMS.register("tin_boots", () -> new ModArmorItem(ModArmourMaterials.TIN, ArmorItem.Type.BOOTS, new Item.Properties().durability(256)));
    public static final RegistryObject<Item> TIN_HORSE_ARMOR = registerHorseArmour("tin", 12, 256);

    /*
     * World Crystals
     */
    //Aurichalcite
    //https://en.wikipedia.org/wiki/Aurichalcite
    public static final RegistryObject<Item> AURICHALCITE = ITEMS.register("aurichalcite", () -> new Item(new Item.Properties()));

    /*
     * World Alloys
     */
    //Brass
    //https://en.wikipedia.org/wiki/Brass
    public static final RegistryObject<Item> BRASS_INGOT = ITEMS.register("brass_ingot", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BRASS_NUGGET = ITEMS.register("brass_nugget", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BRASS_SWORD = ITEMS.register("brass_sword", () -> new CrimsonSwordItem(ModToolTiers.BRASS, 2, 3, new Item.Properties().durability(256)));
    public static final RegistryObject<Item> BRASS_PICKAXE = ITEMS.register("brass_pickaxe", () -> new PickaxeItem(ModToolTiers.BRASS, 1, 2,new Item.Properties().durability(256)));
    public static final RegistryObject<Item> BRASS_SHOVEL = ITEMS.register("brass_shovel", () -> new ShovelItem(ModToolTiers.BRASS, 1,  2,new Item.Properties().durability(256)));
    public static final RegistryObject<Item> BRASS_AXE = ITEMS.register("brass_axe", () -> new AxeItem(ModToolTiers.BRASS, 3, 4,new Item.Properties().durability(256)));
    public static final RegistryObject<Item> BRASS_HOE = ITEMS.register("brass_hoe", () -> new HoeItem(ModToolTiers.BRASS, 1, 2,new Item.Properties().durability(256)));

    public static final RegistryObject<Item> BRASS_HELMET = ITEMS.register("brass_helmet", () -> new ModArmorItem(ModArmourMaterials.BRASS, ArmorItem.Type.HELMET, new Item.Properties().durability(256)));
    public static final RegistryObject<Item> BRASS_CHESTPLATE = ITEMS.register("brass_chestplate", () -> new ModArmorItem(ModArmourMaterials.BRASS, ArmorItem.Type.CHESTPLATE, new Item.Properties().durability(256)));
    public static final RegistryObject<Item> BRASS_LEGGINGS = ITEMS.register("brass_leggings", () -> new ModArmorItem(ModArmourMaterials.BRASS, ArmorItem.Type.LEGGINGS, new Item.Properties().durability(256)));
    public static final RegistryObject<Item> BRASS_BOOTS = ITEMS.register("brass_boots", () -> new ModArmorItem(ModArmourMaterials.BRASS, ArmorItem.Type.BOOTS, new Item.Properties().durability(256)));
    public static final RegistryObject<Item> BRASS_HORSE_ARMOR = registerHorseArmour("brass", 12, 256);

    //Bronze
    //https://en.wikipedia.org/wiki/Bronze
    public static final RegistryObject<Item> BRONZE_INGOT = ITEMS.register("bronze_ingot", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BRONZE_NUGGET = ITEMS.register("bronze_nugget", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BRONZE_SWORD = ITEMS.register("bronze_sword", () -> new CrimsonSwordItem(ModToolTiers.BRONZE, 2, 3, new Item.Properties().durability(256)));
    public static final RegistryObject<Item> BRONZE_PICKAXE = ITEMS.register("bronze_pickaxe", () -> new PickaxeItem(ModToolTiers.BRONZE, 1, 2,new Item.Properties().durability(256)));
    public static final RegistryObject<Item> BRONZE_SHOVEL = ITEMS.register("bronze_shovel", () -> new ShovelItem(ModToolTiers.BRONZE, 1,  2,new Item.Properties().durability(256)));
    public static final RegistryObject<Item> BRONZE_AXE = ITEMS.register("bronze_axe", () -> new AxeItem(ModToolTiers.BRONZE, 3, 4,new Item.Properties().durability(256)));
    public static final RegistryObject<Item> BRONZE_HOE = ITEMS.register("bronze_hoe", () -> new HoeItem(ModToolTiers.BRONZE, 1, 2,new Item.Properties().durability(256)));

    public static final RegistryObject<Item> BRONZE_HELMET = ITEMS.register("bronze_helmet", () -> new ModArmorItem(ModArmourMaterials.BRONZE, ArmorItem.Type.HELMET, new Item.Properties().durability(256)));
    public static final RegistryObject<Item> BRONZE_CHESTPLATE = ITEMS.register("bronze_chestplate", () -> new ModArmorItem(ModArmourMaterials.BRONZE, ArmorItem.Type.CHESTPLATE, new Item.Properties().durability(256)));
    public static final RegistryObject<Item> BRONZE_LEGGINGS = ITEMS.register("bronze_leggings", () -> new ModArmorItem(ModArmourMaterials.BRONZE, ArmorItem.Type.LEGGINGS, new Item.Properties().durability(256)));
    public static final RegistryObject<Item> BRONZE_BOOTS = ITEMS.register("bronze_boots", () -> new ModArmorItem(ModArmourMaterials.BRONZE, ArmorItem.Type.BOOTS, new Item.Properties().durability(256)));
    public static final RegistryObject<Item> BRONZE_HORSE_ARMOR = registerHorseArmour("bronze", 12, 256);

    /*
    RECORDS
     */
    public static final RegistryObject<Item> BAR_BRAWL_RECORD = ITEMS.register("bar_brawl_record", () -> new RecordItem(4, ModSounds.BAR_BRAWL, new Item.Properties().stacksTo(1), 2440));

    //Fuel
    public static final RegistryObject<Item> CRIMSON_TEAR = ITEMS.register("crimson_tear", () -> new FuelItem(new Item.Properties(), 200));

    //Special Items
    public static final RegistryObject<Item> DATA_TABLET = ITEMS.register("data_tablet", () -> new DataTabletItem(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> WAYGATE_CRYSTAL = ITEMS.register("waygate_crystal", () -> new WaygateCrystalItem(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> MEDUSA_HEAD = ITEMS.register("gorgan_head", () -> new MedusaHeadItem(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> CUSTOM_BOW = ITEMS.register("custom_bow", () -> new BowItem(new Item.Properties().durability(500)));
    public static final RegistryObject<Item> ALEXANDRITE_SHIELD = ITEMS.register("alexandrite_shield", () -> new ShieldItem(new Item.Properties().durability(500)));
    public static final RegistryObject<Item> STYX_WATER_BUCKET = ITEMS.register("styx_water_bucket", () -> new BucketItem(ModFluids.SOURCE_STYX_WATER, new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1)));


    //Book
//    public static final RegistryObject<Item> LOST_WORLDS_BOOK = ITEMS.register("lost_worlds_book", () -> new Item(new Item.Properties().stacksTo(1)));


    //Projectiles
    public static final RegistryObject<Item> DICE = ITEMS.register("dice", () -> new DiceItem(new Item.Properties()));

    //Portal Item
    public static final RegistryObject<Item> BASIC_PORTAL_ACTIVATOR = ITEMS.register("basic_portal_activator", () -> new PortalActivatorItem(0));

    //Portal Core
    public static final RegistryObject<Item> BASIC_PORTAL_CORE = ITEMS.register("basic_portal_core", () -> new MagicalItem(new Item.Properties().rarity(Rarity.UNCOMMON), ModMagicProperties.PORTAL_CORE));

    public static RegistryObject<Item> registerItem(String name) {
        return ITEMS.register(name, () -> new Item(new Item.Properties()));
    }
    public static RegistryObject<Item> registerItem(String name, Item.Properties properties) {
        return ITEMS.register(name, () -> new Item(properties));
    }

    public static RegistryObject<Item> registerFoodItem(String name, FoodProperties foodProperties) {
        return ITEMS.register(name, () -> new Item(new Item.Properties().food(foodProperties)));
    }
    public static RegistryObject<Item> registerFoodItem(String name, Item.Properties properties, FoodProperties foodProperties) {
        return ITEMS.register(name, () -> new Item(properties.food(foodProperties)));
    }

    public static RegistryObject<Item> registerMagicalItem(String name, MagicProperties magicProperties) {
        return ITEMS.register(name, () -> new MagicalItem(new Item.Properties(), magicProperties));
    }

    public static RegistryObject<Item> registerMagicalItem(String name, Item.Properties properties, MagicProperties magicProperties) {
        return ITEMS.register(name, () -> new MagicalItem(properties, magicProperties));
    }

    public static RegistryObject<Item> registerHorseArmour(String name, int pProtection, int pMaxDamage) {
        return ITEMS.register(name + "_horse_armor", () -> new HorseArmorItem(
                pProtection,
                LostWorldsApi.modLoc("textures/entity/horse/armor/horse_armor_" + name + ".png"),
                new Item.Properties().durability(pMaxDamage)));

    }

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
