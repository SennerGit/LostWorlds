package net.sen.lostworlds.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.client.model.generators.*;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.sen.lostworlds.LostWorlds;
import net.sen.lostworlds.LostWorldsConstants;
import net.sen.lostworlds.block.ModBlocks;
import net.sen.lostworlds.block.custom.CrimsonDiamondLampBlock;
import net.sen.lostworlds.block.custom.PomegranateCropBlock;
import net.sen.lostworlds.block.custom.WaterRemoverBlock;

import java.util.Properties;
import java.util.function.Function;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, LostWorldsConstants.MODID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        blockWithItem(ModBlocks.CRIMSON_DIAMOND_BLOCK);

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

        blockWithItem(ModBlocks.SOUND_BLOCK);

//        blockWithItem(ModBlocks.UNDERWORLD_PORTAL);
//        blockWithItem(ModBlocks.NIDAVELLIR_PORTAL);
//        blockWithItem(ModBlocks.ALFHEIMR_PORTAL);

        blockItem(ModBlocks.CRIMSON_STONE_STAIRS);
        blockItem(ModBlocks.CRIMSON_STONE_SLAB);
        blockItem(ModBlocks.CRIMSON_COBBLESTONE_STAIRS);
        blockItem(ModBlocks.CRIMSON_COBBLESTONE_SLAB);
        blockItem(ModBlocks.CRIMSON_STONE_BRICK_STAIRS);
        blockItem(ModBlocks.CRIMSON_STONE_BRICK_SLAB);
        blockItem(ModBlocks.CRIMSON_STONE_FENCE_GATE);

        blockItem(ModBlocks.CRIMSON_STONE_PRESSURE_PLATE);
        blockItem(ModBlocks.CRIMSON_STONE_TRAPDOOR, "_bottom");

        customLamp(ModBlocks.CRIMSON_DIAMOND_LAMP);

        makeCrop(((PomegranateCropBlock) ModBlocks.POMEGRANATE_CROP_BLOCK.get()), "pomegranate_stage", "pomegranate_stage");

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
        makeFlower(ModBlocks.IRIS_FLOWER.get());
        makeFlowerPotted(ModBlocks.POTTED_IRIS_FLOWER, ModBlocks.IRIS_FLOWER);

        this.waterRemoverBlock(ModBlocks.ATLANTAS_WATER_REMOVER_BLOCK);
    }

    private String name(Block block) {
        return key(block).getPath();
    }

    private ResourceLocation key(Block block) {
        return ForgeRegistries.BLOCKS.getKey(block);
    }

    private void blockItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockItem(blockRegistryObject.get(), new ModelFile.UncheckedModelFile(LostWorldsConstants.MODID + ":block/" + ForgeRegistries.BLOCKS.getKey(blockRegistryObject.get()).getPath()));
    }

    private void blockItem(RegistryObject<Block> blockRegistryObject, String appendix) {
        simpleBlockItem(blockRegistryObject.get(), new ModelFile.UncheckedModelFile(LostWorldsConstants.MODID + ":block/" + ForgeRegistries.BLOCKS.getKey(blockRegistryObject.get()).getPath() + appendix));
    }

    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }

    private void colouredBlockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(),
                models().singleTexture(ForgeRegistries.BLOCKS.getKey(blockRegistryObject.get()).getPath(),
                        LostWorldsConstants.mcLoc("minecraft:block/cube_all"),
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

    public void makeCrop(CropBlock block, String modelName, String textureName) {
        Function<BlockState, ConfiguredModel[]> function = state -> states(state, block, modelName, textureName);

        getVariantBuilder(block).forAllStates(function);
    }

    private ConfiguredModel[] states(BlockState state, CropBlock block, String modelName, String textureName) {
        ConfiguredModel[] models = new ConfiguredModel[1];
        models[0] = new ConfiguredModel(models().crop(modelName + state.getValue(((PomegranateCropBlock) block).getAgeProperty()),
                modBlockResourceLocation(textureName + state.getValue(((PomegranateCropBlock) block).getAgeProperty()))).renderType("cutout"));

        return models;
    }

    public void makeFlower(Block block) {
        simpleBlock(block,
                models().cross(blockTexture(block).getPath(), blockTexture(block)).renderType("cutout"));
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

    public void makeFlowerPotted(RegistryObject<Block> potBlock, RegistryObject<Block> flowerBlock) {
        simpleBlock(potBlock.get(), models().withExistingParent(potBlock.getId().getPath(), mcLoc("block/flower_pot_cross")).renderType("cutout").texture("plant", blockTexture(flowerBlock.get())));
    }

    private ResourceLocation modBlockResourceLocation(RegistryObject<Block> block) {
        return modBlockResourceLocation(block.getId().getPath());
    }

    private ResourceLocation modBlockResourceLocation(String block) {
        ResourceLocation resourceLocation;
        resourceLocation = LostWorldsConstants.modLoc("block/" + block);
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
