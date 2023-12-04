package net.sen.lostworlds.datagen.tag;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.sen.lostworlds.LostWorlds;
import net.sen.lostworlds.block.ModBlocks;
import net.sen.lostworlds.util.ModTags;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagGenerator extends BlockTagsProvider {
    public ModBlockTagGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, LostWorlds.MODID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        this.tag(ModTags.Blocks.MAGICAL_BLOCK).add(
                ModBlocks.NETHER_STEEL_ORE.get()
        ).addTag(
                Tags.Blocks.ORES
        );

        this.tag(BlockTags.PORTALS).add(
                ModBlocks.UNDERWORLD_PORTAL.get(),
                ModBlocks.NIDAVELLIR_PORTAL.get(),
                ModBlocks.ALFHEIMR_PORTAL.get(),
                ModBlocks.ATLANTIS_PORTAL.get(),
                ModBlocks.SKYOPIA_PORTAL.get()
        );

        this.tag(ModTags.Blocks.UNDERWORLD_PORTAL_FRAME_BLOCKS).add(
                ModBlocks.UNDERWORLD_PORTAL_FRAME.get()
        );

        this.tag(ModTags.Blocks.NIDAVELLIR_PORTAL_FRAME_BLOCKS).add(
                ModBlocks.NIDAVELLIR_PORTAL_FRAME.get()
        );

        this.tag(ModTags.Blocks.ALFHEIMR_PORTAL_FRAME_BLOCKS).add(
                ModBlocks.ALFHEIMR_PORTAL_FRAME.get()
        );

        this.tag(ModTags.Blocks.ATLANTIS_PORTAL_FRAME_BLOCKS).add(
                ModBlocks.ATLANTIS_PORTAL_FRAME.get()
        );

        this.tag(ModTags.Blocks.SKYOPIA_PORTAL_FRAME_BLOCKS).add(
                ModBlocks.SKYOPIA_PORTAL_FRAME.get()
        );

        this.tag(ModTags.Blocks.MOD_CARVER_REPLACEABLES).add(
                Blocks.STONE
        );

        this.tag(BlockTags.MINEABLE_WITH_AXE).addTags(
                ModTags.Blocks.ELDER_WOOD,
                ModTags.Blocks.OLIVE_WOOD,
                ModTags.Blocks.MYRRH_WOOD,
                ModTags.Blocks.LAUREL_WOOD,
                ModTags.Blocks.CYPRESS_WOOD
        );

        this.tag(BlockTags.MINEABLE_WITH_PICKAXE).add(

                //Crimson
                ModBlocks.CRIMSON_DIAMOND_BLOCK.get(),
                ModBlocks.NETHER_STEEL_ORE.get(),
                ModBlocks.DEEPSLATE_NETHER_STEEL_ORE.get(),
                ModBlocks.NETHER_STEEL_BLOCK.get(),
                ModBlocks.RAW_NETHER_STEEL_BLOCK.get(),
                ModBlocks.SOUND_BLOCK.get(),
                ModBlocks.CRIMSON_STONE.get(),
                ModBlocks.CRIMSON_STONE_STAIRS.get(),
                ModBlocks.CRIMSON_STONE_SLAB.get(),
                ModBlocks.CRIMSON_COBBLESTONE.get(),
                ModBlocks.CRIMSON_COBBLESTONE_STAIRS.get(),
                ModBlocks.CRIMSON_COBBLESTONE_SLAB.get(),
                ModBlocks.CRIMSON_STONE_BRICKS.get(),
                ModBlocks.CRIMSON_STONE_BRICK_STAIRS.get(),
                ModBlocks.CRIMSON_STONE_BRICK_SLAB.get(),
                ModBlocks.CRIMSON_STONE_PRESSURE_PLATE.get(),
                ModBlocks.CRIMSON_STONE_BUTTON.get(),
                ModBlocks.CRIMSON_STONE_FENCE.get(),
                ModBlocks.CRIMSON_STONE_FENCE_GATE.get(),
                ModBlocks.CRIMSON_STONE_WALL.get(),

                ModBlocks.ORICHALCUM_BLOCK.get(),
                ModBlocks.RAW_ORICHALCUM_BLOCK.get(),
                ModBlocks.ORICHALCUM_ORE.get(),
                ModBlocks.DEEPSLATE_ORICHALCUM_ORE.get(),

                ModBlocks.ZINC_BLOCK.get(),
                ModBlocks.RAW_ZINC_BLOCK.get(),
                ModBlocks.ZINC_ORE.get(),
                ModBlocks.DEEPSLATE_ZINC_ORE.get(),

                ModBlocks.TIN_BLOCK.get(),
                ModBlocks.RAW_TIN_BLOCK.get(),
                ModBlocks.TIN_ORE.get(),
                ModBlocks.DEEPSLATE_TIN_ORE.get(),

                ModBlocks.AURICHALCITE_BLOCK.get(),

                ModBlocks.BRASS_BLOCK.get(),

                ModBlocks.BRONZE_BLOCK.get(),

                ModBlocks.ADAMANT_BLOCK.get(),
                ModBlocks.ADAMANT_ORE.get(),
                ModBlocks.DEEPSLATE_ADAMANT_ORE.get()
        );

        this.tag(BlockTags.NEEDS_STONE_TOOL).add(
                ModBlocks.CRIMSON_STONE.get(),
                ModBlocks.CRIMSON_STONE_STAIRS.get(),
                ModBlocks.CRIMSON_STONE_SLAB.get(),
                ModBlocks.CRIMSON_COBBLESTONE.get(),
                ModBlocks.CRIMSON_COBBLESTONE_STAIRS.get(),
                ModBlocks.CRIMSON_COBBLESTONE_SLAB.get(),
                ModBlocks.CRIMSON_STONE_BRICKS.get(),
                ModBlocks.CRIMSON_STONE_BRICK_STAIRS.get(),
                ModBlocks.CRIMSON_STONE_BRICK_SLAB.get(),
                ModBlocks.CRIMSON_STONE_FENCE.get(),
                ModBlocks.CRIMSON_STONE_FENCE_GATE.get(),
                ModBlocks.CRIMSON_STONE_WALL.get(),

                ModBlocks.ORICHALCUM_BLOCK.get(),
                ModBlocks.RAW_ORICHALCUM_BLOCK.get(),
                ModBlocks.ORICHALCUM_ORE.get(),
                ModBlocks.DEEPSLATE_ORICHALCUM_ORE.get(),

                ModBlocks.ZINC_BLOCK.get(),
                ModBlocks.RAW_ZINC_BLOCK.get(),
                ModBlocks.ZINC_ORE.get(),
                ModBlocks.DEEPSLATE_ZINC_ORE.get(),

                ModBlocks.TIN_BLOCK.get(),
                ModBlocks.RAW_TIN_BLOCK.get(),
                ModBlocks.TIN_ORE.get(),
                ModBlocks.DEEPSLATE_TIN_ORE.get(),

                ModBlocks.AURICHALCITE_BLOCK.get(),

                ModBlocks.BRASS_BLOCK.get(),

                ModBlocks.BRONZE_BLOCK.get()
        );

        this.tag(BlockTags.NEEDS_IRON_TOOL).add(
                //Crimson
                ModBlocks.NETHER_STEEL_ORE.get(),
                ModBlocks.DEEPSLATE_NETHER_STEEL_ORE.get(),
                ModBlocks.NETHER_STEEL_BLOCK.get(),
                ModBlocks.RAW_NETHER_STEEL_BLOCK.get(),
                ModBlocks.SOUND_BLOCK.get()
        );

        this.tag(ModTags.Blocks.NEEDS_NETHER_STEEL_TOOL).add(
                //Crimson
                ModBlocks.CRIMSON_DIAMOND_BLOCK.get(),

                ModBlocks.ADAMANT_BLOCK.get(),
                ModBlocks.ADAMANT_ORE.get(),
                ModBlocks.DEEPSLATE_ADAMANT_ORE.get()
        );

        this.tag(ModTags.Blocks.PAXEL_MINEABLE).addTags(
                BlockTags.MINEABLE_WITH_PICKAXE,
                BlockTags.MINEABLE_WITH_SHOVEL,
                BlockTags.MINEABLE_WITH_AXE
        );

        this.tag(BlockTags.FENCES).add(
                ModBlocks.ELDER_WOOD_PLANKS_FENCE.get(),
                ModBlocks.OLIVE_PLANKS_FENCE.get(),
                ModBlocks.MYRRH_PLANKS_FENCE.get(),
                ModBlocks.LAUREL_PLANKS_FENCE.get(),
                ModBlocks.CYPRESS_PLANKS_FENCE.get()
        );
//                .add(ModBlocks.CRIMSON_STONE_FENCE.get())

        this.tag(BlockTags.FENCE_GATES).add(
                ModBlocks.CRIMSON_STONE_FENCE_GATE.get(),
                ModBlocks.ELDER_WOOD_PLANKS_FENCE_GATE.get(),
                ModBlocks.OLIVE_PLANKS_FENCE_GATE.get(),
                ModBlocks.MYRRH_PLANKS_FENCE_GATE.get(),
                ModBlocks.LAUREL_PLANKS_FENCE_GATE.get(),
                ModBlocks.CYPRESS_PLANKS_FENCE_GATE.get()
        );

        this.tag(BlockTags.WALLS).add(
                ModBlocks.CRIMSON_STONE_WALL.get()
        );

        this.tag(BlockTags.LOGS_THAT_BURN).add(
                ModBlocks.ELDER_WOOD_LOG.get(),
                ModBlocks.ELDER_WOOD.get(),
                ModBlocks.STRIPPED_ELDER_WOOD_LOG.get(),
                ModBlocks.STRIPPED_ELDER_WOOD.get(),
                ModBlocks.OLIVE_LOG.get(),
                ModBlocks.OLIVE_WOOD.get(),
                ModBlocks.STRIPPED_OLIVE_LOG.get(),
                ModBlocks.STRIPPED_OLIVE_WOOD.get(),
                ModBlocks.MYRRH_LOG.get(),
                ModBlocks.MYRRH_WOOD.get(),
                ModBlocks.STRIPPED_MYRRH_LOG.get(),
                ModBlocks.STRIPPED_MYRRH_WOOD.get(),
                ModBlocks.LAUREL_LOG.get(),
                ModBlocks.LAUREL_WOOD.get(),
                ModBlocks.STRIPPED_LAUREL_LOG.get(),
                ModBlocks.STRIPPED_LAUREL_WOOD.get(),
                ModBlocks.CYPRESS_LOG.get(),
                ModBlocks.CYPRESS_WOOD.get(),
                ModBlocks.STRIPPED_CYPRESS_LOG.get(),
                ModBlocks.STRIPPED_CYPRESS_WOOD.get()
        );

        this.tag(BlockTags.PLANKS).add(
                ModBlocks.ELDER_WOOD_PLANKS.get(),
                ModBlocks.OLIVE_PLANKS.get(),
                ModBlocks.MYRRH_PLANKS.get(),
                ModBlocks.LAUREL_PLANKS.get(),
                ModBlocks.CYPRESS_PLANKS.get()
        );

        this.tag(BlockTags.WOODEN_DOORS).add(
                ModBlocks.ELDER_WOOD_PLANKS_DOOR.get(),
                ModBlocks.OLIVE_PLANKS_DOOR.get(),
                ModBlocks.MYRRH_PLANKS_DOOR.get(),
                ModBlocks.LAUREL_PLANKS_DOOR.get(),
                ModBlocks.CYPRESS_PLANKS_DOOR.get()
        );

        this.tag(BlockTags.WOODEN_FENCES).add(
                ModBlocks.ELDER_WOOD_PLANKS_FENCE.get(),
                ModBlocks.OLIVE_PLANKS_FENCE.get(),
                ModBlocks.MYRRH_PLANKS_FENCE.get(),
                ModBlocks.LAUREL_PLANKS_FENCE.get(),
                ModBlocks.CYPRESS_PLANKS_FENCE.get()
        );

        this.tag(BlockTags.WOODEN_BUTTONS).add(
                ModBlocks.ELDER_WOOD_PLANKS_BUTTON.get(),
                ModBlocks.OLIVE_PLANKS_BUTTON.get(),
                ModBlocks.MYRRH_PLANKS_BUTTON.get(),
                ModBlocks.LAUREL_PLANKS_BUTTON.get(),
                ModBlocks.CYPRESS_PLANKS_BUTTON.get()
        );

        this.tag(BlockTags.WOODEN_SLABS).add(
                ModBlocks.ELDER_WOOD_PLANKS_SLAB.get(),
                ModBlocks.OLIVE_PLANKS_SLAB.get(),
                ModBlocks.MYRRH_PLANKS_SLAB.get(),
                ModBlocks.LAUREL_PLANKS_SLAB.get(),
                ModBlocks.CYPRESS_PLANKS_SLAB.get()
        );

        this.tag(BlockTags.WOODEN_STAIRS).add(
                ModBlocks.ELDER_WOOD_PLANKS_STAIRS.get(),
                ModBlocks.OLIVE_PLANKS_STAIRS.get(),
                ModBlocks.MYRRH_PLANKS_STAIRS.get(),
                ModBlocks.LAUREL_PLANKS_STAIRS.get(),
                ModBlocks.CYPRESS_PLANKS_STAIRS.get()
        );

        this.tag(BlockTags.WOODEN_PRESSURE_PLATES).add(
                ModBlocks.ELDER_WOOD_PLANKS_PRESSURE_PLATE.get(),
                ModBlocks.OLIVE_PLANKS_PRESSURE_PLATE.get(),
                ModBlocks.MYRRH_PLANKS_PRESSURE_PLATE.get(),
                ModBlocks.LAUREL_PLANKS_PRESSURE_PLATE.get(),
                ModBlocks.CYPRESS_PLANKS_PRESSURE_PLATE.get()
        );

        this.tag(BlockTags.WOODEN_TRAPDOORS).add(
                ModBlocks.ELDER_WOOD_PLANKS_TRAPDOOR.get(),
                ModBlocks.OLIVE_PLANKS_TRAPDOOR.get(),
                ModBlocks.MYRRH_PLANKS_TRAPDOOR.get(),
                ModBlocks.LAUREL_PLANKS_TRAPDOOR.get(),
                ModBlocks.CYPRESS_PLANKS_TRAPDOOR.get()
        );

        this.tag(ModTags.Blocks.ELDER_WOOD).add(
                ModBlocks.ELDER_WOOD_LOG.get(),
                ModBlocks.ELDER_WOOD.get(),
                ModBlocks.STRIPPED_ELDER_WOOD_LOG.get(),
                ModBlocks.STRIPPED_ELDER_WOOD.get(),
                ModBlocks.ELDER_WOOD_LEAVES.get(),
                ModBlocks.ELDER_WOOD_PLANKS.get(),
                ModBlocks.ELDER_WOOD_PLANKS_SLAB.get(),
                ModBlocks.ELDER_WOOD_PLANKS_STAIRS.get(),
                ModBlocks.ELDER_WOOD_PLANKS_PRESSURE_PLATE.get(),
                ModBlocks.ELDER_WOOD_PLANKS_DOOR.get(),
                ModBlocks.ELDER_WOOD_PLANKS_TRAPDOOR.get(),
                ModBlocks.ELDER_WOOD_PLANKS_FENCE.get(),
                ModBlocks.ELDER_WOOD_PLANKS_FENCE_GATE.get(),
                ModBlocks.ELDER_WOOD_PLANKS_BUTTON.get()
        );

        this.tag(ModTags.Blocks.ELDER_WOOD_LOGS).add(
                ModBlocks.ELDER_WOOD_LOG.get(),
                ModBlocks.ELDER_WOOD.get(),
                ModBlocks.STRIPPED_ELDER_WOOD_LOG.get(),
                ModBlocks.STRIPPED_ELDER_WOOD.get()
        );

        this.tag(ModTags.Blocks.ELDER_WOOD_STRIPPED_LOGS).add(
                ModBlocks.STRIPPED_ELDER_WOOD_LOG.get(),
                ModBlocks.STRIPPED_ELDER_WOOD.get()
        );

        this.tag(ModTags.Blocks.OLIVE_WOOD).add(
                ModBlocks.OLIVE_LOG.get(),
                ModBlocks.OLIVE_WOOD.get(),
                ModBlocks.STRIPPED_OLIVE_LOG.get(),
                ModBlocks.STRIPPED_OLIVE_WOOD.get(),
                ModBlocks.OLIVE_LEAVES.get(),
                ModBlocks.OLIVE_PLANKS.get(),
                ModBlocks.OLIVE_PLANKS_SLAB.get(),
                ModBlocks.OLIVE_PLANKS_STAIRS.get(),
                ModBlocks.OLIVE_PLANKS_PRESSURE_PLATE.get(),
                ModBlocks.OLIVE_PLANKS_DOOR.get(),
                ModBlocks.OLIVE_PLANKS_TRAPDOOR.get(),
                ModBlocks.OLIVE_PLANKS_FENCE.get(),
                ModBlocks.OLIVE_PLANKS_FENCE_GATE.get(),
                ModBlocks.OLIVE_PLANKS_BUTTON.get()
        );

        this.tag(ModTags.Blocks.OLIVE_LOGS).add(
                ModBlocks.OLIVE_LOG.get(),
                ModBlocks.OLIVE_WOOD.get(),
                ModBlocks.STRIPPED_OLIVE_LOG.get(),
                ModBlocks.STRIPPED_OLIVE_WOOD.get()
        );

        this.tag(ModTags.Blocks.OLIVE_STRIPPED_LOGS).add(
                ModBlocks.STRIPPED_OLIVE_LOG.get(),
                ModBlocks.STRIPPED_OLIVE_WOOD.get()
        );

        this.tag(ModTags.Blocks.MYRRH_WOOD).add(
                ModBlocks.MYRRH_LOG.get(),
                ModBlocks.MYRRH_WOOD.get(),
                ModBlocks.STRIPPED_MYRRH_LOG.get(),
                ModBlocks.STRIPPED_MYRRH_WOOD.get(),
                ModBlocks.MYRRH_LEAVES.get(),
                ModBlocks.MYRRH_PLANKS.get(),
                ModBlocks.MYRRH_PLANKS_SLAB.get(),
                ModBlocks.MYRRH_PLANKS_STAIRS.get(),
                ModBlocks.MYRRH_PLANKS_PRESSURE_PLATE.get(),
                ModBlocks.MYRRH_PLANKS_DOOR.get(),
                ModBlocks.MYRRH_PLANKS_TRAPDOOR.get(),
                ModBlocks.MYRRH_PLANKS_FENCE.get(),
                ModBlocks.MYRRH_PLANKS_FENCE_GATE.get(),
                ModBlocks.MYRRH_PLANKS_BUTTON.get()
        );

        this.tag(ModTags.Blocks.MYRRH_LOGS).add(
                ModBlocks.MYRRH_LOG.get(),
                ModBlocks.MYRRH_WOOD.get(),
                ModBlocks.STRIPPED_MYRRH_LOG.get(),
                ModBlocks.STRIPPED_MYRRH_WOOD.get()
        );

        this.tag(ModTags.Blocks.MYRRH_STRIPPED_LOGS).add(
                ModBlocks.STRIPPED_MYRRH_LOG.get(),
                ModBlocks.STRIPPED_MYRRH_WOOD.get()
        );

        this.tag(ModTags.Blocks.LAUREL_WOOD).add(
                ModBlocks.LAUREL_LOG.get(),
                ModBlocks.LAUREL_WOOD.get(),
                ModBlocks.STRIPPED_LAUREL_LOG.get(),
                ModBlocks.STRIPPED_LAUREL_WOOD.get(),
                ModBlocks.LAUREL_LEAVES.get(),
                ModBlocks.LAUREL_PLANKS.get(),
                ModBlocks.LAUREL_PLANKS_SLAB.get(),
                ModBlocks.LAUREL_PLANKS_STAIRS.get(),
                ModBlocks.LAUREL_PLANKS_PRESSURE_PLATE.get(),
                ModBlocks.LAUREL_PLANKS_DOOR.get(),
                ModBlocks.LAUREL_PLANKS_TRAPDOOR.get(),
                ModBlocks.LAUREL_PLANKS_FENCE.get(),
                ModBlocks.LAUREL_PLANKS_FENCE_GATE.get(),
                ModBlocks.LAUREL_PLANKS_BUTTON.get()
        );

        this.tag(ModTags.Blocks.LAUREL_LOGS).add(
                ModBlocks.LAUREL_LOG.get(),
                ModBlocks.LAUREL_WOOD.get(),
                ModBlocks.STRIPPED_LAUREL_LOG.get(),
                ModBlocks.STRIPPED_LAUREL_WOOD.get()
        );

        this.tag(ModTags.Blocks.LAUREL_STRIPPED_LOGS).add(
                ModBlocks.STRIPPED_LAUREL_LOG.get(),
                ModBlocks.STRIPPED_LAUREL_WOOD.get()
        );

        this.tag(ModTags.Blocks.CYPRESS_WOOD).add(
                ModBlocks.CYPRESS_LOG.get(),
                ModBlocks.CYPRESS_WOOD.get(),
                ModBlocks.STRIPPED_CYPRESS_LOG.get(),
                ModBlocks.STRIPPED_CYPRESS_WOOD.get(),
                ModBlocks.CYPRESS_LEAVES.get(),
                ModBlocks.CYPRESS_PLANKS.get(),
                ModBlocks.CYPRESS_PLANKS_SLAB.get(),
                ModBlocks.CYPRESS_PLANKS_STAIRS.get(),
                ModBlocks.CYPRESS_PLANKS_PRESSURE_PLATE.get(),
                ModBlocks.CYPRESS_PLANKS_DOOR.get(),
                ModBlocks.CYPRESS_PLANKS_TRAPDOOR.get(),
                ModBlocks.CYPRESS_PLANKS_FENCE.get(),
                ModBlocks.CYPRESS_PLANKS_FENCE_GATE.get(),
                ModBlocks.CYPRESS_PLANKS_BUTTON.get()
        );

        this.tag(ModTags.Blocks.CYPRESS_LOGS).add(
                ModBlocks.CYPRESS_LOG.get(),
                ModBlocks.CYPRESS_WOOD.get(),
                ModBlocks.STRIPPED_CYPRESS_LOG.get(),
                ModBlocks.STRIPPED_CYPRESS_WOOD.get()
        );

        this.tag(ModTags.Blocks.CYPRESS_STRIPPED_LOGS).add(
                ModBlocks.STRIPPED_CYPRESS_LOG.get(),
                ModBlocks.STRIPPED_CYPRESS_WOOD.get()
        );
    }

    @Override
    public String getName() {
        return "Block Tags";
    }
}
