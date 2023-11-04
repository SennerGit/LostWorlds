package net.sen.lostworlds.item;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.*;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.sen.lostworlds.LostWorlds;
import net.sen.lostworlds.block.ModBlocks;
import net.sen.lostworlds.compat.modonomicon.LostWorldsBookItem;
import net.sen.lostworlds.entity.ModEntities;
import net.sen.lostworlds.fluid.ModFluids;
import net.sen.lostworlds.item.custom.*;
import net.sen.lostworlds.sound.ModSounds;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, LostWorlds.MODID);

    /*
     *   Crimson Dimension
     */
    public static final RegistryObject<Item> MAGICAL_DOWSING_ROD = ITEMS.register("magical_dowsing_rod", () -> new MagicalDowsingRod(new Item.Properties().durability(512)));

    /*
     *   Crimson Dimension
     */
    //Crimson Diamond
    public static final RegistryObject<Item> CRIMSON_DIAMOND = ITEMS.register("crimson_diamond", () -> new Item(new Item.Properties()));

    //Nether Steel
    public static final RegistryObject<Item> NETHER_STEEL_INGOT = ITEMS.register("nether_steel_ingot", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> NETHER_STEEL_NUGGET = ITEMS.register("nether_steel_nugget", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_NETHER_STEEL = ITEMS.register("raw_nether_steel", () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> NETHER_STEEL_SWORD = ITEMS.register("nether_steel_sword", () -> new CrimsonSwordItem(ModToolTiers.NETHER_STEEL, 2, 3, new Item.Properties().durability(256)));
    public static final RegistryObject<Item> NETHER_STEEL_PICKAXE = ITEMS.register("nether_steel_pickaxe", () -> new PickaxeItem(ModToolTiers.NETHER_STEEL, 1, 2,new Item.Properties().durability(256)));
    public static final RegistryObject<Item> NETHER_STEEL_SHOVEL = ITEMS.register("nether_steel_shovel", () -> new ShovelItem(ModToolTiers.NETHER_STEEL, 1,  2,new Item.Properties().durability(256)));
    public static final RegistryObject<Item> NETHER_STEEL_AXE = ITEMS.register("nether_steel_axe", () -> new AxeItem(ModToolTiers.NETHER_STEEL, 3, 4,new Item.Properties().durability(256)));
    public static final RegistryObject<Item> NETHER_STEEL_HOE = ITEMS.register("nether_steel_hoe", () -> new HoeItem(ModToolTiers.NETHER_STEEL, 1, 2,new Item.Properties().durability(256)));
    public static final RegistryObject<Item> NETHER_STEEL_PAXEL = ITEMS.register("nether_steel_paxel", () -> new PaxelItem(ModToolTiers.NETHER_STEEL, 1, 2,new Item.Properties().durability(256)));
    public static final RegistryObject<Item> NETHER_STEEL_HAMMER = ITEMS.register("nether_steel_hammer", () -> new HammerItem(ModToolTiers.NETHER_STEEL, 1, 2,new Item.Properties().durability(256)));

    public static final RegistryObject<Item> NETHER_STEEL_HELMET = ITEMS.register("nether_steel_helmet", () -> new ModArmorItem(ModArmourMaterials.NETHER_STEEL, ArmorItem.Type.HELMET, new Item.Properties().durability(256)));
    public static final RegistryObject<Item> NETHER_STEEL_CHESTPLATE = ITEMS.register("nether_steel_chestplate", () -> new ModArmorItem(ModArmourMaterials.NETHER_STEEL, ArmorItem.Type.CHESTPLATE, new Item.Properties().durability(256)));
    public static final RegistryObject<Item> NETHER_STEEL_LEGGINGS = ITEMS.register("nether_steel_leggings", () -> new ModArmorItem(ModArmourMaterials.NETHER_STEEL, ArmorItem.Type.LEGGINGS, new Item.Properties().durability(256)));
    public static final RegistryObject<Item> NETHER_STEEL_BOOTS = ITEMS.register("nether_steel_boots", () -> new ModArmorItem(ModArmourMaterials.NETHER_STEEL, ArmorItem.Type.BOOTS, new Item.Properties().durability(256)));
    public static final RegistryObject<Item> NETHER_STEEL_HORSE_ARMOR = ITEMS.register("nether_steel_horse_armor", () -> new HorseArmorItem(12, new ResourceLocation(LostWorlds.MODID, "textures/entity/horse/armor/horse_armor_nether_steel.png"), new Item.Properties().durability(256)));

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
     *   Greek Myth Metals
     */
    //Orichalcum
    //https://en.wikipedia.org/wiki/Orichalcum
    public static final RegistryObject<Item> ORICHALCUM_INGOT = ITEMS.register("orichalcum_ingot", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_ORICHALCUM = ITEMS.register("raw_orichalcum", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ORICHALCUM_NUGGET = ITEMS.register("orichalcum_nugget", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ORICHALCUM_SWORD = ITEMS.register("orichalcum_sword", () -> new CrimsonSwordItem(ModToolTiers.ORICHALCUM, 2, 3, new Item.Properties().durability(256)));
    public static final RegistryObject<Item> ORICHALCUM_PICKAXE = ITEMS.register("orichalcum_pickaxe", () -> new PickaxeItem(ModToolTiers.ORICHALCUM, 1, 2,new Item.Properties().durability(256)));
    public static final RegistryObject<Item> ORICHALCUM_SHOVEL = ITEMS.register("orichalcum_shovel", () -> new ShovelItem(ModToolTiers.ORICHALCUM, 1,  2,new Item.Properties().durability(256)));
    public static final RegistryObject<Item> ORICHALCUM_AXE = ITEMS.register("orichalcum_axe", () -> new AxeItem(ModToolTiers.ORICHALCUM, 3, 4,new Item.Properties().durability(256)));
    public static final RegistryObject<Item> ORICHALCUM_HOE = ITEMS.register("orichalcum_hoe", () -> new HoeItem(ModToolTiers.ORICHALCUM, 1, 2,new Item.Properties().durability(256)));

    public static final RegistryObject<Item> ORICHALCUM_HELMET = ITEMS.register("orichalcum_helmet", () -> new ModArmorItem(ModArmourMaterials.ORICHALCUM, ArmorItem.Type.HELMET, new Item.Properties().durability(256)));
    public static final RegistryObject<Item> ORICHALCUM_CHESTPLATE = ITEMS.register("orichalcum_chestplate", () -> new ModArmorItem(ModArmourMaterials.ORICHALCUM, ArmorItem.Type.CHESTPLATE, new Item.Properties().durability(256)));
    public static final RegistryObject<Item> ORICHALCUM_LEGGINGS = ITEMS.register("orichalcum_leggings", () -> new ModArmorItem(ModArmourMaterials.ORICHALCUM, ArmorItem.Type.LEGGINGS, new Item.Properties().durability(256)));
    public static final RegistryObject<Item> ORICHALCUM_BOOTS = ITEMS.register("orichalcum_boots", () -> new ModArmorItem(ModArmourMaterials.ORICHALCUM, ArmorItem.Type.BOOTS, new Item.Properties().durability(256)));
    public static final RegistryObject<Item> ORICHALCUM_HORSE_ARMOR = registerHorseArmour("orichalcum", 12, 256);

    //Adamant
    //https://en.wikipedia.org/wiki/Adamant
    public static final RegistryObject<Item> ADAMANT = ITEMS.register("adamant_ingot", () -> new Item(new Item.Properties()));

    /*
     * Food and Stuff
     */
    //Food
    public static final RegistryObject<Item> CRIMSON_APPLE = ITEMS.register("crimson_apple", () -> new Item(new Item.Properties().food(ModFoodProperties.CRIMSON_APPLE)));
    public static final RegistryObject<Item> POMEGRANATE = ITEMS.register("pomegranate", () -> new Item(new Item.Properties().food(ModFoodProperties.POMEGRANATE)));

    public static final RegistryObject<Item> POMEGRANATE_SEEDS = ITEMS.register("pomegranate_seeds", () -> new ItemNameBlockItem(ModBlocks.POMEGRANATE_CROP_BLOCK.get(), new Item.Properties()));

    public static final RegistryObject<Item> BAR_BRAWL_RECORD = ITEMS.register("bar_brawl_record", () -> new RecordItem(4, ModSounds.BAR_BRAWL, new Item.Properties().stacksTo(1), 2440));

    //Fuel
    public static final RegistryObject<Item> CRIMSON_TEAR = ITEMS.register("crimson_tear", () -> new FuelItem(new Item.Properties(), 200));

    //Special Items
    public static final RegistryObject<Item> DATA_TABLET = ITEMS.register("data_tablet", () -> new DataTabletItem(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> MEDUSA_HEAD = ITEMS.register("gorgan_head", () -> new MedusaHeadItem(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> CUSTOM_BOW = ITEMS.register("custom_bow", () -> new BowItem(new Item.Properties().durability(500)));
    public static final RegistryObject<Item> ALEXANDRITE_SHIELD = ITEMS.register("alexandrite_shield", () -> new ShieldItem(new Item.Properties().durability(500)));
    public static final RegistryObject<Item> STYX_WATER_BUCKET = ITEMS.register("styx_water_bucket", () -> new BucketItem(ModFluids.SOURCE_STYX_WATER, new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1)));

    /*
     * WOOD TYPES
     */
    //Elder Wood
    public static final RegistryObject<Item> ELDER_WOOD_SIGN = ITEMS.register("elder_wood_sign", () -> new SignItem(new Item.Properties().craftRemainder(Items.OAK_SIGN).stacksTo(16), ModBlocks.ELDER_WOOD_PLANKS_SIGN.get(), ModBlocks.ELDER_WOOD_PLANKS_WALL_SIGN.get()));
    public static final RegistryObject<Item> ELDER_WOOD_HANGING_SIGN = ITEMS.register("elder_wood_hanging_sign", () -> new HangingSignItem(ModBlocks.ELDER_WOOD_PLANKS_HANGING_SIGN.get(), ModBlocks.ELDER_WOOD_PLANKS_WALL_HANGING_SIGN.get(), new Item.Properties().craftRemainder(Items.OAK_SIGN).stacksTo(16)));

    //Book
    public static final RegistryObject<LostWorldsBookItem> LOST_WORLDS_BOOK = ITEMS.register("lost_worlds_book", () -> new LostWorldsBookItem(new Item.Properties().stacksTo(1)));

    //Spawn Egg
    public static final RegistryObject<Item> RHINO_SPAWN_EGG = ITEMS.register("rhino_spawn_egg", () -> new ForgeSpawnEggItem(ModEntities.RHINO, 0x7e9680, 0xc5d1c5, new Item.Properties()));

    //Projectiles
    public static final RegistryObject<Item> DICE = ITEMS.register("dice", () -> new DiceItem(new Item.Properties()));

    //Portal Item
    public static final RegistryObject<Item> BASIC_PORTAL_ACTIVATOR = ITEMS.register("underworld_portal_activator", PortalActivatorItem::new);

    public static RegistryObject<Item> registerHorseArmour(String name, int pProtection, int pMaxDamage) {
        return ITEMS.register(name + "_horse_armor", () -> new HorseArmorItem(
                pProtection,
                new ResourceLocation(LostWorlds.MODID, "textures/entity/horse/armor/horse_armor_" + name + ".png"),
                new Item.Properties().durability(pMaxDamage)));

    }

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
