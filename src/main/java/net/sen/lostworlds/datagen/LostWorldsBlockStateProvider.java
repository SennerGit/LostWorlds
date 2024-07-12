package net.sen.lostworlds.datagen;

import net.minecraft.core.Direction;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockState;
import net.neoforged.neoforge.client.model.generators.BlockModelBuilder;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.client.model.generators.ConfiguredModel;
import net.neoforged.neoforge.client.model.generators.ModelFile;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.NeoForgeRegistries;
import net.sen.lostworlds.api.LostWorldsApi;
import net.sen.lostworlds.block.crops.ModCropBlock;
import net.sen.lostworlds.block.custom.CrimsonDiamondLampBlock;
import net.sen.lostworlds.block.custom.WaterRemoverBlock;
import net.sen.lostworlds.block.portal.ModPortalBlock;

import java.util.function.Function;

public abstract class LostWorldsBlockStateProvider extends BlockStateProvider {
    public LostWorldsBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, LostWorldsApi.MODID, exFileHelper);
    }

    public String name(Block block) {
        return key(block).getPath();
    }

    public ResourceLocation key(Block block) {
        return BuiltInRegistries.BLOCK.getKey(block);
        //        return Registries.BLOCK.registryKey().getKey(block);
    }

    public void blockItem(DeferredBlock<?> blockRegistryObject) {
        simpleBlockItem(blockRegistryObject.get(), new ModelFile.UncheckedModelFile(LostWorldsApi.MODID + ":block/" + BuiltInRegistries.BLOCK.getKey(blockRegistryObject.get()).getPath()));
    }

    public void blockItem(DeferredBlock<?> blockRegistryObject, String appendix) {
        simpleBlockItem(blockRegistryObject.get(), new ModelFile.UncheckedModelFile(LostWorldsApi.MODID + ":block/" + BuiltInRegistries.BLOCK.getKey(blockRegistryObject.get()).getPath() + appendix));
    }

    public void blockWithItem(DeferredBlock<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }

    public void colouredBlockWithItem(DeferredBlock<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(),
                models().singleTexture(BuiltInRegistries.BLOCK.getKey(blockRegistryObject.get()).getPath(),
                        LostWorldsApi.mcLoc("minecraft:block/cube_all"),
                        "all", blockTexture(blockRegistryObject.get())).renderType("solid"));
    }

    public void customLamp(DeferredBlock<Block> block) {
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

    public void waterRemoverBlock(DeferredBlock<Block> block) {
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

    public void makePortalBlock(DeferredBlock<Block> block) {
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

    public void makeCarpet(DeferredBlock<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(),
                models().carpet(BuiltInRegistries.BLOCK.getKey(blockRegistryObject.get()).getPath(),
                        blockTexture(blockRegistryObject.get()))
        );
    }

    public ConfiguredModel[] states(BlockState state, ModCropBlock block, String modelName, String textureName) {
        ConfiguredModel[] models = new ConfiguredModel[1];
        models[0] = new ConfiguredModel(models().crop(modelName + state.getValue((block).getAgeProperty()),
                modBlockResourceLocation(textureName + state.getValue((block).getAgeProperty()))).renderType("cutout"));

        return models;
    }

    public void leavesBlock(DeferredBlock<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(),
                models().cubeAll(BuiltInRegistries.BLOCK.getKey(blockRegistryObject.get()).getPath(), blockTexture(blockRegistryObject.get())).renderType("cutout"));
    }

    public void saplingBlock(DeferredBlock<SaplingBlock> blockRegistryObject) {
        simpleBlock(blockRegistryObject.get(),
                models().cross(BuiltInRegistries.BLOCK.getKey(blockRegistryObject.get()).getPath(), blockTexture(blockRegistryObject.get())).renderType("cutout"));
    }

    public void hangingSignBlock(Block signBlock, Block wallSignBlock, ResourceLocation texture) {
        ModelFile sign = models().sign(name(signBlock), texture);
        hangingSignBlock(signBlock, wallSignBlock, sign);
    }

    public void hangingSignBlock(Block signBlock, Block wallSignBlock, ModelFile sign) {
        simpleBlock(signBlock, sign);
        simpleBlock(wallSignBlock, sign);
    }

    public void makeFlower(DeferredBlock<Block> flowerBlock, DeferredBlock<FlowerPotBlock> potBlock) {
        simpleBlock(flowerBlock.get(),
                models().cross(blockTexture(flowerBlock.get()).getPath(),
                        blockTexture(flowerBlock.get())).renderType("cutout"));
        simpleBlock(potBlock.get(),
                models().withExistingParent(potBlock.getId().getPath(),
                                mcLoc("block/flower_pot_cross")).renderType("cutout")
                        .texture("plant", blockTexture(flowerBlock.get())));
    }

    public void makeVegetation(DeferredBlock<Block> vegBlock) {
        simpleBlock(vegBlock.get(),
                models().cross(blockTexture(vegBlock.get()).getPath(),
                        blockTexture(vegBlock.get())).renderType("cutout"));
    }

    public void makeMushroom(DeferredBlock<Block> mushroomBlock, DeferredBlock<FlowerPotBlock> potBlock) {
        simpleBlock(mushroomBlock.get(),
                models().cross(BuiltInRegistries.BLOCK.getKey(mushroomBlock.get()).getPath(),
                        blockTexture(mushroomBlock.get())).renderType("cutout"));
        simpleBlock(potBlock.get(),
                models().withExistingParent(potBlock.getId().getPath(),
                                mcLoc("block/flower_pot_cross")).renderType("cutout")
                        .texture("plant", blockTexture(mushroomBlock.get())));
    }

    public void makeMushroom(DeferredBlock<Block> mushroomBlock) {
        simpleBlock(mushroomBlock.get(),
                models().cross(blockTexture(mushroomBlock.get()).getPath(),
                        blockTexture(mushroomBlock.get())).renderType("cutout"));
    }

    public void makeVine(DeferredBlock<Block> vineBlock) {
        simpleBlock(vineBlock.get(),
                models().withExistingParent(vineBlock.getId().getPath(),
                                mcLoc("block/vine")).renderType("vine")
                        .texture("vine", blockTexture(vineBlock.get()))
        );
    }

    public ResourceLocation modBlockResourceLocation(DeferredBlock<Block> block) {
        return modBlockResourceLocation(block.getId().getPath());
    }

    public ResourceLocation modBlockResourceLocation(DeferredBlock<Block> block, String addedData) {
        return modBlockResourceLocation(block.getId().getPath() + addedData);
    }

    public ResourceLocation modBlockResourceLocation(String block) {
        ResourceLocation resourceLocation;
        resourceLocation = LostWorldsApi.modLoc("block/" + block);
        return resourceLocation;
    }

    /*
     * ChaosAwakens
     * https://github.com/ChaosAwakens/ChaosAwakens/tree/6bb21a2e15361e3aa3a15ebc1d427e5f746019cd
     */

    public void grassBlock(DeferredBlock<Block> block, ResourceLocation particle, ResourceLocation bottom, ResourceLocation top, ResourceLocation side, ResourceLocation overlay) {
        grassBlock(block.get(), models().getExistingFile(modBlockResourceLocation(block.getId().getPath())));
    }

    public void grassBlock(Block block, ModelFile model) {
        grassBlock(block, new ConfiguredModel(model));
    }

    public void grassBlock(Block block, ConfiguredModel... model) {
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
    public void woodBlockGroup(DeferredBlock<RotatedPillarBlock> log, DeferredBlock<RotatedPillarBlock> wood, DeferredBlock<RotatedPillarBlock> strippedLog,
                                DeferredBlock<RotatedPillarBlock> strippedWood, DeferredBlock<Block> planks, DeferredBlock<StairBlock> planksStairs,
                                DeferredBlock<SlabBlock> planksSlab, DeferredBlock<PressurePlateBlock> planksPressurePlate, DeferredBlock<FenceBlock> planksFence,
                                DeferredBlock<FenceGateBlock> planksFenceGate, DeferredBlock<DoorBlock> planksDoor, DeferredBlock<TrapDoorBlock> planksTrapDoor,
                                DeferredBlock<ButtonBlock> planksButton, DeferredBlock<SaplingBlock> planksSapling, DeferredBlock<Block> planksLeaves,
                                DeferredBlock<StandingSignBlock> planksSign, DeferredBlock<WallSignBlock> planksWallSign,
                                DeferredBlock<CeilingHangingSignBlock> planksHangingSign, DeferredBlock<WallHangingSignBlock> planksHangingWallSign) {

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
    public void StoneBlockGroup(DeferredBlock<Block> stone, DeferredBlock<Block> cobblestone, DeferredBlock<Block> stoneBricks,
                                 DeferredBlock<Block> stoneSmooth, DeferredBlock<Block> cobblestoneMossy, DeferredBlock<Block> stoneBricksMossy,
                                 DeferredBlock<Block> stoneBricksCracked, DeferredBlock<Block> stoneBricksChiseled,
                                 DeferredBlock<StairBlock> stoneStairs, DeferredBlock<StairBlock> cobblestoneStairs, DeferredBlock<StairBlock> stoneBricksStairs,
                                 DeferredBlock<SlabBlock> stoneSlabs, DeferredBlock<SlabBlock> cobblestoneSlabs, DeferredBlock<SlabBlock> stoneBricksSlabs,
                                 DeferredBlock<WallBlock> stoneWall, DeferredBlock<WallBlock> cobblestoneWall, DeferredBlock<WallBlock> stoneBricksWall,
                                 DeferredBlock<PressurePlateBlock> stonePressurePlate, DeferredBlock<ButtonBlock> stoneButton) {

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
