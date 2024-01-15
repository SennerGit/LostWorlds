package net.sen.lostworlds.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.client.model.generators.*;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.sen.lostworlds.LostWorldsApi;
import net.sen.lostworlds.block.ModBlocks;
import net.sen.lostworlds.block.custom.*;
import net.sen.lostworlds.block.portal.ModPortalBlock;

import java.util.function.Function;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, LostWorldsApi.MODID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        blockWithItem(ModBlocks.CRIMSON_DIAMOND_BLOCK);

        baseBlocks();

        blockWithItem(ModBlocks.DRUID_RITUAL_STONE);

        blockWithItem(ModBlocks.UNDERWORLD_PORTAL_FRAME);
        blockWithItem(ModBlocks.NIDAVELLIR_PORTAL_FRAME);
        blockWithItem(ModBlocks.ALFHEIMR_PORTAL_FRAME);
        blockWithItem(ModBlocks.ATLANTIS_PORTAL_FRAME);
        blockWithItem(ModBlocks.SKYOPIA_PORTAL_FRAME);

        blockWithItem(ModBlocks.NETHER_STEEL_BLOCK);
        blockWithItem(ModBlocks.RAW_NETHER_STEEL_BLOCK);
        blockWithItem(ModBlocks.NETHER_STEEL_ORE);
        blockWithItem(ModBlocks.DEEPSLATE_NETHER_STEEL_ORE);

        blockWithItem(ModBlocks.ORICHALCUM_BLOCK);
        blockWithItem(ModBlocks.RAW_ORICHALCUM_BLOCK);
        blockWithItem(ModBlocks.ORICHALCUM_ORE);
        blockWithItem(ModBlocks.DEEPSLATE_ORICHALCUM_ORE);

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

        blockWithItem(ModBlocks.CRIMSON_STONE);
        blockWithItem(ModBlocks.CRIMSON_COBBLESTONE);
        blockWithItem(ModBlocks.CRIMSON_STONE_BRICKS);

        blockWithItem(ModBlocks.ADAMANT_BLOCK);
        blockWithItem(ModBlocks.ADAMANT_ORE);
        blockWithItem(ModBlocks.DEEPSLATE_ADAMANT_ORE);

        stairsBlock((StairBlock) ModBlocks.CRIMSON_STONE_STAIRS.get(), blockTexture(ModBlocks.CRIMSON_STONE.get()));
        stairsBlock((StairBlock) ModBlocks.CRIMSON_COBBLESTONE_STAIRS.get(), blockTexture(ModBlocks.CRIMSON_COBBLESTONE.get()));
        stairsBlock((StairBlock) ModBlocks.CRIMSON_STONE_BRICK_STAIRS.get(), blockTexture(ModBlocks.CRIMSON_STONE_BRICKS.get()));
        doorBlockWithRenderType((DoorBlock) ModBlocks.CRIMSON_STONE_DOOR.get(), modLoc("block/" + ModBlocks.CRIMSON_STONE_DOOR.getId().getPath() + "_bottom"), modLoc("block/" + ModBlocks.CRIMSON_STONE_DOOR.getId().getPath() + "_top"), "cutout");
        trapdoorBlockWithRenderType((TrapDoorBlock) ModBlocks.CRIMSON_STONE_TRAPDOOR.get(), modLoc("block/" + ModBlocks.CRIMSON_STONE_TRAPDOOR.getId().getPath()), true, "cutout");
        slabBlock(((SlabBlock) ModBlocks.CRIMSON_STONE_SLAB.get()), blockTexture(ModBlocks.CRIMSON_STONE.get()), blockTexture(ModBlocks.CRIMSON_STONE.get()));
        slabBlock(((SlabBlock) ModBlocks.CRIMSON_COBBLESTONE_SLAB.get()), blockTexture(ModBlocks.CRIMSON_COBBLESTONE.get()), blockTexture(ModBlocks.CRIMSON_COBBLESTONE.get()));
        slabBlock(((SlabBlock) ModBlocks.CRIMSON_STONE_BRICK_SLAB.get()), blockTexture(ModBlocks.CRIMSON_STONE_BRICKS.get()), blockTexture(ModBlocks.CRIMSON_STONE_BRICKS.get()));
        pressurePlateBlock((PressurePlateBlock) ModBlocks.CRIMSON_STONE_PRESSURE_PLATE.get(), blockTexture(ModBlocks.CRIMSON_STONE.get()));
        fenceBlock((FenceBlock) ModBlocks.CRIMSON_STONE_FENCE.get(), blockTexture(ModBlocks.CRIMSON_STONE.get()));
        fenceGateBlock((FenceGateBlock) ModBlocks.CRIMSON_STONE_FENCE_GATE.get(), blockTexture(ModBlocks.CRIMSON_STONE.get()));
        wallBlock((WallBlock) ModBlocks.CRIMSON_STONE_WALL.get(), blockTexture(ModBlocks.CRIMSON_STONE.get()));
        buttonBlock((ButtonBlock) ModBlocks.CRIMSON_STONE_BUTTON.get(), blockTexture(ModBlocks.CRIMSON_STONE.get()));
        blockItem(ModBlocks.CRIMSON_STONE_STAIRS);
        blockItem(ModBlocks.CRIMSON_STONE_SLAB);
        blockItem(ModBlocks.CRIMSON_COBBLESTONE_STAIRS);
        blockItem(ModBlocks.CRIMSON_COBBLESTONE_SLAB);
        blockItem(ModBlocks.CRIMSON_STONE_BRICK_STAIRS);
        blockItem(ModBlocks.CRIMSON_STONE_BRICK_SLAB);
        blockItem(ModBlocks.CRIMSON_STONE_FENCE_GATE);
        blockItem(ModBlocks.CRIMSON_STONE_PRESSURE_PLATE);
        blockItem(ModBlocks.CRIMSON_STONE_TRAPDOOR, "_bottom");

        blockWithItem(ModBlocks.SOUND_BLOCK);

//        blockWithItem(ModBlocks.UNDERWORLD_PORTAL);
//        blockWithItem(ModBlocks.NIDAVELLIR_PORTAL);
//        blockWithItem(ModBlocks.ALFHEIMR_PORTAL);



        customLamp(ModBlocks.CRIMSON_DIAMOND_LAMP);

        makeCrop(((PomegranateCropBlock) ModBlocks.POMEGRANATE_CROP_BLOCK.get()), "pomegranate_stage", "pomegranate_stage");
        makeCrop(((DurumWheatCropBlock) ModBlocks.DURUM_WHEAT_CROP_BLOCK.get()), "durum_wheat_stage", "durum_wheat_stage");
        makeCrop(((TomatoCropBlock) ModBlocks.TOMATO_CROP_BLOCK.get()), "tomato_stage", "tomato_stage");
        makeCrop(((OnionCropBlock) ModBlocks.WILD_ONION_CROP_BLOCK.get()), "wild_onion_stage", "wild_onion_stage");
        makeCrop(((OnionCropBlock) ModBlocks.STAGE_1_ONION_CROP_BLOCK.get()), "stage_1_onion_stage", "stage_1_onion_stage");
        makeCrop(((OnionCropBlock) ModBlocks.STAGE_2_ONION_CROP_BLOCK.get()), "stage_2_onion_stage", "stage_2_onion_stage");
        makeCrop(((OnionCropBlock) ModBlocks.STAGE_3_ONION_CROP_BLOCK.get()), "stage_3_onion_stage", "stage_3_onion_stage");
        makeCrop(((OnionCropBlock) ModBlocks.ONION_CROP_BLOCK.get()), "onion_stage", "onion_stage");
        makeCrop(((DragonFruitCropBlock) ModBlocks.DRAGON_FRUIT_CROP_BLOCK.get()), "dragon_fruit_stage", "dragon_fruit_stage");
        makeCrop(((ChilliCropBlock) ModBlocks.CHILLI_CROP_BLOCK.get()), "chilli_stage", "chilli_stage");

        this.makePortalBlock(ModBlocks.ALFHEIMR_PORTAL);
        this.makePortalBlock(ModBlocks.ATLANTIS_PORTAL);
        this.makePortalBlock(ModBlocks.NIDAVELLIR_PORTAL);
        this.makePortalBlock(ModBlocks.SKYOPIA_PORTAL);
        this.makePortalBlock(ModBlocks.UNDERWORLD_PORTAL);

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

        this.blockWithItem(ModBlocks.UNDERWORLD_DIRT);
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
         * TREES
         */
        //Elder Wood
        logBlock(((RotatedPillarBlock) ModBlocks.ELDER_WOOD_LOG.get()));
        axisBlock((RotatedPillarBlock) ModBlocks.ELDER_WOOD.get(), blockTexture(ModBlocks.ELDER_WOOD_LOG.get()), blockTexture(ModBlocks.ELDER_WOOD_LOG.get()));
        axisBlock((RotatedPillarBlock) ModBlocks.STRIPPED_ELDER_WOOD_LOG.get(), modBlockResourceLocation("stripped_elder_wood_log"), modBlockResourceLocation("stripped_elder_wood_log_top"));
        axisBlock((RotatedPillarBlock) ModBlocks.STRIPPED_ELDER_WOOD.get(), modBlockResourceLocation("stripped_elder_wood_log"), modBlockResourceLocation("stripped_elder_wood_log"));

        blockItem(ModBlocks.ELDER_WOOD_LOG);
        blockItem(ModBlocks.ELDER_WOOD);
        blockItem(ModBlocks.STRIPPED_ELDER_WOOD_LOG);
        blockItem(ModBlocks.STRIPPED_ELDER_WOOD);
        blockWithItem(ModBlocks.ELDER_WOOD_PLANKS);

        stairsBlock((StairBlock) ModBlocks.ELDER_WOOD_PLANKS_STAIRS.get(), blockTexture(ModBlocks.ELDER_WOOD_PLANKS.get()));
        slabBlock(((SlabBlock) ModBlocks.ELDER_WOOD_PLANKS_SLAB.get()), blockTexture(ModBlocks.ELDER_WOOD_PLANKS.get()), blockTexture(ModBlocks.ELDER_WOOD_PLANKS.get()));
        pressurePlateBlock((PressurePlateBlock) ModBlocks.ELDER_WOOD_PLANKS_PRESSURE_PLATE.get(), blockTexture(ModBlocks.ELDER_WOOD_PLANKS.get()));
        fenceBlock((FenceBlock) ModBlocks.ELDER_WOOD_PLANKS_FENCE.get(), blockTexture(ModBlocks.ELDER_WOOD_PLANKS.get()));
        fenceGateBlock((FenceGateBlock) ModBlocks.ELDER_WOOD_PLANKS_FENCE_GATE.get(), blockTexture(ModBlocks.ELDER_WOOD_PLANKS.get()));
        doorBlockWithRenderType((DoorBlock) ModBlocks.ELDER_WOOD_PLANKS_DOOR.get(), modLoc("block/" + ModBlocks.ELDER_WOOD_PLANKS_DOOR.getId().getPath() + "_bottom"), modLoc("block/" + ModBlocks.ELDER_WOOD_PLANKS_DOOR.getId().getPath() + "_top"), "cutout");
        trapdoorBlockWithRenderType((TrapDoorBlock) ModBlocks.ELDER_WOOD_PLANKS_TRAPDOOR.get(), modLoc("block/" + ModBlocks.ELDER_WOOD_PLANKS_TRAPDOOR.getId().getPath()), true, "cutout");
        buttonBlock((ButtonBlock) ModBlocks.ELDER_WOOD_PLANKS_BUTTON.get(), blockTexture(ModBlocks.ELDER_WOOD_PLANKS.get()));

        blockItem(ModBlocks.ELDER_WOOD_PLANKS_STAIRS);
        blockItem(ModBlocks.ELDER_WOOD_PLANKS_SLAB);
        blockItem(ModBlocks.ELDER_WOOD_PLANKS_FENCE_GATE);
        blockItem(ModBlocks.ELDER_WOOD_PLANKS_PRESSURE_PLATE);
        blockItem(ModBlocks.ELDER_WOOD_PLANKS_TRAPDOOR, "_bottom");
        leavesBlock(ModBlocks.ELDER_WOOD_LEAVES);
        saplingBlock(ModBlocks.ELDER_WOOD_SAPLING);
        signBlock(((StandingSignBlock) ModBlocks.ELDER_WOOD_PLANKS_SIGN.get()),((WallSignBlock) ModBlocks.ELDER_WOOD_PLANKS_WALL_SIGN.get()),
                blockTexture(ModBlocks.ELDER_WOOD_PLANKS.get()));
        hangingSignBlock( ModBlocks.ELDER_WOOD_PLANKS_HANGING_SIGN.get(), ModBlocks.ELDER_WOOD_PLANKS_WALL_HANGING_SIGN.get(),
                blockTexture(ModBlocks.ELDER_WOOD_PLANKS.get()));

        //Olive
        logBlock(((RotatedPillarBlock) ModBlocks.OLIVE_LOG.get()));
        axisBlock((RotatedPillarBlock) ModBlocks.OLIVE_WOOD.get(), blockTexture(ModBlocks.OLIVE_LOG.get()), blockTexture(ModBlocks.OLIVE_LOG.get()));
        axisBlock((RotatedPillarBlock) ModBlocks.STRIPPED_OLIVE_LOG.get(), modBlockResourceLocation("stripped_olive_log"), modBlockResourceLocation("stripped_olive_log_top"));
        axisBlock((RotatedPillarBlock) ModBlocks.STRIPPED_OLIVE_WOOD.get(), modBlockResourceLocation("stripped_olive_log"), modBlockResourceLocation("stripped_olive_log"));

        blockItem(ModBlocks.OLIVE_LOG);
        blockItem(ModBlocks.OLIVE_WOOD);
        blockItem(ModBlocks.STRIPPED_OLIVE_LOG);
        blockItem(ModBlocks.STRIPPED_OLIVE_WOOD);
        blockWithItem(ModBlocks.OLIVE_PLANKS);

        stairsBlock((StairBlock) ModBlocks.OLIVE_PLANKS_STAIRS.get(), blockTexture(ModBlocks.OLIVE_PLANKS.get()));
        slabBlock(((SlabBlock) ModBlocks.OLIVE_PLANKS_SLAB.get()), blockTexture(ModBlocks.OLIVE_PLANKS.get()), blockTexture(ModBlocks.OLIVE_PLANKS.get()));
        pressurePlateBlock((PressurePlateBlock) ModBlocks.OLIVE_PLANKS_PRESSURE_PLATE.get(), blockTexture(ModBlocks.OLIVE_PLANKS.get()));
        fenceBlock((FenceBlock) ModBlocks.OLIVE_PLANKS_FENCE.get(), blockTexture(ModBlocks.OLIVE_PLANKS.get()));
        fenceGateBlock((FenceGateBlock) ModBlocks.OLIVE_PLANKS_FENCE_GATE.get(), blockTexture(ModBlocks.OLIVE_PLANKS.get()));
        doorBlockWithRenderType((DoorBlock) ModBlocks.OLIVE_PLANKS_DOOR.get(), modLoc("block/" + ModBlocks.OLIVE_PLANKS_DOOR.getId().getPath() + "_bottom"), modLoc("block/" + ModBlocks.OLIVE_PLANKS_DOOR.getId().getPath() + "_top"), "cutout");
        trapdoorBlockWithRenderType((TrapDoorBlock) ModBlocks.OLIVE_PLANKS_TRAPDOOR.get(), modLoc("block/" + ModBlocks.OLIVE_PLANKS_TRAPDOOR.getId().getPath()), true, "cutout");
        buttonBlock((ButtonBlock) ModBlocks.OLIVE_PLANKS_BUTTON.get(), blockTexture(ModBlocks.OLIVE_PLANKS.get()));

        blockItem(ModBlocks.OLIVE_PLANKS_STAIRS);
        blockItem(ModBlocks.OLIVE_PLANKS_SLAB);
        blockItem(ModBlocks.OLIVE_PLANKS_FENCE_GATE);
        blockItem(ModBlocks.OLIVE_PLANKS_PRESSURE_PLATE);
        blockItem(ModBlocks.OLIVE_PLANKS_TRAPDOOR, "_bottom");
        leavesBlock(ModBlocks.OLIVE_LEAVES);
        saplingBlock(ModBlocks.OLIVE_SAPLING);
        signBlock(((StandingSignBlock) ModBlocks.OLIVE_PLANKS_SIGN.get()),((WallSignBlock) ModBlocks.OLIVE_PLANKS_WALL_SIGN.get()),
                blockTexture(ModBlocks.OLIVE_PLANKS.get()));
        hangingSignBlock( ModBlocks.OLIVE_PLANKS_HANGING_SIGN.get(), ModBlocks.OLIVE_PLANKS_WALL_HANGING_SIGN.get(),
                blockTexture(ModBlocks.OLIVE_PLANKS.get()));

        //Myrrh
        logBlock(((RotatedPillarBlock) ModBlocks.MYRRH_LOG.get()));
        axisBlock((RotatedPillarBlock) ModBlocks.MYRRH_WOOD.get(), blockTexture(ModBlocks.MYRRH_LOG.get()), blockTexture(ModBlocks.MYRRH_LOG.get()));
        axisBlock((RotatedPillarBlock) ModBlocks.STRIPPED_MYRRH_LOG.get(), modBlockResourceLocation("stripped_myrrh_log"), modBlockResourceLocation("stripped_myrrh_log_top"));
        axisBlock((RotatedPillarBlock) ModBlocks.STRIPPED_MYRRH_WOOD.get(), modBlockResourceLocation("stripped_myrrh_log"), modBlockResourceLocation("stripped_myrrh_log"));

        blockItem(ModBlocks.MYRRH_LOG);
        blockItem(ModBlocks.MYRRH_WOOD);
        blockItem(ModBlocks.STRIPPED_MYRRH_LOG);
        blockItem(ModBlocks.STRIPPED_MYRRH_WOOD);
        blockWithItem(ModBlocks.MYRRH_PLANKS);

        stairsBlock((StairBlock) ModBlocks.MYRRH_PLANKS_STAIRS.get(), blockTexture(ModBlocks.MYRRH_PLANKS.get()));
        slabBlock(((SlabBlock) ModBlocks.MYRRH_PLANKS_SLAB.get()), blockTexture(ModBlocks.MYRRH_PLANKS.get()), blockTexture(ModBlocks.MYRRH_PLANKS.get()));
        pressurePlateBlock((PressurePlateBlock) ModBlocks.MYRRH_PLANKS_PRESSURE_PLATE.get(), blockTexture(ModBlocks.MYRRH_PLANKS.get()));
        fenceBlock((FenceBlock) ModBlocks.MYRRH_PLANKS_FENCE.get(), blockTexture(ModBlocks.MYRRH_PLANKS.get()));
        fenceGateBlock((FenceGateBlock) ModBlocks.MYRRH_PLANKS_FENCE_GATE.get(), blockTexture(ModBlocks.MYRRH_PLANKS.get()));
        doorBlockWithRenderType((DoorBlock) ModBlocks.MYRRH_PLANKS_DOOR.get(), modLoc("block/" + ModBlocks.MYRRH_PLANKS_DOOR.getId().getPath() + "_bottom"), modLoc("block/" + ModBlocks.MYRRH_PLANKS_DOOR.getId().getPath() + "_top"), "cutout");
        trapdoorBlockWithRenderType((TrapDoorBlock) ModBlocks.MYRRH_PLANKS_TRAPDOOR.get(), modLoc("block/" + ModBlocks.MYRRH_PLANKS_TRAPDOOR.getId().getPath()), true, "cutout");
        buttonBlock((ButtonBlock) ModBlocks.MYRRH_PLANKS_BUTTON.get(), blockTexture(ModBlocks.MYRRH_PLANKS.get()));

        blockItem(ModBlocks.MYRRH_PLANKS_STAIRS);
        blockItem(ModBlocks.MYRRH_PLANKS_SLAB);
        blockItem(ModBlocks.MYRRH_PLANKS_FENCE_GATE);
        blockItem(ModBlocks.MYRRH_PLANKS_PRESSURE_PLATE);
        blockItem(ModBlocks.MYRRH_PLANKS_TRAPDOOR, "_bottom");
        leavesBlock(ModBlocks.MYRRH_LEAVES);
        saplingBlock(ModBlocks.MYRRH_SAPLING);
        signBlock(((StandingSignBlock) ModBlocks.MYRRH_PLANKS_SIGN.get()),((WallSignBlock) ModBlocks.MYRRH_PLANKS_WALL_SIGN.get()),
                blockTexture(ModBlocks.MYRRH_PLANKS.get()));
        hangingSignBlock( ModBlocks.MYRRH_PLANKS_HANGING_SIGN.get(), ModBlocks.MYRRH_PLANKS_WALL_HANGING_SIGN.get(),
                blockTexture(ModBlocks.MYRRH_PLANKS.get()));

        //Laurel
        logBlock(((RotatedPillarBlock) ModBlocks.LAUREL_LOG.get()));
        axisBlock((RotatedPillarBlock) ModBlocks.LAUREL_WOOD.get(), blockTexture(ModBlocks.LAUREL_LOG.get()), blockTexture(ModBlocks.LAUREL_LOG.get()));
        axisBlock((RotatedPillarBlock) ModBlocks.STRIPPED_LAUREL_LOG.get(), modBlockResourceLocation("stripped_laurel_log"), modBlockResourceLocation("stripped_laurel_log_top"));
        axisBlock((RotatedPillarBlock) ModBlocks.STRIPPED_LAUREL_WOOD.get(), modBlockResourceLocation("stripped_laurel_log"), modBlockResourceLocation("stripped_laurel_log"));

        blockItem(ModBlocks.LAUREL_LOG);
        blockItem(ModBlocks.LAUREL_WOOD);
        blockItem(ModBlocks.STRIPPED_LAUREL_LOG);
        blockItem(ModBlocks.STRIPPED_LAUREL_WOOD);
        blockWithItem(ModBlocks.LAUREL_PLANKS);

        stairsBlock((StairBlock) ModBlocks.LAUREL_PLANKS_STAIRS.get(), blockTexture(ModBlocks.LAUREL_PLANKS.get()));
        slabBlock(((SlabBlock) ModBlocks.LAUREL_PLANKS_SLAB.get()), blockTexture(ModBlocks.LAUREL_PLANKS.get()), blockTexture(ModBlocks.LAUREL_PLANKS.get()));
        pressurePlateBlock((PressurePlateBlock) ModBlocks.LAUREL_PLANKS_PRESSURE_PLATE.get(), blockTexture(ModBlocks.LAUREL_PLANKS.get()));
        fenceBlock((FenceBlock) ModBlocks.LAUREL_PLANKS_FENCE.get(), blockTexture(ModBlocks.LAUREL_PLANKS.get()));
        fenceGateBlock((FenceGateBlock) ModBlocks.LAUREL_PLANKS_FENCE_GATE.get(), blockTexture(ModBlocks.LAUREL_PLANKS.get()));
        doorBlockWithRenderType((DoorBlock) ModBlocks.LAUREL_PLANKS_DOOR.get(), modLoc("block/" + ModBlocks.LAUREL_PLANKS_DOOR.getId().getPath() + "_bottom"), modLoc("block/" + ModBlocks.LAUREL_PLANKS_DOOR.getId().getPath() + "_top"), "cutout");
        trapdoorBlockWithRenderType((TrapDoorBlock) ModBlocks.LAUREL_PLANKS_TRAPDOOR.get(), modLoc("block/" + ModBlocks.LAUREL_PLANKS_TRAPDOOR.getId().getPath()), true, "cutout");
        buttonBlock((ButtonBlock) ModBlocks.LAUREL_PLANKS_BUTTON.get(), blockTexture(ModBlocks.LAUREL_PLANKS.get()));

        blockItem(ModBlocks.LAUREL_PLANKS_STAIRS);
        blockItem(ModBlocks.LAUREL_PLANKS_SLAB);
        blockItem(ModBlocks.LAUREL_PLANKS_FENCE_GATE);
        blockItem(ModBlocks.LAUREL_PLANKS_PRESSURE_PLATE);
        blockItem(ModBlocks.LAUREL_PLANKS_TRAPDOOR, "_bottom");
        leavesBlock(ModBlocks.LAUREL_LEAVES);
        saplingBlock(ModBlocks.LAUREL_SAPLING);
        signBlock(((StandingSignBlock) ModBlocks.LAUREL_PLANKS_SIGN.get()),((WallSignBlock) ModBlocks.LAUREL_PLANKS_WALL_SIGN.get()),
                blockTexture(ModBlocks.LAUREL_PLANKS.get()));
        hangingSignBlock( ModBlocks.LAUREL_PLANKS_HANGING_SIGN.get(), ModBlocks.LAUREL_PLANKS_WALL_HANGING_SIGN.get(),
                blockTexture(ModBlocks.LAUREL_PLANKS.get()));

        //Cypress
        logBlock(((RotatedPillarBlock) ModBlocks.CYPRESS_LOG.get()));
        axisBlock((RotatedPillarBlock) ModBlocks.CYPRESS_WOOD.get(), blockTexture(ModBlocks.CYPRESS_LOG.get()), blockTexture(ModBlocks.CYPRESS_LOG.get()));
        axisBlock((RotatedPillarBlock) ModBlocks.STRIPPED_CYPRESS_LOG.get(), modBlockResourceLocation("stripped_cypress_log"), modBlockResourceLocation("stripped_cypress_log_top"));
        axisBlock((RotatedPillarBlock) ModBlocks.STRIPPED_CYPRESS_WOOD.get(), modBlockResourceLocation("stripped_cypress_log"), modBlockResourceLocation("stripped_cypress_log"));

        blockItem(ModBlocks.CYPRESS_LOG);
        blockItem(ModBlocks.CYPRESS_WOOD);
        blockItem(ModBlocks.STRIPPED_CYPRESS_LOG);
        blockItem(ModBlocks.STRIPPED_CYPRESS_WOOD);
        blockWithItem(ModBlocks.CYPRESS_PLANKS);

        stairsBlock((StairBlock) ModBlocks.CYPRESS_PLANKS_STAIRS.get(), blockTexture(ModBlocks.CYPRESS_PLANKS.get()));
        slabBlock(((SlabBlock) ModBlocks.CYPRESS_PLANKS_SLAB.get()), blockTexture(ModBlocks.CYPRESS_PLANKS.get()), blockTexture(ModBlocks.CYPRESS_PLANKS.get()));
        pressurePlateBlock((PressurePlateBlock) ModBlocks.CYPRESS_PLANKS_PRESSURE_PLATE.get(), blockTexture(ModBlocks.CYPRESS_PLANKS.get()));
        fenceBlock((FenceBlock) ModBlocks.CYPRESS_PLANKS_FENCE.get(), blockTexture(ModBlocks.CYPRESS_PLANKS.get()));
        fenceGateBlock((FenceGateBlock) ModBlocks.CYPRESS_PLANKS_FENCE_GATE.get(), blockTexture(ModBlocks.CYPRESS_PLANKS.get()));
        doorBlockWithRenderType((DoorBlock) ModBlocks.CYPRESS_PLANKS_DOOR.get(), modLoc("block/" + ModBlocks.CYPRESS_PLANKS_DOOR.getId().getPath() + "_bottom"), modLoc("block/" + ModBlocks.CYPRESS_PLANKS_DOOR.getId().getPath() + "_top"), "cutout");
        trapdoorBlockWithRenderType((TrapDoorBlock) ModBlocks.CYPRESS_PLANKS_TRAPDOOR.get(), modLoc("block/" + ModBlocks.CYPRESS_PLANKS_TRAPDOOR.getId().getPath()), true, "cutout");
        buttonBlock((ButtonBlock) ModBlocks.CYPRESS_PLANKS_BUTTON.get(), blockTexture(ModBlocks.CYPRESS_PLANKS.get()));

        blockItem(ModBlocks.CYPRESS_PLANKS_STAIRS);
        blockItem(ModBlocks.CYPRESS_PLANKS_SLAB);
        blockItem(ModBlocks.CYPRESS_PLANKS_FENCE_GATE);
        blockItem(ModBlocks.CYPRESS_PLANKS_PRESSURE_PLATE);
        blockItem(ModBlocks.CYPRESS_PLANKS_TRAPDOOR, "_bottom");
        leavesBlock(ModBlocks.CYPRESS_LEAVES);
        saplingBlock(ModBlocks.CYPRESS_SAPLING);
        signBlock(((StandingSignBlock) ModBlocks.CYPRESS_PLANKS_SIGN.get()),((WallSignBlock) ModBlocks.CYPRESS_PLANKS_WALL_SIGN.get()),
                blockTexture(ModBlocks.CYPRESS_PLANKS.get()));
        hangingSignBlock( ModBlocks.CYPRESS_PLANKS_HANGING_SIGN.get(), ModBlocks.CYPRESS_PLANKS_WALL_HANGING_SIGN.get(),
                blockTexture(ModBlocks.CYPRESS_PLANKS.get()));

        /*
         * FLOWER
        */
        makeFlower(ModBlocks.IRIS_FLOWER, ModBlocks.POTTED_IRIS_FLOWER);
        makeFlower(ModBlocks.DARK_BLOOM_FLOWER, ModBlocks.POTTED_DARK_BLOOM_FLOWER);
        makeFlower(ModBlocks.DREAD_NIGHT_FLOWER, ModBlocks.POTTED_DREAD_NIGIHT_FLOWER);
        makeFlower(ModBlocks.BLACK_LOTUS_FLOWER, ModBlocks.POTTED_BLACK_LOTUS_FLOWER);
        makeFlower(ModBlocks.NIGHT_ROSE_FLOWER, ModBlocks.POTTED_NIGHT_ROSE_FLOWER);
        makeFlower(ModBlocks.AQUA_ROSE_FLOWER, ModBlocks.POTTED_AQUA_ROSE_FLOWER);
        makeFlower(ModBlocks.MOON_FLOWER, ModBlocks.POTTED_MOON_FLOWER);
        makeFlower(ModBlocks.CATHERINE_FLOWER, ModBlocks.POTTED_CATHERINE_FLOWER);
        makeFlower(ModBlocks.TAINTED_ROSE_FLOWER, ModBlocks.POTTED_TAINTED_ROSE_FLOWER);
        makeFlower(ModBlocks.CINNAMON_ROSE_FLOWER, ModBlocks.POTTED_CINNAMON_ROSE_FLOWER);
        makeFlower(ModBlocks.BUTTERFLY_FLOWER, ModBlocks.POTTED_BUTTERFLY_FLOWER);
        makeFlower(ModBlocks.GAIA_TULIP_FLOWER, ModBlocks.POTTED_GAIA_TULIP_FLOWER);
        makeFlower(ModBlocks.BEARDED_IRIS_FLOWER, ModBlocks.POTTED_BEARDED_IRIS_FLOWER);
        makeFlower(ModBlocks.CORNFLOWER_FLOWER, ModBlocks.POTTED_CORNFLOWER_FLOWER);
        makeFlower(ModBlocks.MORNING_GLORY_FLOWER, ModBlocks.POTTED_MORNING_GLORY_FLOWER);
        makeFlower(ModBlocks.GEORGIA_BLUE_FLOWER, ModBlocks.POTTED_GEORGIA_BLUE_FLOWER);
        makeFlower(ModBlocks.BLUE_POPPY_FLOWER, ModBlocks.POTTED_BLUE_POPPY_FLOWER);
        makeFlower(ModBlocks.TULIP_FLOWER, ModBlocks.POTTED_TULIP_FLOWER);
        makeFlower(ModBlocks.CARNATION_FLOWER, ModBlocks.POTTED_CARNATION_FLOWER);
        makeFlower(ModBlocks.LADYS_MANTLE_FLOWER, ModBlocks.POTTED_LADYS_MANTLE_FLOWER);
        makeFlower(ModBlocks.GREEN_ROSE_FLOWER, ModBlocks.POTTED_GREEN_ROSE_FLOWER);
        makeFlower(ModBlocks.CLEMATIS_FLOWER, ModBlocks.POTTED_CLEMATIS_FLOWER);
        makeFlower(ModBlocks.BLUE_STAR_FLOWER, ModBlocks.POTTED_BLUE_STAR_FLOWER);
        makeFlower(ModBlocks.SALVIA_FLOWER, ModBlocks.POTTED_SALVIA_FLOWER);
        makeFlower(ModBlocks.FALSE_INDIGO_FLOWER, ModBlocks.POTTED_FALSE_INDIGO_FLOWER);
        makeFlower(ModBlocks.WHITE_SAGE_FLOWER, ModBlocks.POTTED_WHITE_SAGE_FLOWER);
        makeFlower(ModBlocks.SILVER_SCHEHERAZADE_FLOWER, ModBlocks.POTTED_SILVER_SCHEHERAZADE_FLOWER);
        makeFlower(ModBlocks.SILVER_SPRING_FLOWER, ModBlocks.POTTED_SILVER_SPRING_FLOWER);
        makeFlower(ModBlocks.SILVER_SHADOWS_FLOWER, ModBlocks.POTTED_SILVER_SHADOWS_FLOWER);
        makeFlower(ModBlocks.GREEN_BALL_FLOWER, ModBlocks.POTTED_GREEN_BALL_FLOWER);
        makeFlower(ModBlocks.LIME_DAHLIA_FLOWER, ModBlocks.POTTED_LIME_DAHLIA_FLOWER);
        makeFlower(ModBlocks.HYDRANGEA_FLOWER, ModBlocks.POTTED_HYDRANGEA_FLOWER);
        makeFlower(ModBlocks.ZINNIA_FLOWER, ModBlocks.POTTED_ZINNIA_FLOWER);
        makeFlower(ModBlocks.BUTTERFLY_CANDY_FLOWER, ModBlocks.POTTED_BUTTERFLY_CANDY_FLOWER);
        makeFlower(ModBlocks.CABARET_FLOWER, ModBlocks.POTTED_CABARET_FLOWER);
        makeFlower(ModBlocks.DIANTHUS_FLOWER, ModBlocks.POTTED_DIANTHUS_FLOWER);
        makeFlower(ModBlocks.TITAN_CRANBERRY_VINCA_FLOWER, ModBlocks.POTTED_TITAN_CRANBERRY_VINCA_FLOWER);
        makeFlower(ModBlocks.ORANGE_ZINNIA_FLOWER, ModBlocks.POTTED_ORANGE_ZINNIA_FLOWER);
        makeFlower(ModBlocks.BEGONIA_FLOWER, ModBlocks.POTTED_BEGONIA_FLOWER);
        makeFlower(ModBlocks.CROWN_IMPERIAL_FLOWER, ModBlocks.POTTED_CROWN_IMPERIAL_FLOWER);
        makeFlower(ModBlocks.ORIENTAL_POPPY_FLOWER, ModBlocks.POTTED_ORIENTAL_POPPY_FLOWER);
        makeFlower(ModBlocks.AZALEA_FLOWER, ModBlocks.POTTED_AZALEA_FLOWER);
        makeFlower(ModBlocks.PINK_DELIGHT_FLOWER, ModBlocks.POTTED_PINK_DELIGHT_FLOWER);
        makeFlower(ModBlocks.CHRYSANTHEMUM_FLOWER, ModBlocks.POTTED_CHRYSANTHEMUM_FLOWER);
        makeFlower(ModBlocks.HIBISCUS_FLOWER, ModBlocks.POTTED_HIBISCUS_FLOWER);
        makeFlower(ModBlocks.CARDINAL_FLOWER, ModBlocks.POTTED_CARDINAL_FLOWER);
        makeFlower(ModBlocks.GERBERA_FLOWER, ModBlocks.POTTED_GERBERA_FLOWER);
        makeFlower(ModBlocks.RED_TULIP_FLOWER, ModBlocks.POTTED_RED_TULIP_FLOWER);
        makeFlower(ModBlocks.FREESIA_FLOWER, ModBlocks.POTTED_FREESIA_FLOWER);
        makeFlower(ModBlocks.GARDENIAS_FLOWER, ModBlocks.POTTED_GARDENIAS_FLOWER);
        makeFlower(ModBlocks.STAR_JASMINE_FLOWER, ModBlocks.POTTED_STAR_JASMINE_FLOWER);
        makeFlower(ModBlocks.WHITE_WARATAH_FLOWER, ModBlocks.POTTED_WHITE_WARATAH_FLOWER);
        makeFlower(ModBlocks.FLANNEL_FLOWER, ModBlocks.POTTED_FLANNEL_FLOWER);
        makeFlower(ModBlocks.BEARS_EARS_FLOWER, ModBlocks.POTTED_BEARS_EARS_FLOWER);
        makeFlower(ModBlocks.BIDENS_FLOWER, ModBlocks.POTTED_BIDENS_FLOWER);
        makeFlower(ModBlocks.BLANKET_FLOWER, ModBlocks.POTTED_BLANKET_FLOWER);
        makeFlower(ModBlocks.BULBINE_FLOWER, ModBlocks.POTTED_BULBINE_FLOWER);
        makeFlower(ModBlocks.SILVER_BRUNIA_FLOWER, ModBlocks.POTTED_SILVER_BRUNIA_FLOWER);
        makeFlower(ModBlocks.GRAY_ROSES_FLOWER, ModBlocks.POTTED_GRAY_ROSES_FLOWER);
        makeFlower(ModBlocks.MOON_CARROT_FLOWER, ModBlocks.POTTED_MOON_CARROT_FLOWER);
        makeFlower(ModBlocks.SILVER_BABY_FLOWER, ModBlocks.POTTED_SILVER_BABY_FLOWER);
        makeFlower(ModBlocks.LAVENDER_FLOWER, ModBlocks.POTTED_LAVENDER_FLOWER);
        makeFlower(ModBlocks.BELLFLOWER_FLOWER, ModBlocks.POTTED_BELLFLOWER_FLOWER);
        makeFlower(ModBlocks.LILAC_FLOWER, ModBlocks.POTTED_LILAC_FLOWER);
        makeFlower(ModBlocks.SWEET_PEA_FLOWER, ModBlocks.POTTED_SWEET_PEA_FLOWER);


        /*
        VEGETATION
         */
        makeVegetation(ModBlocks.ALFHEIMR_MAGIC_GRASS);

        /*
        MUSHROOMS
         */
        blockWithItem(ModBlocks.TOP_POINT_MUSHROOM_BLOCK);
        blockWithItem(ModBlocks.POINT_MUSHROOM_STEM_BLOCK);
        makeMushroom(ModBlocks.POINT_MUSHROOM_BLOCK, ModBlocks.POTTED_POINT_MUSHROOM_BLOCK);

        blockWithItem(ModBlocks.TOP_WITCHES_MUSHROOM_BLOCK);
        blockWithItem(ModBlocks.WITCHES_MUSHROOM_STEM_BLOCK);
        makeMushroom(ModBlocks.WITCHES_MUSHROOM_BLOCK, ModBlocks.POTTED_WITCHES_MUSHROOM_BLOCK);

        blockWithItem(ModBlocks.TOP_ROYAL_BLUE_MUSHROOM_BLOCK);
        blockWithItem(ModBlocks.ROYAL_BLUE_MUSHROOM_STEM_BLOCK);
        blockWithItem(ModBlocks.ROYAL_BLUE_MUSHROOM_GLOW_BLOCK);
        makeMushroom(ModBlocks.ROYAL_BLUE_MUSHROOM_BLOCK, ModBlocks.POTTED_ROYAL_BLUE_MUSHROOM_BLOCK);

        blockWithItem(ModBlocks.TOP_SHORT_TOP_MUSHROOM_BLOCK);
        blockWithItem(ModBlocks.SHORT_TOP_MUSHROOM_STEM_BLOCK);
        makeMushroom(ModBlocks.SHORT_TOP_MUSHROOM_BLOCK, ModBlocks.POTTED_SHORT_TOP_MUSHROOM_BLOCK);

        blockWithItem(ModBlocks.TOP_SPECTRAL_MUSHROOM_BLOCK);
        blockWithItem(ModBlocks.SPECTRAL_MUSHROOM_STEM_BLOCK);
        makeMushroom(ModBlocks.SPECTRAL_MUSHROOM_BLOCK, ModBlocks.POTTED_SPECTRAL_MUSHROOM_BLOCK);

        makeVine(ModBlocks.SHADE_MUSHROOM_VINE_BLOCK);
        makeMushroom(ModBlocks.SHADE_MUSHROOM_BLOCK, ModBlocks.POTTED_SHADE_MUSHROOM_BLOCK);

        makeVine(ModBlocks.CAP_MUSHROOM_VINE_BLOCK);
        makeMushroom(ModBlocks.CAP_MUSHROOM_BLOCK, ModBlocks.POTTED_CAP_MUSHROOM_BLOCK);

        /*
        STUFF
         */
        this.waterRemoverBlock(ModBlocks.ATLANTAS_WATER_REMOVER_BLOCK);

        blockComplexGen();
    }

    public void baseBlocks() {
        /*
        STONE GEN
         */
        blockWithItem(ModBlocks.NIDAVELLIR_SOFT_STONE);
        blockWithItem(ModBlocks.NIDAVELLIR_SOFT_COBBLESTONE);
        blockWithItem(ModBlocks.NIDAVELLIR_SOFT_STONE_BRICKS);
        blockWithItem(ModBlocks.NIDAVELLIR_SOFT_SMOOTH_STONE);
        blockWithItem(ModBlocks.NIDAVELLIR_SOFT_COBBLESTONE_MOSSY);
        blockWithItem(ModBlocks.NIDAVELLIR_SOFT_STONE_BRICKS_MOSSY);
        blockWithItem(ModBlocks.NIDAVELLIR_SOFT_STONE_BRICKS_CRACKED);
        blockWithItem(ModBlocks.NIDAVELLIR_SOFT_STONE_BRICKS_CHISELED);

        blockWithItem(ModBlocks.NIDAVELLIR_SOFT_STONE_IRON_ORE);
        blockWithItem(ModBlocks.NIDAVELLIR_SOFT_STONE_GOLD_ORE);
        blockWithItem(ModBlocks.NIDAVELLIR_SOFT_STONE_COPPER_ORE);
        blockWithItem(ModBlocks.NIDAVELLIR_SOFT_STONE_TIN_ORE);
        blockWithItem(ModBlocks.NIDAVELLIR_SOFT_STONE_ZINC_ORE);
        blockWithItem(ModBlocks.NIDAVELLIR_SOFT_STONE_DIAMOND_ORE);
        blockWithItem(ModBlocks.NIDAVELLIR_SOFT_STONE_EMERALD_ORE);
        blockWithItem(ModBlocks.NIDAVELLIR_SOFT_STONE_COAL_ORE);
        blockWithItem(ModBlocks.NIDAVELLIR_SOFT_STONE_REDSTONE_ORE);
        blockWithItem(ModBlocks.NIDAVELLIR_SOFT_STONE_LAPIS_ORE);
        blockWithItem(ModBlocks.NIDAVELLIR_SOFT_STONE_AQUAMARINE_ORE);
        blockWithItem(ModBlocks.NIDAVELLIR_SOFT_STONE_OPAL_ORE);
        blockWithItem(ModBlocks.NIDAVELLIR_SOFT_STONE_RUBY_ORE);

        blockWithItem(ModBlocks.NIDAVELLIR_SOFT_STONE_IRON_ORE_CLUSTER);
        blockWithItem(ModBlocks.NIDAVELLIR_SOFT_STONE_GOLD_ORE_CLUSTER);
        blockWithItem(ModBlocks.NIDAVELLIR_SOFT_STONE_COPPER_ORE_CLUSTER);
        blockWithItem(ModBlocks.NIDAVELLIR_SOFT_STONE_TIN_ORE_CLUSTER);
        blockWithItem(ModBlocks.NIDAVELLIR_SOFT_STONE_ZINC_ORE_CLUSTER);
        blockWithItem(ModBlocks.NIDAVELLIR_SOFT_STONE_DIAMOND_ORE_CLUSTER);
        blockWithItem(ModBlocks.NIDAVELLIR_SOFT_STONE_EMERALD_ORE_CLUSTER);
        blockWithItem(ModBlocks.NIDAVELLIR_SOFT_STONE_COAL_ORE_CLUSTER);
        blockWithItem(ModBlocks.NIDAVELLIR_SOFT_STONE_REDSTONE_ORE_CLUSTER);
        blockWithItem(ModBlocks.NIDAVELLIR_SOFT_STONE_LAPIS_ORE_CLUSTER);
        blockWithItem(ModBlocks.NIDAVELLIR_SOFT_STONE_AQUAMARINE_ORE_CLUSTER);
        blockWithItem(ModBlocks.NIDAVELLIR_SOFT_STONE_OPAL_ORE_CLUSTER);
        blockWithItem(ModBlocks.NIDAVELLIR_SOFT_STONE_RUBY_ORE_CLUSTER);

        blockWithItem(ModBlocks.NIDAVELLIR_HARD_STONE);
        blockWithItem(ModBlocks.NIDAVELLIR_HARD_COBBLESTONE);
        blockWithItem(ModBlocks.NIDAVELLIR_HARD_STONE_BRICKS);
        blockWithItem(ModBlocks.NIDAVELLIR_HARD_SMOOTH_STONE);
        blockWithItem(ModBlocks.NIDAVELLIR_HARD_COBBLESTONE_MOSSY);
        blockWithItem(ModBlocks.NIDAVELLIR_HARD_STONE_BRICKS_MOSSY);
        blockWithItem(ModBlocks.NIDAVELLIR_HARD_STONE_BRICKS_CRACKED);
        blockWithItem(ModBlocks.NIDAVELLIR_HARD_STONE_BRICKS_CHISELED);

        blockWithItem(ModBlocks.NIDAVELLIR_HARD_STONE_IRON_ORE);
        blockWithItem(ModBlocks.NIDAVELLIR_HARD_STONE_GOLD_ORE);
        blockWithItem(ModBlocks.NIDAVELLIR_HARD_STONE_COPPER_ORE);
        blockWithItem(ModBlocks.NIDAVELLIR_HARD_STONE_TIN_ORE);
        blockWithItem(ModBlocks.NIDAVELLIR_HARD_STONE_ZINC_ORE);
        blockWithItem(ModBlocks.NIDAVELLIR_HARD_STONE_DIAMOND_ORE);
        blockWithItem(ModBlocks.NIDAVELLIR_HARD_STONE_EMERALD_ORE);
        blockWithItem(ModBlocks.NIDAVELLIR_HARD_STONE_COAL_ORE);
        blockWithItem(ModBlocks.NIDAVELLIR_HARD_STONE_REDSTONE_ORE);
        blockWithItem(ModBlocks.NIDAVELLIR_HARD_STONE_LAPIS_ORE);
        blockWithItem(ModBlocks.NIDAVELLIR_HARD_STONE_AQUAMARINE_ORE);
        blockWithItem(ModBlocks.NIDAVELLIR_HARD_STONE_OPAL_ORE);
        blockWithItem(ModBlocks.NIDAVELLIR_HARD_STONE_RUBY_ORE);

        blockWithItem(ModBlocks.NIDAVELLIR_HARD_STONE_IRON_ORE_CLUSTER);
        blockWithItem(ModBlocks.NIDAVELLIR_HARD_STONE_GOLD_ORE_CLUSTER);
        blockWithItem(ModBlocks.NIDAVELLIR_HARD_STONE_COPPER_ORE_CLUSTER);
        blockWithItem(ModBlocks.NIDAVELLIR_HARD_STONE_TIN_ORE_CLUSTER);
        blockWithItem(ModBlocks.NIDAVELLIR_HARD_STONE_ZINC_ORE_CLUSTER);
        blockWithItem(ModBlocks.NIDAVELLIR_HARD_STONE_DIAMOND_ORE_CLUSTER);
        blockWithItem(ModBlocks.NIDAVELLIR_HARD_STONE_EMERALD_ORE_CLUSTER);
        blockWithItem(ModBlocks.NIDAVELLIR_HARD_STONE_COAL_ORE_CLUSTER);
        blockWithItem(ModBlocks.NIDAVELLIR_HARD_STONE_REDSTONE_ORE_CLUSTER);
        blockWithItem(ModBlocks.NIDAVELLIR_HARD_STONE_LAPIS_ORE_CLUSTER);
        blockWithItem(ModBlocks.NIDAVELLIR_HARD_STONE_AQUAMARINE_ORE_CLUSTER);
        blockWithItem(ModBlocks.NIDAVELLIR_HARD_STONE_OPAL_ORE_CLUSTER);
        blockWithItem(ModBlocks.NIDAVELLIR_HARD_STONE_RUBY_ORE_CLUSTER);

        blockWithItem(ModBlocks.NIDAVELLIR_ENHANCED_STONE);
        blockWithItem(ModBlocks.NIDAVELLIR_ENHANCED_COBBLESTONE);
        blockWithItem(ModBlocks.NIDAVELLIR_ENHANCED_STONE_BRICKS);
        blockWithItem(ModBlocks.NIDAVELLIR_ENHANCED_SMOOTH_STONE);
        blockWithItem(ModBlocks.NIDAVELLIR_ENHANCED_COBBLESTONE_MOSSY);
        blockWithItem(ModBlocks.NIDAVELLIR_ENHANCED_STONE_BRICKS_MOSSY);
        blockWithItem(ModBlocks.NIDAVELLIR_ENHANCED_STONE_BRICKS_CRACKED);
        blockWithItem(ModBlocks.NIDAVELLIR_ENHANCED_STONE_BRICKS_CHISELED);

        blockWithItem(ModBlocks.NIDAVELLIR_ENHANCED_STONE_IRON_ORE);
        blockWithItem(ModBlocks.NIDAVELLIR_ENHANCED_STONE_GOLD_ORE);
        blockWithItem(ModBlocks.NIDAVELLIR_ENHANCED_STONE_COPPER_ORE);
        blockWithItem(ModBlocks.NIDAVELLIR_ENHANCED_STONE_TIN_ORE);
        blockWithItem(ModBlocks.NIDAVELLIR_ENHANCED_STONE_ZINC_ORE);
        blockWithItem(ModBlocks.NIDAVELLIR_ENHANCED_STONE_DIAMOND_ORE);
        blockWithItem(ModBlocks.NIDAVELLIR_ENHANCED_STONE_EMERALD_ORE);
        blockWithItem(ModBlocks.NIDAVELLIR_ENHANCED_STONE_COAL_ORE);
        blockWithItem(ModBlocks.NIDAVELLIR_ENHANCED_STONE_REDSTONE_ORE);
        blockWithItem(ModBlocks.NIDAVELLIR_ENHANCED_STONE_LAPIS_ORE);
        blockWithItem(ModBlocks.NIDAVELLIR_ENHANCED_STONE_AQUAMARINE_ORE);
        blockWithItem(ModBlocks.NIDAVELLIR_ENHANCED_STONE_OPAL_ORE);
        blockWithItem(ModBlocks.NIDAVELLIR_ENHANCED_STONE_RUBY_ORE);

        blockWithItem(ModBlocks.NIDAVELLIR_ENHANCED_STONE_IRON_ORE_CLUSTER);
        blockWithItem(ModBlocks.NIDAVELLIR_ENHANCED_STONE_GOLD_ORE_CLUSTER);
        blockWithItem(ModBlocks.NIDAVELLIR_ENHANCED_STONE_COPPER_ORE_CLUSTER);
        blockWithItem(ModBlocks.NIDAVELLIR_ENHANCED_STONE_TIN_ORE_CLUSTER);
        blockWithItem(ModBlocks.NIDAVELLIR_ENHANCED_STONE_ZINC_ORE_CLUSTER);
        blockWithItem(ModBlocks.NIDAVELLIR_ENHANCED_STONE_DIAMOND_ORE_CLUSTER);
        blockWithItem(ModBlocks.NIDAVELLIR_ENHANCED_STONE_EMERALD_ORE_CLUSTER);
        blockWithItem(ModBlocks.NIDAVELLIR_ENHANCED_STONE_COAL_ORE_CLUSTER);
        blockWithItem(ModBlocks.NIDAVELLIR_ENHANCED_STONE_REDSTONE_ORE_CLUSTER);
        blockWithItem(ModBlocks.NIDAVELLIR_ENHANCED_STONE_LAPIS_ORE_CLUSTER);
        blockWithItem(ModBlocks.NIDAVELLIR_ENHANCED_STONE_AQUAMARINE_ORE_CLUSTER);
        blockWithItem(ModBlocks.NIDAVELLIR_ENHANCED_STONE_OPAL_ORE_CLUSTER);
        blockWithItem(ModBlocks.NIDAVELLIR_ENHANCED_STONE_RUBY_ORE_CLUSTER);

        blockWithItem(ModBlocks.NIDAVELLIR_DEEPSLATE_STONE);
        blockWithItem(ModBlocks.NIDAVELLIR_DEEPSLATE_COBBLESTONE);
        blockWithItem(ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_BRICKS);
        blockWithItem(ModBlocks.NIDAVELLIR_DEEPSLATE_SMOOTH_STONE);
        blockWithItem(ModBlocks.NIDAVELLIR_DEEPSLATE_COBBLESTONE_MOSSY);
        blockWithItem(ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_BRICKS_MOSSY);
        blockWithItem(ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_BRICKS_CRACKED);
        blockWithItem(ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_BRICKS_CHISELED);

        blockWithItem(ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_IRON_ORE);
        blockWithItem(ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_GOLD_ORE);
        blockWithItem(ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_COPPER_ORE);
        blockWithItem(ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_TIN_ORE);
        blockWithItem(ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_ZINC_ORE);
        blockWithItem(ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_DIAMOND_ORE);
        blockWithItem(ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_EMERALD_ORE);
        blockWithItem(ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_COAL_ORE);
        blockWithItem(ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_REDSTONE_ORE);
        blockWithItem(ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_LAPIS_ORE);
        blockWithItem(ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_AQUAMARINE_ORE);
        blockWithItem(ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_OPAL_ORE);
        blockWithItem(ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_RUBY_ORE);

        blockWithItem(ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_IRON_ORE_CLUSTER);
        blockWithItem(ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_GOLD_ORE_CLUSTER);
        blockWithItem(ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_COPPER_ORE_CLUSTER);
        blockWithItem(ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_TIN_ORE_CLUSTER);
        blockWithItem(ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_ZINC_ORE_CLUSTER);
        blockWithItem(ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_DIAMOND_ORE_CLUSTER);
        blockWithItem(ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_EMERALD_ORE_CLUSTER);
        blockWithItem(ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_COAL_ORE_CLUSTER);
        blockWithItem(ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_REDSTONE_ORE_CLUSTER);
        blockWithItem(ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_LAPIS_ORE_CLUSTER);
        blockWithItem(ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_AQUAMARINE_ORE_CLUSTER);
        blockWithItem(ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_OPAL_ORE_CLUSTER);
        blockWithItem(ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_RUBY_ORE_CLUSTER);

        blockWithItem(ModBlocks.NIDAVELLIR_CRIMSON_STONE);
        blockWithItem(ModBlocks.NIDAVELLIR_CRIMSON_COBBLESTONE);
        blockWithItem(ModBlocks.NIDAVELLIR_CRIMSON_STONE_BRICKS);
        blockWithItem(ModBlocks.NIDAVELLIR_CRIMSON_SMOOTH_STONE);
        blockWithItem(ModBlocks.NIDAVELLIR_CRIMSON_COBBLESTONE_MOSSY);
        blockWithItem(ModBlocks.NIDAVELLIR_CRIMSON_STONE_BRICKS_MOSSY);
        blockWithItem(ModBlocks.NIDAVELLIR_CRIMSON_STONE_BRICKS_CRACKED);
        blockWithItem(ModBlocks.NIDAVELLIR_CRIMSON_STONE_BRICKS_CHISELED);

        blockWithItem(ModBlocks.NIDAVELLIR_CRIMSON_STONE_IRON_ORE);
        blockWithItem(ModBlocks.NIDAVELLIR_CRIMSON_STONE_GOLD_ORE);
        blockWithItem(ModBlocks.NIDAVELLIR_CRIMSON_STONE_COPPER_ORE);
        blockWithItem(ModBlocks.NIDAVELLIR_CRIMSON_STONE_TIN_ORE);
        blockWithItem(ModBlocks.NIDAVELLIR_CRIMSON_STONE_ZINC_ORE);
        blockWithItem(ModBlocks.NIDAVELLIR_CRIMSON_STONE_DIAMOND_ORE);
        blockWithItem(ModBlocks.NIDAVELLIR_CRIMSON_STONE_EMERALD_ORE);
        blockWithItem(ModBlocks.NIDAVELLIR_CRIMSON_STONE_COAL_ORE);
        blockWithItem(ModBlocks.NIDAVELLIR_CRIMSON_STONE_REDSTONE_ORE);
        blockWithItem(ModBlocks.NIDAVELLIR_CRIMSON_STONE_LAPIS_ORE);
        blockWithItem(ModBlocks.NIDAVELLIR_CRIMSON_STONE_AQUAMARINE_ORE);
        blockWithItem(ModBlocks.NIDAVELLIR_CRIMSON_STONE_OPAL_ORE);
        blockWithItem(ModBlocks.NIDAVELLIR_CRIMSON_STONE_RUBY_ORE);

        blockWithItem(ModBlocks.NIDAVELLIR_CRIMSON_STONE_IRON_ORE_CLUSTER);
        blockWithItem(ModBlocks.NIDAVELLIR_CRIMSON_STONE_GOLD_ORE_CLUSTER);
        blockWithItem(ModBlocks.NIDAVELLIR_CRIMSON_STONE_COPPER_ORE_CLUSTER);
        blockWithItem(ModBlocks.NIDAVELLIR_CRIMSON_STONE_TIN_ORE_CLUSTER);
        blockWithItem(ModBlocks.NIDAVELLIR_CRIMSON_STONE_ZINC_ORE_CLUSTER);
        blockWithItem(ModBlocks.NIDAVELLIR_CRIMSON_STONE_DIAMOND_ORE_CLUSTER);
        blockWithItem(ModBlocks.NIDAVELLIR_CRIMSON_STONE_EMERALD_ORE_CLUSTER);
        blockWithItem(ModBlocks.NIDAVELLIR_CRIMSON_STONE_COAL_ORE_CLUSTER);
        blockWithItem(ModBlocks.NIDAVELLIR_CRIMSON_STONE_REDSTONE_ORE_CLUSTER);
        blockWithItem(ModBlocks.NIDAVELLIR_CRIMSON_STONE_LAPIS_ORE_CLUSTER);
        blockWithItem(ModBlocks.NIDAVELLIR_CRIMSON_STONE_AQUAMARINE_ORE_CLUSTER);
        blockWithItem(ModBlocks.NIDAVELLIR_CRIMSON_STONE_OPAL_ORE_CLUSTER);
        blockWithItem(ModBlocks.NIDAVELLIR_CRIMSON_STONE_RUBY_ORE_CLUSTER);

        blockWithItem(ModBlocks.TARTARUS_STONE);
        blockWithItem(ModBlocks.TARTARUS_STONE_COBBLESTONE);
        blockWithItem(ModBlocks.TARTARUS_STONE_BRICKS);
        blockWithItem(ModBlocks.TARTARUS_STONE_SMOOTH_STONE);
        blockWithItem(ModBlocks.TARTARUS_STONE_COBBLESTONE_MOSSY);
        blockWithItem(ModBlocks.TARTARUS_STONE_BRICKS_MOSSY);
        blockWithItem(ModBlocks.TARTARUS_STONE_BRICKS_CRACKED);
        blockWithItem(ModBlocks.TARTARUS_STONE_BRICKS_CHISELED);
    }

    private void blockComplexGen() {
        /*
        STONE GEN
         */
        stairsBlock((StairBlock) ModBlocks.NIDAVELLIR_SOFT_STONE_STAIRS.get(), blockTexture(ModBlocks.NIDAVELLIR_SOFT_STONE.get()));
        stairsBlock((StairBlock) ModBlocks.NIDAVELLIR_SOFT_COBBLESTONE_STAIRS.get(), blockTexture(ModBlocks.NIDAVELLIR_SOFT_COBBLESTONE.get()));
        stairsBlock((StairBlock) ModBlocks.NIDAVELLIR_SOFT_STONE_BRICKS_STAIRS.get(), blockTexture(ModBlocks.NIDAVELLIR_SOFT_STONE_BRICKS.get()));
        slabBlock(((SlabBlock) ModBlocks.NIDAVELLIR_SOFT_STONE_SLAB.get()), blockTexture(ModBlocks.NIDAVELLIR_SOFT_STONE.get()), blockTexture(ModBlocks.NIDAVELLIR_SOFT_STONE.get()));
        slabBlock(((SlabBlock) ModBlocks.NIDAVELLIR_SOFT_COBBLESTONE_SLAB.get()), blockTexture(ModBlocks.NIDAVELLIR_SOFT_COBBLESTONE.get()), blockTexture(ModBlocks.NIDAVELLIR_SOFT_COBBLESTONE.get()));
        slabBlock(((SlabBlock) ModBlocks.NIDAVELLIR_SOFT_STONE_BRICKS_SLAB.get()), blockTexture(ModBlocks.NIDAVELLIR_SOFT_STONE_BRICKS.get()), blockTexture(ModBlocks.NIDAVELLIR_SOFT_STONE_BRICKS.get()));
        pressurePlateBlock((PressurePlateBlock) ModBlocks.NIDAVELLIR_SOFT_STONE_PRESSURE_PLATE.get(), blockTexture(ModBlocks.NIDAVELLIR_SOFT_STONE.get()));
        wallBlock((WallBlock) ModBlocks.NIDAVELLIR_SOFT_STONE_WALL.get(), blockTexture(ModBlocks.NIDAVELLIR_SOFT_STONE.get()));
        wallBlock((WallBlock) ModBlocks.NIDAVELLIR_SOFT_COBBLESTONE_WALL.get(), blockTexture(ModBlocks.NIDAVELLIR_SOFT_STONE.get()));
        wallBlock((WallBlock) ModBlocks.NIDAVELLIR_SOFT_STONE_BRICKS_WALL.get(), blockTexture(ModBlocks.NIDAVELLIR_SOFT_STONE.get()));
        buttonBlock((ButtonBlock) ModBlocks.NIDAVELLIR_SOFT_STONE_BUTTON.get(), blockTexture(ModBlocks.NIDAVELLIR_SOFT_STONE.get()));

        blockItem(ModBlocks.NIDAVELLIR_SOFT_STONE_STAIRS);
        blockItem(ModBlocks.NIDAVELLIR_SOFT_STONE_SLAB);
        blockItem(ModBlocks.NIDAVELLIR_SOFT_STONE_PRESSURE_PLATE);
//        blockItem(ModBlocks.NIDAVELLIR_SOFT_STONE_BUTTON);
//        blockItem(ModBlocks.NIDAVELLIR_SOFT_STONE_WALL);
        blockItem(ModBlocks.NIDAVELLIR_SOFT_COBBLESTONE_STAIRS);
        blockItem(ModBlocks.NIDAVELLIR_SOFT_COBBLESTONE_SLAB);
//        blockItem(ModBlocks.NIDAVELLIR_SOFT_COBBLESTONE_WALL);
        blockItem(ModBlocks.NIDAVELLIR_SOFT_STONE_BRICKS_STAIRS);
        blockItem(ModBlocks.NIDAVELLIR_SOFT_STONE_BRICKS_SLAB);
//        blockItem(ModBlocks.NIDAVELLIR_SOFT_STONE_BRICKS_WALL);

        stairsBlock((StairBlock) ModBlocks.NIDAVELLIR_HARD_STONE_STAIRS.get(), blockTexture(ModBlocks.NIDAVELLIR_HARD_STONE.get()));
        stairsBlock((StairBlock) ModBlocks.NIDAVELLIR_HARD_COBBLESTONE_STAIRS.get(), blockTexture(ModBlocks.NIDAVELLIR_HARD_COBBLESTONE.get()));
        stairsBlock((StairBlock) ModBlocks.NIDAVELLIR_HARD_STONE_BRICKS_STAIRS.get(), blockTexture(ModBlocks.NIDAVELLIR_HARD_STONE_BRICKS.get()));
        slabBlock(((SlabBlock) ModBlocks.NIDAVELLIR_HARD_STONE_SLAB.get()), blockTexture(ModBlocks.NIDAVELLIR_HARD_STONE.get()), blockTexture(ModBlocks.NIDAVELLIR_HARD_STONE.get()));
        slabBlock(((SlabBlock) ModBlocks.NIDAVELLIR_HARD_COBBLESTONE_SLAB.get()), blockTexture(ModBlocks.NIDAVELLIR_HARD_COBBLESTONE.get()), blockTexture(ModBlocks.NIDAVELLIR_HARD_COBBLESTONE.get()));
        slabBlock(((SlabBlock) ModBlocks.NIDAVELLIR_HARD_STONE_BRICKS_SLAB.get()), blockTexture(ModBlocks.NIDAVELLIR_HARD_STONE_BRICKS.get()), blockTexture(ModBlocks.NIDAVELLIR_HARD_STONE_BRICKS.get()));
        pressurePlateBlock((PressurePlateBlock) ModBlocks.NIDAVELLIR_HARD_STONE_PRESSURE_PLATE.get(), blockTexture(ModBlocks.NIDAVELLIR_HARD_STONE.get()));
        wallBlock((WallBlock) ModBlocks.NIDAVELLIR_HARD_STONE_WALL.get(), blockTexture(ModBlocks.NIDAVELLIR_HARD_STONE.get()));
        wallBlock((WallBlock) ModBlocks.NIDAVELLIR_HARD_COBBLESTONE_WALL.get(), blockTexture(ModBlocks.NIDAVELLIR_HARD_STONE.get()));
        wallBlock((WallBlock) ModBlocks.NIDAVELLIR_HARD_STONE_BRICKS_WALL.get(), blockTexture(ModBlocks.NIDAVELLIR_HARD_STONE.get()));
        buttonBlock((ButtonBlock) ModBlocks.NIDAVELLIR_HARD_STONE_BUTTON.get(), blockTexture(ModBlocks.NIDAVELLIR_HARD_STONE.get()));

        blockItem(ModBlocks.NIDAVELLIR_HARD_STONE_STAIRS);
        blockItem(ModBlocks.NIDAVELLIR_HARD_STONE_SLAB);
        blockItem(ModBlocks.NIDAVELLIR_HARD_STONE_PRESSURE_PLATE);
//        blockItem(ModBlocks.NIDAVELLIR_HARD_STONE_BUTTON);
//        blockItem(ModBlocks.NIDAVELLIR_HARD_STONE_WALL);
        blockItem(ModBlocks.NIDAVELLIR_HARD_COBBLESTONE_STAIRS);
        blockItem(ModBlocks.NIDAVELLIR_HARD_COBBLESTONE_SLAB);
//        blockItem(ModBlocks.NIDAVELLIR_HARD_COBBLESTONE_WALL);
        blockItem(ModBlocks.NIDAVELLIR_HARD_STONE_BRICKS_STAIRS);
        blockItem(ModBlocks.NIDAVELLIR_HARD_STONE_BRICKS_SLAB);
//        blockItem(ModBlocks.NIDAVELLIR_HARD_STONE_BRICKS_WALL);

        stairsBlock((StairBlock) ModBlocks.NIDAVELLIR_ENHANCED_STONE_STAIRS.get(), blockTexture(ModBlocks.NIDAVELLIR_ENHANCED_STONE.get()));
        stairsBlock((StairBlock) ModBlocks.NIDAVELLIR_ENHANCED_COBBLESTONE_STAIRS.get(), blockTexture(ModBlocks.NIDAVELLIR_ENHANCED_COBBLESTONE.get()));
        stairsBlock((StairBlock) ModBlocks.NIDAVELLIR_ENHANCED_STONE_BRICKS_STAIRS.get(), blockTexture(ModBlocks.NIDAVELLIR_ENHANCED_STONE_BRICKS.get()));
        slabBlock(((SlabBlock) ModBlocks.NIDAVELLIR_ENHANCED_STONE_SLAB.get()), blockTexture(ModBlocks.NIDAVELLIR_ENHANCED_STONE.get()), blockTexture(ModBlocks.NIDAVELLIR_ENHANCED_STONE.get()));
        slabBlock(((SlabBlock) ModBlocks.NIDAVELLIR_ENHANCED_COBBLESTONE_SLAB.get()), blockTexture(ModBlocks.NIDAVELLIR_ENHANCED_COBBLESTONE.get()), blockTexture(ModBlocks.NIDAVELLIR_ENHANCED_COBBLESTONE.get()));
        slabBlock(((SlabBlock) ModBlocks.NIDAVELLIR_ENHANCED_STONE_BRICKS_SLAB.get()), blockTexture(ModBlocks.NIDAVELLIR_ENHANCED_STONE_BRICKS.get()), blockTexture(ModBlocks.NIDAVELLIR_ENHANCED_STONE_BRICKS.get()));
        pressurePlateBlock((PressurePlateBlock) ModBlocks.NIDAVELLIR_ENHANCED_STONE_PRESSURE_PLATE.get(), blockTexture(ModBlocks.NIDAVELLIR_ENHANCED_STONE.get()));
        wallBlock((WallBlock) ModBlocks.NIDAVELLIR_ENHANCED_STONE_WALL.get(), blockTexture(ModBlocks.NIDAVELLIR_ENHANCED_STONE.get()));
        wallBlock((WallBlock) ModBlocks.NIDAVELLIR_ENHANCED_COBBLESTONE_WALL.get(), blockTexture(ModBlocks.NIDAVELLIR_ENHANCED_STONE.get()));
        wallBlock((WallBlock) ModBlocks.NIDAVELLIR_ENHANCED_STONE_BRICKS_WALL.get(), blockTexture(ModBlocks.NIDAVELLIR_ENHANCED_STONE.get()));
        buttonBlock((ButtonBlock) ModBlocks.NIDAVELLIR_ENHANCED_STONE_BUTTON.get(), blockTexture(ModBlocks.NIDAVELLIR_ENHANCED_STONE.get()));

        blockItem(ModBlocks.NIDAVELLIR_ENHANCED_STONE_STAIRS);
        blockItem(ModBlocks.NIDAVELLIR_ENHANCED_STONE_SLAB);
        blockItem(ModBlocks.NIDAVELLIR_ENHANCED_STONE_PRESSURE_PLATE);
//        blockItem(ModBlocks.NIDAVELLIR_ENHANCED_STONE_BUTTON);
//        blockItem(ModBlocks.NIDAVELLIR_ENHANCED_STONE_WALL);
        blockItem(ModBlocks.NIDAVELLIR_ENHANCED_COBBLESTONE_STAIRS);
        blockItem(ModBlocks.NIDAVELLIR_ENHANCED_COBBLESTONE_SLAB);
//        blockItem(ModBlocks.NIDAVELLIR_ENHANCED_COBBLESTONE_WALL);
        blockItem(ModBlocks.NIDAVELLIR_ENHANCED_STONE_BRICKS_STAIRS);
        blockItem(ModBlocks.NIDAVELLIR_ENHANCED_STONE_BRICKS_SLAB);
//        blockItem(ModBlocks.NIDAVELLIR_ENHANCED_STONE_BRICKS_WALL);

        stairsBlock((StairBlock) ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_STAIRS.get(), blockTexture(ModBlocks.NIDAVELLIR_DEEPSLATE_STONE.get()));
        stairsBlock((StairBlock) ModBlocks.NIDAVELLIR_DEEPSLATE_COBBLESTONE_STAIRS.get(), blockTexture(ModBlocks.NIDAVELLIR_DEEPSLATE_COBBLESTONE.get()));
        stairsBlock((StairBlock) ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_BRICKS_STAIRS.get(), blockTexture(ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_BRICKS.get()));
        slabBlock(((SlabBlock) ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_SLAB.get()), blockTexture(ModBlocks.NIDAVELLIR_DEEPSLATE_STONE.get()), blockTexture(ModBlocks.NIDAVELLIR_DEEPSLATE_STONE.get()));
        slabBlock(((SlabBlock) ModBlocks.NIDAVELLIR_DEEPSLATE_COBBLESTONE_SLAB.get()), blockTexture(ModBlocks.NIDAVELLIR_DEEPSLATE_COBBLESTONE.get()), blockTexture(ModBlocks.NIDAVELLIR_DEEPSLATE_COBBLESTONE.get()));
        slabBlock(((SlabBlock) ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_BRICKS_SLAB.get()), blockTexture(ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_BRICKS.get()), blockTexture(ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_BRICKS.get()));
        pressurePlateBlock((PressurePlateBlock) ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_PRESSURE_PLATE.get(), blockTexture(ModBlocks.NIDAVELLIR_DEEPSLATE_STONE.get()));
        wallBlock((WallBlock) ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_WALL.get(), blockTexture(ModBlocks.NIDAVELLIR_DEEPSLATE_STONE.get()));
        wallBlock((WallBlock) ModBlocks.NIDAVELLIR_DEEPSLATE_COBBLESTONE_WALL.get(), blockTexture(ModBlocks.NIDAVELLIR_DEEPSLATE_STONE.get()));
        wallBlock((WallBlock) ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_BRICKS_WALL.get(), blockTexture(ModBlocks.NIDAVELLIR_DEEPSLATE_STONE.get()));
        buttonBlock((ButtonBlock) ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_BUTTON.get(), blockTexture(ModBlocks.NIDAVELLIR_DEEPSLATE_STONE.get()));

        blockItem(ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_STAIRS);
        blockItem(ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_SLAB);
        blockItem(ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_PRESSURE_PLATE);
//        blockItem(ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_BUTTON);
//        blockItem(ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_WALL);
        blockItem(ModBlocks.NIDAVELLIR_DEEPSLATE_COBBLESTONE_STAIRS);
        blockItem(ModBlocks.NIDAVELLIR_DEEPSLATE_COBBLESTONE_SLAB);
//        blockItem(ModBlocks.NIDAVELLIR_DEEPSLATE_COBBLESTONE_WALL);
        blockItem(ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_BRICKS_STAIRS);
        blockItem(ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_BRICKS_SLAB);
//        blockItem(ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_BRICKS_WALL);

        stairsBlock((StairBlock) ModBlocks.NIDAVELLIR_CRIMSON_STONE_STAIRS.get(), blockTexture(ModBlocks.NIDAVELLIR_CRIMSON_STONE.get()));
        stairsBlock((StairBlock) ModBlocks.NIDAVELLIR_CRIMSON_COBBLESTONE_STAIRS.get(), blockTexture(ModBlocks.NIDAVELLIR_CRIMSON_COBBLESTONE.get()));
        stairsBlock((StairBlock) ModBlocks.NIDAVELLIR_CRIMSON_STONE_BRICKS_STAIRS.get(), blockTexture(ModBlocks.NIDAVELLIR_CRIMSON_STONE_BRICKS.get()));
        slabBlock(((SlabBlock) ModBlocks.NIDAVELLIR_CRIMSON_STONE_SLAB.get()), blockTexture(ModBlocks.NIDAVELLIR_CRIMSON_STONE.get()), blockTexture(ModBlocks.NIDAVELLIR_CRIMSON_STONE.get()));
        slabBlock(((SlabBlock) ModBlocks.NIDAVELLIR_CRIMSON_COBBLESTONE_SLAB.get()), blockTexture(ModBlocks.NIDAVELLIR_CRIMSON_COBBLESTONE.get()), blockTexture(ModBlocks.NIDAVELLIR_CRIMSON_COBBLESTONE.get()));
        slabBlock(((SlabBlock) ModBlocks.NIDAVELLIR_CRIMSON_STONE_BRICKS_SLAB.get()), blockTexture(ModBlocks.NIDAVELLIR_CRIMSON_STONE_BRICKS.get()), blockTexture(ModBlocks.NIDAVELLIR_CRIMSON_STONE_BRICKS.get()));
        pressurePlateBlock((PressurePlateBlock) ModBlocks.NIDAVELLIR_CRIMSON_STONE_PRESSURE_PLATE.get(), blockTexture(ModBlocks.NIDAVELLIR_CRIMSON_STONE.get()));
        wallBlock((WallBlock) ModBlocks.NIDAVELLIR_CRIMSON_STONE_WALL.get(), blockTexture(ModBlocks.NIDAVELLIR_CRIMSON_STONE.get()));
        wallBlock((WallBlock) ModBlocks.NIDAVELLIR_CRIMSON_COBBLESTONE_WALL.get(), blockTexture(ModBlocks.NIDAVELLIR_CRIMSON_STONE.get()));
        wallBlock((WallBlock) ModBlocks.NIDAVELLIR_CRIMSON_STONE_BRICKS_WALL.get(), blockTexture(ModBlocks.NIDAVELLIR_CRIMSON_STONE.get()));
        buttonBlock((ButtonBlock) ModBlocks.NIDAVELLIR_CRIMSON_STONE_BUTTON.get(), blockTexture(ModBlocks.NIDAVELLIR_CRIMSON_STONE.get()));

        blockItem(ModBlocks.NIDAVELLIR_CRIMSON_STONE_STAIRS);
        blockItem(ModBlocks.NIDAVELLIR_CRIMSON_STONE_SLAB);
        blockItem(ModBlocks.NIDAVELLIR_CRIMSON_STONE_PRESSURE_PLATE);
//        blockItem(ModBlocks.NIDAVELLIR_CRIMSON_STONE_BUTTON);
//        blockItem(ModBlocks.NIDAVELLIR_CRIMSON_STONE_WALL);
        blockItem(ModBlocks.NIDAVELLIR_CRIMSON_COBBLESTONE_STAIRS);
        blockItem(ModBlocks.NIDAVELLIR_CRIMSON_COBBLESTONE_SLAB);
//        blockItem(ModBlocks.NIDAVELLIR_CRIMSON_COBBLESTONE_WALL);
        blockItem(ModBlocks.NIDAVELLIR_CRIMSON_STONE_BRICKS_STAIRS);
        blockItem(ModBlocks.NIDAVELLIR_CRIMSON_STONE_BRICKS_SLAB);
//        blockItem(ModBlocks.NIDAVELLIR_CRIMSON_STONE_BRICKS_WALL);

        stairsBlock((StairBlock) ModBlocks.TARTARUS_STONE_STAIRS.get(), blockTexture(ModBlocks.TARTARUS_STONE.get()));
        stairsBlock((StairBlock) ModBlocks.TARTARUS_STONE_COBBLESTONE_STAIRS.get(), blockTexture(ModBlocks.TARTARUS_STONE_COBBLESTONE.get()));
        stairsBlock((StairBlock) ModBlocks.TARTARUS_STONE_BRICKS_STAIRS.get(), blockTexture(ModBlocks.TARTARUS_STONE_BRICKS.get()));
        slabBlock(((SlabBlock) ModBlocks.TARTARUS_STONE_SLAB.get()), blockTexture(ModBlocks.TARTARUS_STONE.get()), blockTexture(ModBlocks.TARTARUS_STONE.get()));
        slabBlock(((SlabBlock) ModBlocks.TARTARUS_STONE_COBBLESTONE_SLAB.get()), blockTexture(ModBlocks.TARTARUS_STONE_COBBLESTONE.get()), blockTexture(ModBlocks.TARTARUS_STONE_COBBLESTONE.get()));
        slabBlock(((SlabBlock) ModBlocks.TARTARUS_STONE_BRICKS_SLAB.get()), blockTexture(ModBlocks.TARTARUS_STONE_BRICKS.get()), blockTexture(ModBlocks.TARTARUS_STONE_BRICKS.get()));
        pressurePlateBlock((PressurePlateBlock) ModBlocks.TARTARUS_STONE_PRESSURE_PLATE.get(), blockTexture(ModBlocks.TARTARUS_STONE.get()));
        wallBlock((WallBlock) ModBlocks.TARTARUS_STONE_WALL.get(), blockTexture(ModBlocks.TARTARUS_STONE.get()));
        wallBlock((WallBlock) ModBlocks.TARTARUS_STONE_COBBLESTONE_WALL.get(), blockTexture(ModBlocks.TARTARUS_STONE.get()));
        wallBlock((WallBlock) ModBlocks.TARTARUS_STONE_BRICKS_WALL.get(), blockTexture(ModBlocks.TARTARUS_STONE.get()));
        buttonBlock((ButtonBlock) ModBlocks.TARTARUS_STONE_BUTTON.get(), blockTexture(ModBlocks.TARTARUS_STONE.get()));

        blockItem(ModBlocks.TARTARUS_STONE_STAIRS);
        blockItem(ModBlocks.TARTARUS_STONE_SLAB);
        blockItem(ModBlocks.TARTARUS_STONE_PRESSURE_PLATE);
//        blockItem(ModBlocks.TARTARUS_STONE_BUTTON);
//        blockItem(ModBlocks.TARTARUS_STONE_WALL);
        blockItem(ModBlocks.TARTARUS_STONE_COBBLESTONE_STAIRS);
        blockItem(ModBlocks.TARTARUS_STONE_COBBLESTONE_SLAB);
//        blockItem(ModBlocks.TARTARUS_STONE_COBBLESTONE_WALL);
        blockItem(ModBlocks.TARTARUS_STONE_BRICKS_STAIRS);
        blockItem(ModBlocks.TARTARUS_STONE_BRICKS_SLAB);
//        blockItem(ModBlocks.TARTARUS_STONE_BRICKS_WALL);
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

    public void makePortalBlock(RegistryObject<Block> block) {
        ModelFile portalModel = models().getBuilder(modBlockResourceLocation(block).getPath());
        ModelFile portalModelEW = models().getBuilder(modBlockResourceLocation(block, "_ew").getPath());
        ModelFile portalModelNS = models().getBuilder(modBlockResourceLocation(block, "_ns").getPath());

        getVariantBuilder(block.get())
                .forAllStates(state -> {
                    switch (state.getValue(ModPortalBlock.AXIS)) {
                        case X -> {
                            return ConfiguredModel.builder().modelFile(portalModelEW).build();
                        }

                        case Z -> {
                            return ConfiguredModel.builder().modelFile(portalModelNS).build();
                        }
                    }

                    return null;
//                    final String path = state.getValue(ModPortalBlock.AXIS == ) ? "_ew" : "_ns";
//                    return ConfiguredModel.builder().modelFile(portalModelEW).nextModel().modelFile(portalModelNS).build();
                })
//                .forAllStates(state -> ConfiguredModel.builder().modelFile(portalModelNS).build())
        ;

//        getVariantBuilder(block.get()).partialState().addModels(
//                new ConfiguredModel(portalModelEW)
//        ).addModels(
//                new ConfiguredModel(portalModelNS)
//        );

//        getVariantBuilder(block.get()).partialState().getSetStates().get(ModPortalBlock.AXIS)
//                .modelForState().modelFile(portalModelEW).nextModel().modelFile(portalModelNS).build();
    }

    public void makeCrop(ModCropBlock block, String modelName, String textureName) {
        Function<BlockState, ConfiguredModel[]> function = state -> states(state, block, modelName, textureName);

        getVariantBuilder(block).forAllStates(function);
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

    public void hangingSignBlock(Block signBlock, Block wallSignBlock, ResourceLocation texture) {
        ModelFile sign = models().sign(name(signBlock), texture);
        hangingSignBlock(signBlock, wallSignBlock, sign);
    }

    public void hangingSignBlock(Block signBlock, Block wallSignBlock, ModelFile sign) {
        simpleBlock(signBlock, sign);
        simpleBlock(wallSignBlock, sign);
    }

    public void makeFlower(RegistryObject<Block> flowerBlock, RegistryObject<Block> potBlock) {
        simpleBlock(flowerBlock.get(),
                models().cross(blockTexture(flowerBlock.get()).getPath(),
                        blockTexture(flowerBlock.get())).renderType("cutout"));
        simpleBlock(potBlock.get(),
                models().withExistingParent(potBlock.getId().getPath(),
                        mcLoc("block/flower_pot_cross")).renderType("cutout")
                        .texture("plant", blockTexture(flowerBlock.get())));
    }

    public void makeVegetation(RegistryObject<Block> vegBlock) {
        simpleBlock(vegBlock.get(),
                models().cross(blockTexture(vegBlock.get()).getPath(),
                        blockTexture(vegBlock.get())).renderType("cutout"));
    }

    public void makeMushroom(RegistryObject<Block> mushroomBlock, RegistryObject<Block> potBlock) {
        simpleBlock(mushroomBlock.get(),
                models().cross(ForgeRegistries.BLOCKS.getKey(mushroomBlock.get()).getPath(),
                        blockTexture(mushroomBlock.get())).renderType("cutout"));
        simpleBlock(potBlock.get(),
                models().withExistingParent(potBlock.getId().getPath(),
                                mcLoc("block/flower_pot_cross")).renderType("cutout")
                        .texture("plant", blockTexture(mushroomBlock.get())));
    }

    public void makeMushroom(RegistryObject<Block> mushroomBlock) {
        simpleBlock(mushroomBlock.get(),
                models().cross(blockTexture(mushroomBlock.get()).getPath(),
                        blockTexture(mushroomBlock.get())).renderType("cutout"));
    }

    public void makeVine(RegistryObject<Block> vineBlock) {
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

    public void grassBlock(RegistryObject<Block> block, ResourceLocation particle, ResourceLocation bottom, ResourceLocation top, ResourceLocation side, ResourceLocation overlay) {
        grassBlock(block.get(), models().getExistingFile(modBlockResourceLocation(block.getId().getPath())));
    }

    public void grassBlock(Block block, ModelFile model) {
        grassBlock(block, new ConfiguredModel(model));
    }

    public void grassBlock(Block block, ConfiguredModel... model) {
        getVariantBuilder(block).partialState().addModels(model);
    }
}
