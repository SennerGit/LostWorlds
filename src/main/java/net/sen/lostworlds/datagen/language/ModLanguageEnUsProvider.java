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
import net.sen.lostworlds.block.*;
import net.sen.lostworlds.effect.ModEffects;
import net.sen.lostworlds.enchantment.ModEnchantments;
import net.sen.lostworlds.item.*;
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
        blocksAndItems();
        spawnEggs();
        paintings();
        effects();
        potions();
        sounds();
        records();
        custom();
        config();
        creativeTab();
        baseAdvancements();
        underworldAdvancements();
        nidavellirAdvancements();
        alfheimrAdvancements();
        atlantisAdvancements();
        skyopiaAdvancements();
        lostWorldsBook();
        alfheimrBook();
        atlantisBook();
        nidavellirBook();
        skyopiaBook();
        underworldBook();
        bookOnDragonsBook();

    }

    private void spawnEggs() {
        //Spawm Eggs
        this.addItem(ModSpawnEggs.RHINO_SPAWN_EGG, "Rhino Spawn Egg");
        this.addItem(ModSpawnEggs.HELLHOUND_SPAWN_EGG, "Hell Hound Spawn Egg");
        this.addItem(ModSpawnEggs.SHADOWHOUND_SPAWN_EGG, "Shadow Hound Spawn Egg");
        this.addItem(ModSpawnEggs.SPECTRALHOUND_SPAWN_EGG, "Spectral Hound Spawn Egg");
        this.addItem(ModSpawnEggs.DWARVES_SPAWN_EGG, "Dwarves Spawn Egg");
        this.addItem(ModSpawnEggs.VAMPIRE_BAT_SPAWN_EGG, "Vampire Bat Spawn Egg");
        this.addItem(ModSpawnEggs.CAVE_MOLE_SPAWN_EGG, "Cave Mole Spawn Egg");
        this.addItem(ModSpawnEggs.ELVES_SPAWN_EGG, "Elves Spawn Egg");
        this.addItem(ModSpawnEggs.SHARK_SPAWN_EGG, "Shark Spawn Egg");
        this.addItem(ModSpawnEggs.MORAY_EELS_SPAWN_EGG, "Moray Eels Spawn Egg");
        this.addItem(ModSpawnEggs.ELECTRIC_EELS_SPAWN_EGG, "Electric_eels Spawn Egg");
        this.addItem(ModSpawnEggs.JELLYFISH_SPAWN_EGG, "Jellyfish Spawn Egg");
        this.addItem(ModSpawnEggs.GIANT_SQUID_SPAWN_EGG, "Giant Squid Spawn Egg");
        this.addItem(ModSpawnEggs.RAY_SPAWN_EGG, "Ray Spawn Egg");
        this.addItem(ModSpawnEggs.GIANT_OCTOPUS_SPAWN_EGG, "Giant Octopus Spawn Egg");
        this.addItem(ModSpawnEggs.NUDIBRANCH_SLUG_SPAWN_EGG, "Nudibranch Slug Spawn Egg");
        this.addItem(ModSpawnEggs.GREAT_WHITE_SPAWN_EGG, "Great White Spawn Egg");
        this.addItem(ModSpawnEggs.ANGLER_FISH_SPAWN_EGG, "Angler Fish Spawn Egg");
        this.addItem(ModSpawnEggs.SEAHORSE_SPAWN_EGG, "Seahorse Spawn Egg");
        this.addItem(ModSpawnEggs.CLOWNFISH_SPAWN_EGG, "Clownfish Spawn Egg");
        this.addItem(ModSpawnEggs.ATLANTIAN_GURDIAN_SPAWN_EGG, "Atlantian_gurdian Spawn Egg");
        this.addItem(ModSpawnEggs.SIREN_SPAWN_EGG, "Siren Spawn Egg");
        this.addItem(ModSpawnEggs.MERFOLK_SPAWN_EGG, "Merfolk Spawn Egg");
        this.addItem(ModSpawnEggs.ATLANTIAN_SPAWN_EGG, "Atlantian Spawn Egg");
        this.addItem(ModSpawnEggs.TANG_FISH_SPAWN_EGG, "Tang Fish Spawn Egg");
        this.addItem(ModSpawnEggs.TUNA_SPAWN_EGG, "Tuna Spawn Egg");
    }

    private void blocksAndItems() {
        //Custom Blocks/Items
        this.addItem(ModItems.MAGICAL_DOWSING_ROD, "Magical Dowsing Rod");
        this.addBlock(ModBlocks.SOUND_BLOCK, "Sound Block");
        this.addBlock(ModBlocks.ALLOY_SMELTER, "Alloy Smelter");

        /*
         * TREES
         */
        //Elder Wood
        this.addBlock(UnderworldBlocks.ELDER_WOOD_LOG, "Elder Wood Log");
        this.addBlock(UnderworldBlocks.ELDER_WOOD, "Elder Wood");
        this.addBlock(UnderworldBlocks.STRIPPED_ELDER_WOOD_LOG, "Elder Wood Log Stripped");
        this.addBlock(UnderworldBlocks.STRIPPED_ELDER_WOOD, "Elder Wood Stripped");
        this.addBlock(UnderworldBlocks.ELDER_WOOD_PLANKS, "Elder Wood Planks");
        this.addBlock(UnderworldBlocks.ELDER_WOOD_LEAVES, "Elder Wood Leaves");
        this.addBlock(UnderworldBlocks.ELDER_WOOD_SAPLING, "Elder Wood Sapling");
        this.addBlock(UnderworldBlocks.ELDER_WOOD_PLANKS_SLAB, "Elder Wood Slab");
        this.addBlock(UnderworldBlocks.ELDER_WOOD_PLANKS_STAIRS, "Elder Wood Stairs");
        this.addBlock(UnderworldBlocks.ELDER_WOOD_PLANKS_PRESSURE_PLATE, "Elder Wood Pressure Plate");
        this.addBlock(UnderworldBlocks.ELDER_WOOD_PLANKS_DOOR, "Elder Wood Door");
        this.addBlock(UnderworldBlocks.ELDER_WOOD_PLANKS_TRAPDOOR, "Elder Wood Trapdoor");
        this.addBlock(UnderworldBlocks.ELDER_WOOD_PLANKS_FENCE, "Elder Wood Fence");
        this.addBlock(UnderworldBlocks.ELDER_WOOD_PLANKS_FENCE_GATE, "Elder Wood Fence Gate");
        this.addBlock(UnderworldBlocks.ELDER_WOOD_PLANKS_BUTTON, "Elder Wood Button");
        this.addBlock(UnderworldBlocks.ELDER_WOOD_PLANKS_SIGN, "Elder Wood Sign");
        this.addBlock(UnderworldBlocks.ELDER_WOOD_PLANKS_HANGING_SIGN, "Elder Wood Hanging Sign");

        //Olive
        this.addBlock(UnderworldBlocks.OLIVE_LOG, "Olive Log");
        this.addBlock(UnderworldBlocks.OLIVE_WOOD, "Olive Wood");
        this.addBlock(UnderworldBlocks.STRIPPED_OLIVE_LOG, "Olive Log Stripped");
        this.addBlock(UnderworldBlocks.STRIPPED_OLIVE_WOOD, "Olive Wood Stripped");
        this.addBlock(UnderworldBlocks.OLIVE_PLANKS, "Olive Planks");
        this.addBlock(UnderworldBlocks.OLIVE_LEAVES, "Olive Leaves");
        this.addBlock(UnderworldBlocks.OLIVE_SAPLING, "Olive Sapling");
        this.addBlock(UnderworldBlocks.OLIVE_PLANKS_SLAB, "Olive Slab");
        this.addBlock(UnderworldBlocks.OLIVE_PLANKS_STAIRS, "Olive Stairs");
        this.addBlock(UnderworldBlocks.OLIVE_PLANKS_PRESSURE_PLATE, "Olive Pressure Plate");
        this.addBlock(UnderworldBlocks.OLIVE_PLANKS_DOOR, "Olive Door");
        this.addBlock(UnderworldBlocks.OLIVE_PLANKS_TRAPDOOR, "Olive Trapdoor");
        this.addBlock(UnderworldBlocks.OLIVE_PLANKS_FENCE, "Olive Fence");
        this.addBlock(UnderworldBlocks.OLIVE_PLANKS_FENCE_GATE, "Olive Fence Gate");
        this.addBlock(UnderworldBlocks.OLIVE_PLANKS_BUTTON, "Olive Button");
        this.addBlock(UnderworldBlocks.OLIVE_PLANKS_SIGN, "Olive Sign");
        this.addBlock(UnderworldBlocks.OLIVE_PLANKS_HANGING_SIGN, "Olive Hanging Sign");

        //Myrrh
        this.addBlock(UnderworldBlocks.MYRRH_LOG, "Myrrh Log");
        this.addBlock(UnderworldBlocks.MYRRH_WOOD, "Myrrh Wood");
        this.addBlock(UnderworldBlocks.STRIPPED_MYRRH_LOG, "Myrrh Log Stripped");
        this.addBlock(UnderworldBlocks.STRIPPED_MYRRH_WOOD, "Myrrh Wood Stripped");
        this.addBlock(UnderworldBlocks.MYRRH_PLANKS, "Myrrh Planks");
        this.addBlock(UnderworldBlocks.MYRRH_LEAVES, "Myrrh Leaves");
        this.addBlock(UnderworldBlocks.MYRRH_SAPLING, "Myrrh Sapling");
        this.addBlock(UnderworldBlocks.MYRRH_PLANKS_SLAB, "Myrrh Slab");
        this.addBlock(UnderworldBlocks.MYRRH_PLANKS_STAIRS, "Myrrh Stairs");
        this.addBlock(UnderworldBlocks.MYRRH_PLANKS_PRESSURE_PLATE, "Myrrh Pressure Plate");
        this.addBlock(UnderworldBlocks.MYRRH_PLANKS_DOOR, "Myrrh Door");
        this.addBlock(UnderworldBlocks.MYRRH_PLANKS_TRAPDOOR, "Myrrh Trapdoor");
        this.addBlock(UnderworldBlocks.MYRRH_PLANKS_FENCE, "Myrrh Fence");
        this.addBlock(UnderworldBlocks.MYRRH_PLANKS_FENCE_GATE, "Myrrh Fence Gate");
        this.addBlock(UnderworldBlocks.MYRRH_PLANKS_BUTTON, "Myrrh Button");
        this.addBlock(UnderworldBlocks.MYRRH_PLANKS_SIGN, "Myrrh Sign");
        this.addBlock(UnderworldBlocks.MYRRH_PLANKS_HANGING_SIGN, "Myrrh Hanging Sign");

        //Laurel
        this.addBlock(UnderworldBlocks.LAUREL_LOG, "Laurel Log");
        this.addBlock(UnderworldBlocks.LAUREL_WOOD, "Laurel Wood");
        this.addBlock(UnderworldBlocks.STRIPPED_LAUREL_LOG, "Laurel Log Stripped");
        this.addBlock(UnderworldBlocks.STRIPPED_LAUREL_WOOD, "Laurel Wood Stripped");
        this.addBlock(UnderworldBlocks.LAUREL_PLANKS, "Laurel Planks");
        this.addBlock(UnderworldBlocks.LAUREL_LEAVES, "Laurel Leaves");
        this.addBlock(UnderworldBlocks.LAUREL_SAPLING, "Laurel Sapling");
        this.addBlock(UnderworldBlocks.LAUREL_PLANKS_SLAB, "Laurel Slab");
        this.addBlock(UnderworldBlocks.LAUREL_PLANKS_STAIRS, "Laurel Stairs");
        this.addBlock(UnderworldBlocks.LAUREL_PLANKS_PRESSURE_PLATE, "Laurel Pressure Plate");
        this.addBlock(UnderworldBlocks.LAUREL_PLANKS_DOOR, "Laurel Door");
        this.addBlock(UnderworldBlocks.LAUREL_PLANKS_TRAPDOOR, "Laurel Trapdoor");
        this.addBlock(UnderworldBlocks.LAUREL_PLANKS_FENCE, "Laurel Fence");
        this.addBlock(UnderworldBlocks.LAUREL_PLANKS_FENCE_GATE, "Laurel Fence Gate");
        this.addBlock(UnderworldBlocks.LAUREL_PLANKS_BUTTON, "Laurel Button");
        this.addBlock(UnderworldBlocks.LAUREL_PLANKS_SIGN, "Laurel Sign");
        this.addBlock(UnderworldBlocks.LAUREL_PLANKS_HANGING_SIGN, "Laurel Hanging Sign");

        //Cypress
        this.addBlock(UnderworldBlocks.CYPRESS_LOG, "Cypress Log");
        this.addBlock(UnderworldBlocks.CYPRESS_WOOD, "Cypress Wood");
        this.addBlock(UnderworldBlocks.STRIPPED_CYPRESS_LOG, "Cypress Log Stripped");
        this.addBlock(UnderworldBlocks.STRIPPED_CYPRESS_WOOD, "Cypress Wood Stripped");
        this.addBlock(UnderworldBlocks.CYPRESS_PLANKS, "Cypress Planks");
        this.addBlock(UnderworldBlocks.CYPRESS_LEAVES, "Cypress Leaves");
        this.addBlock(UnderworldBlocks.CYPRESS_SAPLING, "Cypress Sapling");
        this.addBlock(UnderworldBlocks.CYPRESS_PLANKS_SLAB, "Cypress Slab");
        this.addBlock(UnderworldBlocks.CYPRESS_PLANKS_STAIRS, "Cypress Stairs");
        this.addBlock(UnderworldBlocks.CYPRESS_PLANKS_PRESSURE_PLATE, "Cypress Pressure Plate");
        this.addBlock(UnderworldBlocks.CYPRESS_PLANKS_DOOR, "Cypress Door");
        this.addBlock(UnderworldBlocks.CYPRESS_PLANKS_TRAPDOOR, "Cypress Trapdoor");
        this.addBlock(UnderworldBlocks.CYPRESS_PLANKS_FENCE, "Cypress Fence");
        this.addBlock(UnderworldBlocks.CYPRESS_PLANKS_FENCE_GATE, "Cypress Fence Gate");
        this.addBlock(UnderworldBlocks.CYPRESS_PLANKS_BUTTON, "Cypress Button");
        this.addBlock(UnderworldBlocks.CYPRESS_PLANKS_SIGN, "Cypress Sign");
        this.addBlock(UnderworldBlocks.CYPRESS_PLANKS_HANGING_SIGN, "Cypress Hanging Sign");

        //Black Birch
        this.addBlock(AlfheimrBlocks.BLACK_BIRCH_LOG, "Black Birch Log");
        this.addBlock(AlfheimrBlocks.BLACK_BIRCH_WOOD, "Black Birch Wood");
        this.addBlock(AlfheimrBlocks.STRIPPED_BLACK_BIRCH_LOG, "Black Birch Log Stripped");
        this.addBlock(AlfheimrBlocks.STRIPPED_BLACK_BIRCH_WOOD, "Black Birch Wood Stripped");
        this.addBlock(AlfheimrBlocks.BLACK_BIRCH_PLANKS, "Black Birch Planks");
        this.addBlock(AlfheimrBlocks.BLACK_BIRCH_LEAVES, "Black Birch Leaves");
        this.addBlock(AlfheimrBlocks.BLACK_BIRCH_SAPLING, "Black Birch Sapling");
        this.addBlock(AlfheimrBlocks.BLACK_BIRCH_PLANKS_SLAB, "Black Birch Slab");
        this.addBlock(AlfheimrBlocks.BLACK_BIRCH_PLANKS_STAIRS, "Black Birch Stairs");
        this.addBlock(AlfheimrBlocks.BLACK_BIRCH_PLANKS_PRESSURE_PLATE, "Black Birch Pressure Plate");
        this.addBlock(AlfheimrBlocks.BLACK_BIRCH_PLANKS_DOOR, "Black Birch Door");
        this.addBlock(AlfheimrBlocks.BLACK_BIRCH_PLANKS_TRAPDOOR, "Black Birch Trapdoor");
        this.addBlock(AlfheimrBlocks.BLACK_BIRCH_PLANKS_FENCE, "Black Birch Fence");
        this.addBlock(AlfheimrBlocks.BLACK_BIRCH_PLANKS_FENCE_GATE, "Black Birch Fence Gate");
        this.addBlock(AlfheimrBlocks.BLACK_BIRCH_PLANKS_BUTTON, "Black Birch Button");
        this.addBlock(AlfheimrBlocks.BLACK_BIRCH_PLANKS_SIGN, "Black Birch Sign");
        this.addBlock(AlfheimrBlocks.BLACK_BIRCH_PLANKS_HANGING_SIGN, "Black Birch Hanging Sign");

        //White Oak
        this.addBlock(AlfheimrBlocks.WHITE_OAK_LOG, "White Oak Log");
        this.addBlock(AlfheimrBlocks.WHITE_OAK_WOOD, "White Oak Wood");
        this.addBlock(AlfheimrBlocks.STRIPPED_WHITE_OAK_LOG, "White Oak Log Stripped");
        this.addBlock(AlfheimrBlocks.STRIPPED_WHITE_OAK_WOOD, "White Oak Wood Stripped");
        this.addBlock(AlfheimrBlocks.WHITE_OAK_PLANKS, "White Oak Planks");
        this.addBlock(AlfheimrBlocks.WHITE_OAK_LEAVES, "White Oak Leaves");
        this.addBlock(AlfheimrBlocks.WHITE_OAK_SAPLING, "White Oak Sapling");
        this.addBlock(AlfheimrBlocks.WHITE_OAK_PLANKS_SLAB, "White Oak Slab");
        this.addBlock(AlfheimrBlocks.WHITE_OAK_PLANKS_STAIRS, "White Oak Stairs");
        this.addBlock(AlfheimrBlocks.WHITE_OAK_PLANKS_PRESSURE_PLATE, "White Oak Pressure Plate");
        this.addBlock(AlfheimrBlocks.WHITE_OAK_PLANKS_DOOR, "White Oak Door");
        this.addBlock(AlfheimrBlocks.WHITE_OAK_PLANKS_TRAPDOOR, "White Oak Trapdoor");
        this.addBlock(AlfheimrBlocks.WHITE_OAK_PLANKS_FENCE, "White Oak Fence");
        this.addBlock(AlfheimrBlocks.WHITE_OAK_PLANKS_FENCE_GATE, "White Oak Fence Gate");
        this.addBlock(AlfheimrBlocks.WHITE_OAK_PLANKS_BUTTON, "White Oak Button");
        this.addBlock(AlfheimrBlocks.WHITE_OAK_PLANKS_SIGN, "White Oak Sign");
        this.addBlock(AlfheimrBlocks.WHITE_OAK_PLANKS_HANGING_SIGN, "White Oak Hanging Sign");

        //Bur Oak
        this.addBlock(AlfheimrBlocks.BUR_OAK_LOG, "Bur Oak Log");
        this.addBlock(AlfheimrBlocks.BUR_OAK_WOOD, "Bur Oak Wood");
        this.addBlock(AlfheimrBlocks.STRIPPED_BUR_OAK_LOG, "Bur Oak Log Stripped");
        this.addBlock(AlfheimrBlocks.STRIPPED_BUR_OAK_WOOD, "Bur Oak Wood Stripped");
        this.addBlock(AlfheimrBlocks.BUR_OAK_PLANKS, "Bur Oak Planks");
        this.addBlock(AlfheimrBlocks.BUR_OAK_LEAVES, "Bur Oak Leaves");
        this.addBlock(AlfheimrBlocks.BUR_OAK_SAPLING, "Bur Oak Sapling");
        this.addBlock(AlfheimrBlocks.BUR_OAK_PLANKS_SLAB, "Bur Oak Slab");
        this.addBlock(AlfheimrBlocks.BUR_OAK_PLANKS_STAIRS, "Bur Oak Stairs");
        this.addBlock(AlfheimrBlocks.BUR_OAK_PLANKS_PRESSURE_PLATE, "Bur Oak Pressure Plate");
        this.addBlock(AlfheimrBlocks.BUR_OAK_PLANKS_DOOR, "Bur Oak Door");
        this.addBlock(AlfheimrBlocks.BUR_OAK_PLANKS_TRAPDOOR, "Bur Oak Trapdoor");
        this.addBlock(AlfheimrBlocks.BUR_OAK_PLANKS_FENCE, "Bur Oak Fence");
        this.addBlock(AlfheimrBlocks.BUR_OAK_PLANKS_FENCE_GATE, "Bur Oak Fence Gate");
        this.addBlock(AlfheimrBlocks.BUR_OAK_PLANKS_BUTTON, "Bur Oak Button");
        this.addBlock(AlfheimrBlocks.BUR_OAK_PLANKS_SIGN, "Bur Oak Sign");
        this.addBlock(AlfheimrBlocks.BUR_OAK_PLANKS_HANGING_SIGN, "Bur Oak Hanging Sign");

        //Blood Cherry
        this.addBlock(AlfheimrBlocks.BLOOD_CHERRY_LOG, "Blood Cherry Log");
        this.addBlock(AlfheimrBlocks.BLOOD_CHERRY_WOOD, "Blood Cherry Wood");
        this.addBlock(AlfheimrBlocks.STRIPPED_BLOOD_CHERRY_LOG, "Blood Cherry Log Stripped");
        this.addBlock(AlfheimrBlocks.STRIPPED_BLOOD_CHERRY_WOOD, "Blood Cherry Wood Stripped");
        this.addBlock(AlfheimrBlocks.BLOOD_CHERRY_PLANKS, "Blood Cherry Planks");
        this.addBlock(AlfheimrBlocks.BLOOD_CHERRY_LEAVES, "Blood Cherry Leaves");
        this.addBlock(AlfheimrBlocks.BLOOD_CHERRY_SAPLING, "Blood Cherry Sapling");
        this.addBlock(AlfheimrBlocks.BLOOD_CHERRY_PLANKS_SLAB, "Blood Cherry Slab");
        this.addBlock(AlfheimrBlocks.BLOOD_CHERRY_PLANKS_STAIRS, "Blood Cherry Stairs");
        this.addBlock(AlfheimrBlocks.BLOOD_CHERRY_PLANKS_PRESSURE_PLATE, "Blood Cherry Pressure Plate");
        this.addBlock(AlfheimrBlocks.BLOOD_CHERRY_PLANKS_DOOR, "Blood Cherry Door");
        this.addBlock(AlfheimrBlocks.BLOOD_CHERRY_PLANKS_TRAPDOOR, "Blood Cherry Trapdoor");
        this.addBlock(AlfheimrBlocks.BLOOD_CHERRY_PLANKS_FENCE, "Blood Cherry Fence");
        this.addBlock(AlfheimrBlocks.BLOOD_CHERRY_PLANKS_FENCE_GATE, "Blood Cherry Fence Gate");
        this.addBlock(AlfheimrBlocks.BLOOD_CHERRY_PLANKS_BUTTON, "Blood Cherry Button");
        this.addBlock(AlfheimrBlocks.BLOOD_CHERRY_PLANKS_SIGN, "Blood Cherry Sign");
        this.addBlock(AlfheimrBlocks.BLOOD_CHERRY_PLANKS_HANGING_SIGN, "Blood Cherry Hanging Sign");

        //Sacred Tree
        this.addBlock(AlfheimrBlocks.SACRED_TREE_LOG, "Sacred Tree Log");
        this.addBlock(AlfheimrBlocks.SACRED_TREE_WOOD, "Sacred Tree Wood");
        this.addBlock(AlfheimrBlocks.STRIPPED_SACRED_TREE_LOG, "Sacred Tree Log Stripped");
        this.addBlock(AlfheimrBlocks.STRIPPED_SACRED_TREE_WOOD, "Sacred Tree Wood Stripped");
        this.addBlock(AlfheimrBlocks.SACRED_TREE_PLANKS, "Sacred Tree Planks");
        this.addBlock(AlfheimrBlocks.SACRED_TREE_LEAVES, "Sacred Tree Leaves");
        this.addBlock(AlfheimrBlocks.SACRED_TREE_SAPLING, "Sacred Tree Sapling");
        this.addBlock(AlfheimrBlocks.SACRED_TREE_PLANKS_SLAB, "Sacred Tree Slab");
        this.addBlock(AlfheimrBlocks.SACRED_TREE_PLANKS_STAIRS, "Sacred Tree Stairs");
        this.addBlock(AlfheimrBlocks.SACRED_TREE_PLANKS_PRESSURE_PLATE, "Sacred Tree Pressure Plate");
        this.addBlock(AlfheimrBlocks.SACRED_TREE_PLANKS_DOOR, "Sacred Tree Door");
        this.addBlock(AlfheimrBlocks.SACRED_TREE_PLANKS_TRAPDOOR, "Sacred Tree Trapdoor");
        this.addBlock(AlfheimrBlocks.SACRED_TREE_PLANKS_FENCE, "Sacred Tree Fence");
        this.addBlock(AlfheimrBlocks.SACRED_TREE_PLANKS_FENCE_GATE, "Sacred Tree Fence Gate");
        this.addBlock(AlfheimrBlocks.SACRED_TREE_PLANKS_BUTTON, "Sacred Tree Button");
        this.addBlock(AlfheimrBlocks.SACRED_TREE_PLANKS_SIGN, "Sacred Tree Sign");
        this.addBlock(AlfheimrBlocks.SACRED_TREE_PLANKS_HANGING_SIGN, "Sacred Tree Hanging Sign");

        //Willow
        this.addBlock(AlfheimrBlocks.WILLOW_LOG, "Willow Log");
        this.addBlock(AlfheimrBlocks.WILLOW_WOOD, "Willow Wood");
        this.addBlock(AlfheimrBlocks.STRIPPED_WILLOW_LOG, "Willow Log Stripped");
        this.addBlock(AlfheimrBlocks.STRIPPED_WILLOW_WOOD, "Willow Wood Stripped");
        this.addBlock(AlfheimrBlocks.WILLOW_PLANKS, "Willow Planks");
        this.addBlock(AlfheimrBlocks.WILLOW_LEAVES, "Willow Leaves");
        this.addBlock(AlfheimrBlocks.WILLOW_SAPLING, "Willow Sapling");
        this.addBlock(AlfheimrBlocks.WILLOW_PLANKS_SLAB, "Willow Slab");
        this.addBlock(AlfheimrBlocks.WILLOW_PLANKS_STAIRS, "Willow Stairs");
        this.addBlock(AlfheimrBlocks.WILLOW_PLANKS_PRESSURE_PLATE, "Willow Pressure Plate");
        this.addBlock(AlfheimrBlocks.WILLOW_PLANKS_DOOR, "Willow Door");
        this.addBlock(AlfheimrBlocks.WILLOW_PLANKS_TRAPDOOR, "Willow Trapdoor");
        this.addBlock(AlfheimrBlocks.WILLOW_PLANKS_FENCE, "Willow Fence");
        this.addBlock(AlfheimrBlocks.WILLOW_PLANKS_FENCE_GATE, "Willow Fence Gate");
        this.addBlock(AlfheimrBlocks.WILLOW_PLANKS_BUTTON, "Willow Button");
        this.addBlock(AlfheimrBlocks.WILLOW_PLANKS_SIGN, "Willow Sign");
        this.addBlock(AlfheimrBlocks.WILLOW_PLANKS_HANGING_SIGN, "Willow Hanging Sign");

        //Deadwood
        this.addBlock(AlfheimrBlocks.DEADWOOD_LOG, "Deadwood Log");
        this.addBlock(AlfheimrBlocks.DEADWOOD_WOOD, "Deadwood Wood");
        this.addBlock(AlfheimrBlocks.STRIPPED_DEADWOOD_LOG, "Deadwood Log Stripped");
        this.addBlock(AlfheimrBlocks.STRIPPED_DEADWOOD_WOOD, "Deadwood Wood Stripped");
        this.addBlock(AlfheimrBlocks.DEADWOOD_PLANKS, "Deadwood Planks");
        this.addBlock(AlfheimrBlocks.DEADWOOD_LEAVES, "Deadwood Leaves");
        this.addBlock(AlfheimrBlocks.DEADWOOD_SAPLING, "Deadwood Sapling");
        this.addBlock(AlfheimrBlocks.DEADWOOD_PLANKS_SLAB, "Deadwood Slab");
        this.addBlock(AlfheimrBlocks.DEADWOOD_PLANKS_STAIRS, "Deadwood Stairs");
        this.addBlock(AlfheimrBlocks.DEADWOOD_PLANKS_PRESSURE_PLATE, "Deadwood Pressure Plate");
        this.addBlock(AlfheimrBlocks.DEADWOOD_PLANKS_DOOR, "Deadwood Door");
        this.addBlock(AlfheimrBlocks.DEADWOOD_PLANKS_TRAPDOOR, "Deadwood Trapdoor");
        this.addBlock(AlfheimrBlocks.DEADWOOD_PLANKS_FENCE, "Deadwood Fence");
        this.addBlock(AlfheimrBlocks.DEADWOOD_PLANKS_FENCE_GATE, "Deadwood Fence Gate");
        this.addBlock(AlfheimrBlocks.DEADWOOD_PLANKS_BUTTON, "Deadwood Button");
        this.addBlock(AlfheimrBlocks.DEADWOOD_PLANKS_SIGN, "Deadwood Sign");
        this.addBlock(AlfheimrBlocks.DEADWOOD_PLANKS_HANGING_SIGN, "Deadwood Hanging Sign");

        //Ebony Kingswood
        this.addBlock(AlfheimrBlocks.EBONY_KINGSWOOD_LOG, "Ebony Kingswood Log");
        this.addBlock(AlfheimrBlocks.EBONY_KINGSWOOD_WOOD, "Ebony Kingswood Wood");
        this.addBlock(AlfheimrBlocks.STRIPPED_EBONY_KINGSWOOD_LOG, "Ebony Kingswood Log Stripped");
        this.addBlock(AlfheimrBlocks.STRIPPED_EBONY_KINGSWOOD_WOOD, "Ebony Kingswood Wood Stripped");
        this.addBlock(AlfheimrBlocks.EBONY_KINGSWOOD_PLANKS, "Ebony Kingswood Planks");
        this.addBlock(AlfheimrBlocks.EBONY_KINGSWOOD_LEAVES, "Ebony Kingswood Leaves");
        this.addBlock(AlfheimrBlocks.EBONY_KINGSWOOD_SAPLING, "Ebony Kingswood Sapling");
        this.addBlock(AlfheimrBlocks.EBONY_KINGSWOOD_PLANKS_SLAB, "Ebony Kingswood Slab");
        this.addBlock(AlfheimrBlocks.EBONY_KINGSWOOD_PLANKS_STAIRS, "Ebony Kingswood Stairs");
        this.addBlock(AlfheimrBlocks.EBONY_KINGSWOOD_PLANKS_PRESSURE_PLATE, "Ebony Kingswood Pressure Plate");
        this.addBlock(AlfheimrBlocks.EBONY_KINGSWOOD_PLANKS_DOOR, "Ebony Kingswood Door");
        this.addBlock(AlfheimrBlocks.EBONY_KINGSWOOD_PLANKS_TRAPDOOR, "Ebony Kingswood Trapdoor");
        this.addBlock(AlfheimrBlocks.EBONY_KINGSWOOD_PLANKS_FENCE, "Ebony Kingswood Fence");
        this.addBlock(AlfheimrBlocks.EBONY_KINGSWOOD_PLANKS_FENCE_GATE, "Ebony Kingswood Fence Gate");
        this.addBlock(AlfheimrBlocks.EBONY_KINGSWOOD_PLANKS_BUTTON, "Ebony Kingswood Button");
        this.addBlock(AlfheimrBlocks.EBONY_KINGSWOOD_PLANKS_SIGN, "Ebony Kingswood Sign");
        this.addBlock(AlfheimrBlocks.EBONY_KINGSWOOD_PLANKS_HANGING_SIGN, "Ebony Kingswood Hanging Sign");

        //Ivory Kingswood
        this.addBlock(AlfheimrBlocks.IVORY_KINGSWOOD_LOG, "Ivory Kingswood Log");
        this.addBlock(AlfheimrBlocks.IVORY_KINGSWOOD_WOOD, "Ivory Kingswood Wood");
        this.addBlock(AlfheimrBlocks.STRIPPED_IVORY_KINGSWOOD_LOG, "Ivory Kingswood Log Stripped");
        this.addBlock(AlfheimrBlocks.STRIPPED_IVORY_KINGSWOOD_WOOD, "Ivory Kingswood Wood Stripped");
        this.addBlock(AlfheimrBlocks.IVORY_KINGSWOOD_PLANKS, "Ivory Kingswood Planks");
        this.addBlock(AlfheimrBlocks.IVORY_KINGSWOOD_LEAVES, "Ivory Kingswood Leaves");
        this.addBlock(AlfheimrBlocks.IVORY_KINGSWOOD_SAPLING, "Ivory Kingswood Sapling");
        this.addBlock(AlfheimrBlocks.IVORY_KINGSWOOD_PLANKS_SLAB, "Ivory Kingswood Slab");
        this.addBlock(AlfheimrBlocks.IVORY_KINGSWOOD_PLANKS_STAIRS, "Ivory Kingswood Stairs");
        this.addBlock(AlfheimrBlocks.IVORY_KINGSWOOD_PLANKS_PRESSURE_PLATE, "Ivory Kingswood Pressure Plate");
        this.addBlock(AlfheimrBlocks.IVORY_KINGSWOOD_PLANKS_DOOR, "Ivory Kingswood Door");
        this.addBlock(AlfheimrBlocks.IVORY_KINGSWOOD_PLANKS_TRAPDOOR, "Ivory Kingswood Trapdoor");
        this.addBlock(AlfheimrBlocks.IVORY_KINGSWOOD_PLANKS_FENCE, "Ivory Kingswood Fence");
        this.addBlock(AlfheimrBlocks.IVORY_KINGSWOOD_PLANKS_FENCE_GATE, "Ivory Kingswood Fence Gate");
        this.addBlock(AlfheimrBlocks.IVORY_KINGSWOOD_PLANKS_BUTTON, "Ivory Kingswood Button");
        this.addBlock(AlfheimrBlocks.IVORY_KINGSWOOD_PLANKS_SIGN, "Ivory Kingswood Sign");
        this.addBlock(AlfheimrBlocks.IVORY_KINGSWOOD_PLANKS_HANGING_SIGN, "Ivory Kingswood Hanging Sign");

        //Weaver
        this.addBlock(AlfheimrBlocks.WEAVER_LOG, "Weaver Log");
        this.addBlock(AlfheimrBlocks.WEAVER_WOOD, "Weaver Wood");
        this.addBlock(AlfheimrBlocks.STRIPPED_WEAVER_LOG, "Weaver Log Stripped");
        this.addBlock(AlfheimrBlocks.STRIPPED_WEAVER_WOOD, "Weaver Wood Stripped");
        this.addBlock(AlfheimrBlocks.WEAVER_PLANKS, "Weaver Planks");
        this.addBlock(AlfheimrBlocks.WEAVER_LEAVES, "Weaver Leaves");
        this.addBlock(AlfheimrBlocks.WEAVER_SAPLING, "Weaver Sapling");
        this.addBlock(AlfheimrBlocks.WEAVER_PLANKS_SLAB, "Weaver Slab");
        this.addBlock(AlfheimrBlocks.WEAVER_PLANKS_STAIRS, "Weaver Stairs");
        this.addBlock(AlfheimrBlocks.WEAVER_PLANKS_PRESSURE_PLATE, "Weaver Pressure Plate");
        this.addBlock(AlfheimrBlocks.WEAVER_PLANKS_DOOR, "Weaver Door");
        this.addBlock(AlfheimrBlocks.WEAVER_PLANKS_TRAPDOOR, "Weaver Trapdoor");
        this.addBlock(AlfheimrBlocks.WEAVER_PLANKS_FENCE, "Weaver Fence");
        this.addBlock(AlfheimrBlocks.WEAVER_PLANKS_FENCE_GATE, "Weaver Fence Gate");
        this.addBlock(AlfheimrBlocks.WEAVER_PLANKS_BUTTON, "Weaver Button");
        this.addBlock(AlfheimrBlocks.WEAVER_PLANKS_SIGN, "Weaver Sign");
        this.addBlock(AlfheimrBlocks.WEAVER_PLANKS_HANGING_SIGN, "Weaver Hanging Sign");

        this.addItem(ModItems.AQUAMARINE, "Aquamarine");
        this.addItem(ModItems.OPAL, "Opal");
        this.addItem(ModItems.RUBY, "Ruby");

        this.addItem(ModItems.CRIMSON_DIAMOND, "Crimson Diamond");
        this.addItem(UnderworldItems.POMEGRANATE, "Pomegranate");
        this.addItem(UnderworldItems.OLIVE, "Olive");
        this.addItem(ModItems.CRIMSON_TEAR, "Crimson Tear");
        this.addItem(ModItems.CUSTOM_BOW, "Custom Bow");
        this.addItem(ModItems.ALEXANDRITE_SHIELD, "Alexandrite Shield");

        this.addItem(AlfheimrItems.DURUM_WHEAT, "Durum Wheat");
        this.addItem(AlfheimrItems.DURUM_WHEAT_SEEDS, "Durum Wheat Seeds");
        this.addItem(AlfheimrItems.TOMATO, "Tomato");
        this.addItem(AlfheimrItems.TOMATO_SEEDS, "Tomato Seeds");
        this.addItem(AlfheimrItems.WILD_ONION, "Wild Onion");
        this.addItem(AlfheimrItems.ONION_STAGE_1, "Onion");
        this.addItem(AlfheimrItems.ONION_STAGE_2, "Onion");
        this.addItem(AlfheimrItems.ONION_STAGE_3, "Onion");
        this.addItem(AlfheimrItems.ONION, "Onion");
        this.addItem(AlfheimrItems.DRAGON_FRUIT, "Dragon Fruit");
        this.addItem(AlfheimrItems.DRAGON_FRUIT_SEEDS, "Dragon Fruit Seeds");
        this.addItem(AlfheimrItems.CHILLI, "Chilli");
        this.addItem(AlfheimrItems.CHILLI_SEEDS, "Chilli Seeds");

        this.addItem(ModItems.MEDUSA_HEAD, "Medusa Head");

        this.addItem(ModItems.DATA_TABLET, "Data Tablet");

        this.addItem(UnderworldItems.POMEGRANATE_SEEDS, "Pomegranate Seeds");

        //Orichalcum
        this.addBlock(UnderworldBlocks.ORICHALCUM_BLOCK, "Orichalcum Block");
        this.addBlock(UnderworldBlocks.RAW_ORICHALCUM_BLOCK, "Raw Orichalcum Block");
        this.addBlock(UnderworldBlocks.ORICHALCUM_ORE, "Orichalcum Ore");
        this.addBlock(UnderworldBlocks.DEEPSLATE_ORICHALCUM_ORE, "Deepslate Orichalcum Ore");
        this.addItem(UnderworldItems.ORICHALCUM_INGOT, "Orichalcum Ingot");
        this.addItem(UnderworldItems.RAW_ORICHALCUM, "Raw Orichalcum");
        this.addItem(UnderworldItems.ORICHALCUM_NUGGET, "Orichalcum Nugget");

        this.addItem(UnderworldItems.ORICHALCUM_SWORD, "Orichalcum Sword");
        this.addItem(UnderworldItems.ORICHALCUM_PICKAXE, "Orichalcum Pickaxe");
        this.addItem(UnderworldItems.ORICHALCUM_SHOVEL, "Orichalcum Shovel");
        this.addItem(UnderworldItems.ORICHALCUM_AXE, "Orichalcum Axe");
        this.addItem(UnderworldItems.ORICHALCUM_HOE, "Orichalcum Hoe");

        this.addItem(UnderworldItems.ORICHALCUM_HELMET, "Orichalcum Helmet");
        this.addItem(UnderworldItems.ORICHALCUM_CHESTPLATE, "Orichalcum Chestplate");
        this.addItem(UnderworldItems.ORICHALCUM_LEGGINGS, "Orichalcum Leggings");
        this.addItem(UnderworldItems.ORICHALCUM_BOOTS, "Orichalcum Boots");

        this.addItem(UnderworldItems.ORICHALCUM_HORSE_ARMOR, "Orichalcum Horse Armor");

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

        //Mushroom
        this.addBlock(AlfheimrBlocks.POINT_MUSHROOM_BLOCK, "Point Mushroom Block");
        this.addBlock(AlfheimrBlocks.POTTED_POINT_MUSHROOM_BLOCK, "Potted Point Mushroom Block");
        this.addBlock(AlfheimrBlocks.TOP_POINT_MUSHROOM_BLOCK, "Top Point Mushroom Block");
        this.addBlock(AlfheimrBlocks.POINT_MUSHROOM_STEM_BLOCK, "Point Mushroom Stem Block");

        this.addBlock(AlfheimrBlocks.WITCHES_MUSHROOM_BLOCK, "Witches Mushroom Block");
        this.addBlock(AlfheimrBlocks.POTTED_WITCHES_MUSHROOM_BLOCK, "Potted Witches Mushroom Block");
        this.addBlock(AlfheimrBlocks.TOP_WITCHES_MUSHROOM_BLOCK, "Top Witches Mushroom Block");
        this.addBlock(AlfheimrBlocks.WITCHES_MUSHROOM_STEM_BLOCK, "Witches Mushroom Stem Block");

        this.addBlock(AlfheimrBlocks.ROYAL_BLUE_MUSHROOM_BLOCK, "Royal Blue Mushroom Block");
        this.addBlock(AlfheimrBlocks.POTTED_ROYAL_BLUE_MUSHROOM_BLOCK, "Potted Royal Blue Mushroom Block");
        this.addBlock(AlfheimrBlocks.TOP_ROYAL_BLUE_MUSHROOM_BLOCK, "Top Royal Blue Mushroom Block");
        this.addBlock(AlfheimrBlocks.ROYAL_BLUE_MUSHROOM_STEM_BLOCK, "Royal Blue Mushroom Stem Block");
        this.addBlock(AlfheimrBlocks.ROYAL_BLUE_MUSHROOM_GLOW_BLOCK, "Royal Blue Mushroom Glow Block");

        this.addBlock(AlfheimrBlocks.SHORT_TOP_MUSHROOM_BLOCK, "Short Top Mushroom Block");
        this.addBlock(AlfheimrBlocks.POTTED_SHORT_TOP_MUSHROOM_BLOCK, "Potted Short Top Mushroom Block");
        this.addBlock(AlfheimrBlocks.TOP_SHORT_TOP_MUSHROOM_BLOCK, "Top Short Top Mushroom Block");
        this.addBlock(AlfheimrBlocks.SHORT_TOP_MUSHROOM_STEM_BLOCK, "Short Top Mushroom Stem Block");

        this.addBlock(AlfheimrBlocks.SPECTRAL_MUSHROOM_BLOCK, "Spectral Mushroom Block");
        this.addBlock(AlfheimrBlocks.POTTED_SPECTRAL_MUSHROOM_BLOCK, "Potted Spectral Mushroom Block");
        this.addBlock(AlfheimrBlocks.TOP_SPECTRAL_MUSHROOM_BLOCK, "Top Spectral Mushroom Block");
        this.addBlock(AlfheimrBlocks.SPECTRAL_MUSHROOM_STEM_BLOCK, "Spectral Spectral Mushroom Block");

        this.addBlock(AlfheimrBlocks.SHADE_MUSHROOM_VINE_BLOCK, "Shade Mushroom Vine Block");
        this.addBlock(AlfheimrBlocks.POTTED_SHADE_MUSHROOM_BLOCK, "Potted Shade Mushroom Vine Block");
        this.addBlock(AlfheimrBlocks.SHADE_MUSHROOM_BLOCK, "Shade Mushroom");

        this.addBlock(AlfheimrBlocks.CAP_MUSHROOM_VINE_BLOCK, "Cap Mushroom Vine Block");
        this.addBlock(AlfheimrBlocks.POTTED_CAP_MUSHROOM_BLOCK, "Potted Cap Mushroom Vine Block");
        this.addBlock(AlfheimrBlocks.CAP_MUSHROOM_BLOCK, "Cap Mushroom");

        //Misc
        this.addItem(AtlantisItems.SHARK_TOOTH, "Shark Tooth");

        this.addBlock(AlfheimrBlocks.ALFHEIMR_MAGIC_GRASS, "Alfheimr Magic Grass");

        //Decor
        this.addBlock(ModBlocks.STICK_DECOR, "Stick Pile");
        this.addBlock(ModBlocks.ROCK_DECOR, "Rock");
        this.addBlock(ModBlocks.LEAVES_DECOR, "Leaves Pile");
        this.addBlock(ModBlocks.SEASHELL_DECOR, "Seashell");

        //Adamant
        this.addBlock(UnderworldBlocks.ADAMANT_BLOCK, "Adamant Block");
        this.addBlock(UnderworldBlocks.ADAMANT_ORE, "Adamant Ore");
        this.addBlock(UnderworldBlocks.DEEPSLATE_ADAMANT_ORE, "Deepslate Adamant Ore");
        this.addItem(UnderworldItems.ADAMANT, "Adamant");

        //STONES
        this.addBlock(NidavellirBlocks.NIDAVELLIR_SOFT_STONE, "Nidavellir Soft Stone");
        this.addBlock(NidavellirBlocks.NIDAVELLIR_SOFT_STONE_STAIRS, "Nidavellir Soft Stone Stairs");
        this.addBlock(NidavellirBlocks.NIDAVELLIR_SOFT_STONE_SLAB, "Nidavellir Soft Stone Slab");
        this.addBlock(NidavellirBlocks.NIDAVELLIR_SOFT_STONE_PRESSURE_PLATE, "Nidavellir Soft Stone Pressure Plate");
        this.addBlock(NidavellirBlocks.NIDAVELLIR_SOFT_STONE_BUTTON, "Nidavellir Soft Stone Button");
        this.addBlock(NidavellirBlocks.NIDAVELLIR_SOFT_STONE_WALL, "Nidavellir Soft Stone Wall");
        this.addBlock(NidavellirBlocks.NIDAVELLIR_SOFT_SMOOTH_STONE, "Nidavellir Soft Stone Smoothed");
        this.addBlock(NidavellirBlocks.NIDAVELLIR_SOFT_COBBLESTONE, "Nidavellir Soft Cobbletone");
        this.addBlock(NidavellirBlocks.NIDAVELLIR_SOFT_COBBLESTONE_STAIRS, "Nidavellir Soft Cobbletone Stairs");
        this.addBlock(NidavellirBlocks.NIDAVELLIR_SOFT_COBBLESTONE_SLAB, "Nidavellir Soft Cobbletone Slab");
        this.addBlock(NidavellirBlocks.NIDAVELLIR_SOFT_COBBLESTONE_WALL, "Nidavellir Soft Cobbletone Wall");
        this.addBlock(NidavellirBlocks.NIDAVELLIR_SOFT_COBBLESTONE_MOSSY, "Mossy Nidavellir Soft Cobbletone");
        this.addBlock(NidavellirBlocks.NIDAVELLIR_SOFT_STONE_BRICKS, "Nidavellir Soft Stone Bricks");
        this.addBlock(NidavellirBlocks.NIDAVELLIR_SOFT_STONE_BRICKS_STAIRS, "Nidavellir Soft Stone Bricks Stairs");
        this.addBlock(NidavellirBlocks.NIDAVELLIR_SOFT_STONE_BRICKS_SLAB, "Nidavellir Soft Stone Bricks Slab");
        this.addBlock(NidavellirBlocks.NIDAVELLIR_SOFT_STONE_BRICKS_WALL, "Nidavellir Soft Stone Bricks Wall");
        this.addBlock(NidavellirBlocks.NIDAVELLIR_SOFT_STONE_BRICKS_MOSSY, "Mossy Nidavellir Soft Stone Bricks");
        this.addBlock(NidavellirBlocks.NIDAVELLIR_SOFT_STONE_BRICKS_CRACKED, "Cracked Nidavellir Soft Stone Bricks");
        this.addBlock(NidavellirBlocks.NIDAVELLIR_SOFT_STONE_BRICKS_CHISELED, "Chiseled Nidavellir Soft Stone Bricks");

        this.addBlock(NidavellirBlocks.NIDAVELLIR_SOFT_STONE_IRON_ORE, "Nidavellir Soft Iron Ore");
        this.addBlock(NidavellirBlocks.NIDAVELLIR_SOFT_STONE_GOLD_ORE, "Nidavellir Soft Gold Ore");
        this.addBlock(NidavellirBlocks.NIDAVELLIR_SOFT_STONE_COPPER_ORE, "Nidavellir Soft Copper Ore");
        this.addBlock(NidavellirBlocks.NIDAVELLIR_SOFT_STONE_TIN_ORE, "Nidavellir Soft Tin Ore");
        this.addBlock(NidavellirBlocks.NIDAVELLIR_SOFT_STONE_ZINC_ORE, "Nidavellir Soft Zinc Ore");
        this.addBlock(NidavellirBlocks.NIDAVELLIR_SOFT_STONE_DIAMOND_ORE, "Nidavellir Soft Diamond Ore");
        this.addBlock(NidavellirBlocks.NIDAVELLIR_SOFT_STONE_EMERALD_ORE, "Nidavellir Soft Emerald Ore");
        this.addBlock(NidavellirBlocks.NIDAVELLIR_SOFT_STONE_COAL_ORE, "Nidavellir Soft Coal Ore");
        this.addBlock(NidavellirBlocks.NIDAVELLIR_SOFT_STONE_REDSTONE_ORE, "Nidavellir Soft Redstone Ore");
        this.addBlock(NidavellirBlocks.NIDAVELLIR_SOFT_STONE_LAPIS_ORE, "Nidavellir Soft Lapis Ore");
        this.addBlock(NidavellirBlocks.NIDAVELLIR_SOFT_STONE_AQUAMARINE_ORE, "Nidavellir Soft Aquamarine Ore");
        this.addBlock(NidavellirBlocks.NIDAVELLIR_SOFT_STONE_OPAL_ORE, "Nidavellir Soft Opal Ore");
        this.addBlock(NidavellirBlocks.NIDAVELLIR_SOFT_STONE_RUBY_ORE, "Nidavellir Soft Ruby Ore");

        this.addBlock(NidavellirBlocks.NIDAVELLIR_SOFT_STONE_IRON_ORE_CLUSTER, "Nidavellir Soft Iron Ore Cluster");
        this.addBlock(NidavellirBlocks.NIDAVELLIR_SOFT_STONE_GOLD_ORE_CLUSTER, "Nidavellir Soft Gold Ore Cluster");
        this.addBlock(NidavellirBlocks.NIDAVELLIR_SOFT_STONE_COPPER_ORE_CLUSTER, "Nidavellir Soft Copper Ore Cluster");
        this.addBlock(NidavellirBlocks.NIDAVELLIR_SOFT_STONE_TIN_ORE_CLUSTER, "Nidavellir Soft Tin Ore Cluster");
        this.addBlock(NidavellirBlocks.NIDAVELLIR_SOFT_STONE_ZINC_ORE_CLUSTER, "Nidavellir Soft Zinc Ore Cluster");
        this.addBlock(NidavellirBlocks.NIDAVELLIR_SOFT_STONE_DIAMOND_ORE_CLUSTER, "Nidavellir Soft Diamond Ore Cluster");
        this.addBlock(NidavellirBlocks.NIDAVELLIR_SOFT_STONE_EMERALD_ORE_CLUSTER, "Nidavellir Soft Emerald Ore Cluster");
        this.addBlock(NidavellirBlocks.NIDAVELLIR_SOFT_STONE_COAL_ORE_CLUSTER, "Nidavellir Soft Coal Ore Cluster");
        this.addBlock(NidavellirBlocks.NIDAVELLIR_SOFT_STONE_REDSTONE_ORE_CLUSTER, "Nidavellir Soft Redstone Ore Cluster");
        this.addBlock(NidavellirBlocks.NIDAVELLIR_SOFT_STONE_LAPIS_ORE_CLUSTER, "Nidavellir Soft Lapis Ore Cluster");
        this.addBlock(NidavellirBlocks.NIDAVELLIR_SOFT_STONE_AQUAMARINE_ORE_CLUSTER, "Nidavellir Soft Aquamarine Ore Cluster");
        this.addBlock(NidavellirBlocks.NIDAVELLIR_SOFT_STONE_OPAL_ORE_CLUSTER, "Nidavellir Soft Opal Ore Cluster");
        this.addBlock(NidavellirBlocks.NIDAVELLIR_SOFT_STONE_RUBY_ORE_CLUSTER, "Nidavellir Soft Ruby Ore Cluster");

        this.addBlock(NidavellirBlocks.NIDAVELLIR_HARD_STONE, "Nidavellir Hard Stone");
        this.addBlock(NidavellirBlocks.NIDAVELLIR_HARD_STONE_STAIRS, "Nidavellir Hard Stone Stairs");
        this.addBlock(NidavellirBlocks.NIDAVELLIR_HARD_STONE_SLAB, "Nidavellir Hard Stone Slab");
        this.addBlock(NidavellirBlocks.NIDAVELLIR_HARD_STONE_PRESSURE_PLATE, "Nidavellir Hard Stone Pressure Plate");
        this.addBlock(NidavellirBlocks.NIDAVELLIR_HARD_STONE_BUTTON, "Nidavellir Hard Stone Button");
        this.addBlock(NidavellirBlocks.NIDAVELLIR_HARD_STONE_WALL, "Nidavellir Hard Stone Wall");
        this.addBlock(NidavellirBlocks.NIDAVELLIR_HARD_SMOOTH_STONE, "Nidavellir Hard Stone Smoothed");
        this.addBlock(NidavellirBlocks.NIDAVELLIR_HARD_COBBLESTONE, "Nidavellir Hard Cobbletone");
        this.addBlock(NidavellirBlocks.NIDAVELLIR_HARD_COBBLESTONE_STAIRS, "Nidavellir Hard Cobbletone Stairs");
        this.addBlock(NidavellirBlocks.NIDAVELLIR_HARD_COBBLESTONE_SLAB, "Nidavellir Hard Cobbletone Slab");
        this.addBlock(NidavellirBlocks.NIDAVELLIR_HARD_COBBLESTONE_WALL, "Nidavellir Hard Cobbletone Wall");
        this.addBlock(NidavellirBlocks.NIDAVELLIR_HARD_COBBLESTONE_MOSSY, "Mossy Nidavellir Hard Cobbletone");
        this.addBlock(NidavellirBlocks.NIDAVELLIR_HARD_STONE_BRICKS, "Nidavellir Hard Stone Bricks");
        this.addBlock(NidavellirBlocks.NIDAVELLIR_HARD_STONE_BRICKS_STAIRS, "Nidavellir Hard Stone Bricks Stairs");
        this.addBlock(NidavellirBlocks.NIDAVELLIR_HARD_STONE_BRICKS_SLAB, "Nidavellir Hard Stone Bricks Slab");
        this.addBlock(NidavellirBlocks.NIDAVELLIR_HARD_STONE_BRICKS_WALL, "Nidavellir Hard Stone Bricks Wall");
        this.addBlock(NidavellirBlocks.NIDAVELLIR_HARD_STONE_BRICKS_MOSSY, "Mossy Nidavellir Hard Stone Bricks");
        this.addBlock(NidavellirBlocks.NIDAVELLIR_HARD_STONE_BRICKS_CRACKED, "Cracked Nidavellir Hard Stone Bricks");
        this.addBlock(NidavellirBlocks.NIDAVELLIR_HARD_STONE_BRICKS_CHISELED, "Chiseled Nidavellir Hard Stone Bricks");

        this.addBlock(NidavellirBlocks.NIDAVELLIR_HARD_STONE_IRON_ORE, "Nidavellir Hard Iron Ore");
        this.addBlock(NidavellirBlocks.NIDAVELLIR_HARD_STONE_GOLD_ORE, "Nidavellir Hard Gold Ore");
        this.addBlock(NidavellirBlocks.NIDAVELLIR_HARD_STONE_COPPER_ORE, "Nidavellir Hard Copper Ore");
        this.addBlock(NidavellirBlocks.NIDAVELLIR_HARD_STONE_TIN_ORE, "Nidavellir Hard Tin Ore");
        this.addBlock(NidavellirBlocks.NIDAVELLIR_HARD_STONE_ZINC_ORE, "Nidavellir Hard Zinc Ore");
        this.addBlock(NidavellirBlocks.NIDAVELLIR_HARD_STONE_DIAMOND_ORE, "Nidavellir Hard Diamond Ore");
        this.addBlock(NidavellirBlocks.NIDAVELLIR_HARD_STONE_EMERALD_ORE, "Nidavellir Hard Emerald Ore");
        this.addBlock(NidavellirBlocks.NIDAVELLIR_HARD_STONE_COAL_ORE, "Nidavellir Hard Coal Ore");
        this.addBlock(NidavellirBlocks.NIDAVELLIR_HARD_STONE_REDSTONE_ORE, "Nidavellir Hard Redstone Ore");
        this.addBlock(NidavellirBlocks.NIDAVELLIR_HARD_STONE_LAPIS_ORE, "Nidavellir Hard Lapis Ore");
        this.addBlock(NidavellirBlocks.NIDAVELLIR_HARD_STONE_AQUAMARINE_ORE, "Nidavellir Hard Aquamarine Ore");
        this.addBlock(NidavellirBlocks.NIDAVELLIR_HARD_STONE_OPAL_ORE, "Nidavellir Hard Opal Ore");
        this.addBlock(NidavellirBlocks.NIDAVELLIR_HARD_STONE_RUBY_ORE, "Nidavellir Hard Ruby Ore");

        this.addBlock(NidavellirBlocks.NIDAVELLIR_HARD_STONE_IRON_ORE_CLUSTER, "Nidavellir Hard Iron Ore Cluster");
        this.addBlock(NidavellirBlocks.NIDAVELLIR_HARD_STONE_GOLD_ORE_CLUSTER, "Nidavellir Hard Gold Ore Cluster");
        this.addBlock(NidavellirBlocks.NIDAVELLIR_HARD_STONE_COPPER_ORE_CLUSTER, "Nidavellir Hard Copper Ore Cluster");
        this.addBlock(NidavellirBlocks.NIDAVELLIR_HARD_STONE_TIN_ORE_CLUSTER, "Nidavellir Hard Tin Ore Cluster");
        this.addBlock(NidavellirBlocks.NIDAVELLIR_HARD_STONE_ZINC_ORE_CLUSTER, "Nidavellir Hard Zinc Ore Cluster");
        this.addBlock(NidavellirBlocks.NIDAVELLIR_HARD_STONE_DIAMOND_ORE_CLUSTER, "Nidavellir Hard Diamond Ore Cluster");
        this.addBlock(NidavellirBlocks.NIDAVELLIR_HARD_STONE_EMERALD_ORE_CLUSTER, "Nidavellir Hard Emerald Ore Cluster");
        this.addBlock(NidavellirBlocks.NIDAVELLIR_HARD_STONE_COAL_ORE_CLUSTER, "Nidavellir Hard Coal Ore Cluster");
        this.addBlock(NidavellirBlocks.NIDAVELLIR_HARD_STONE_REDSTONE_ORE_CLUSTER, "Nidavellir Hard Redstone Ore Cluster");
        this.addBlock(NidavellirBlocks.NIDAVELLIR_HARD_STONE_LAPIS_ORE_CLUSTER, "Nidavellir Hard Lapis Ore Cluster");
        this.addBlock(NidavellirBlocks.NIDAVELLIR_HARD_STONE_AQUAMARINE_ORE_CLUSTER, "Nidavellir Hard Aquamarine Ore Cluster");
        this.addBlock(NidavellirBlocks.NIDAVELLIR_HARD_STONE_OPAL_ORE_CLUSTER, "Nidavellir Hard Opal Ore Cluster");
        this.addBlock(NidavellirBlocks.NIDAVELLIR_HARD_STONE_RUBY_ORE_CLUSTER, "Nidavellir Hard Ruby Ore Cluster");

        this.addBlock(NidavellirBlocks.NIDAVELLIR_ENHANCED_STONE, "Nidavellir Enhanced Stone");
        this.addBlock(NidavellirBlocks.NIDAVELLIR_ENHANCED_STONE_STAIRS, "Nidavellir Enhanced Stone Stairs");
        this.addBlock(NidavellirBlocks.NIDAVELLIR_ENHANCED_STONE_SLAB, "Nidavellir Enhanced Stone Slab");
        this.addBlock(NidavellirBlocks.NIDAVELLIR_ENHANCED_STONE_PRESSURE_PLATE, "Nidavellir Enhanced Stone Pressure Plate");
        this.addBlock(NidavellirBlocks.NIDAVELLIR_ENHANCED_STONE_BUTTON, "Nidavellir Enhanced Stone Button");
        this.addBlock(NidavellirBlocks.NIDAVELLIR_ENHANCED_STONE_WALL, "Nidavellir Enhanced Stone Wall");
        this.addBlock(NidavellirBlocks.NIDAVELLIR_ENHANCED_SMOOTH_STONE, "Nidavellir Enhanced Stone Smoothed");
        this.addBlock(NidavellirBlocks.NIDAVELLIR_ENHANCED_COBBLESTONE, "Nidavellir Enhanced Cobbletone");
        this.addBlock(NidavellirBlocks.NIDAVELLIR_ENHANCED_COBBLESTONE_STAIRS, "Nidavellir Enhanced Cobbletone Stairs");
        this.addBlock(NidavellirBlocks.NIDAVELLIR_ENHANCED_COBBLESTONE_SLAB, "Nidavellir Enhanced Cobbletone Slab");
        this.addBlock(NidavellirBlocks.NIDAVELLIR_ENHANCED_COBBLESTONE_WALL, "Nidavellir Enhanced Cobbletone Wall");
        this.addBlock(NidavellirBlocks.NIDAVELLIR_ENHANCED_COBBLESTONE_MOSSY, "Mossy Nidavellir Enhanced Cobbletone");
        this.addBlock(NidavellirBlocks.NIDAVELLIR_ENHANCED_STONE_BRICKS, "Nidavellir Enhanced Stone Bricks");
        this.addBlock(NidavellirBlocks.NIDAVELLIR_ENHANCED_STONE_BRICKS_STAIRS, "Nidavellir Enhanced Stone Bricks Stairs");
        this.addBlock(NidavellirBlocks.NIDAVELLIR_ENHANCED_STONE_BRICKS_SLAB, "Nidavellir Enhanced Stone Bricks Slab");
        this.addBlock(NidavellirBlocks.NIDAVELLIR_ENHANCED_STONE_BRICKS_WALL, "Nidavellir Enhanced Stone Bricks Wall");
        this.addBlock(NidavellirBlocks.NIDAVELLIR_ENHANCED_STONE_BRICKS_MOSSY, "Mossy Nidavellir Enhanced Stone Bricks");
        this.addBlock(NidavellirBlocks.NIDAVELLIR_ENHANCED_STONE_BRICKS_CRACKED, "Cracked Nidavellir Enhanced Stone Bricks");
        this.addBlock(NidavellirBlocks.NIDAVELLIR_ENHANCED_STONE_BRICKS_CHISELED, "Chiseled Nidavellir Enhanced Stone Bricks");

        this.addBlock(NidavellirBlocks.NIDAVELLIR_ENHANCED_STONE_IRON_ORE, "Nidavellir Enhanced Iron Ore");
        this.addBlock(NidavellirBlocks.NIDAVELLIR_ENHANCED_STONE_GOLD_ORE, "Nidavellir Enhanced Gold Ore");
        this.addBlock(NidavellirBlocks.NIDAVELLIR_ENHANCED_STONE_COPPER_ORE, "Nidavellir Enhanced Copper Ore");
        this.addBlock(NidavellirBlocks.NIDAVELLIR_ENHANCED_STONE_TIN_ORE, "Nidavellir Enhanced Tin Ore");
        this.addBlock(NidavellirBlocks.NIDAVELLIR_ENHANCED_STONE_ZINC_ORE, "Nidavellir Enhanced Zinc Ore");
        this.addBlock(NidavellirBlocks.NIDAVELLIR_ENHANCED_STONE_DIAMOND_ORE, "Nidavellir Enhanced Diamond Ore");
        this.addBlock(NidavellirBlocks.NIDAVELLIR_ENHANCED_STONE_EMERALD_ORE, "Nidavellir Enhanced Emerald Ore");
        this.addBlock(NidavellirBlocks.NIDAVELLIR_ENHANCED_STONE_COAL_ORE, "Nidavellir Enhanced Coal Ore");
        this.addBlock(NidavellirBlocks.NIDAVELLIR_ENHANCED_STONE_REDSTONE_ORE, "Nidavellir Enhanced Redstone Ore");
        this.addBlock(NidavellirBlocks.NIDAVELLIR_ENHANCED_STONE_LAPIS_ORE, "Nidavellir Enhanced Lapis Ore");
        this.addBlock(NidavellirBlocks.NIDAVELLIR_ENHANCED_STONE_AQUAMARINE_ORE, "Nidavellir Enhanced Aquamarine Ore");
        this.addBlock(NidavellirBlocks.NIDAVELLIR_ENHANCED_STONE_OPAL_ORE, "Nidavellir Enhanced Opal Ore");
        this.addBlock(NidavellirBlocks.NIDAVELLIR_ENHANCED_STONE_RUBY_ORE, "Nidavellir Enhanced Ruby Ore");

        this.addBlock(NidavellirBlocks.NIDAVELLIR_ENHANCED_STONE_IRON_ORE_CLUSTER, "Nidavellir Enhanced Iron Ore Cluster");
        this.addBlock(NidavellirBlocks.NIDAVELLIR_ENHANCED_STONE_GOLD_ORE_CLUSTER, "Nidavellir Enhanced Gold Ore Cluster");
        this.addBlock(NidavellirBlocks.NIDAVELLIR_ENHANCED_STONE_COPPER_ORE_CLUSTER, "Nidavellir Enhanced Copper Ore Cluster");
        this.addBlock(NidavellirBlocks.NIDAVELLIR_ENHANCED_STONE_TIN_ORE_CLUSTER, "Nidavellir Enhanced Tin Ore Cluster");
        this.addBlock(NidavellirBlocks.NIDAVELLIR_ENHANCED_STONE_ZINC_ORE_CLUSTER, "Nidavellir Enhanced Zinc Ore Cluster");
        this.addBlock(NidavellirBlocks.NIDAVELLIR_ENHANCED_STONE_DIAMOND_ORE_CLUSTER, "Nidavellir Enhanced Diamond Ore Cluster");
        this.addBlock(NidavellirBlocks.NIDAVELLIR_ENHANCED_STONE_EMERALD_ORE_CLUSTER, "Nidavellir Enhanced Emerald Ore Cluster");
        this.addBlock(NidavellirBlocks.NIDAVELLIR_ENHANCED_STONE_COAL_ORE_CLUSTER, "Nidavellir Enhanced Coal Ore Cluster");
        this.addBlock(NidavellirBlocks.NIDAVELLIR_ENHANCED_STONE_REDSTONE_ORE_CLUSTER, "Nidavellir Enhanced Redstone Ore Cluster");
        this.addBlock(NidavellirBlocks.NIDAVELLIR_ENHANCED_STONE_LAPIS_ORE_CLUSTER, "Nidavellir Enhanced Lapis Ore Cluster");
        this.addBlock(NidavellirBlocks.NIDAVELLIR_ENHANCED_STONE_AQUAMARINE_ORE_CLUSTER, "Nidavellir Enhanced Aquamarine Ore Cluster");
        this.addBlock(NidavellirBlocks.NIDAVELLIR_ENHANCED_STONE_OPAL_ORE_CLUSTER, "Nidavellir Enhanced Opal Ore Cluster");
        this.addBlock(NidavellirBlocks.NIDAVELLIR_ENHANCED_STONE_RUBY_ORE_CLUSTER, "Nidavellir Enhanced Ruby Ore Cluster");

        this.addBlock(NidavellirBlocks.NIDAVELLIR_DEEPSLATE_STONE, "Nidavellir Deepslate Stone");
        this.addBlock(NidavellirBlocks.NIDAVELLIR_DEEPSLATE_STONE_STAIRS, "Nidavellir Deepslate Stone Stairs");
        this.addBlock(NidavellirBlocks.NIDAVELLIR_DEEPSLATE_STONE_SLAB, "Nidavellir Deepslate Stone Slab");
        this.addBlock(NidavellirBlocks.NIDAVELLIR_DEEPSLATE_STONE_PRESSURE_PLATE, "Nidavellir Deepslate Stone Pressure Plate");
        this.addBlock(NidavellirBlocks.NIDAVELLIR_DEEPSLATE_STONE_BUTTON, "Nidavellir Deepslate Stone Button");
        this.addBlock(NidavellirBlocks.NIDAVELLIR_DEEPSLATE_STONE_WALL, "Nidavellir Deepslate Stone Wall");
        this.addBlock(NidavellirBlocks.NIDAVELLIR_DEEPSLATE_SMOOTH_STONE, "Nidavellir Deepslate Stone Smoothed");
        this.addBlock(NidavellirBlocks.NIDAVELLIR_DEEPSLATE_COBBLESTONE, "Nidavellir Deepslate Cobbletone");
        this.addBlock(NidavellirBlocks.NIDAVELLIR_DEEPSLATE_COBBLESTONE_STAIRS, "Nidavellir Deepslate Cobbletone Stairs");
        this.addBlock(NidavellirBlocks.NIDAVELLIR_DEEPSLATE_COBBLESTONE_SLAB, "Nidavellir Deepslate Cobbletone Slab");
        this.addBlock(NidavellirBlocks.NIDAVELLIR_DEEPSLATE_COBBLESTONE_WALL, "Nidavellir Deepslate Cobbletone Wall");
        this.addBlock(NidavellirBlocks.NIDAVELLIR_DEEPSLATE_COBBLESTONE_MOSSY, "Mossy Nidavellir Deepslate Cobbletone");
        this.addBlock(NidavellirBlocks.NIDAVELLIR_DEEPSLATE_STONE_BRICKS, "Nidavellir Deepslate Stone Bricks");
        this.addBlock(NidavellirBlocks.NIDAVELLIR_DEEPSLATE_STONE_BRICKS_STAIRS, "Nidavellir Deepslate Stone Bricks Stairs");
        this.addBlock(NidavellirBlocks.NIDAVELLIR_DEEPSLATE_STONE_BRICKS_SLAB, "Nidavellir Deepslate Stone Bricks Slab");
        this.addBlock(NidavellirBlocks.NIDAVELLIR_DEEPSLATE_STONE_BRICKS_WALL, "Nidavellir Deepslate Stone Bricks Wall");
        this.addBlock(NidavellirBlocks.NIDAVELLIR_DEEPSLATE_STONE_BRICKS_MOSSY, "Mossy Nidavellir Deepslate Stone Bricks");
        this.addBlock(NidavellirBlocks.NIDAVELLIR_DEEPSLATE_STONE_BRICKS_CRACKED, "Cracked Nidavellir Deepslate Stone Bricks");
        this.addBlock(NidavellirBlocks.NIDAVELLIR_DEEPSLATE_STONE_BRICKS_CHISELED, "Chiseled Nidavellir Deepslate Stone Bricks");

        this.addBlock(NidavellirBlocks.NIDAVELLIR_DEEPSLATE_STONE_IRON_ORE, "Nidavellir Deepslate Iron Ore");
        this.addBlock(NidavellirBlocks.NIDAVELLIR_DEEPSLATE_STONE_GOLD_ORE, "Nidavellir Deepslate Gold Ore");
        this.addBlock(NidavellirBlocks.NIDAVELLIR_DEEPSLATE_STONE_COPPER_ORE, "Nidavellir Deepslate Copper Ore");
        this.addBlock(NidavellirBlocks.NIDAVELLIR_DEEPSLATE_STONE_TIN_ORE, "Nidavellir Deepslate Tin Ore");
        this.addBlock(NidavellirBlocks.NIDAVELLIR_DEEPSLATE_STONE_ZINC_ORE, "Nidavellir Deepslate Zinc Ore");
        this.addBlock(NidavellirBlocks.NIDAVELLIR_DEEPSLATE_STONE_DIAMOND_ORE, "Nidavellir Deepslate Diamond Ore");
        this.addBlock(NidavellirBlocks.NIDAVELLIR_DEEPSLATE_STONE_EMERALD_ORE, "Nidavellir Deepslate Emerald Ore");
        this.addBlock(NidavellirBlocks.NIDAVELLIR_DEEPSLATE_STONE_COAL_ORE, "Nidavellir Deepslate Coal Ore");
        this.addBlock(NidavellirBlocks.NIDAVELLIR_DEEPSLATE_STONE_REDSTONE_ORE, "Nidavellir Deepslate Redstone Ore");
        this.addBlock(NidavellirBlocks.NIDAVELLIR_DEEPSLATE_STONE_LAPIS_ORE, "Nidavellir Deepslate Lapis Ore");
        this.addBlock(NidavellirBlocks.NIDAVELLIR_DEEPSLATE_STONE_AQUAMARINE_ORE, "Nidavellir Deepslate Aquamarine Ore");
        this.addBlock(NidavellirBlocks.NIDAVELLIR_DEEPSLATE_STONE_OPAL_ORE, "Nidavellir Deepslate Opal Ore");
        this.addBlock(NidavellirBlocks.NIDAVELLIR_DEEPSLATE_STONE_RUBY_ORE, "Nidavellir Deepslate Ruby Ore");

        this.addBlock(NidavellirBlocks.NIDAVELLIR_DEEPSLATE_STONE_IRON_ORE_CLUSTER, "Nidavellir Deepslate Iron Ore Cluster");
        this.addBlock(NidavellirBlocks.NIDAVELLIR_DEEPSLATE_STONE_GOLD_ORE_CLUSTER, "Nidavellir Deepslate Gold Ore Cluster");
        this.addBlock(NidavellirBlocks.NIDAVELLIR_DEEPSLATE_STONE_COPPER_ORE_CLUSTER, "Nidavellir Deepslate Copper Ore Cluster");
        this.addBlock(NidavellirBlocks.NIDAVELLIR_DEEPSLATE_STONE_TIN_ORE_CLUSTER, "Nidavellir Deepslate Tin Ore Cluster");
        this.addBlock(NidavellirBlocks.NIDAVELLIR_DEEPSLATE_STONE_ZINC_ORE_CLUSTER, "Nidavellir Deepslate Zinc Ore Cluster");
        this.addBlock(NidavellirBlocks.NIDAVELLIR_DEEPSLATE_STONE_DIAMOND_ORE_CLUSTER, "Nidavellir Deepslate Diamond Ore Cluster");
        this.addBlock(NidavellirBlocks.NIDAVELLIR_DEEPSLATE_STONE_EMERALD_ORE_CLUSTER, "Nidavellir Deepslate Emerald Ore Cluster");
        this.addBlock(NidavellirBlocks.NIDAVELLIR_DEEPSLATE_STONE_COAL_ORE_CLUSTER, "Nidavellir Deepslate Coal Ore Cluster");
        this.addBlock(NidavellirBlocks.NIDAVELLIR_DEEPSLATE_STONE_REDSTONE_ORE_CLUSTER, "Nidavellir Deepslate Redstone Ore Cluster");
        this.addBlock(NidavellirBlocks.NIDAVELLIR_DEEPSLATE_STONE_LAPIS_ORE_CLUSTER, "Nidavellir Deepslate Lapis Ore Cluster");
        this.addBlock(NidavellirBlocks.NIDAVELLIR_DEEPSLATE_STONE_AQUAMARINE_ORE_CLUSTER, "Nidavellir Deepslate Aquamarine Ore Cluster");
        this.addBlock(NidavellirBlocks.NIDAVELLIR_DEEPSLATE_STONE_OPAL_ORE_CLUSTER, "Nidavellir Deepslate Opal Ore Cluster");
        this.addBlock(NidavellirBlocks.NIDAVELLIR_DEEPSLATE_STONE_RUBY_ORE_CLUSTER, "Nidavellir Deepslate Ruby Ore Cluster");

        this.addBlock(NidavellirBlocks.NIDAVELLIR_CRIMSON_STONE, "Nidavellir Crimson Stone");
        this.addBlock(NidavellirBlocks.NIDAVELLIR_CRIMSON_STONE_STAIRS, "Nidavellir Crimson Stone Stairs");
        this.addBlock(NidavellirBlocks.NIDAVELLIR_CRIMSON_STONE_SLAB, "Nidavellir Crimson Stone Slab");
        this.addBlock(NidavellirBlocks.NIDAVELLIR_CRIMSON_STONE_PRESSURE_PLATE, "Nidavellir Crimson Stone Pressure Plate");
        this.addBlock(NidavellirBlocks.NIDAVELLIR_CRIMSON_STONE_BUTTON, "Nidavellir Crimson Stone Button");
        this.addBlock(NidavellirBlocks.NIDAVELLIR_CRIMSON_STONE_WALL, "Nidavellir Crimson Stone Wall");
        this.addBlock(NidavellirBlocks.NIDAVELLIR_CRIMSON_SMOOTH_STONE, "Nidavellir Crimson Stone Smoothed");
        this.addBlock(NidavellirBlocks.NIDAVELLIR_CRIMSON_COBBLESTONE, "Nidavellir Crimson Cobbletone");
        this.addBlock(NidavellirBlocks.NIDAVELLIR_CRIMSON_COBBLESTONE_STAIRS, "Nidavellir Crimson Cobbletone Stairs");
        this.addBlock(NidavellirBlocks.NIDAVELLIR_CRIMSON_COBBLESTONE_SLAB, "Nidavellir Crimson Cobbletone Slab");
        this.addBlock(NidavellirBlocks.NIDAVELLIR_CRIMSON_COBBLESTONE_WALL, "Nidavellir Crimson Cobbletone Wall");
        this.addBlock(NidavellirBlocks.NIDAVELLIR_CRIMSON_COBBLESTONE_MOSSY, "Mossy Nidavellir Crimson Cobbletone");
        this.addBlock(NidavellirBlocks.NIDAVELLIR_CRIMSON_STONE_BRICKS, "Nidavellir Crimson Stone Bricks");
        this.addBlock(NidavellirBlocks.NIDAVELLIR_CRIMSON_STONE_BRICKS_STAIRS, "Nidavellir Crimson Stone Bricks Stairs");
        this.addBlock(NidavellirBlocks.NIDAVELLIR_CRIMSON_STONE_BRICKS_SLAB, "Nidavellir Crimson Stone Bricks Slab");
        this.addBlock(NidavellirBlocks.NIDAVELLIR_CRIMSON_STONE_BRICKS_WALL, "Nidavellir Crimson Stone Bricks Wall");
        this.addBlock(NidavellirBlocks.NIDAVELLIR_CRIMSON_STONE_BRICKS_MOSSY, "Mossy Nidavellir Crimson Stone Bricks");
        this.addBlock(NidavellirBlocks.NIDAVELLIR_CRIMSON_STONE_BRICKS_CRACKED, "Cracked Nidavellir Crimson Stone Bricks");
        this.addBlock(NidavellirBlocks.NIDAVELLIR_CRIMSON_STONE_BRICKS_CHISELED, "Chiseled Nidavellir Crimson Stone Bricks");

        this.addBlock(NidavellirBlocks.NIDAVELLIR_CRIMSON_STONE_IRON_ORE, "Nidavellir Crimson Iron Ore");
        this.addBlock(NidavellirBlocks.NIDAVELLIR_CRIMSON_STONE_GOLD_ORE, "Nidavellir Crimson Gold Ore");
        this.addBlock(NidavellirBlocks.NIDAVELLIR_CRIMSON_STONE_COPPER_ORE, "Nidavellir Crimson Copper Ore");
        this.addBlock(NidavellirBlocks.NIDAVELLIR_CRIMSON_STONE_TIN_ORE, "Nidavellir Crimson Tin Ore");
        this.addBlock(NidavellirBlocks.NIDAVELLIR_CRIMSON_STONE_ZINC_ORE, "Nidavellir Crimson Zinc Ore");
        this.addBlock(NidavellirBlocks.NIDAVELLIR_CRIMSON_STONE_DIAMOND_ORE, "Nidavellir Crimson Diamond Ore");
        this.addBlock(NidavellirBlocks.NIDAVELLIR_CRIMSON_STONE_EMERALD_ORE, "Nidavellir Crimson Emerald Ore");
        this.addBlock(NidavellirBlocks.NIDAVELLIR_CRIMSON_STONE_COAL_ORE, "Nidavellir Crimson Coal Ore");
        this.addBlock(NidavellirBlocks.NIDAVELLIR_CRIMSON_STONE_REDSTONE_ORE, "Nidavellir Crimson Redstone Ore");
        this.addBlock(NidavellirBlocks.NIDAVELLIR_CRIMSON_STONE_LAPIS_ORE, "Nidavellir Crimson Lapis Ore");
        this.addBlock(NidavellirBlocks.NIDAVELLIR_CRIMSON_STONE_AQUAMARINE_ORE, "Nidavellir Crimson Aquamarine Ore");
        this.addBlock(NidavellirBlocks.NIDAVELLIR_CRIMSON_STONE_OPAL_ORE, "Nidavellir Crimson Opal Ore");
        this.addBlock(NidavellirBlocks.NIDAVELLIR_CRIMSON_STONE_RUBY_ORE, "Nidavellir Crimson Ruby Ore");

        this.addBlock(NidavellirBlocks.NIDAVELLIR_CRIMSON_STONE_IRON_ORE_CLUSTER, "Nidavellir Crimson Iron Ore Cluster");
        this.addBlock(NidavellirBlocks.NIDAVELLIR_CRIMSON_STONE_GOLD_ORE_CLUSTER, "Nidavellir Crimson Gold Ore Cluster");
        this.addBlock(NidavellirBlocks.NIDAVELLIR_CRIMSON_STONE_COPPER_ORE_CLUSTER, "Nidavellir Crimson Copper Ore Cluster");
        this.addBlock(NidavellirBlocks.NIDAVELLIR_CRIMSON_STONE_TIN_ORE_CLUSTER, "Nidavellir Crimson Tin Ore Cluster");
        this.addBlock(NidavellirBlocks.NIDAVELLIR_CRIMSON_STONE_ZINC_ORE_CLUSTER, "Nidavellir Crimson Zinc Ore Cluster");
        this.addBlock(NidavellirBlocks.NIDAVELLIR_CRIMSON_STONE_DIAMOND_ORE_CLUSTER, "Nidavellir Crimson Diamond Ore Cluster");
        this.addBlock(NidavellirBlocks.NIDAVELLIR_CRIMSON_STONE_EMERALD_ORE_CLUSTER, "Nidavellir Crimson Emerald Ore Cluster");
        this.addBlock(NidavellirBlocks.NIDAVELLIR_CRIMSON_STONE_COAL_ORE_CLUSTER, "Nidavellir Crimson Coal Ore Cluster");
        this.addBlock(NidavellirBlocks.NIDAVELLIR_CRIMSON_STONE_REDSTONE_ORE_CLUSTER, "Nidavellir Crimson Redstone Ore Cluster");
        this.addBlock(NidavellirBlocks.NIDAVELLIR_CRIMSON_STONE_LAPIS_ORE_CLUSTER, "Nidavellir Crimson Lapis Ore Cluster");
        this.addBlock(NidavellirBlocks.NIDAVELLIR_CRIMSON_STONE_AQUAMARINE_ORE_CLUSTER, "Nidavellir Crimson Aquamarine Ore Cluster");
        this.addBlock(NidavellirBlocks.NIDAVELLIR_CRIMSON_STONE_OPAL_ORE_CLUSTER, "Nidavellir Crimson Opal Ore Cluster");
        this.addBlock(NidavellirBlocks.NIDAVELLIR_CRIMSON_STONE_RUBY_ORE_CLUSTER, "Nidavellir Crimson Ruby Ore Cluster");

        this.addBlock(UnderworldBlocks.TARTARUS_STONE, "Tartarus Stone");
        this.addBlock(UnderworldBlocks.TARTARUS_STONE_STAIRS, "Tartarus Stone Stairs");
        this.addBlock(UnderworldBlocks.TARTARUS_STONE_SLAB, "Tartarus Stone Slab");
        this.addBlock(UnderworldBlocks.TARTARUS_STONE_PRESSURE_PLATE, "Tartarus Stone Pressure Plate");
        this.addBlock(UnderworldBlocks.TARTARUS_STONE_BUTTON, "Tartarus Stone Button");
        this.addBlock(UnderworldBlocks.TARTARUS_STONE_WALL, "Tartarus Stone Wall");
        this.addBlock(UnderworldBlocks.TARTARUS_STONE_SMOOTH_STONE, "Tartarus Stone Smoothed");
        this.addBlock(UnderworldBlocks.TARTARUS_STONE_COBBLESTONE, "Tartarus Cobbletone");
        this.addBlock(UnderworldBlocks.TARTARUS_STONE_COBBLESTONE_STAIRS, "Tartarus Cobbletone Stairs");
        this.addBlock(UnderworldBlocks.TARTARUS_STONE_COBBLESTONE_SLAB, "Tartarus Cobbletone Slab");
        this.addBlock(UnderworldBlocks.TARTARUS_STONE_COBBLESTONE_WALL, "Tartarus Cobbletone Wall");
        this.addBlock(UnderworldBlocks.TARTARUS_STONE_COBBLESTONE_MOSSY, "Mossy Tartarus Cobbletone");
        this.addBlock(UnderworldBlocks.TARTARUS_STONE_BRICKS, "Tartarus Stone Bricks");
        this.addBlock(UnderworldBlocks.TARTARUS_STONE_BRICKS_STAIRS, "Tartarus Stone Bricks Stairs");
        this.addBlock(UnderworldBlocks.TARTARUS_STONE_BRICKS_SLAB, "Tartarus Stone Bricks Slab");
        this.addBlock(UnderworldBlocks.TARTARUS_STONE_BRICKS_WALL, "Tartarus Stone Bricks Wall");
        this.addBlock(UnderworldBlocks.TARTARUS_STONE_BRICKS_MOSSY, "Mossy Tartarus Stone Bricks");
        this.addBlock(UnderworldBlocks.TARTARUS_STONE_BRICKS_CRACKED, "Cracked Tartarus Stone Bricks");
        this.addBlock(UnderworldBlocks.TARTARUS_STONE_BRICKS_CHISELED, "Chiseled Tartarus Stone Bricks");

        this.addItem(ModItems.STYX_WATER_BUCKET, "Styx Water Bucket");

        this.addItem(AtlantisItems.CLOWNFISH_BUCKET, "Clownfish In Water Bucket");
        this.addItem(AtlantisItems.TANG_FISH_BUCKET, "Tang Fish In Water Bucket");

        this.addItem(AtlantisItems.CLOWNFISH, "Clownfish");
        this.addItem(AtlantisItems.COOKED_CLOWNFISH, "Cooked Clownfish");

        this.addItem(AtlantisItems.RAW_TUNA, "Raw Tuna");
        this.addItem(AtlantisItems.COOKED_TUNA, "Cooked Tuna");

        this.addItem(AtlantisItems.TANG_FISH, "Tang Fish");
        this.addItem(AtlantisItems.COOKED_TANG_FISH, "Cooked Tang Fish");

        addProfession(ModVillagers.ALLOY_MASTER, "Alloy Master");

        this.addBlock(UnderworldBlocks.IRIS_FLOWER, "Iris");
        this.addBlock(UnderworldBlocks.POTTED_IRIS_FLOWER, "Potted Iris");

        this.addBlock(AlfheimrBlocks.DARK_BLOOM_FLOWER, "Dark Bloom Flower");
        this.addBlock(AlfheimrBlocks.POTTED_DARK_BLOOM_FLOWER, "Potted Dark Bloom Flower");
        this.addBlock(AlfheimrBlocks.DREAD_NIGHT_FLOWER, "Dread Night Flower");
        this.addBlock(AlfheimrBlocks.POTTED_DREAD_NIGIHT_FLOWER, "Potted Dread Night Flower");
        this.addBlock(AlfheimrBlocks.BLACK_LOTUS_FLOWER, "Black Lotus Flower");
        this.addBlock(AlfheimrBlocks.POTTED_BLACK_LOTUS_FLOWER, "Potted Black Lotus Flower");
        this.addBlock(AlfheimrBlocks.NIGHT_ROSE_FLOWER, "Night Rose Flower");
        this.addBlock(AlfheimrBlocks.POTTED_NIGHT_ROSE_FLOWER, "Potted Night Rose Flower");
        this.addBlock(AlfheimrBlocks.AQUA_ROSE_FLOWER, "Aqua Rose Flower");
        this.addBlock(AlfheimrBlocks.POTTED_AQUA_ROSE_FLOWER, "Potted Aqua Rose Flower");
        this.addBlock(AlfheimrBlocks.MOON_FLOWER, "Moon Flower");
        this.addBlock(AlfheimrBlocks.POTTED_MOON_FLOWER, "Potted Moon Flower");
        this.addBlock(AlfheimrBlocks.CATHERINE_FLOWER, "Catherine Flower");
        this.addBlock(AlfheimrBlocks.POTTED_CATHERINE_FLOWER, "Potted Catherine Flower");
        this.addBlock(AlfheimrBlocks.TAINTED_ROSE_FLOWER, "Tainted Rose Flower");
        this.addBlock(AlfheimrBlocks.POTTED_TAINTED_ROSE_FLOWER, "Potted Tainted Rose Flower");
        this.addBlock(AlfheimrBlocks.CINNAMON_ROSE_FLOWER, "Cinnamon Rose Flower");
        this.addBlock(AlfheimrBlocks.POTTED_CINNAMON_ROSE_FLOWER, "Potted Cinnamon Rose Flower");
        this.addBlock(AlfheimrBlocks.BUTTERFLY_FLOWER, "Butterfly Flower");
        this.addBlock(AlfheimrBlocks.POTTED_BUTTERFLY_FLOWER, "Potted Butterfly Flower");
        this.addBlock(AlfheimrBlocks.GAIA_TULIP_FLOWER, "Gaia Tulip");
        this.addBlock(AlfheimrBlocks.POTTED_GAIA_TULIP_FLOWER, "Potted Gaia Tulip");
        this.addBlock(AlfheimrBlocks.BEARDED_IRIS_FLOWER, "Bearded Iris");
        this.addBlock(AlfheimrBlocks.POTTED_BEARDED_IRIS_FLOWER, "Potted Bearded Iris");
        this.addBlock(AlfheimrBlocks.CORNFLOWER_FLOWER, "Cornflower");
        this.addBlock(AlfheimrBlocks.POTTED_CORNFLOWER_FLOWER, "Potted Cornflower");
        this.addBlock(AlfheimrBlocks.MORNING_GLORY_FLOWER, "Morning Glory");
        this.addBlock(AlfheimrBlocks.POTTED_MORNING_GLORY_FLOWER, "Potted Morning Glory");
        this.addBlock(AlfheimrBlocks.GEORGIA_BLUE_FLOWER, "Georgia Blue");
        this.addBlock(AlfheimrBlocks.POTTED_GEORGIA_BLUE_FLOWER, "Potted Georgia Blue");
        this.addBlock(AlfheimrBlocks.BLUE_POPPY_FLOWER, "Blue Poppy");
        this.addBlock(AlfheimrBlocks.POTTED_BLUE_POPPY_FLOWER, "Potted Blue Poppy");
        this.addBlock(AlfheimrBlocks.TULIP_FLOWER, "Tulip");
        this.addBlock(AlfheimrBlocks.POTTED_TULIP_FLOWER, "Potted Tulip");
        this.addBlock(AlfheimrBlocks.CARNATION_FLOWER, "Carnation Flower");
        this.addBlock(AlfheimrBlocks.POTTED_CARNATION_FLOWER, "Potted Carnation Flower");
        this.addBlock(AlfheimrBlocks.LADYS_MANTLE_FLOWER, "Lady's Mantle");
        this.addBlock(AlfheimrBlocks.POTTED_LADYS_MANTLE_FLOWER, "Potted Lady's Mantle");
        this.addBlock(AlfheimrBlocks.GREEN_ROSE_FLOWER, "Green Rose");
        this.addBlock(AlfheimrBlocks.POTTED_GREEN_ROSE_FLOWER, "Potted Green Rose");
        this.addBlock(AlfheimrBlocks.CLEMATIS_FLOWER, "Clematis Flower");
        this.addBlock(AlfheimrBlocks.POTTED_CLEMATIS_FLOWER, "Potted Clematis Flower");
        this.addBlock(AlfheimrBlocks.BLUE_STAR_FLOWER, "Blue Star Flower");
        this.addBlock(AlfheimrBlocks.POTTED_BLUE_STAR_FLOWER, "Potted Blue Star Flower");
        this.addBlock(AlfheimrBlocks.SALVIA_FLOWER, "Salvia");
        this.addBlock(AlfheimrBlocks.POTTED_SALVIA_FLOWER, "Potted Salvia");
        this.addBlock(AlfheimrBlocks.FALSE_INDIGO_FLOWER, "False Indigo");
        this.addBlock(AlfheimrBlocks.POTTED_FALSE_INDIGO_FLOWER, "Potted False Indigo");
        this.addBlock(AlfheimrBlocks.WHITE_SAGE_FLOWER, "White Sage");
        this.addBlock(AlfheimrBlocks.POTTED_WHITE_SAGE_FLOWER, "Potted White Sage");
        this.addBlock(AlfheimrBlocks.SILVER_SCHEHERAZADE_FLOWER, "Silver Scheherazade");
        this.addBlock(AlfheimrBlocks.POTTED_SILVER_SCHEHERAZADE_FLOWER, "Potted Silver Scheherazade");
        this.addBlock(AlfheimrBlocks.SILVER_SPRING_FLOWER, "Silver Spring");
        this.addBlock(AlfheimrBlocks.POTTED_SILVER_SPRING_FLOWER, "Potted Silver Spring");
        this.addBlock(AlfheimrBlocks.SILVER_SHADOWS_FLOWER, "Silver Shadows");
        this.addBlock(AlfheimrBlocks.POTTED_SILVER_SHADOWS_FLOWER, "Potted Silver Shadows");
        this.addBlock(AlfheimrBlocks.GREEN_BALL_FLOWER, "Green Ball Flower");
        this.addBlock(AlfheimrBlocks.POTTED_GREEN_BALL_FLOWER, "Potted Green Ball Flower");
        this.addBlock(AlfheimrBlocks.LIME_DAHLIA_FLOWER, "Lime Dahlia");
        this.addBlock(AlfheimrBlocks.POTTED_LIME_DAHLIA_FLOWER, "Potted Lime Dahlia");
        this.addBlock(AlfheimrBlocks.HYDRANGEA_FLOWER, "Hydrangea");
        this.addBlock(AlfheimrBlocks.POTTED_HYDRANGEA_FLOWER, "Potted Hydrangea");
        this.addBlock(AlfheimrBlocks.ZINNIA_FLOWER, "Zinnia");
        this.addBlock(AlfheimrBlocks.POTTED_ZINNIA_FLOWER, "Potted Zinnia");
        this.addBlock(AlfheimrBlocks.BUTTERFLY_CANDY_FLOWER, "Butterfly Candy");
        this.addBlock(AlfheimrBlocks.POTTED_BUTTERFLY_CANDY_FLOWER, "Potted Butterfly Candy");
        this.addBlock(AlfheimrBlocks.CABARET_FLOWER, "Cabaret Flower");
        this.addBlock(AlfheimrBlocks.POTTED_CABARET_FLOWER, "Potted Cabaret Flower");
        this.addBlock(AlfheimrBlocks.DIANTHUS_FLOWER, "Dianthus");
        this.addBlock(AlfheimrBlocks.POTTED_DIANTHUS_FLOWER, "Potted Dianthus");
        this.addBlock(AlfheimrBlocks.TITAN_CRANBERRY_VINCA_FLOWER, "Titan Cranberry Vinca");
        this.addBlock(AlfheimrBlocks.POTTED_TITAN_CRANBERRY_VINCA_FLOWER, "Potted Titan Cranberry Vinca");
        this.addBlock(AlfheimrBlocks.ORANGE_ZINNIA_FLOWER, "Orange Zinnia");
        this.addBlock(AlfheimrBlocks.POTTED_ORANGE_ZINNIA_FLOWER, "Potted Orange Zinnia");
        this.addBlock(AlfheimrBlocks.BEGONIA_FLOWER, "Begonia");
        this.addBlock(AlfheimrBlocks.POTTED_BEGONIA_FLOWER, "Potted Begonia");
        this.addBlock(AlfheimrBlocks.CROWN_IMPERIAL_FLOWER, "Crown Imperial");
        this.addBlock(AlfheimrBlocks.POTTED_CROWN_IMPERIAL_FLOWER, "Potted Crown Imperial");
        this.addBlock(AlfheimrBlocks.ORIENTAL_POPPY_FLOWER, "Oriental Poppy");
        this.addBlock(AlfheimrBlocks.POTTED_ORIENTAL_POPPY_FLOWER, "Potted Oriental Poppy");
        this.addBlock(AlfheimrBlocks.AZALEA_FLOWER, "Azalea");
        this.addBlock(AlfheimrBlocks.POTTED_AZALEA_FLOWER, "Potted Azalea");
        this.addBlock(AlfheimrBlocks.PINK_DELIGHT_FLOWER, "Pink Delight");
        this.addBlock(AlfheimrBlocks.POTTED_PINK_DELIGHT_FLOWER, "Potted Pink Delight");
        this.addBlock(AlfheimrBlocks.CHRYSANTHEMUM_FLOWER, "Chrysanthemum");
        this.addBlock(AlfheimrBlocks.POTTED_CHRYSANTHEMUM_FLOWER, "Potted Chrysanthemum");
        this.addBlock(AlfheimrBlocks.HIBISCUS_FLOWER, "Hibiscus");
        this.addBlock(AlfheimrBlocks.POTTED_HIBISCUS_FLOWER, "Potted Hibiscus");
        this.addBlock(AlfheimrBlocks.CARDINAL_FLOWER, "Cardinal Flower");
        this.addBlock(AlfheimrBlocks.POTTED_CARDINAL_FLOWER, "Potted Cardinal Flower");
        this.addBlock(AlfheimrBlocks.GERBERA_FLOWER, "Gerbera");
        this.addBlock(AlfheimrBlocks.POTTED_GERBERA_FLOWER, "Potted Gerbera");
        this.addBlock(AlfheimrBlocks.RED_TULIP_FLOWER, "Red Tulip");
        this.addBlock(AlfheimrBlocks.POTTED_RED_TULIP_FLOWER, "Potted Red Tulip");
        this.addBlock(AlfheimrBlocks.FREESIA_FLOWER, "Freesia");
        this.addBlock(AlfheimrBlocks.POTTED_FREESIA_FLOWER, "Potted Freesia");
        this.addBlock(AlfheimrBlocks.GARDENIAS_FLOWER, "Gardenias");
        this.addBlock(AlfheimrBlocks.POTTED_GARDENIAS_FLOWER, "Potted Gardenias");
        this.addBlock(AlfheimrBlocks.STAR_JASMINE_FLOWER, "Star Jasmine");
        this.addBlock(AlfheimrBlocks.POTTED_STAR_JASMINE_FLOWER, "Potted Star Jasmine");
        this.addBlock(AlfheimrBlocks.WHITE_WARATAH_FLOWER, "White Waratah");
        this.addBlock(AlfheimrBlocks.POTTED_WHITE_WARATAH_FLOWER, "Potted White Waratah");
        this.addBlock(AlfheimrBlocks.FLANNEL_FLOWER, "Flannel");
        this.addBlock(AlfheimrBlocks.POTTED_FLANNEL_FLOWER, "Potted Flannel");
        this.addBlock(AlfheimrBlocks.BEARS_EARS_FLOWER, "Bears Ears");
        this.addBlock(AlfheimrBlocks.POTTED_BEARS_EARS_FLOWER, "Bears Ears");
        this.addBlock(AlfheimrBlocks.BIDENS_FLOWER, "Bidens Flower");
        this.addBlock(AlfheimrBlocks.POTTED_BIDENS_FLOWER, "Potted Bidens Flower");
        this.addBlock(AlfheimrBlocks.BLANKET_FLOWER, "Blanket Flower");
        this.addBlock(AlfheimrBlocks.POTTED_BLANKET_FLOWER, "Potted Blanket Flower");
        this.addBlock(AlfheimrBlocks.BULBINE_FLOWER, "Bulbine Flower");
        this.addBlock(AlfheimrBlocks.POTTED_BULBINE_FLOWER, "Potted Bulbine Flower");
        this.addBlock(AlfheimrBlocks.SILVER_BRUNIA_FLOWER, "Silver Brunia");
        this.addBlock(AlfheimrBlocks.POTTED_SILVER_BRUNIA_FLOWER, "Potted Silver Brunia");
        this.addBlock(AlfheimrBlocks.GRAY_ROSES_FLOWER, "Gray Rose");
        this.addBlock(AlfheimrBlocks.POTTED_GRAY_ROSES_FLOWER, "Potted Gray Rose");
        this.addBlock(AlfheimrBlocks.MOON_CARROT_FLOWER, "Moon Carrot");
        this.addBlock(AlfheimrBlocks.POTTED_MOON_CARROT_FLOWER, "Potted Moon Carrot");
        this.addBlock(AlfheimrBlocks.SILVER_BABY_FLOWER, "Silver Baby");
        this.addBlock(AlfheimrBlocks.POTTED_SILVER_BABY_FLOWER, "Potted Silver Baby");
        this.addBlock(AlfheimrBlocks.LAVENDER_FLOWER, "Lavender");
        this.addBlock(AlfheimrBlocks.POTTED_LAVENDER_FLOWER, "Potted Lavender");
        this.addBlock(AlfheimrBlocks.BELLFLOWER_FLOWER, "Bellflower");
        this.addBlock(AlfheimrBlocks.POTTED_BELLFLOWER_FLOWER, "Potted Bellflower");
        this.addBlock(AlfheimrBlocks.LILAC_FLOWER, "Lilac");
        this.addBlock(AlfheimrBlocks.POTTED_LILAC_FLOWER, "Potted Lilac");
        this.addBlock(AlfheimrBlocks.SWEET_PEA_FLOWER, "Sweet Pea");
        this.addBlock(AlfheimrBlocks.POTTED_SWEET_PEA_FLOWER, "Potted Sweet Pea");

        this.addBlock(AlfheimrBlocks.DRUID_RITUAL_STONE, "Druid Ritual Stone");

        this.addEnchantment(ModEnchantments.LIGHTNING_STRIKER, "Lightning Striker");

        this.addItem(ModItems.DICE, "Dice");
        this.addBlock(ModBlocks.DICE_BLOCK, "Dice");

        this.addItem(ModItems.BASIC_PORTAL_ACTIVATOR, "Basic Portal Activator");

        this.addItem(ModItems.BASIC_PORTAL_CORE, "Basic Portal Core");

        this.addBlock(UnderworldBlocks.UNDERWORLD_PORTAL_FRAME, "Underworld Portal Frame");
        this.addBlock(NidavellirBlocks.NIDAVELLIR_PORTAL_FRAME, "Nidavellir Portal Frame");
        this.addBlock(AlfheimrBlocks.ALFHEIMR_PORTAL_FRAME, "Alfheimr Portal Frame");
        this.addBlock(AtlantisBlocks.ATLANTIS_PORTAL_FRAME, "Atlantis Portal Frame");
        this.addBlock(SkyopiaBlocks.SKYOPIA_PORTAL_FRAME, "Skyopia Portal Frame");

        this.addBlock(UnderworldBlocks.UNDERWORLD_PORTAL, "Underworld Portal");
        this.addBlock(NidavellirBlocks.NIDAVELLIR_PORTAL, "Nidavellir Portal");
        this.addBlock(AlfheimrBlocks.ALFHEIMR_PORTAL, "Alfheimr Portal");
        this.addBlock(AtlantisBlocks.ATLANTIS_PORTAL, "Atlantis Portal");
        this.addBlock(SkyopiaBlocks.SKYOPIA_PORTAL, "Skyopia Portal");
    }

    private void paintings() {
        addPainting(ModPaintings.SAW_THEM, "Saw Them", "NanoAttack");
        addPainting(ModPaintings.SHRIMP, "Shrimp", "NanoAttack");
        addPainting(ModPaintings.WORLD, "World", "NanoAttack");
    }

    private void effects() {
        addEffect(ModEffects.DROWSY_EFFECT, "Drowsy");
    }

    private void potions() {
        addPotion(ModPotions.DROWSY_POTION, "Drowsy");
    }

    private void sounds() {
        addSound(ModSounds.MAGICAL_DOWSING_ROD_FOUND_ORE, "Magical Dowsing Rod Found Ore");
        addSound(ModSounds.CRIMSON_DIAMOND_LAMP_BREAK, "Crimson Diamond Lamp Break");
        addSound(ModSounds.CRIMSON_DIAMOND_LAMP_STEP, "Crimson Diamond Lamp Step");
        addSound(ModSounds.CRIMSON_DIAMOND_LAMP_FALL, "Crimson Diamond Lamp Fall");
        addSound(ModSounds.CRIMSON_DIAMOND_LAMP_PLACE, "Crimson Diamond Lamp Place");
        addSound(ModSounds.CRIMSON_DIAMOND_LAMP_HIT, "Crimson Diamond Lamp Hit");
    }

    private void custom() {
        this.add("item.lostworlds.magical_dowsing_rod.no_valuables", "No Valuables Found!");
        this.add("tooltip.lostworlds.magical_dowsing_rod.tooltip", "Hold #eSHIFT#r for more information...");
        this.add("tooltip.lostworlds.magical_dowsing_rod.tooltip.shift", "Right click on block to find valuables");
    }

    private void config() {
        this.add("config.lostworlds.common.enable_dimensions.enable_alfheimr_dimension", "Enables the teleportation into the Alfheimr Dimension.");
        this.add("config.lostworlds.common.enable_dimensions.enable_underworld_dimension", "Enables the teleportation into the Underworld Dimension.");
        this.add("config.lostworlds.common.enable_dimensions.enable_nidavellir_dimension", "Enables the teleportation into the Nidavellir Dimension.");
        this.add("config.lostworlds.common.enable_dimensions.enable_atlantis_dimension", "Enables the teleportation into the Atlantis Dimension.");
        this.add("config.lostworlds.common.enable_dimensions.enable_skyopia_dimension", "Enables the teleportation into the Skyopia Dimension.");
    }

    private void records() {
        addRecord(ModItems.BAR_BRAWL_RECORD, "Bar Brawl Record", "Bryan Tech - Bar Brawl (CC0)");
    }

    private void creativeTab() {
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
    }

    private void bookOnDragonsBook() {
        //Book On Dragons Book
        createBook("book_on_dragons", "Book On Dragons",
                "This book is written by Gavin Young." +
                "The worlds leading researcher in everything about dragons. Both in known knowladge and legends."
        );
        this.add("book_on_dragons_book.category.lesser_dragons.name", "Lesser Dragons");
        this.add("book_on_dragons_book.category.lesser_dragons.desc", "");

        this.add("book_on_dragons_book.category.greater_dragons.name", "Greater Dragons");
        this.add("book_on_dragons_book.category.greater_dragons.desc", "");


        this.add("book_on_dragons_book.category.emperor_dragons.name", "Emeror Dragons");
        this.add("book_on_dragons_book.category.emperor_dragons.desc", "");
        this.add("lostworlds.entry.book_on_dragons_book.greater_dragons.ender_dragon.name", "Ender Dragon");
        this.add("lostworlds.page.book_on_dragons_book.greater_dragons.ender_dragon.0.title", "The Ender Dragon");
        this.add("lostworlds.page.book_on_dragons_book.greater_dragons.ender_dragon.0.text",
                "The Ender Dragon is a dragon that is only found in the end dimension."
        );

        this.add("book_on_dragons_book.category.celestial_dragons.name", "Celestrial Dragons");
        this.add("book_on_dragons_book.category.celestial_dragons.desc", "");
    }

    private void underworldBook() {
        //Underworld Book
        createBook("underworld", "Hades guide to the Underworld",
                "This book is written by the lord of the underworld hades." +
                        "$(br2)The reason for this book is to pass on information and knowladge on how to live in the underworld."
        );
//        this.add("item.underworld.book.name", "Hades guide to the Underworld");
//        this.add("info.underworld.book.landing", "This book is written by the lord of the underworld hades." +
//                "$(br2)The reason for this book is to pass on information and knowladge on how to live in the underworld.");

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

    private void skyopiaBook() {
        //Skyopia Book
        createBook("skyopia", "Lost journal on Skyopia",
                "A journal written by the most infamous and notorious pirate in all of Skyopia." +
                        "$(br2)A survivors guide to the many lands and wild life of Skyopia"
        );
//        this.add("item.skyopia.book.name", "Lost journal on Skyopia");
//        this.add("info.skyopia.book.landing", "A journal written by the most infamous and notorious pirate in all of Skyopia." +
//                "$(br2)A survivors guide to the many lands and wild life of Skyopia");

        this.add("skyopia.category.basics", "Basics");
        this.add("lostworlds.entry.skyopia.intro", "Intro");
        this.add("lostworlds.page.skyopia.intro.0.title", "Getting to Skyopia");
        this.add("lostworlds.page.skyopia.intro.0.text", "");
        this.add("lostworlds.page.skyopia.intro.2.title", "Craft the portal activator");
        this.add("lostworlds.page.skyopia.intro.3.title", "Making the portal frame");
        this.add("lostworlds.page.skyopia.intro.4.name", "Building the portal");
        this.add("lostworlds.page.skyopia.intro.4.text", "");

//        this.add("", "");
    }

    private void nidavellirBook() {
        //Nidavellir Book
        createBook("nidavellir", "Miners guide to Nidavellir",
                "Popular edition for all dwarves." +
                        "$(br2)A basic guide to Nidavellir that all the dwarves carry before entering the mines."
        );
//        this.add("item.nidavellir.book.name", "Miners guide to Nidavellir");
//        this.add("info.nidavellir.book.landing", "Popular edition for all dwarves." +
//                "$(br2)A basic guide to Nidavellir that all the dwarves carry before entering the mines.");

        this.add("nidavellir.category.basics", "Basics");
        this.add("lostworlds.entry.nidavellir.intro", "Intro");
        this.add("lostworlds.page.nidavellir.intro.0.title", "Getting to Nidavellir");
        this.add("lostworlds.page.nidavellir.intro.0.text", "");
        this.add("lostworlds.page.nidavellir.intro.2.title", "Craft the portal activator");
        this.add("lostworlds.page.nidavellir.intro.3.title", "Making the portal frame");
        this.add("lostworlds.page.nidavellir.intro.4.name", "Building the portal");
        this.add("lostworlds.page.nidavellir.intro.4.text", "");

//        this.add("", "");
    }

    private void atlantisBook() {
        //Atlantis Book
        createBook("atlantis", "The lost book of Atlantis",
                "The only recorded book on Atlantis but was lost before it could make it to print." +
                        "$(br2)This book covers all the mystories of the world atlantis."
        );
//        this.add("item.atlantis.book.name", "The lost book of Atlantis");
//        this.add("info.atlantis.book.landing", "The only recorded book on Atlantis but was lost before it could make it to print." +
//                "$(br2)This book covers all the mystories of the world atlantis.");

        this.add("atlantis.category.basics", "Basics");
        this.add("lostworlds.entry.atlantis.intro", "Intro");
        this.add("lostworlds.page.atlantis.intro.0.title", "Getting to Atlantis");
        this.add("lostworlds.page.atlantis.intro.0.text", "");
        this.add("lostworlds.page.atlantis.intro.2.title", "Craft the portal activator");
        this.add("lostworlds.page.atlantis.intro.3.title", "Making the portal frame");
        this.add("lostworlds.page.atlantis.intro.4.name", "Building the portal");
        this.add("lostworlds.page.atlantis.intro.4.text", "");

//        this.add("", "");
    }

    private void alfheimrBook() {
        //Alfheimr Book
        createBook("alfheimr", "Alfheimr in a book Vol.1",
                "The first and only known printed copy." +
                "$(br2)The book covers all things needed to know about Alfheimr."
        );
//        this.add("item.alfheimr.book.name", "Alfheimr in a book Vol.1");
//        this.add("info.alfheimr.book.landing", "The first and only known printed copy." +
//                "$(br2)The book covers all things needed to know about Alfheimr.");

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
    }

    private void lostWorldsBook() {
        //Lost Worlds Book
        createBook("lostworlds", "Lost Worlds Book", "A journal written by a mad man talking about the possibilities of different worlds." +
                "$(br2)Discovering the mysteries of the many different worlds lost to history."
        );
//        this.add("item.lostworlds.book.name", "Lost Worlds Book");
//        this.add("info.lostworlds.book.landing", "A journal written by a mad man talking about the possibilities of different worlds." +
//                "$(br2)Discovering the mysteries of the many different worlds lost to history.");

        this.add("lostworlds.category.basics", "Basics");
        this.add("lostworlds.entry.basics.intro", "Intro");
        this.add("lostworlds.page.basics.intro.0.title", "Getting to Alfheimr");
        this.add("lostworlds.page.basics.intro.0.text", "");
        this.add("lostworlds.page.basics.intro.1.title", "Craft the portal activator");

//        this.add("", "");
    }

    private void skyopiaAdvancements() {
        //Skyopia
        this.add("advancement.lostworlds.skyopia.root.name", "Skyopia");
        this.add("advancement.lostworlds.skyopia.root.desc", "Learn the powers of different wolds");
    }

    private void atlantisAdvancements() {
        //Atlantis
        this.add("advancement.lostworlds.atlantis.root.name", "Atlantis");
        this.add("advancement.lostworlds.atlantis.root.desc", "Learn the powers of different wolds");
    }

    private void alfheimrAdvancements() {
        //Alfheimr
        this.add("advancement.lostworlds.alfheimr.root.name", "Alfheimr");
        this.add("advancement.lostworlds.alfheimr.root.desc", "Learn the powers of different wolds");
    }

    private void nidavellirAdvancements() {
        //Nidavellir
        this.add("advancement.lostworlds.nidavellir.root.name", "Nidavellir");
        this.add("advancement.lostworlds.nidavellir.root.desc", "Learn the powers of different wolds");
    }

    private void underworldAdvancements() {
        //Underworld
        this.add("advancement.lostworlds.underworld.root.name", "Underworld");
        this.add("advancement.lostworlds.underworld.root.desc", "Learn the powers of different wolds");
    }

    private void baseAdvancements() {
        //Base
        this.add("advancement.lostworlds.base.root.name", "Base Lost Worlds");
        this.add("advancement.lostworlds.base.root.desc", "Learn the powers of different wolds");
        this.add("advancement.lostworlds.base.dowsing_rod.name", "Magical Dowsing Rod");
        this.add("advancement.lostworlds.base.dowsing_rod.desc", "Find magical objects");
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

    public void createBook(String id, String name, String landing) {
        this.add("item."+id+".book.name", name);
        this.add("info."+id+".book.landing", landing);
    }
}
