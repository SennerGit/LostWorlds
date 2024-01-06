package net.sen.lostworlds.datagen.tag;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.sen.lostworlds.LostWorlds;
import net.sen.lostworlds.LostWorldsConstants;
import net.sen.lostworlds.block.ModBlocks;
import net.sen.lostworlds.util.ModTags;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagGenerator extends BlockTagsProvider {
    public ModBlockTagGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, LostWorldsConstants.MODID, existingFileHelper);
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
                Blocks.STONE,
                ModBlocks.NIDAVELLIR_SOFT_STONE.get(),
                ModBlocks.NIDAVELLIR_HARD_STONE.get(),
                ModBlocks.NIDAVELLIR_ENHANCED_STONE.get(),
                ModBlocks.NIDAVELLIR_DEEPSLATE_STONE.get(),
                ModBlocks.NIDAVELLIR_CRIMSON_STONE.get()
        );

        this.tag(BlockTags.MINEABLE_WITH_AXE).addTags(
                ModTags.Blocks.ELDER_WOOD,
                ModTags.Blocks.OLIVE_WOOD,
                ModTags.Blocks.MYRRH_WOOD,
                ModTags.Blocks.LAUREL_WOOD,
                ModTags.Blocks.CYPRESS_WOOD
        );

        this.tag(BlockTags.MINEABLE_WITH_PICKAXE).add(
                ModBlocks.NIDAVELLIR_SOFT_STONE.get(),
                ModBlocks.NIDAVELLIR_SOFT_STONE_STAIRS.get(),
                ModBlocks.NIDAVELLIR_SOFT_STONE_SLAB.get(),
                ModBlocks.NIDAVELLIR_SOFT_STONE_PRESSURE_PLATE.get(),
                ModBlocks.NIDAVELLIR_SOFT_STONE_BUTTON.get(),
                ModBlocks.NIDAVELLIR_SOFT_STONE_WALL.get(),
                ModBlocks.NIDAVELLIR_SOFT_SMOOTH_STONE.get(),
                ModBlocks.NIDAVELLIR_SOFT_COBBLESTONE.get(),
                ModBlocks.NIDAVELLIR_SOFT_COBBLESTONE_STAIRS.get(),
                ModBlocks.NIDAVELLIR_SOFT_COBBLESTONE_SLAB.get(),
                ModBlocks.NIDAVELLIR_SOFT_COBBLESTONE_WALL.get(),
                ModBlocks.NIDAVELLIR_SOFT_COBBLESTONE_MOSSY.get(),
                ModBlocks.NIDAVELLIR_SOFT_STONE_BRICKS.get(),
                ModBlocks.NIDAVELLIR_SOFT_STONE_BRICKS_STAIRS.get(),
                ModBlocks.NIDAVELLIR_SOFT_STONE_BRICKS_SLAB.get(),
                ModBlocks.NIDAVELLIR_SOFT_STONE_BRICKS_WALL.get(),
                ModBlocks.NIDAVELLIR_SOFT_STONE_BRICKS_MOSSY.get(),
                ModBlocks.NIDAVELLIR_SOFT_STONE_BRICKS_CRACKED.get(),
                ModBlocks.NIDAVELLIR_SOFT_STONE_BRICKS_CHISELED.get(),

                ModBlocks.NIDAVELLIR_SOFT_STONE_IRON_ORE.get(),
                ModBlocks.NIDAVELLIR_SOFT_STONE_GOLD_ORE.get(),
                ModBlocks.NIDAVELLIR_SOFT_STONE_COPPER_ORE.get(),
                ModBlocks.NIDAVELLIR_SOFT_STONE_TIN_ORE.get(),
                ModBlocks.NIDAVELLIR_SOFT_STONE_ZINC_ORE.get(),
                ModBlocks.NIDAVELLIR_SOFT_STONE_DIAMOND_ORE.get(),
                ModBlocks.NIDAVELLIR_SOFT_STONE_EMERALD_ORE.get(),
                ModBlocks.NIDAVELLIR_SOFT_STONE_COAL_ORE.get(),
                ModBlocks.NIDAVELLIR_SOFT_STONE_REDSTONE_ORE.get(),
                ModBlocks.NIDAVELLIR_SOFT_STONE_LAPIS_ORE.get(),
                ModBlocks.NIDAVELLIR_SOFT_STONE_AQUAMARINE_ORE.get(),
                ModBlocks.NIDAVELLIR_SOFT_STONE_OPAL_ORE.get(),
                ModBlocks.NIDAVELLIR_SOFT_STONE_RUBY_ORE.get(),

                ModBlocks.NIDAVELLIR_SOFT_STONE_IRON_ORE_CLUSTER.get(),
                ModBlocks.NIDAVELLIR_SOFT_STONE_GOLD_ORE_CLUSTER.get(),
                ModBlocks.NIDAVELLIR_SOFT_STONE_COPPER_ORE_CLUSTER.get(),
                ModBlocks.NIDAVELLIR_SOFT_STONE_TIN_ORE_CLUSTER.get(),
                ModBlocks.NIDAVELLIR_SOFT_STONE_ZINC_ORE_CLUSTER.get(),
                ModBlocks.NIDAVELLIR_SOFT_STONE_DIAMOND_ORE_CLUSTER.get(),
                ModBlocks.NIDAVELLIR_SOFT_STONE_EMERALD_ORE_CLUSTER.get(),
                ModBlocks.NIDAVELLIR_SOFT_STONE_COAL_ORE_CLUSTER.get(),
                ModBlocks.NIDAVELLIR_SOFT_STONE_REDSTONE_ORE_CLUSTER.get(),
                ModBlocks.NIDAVELLIR_SOFT_STONE_LAPIS_ORE_CLUSTER.get(),
                ModBlocks.NIDAVELLIR_SOFT_STONE_AQUAMARINE_ORE_CLUSTER.get(),
                ModBlocks.NIDAVELLIR_SOFT_STONE_OPAL_ORE_CLUSTER.get(),
                ModBlocks.NIDAVELLIR_SOFT_STONE_RUBY_ORE_CLUSTER.get(),

                ModBlocks.NIDAVELLIR_HARD_STONE.get(),
                ModBlocks.NIDAVELLIR_HARD_STONE_STAIRS.get(),
                ModBlocks.NIDAVELLIR_HARD_STONE_SLAB.get(),
                ModBlocks.NIDAVELLIR_HARD_STONE_PRESSURE_PLATE.get(),
                ModBlocks.NIDAVELLIR_HARD_STONE_BUTTON.get(),
                ModBlocks.NIDAVELLIR_HARD_STONE_WALL.get(),
                ModBlocks.NIDAVELLIR_HARD_SMOOTH_STONE.get(),
                ModBlocks.NIDAVELLIR_HARD_COBBLESTONE.get(),
                ModBlocks.NIDAVELLIR_HARD_COBBLESTONE_STAIRS.get(),
                ModBlocks.NIDAVELLIR_HARD_COBBLESTONE_SLAB.get(),
                ModBlocks.NIDAVELLIR_HARD_COBBLESTONE_WALL.get(),
                ModBlocks.NIDAVELLIR_HARD_COBBLESTONE_MOSSY.get(),
                ModBlocks.NIDAVELLIR_HARD_STONE_BRICKS.get(),
                ModBlocks.NIDAVELLIR_HARD_STONE_BRICKS_STAIRS.get(),
                ModBlocks.NIDAVELLIR_HARD_STONE_BRICKS_SLAB.get(),
                ModBlocks.NIDAVELLIR_HARD_STONE_BRICKS_WALL.get(),
                ModBlocks.NIDAVELLIR_HARD_STONE_BRICKS_MOSSY.get(),
                ModBlocks.NIDAVELLIR_HARD_STONE_BRICKS_CRACKED.get(),
                ModBlocks.NIDAVELLIR_HARD_STONE_BRICKS_CHISELED.get(),

                ModBlocks.NIDAVELLIR_HARD_STONE_IRON_ORE.get(),
                ModBlocks.NIDAVELLIR_HARD_STONE_GOLD_ORE.get(),
                ModBlocks.NIDAVELLIR_HARD_STONE_COPPER_ORE.get(),
                ModBlocks.NIDAVELLIR_HARD_STONE_TIN_ORE.get(),
                ModBlocks.NIDAVELLIR_HARD_STONE_ZINC_ORE.get(),
                ModBlocks.NIDAVELLIR_HARD_STONE_DIAMOND_ORE.get(),
                ModBlocks.NIDAVELLIR_HARD_STONE_EMERALD_ORE.get(),
                ModBlocks.NIDAVELLIR_HARD_STONE_COAL_ORE.get(),
                ModBlocks.NIDAVELLIR_HARD_STONE_REDSTONE_ORE.get(),
                ModBlocks.NIDAVELLIR_HARD_STONE_LAPIS_ORE.get(),
                ModBlocks.NIDAVELLIR_HARD_STONE_AQUAMARINE_ORE.get(),
                ModBlocks.NIDAVELLIR_HARD_STONE_OPAL_ORE.get(),
                ModBlocks.NIDAVELLIR_HARD_STONE_RUBY_ORE.get(),

                ModBlocks.NIDAVELLIR_HARD_STONE_IRON_ORE_CLUSTER.get(),
                ModBlocks.NIDAVELLIR_HARD_STONE_GOLD_ORE_CLUSTER.get(),
                ModBlocks.NIDAVELLIR_HARD_STONE_COPPER_ORE_CLUSTER.get(),
                ModBlocks.NIDAVELLIR_HARD_STONE_TIN_ORE_CLUSTER.get(),
                ModBlocks.NIDAVELLIR_HARD_STONE_ZINC_ORE_CLUSTER.get(),
                ModBlocks.NIDAVELLIR_HARD_STONE_DIAMOND_ORE_CLUSTER.get(),
                ModBlocks.NIDAVELLIR_HARD_STONE_EMERALD_ORE_CLUSTER.get(),
                ModBlocks.NIDAVELLIR_HARD_STONE_COAL_ORE_CLUSTER.get(),
                ModBlocks.NIDAVELLIR_HARD_STONE_REDSTONE_ORE_CLUSTER.get(),
                ModBlocks.NIDAVELLIR_HARD_STONE_LAPIS_ORE_CLUSTER.get(),
                ModBlocks.NIDAVELLIR_HARD_STONE_AQUAMARINE_ORE_CLUSTER.get(),
                ModBlocks.NIDAVELLIR_HARD_STONE_OPAL_ORE_CLUSTER.get(),
                ModBlocks.NIDAVELLIR_HARD_STONE_RUBY_ORE_CLUSTER.get(),

                ModBlocks.NIDAVELLIR_ENHANCED_STONE.get(),
                ModBlocks.NIDAVELLIR_ENHANCED_STONE_STAIRS.get(),
                ModBlocks.NIDAVELLIR_ENHANCED_STONE_SLAB.get(),
                ModBlocks.NIDAVELLIR_ENHANCED_STONE_PRESSURE_PLATE.get(),
                ModBlocks.NIDAVELLIR_ENHANCED_STONE_BUTTON.get(),
                ModBlocks.NIDAVELLIR_ENHANCED_STONE_WALL.get(),
                ModBlocks.NIDAVELLIR_ENHANCED_SMOOTH_STONE.get(),
                ModBlocks.NIDAVELLIR_ENHANCED_COBBLESTONE.get(),
                ModBlocks.NIDAVELLIR_ENHANCED_COBBLESTONE_STAIRS.get(),
                ModBlocks.NIDAVELLIR_ENHANCED_COBBLESTONE_SLAB.get(),
                ModBlocks.NIDAVELLIR_ENHANCED_COBBLESTONE_WALL.get(),
                ModBlocks.NIDAVELLIR_ENHANCED_COBBLESTONE_MOSSY.get(),
                ModBlocks.NIDAVELLIR_ENHANCED_STONE_BRICKS.get(),
                ModBlocks.NIDAVELLIR_ENHANCED_STONE_BRICKS_STAIRS.get(),
                ModBlocks.NIDAVELLIR_ENHANCED_STONE_BRICKS_SLAB.get(),
                ModBlocks.NIDAVELLIR_ENHANCED_STONE_BRICKS_WALL.get(),
                ModBlocks.NIDAVELLIR_ENHANCED_STONE_BRICKS_MOSSY.get(),
                ModBlocks.NIDAVELLIR_ENHANCED_STONE_BRICKS_CRACKED.get(),
                ModBlocks.NIDAVELLIR_ENHANCED_STONE_BRICKS_CHISELED.get(),

                ModBlocks.NIDAVELLIR_ENHANCED_STONE_IRON_ORE.get(),
                ModBlocks.NIDAVELLIR_ENHANCED_STONE_GOLD_ORE.get(),
                ModBlocks.NIDAVELLIR_ENHANCED_STONE_COPPER_ORE.get(),
                ModBlocks.NIDAVELLIR_ENHANCED_STONE_TIN_ORE.get(),
                ModBlocks.NIDAVELLIR_ENHANCED_STONE_ZINC_ORE.get(),
                ModBlocks.NIDAVELLIR_ENHANCED_STONE_DIAMOND_ORE.get(),
                ModBlocks.NIDAVELLIR_ENHANCED_STONE_EMERALD_ORE.get(),
                ModBlocks.NIDAVELLIR_ENHANCED_STONE_COAL_ORE.get(),
                ModBlocks.NIDAVELLIR_ENHANCED_STONE_REDSTONE_ORE.get(),
                ModBlocks.NIDAVELLIR_ENHANCED_STONE_LAPIS_ORE.get(),
                ModBlocks.NIDAVELLIR_ENHANCED_STONE_AQUAMARINE_ORE.get(),
                ModBlocks.NIDAVELLIR_ENHANCED_STONE_OPAL_ORE.get(),
                ModBlocks.NIDAVELLIR_ENHANCED_STONE_RUBY_ORE.get(),

                ModBlocks.NIDAVELLIR_ENHANCED_STONE_IRON_ORE_CLUSTER.get(),
                ModBlocks.NIDAVELLIR_ENHANCED_STONE_GOLD_ORE_CLUSTER.get(),
                ModBlocks.NIDAVELLIR_ENHANCED_STONE_COPPER_ORE_CLUSTER.get(),
                ModBlocks.NIDAVELLIR_ENHANCED_STONE_TIN_ORE_CLUSTER.get(),
                ModBlocks.NIDAVELLIR_ENHANCED_STONE_ZINC_ORE_CLUSTER.get(),
                ModBlocks.NIDAVELLIR_ENHANCED_STONE_DIAMOND_ORE_CLUSTER.get(),
                ModBlocks.NIDAVELLIR_ENHANCED_STONE_EMERALD_ORE_CLUSTER.get(),
                ModBlocks.NIDAVELLIR_ENHANCED_STONE_COAL_ORE_CLUSTER.get(),
                ModBlocks.NIDAVELLIR_ENHANCED_STONE_REDSTONE_ORE_CLUSTER.get(),
                ModBlocks.NIDAVELLIR_ENHANCED_STONE_LAPIS_ORE_CLUSTER.get(),
                ModBlocks.NIDAVELLIR_ENHANCED_STONE_AQUAMARINE_ORE_CLUSTER.get(),
                ModBlocks.NIDAVELLIR_ENHANCED_STONE_OPAL_ORE_CLUSTER.get(),
                ModBlocks.NIDAVELLIR_ENHANCED_STONE_RUBY_ORE_CLUSTER.get(),

                ModBlocks.NIDAVELLIR_DEEPSLATE_STONE.get(),
                ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_STAIRS.get(),
                ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_SLAB.get(),
                ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_PRESSURE_PLATE.get(),
                ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_BUTTON.get(),
                ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_WALL.get(),
                ModBlocks.NIDAVELLIR_DEEPSLATE_SMOOTH_STONE.get(),
                ModBlocks.NIDAVELLIR_DEEPSLATE_COBBLESTONE.get(),
                ModBlocks.NIDAVELLIR_DEEPSLATE_COBBLESTONE_STAIRS.get(),
                ModBlocks.NIDAVELLIR_DEEPSLATE_COBBLESTONE_SLAB.get(),
                ModBlocks.NIDAVELLIR_DEEPSLATE_COBBLESTONE_WALL.get(),
                ModBlocks.NIDAVELLIR_DEEPSLATE_COBBLESTONE_MOSSY.get(),
                ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_BRICKS.get(),
                ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_BRICKS_STAIRS.get(),
                ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_BRICKS_SLAB.get(),
                ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_BRICKS_WALL.get(),
                ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_BRICKS_MOSSY.get(),
                ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_BRICKS_CRACKED.get(),
                ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_BRICKS_CHISELED.get(),

                ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_IRON_ORE.get(),
                ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_GOLD_ORE.get(),
                ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_COPPER_ORE.get(),
                ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_TIN_ORE.get(),
                ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_ZINC_ORE.get(),
                ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_DIAMOND_ORE.get(),
                ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_EMERALD_ORE.get(),
                ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_COAL_ORE.get(),
                ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_REDSTONE_ORE.get(),
                ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_LAPIS_ORE.get(),
                ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_AQUAMARINE_ORE.get(),
                ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_OPAL_ORE.get(),
                ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_RUBY_ORE.get(),

                ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_IRON_ORE_CLUSTER.get(),
                ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_GOLD_ORE_CLUSTER.get(),
                ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_COPPER_ORE_CLUSTER.get(),
                ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_TIN_ORE_CLUSTER.get(),
                ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_ZINC_ORE_CLUSTER.get(),
                ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_DIAMOND_ORE_CLUSTER.get(),
                ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_EMERALD_ORE_CLUSTER.get(),
                ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_COAL_ORE_CLUSTER.get(),
                ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_REDSTONE_ORE_CLUSTER.get(),
                ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_LAPIS_ORE_CLUSTER.get(),
                ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_AQUAMARINE_ORE_CLUSTER.get(),
                ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_OPAL_ORE_CLUSTER.get(),
                ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_RUBY_ORE_CLUSTER.get(),

                ModBlocks.NIDAVELLIR_CRIMSON_STONE.get(),
                ModBlocks.NIDAVELLIR_CRIMSON_STONE_STAIRS.get(),
                ModBlocks.NIDAVELLIR_CRIMSON_STONE_SLAB.get(),
                ModBlocks.NIDAVELLIR_CRIMSON_STONE_PRESSURE_PLATE.get(),
                ModBlocks.NIDAVELLIR_CRIMSON_STONE_BUTTON.get(),
                ModBlocks.NIDAVELLIR_CRIMSON_STONE_WALL.get(),
                ModBlocks.NIDAVELLIR_CRIMSON_SMOOTH_STONE.get(),
                ModBlocks.NIDAVELLIR_CRIMSON_COBBLESTONE.get(),
                ModBlocks.NIDAVELLIR_CRIMSON_COBBLESTONE_STAIRS.get(),
                ModBlocks.NIDAVELLIR_CRIMSON_COBBLESTONE_SLAB.get(),
                ModBlocks.NIDAVELLIR_CRIMSON_COBBLESTONE_WALL.get(),
                ModBlocks.NIDAVELLIR_CRIMSON_COBBLESTONE_MOSSY.get(),
                ModBlocks.NIDAVELLIR_CRIMSON_STONE_BRICKS.get(),
                ModBlocks.NIDAVELLIR_CRIMSON_STONE_BRICKS_STAIRS.get(),
                ModBlocks.NIDAVELLIR_CRIMSON_STONE_BRICKS_SLAB.get(),
                ModBlocks.NIDAVELLIR_CRIMSON_STONE_BRICKS_WALL.get(),
                ModBlocks.NIDAVELLIR_CRIMSON_STONE_BRICKS_MOSSY.get(),
                ModBlocks.NIDAVELLIR_CRIMSON_STONE_BRICKS_CRACKED.get(),
                ModBlocks.NIDAVELLIR_CRIMSON_STONE_BRICKS_CHISELED.get(),

                ModBlocks.NIDAVELLIR_CRIMSON_STONE_IRON_ORE.get(),
                ModBlocks.NIDAVELLIR_CRIMSON_STONE_GOLD_ORE.get(),
                ModBlocks.NIDAVELLIR_CRIMSON_STONE_COPPER_ORE.get(),
                ModBlocks.NIDAVELLIR_CRIMSON_STONE_TIN_ORE.get(),
                ModBlocks.NIDAVELLIR_CRIMSON_STONE_ZINC_ORE.get(),
                ModBlocks.NIDAVELLIR_CRIMSON_STONE_DIAMOND_ORE.get(),
                ModBlocks.NIDAVELLIR_CRIMSON_STONE_EMERALD_ORE.get(),
                ModBlocks.NIDAVELLIR_CRIMSON_STONE_COAL_ORE.get(),
                ModBlocks.NIDAVELLIR_CRIMSON_STONE_REDSTONE_ORE.get(),
                ModBlocks.NIDAVELLIR_CRIMSON_STONE_LAPIS_ORE.get(),
                ModBlocks.NIDAVELLIR_CRIMSON_STONE_AQUAMARINE_ORE.get(),
                ModBlocks.NIDAVELLIR_CRIMSON_STONE_OPAL_ORE.get(),
                ModBlocks.NIDAVELLIR_CRIMSON_STONE_RUBY_ORE.get(),

                ModBlocks.NIDAVELLIR_CRIMSON_STONE_IRON_ORE_CLUSTER.get(),
                ModBlocks.NIDAVELLIR_CRIMSON_STONE_GOLD_ORE_CLUSTER.get(),
                ModBlocks.NIDAVELLIR_CRIMSON_STONE_COPPER_ORE_CLUSTER.get(),
                ModBlocks.NIDAVELLIR_CRIMSON_STONE_TIN_ORE_CLUSTER.get(),
                ModBlocks.NIDAVELLIR_CRIMSON_STONE_ZINC_ORE_CLUSTER.get(),
                ModBlocks.NIDAVELLIR_CRIMSON_STONE_DIAMOND_ORE_CLUSTER.get(),
                ModBlocks.NIDAVELLIR_CRIMSON_STONE_EMERALD_ORE_CLUSTER.get(),
                ModBlocks.NIDAVELLIR_CRIMSON_STONE_COAL_ORE_CLUSTER.get(),
                ModBlocks.NIDAVELLIR_CRIMSON_STONE_REDSTONE_ORE_CLUSTER.get(),
                ModBlocks.NIDAVELLIR_CRIMSON_STONE_LAPIS_ORE_CLUSTER.get(),
                ModBlocks.NIDAVELLIR_CRIMSON_STONE_AQUAMARINE_ORE_CLUSTER.get(),
                ModBlocks.NIDAVELLIR_CRIMSON_STONE_OPAL_ORE_CLUSTER.get(),
                ModBlocks.NIDAVELLIR_CRIMSON_STONE_RUBY_ORE_CLUSTER.get(),

                ModBlocks.TARTARUS_STONE.get(),
                ModBlocks.TARTARUS_STONE_STAIRS.get(),
                ModBlocks.TARTARUS_STONE_SLAB.get(),
                ModBlocks.TARTARUS_STONE_PRESSURE_PLATE.get(),
                ModBlocks.TARTARUS_STONE_BUTTON.get(),
                ModBlocks.TARTARUS_STONE_WALL.get(),
                ModBlocks.TARTARUS_STONE_SMOOTH_STONE.get(),
                ModBlocks.TARTARUS_STONE_COBBLESTONE.get(),
                ModBlocks.TARTARUS_STONE_COBBLESTONE_STAIRS.get(),
                ModBlocks.TARTARUS_STONE_COBBLESTONE_SLAB.get(),
                ModBlocks.TARTARUS_STONE_COBBLESTONE_WALL.get(),
                ModBlocks.TARTARUS_STONE_COBBLESTONE_MOSSY.get(),
                ModBlocks.TARTARUS_STONE_BRICKS.get(),
                ModBlocks.TARTARUS_STONE_BRICKS_STAIRS.get(),
                ModBlocks.TARTARUS_STONE_BRICKS_SLAB.get(),
                ModBlocks.TARTARUS_STONE_BRICKS_WALL.get(),
                ModBlocks.TARTARUS_STONE_BRICKS_MOSSY.get(),
                ModBlocks.TARTARUS_STONE_BRICKS_CRACKED.get(),
                ModBlocks.TARTARUS_STONE_BRICKS_CHISELED.get(),

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
                ModBlocks.NIDAVELLIR_SOFT_STONE.get(),
                ModBlocks.NIDAVELLIR_SOFT_STONE_STAIRS.get(),
                ModBlocks.NIDAVELLIR_SOFT_STONE_SLAB.get(),
                ModBlocks.NIDAVELLIR_SOFT_STONE_PRESSURE_PLATE.get(),
                ModBlocks.NIDAVELLIR_SOFT_STONE_BUTTON.get(),
                ModBlocks.NIDAVELLIR_SOFT_STONE_WALL.get(),
                ModBlocks.NIDAVELLIR_SOFT_SMOOTH_STONE.get(),
                ModBlocks.NIDAVELLIR_SOFT_COBBLESTONE.get(),
                ModBlocks.NIDAVELLIR_SOFT_COBBLESTONE_STAIRS.get(),
                ModBlocks.NIDAVELLIR_SOFT_COBBLESTONE_SLAB.get(),
                ModBlocks.NIDAVELLIR_SOFT_COBBLESTONE_WALL.get(),
                ModBlocks.NIDAVELLIR_SOFT_COBBLESTONE_MOSSY.get(),
                ModBlocks.NIDAVELLIR_SOFT_STONE_BRICKS.get(),
                ModBlocks.NIDAVELLIR_SOFT_STONE_BRICKS_STAIRS.get(),
                ModBlocks.NIDAVELLIR_SOFT_STONE_BRICKS_SLAB.get(),
                ModBlocks.NIDAVELLIR_SOFT_STONE_BRICKS_WALL.get(),
                ModBlocks.NIDAVELLIR_SOFT_STONE_BRICKS_MOSSY.get(),
                ModBlocks.NIDAVELLIR_SOFT_STONE_BRICKS_CRACKED.get(),
                ModBlocks.NIDAVELLIR_SOFT_STONE_BRICKS_CHISELED.get(),

                ModBlocks.NIDAVELLIR_SOFT_STONE_IRON_ORE.get(),
                ModBlocks.NIDAVELLIR_SOFT_STONE_GOLD_ORE.get(),
                ModBlocks.NIDAVELLIR_SOFT_STONE_COPPER_ORE.get(),
                ModBlocks.NIDAVELLIR_SOFT_STONE_TIN_ORE.get(),
                ModBlocks.NIDAVELLIR_SOFT_STONE_ZINC_ORE.get(),
                ModBlocks.NIDAVELLIR_SOFT_STONE_COAL_ORE.get(),

                ModBlocks.NIDAVELLIR_SOFT_STONE_IRON_ORE_CLUSTER.get(),
                ModBlocks.NIDAVELLIR_SOFT_STONE_GOLD_ORE_CLUSTER.get(),
                ModBlocks.NIDAVELLIR_SOFT_STONE_COPPER_ORE_CLUSTER.get(),
                ModBlocks.NIDAVELLIR_SOFT_STONE_TIN_ORE_CLUSTER.get(),
                ModBlocks.NIDAVELLIR_SOFT_STONE_ZINC_ORE_CLUSTER.get(),
                ModBlocks.NIDAVELLIR_SOFT_STONE_COAL_ORE_CLUSTER.get(),

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
                ModBlocks.NIDAVELLIR_SOFT_STONE_DIAMOND_ORE.get(),
                ModBlocks.NIDAVELLIR_SOFT_STONE_EMERALD_ORE.get(),
                ModBlocks.NIDAVELLIR_SOFT_STONE_REDSTONE_ORE.get(),
                ModBlocks.NIDAVELLIR_SOFT_STONE_LAPIS_ORE.get(),
                ModBlocks.NIDAVELLIR_SOFT_STONE_AQUAMARINE_ORE.get(),
                ModBlocks.NIDAVELLIR_SOFT_STONE_OPAL_ORE.get(),
                ModBlocks.NIDAVELLIR_SOFT_STONE_RUBY_ORE.get(),

                ModBlocks.NIDAVELLIR_SOFT_STONE_DIAMOND_ORE_CLUSTER.get(),
                ModBlocks.NIDAVELLIR_SOFT_STONE_EMERALD_ORE_CLUSTER.get(),
                ModBlocks.NIDAVELLIR_SOFT_STONE_REDSTONE_ORE_CLUSTER.get(),
                ModBlocks.NIDAVELLIR_SOFT_STONE_LAPIS_ORE_CLUSTER.get(),
                ModBlocks.NIDAVELLIR_SOFT_STONE_AQUAMARINE_ORE_CLUSTER.get(),
                ModBlocks.NIDAVELLIR_SOFT_STONE_OPAL_ORE_CLUSTER.get(),
                ModBlocks.NIDAVELLIR_SOFT_STONE_RUBY_ORE_CLUSTER.get(),

                ModBlocks.NIDAVELLIR_HARD_STONE.get(),
                ModBlocks.NIDAVELLIR_HARD_STONE_STAIRS.get(),
                ModBlocks.NIDAVELLIR_HARD_STONE_SLAB.get(),
                ModBlocks.NIDAVELLIR_HARD_STONE_PRESSURE_PLATE.get(),
                ModBlocks.NIDAVELLIR_HARD_STONE_BUTTON.get(),
                ModBlocks.NIDAVELLIR_HARD_STONE_WALL.get(),
                ModBlocks.NIDAVELLIR_HARD_SMOOTH_STONE.get(),
                ModBlocks.NIDAVELLIR_HARD_COBBLESTONE.get(),
                ModBlocks.NIDAVELLIR_HARD_COBBLESTONE_STAIRS.get(),
                ModBlocks.NIDAVELLIR_HARD_COBBLESTONE_SLAB.get(),
                ModBlocks.NIDAVELLIR_HARD_COBBLESTONE_WALL.get(),
                ModBlocks.NIDAVELLIR_HARD_COBBLESTONE_MOSSY.get(),
                ModBlocks.NIDAVELLIR_HARD_STONE_BRICKS.get(),
                ModBlocks.NIDAVELLIR_HARD_STONE_BRICKS_STAIRS.get(),
                ModBlocks.NIDAVELLIR_HARD_STONE_BRICKS_SLAB.get(),
                ModBlocks.NIDAVELLIR_HARD_STONE_BRICKS_WALL.get(),
                ModBlocks.NIDAVELLIR_HARD_STONE_BRICKS_MOSSY.get(),
                ModBlocks.NIDAVELLIR_HARD_STONE_BRICKS_CRACKED.get(),
                ModBlocks.NIDAVELLIR_HARD_STONE_BRICKS_CHISELED.get(),

                ModBlocks.NIDAVELLIR_HARD_STONE_IRON_ORE.get(),
                ModBlocks.NIDAVELLIR_HARD_STONE_GOLD_ORE.get(),
                ModBlocks.NIDAVELLIR_HARD_STONE_COPPER_ORE.get(),
                ModBlocks.NIDAVELLIR_HARD_STONE_TIN_ORE.get(),
                ModBlocks.NIDAVELLIR_HARD_STONE_ZINC_ORE.get(),
                ModBlocks.NIDAVELLIR_HARD_STONE_COAL_ORE.get(),

                ModBlocks.NIDAVELLIR_HARD_STONE_IRON_ORE_CLUSTER.get(),
                ModBlocks.NIDAVELLIR_HARD_STONE_GOLD_ORE_CLUSTER.get(),
                ModBlocks.NIDAVELLIR_HARD_STONE_COPPER_ORE_CLUSTER.get(),
                ModBlocks.NIDAVELLIR_HARD_STONE_TIN_ORE_CLUSTER.get(),
                ModBlocks.NIDAVELLIR_HARD_STONE_ZINC_ORE_CLUSTER.get(),
                ModBlocks.NIDAVELLIR_HARD_STONE_COAL_ORE_CLUSTER.get(),

                ModBlocks.NIDAVELLIR_CRIMSON_STONE.get(),
                ModBlocks.NIDAVELLIR_CRIMSON_STONE_STAIRS.get(),
                ModBlocks.NIDAVELLIR_CRIMSON_STONE_SLAB.get(),
                ModBlocks.NIDAVELLIR_CRIMSON_STONE_PRESSURE_PLATE.get(),
                ModBlocks.NIDAVELLIR_CRIMSON_STONE_BUTTON.get(),
                ModBlocks.NIDAVELLIR_CRIMSON_STONE_WALL.get(),
                ModBlocks.NIDAVELLIR_CRIMSON_SMOOTH_STONE.get(),
                ModBlocks.NIDAVELLIR_CRIMSON_COBBLESTONE.get(),
                ModBlocks.NIDAVELLIR_CRIMSON_COBBLESTONE_STAIRS.get(),
                ModBlocks.NIDAVELLIR_CRIMSON_COBBLESTONE_SLAB.get(),
                ModBlocks.NIDAVELLIR_CRIMSON_COBBLESTONE_WALL.get(),
                ModBlocks.NIDAVELLIR_CRIMSON_COBBLESTONE_MOSSY.get(),
                ModBlocks.NIDAVELLIR_CRIMSON_STONE_BRICKS.get(),
                ModBlocks.NIDAVELLIR_CRIMSON_STONE_BRICKS_STAIRS.get(),
                ModBlocks.NIDAVELLIR_CRIMSON_STONE_BRICKS_SLAB.get(),
                ModBlocks.NIDAVELLIR_CRIMSON_STONE_BRICKS_WALL.get(),
                ModBlocks.NIDAVELLIR_CRIMSON_STONE_BRICKS_MOSSY.get(),
                ModBlocks.NIDAVELLIR_CRIMSON_STONE_BRICKS_CRACKED.get(),
                ModBlocks.NIDAVELLIR_CRIMSON_STONE_BRICKS_CHISELED.get(),

                ModBlocks.NIDAVELLIR_CRIMSON_STONE_IRON_ORE.get(),
                ModBlocks.NIDAVELLIR_CRIMSON_STONE_GOLD_ORE.get(),
                ModBlocks.NIDAVELLIR_CRIMSON_STONE_COPPER_ORE.get(),
                ModBlocks.NIDAVELLIR_CRIMSON_STONE_TIN_ORE.get(),
                ModBlocks.NIDAVELLIR_CRIMSON_STONE_ZINC_ORE.get(),
                ModBlocks.NIDAVELLIR_CRIMSON_STONE_COAL_ORE.get(),

                ModBlocks.NIDAVELLIR_CRIMSON_STONE_IRON_ORE_CLUSTER.get(),
                ModBlocks.NIDAVELLIR_CRIMSON_STONE_GOLD_ORE_CLUSTER.get(),
                ModBlocks.NIDAVELLIR_CRIMSON_STONE_COPPER_ORE_CLUSTER.get(),
                ModBlocks.NIDAVELLIR_CRIMSON_STONE_TIN_ORE_CLUSTER.get(),
                ModBlocks.NIDAVELLIR_CRIMSON_STONE_ZINC_ORE_CLUSTER.get(),
                ModBlocks.NIDAVELLIR_CRIMSON_STONE_COAL_ORE_CLUSTER.get(),

                //Crimson
                ModBlocks.NETHER_STEEL_ORE.get(),
                ModBlocks.DEEPSLATE_NETHER_STEEL_ORE.get(),
                ModBlocks.NETHER_STEEL_BLOCK.get(),
                ModBlocks.RAW_NETHER_STEEL_BLOCK.get(),
                ModBlocks.SOUND_BLOCK.get()
        );

        this.tag(BlockTags.NEEDS_DIAMOND_TOOL).add(
                ModBlocks.NIDAVELLIR_HARD_STONE_DIAMOND_ORE.get(),
                ModBlocks.NIDAVELLIR_HARD_STONE_EMERALD_ORE.get(),
                ModBlocks.NIDAVELLIR_HARD_STONE_REDSTONE_ORE.get(),
                ModBlocks.NIDAVELLIR_HARD_STONE_LAPIS_ORE.get(),
                ModBlocks.NIDAVELLIR_HARD_STONE_AQUAMARINE_ORE.get(),
                ModBlocks.NIDAVELLIR_HARD_STONE_OPAL_ORE.get(),
                ModBlocks.NIDAVELLIR_HARD_STONE_RUBY_ORE.get(),
                ModBlocks.NIDAVELLIR_HARD_STONE_DIAMOND_ORE_CLUSTER.get(),
                ModBlocks.NIDAVELLIR_HARD_STONE_EMERALD_ORE_CLUSTER.get(),
                ModBlocks.NIDAVELLIR_HARD_STONE_REDSTONE_ORE_CLUSTER.get(),
                ModBlocks.NIDAVELLIR_HARD_STONE_LAPIS_ORE_CLUSTER.get(),
                ModBlocks.NIDAVELLIR_HARD_STONE_AQUAMARINE_ORE_CLUSTER.get(),
                ModBlocks.NIDAVELLIR_HARD_STONE_OPAL_ORE_CLUSTER.get(),
                ModBlocks.NIDAVELLIR_HARD_STONE_RUBY_ORE_CLUSTER.get(),

                ModBlocks.NIDAVELLIR_CRIMSON_STONE_DIAMOND_ORE.get(),
                ModBlocks.NIDAVELLIR_CRIMSON_STONE_EMERALD_ORE.get(),
                ModBlocks.NIDAVELLIR_CRIMSON_STONE_REDSTONE_ORE.get(),
                ModBlocks.NIDAVELLIR_CRIMSON_STONE_LAPIS_ORE.get(),
                ModBlocks.NIDAVELLIR_CRIMSON_STONE_AQUAMARINE_ORE.get(),
                ModBlocks.NIDAVELLIR_CRIMSON_STONE_OPAL_ORE.get(),
                ModBlocks.NIDAVELLIR_CRIMSON_STONE_RUBY_ORE.get(),
                ModBlocks.NIDAVELLIR_CRIMSON_STONE_DIAMOND_ORE_CLUSTER.get(),
                ModBlocks.NIDAVELLIR_CRIMSON_STONE_EMERALD_ORE_CLUSTER.get(),
                ModBlocks.NIDAVELLIR_CRIMSON_STONE_REDSTONE_ORE_CLUSTER.get(),
                ModBlocks.NIDAVELLIR_CRIMSON_STONE_LAPIS_ORE_CLUSTER.get(),
                ModBlocks.NIDAVELLIR_CRIMSON_STONE_AQUAMARINE_ORE_CLUSTER.get(),
                ModBlocks.NIDAVELLIR_CRIMSON_STONE_OPAL_ORE_CLUSTER.get(),
                ModBlocks.NIDAVELLIR_CRIMSON_STONE_RUBY_ORE_CLUSTER.get(),

                ModBlocks.NIDAVELLIR_ENHANCED_STONE.get(),
                ModBlocks.NIDAVELLIR_ENHANCED_STONE_STAIRS.get(),
                ModBlocks.NIDAVELLIR_ENHANCED_STONE_SLAB.get(),
                ModBlocks.NIDAVELLIR_ENHANCED_STONE_PRESSURE_PLATE.get(),
                ModBlocks.NIDAVELLIR_ENHANCED_STONE_BUTTON.get(),
                ModBlocks.NIDAVELLIR_ENHANCED_STONE_WALL.get(),
                ModBlocks.NIDAVELLIR_ENHANCED_SMOOTH_STONE.get(),
                ModBlocks.NIDAVELLIR_ENHANCED_COBBLESTONE.get(),
                ModBlocks.NIDAVELLIR_ENHANCED_COBBLESTONE_STAIRS.get(),
                ModBlocks.NIDAVELLIR_ENHANCED_COBBLESTONE_SLAB.get(),
                ModBlocks.NIDAVELLIR_ENHANCED_COBBLESTONE_WALL.get(),
                ModBlocks.NIDAVELLIR_ENHANCED_COBBLESTONE_MOSSY.get(),
                ModBlocks.NIDAVELLIR_ENHANCED_STONE_BRICKS.get(),
                ModBlocks.NIDAVELLIR_ENHANCED_STONE_BRICKS_STAIRS.get(),
                ModBlocks.NIDAVELLIR_ENHANCED_STONE_BRICKS_SLAB.get(),
                ModBlocks.NIDAVELLIR_ENHANCED_STONE_BRICKS_WALL.get(),
                ModBlocks.NIDAVELLIR_ENHANCED_STONE_BRICKS_MOSSY.get(),
                ModBlocks.NIDAVELLIR_ENHANCED_STONE_BRICKS_CRACKED.get(),
                ModBlocks.NIDAVELLIR_ENHANCED_STONE_BRICKS_CHISELED.get(),

                ModBlocks.NIDAVELLIR_ENHANCED_STONE_IRON_ORE.get(),
                ModBlocks.NIDAVELLIR_ENHANCED_STONE_GOLD_ORE.get(),
                ModBlocks.NIDAVELLIR_ENHANCED_STONE_COPPER_ORE.get(),
                ModBlocks.NIDAVELLIR_ENHANCED_STONE_TIN_ORE.get(),
                ModBlocks.NIDAVELLIR_ENHANCED_STONE_ZINC_ORE.get(),
                ModBlocks.NIDAVELLIR_ENHANCED_STONE_COAL_ORE.get(),

                ModBlocks.NIDAVELLIR_ENHANCED_STONE_IRON_ORE_CLUSTER.get(),
                ModBlocks.NIDAVELLIR_ENHANCED_STONE_GOLD_ORE_CLUSTER.get(),
                ModBlocks.NIDAVELLIR_ENHANCED_STONE_COPPER_ORE_CLUSTER.get(),
                ModBlocks.NIDAVELLIR_ENHANCED_STONE_TIN_ORE_CLUSTER.get(),
                ModBlocks.NIDAVELLIR_ENHANCED_STONE_ZINC_ORE_CLUSTER.get(),
                ModBlocks.NIDAVELLIR_ENHANCED_STONE_COAL_ORE_CLUSTER.get(),

                ModBlocks.NIDAVELLIR_DEEPSLATE_STONE.get(),
                ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_STAIRS.get(),
                ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_SLAB.get(),
                ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_PRESSURE_PLATE.get(),
                ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_BUTTON.get(),
                ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_WALL.get(),
                ModBlocks.NIDAVELLIR_DEEPSLATE_SMOOTH_STONE.get(),
                ModBlocks.NIDAVELLIR_DEEPSLATE_COBBLESTONE.get(),
                ModBlocks.NIDAVELLIR_DEEPSLATE_COBBLESTONE_STAIRS.get(),
                ModBlocks.NIDAVELLIR_DEEPSLATE_COBBLESTONE_SLAB.get(),
                ModBlocks.NIDAVELLIR_DEEPSLATE_COBBLESTONE_WALL.get(),
                ModBlocks.NIDAVELLIR_DEEPSLATE_COBBLESTONE_MOSSY.get(),
                ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_BRICKS.get(),
                ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_BRICKS_STAIRS.get(),
                ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_BRICKS_SLAB.get(),
                ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_BRICKS_WALL.get(),
                ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_BRICKS_MOSSY.get(),
                ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_BRICKS_CRACKED.get(),
                ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_BRICKS_CHISELED.get(),

                ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_IRON_ORE.get(),
                ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_GOLD_ORE.get(),
                ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_COPPER_ORE.get(),
                ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_TIN_ORE.get(),
                ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_ZINC_ORE.get(),
                ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_COAL_ORE.get(),

                ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_IRON_ORE_CLUSTER.get(),
                ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_GOLD_ORE_CLUSTER.get(),
                ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_COPPER_ORE_CLUSTER.get(),
                ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_TIN_ORE_CLUSTER.get(),
                ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_ZINC_ORE_CLUSTER.get(),
                ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_COAL_ORE_CLUSTER.get(),

                ModBlocks.TARTARUS_STONE.get(),
                ModBlocks.TARTARUS_STONE_STAIRS.get(),
                ModBlocks.TARTARUS_STONE_SLAB.get(),
                ModBlocks.TARTARUS_STONE_PRESSURE_PLATE.get(),
                ModBlocks.TARTARUS_STONE_BUTTON.get(),
                ModBlocks.TARTARUS_STONE_WALL.get(),
                ModBlocks.TARTARUS_STONE_SMOOTH_STONE.get(),
                ModBlocks.TARTARUS_STONE_COBBLESTONE.get(),
                ModBlocks.TARTARUS_STONE_COBBLESTONE_STAIRS.get(),
                ModBlocks.TARTARUS_STONE_COBBLESTONE_SLAB.get(),
                ModBlocks.TARTARUS_STONE_COBBLESTONE_WALL.get(),
                ModBlocks.TARTARUS_STONE_COBBLESTONE_MOSSY.get(),
                ModBlocks.TARTARUS_STONE_BRICKS.get(),
                ModBlocks.TARTARUS_STONE_BRICKS_STAIRS.get(),
                ModBlocks.TARTARUS_STONE_BRICKS_SLAB.get(),
                ModBlocks.TARTARUS_STONE_BRICKS_WALL.get(),
                ModBlocks.TARTARUS_STONE_BRICKS_MOSSY.get(),
                ModBlocks.TARTARUS_STONE_BRICKS_CRACKED.get(),
                ModBlocks.TARTARUS_STONE_BRICKS_CHISELED.get()
        );

        this.tag(ModTags.Blocks.NEEDS_NETHERITE_TOOL).add(
                ModBlocks.NIDAVELLIR_ENHANCED_STONE_DIAMOND_ORE.get(),
                ModBlocks.NIDAVELLIR_ENHANCED_STONE_EMERALD_ORE.get(),
                ModBlocks.NIDAVELLIR_ENHANCED_STONE_REDSTONE_ORE.get(),
                ModBlocks.NIDAVELLIR_ENHANCED_STONE_LAPIS_ORE.get(),
                ModBlocks.NIDAVELLIR_ENHANCED_STONE_AQUAMARINE_ORE.get(),
                ModBlocks.NIDAVELLIR_ENHANCED_STONE_OPAL_ORE.get(),
                ModBlocks.NIDAVELLIR_ENHANCED_STONE_RUBY_ORE.get(),
                ModBlocks.NIDAVELLIR_ENHANCED_STONE_DIAMOND_ORE_CLUSTER.get(),
                ModBlocks.NIDAVELLIR_ENHANCED_STONE_EMERALD_ORE_CLUSTER.get(),
                ModBlocks.NIDAVELLIR_ENHANCED_STONE_REDSTONE_ORE_CLUSTER.get(),
                ModBlocks.NIDAVELLIR_ENHANCED_STONE_LAPIS_ORE_CLUSTER.get(),
                ModBlocks.NIDAVELLIR_ENHANCED_STONE_AQUAMARINE_ORE_CLUSTER.get(),
                ModBlocks.NIDAVELLIR_ENHANCED_STONE_OPAL_ORE_CLUSTER.get(),
                ModBlocks.NIDAVELLIR_ENHANCED_STONE_RUBY_ORE_CLUSTER.get(),

                ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_DIAMOND_ORE.get(),
                ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_EMERALD_ORE.get(),
                ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_REDSTONE_ORE.get(),
                ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_LAPIS_ORE.get(),
                ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_AQUAMARINE_ORE.get(),
                ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_OPAL_ORE.get(),
                ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_RUBY_ORE.get(),
                ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_DIAMOND_ORE_CLUSTER.get(),
                ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_EMERALD_ORE_CLUSTER.get(),
                ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_REDSTONE_ORE_CLUSTER.get(),
                ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_LAPIS_ORE_CLUSTER.get(),
                ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_AQUAMARINE_ORE_CLUSTER.get(),
                ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_OPAL_ORE_CLUSTER.get(),
                ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_RUBY_ORE_CLUSTER.get()
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
                ModBlocks.CRIMSON_STONE_WALL.get(),
                ModBlocks.NIDAVELLIR_SOFT_STONE_WALL.get(),
                ModBlocks.NIDAVELLIR_SOFT_COBBLESTONE_WALL.get(),
                ModBlocks.NIDAVELLIR_SOFT_STONE_BRICKS_WALL.get(),
                ModBlocks.NIDAVELLIR_HARD_STONE_WALL.get(),
                ModBlocks.NIDAVELLIR_HARD_COBBLESTONE_WALL.get(),
                ModBlocks.NIDAVELLIR_HARD_STONE_BRICKS_WALL.get(),
                ModBlocks.NIDAVELLIR_ENHANCED_STONE_WALL.get(),
                ModBlocks.NIDAVELLIR_ENHANCED_COBBLESTONE_WALL.get(),
                ModBlocks.NIDAVELLIR_ENHANCED_STONE_BRICKS_WALL.get(),
                ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_WALL.get(),
                ModBlocks.NIDAVELLIR_DEEPSLATE_COBBLESTONE_WALL.get(),
                ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_BRICKS_WALL.get(),
                ModBlocks.NIDAVELLIR_CRIMSON_STONE_WALL.get(),
                ModBlocks.NIDAVELLIR_CRIMSON_COBBLESTONE_WALL.get(),
                ModBlocks.NIDAVELLIR_CRIMSON_STONE_BRICKS_WALL.get(),
                ModBlocks.TARTARUS_STONE_WALL.get(),
                ModBlocks.TARTARUS_STONE_COBBLESTONE_WALL.get(),
                ModBlocks.TARTARUS_STONE_BRICKS_WALL.get()
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

        this.tag(ModTags.Blocks.MUSHROOMS).add(
                Blocks.BROWN_MUSHROOM,
                Blocks.RED_MUSHROOM,
                ModBlocks.POINT_MUSHROOM_BLOCK.get(),
                ModBlocks.WITCHES_MUSHROOM_BLOCK.get(),
                ModBlocks.ROYAL_BLUE_MUSHROOM_BLOCK.get(),
                ModBlocks.SHORT_TOP_MUSHROOM_BLOCK.get(),
                ModBlocks.SPECTRAL_MUSHROOM_BLOCK.get(),
                ModBlocks.SHADE_MUSHROOM_BLOCK.get(),
                ModBlocks.CAP_MUSHROOM_BLOCK.get()
        );
    }

    @Override
    public String getName() {
        return "Block Tags";
    }
}
