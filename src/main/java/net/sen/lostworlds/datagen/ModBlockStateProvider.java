package net.sen.lostworlds.datagen;

import net.minecraft.core.Direction;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.client.model.generators.*;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.sen.lostworlds.LostWorldsApi;
import net.sen.lostworlds.block.*;
import net.sen.lostworlds.block.crops.*;
import net.sen.lostworlds.block.custom.*;
import net.sen.lostworlds.block.portal.ModPortalBlock;

import java.util.function.Function;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, LostWorldsApi.MODID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        blockWithItem(AlfheimrBlocks.DRUID_RITUAL_STONE);

        blockWithItem(UnderworldBlocks.UNDERWORLD_PORTAL_FRAME);
        blockWithItem(NidavellirBlocks.NIDAVELLIR_PORTAL_FRAME);
        blockWithItem(AlfheimrBlocks.ALFHEIMR_PORTAL_FRAME);
        blockWithItem(AtlantisBlocks.ATLANTIS_PORTAL_FRAME);
        blockWithItem(SkyopiaBlocks.SKYOPIA_PORTAL_FRAME);
        blockWithItem(ModBlocks.MYSTIC_GATEWAYS_PORTAL_FRAME);
        blockWithItem(ModBlocks.MYSTIC_GATEWAYS_PORTAL_CONTROLLER);

        blockWithItem(UnderworldBlocks.ORICHALCUM_BLOCK);
        blockWithItem(UnderworldBlocks.RAW_ORICHALCUM_BLOCK);
        blockWithItem(UnderworldBlocks.ORICHALCUM_ORE);
        blockWithItem(UnderworldBlocks.DEEPSLATE_ORICHALCUM_ORE);

        blockWithItem(ModBlocks.ZINC_BLOCK);
        blockWithItem(ModBlocks.RAW_ZINC_BLOCK);
        blockWithItem(ModBlocks.ZINC_ORE);
        blockWithItem(ModBlocks.DEEPSLATE_ZINC_ORE);

        blockWithItem(ModBlocks.TIN_BLOCK);
        blockWithItem(ModBlocks.RAW_TIN_BLOCK);
        blockWithItem(ModBlocks.TIN_ORE);
        blockWithItem(ModBlocks.DEEPSLATE_TIN_ORE);

        blockWithItem(ModBlocks.AURICHALCITE_BLOCK);

        blockWithItem(ModBlocks.BRASS_BLOCK);

        blockWithItem(ModBlocks.BRONZE_BLOCK);

        blockWithItem(UnderworldBlocks.ADAMANT_BLOCK);
        blockWithItem(UnderworldBlocks.ADAMANT_ORE);
        blockWithItem(UnderworldBlocks.DEEPSLATE_ADAMANT_ORE);

        blockWithItem(ModBlocks.SOUND_BLOCK);

        makeCarpet(ModBlocks.STICK_DECOR);
        makeCarpet(ModBlocks.ROCK_DECOR);
        makeCarpet(ModBlocks.LEAVES_DECOR);
        makeCarpet(ModBlocks.SEASHELL_DECOR);

//        blockWithItem(ModBlocks.UNDERWORLD_PORTAL);
//        blockWithItem(ModBlocks.NIDAVELLIR_PORTAL);
//        blockWithItem(ModBlocks.ALFHEIMR_PORTAL);

        makeCrop(((PomegranateCropBlock) UnderworldBlocks.POMEGRANATE_CROP_BLOCK.get()), "pomegranate_stage", "pomegranate_stage");
        makeCrop(((DurumWheatCropBlock) AlfheimrBlocks.DURUM_WHEAT_CROP_BLOCK.get()), "durum_wheat_stage", "durum_wheat_stage");
        makeCrop(((TomatoCropBlock) AlfheimrBlocks.TOMATO_CROP_BLOCK.get()), "tomato_stage", "tomato_stage");
        makeCrop(((OnionCropBlock) AlfheimrBlocks.WILD_ONION_CROP_BLOCK.get()), "wild_onion_stage", "wild_onion_stage");
        makeCrop(((OnionCropBlock) AlfheimrBlocks.STAGE_1_ONION_CROP_BLOCK.get()), "stage_1_onion_stage", "stage_1_onion_stage");
        makeCrop(((OnionCropBlock) AlfheimrBlocks.STAGE_2_ONION_CROP_BLOCK.get()), "stage_2_onion_stage", "stage_2_onion_stage");
        makeCrop(((OnionCropBlock) AlfheimrBlocks.STAGE_3_ONION_CROP_BLOCK.get()), "stage_3_onion_stage", "stage_3_onion_stage");
        makeCrop(((OnionCropBlock) AlfheimrBlocks.ONION_CROP_BLOCK.get()), "onion_stage", "onion_stage");
        makeCrop(((DragonFruitCropBlock) AlfheimrBlocks.DRAGON_FRUIT_CROP_BLOCK.get()), "dragon_fruit_stage", "dragon_fruit_stage");
        makeCrop(((ChilliCropBlock) AlfheimrBlocks.CHILLI_CROP_BLOCK.get()), "chilli_stage", "chilli_stage");

        this.makePortalBlock(AlfheimrBlocks.ALFHEIMR_PORTAL);
        this.makePortalBlock(AtlantisBlocks.ATLANTIS_PORTAL);
        this.makePortalBlock(NidavellirBlocks.NIDAVELLIR_PORTAL);
        this.makePortalBlock(SkyopiaBlocks.SKYOPIA_PORTAL);
        this.makePortalBlock(UnderworldBlocks.UNDERWORLD_PORTAL);
        this.makePortalBlock(ModBlocks.MYSTIC_GATEWAYS_PORTAL);

        horizontalBlock(ModBlocks.ALLOY_SMELTER.get(), new ModelFile.UncheckedModelFile(modLoc("block/alloy_smelter")));

//        blockItem(ModBlocks.UNDERWORLD_GRASS_BLOCK);
//        ModelFile underWorldGrassModel = models().withExistingParent(ModBlocks.UNDERWORLD_GRASS_BLOCK.getId().getPath(), mcLoc("block/block"))
//                .texture("particle",new ResourceLocation(LostWorlds.MODID, "block/" + ModBlocks.UNDERWORLD_DIRT.getId().getPath()))
//                .texture("bottom",new ResourceLocation(LostWorlds.MODID, "block/" + ModBlocks.UNDERWORLD_DIRT.getId().getPath()))
//                .texture("top",new ResourceLocation(LostWorlds.MODID, "block/underworld_grass_block_top"))
//                .texture("side",new ResourceLocation(LostWorlds.MODID, "block/underworld_grass_block_side"))
//                .texture("overlay",new ResourceLocation(LostWorlds.MODID, "block/underworld_grass_block_side_overlay"))
//                .element()
//                    .from(0, 0, 0).to(16, 16, 16)
//                        .face(Direction.DOWN)
//                            .uvs(0, 0, 16, 16)
//                            .texture("#bottom")
//                            .cullface(Direction.DOWN)
//                        .end()
//                        .face(Direction.UP)
//                            .uvs(0, 0, 16, 16)
//                            .texture("#top")
//                            .cullface(Direction.UP)
//                        .end()
//                        .face(Direction.NORTH)
//                            .uvs(0, 0, 16, 16)
//                            .texture("#side")
//                            .cullface(Direction.NORTH)
//                            .tintindex(0)
//                        .end()
//                        .face(Direction.SOUTH)
//                            .uvs(0, 0, 16, 16)
//                            .texture("#side")
//                            .cullface(Direction.SOUTH)
//                        .end()
//                        .face(Direction.WEST)
//                            .uvs(0, 0, 16, 16)
//                            .texture("#side")
//                            .cullface(Direction.WEST)
//                        .end()
//                        .face(Direction.EAST)
//                            .uvs(0, 0, 16, 16)
//                            .texture("#side")
//                            .cullface(Direction.EAST)
//                        .end()
//                    .from(0, 0, 0).to(16, 16, 16)
//                    .face(Direction.NORTH)
//                        .uvs(0, 0, 16, 16)
//                        .texture("#overlay")
//                        .tintindex(0)
//                        .cullface(Direction.NORTH)
//                    .end()
//                    .face(Direction.SOUTH)
//                        .uvs(0, 0, 16, 16)
//                        .texture("#overlay")
//                        .tintindex(0)
//                        .cullface(Direction.SOUTH)
//                    .end()
//                    .face(Direction.WEST)
//                        .uvs(0, 0, 16, 16)
//                        .texture("#overlay")
//                        .tintindex(0)
//                        .cullface(Direction.WEST)
//                    .end()
//                    .face(Direction.EAST)
//                        .uvs(0, 0, 16, 16)
//                        .texture("#overlay")
//                        .tintindex(0)
//                        .cullface(Direction.EAST)
//                    .end()
//                .end();
//
//        ModelFile underWorldGrassModelSnowy = models().withExistingParent(ModBlocks.UNDERWORLD_GRASS_BLOCK.getId().getPath() + "_snoy", mcLoc("block/cube_bottom_top"))
//                .texture("bottom",new ResourceLocation(LostWorlds.MODID, "block/" + ModBlocks.UNDERWORLD_DIRT.getId().getPath()))
//                .texture("particle",new ResourceLocation(LostWorlds.MODID, "block/" + ModBlocks.UNDERWORLD_DIRT.getId().getPath()))
//                .texture("side",new ResourceLocation(LostWorlds.MODID, "block/underworld_grass_block_snow"))
//                .texture("top",new ResourceLocation(LostWorlds.MODID, "block/underworld_grass_block_top"))
//                ;

        this.blockWithItem(UnderworldBlocks.UNDERWORLD_DIRT);
//        this.grassBlock(ModBlocks.UNDERWORLD_GRASS_BLOCK, modBlockResourceLocation(ModBlocks.UNDERWORLD_DIRT), modBlockResourceLocation(ModBlocks.UNDERWORLD_DIRT), modBlockResourceLocation("underworld_grass_block_top"), modBlockResourceLocation("underworld_grass_block_side"), modBlockResourceLocation("underworld_grass_block_side_overlay"));
//        getVariantBuilder(ModBlocks.UNDERWORLD_GRASS_BLOCK.get())
//                .partialState()
//                .with(GrassBlock.SNOWY, false)
//                        .modelForState()
//                        .modelFile(underWorldGrassModel)
//                        .addModel()
//                .partialState()
//                .with(GrassBlock.SNOWY, true)
//                        .modelForState()
//                        .modelFile(underWorldGrassModelSnowy)
//                        .addModel();

        /*
        VEGETATION
         */
        makeVegetation(AlfheimrBlocks.ALFHEIMR_MAGIC_GRASS);

        /*
        STUFF
         */
        this.waterRemoverBlock(AtlantisBlocks.ATLANTAS_WATER_REMOVER_BLOCK);

        stoneBlockGenerator();
        treeBlockGenerator();
        flowerBlockGenerator();
        mushroomBlockGenerator();
    }

    private void mushroomBlockGenerator() {
    /*
    MUSHROOMS
     */
        blockWithItem(AlfheimrBlocks.TOP_POINT_MUSHROOM_BLOCK);
        blockWithItem(AlfheimrBlocks.POINT_MUSHROOM_STEM_BLOCK);
        makeMushroom(AlfheimrBlocks.POINT_MUSHROOM_BLOCK, AlfheimrBlocks.POTTED_POINT_MUSHROOM_BLOCK);

        blockWithItem(AlfheimrBlocks.TOP_WITCHES_MUSHROOM_BLOCK);
        blockWithItem(AlfheimrBlocks.WITCHES_MUSHROOM_STEM_BLOCK);
        makeMushroom(AlfheimrBlocks.WITCHES_MUSHROOM_BLOCK, AlfheimrBlocks.POTTED_WITCHES_MUSHROOM_BLOCK);

        blockWithItem(AlfheimrBlocks.TOP_ROYAL_BLUE_MUSHROOM_BLOCK);
        blockWithItem(AlfheimrBlocks.ROYAL_BLUE_MUSHROOM_STEM_BLOCK);
        blockWithItem(AlfheimrBlocks.ROYAL_BLUE_MUSHROOM_GLOW_BLOCK);
        makeMushroom(AlfheimrBlocks.ROYAL_BLUE_MUSHROOM_BLOCK, AlfheimrBlocks.POTTED_ROYAL_BLUE_MUSHROOM_BLOCK);

        blockWithItem(AlfheimrBlocks.TOP_SHORT_TOP_MUSHROOM_BLOCK);
        blockWithItem(AlfheimrBlocks.SHORT_TOP_MUSHROOM_STEM_BLOCK);
        makeMushroom(AlfheimrBlocks.SHORT_TOP_MUSHROOM_BLOCK, AlfheimrBlocks.POTTED_SHORT_TOP_MUSHROOM_BLOCK);

        blockWithItem(AlfheimrBlocks.TOP_SPECTRAL_MUSHROOM_BLOCK);
        blockWithItem(AlfheimrBlocks.SPECTRAL_MUSHROOM_STEM_BLOCK);
        makeMushroom(AlfheimrBlocks.SPECTRAL_MUSHROOM_BLOCK, AlfheimrBlocks.POTTED_SPECTRAL_MUSHROOM_BLOCK);

        makeVine(AlfheimrBlocks.SHADE_MUSHROOM_VINE_BLOCK);
        makeMushroom(AlfheimrBlocks.SHADE_MUSHROOM_BLOCK, AlfheimrBlocks.POTTED_SHADE_MUSHROOM_BLOCK);

        makeVine(AlfheimrBlocks.CAP_MUSHROOM_VINE_BLOCK);
        makeMushroom(AlfheimrBlocks.CAP_MUSHROOM_BLOCK, AlfheimrBlocks.POTTED_CAP_MUSHROOM_BLOCK);
    }

    private void flowerBlockGenerator() {
        /*
         * FLOWER
        */
        makeFlower(UnderworldBlocks.IRIS_FLOWER, UnderworldBlocks.POTTED_IRIS_FLOWER);
        makeFlower(AlfheimrBlocks.DARK_BLOOM_FLOWER, AlfheimrBlocks.POTTED_DARK_BLOOM_FLOWER);
        makeFlower(AlfheimrBlocks.DREAD_NIGHT_FLOWER, AlfheimrBlocks.POTTED_DREAD_NIGIHT_FLOWER);
        makeFlower(AlfheimrBlocks.BLACK_LOTUS_FLOWER, AlfheimrBlocks.POTTED_BLACK_LOTUS_FLOWER);
        makeFlower(AlfheimrBlocks.NIGHT_ROSE_FLOWER, AlfheimrBlocks.POTTED_NIGHT_ROSE_FLOWER);
        makeFlower(AlfheimrBlocks.AQUA_ROSE_FLOWER, AlfheimrBlocks.POTTED_AQUA_ROSE_FLOWER);
        makeFlower(AlfheimrBlocks.MOON_FLOWER, AlfheimrBlocks.POTTED_MOON_FLOWER);
        makeFlower(AlfheimrBlocks.CATHERINE_FLOWER, AlfheimrBlocks.POTTED_CATHERINE_FLOWER);
        makeFlower(AlfheimrBlocks.TAINTED_ROSE_FLOWER, AlfheimrBlocks.POTTED_TAINTED_ROSE_FLOWER);
        makeFlower(AlfheimrBlocks.CINNAMON_ROSE_FLOWER, AlfheimrBlocks.POTTED_CINNAMON_ROSE_FLOWER);
        makeFlower(AlfheimrBlocks.BUTTERFLY_FLOWER, AlfheimrBlocks.POTTED_BUTTERFLY_FLOWER);
        makeFlower(AlfheimrBlocks.GAIA_TULIP_FLOWER, AlfheimrBlocks.POTTED_GAIA_TULIP_FLOWER);
        makeFlower(AlfheimrBlocks.BEARDED_IRIS_FLOWER, AlfheimrBlocks.POTTED_BEARDED_IRIS_FLOWER);
        makeFlower(AlfheimrBlocks.CORNFLOWER_FLOWER, AlfheimrBlocks.POTTED_CORNFLOWER_FLOWER);
        makeFlower(AlfheimrBlocks.MORNING_GLORY_FLOWER, AlfheimrBlocks.POTTED_MORNING_GLORY_FLOWER);
        makeFlower(AlfheimrBlocks.GEORGIA_BLUE_FLOWER, AlfheimrBlocks.POTTED_GEORGIA_BLUE_FLOWER);
        makeFlower(AlfheimrBlocks.BLUE_POPPY_FLOWER, AlfheimrBlocks.POTTED_BLUE_POPPY_FLOWER);
        makeFlower(AlfheimrBlocks.TULIP_FLOWER, AlfheimrBlocks.POTTED_TULIP_FLOWER);
        makeFlower(AlfheimrBlocks.CARNATION_FLOWER, AlfheimrBlocks.POTTED_CARNATION_FLOWER);
        makeFlower(AlfheimrBlocks.LADYS_MANTLE_FLOWER, AlfheimrBlocks.POTTED_LADYS_MANTLE_FLOWER);
        makeFlower(AlfheimrBlocks.GREEN_ROSE_FLOWER, AlfheimrBlocks.POTTED_GREEN_ROSE_FLOWER);
        makeFlower(AlfheimrBlocks.CLEMATIS_FLOWER, AlfheimrBlocks.POTTED_CLEMATIS_FLOWER);
        makeFlower(AlfheimrBlocks.BLUE_STAR_FLOWER, AlfheimrBlocks.POTTED_BLUE_STAR_FLOWER);
        makeFlower(AlfheimrBlocks.SALVIA_FLOWER, AlfheimrBlocks.POTTED_SALVIA_FLOWER);
        makeFlower(AlfheimrBlocks.FALSE_INDIGO_FLOWER, AlfheimrBlocks.POTTED_FALSE_INDIGO_FLOWER);
        makeFlower(AlfheimrBlocks.WHITE_SAGE_FLOWER, AlfheimrBlocks.POTTED_WHITE_SAGE_FLOWER);
        makeFlower(AlfheimrBlocks.SILVER_SCHEHERAZADE_FLOWER, AlfheimrBlocks.POTTED_SILVER_SCHEHERAZADE_FLOWER);
        makeFlower(AlfheimrBlocks.SILVER_SPRING_FLOWER, AlfheimrBlocks.POTTED_SILVER_SPRING_FLOWER);
        makeFlower(AlfheimrBlocks.SILVER_SHADOWS_FLOWER, AlfheimrBlocks.POTTED_SILVER_SHADOWS_FLOWER);
        makeFlower(AlfheimrBlocks.GREEN_BALL_FLOWER, AlfheimrBlocks.POTTED_GREEN_BALL_FLOWER);
        makeFlower(AlfheimrBlocks.LIME_DAHLIA_FLOWER, AlfheimrBlocks.POTTED_LIME_DAHLIA_FLOWER);
        makeFlower(AlfheimrBlocks.HYDRANGEA_FLOWER, AlfheimrBlocks.POTTED_HYDRANGEA_FLOWER);
        makeFlower(AlfheimrBlocks.ZINNIA_FLOWER, AlfheimrBlocks.POTTED_ZINNIA_FLOWER);
        makeFlower(AlfheimrBlocks.BUTTERFLY_CANDY_FLOWER, AlfheimrBlocks.POTTED_BUTTERFLY_CANDY_FLOWER);
        makeFlower(AlfheimrBlocks.CABARET_FLOWER, AlfheimrBlocks.POTTED_CABARET_FLOWER);
        makeFlower(AlfheimrBlocks.DIANTHUS_FLOWER, AlfheimrBlocks.POTTED_DIANTHUS_FLOWER);
        makeFlower(AlfheimrBlocks.TITAN_CRANBERRY_VINCA_FLOWER, AlfheimrBlocks.POTTED_TITAN_CRANBERRY_VINCA_FLOWER);
        makeFlower(AlfheimrBlocks.ORANGE_ZINNIA_FLOWER, AlfheimrBlocks.POTTED_ORANGE_ZINNIA_FLOWER);
        makeFlower(AlfheimrBlocks.BEGONIA_FLOWER, AlfheimrBlocks.POTTED_BEGONIA_FLOWER);
        makeFlower(AlfheimrBlocks.CROWN_IMPERIAL_FLOWER, AlfheimrBlocks.POTTED_CROWN_IMPERIAL_FLOWER);
        makeFlower(AlfheimrBlocks.ORIENTAL_POPPY_FLOWER, AlfheimrBlocks.POTTED_ORIENTAL_POPPY_FLOWER);
        makeFlower(AlfheimrBlocks.AZALEA_FLOWER, AlfheimrBlocks.POTTED_AZALEA_FLOWER);
        makeFlower(AlfheimrBlocks.PINK_DELIGHT_FLOWER, AlfheimrBlocks.POTTED_PINK_DELIGHT_FLOWER);
        makeFlower(AlfheimrBlocks.CHRYSANTHEMUM_FLOWER, AlfheimrBlocks.POTTED_CHRYSANTHEMUM_FLOWER);
        makeFlower(AlfheimrBlocks.HIBISCUS_FLOWER, AlfheimrBlocks.POTTED_HIBISCUS_FLOWER);
        makeFlower(AlfheimrBlocks.CARDINAL_FLOWER, AlfheimrBlocks.POTTED_CARDINAL_FLOWER);
        makeFlower(AlfheimrBlocks.GERBERA_FLOWER, AlfheimrBlocks.POTTED_GERBERA_FLOWER);
        makeFlower(AlfheimrBlocks.RED_TULIP_FLOWER, AlfheimrBlocks.POTTED_RED_TULIP_FLOWER);
        makeFlower(AlfheimrBlocks.FREESIA_FLOWER, AlfheimrBlocks.POTTED_FREESIA_FLOWER);
        makeFlower(AlfheimrBlocks.GARDENIAS_FLOWER, AlfheimrBlocks.POTTED_GARDENIAS_FLOWER);
        makeFlower(AlfheimrBlocks.STAR_JASMINE_FLOWER, AlfheimrBlocks.POTTED_STAR_JASMINE_FLOWER);
        makeFlower(AlfheimrBlocks.WHITE_WARATAH_FLOWER, AlfheimrBlocks.POTTED_WHITE_WARATAH_FLOWER);
        makeFlower(AlfheimrBlocks.FLANNEL_FLOWER, AlfheimrBlocks.POTTED_FLANNEL_FLOWER);
        makeFlower(AlfheimrBlocks.BEARS_EARS_FLOWER, AlfheimrBlocks.POTTED_BEARS_EARS_FLOWER);
        makeFlower(AlfheimrBlocks.BIDENS_FLOWER, AlfheimrBlocks.POTTED_BIDENS_FLOWER);
        makeFlower(AlfheimrBlocks.BLANKET_FLOWER, AlfheimrBlocks.POTTED_BLANKET_FLOWER);
        makeFlower(AlfheimrBlocks.BULBINE_FLOWER, AlfheimrBlocks.POTTED_BULBINE_FLOWER);
        makeFlower(AlfheimrBlocks.SILVER_BRUNIA_FLOWER, AlfheimrBlocks.POTTED_SILVER_BRUNIA_FLOWER);
        makeFlower(AlfheimrBlocks.GRAY_ROSES_FLOWER, AlfheimrBlocks.POTTED_GRAY_ROSES_FLOWER);
        makeFlower(AlfheimrBlocks.MOON_CARROT_FLOWER, AlfheimrBlocks.POTTED_MOON_CARROT_FLOWER);
        makeFlower(AlfheimrBlocks.SILVER_BABY_FLOWER, AlfheimrBlocks.POTTED_SILVER_BABY_FLOWER);
        makeFlower(AlfheimrBlocks.LAVENDER_FLOWER, AlfheimrBlocks.POTTED_LAVENDER_FLOWER);
        makeFlower(AlfheimrBlocks.BELLFLOWER_FLOWER, AlfheimrBlocks.POTTED_BELLFLOWER_FLOWER);
        makeFlower(AlfheimrBlocks.LILAC_FLOWER, AlfheimrBlocks.POTTED_LILAC_FLOWER);
        makeFlower(AlfheimrBlocks.SWEET_PEA_FLOWER, AlfheimrBlocks.POTTED_SWEET_PEA_FLOWER);
    }

    private void treeBlockGenerator() {
        /*
         * TREES
         */
        //Elder Wood
        woodBlockGroup(
                UnderworldBlocks.ELDER_WOOD_LOG,
                UnderworldBlocks.ELDER_WOOD,
                UnderworldBlocks.STRIPPED_ELDER_WOOD_LOG,
                UnderworldBlocks.STRIPPED_ELDER_WOOD,
                UnderworldBlocks.ELDER_WOOD_PLANKS,
                UnderworldBlocks.ELDER_WOOD_PLANKS_STAIRS,
                UnderworldBlocks.ELDER_WOOD_PLANKS_SLAB,
                UnderworldBlocks.ELDER_WOOD_PLANKS_PRESSURE_PLATE,
                UnderworldBlocks.ELDER_WOOD_PLANKS_FENCE,
                UnderworldBlocks.ELDER_WOOD_PLANKS_FENCE_GATE,
                UnderworldBlocks.ELDER_WOOD_PLANKS_DOOR,
                UnderworldBlocks.ELDER_WOOD_PLANKS_TRAPDOOR,
                UnderworldBlocks.ELDER_WOOD_PLANKS_BUTTON,
                UnderworldBlocks.ELDER_WOOD_SAPLING,
                UnderworldBlocks.ELDER_WOOD_LEAVES,
                UnderworldBlocks.ELDER_WOOD_PLANKS_SIGN,
                UnderworldBlocks.ELDER_WOOD_PLANKS_WALL_SIGN,
                UnderworldBlocks.ELDER_WOOD_PLANKS_HANGING_SIGN,
                UnderworldBlocks.ELDER_WOOD_PLANKS_WALL_HANGING_SIGN);

        //Olive
        woodBlockGroup(
                UnderworldBlocks.OLIVE_LOG,
                UnderworldBlocks.OLIVE_WOOD,
                UnderworldBlocks.STRIPPED_OLIVE_LOG,
                UnderworldBlocks.STRIPPED_OLIVE_WOOD,
                UnderworldBlocks.OLIVE_PLANKS,
                UnderworldBlocks.OLIVE_PLANKS_STAIRS,
                UnderworldBlocks.OLIVE_PLANKS_SLAB,
                UnderworldBlocks.OLIVE_PLANKS_PRESSURE_PLATE,
                UnderworldBlocks.OLIVE_PLANKS_FENCE,
                UnderworldBlocks.OLIVE_PLANKS_FENCE_GATE,
                UnderworldBlocks.OLIVE_PLANKS_DOOR,
                UnderworldBlocks.OLIVE_PLANKS_TRAPDOOR,
                UnderworldBlocks.OLIVE_PLANKS_BUTTON,
                UnderworldBlocks.OLIVE_SAPLING,
                UnderworldBlocks.OLIVE_LEAVES,
                UnderworldBlocks.OLIVE_PLANKS_SIGN,
                UnderworldBlocks.OLIVE_PLANKS_WALL_SIGN,
                UnderworldBlocks.OLIVE_PLANKS_HANGING_SIGN,
                UnderworldBlocks.OLIVE_PLANKS_WALL_HANGING_SIGN
        );

        //Myrrh
        woodBlockGroup(
                UnderworldBlocks.MYRRH_LOG,
                UnderworldBlocks.MYRRH_WOOD,
                UnderworldBlocks.STRIPPED_MYRRH_LOG,
                UnderworldBlocks.STRIPPED_MYRRH_WOOD,
                UnderworldBlocks.MYRRH_PLANKS,
                UnderworldBlocks.MYRRH_PLANKS_STAIRS,
                UnderworldBlocks.MYRRH_PLANKS_SLAB,
                UnderworldBlocks.MYRRH_PLANKS_PRESSURE_PLATE,
                UnderworldBlocks.MYRRH_PLANKS_FENCE,
                UnderworldBlocks.MYRRH_PLANKS_FENCE_GATE,
                UnderworldBlocks.MYRRH_PLANKS_DOOR,
                UnderworldBlocks.MYRRH_PLANKS_TRAPDOOR,
                UnderworldBlocks.MYRRH_PLANKS_BUTTON,
                UnderworldBlocks.MYRRH_SAPLING,
                UnderworldBlocks.MYRRH_LEAVES,
                UnderworldBlocks.MYRRH_PLANKS_SIGN,
                UnderworldBlocks.MYRRH_PLANKS_WALL_SIGN,
                UnderworldBlocks.MYRRH_PLANKS_HANGING_SIGN,
                UnderworldBlocks.MYRRH_PLANKS_WALL_HANGING_SIGN
        );

        //Laurel
        woodBlockGroup(
                UnderworldBlocks.LAUREL_LOG,
                UnderworldBlocks.LAUREL_WOOD,
                UnderworldBlocks.STRIPPED_LAUREL_LOG,
                UnderworldBlocks.STRIPPED_LAUREL_WOOD,
                UnderworldBlocks.LAUREL_PLANKS,
                UnderworldBlocks.LAUREL_PLANKS_STAIRS,
                UnderworldBlocks.LAUREL_PLANKS_SLAB,
                UnderworldBlocks.LAUREL_PLANKS_PRESSURE_PLATE,
                UnderworldBlocks.LAUREL_PLANKS_FENCE,
                UnderworldBlocks.LAUREL_PLANKS_FENCE_GATE,
                UnderworldBlocks.LAUREL_PLANKS_DOOR,
                UnderworldBlocks.LAUREL_PLANKS_TRAPDOOR,
                UnderworldBlocks.LAUREL_PLANKS_BUTTON,
                UnderworldBlocks.LAUREL_SAPLING,
                UnderworldBlocks.LAUREL_LEAVES,
                UnderworldBlocks.LAUREL_PLANKS_SIGN,
                UnderworldBlocks.LAUREL_PLANKS_WALL_SIGN,
                UnderworldBlocks.LAUREL_PLANKS_HANGING_SIGN,
                UnderworldBlocks.LAUREL_PLANKS_WALL_HANGING_SIGN
        );

        //Cypress
        woodBlockGroup(
                UnderworldBlocks.CYPRESS_LOG,
                UnderworldBlocks.CYPRESS_WOOD,
                UnderworldBlocks.STRIPPED_CYPRESS_LOG,
                UnderworldBlocks.STRIPPED_CYPRESS_WOOD,
                UnderworldBlocks.CYPRESS_PLANKS,
                UnderworldBlocks.CYPRESS_PLANKS_STAIRS,
                UnderworldBlocks.CYPRESS_PLANKS_SLAB,
                UnderworldBlocks.CYPRESS_PLANKS_PRESSURE_PLATE,
                UnderworldBlocks.CYPRESS_PLANKS_FENCE,
                UnderworldBlocks.CYPRESS_PLANKS_FENCE_GATE,
                UnderworldBlocks.CYPRESS_PLANKS_DOOR,
                UnderworldBlocks.CYPRESS_PLANKS_TRAPDOOR,
                UnderworldBlocks.CYPRESS_PLANKS_BUTTON,
                UnderworldBlocks.CYPRESS_SAPLING,
                UnderworldBlocks.CYPRESS_LEAVES,
                UnderworldBlocks.CYPRESS_PLANKS_SIGN,
                UnderworldBlocks.CYPRESS_PLANKS_WALL_SIGN,
                UnderworldBlocks.CYPRESS_PLANKS_HANGING_SIGN,
                UnderworldBlocks.CYPRESS_PLANKS_WALL_HANGING_SIGN
        );

        //Black Birch
        woodBlockGroup(
                AlfheimrBlocks.BLACK_BIRCH_LOG,
                AlfheimrBlocks.BLACK_BIRCH_WOOD,
                AlfheimrBlocks.STRIPPED_BLACK_BIRCH_LOG,
                AlfheimrBlocks.STRIPPED_BLACK_BIRCH_WOOD,
                AlfheimrBlocks.BLACK_BIRCH_PLANKS,
                AlfheimrBlocks.BLACK_BIRCH_PLANKS_STAIRS,
                AlfheimrBlocks.BLACK_BIRCH_PLANKS_SLAB,
                AlfheimrBlocks.BLACK_BIRCH_PLANKS_PRESSURE_PLATE,
                AlfheimrBlocks.BLACK_BIRCH_PLANKS_FENCE,
                AlfheimrBlocks.BLACK_BIRCH_PLANKS_FENCE_GATE,
                AlfheimrBlocks.BLACK_BIRCH_PLANKS_DOOR,
                AlfheimrBlocks.BLACK_BIRCH_PLANKS_TRAPDOOR,
                AlfheimrBlocks.BLACK_BIRCH_PLANKS_BUTTON,
                AlfheimrBlocks.BLACK_BIRCH_SAPLING,
                AlfheimrBlocks.BLACK_BIRCH_LEAVES,
                AlfheimrBlocks.BLACK_BIRCH_PLANKS_SIGN,
                AlfheimrBlocks.BLACK_BIRCH_PLANKS_WALL_SIGN,
                AlfheimrBlocks.BLACK_BIRCH_PLANKS_HANGING_SIGN,
                AlfheimrBlocks.BLACK_BIRCH_PLANKS_WALL_HANGING_SIGN
        );

        //White Oak
        woodBlockGroup(
                AlfheimrBlocks.WHITE_OAK_LOG,
                AlfheimrBlocks.WHITE_OAK_WOOD,
                AlfheimrBlocks.STRIPPED_WHITE_OAK_LOG,
                AlfheimrBlocks.STRIPPED_WHITE_OAK_WOOD,
                AlfheimrBlocks.WHITE_OAK_PLANKS,
                AlfheimrBlocks.WHITE_OAK_PLANKS_STAIRS,
                AlfheimrBlocks.WHITE_OAK_PLANKS_SLAB,
                AlfheimrBlocks.WHITE_OAK_PLANKS_PRESSURE_PLATE,
                AlfheimrBlocks.WHITE_OAK_PLANKS_FENCE,
                AlfheimrBlocks.WHITE_OAK_PLANKS_FENCE_GATE,
                AlfheimrBlocks.WHITE_OAK_PLANKS_DOOR,
                AlfheimrBlocks.WHITE_OAK_PLANKS_TRAPDOOR,
                AlfheimrBlocks.WHITE_OAK_PLANKS_BUTTON,
                AlfheimrBlocks.WHITE_OAK_SAPLING,
                AlfheimrBlocks.WHITE_OAK_LEAVES,
                AlfheimrBlocks.WHITE_OAK_PLANKS_SIGN,
                AlfheimrBlocks.WHITE_OAK_PLANKS_WALL_SIGN,
                AlfheimrBlocks.WHITE_OAK_PLANKS_HANGING_SIGN,
                AlfheimrBlocks.WHITE_OAK_PLANKS_WALL_HANGING_SIGN
        );

        //Bur Oak
        woodBlockGroup(
                AlfheimrBlocks.BUR_OAK_LOG,
                AlfheimrBlocks.BUR_OAK_WOOD,
                AlfheimrBlocks.STRIPPED_BUR_OAK_LOG,
                AlfheimrBlocks.STRIPPED_BUR_OAK_WOOD,
                AlfheimrBlocks.BUR_OAK_PLANKS,
                AlfheimrBlocks.BUR_OAK_PLANKS_STAIRS,
                AlfheimrBlocks.BUR_OAK_PLANKS_SLAB,
                AlfheimrBlocks.BUR_OAK_PLANKS_PRESSURE_PLATE,
                AlfheimrBlocks.BUR_OAK_PLANKS_FENCE,
                AlfheimrBlocks.BUR_OAK_PLANKS_FENCE_GATE,
                AlfheimrBlocks.BUR_OAK_PLANKS_DOOR,
                AlfheimrBlocks.BUR_OAK_PLANKS_TRAPDOOR,
                AlfheimrBlocks.BUR_OAK_PLANKS_BUTTON,
                AlfheimrBlocks.BUR_OAK_SAPLING,
                AlfheimrBlocks.BUR_OAK_LEAVES,
                AlfheimrBlocks.BUR_OAK_PLANKS_SIGN,
                AlfheimrBlocks.BUR_OAK_PLANKS_WALL_SIGN,
                AlfheimrBlocks.BUR_OAK_PLANKS_HANGING_SIGN,
                AlfheimrBlocks.BUR_OAK_PLANKS_WALL_HANGING_SIGN
        );

        //Blood Cherry
        woodBlockGroup(
                AlfheimrBlocks.BLOOD_CHERRY_LOG,
                AlfheimrBlocks.BLOOD_CHERRY_WOOD,
                AlfheimrBlocks.STRIPPED_BLOOD_CHERRY_LOG,
                AlfheimrBlocks.STRIPPED_BLOOD_CHERRY_WOOD,
                AlfheimrBlocks.BLOOD_CHERRY_PLANKS,
                AlfheimrBlocks.BLOOD_CHERRY_PLANKS_STAIRS,
                AlfheimrBlocks.BLOOD_CHERRY_PLANKS_SLAB,
                AlfheimrBlocks.BLOOD_CHERRY_PLANKS_PRESSURE_PLATE,
                AlfheimrBlocks.BLOOD_CHERRY_PLANKS_FENCE,
                AlfheimrBlocks.BLOOD_CHERRY_PLANKS_FENCE_GATE,
                AlfheimrBlocks.BLOOD_CHERRY_PLANKS_DOOR,
                AlfheimrBlocks.BLOOD_CHERRY_PLANKS_TRAPDOOR,
                AlfheimrBlocks.BLOOD_CHERRY_PLANKS_BUTTON,
                AlfheimrBlocks.BLOOD_CHERRY_SAPLING,
                AlfheimrBlocks.BLOOD_CHERRY_LEAVES,
                AlfheimrBlocks.BLOOD_CHERRY_PLANKS_SIGN,
                AlfheimrBlocks.BLOOD_CHERRY_PLANKS_WALL_SIGN,
                AlfheimrBlocks.BLOOD_CHERRY_PLANKS_HANGING_SIGN,
                AlfheimrBlocks.BLOOD_CHERRY_PLANKS_WALL_HANGING_SIGN
        );

        //Sacred Tree
        woodBlockGroup(
                AlfheimrBlocks.SACRED_TREE_LOG,
                AlfheimrBlocks.SACRED_TREE_WOOD,
                AlfheimrBlocks.STRIPPED_SACRED_TREE_LOG,
                AlfheimrBlocks.STRIPPED_SACRED_TREE_WOOD,
                AlfheimrBlocks.SACRED_TREE_PLANKS,
                AlfheimrBlocks.SACRED_TREE_PLANKS_STAIRS,
                AlfheimrBlocks.SACRED_TREE_PLANKS_SLAB,
                AlfheimrBlocks.SACRED_TREE_PLANKS_PRESSURE_PLATE,
                AlfheimrBlocks.SACRED_TREE_PLANKS_FENCE,
                AlfheimrBlocks.SACRED_TREE_PLANKS_FENCE_GATE,
                AlfheimrBlocks.SACRED_TREE_PLANKS_DOOR,
                AlfheimrBlocks.SACRED_TREE_PLANKS_TRAPDOOR,
                AlfheimrBlocks.SACRED_TREE_PLANKS_BUTTON,
                AlfheimrBlocks.SACRED_TREE_SAPLING,
                AlfheimrBlocks.SACRED_TREE_LEAVES,
                AlfheimrBlocks.SACRED_TREE_PLANKS_SIGN,
                AlfheimrBlocks.SACRED_TREE_PLANKS_WALL_SIGN,
                AlfheimrBlocks.SACRED_TREE_PLANKS_HANGING_SIGN,
                AlfheimrBlocks.SACRED_TREE_PLANKS_WALL_HANGING_SIGN
        );

        //Willow
        woodBlockGroup(
                AlfheimrBlocks.WILLOW_LOG,
                AlfheimrBlocks.WILLOW_WOOD,
                AlfheimrBlocks.STRIPPED_WILLOW_LOG,
                AlfheimrBlocks.STRIPPED_WILLOW_WOOD,
                AlfheimrBlocks.WILLOW_PLANKS,
                AlfheimrBlocks.WILLOW_PLANKS_STAIRS,
                AlfheimrBlocks.WILLOW_PLANKS_SLAB,
                AlfheimrBlocks.WILLOW_PLANKS_PRESSURE_PLATE,
                AlfheimrBlocks.WILLOW_PLANKS_FENCE,
                AlfheimrBlocks.WILLOW_PLANKS_FENCE_GATE,
                AlfheimrBlocks.WILLOW_PLANKS_DOOR,
                AlfheimrBlocks.WILLOW_PLANKS_TRAPDOOR,
                AlfheimrBlocks.WILLOW_PLANKS_BUTTON,
                AlfheimrBlocks.WILLOW_SAPLING,
                AlfheimrBlocks.WILLOW_LEAVES,
                AlfheimrBlocks.WILLOW_PLANKS_SIGN,
                AlfheimrBlocks.WILLOW_PLANKS_WALL_SIGN,
                AlfheimrBlocks.WILLOW_PLANKS_HANGING_SIGN,
                AlfheimrBlocks.WILLOW_PLANKS_WALL_HANGING_SIGN
        );

        //Deadwood
        woodBlockGroup(
                AlfheimrBlocks.DEADWOOD_LOG,
                AlfheimrBlocks.DEADWOOD_WOOD,
                AlfheimrBlocks.STRIPPED_DEADWOOD_LOG,
                AlfheimrBlocks.STRIPPED_DEADWOOD_WOOD,
                AlfheimrBlocks.DEADWOOD_PLANKS,
                AlfheimrBlocks.DEADWOOD_PLANKS_STAIRS,
                AlfheimrBlocks.DEADWOOD_PLANKS_SLAB,
                AlfheimrBlocks.DEADWOOD_PLANKS_PRESSURE_PLATE,
                AlfheimrBlocks.DEADWOOD_PLANKS_FENCE,
                AlfheimrBlocks.DEADWOOD_PLANKS_FENCE_GATE,
                AlfheimrBlocks.DEADWOOD_PLANKS_DOOR,
                AlfheimrBlocks.DEADWOOD_PLANKS_TRAPDOOR,
                AlfheimrBlocks.DEADWOOD_PLANKS_BUTTON,
                AlfheimrBlocks.DEADWOOD_SAPLING,
                AlfheimrBlocks.DEADWOOD_LEAVES,
                AlfheimrBlocks.DEADWOOD_PLANKS_SIGN,
                AlfheimrBlocks.DEADWOOD_PLANKS_WALL_SIGN,
                AlfheimrBlocks.DEADWOOD_PLANKS_HANGING_SIGN,
                AlfheimrBlocks.DEADWOOD_PLANKS_WALL_HANGING_SIGN
        );

        //Ebony Kingswood
        woodBlockGroup(
                AlfheimrBlocks.EBONY_KINGSWOOD_LOG,
                AlfheimrBlocks.EBONY_KINGSWOOD_WOOD,
                AlfheimrBlocks.STRIPPED_EBONY_KINGSWOOD_LOG,
                AlfheimrBlocks.STRIPPED_EBONY_KINGSWOOD_WOOD,
                AlfheimrBlocks.EBONY_KINGSWOOD_PLANKS,
                AlfheimrBlocks.EBONY_KINGSWOOD_PLANKS_STAIRS,
                AlfheimrBlocks.EBONY_KINGSWOOD_PLANKS_SLAB,
                AlfheimrBlocks.EBONY_KINGSWOOD_PLANKS_PRESSURE_PLATE,
                AlfheimrBlocks.EBONY_KINGSWOOD_PLANKS_FENCE,
                AlfheimrBlocks.EBONY_KINGSWOOD_PLANKS_FENCE_GATE,
                AlfheimrBlocks.EBONY_KINGSWOOD_PLANKS_DOOR,
                AlfheimrBlocks.EBONY_KINGSWOOD_PLANKS_TRAPDOOR,
                AlfheimrBlocks.EBONY_KINGSWOOD_PLANKS_BUTTON,
                AlfheimrBlocks.EBONY_KINGSWOOD_SAPLING,
                AlfheimrBlocks.EBONY_KINGSWOOD_LEAVES,
                AlfheimrBlocks.EBONY_KINGSWOOD_PLANKS_SIGN,
                AlfheimrBlocks.EBONY_KINGSWOOD_PLANKS_WALL_SIGN,
                AlfheimrBlocks.EBONY_KINGSWOOD_PLANKS_HANGING_SIGN,
                AlfheimrBlocks.EBONY_KINGSWOOD_PLANKS_WALL_HANGING_SIGN
        );

        //Ivory Kingswood
        woodBlockGroup(
                AlfheimrBlocks.IVORY_KINGSWOOD_LOG,
                AlfheimrBlocks.IVORY_KINGSWOOD_WOOD,
                AlfheimrBlocks.STRIPPED_IVORY_KINGSWOOD_LOG,
                AlfheimrBlocks.STRIPPED_IVORY_KINGSWOOD_WOOD,
                AlfheimrBlocks.IVORY_KINGSWOOD_PLANKS,
                AlfheimrBlocks.IVORY_KINGSWOOD_PLANKS_STAIRS,
                AlfheimrBlocks.IVORY_KINGSWOOD_PLANKS_SLAB,
                AlfheimrBlocks.IVORY_KINGSWOOD_PLANKS_PRESSURE_PLATE,
                AlfheimrBlocks.IVORY_KINGSWOOD_PLANKS_FENCE,
                AlfheimrBlocks.IVORY_KINGSWOOD_PLANKS_FENCE_GATE,
                AlfheimrBlocks.IVORY_KINGSWOOD_PLANKS_DOOR,
                AlfheimrBlocks.IVORY_KINGSWOOD_PLANKS_TRAPDOOR,
                AlfheimrBlocks.IVORY_KINGSWOOD_PLANKS_BUTTON,
                AlfheimrBlocks.IVORY_KINGSWOOD_SAPLING,
                AlfheimrBlocks.IVORY_KINGSWOOD_LEAVES,
                AlfheimrBlocks.IVORY_KINGSWOOD_PLANKS_SIGN,
                AlfheimrBlocks.IVORY_KINGSWOOD_PLANKS_WALL_SIGN,
                AlfheimrBlocks.IVORY_KINGSWOOD_PLANKS_HANGING_SIGN,
                AlfheimrBlocks.IVORY_KINGSWOOD_PLANKS_WALL_HANGING_SIGN
        );

        //Weaver
        woodBlockGroup(
                AlfheimrBlocks.WEAVER_LOG,
                AlfheimrBlocks.WEAVER_WOOD,
                AlfheimrBlocks.STRIPPED_WEAVER_LOG,
                AlfheimrBlocks.STRIPPED_WEAVER_WOOD,
                AlfheimrBlocks.WEAVER_PLANKS,
                AlfheimrBlocks.WEAVER_PLANKS_STAIRS,
                AlfheimrBlocks.WEAVER_PLANKS_SLAB,
                AlfheimrBlocks.WEAVER_PLANKS_PRESSURE_PLATE,
                AlfheimrBlocks.WEAVER_PLANKS_FENCE,
                AlfheimrBlocks.WEAVER_PLANKS_FENCE_GATE,
                AlfheimrBlocks.WEAVER_PLANKS_DOOR,
                AlfheimrBlocks.WEAVER_PLANKS_TRAPDOOR,
                AlfheimrBlocks.WEAVER_PLANKS_BUTTON,
                AlfheimrBlocks.WEAVER_SAPLING,
                AlfheimrBlocks.WEAVER_LEAVES,
                AlfheimrBlocks.WEAVER_PLANKS_SIGN,
                AlfheimrBlocks.WEAVER_PLANKS_WALL_SIGN,
                AlfheimrBlocks.WEAVER_PLANKS_HANGING_SIGN,
                AlfheimrBlocks.WEAVER_PLANKS_WALL_HANGING_SIGN
        );
    }

    private void stoneBlockGenerator() {
    /*
    STONES & GEO
     */
        //Nidavellir Soft Stone
        StoneBlockGroup(
                NidavellirBlocks.NIDAVELLIR_SOFT_STONE,
                NidavellirBlocks.NIDAVELLIR_SOFT_COBBLESTONE,
                NidavellirBlocks.NIDAVELLIR_SOFT_STONE_BRICKS,
                NidavellirBlocks.NIDAVELLIR_SOFT_SMOOTH_STONE,
                NidavellirBlocks.NIDAVELLIR_SOFT_COBBLESTONE_MOSSY,
                NidavellirBlocks.NIDAVELLIR_SOFT_STONE_BRICKS_MOSSY,
                NidavellirBlocks.NIDAVELLIR_SOFT_STONE_BRICKS_CRACKED,
                NidavellirBlocks.NIDAVELLIR_SOFT_STONE_BRICKS_CHISELED,
                NidavellirBlocks.NIDAVELLIR_SOFT_STONE_STAIRS,
                NidavellirBlocks.NIDAVELLIR_SOFT_COBBLESTONE_STAIRS,
                NidavellirBlocks.NIDAVELLIR_SOFT_STONE_BRICKS_STAIRS,
                NidavellirBlocks.NIDAVELLIR_SOFT_STONE_SLAB,
                NidavellirBlocks.NIDAVELLIR_SOFT_COBBLESTONE_SLAB,
                NidavellirBlocks.NIDAVELLIR_SOFT_STONE_BRICKS_SLAB,
                NidavellirBlocks.NIDAVELLIR_SOFT_STONE_WALL,
                NidavellirBlocks.NIDAVELLIR_SOFT_COBBLESTONE_WALL,
                NidavellirBlocks.NIDAVELLIR_SOFT_STONE_BRICKS_WALL,
                NidavellirBlocks.NIDAVELLIR_SOFT_STONE_PRESSURE_PLATE,
                NidavellirBlocks.NIDAVELLIR_SOFT_STONE_BUTTON
        );

        blockWithItem(NidavellirBlocks.NIDAVELLIR_SOFT_STONE_IRON_ORE);
        blockWithItem(NidavellirBlocks.NIDAVELLIR_SOFT_STONE_GOLD_ORE);
        blockWithItem(NidavellirBlocks.NIDAVELLIR_SOFT_STONE_COPPER_ORE);
        blockWithItem(NidavellirBlocks.NIDAVELLIR_SOFT_STONE_TIN_ORE);
        blockWithItem(NidavellirBlocks.NIDAVELLIR_SOFT_STONE_ZINC_ORE);
        blockWithItem(NidavellirBlocks.NIDAVELLIR_SOFT_STONE_DIAMOND_ORE);
        blockWithItem(NidavellirBlocks.NIDAVELLIR_SOFT_STONE_EMERALD_ORE);
        blockWithItem(NidavellirBlocks.NIDAVELLIR_SOFT_STONE_COAL_ORE);
        blockWithItem(NidavellirBlocks.NIDAVELLIR_SOFT_STONE_REDSTONE_ORE);
        blockWithItem(NidavellirBlocks.NIDAVELLIR_SOFT_STONE_LAPIS_ORE);
        blockWithItem(NidavellirBlocks.NIDAVELLIR_SOFT_STONE_AQUAMARINE_ORE);
        blockWithItem(NidavellirBlocks.NIDAVELLIR_SOFT_STONE_OPAL_ORE);
        blockWithItem(NidavellirBlocks.NIDAVELLIR_SOFT_STONE_RUBY_ORE);

        blockWithItem(NidavellirBlocks.NIDAVELLIR_SOFT_STONE_IRON_ORE_CLUSTER);
        blockWithItem(NidavellirBlocks.NIDAVELLIR_SOFT_STONE_GOLD_ORE_CLUSTER);
        blockWithItem(NidavellirBlocks.NIDAVELLIR_SOFT_STONE_COPPER_ORE_CLUSTER);
        blockWithItem(NidavellirBlocks.NIDAVELLIR_SOFT_STONE_TIN_ORE_CLUSTER);
        blockWithItem(NidavellirBlocks.NIDAVELLIR_SOFT_STONE_ZINC_ORE_CLUSTER);
        blockWithItem(NidavellirBlocks.NIDAVELLIR_SOFT_STONE_DIAMOND_ORE_CLUSTER);
        blockWithItem(NidavellirBlocks.NIDAVELLIR_SOFT_STONE_EMERALD_ORE_CLUSTER);
        blockWithItem(NidavellirBlocks.NIDAVELLIR_SOFT_STONE_COAL_ORE_CLUSTER);
        blockWithItem(NidavellirBlocks.NIDAVELLIR_SOFT_STONE_REDSTONE_ORE_CLUSTER);
        blockWithItem(NidavellirBlocks.NIDAVELLIR_SOFT_STONE_LAPIS_ORE_CLUSTER);
        blockWithItem(NidavellirBlocks.NIDAVELLIR_SOFT_STONE_AQUAMARINE_ORE_CLUSTER);
        blockWithItem(NidavellirBlocks.NIDAVELLIR_SOFT_STONE_OPAL_ORE_CLUSTER);
        blockWithItem(NidavellirBlocks.NIDAVELLIR_SOFT_STONE_RUBY_ORE_CLUSTER);

        //Nidavellir Hard Stone
        StoneBlockGroup(
                NidavellirBlocks.NIDAVELLIR_HARD_STONE,
                NidavellirBlocks.NIDAVELLIR_HARD_COBBLESTONE,
                NidavellirBlocks.NIDAVELLIR_HARD_STONE_BRICKS,
                NidavellirBlocks.NIDAVELLIR_HARD_SMOOTH_STONE,
                NidavellirBlocks.NIDAVELLIR_HARD_COBBLESTONE_MOSSY,
                NidavellirBlocks.NIDAVELLIR_HARD_STONE_BRICKS_MOSSY,
                NidavellirBlocks.NIDAVELLIR_HARD_STONE_BRICKS_CRACKED,
                NidavellirBlocks.NIDAVELLIR_HARD_STONE_BRICKS_CHISELED,
                NidavellirBlocks.NIDAVELLIR_HARD_STONE_STAIRS,
                NidavellirBlocks.NIDAVELLIR_HARD_COBBLESTONE_STAIRS,
                NidavellirBlocks.NIDAVELLIR_HARD_STONE_BRICKS_STAIRS,
                NidavellirBlocks.NIDAVELLIR_HARD_STONE_SLAB,
                NidavellirBlocks.NIDAVELLIR_HARD_COBBLESTONE_SLAB,
                NidavellirBlocks.NIDAVELLIR_HARD_STONE_BRICKS_SLAB,
                NidavellirBlocks.NIDAVELLIR_HARD_STONE_WALL,
                NidavellirBlocks.NIDAVELLIR_HARD_COBBLESTONE_WALL,
                NidavellirBlocks.NIDAVELLIR_HARD_STONE_BRICKS_WALL,
                NidavellirBlocks.NIDAVELLIR_HARD_STONE_PRESSURE_PLATE,
                NidavellirBlocks.NIDAVELLIR_HARD_STONE_BUTTON
        );

        blockWithItem(NidavellirBlocks.NIDAVELLIR_HARD_STONE_IRON_ORE);
        blockWithItem(NidavellirBlocks.NIDAVELLIR_HARD_STONE_GOLD_ORE);
        blockWithItem(NidavellirBlocks.NIDAVELLIR_HARD_STONE_COPPER_ORE);
        blockWithItem(NidavellirBlocks.NIDAVELLIR_HARD_STONE_TIN_ORE);
        blockWithItem(NidavellirBlocks.NIDAVELLIR_HARD_STONE_ZINC_ORE);
        blockWithItem(NidavellirBlocks.NIDAVELLIR_HARD_STONE_DIAMOND_ORE);
        blockWithItem(NidavellirBlocks.NIDAVELLIR_HARD_STONE_EMERALD_ORE);
        blockWithItem(NidavellirBlocks.NIDAVELLIR_HARD_STONE_COAL_ORE);
        blockWithItem(NidavellirBlocks.NIDAVELLIR_HARD_STONE_REDSTONE_ORE);
        blockWithItem(NidavellirBlocks.NIDAVELLIR_HARD_STONE_LAPIS_ORE);
        blockWithItem(NidavellirBlocks.NIDAVELLIR_HARD_STONE_AQUAMARINE_ORE);
        blockWithItem(NidavellirBlocks.NIDAVELLIR_HARD_STONE_OPAL_ORE);
        blockWithItem(NidavellirBlocks.NIDAVELLIR_HARD_STONE_RUBY_ORE);

        blockWithItem(NidavellirBlocks.NIDAVELLIR_HARD_STONE_IRON_ORE_CLUSTER);
        blockWithItem(NidavellirBlocks.NIDAVELLIR_HARD_STONE_GOLD_ORE_CLUSTER);
        blockWithItem(NidavellirBlocks.NIDAVELLIR_HARD_STONE_COPPER_ORE_CLUSTER);
        blockWithItem(NidavellirBlocks.NIDAVELLIR_HARD_STONE_TIN_ORE_CLUSTER);
        blockWithItem(NidavellirBlocks.NIDAVELLIR_HARD_STONE_ZINC_ORE_CLUSTER);
        blockWithItem(NidavellirBlocks.NIDAVELLIR_HARD_STONE_DIAMOND_ORE_CLUSTER);
        blockWithItem(NidavellirBlocks.NIDAVELLIR_HARD_STONE_EMERALD_ORE_CLUSTER);
        blockWithItem(NidavellirBlocks.NIDAVELLIR_HARD_STONE_COAL_ORE_CLUSTER);
        blockWithItem(NidavellirBlocks.NIDAVELLIR_HARD_STONE_REDSTONE_ORE_CLUSTER);
        blockWithItem(NidavellirBlocks.NIDAVELLIR_HARD_STONE_LAPIS_ORE_CLUSTER);
        blockWithItem(NidavellirBlocks.NIDAVELLIR_HARD_STONE_AQUAMARINE_ORE_CLUSTER);
        blockWithItem(NidavellirBlocks.NIDAVELLIR_HARD_STONE_OPAL_ORE_CLUSTER);
        blockWithItem(NidavellirBlocks.NIDAVELLIR_HARD_STONE_RUBY_ORE_CLUSTER);

        //Nidavellir Enhanced Stone
        StoneBlockGroup(
                NidavellirBlocks.NIDAVELLIR_ENHANCED_STONE,
                NidavellirBlocks.NIDAVELLIR_ENHANCED_COBBLESTONE,
                NidavellirBlocks.NIDAVELLIR_ENHANCED_STONE_BRICKS,
                NidavellirBlocks.NIDAVELLIR_ENHANCED_SMOOTH_STONE,
                NidavellirBlocks.NIDAVELLIR_ENHANCED_COBBLESTONE_MOSSY,
                NidavellirBlocks.NIDAVELLIR_ENHANCED_STONE_BRICKS_MOSSY,
                NidavellirBlocks.NIDAVELLIR_ENHANCED_STONE_BRICKS_CRACKED,
                NidavellirBlocks.NIDAVELLIR_ENHANCED_STONE_BRICKS_CHISELED,
                NidavellirBlocks.NIDAVELLIR_ENHANCED_STONE_STAIRS,
                NidavellirBlocks.NIDAVELLIR_ENHANCED_COBBLESTONE_STAIRS,
                NidavellirBlocks.NIDAVELLIR_ENHANCED_STONE_BRICKS_STAIRS,
                NidavellirBlocks.NIDAVELLIR_ENHANCED_STONE_SLAB,
                NidavellirBlocks.NIDAVELLIR_ENHANCED_COBBLESTONE_SLAB,
                NidavellirBlocks.NIDAVELLIR_ENHANCED_STONE_BRICKS_SLAB,
                NidavellirBlocks.NIDAVELLIR_ENHANCED_STONE_WALL,
                NidavellirBlocks.NIDAVELLIR_ENHANCED_COBBLESTONE_WALL,
                NidavellirBlocks.NIDAVELLIR_ENHANCED_STONE_BRICKS_WALL,
                NidavellirBlocks.NIDAVELLIR_ENHANCED_STONE_PRESSURE_PLATE,
                NidavellirBlocks.NIDAVELLIR_ENHANCED_STONE_BUTTON
        );

        blockWithItem(NidavellirBlocks.NIDAVELLIR_ENHANCED_STONE_IRON_ORE);
        blockWithItem(NidavellirBlocks.NIDAVELLIR_ENHANCED_STONE_GOLD_ORE);
        blockWithItem(NidavellirBlocks.NIDAVELLIR_ENHANCED_STONE_COPPER_ORE);
        blockWithItem(NidavellirBlocks.NIDAVELLIR_ENHANCED_STONE_TIN_ORE);
        blockWithItem(NidavellirBlocks.NIDAVELLIR_ENHANCED_STONE_ZINC_ORE);
        blockWithItem(NidavellirBlocks.NIDAVELLIR_ENHANCED_STONE_DIAMOND_ORE);
        blockWithItem(NidavellirBlocks.NIDAVELLIR_ENHANCED_STONE_EMERALD_ORE);
        blockWithItem(NidavellirBlocks.NIDAVELLIR_ENHANCED_STONE_COAL_ORE);
        blockWithItem(NidavellirBlocks.NIDAVELLIR_ENHANCED_STONE_REDSTONE_ORE);
        blockWithItem(NidavellirBlocks.NIDAVELLIR_ENHANCED_STONE_LAPIS_ORE);
        blockWithItem(NidavellirBlocks.NIDAVELLIR_ENHANCED_STONE_AQUAMARINE_ORE);
        blockWithItem(NidavellirBlocks.NIDAVELLIR_ENHANCED_STONE_OPAL_ORE);
        blockWithItem(NidavellirBlocks.NIDAVELLIR_ENHANCED_STONE_RUBY_ORE);

        blockWithItem(NidavellirBlocks.NIDAVELLIR_ENHANCED_STONE_IRON_ORE_CLUSTER);
        blockWithItem(NidavellirBlocks.NIDAVELLIR_ENHANCED_STONE_GOLD_ORE_CLUSTER);
        blockWithItem(NidavellirBlocks.NIDAVELLIR_ENHANCED_STONE_COPPER_ORE_CLUSTER);
        blockWithItem(NidavellirBlocks.NIDAVELLIR_ENHANCED_STONE_TIN_ORE_CLUSTER);
        blockWithItem(NidavellirBlocks.NIDAVELLIR_ENHANCED_STONE_ZINC_ORE_CLUSTER);
        blockWithItem(NidavellirBlocks.NIDAVELLIR_ENHANCED_STONE_DIAMOND_ORE_CLUSTER);
        blockWithItem(NidavellirBlocks.NIDAVELLIR_ENHANCED_STONE_EMERALD_ORE_CLUSTER);
        blockWithItem(NidavellirBlocks.NIDAVELLIR_ENHANCED_STONE_COAL_ORE_CLUSTER);
        blockWithItem(NidavellirBlocks.NIDAVELLIR_ENHANCED_STONE_REDSTONE_ORE_CLUSTER);
        blockWithItem(NidavellirBlocks.NIDAVELLIR_ENHANCED_STONE_LAPIS_ORE_CLUSTER);
        blockWithItem(NidavellirBlocks.NIDAVELLIR_ENHANCED_STONE_AQUAMARINE_ORE_CLUSTER);
        blockWithItem(NidavellirBlocks.NIDAVELLIR_ENHANCED_STONE_OPAL_ORE_CLUSTER);
        blockWithItem(NidavellirBlocks.NIDAVELLIR_ENHANCED_STONE_RUBY_ORE_CLUSTER);

        //Nidavellir Deepslate Stone
        StoneBlockGroup(
                NidavellirBlocks.NIDAVELLIR_DEEPSLATE_STONE,
                NidavellirBlocks.NIDAVELLIR_DEEPSLATE_COBBLESTONE,
                NidavellirBlocks.NIDAVELLIR_DEEPSLATE_STONE_BRICKS,
                NidavellirBlocks.NIDAVELLIR_DEEPSLATE_SMOOTH_STONE,
                NidavellirBlocks.NIDAVELLIR_DEEPSLATE_COBBLESTONE_MOSSY,
                NidavellirBlocks.NIDAVELLIR_DEEPSLATE_STONE_BRICKS_MOSSY,
                NidavellirBlocks.NIDAVELLIR_DEEPSLATE_STONE_BRICKS_CRACKED,
                NidavellirBlocks.NIDAVELLIR_DEEPSLATE_STONE_BRICKS_CHISELED,
                NidavellirBlocks.NIDAVELLIR_DEEPSLATE_STONE_STAIRS,
                NidavellirBlocks.NIDAVELLIR_DEEPSLATE_COBBLESTONE_STAIRS,
                NidavellirBlocks.NIDAVELLIR_DEEPSLATE_STONE_BRICKS_STAIRS,
                NidavellirBlocks.NIDAVELLIR_DEEPSLATE_STONE_SLAB,
                NidavellirBlocks.NIDAVELLIR_DEEPSLATE_COBBLESTONE_SLAB,
                NidavellirBlocks.NIDAVELLIR_DEEPSLATE_STONE_BRICKS_SLAB,
                NidavellirBlocks.NIDAVELLIR_DEEPSLATE_STONE_WALL,
                NidavellirBlocks.NIDAVELLIR_DEEPSLATE_COBBLESTONE_WALL,
                NidavellirBlocks.NIDAVELLIR_DEEPSLATE_STONE_BRICKS_WALL,
                NidavellirBlocks.NIDAVELLIR_DEEPSLATE_STONE_PRESSURE_PLATE,
                NidavellirBlocks.NIDAVELLIR_DEEPSLATE_STONE_BUTTON
        );

        blockWithItem(NidavellirBlocks.NIDAVELLIR_DEEPSLATE_STONE_IRON_ORE);
        blockWithItem(NidavellirBlocks.NIDAVELLIR_DEEPSLATE_STONE_GOLD_ORE);
        blockWithItem(NidavellirBlocks.NIDAVELLIR_DEEPSLATE_STONE_COPPER_ORE);
        blockWithItem(NidavellirBlocks.NIDAVELLIR_DEEPSLATE_STONE_TIN_ORE);
        blockWithItem(NidavellirBlocks.NIDAVELLIR_DEEPSLATE_STONE_ZINC_ORE);
        blockWithItem(NidavellirBlocks.NIDAVELLIR_DEEPSLATE_STONE_DIAMOND_ORE);
        blockWithItem(NidavellirBlocks.NIDAVELLIR_DEEPSLATE_STONE_EMERALD_ORE);
        blockWithItem(NidavellirBlocks.NIDAVELLIR_DEEPSLATE_STONE_COAL_ORE);
        blockWithItem(NidavellirBlocks.NIDAVELLIR_DEEPSLATE_STONE_REDSTONE_ORE);
        blockWithItem(NidavellirBlocks.NIDAVELLIR_DEEPSLATE_STONE_LAPIS_ORE);
        blockWithItem(NidavellirBlocks.NIDAVELLIR_DEEPSLATE_STONE_AQUAMARINE_ORE);
        blockWithItem(NidavellirBlocks.NIDAVELLIR_DEEPSLATE_STONE_OPAL_ORE);
        blockWithItem(NidavellirBlocks.NIDAVELLIR_DEEPSLATE_STONE_RUBY_ORE);

        blockWithItem(NidavellirBlocks.NIDAVELLIR_DEEPSLATE_STONE_IRON_ORE_CLUSTER);
        blockWithItem(NidavellirBlocks.NIDAVELLIR_DEEPSLATE_STONE_GOLD_ORE_CLUSTER);
        blockWithItem(NidavellirBlocks.NIDAVELLIR_DEEPSLATE_STONE_COPPER_ORE_CLUSTER);
        blockWithItem(NidavellirBlocks.NIDAVELLIR_DEEPSLATE_STONE_TIN_ORE_CLUSTER);
        blockWithItem(NidavellirBlocks.NIDAVELLIR_DEEPSLATE_STONE_ZINC_ORE_CLUSTER);
        blockWithItem(NidavellirBlocks.NIDAVELLIR_DEEPSLATE_STONE_DIAMOND_ORE_CLUSTER);
        blockWithItem(NidavellirBlocks.NIDAVELLIR_DEEPSLATE_STONE_EMERALD_ORE_CLUSTER);
        blockWithItem(NidavellirBlocks.NIDAVELLIR_DEEPSLATE_STONE_COAL_ORE_CLUSTER);
        blockWithItem(NidavellirBlocks.NIDAVELLIR_DEEPSLATE_STONE_REDSTONE_ORE_CLUSTER);
        blockWithItem(NidavellirBlocks.NIDAVELLIR_DEEPSLATE_STONE_LAPIS_ORE_CLUSTER);
        blockWithItem(NidavellirBlocks.NIDAVELLIR_DEEPSLATE_STONE_AQUAMARINE_ORE_CLUSTER);
        blockWithItem(NidavellirBlocks.NIDAVELLIR_DEEPSLATE_STONE_OPAL_ORE_CLUSTER);
        blockWithItem(NidavellirBlocks.NIDAVELLIR_DEEPSLATE_STONE_RUBY_ORE_CLUSTER);

        //Nidavellir Crimson Stone
        StoneBlockGroup(
                NidavellirBlocks.NIDAVELLIR_CRIMSON_STONE,
                NidavellirBlocks.NIDAVELLIR_CRIMSON_COBBLESTONE,
                NidavellirBlocks.NIDAVELLIR_CRIMSON_STONE_BRICKS,
                NidavellirBlocks.NIDAVELLIR_CRIMSON_SMOOTH_STONE,
                NidavellirBlocks.NIDAVELLIR_CRIMSON_COBBLESTONE_MOSSY,
                NidavellirBlocks.NIDAVELLIR_CRIMSON_STONE_BRICKS_MOSSY,
                NidavellirBlocks.NIDAVELLIR_CRIMSON_STONE_BRICKS_CRACKED,
                NidavellirBlocks.NIDAVELLIR_CRIMSON_STONE_BRICKS_CHISELED,
                NidavellirBlocks.NIDAVELLIR_CRIMSON_STONE_STAIRS,
                NidavellirBlocks.NIDAVELLIR_CRIMSON_COBBLESTONE_STAIRS,
                NidavellirBlocks.NIDAVELLIR_CRIMSON_STONE_BRICKS_STAIRS,
                NidavellirBlocks.NIDAVELLIR_CRIMSON_STONE_SLAB,
                NidavellirBlocks.NIDAVELLIR_CRIMSON_COBBLESTONE_SLAB,
                NidavellirBlocks.NIDAVELLIR_CRIMSON_STONE_BRICKS_SLAB,
                NidavellirBlocks.NIDAVELLIR_CRIMSON_STONE_WALL,
                NidavellirBlocks.NIDAVELLIR_CRIMSON_COBBLESTONE_WALL,
                NidavellirBlocks.NIDAVELLIR_CRIMSON_STONE_BRICKS_WALL,
                NidavellirBlocks.NIDAVELLIR_CRIMSON_STONE_PRESSURE_PLATE,
                NidavellirBlocks.NIDAVELLIR_CRIMSON_STONE_BUTTON
        );

        blockWithItem(NidavellirBlocks.NIDAVELLIR_CRIMSON_STONE_IRON_ORE);
        blockWithItem(NidavellirBlocks.NIDAVELLIR_CRIMSON_STONE_GOLD_ORE);
        blockWithItem(NidavellirBlocks.NIDAVELLIR_CRIMSON_STONE_COPPER_ORE);
        blockWithItem(NidavellirBlocks.NIDAVELLIR_CRIMSON_STONE_TIN_ORE);
        blockWithItem(NidavellirBlocks.NIDAVELLIR_CRIMSON_STONE_ZINC_ORE);
        blockWithItem(NidavellirBlocks.NIDAVELLIR_CRIMSON_STONE_DIAMOND_ORE);
        blockWithItem(NidavellirBlocks.NIDAVELLIR_CRIMSON_STONE_EMERALD_ORE);
        blockWithItem(NidavellirBlocks.NIDAVELLIR_CRIMSON_STONE_COAL_ORE);
        blockWithItem(NidavellirBlocks.NIDAVELLIR_CRIMSON_STONE_REDSTONE_ORE);
        blockWithItem(NidavellirBlocks.NIDAVELLIR_CRIMSON_STONE_LAPIS_ORE);
        blockWithItem(NidavellirBlocks.NIDAVELLIR_CRIMSON_STONE_AQUAMARINE_ORE);
        blockWithItem(NidavellirBlocks.NIDAVELLIR_CRIMSON_STONE_OPAL_ORE);
        blockWithItem(NidavellirBlocks.NIDAVELLIR_CRIMSON_STONE_RUBY_ORE);

        blockWithItem(NidavellirBlocks.NIDAVELLIR_CRIMSON_STONE_IRON_ORE_CLUSTER);
        blockWithItem(NidavellirBlocks.NIDAVELLIR_CRIMSON_STONE_GOLD_ORE_CLUSTER);
        blockWithItem(NidavellirBlocks.NIDAVELLIR_CRIMSON_STONE_COPPER_ORE_CLUSTER);
        blockWithItem(NidavellirBlocks.NIDAVELLIR_CRIMSON_STONE_TIN_ORE_CLUSTER);
        blockWithItem(NidavellirBlocks.NIDAVELLIR_CRIMSON_STONE_ZINC_ORE_CLUSTER);
        blockWithItem(NidavellirBlocks.NIDAVELLIR_CRIMSON_STONE_DIAMOND_ORE_CLUSTER);
        blockWithItem(NidavellirBlocks.NIDAVELLIR_CRIMSON_STONE_EMERALD_ORE_CLUSTER);
        blockWithItem(NidavellirBlocks.NIDAVELLIR_CRIMSON_STONE_COAL_ORE_CLUSTER);
        blockWithItem(NidavellirBlocks.NIDAVELLIR_CRIMSON_STONE_REDSTONE_ORE_CLUSTER);
        blockWithItem(NidavellirBlocks.NIDAVELLIR_CRIMSON_STONE_LAPIS_ORE_CLUSTER);
        blockWithItem(NidavellirBlocks.NIDAVELLIR_CRIMSON_STONE_AQUAMARINE_ORE_CLUSTER);
        blockWithItem(NidavellirBlocks.NIDAVELLIR_CRIMSON_STONE_OPAL_ORE_CLUSTER);
        blockWithItem(NidavellirBlocks.NIDAVELLIR_CRIMSON_STONE_RUBY_ORE_CLUSTER);

        //Tartarus Stone
        StoneBlockGroup(
                UnderworldBlocks.TARTARUS_STONE,
                UnderworldBlocks.TARTARUS_STONE_COBBLESTONE,
                UnderworldBlocks.TARTARUS_STONE_BRICKS,
                UnderworldBlocks.TARTARUS_STONE_SMOOTH_STONE,
                UnderworldBlocks.TARTARUS_STONE_COBBLESTONE_MOSSY,
                UnderworldBlocks.TARTARUS_STONE_BRICKS_MOSSY,
                UnderworldBlocks.TARTARUS_STONE_BRICKS_CRACKED,
                UnderworldBlocks.TARTARUS_STONE_BRICKS_CHISELED,
                UnderworldBlocks.TARTARUS_STONE_STAIRS,
                UnderworldBlocks.TARTARUS_STONE_COBBLESTONE_STAIRS,
                UnderworldBlocks.TARTARUS_STONE_BRICKS_STAIRS,
                UnderworldBlocks.TARTARUS_STONE_SLAB,
                UnderworldBlocks.TARTARUS_STONE_COBBLESTONE_SLAB,
                UnderworldBlocks.TARTARUS_STONE_BRICKS_SLAB,
                UnderworldBlocks.TARTARUS_STONE_WALL,
                UnderworldBlocks.TARTARUS_STONE_COBBLESTONE_WALL,
                UnderworldBlocks.TARTARUS_STONE_BRICKS_WALL,
                UnderworldBlocks.TARTARUS_STONE_PRESSURE_PLATE,
                UnderworldBlocks.TARTARUS_STONE_BUTTON
        );
    }

    private String name(Block block) {
        return key(block).getPath();
    }

    private ResourceLocation key(Block block) {
        return ForgeRegistries.BLOCKS.getKey(block);
    }

    private void blockItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockItem(blockRegistryObject.get(), new ModelFile.UncheckedModelFile(LostWorldsApi.MODID + ":block/" + ForgeRegistries.BLOCKS.getKey(blockRegistryObject.get()).getPath()));
    }

    private void blockItem(RegistryObject<Block> blockRegistryObject, String appendix) {
        simpleBlockItem(blockRegistryObject.get(), new ModelFile.UncheckedModelFile(LostWorldsApi.MODID + ":block/" + ForgeRegistries.BLOCKS.getKey(blockRegistryObject.get()).getPath() + appendix));
    }

    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }

    private void colouredBlockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(),
                models().singleTexture(ForgeRegistries.BLOCKS.getKey(blockRegistryObject.get()).getPath(),
                        LostWorldsApi.mcLoc("minecraft:block/cube_all"),
                        "all", blockTexture(blockRegistryObject.get())).renderType("solid"));
    }

    private void customLamp(RegistryObject<Block> block) {
        getVariantBuilder(block.get()).forAllStates(state -> {
            if(state.getValue(CrimsonDiamondLampBlock.LIT)) {
                return new ConfiguredModel[]{new ConfiguredModel(models().cubeAll(block.getId().getPath() + "_on",
                        modBlockResourceLocation(block.getId().getPath() + "_on")))};
            } else {
                return new ConfiguredModel[]{new ConfiguredModel(models().cubeAll(block.getId().getPath() + "_off",
                        modBlockResourceLocation(block.getId().getPath() + "_off")))};
            }
        });
        simpleBlockItem(block.get(), models().cubeAll(block.getId().getPath(),
                modBlockResourceLocation(block.getId().getPath() + "_on")));
    }

    private void waterRemoverBlock(RegistryObject<Block> block) {
        getVariantBuilder(block.get()).forAllStates(state -> {
            if(state.getValue(WaterRemoverBlock.LIT)) {
                return new ConfiguredModel[]{new ConfiguredModel(models().cubeAll(block.getId().getPath() + "_on",
                        modBlockResourceLocation(block.getId().getPath() + "_on")))};
            } else {
                return new ConfiguredModel[]{new ConfiguredModel(models().cubeAll(block.getId().getPath() + "_off",
                        modBlockResourceLocation(block.getId().getPath() + "_off")))};
            }
        });
        simpleBlockItem(block.get(), models().cubeAll(block.getId().getPath(),
                modBlockResourceLocation(block.getId().getPath() + "_on")));
    }

    private void makePortalBlock(RegistryObject<Block> block) {
        ResourceLocation loc = LostWorldsApi.modLoc("block/" + block.getId().getPath());
        ResourceLocation loc_ew = LostWorldsApi.modLoc("block/" + block.getId().getPath() + "_ew");
        ResourceLocation loc_ns = LostWorldsApi.modLoc("block/" + block.getId().getPath() + "_ns");

        BlockModelBuilder model_ew = models()
                .getBuilder(loc_ew.toString())
                .texture("particle", loc)
                .texture("portal", loc)

                .element()
                .from(6, 0, 0)
                .to(10, 16, 16)
                .face(Direction.EAST).uvs(0, 0, 16, 16).texture("#portal").end()
                .face(Direction.WEST).uvs(0, 0, 16, 16).texture("#portal").end()
                .end();

        BlockModelBuilder model_ns = models()
                .getBuilder(loc_ns.toString())
                .texture("particle", loc)
                .texture("portal", loc)

                .element()
                .from(0, 0, 6)
                .to(16, 16, 10)
                .face(Direction.NORTH).uvs(0, 0, 16, 16).texture("#portal").end()
                .face(Direction.SOUTH).uvs(0, 0, 16, 16).texture("#portal").end()
                .end();

        getVariantBuilder(block.get())
                .forAllStates(state -> {
                    switch (state.getValue(ModPortalBlock.AXIS)) {
                        case X -> {
                            return ConfiguredModel.builder().modelFile(model_ns).build();
                        }

                        case Z -> {
                            return ConfiguredModel.builder().modelFile(model_ew).build();
                        }
                    }

                    return null;
                });
    }

    private void makeCrop(ModCropBlock block, String modelName, String textureName) {
        Function<BlockState, ConfiguredModel[]> function = state -> states(state, block, modelName, textureName);

        getVariantBuilder(block).forAllStates(function);
    }

    private void makeCarpet(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(),
                models().carpet(ForgeRegistries.BLOCKS.getKey(blockRegistryObject.get()).getPath(),
                        blockTexture(blockRegistryObject.get()))
        );
    }

    private ConfiguredModel[] states(BlockState state, ModCropBlock block, String modelName, String textureName) {
        ConfiguredModel[] models = new ConfiguredModel[1];
        models[0] = new ConfiguredModel(models().crop(modelName + state.getValue((block).getAgeProperty()),
                modBlockResourceLocation(textureName + state.getValue((block).getAgeProperty()))).renderType("cutout"));

        return models;
    }

    private void leavesBlock(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(),
                models().cubeAll(ForgeRegistries.BLOCKS.getKey(blockRegistryObject.get()).getPath(), blockTexture(blockRegistryObject.get())).renderType("cutout"));
    }

    private void saplingBlock(RegistryObject<Block> blockRegistryObject) {
        simpleBlock(blockRegistryObject.get(),
                models().cross(ForgeRegistries.BLOCKS.getKey(blockRegistryObject.get()).getPath(), blockTexture(blockRegistryObject.get())).renderType("cutout"));
    }

    private void hangingSignBlock(Block signBlock, Block wallSignBlock, ResourceLocation texture) {
        ModelFile sign = models().sign(name(signBlock), texture);
        hangingSignBlock(signBlock, wallSignBlock, sign);
    }

    private void hangingSignBlock(Block signBlock, Block wallSignBlock, ModelFile sign) {
        simpleBlock(signBlock, sign);
        simpleBlock(wallSignBlock, sign);
    }

    private void makeFlower(RegistryObject<Block> flowerBlock, RegistryObject<Block> potBlock) {
        simpleBlock(flowerBlock.get(),
                models().cross(blockTexture(flowerBlock.get()).getPath(),
                        blockTexture(flowerBlock.get())).renderType("cutout"));
        simpleBlock(potBlock.get(),
                models().withExistingParent(potBlock.getId().getPath(),
                        mcLoc("block/flower_pot_cross")).renderType("cutout")
                        .texture("plant", blockTexture(flowerBlock.get())));
    }

    private void makeVegetation(RegistryObject<Block> vegBlock) {
        simpleBlock(vegBlock.get(),
                models().cross(blockTexture(vegBlock.get()).getPath(),
                        blockTexture(vegBlock.get())).renderType("cutout"));
    }

    private void makeMushroom(RegistryObject<Block> mushroomBlock, RegistryObject<Block> potBlock) {
        simpleBlock(mushroomBlock.get(),
                models().cross(ForgeRegistries.BLOCKS.getKey(mushroomBlock.get()).getPath(),
                        blockTexture(mushroomBlock.get())).renderType("cutout"));
        simpleBlock(potBlock.get(),
                models().withExistingParent(potBlock.getId().getPath(),
                                mcLoc("block/flower_pot_cross")).renderType("cutout")
                        .texture("plant", blockTexture(mushroomBlock.get())));
    }

    private void makeMushroom(RegistryObject<Block> mushroomBlock) {
        simpleBlock(mushroomBlock.get(),
                models().cross(blockTexture(mushroomBlock.get()).getPath(),
                        blockTexture(mushroomBlock.get())).renderType("cutout"));
    }

    private void makeVine(RegistryObject<Block> vineBlock) {
        simpleBlock(vineBlock.get(),
                models().withExistingParent(vineBlock.getId().getPath(),
                        mcLoc("block/vine")).renderType("vine")
                        .texture("vine", blockTexture(vineBlock.get()))
        );
    }

    private ResourceLocation modBlockResourceLocation(RegistryObject<Block> block) {
        return modBlockResourceLocation(block.getId().getPath());
    }

    private ResourceLocation modBlockResourceLocation(RegistryObject<Block> block, String addedData) {
        return modBlockResourceLocation(block.getId().getPath() + addedData);
    }

    private ResourceLocation modBlockResourceLocation(String block) {
        ResourceLocation resourceLocation;
        resourceLocation = LostWorldsApi.modLoc("block/" + block);
        return resourceLocation;
    }

    /*
     * ChaosAwakens
     * https://github.com/ChaosAwakens/ChaosAwakens/tree/6bb21a2e15361e3aa3a15ebc1d427e5f746019cd
     */

    private void grassBlock(RegistryObject<Block> block, ResourceLocation particle, ResourceLocation bottom, ResourceLocation top, ResourceLocation side, ResourceLocation overlay) {
        grassBlock(block.get(), models().getExistingFile(modBlockResourceLocation(block.getId().getPath())));
    }

    private void grassBlock(Block block, ModelFile model) {
        grassBlock(block, new ConfiguredModel(model));
    }

    private void grassBlock(Block block, ConfiguredModel... model) {
        getVariantBuilder(block).partialState().addModels(model);
    }

    /**
     * This function simplifies the generation of block states for wood blocks.
     * @param log The log block.
     * @param wood The wood block.
     * @param strippedLog The stripped log block.
     * @param strippedWood The stripped wood block.
     * @param planks The planks block.
     * @param planksStairs The stair block.
     * @param planksSlab The slab block.
     * @param planksPressurePlate The pressureplate block.
     * @param planksFence The fence block.
     * @param planksFenceGate The fence gate block.
     * @param planksDoor The door block.
     * @param planksTrapDoor The trap door block.
     * @param planksButton The button block.
     * @param planksSapling The sapling block.
     * @param planksLeaves The leaves block.
     * @param planksSign The sign block.
     * @param planksWallSign The wall sign block.
     * @param planksHangingSign The hanging sign block.
     * @param planksHangingWallSign The hanging wall sign block.
     */
    private void woodBlockGroup(RegistryObject<Block> log, RegistryObject<Block> wood, RegistryObject<Block> strippedLog,
                                RegistryObject<Block> strippedWood, RegistryObject<Block> planks, RegistryObject<Block> planksStairs,
                                RegistryObject<Block> planksSlab, RegistryObject<Block> planksPressurePlate, RegistryObject<Block> planksFence,
                                RegistryObject<Block> planksFenceGate, RegistryObject<Block> planksDoor, RegistryObject<Block> planksTrapDoor,
                                RegistryObject<Block> planksButton, RegistryObject<Block> planksSapling, RegistryObject<Block> planksLeaves,
                                RegistryObject<Block> planksSign, RegistryObject<Block> planksWallSign,
                                RegistryObject<Block> planksHangingSign, RegistryObject<Block> planksHangingWallSign) {

        logBlock(((RotatedPillarBlock) log.get()));
        axisBlock((RotatedPillarBlock) wood.get(), blockTexture(log.get()), blockTexture(log.get()));
        axisBlock((RotatedPillarBlock) strippedLog.get(), modBlockResourceLocation(strippedLog.getId().getPath()), modBlockResourceLocation(strippedLog.getId().getPath() + "_top"));
        axisBlock((RotatedPillarBlock) strippedWood.get(), modBlockResourceLocation(strippedLog.getId().getPath()), modBlockResourceLocation(strippedLog.getId().getPath()));

        blockItem(log);
        blockItem(wood);
        blockItem(strippedLog);
        blockItem(strippedWood);
        blockWithItem(planks);

        stairsBlock((StairBlock) planksStairs.get(), blockTexture(planks.get()));
        slabBlock(((SlabBlock) planksSlab.get()), blockTexture(planks.get()), blockTexture(planks.get()));
        pressurePlateBlock((PressurePlateBlock) planksPressurePlate.get(), blockTexture(planks.get()));
        fenceBlock((FenceBlock) planksFence.get(), blockTexture(planks.get()));
        fenceGateBlock((FenceGateBlock) planksFenceGate.get(), blockTexture(planks.get()));
        doorBlockWithRenderType((DoorBlock) planksDoor.get(), modLoc("block/" + planksDoor.getId().getPath() + "_bottom"), modLoc("block/" + planksDoor.getId().getPath() + "_top"), "cutout");
        trapdoorBlockWithRenderType((TrapDoorBlock) planksTrapDoor.get(), modLoc("block/" + planksTrapDoor.getId().getPath()), true, "cutout");
        buttonBlock((ButtonBlock) planksButton.get(), blockTexture(planks.get()));

        blockItem(planksStairs);
        blockItem(planksSlab);
        blockItem(planksFenceGate);
        blockItem(planksPressurePlate);
        blockItem(planksTrapDoor, "_bottom");
        leavesBlock(planksLeaves);
        saplingBlock(planksSapling);
        signBlock(((StandingSignBlock) planksSign.get()),((WallSignBlock) planksWallSign.get()),
                blockTexture(planks.get()));
        hangingSignBlock(planksHangingSign.get(), planksHangingWallSign.get(),
                blockTexture(planks.get()));
    }

    /**
     * This function simplifies the generation of block states for stone blocks.
     * @param stone The stone block.
     * @param cobblestone The cobblestone block.
     * @param stoneBricks The stone bricks block.
     * @param stoneSmooth The smooth stone block.
     * @param cobblestoneMossy The mossy cobblestone block.
     * @param stoneBricksMossy The mossy stone bricks block.
     * @param stoneBricksCracked The cracked stone bricks block.
     * @param stoneBricksChiseled The chiseled stone bricks block.
     * @param stoneStairs The stone stairs block.
     * @param cobblestoneStairs The cobblestone stairs block.
     * @param stoneBricksStairs The stone bricks stairs block.
     * @param stoneSlabs The stone slab block.
     * @param cobblestoneSlabs The cobblestone slab block.
     * @param stoneBricksSlabs The stone bricks block.
     * @param stoneWall The stone wall block.
     * @param cobblestoneWall The cobblestone wall block.
     * @param stoneBricksWall The stone bricks wall block.
     * @param stonePressurePlate The stone pressureplate block.
     * @param stoneButton The stone button block.
     */
    private void StoneBlockGroup(RegistryObject<Block> stone, RegistryObject<Block> cobblestone, RegistryObject<Block> stoneBricks,
                                 RegistryObject<Block> stoneSmooth, RegistryObject<Block> cobblestoneMossy, RegistryObject<Block> stoneBricksMossy,
                                 RegistryObject<Block> stoneBricksCracked, RegistryObject<Block> stoneBricksChiseled,
                                 RegistryObject<Block> stoneStairs, RegistryObject<Block> cobblestoneStairs, RegistryObject<Block> stoneBricksStairs,
                                 RegistryObject<Block> stoneSlabs, RegistryObject<Block> cobblestoneSlabs, RegistryObject<Block> stoneBricksSlabs,
                                 RegistryObject<Block> stoneWall, RegistryObject<Block> cobblestoneWall, RegistryObject<Block> stoneBricksWall,
                                 RegistryObject<Block> stonePressurePlate, RegistryObject<Block> stoneButton) {

        blockWithItem(stone);
        blockWithItem(cobblestone);
        blockWithItem(stoneBricks);
        blockWithItem(stoneSmooth);
        blockWithItem(cobblestoneMossy);
        blockWithItem(stoneBricksMossy);
        blockWithItem(stoneBricksCracked);
        blockWithItem(stoneBricksChiseled);

        stairsBlock((StairBlock) stoneStairs.get(), blockTexture(stone.get()));
        stairsBlock((StairBlock) cobblestoneStairs.get(), blockTexture(cobblestone.get()));
        stairsBlock((StairBlock) stoneBricksStairs.get(), blockTexture(stoneBricks.get()));
        slabBlock(((SlabBlock) stoneSlabs.get()), blockTexture(stone.get()), blockTexture(stone.get()));
        slabBlock(((SlabBlock) cobblestoneSlabs.get()), blockTexture(cobblestone.get()), blockTexture(cobblestone.get()));
        slabBlock(((SlabBlock) stoneBricksSlabs.get()), blockTexture(stoneBricks.get()), blockTexture(stoneBricks.get()));
        wallBlock((WallBlock) stoneWall.get(), blockTexture(stone.get()));
        wallBlock((WallBlock) cobblestoneWall.get(), blockTexture(stone.get()));
        wallBlock((WallBlock) stoneBricksWall.get(), blockTexture(stone.get()));
        pressurePlateBlock((PressurePlateBlock) stonePressurePlate.get(), blockTexture(stone.get()));
        buttonBlock((ButtonBlock) stoneButton.get(), blockTexture(stone.get()));

        blockItem(stoneStairs);
        blockItem(stoneSlabs);
        blockItem(stonePressurePlate);
//        blockItem(stoneButton);
//        blockItem(stoneWall);
        blockItem(cobblestoneStairs);
        blockItem(cobblestoneSlabs);
//        blockItem(cobblestoneWall);
        blockItem(stoneBricksStairs);
        blockItem(stoneBricksSlabs);
//        blockItem(stoneBricksWall);
    }
}
