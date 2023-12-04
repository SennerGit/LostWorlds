package net.sen.lostworlds.datagen.language;

import net.minecraft.data.PackOutput;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.entity.decoration.PaintingVariant;
import net.minecraft.world.entity.npc.VillagerProfession;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.alchemy.Potion;
import net.minecraftforge.common.data.LanguageProvider;
import net.minecraftforge.registries.RegistryObject;
import net.sen.lostworlds.LostWorlds;
import net.sen.lostworlds.block.ModBlocks;
import net.sen.lostworlds.effect.ModEffects;
import net.sen.lostworlds.enchantment.ModEnchantments;
import net.sen.lostworlds.item.ModCreativeModeTabs;
import net.sen.lostworlds.item.ModItems;
import net.sen.lostworlds.painting.ModPaintings;
import net.sen.lostworlds.potion.ModPotions;
import net.sen.lostworlds.sound.ModSounds;
import net.sen.lostworlds.villager.ModVillagers;

public class ModLanguageEnUsProvider extends LanguageProvider {
    public ModLanguageEnUsProvider(PackOutput output, String locale) {
        super(output, LostWorlds.MODID, locale);
    }

    @Override
    protected void addTranslations() {
        //Custom Blocks/Items
        this.addItem(ModItems.MAGICAL_DOWSING_ROD, "Magical Dowsing Rod");
        this.addBlock(ModBlocks.SOUND_BLOCK, "Sound Block");
        this.addBlock(ModBlocks.ALLOY_SMELTER, "Alloy Smelter");

        /*
         * TREES
         */
        //Elder Wood
        this.addBlock(ModBlocks.ELDER_WOOD_LOG, "Elder Wood Log");
        this.addBlock(ModBlocks.ELDER_WOOD, "Elder Wood");
        this.addBlock(ModBlocks.STRIPPED_ELDER_WOOD_LOG, "Elder Wood Log Stripped");
        this.addBlock(ModBlocks.STRIPPED_ELDER_WOOD, "Elder Wood Stripped");
        this.addBlock(ModBlocks.ELDER_WOOD_PLANKS, "Elder Wood Planks");
        this.addBlock(ModBlocks.ELDER_WOOD_LEAVES, "Elder Wood Leaves");
        this.addBlock(ModBlocks.ELDER_WOOD_SAPLING, "Elder Wood Sapling");
        this.addBlock(ModBlocks.ELDER_WOOD_PLANKS_SLAB, "Elder Wood Slab");
        this.addBlock(ModBlocks.ELDER_WOOD_PLANKS_STAIRS, "Elder Wood Stairs");
        this.addBlock(ModBlocks.ELDER_WOOD_PLANKS_PRESSURE_PLATE, "Elder Wood Pressure Plate");
        this.addBlock(ModBlocks.ELDER_WOOD_PLANKS_DOOR, "Elder Wood Door");
        this.addBlock(ModBlocks.ELDER_WOOD_PLANKS_TRAPDOOR, "Elder Wood Trapdoor");
        this.addBlock(ModBlocks.ELDER_WOOD_PLANKS_FENCE, "Elder Wood Fence");
        this.addBlock(ModBlocks.ELDER_WOOD_PLANKS_FENCE_GATE, "Elder Wood Fence Gate");
        this.addBlock(ModBlocks.ELDER_WOOD_PLANKS_BUTTON, "Elder Wood Button");
        this.addBlock(ModBlocks.ELDER_WOOD_PLANKS_SIGN, "Elder Wood Sign");
        this.addBlock(ModBlocks.ELDER_WOOD_PLANKS_HANGING_SIGN, "Elder Wood Hanging Sign");

        //Olive
        this.addBlock(ModBlocks.OLIVE_LOG, "Olive Log");
        this.addBlock(ModBlocks.OLIVE_WOOD, "Olive Wood");
        this.addBlock(ModBlocks.STRIPPED_OLIVE_LOG, "Olive Log Stripped");
        this.addBlock(ModBlocks.STRIPPED_OLIVE_WOOD, "Olive Wood Stripped");
        this.addBlock(ModBlocks.OLIVE_PLANKS, "Olive Planks");
        this.addBlock(ModBlocks.OLIVE_LEAVES, "Olive Leaves");
        this.addBlock(ModBlocks.OLIVE_SAPLING, "Olive Sapling");
        this.addBlock(ModBlocks.OLIVE_PLANKS_SLAB, "Olive Slab");
        this.addBlock(ModBlocks.OLIVE_PLANKS_STAIRS, "Olive Stairs");
        this.addBlock(ModBlocks.OLIVE_PLANKS_PRESSURE_PLATE, "Olive Pressure Plate");
        this.addBlock(ModBlocks.OLIVE_PLANKS_DOOR, "Olive Door");
        this.addBlock(ModBlocks.OLIVE_PLANKS_TRAPDOOR, "Olive Trapdoor");
        this.addBlock(ModBlocks.OLIVE_PLANKS_FENCE, "Olive Fence");
        this.addBlock(ModBlocks.OLIVE_PLANKS_FENCE_GATE, "Olive Fence Gate");
        this.addBlock(ModBlocks.OLIVE_PLANKS_BUTTON, "Olive Button");
        this.addBlock(ModBlocks.OLIVE_PLANKS_SIGN, "Olive Sign");
        this.addBlock(ModBlocks.OLIVE_PLANKS_HANGING_SIGN, "Olive Hanging Sign");

        //Myrrh
        this.addBlock(ModBlocks.MYRRH_LOG, "Myrrh Log");
        this.addBlock(ModBlocks.MYRRH_WOOD, "Myrrh Wood");
        this.addBlock(ModBlocks.STRIPPED_MYRRH_LOG, "Myrrh Log Stripped");
        this.addBlock(ModBlocks.STRIPPED_MYRRH_WOOD, "Myrrh Wood Stripped");
        this.addBlock(ModBlocks.MYRRH_PLANKS, "Myrrh Planks");
        this.addBlock(ModBlocks.MYRRH_LEAVES, "Myrrh Leaves");
        this.addBlock(ModBlocks.MYRRH_SAPLING, "Myrrh Sapling");
        this.addBlock(ModBlocks.MYRRH_PLANKS_SLAB, "Myrrh Slab");
        this.addBlock(ModBlocks.MYRRH_PLANKS_STAIRS, "Myrrh Stairs");
        this.addBlock(ModBlocks.MYRRH_PLANKS_PRESSURE_PLATE, "Myrrh Pressure Plate");
        this.addBlock(ModBlocks.MYRRH_PLANKS_DOOR, "Myrrh Door");
        this.addBlock(ModBlocks.MYRRH_PLANKS_TRAPDOOR, "Myrrh Trapdoor");
        this.addBlock(ModBlocks.MYRRH_PLANKS_FENCE, "Myrrh Fence");
        this.addBlock(ModBlocks.MYRRH_PLANKS_FENCE_GATE, "Myrrh Fence Gate");
        this.addBlock(ModBlocks.MYRRH_PLANKS_BUTTON, "Myrrh Button");
        this.addBlock(ModBlocks.MYRRH_PLANKS_SIGN, "Myrrh Sign");
        this.addBlock(ModBlocks.MYRRH_PLANKS_HANGING_SIGN, "Myrrh Hanging Sign");

        //Laurel
        this.addBlock(ModBlocks.LAUREL_LOG, "Laurel Log");
        this.addBlock(ModBlocks.LAUREL_WOOD, "Laurel Wood");
        this.addBlock(ModBlocks.STRIPPED_LAUREL_LOG, "Laurel Log Stripped");
        this.addBlock(ModBlocks.STRIPPED_LAUREL_WOOD, "Laurel Wood Stripped");
        this.addBlock(ModBlocks.LAUREL_PLANKS, "Laurel Planks");
        this.addBlock(ModBlocks.LAUREL_LEAVES, "Laurel Leaves");
        this.addBlock(ModBlocks.LAUREL_SAPLING, "Laurel Sapling");
        this.addBlock(ModBlocks.LAUREL_PLANKS_SLAB, "Laurel Slab");
        this.addBlock(ModBlocks.LAUREL_PLANKS_STAIRS, "Laurel Stairs");
        this.addBlock(ModBlocks.LAUREL_PLANKS_PRESSURE_PLATE, "Laurel Pressure Plate");
        this.addBlock(ModBlocks.LAUREL_PLANKS_DOOR, "Laurel Door");
        this.addBlock(ModBlocks.LAUREL_PLANKS_TRAPDOOR, "Laurel Trapdoor");
        this.addBlock(ModBlocks.LAUREL_PLANKS_FENCE, "Laurel Fence");
        this.addBlock(ModBlocks.LAUREL_PLANKS_FENCE_GATE, "Laurel Fence Gate");
        this.addBlock(ModBlocks.LAUREL_PLANKS_BUTTON, "Laurel Button");
        this.addBlock(ModBlocks.LAUREL_PLANKS_SIGN, "Laurel Sign");
        this.addBlock(ModBlocks.LAUREL_PLANKS_HANGING_SIGN, "Laurel Hanging Sign");

        //Cypress
        this.addBlock(ModBlocks.CYPRESS_LOG, "Cypress Log");
        this.addBlock(ModBlocks.CYPRESS_WOOD, "Cypress Wood");
        this.addBlock(ModBlocks.STRIPPED_CYPRESS_LOG, "Cypress Log Stripped");
        this.addBlock(ModBlocks.STRIPPED_CYPRESS_WOOD, "Cypress Wood Stripped");
        this.addBlock(ModBlocks.CYPRESS_PLANKS, "Cypress Planks");
        this.addBlock(ModBlocks.CYPRESS_LEAVES, "Cypress Leaves");
        this.addBlock(ModBlocks.CYPRESS_SAPLING, "Cypress Sapling");
        this.addBlock(ModBlocks.CYPRESS_PLANKS_SLAB, "Cypress Slab");
        this.addBlock(ModBlocks.CYPRESS_PLANKS_STAIRS, "Cypress Stairs");
        this.addBlock(ModBlocks.CYPRESS_PLANKS_PRESSURE_PLATE, "Cypress Pressure Plate");
        this.addBlock(ModBlocks.CYPRESS_PLANKS_DOOR, "Cypress Door");
        this.addBlock(ModBlocks.CYPRESS_PLANKS_TRAPDOOR, "Cypress Trapdoor");
        this.addBlock(ModBlocks.CYPRESS_PLANKS_FENCE, "Cypress Fence");
        this.addBlock(ModBlocks.CYPRESS_PLANKS_FENCE_GATE, "Cypress Fence Gate");
        this.addBlock(ModBlocks.CYPRESS_PLANKS_BUTTON, "Cypress Button");
        this.addBlock(ModBlocks.CYPRESS_PLANKS_SIGN, "Cypress Sign");
        this.addBlock(ModBlocks.CYPRESS_PLANKS_HANGING_SIGN, "Cypress Hanging Sign");

        //Nether Steel
        this.addItem(ModItems.CRIMSON_DIAMOND, "Crimson Diamond");
        this.addItem(ModItems.NETHER_STEEL_INGOT, "Nether Steel Ingot");
        this.addItem(ModItems.NETHER_STEEL_NUGGET, "Nether Steel Nugget");
        this.addItem(ModItems.RAW_NETHER_STEEL, "Raw Nether Steel");
        this.addItem(ModItems.CRIMSON_APPLE, "Crimson Apple");
        this.addItem(ModItems.POMEGRANATE, "Pomegranate");
        this.addItem(ModItems.OLIVE, "Olive");
        this.addItem(ModItems.CRIMSON_TEAR, "Crimson Tear");
        this.addItem(ModItems.CUSTOM_BOW, "Custom Bow");
        this.addItem(ModItems.ALEXANDRITE_SHIELD, "Alexandrite Shield");
        this.addItem(ModItems.MEDUSA_HEAD, "Medusa Head");

        this.addItem(ModItems.NETHER_STEEL_SWORD, "Nether Steel Sword");
        this.addItem(ModItems.NETHER_STEEL_PICKAXE, "Nether Steel Pickaxe");
        this.addItem(ModItems.NETHER_STEEL_SHOVEL, "Nether Steel Shovel");
        this.addItem(ModItems.NETHER_STEEL_AXE, "Nether Steel Axe");
        this.addItem(ModItems.NETHER_STEEL_HOE, "Nether Steel Hoe");
        this.addItem(ModItems.NETHER_STEEL_PAXEL, "Nether Steel Paxel");
        this.addItem(ModItems.NETHER_STEEL_HAMMER, "Nether Steel Hammer");

        this.addItem(ModItems.NETHER_STEEL_HELMET, "Nether Steel Helmet");
        this.addItem(ModItems.NETHER_STEEL_CHESTPLATE, "Nether Steel Chestplate");
        this.addItem(ModItems.NETHER_STEEL_LEGGINGS, "Nether Steel Leggings");
        this.addItem(ModItems.NETHER_STEEL_BOOTS, "Nether Steel Boots");

        this.addItem(ModItems.NETHER_STEEL_HORSE_ARMOR, "Nether Steel Horse Armor");
        this.addItem(ModItems.DATA_TABLET, "Data Tablet");

        this.addItem(ModItems.POMEGRANATE_SEEDS, "Pomegranate Seeds");

        this.addBlock(ModBlocks.CRIMSON_DIAMOND_BLOCK, "Crimson Diamond Block");
        this.addBlock(ModBlocks.CRIMSON_DIAMOND_LAMP, "Crimson Diamond Lamp");

        this.addBlock(ModBlocks.NETHER_STEEL_BLOCK, "Nether Steel Block");
        this.addBlock(ModBlocks.RAW_NETHER_STEEL_BLOCK, "Raw Nether Steel Block");
        this.addBlock(ModBlocks.NETHER_STEEL_ORE, "Nether Steel Ore");
        this.addBlock(ModBlocks.DEEPSLATE_NETHER_STEEL_ORE, "Deepslate Nether Steel Ore");

        //Orichalcum
        this.addBlock(ModBlocks.ORICHALCUM_BLOCK, "Orichalcum Block");
        this.addBlock(ModBlocks.RAW_ORICHALCUM_BLOCK, "Raw Orichalcum Block");
        this.addBlock(ModBlocks.ORICHALCUM_ORE, "Orichalcum Ore");
        this.addBlock(ModBlocks.DEEPSLATE_ORICHALCUM_ORE, "Deepslate Orichalcum Ore");
        this.addItem(ModItems.ORICHALCUM_INGOT, "Orichalcum Ingot");
        this.addItem(ModItems.RAW_ORICHALCUM, "Raw Orichalcum");
        this.addItem(ModItems.ORICHALCUM_NUGGET, "Orichalcum Nugget");

        this.addItem(ModItems.ORICHALCUM_SWORD, "Orichalcum Sword");
        this.addItem(ModItems.ORICHALCUM_PICKAXE, "Orichalcum Pickaxe");
        this.addItem(ModItems.ORICHALCUM_SHOVEL, "Orichalcum Shovel");
        this.addItem(ModItems.ORICHALCUM_AXE, "Orichalcum Axe");
        this.addItem(ModItems.ORICHALCUM_HOE, "Orichalcum Hoe");

        this.addItem(ModItems.ORICHALCUM_HELMET, "Orichalcum Helmet");
        this.addItem(ModItems.ORICHALCUM_CHESTPLATE, "Orichalcum Chestplate");
        this.addItem(ModItems.ORICHALCUM_LEGGINGS, "Orichalcum Leggings");
        this.addItem(ModItems.ORICHALCUM_BOOTS, "Orichalcum Boots");

        this.addItem(ModItems.ORICHALCUM_HORSE_ARMOR, "Orichalcum Horse Armor");

        //Zinc
        this.addBlock(ModBlocks.ZINC_BLOCK, "Zinc Block");
        this.addBlock(ModBlocks.RAW_ZINC_BLOCK, "Raw Zinc Block");
        this.addBlock(ModBlocks.ZINC_ORE, "Zinc Ore");
        this.addBlock(ModBlocks.DEEPSLATE_ZINC_ORE, "Deepslate Zinc Ore");
        this.addItem(ModItems.ZINC_INGOT, "Zinc Ingot");
        this.addItem(ModItems.RAW_ZINC, "Raw Zinc");
        this.addItem(ModItems.ZINC_NUGGET, "Zinc Nugget");

        this.addItem(ModItems.ZINC_SWORD, "Zinc Sword");
        this.addItem(ModItems.ZINC_PICKAXE, "Zinc Pickaxe");
        this.addItem(ModItems.ZINC_SHOVEL, "Zinc Shovel");
        this.addItem(ModItems.ZINC_AXE, "Zinc Axe");
        this.addItem(ModItems.ZINC_HOE, "Zinc Hoe");

        this.addItem(ModItems.ZINC_HELMET, "Zinc Helmet");
        this.addItem(ModItems.ZINC_CHESTPLATE, "Zinc Chestplate");
        this.addItem(ModItems.ZINC_LEGGINGS, "Zinc Leggings");
        this.addItem(ModItems.ZINC_BOOTS, "Zinc Boots");

        this.addItem(ModItems.ZINC_HORSE_ARMOR, "Zinc Horse Armor");

        //Tin
        this.addBlock(ModBlocks.TIN_BLOCK, "Tin Block");
        this.addBlock(ModBlocks.RAW_TIN_BLOCK, "Raw Tin Block");
        this.addBlock(ModBlocks.TIN_ORE, "Tin Ore");
        this.addBlock(ModBlocks.DEEPSLATE_TIN_ORE, "Deepslate Tin Ore");
        this.addItem(ModItems.TIN_INGOT, "Tin Ingot");
        this.addItem(ModItems.RAW_TIN, "Raw Tin");
        this.addItem(ModItems.TIN_NUGGET, "Tin Nugget");

        this.addItem(ModItems.TIN_SWORD, "Tin Sword");
        this.addItem(ModItems.TIN_PICKAXE, "Tin Pickaxe");
        this.addItem(ModItems.TIN_SHOVEL, "Tin Shovel");
        this.addItem(ModItems.TIN_AXE, "Tin Axe");
        this.addItem(ModItems.TIN_HOE, "Tin Hoe");

        this.addItem(ModItems.TIN_HELMET, "Tin Helmet");
        this.addItem(ModItems.TIN_CHESTPLATE, "Tin Chestplate");
        this.addItem(ModItems.TIN_LEGGINGS, "Tin Leggings");
        this.addItem(ModItems.TIN_BOOTS, "Tin Boots");

        this.addItem(ModItems.TIN_HORSE_ARMOR, "Tin Horse Armor");

        //Aurichalcite
        this.addBlock(ModBlocks.AURICHALCITE_BLOCK, "Aurichalcite Block");
        this.addItem(ModItems.AURICHALCITE, "Aurichalcite");

        //Brass
        this.addBlock(ModBlocks.BRASS_BLOCK, "Brass Block");
        this.addItem(ModItems.BRASS_INGOT, "Brass Ingot");
        this.addItem(ModItems.BRASS_NUGGET, "Brass Nugget");

        this.addItem(ModItems.BRASS_SWORD, "Brass Sword");
        this.addItem(ModItems.BRASS_PICKAXE, "Brass Pickaxe");
        this.addItem(ModItems.BRASS_SHOVEL, "Brass Shovel");
        this.addItem(ModItems.BRASS_AXE, "Brass Axe");
        this.addItem(ModItems.BRASS_HOE, "Brass Hoe");

        this.addItem(ModItems.BRASS_HELMET, "Brass Helmet");
        this.addItem(ModItems.BRASS_CHESTPLATE, "Brass Chestplate");
        this.addItem(ModItems.BRASS_LEGGINGS, "Brass Leggings");
        this.addItem(ModItems.BRASS_BOOTS, "Brass Boots");

        this.addItem(ModItems.BRASS_HORSE_ARMOR, "Brass Horse Armor");

        //Bronze
        this.addBlock(ModBlocks.BRONZE_BLOCK, "Bronze Block");
        this.addItem(ModItems.BRONZE_INGOT, "Bronze Ingot");
        this.addItem(ModItems.BRONZE_NUGGET, "Bronze Nugget");

        this.addItem(ModItems.BRONZE_SWORD, "Bronze Sword");
        this.addItem(ModItems.BRONZE_PICKAXE, "Bronze Pickaxe");
        this.addItem(ModItems.BRONZE_SHOVEL, "Bronze Shovel");
        this.addItem(ModItems.BRONZE_AXE, "Bronze Axe");
        this.addItem(ModItems.BRONZE_HOE, "Bronze Hoe");

        this.addItem(ModItems.BRONZE_HELMET, "Bronze Helmet");
        this.addItem(ModItems.BRONZE_CHESTPLATE, "Bronze Chestplate");
        this.addItem(ModItems.BRONZE_LEGGINGS, "Bronze Leggings");
        this.addItem(ModItems.BRONZE_BOOTS, "Bronze Boots");

        this.addItem(ModItems.BRONZE_HORSE_ARMOR, "Bronze Horse Armor");

        //Spawm Eggs
        this.addItem(ModItems.RHINO_SPAWN_EGG, "Rhino Spawn Egg");
        this.addItem(ModItems.SHARK_SPAWN_EGG, "Shark Spawn Egg");
        this.addItem(ModItems.MORAY_EELS_SPAWN_EGG, "Moray Eels Spawn Egg");
        this.addItem(ModItems.ELECTRIC_EELS_SPAWN_EGG, "Electric_eels Spawn Egg");
        this.addItem(ModItems.JELLYFISH_SPAWN_EGG, "Jellyfish Spawn Egg");
        this.addItem(ModItems.GIANT_SQUID_SPAWN_EGG, "Giant Squid Spawn Egg");
        this.addItem(ModItems.RAY_SPAWN_EGG, "Ray Spawn Egg");
        this.addItem(ModItems.GIANT_OCTOPUS_SPAWN_EGG, "Giant Octopus Spawn Egg");
        this.addItem(ModItems.NUDIBRANCH_SLUG_SPAWN_EGG, "Nudibranch Slug Spawn Egg");
        this.addItem(ModItems.GREAT_WHITE_SPAWN_EGG, "Great White Spawn Egg");
        this.addItem(ModItems.ANGLER_FISH_SPAWN_EGG, "Angler Fish Spawn Egg");
        this.addItem(ModItems.SEAHORSE_SPAWN_EGG, "Seahorse Spawn Egg");
        this.addItem(ModItems.CLOWNFISH_SPAWN_EGG, "Clownfish Spawn Egg");
        this.addItem(ModItems.ATLANTIAN_GURDIAN_SPAWN_EGG, "Atlantian_gurdian Spawn Egg");
        this.addItem(ModItems.SIREN_SPAWN_EGG, "Siren Spawn Egg");
        this.addItem(ModItems.MERFOLK_SPAWN_EGG, "Merfolk Spawn Egg");
        this.addItem(ModItems.ATLANTIAN_SPAWN_EGG, "Atlantian Spawn Egg");
        this.addItem(ModItems.TANG_FISH_SPAWN_EGG, "Tang Fish Spawn Egg");
        this.addItem(ModItems.TUNA_SPAWN_EGG, "Tuna Spawn Egg");

        //Misc
        this.addItem(ModItems.SHARK_TOOTH, "Shark Tooth");

        //Adamant
        this.addBlock(ModBlocks.ADAMANT_BLOCK, "Adamant Block");
        this.addBlock(ModBlocks.ADAMANT_ORE, "Adamant Ore");
        this.addBlock(ModBlocks.DEEPSLATE_ADAMANT_ORE, "Deepslate Adamant Ore");
        this.addItem(ModItems.ADAMANT, "Adamant");

        this.addBlock(ModBlocks.CRIMSON_STONE, "Crimson Stone");
        this.addBlock(ModBlocks.CRIMSON_STONE_STAIRS, "Crimson Stone Stairs");
        this.addBlock(ModBlocks.CRIMSON_STONE_SLAB, "Crimson Stone Slab");
        this.addBlock(ModBlocks.CRIMSON_STONE_PRESSURE_PLATE, "Crimson Stone Pressure Plate");
        this.addBlock(ModBlocks.CRIMSON_STONE_BUTTON, "Crimson Stone Button");
        this.addBlock(ModBlocks.CRIMSON_STONE_FENCE, "Crimson Stone Fence");
        this.addBlock(ModBlocks.CRIMSON_STONE_DOOR, "Crimson Stone Door");
        this.addBlock(ModBlocks.CRIMSON_STONE_TRAPDOOR, "Crimson Stone Trapdoor");
        this.addBlock(ModBlocks.CRIMSON_STONE_FENCE_GATE, "Crimson Stone Fence Gate");
        this.addBlock(ModBlocks.CRIMSON_STONE_WALL, "Crimson Stone Wall");
        this.addBlock(ModBlocks.CRIMSON_COBBLESTONE, "Crimson Cobblestone");
        this.addBlock(ModBlocks.CRIMSON_COBBLESTONE_STAIRS, "Crimson Cobblestone Stairs");
        this.addBlock(ModBlocks.CRIMSON_COBBLESTONE_SLAB, "Crimson Cobblestone Slab");
        this.addBlock(ModBlocks.CRIMSON_STONE_BRICKS, "Crimson Stone Bricks");
        this.addBlock(ModBlocks.CRIMSON_STONE_BRICK_STAIRS, "Crimson Stone Brick Stairs");
        this.addBlock(ModBlocks.CRIMSON_STONE_BRICK_SLAB, "Crimson Stone Brick Slab");

        this.addItem(ModItems.STYX_WATER_BUCKET, "Styx Water Bucket");

        this.addItem(ModItems.CLOWNFISH_BUCKET, "Clownfish In Water Bucket");
        this.addItem(ModItems.TANG_FISH_BUCKET, "Tang Fish In Water Bucket");

        this.addItem(ModItems.CLOWNFISH, "Clownfish");
        this.addItem(ModItems.COOKED_CLOWNFISH, "Cooked Clownfish");

        this.addItem(ModItems.RAW_TUNA, "Raw Tuna");
        this.addItem(ModItems.COOKED_TUNA, "Cooked Tuna");

        this.addItem(ModItems.TANG_FISH, "Tang Fish");
        this.addItem(ModItems.COOKED_TANG_FISH, "Cooked Tang Fish");

        addProfession(ModVillagers.ALLOY_MASTER, "Alloy Master");

        this.addBlock(ModBlocks.IRIS_FLOWER, "Iris");

        this.addEnchantment(ModEnchantments.LIGHTNING_STRIKER, "Lightning Striker");

        this.addItem(ModItems.DICE, "Dice");
        this.addBlock(ModBlocks.DICE_BLOCK, "Dice");

        this.addItem(ModItems.BASIC_PORTAL_ACTIVATOR, "Basic Portal Activator");

        this.addItem(ModItems.BASIC_PORTAL_CORE, "Basic Portal Core");

        this.addBlock(ModBlocks.UNDERWORLD_PORTAL_FRAME, "Underworld Portal Frame");
        this.addBlock(ModBlocks.NIDAVELLIR_PORTAL_FRAME, "Nidavellir Portal Frame");
        this.addBlock(ModBlocks.ALFHEIMR_PORTAL_FRAME, "Alfheimr Portal Frame");
        this.addBlock(ModBlocks.ATLANTIS_PORTAL_FRAME, "Atlantis Portal Frame");
        this.addBlock(ModBlocks.SKYOPIA_PORTAL_FRAME, "Skyopia Portal Frame");

        this.addBlock(ModBlocks.UNDERWORLD_PORTAL, "Underworld Portal");
        this.addBlock(ModBlocks.NIDAVELLIR_PORTAL, "Nidavellir Portal");
        this.addBlock(ModBlocks.ALFHEIMR_PORTAL, "Alfheimr Portal");
        this.addBlock(ModBlocks.ATLANTIS_PORTAL, "Atlantis Portal");
        this.addBlock(ModBlocks.SKYOPIA_PORTAL, "Skyopia Portal");

        addPainting(ModPaintings.SAW_THEM, "Saw Them", "NanoAttack");
        addPainting(ModPaintings.SHRIMP, "Shrimp", "NanoAttack");
        addPainting(ModPaintings.WORLD, "World", "NanoAttack");

        addEffect(ModEffects.DROWSY_EFFECT, "Drowsy");
        addPotion(ModPotions.DROWSY_POTION, "Drowsy");

        addCreativeTab(ModCreativeModeTabs.LOST_WORLDS_TAB, "Lost Worlds Tab");
        addCreativeTab(ModCreativeModeTabs.LOST_WORLDS_UNDERWORLD_TAB, "Lost Worlds Underworld Tab");
        addCreativeTab(ModCreativeModeTabs.LOST_WORLDS_NIDAVELLIR_TAB, "Lost Worlds Nidavellir Tab");
        addCreativeTab(ModCreativeModeTabs.LOST_WORLDS_ALFHEIMR_TAB, "Lost Worlds Álfheimr Tab");
        addCreativeTab(ModCreativeModeTabs.LOST_WORLDS_ATLANTIS_TAB, "Lost Worlds Atlantis Tab");
        addCreativeTab(ModCreativeModeTabs.LOST_WORLDS_SKYOPIA_TAB, "Lost Worlds Skyopia Tab");
        addCreativeTab(ModCreativeModeTabs.LOST_WORLDS_ENTITIES_TAB, "Lost Worlds Spawn Eggs Tab");

        addSound(ModSounds.MAGICAL_DOWSING_ROD_FOUND_ORE, "Magical Dowsing Rod Found Ore");
        addSound(ModSounds.CRIMSON_DIAMOND_LAMP_BREAK, "Crimson Diamond Lamp Break");
        addSound(ModSounds.CRIMSON_DIAMOND_LAMP_STEP, "Crimson Diamond Lamp Step");
        addSound(ModSounds.CRIMSON_DIAMOND_LAMP_FALL, "Crimson Diamond Lamp Fall");
        addSound(ModSounds.CRIMSON_DIAMOND_LAMP_PLACE, "Crimson Diamond Lamp Place");
        addSound(ModSounds.CRIMSON_DIAMOND_LAMP_HIT, "Crimson Diamond Lamp Hit");

        addRecord(ModItems.BAR_BRAWL_RECORD, "Bar Brawl Record", "Bryan Tech - Bar Brawl (CC0)");

        this.add("item.lostworlds.magical_dowsing_rod.no_valuables", "No Valuables Found!");
        this.add("tooltip.lostworlds.magical_dowsing_rod.tooltip", "Hold #eSHIFT#r for more information...");
        this.add("tooltip.lostworlds.magical_dowsing_rod.tooltip.shift", "Right click on block to find valuables");

        //Lost Worlds Book
        this.addItem(ModItems.LOST_WORLDS_BOOK, "Lost Worlds Book");
        addBookInformation("name", "Lost Worlds Book");
        addBookInformation("tooltip", "Information about the lost worlds mod");

        //Base Section
        addBookInformation("getting_started.name", "Base Info");
        addBookInformation("getting_started.intro.name", "Getting Started");
        addBookInformation("getting_started.intro.description", "Read this on how to start with the mod");
        addBookInformation("getting_started.intro.intro.title", "Getting Started");
        addBookInformation("getting_started.intro.intro.text", "Test Text");

        //Underworld
        addBookInformation("underworld.name", "Underworld");
        addBookInformation("underworld.intro.name", "Getting Started");
        addBookInformation("underworld.intro.description", "Read this on how to start with the mod");
        addBookInformation("underworld.intro.intro.title", "Getting Started");
        addBookInformation("underworld.intro.intro.text", "Test Text");

        //Alfheimr
        addBookInformation("alfheimr.name", "Alfheimr");
        addBookInformation("alfheimr.intro.name", "Getting Started");
        addBookInformation("alfheimr.intro.description", "Read this on how to start with the mod");
        addBookInformation("alfheimr.intro.intro.title", "Getting Started");
        addBookInformation("alfheimr.intro.intro.text", "Test Text");

        //Nidavellir
        addBookInformation("nidavellir.name", "Nidavellir");
        addBookInformation("nidavellir.intro.name", "Getting Started");
        addBookInformation("nidavellir.intro.description", "Read this on how to start with the mod");
        addBookInformation("nidavellir.intro.intro.title", "Getting Started");
        addBookInformation("nidavellir.intro.intro.text", "Test Text");

        //Atlantis
        addBookInformation("atlantis.name", "Atlantis");
        addBookInformation("atlantis.intro.name", "Getting Started");
        addBookInformation("atlantis.intro.description", "Read this on how to start with the mod");
        addBookInformation("atlantis.intro.intro.title", "Getting Started");
        addBookInformation("atlantis.intro.intro.text", "Test Text");

        //Skyopia
        addBookInformation("skyopia.name", "Skyopia");
        addBookInformation("skyopia.intro.name", "Getting Started");
        addBookInformation("skyopia.intro.description", "Read this on how to start with the mod");
        addBookInformation("skyopia.intro.intro.title", "Getting Started");
        addBookInformation("skyopia.intro.intro.text", "Test Text");
    }

    public void addPainting(RegistryObject<PaintingVariant> painting, String title, String author) {
        add("painting." + LostWorlds.MODID + "." + painting.getId().getPath() + ".title", title);
        add("painting." + LostWorlds.MODID + "." + painting.getId().getPath() + ".author", author);
    }

    public void addPotion(RegistryObject<Potion> potion, String title) {
        add("item.minecraft.potion.effect." + potion.getId().getPath(), title + " Potion");
        add("item.minecraft.splash_potion.effect." + potion.getId().getPath(), title + "Splash Potion");
        add("item.minecraft.lingering_potion.effect." + potion.getId().getPath(), title + " Lingering Potion");
    }

    public void addCreativeTab(RegistryObject<CreativeModeTab> tab, String name) {
        add("creativetab." + tab.getId().getPath(), name);
    }

    public void addProfession(RegistryObject<VillagerProfession> profession, String name) {
        add("entity.minecraft.villager." + LostWorlds.MODID + "." + profession.getId().getPath(), name);
    }

    public void addRecord(RegistryObject<Item> record, String name, String description) {
        addItem(record, name);
        add(record.get() + ".desc", description);
    }

    public void addSound(RegistryObject<SoundEvent> sound, String name) {
        add("sounds." + LostWorlds.MODID + "." + sound.get().getLocation().getPath(), name);
//        add("sounds.modid.name", name);
    }

    public void addBookInformation(String name, String info) {
        add("book." + LostWorlds.MODID + "." + "lost_worlds_book." + name, info);
//        add("sounds.modid.name", name);
    }
}
