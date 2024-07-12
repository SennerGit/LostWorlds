package net.sen.lostworlds.registry.items;

import net.minecraft.core.Holder;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.*;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.sen.lostworlds.api.LostWorldsApi;
import net.sen.lostworlds.fluid.ModFluids;
import net.sen.lostworlds.item.custom.*;
import net.sen.lostworlds.item.custom.ModSwordItem;
import net.sen.lostworlds.magic.MagicProperties;
import net.sen.lostworlds.magic.ModMagicProperties;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(LostWorldsApi.MODID);

    /*
     *   Crimson Dimension
     */
    public static final DeferredItem<Item> MAGICAL_DOWSING_ROD = ITEMS.register("magical_dowsing_rod", () -> new MagicalDowsingRod(new Item.Properties().durability(512)));

    /*
     *   Crimson Dimension
     */
    //Crimson Diamond
    public static final DeferredItem<Item> CRIMSON_DIAMOND = ITEMS.register("crimson_diamond", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> AQUAMARINE = ITEMS.register("aquamarine", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> OPAL = ITEMS.register("opal", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> RUBY = ITEMS.register("ruby", () -> new Item(new Item.Properties()));

    /*
     * World Metals
     */
    //Zinc
    //https://en.wikipedia.org/wiki/Zinc
    public static final DeferredItem<Item> ZINC_INGOT = ITEMS.register("zinc_ingot", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> RAW_ZINC = ITEMS.register("raw_zinc", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ZINC_NUGGET = ITEMS.register("zinc_nugget", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ZINC_SWORD = ITEMS.register("zinc_sword", () -> new ModSwordItem(ModToolTiers.ZINC, new Item.Properties().attributes(SwordItem.createAttributes(ModToolTiers.ZINC, 7, -3.0f))));
    public static final DeferredItem<Item> ZINC_PICKAXE = ITEMS.register("zinc_pickaxe", () -> new ModPickAxeItem(ModToolTiers.ZINC, new Item.Properties().attributes(PickaxeItem.createAttributes(ModToolTiers.ZINC, 1.5f, -3.0f))));
    public static final DeferredItem<Item> ZINC_SHOVEL = ITEMS.register("zinc_shovel", () -> new ModShovelItem(ModToolTiers.ZINC, new Item.Properties().attributes(ShovelItem.createAttributes(ModToolTiers.ZINC, 1.5f, -3.0f))));
    public static final DeferredItem<Item> ZINC_AXE = ITEMS.register("zinc_axe", () -> new ModAxeItem(ModToolTiers.ZINC, new Item.Properties().attributes(AxeItem.createAttributes(ModToolTiers.ZINC, 1.5f, -3.0f))));
    public static final DeferredItem<Item> ZINC_HOE = ITEMS.register("zinc_hoe", () -> new ModHoeItem(ModToolTiers.ZINC, new Item.Properties().attributes(HoeItem.createAttributes(ModToolTiers.ZINC, 1.5f, -3.0f))));

    public static final DeferredItem<Item> ZINC_HELMET = ITEMS.register("zinc_helmet", () -> new ModArmorItem(ModArmourMaterials.ZINC, ArmorItem.Type.HELMET, new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(256))));
    public static final DeferredItem<Item> ZINC_CHESTPLATE = ITEMS.register("zinc_chestplate", () -> new ModArmorItem(ModArmourMaterials.ZINC, ArmorItem.Type.CHESTPLATE, new Item.Properties().durability(ArmorItem.Type.CHESTPLATE.getDurability(256))));
    public static final DeferredItem<Item> ZINC_LEGGINGS = ITEMS.register("zinc_leggings", () -> new ModArmorItem(ModArmourMaterials.ZINC, ArmorItem.Type.LEGGINGS, new Item.Properties().durability(ArmorItem.Type.LEGGINGS.getDurability(256))));
    public static final DeferredItem<Item> ZINC_BOOTS = ITEMS.register("zinc_boots", () -> new ModArmorItem(ModArmourMaterials.ZINC, ArmorItem.Type.BOOTS, new Item.Properties().durability(ArmorItem.Type.BOOTS.getDurability(256))));
    public static final DeferredItem<Item> ZINC_HORSE_ARMOR = registerHorseArmour("zinc", ModArmourMaterials.ZINC);

    //Tin
    //https://en.wikipedia.org/wiki/Tin
    public static final DeferredItem<Item> TIN_INGOT = ITEMS.register("tin_ingot", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> RAW_TIN = ITEMS.register("raw_tin", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> TIN_NUGGET = ITEMS.register("tin_nugget", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> TIN_SWORD = ITEMS.register("tin_sword", () -> new ModSwordItem(ModToolTiers.TIN, new Item.Properties().attributes(SwordItem.createAttributes(ModToolTiers.TIN, 7, -3.0f))));
    public static final DeferredItem<Item> TIN_PICKAXE = ITEMS.register("tin_pickaxe", () -> new ModPickAxeItem(ModToolTiers.TIN, new Item.Properties().attributes(PickaxeItem.createAttributes(ModToolTiers.TIN, 1.5f, -3.0f))));
    public static final DeferredItem<Item> TIN_SHOVEL = ITEMS.register("tin_shovel", () -> new ModShovelItem(ModToolTiers.TIN, new Item.Properties().attributes(ShovelItem.createAttributes(ModToolTiers.TIN, 1.5f, -3.0f))));
    public static final DeferredItem<Item> TIN_AXE = ITEMS.register("tin_axe", () -> new ModAxeItem(ModToolTiers.TIN, new Item.Properties().attributes(AxeItem.createAttributes(ModToolTiers.TIN, 1.5f, -3.0f))));
    public static final DeferredItem<Item> TIN_HOE = ITEMS.register("tin_hoe", () -> new ModHoeItem(ModToolTiers.TIN, new Item.Properties().attributes(HoeItem.createAttributes(ModToolTiers.TIN, 1.5f, -3.0f))));

    public static final DeferredItem<Item> TIN_HELMET = ITEMS.register("tin_helmet", () -> new ModArmorItem(ModArmourMaterials.TIN, ArmorItem.Type.HELMET, new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(256))));
    public static final DeferredItem<Item> TIN_CHESTPLATE = ITEMS.register("tin_chestplate", () -> new ModArmorItem(ModArmourMaterials.TIN, ArmorItem.Type.CHESTPLATE, new Item.Properties().durability(ArmorItem.Type.CHESTPLATE.getDurability(256))));
    public static final DeferredItem<Item> TIN_LEGGINGS = ITEMS.register("tin_leggings", () -> new ModArmorItem(ModArmourMaterials.TIN, ArmorItem.Type.LEGGINGS, new Item.Properties().durability(ArmorItem.Type.LEGGINGS.getDurability(256))));
    public static final DeferredItem<Item> TIN_BOOTS = ITEMS.register("tin_boots", () -> new ModArmorItem(ModArmourMaterials.TIN, ArmorItem.Type.BOOTS, new Item.Properties().durability(ArmorItem.Type.BOOTS.getDurability(256))));
    public static final DeferredItem<Item> TIN_HORSE_ARMOR = registerHorseArmour("tin", ModArmourMaterials.TIN);

    /*
     * World Crystals
     */
    //Aurichalcite
    //https://en.wikipedia.org/wiki/Aurichalcite
    public static final DeferredItem<Item> AURICHALCITE = ITEMS.register("aurichalcite", () -> new Item(new Item.Properties()));

    /*
     * World Alloys
     */
    //Brass
    //https://en.wikipedia.org/wiki/Brass
    public static final DeferredItem<Item> BRASS_INGOT = ITEMS.register("brass_ingot", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> BRASS_NUGGET = ITEMS.register("brass_nugget", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> BRASS_SWORD = ITEMS.register("brass_sword", () -> new ModSwordItem(ModToolTiers.BRASS, new Item.Properties().attributes(SwordItem.createAttributes(ModToolTiers.BRASS, 7, -3.0f))));
    public static final DeferredItem<Item> BRASS_PICKAXE = ITEMS.register("brass_pickaxe", () -> new ModPickAxeItem(ModToolTiers.BRASS, new Item.Properties().attributes(PickaxeItem.createAttributes(ModToolTiers.BRASS, 1.5f, -3.0f))));
    public static final DeferredItem<Item> BRASS_SHOVEL = ITEMS.register("brass_shovel", () -> new ModShovelItem(ModToolTiers.BRASS, new Item.Properties().attributes(ShovelItem.createAttributes(ModToolTiers.BRASS, 1.5f, -3.0f))));
    public static final DeferredItem<Item> BRASS_AXE = ITEMS.register("brass_axe", () -> new ModAxeItem(ModToolTiers.BRASS, new Item.Properties().attributes(AxeItem.createAttributes(ModToolTiers.BRASS, 1.5f, -3.0f))));
    public static final DeferredItem<Item> BRASS_HOE = ITEMS.register("brass_hoe", () -> new ModHoeItem(ModToolTiers.BRASS, new Item.Properties().attributes(HoeItem.createAttributes(ModToolTiers.BRASS, 1.5f, -3.0f))));

    public static final DeferredItem<Item> BRASS_HELMET = ITEMS.register("brass_helmet", () -> new ModArmorItem(ModArmourMaterials.BRASS, ArmorItem.Type.HELMET, new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(256))));
    public static final DeferredItem<Item> BRASS_CHESTPLATE = ITEMS.register("brass_chestplate", () -> new ModArmorItem(ModArmourMaterials.BRASS, ArmorItem.Type.CHESTPLATE, new Item.Properties().durability(ArmorItem.Type.CHESTPLATE.getDurability(256))));
    public static final DeferredItem<Item> BRASS_LEGGINGS = ITEMS.register("brass_leggings", () -> new ModArmorItem(ModArmourMaterials.BRASS, ArmorItem.Type.LEGGINGS, new Item.Properties().durability(ArmorItem.Type.LEGGINGS.getDurability(256))));
    public static final DeferredItem<Item> BRASS_BOOTS = ITEMS.register("brass_boots", () -> new ModArmorItem(ModArmourMaterials.BRASS, ArmorItem.Type.BOOTS, new Item.Properties().durability(ArmorItem.Type.BOOTS.getDurability(256))));
    public static final DeferredItem<Item> BRASS_HORSE_ARMOR = registerHorseArmour("brass", ModArmourMaterials.BRASS);

    //Bronze
    //https://en.wikipedia.org/wiki/Bronze
    public static final DeferredItem<Item> BRONZE_INGOT = ITEMS.register("bronze_ingot", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> BRONZE_NUGGET = ITEMS.register("bronze_nugget", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> BRONZE_SWORD = ITEMS.register("bronze_sword", () -> new ModSwordItem(ModToolTiers.BRONZE, new Item.Properties().attributes(SwordItem.createAttributes(ModToolTiers.BRONZE, 7, -3.0f))));
    public static final DeferredItem<Item> BRONZE_PICKAXE = ITEMS.register("bronze_pickaxe", () -> new ModPickAxeItem(ModToolTiers.BRONZE, new Item.Properties().attributes(PickaxeItem.createAttributes(ModToolTiers.BRONZE, 1.5f, -3.0f))));
    public static final DeferredItem<Item> BRONZE_SHOVEL = ITEMS.register("bronze_shovel", () -> new ModShovelItem(ModToolTiers.BRONZE, new Item.Properties().attributes(ShovelItem.createAttributes(ModToolTiers.BRONZE, 1.5f, -3.0f))));
    public static final DeferredItem<Item> BRONZE_AXE = ITEMS.register("bronze_axe", () -> new ModAxeItem(ModToolTiers.BRONZE, new Item.Properties().attributes(AxeItem.createAttributes(ModToolTiers.BRONZE, 1.5f, -3.0f))));
    public static final DeferredItem<Item> BRONZE_HOE = ITEMS.register("bronze_hoe", () -> new ModHoeItem(ModToolTiers.BRONZE, new Item.Properties().attributes(HoeItem.createAttributes(ModToolTiers.BRONZE, 1.5f, -3.0f))));

    public static final DeferredItem<Item> BRONZE_HELMET = ITEMS.register("bronze_helmet", () -> new ModArmorItem(ModArmourMaterials.BRONZE, ArmorItem.Type.HELMET, new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(256))));
    public static final DeferredItem<Item> BRONZE_CHESTPLATE = ITEMS.register("bronze_chestplate", () -> new ModArmorItem(ModArmourMaterials.BRONZE, ArmorItem.Type.CHESTPLATE, new Item.Properties().durability(ArmorItem.Type.CHESTPLATE.getDurability(256))));
    public static final DeferredItem<Item> BRONZE_LEGGINGS = ITEMS.register("bronze_leggings", () -> new ModArmorItem(ModArmourMaterials.BRONZE, ArmorItem.Type.LEGGINGS, new Item.Properties().durability(ArmorItem.Type.LEGGINGS.getDurability(256))));
    public static final DeferredItem<Item> BRONZE_BOOTS = ITEMS.register("bronze_boots", () -> new ModArmorItem(ModArmourMaterials.BRONZE, ArmorItem.Type.BOOTS, new Item.Properties().durability(ArmorItem.Type.BOOTS.getDurability(256))));
    public static final DeferredItem<Item> BRONZE_HORSE_ARMOR = registerHorseArmour("bronze", ModArmourMaterials.BRONZE);

    /*
    RECORDS
     */
//    public static final DeferredItem<Item> BAR_BRAWL_RECORD = registerMusicDisc("bar_brawl_record", ModSounds.BAR_BRAWL);

    //Fuel
    public static final DeferredItem<Item> CRIMSON_TEAR = ITEMS.register("crimson_tear", () -> new FuelItem(new Item.Properties(), 200));

    //Special Items
    public static final DeferredItem<Item> DATA_TABLET = ITEMS.register("data_tablet", () -> new DataTabletItem(new Item.Properties().stacksTo(1)));
    public static final DeferredItem<Item> WAYGATE_CRYSTAL = ITEMS.register("waygate_crystal", () -> new WaygateCrystalItem(new Item.Properties().stacksTo(1)));
    public static final DeferredItem<Item> MEDUSA_HEAD = ITEMS.register("gorgan_head", () -> new MedusaHeadItem(new Item.Properties().stacksTo(1)));
    public static final DeferredItem<Item> CUSTOM_BOW = ITEMS.register("custom_bow", () -> new BowItem(new Item.Properties().durability(500)));
    public static final DeferredItem<Item> ALEXANDRITE_SHIELD = ITEMS.register("alexandrite_shield", () -> new ShieldItem(new Item.Properties().durability(500)));
    public static final DeferredItem<Item> STYX_WATER_BUCKET = ITEMS.register("styx_water_bucket", () -> new BucketItem(ModFluids.STYX_SOURCE.get(), new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1)));


    //Book
//    public static final DeferredItem<Item> LOST_WORLDS_BOOK = ITEMS.register("lost_worlds_book", () -> new Item(new Item.Properties().stacksTo(1)));


    //Projectiles
    public static final DeferredItem<Item> DICE = ITEMS.register("dice", () -> new DiceItem(new Item.Properties()));

    //Portal Item
    public static final DeferredItem<Item> BASIC_PORTAL_ACTIVATOR = ITEMS.register("basic_portal_activator", () -> new PortalActivatorItem(0));

    //Portal Core
    public static final DeferredItem<Item> BASIC_PORTAL_CORE = ITEMS.register("basic_portal_core", () -> new Item(new Item.Properties().rarity(Rarity.UNCOMMON)));

    public static DeferredItem<Item> registerItem(String name) {
        return ITEMS.register(name, () -> new Item(new Item.Properties()));
    }
    public static DeferredItem<Item> registerItem(String name, Item.Properties properties) {
        return ITEMS.register(name, () -> new Item(properties));
    }

    public static DeferredItem<Item> registerFoodItem(String name, FoodProperties foodProperties) {
        return ITEMS.register(name, () -> new Item(new Item.Properties().food(foodProperties)));
    }
    public static DeferredItem<Item> registerFoodItem(String name, Item.Properties properties, FoodProperties foodProperties) {
        return ITEMS.register(name, () -> new Item(properties.food(foodProperties)));
    }

    public static DeferredItem<Item> registerMagicalItem(String name, MagicProperties magicProperties) {
        return ITEMS.register(name, () -> new MagicalItem(new Item.Properties(), magicProperties));
    }

    public static DeferredItem<Item> registerMagicalItem(String name, Item.Properties properties, MagicProperties magicProperties) {
        return ITEMS.register(name, () -> new MagicalItem(properties, magicProperties));
    }


    public static DeferredItem<Item> registerMusicDisc(String name, ResourceKey<JukeboxSong> song) {
        return ITEMS.register(name, () -> new Item(new Item.Properties().stacksTo(1).rarity(Rarity.RARE).jukeboxPlayable(song)));
    }

    public static DeferredItem<Item> registerHorseArmour(String name, Holder<ArmorMaterial> armorMaterial) {
        return ITEMS.register(name + "_horse_armor", () -> new AnimalArmorItem(
                armorMaterial, AnimalArmorItem.BodyType.EQUESTRIAN, false, new Item.Properties().stacksTo(1)
        ));

    }

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
