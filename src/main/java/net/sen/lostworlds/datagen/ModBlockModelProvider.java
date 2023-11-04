package net.sen.lostworlds.datagen;

import net.minecraft.core.Direction;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.BlockModelBuilder;
import net.minecraftforge.client.model.generators.BlockModelProvider;
import net.minecraftforge.client.model.generators.ModelBuilder;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;
import net.sen.lostworlds.LostWorlds;
import net.sen.lostworlds.block.ModBlocks;

import java.util.function.BiConsumer;

public class ModBlockModelProvider extends BlockModelProvider {
    public ModBlockModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, LostWorlds.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {

//        this.grassBlock(ModBlocks.UNDERWORLD_GRASS_BLOCK, modResourceLocation(ModBlocks.UNDERWORLD_DIRT), modResourceLocation(ModBlocks.UNDERWORLD_DIRT), modResourceLocation("underworld_grass_block_top"), modResourceLocation("underworld_grass_block_side"), modResourceLocation("underworld_grass_block_side_overlay"));
    }

    private ResourceLocation modResourceLocation(RegistryObject<Block> block) {
        return modResourceLocation(block.getId().getPath());
    }

    private ResourceLocation modResourceLocation(String block) {
        ResourceLocation resourceLocation;
        resourceLocation = new ResourceLocation(LostWorlds.MODID, "block/" + block);
        return resourceLocation;
    }

    /*
     * ChaosAwakens
     * https://github.com/ChaosAwakens/ChaosAwakens/tree/6bb21a2e15361e3aa3a15ebc1d427e5f746019cd
     */
    public BlockModelBuilder grassBlock(RegistryObject<Block> block, ResourceLocation particle, ResourceLocation bottom, ResourceLocation top, ResourceLocation side, ResourceLocation overlay) {
        return grassBlock(block.getId().getPath(), particle, bottom, top, side, overlay);
    }

    public BlockModelBuilder grassBlock(String name, ResourceLocation particle, ResourceLocation bottom, ResourceLocation top, ResourceLocation side, ResourceLocation overlay) {
//        return this.cubeBottomTop(name, side, bottom, top)
//                .texture("particle", particle)
//                .texture("overlay", overlay)
//                .element()
//                .from(0, 0, 0).to(16, 16, 16)
//                .face(Direction.NORTH).uvs(0, 0, 16, 16).texture("#overlay").tintindex(0).cullface(Direction.NORTH).end()
//                .face(Direction.EAST).uvs(0, 0, 16, 16).texture("#overlay").tintindex(0).cullface(Direction.EAST).end()
//                .face(Direction.SOUTH).uvs(0, 0, 16, 16).texture("#overlay").tintindex(0).cullface(Direction.SOUTH).end()
//                .face(Direction.WEST).uvs(0, 0, 16, 16).texture("#overlay").tintindex(0).cullface(Direction.WEST).end()
//                .end()
//                ;

        return withExistingParent(name, BLOCK_FOLDER + "/grass_block")
                .texture("particle", particle)
                .texture("bottom", bottom)
                .texture("top", top)
                .texture("side", side)
                .texture("overlay", overlay)
                .element()
                .from(0, 0, 0).to(16, 16, 16)
                .allFaces(((direction, faceBuilder) -> {
                    String texture = "#side";
                    int tint = -1;

                    switch (direction) {
                        case DOWN:
                            texture = "#bottom";
                            break;
                        case UP:
                            texture = "#top";
                            tint = 0;
                            break;
                    }

                    faceBuilder.uvs(0, 0, 16, 16)
                            .texture(texture)
                            .cullface(direction)
                            .tintindex(tint);
                }))
                .end()
                .element()
                .from(0, 0, 0).to(16, 16, 16)
                .allFaces(((direction, faceBuilder) -> {
                    String texture = "#side";
                    int tint = -1;

                    switch (direction) {
                        case NORTH, EAST, SOUTH, WEST:
                            faceBuilder.uvs(0, 0, 16, 16)
                                    .texture("#overlay")
                                    .cullface(direction)
                                    .tintindex(0);
                            break;

//                        case UP, DOWN:
//                            faceBuilder.end();
//                            break;
                    }
                }))
                .end();
    }
}
