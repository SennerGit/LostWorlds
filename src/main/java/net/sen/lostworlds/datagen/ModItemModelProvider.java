package net.sen.lostworlds.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.armortrim.TrimMaterial;
import net.minecraft.world.item.armortrim.TrimMaterials;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.*;
import net.minecraftforge.client.model.generators.loaders.ItemLayerModelBuilder;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.sen.lostworlds.LostWorldsApi;
import net.sen.lostworlds.block.*;
import net.sen.lostworlds.item.*;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, LostWorldsApi.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        buttonItem(NidavellirBlocks.NIDAVELLIR_SOFT_STONE_BUTTON, NidavellirBlocks.NIDAVELLIR_SOFT_STONE);
        wallItem(NidavellirBlocks.NIDAVELLIR_SOFT_STONE_WALL, NidavellirBlocks.NIDAVELLIR_SOFT_STONE);
        wallItem(NidavellirBlocks.NIDAVELLIR_SOFT_COBBLESTONE_WALL, NidavellirBlocks.NIDAVELLIR_SOFT_COBBLESTONE);
        wallItem(NidavellirBlocks.NIDAVELLIR_SOFT_STONE_BRICKS_WALL, NidavellirBlocks.NIDAVELLIR_SOFT_STONE_BRICKS);

        buttonItem(NidavellirBlocks.NIDAVELLIR_HARD_STONE_BUTTON, NidavellirBlocks.NIDAVELLIR_HARD_STONE);
        wallItem(NidavellirBlocks.NIDAVELLIR_HARD_STONE_WALL, NidavellirBlocks.NIDAVELLIR_HARD_STONE);
        wallItem(NidavellirBlocks.NIDAVELLIR_HARD_COBBLESTONE_WALL, NidavellirBlocks.NIDAVELLIR_HARD_COBBLESTONE);
        wallItem(NidavellirBlocks.NIDAVELLIR_HARD_STONE_BRICKS_WALL, NidavellirBlocks.NIDAVELLIR_HARD_STONE_BRICKS);

        buttonItem(NidavellirBlocks.NIDAVELLIR_ENHANCED_STONE_BUTTON, NidavellirBlocks.NIDAVELLIR_ENHANCED_STONE);
        wallItem(NidavellirBlocks.NIDAVELLIR_ENHANCED_STONE_WALL, NidavellirBlocks.NIDAVELLIR_ENHANCED_STONE);
        wallItem(NidavellirBlocks.NIDAVELLIR_ENHANCED_COBBLESTONE_WALL, NidavellirBlocks.NIDAVELLIR_ENHANCED_COBBLESTONE);
        wallItem(NidavellirBlocks.NIDAVELLIR_ENHANCED_STONE_BRICKS_WALL, NidavellirBlocks.NIDAVELLIR_ENHANCED_STONE_BRICKS);

        buttonItem(NidavellirBlocks.NIDAVELLIR_DEEPSLATE_STONE_BUTTON, NidavellirBlocks.NIDAVELLIR_DEEPSLATE_STONE);
        wallItem(NidavellirBlocks.NIDAVELLIR_DEEPSLATE_STONE_WALL, NidavellirBlocks.NIDAVELLIR_DEEPSLATE_STONE);
        wallItem(NidavellirBlocks.NIDAVELLIR_DEEPSLATE_COBBLESTONE_WALL, NidavellirBlocks.NIDAVELLIR_DEEPSLATE_COBBLESTONE);
        wallItem(NidavellirBlocks.NIDAVELLIR_DEEPSLATE_STONE_BRICKS_WALL, NidavellirBlocks.NIDAVELLIR_DEEPSLATE_STONE_BRICKS);

        buttonItem(NidavellirBlocks.NIDAVELLIR_CRIMSON_STONE_BUTTON, NidavellirBlocks.NIDAVELLIR_CRIMSON_STONE);
        wallItem(NidavellirBlocks.NIDAVELLIR_CRIMSON_STONE_WALL, NidavellirBlocks.NIDAVELLIR_CRIMSON_STONE);
        wallItem(NidavellirBlocks.NIDAVELLIR_CRIMSON_COBBLESTONE_WALL, NidavellirBlocks.NIDAVELLIR_CRIMSON_COBBLESTONE);
        wallItem(NidavellirBlocks.NIDAVELLIR_CRIMSON_STONE_BRICKS_WALL, NidavellirBlocks.NIDAVELLIR_CRIMSON_STONE_BRICKS);

        buttonItem(UnderworldBlocks.TARTARUS_STONE_BUTTON, UnderworldBlocks.TARTARUS_STONE);
        wallItem(UnderworldBlocks.TARTARUS_STONE_WALL, UnderworldBlocks.TARTARUS_STONE);
        wallItem(UnderworldBlocks.TARTARUS_STONE_COBBLESTONE_WALL, UnderworldBlocks.TARTARUS_STONE_COBBLESTONE);
        wallItem(UnderworldBlocks.TARTARUS_STONE_BRICKS_WALL, UnderworldBlocks.TARTARUS_STONE_BRICKS);

        simpleItem(UnderworldItems.POMEGRANATE);
        simpleItem(UnderworldItems.POMEGRANATE_SEEDS);
        simpleItem(UnderworldItems.OLIVE);
        simpleItem(AlfheimrItems.DURUM_WHEAT);
        simpleItem(AlfheimrItems.DURUM_WHEAT_SEEDS);
        simpleItem(AlfheimrItems.TOMATO);
        simpleItem(AlfheimrItems.TOMATO_SEEDS);
        simpleItem(AlfheimrItems.WILD_ONION);
        simpleItem(AlfheimrItems.ONION_STAGE_1);
        simpleItem(AlfheimrItems.ONION_STAGE_2);
        simpleItem(AlfheimrItems.ONION_STAGE_3);
        simpleItem(AlfheimrItems.ONION);
        simpleItem(AlfheimrItems.DRAGON_FRUIT);
        simpleItem(AlfheimrItems.DRAGON_FRUIT_SEEDS);
        simpleItem(AlfheimrItems.CHILLI);
        simpleItem(AlfheimrItems.CHILLI_SEEDS);

        simpleItem(ModItems.AQUAMARINE);
        simpleItem(ModItems.OPAL);
        simpleItem(ModItems.RUBY);

        simpleItem(ModItems.CRIMSON_DIAMOND);
        simpleItem(ModItems.CRIMSON_TEAR);
        simpleItem(ModItems.MAGICAL_DOWSING_ROD);
        simpleItem(ModItems.BAR_BRAWL_RECORD);

        //Orichalcum
        simpleItem(UnderworldItems.ORICHALCUM_INGOT);
        simpleItem(UnderworldItems.RAW_ORICHALCUM);
        simpleItem(UnderworldItems.ORICHALCUM_NUGGET);

        handheldItem(UnderworldItems.ORICHALCUM_SWORD);
        handheldItem(UnderworldItems.ORICHALCUM_PICKAXE);
        handheldItem(UnderworldItems.ORICHALCUM_SHOVEL);
        handheldItem(UnderworldItems.ORICHALCUM_AXE);
        handheldItem(UnderworldItems.ORICHALCUM_HOE);

        simpleItem(UnderworldItems.ORICHALCUM_HORSE_ARMOR);

        //Zinc
        simpleItem(ModItems.ZINC_INGOT);
        simpleItem(ModItems.RAW_ZINC);
        simpleItem(ModItems.ZINC_NUGGET);

        handheldItem(ModItems.ZINC_SWORD);
        handheldItem(ModItems.ZINC_PICKAXE);
        handheldItem(ModItems.ZINC_SHOVEL);
        handheldItem(ModItems.ZINC_AXE);
        handheldItem(ModItems.ZINC_HOE);

        simpleItem(ModItems.ZINC_HORSE_ARMOR);

        //Tin
        simpleItem(ModItems.TIN_INGOT);
        simpleItem(ModItems.RAW_TIN);
        simpleItem(ModItems.TIN_NUGGET);

        handheldItem(ModItems.TIN_SWORD);
        handheldItem(ModItems.TIN_PICKAXE);
        handheldItem(ModItems.TIN_SHOVEL);
        handheldItem(ModItems.TIN_AXE);
        handheldItem(ModItems.TIN_HOE);

        simpleItem(ModItems.TIN_HORSE_ARMOR);

        //Aurichalcite
        simpleItem(ModItems.AURICHALCITE);

        //Brass
        simpleItem(ModItems.BRASS_INGOT);
        simpleItem(ModItems.BRASS_NUGGET);

        handheldItem(ModItems.BRASS_SWORD);
        handheldItem(ModItems.BRASS_PICKAXE);
        handheldItem(ModItems.BRASS_SHOVEL);
        handheldItem(ModItems.BRASS_AXE);
        handheldItem(ModItems.BRASS_HOE);

        simpleItem(ModItems.BRASS_HORSE_ARMOR);

        //Bronze
        simpleItem(ModItems.BRONZE_INGOT);
        simpleItem(ModItems.BRONZE_NUGGET);

        handheldItem(ModItems.BRONZE_SWORD);
        handheldItem(ModItems.BRONZE_PICKAXE);
        handheldItem(ModItems.BRONZE_SHOVEL);
        handheldItem(ModItems.BRONZE_AXE);
        handheldItem(ModItems.BRONZE_HOE);

        simpleItem(ModItems.BRONZE_HORSE_ARMOR);

        //Adamant
        simpleItem(UnderworldItems.ADAMANT);

        //Vegetation
        this.simpleBlockTexture(AlfheimrBlocks.ALFHEIMR_MAGIC_GRASS);

        this.simpleBlockTexture(UnderworldBlocks.IRIS_FLOWER);
        this.simpleBlockTexture(AlfheimrBlocks.DARK_BLOOM_FLOWER);
        this.simpleBlockTexture(AlfheimrBlocks.DREAD_NIGHT_FLOWER);
        this.simpleBlockTexture(AlfheimrBlocks.BLACK_LOTUS_FLOWER);
        this.simpleBlockTexture(AlfheimrBlocks.NIGHT_ROSE_FLOWER);
        this.simpleBlockTexture(AlfheimrBlocks.AQUA_ROSE_FLOWER);
        this.simpleBlockTexture(AlfheimrBlocks.MOON_FLOWER);
        this.simpleBlockTexture(AlfheimrBlocks.CATHERINE_FLOWER);
        this.simpleBlockTexture(AlfheimrBlocks.TAINTED_ROSE_FLOWER);
        this.simpleBlockTexture(AlfheimrBlocks.CINNAMON_ROSE_FLOWER);
        this.simpleBlockTexture(AlfheimrBlocks.BUTTERFLY_FLOWER);
        this.simpleBlockTexture(AlfheimrBlocks.GAIA_TULIP_FLOWER);
        this.simpleBlockTexture(AlfheimrBlocks.BEARDED_IRIS_FLOWER);
        this.simpleBlockTexture(AlfheimrBlocks.CORNFLOWER_FLOWER);
        this.simpleBlockTexture(AlfheimrBlocks.MORNING_GLORY_FLOWER);
        this.simpleBlockTexture(AlfheimrBlocks.GEORGIA_BLUE_FLOWER);
        this.simpleBlockTexture(AlfheimrBlocks.BLUE_POPPY_FLOWER);
        this.simpleBlockTexture(AlfheimrBlocks.TULIP_FLOWER);
        this.simpleBlockTexture(AlfheimrBlocks.CARNATION_FLOWER);
        this.simpleBlockTexture(AlfheimrBlocks.LADYS_MANTLE_FLOWER);
        this.simpleBlockTexture(AlfheimrBlocks.GREEN_ROSE_FLOWER);
        this.simpleBlockTexture(AlfheimrBlocks.CLEMATIS_FLOWER);
        this.simpleBlockTexture(AlfheimrBlocks.BLUE_STAR_FLOWER);
        this.simpleBlockTexture(AlfheimrBlocks.SALVIA_FLOWER);
        this.simpleBlockTexture(AlfheimrBlocks.FALSE_INDIGO_FLOWER);
        this.simpleBlockTexture(AlfheimrBlocks.WHITE_SAGE_FLOWER);
        this.simpleBlockTexture(AlfheimrBlocks.SILVER_SCHEHERAZADE_FLOWER);
        this.simpleBlockTexture(AlfheimrBlocks.SILVER_SPRING_FLOWER);
        this.simpleBlockTexture(AlfheimrBlocks.SILVER_SHADOWS_FLOWER);
        this.simpleBlockTexture(AlfheimrBlocks.GREEN_BALL_FLOWER);
        this.simpleBlockTexture(AlfheimrBlocks.LIME_DAHLIA_FLOWER);
        this.simpleBlockTexture(AlfheimrBlocks.HYDRANGEA_FLOWER);
        this.simpleBlockTexture(AlfheimrBlocks.ZINNIA_FLOWER);
        this.simpleBlockTexture(AlfheimrBlocks.BUTTERFLY_CANDY_FLOWER);
        this.simpleBlockTexture(AlfheimrBlocks.CABARET_FLOWER);
        this.simpleBlockTexture(AlfheimrBlocks.DIANTHUS_FLOWER);
        this.simpleBlockTexture(AlfheimrBlocks.TITAN_CRANBERRY_VINCA_FLOWER);
        this.simpleBlockTexture(AlfheimrBlocks.ORANGE_ZINNIA_FLOWER);
        this.simpleBlockTexture(AlfheimrBlocks.BEGONIA_FLOWER);
        this.simpleBlockTexture(AlfheimrBlocks.CROWN_IMPERIAL_FLOWER);
        this.simpleBlockTexture(AlfheimrBlocks.ORIENTAL_POPPY_FLOWER);
        this.simpleBlockTexture(AlfheimrBlocks.AZALEA_FLOWER);
        this.simpleBlockTexture(AlfheimrBlocks.PINK_DELIGHT_FLOWER);
        this.simpleBlockTexture(AlfheimrBlocks.CHRYSANTHEMUM_FLOWER);
        this.simpleBlockTexture(AlfheimrBlocks.HIBISCUS_FLOWER);
        this.simpleBlockTexture(AlfheimrBlocks.CARDINAL_FLOWER);
        this.simpleBlockTexture(AlfheimrBlocks.GERBERA_FLOWER);
        this.simpleBlockTexture(AlfheimrBlocks.RED_TULIP_FLOWER);
        this.simpleBlockTexture(AlfheimrBlocks.FREESIA_FLOWER);
        this.simpleBlockTexture(AlfheimrBlocks.GARDENIAS_FLOWER);
        this.simpleBlockTexture(AlfheimrBlocks.STAR_JASMINE_FLOWER);
        this.simpleBlockTexture(AlfheimrBlocks.WHITE_WARATAH_FLOWER);
        this.simpleBlockTexture(AlfheimrBlocks.FLANNEL_FLOWER);
        this.simpleBlockTexture(AlfheimrBlocks.BEARS_EARS_FLOWER);
        this.simpleBlockTexture(AlfheimrBlocks.BIDENS_FLOWER);
        this.simpleBlockTexture(AlfheimrBlocks.BLANKET_FLOWER);
        this.simpleBlockTexture(AlfheimrBlocks.BULBINE_FLOWER);
        this.simpleBlockTexture(AlfheimrBlocks.SILVER_BRUNIA_FLOWER);
        this.simpleBlockTexture(AlfheimrBlocks.GRAY_ROSES_FLOWER);
        this.simpleBlockTexture(AlfheimrBlocks.MOON_CARROT_FLOWER);
        this.simpleBlockTexture(AlfheimrBlocks.SILVER_BABY_FLOWER);
        this.simpleBlockTexture(AlfheimrBlocks.LAVENDER_FLOWER);
        this.simpleBlockTexture(AlfheimrBlocks.BELLFLOWER_FLOWER);
        this.simpleBlockTexture(AlfheimrBlocks.LILAC_FLOWER);
        this.simpleBlockTexture(AlfheimrBlocks.SWEET_PEA_FLOWER);

        //Mushrooms
        this.mushroomItem(AlfheimrBlocks.POINT_MUSHROOM_BLOCK);
        this.mushroomItem(AlfheimrBlocks.WITCHES_MUSHROOM_BLOCK);
        this.mushroomItem(AlfheimrBlocks.ROYAL_BLUE_MUSHROOM_BLOCK);
        this.mushroomItem(AlfheimrBlocks.SHORT_TOP_MUSHROOM_BLOCK);
        this.mushroomItem(AlfheimrBlocks.SPECTRAL_MUSHROOM_BLOCK);
        this.mushroomItem(AlfheimrBlocks.SHADE_MUSHROOM_BLOCK);
        this.mushroomItem(AlfheimrBlocks.SHADE_MUSHROOM_VINE_BLOCK);
        this.mushroomItem(AlfheimrBlocks.CAP_MUSHROOM_BLOCK);
        this.mushroomItem(AlfheimrBlocks.CAP_MUSHROOM_VINE_BLOCK);

        //simpleItem(ModItems.DATA_TABLET);

        //simpleItem(ModItems.NETHER_STEEL_HELMET);
        //simpleItem(ModItems.NETHER_STEEL_CHESTPLATE);
        //simpleItem(ModItems.NETHER_STEEL_LEGGINGS);
        //simpleItem(ModItems.NETHER_STEEL_BOOTS);

        complexBlock(ModBlocks.ALLOY_SMELTER.get());
//        simpleBlockItem(ModBlocks.UNDERWORLD_GRASS_BLOCK);

        simpleItem(ModItems.STYX_WATER_BUCKET);

        simpleItem(AtlantisItems.CLOWNFISH_BUCKET);
        simpleItem(AtlantisItems.TANG_FISH_BUCKET);

        /*
         * TREES
         */
        //Elder Wood
        saplingItem(UnderworldBlocks.ELDER_WOOD_SAPLING);

        fenceItem(UnderworldBlocks.ELDER_WOOD_PLANKS_FENCE, UnderworldBlocks.ELDER_WOOD_PLANKS);
        buttonItem(UnderworldBlocks.ELDER_WOOD_PLANKS_BUTTON, UnderworldBlocks.ELDER_WOOD_PLANKS);
        this.simpleBlockItemUi(UnderworldBlocks.ELDER_WOOD_PLANKS_DOOR);
        simpleItem(UnderworldItems.ELDER_WOOD_SIGN);
        simpleItem(UnderworldItems.ELDER_WOOD_HANGING_SIGN);

        //Olive
        saplingItem(UnderworldBlocks.OLIVE_SAPLING);

        fenceItem(UnderworldBlocks.OLIVE_PLANKS_FENCE, UnderworldBlocks.OLIVE_PLANKS);
        buttonItem(UnderworldBlocks.OLIVE_PLANKS_BUTTON, UnderworldBlocks.OLIVE_PLANKS);
        this.simpleBlockItemUi(UnderworldBlocks.OLIVE_PLANKS_DOOR);
        simpleItem(UnderworldItems.OLIVE_SIGN);
        simpleItem(UnderworldItems.OLIVE_HANGING_SIGN);

        //Myrrh
        saplingItem(UnderworldBlocks.MYRRH_SAPLING);

        fenceItem(UnderworldBlocks.MYRRH_PLANKS_FENCE, UnderworldBlocks.MYRRH_PLANKS);
        buttonItem(UnderworldBlocks.MYRRH_PLANKS_BUTTON, UnderworldBlocks.MYRRH_PLANKS);
        this.simpleBlockItemUi(UnderworldBlocks.MYRRH_PLANKS_DOOR);
        simpleItem(UnderworldItems.MYRRH_SIGN);
        simpleItem(UnderworldItems.MYRRH_HANGING_SIGN);

        //Laurel
        saplingItem(UnderworldBlocks.LAUREL_SAPLING);

        fenceItem(UnderworldBlocks.LAUREL_PLANKS_FENCE, UnderworldBlocks.LAUREL_PLANKS);
        buttonItem(UnderworldBlocks.LAUREL_PLANKS_BUTTON, UnderworldBlocks.LAUREL_PLANKS);
        this.simpleBlockItemUi(UnderworldBlocks.LAUREL_PLANKS_DOOR);
        simpleItem(UnderworldItems.LAUREL_SIGN);
        simpleItem(UnderworldItems.LAUREL_HANGING_SIGN);

        //Cypress
        saplingItem(UnderworldBlocks.CYPRESS_SAPLING);

        fenceItem(UnderworldBlocks.CYPRESS_PLANKS_FENCE, UnderworldBlocks.CYPRESS_PLANKS);
        buttonItem(UnderworldBlocks.CYPRESS_PLANKS_BUTTON, UnderworldBlocks.CYPRESS_PLANKS);
        this.simpleBlockItemUi(UnderworldBlocks.CYPRESS_PLANKS_DOOR);
        simpleItem(UnderworldItems.CYPRESS_SIGN);
        simpleItem(UnderworldItems.CYPRESS_HANGING_SIGN);

//        simpleBookItem(ModItems.LOST_WORLDS_BOOK);

        createArmourSet(UnderworldItems.ORICHALCUM_HELMET, UnderworldItems.ORICHALCUM_CHESTPLATE, UnderworldItems.ORICHALCUM_LEGGINGS, UnderworldItems.ORICHALCUM_BOOTS);
        createArmourSet(ModItems.ZINC_HELMET, ModItems.ZINC_CHESTPLATE, ModItems.ZINC_LEGGINGS, ModItems.ZINC_BOOTS);
        createArmourSet(ModItems.TIN_HELMET, ModItems.TIN_CHESTPLATE, ModItems.TIN_LEGGINGS, ModItems.TIN_BOOTS);
        createArmourSet(ModItems.BRASS_HELMET, ModItems.BRASS_CHESTPLATE, ModItems.BRASS_LEGGINGS, ModItems.BRASS_BOOTS);
        createArmourSet(ModItems.BRONZE_HELMET, ModItems.BRONZE_CHESTPLATE, ModItems.BRONZE_LEGGINGS, ModItems.BRONZE_BOOTS);

        withExistingParent(ModSpawnEggs.RHINO_SPAWN_EGG.getId().getPath(), mcLoc("item/template_spawn_egg"));
        withExistingParent(ModSpawnEggs.HELLHOUND_SPAWN_EGG.getId().getPath(), mcLoc("item/template_spawn_egg"));
        withExistingParent(ModSpawnEggs.SHADOWHOUND_SPAWN_EGG.getId().getPath(), mcLoc("item/template_spawn_egg"));
        withExistingParent(ModSpawnEggs.SPECTRALHOUND_SPAWN_EGG.getId().getPath(), mcLoc("item/template_spawn_egg"));
        withExistingParent(ModSpawnEggs.DWARVES_SPAWN_EGG.getId().getPath(), mcLoc("item/template_spawn_egg"));
        withExistingParent(ModSpawnEggs.VAMPIRE_BAT_SPAWN_EGG.getId().getPath(), mcLoc("item/template_spawn_egg"));
        withExistingParent(ModSpawnEggs.CAVE_MOLE_SPAWN_EGG.getId().getPath(), mcLoc("item/template_spawn_egg"));
        withExistingParent(ModSpawnEggs.ELVES_SPAWN_EGG.getId().getPath(), mcLoc("item/template_spawn_egg"));
        withExistingParent(ModSpawnEggs.SHARK_SPAWN_EGG.getId().getPath(), mcLoc("item/template_spawn_egg"));
        withExistingParent(ModSpawnEggs.MORAY_EELS_SPAWN_EGG.getId().getPath(), mcLoc("item/template_spawn_egg"));
        withExistingParent(ModSpawnEggs.ELECTRIC_EELS_SPAWN_EGG.getId().getPath(), mcLoc("item/template_spawn_egg"));
        withExistingParent(ModSpawnEggs.JELLYFISH_SPAWN_EGG.getId().getPath(), mcLoc("item/template_spawn_egg"));
        withExistingParent(ModSpawnEggs.GIANT_SQUID_SPAWN_EGG.getId().getPath(), mcLoc("item/template_spawn_egg"));
        withExistingParent(ModSpawnEggs.RAY_SPAWN_EGG.getId().getPath(), mcLoc("item/template_spawn_egg"));
        withExistingParent(ModSpawnEggs.GIANT_OCTOPUS_SPAWN_EGG.getId().getPath(), mcLoc("item/template_spawn_egg"));
        withExistingParent(ModSpawnEggs.NUDIBRANCH_SLUG_SPAWN_EGG.getId().getPath(), mcLoc("item/template_spawn_egg"));
        withExistingParent(ModSpawnEggs.GREAT_WHITE_SPAWN_EGG.getId().getPath(), mcLoc("item/template_spawn_egg"));
        withExistingParent(ModSpawnEggs.ANGLER_FISH_SPAWN_EGG.getId().getPath(), mcLoc("item/template_spawn_egg"));
        withExistingParent(ModSpawnEggs.SEAHORSE_SPAWN_EGG.getId().getPath(), mcLoc("item/template_spawn_egg"));
        withExistingParent(ModSpawnEggs.CLOWNFISH_SPAWN_EGG.getId().getPath(), mcLoc("item/template_spawn_egg"));
        withExistingParent(ModSpawnEggs.ATLANTIAN_GURDIAN_SPAWN_EGG.getId().getPath(), mcLoc("item/template_spawn_egg"));
        withExistingParent(ModSpawnEggs.SIREN_SPAWN_EGG.getId().getPath(), mcLoc("item/template_spawn_egg"));
        withExistingParent(ModSpawnEggs.MERFOLK_SPAWN_EGG.getId().getPath(), mcLoc("item/template_spawn_egg"));
        withExistingParent(ModSpawnEggs.ATLANTIAN_SPAWN_EGG.getId().getPath(), mcLoc("item/template_spawn_egg"));
        withExistingParent(ModSpawnEggs.TANG_FISH_SPAWN_EGG.getId().getPath(), mcLoc("item/template_spawn_egg"));
        withExistingParent(ModSpawnEggs.TUNA_SPAWN_EGG.getId().getPath(), mcLoc("item/template_spawn_egg"));

        simpleItem(ModItems.DICE);
        simpleItem(ModItems.BASIC_PORTAL_ACTIVATOR);
        simpleItem(ModItems.BASIC_PORTAL_CORE);

        //Misc
        simpleItem(AtlantisItems.SHARK_TOOTH);
        simpleItem(AtlantisItems.CLOWNFISH);
        simpleItem(AtlantisItems.COOKED_CLOWNFISH);
        simpleItem(AtlantisItems.RAW_TUNA);
        simpleItem(AtlantisItems.COOKED_TUNA);
        simpleItem(AtlantisItems.TANG_FISH);
        simpleItem(AtlantisItems.COOKED_TANG_FISH);
    }

    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                LostWorldsApi.mcLoc("item/generated")).texture("layer0",
                LostWorldsApi.modLoc("item/" + item.getId().getPath()));
    }

    private ItemModelBuilder simpleBlockItem(RegistryObject<Block> block) {
        return withExistingParent(block.getId().getPath(),
                LostWorldsApi.modLoc("block/" + block.getId().getPath()));
    }

    private ItemModelBuilder simpleBookItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                LostWorldsApi.mcLoc("item/generated")).texture("layer0",
                LostWorldsApi.modLoc("item/" + item.getId().getPath()));
    }

    private ItemModelBuilder simpleBlockItemUi(RegistryObject<Block> item) {
        return withExistingParent(item.getId().getPath(),
                LostWorldsApi.mcLoc("item/generated")).texture("layer0",
                LostWorldsApi.modLoc("item/" + item.getId().getPath()));
    }

    private ItemModelBuilder handheldItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                LostWorldsApi.mcLoc("item/handheld")).texture("layer0",
                LostWorldsApi.modLoc("item/" + item.getId().getPath()));
    }

    private void buttonItem(RegistryObject<Block> block, RegistryObject<Block> baseBlock) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/button_inventory"))
                .texture("texture", LostWorldsApi.modLoc("block/" + ForgeRegistries.BLOCKS.getKey(baseBlock.get()).getPath()));
    }

    private void fenceItem(RegistryObject<Block> block, RegistryObject<Block> baseBlock) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/fence_inventory"))
                .texture("texture", LostWorldsApi.modLoc("block/" + ForgeRegistries.BLOCKS.getKey(baseBlock.get()).getPath()));
    }

    private void wallItem(RegistryObject<Block> block, RegistryObject<Block> baseBlock) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/wall_inventory"))
                .texture("wall", LostWorldsApi.modLoc("block/" + ForgeRegistries.BLOCKS.getKey(baseBlock.get()).getPath()));
    }

    private ItemModelBuilder complexBlock(Block block) {
        return withExistingParent(ForgeRegistries.BLOCKS.getKey(block).getPath(), new ResourceLocation(LostWorldsApi.MODID,
                "block/" + ForgeRegistries.BLOCKS.getKey(block).getPath()));
    }

    private ItemModelBuilder saplingItem(RegistryObject<Block> item) {
        return withExistingParent(item.getId().getPath(),
                LostWorldsApi.mcLoc("item/generated")).texture("layer0",
                new ResourceLocation(LostWorldsApi.MODID,"block/" + item.getId().getPath()));
    }

    private ItemModelBuilder mushroomItem(RegistryObject<Block> item) {
        return withExistingParent(item.getId().getPath(),
                LostWorldsApi.mcLoc("item/generated")).texture("layer0",
                new ResourceLocation(LostWorldsApi.MODID,"block/" + item.getId().getPath()));
    }

    private ItemModelBuilder simpleBlockTexture(RegistryObject<Block> item) {
        return withExistingParent(item.getId().getPath(),
                LostWorldsApi.mcLoc("item/generated")).texture("layer0",
                new ResourceLocation(LostWorldsApi.MODID,"block/" + item.getId().getPath()));
    }

    public void createArmourSet(RegistryObject<Item> helmet, RegistryObject<Item> chestplate, RegistryObject<Item> leggings, RegistryObject<Item> boots) {
        createArmourPiece(helmet, "helmet");
        createArmourPiece(chestplate, "chestplate");
        createArmourPiece(leggings, "leggings");
        createArmourPiece(boots, "boots");
    }

    public void createArmourPiece(RegistryObject<Item> item, String name) {
//        ItemModelBuilder base = this.simpleItem(item);
//        for (ItemModelGenerators.TrimModelData trim : ItemModelGenerators.GENERATED_TRIM_MODELS) {
//
//        }
        createTrim(item, name, TrimMaterials.QUARTZ, 0.1f);
        createTrim(item, name, TrimMaterials.IRON, 0.2f);
        createTrim(item, name, TrimMaterials.NETHERITE, 0.3f);
        createTrim(item, name, TrimMaterials.REDSTONE, 0.4f);
        createTrim(item, name, TrimMaterials.COPPER, 0.5f);
        createTrim(item, name, TrimMaterials.GOLD, 0.6f);
        createTrim(item, name, TrimMaterials.EMERALD, 0.7f);
        createTrim(item, name, TrimMaterials.DIAMOND, 0.8f);
        createTrim(item, name, TrimMaterials.LAPIS, 0.9f);
        createTrim(item, name, TrimMaterials.AMETHYST, 1.0f);
        createArmor(item);
    }

    private ItemModelBuilder createTrim(RegistryObject<Item> item, String name, ResourceKey<TrimMaterial> trimMaterials, float indexId) {
        ItemModelBuilder base = this.simpleItem(item);
        ModelFile trimModel = this.withExistingParent(item.getId().getPath() + "_" + trimMaterials.location().getPath() + "_trim",
                LostWorldsApi.mcLoc("item/generated"))
                .texture("layer0", new ResourceLocation(LostWorldsApi.MODID,"item/" + item.getId().getPath()))
//                .texture("layer1", this.mcLoc("trims/items/" + name + "_trim"));

                //@Error Need to include trim but throws error because the trim file doesn't exist
//                .texture("layer1", LostWorldsConstants.mcLoc("minecraft", "trims/items/" + name + "_trim_" + trimMaterials.location().getPath()));
                .texture("layer1", LostWorldsApi.mcLoc("trims/items/" + name + "_trim_" + trimMaterials.location().getPath()));

        return base.override().predicate(LostWorldsApi.mcLoc("trim_type"), indexId).model(trimModel).end();
    }

    private ItemModelBuilder createArmor(RegistryObject<Item> item) {
        ModelFile quartzLoc = generateArmorModel(LostWorldsApi.MODID + ":item/" + item.getId().getPath() + "_quartz_trim");
        ModelFile ironLoc = generateArmorModel(LostWorldsApi.MODID + ":item/" + item.getId().getPath() + "_iron_trim");
        ModelFile netheriteLoc = generateArmorModel(LostWorldsApi.MODID + ":item/" + item.getId().getPath() + "_netherite_trim");
        ModelFile redstoneLoc = generateArmorModel(LostWorldsApi.MODID + ":item/" + item.getId().getPath() + "_redstone_trim");
        ModelFile copperLoc = generateArmorModel(LostWorldsApi.MODID + ":item/" + item.getId().getPath() + "_copper_trim");
        ModelFile goldLoc = generateArmorModel(LostWorldsApi.MODID + ":item/" + item.getId().getPath() + "_gold_trim");
        ModelFile emeraldLoc = generateArmorModel(LostWorldsApi.MODID + ":item/" + item.getId().getPath() + "_emerald_trim");
        ModelFile diamondLoc = generateArmorModel(LostWorldsApi.MODID + ":item/" + item.getId().getPath() + "_diamond_trim");
        ModelFile lapisLoc = generateArmorModel(LostWorldsApi.MODID + ":item/" + item.getId().getPath() + "_lapis_trim");
        ModelFile amethystLoc = generateArmorModel(LostWorldsApi.MODID + ":item/" + item.getId().getPath() + "_amethyst_trim");

        return withExistingParent(item.getId().getPath(),
                LostWorldsApi.mcLoc("item/generated"))
                .override().predicate(LostWorldsApi.modLoc("item/" + item.getId().getPath()), 0.1f).model(quartzLoc).end()
                .override().predicate(LostWorldsApi.modLoc("item/" + item.getId().getPath()), 0.2f).model(ironLoc).end()
                .override().predicate(LostWorldsApi.modLoc("item/" + item.getId().getPath()), 0.3f).model(netheriteLoc).end()
                .override().predicate(LostWorldsApi.modLoc("item/" + item.getId().getPath()), 0.4f).model(redstoneLoc).end()
                .override().predicate(LostWorldsApi.modLoc("item/" + item.getId().getPath()), 0.5f).model(copperLoc).end()
                .override().predicate(LostWorldsApi.modLoc("item/" + item.getId().getPath()), 0.6f).model(goldLoc).end()
                .override().predicate(LostWorldsApi.modLoc("item/" + item.getId().getPath()), 0.7f).model(emeraldLoc).end()
                .override().predicate(LostWorldsApi.modLoc("item/" + item.getId().getPath()), 0.8f).model(diamondLoc).end()
                .override().predicate(LostWorldsApi.modLoc("item/" + item.getId().getPath()), 0.9f).model(lapisLoc).end()
                .override().predicate(LostWorldsApi.modLoc("item/" + item.getId().getPath()), 1.0f).model(amethystLoc).end()
                .texture("layer0", new ResourceLocation(LostWorldsApi.MODID,"item/" + item.getId().getPath()));
    }

    private ItemModelBuilder generateArmorModel(String name, ResourceLocation... layers) {
        return buildItemModel(name, "item/generated", 0, layers);
    }

    private ItemModelBuilder generateArmorModel(String name) {
        return buildItemModel(name, "item/generated", 0);
    }

    private ItemModelBuilder buildItemModel(String name, String parent, int emissivity, ResourceLocation... layers) {
        ItemModelBuilder builder = withExistingParent(name, parent);
        for (int i = 0; i < layers.length; i++) {
            builder = builder.texture("layer" + i, layers[i]);
        }
        if (emissivity > 0) builder = builder.customLoader(ItemLayerModelBuilder::begin).emissive(emissivity, emissivity, 0).renderType("minecraft:translucent", 0).end();
        return builder;
    }

    private ItemModelBuilder buildItemModel(String name, String parent, int emissivity) {
        ItemModelBuilder builder = withExistingParent(name, parent);

        if (emissivity > 0) builder = builder.customLoader(ItemLayerModelBuilder::begin).emissive(emissivity, emissivity, 0).renderType("minecraft:translucent", 0).end();
        return builder;
    }
}