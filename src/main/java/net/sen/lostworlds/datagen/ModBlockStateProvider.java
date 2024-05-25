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
        baseBlocks();

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
         * TREES
         */
        //Elder Wood
        logBlock(((RotatedPillarBlock) UnderworldBlocks.ELDER_WOOD_LOG.get()));
        axisBlock((RotatedPillarBlock) UnderworldBlocks.ELDER_WOOD.get(), blockTexture(UnderworldBlocks.ELDER_WOOD_LOG.get()), blockTexture(UnderworldBlocks.ELDER_WOOD_LOG.get()));
        axisBlock((RotatedPillarBlock) UnderworldBlocks.STRIPPED_ELDER_WOOD_LOG.get(), modBlockResourceLocation("stripped_elder_wood_log"), modBlockResourceLocation("stripped_elder_wood_log_top"));
        axisBlock((RotatedPillarBlock) UnderworldBlocks.STRIPPED_ELDER_WOOD.get(), modBlockResourceLocation("stripped_elder_wood_log"), modBlockResourceLocation("stripped_elder_wood_log"));

        blockItem(UnderworldBlocks.ELDER_WOOD_LOG);
        blockItem(UnderworldBlocks.ELDER_WOOD);
        blockItem(UnderworldBlocks.STRIPPED_ELDER_WOOD_LOG);
        blockItem(UnderworldBlocks.STRIPPED_ELDER_WOOD);
        blockWithItem(UnderworldBlocks.ELDER_WOOD_PLANKS);

        stairsBlock((StairBlock) UnderworldBlocks.ELDER_WOOD_PLANKS_STAIRS.get(), blockTexture(UnderworldBlocks.ELDER_WOOD_PLANKS.get()));
        slabBlock(((SlabBlock) UnderworldBlocks.ELDER_WOOD_PLANKS_SLAB.get()), blockTexture(UnderworldBlocks.ELDER_WOOD_PLANKS.get()), blockTexture(UnderworldBlocks.ELDER_WOOD_PLANKS.get()));
        pressurePlateBlock((PressurePlateBlock) UnderworldBlocks.ELDER_WOOD_PLANKS_PRESSURE_PLATE.get(), blockTexture(UnderworldBlocks.ELDER_WOOD_PLANKS.get()));
        fenceBlock((FenceBlock) UnderworldBlocks.ELDER_WOOD_PLANKS_FENCE.get(), blockTexture(UnderworldBlocks.ELDER_WOOD_PLANKS.get()));
        fenceGateBlock((FenceGateBlock) UnderworldBlocks.ELDER_WOOD_PLANKS_FENCE_GATE.get(), blockTexture(UnderworldBlocks.ELDER_WOOD_PLANKS.get()));
        doorBlockWithRenderType((DoorBlock) UnderworldBlocks.ELDER_WOOD_PLANKS_DOOR.get(), modLoc("block/" + UnderworldBlocks.ELDER_WOOD_PLANKS_DOOR.getId().getPath() + "_bottom"), modLoc("block/" + UnderworldBlocks.ELDER_WOOD_PLANKS_DOOR.getId().getPath() + "_top"), "cutout");
        trapdoorBlockWithRenderType((TrapDoorBlock) UnderworldBlocks.ELDER_WOOD_PLANKS_TRAPDOOR.get(), modLoc("block/" + UnderworldBlocks.ELDER_WOOD_PLANKS_TRAPDOOR.getId().getPath()), true, "cutout");
        buttonBlock((ButtonBlock) UnderworldBlocks.ELDER_WOOD_PLANKS_BUTTON.get(), blockTexture(UnderworldBlocks.ELDER_WOOD_PLANKS.get()));

        blockItem(UnderworldBlocks.ELDER_WOOD_PLANKS_STAIRS);
        blockItem(UnderworldBlocks.ELDER_WOOD_PLANKS_SLAB);
        blockItem(UnderworldBlocks.ELDER_WOOD_PLANKS_FENCE_GATE);
        blockItem(UnderworldBlocks.ELDER_WOOD_PLANKS_PRESSURE_PLATE);
        blockItem(UnderworldBlocks.ELDER_WOOD_PLANKS_TRAPDOOR, "_bottom");
        leavesBlock(UnderworldBlocks.ELDER_WOOD_LEAVES);
        saplingBlock(UnderworldBlocks.ELDER_WOOD_SAPLING);
        signBlock(((StandingSignBlock) UnderworldBlocks.ELDER_WOOD_PLANKS_SIGN.get()),((WallSignBlock) UnderworldBlocks.ELDER_WOOD_PLANKS_WALL_SIGN.get()),
                blockTexture(UnderworldBlocks.ELDER_WOOD_PLANKS.get()));
        hangingSignBlock( UnderworldBlocks.ELDER_WOOD_PLANKS_HANGING_SIGN.get(), UnderworldBlocks.ELDER_WOOD_PLANKS_WALL_HANGING_SIGN.get(),
                blockTexture(UnderworldBlocks.ELDER_WOOD_PLANKS.get()));

        //Olive
        logBlock(((RotatedPillarBlock) UnderworldBlocks.OLIVE_LOG.get()));
        axisBlock((RotatedPillarBlock) UnderworldBlocks.OLIVE_WOOD.get(), blockTexture(UnderworldBlocks.OLIVE_LOG.get()), blockTexture(UnderworldBlocks.OLIVE_LOG.get()));
        axisBlock((RotatedPillarBlock) UnderworldBlocks.STRIPPED_OLIVE_LOG.get(), modBlockResourceLocation("stripped_olive_log"), modBlockResourceLocation("stripped_olive_log_top"));
        axisBlock((RotatedPillarBlock) UnderworldBlocks.STRIPPED_OLIVE_WOOD.get(), modBlockResourceLocation("stripped_olive_log"), modBlockResourceLocation("stripped_olive_log"));

        blockItem(UnderworldBlocks.OLIVE_LOG);
        blockItem(UnderworldBlocks.OLIVE_WOOD);
        blockItem(UnderworldBlocks.STRIPPED_OLIVE_LOG);
        blockItem(UnderworldBlocks.STRIPPED_OLIVE_WOOD);
        blockWithItem(UnderworldBlocks.OLIVE_PLANKS);

        stairsBlock((StairBlock) UnderworldBlocks.OLIVE_PLANKS_STAIRS.get(), blockTexture(UnderworldBlocks.OLIVE_PLANKS.get()));
        slabBlock(((SlabBlock) UnderworldBlocks.OLIVE_PLANKS_SLAB.get()), blockTexture(UnderworldBlocks.OLIVE_PLANKS.get()), blockTexture(UnderworldBlocks.OLIVE_PLANKS.get()));
        pressurePlateBlock((PressurePlateBlock) UnderworldBlocks.OLIVE_PLANKS_PRESSURE_PLATE.get(), blockTexture(UnderworldBlocks.OLIVE_PLANKS.get()));
        fenceBlock((FenceBlock) UnderworldBlocks.OLIVE_PLANKS_FENCE.get(), blockTexture(UnderworldBlocks.OLIVE_PLANKS.get()));
        fenceGateBlock((FenceGateBlock) UnderworldBlocks.OLIVE_PLANKS_FENCE_GATE.get(), blockTexture(UnderworldBlocks.OLIVE_PLANKS.get()));
        doorBlockWithRenderType((DoorBlock) UnderworldBlocks.OLIVE_PLANKS_DOOR.get(), modLoc("block/" + UnderworldBlocks.OLIVE_PLANKS_DOOR.getId().getPath() + "_bottom"), modLoc("block/" + UnderworldBlocks.OLIVE_PLANKS_DOOR.getId().getPath() + "_top"), "cutout");
        trapdoorBlockWithRenderType((TrapDoorBlock) UnderworldBlocks.OLIVE_PLANKS_TRAPDOOR.get(), modLoc("block/" + UnderworldBlocks.OLIVE_PLANKS_TRAPDOOR.getId().getPath()), true, "cutout");
        buttonBlock((ButtonBlock) UnderworldBlocks.OLIVE_PLANKS_BUTTON.get(), blockTexture(UnderworldBlocks.OLIVE_PLANKS.get()));

        blockItem(UnderworldBlocks.OLIVE_PLANKS_STAIRS);
        blockItem(UnderworldBlocks.OLIVE_PLANKS_SLAB);
        blockItem(UnderworldBlocks.OLIVE_PLANKS_FENCE_GATE);
        blockItem(UnderworldBlocks.OLIVE_PLANKS_PRESSURE_PLATE);
        blockItem(UnderworldBlocks.OLIVE_PLANKS_TRAPDOOR, "_bottom");
        leavesBlock(UnderworldBlocks.OLIVE_LEAVES);
        saplingBlock(UnderworldBlocks.OLIVE_SAPLING);
        signBlock(((StandingSignBlock) UnderworldBlocks.OLIVE_PLANKS_SIGN.get()),((WallSignBlock) UnderworldBlocks.OLIVE_PLANKS_WALL_SIGN.get()),
                blockTexture(UnderworldBlocks.OLIVE_PLANKS.get()));
        hangingSignBlock( UnderworldBlocks.OLIVE_PLANKS_HANGING_SIGN.get(), UnderworldBlocks.OLIVE_PLANKS_WALL_HANGING_SIGN.get(),
                blockTexture(UnderworldBlocks.OLIVE_PLANKS.get()));

        //Myrrh
        logBlock(((RotatedPillarBlock) UnderworldBlocks.MYRRH_LOG.get()));
        axisBlock((RotatedPillarBlock) UnderworldBlocks.MYRRH_WOOD.get(), blockTexture(UnderworldBlocks.MYRRH_LOG.get()), blockTexture(UnderworldBlocks.MYRRH_LOG.get()));
        axisBlock((RotatedPillarBlock) UnderworldBlocks.STRIPPED_MYRRH_LOG.get(), modBlockResourceLocation("stripped_myrrh_log"), modBlockResourceLocation("stripped_myrrh_log_top"));
        axisBlock((RotatedPillarBlock) UnderworldBlocks.STRIPPED_MYRRH_WOOD.get(), modBlockResourceLocation("stripped_myrrh_log"), modBlockResourceLocation("stripped_myrrh_log"));

        blockItem(UnderworldBlocks.MYRRH_LOG);
        blockItem(UnderworldBlocks.MYRRH_WOOD);
        blockItem(UnderworldBlocks.STRIPPED_MYRRH_LOG);
        blockItem(UnderworldBlocks.STRIPPED_MYRRH_WOOD);
        blockWithItem(UnderworldBlocks.MYRRH_PLANKS);

        stairsBlock((StairBlock) UnderworldBlocks.MYRRH_PLANKS_STAIRS.get(), blockTexture(UnderworldBlocks.MYRRH_PLANKS.get()));
        slabBlock(((SlabBlock) UnderworldBlocks.MYRRH_PLANKS_SLAB.get()), blockTexture(UnderworldBlocks.MYRRH_PLANKS.get()), blockTexture(UnderworldBlocks.MYRRH_PLANKS.get()));
        pressurePlateBlock((PressurePlateBlock) UnderworldBlocks.MYRRH_PLANKS_PRESSURE_PLATE.get(), blockTexture(UnderworldBlocks.MYRRH_PLANKS.get()));
        fenceBlock((FenceBlock) UnderworldBlocks.MYRRH_PLANKS_FENCE.get(), blockTexture(UnderworldBlocks.MYRRH_PLANKS.get()));
        fenceGateBlock((FenceGateBlock) UnderworldBlocks.MYRRH_PLANKS_FENCE_GATE.get(), blockTexture(UnderworldBlocks.MYRRH_PLANKS.get()));
        doorBlockWithRenderType((DoorBlock) UnderworldBlocks.MYRRH_PLANKS_DOOR.get(), modLoc("block/" + UnderworldBlocks.MYRRH_PLANKS_DOOR.getId().getPath() + "_bottom"), modLoc("block/" + UnderworldBlocks.MYRRH_PLANKS_DOOR.getId().getPath() + "_top"), "cutout");
        trapdoorBlockWithRenderType((TrapDoorBlock) UnderworldBlocks.MYRRH_PLANKS_TRAPDOOR.get(), modLoc("block/" + UnderworldBlocks.MYRRH_PLANKS_TRAPDOOR.getId().getPath()), true, "cutout");
        buttonBlock((ButtonBlock) UnderworldBlocks.MYRRH_PLANKS_BUTTON.get(), blockTexture(UnderworldBlocks.MYRRH_PLANKS.get()));

        blockItem(UnderworldBlocks.MYRRH_PLANKS_STAIRS);
        blockItem(UnderworldBlocks.MYRRH_PLANKS_SLAB);
        blockItem(UnderworldBlocks.MYRRH_PLANKS_FENCE_GATE);
        blockItem(UnderworldBlocks.MYRRH_PLANKS_PRESSURE_PLATE);
        blockItem(UnderworldBlocks.MYRRH_PLANKS_TRAPDOOR, "_bottom");
        leavesBlock(UnderworldBlocks.MYRRH_LEAVES);
        saplingBlock(UnderworldBlocks.MYRRH_SAPLING);
        signBlock(((StandingSignBlock) UnderworldBlocks.MYRRH_PLANKS_SIGN.get()),((WallSignBlock) UnderworldBlocks.MYRRH_PLANKS_WALL_SIGN.get()),
                blockTexture(UnderworldBlocks.MYRRH_PLANKS.get()));
        hangingSignBlock( UnderworldBlocks.MYRRH_PLANKS_HANGING_SIGN.get(), UnderworldBlocks.MYRRH_PLANKS_WALL_HANGING_SIGN.get(),
                blockTexture(UnderworldBlocks.MYRRH_PLANKS.get()));

        //Laurel
        logBlock(((RotatedPillarBlock) UnderworldBlocks.LAUREL_LOG.get()));
        axisBlock((RotatedPillarBlock) UnderworldBlocks.LAUREL_WOOD.get(), blockTexture(UnderworldBlocks.LAUREL_LOG.get()), blockTexture(UnderworldBlocks.LAUREL_LOG.get()));
        axisBlock((RotatedPillarBlock) UnderworldBlocks.STRIPPED_LAUREL_LOG.get(), modBlockResourceLocation("stripped_laurel_log"), modBlockResourceLocation("stripped_laurel_log_top"));
        axisBlock((RotatedPillarBlock) UnderworldBlocks.STRIPPED_LAUREL_WOOD.get(), modBlockResourceLocation("stripped_laurel_log"), modBlockResourceLocation("stripped_laurel_log"));

        blockItem(UnderworldBlocks.LAUREL_LOG);
        blockItem(UnderworldBlocks.LAUREL_WOOD);
        blockItem(UnderworldBlocks.STRIPPED_LAUREL_LOG);
        blockItem(UnderworldBlocks.STRIPPED_LAUREL_WOOD);
        blockWithItem(UnderworldBlocks.LAUREL_PLANKS);

        stairsBlock((StairBlock) UnderworldBlocks.LAUREL_PLANKS_STAIRS.get(), blockTexture(UnderworldBlocks.LAUREL_PLANKS.get()));
        slabBlock(((SlabBlock) UnderworldBlocks.LAUREL_PLANKS_SLAB.get()), blockTexture(UnderworldBlocks.LAUREL_PLANKS.get()), blockTexture(UnderworldBlocks.LAUREL_PLANKS.get()));
        pressurePlateBlock((PressurePlateBlock) UnderworldBlocks.LAUREL_PLANKS_PRESSURE_PLATE.get(), blockTexture(UnderworldBlocks.LAUREL_PLANKS.get()));
        fenceBlock((FenceBlock) UnderworldBlocks.LAUREL_PLANKS_FENCE.get(), blockTexture(UnderworldBlocks.LAUREL_PLANKS.get()));
        fenceGateBlock((FenceGateBlock) UnderworldBlocks.LAUREL_PLANKS_FENCE_GATE.get(), blockTexture(UnderworldBlocks.LAUREL_PLANKS.get()));
        doorBlockWithRenderType((DoorBlock) UnderworldBlocks.LAUREL_PLANKS_DOOR.get(), modLoc("block/" + UnderworldBlocks.LAUREL_PLANKS_DOOR.getId().getPath() + "_bottom"), modLoc("block/" + UnderworldBlocks.LAUREL_PLANKS_DOOR.getId().getPath() + "_top"), "cutout");
        trapdoorBlockWithRenderType((TrapDoorBlock) UnderworldBlocks.LAUREL_PLANKS_TRAPDOOR.get(), modLoc("block/" + UnderworldBlocks.LAUREL_PLANKS_TRAPDOOR.getId().getPath()), true, "cutout");
        buttonBlock((ButtonBlock) UnderworldBlocks.LAUREL_PLANKS_BUTTON.get(), blockTexture(UnderworldBlocks.LAUREL_PLANKS.get()));

        blockItem(UnderworldBlocks.LAUREL_PLANKS_STAIRS);
        blockItem(UnderworldBlocks.LAUREL_PLANKS_SLAB);
        blockItem(UnderworldBlocks.LAUREL_PLANKS_FENCE_GATE);
        blockItem(UnderworldBlocks.LAUREL_PLANKS_PRESSURE_PLATE);
        blockItem(UnderworldBlocks.LAUREL_PLANKS_TRAPDOOR, "_bottom");
        leavesBlock(UnderworldBlocks.LAUREL_LEAVES);
        saplingBlock(UnderworldBlocks.LAUREL_SAPLING);
        signBlock(((StandingSignBlock) UnderworldBlocks.LAUREL_PLANKS_SIGN.get()),((WallSignBlock) UnderworldBlocks.LAUREL_PLANKS_WALL_SIGN.get()),
                blockTexture(UnderworldBlocks.LAUREL_PLANKS.get()));
        hangingSignBlock( UnderworldBlocks.LAUREL_PLANKS_HANGING_SIGN.get(), UnderworldBlocks.LAUREL_PLANKS_WALL_HANGING_SIGN.get(),
                blockTexture(UnderworldBlocks.LAUREL_PLANKS.get()));

        //Cypress
        logBlock(((RotatedPillarBlock) UnderworldBlocks.CYPRESS_LOG.get()));
        axisBlock((RotatedPillarBlock) UnderworldBlocks.CYPRESS_WOOD.get(), blockTexture(UnderworldBlocks.CYPRESS_LOG.get()), blockTexture(UnderworldBlocks.CYPRESS_LOG.get()));
        axisBlock((RotatedPillarBlock) UnderworldBlocks.STRIPPED_CYPRESS_LOG.get(), modBlockResourceLocation("stripped_cypress_log"), modBlockResourceLocation("stripped_cypress_log_top"));
        axisBlock((RotatedPillarBlock) UnderworldBlocks.STRIPPED_CYPRESS_WOOD.get(), modBlockResourceLocation("stripped_cypress_log"), modBlockResourceLocation("stripped_cypress_log"));

        blockItem(UnderworldBlocks.CYPRESS_LOG);
        blockItem(UnderworldBlocks.CYPRESS_WOOD);
        blockItem(UnderworldBlocks.STRIPPED_CYPRESS_LOG);
        blockItem(UnderworldBlocks.STRIPPED_CYPRESS_WOOD);
        blockWithItem(UnderworldBlocks.CYPRESS_PLANKS);

        stairsBlock((StairBlock) UnderworldBlocks.CYPRESS_PLANKS_STAIRS.get(), blockTexture(UnderworldBlocks.CYPRESS_PLANKS.get()));
        slabBlock(((SlabBlock) UnderworldBlocks.CYPRESS_PLANKS_SLAB.get()), blockTexture(UnderworldBlocks.CYPRESS_PLANKS.get()), blockTexture(UnderworldBlocks.CYPRESS_PLANKS.get()));
        pressurePlateBlock((PressurePlateBlock) UnderworldBlocks.CYPRESS_PLANKS_PRESSURE_PLATE.get(), blockTexture(UnderworldBlocks.CYPRESS_PLANKS.get()));
        fenceBlock((FenceBlock) UnderworldBlocks.CYPRESS_PLANKS_FENCE.get(), blockTexture(UnderworldBlocks.CYPRESS_PLANKS.get()));
        fenceGateBlock((FenceGateBlock) UnderworldBlocks.CYPRESS_PLANKS_FENCE_GATE.get(), blockTexture(UnderworldBlocks.CYPRESS_PLANKS.get()));
        doorBlockWithRenderType((DoorBlock) UnderworldBlocks.CYPRESS_PLANKS_DOOR.get(), modLoc("block/" + UnderworldBlocks.CYPRESS_PLANKS_DOOR.getId().getPath() + "_bottom"), modLoc("block/" + UnderworldBlocks.CYPRESS_PLANKS_DOOR.getId().getPath() + "_top"), "cutout");
        trapdoorBlockWithRenderType((TrapDoorBlock) UnderworldBlocks.CYPRESS_PLANKS_TRAPDOOR.get(), modLoc("block/" + UnderworldBlocks.CYPRESS_PLANKS_TRAPDOOR.getId().getPath()), true, "cutout");
        buttonBlock((ButtonBlock) UnderworldBlocks.CYPRESS_PLANKS_BUTTON.get(), blockTexture(UnderworldBlocks.CYPRESS_PLANKS.get()));

        blockItem(UnderworldBlocks.CYPRESS_PLANKS_STAIRS);
        blockItem(UnderworldBlocks.CYPRESS_PLANKS_SLAB);
        blockItem(UnderworldBlocks.CYPRESS_PLANKS_FENCE_GATE);
        blockItem(UnderworldBlocks.CYPRESS_PLANKS_PRESSURE_PLATE);
        blockItem(UnderworldBlocks.CYPRESS_PLANKS_TRAPDOOR, "_bottom");
        leavesBlock(UnderworldBlocks.CYPRESS_LEAVES);
        saplingBlock(UnderworldBlocks.CYPRESS_SAPLING);
        signBlock(((StandingSignBlock) UnderworldBlocks.CYPRESS_PLANKS_SIGN.get()),((WallSignBlock) UnderworldBlocks.CYPRESS_PLANKS_WALL_SIGN.get()),
                blockTexture(UnderworldBlocks.CYPRESS_PLANKS.get()));
        hangingSignBlock( UnderworldBlocks.CYPRESS_PLANKS_HANGING_SIGN.get(), UnderworldBlocks.CYPRESS_PLANKS_WALL_HANGING_SIGN.get(),
                blockTexture(UnderworldBlocks.CYPRESS_PLANKS.get()));

        //Black Birch
        logBlock(((RotatedPillarBlock) AlfheimrBlocks.BLACK_BIRCH_LOG.get()));
        axisBlock((RotatedPillarBlock) AlfheimrBlocks.BLACK_BIRCH_WOOD.get(), blockTexture(AlfheimrBlocks.BLACK_BIRCH_LOG.get()), blockTexture(AlfheimrBlocks.BLACK_BIRCH_LOG.get()));
        axisBlock((RotatedPillarBlock) AlfheimrBlocks.STRIPPED_BLACK_BIRCH_LOG.get(), modBlockResourceLocation("stripped_black_birch_log"), modBlockResourceLocation("stripped_black_birch_log_top"));
        axisBlock((RotatedPillarBlock) AlfheimrBlocks.STRIPPED_BLACK_BIRCH_WOOD.get(), modBlockResourceLocation("stripped_black_birch_log"), modBlockResourceLocation("stripped_black_birch_log"));

        blockItem(AlfheimrBlocks.BLACK_BIRCH_LOG);
        blockItem(AlfheimrBlocks.BLACK_BIRCH_WOOD);
        blockItem(AlfheimrBlocks.STRIPPED_BLACK_BIRCH_LOG);
        blockItem(AlfheimrBlocks.STRIPPED_BLACK_BIRCH_WOOD);
        blockWithItem(AlfheimrBlocks.BLACK_BIRCH_PLANKS);

        stairsBlock((StairBlock) AlfheimrBlocks.BLACK_BIRCH_PLANKS_STAIRS.get(), blockTexture(AlfheimrBlocks.BLACK_BIRCH_PLANKS.get()));
        slabBlock(((SlabBlock) AlfheimrBlocks.BLACK_BIRCH_PLANKS_SLAB.get()), blockTexture(AlfheimrBlocks.BLACK_BIRCH_PLANKS.get()), blockTexture(AlfheimrBlocks.BLACK_BIRCH_PLANKS.get()));
        pressurePlateBlock((PressurePlateBlock) AlfheimrBlocks.BLACK_BIRCH_PLANKS_PRESSURE_PLATE.get(), blockTexture(AlfheimrBlocks.BLACK_BIRCH_PLANKS.get()));
        fenceBlock((FenceBlock) AlfheimrBlocks.BLACK_BIRCH_PLANKS_FENCE.get(), blockTexture(AlfheimrBlocks.BLACK_BIRCH_PLANKS.get()));
        fenceGateBlock((FenceGateBlock) AlfheimrBlocks.BLACK_BIRCH_PLANKS_FENCE_GATE.get(), blockTexture(AlfheimrBlocks.BLACK_BIRCH_PLANKS.get()));
        doorBlockWithRenderType((DoorBlock) AlfheimrBlocks.BLACK_BIRCH_PLANKS_DOOR.get(), modLoc("block/" + AlfheimrBlocks.BLACK_BIRCH_PLANKS_DOOR.getId().getPath() + "_bottom"), modLoc("block/" + AlfheimrBlocks.BLACK_BIRCH_PLANKS_DOOR.getId().getPath() + "_top"), "cutout");
        trapdoorBlockWithRenderType((TrapDoorBlock) AlfheimrBlocks.BLACK_BIRCH_PLANKS_TRAPDOOR.get(), modLoc("block/" + AlfheimrBlocks.BLACK_BIRCH_PLANKS_TRAPDOOR.getId().getPath()), true, "cutout");
        buttonBlock((ButtonBlock) AlfheimrBlocks.BLACK_BIRCH_PLANKS_BUTTON.get(), blockTexture(AlfheimrBlocks.BLACK_BIRCH_PLANKS.get()));

        blockItem(AlfheimrBlocks.BLACK_BIRCH_PLANKS_STAIRS);
        blockItem(AlfheimrBlocks.BLACK_BIRCH_PLANKS_SLAB);
        blockItem(AlfheimrBlocks.BLACK_BIRCH_PLANKS_FENCE_GATE);
        blockItem(AlfheimrBlocks.BLACK_BIRCH_PLANKS_PRESSURE_PLATE);
        blockItem(AlfheimrBlocks.BLACK_BIRCH_PLANKS_TRAPDOOR, "_bottom");
        leavesBlock(AlfheimrBlocks.BLACK_BIRCH_LEAVES);
        saplingBlock(AlfheimrBlocks.BLACK_BIRCH_SAPLING);
        signBlock(((StandingSignBlock) AlfheimrBlocks.BLACK_BIRCH_PLANKS_SIGN.get()),((WallSignBlock) AlfheimrBlocks.BLACK_BIRCH_PLANKS_WALL_SIGN.get()),
                blockTexture(AlfheimrBlocks.BLACK_BIRCH_PLANKS.get()));
        hangingSignBlock( AlfheimrBlocks.BLACK_BIRCH_PLANKS_HANGING_SIGN.get(), AlfheimrBlocks.BLACK_BIRCH_PLANKS_WALL_HANGING_SIGN.get(),
                blockTexture(AlfheimrBlocks.BLACK_BIRCH_PLANKS.get()));

        //White Oak
        logBlock(((RotatedPillarBlock) AlfheimrBlocks.WHITE_OAK_LOG.get()));
        axisBlock((RotatedPillarBlock) AlfheimrBlocks.WHITE_OAK_WOOD.get(), blockTexture(AlfheimrBlocks.WHITE_OAK_LOG.get()), blockTexture(AlfheimrBlocks.WHITE_OAK_LOG.get()));
        axisBlock((RotatedPillarBlock) AlfheimrBlocks.STRIPPED_WHITE_OAK_LOG.get(), modBlockResourceLocation("stripped_white_oak_log"), modBlockResourceLocation("stripped_white_oak_log_top"));
        axisBlock((RotatedPillarBlock) AlfheimrBlocks.STRIPPED_WHITE_OAK_WOOD.get(), modBlockResourceLocation("stripped_white_oak_log"), modBlockResourceLocation("stripped_white_oak_log"));

        blockItem(AlfheimrBlocks.WHITE_OAK_LOG);
        blockItem(AlfheimrBlocks.WHITE_OAK_WOOD);
        blockItem(AlfheimrBlocks.STRIPPED_WHITE_OAK_LOG);
        blockItem(AlfheimrBlocks.STRIPPED_WHITE_OAK_WOOD);
        blockWithItem(AlfheimrBlocks.WHITE_OAK_PLANKS);

        stairsBlock((StairBlock) AlfheimrBlocks.WHITE_OAK_PLANKS_STAIRS.get(), blockTexture(AlfheimrBlocks.WHITE_OAK_PLANKS.get()));
        slabBlock(((SlabBlock) AlfheimrBlocks.WHITE_OAK_PLANKS_SLAB.get()), blockTexture(AlfheimrBlocks.WHITE_OAK_PLANKS.get()), blockTexture(AlfheimrBlocks.WHITE_OAK_PLANKS.get()));
        pressurePlateBlock((PressurePlateBlock) AlfheimrBlocks.WHITE_OAK_PLANKS_PRESSURE_PLATE.get(), blockTexture(AlfheimrBlocks.WHITE_OAK_PLANKS.get()));
        fenceBlock((FenceBlock) AlfheimrBlocks.WHITE_OAK_PLANKS_FENCE.get(), blockTexture(AlfheimrBlocks.WHITE_OAK_PLANKS.get()));
        fenceGateBlock((FenceGateBlock) AlfheimrBlocks.WHITE_OAK_PLANKS_FENCE_GATE.get(), blockTexture(AlfheimrBlocks.WHITE_OAK_PLANKS.get()));
        doorBlockWithRenderType((DoorBlock) AlfheimrBlocks.WHITE_OAK_PLANKS_DOOR.get(), modLoc("block/" + AlfheimrBlocks.WHITE_OAK_PLANKS_DOOR.getId().getPath() + "_bottom"), modLoc("block/" + AlfheimrBlocks.WHITE_OAK_PLANKS_DOOR.getId().getPath() + "_top"), "cutout");
        trapdoorBlockWithRenderType((TrapDoorBlock) AlfheimrBlocks.WHITE_OAK_PLANKS_TRAPDOOR.get(), modLoc("block/" + AlfheimrBlocks.WHITE_OAK_PLANKS_TRAPDOOR.getId().getPath()), true, "cutout");
        buttonBlock((ButtonBlock) AlfheimrBlocks.WHITE_OAK_PLANKS_BUTTON.get(), blockTexture(AlfheimrBlocks.WHITE_OAK_PLANKS.get()));

        blockItem(AlfheimrBlocks.WHITE_OAK_PLANKS_STAIRS);
        blockItem(AlfheimrBlocks.WHITE_OAK_PLANKS_SLAB);
        blockItem(AlfheimrBlocks.WHITE_OAK_PLANKS_FENCE_GATE);
        blockItem(AlfheimrBlocks.WHITE_OAK_PLANKS_PRESSURE_PLATE);
        blockItem(AlfheimrBlocks.WHITE_OAK_PLANKS_TRAPDOOR, "_bottom");
        leavesBlock(AlfheimrBlocks.WHITE_OAK_LEAVES);
        saplingBlock(AlfheimrBlocks.WHITE_OAK_SAPLING);
        signBlock(((StandingSignBlock) AlfheimrBlocks.WHITE_OAK_PLANKS_SIGN.get()),((WallSignBlock) AlfheimrBlocks.WHITE_OAK_PLANKS_WALL_SIGN.get()),
                blockTexture(AlfheimrBlocks.WHITE_OAK_PLANKS.get()));
        hangingSignBlock( AlfheimrBlocks.WHITE_OAK_PLANKS_HANGING_SIGN.get(), AlfheimrBlocks.WHITE_OAK_PLANKS_WALL_HANGING_SIGN.get(),
                blockTexture(AlfheimrBlocks.WHITE_OAK_PLANKS.get()));

        //Bur Oak
        logBlock(((RotatedPillarBlock) AlfheimrBlocks.BUR_OAK_LOG.get()));
        axisBlock((RotatedPillarBlock) AlfheimrBlocks.BUR_OAK_WOOD.get(), blockTexture(AlfheimrBlocks.BUR_OAK_LOG.get()), blockTexture(AlfheimrBlocks.BUR_OAK_LOG.get()));
        axisBlock((RotatedPillarBlock) AlfheimrBlocks.STRIPPED_BUR_OAK_LOG.get(), modBlockResourceLocation("stripped_bur_oak_log"), modBlockResourceLocation("stripped_bur_oak_log_top"));
        axisBlock((RotatedPillarBlock) AlfheimrBlocks.STRIPPED_BUR_OAK_WOOD.get(), modBlockResourceLocation("stripped_bur_oak_log"), modBlockResourceLocation("stripped_bur_oak_log"));

        blockItem(AlfheimrBlocks.BUR_OAK_LOG);
        blockItem(AlfheimrBlocks.BUR_OAK_WOOD);
        blockItem(AlfheimrBlocks.STRIPPED_BUR_OAK_LOG);
        blockItem(AlfheimrBlocks.STRIPPED_BUR_OAK_WOOD);
        blockWithItem(AlfheimrBlocks.BUR_OAK_PLANKS);

        stairsBlock((StairBlock) AlfheimrBlocks.BUR_OAK_PLANKS_STAIRS.get(), blockTexture(AlfheimrBlocks.BUR_OAK_PLANKS.get()));
        slabBlock(((SlabBlock) AlfheimrBlocks.BUR_OAK_PLANKS_SLAB.get()), blockTexture(AlfheimrBlocks.BUR_OAK_PLANKS.get()), blockTexture(AlfheimrBlocks.BUR_OAK_PLANKS.get()));
        pressurePlateBlock((PressurePlateBlock) AlfheimrBlocks.BUR_OAK_PLANKS_PRESSURE_PLATE.get(), blockTexture(AlfheimrBlocks.BUR_OAK_PLANKS.get()));
        fenceBlock((FenceBlock) AlfheimrBlocks.BUR_OAK_PLANKS_FENCE.get(), blockTexture(AlfheimrBlocks.BUR_OAK_PLANKS.get()));
        fenceGateBlock((FenceGateBlock) AlfheimrBlocks.BUR_OAK_PLANKS_FENCE_GATE.get(), blockTexture(AlfheimrBlocks.BUR_OAK_PLANKS.get()));
        doorBlockWithRenderType((DoorBlock) AlfheimrBlocks.BUR_OAK_PLANKS_DOOR.get(), modLoc("block/" + AlfheimrBlocks.BUR_OAK_PLANKS_DOOR.getId().getPath() + "_bottom"), modLoc("block/" + AlfheimrBlocks.BUR_OAK_PLANKS_DOOR.getId().getPath() + "_top"), "cutout");
        trapdoorBlockWithRenderType((TrapDoorBlock) AlfheimrBlocks.BUR_OAK_PLANKS_TRAPDOOR.get(), modLoc("block/" + AlfheimrBlocks.BUR_OAK_PLANKS_TRAPDOOR.getId().getPath()), true, "cutout");
        buttonBlock((ButtonBlock) AlfheimrBlocks.BUR_OAK_PLANKS_BUTTON.get(), blockTexture(AlfheimrBlocks.BUR_OAK_PLANKS.get()));

        blockItem(AlfheimrBlocks.BUR_OAK_PLANKS_STAIRS);
        blockItem(AlfheimrBlocks.BUR_OAK_PLANKS_SLAB);
        blockItem(AlfheimrBlocks.BUR_OAK_PLANKS_FENCE_GATE);
        blockItem(AlfheimrBlocks.BUR_OAK_PLANKS_PRESSURE_PLATE);
        blockItem(AlfheimrBlocks.BUR_OAK_PLANKS_TRAPDOOR, "_bottom");
        leavesBlock(AlfheimrBlocks.BUR_OAK_LEAVES);
        saplingBlock(AlfheimrBlocks.BUR_OAK_SAPLING);
        signBlock(((StandingSignBlock) AlfheimrBlocks.BUR_OAK_PLANKS_SIGN.get()),((WallSignBlock) AlfheimrBlocks.BUR_OAK_PLANKS_WALL_SIGN.get()),
                blockTexture(AlfheimrBlocks.BUR_OAK_PLANKS.get()));
        hangingSignBlock( AlfheimrBlocks.BUR_OAK_PLANKS_HANGING_SIGN.get(), AlfheimrBlocks.BUR_OAK_PLANKS_WALL_HANGING_SIGN.get(),
                blockTexture(AlfheimrBlocks.BUR_OAK_PLANKS.get()));

        //Blood Cherry
        logBlock(((RotatedPillarBlock) AlfheimrBlocks.BLOOD_CHERRY_LOG.get()));
        axisBlock((RotatedPillarBlock) AlfheimrBlocks.BLOOD_CHERRY_WOOD.get(), blockTexture(AlfheimrBlocks.BLOOD_CHERRY_LOG.get()), blockTexture(AlfheimrBlocks.BLOOD_CHERRY_LOG.get()));
        axisBlock((RotatedPillarBlock) AlfheimrBlocks.STRIPPED_BLOOD_CHERRY_LOG.get(), modBlockResourceLocation("stripped_blood_cherry_log"), modBlockResourceLocation("stripped_blood_cherry_log_top"));
        axisBlock((RotatedPillarBlock) AlfheimrBlocks.STRIPPED_BLOOD_CHERRY_WOOD.get(), modBlockResourceLocation("stripped_blood_cherry_log"), modBlockResourceLocation("stripped_blood_cherry_log"));

        blockItem(AlfheimrBlocks.BLOOD_CHERRY_LOG);
        blockItem(AlfheimrBlocks.BLOOD_CHERRY_WOOD);
        blockItem(AlfheimrBlocks.STRIPPED_BLOOD_CHERRY_LOG);
        blockItem(AlfheimrBlocks.STRIPPED_BLOOD_CHERRY_WOOD);
        blockWithItem(AlfheimrBlocks.BLOOD_CHERRY_PLANKS);

        stairsBlock((StairBlock) AlfheimrBlocks.BLOOD_CHERRY_PLANKS_STAIRS.get(), blockTexture(AlfheimrBlocks.BLOOD_CHERRY_PLANKS.get()));
        slabBlock(((SlabBlock) AlfheimrBlocks.BLOOD_CHERRY_PLANKS_SLAB.get()), blockTexture(AlfheimrBlocks.BLOOD_CHERRY_PLANKS.get()), blockTexture(AlfheimrBlocks.BLOOD_CHERRY_PLANKS.get()));
        pressurePlateBlock((PressurePlateBlock) AlfheimrBlocks.BLOOD_CHERRY_PLANKS_PRESSURE_PLATE.get(), blockTexture(AlfheimrBlocks.BLOOD_CHERRY_PLANKS.get()));
        fenceBlock((FenceBlock) AlfheimrBlocks.BLOOD_CHERRY_PLANKS_FENCE.get(), blockTexture(AlfheimrBlocks.BLOOD_CHERRY_PLANKS.get()));
        fenceGateBlock((FenceGateBlock) AlfheimrBlocks.BLOOD_CHERRY_PLANKS_FENCE_GATE.get(), blockTexture(AlfheimrBlocks.BLOOD_CHERRY_PLANKS.get()));
        doorBlockWithRenderType((DoorBlock) AlfheimrBlocks.BLOOD_CHERRY_PLANKS_DOOR.get(), modLoc("block/" + AlfheimrBlocks.BLOOD_CHERRY_PLANKS_DOOR.getId().getPath() + "_bottom"), modLoc("block/" + AlfheimrBlocks.BLOOD_CHERRY_PLANKS_DOOR.getId().getPath() + "_top"), "cutout");
        trapdoorBlockWithRenderType((TrapDoorBlock) AlfheimrBlocks.BLOOD_CHERRY_PLANKS_TRAPDOOR.get(), modLoc("block/" + AlfheimrBlocks.BLOOD_CHERRY_PLANKS_TRAPDOOR.getId().getPath()), true, "cutout");
        buttonBlock((ButtonBlock) AlfheimrBlocks.BLOOD_CHERRY_PLANKS_BUTTON.get(), blockTexture(AlfheimrBlocks.BLOOD_CHERRY_PLANKS.get()));

        blockItem(AlfheimrBlocks.BLOOD_CHERRY_PLANKS_STAIRS);
        blockItem(AlfheimrBlocks.BLOOD_CHERRY_PLANKS_SLAB);
        blockItem(AlfheimrBlocks.BLOOD_CHERRY_PLANKS_FENCE_GATE);
        blockItem(AlfheimrBlocks.BLOOD_CHERRY_PLANKS_PRESSURE_PLATE);
        blockItem(AlfheimrBlocks.BLOOD_CHERRY_PLANKS_TRAPDOOR, "_bottom");
        leavesBlock(AlfheimrBlocks.BLOOD_CHERRY_LEAVES);
        saplingBlock(AlfheimrBlocks.BLOOD_CHERRY_SAPLING);
        signBlock(((StandingSignBlock) AlfheimrBlocks.BLOOD_CHERRY_PLANKS_SIGN.get()),((WallSignBlock) AlfheimrBlocks.BLOOD_CHERRY_PLANKS_WALL_SIGN.get()),
                blockTexture(AlfheimrBlocks.BLOOD_CHERRY_PLANKS.get()));
        hangingSignBlock( AlfheimrBlocks.BLOOD_CHERRY_PLANKS_HANGING_SIGN.get(), AlfheimrBlocks.BLOOD_CHERRY_PLANKS_WALL_HANGING_SIGN.get(),
                blockTexture(AlfheimrBlocks.BLOOD_CHERRY_PLANKS.get()));

        //Sacred Tree
        logBlock(((RotatedPillarBlock) AlfheimrBlocks.SACRED_TREE_LOG.get()));
        axisBlock((RotatedPillarBlock) AlfheimrBlocks.SACRED_TREE_WOOD.get(), blockTexture(AlfheimrBlocks.SACRED_TREE_LOG.get()), blockTexture(AlfheimrBlocks.SACRED_TREE_LOG.get()));
        axisBlock((RotatedPillarBlock) AlfheimrBlocks.STRIPPED_SACRED_TREE_LOG.get(), modBlockResourceLocation("stripped_sacred_tree_log"), modBlockResourceLocation("stripped_sacred_tree_log_top"));
        axisBlock((RotatedPillarBlock) AlfheimrBlocks.STRIPPED_SACRED_TREE_WOOD.get(), modBlockResourceLocation("stripped_sacred_tree_log"), modBlockResourceLocation("stripped_sacred_tree_log"));

        blockItem(AlfheimrBlocks.SACRED_TREE_LOG);
        blockItem(AlfheimrBlocks.SACRED_TREE_WOOD);
        blockItem(AlfheimrBlocks.STRIPPED_SACRED_TREE_LOG);
        blockItem(AlfheimrBlocks.STRIPPED_SACRED_TREE_WOOD);
        blockWithItem(AlfheimrBlocks.SACRED_TREE_PLANKS);

        stairsBlock((StairBlock) AlfheimrBlocks.SACRED_TREE_PLANKS_STAIRS.get(), blockTexture(AlfheimrBlocks.SACRED_TREE_PLANKS.get()));
        slabBlock(((SlabBlock) AlfheimrBlocks.SACRED_TREE_PLANKS_SLAB.get()), blockTexture(AlfheimrBlocks.SACRED_TREE_PLANKS.get()), blockTexture(AlfheimrBlocks.SACRED_TREE_PLANKS.get()));
        pressurePlateBlock((PressurePlateBlock) AlfheimrBlocks.SACRED_TREE_PLANKS_PRESSURE_PLATE.get(), blockTexture(AlfheimrBlocks.SACRED_TREE_PLANKS.get()));
        fenceBlock((FenceBlock) AlfheimrBlocks.SACRED_TREE_PLANKS_FENCE.get(), blockTexture(AlfheimrBlocks.SACRED_TREE_PLANKS.get()));
        fenceGateBlock((FenceGateBlock) AlfheimrBlocks.SACRED_TREE_PLANKS_FENCE_GATE.get(), blockTexture(AlfheimrBlocks.SACRED_TREE_PLANKS.get()));
        doorBlockWithRenderType((DoorBlock) AlfheimrBlocks.SACRED_TREE_PLANKS_DOOR.get(), modLoc("block/" + AlfheimrBlocks.SACRED_TREE_PLANKS_DOOR.getId().getPath() + "_bottom"), modLoc("block/" + AlfheimrBlocks.SACRED_TREE_PLANKS_DOOR.getId().getPath() + "_top"), "cutout");
        trapdoorBlockWithRenderType((TrapDoorBlock) AlfheimrBlocks.SACRED_TREE_PLANKS_TRAPDOOR.get(), modLoc("block/" + AlfheimrBlocks.SACRED_TREE_PLANKS_TRAPDOOR.getId().getPath()), true, "cutout");
        buttonBlock((ButtonBlock) AlfheimrBlocks.SACRED_TREE_PLANKS_BUTTON.get(), blockTexture(AlfheimrBlocks.SACRED_TREE_PLANKS.get()));

        blockItem(AlfheimrBlocks.SACRED_TREE_PLANKS_STAIRS);
        blockItem(AlfheimrBlocks.SACRED_TREE_PLANKS_SLAB);
        blockItem(AlfheimrBlocks.SACRED_TREE_PLANKS_FENCE_GATE);
        blockItem(AlfheimrBlocks.SACRED_TREE_PLANKS_PRESSURE_PLATE);
        blockItem(AlfheimrBlocks.SACRED_TREE_PLANKS_TRAPDOOR, "_bottom");
        leavesBlock(AlfheimrBlocks.SACRED_TREE_LEAVES);
        saplingBlock(AlfheimrBlocks.SACRED_TREE_SAPLING);
        signBlock(((StandingSignBlock) AlfheimrBlocks.SACRED_TREE_PLANKS_SIGN.get()),((WallSignBlock) AlfheimrBlocks.SACRED_TREE_PLANKS_WALL_SIGN.get()),
                blockTexture(AlfheimrBlocks.SACRED_TREE_PLANKS.get()));
        hangingSignBlock( AlfheimrBlocks.SACRED_TREE_PLANKS_HANGING_SIGN.get(), AlfheimrBlocks.SACRED_TREE_PLANKS_WALL_HANGING_SIGN.get(),
                blockTexture(AlfheimrBlocks.SACRED_TREE_PLANKS.get()));

        //Willow
        logBlock(((RotatedPillarBlock) AlfheimrBlocks.WILLOW_LOG.get()));
        axisBlock((RotatedPillarBlock) AlfheimrBlocks.WILLOW_WOOD.get(), blockTexture(AlfheimrBlocks.WILLOW_LOG.get()), blockTexture(AlfheimrBlocks.WILLOW_LOG.get()));
        axisBlock((RotatedPillarBlock) AlfheimrBlocks.STRIPPED_WILLOW_LOG.get(), modBlockResourceLocation("stripped_willow_log"), modBlockResourceLocation("stripped_willow_log_top"));
        axisBlock((RotatedPillarBlock) AlfheimrBlocks.STRIPPED_WILLOW_WOOD.get(), modBlockResourceLocation("stripped_willow_log"), modBlockResourceLocation("stripped_willow_log"));

        blockItem(AlfheimrBlocks.WILLOW_LOG);
        blockItem(AlfheimrBlocks.WILLOW_WOOD);
        blockItem(AlfheimrBlocks.STRIPPED_WILLOW_LOG);
        blockItem(AlfheimrBlocks.STRIPPED_WILLOW_WOOD);
        blockWithItem(AlfheimrBlocks.WILLOW_PLANKS);

        stairsBlock((StairBlock) AlfheimrBlocks.WILLOW_PLANKS_STAIRS.get(), blockTexture(AlfheimrBlocks.WILLOW_PLANKS.get()));
        slabBlock(((SlabBlock) AlfheimrBlocks.WILLOW_PLANKS_SLAB.get()), blockTexture(AlfheimrBlocks.WILLOW_PLANKS.get()), blockTexture(AlfheimrBlocks.WILLOW_PLANKS.get()));
        pressurePlateBlock((PressurePlateBlock) AlfheimrBlocks.WILLOW_PLANKS_PRESSURE_PLATE.get(), blockTexture(AlfheimrBlocks.WILLOW_PLANKS.get()));
        fenceBlock((FenceBlock) AlfheimrBlocks.WILLOW_PLANKS_FENCE.get(), blockTexture(AlfheimrBlocks.WILLOW_PLANKS.get()));
        fenceGateBlock((FenceGateBlock) AlfheimrBlocks.WILLOW_PLANKS_FENCE_GATE.get(), blockTexture(AlfheimrBlocks.WILLOW_PLANKS.get()));
        doorBlockWithRenderType((DoorBlock) AlfheimrBlocks.WILLOW_PLANKS_DOOR.get(), modLoc("block/" + AlfheimrBlocks.WILLOW_PLANKS_DOOR.getId().getPath() + "_bottom"), modLoc("block/" + AlfheimrBlocks.WILLOW_PLANKS_DOOR.getId().getPath() + "_top"), "cutout");
        trapdoorBlockWithRenderType((TrapDoorBlock) AlfheimrBlocks.WILLOW_PLANKS_TRAPDOOR.get(), modLoc("block/" + AlfheimrBlocks.WILLOW_PLANKS_TRAPDOOR.getId().getPath()), true, "cutout");
        buttonBlock((ButtonBlock) AlfheimrBlocks.WILLOW_PLANKS_BUTTON.get(), blockTexture(AlfheimrBlocks.WILLOW_PLANKS.get()));

        blockItem(AlfheimrBlocks.WILLOW_PLANKS_STAIRS);
        blockItem(AlfheimrBlocks.WILLOW_PLANKS_SLAB);
        blockItem(AlfheimrBlocks.WILLOW_PLANKS_FENCE_GATE);
        blockItem(AlfheimrBlocks.WILLOW_PLANKS_PRESSURE_PLATE);
        blockItem(AlfheimrBlocks.WILLOW_PLANKS_TRAPDOOR, "_bottom");
        leavesBlock(AlfheimrBlocks.WILLOW_LEAVES);
        saplingBlock(AlfheimrBlocks.WILLOW_SAPLING);
        signBlock(((StandingSignBlock) AlfheimrBlocks.WILLOW_PLANKS_SIGN.get()),((WallSignBlock) AlfheimrBlocks.WILLOW_PLANKS_WALL_SIGN.get()),
                blockTexture(AlfheimrBlocks.WILLOW_PLANKS.get()));
        hangingSignBlock( AlfheimrBlocks.WILLOW_PLANKS_HANGING_SIGN.get(), AlfheimrBlocks.WILLOW_PLANKS_WALL_HANGING_SIGN.get(),
                blockTexture(AlfheimrBlocks.WILLOW_PLANKS.get()));

        //Deadwood
        logBlock(((RotatedPillarBlock) AlfheimrBlocks.DEADWOOD_LOG.get()));
        axisBlock((RotatedPillarBlock) AlfheimrBlocks.DEADWOOD_WOOD.get(), blockTexture(AlfheimrBlocks.DEADWOOD_LOG.get()), blockTexture(AlfheimrBlocks.DEADWOOD_LOG.get()));
        axisBlock((RotatedPillarBlock) AlfheimrBlocks.STRIPPED_DEADWOOD_LOG.get(), modBlockResourceLocation("stripped_deadwood_log"), modBlockResourceLocation("stripped_deadwood_log_top"));
        axisBlock((RotatedPillarBlock) AlfheimrBlocks.STRIPPED_DEADWOOD_WOOD.get(), modBlockResourceLocation("stripped_deadwood_log"), modBlockResourceLocation("stripped_deadwood_log"));

        blockItem(AlfheimrBlocks.DEADWOOD_LOG);
        blockItem(AlfheimrBlocks.DEADWOOD_WOOD);
        blockItem(AlfheimrBlocks.STRIPPED_DEADWOOD_LOG);
        blockItem(AlfheimrBlocks.STRIPPED_DEADWOOD_WOOD);
        blockWithItem(AlfheimrBlocks.DEADWOOD_PLANKS);

        stairsBlock((StairBlock) AlfheimrBlocks.DEADWOOD_PLANKS_STAIRS.get(), blockTexture(AlfheimrBlocks.DEADWOOD_PLANKS.get()));
        slabBlock(((SlabBlock) AlfheimrBlocks.DEADWOOD_PLANKS_SLAB.get()), blockTexture(AlfheimrBlocks.DEADWOOD_PLANKS.get()), blockTexture(AlfheimrBlocks.DEADWOOD_PLANKS.get()));
        pressurePlateBlock((PressurePlateBlock) AlfheimrBlocks.DEADWOOD_PLANKS_PRESSURE_PLATE.get(), blockTexture(AlfheimrBlocks.DEADWOOD_PLANKS.get()));
        fenceBlock((FenceBlock) AlfheimrBlocks.DEADWOOD_PLANKS_FENCE.get(), blockTexture(AlfheimrBlocks.DEADWOOD_PLANKS.get()));
        fenceGateBlock((FenceGateBlock) AlfheimrBlocks.DEADWOOD_PLANKS_FENCE_GATE.get(), blockTexture(AlfheimrBlocks.DEADWOOD_PLANKS.get()));
        doorBlockWithRenderType((DoorBlock) AlfheimrBlocks.DEADWOOD_PLANKS_DOOR.get(), modLoc("block/" + AlfheimrBlocks.DEADWOOD_PLANKS_DOOR.getId().getPath() + "_bottom"), modLoc("block/" + AlfheimrBlocks.DEADWOOD_PLANKS_DOOR.getId().getPath() + "_top"), "cutout");
        trapdoorBlockWithRenderType((TrapDoorBlock) AlfheimrBlocks.DEADWOOD_PLANKS_TRAPDOOR.get(), modLoc("block/" + AlfheimrBlocks.DEADWOOD_PLANKS_TRAPDOOR.getId().getPath()), true, "cutout");
        buttonBlock((ButtonBlock) AlfheimrBlocks.DEADWOOD_PLANKS_BUTTON.get(), blockTexture(AlfheimrBlocks.DEADWOOD_PLANKS.get()));

        blockItem(AlfheimrBlocks.DEADWOOD_PLANKS_STAIRS);
        blockItem(AlfheimrBlocks.DEADWOOD_PLANKS_SLAB);
        blockItem(AlfheimrBlocks.DEADWOOD_PLANKS_FENCE_GATE);
        blockItem(AlfheimrBlocks.DEADWOOD_PLANKS_PRESSURE_PLATE);
        blockItem(AlfheimrBlocks.DEADWOOD_PLANKS_TRAPDOOR, "_bottom");
        leavesBlock(AlfheimrBlocks.DEADWOOD_LEAVES);
        saplingBlock(AlfheimrBlocks.DEADWOOD_SAPLING);
        signBlock(((StandingSignBlock) AlfheimrBlocks.DEADWOOD_PLANKS_SIGN.get()),((WallSignBlock) AlfheimrBlocks.DEADWOOD_PLANKS_WALL_SIGN.get()),
                blockTexture(AlfheimrBlocks.DEADWOOD_PLANKS.get()));
        hangingSignBlock( AlfheimrBlocks.DEADWOOD_PLANKS_HANGING_SIGN.get(), AlfheimrBlocks.DEADWOOD_PLANKS_WALL_HANGING_SIGN.get(),
                blockTexture(AlfheimrBlocks.DEADWOOD_PLANKS.get()));

        //Ebony Kingswood
        logBlock(((RotatedPillarBlock) AlfheimrBlocks.EBONY_KINGSWOOD_LOG.get()));
        axisBlock((RotatedPillarBlock) AlfheimrBlocks.EBONY_KINGSWOOD_WOOD.get(), blockTexture(AlfheimrBlocks.EBONY_KINGSWOOD_LOG.get()), blockTexture(AlfheimrBlocks.EBONY_KINGSWOOD_LOG.get()));
        axisBlock((RotatedPillarBlock) AlfheimrBlocks.STRIPPED_EBONY_KINGSWOOD_LOG.get(), modBlockResourceLocation("stripped_ebony_kingswood_log"), modBlockResourceLocation("stripped_ebony_kingswood_log_top"));
        axisBlock((RotatedPillarBlock) AlfheimrBlocks.STRIPPED_EBONY_KINGSWOOD_WOOD.get(), modBlockResourceLocation("stripped_ebony_kingswood_log"), modBlockResourceLocation("stripped_ebony_kingswood_log"));

        blockItem(AlfheimrBlocks.EBONY_KINGSWOOD_LOG);
        blockItem(AlfheimrBlocks.EBONY_KINGSWOOD_WOOD);
        blockItem(AlfheimrBlocks.STRIPPED_EBONY_KINGSWOOD_LOG);
        blockItem(AlfheimrBlocks.STRIPPED_EBONY_KINGSWOOD_WOOD);
        blockWithItem(AlfheimrBlocks.EBONY_KINGSWOOD_PLANKS);

        stairsBlock((StairBlock) AlfheimrBlocks.EBONY_KINGSWOOD_PLANKS_STAIRS.get(), blockTexture(AlfheimrBlocks.EBONY_KINGSWOOD_PLANKS.get()));
        slabBlock(((SlabBlock) AlfheimrBlocks.EBONY_KINGSWOOD_PLANKS_SLAB.get()), blockTexture(AlfheimrBlocks.EBONY_KINGSWOOD_PLANKS.get()), blockTexture(AlfheimrBlocks.EBONY_KINGSWOOD_PLANKS.get()));
        pressurePlateBlock((PressurePlateBlock) AlfheimrBlocks.EBONY_KINGSWOOD_PLANKS_PRESSURE_PLATE.get(), blockTexture(AlfheimrBlocks.EBONY_KINGSWOOD_PLANKS.get()));
        fenceBlock((FenceBlock) AlfheimrBlocks.EBONY_KINGSWOOD_PLANKS_FENCE.get(), blockTexture(AlfheimrBlocks.EBONY_KINGSWOOD_PLANKS.get()));
        fenceGateBlock((FenceGateBlock) AlfheimrBlocks.EBONY_KINGSWOOD_PLANKS_FENCE_GATE.get(), blockTexture(AlfheimrBlocks.EBONY_KINGSWOOD_PLANKS.get()));
        doorBlockWithRenderType((DoorBlock) AlfheimrBlocks.EBONY_KINGSWOOD_PLANKS_DOOR.get(), modLoc("block/" + AlfheimrBlocks.EBONY_KINGSWOOD_PLANKS_DOOR.getId().getPath() + "_bottom"), modLoc("block/" + AlfheimrBlocks.EBONY_KINGSWOOD_PLANKS_DOOR.getId().getPath() + "_top"), "cutout");
        trapdoorBlockWithRenderType((TrapDoorBlock) AlfheimrBlocks.EBONY_KINGSWOOD_PLANKS_TRAPDOOR.get(), modLoc("block/" + AlfheimrBlocks.EBONY_KINGSWOOD_PLANKS_TRAPDOOR.getId().getPath()), true, "cutout");
        buttonBlock((ButtonBlock) AlfheimrBlocks.EBONY_KINGSWOOD_PLANKS_BUTTON.get(), blockTexture(AlfheimrBlocks.EBONY_KINGSWOOD_PLANKS.get()));

        blockItem(AlfheimrBlocks.EBONY_KINGSWOOD_PLANKS_STAIRS);
        blockItem(AlfheimrBlocks.EBONY_KINGSWOOD_PLANKS_SLAB);
        blockItem(AlfheimrBlocks.EBONY_KINGSWOOD_PLANKS_FENCE_GATE);
        blockItem(AlfheimrBlocks.EBONY_KINGSWOOD_PLANKS_PRESSURE_PLATE);
        blockItem(AlfheimrBlocks.EBONY_KINGSWOOD_PLANKS_TRAPDOOR, "_bottom");
        leavesBlock(AlfheimrBlocks.EBONY_KINGSWOOD_LEAVES);
        saplingBlock(AlfheimrBlocks.EBONY_KINGSWOOD_SAPLING);
        signBlock(((StandingSignBlock) AlfheimrBlocks.EBONY_KINGSWOOD_PLANKS_SIGN.get()),((WallSignBlock) AlfheimrBlocks.EBONY_KINGSWOOD_PLANKS_WALL_SIGN.get()),
                blockTexture(AlfheimrBlocks.EBONY_KINGSWOOD_PLANKS.get()));
        hangingSignBlock( AlfheimrBlocks.EBONY_KINGSWOOD_PLANKS_HANGING_SIGN.get(), AlfheimrBlocks.EBONY_KINGSWOOD_PLANKS_WALL_HANGING_SIGN.get(),
                blockTexture(AlfheimrBlocks.EBONY_KINGSWOOD_PLANKS.get()));

        //Ivory Kingswood
        logBlock(((RotatedPillarBlock) AlfheimrBlocks.IVORY_KINGSWOOD_LOG.get()));
        axisBlock((RotatedPillarBlock) AlfheimrBlocks.IVORY_KINGSWOOD_WOOD.get(), blockTexture(AlfheimrBlocks.IVORY_KINGSWOOD_LOG.get()), blockTexture(AlfheimrBlocks.IVORY_KINGSWOOD_LOG.get()));
        axisBlock((RotatedPillarBlock) AlfheimrBlocks.STRIPPED_IVORY_KINGSWOOD_LOG.get(), modBlockResourceLocation("stripped_ivory_kingswood_log"), modBlockResourceLocation("stripped_ivory_kingswood_log_top"));
        axisBlock((RotatedPillarBlock) AlfheimrBlocks.STRIPPED_IVORY_KINGSWOOD_WOOD.get(), modBlockResourceLocation("stripped_ivory_kingswood_log"), modBlockResourceLocation("stripped_ivory_kingswood_log"));

        blockItem(AlfheimrBlocks.IVORY_KINGSWOOD_LOG);
        blockItem(AlfheimrBlocks.IVORY_KINGSWOOD_WOOD);
        blockItem(AlfheimrBlocks.STRIPPED_IVORY_KINGSWOOD_LOG);
        blockItem(AlfheimrBlocks.STRIPPED_IVORY_KINGSWOOD_WOOD);
        blockWithItem(AlfheimrBlocks.IVORY_KINGSWOOD_PLANKS);

        stairsBlock((StairBlock) AlfheimrBlocks.IVORY_KINGSWOOD_PLANKS_STAIRS.get(), blockTexture(AlfheimrBlocks.IVORY_KINGSWOOD_PLANKS.get()));
        slabBlock(((SlabBlock) AlfheimrBlocks.IVORY_KINGSWOOD_PLANKS_SLAB.get()), blockTexture(AlfheimrBlocks.IVORY_KINGSWOOD_PLANKS.get()), blockTexture(AlfheimrBlocks.IVORY_KINGSWOOD_PLANKS.get()));
        pressurePlateBlock((PressurePlateBlock) AlfheimrBlocks.IVORY_KINGSWOOD_PLANKS_PRESSURE_PLATE.get(), blockTexture(AlfheimrBlocks.IVORY_KINGSWOOD_PLANKS.get()));
        fenceBlock((FenceBlock) AlfheimrBlocks.IVORY_KINGSWOOD_PLANKS_FENCE.get(), blockTexture(AlfheimrBlocks.IVORY_KINGSWOOD_PLANKS.get()));
        fenceGateBlock((FenceGateBlock) AlfheimrBlocks.IVORY_KINGSWOOD_PLANKS_FENCE_GATE.get(), blockTexture(AlfheimrBlocks.IVORY_KINGSWOOD_PLANKS.get()));
        doorBlockWithRenderType((DoorBlock) AlfheimrBlocks.IVORY_KINGSWOOD_PLANKS_DOOR.get(), modLoc("block/" + AlfheimrBlocks.IVORY_KINGSWOOD_PLANKS_DOOR.getId().getPath() + "_bottom"), modLoc("block/" + AlfheimrBlocks.IVORY_KINGSWOOD_PLANKS_DOOR.getId().getPath() + "_top"), "cutout");
        trapdoorBlockWithRenderType((TrapDoorBlock) AlfheimrBlocks.IVORY_KINGSWOOD_PLANKS_TRAPDOOR.get(), modLoc("block/" + AlfheimrBlocks.IVORY_KINGSWOOD_PLANKS_TRAPDOOR.getId().getPath()), true, "cutout");
        buttonBlock((ButtonBlock) AlfheimrBlocks.IVORY_KINGSWOOD_PLANKS_BUTTON.get(), blockTexture(AlfheimrBlocks.IVORY_KINGSWOOD_PLANKS.get()));

        blockItem(AlfheimrBlocks.IVORY_KINGSWOOD_PLANKS_STAIRS);
        blockItem(AlfheimrBlocks.IVORY_KINGSWOOD_PLANKS_SLAB);
        blockItem(AlfheimrBlocks.IVORY_KINGSWOOD_PLANKS_FENCE_GATE);
        blockItem(AlfheimrBlocks.IVORY_KINGSWOOD_PLANKS_PRESSURE_PLATE);
        blockItem(AlfheimrBlocks.IVORY_KINGSWOOD_PLANKS_TRAPDOOR, "_bottom");
        leavesBlock(AlfheimrBlocks.IVORY_KINGSWOOD_LEAVES);
        saplingBlock(AlfheimrBlocks.IVORY_KINGSWOOD_SAPLING);
        signBlock(((StandingSignBlock) AlfheimrBlocks.IVORY_KINGSWOOD_PLANKS_SIGN.get()),((WallSignBlock) AlfheimrBlocks.IVORY_KINGSWOOD_PLANKS_WALL_SIGN.get()),
                blockTexture(AlfheimrBlocks.IVORY_KINGSWOOD_PLANKS.get()));
        hangingSignBlock( AlfheimrBlocks.IVORY_KINGSWOOD_PLANKS_HANGING_SIGN.get(), AlfheimrBlocks.IVORY_KINGSWOOD_PLANKS_WALL_HANGING_SIGN.get(),
                blockTexture(AlfheimrBlocks.IVORY_KINGSWOOD_PLANKS.get()));

        //Weaver
        logBlock(((RotatedPillarBlock) AlfheimrBlocks.WEAVER_LOG.get()));
        axisBlock((RotatedPillarBlock) AlfheimrBlocks.WEAVER_WOOD.get(), blockTexture(AlfheimrBlocks.WEAVER_LOG.get()), blockTexture(AlfheimrBlocks.WEAVER_LOG.get()));
        axisBlock((RotatedPillarBlock) AlfheimrBlocks.STRIPPED_WEAVER_LOG.get(), modBlockResourceLocation("stripped_weaver_log"), modBlockResourceLocation("stripped_weaver_log_top"));
        axisBlock((RotatedPillarBlock) AlfheimrBlocks.STRIPPED_WEAVER_WOOD.get(), modBlockResourceLocation("stripped_weaver_log"), modBlockResourceLocation("stripped_weaver_log"));

        blockItem(AlfheimrBlocks.WEAVER_LOG);
        blockItem(AlfheimrBlocks.WEAVER_WOOD);
        blockItem(AlfheimrBlocks.STRIPPED_WEAVER_LOG);
        blockItem(AlfheimrBlocks.STRIPPED_WEAVER_WOOD);
        blockWithItem(AlfheimrBlocks.WEAVER_PLANKS);

        stairsBlock((StairBlock) AlfheimrBlocks.WEAVER_PLANKS_STAIRS.get(), blockTexture(AlfheimrBlocks.WEAVER_PLANKS.get()));
        slabBlock(((SlabBlock) AlfheimrBlocks.WEAVER_PLANKS_SLAB.get()), blockTexture(AlfheimrBlocks.WEAVER_PLANKS.get()), blockTexture(AlfheimrBlocks.WEAVER_PLANKS.get()));
        pressurePlateBlock((PressurePlateBlock) AlfheimrBlocks.WEAVER_PLANKS_PRESSURE_PLATE.get(), blockTexture(AlfheimrBlocks.WEAVER_PLANKS.get()));
        fenceBlock((FenceBlock) AlfheimrBlocks.WEAVER_PLANKS_FENCE.get(), blockTexture(AlfheimrBlocks.WEAVER_PLANKS.get()));
        fenceGateBlock((FenceGateBlock) AlfheimrBlocks.WEAVER_PLANKS_FENCE_GATE.get(), blockTexture(AlfheimrBlocks.WEAVER_PLANKS.get()));
        doorBlockWithRenderType((DoorBlock) AlfheimrBlocks.WEAVER_PLANKS_DOOR.get(), modLoc("block/" + AlfheimrBlocks.WEAVER_PLANKS_DOOR.getId().getPath() + "_bottom"), modLoc("block/" + AlfheimrBlocks.WEAVER_PLANKS_DOOR.getId().getPath() + "_top"), "cutout");
        trapdoorBlockWithRenderType((TrapDoorBlock) AlfheimrBlocks.WEAVER_PLANKS_TRAPDOOR.get(), modLoc("block/" + AlfheimrBlocks.WEAVER_PLANKS_TRAPDOOR.getId().getPath()), true, "cutout");
        buttonBlock((ButtonBlock) AlfheimrBlocks.WEAVER_PLANKS_BUTTON.get(), blockTexture(AlfheimrBlocks.WEAVER_PLANKS.get()));

        blockItem(AlfheimrBlocks.WEAVER_PLANKS_STAIRS);
        blockItem(AlfheimrBlocks.WEAVER_PLANKS_SLAB);
        blockItem(AlfheimrBlocks.WEAVER_PLANKS_FENCE_GATE);
        blockItem(AlfheimrBlocks.WEAVER_PLANKS_PRESSURE_PLATE);
        blockItem(AlfheimrBlocks.WEAVER_PLANKS_TRAPDOOR, "_bottom");
        leavesBlock(AlfheimrBlocks.WEAVER_LEAVES);
        saplingBlock(AlfheimrBlocks.WEAVER_SAPLING);
        signBlock(((StandingSignBlock) AlfheimrBlocks.WEAVER_PLANKS_SIGN.get()),((WallSignBlock) AlfheimrBlocks.WEAVER_PLANKS_WALL_SIGN.get()),
                blockTexture(AlfheimrBlocks.WEAVER_PLANKS.get()));
        hangingSignBlock( AlfheimrBlocks.WEAVER_PLANKS_HANGING_SIGN.get(), AlfheimrBlocks.WEAVER_PLANKS_WALL_HANGING_SIGN.get(),
                blockTexture(AlfheimrBlocks.WEAVER_PLANKS.get()));

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


        /*
        VEGETATION
         */
        makeVegetation(AlfheimrBlocks.ALFHEIMR_MAGIC_GRASS);

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

        /*
        STUFF
         */
        this.waterRemoverBlock(AtlantisBlocks.ATLANTAS_WATER_REMOVER_BLOCK);

        blockComplexGen();
    }

    public void baseBlocks() {
        /*
        STONE GEN
         */
        blockWithItem(NidavellirBlocks.NIDAVELLIR_SOFT_STONE);
        blockWithItem(NidavellirBlocks.NIDAVELLIR_SOFT_COBBLESTONE);
        blockWithItem(NidavellirBlocks.NIDAVELLIR_SOFT_STONE_BRICKS);
        blockWithItem(NidavellirBlocks.NIDAVELLIR_SOFT_SMOOTH_STONE);
        blockWithItem(NidavellirBlocks.NIDAVELLIR_SOFT_COBBLESTONE_MOSSY);
        blockWithItem(NidavellirBlocks.NIDAVELLIR_SOFT_STONE_BRICKS_MOSSY);
        blockWithItem(NidavellirBlocks.NIDAVELLIR_SOFT_STONE_BRICKS_CRACKED);
        blockWithItem(NidavellirBlocks.NIDAVELLIR_SOFT_STONE_BRICKS_CHISELED);

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

        blockWithItem(NidavellirBlocks.NIDAVELLIR_HARD_STONE);
        blockWithItem(NidavellirBlocks.NIDAVELLIR_HARD_COBBLESTONE);
        blockWithItem(NidavellirBlocks.NIDAVELLIR_HARD_STONE_BRICKS);
        blockWithItem(NidavellirBlocks.NIDAVELLIR_HARD_SMOOTH_STONE);
        blockWithItem(NidavellirBlocks.NIDAVELLIR_HARD_COBBLESTONE_MOSSY);
        blockWithItem(NidavellirBlocks.NIDAVELLIR_HARD_STONE_BRICKS_MOSSY);
        blockWithItem(NidavellirBlocks.NIDAVELLIR_HARD_STONE_BRICKS_CRACKED);
        blockWithItem(NidavellirBlocks.NIDAVELLIR_HARD_STONE_BRICKS_CHISELED);

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

        blockWithItem(NidavellirBlocks.NIDAVELLIR_ENHANCED_STONE);
        blockWithItem(NidavellirBlocks.NIDAVELLIR_ENHANCED_COBBLESTONE);
        blockWithItem(NidavellirBlocks.NIDAVELLIR_ENHANCED_STONE_BRICKS);
        blockWithItem(NidavellirBlocks.NIDAVELLIR_ENHANCED_SMOOTH_STONE);
        blockWithItem(NidavellirBlocks.NIDAVELLIR_ENHANCED_COBBLESTONE_MOSSY);
        blockWithItem(NidavellirBlocks.NIDAVELLIR_ENHANCED_STONE_BRICKS_MOSSY);
        blockWithItem(NidavellirBlocks.NIDAVELLIR_ENHANCED_STONE_BRICKS_CRACKED);
        blockWithItem(NidavellirBlocks.NIDAVELLIR_ENHANCED_STONE_BRICKS_CHISELED);

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

        blockWithItem(NidavellirBlocks.NIDAVELLIR_DEEPSLATE_STONE);
        blockWithItem(NidavellirBlocks.NIDAVELLIR_DEEPSLATE_COBBLESTONE);
        blockWithItem(NidavellirBlocks.NIDAVELLIR_DEEPSLATE_STONE_BRICKS);
        blockWithItem(NidavellirBlocks.NIDAVELLIR_DEEPSLATE_SMOOTH_STONE);
        blockWithItem(NidavellirBlocks.NIDAVELLIR_DEEPSLATE_COBBLESTONE_MOSSY);
        blockWithItem(NidavellirBlocks.NIDAVELLIR_DEEPSLATE_STONE_BRICKS_MOSSY);
        blockWithItem(NidavellirBlocks.NIDAVELLIR_DEEPSLATE_STONE_BRICKS_CRACKED);
        blockWithItem(NidavellirBlocks.NIDAVELLIR_DEEPSLATE_STONE_BRICKS_CHISELED);

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

        blockWithItem(NidavellirBlocks.NIDAVELLIR_CRIMSON_STONE);
        blockWithItem(NidavellirBlocks.NIDAVELLIR_CRIMSON_COBBLESTONE);
        blockWithItem(NidavellirBlocks.NIDAVELLIR_CRIMSON_STONE_BRICKS);
        blockWithItem(NidavellirBlocks.NIDAVELLIR_CRIMSON_SMOOTH_STONE);
        blockWithItem(NidavellirBlocks.NIDAVELLIR_CRIMSON_COBBLESTONE_MOSSY);
        blockWithItem(NidavellirBlocks.NIDAVELLIR_CRIMSON_STONE_BRICKS_MOSSY);
        blockWithItem(NidavellirBlocks.NIDAVELLIR_CRIMSON_STONE_BRICKS_CRACKED);
        blockWithItem(NidavellirBlocks.NIDAVELLIR_CRIMSON_STONE_BRICKS_CHISELED);

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

        blockWithItem(UnderworldBlocks.TARTARUS_STONE);
        blockWithItem(UnderworldBlocks.TARTARUS_STONE_COBBLESTONE);
        blockWithItem(UnderworldBlocks.TARTARUS_STONE_BRICKS);
        blockWithItem(UnderworldBlocks.TARTARUS_STONE_SMOOTH_STONE);
        blockWithItem(UnderworldBlocks.TARTARUS_STONE_COBBLESTONE_MOSSY);
        blockWithItem(UnderworldBlocks.TARTARUS_STONE_BRICKS_MOSSY);
        blockWithItem(UnderworldBlocks.TARTARUS_STONE_BRICKS_CRACKED);
        blockWithItem(UnderworldBlocks.TARTARUS_STONE_BRICKS_CHISELED);
    }

    private void blockComplexGen() {
        /*
        STONE GEN
         */
        stairsBlock((StairBlock) NidavellirBlocks.NIDAVELLIR_SOFT_STONE_STAIRS.get(), blockTexture(NidavellirBlocks.NIDAVELLIR_SOFT_STONE.get()));
        stairsBlock((StairBlock) NidavellirBlocks.NIDAVELLIR_SOFT_COBBLESTONE_STAIRS.get(), blockTexture(NidavellirBlocks.NIDAVELLIR_SOFT_COBBLESTONE.get()));
        stairsBlock((StairBlock) NidavellirBlocks.NIDAVELLIR_SOFT_STONE_BRICKS_STAIRS.get(), blockTexture(NidavellirBlocks.NIDAVELLIR_SOFT_STONE_BRICKS.get()));
        slabBlock(((SlabBlock) NidavellirBlocks.NIDAVELLIR_SOFT_STONE_SLAB.get()), blockTexture(NidavellirBlocks.NIDAVELLIR_SOFT_STONE.get()), blockTexture(NidavellirBlocks.NIDAVELLIR_SOFT_STONE.get()));
        slabBlock(((SlabBlock) NidavellirBlocks.NIDAVELLIR_SOFT_COBBLESTONE_SLAB.get()), blockTexture(NidavellirBlocks.NIDAVELLIR_SOFT_COBBLESTONE.get()), blockTexture(NidavellirBlocks.NIDAVELLIR_SOFT_COBBLESTONE.get()));
        slabBlock(((SlabBlock) NidavellirBlocks.NIDAVELLIR_SOFT_STONE_BRICKS_SLAB.get()), blockTexture(NidavellirBlocks.NIDAVELLIR_SOFT_STONE_BRICKS.get()), blockTexture(NidavellirBlocks.NIDAVELLIR_SOFT_STONE_BRICKS.get()));
        pressurePlateBlock((PressurePlateBlock) NidavellirBlocks.NIDAVELLIR_SOFT_STONE_PRESSURE_PLATE.get(), blockTexture(NidavellirBlocks.NIDAVELLIR_SOFT_STONE.get()));
        wallBlock((WallBlock) NidavellirBlocks.NIDAVELLIR_SOFT_STONE_WALL.get(), blockTexture(NidavellirBlocks.NIDAVELLIR_SOFT_STONE.get()));
        wallBlock((WallBlock) NidavellirBlocks.NIDAVELLIR_SOFT_COBBLESTONE_WALL.get(), blockTexture(NidavellirBlocks.NIDAVELLIR_SOFT_STONE.get()));
        wallBlock((WallBlock) NidavellirBlocks.NIDAVELLIR_SOFT_STONE_BRICKS_WALL.get(), blockTexture(NidavellirBlocks.NIDAVELLIR_SOFT_STONE.get()));
        buttonBlock((ButtonBlock) NidavellirBlocks.NIDAVELLIR_SOFT_STONE_BUTTON.get(), blockTexture(NidavellirBlocks.NIDAVELLIR_SOFT_STONE.get()));

        blockItem(NidavellirBlocks.NIDAVELLIR_SOFT_STONE_STAIRS);
        blockItem(NidavellirBlocks.NIDAVELLIR_SOFT_STONE_SLAB);
        blockItem(NidavellirBlocks.NIDAVELLIR_SOFT_STONE_PRESSURE_PLATE);
//        blockItem(NidavellirBlocks.NIDAVELLIR_SOFT_STONE_BUTTON);
//        blockItem(NidavellirBlocks.NIDAVELLIR_SOFT_STONE_WALL);
        blockItem(NidavellirBlocks.NIDAVELLIR_SOFT_COBBLESTONE_STAIRS);
        blockItem(NidavellirBlocks.NIDAVELLIR_SOFT_COBBLESTONE_SLAB);
//        blockItem(NidavellirBlocks.NIDAVELLIR_SOFT_COBBLESTONE_WALL);
        blockItem(NidavellirBlocks.NIDAVELLIR_SOFT_STONE_BRICKS_STAIRS);
        blockItem(NidavellirBlocks.NIDAVELLIR_SOFT_STONE_BRICKS_SLAB);
//        blockItem(NidavellirBlocks.NIDAVELLIR_SOFT_STONE_BRICKS_WALL);

        stairsBlock((StairBlock) NidavellirBlocks.NIDAVELLIR_HARD_STONE_STAIRS.get(), blockTexture(NidavellirBlocks.NIDAVELLIR_HARD_STONE.get()));
        stairsBlock((StairBlock) NidavellirBlocks.NIDAVELLIR_HARD_COBBLESTONE_STAIRS.get(), blockTexture(NidavellirBlocks.NIDAVELLIR_HARD_COBBLESTONE.get()));
        stairsBlock((StairBlock) NidavellirBlocks.NIDAVELLIR_HARD_STONE_BRICKS_STAIRS.get(), blockTexture(NidavellirBlocks.NIDAVELLIR_HARD_STONE_BRICKS.get()));
        slabBlock(((SlabBlock) NidavellirBlocks.NIDAVELLIR_HARD_STONE_SLAB.get()), blockTexture(NidavellirBlocks.NIDAVELLIR_HARD_STONE.get()), blockTexture(NidavellirBlocks.NIDAVELLIR_HARD_STONE.get()));
        slabBlock(((SlabBlock) NidavellirBlocks.NIDAVELLIR_HARD_COBBLESTONE_SLAB.get()), blockTexture(NidavellirBlocks.NIDAVELLIR_HARD_COBBLESTONE.get()), blockTexture(NidavellirBlocks.NIDAVELLIR_HARD_COBBLESTONE.get()));
        slabBlock(((SlabBlock) NidavellirBlocks.NIDAVELLIR_HARD_STONE_BRICKS_SLAB.get()), blockTexture(NidavellirBlocks.NIDAVELLIR_HARD_STONE_BRICKS.get()), blockTexture(NidavellirBlocks.NIDAVELLIR_HARD_STONE_BRICKS.get()));
        pressurePlateBlock((PressurePlateBlock) NidavellirBlocks.NIDAVELLIR_HARD_STONE_PRESSURE_PLATE.get(), blockTexture(NidavellirBlocks.NIDAVELLIR_HARD_STONE.get()));
        wallBlock((WallBlock) NidavellirBlocks.NIDAVELLIR_HARD_STONE_WALL.get(), blockTexture(NidavellirBlocks.NIDAVELLIR_HARD_STONE.get()));
        wallBlock((WallBlock) NidavellirBlocks.NIDAVELLIR_HARD_COBBLESTONE_WALL.get(), blockTexture(NidavellirBlocks.NIDAVELLIR_HARD_STONE.get()));
        wallBlock((WallBlock) NidavellirBlocks.NIDAVELLIR_HARD_STONE_BRICKS_WALL.get(), blockTexture(NidavellirBlocks.NIDAVELLIR_HARD_STONE.get()));
        buttonBlock((ButtonBlock) NidavellirBlocks.NIDAVELLIR_HARD_STONE_BUTTON.get(), blockTexture(NidavellirBlocks.NIDAVELLIR_HARD_STONE.get()));

        blockItem(NidavellirBlocks.NIDAVELLIR_HARD_STONE_STAIRS);
        blockItem(NidavellirBlocks.NIDAVELLIR_HARD_STONE_SLAB);
        blockItem(NidavellirBlocks.NIDAVELLIR_HARD_STONE_PRESSURE_PLATE);
//        blockItem(NidavellirBlocks.NIDAVELLIR_HARD_STONE_BUTTON);
//        blockItem(NidavellirBlocks.NIDAVELLIR_HARD_STONE_WALL);
        blockItem(NidavellirBlocks.NIDAVELLIR_HARD_COBBLESTONE_STAIRS);
        blockItem(NidavellirBlocks.NIDAVELLIR_HARD_COBBLESTONE_SLAB);
//        blockItem(NidavellirBlocks.NIDAVELLIR_HARD_COBBLESTONE_WALL);
        blockItem(NidavellirBlocks.NIDAVELLIR_HARD_STONE_BRICKS_STAIRS);
        blockItem(NidavellirBlocks.NIDAVELLIR_HARD_STONE_BRICKS_SLAB);
//        blockItem(NidavellirBlocks.NIDAVELLIR_HARD_STONE_BRICKS_WALL);

        stairsBlock((StairBlock) NidavellirBlocks.NIDAVELLIR_ENHANCED_STONE_STAIRS.get(), blockTexture(NidavellirBlocks.NIDAVELLIR_ENHANCED_STONE.get()));
        stairsBlock((StairBlock) NidavellirBlocks.NIDAVELLIR_ENHANCED_COBBLESTONE_STAIRS.get(), blockTexture(NidavellirBlocks.NIDAVELLIR_ENHANCED_COBBLESTONE.get()));
        stairsBlock((StairBlock) NidavellirBlocks.NIDAVELLIR_ENHANCED_STONE_BRICKS_STAIRS.get(), blockTexture(NidavellirBlocks.NIDAVELLIR_ENHANCED_STONE_BRICKS.get()));
        slabBlock(((SlabBlock) NidavellirBlocks.NIDAVELLIR_ENHANCED_STONE_SLAB.get()), blockTexture(NidavellirBlocks.NIDAVELLIR_ENHANCED_STONE.get()), blockTexture(NidavellirBlocks.NIDAVELLIR_ENHANCED_STONE.get()));
        slabBlock(((SlabBlock) NidavellirBlocks.NIDAVELLIR_ENHANCED_COBBLESTONE_SLAB.get()), blockTexture(NidavellirBlocks.NIDAVELLIR_ENHANCED_COBBLESTONE.get()), blockTexture(NidavellirBlocks.NIDAVELLIR_ENHANCED_COBBLESTONE.get()));
        slabBlock(((SlabBlock) NidavellirBlocks.NIDAVELLIR_ENHANCED_STONE_BRICKS_SLAB.get()), blockTexture(NidavellirBlocks.NIDAVELLIR_ENHANCED_STONE_BRICKS.get()), blockTexture(NidavellirBlocks.NIDAVELLIR_ENHANCED_STONE_BRICKS.get()));
        pressurePlateBlock((PressurePlateBlock) NidavellirBlocks.NIDAVELLIR_ENHANCED_STONE_PRESSURE_PLATE.get(), blockTexture(NidavellirBlocks.NIDAVELLIR_ENHANCED_STONE.get()));
        wallBlock((WallBlock) NidavellirBlocks.NIDAVELLIR_ENHANCED_STONE_WALL.get(), blockTexture(NidavellirBlocks.NIDAVELLIR_ENHANCED_STONE.get()));
        wallBlock((WallBlock) NidavellirBlocks.NIDAVELLIR_ENHANCED_COBBLESTONE_WALL.get(), blockTexture(NidavellirBlocks.NIDAVELLIR_ENHANCED_STONE.get()));
        wallBlock((WallBlock) NidavellirBlocks.NIDAVELLIR_ENHANCED_STONE_BRICKS_WALL.get(), blockTexture(NidavellirBlocks.NIDAVELLIR_ENHANCED_STONE.get()));
        buttonBlock((ButtonBlock) NidavellirBlocks.NIDAVELLIR_ENHANCED_STONE_BUTTON.get(), blockTexture(NidavellirBlocks.NIDAVELLIR_ENHANCED_STONE.get()));

        blockItem(NidavellirBlocks.NIDAVELLIR_ENHANCED_STONE_STAIRS);
        blockItem(NidavellirBlocks.NIDAVELLIR_ENHANCED_STONE_SLAB);
        blockItem(NidavellirBlocks.NIDAVELLIR_ENHANCED_STONE_PRESSURE_PLATE);
//        blockItem(NidavellirBlocks.NIDAVELLIR_ENHANCED_STONE_BUTTON);
//        blockItem(NidavellirBlocks.NIDAVELLIR_ENHANCED_STONE_WALL);
        blockItem(NidavellirBlocks.NIDAVELLIR_ENHANCED_COBBLESTONE_STAIRS);
        blockItem(NidavellirBlocks.NIDAVELLIR_ENHANCED_COBBLESTONE_SLAB);
//        blockItem(NidavellirBlocks.NIDAVELLIR_ENHANCED_COBBLESTONE_WALL);
        blockItem(NidavellirBlocks.NIDAVELLIR_ENHANCED_STONE_BRICKS_STAIRS);
        blockItem(NidavellirBlocks.NIDAVELLIR_ENHANCED_STONE_BRICKS_SLAB);
//        blockItem(NidavellirBlocks.NIDAVELLIR_ENHANCED_STONE_BRICKS_WALL);

        stairsBlock((StairBlock) NidavellirBlocks.NIDAVELLIR_DEEPSLATE_STONE_STAIRS.get(), blockTexture(NidavellirBlocks.NIDAVELLIR_DEEPSLATE_STONE.get()));
        stairsBlock((StairBlock) NidavellirBlocks.NIDAVELLIR_DEEPSLATE_COBBLESTONE_STAIRS.get(), blockTexture(NidavellirBlocks.NIDAVELLIR_DEEPSLATE_COBBLESTONE.get()));
        stairsBlock((StairBlock) NidavellirBlocks.NIDAVELLIR_DEEPSLATE_STONE_BRICKS_STAIRS.get(), blockTexture(NidavellirBlocks.NIDAVELLIR_DEEPSLATE_STONE_BRICKS.get()));
        slabBlock(((SlabBlock) NidavellirBlocks.NIDAVELLIR_DEEPSLATE_STONE_SLAB.get()), blockTexture(NidavellirBlocks.NIDAVELLIR_DEEPSLATE_STONE.get()), blockTexture(NidavellirBlocks.NIDAVELLIR_DEEPSLATE_STONE.get()));
        slabBlock(((SlabBlock) NidavellirBlocks.NIDAVELLIR_DEEPSLATE_COBBLESTONE_SLAB.get()), blockTexture(NidavellirBlocks.NIDAVELLIR_DEEPSLATE_COBBLESTONE.get()), blockTexture(NidavellirBlocks.NIDAVELLIR_DEEPSLATE_COBBLESTONE.get()));
        slabBlock(((SlabBlock) NidavellirBlocks.NIDAVELLIR_DEEPSLATE_STONE_BRICKS_SLAB.get()), blockTexture(NidavellirBlocks.NIDAVELLIR_DEEPSLATE_STONE_BRICKS.get()), blockTexture(NidavellirBlocks.NIDAVELLIR_DEEPSLATE_STONE_BRICKS.get()));
        pressurePlateBlock((PressurePlateBlock) NidavellirBlocks.NIDAVELLIR_DEEPSLATE_STONE_PRESSURE_PLATE.get(), blockTexture(NidavellirBlocks.NIDAVELLIR_DEEPSLATE_STONE.get()));
        wallBlock((WallBlock) NidavellirBlocks.NIDAVELLIR_DEEPSLATE_STONE_WALL.get(), blockTexture(NidavellirBlocks.NIDAVELLIR_DEEPSLATE_STONE.get()));
        wallBlock((WallBlock) NidavellirBlocks.NIDAVELLIR_DEEPSLATE_COBBLESTONE_WALL.get(), blockTexture(NidavellirBlocks.NIDAVELLIR_DEEPSLATE_STONE.get()));
        wallBlock((WallBlock) NidavellirBlocks.NIDAVELLIR_DEEPSLATE_STONE_BRICKS_WALL.get(), blockTexture(NidavellirBlocks.NIDAVELLIR_DEEPSLATE_STONE.get()));
        buttonBlock((ButtonBlock) NidavellirBlocks.NIDAVELLIR_DEEPSLATE_STONE_BUTTON.get(), blockTexture(NidavellirBlocks.NIDAVELLIR_DEEPSLATE_STONE.get()));

        blockItem(NidavellirBlocks.NIDAVELLIR_DEEPSLATE_STONE_STAIRS);
        blockItem(NidavellirBlocks.NIDAVELLIR_DEEPSLATE_STONE_SLAB);
        blockItem(NidavellirBlocks.NIDAVELLIR_DEEPSLATE_STONE_PRESSURE_PLATE);
//        blockItem(NidavellirBlocks.NIDAVELLIR_DEEPSLATE_STONE_BUTTON);
//        blockItem(NidavellirBlocks.NIDAVELLIR_DEEPSLATE_STONE_WALL);
        blockItem(NidavellirBlocks.NIDAVELLIR_DEEPSLATE_COBBLESTONE_STAIRS);
        blockItem(NidavellirBlocks.NIDAVELLIR_DEEPSLATE_COBBLESTONE_SLAB);
//        blockItem(NidavellirBlocks.NIDAVELLIR_DEEPSLATE_COBBLESTONE_WALL);
        blockItem(NidavellirBlocks.NIDAVELLIR_DEEPSLATE_STONE_BRICKS_STAIRS);
        blockItem(NidavellirBlocks.NIDAVELLIR_DEEPSLATE_STONE_BRICKS_SLAB);
//        blockItem(NidavellirBlocks.NIDAVELLIR_DEEPSLATE_STONE_BRICKS_WALL);

        stairsBlock((StairBlock) NidavellirBlocks.NIDAVELLIR_CRIMSON_STONE_STAIRS.get(), blockTexture(NidavellirBlocks.NIDAVELLIR_CRIMSON_STONE.get()));
        stairsBlock((StairBlock) NidavellirBlocks.NIDAVELLIR_CRIMSON_COBBLESTONE_STAIRS.get(), blockTexture(NidavellirBlocks.NIDAVELLIR_CRIMSON_COBBLESTONE.get()));
        stairsBlock((StairBlock) NidavellirBlocks.NIDAVELLIR_CRIMSON_STONE_BRICKS_STAIRS.get(), blockTexture(NidavellirBlocks.NIDAVELLIR_CRIMSON_STONE_BRICKS.get()));
        slabBlock(((SlabBlock) NidavellirBlocks.NIDAVELLIR_CRIMSON_STONE_SLAB.get()), blockTexture(NidavellirBlocks.NIDAVELLIR_CRIMSON_STONE.get()), blockTexture(NidavellirBlocks.NIDAVELLIR_CRIMSON_STONE.get()));
        slabBlock(((SlabBlock) NidavellirBlocks.NIDAVELLIR_CRIMSON_COBBLESTONE_SLAB.get()), blockTexture(NidavellirBlocks.NIDAVELLIR_CRIMSON_COBBLESTONE.get()), blockTexture(NidavellirBlocks.NIDAVELLIR_CRIMSON_COBBLESTONE.get()));
        slabBlock(((SlabBlock) NidavellirBlocks.NIDAVELLIR_CRIMSON_STONE_BRICKS_SLAB.get()), blockTexture(NidavellirBlocks.NIDAVELLIR_CRIMSON_STONE_BRICKS.get()), blockTexture(NidavellirBlocks.NIDAVELLIR_CRIMSON_STONE_BRICKS.get()));
        pressurePlateBlock((PressurePlateBlock) NidavellirBlocks.NIDAVELLIR_CRIMSON_STONE_PRESSURE_PLATE.get(), blockTexture(NidavellirBlocks.NIDAVELLIR_CRIMSON_STONE.get()));
        wallBlock((WallBlock) NidavellirBlocks.NIDAVELLIR_CRIMSON_STONE_WALL.get(), blockTexture(NidavellirBlocks.NIDAVELLIR_CRIMSON_STONE.get()));
        wallBlock((WallBlock) NidavellirBlocks.NIDAVELLIR_CRIMSON_COBBLESTONE_WALL.get(), blockTexture(NidavellirBlocks.NIDAVELLIR_CRIMSON_STONE.get()));
        wallBlock((WallBlock) NidavellirBlocks.NIDAVELLIR_CRIMSON_STONE_BRICKS_WALL.get(), blockTexture(NidavellirBlocks.NIDAVELLIR_CRIMSON_STONE.get()));
        buttonBlock((ButtonBlock) NidavellirBlocks.NIDAVELLIR_CRIMSON_STONE_BUTTON.get(), blockTexture(NidavellirBlocks.NIDAVELLIR_CRIMSON_STONE.get()));

        blockItem(NidavellirBlocks.NIDAVELLIR_CRIMSON_STONE_STAIRS);
        blockItem(NidavellirBlocks.NIDAVELLIR_CRIMSON_STONE_SLAB);
        blockItem(NidavellirBlocks.NIDAVELLIR_CRIMSON_STONE_PRESSURE_PLATE);
//        blockItem(NidavellirBlocks.NIDAVELLIR_CRIMSON_STONE_BUTTON);
//        blockItem(NidavellirBlocks.NIDAVELLIR_CRIMSON_STONE_WALL);
        blockItem(NidavellirBlocks.NIDAVELLIR_CRIMSON_COBBLESTONE_STAIRS);
        blockItem(NidavellirBlocks.NIDAVELLIR_CRIMSON_COBBLESTONE_SLAB);
//        blockItem(NidavellirBlocks.NIDAVELLIR_CRIMSON_COBBLESTONE_WALL);
        blockItem(NidavellirBlocks.NIDAVELLIR_CRIMSON_STONE_BRICKS_STAIRS);
        blockItem(NidavellirBlocks.NIDAVELLIR_CRIMSON_STONE_BRICKS_SLAB);
//        blockItem(NidavellirBlocks.NIDAVELLIR_CRIMSON_STONE_BRICKS_WALL);

        stairsBlock((StairBlock) UnderworldBlocks.TARTARUS_STONE_STAIRS.get(), blockTexture(UnderworldBlocks.TARTARUS_STONE.get()));
        stairsBlock((StairBlock) UnderworldBlocks.TARTARUS_STONE_COBBLESTONE_STAIRS.get(), blockTexture(UnderworldBlocks.TARTARUS_STONE_COBBLESTONE.get()));
        stairsBlock((StairBlock) UnderworldBlocks.TARTARUS_STONE_BRICKS_STAIRS.get(), blockTexture(UnderworldBlocks.TARTARUS_STONE_BRICKS.get()));
        slabBlock(((SlabBlock) UnderworldBlocks.TARTARUS_STONE_SLAB.get()), blockTexture(UnderworldBlocks.TARTARUS_STONE.get()), blockTexture(UnderworldBlocks.TARTARUS_STONE.get()));
        slabBlock(((SlabBlock) UnderworldBlocks.TARTARUS_STONE_COBBLESTONE_SLAB.get()), blockTexture(UnderworldBlocks.TARTARUS_STONE_COBBLESTONE.get()), blockTexture(UnderworldBlocks.TARTARUS_STONE_COBBLESTONE.get()));
        slabBlock(((SlabBlock) UnderworldBlocks.TARTARUS_STONE_BRICKS_SLAB.get()), blockTexture(UnderworldBlocks.TARTARUS_STONE_BRICKS.get()), blockTexture(UnderworldBlocks.TARTARUS_STONE_BRICKS.get()));
        pressurePlateBlock((PressurePlateBlock) UnderworldBlocks.TARTARUS_STONE_PRESSURE_PLATE.get(), blockTexture(UnderworldBlocks.TARTARUS_STONE.get()));
        wallBlock((WallBlock) UnderworldBlocks.TARTARUS_STONE_WALL.get(), blockTexture(UnderworldBlocks.TARTARUS_STONE.get()));
        wallBlock((WallBlock) UnderworldBlocks.TARTARUS_STONE_COBBLESTONE_WALL.get(), blockTexture(UnderworldBlocks.TARTARUS_STONE.get()));
        wallBlock((WallBlock) UnderworldBlocks.TARTARUS_STONE_BRICKS_WALL.get(), blockTexture(UnderworldBlocks.TARTARUS_STONE.get()));
        buttonBlock((ButtonBlock) UnderworldBlocks.TARTARUS_STONE_BUTTON.get(), blockTexture(UnderworldBlocks.TARTARUS_STONE.get()));

        blockItem(UnderworldBlocks.TARTARUS_STONE_STAIRS);
        blockItem(UnderworldBlocks.TARTARUS_STONE_SLAB);
        blockItem(UnderworldBlocks.TARTARUS_STONE_PRESSURE_PLATE);
//        blockItem(UnderworldBlocks.TARTARUS_STONE_BUTTON);
//        blockItem(UnderworldBlocks.TARTARUS_STONE_WALL);
        blockItem(UnderworldBlocks.TARTARUS_STONE_COBBLESTONE_STAIRS);
        blockItem(UnderworldBlocks.TARTARUS_STONE_COBBLESTONE_SLAB);
//        blockItem(UnderworldBlocks.TARTARUS_STONE_COBBLESTONE_WALL);
        blockItem(UnderworldBlocks.TARTARUS_STONE_BRICKS_STAIRS);
        blockItem(UnderworldBlocks.TARTARUS_STONE_BRICKS_SLAB);
//        blockItem(UnderworldBlocks.TARTARUS_STONE_BRICKS_WALL);
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

    public void makeCrop(ModCropBlock block, String modelName, String textureName) {
        Function<BlockState, ConfiguredModel[]> function = state -> states(state, block, modelName, textureName);

        getVariantBuilder(block).forAllStates(function);
    }

    public void makeCarpet(RegistryObject<Block> blockRegistryObject) {
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
