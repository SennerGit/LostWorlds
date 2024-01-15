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
import net.sen.lostworlds.LostWorldsApi;
import net.sen.lostworlds.block.ModBlocks;
import net.sen.lostworlds.effect.ModEffects;
import net.sen.lostworlds.enchantment.ModEnchantments;
import net.sen.lostworlds.item.ModItems;
import net.sen.lostworlds.painting.ModPaintings;
import net.sen.lostworlds.potion.ModPotions;
import net.sen.lostworlds.sound.ModSounds;
import net.sen.lostworlds.villager.ModVillagers;

public class ModLanguageEnUsProvider extends LanguageProvider {
    public ModLanguageEnUsProvider(PackOutput output, String locale) {
        super(output, LostWorldsApi.MODID, locale);
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
        this.addItem(ModItems.AQUAMARINE, "Aquamarine");
        this.addItem(ModItems.OPAL, "Opal");
        this.addItem(ModItems.RUBY, "Ruby");

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

        this.addItem(ModItems.DURUM_WHEAT, "Durum Wheat");
        this.addItem(ModItems.DURUM_WHEAT_SEEDS, "Durum Wheat Seeds");
        this.addItem(ModItems.TOMATO, "Tomato");
        this.addItem(ModItems.TOMATO_SEEDS, "Tomato Seeds");
        this.addItem(ModItems.WILD_ONION, "Wild Onion");
        this.addItem(ModItems.ONION_STAGE_1, "Onion");
        this.addItem(ModItems.ONION_STAGE_2, "Onion");
        this.addItem(ModItems.ONION_STAGE_3, "Onion");
        this.addItem(ModItems.ONION, "Onion");
        this.addItem(ModItems.DRAGON_FRUIT, "Dragon Fruit");
        this.addItem(ModItems.DRAGON_FRUIT_SEEDS, "Dragon Fruit Seeds");
        this.addItem(ModItems.CHILLI, "Chilli");
        this.addItem(ModItems.CHILLI_SEEDS, "Chilli Seeds");

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
        this.addItem(ModItems.DWARVES_SPAWN_EGG, "Dwarves Spawn Egg");
        this.addItem(ModItems.ELVES_SPAWN_EGG, "Elves Spawn Egg");
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

        //Mushroom
        this.addBlock(ModBlocks.POINT_MUSHROOM_BLOCK, "Point Mushroom Block");
        this.addBlock(ModBlocks.POTTED_POINT_MUSHROOM_BLOCK, "Potted Point Mushroom Block");
        this.addBlock(ModBlocks.TOP_POINT_MUSHROOM_BLOCK, "Top Point Mushroom Block");
        this.addBlock(ModBlocks.POINT_MUSHROOM_STEM_BLOCK, "Point Mushroom Stem Block");

        this.addBlock(ModBlocks.WITCHES_MUSHROOM_BLOCK, "Witches Mushroom Block");
        this.addBlock(ModBlocks.POTTED_WITCHES_MUSHROOM_BLOCK, "Potted Witches Mushroom Block");
        this.addBlock(ModBlocks.TOP_WITCHES_MUSHROOM_BLOCK, "Top Witches Mushroom Block");
        this.addBlock(ModBlocks.WITCHES_MUSHROOM_STEM_BLOCK, "Witches Mushroom Stem Block");

        this.addBlock(ModBlocks.ROYAL_BLUE_MUSHROOM_BLOCK, "Royal Blue Mushroom Block");
        this.addBlock(ModBlocks.POTTED_ROYAL_BLUE_MUSHROOM_BLOCK, "Potted Royal Blue Mushroom Block");
        this.addBlock(ModBlocks.TOP_ROYAL_BLUE_MUSHROOM_BLOCK, "Top Royal Blue Mushroom Block");
        this.addBlock(ModBlocks.ROYAL_BLUE_MUSHROOM_STEM_BLOCK, "Royal Blue Mushroom Stem Block");
        this.addBlock(ModBlocks.ROYAL_BLUE_MUSHROOM_GLOW_BLOCK, "Royal Blue Mushroom Glow Block");

        this.addBlock(ModBlocks.SHORT_TOP_MUSHROOM_BLOCK, "Short Top Mushroom Block");
        this.addBlock(ModBlocks.POTTED_SHORT_TOP_MUSHROOM_BLOCK, "Potted Short Top Mushroom Block");
        this.addBlock(ModBlocks.TOP_SHORT_TOP_MUSHROOM_BLOCK, "Top Short Top Mushroom Block");
        this.addBlock(ModBlocks.SHORT_TOP_MUSHROOM_STEM_BLOCK, "Short Top Mushroom Stem Block");

        this.addBlock(ModBlocks.SPECTRAL_MUSHROOM_BLOCK, "Spectral Mushroom Block");
        this.addBlock(ModBlocks.POTTED_SPECTRAL_MUSHROOM_BLOCK, "Potted Spectral Mushroom Block");
        this.addBlock(ModBlocks.TOP_SPECTRAL_MUSHROOM_BLOCK, "Top Spectral Mushroom Block");
        this.addBlock(ModBlocks.SPECTRAL_MUSHROOM_STEM_BLOCK, "Spectral Spectral Mushroom Block");

        this.addBlock(ModBlocks.SHADE_MUSHROOM_VINE_BLOCK, "Shade Mushroom Vine Block");
        this.addBlock(ModBlocks.POTTED_SHADE_MUSHROOM_BLOCK, "Potted Shade Mushroom Vine Block");
        this.addBlock(ModBlocks.SHADE_MUSHROOM_BLOCK, "Shade Mushroom");

        this.addBlock(ModBlocks.CAP_MUSHROOM_VINE_BLOCK, "Cap Mushroom Vine Block");
        this.addBlock(ModBlocks.POTTED_CAP_MUSHROOM_BLOCK, "Potted Cap Mushroom Vine Block");
        this.addBlock(ModBlocks.CAP_MUSHROOM_BLOCK, "Cap Mushroom");

        //Misc
        this.addItem(ModItems.SHARK_TOOTH, "Shark Tooth");

        this.addBlock(ModBlocks.ALFHEIMR_MAGIC_GRASS, "Alfheimr Magic Grass");

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

        //STONES
        this.addBlock(ModBlocks.NIDAVELLIR_SOFT_STONE, "Nidavellir Soft Stone");
        this.addBlock(ModBlocks.NIDAVELLIR_SOFT_STONE_STAIRS, "Nidavellir Soft Stone Stairs");
        this.addBlock(ModBlocks.NIDAVELLIR_SOFT_STONE_SLAB, "Nidavellir Soft Stone Slab");
        this.addBlock(ModBlocks.NIDAVELLIR_SOFT_STONE_PRESSURE_PLATE, "Nidavellir Soft Stone Pressure Plate");
        this.addBlock(ModBlocks.NIDAVELLIR_SOFT_STONE_BUTTON, "Nidavellir Soft Stone Button");
        this.addBlock(ModBlocks.NIDAVELLIR_SOFT_STONE_WALL, "Nidavellir Soft Stone Wall");
        this.addBlock(ModBlocks.NIDAVELLIR_SOFT_SMOOTH_STONE, "Nidavellir Soft Stone Smoothed");
        this.addBlock(ModBlocks.NIDAVELLIR_SOFT_COBBLESTONE, "Nidavellir Soft Cobbletone");
        this.addBlock(ModBlocks.NIDAVELLIR_SOFT_COBBLESTONE_STAIRS, "Nidavellir Soft Cobbletone Stairs");
        this.addBlock(ModBlocks.NIDAVELLIR_SOFT_COBBLESTONE_SLAB, "Nidavellir Soft Cobbletone Slab");
        this.addBlock(ModBlocks.NIDAVELLIR_SOFT_COBBLESTONE_WALL, "Nidavellir Soft Cobbletone Wall");
        this.addBlock(ModBlocks.NIDAVELLIR_SOFT_COBBLESTONE_MOSSY, "Mossy Nidavellir Soft Cobbletone");
        this.addBlock(ModBlocks.NIDAVELLIR_SOFT_STONE_BRICKS, "Nidavellir Soft Stone Bricks");
        this.addBlock(ModBlocks.NIDAVELLIR_SOFT_STONE_BRICKS_STAIRS, "Nidavellir Soft Stone Bricks Stairs");
        this.addBlock(ModBlocks.NIDAVELLIR_SOFT_STONE_BRICKS_SLAB, "Nidavellir Soft Stone Bricks Slab");
        this.addBlock(ModBlocks.NIDAVELLIR_SOFT_STONE_BRICKS_WALL, "Nidavellir Soft Stone Bricks Wall");
        this.addBlock(ModBlocks.NIDAVELLIR_SOFT_STONE_BRICKS_MOSSY, "Mossy Nidavellir Soft Stone Bricks");
        this.addBlock(ModBlocks.NIDAVELLIR_SOFT_STONE_BRICKS_CRACKED, "Cracked Nidavellir Soft Stone Bricks");
        this.addBlock(ModBlocks.NIDAVELLIR_SOFT_STONE_BRICKS_CHISELED, "Chiseled Nidavellir Soft Stone Bricks");

        this.addBlock(ModBlocks.NIDAVELLIR_SOFT_STONE_IRON_ORE, "Nidavellir Soft Iron Ore");
        this.addBlock(ModBlocks.NIDAVELLIR_SOFT_STONE_GOLD_ORE, "Nidavellir Soft Gold Ore");
        this.addBlock(ModBlocks.NIDAVELLIR_SOFT_STONE_COPPER_ORE, "Nidavellir Soft Copper Ore");
        this.addBlock(ModBlocks.NIDAVELLIR_SOFT_STONE_TIN_ORE, "Nidavellir Soft Tin Ore");
        this.addBlock(ModBlocks.NIDAVELLIR_SOFT_STONE_ZINC_ORE, "Nidavellir Soft Zinc Ore");
        this.addBlock(ModBlocks.NIDAVELLIR_SOFT_STONE_DIAMOND_ORE, "Nidavellir Soft Diamond Ore");
        this.addBlock(ModBlocks.NIDAVELLIR_SOFT_STONE_EMERALD_ORE, "Nidavellir Soft Emerald Ore");
        this.addBlock(ModBlocks.NIDAVELLIR_SOFT_STONE_COAL_ORE, "Nidavellir Soft Coal Ore");
        this.addBlock(ModBlocks.NIDAVELLIR_SOFT_STONE_REDSTONE_ORE, "Nidavellir Soft Redstone Ore");
        this.addBlock(ModBlocks.NIDAVELLIR_SOFT_STONE_LAPIS_ORE, "Nidavellir Soft Lapis Ore");
        this.addBlock(ModBlocks.NIDAVELLIR_SOFT_STONE_AQUAMARINE_ORE, "Nidavellir Soft Aquamarine Ore");
        this.addBlock(ModBlocks.NIDAVELLIR_SOFT_STONE_OPAL_ORE, "Nidavellir Soft Opal Ore");
        this.addBlock(ModBlocks.NIDAVELLIR_SOFT_STONE_RUBY_ORE, "Nidavellir Soft Ruby Ore");

        this.addBlock(ModBlocks.NIDAVELLIR_SOFT_STONE_IRON_ORE_CLUSTER, "Nidavellir Soft Iron Ore Cluster");
        this.addBlock(ModBlocks.NIDAVELLIR_SOFT_STONE_GOLD_ORE_CLUSTER, "Nidavellir Soft Gold Ore Cluster");
        this.addBlock(ModBlocks.NIDAVELLIR_SOFT_STONE_COPPER_ORE_CLUSTER, "Nidavellir Soft Copper Ore Cluster");
        this.addBlock(ModBlocks.NIDAVELLIR_SOFT_STONE_TIN_ORE_CLUSTER, "Nidavellir Soft Tin Ore Cluster");
        this.addBlock(ModBlocks.NIDAVELLIR_SOFT_STONE_ZINC_ORE_CLUSTER, "Nidavellir Soft Zinc Ore Cluster");
        this.addBlock(ModBlocks.NIDAVELLIR_SOFT_STONE_DIAMOND_ORE_CLUSTER, "Nidavellir Soft Diamond Ore Cluster");
        this.addBlock(ModBlocks.NIDAVELLIR_SOFT_STONE_EMERALD_ORE_CLUSTER, "Nidavellir Soft Emerald Ore Cluster");
        this.addBlock(ModBlocks.NIDAVELLIR_SOFT_STONE_COAL_ORE_CLUSTER, "Nidavellir Soft Coal Ore Cluster");
        this.addBlock(ModBlocks.NIDAVELLIR_SOFT_STONE_REDSTONE_ORE_CLUSTER, "Nidavellir Soft Redstone Ore Cluster");
        this.addBlock(ModBlocks.NIDAVELLIR_SOFT_STONE_LAPIS_ORE_CLUSTER, "Nidavellir Soft Lapis Ore Cluster");
        this.addBlock(ModBlocks.NIDAVELLIR_SOFT_STONE_AQUAMARINE_ORE_CLUSTER, "Nidavellir Soft Aquamarine Ore Cluster");
        this.addBlock(ModBlocks.NIDAVELLIR_SOFT_STONE_OPAL_ORE_CLUSTER, "Nidavellir Soft Opal Ore Cluster");
        this.addBlock(ModBlocks.NIDAVELLIR_SOFT_STONE_RUBY_ORE_CLUSTER, "Nidavellir Soft Ruby Ore Cluster");

        this.addBlock(ModBlocks.NIDAVELLIR_HARD_STONE, "Nidavellir Hard Stone");
        this.addBlock(ModBlocks.NIDAVELLIR_HARD_STONE_STAIRS, "Nidavellir Hard Stone Stairs");
        this.addBlock(ModBlocks.NIDAVELLIR_HARD_STONE_SLAB, "Nidavellir Hard Stone Slab");
        this.addBlock(ModBlocks.NIDAVELLIR_HARD_STONE_PRESSURE_PLATE, "Nidavellir Hard Stone Pressure Plate");
        this.addBlock(ModBlocks.NIDAVELLIR_HARD_STONE_BUTTON, "Nidavellir Hard Stone Button");
        this.addBlock(ModBlocks.NIDAVELLIR_HARD_STONE_WALL, "Nidavellir Hard Stone Wall");
        this.addBlock(ModBlocks.NIDAVELLIR_HARD_SMOOTH_STONE, "Nidavellir Hard Stone Smoothed");
        this.addBlock(ModBlocks.NIDAVELLIR_HARD_COBBLESTONE, "Nidavellir Hard Cobbletone");
        this.addBlock(ModBlocks.NIDAVELLIR_HARD_COBBLESTONE_STAIRS, "Nidavellir Hard Cobbletone Stairs");
        this.addBlock(ModBlocks.NIDAVELLIR_HARD_COBBLESTONE_SLAB, "Nidavellir Hard Cobbletone Slab");
        this.addBlock(ModBlocks.NIDAVELLIR_HARD_COBBLESTONE_WALL, "Nidavellir Hard Cobbletone Wall");
        this.addBlock(ModBlocks.NIDAVELLIR_HARD_COBBLESTONE_MOSSY, "Mossy Nidavellir Hard Cobbletone");
        this.addBlock(ModBlocks.NIDAVELLIR_HARD_STONE_BRICKS, "Nidavellir Hard Stone Bricks");
        this.addBlock(ModBlocks.NIDAVELLIR_HARD_STONE_BRICKS_STAIRS, "Nidavellir Hard Stone Bricks Stairs");
        this.addBlock(ModBlocks.NIDAVELLIR_HARD_STONE_BRICKS_SLAB, "Nidavellir Hard Stone Bricks Slab");
        this.addBlock(ModBlocks.NIDAVELLIR_HARD_STONE_BRICKS_WALL, "Nidavellir Hard Stone Bricks Wall");
        this.addBlock(ModBlocks.NIDAVELLIR_HARD_STONE_BRICKS_MOSSY, "Mossy Nidavellir Hard Stone Bricks");
        this.addBlock(ModBlocks.NIDAVELLIR_HARD_STONE_BRICKS_CRACKED, "Cracked Nidavellir Hard Stone Bricks");
        this.addBlock(ModBlocks.NIDAVELLIR_HARD_STONE_BRICKS_CHISELED, "Chiseled Nidavellir Hard Stone Bricks");

        this.addBlock(ModBlocks.NIDAVELLIR_HARD_STONE_IRON_ORE, "Nidavellir Hard Iron Ore");
        this.addBlock(ModBlocks.NIDAVELLIR_HARD_STONE_GOLD_ORE, "Nidavellir Hard Gold Ore");
        this.addBlock(ModBlocks.NIDAVELLIR_HARD_STONE_COPPER_ORE, "Nidavellir Hard Copper Ore");
        this.addBlock(ModBlocks.NIDAVELLIR_HARD_STONE_TIN_ORE, "Nidavellir Hard Tin Ore");
        this.addBlock(ModBlocks.NIDAVELLIR_HARD_STONE_ZINC_ORE, "Nidavellir Hard Zinc Ore");
        this.addBlock(ModBlocks.NIDAVELLIR_HARD_STONE_DIAMOND_ORE, "Nidavellir Hard Diamond Ore");
        this.addBlock(ModBlocks.NIDAVELLIR_HARD_STONE_EMERALD_ORE, "Nidavellir Hard Emerald Ore");
        this.addBlock(ModBlocks.NIDAVELLIR_HARD_STONE_COAL_ORE, "Nidavellir Hard Coal Ore");
        this.addBlock(ModBlocks.NIDAVELLIR_HARD_STONE_REDSTONE_ORE, "Nidavellir Hard Redstone Ore");
        this.addBlock(ModBlocks.NIDAVELLIR_HARD_STONE_LAPIS_ORE, "Nidavellir Hard Lapis Ore");
        this.addBlock(ModBlocks.NIDAVELLIR_HARD_STONE_AQUAMARINE_ORE, "Nidavellir Hard Aquamarine Ore");
        this.addBlock(ModBlocks.NIDAVELLIR_HARD_STONE_OPAL_ORE, "Nidavellir Hard Opal Ore");
        this.addBlock(ModBlocks.NIDAVELLIR_HARD_STONE_RUBY_ORE, "Nidavellir Hard Ruby Ore");

        this.addBlock(ModBlocks.NIDAVELLIR_HARD_STONE_IRON_ORE_CLUSTER, "Nidavellir Hard Iron Ore Cluster");
        this.addBlock(ModBlocks.NIDAVELLIR_HARD_STONE_GOLD_ORE_CLUSTER, "Nidavellir Hard Gold Ore Cluster");
        this.addBlock(ModBlocks.NIDAVELLIR_HARD_STONE_COPPER_ORE_CLUSTER, "Nidavellir Hard Copper Ore Cluster");
        this.addBlock(ModBlocks.NIDAVELLIR_HARD_STONE_TIN_ORE_CLUSTER, "Nidavellir Hard Tin Ore Cluster");
        this.addBlock(ModBlocks.NIDAVELLIR_HARD_STONE_ZINC_ORE_CLUSTER, "Nidavellir Hard Zinc Ore Cluster");
        this.addBlock(ModBlocks.NIDAVELLIR_HARD_STONE_DIAMOND_ORE_CLUSTER, "Nidavellir Hard Diamond Ore Cluster");
        this.addBlock(ModBlocks.NIDAVELLIR_HARD_STONE_EMERALD_ORE_CLUSTER, "Nidavellir Hard Emerald Ore Cluster");
        this.addBlock(ModBlocks.NIDAVELLIR_HARD_STONE_COAL_ORE_CLUSTER, "Nidavellir Hard Coal Ore Cluster");
        this.addBlock(ModBlocks.NIDAVELLIR_HARD_STONE_REDSTONE_ORE_CLUSTER, "Nidavellir Hard Redstone Ore Cluster");
        this.addBlock(ModBlocks.NIDAVELLIR_HARD_STONE_LAPIS_ORE_CLUSTER, "Nidavellir Hard Lapis Ore Cluster");
        this.addBlock(ModBlocks.NIDAVELLIR_HARD_STONE_AQUAMARINE_ORE_CLUSTER, "Nidavellir Hard Aquamarine Ore Cluster");
        this.addBlock(ModBlocks.NIDAVELLIR_HARD_STONE_OPAL_ORE_CLUSTER, "Nidavellir Hard Opal Ore Cluster");
        this.addBlock(ModBlocks.NIDAVELLIR_HARD_STONE_RUBY_ORE_CLUSTER, "Nidavellir Hard Ruby Ore Cluster");

        this.addBlock(ModBlocks.NIDAVELLIR_ENHANCED_STONE, "Nidavellir Enhanced Stone");
        this.addBlock(ModBlocks.NIDAVELLIR_ENHANCED_STONE_STAIRS, "Nidavellir Enhanced Stone Stairs");
        this.addBlock(ModBlocks.NIDAVELLIR_ENHANCED_STONE_SLAB, "Nidavellir Enhanced Stone Slab");
        this.addBlock(ModBlocks.NIDAVELLIR_ENHANCED_STONE_PRESSURE_PLATE, "Nidavellir Enhanced Stone Pressure Plate");
        this.addBlock(ModBlocks.NIDAVELLIR_ENHANCED_STONE_BUTTON, "Nidavellir Enhanced Stone Button");
        this.addBlock(ModBlocks.NIDAVELLIR_ENHANCED_STONE_WALL, "Nidavellir Enhanced Stone Wall");
        this.addBlock(ModBlocks.NIDAVELLIR_ENHANCED_SMOOTH_STONE, "Nidavellir Enhanced Stone Smoothed");
        this.addBlock(ModBlocks.NIDAVELLIR_ENHANCED_COBBLESTONE, "Nidavellir Enhanced Cobbletone");
        this.addBlock(ModBlocks.NIDAVELLIR_ENHANCED_COBBLESTONE_STAIRS, "Nidavellir Enhanced Cobbletone Stairs");
        this.addBlock(ModBlocks.NIDAVELLIR_ENHANCED_COBBLESTONE_SLAB, "Nidavellir Enhanced Cobbletone Slab");
        this.addBlock(ModBlocks.NIDAVELLIR_ENHANCED_COBBLESTONE_WALL, "Nidavellir Enhanced Cobbletone Wall");
        this.addBlock(ModBlocks.NIDAVELLIR_ENHANCED_COBBLESTONE_MOSSY, "Mossy Nidavellir Enhanced Cobbletone");
        this.addBlock(ModBlocks.NIDAVELLIR_ENHANCED_STONE_BRICKS, "Nidavellir Enhanced Stone Bricks");
        this.addBlock(ModBlocks.NIDAVELLIR_ENHANCED_STONE_BRICKS_STAIRS, "Nidavellir Enhanced Stone Bricks Stairs");
        this.addBlock(ModBlocks.NIDAVELLIR_ENHANCED_STONE_BRICKS_SLAB, "Nidavellir Enhanced Stone Bricks Slab");
        this.addBlock(ModBlocks.NIDAVELLIR_ENHANCED_STONE_BRICKS_WALL, "Nidavellir Enhanced Stone Bricks Wall");
        this.addBlock(ModBlocks.NIDAVELLIR_ENHANCED_STONE_BRICKS_MOSSY, "Mossy Nidavellir Enhanced Stone Bricks");
        this.addBlock(ModBlocks.NIDAVELLIR_ENHANCED_STONE_BRICKS_CRACKED, "Cracked Nidavellir Enhanced Stone Bricks");
        this.addBlock(ModBlocks.NIDAVELLIR_ENHANCED_STONE_BRICKS_CHISELED, "Chiseled Nidavellir Enhanced Stone Bricks");

        this.addBlock(ModBlocks.NIDAVELLIR_ENHANCED_STONE_IRON_ORE, "Nidavellir Enhanced Iron Ore");
        this.addBlock(ModBlocks.NIDAVELLIR_ENHANCED_STONE_GOLD_ORE, "Nidavellir Enhanced Gold Ore");
        this.addBlock(ModBlocks.NIDAVELLIR_ENHANCED_STONE_COPPER_ORE, "Nidavellir Enhanced Copper Ore");
        this.addBlock(ModBlocks.NIDAVELLIR_ENHANCED_STONE_TIN_ORE, "Nidavellir Enhanced Tin Ore");
        this.addBlock(ModBlocks.NIDAVELLIR_ENHANCED_STONE_ZINC_ORE, "Nidavellir Enhanced Zinc Ore");
        this.addBlock(ModBlocks.NIDAVELLIR_ENHANCED_STONE_DIAMOND_ORE, "Nidavellir Enhanced Diamond Ore");
        this.addBlock(ModBlocks.NIDAVELLIR_ENHANCED_STONE_EMERALD_ORE, "Nidavellir Enhanced Emerald Ore");
        this.addBlock(ModBlocks.NIDAVELLIR_ENHANCED_STONE_COAL_ORE, "Nidavellir Enhanced Coal Ore");
        this.addBlock(ModBlocks.NIDAVELLIR_ENHANCED_STONE_REDSTONE_ORE, "Nidavellir Enhanced Redstone Ore");
        this.addBlock(ModBlocks.NIDAVELLIR_ENHANCED_STONE_LAPIS_ORE, "Nidavellir Enhanced Lapis Ore");
        this.addBlock(ModBlocks.NIDAVELLIR_ENHANCED_STONE_AQUAMARINE_ORE, "Nidavellir Enhanced Aquamarine Ore");
        this.addBlock(ModBlocks.NIDAVELLIR_ENHANCED_STONE_OPAL_ORE, "Nidavellir Enhanced Opal Ore");
        this.addBlock(ModBlocks.NIDAVELLIR_ENHANCED_STONE_RUBY_ORE, "Nidavellir Enhanced Ruby Ore");

        this.addBlock(ModBlocks.NIDAVELLIR_ENHANCED_STONE_IRON_ORE_CLUSTER, "Nidavellir Enhanced Iron Ore Cluster");
        this.addBlock(ModBlocks.NIDAVELLIR_ENHANCED_STONE_GOLD_ORE_CLUSTER, "Nidavellir Enhanced Gold Ore Cluster");
        this.addBlock(ModBlocks.NIDAVELLIR_ENHANCED_STONE_COPPER_ORE_CLUSTER, "Nidavellir Enhanced Copper Ore Cluster");
        this.addBlock(ModBlocks.NIDAVELLIR_ENHANCED_STONE_TIN_ORE_CLUSTER, "Nidavellir Enhanced Tin Ore Cluster");
        this.addBlock(ModBlocks.NIDAVELLIR_ENHANCED_STONE_ZINC_ORE_CLUSTER, "Nidavellir Enhanced Zinc Ore Cluster");
        this.addBlock(ModBlocks.NIDAVELLIR_ENHANCED_STONE_DIAMOND_ORE_CLUSTER, "Nidavellir Enhanced Diamond Ore Cluster");
        this.addBlock(ModBlocks.NIDAVELLIR_ENHANCED_STONE_EMERALD_ORE_CLUSTER, "Nidavellir Enhanced Emerald Ore Cluster");
        this.addBlock(ModBlocks.NIDAVELLIR_ENHANCED_STONE_COAL_ORE_CLUSTER, "Nidavellir Enhanced Coal Ore Cluster");
        this.addBlock(ModBlocks.NIDAVELLIR_ENHANCED_STONE_REDSTONE_ORE_CLUSTER, "Nidavellir Enhanced Redstone Ore Cluster");
        this.addBlock(ModBlocks.NIDAVELLIR_ENHANCED_STONE_LAPIS_ORE_CLUSTER, "Nidavellir Enhanced Lapis Ore Cluster");
        this.addBlock(ModBlocks.NIDAVELLIR_ENHANCED_STONE_AQUAMARINE_ORE_CLUSTER, "Nidavellir Enhanced Aquamarine Ore Cluster");
        this.addBlock(ModBlocks.NIDAVELLIR_ENHANCED_STONE_OPAL_ORE_CLUSTER, "Nidavellir Enhanced Opal Ore Cluster");
        this.addBlock(ModBlocks.NIDAVELLIR_ENHANCED_STONE_RUBY_ORE_CLUSTER, "Nidavellir Enhanced Ruby Ore Cluster");

        this.addBlock(ModBlocks.NIDAVELLIR_DEEPSLATE_STONE, "Nidavellir Deepslate Stone");
        this.addBlock(ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_STAIRS, "Nidavellir Deepslate Stone Stairs");
        this.addBlock(ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_SLAB, "Nidavellir Deepslate Stone Slab");
        this.addBlock(ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_PRESSURE_PLATE, "Nidavellir Deepslate Stone Pressure Plate");
        this.addBlock(ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_BUTTON, "Nidavellir Deepslate Stone Button");
        this.addBlock(ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_WALL, "Nidavellir Deepslate Stone Wall");
        this.addBlock(ModBlocks.NIDAVELLIR_DEEPSLATE_SMOOTH_STONE, "Nidavellir Deepslate Stone Smoothed");
        this.addBlock(ModBlocks.NIDAVELLIR_DEEPSLATE_COBBLESTONE, "Nidavellir Deepslate Cobbletone");
        this.addBlock(ModBlocks.NIDAVELLIR_DEEPSLATE_COBBLESTONE_STAIRS, "Nidavellir Deepslate Cobbletone Stairs");
        this.addBlock(ModBlocks.NIDAVELLIR_DEEPSLATE_COBBLESTONE_SLAB, "Nidavellir Deepslate Cobbletone Slab");
        this.addBlock(ModBlocks.NIDAVELLIR_DEEPSLATE_COBBLESTONE_WALL, "Nidavellir Deepslate Cobbletone Wall");
        this.addBlock(ModBlocks.NIDAVELLIR_DEEPSLATE_COBBLESTONE_MOSSY, "Mossy Nidavellir Deepslate Cobbletone");
        this.addBlock(ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_BRICKS, "Nidavellir Deepslate Stone Bricks");
        this.addBlock(ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_BRICKS_STAIRS, "Nidavellir Deepslate Stone Bricks Stairs");
        this.addBlock(ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_BRICKS_SLAB, "Nidavellir Deepslate Stone Bricks Slab");
        this.addBlock(ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_BRICKS_WALL, "Nidavellir Deepslate Stone Bricks Wall");
        this.addBlock(ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_BRICKS_MOSSY, "Mossy Nidavellir Deepslate Stone Bricks");
        this.addBlock(ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_BRICKS_CRACKED, "Cracked Nidavellir Deepslate Stone Bricks");
        this.addBlock(ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_BRICKS_CHISELED, "Chiseled Nidavellir Deepslate Stone Bricks");

        this.addBlock(ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_IRON_ORE, "Nidavellir Deepslate Iron Ore");
        this.addBlock(ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_GOLD_ORE, "Nidavellir Deepslate Gold Ore");
        this.addBlock(ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_COPPER_ORE, "Nidavellir Deepslate Copper Ore");
        this.addBlock(ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_TIN_ORE, "Nidavellir Deepslate Tin Ore");
        this.addBlock(ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_ZINC_ORE, "Nidavellir Deepslate Zinc Ore");
        this.addBlock(ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_DIAMOND_ORE, "Nidavellir Deepslate Diamond Ore");
        this.addBlock(ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_EMERALD_ORE, "Nidavellir Deepslate Emerald Ore");
        this.addBlock(ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_COAL_ORE, "Nidavellir Deepslate Coal Ore");
        this.addBlock(ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_REDSTONE_ORE, "Nidavellir Deepslate Redstone Ore");
        this.addBlock(ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_LAPIS_ORE, "Nidavellir Deepslate Lapis Ore");
        this.addBlock(ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_AQUAMARINE_ORE, "Nidavellir Deepslate Aquamarine Ore");
        this.addBlock(ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_OPAL_ORE, "Nidavellir Deepslate Opal Ore");
        this.addBlock(ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_RUBY_ORE, "Nidavellir Deepslate Ruby Ore");

        this.addBlock(ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_IRON_ORE_CLUSTER, "Nidavellir Deepslate Iron Ore Cluster");
        this.addBlock(ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_GOLD_ORE_CLUSTER, "Nidavellir Deepslate Gold Ore Cluster");
        this.addBlock(ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_COPPER_ORE_CLUSTER, "Nidavellir Deepslate Copper Ore Cluster");
        this.addBlock(ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_TIN_ORE_CLUSTER, "Nidavellir Deepslate Tin Ore Cluster");
        this.addBlock(ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_ZINC_ORE_CLUSTER, "Nidavellir Deepslate Zinc Ore Cluster");
        this.addBlock(ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_DIAMOND_ORE_CLUSTER, "Nidavellir Deepslate Diamond Ore Cluster");
        this.addBlock(ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_EMERALD_ORE_CLUSTER, "Nidavellir Deepslate Emerald Ore Cluster");
        this.addBlock(ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_COAL_ORE_CLUSTER, "Nidavellir Deepslate Coal Ore Cluster");
        this.addBlock(ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_REDSTONE_ORE_CLUSTER, "Nidavellir Deepslate Redstone Ore Cluster");
        this.addBlock(ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_LAPIS_ORE_CLUSTER, "Nidavellir Deepslate Lapis Ore Cluster");
        this.addBlock(ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_AQUAMARINE_ORE_CLUSTER, "Nidavellir Deepslate Aquamarine Ore Cluster");
        this.addBlock(ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_OPAL_ORE_CLUSTER, "Nidavellir Deepslate Opal Ore Cluster");
        this.addBlock(ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_RUBY_ORE_CLUSTER, "Nidavellir Deepslate Ruby Ore Cluster");

        this.addBlock(ModBlocks.NIDAVELLIR_CRIMSON_STONE, "Nidavellir Crimson Stone");
        this.addBlock(ModBlocks.NIDAVELLIR_CRIMSON_STONE_STAIRS, "Nidavellir Crimson Stone Stairs");
        this.addBlock(ModBlocks.NIDAVELLIR_CRIMSON_STONE_SLAB, "Nidavellir Crimson Stone Slab");
        this.addBlock(ModBlocks.NIDAVELLIR_CRIMSON_STONE_PRESSURE_PLATE, "Nidavellir Crimson Stone Pressure Plate");
        this.addBlock(ModBlocks.NIDAVELLIR_CRIMSON_STONE_BUTTON, "Nidavellir Crimson Stone Button");
        this.addBlock(ModBlocks.NIDAVELLIR_CRIMSON_STONE_WALL, "Nidavellir Crimson Stone Wall");
        this.addBlock(ModBlocks.NIDAVELLIR_CRIMSON_SMOOTH_STONE, "Nidavellir Crimson Stone Smoothed");
        this.addBlock(ModBlocks.NIDAVELLIR_CRIMSON_COBBLESTONE, "Nidavellir Crimson Cobbletone");
        this.addBlock(ModBlocks.NIDAVELLIR_CRIMSON_COBBLESTONE_STAIRS, "Nidavellir Crimson Cobbletone Stairs");
        this.addBlock(ModBlocks.NIDAVELLIR_CRIMSON_COBBLESTONE_SLAB, "Nidavellir Crimson Cobbletone Slab");
        this.addBlock(ModBlocks.NIDAVELLIR_CRIMSON_COBBLESTONE_WALL, "Nidavellir Crimson Cobbletone Wall");
        this.addBlock(ModBlocks.NIDAVELLIR_CRIMSON_COBBLESTONE_MOSSY, "Mossy Nidavellir Crimson Cobbletone");
        this.addBlock(ModBlocks.NIDAVELLIR_CRIMSON_STONE_BRICKS, "Nidavellir Crimson Stone Bricks");
        this.addBlock(ModBlocks.NIDAVELLIR_CRIMSON_STONE_BRICKS_STAIRS, "Nidavellir Crimson Stone Bricks Stairs");
        this.addBlock(ModBlocks.NIDAVELLIR_CRIMSON_STONE_BRICKS_SLAB, "Nidavellir Crimson Stone Bricks Slab");
        this.addBlock(ModBlocks.NIDAVELLIR_CRIMSON_STONE_BRICKS_WALL, "Nidavellir Crimson Stone Bricks Wall");
        this.addBlock(ModBlocks.NIDAVELLIR_CRIMSON_STONE_BRICKS_MOSSY, "Mossy Nidavellir Crimson Stone Bricks");
        this.addBlock(ModBlocks.NIDAVELLIR_CRIMSON_STONE_BRICKS_CRACKED, "Cracked Nidavellir Crimson Stone Bricks");
        this.addBlock(ModBlocks.NIDAVELLIR_CRIMSON_STONE_BRICKS_CHISELED, "Chiseled Nidavellir Crimson Stone Bricks");

        this.addBlock(ModBlocks.NIDAVELLIR_CRIMSON_STONE_IRON_ORE, "Nidavellir Crimson Iron Ore");
        this.addBlock(ModBlocks.NIDAVELLIR_CRIMSON_STONE_GOLD_ORE, "Nidavellir Crimson Gold Ore");
        this.addBlock(ModBlocks.NIDAVELLIR_CRIMSON_STONE_COPPER_ORE, "Nidavellir Crimson Copper Ore");
        this.addBlock(ModBlocks.NIDAVELLIR_CRIMSON_STONE_TIN_ORE, "Nidavellir Crimson Tin Ore");
        this.addBlock(ModBlocks.NIDAVELLIR_CRIMSON_STONE_ZINC_ORE, "Nidavellir Crimson Zinc Ore");
        this.addBlock(ModBlocks.NIDAVELLIR_CRIMSON_STONE_DIAMOND_ORE, "Nidavellir Crimson Diamond Ore");
        this.addBlock(ModBlocks.NIDAVELLIR_CRIMSON_STONE_EMERALD_ORE, "Nidavellir Crimson Emerald Ore");
        this.addBlock(ModBlocks.NIDAVELLIR_CRIMSON_STONE_COAL_ORE, "Nidavellir Crimson Coal Ore");
        this.addBlock(ModBlocks.NIDAVELLIR_CRIMSON_STONE_REDSTONE_ORE, "Nidavellir Crimson Redstone Ore");
        this.addBlock(ModBlocks.NIDAVELLIR_CRIMSON_STONE_LAPIS_ORE, "Nidavellir Crimson Lapis Ore");
        this.addBlock(ModBlocks.NIDAVELLIR_CRIMSON_STONE_AQUAMARINE_ORE, "Nidavellir Crimson Aquamarine Ore");
        this.addBlock(ModBlocks.NIDAVELLIR_CRIMSON_STONE_OPAL_ORE, "Nidavellir Crimson Opal Ore");
        this.addBlock(ModBlocks.NIDAVELLIR_CRIMSON_STONE_RUBY_ORE, "Nidavellir Crimson Ruby Ore");

        this.addBlock(ModBlocks.NIDAVELLIR_CRIMSON_STONE_IRON_ORE_CLUSTER, "Nidavellir Crimson Iron Ore Cluster");
        this.addBlock(ModBlocks.NIDAVELLIR_CRIMSON_STONE_GOLD_ORE_CLUSTER, "Nidavellir Crimson Gold Ore Cluster");
        this.addBlock(ModBlocks.NIDAVELLIR_CRIMSON_STONE_COPPER_ORE_CLUSTER, "Nidavellir Crimson Copper Ore Cluster");
        this.addBlock(ModBlocks.NIDAVELLIR_CRIMSON_STONE_TIN_ORE_CLUSTER, "Nidavellir Crimson Tin Ore Cluster");
        this.addBlock(ModBlocks.NIDAVELLIR_CRIMSON_STONE_ZINC_ORE_CLUSTER, "Nidavellir Crimson Zinc Ore Cluster");
        this.addBlock(ModBlocks.NIDAVELLIR_CRIMSON_STONE_DIAMOND_ORE_CLUSTER, "Nidavellir Crimson Diamond Ore Cluster");
        this.addBlock(ModBlocks.NIDAVELLIR_CRIMSON_STONE_EMERALD_ORE_CLUSTER, "Nidavellir Crimson Emerald Ore Cluster");
        this.addBlock(ModBlocks.NIDAVELLIR_CRIMSON_STONE_COAL_ORE_CLUSTER, "Nidavellir Crimson Coal Ore Cluster");
        this.addBlock(ModBlocks.NIDAVELLIR_CRIMSON_STONE_REDSTONE_ORE_CLUSTER, "Nidavellir Crimson Redstone Ore Cluster");
        this.addBlock(ModBlocks.NIDAVELLIR_CRIMSON_STONE_LAPIS_ORE_CLUSTER, "Nidavellir Crimson Lapis Ore Cluster");
        this.addBlock(ModBlocks.NIDAVELLIR_CRIMSON_STONE_AQUAMARINE_ORE_CLUSTER, "Nidavellir Crimson Aquamarine Ore Cluster");
        this.addBlock(ModBlocks.NIDAVELLIR_CRIMSON_STONE_OPAL_ORE_CLUSTER, "Nidavellir Crimson Opal Ore Cluster");
        this.addBlock(ModBlocks.NIDAVELLIR_CRIMSON_STONE_RUBY_ORE_CLUSTER, "Nidavellir Crimson Ruby Ore Cluster");

        this.addBlock(ModBlocks.TARTARUS_STONE, "Tartarus Stone");
        this.addBlock(ModBlocks.TARTARUS_STONE_STAIRS, "Tartarus Stone Stairs");
        this.addBlock(ModBlocks.TARTARUS_STONE_SLAB, "Tartarus Stone Slab");
        this.addBlock(ModBlocks.TARTARUS_STONE_PRESSURE_PLATE, "Tartarus Stone Pressure Plate");
        this.addBlock(ModBlocks.TARTARUS_STONE_BUTTON, "Tartarus Stone Button");
        this.addBlock(ModBlocks.TARTARUS_STONE_WALL, "Tartarus Stone Wall");
        this.addBlock(ModBlocks.TARTARUS_STONE_SMOOTH_STONE, "Tartarus Stone Smoothed");
        this.addBlock(ModBlocks.TARTARUS_STONE_COBBLESTONE, "Tartarus Cobbletone");
        this.addBlock(ModBlocks.TARTARUS_STONE_COBBLESTONE_STAIRS, "Tartarus Cobbletone Stairs");
        this.addBlock(ModBlocks.TARTARUS_STONE_COBBLESTONE_SLAB, "Tartarus Cobbletone Slab");
        this.addBlock(ModBlocks.TARTARUS_STONE_COBBLESTONE_WALL, "Tartarus Cobbletone Wall");
        this.addBlock(ModBlocks.TARTARUS_STONE_COBBLESTONE_MOSSY, "Mossy Tartarus Cobbletone");
        this.addBlock(ModBlocks.TARTARUS_STONE_BRICKS, "Tartarus Stone Bricks");
        this.addBlock(ModBlocks.TARTARUS_STONE_BRICKS_STAIRS, "Tartarus Stone Bricks Stairs");
        this.addBlock(ModBlocks.TARTARUS_STONE_BRICKS_SLAB, "Tartarus Stone Bricks Slab");
        this.addBlock(ModBlocks.TARTARUS_STONE_BRICKS_WALL, "Tartarus Stone Bricks Wall");
        this.addBlock(ModBlocks.TARTARUS_STONE_BRICKS_MOSSY, "Mossy Tartarus Stone Bricks");
        this.addBlock(ModBlocks.TARTARUS_STONE_BRICKS_CRACKED, "Cracked Tartarus Stone Bricks");
        this.addBlock(ModBlocks.TARTARUS_STONE_BRICKS_CHISELED, "Chiseled Tartarus Stone Bricks");

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
        this.addBlock(ModBlocks.POTTED_IRIS_FLOWER, "Potted Iris");

        this.addBlock(ModBlocks.DARK_BLOOM_FLOWER, "Dark Bloom Flower");
        this.addBlock(ModBlocks.POTTED_DARK_BLOOM_FLOWER, "Potted Dark Bloom Flower");
        this.addBlock(ModBlocks.DREAD_NIGHT_FLOWER, "Dread Night Flower");
        this.addBlock(ModBlocks.POTTED_DREAD_NIGIHT_FLOWER, "Potted Dread Night Flower");
        this.addBlock(ModBlocks.BLACK_LOTUS_FLOWER, "Black Lotus Flower");
        this.addBlock(ModBlocks.POTTED_BLACK_LOTUS_FLOWER, "Potted Black Lotus Flower");
        this.addBlock(ModBlocks.NIGHT_ROSE_FLOWER, "Night Rose Flower");
        this.addBlock(ModBlocks.POTTED_NIGHT_ROSE_FLOWER, "Potted Night Rose Flower");
        this.addBlock(ModBlocks.AQUA_ROSE_FLOWER, "Aqua Rose Flower");
        this.addBlock(ModBlocks.POTTED_AQUA_ROSE_FLOWER, "Potted Aqua Rose Flower");
        this.addBlock(ModBlocks.MOON_FLOWER, "Moon Flower");
        this.addBlock(ModBlocks.POTTED_MOON_FLOWER, "Potted Moon Flower");
        this.addBlock(ModBlocks.CATHERINE_FLOWER, "Catherine Flower");
        this.addBlock(ModBlocks.POTTED_CATHERINE_FLOWER, "Potted Catherine Flower");
        this.addBlock(ModBlocks.TAINTED_ROSE_FLOWER, "Tainted Rose Flower");
        this.addBlock(ModBlocks.POTTED_TAINTED_ROSE_FLOWER, "Potted Tainted Rose Flower");
        this.addBlock(ModBlocks.CINNAMON_ROSE_FLOWER, "Cinnamon Rose Flower");
        this.addBlock(ModBlocks.POTTED_CINNAMON_ROSE_FLOWER, "Potted Cinnamon Rose Flower");
        this.addBlock(ModBlocks.BUTTERFLY_FLOWER, "Butterfly Flower");
        this.addBlock(ModBlocks.POTTED_BUTTERFLY_FLOWER, "Potted Butterfly Flower");
        this.addBlock(ModBlocks.GAIA_TULIP_FLOWER, "Gaia Tulip");
        this.addBlock(ModBlocks.POTTED_GAIA_TULIP_FLOWER, "Potted Gaia Tulip");
        this.addBlock(ModBlocks.BEARDED_IRIS_FLOWER, "Bearded Iris");
        this.addBlock(ModBlocks.POTTED_BEARDED_IRIS_FLOWER, "Potted Bearded Iris");
        this.addBlock(ModBlocks.CORNFLOWER_FLOWER, "Cornflower");
        this.addBlock(ModBlocks.POTTED_CORNFLOWER_FLOWER, "Potted Cornflower");
        this.addBlock(ModBlocks.MORNING_GLORY_FLOWER, "Morning Glory");
        this.addBlock(ModBlocks.POTTED_MORNING_GLORY_FLOWER, "Potted Morning Glory");
        this.addBlock(ModBlocks.GEORGIA_BLUE_FLOWER, "Georgia Blue");
        this.addBlock(ModBlocks.POTTED_GEORGIA_BLUE_FLOWER, "Potted Georgia Blue");
        this.addBlock(ModBlocks.BLUE_POPPY_FLOWER, "Blue Poppy");
        this.addBlock(ModBlocks.POTTED_BLUE_POPPY_FLOWER, "Potted Blue Poppy");
        this.addBlock(ModBlocks.TULIP_FLOWER, "Tulip");
        this.addBlock(ModBlocks.POTTED_TULIP_FLOWER, "Potted Tulip");
        this.addBlock(ModBlocks.CARNATION_FLOWER, "Carnation Flower");
        this.addBlock(ModBlocks.POTTED_CARNATION_FLOWER, "Potted Carnation Flower");
        this.addBlock(ModBlocks.LADYS_MANTLE_FLOWER, "Lady's Mantle");
        this.addBlock(ModBlocks.POTTED_LADYS_MANTLE_FLOWER, "Potted Lady's Mantle");
        this.addBlock(ModBlocks.GREEN_ROSE_FLOWER, "Green Rose");
        this.addBlock(ModBlocks.POTTED_GREEN_ROSE_FLOWER, "Potted Green Rose");
        this.addBlock(ModBlocks.CLEMATIS_FLOWER, "Clematis Flower");
        this.addBlock(ModBlocks.POTTED_CLEMATIS_FLOWER, "Potted Clematis Flower");
        this.addBlock(ModBlocks.BLUE_STAR_FLOWER, "Blue Star Flower");
        this.addBlock(ModBlocks.POTTED_BLUE_STAR_FLOWER, "Potted Blue Star Flower");
        this.addBlock(ModBlocks.SALVIA_FLOWER, "Salvia");
        this.addBlock(ModBlocks.POTTED_SALVIA_FLOWER, "Potted Salvia");
        this.addBlock(ModBlocks.FALSE_INDIGO_FLOWER, "False Indigo");
        this.addBlock(ModBlocks.POTTED_FALSE_INDIGO_FLOWER, "Potted False Indigo");
        this.addBlock(ModBlocks.WHITE_SAGE_FLOWER, "White Sage");
        this.addBlock(ModBlocks.POTTED_WHITE_SAGE_FLOWER, "Potted White Sage");
        this.addBlock(ModBlocks.SILVER_SCHEHERAZADE_FLOWER, "Silver Scheherazade");
        this.addBlock(ModBlocks.POTTED_SILVER_SCHEHERAZADE_FLOWER, "Potted Silver Scheherazade");
        this.addBlock(ModBlocks.SILVER_SPRING_FLOWER, "Silver Spring");
        this.addBlock(ModBlocks.POTTED_SILVER_SPRING_FLOWER, "Potted Silver Spring");
        this.addBlock(ModBlocks.SILVER_SHADOWS_FLOWER, "Silver Shadows");
        this.addBlock(ModBlocks.POTTED_SILVER_SHADOWS_FLOWER, "Potted Silver Shadows");
        this.addBlock(ModBlocks.GREEN_BALL_FLOWER, "Green Ball Flower");
        this.addBlock(ModBlocks.POTTED_GREEN_BALL_FLOWER, "Potted Green Ball Flower");
        this.addBlock(ModBlocks.LIME_DAHLIA_FLOWER, "Lime Dahlia");
        this.addBlock(ModBlocks.POTTED_LIME_DAHLIA_FLOWER, "Potted Lime Dahlia");
        this.addBlock(ModBlocks.HYDRANGEA_FLOWER, "Hydrangea");
        this.addBlock(ModBlocks.POTTED_HYDRANGEA_FLOWER, "Potted Hydrangea");
        this.addBlock(ModBlocks.ZINNIA_FLOWER, "Zinnia");
        this.addBlock(ModBlocks.POTTED_ZINNIA_FLOWER, "Potted Zinnia");
        this.addBlock(ModBlocks.BUTTERFLY_CANDY_FLOWER, "Butterfly Candy");
        this.addBlock(ModBlocks.POTTED_BUTTERFLY_CANDY_FLOWER, "Potted Butterfly Candy");
        this.addBlock(ModBlocks.CABARET_FLOWER, "Cabaret Flower");
        this.addBlock(ModBlocks.POTTED_CABARET_FLOWER, "Potted Cabaret Flower");
        this.addBlock(ModBlocks.DIANTHUS_FLOWER, "Dianthus");
        this.addBlock(ModBlocks.POTTED_DIANTHUS_FLOWER, "Potted Dianthus");
        this.addBlock(ModBlocks.TITAN_CRANBERRY_VINCA_FLOWER, "Titan Cranberry Vinca");
        this.addBlock(ModBlocks.POTTED_TITAN_CRANBERRY_VINCA_FLOWER, "Potted Titan Cranberry Vinca");
        this.addBlock(ModBlocks.ORANGE_ZINNIA_FLOWER, "Orange Zinnia");
        this.addBlock(ModBlocks.POTTED_ORANGE_ZINNIA_FLOWER, "Potted Orange Zinnia");
        this.addBlock(ModBlocks.BEGONIA_FLOWER, "Begonia");
        this.addBlock(ModBlocks.POTTED_BEGONIA_FLOWER, "Potted Begonia");
        this.addBlock(ModBlocks.CROWN_IMPERIAL_FLOWER, "Crown Imperial");
        this.addBlock(ModBlocks.POTTED_CROWN_IMPERIAL_FLOWER, "Potted Crown Imperial");
        this.addBlock(ModBlocks.ORIENTAL_POPPY_FLOWER, "Oriental Poppy");
        this.addBlock(ModBlocks.POTTED_ORIENTAL_POPPY_FLOWER, "Potted Oriental Poppy");
        this.addBlock(ModBlocks.AZALEA_FLOWER, "Azalea");
        this.addBlock(ModBlocks.POTTED_AZALEA_FLOWER, "Potted Azalea");
        this.addBlock(ModBlocks.PINK_DELIGHT_FLOWER, "Pink Delight");
        this.addBlock(ModBlocks.POTTED_PINK_DELIGHT_FLOWER, "Potted Pink Delight");
        this.addBlock(ModBlocks.CHRYSANTHEMUM_FLOWER, "Chrysanthemum");
        this.addBlock(ModBlocks.POTTED_CHRYSANTHEMUM_FLOWER, "Potted Chrysanthemum");
        this.addBlock(ModBlocks.HIBISCUS_FLOWER, "Hibiscus");
        this.addBlock(ModBlocks.POTTED_HIBISCUS_FLOWER, "Potted Hibiscus");
        this.addBlock(ModBlocks.CARDINAL_FLOWER, "Cardinal Flower");
        this.addBlock(ModBlocks.POTTED_CARDINAL_FLOWER, "Potted Cardinal Flower");
        this.addBlock(ModBlocks.GERBERA_FLOWER, "Gerbera");
        this.addBlock(ModBlocks.POTTED_GERBERA_FLOWER, "Potted Gerbera");
        this.addBlock(ModBlocks.RED_TULIP_FLOWER, "Red Tulip");
        this.addBlock(ModBlocks.POTTED_RED_TULIP_FLOWER, "Potted Red Tulip");
        this.addBlock(ModBlocks.FREESIA_FLOWER, "Freesia");
        this.addBlock(ModBlocks.POTTED_FREESIA_FLOWER, "Potted Freesia");
        this.addBlock(ModBlocks.GARDENIAS_FLOWER, "Gardenias");
        this.addBlock(ModBlocks.POTTED_GARDENIAS_FLOWER, "Potted Gardenias");
        this.addBlock(ModBlocks.STAR_JASMINE_FLOWER, "Star Jasmine");
        this.addBlock(ModBlocks.POTTED_STAR_JASMINE_FLOWER, "Potted Star Jasmine");
        this.addBlock(ModBlocks.WHITE_WARATAH_FLOWER, "White Waratah");
        this.addBlock(ModBlocks.POTTED_WHITE_WARATAH_FLOWER, "Potted White Waratah");
        this.addBlock(ModBlocks.FLANNEL_FLOWER, "Flannel");
        this.addBlock(ModBlocks.POTTED_FLANNEL_FLOWER, "Potted Flannel");
        this.addBlock(ModBlocks.BEARS_EARS_FLOWER, "Bears Ears");
        this.addBlock(ModBlocks.POTTED_BEARS_EARS_FLOWER, "Bears Ears");
        this.addBlock(ModBlocks.BIDENS_FLOWER, "Bidens Flower");
        this.addBlock(ModBlocks.POTTED_BIDENS_FLOWER, "Potted Bidens Flower");
        this.addBlock(ModBlocks.BLANKET_FLOWER, "Blanket Flower");
        this.addBlock(ModBlocks.POTTED_BLANKET_FLOWER, "Potted Blanket Flower");
        this.addBlock(ModBlocks.BULBINE_FLOWER, "Bulbine Flower");
        this.addBlock(ModBlocks.POTTED_BULBINE_FLOWER, "Potted Bulbine Flower");
        this.addBlock(ModBlocks.SILVER_BRUNIA_FLOWER, "Silver Brunia");
        this.addBlock(ModBlocks.POTTED_SILVER_BRUNIA_FLOWER, "Potted Silver Brunia");
        this.addBlock(ModBlocks.GRAY_ROSES_FLOWER, "Gray Rose");
        this.addBlock(ModBlocks.POTTED_GRAY_ROSES_FLOWER, "Potted Gray Rose");
        this.addBlock(ModBlocks.MOON_CARROT_FLOWER, "Moon Carrot");
        this.addBlock(ModBlocks.POTTED_MOON_CARROT_FLOWER, "Potted Moon Carrot");
        this.addBlock(ModBlocks.SILVER_BABY_FLOWER, "Silver Baby");
        this.addBlock(ModBlocks.POTTED_SILVER_BABY_FLOWER, "Potted Silver Baby");
        this.addBlock(ModBlocks.LAVENDER_FLOWER, "Lavender");
        this.addBlock(ModBlocks.POTTED_LAVENDER_FLOWER, "Potted Lavender");
        this.addBlock(ModBlocks.BELLFLOWER_FLOWER, "Bellflower");
        this.addBlock(ModBlocks.POTTED_BELLFLOWER_FLOWER, "Potted Bellflower");
        this.addBlock(ModBlocks.LILAC_FLOWER, "Lilac");
        this.addBlock(ModBlocks.POTTED_LILAC_FLOWER, "Potted Lilac");
        this.addBlock(ModBlocks.SWEET_PEA_FLOWER, "Sweet Pea");
        this.addBlock(ModBlocks.POTTED_SWEET_PEA_FLOWER, "Potted Sweet Pea");

        this.addBlock(ModBlocks.DRUID_RITUAL_STONE, "Druid Ritual Stone");

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

//        addCreativeTab(ModCreativeModeTabs.LOST_WORLDS_TAB, "Lost Worlds Tab");
//        addCreativeTab(ModCreativeModeTabs.LOST_WORLDS_UNDERWORLD_TAB, "Lost Worlds Underworld Tab");
//        addCreativeTab(ModCreativeModeTabs.LOST_WORLDS_NIDAVELLIR_TAB, "Lost Worlds Nidavellir Tab");
//        addCreativeTab(ModCreativeModeTabs.LOST_WORLDS_ALFHEIMR_TAB, "Lost Worlds Álfheimr Tab");
//        addCreativeTab(ModCreativeModeTabs.LOST_WORLDS_ATLANTIS_TAB, "Lost Worlds Atlantis Tab");
//        addCreativeTab(ModCreativeModeTabs.LOST_WORLDS_SKYOPIA_TAB, "Lost Worlds Skyopia Tab");
//        addCreativeTab(ModCreativeModeTabs.LOST_WORLDS_ENTITIES_TAB, "Lost Worlds Spawn Eggs Tab");

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

        //Tab info
        this.add("itemGroup.cfm", "Lost Worlds");
        this.add("gui.button.cfm.enable_filters", "Enable All Filters");
        this.add("gui.button.cfm.disable_filters", "Disable All Filters");
        this.addTagFilterUI("general", "General");
        this.addTagFilterUI("spawn_eggs", "Spawn Eggs");
        this.addTagFilterUI("underworld", "Underworld");
        this.addTagFilterUI("nidavellir", "Nidavellir");
        this.addTagFilterUI("alfheimr", "Álfheimr");
        this.addTagFilterUI("atlantis", "Atlantis");
        this.addTagFilterUI("skyopia", "Skyopia");
        this.addTagFilterUI("metals", "Metals");
        this.addTagFilterUI("building_blocks", "Building Blocks");
        this.addTagFilterUI("miscs", "Miscs");
        this.addTagFilterUI("natural_blocks", "Natural Blocks");
        this.addTagFilterUI("colored_blocks", "Colored Blocks");
        this.addTagFilterUI("functional_blocks", "Functional Blocks");
        this.addTagFilterUI("farming", "Farming");
        this.addTagFilterUI("redstone_blocks", "Redstone Blocks");
        this.addTagFilterUI("magic", "Magic");
        this.addTagFilterUI("tools_and_utilities", "Tools & Utilities");
        this.addTagFilterUI("combat", "Combat");
        this.addTagFilterUI("food_and_drinks", "Food & Drinks");

        //Advancements
        //Base
        this.add("advancement.lostworlds.base.root.name", "Base Lost Worlds");
        this.add("advancement.lostworlds.base.root.desc", "Learn the powers of different wolds");
        this.add("advancement.lostworlds.base.dowsing_rod.name", "Magical Dowsing Rod");
        this.add("advancement.lostworlds.base.dowsing_rod.desc", "Find magical objects");

        //Underworld
        this.add("advancement.lostworlds.underworld.root.name", "Underworld");
        this.add("advancement.lostworlds.underworld.root.desc", "Learn the powers of different wolds");

        //Nidavellir
        this.add("advancement.lostworlds.nidavellir.root.name", "Nidavellir");
        this.add("advancement.lostworlds.nidavellir.root.desc", "Learn the powers of different wolds");

        //Alfheimr
        this.add("advancement.lostworlds.alfheimr.root.name", "Alfheimr");
        this.add("advancement.lostworlds.alfheimr.root.desc", "Learn the powers of different wolds");

        //Atlantis
        this.add("advancement.lostworlds.atlantis.root.name", "Atlantis");
        this.add("advancement.lostworlds.atlantis.root.desc", "Learn the powers of different wolds");

        //Skyopia
        this.add("advancement.lostworlds.skyopia.root.name", "Skyopia");
        this.add("advancement.lostworlds.skyopia.root.desc", "Learn the powers of different wolds");

        //Lost Worlds Book
        this.add("item.lostworlds.book.name", "Lost Worlds Book");
        this.add("info.lostworlds.book.landing", "A journal written by a mad man talking about the possibilities of different worlds." +
                "$(br2)Discovering the mysteries of the many different worlds lost to history.");

        this.add("lostworlds.category.basics", "Basics");
        this.add("lostworlds.entry.basics.intro", "Intro");
        this.add("lostworlds.page.basics.intro.0.title", "Getting to Alfheimr");
        this.add("lostworlds.page.basics.intro.0.text", "");
        this.add("lostworlds.page.basics.intro.1.title", "Craft the portal activator");

//        this.add("", "");

        //Alfheimr
        this.add("item.alfheimr.book.name", "Alfheimr in a book Vol.1");
        this.add("info.alfheimr.book.landing", "The first and only known printed copy." +
                "$(br2)The book covers all things needed to know about Alfheimr.");

        this.add("alfheimr.category.basics.name", "Basics");
        this.add("alfheimr.category.basics.desc", "");
        this.add("lostworlds.entry.alfheimr.basics.intro", "Intro");
        this.add("lostworlds.page.alfheimr.basics.intro.0.title", "Getting to Alfheimr");
        this.add("lostworlds.page.alfheimr.basics.intro.0.text", "");
        this.add("lostworlds.page.alfheimr.basics.intro.2.title", "Craft the portal activator");
        this.add("lostworlds.page.alfheimr.basics.intro.3.title", "Making the portal frame");
        this.add("lostworlds.page.alfheimr.basics.intro.4.name", "Building the portal");
        this.add("lostworlds.page.alfheimr.basics.intro.4.text", "");

        this.add("alfheimr.category.flora.name", "Way of the druid");
        this.add("alfheimr.category.flora.desc", "");

        this.add("alfheimr.category.fauna.name", "Way of the druid");
        this.add("alfheimr.category.fauna.desc", "");

        this.add("alfheimr.category.druid.name", "Way of the druid");
        this.add("alfheimr.category.druid.desc", "");
        this.add("lostworlds.entry.alfheimr.druid.intro", "Druid Intro");
        this.add("lostworlds.page.alfheimr.druid.intro.0.title", "Druid Ritual Basics");
        this.add("lostworlds.page.alfheimr.druid.intro.0.text", "");
        this.add("lostworlds.page.alfheimr.druid.intro.1.title", "Druid Ritual");
        this.add("lostworlds.page.alfheimr.druid.intro.1.text", "");

//        this.add("", "");

        //Atlantis
        this.add("item.atlantis.book.name", "The lost book of Atlantis");
        this.add("info.atlantis.book.landing", "The only recorded book on Atlantis but was lost before it could make it to print." +
                "$(br2)This book covers all the mystories of the world atlantis.");

        this.add("atlantis.category.basics", "Basics");
        this.add("lostworlds.entry.atlantis.intro", "Intro");
        this.add("lostworlds.page.atlantis.intro.0.title", "Getting to Atlantis");
        this.add("lostworlds.page.atlantis.intro.0.text", "");
        this.add("lostworlds.page.atlantis.intro.2.title", "Craft the portal activator");
        this.add("lostworlds.page.atlantis.intro.3.title", "Making the portal frame");
        this.add("lostworlds.page.atlantis.intro.4.name", "Building the portal");
        this.add("lostworlds.page.atlantis.intro.4.text", "");

//        this.add("", "");

        //Nidavellir
        this.add("item.nidavellir.book.name", "Miners guide to Nidavellir");
        this.add("info.nidavellir.book.landing", "Popular edition for all dwarves." +
                "$(br2)A basic guide to Nidavellir that all the dwarves carry before entering the mines.");

        this.add("nidavellir.category.basics", "Basics");
        this.add("lostworlds.entry.nidavellir.intro", "Intro");
        this.add("lostworlds.page.nidavellir.intro.0.title", "Getting to Nidavellir");
        this.add("lostworlds.page.nidavellir.intro.0.text", "");
        this.add("lostworlds.page.nidavellir.intro.2.title", "Craft the portal activator");
        this.add("lostworlds.page.nidavellir.intro.3.title", "Making the portal frame");
        this.add("lostworlds.page.nidavellir.intro.4.name", "Building the portal");
        this.add("lostworlds.page.nidavellir.intro.4.text", "");

//        this.add("", "");

        //Skyopia
        this.add("item.skyopia.book.name", "Lost journal on Skyopia");
        this.add("info.skyopia.book.landing", "A journal written by the most infamous and notorious pirate in all of Skyopia." +
                "$(br2)A survivors guide to the many lands and wild life of Skyopia");

        this.add("skyopia.category.basics", "Basics");
        this.add("lostworlds.entry.skyopia.intro", "Intro");
        this.add("lostworlds.page.skyopia.intro.0.title", "Getting to Skyopia");
        this.add("lostworlds.page.skyopia.intro.0.text", "");
        this.add("lostworlds.page.skyopia.intro.2.title", "Craft the portal activator");
        this.add("lostworlds.page.skyopia.intro.3.title", "Making the portal frame");
        this.add("lostworlds.page.skyopia.intro.4.name", "Building the portal");
        this.add("lostworlds.page.skyopia.intro.4.text", "");

//        this.add("", "");

        //Underworld
        this.add("item.underworld.book.name", "Hades guide to the Underworld");
        this.add("info.underworld.book.landing", "This book is written by the lord of the underworld hades." +
                "$(br2)The reason for this book is to pass on information and knowladge on how to live in the underworld.");

        this.add("underworld.category.basics", "Basics");
        this.add("lostworlds.entry.underworld.intro", "Intro");
        this.add("lostworlds.page.underworld.intro.0.title", "Getting to Underworld");
        this.add("lostworlds.page.underworld.intro.0.text", "");
        this.add("lostworlds.page.underworld.intro.2.title", "Craft the portal activator");
        this.add("lostworlds.page.underworld.intro.3.title", "Making the portal frame");
        this.add("lostworlds.page.underworld.intro.4.name", "Building the portal");
        this.add("lostworlds.page.underworld.intro.4.text", "");

//        this.add("", "");
    }

    public void addTagFilterUI(String id, String name) {
        this.add("gui.tag_filter.lostworlds." + id, name);
    }

    public void addPainting(RegistryObject<PaintingVariant> painting, String title, String author) {
        add("painting." + LostWorldsApi.MODID + "." + painting.getId().getPath() + ".title", title);
        add("painting." + LostWorldsApi.MODID + "." + painting.getId().getPath() + ".author", author);
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
        add("entity.minecraft.villager." + LostWorldsApi.MODID + "." + profession.getId().getPath(), name);
    }

    public void addRecord(RegistryObject<Item> record, String name, String description) {
        addItem(record, name);
        add(record.get() + ".desc", description);
    }

    public void addSound(RegistryObject<SoundEvent> sound, String name) {
        add("sounds." + LostWorldsApi.MODID + "." + sound.get().getLocation().getPath(), name);
//        add("sounds.modid.name", name);
    }


}
