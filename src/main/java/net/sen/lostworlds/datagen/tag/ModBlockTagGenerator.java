package net.sen.lostworlds.datagen.tag;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.sen.lostworlds.LostWorldsApi;
import net.sen.lostworlds.block.*;
import net.sen.lostworlds.util.ModTags;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagGenerator extends BlockTagsProvider {
    public ModBlockTagGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, LostWorldsApi.MODID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
//        this.tag(ModTags.Blocks.MAGICAL_BLOCK).add(
//        ).addTag(
//                Tags.Blocks.ORES
//        );

        this.tag(BlockTags.PORTALS).add(
                UnderworldBlocks.UNDERWORLD_PORTAL.get(),
                NidavellirBlocks.NIDAVELLIR_PORTAL.get(),
                AlfheimrBlocks.ALFHEIMR_PORTAL.get(),
                AtlantisBlocks.ATLANTIS_PORTAL.get(),
                SkyopiaBlocks.SKYOPIA_PORTAL.get()
        );

        this.tag(ModTags.Blocks.UNDERWORLD_PORTAL_FRAME_BLOCKS).add(
                UnderworldBlocks.UNDERWORLD_PORTAL_FRAME.get()
        );

        this.tag(ModTags.Blocks.NIDAVELLIR_PORTAL_FRAME_BLOCKS).add(
                NidavellirBlocks.NIDAVELLIR_PORTAL_FRAME.get()
        );

        this.tag(ModTags.Blocks.ALFHEIMR_PORTAL_FRAME_BLOCKS).add(
                AlfheimrBlocks.ALFHEIMR_PORTAL_FRAME.get()
        );

        this.tag(ModTags.Blocks.ATLANTIS_PORTAL_FRAME_BLOCKS).add(
                AtlantisBlocks.ATLANTIS_PORTAL_FRAME.get()
        );

        this.tag(ModTags.Blocks.SKYOPIA_PORTAL_FRAME_BLOCKS).add(
                SkyopiaBlocks.SKYOPIA_PORTAL_FRAME.get()
        );

        this.tag(ModTags.Blocks.MYSTIC_GATEWAYS_PORTAL_FRAME_BLOCKS).add(
                ModBlocks.MYSTIC_GATEWAYS_PORTAL_FRAME.get(),
                ModBlocks.MYSTIC_GATEWAYS_PORTAL_CONTROLLER.get()//Temp
        );

        this.tag(ModTags.Blocks.MYSTIC_GATEWAYS_PORTAL_CONTROLLER_BLOCKS).add(
                ModBlocks.MYSTIC_GATEWAYS_PORTAL_CONTROLLER.get()
        );

        this.tag(ModTags.Blocks.MOD_CARVER_REPLACEABLES).add(
                Blocks.STONE,
                NidavellirBlocks.NIDAVELLIR_SOFT_STONE.get(),
                NidavellirBlocks.NIDAVELLIR_HARD_STONE.get(),
                NidavellirBlocks.NIDAVELLIR_ENHANCED_STONE.get(),
                NidavellirBlocks.NIDAVELLIR_DEEPSLATE_STONE.get(),
                NidavellirBlocks.NIDAVELLIR_CRIMSON_STONE.get()
        );

        this.tag(BlockTags.MINEABLE_WITH_AXE).addTags(
                ModTags.Blocks.ELDER_WOOD,
                ModTags.Blocks.OLIVE_WOOD,
                ModTags.Blocks.MYRRH_WOOD,
                ModTags.Blocks.LAUREL_WOOD,
                ModTags.Blocks.CYPRESS_WOOD,
                ModTags.Blocks.BLACK_BIRCH_WOOD,
                ModTags.Blocks.WHITE_OAK_WOOD,
                ModTags.Blocks.BUR_OAK_WOOD,
                ModTags.Blocks.BLOOD_CHERRY_WOOD,
                ModTags.Blocks.SACRED_TREE_WOOD,
                ModTags.Blocks.WILLOW_WOOD,
                ModTags.Blocks.DEADWOOD_WOOD,
                ModTags.Blocks.EBONY_KINGSWOOD_WOOD,
                ModTags.Blocks.IVORY_KINGSWOOD_WOOD,
                ModTags.Blocks.WEAVER_WOOD
        );

        this.tag(BlockTags.MINEABLE_WITH_PICKAXE).add(
                NidavellirBlocks.NIDAVELLIR_SOFT_STONE.get(),
                NidavellirBlocks.NIDAVELLIR_SOFT_STONE_STAIRS.get(),
                NidavellirBlocks.NIDAVELLIR_SOFT_STONE_SLAB.get(),
                NidavellirBlocks.NIDAVELLIR_SOFT_STONE_PRESSURE_PLATE.get(),
                NidavellirBlocks.NIDAVELLIR_SOFT_STONE_BUTTON.get(),
                NidavellirBlocks.NIDAVELLIR_SOFT_STONE_WALL.get(),
                NidavellirBlocks.NIDAVELLIR_SOFT_SMOOTH_STONE.get(),
                NidavellirBlocks.NIDAVELLIR_SOFT_COBBLESTONE.get(),
                NidavellirBlocks.NIDAVELLIR_SOFT_COBBLESTONE_STAIRS.get(),
                NidavellirBlocks.NIDAVELLIR_SOFT_COBBLESTONE_SLAB.get(),
                NidavellirBlocks.NIDAVELLIR_SOFT_COBBLESTONE_WALL.get(),
                NidavellirBlocks.NIDAVELLIR_SOFT_COBBLESTONE_MOSSY.get(),
                NidavellirBlocks.NIDAVELLIR_SOFT_STONE_BRICKS.get(),
                NidavellirBlocks.NIDAVELLIR_SOFT_STONE_BRICKS_STAIRS.get(),
                NidavellirBlocks.NIDAVELLIR_SOFT_STONE_BRICKS_SLAB.get(),
                NidavellirBlocks.NIDAVELLIR_SOFT_STONE_BRICKS_WALL.get(),
                NidavellirBlocks.NIDAVELLIR_SOFT_STONE_BRICKS_MOSSY.get(),
                NidavellirBlocks.NIDAVELLIR_SOFT_STONE_BRICKS_CRACKED.get(),
                NidavellirBlocks.NIDAVELLIR_SOFT_STONE_BRICKS_CHISELED.get(),

                NidavellirBlocks.NIDAVELLIR_SOFT_STONE_IRON_ORE.get(),
                NidavellirBlocks.NIDAVELLIR_SOFT_STONE_GOLD_ORE.get(),
                NidavellirBlocks.NIDAVELLIR_SOFT_STONE_COPPER_ORE.get(),
                NidavellirBlocks.NIDAVELLIR_SOFT_STONE_TIN_ORE.get(),
                NidavellirBlocks.NIDAVELLIR_SOFT_STONE_ZINC_ORE.get(),
                NidavellirBlocks.NIDAVELLIR_SOFT_STONE_DIAMOND_ORE.get(),
                NidavellirBlocks.NIDAVELLIR_SOFT_STONE_EMERALD_ORE.get(),
                NidavellirBlocks.NIDAVELLIR_SOFT_STONE_COAL_ORE.get(),
                NidavellirBlocks.NIDAVELLIR_SOFT_STONE_REDSTONE_ORE.get(),
                NidavellirBlocks.NIDAVELLIR_SOFT_STONE_LAPIS_ORE.get(),
                NidavellirBlocks.NIDAVELLIR_SOFT_STONE_AQUAMARINE_ORE.get(),
                NidavellirBlocks.NIDAVELLIR_SOFT_STONE_OPAL_ORE.get(),
                NidavellirBlocks.NIDAVELLIR_SOFT_STONE_RUBY_ORE.get(),

                NidavellirBlocks.NIDAVELLIR_SOFT_STONE_IRON_ORE_CLUSTER.get(),
                NidavellirBlocks.NIDAVELLIR_SOFT_STONE_GOLD_ORE_CLUSTER.get(),
                NidavellirBlocks.NIDAVELLIR_SOFT_STONE_COPPER_ORE_CLUSTER.get(),
                NidavellirBlocks.NIDAVELLIR_SOFT_STONE_TIN_ORE_CLUSTER.get(),
                NidavellirBlocks.NIDAVELLIR_SOFT_STONE_ZINC_ORE_CLUSTER.get(),
                NidavellirBlocks.NIDAVELLIR_SOFT_STONE_DIAMOND_ORE_CLUSTER.get(),
                NidavellirBlocks.NIDAVELLIR_SOFT_STONE_EMERALD_ORE_CLUSTER.get(),
                NidavellirBlocks.NIDAVELLIR_SOFT_STONE_COAL_ORE_CLUSTER.get(),
                NidavellirBlocks.NIDAVELLIR_SOFT_STONE_REDSTONE_ORE_CLUSTER.get(),
                NidavellirBlocks.NIDAVELLIR_SOFT_STONE_LAPIS_ORE_CLUSTER.get(),
                NidavellirBlocks.NIDAVELLIR_SOFT_STONE_AQUAMARINE_ORE_CLUSTER.get(),
                NidavellirBlocks.NIDAVELLIR_SOFT_STONE_OPAL_ORE_CLUSTER.get(),
                NidavellirBlocks.NIDAVELLIR_SOFT_STONE_RUBY_ORE_CLUSTER.get(),

                NidavellirBlocks.NIDAVELLIR_HARD_STONE.get(),
                NidavellirBlocks.NIDAVELLIR_HARD_STONE_STAIRS.get(),
                NidavellirBlocks.NIDAVELLIR_HARD_STONE_SLAB.get(),
                NidavellirBlocks.NIDAVELLIR_HARD_STONE_PRESSURE_PLATE.get(),
                NidavellirBlocks.NIDAVELLIR_HARD_STONE_BUTTON.get(),
                NidavellirBlocks.NIDAVELLIR_HARD_STONE_WALL.get(),
                NidavellirBlocks.NIDAVELLIR_HARD_SMOOTH_STONE.get(),
                NidavellirBlocks.NIDAVELLIR_HARD_COBBLESTONE.get(),
                NidavellirBlocks.NIDAVELLIR_HARD_COBBLESTONE_STAIRS.get(),
                NidavellirBlocks.NIDAVELLIR_HARD_COBBLESTONE_SLAB.get(),
                NidavellirBlocks.NIDAVELLIR_HARD_COBBLESTONE_WALL.get(),
                NidavellirBlocks.NIDAVELLIR_HARD_COBBLESTONE_MOSSY.get(),
                NidavellirBlocks.NIDAVELLIR_HARD_STONE_BRICKS.get(),
                NidavellirBlocks.NIDAVELLIR_HARD_STONE_BRICKS_STAIRS.get(),
                NidavellirBlocks.NIDAVELLIR_HARD_STONE_BRICKS_SLAB.get(),
                NidavellirBlocks.NIDAVELLIR_HARD_STONE_BRICKS_WALL.get(),
                NidavellirBlocks.NIDAVELLIR_HARD_STONE_BRICKS_MOSSY.get(),
                NidavellirBlocks.NIDAVELLIR_HARD_STONE_BRICKS_CRACKED.get(),
                NidavellirBlocks.NIDAVELLIR_HARD_STONE_BRICKS_CHISELED.get(),

                NidavellirBlocks.NIDAVELLIR_HARD_STONE_IRON_ORE.get(),
                NidavellirBlocks.NIDAVELLIR_HARD_STONE_GOLD_ORE.get(),
                NidavellirBlocks.NIDAVELLIR_HARD_STONE_COPPER_ORE.get(),
                NidavellirBlocks.NIDAVELLIR_HARD_STONE_TIN_ORE.get(),
                NidavellirBlocks.NIDAVELLIR_HARD_STONE_ZINC_ORE.get(),
                NidavellirBlocks.NIDAVELLIR_HARD_STONE_DIAMOND_ORE.get(),
                NidavellirBlocks.NIDAVELLIR_HARD_STONE_EMERALD_ORE.get(),
                NidavellirBlocks.NIDAVELLIR_HARD_STONE_COAL_ORE.get(),
                NidavellirBlocks.NIDAVELLIR_HARD_STONE_REDSTONE_ORE.get(),
                NidavellirBlocks.NIDAVELLIR_HARD_STONE_LAPIS_ORE.get(),
                NidavellirBlocks.NIDAVELLIR_HARD_STONE_AQUAMARINE_ORE.get(),
                NidavellirBlocks.NIDAVELLIR_HARD_STONE_OPAL_ORE.get(),
                NidavellirBlocks.NIDAVELLIR_HARD_STONE_RUBY_ORE.get(),

                NidavellirBlocks.NIDAVELLIR_HARD_STONE_IRON_ORE_CLUSTER.get(),
                NidavellirBlocks.NIDAVELLIR_HARD_STONE_GOLD_ORE_CLUSTER.get(),
                NidavellirBlocks.NIDAVELLIR_HARD_STONE_COPPER_ORE_CLUSTER.get(),
                NidavellirBlocks.NIDAVELLIR_HARD_STONE_TIN_ORE_CLUSTER.get(),
                NidavellirBlocks.NIDAVELLIR_HARD_STONE_ZINC_ORE_CLUSTER.get(),
                NidavellirBlocks.NIDAVELLIR_HARD_STONE_DIAMOND_ORE_CLUSTER.get(),
                NidavellirBlocks.NIDAVELLIR_HARD_STONE_EMERALD_ORE_CLUSTER.get(),
                NidavellirBlocks.NIDAVELLIR_HARD_STONE_COAL_ORE_CLUSTER.get(),
                NidavellirBlocks.NIDAVELLIR_HARD_STONE_REDSTONE_ORE_CLUSTER.get(),
                NidavellirBlocks.NIDAVELLIR_HARD_STONE_LAPIS_ORE_CLUSTER.get(),
                NidavellirBlocks.NIDAVELLIR_HARD_STONE_AQUAMARINE_ORE_CLUSTER.get(),
                NidavellirBlocks.NIDAVELLIR_HARD_STONE_OPAL_ORE_CLUSTER.get(),
                NidavellirBlocks.NIDAVELLIR_HARD_STONE_RUBY_ORE_CLUSTER.get(),

                NidavellirBlocks.NIDAVELLIR_ENHANCED_STONE.get(),
                NidavellirBlocks.NIDAVELLIR_ENHANCED_STONE_STAIRS.get(),
                NidavellirBlocks.NIDAVELLIR_ENHANCED_STONE_SLAB.get(),
                NidavellirBlocks.NIDAVELLIR_ENHANCED_STONE_PRESSURE_PLATE.get(),
                NidavellirBlocks.NIDAVELLIR_ENHANCED_STONE_BUTTON.get(),
                NidavellirBlocks.NIDAVELLIR_ENHANCED_STONE_WALL.get(),
                NidavellirBlocks.NIDAVELLIR_ENHANCED_SMOOTH_STONE.get(),
                NidavellirBlocks.NIDAVELLIR_ENHANCED_COBBLESTONE.get(),
                NidavellirBlocks.NIDAVELLIR_ENHANCED_COBBLESTONE_STAIRS.get(),
                NidavellirBlocks.NIDAVELLIR_ENHANCED_COBBLESTONE_SLAB.get(),
                NidavellirBlocks.NIDAVELLIR_ENHANCED_COBBLESTONE_WALL.get(),
                NidavellirBlocks.NIDAVELLIR_ENHANCED_COBBLESTONE_MOSSY.get(),
                NidavellirBlocks.NIDAVELLIR_ENHANCED_STONE_BRICKS.get(),
                NidavellirBlocks.NIDAVELLIR_ENHANCED_STONE_BRICKS_STAIRS.get(),
                NidavellirBlocks.NIDAVELLIR_ENHANCED_STONE_BRICKS_SLAB.get(),
                NidavellirBlocks.NIDAVELLIR_ENHANCED_STONE_BRICKS_WALL.get(),
                NidavellirBlocks.NIDAVELLIR_ENHANCED_STONE_BRICKS_MOSSY.get(),
                NidavellirBlocks.NIDAVELLIR_ENHANCED_STONE_BRICKS_CRACKED.get(),
                NidavellirBlocks.NIDAVELLIR_ENHANCED_STONE_BRICKS_CHISELED.get(),

                NidavellirBlocks.NIDAVELLIR_ENHANCED_STONE_IRON_ORE.get(),
                NidavellirBlocks.NIDAVELLIR_ENHANCED_STONE_GOLD_ORE.get(),
                NidavellirBlocks.NIDAVELLIR_ENHANCED_STONE_COPPER_ORE.get(),
                NidavellirBlocks.NIDAVELLIR_ENHANCED_STONE_TIN_ORE.get(),
                NidavellirBlocks.NIDAVELLIR_ENHANCED_STONE_ZINC_ORE.get(),
                NidavellirBlocks.NIDAVELLIR_ENHANCED_STONE_DIAMOND_ORE.get(),
                NidavellirBlocks.NIDAVELLIR_ENHANCED_STONE_EMERALD_ORE.get(),
                NidavellirBlocks.NIDAVELLIR_ENHANCED_STONE_COAL_ORE.get(),
                NidavellirBlocks.NIDAVELLIR_ENHANCED_STONE_REDSTONE_ORE.get(),
                NidavellirBlocks.NIDAVELLIR_ENHANCED_STONE_LAPIS_ORE.get(),
                NidavellirBlocks.NIDAVELLIR_ENHANCED_STONE_AQUAMARINE_ORE.get(),
                NidavellirBlocks.NIDAVELLIR_ENHANCED_STONE_OPAL_ORE.get(),
                NidavellirBlocks.NIDAVELLIR_ENHANCED_STONE_RUBY_ORE.get(),

                NidavellirBlocks.NIDAVELLIR_ENHANCED_STONE_IRON_ORE_CLUSTER.get(),
                NidavellirBlocks.NIDAVELLIR_ENHANCED_STONE_GOLD_ORE_CLUSTER.get(),
                NidavellirBlocks.NIDAVELLIR_ENHANCED_STONE_COPPER_ORE_CLUSTER.get(),
                NidavellirBlocks.NIDAVELLIR_ENHANCED_STONE_TIN_ORE_CLUSTER.get(),
                NidavellirBlocks.NIDAVELLIR_ENHANCED_STONE_ZINC_ORE_CLUSTER.get(),
                NidavellirBlocks.NIDAVELLIR_ENHANCED_STONE_DIAMOND_ORE_CLUSTER.get(),
                NidavellirBlocks.NIDAVELLIR_ENHANCED_STONE_EMERALD_ORE_CLUSTER.get(),
                NidavellirBlocks.NIDAVELLIR_ENHANCED_STONE_COAL_ORE_CLUSTER.get(),
                NidavellirBlocks.NIDAVELLIR_ENHANCED_STONE_REDSTONE_ORE_CLUSTER.get(),
                NidavellirBlocks.NIDAVELLIR_ENHANCED_STONE_LAPIS_ORE_CLUSTER.get(),
                NidavellirBlocks.NIDAVELLIR_ENHANCED_STONE_AQUAMARINE_ORE_CLUSTER.get(),
                NidavellirBlocks.NIDAVELLIR_ENHANCED_STONE_OPAL_ORE_CLUSTER.get(),
                NidavellirBlocks.NIDAVELLIR_ENHANCED_STONE_RUBY_ORE_CLUSTER.get(),

                NidavellirBlocks.NIDAVELLIR_DEEPSLATE_STONE.get(),
                NidavellirBlocks.NIDAVELLIR_DEEPSLATE_STONE_STAIRS.get(),
                NidavellirBlocks.NIDAVELLIR_DEEPSLATE_STONE_SLAB.get(),
                NidavellirBlocks.NIDAVELLIR_DEEPSLATE_STONE_PRESSURE_PLATE.get(),
                NidavellirBlocks.NIDAVELLIR_DEEPSLATE_STONE_BUTTON.get(),
                NidavellirBlocks.NIDAVELLIR_DEEPSLATE_STONE_WALL.get(),
                NidavellirBlocks.NIDAVELLIR_DEEPSLATE_SMOOTH_STONE.get(),
                NidavellirBlocks.NIDAVELLIR_DEEPSLATE_COBBLESTONE.get(),
                NidavellirBlocks.NIDAVELLIR_DEEPSLATE_COBBLESTONE_STAIRS.get(),
                NidavellirBlocks.NIDAVELLIR_DEEPSLATE_COBBLESTONE_SLAB.get(),
                NidavellirBlocks.NIDAVELLIR_DEEPSLATE_COBBLESTONE_WALL.get(),
                NidavellirBlocks.NIDAVELLIR_DEEPSLATE_COBBLESTONE_MOSSY.get(),
                NidavellirBlocks.NIDAVELLIR_DEEPSLATE_STONE_BRICKS.get(),
                NidavellirBlocks.NIDAVELLIR_DEEPSLATE_STONE_BRICKS_STAIRS.get(),
                NidavellirBlocks.NIDAVELLIR_DEEPSLATE_STONE_BRICKS_SLAB.get(),
                NidavellirBlocks.NIDAVELLIR_DEEPSLATE_STONE_BRICKS_WALL.get(),
                NidavellirBlocks.NIDAVELLIR_DEEPSLATE_STONE_BRICKS_MOSSY.get(),
                NidavellirBlocks.NIDAVELLIR_DEEPSLATE_STONE_BRICKS_CRACKED.get(),
                NidavellirBlocks.NIDAVELLIR_DEEPSLATE_STONE_BRICKS_CHISELED.get(),

                NidavellirBlocks.NIDAVELLIR_DEEPSLATE_STONE_IRON_ORE.get(),
                NidavellirBlocks.NIDAVELLIR_DEEPSLATE_STONE_GOLD_ORE.get(),
                NidavellirBlocks.NIDAVELLIR_DEEPSLATE_STONE_COPPER_ORE.get(),
                NidavellirBlocks.NIDAVELLIR_DEEPSLATE_STONE_TIN_ORE.get(),
                NidavellirBlocks.NIDAVELLIR_DEEPSLATE_STONE_ZINC_ORE.get(),
                NidavellirBlocks.NIDAVELLIR_DEEPSLATE_STONE_DIAMOND_ORE.get(),
                NidavellirBlocks.NIDAVELLIR_DEEPSLATE_STONE_EMERALD_ORE.get(),
                NidavellirBlocks.NIDAVELLIR_DEEPSLATE_STONE_COAL_ORE.get(),
                NidavellirBlocks.NIDAVELLIR_DEEPSLATE_STONE_REDSTONE_ORE.get(),
                NidavellirBlocks.NIDAVELLIR_DEEPSLATE_STONE_LAPIS_ORE.get(),
                NidavellirBlocks.NIDAVELLIR_DEEPSLATE_STONE_AQUAMARINE_ORE.get(),
                NidavellirBlocks.NIDAVELLIR_DEEPSLATE_STONE_OPAL_ORE.get(),
                NidavellirBlocks.NIDAVELLIR_DEEPSLATE_STONE_RUBY_ORE.get(),

                NidavellirBlocks.NIDAVELLIR_DEEPSLATE_STONE_IRON_ORE_CLUSTER.get(),
                NidavellirBlocks.NIDAVELLIR_DEEPSLATE_STONE_GOLD_ORE_CLUSTER.get(),
                NidavellirBlocks.NIDAVELLIR_DEEPSLATE_STONE_COPPER_ORE_CLUSTER.get(),
                NidavellirBlocks.NIDAVELLIR_DEEPSLATE_STONE_TIN_ORE_CLUSTER.get(),
                NidavellirBlocks.NIDAVELLIR_DEEPSLATE_STONE_ZINC_ORE_CLUSTER.get(),
                NidavellirBlocks.NIDAVELLIR_DEEPSLATE_STONE_DIAMOND_ORE_CLUSTER.get(),
                NidavellirBlocks.NIDAVELLIR_DEEPSLATE_STONE_EMERALD_ORE_CLUSTER.get(),
                NidavellirBlocks.NIDAVELLIR_DEEPSLATE_STONE_COAL_ORE_CLUSTER.get(),
                NidavellirBlocks.NIDAVELLIR_DEEPSLATE_STONE_REDSTONE_ORE_CLUSTER.get(),
                NidavellirBlocks.NIDAVELLIR_DEEPSLATE_STONE_LAPIS_ORE_CLUSTER.get(),
                NidavellirBlocks.NIDAVELLIR_DEEPSLATE_STONE_AQUAMARINE_ORE_CLUSTER.get(),
                NidavellirBlocks.NIDAVELLIR_DEEPSLATE_STONE_OPAL_ORE_CLUSTER.get(),
                NidavellirBlocks.NIDAVELLIR_DEEPSLATE_STONE_RUBY_ORE_CLUSTER.get(),

                NidavellirBlocks.NIDAVELLIR_CRIMSON_STONE.get(),
                NidavellirBlocks.NIDAVELLIR_CRIMSON_STONE_STAIRS.get(),
                NidavellirBlocks.NIDAVELLIR_CRIMSON_STONE_SLAB.get(),
                NidavellirBlocks.NIDAVELLIR_CRIMSON_STONE_PRESSURE_PLATE.get(),
                NidavellirBlocks.NIDAVELLIR_CRIMSON_STONE_BUTTON.get(),
                NidavellirBlocks.NIDAVELLIR_CRIMSON_STONE_WALL.get(),
                NidavellirBlocks.NIDAVELLIR_CRIMSON_SMOOTH_STONE.get(),
                NidavellirBlocks.NIDAVELLIR_CRIMSON_COBBLESTONE.get(),
                NidavellirBlocks.NIDAVELLIR_CRIMSON_COBBLESTONE_STAIRS.get(),
                NidavellirBlocks.NIDAVELLIR_CRIMSON_COBBLESTONE_SLAB.get(),
                NidavellirBlocks.NIDAVELLIR_CRIMSON_COBBLESTONE_WALL.get(),
                NidavellirBlocks.NIDAVELLIR_CRIMSON_COBBLESTONE_MOSSY.get(),
                NidavellirBlocks.NIDAVELLIR_CRIMSON_STONE_BRICKS.get(),
                NidavellirBlocks.NIDAVELLIR_CRIMSON_STONE_BRICKS_STAIRS.get(),
                NidavellirBlocks.NIDAVELLIR_CRIMSON_STONE_BRICKS_SLAB.get(),
                NidavellirBlocks.NIDAVELLIR_CRIMSON_STONE_BRICKS_WALL.get(),
                NidavellirBlocks.NIDAVELLIR_CRIMSON_STONE_BRICKS_MOSSY.get(),
                NidavellirBlocks.NIDAVELLIR_CRIMSON_STONE_BRICKS_CRACKED.get(),
                NidavellirBlocks.NIDAVELLIR_CRIMSON_STONE_BRICKS_CHISELED.get(),

                NidavellirBlocks.NIDAVELLIR_CRIMSON_STONE_IRON_ORE.get(),
                NidavellirBlocks.NIDAVELLIR_CRIMSON_STONE_GOLD_ORE.get(),
                NidavellirBlocks.NIDAVELLIR_CRIMSON_STONE_COPPER_ORE.get(),
                NidavellirBlocks.NIDAVELLIR_CRIMSON_STONE_TIN_ORE.get(),
                NidavellirBlocks.NIDAVELLIR_CRIMSON_STONE_ZINC_ORE.get(),
                NidavellirBlocks.NIDAVELLIR_CRIMSON_STONE_DIAMOND_ORE.get(),
                NidavellirBlocks.NIDAVELLIR_CRIMSON_STONE_EMERALD_ORE.get(),
                NidavellirBlocks.NIDAVELLIR_CRIMSON_STONE_COAL_ORE.get(),
                NidavellirBlocks.NIDAVELLIR_CRIMSON_STONE_REDSTONE_ORE.get(),
                NidavellirBlocks.NIDAVELLIR_CRIMSON_STONE_LAPIS_ORE.get(),
                NidavellirBlocks.NIDAVELLIR_CRIMSON_STONE_AQUAMARINE_ORE.get(),
                NidavellirBlocks.NIDAVELLIR_CRIMSON_STONE_OPAL_ORE.get(),
                NidavellirBlocks.NIDAVELLIR_CRIMSON_STONE_RUBY_ORE.get(),

                NidavellirBlocks.NIDAVELLIR_CRIMSON_STONE_IRON_ORE_CLUSTER.get(),
                NidavellirBlocks.NIDAVELLIR_CRIMSON_STONE_GOLD_ORE_CLUSTER.get(),
                NidavellirBlocks.NIDAVELLIR_CRIMSON_STONE_COPPER_ORE_CLUSTER.get(),
                NidavellirBlocks.NIDAVELLIR_CRIMSON_STONE_TIN_ORE_CLUSTER.get(),
                NidavellirBlocks.NIDAVELLIR_CRIMSON_STONE_ZINC_ORE_CLUSTER.get(),
                NidavellirBlocks.NIDAVELLIR_CRIMSON_STONE_DIAMOND_ORE_CLUSTER.get(),
                NidavellirBlocks.NIDAVELLIR_CRIMSON_STONE_EMERALD_ORE_CLUSTER.get(),
                NidavellirBlocks.NIDAVELLIR_CRIMSON_STONE_COAL_ORE_CLUSTER.get(),
                NidavellirBlocks.NIDAVELLIR_CRIMSON_STONE_REDSTONE_ORE_CLUSTER.get(),
                NidavellirBlocks.NIDAVELLIR_CRIMSON_STONE_LAPIS_ORE_CLUSTER.get(),
                NidavellirBlocks.NIDAVELLIR_CRIMSON_STONE_AQUAMARINE_ORE_CLUSTER.get(),
                NidavellirBlocks.NIDAVELLIR_CRIMSON_STONE_OPAL_ORE_CLUSTER.get(),
                NidavellirBlocks.NIDAVELLIR_CRIMSON_STONE_RUBY_ORE_CLUSTER.get(),

                UnderworldBlocks.TARTARUS_STONE.get(),
                UnderworldBlocks.TARTARUS_STONE_STAIRS.get(),
                UnderworldBlocks.TARTARUS_STONE_SLAB.get(),
                UnderworldBlocks.TARTARUS_STONE_PRESSURE_PLATE.get(),
                UnderworldBlocks.TARTARUS_STONE_BUTTON.get(),
                UnderworldBlocks.TARTARUS_STONE_WALL.get(),
                UnderworldBlocks.TARTARUS_STONE_SMOOTH_STONE.get(),
                UnderworldBlocks.TARTARUS_STONE_COBBLESTONE.get(),
                UnderworldBlocks.TARTARUS_STONE_COBBLESTONE_STAIRS.get(),
                UnderworldBlocks.TARTARUS_STONE_COBBLESTONE_SLAB.get(),
                UnderworldBlocks.TARTARUS_STONE_COBBLESTONE_WALL.get(),
                UnderworldBlocks.TARTARUS_STONE_COBBLESTONE_MOSSY.get(),
                UnderworldBlocks.TARTARUS_STONE_BRICKS.get(),
                UnderworldBlocks.TARTARUS_STONE_BRICKS_STAIRS.get(),
                UnderworldBlocks.TARTARUS_STONE_BRICKS_SLAB.get(),
                UnderworldBlocks.TARTARUS_STONE_BRICKS_WALL.get(),
                UnderworldBlocks.TARTARUS_STONE_BRICKS_MOSSY.get(),
                UnderworldBlocks.TARTARUS_STONE_BRICKS_CRACKED.get(),
                UnderworldBlocks.TARTARUS_STONE_BRICKS_CHISELED.get(),

                UnderworldBlocks.ORICHALCUM_BLOCK.get(),
                UnderworldBlocks.RAW_ORICHALCUM_BLOCK.get(),
                UnderworldBlocks.ORICHALCUM_ORE.get(),
                UnderworldBlocks.DEEPSLATE_ORICHALCUM_ORE.get(),

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

                UnderworldBlocks.ADAMANT_BLOCK.get(),
                UnderworldBlocks.ADAMANT_ORE.get(),
                UnderworldBlocks.DEEPSLATE_ADAMANT_ORE.get()
        );

        this.tag(BlockTags.NEEDS_STONE_TOOL).add(
                NidavellirBlocks.NIDAVELLIR_SOFT_STONE.get(),
                NidavellirBlocks.NIDAVELLIR_SOFT_STONE_STAIRS.get(),
                NidavellirBlocks.NIDAVELLIR_SOFT_STONE_SLAB.get(),
                NidavellirBlocks.NIDAVELLIR_SOFT_STONE_PRESSURE_PLATE.get(),
                NidavellirBlocks.NIDAVELLIR_SOFT_STONE_BUTTON.get(),
                NidavellirBlocks.NIDAVELLIR_SOFT_STONE_WALL.get(),
                NidavellirBlocks.NIDAVELLIR_SOFT_SMOOTH_STONE.get(),
                NidavellirBlocks.NIDAVELLIR_SOFT_COBBLESTONE.get(),
                NidavellirBlocks.NIDAVELLIR_SOFT_COBBLESTONE_STAIRS.get(),
                NidavellirBlocks.NIDAVELLIR_SOFT_COBBLESTONE_SLAB.get(),
                NidavellirBlocks.NIDAVELLIR_SOFT_COBBLESTONE_WALL.get(),
                NidavellirBlocks.NIDAVELLIR_SOFT_COBBLESTONE_MOSSY.get(),
                NidavellirBlocks.NIDAVELLIR_SOFT_STONE_BRICKS.get(),
                NidavellirBlocks.NIDAVELLIR_SOFT_STONE_BRICKS_STAIRS.get(),
                NidavellirBlocks.NIDAVELLIR_SOFT_STONE_BRICKS_SLAB.get(),
                NidavellirBlocks.NIDAVELLIR_SOFT_STONE_BRICKS_WALL.get(),
                NidavellirBlocks.NIDAVELLIR_SOFT_STONE_BRICKS_MOSSY.get(),
                NidavellirBlocks.NIDAVELLIR_SOFT_STONE_BRICKS_CRACKED.get(),
                NidavellirBlocks.NIDAVELLIR_SOFT_STONE_BRICKS_CHISELED.get(),

                NidavellirBlocks.NIDAVELLIR_SOFT_STONE_IRON_ORE.get(),
                NidavellirBlocks.NIDAVELLIR_SOFT_STONE_GOLD_ORE.get(),
                NidavellirBlocks.NIDAVELLIR_SOFT_STONE_COPPER_ORE.get(),
                NidavellirBlocks.NIDAVELLIR_SOFT_STONE_TIN_ORE.get(),
                NidavellirBlocks.NIDAVELLIR_SOFT_STONE_ZINC_ORE.get(),
                NidavellirBlocks.NIDAVELLIR_SOFT_STONE_COAL_ORE.get(),

                NidavellirBlocks.NIDAVELLIR_SOFT_STONE_IRON_ORE_CLUSTER.get(),
                NidavellirBlocks.NIDAVELLIR_SOFT_STONE_GOLD_ORE_CLUSTER.get(),
                NidavellirBlocks.NIDAVELLIR_SOFT_STONE_COPPER_ORE_CLUSTER.get(),
                NidavellirBlocks.NIDAVELLIR_SOFT_STONE_TIN_ORE_CLUSTER.get(),
                NidavellirBlocks.NIDAVELLIR_SOFT_STONE_ZINC_ORE_CLUSTER.get(),
                NidavellirBlocks.NIDAVELLIR_SOFT_STONE_COAL_ORE_CLUSTER.get(),

                UnderworldBlocks.ORICHALCUM_BLOCK.get(),
                UnderworldBlocks.RAW_ORICHALCUM_BLOCK.get(),
                UnderworldBlocks.ORICHALCUM_ORE.get(),
                UnderworldBlocks.DEEPSLATE_ORICHALCUM_ORE.get(),

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
                NidavellirBlocks.NIDAVELLIR_SOFT_STONE_DIAMOND_ORE.get(),
                NidavellirBlocks.NIDAVELLIR_SOFT_STONE_EMERALD_ORE.get(),
                NidavellirBlocks.NIDAVELLIR_SOFT_STONE_REDSTONE_ORE.get(),
                NidavellirBlocks.NIDAVELLIR_SOFT_STONE_LAPIS_ORE.get(),
                NidavellirBlocks.NIDAVELLIR_SOFT_STONE_AQUAMARINE_ORE.get(),
                NidavellirBlocks.NIDAVELLIR_SOFT_STONE_OPAL_ORE.get(),
                NidavellirBlocks.NIDAVELLIR_SOFT_STONE_RUBY_ORE.get(),

                NidavellirBlocks.NIDAVELLIR_SOFT_STONE_DIAMOND_ORE_CLUSTER.get(),
                NidavellirBlocks.NIDAVELLIR_SOFT_STONE_EMERALD_ORE_CLUSTER.get(),
                NidavellirBlocks.NIDAVELLIR_SOFT_STONE_REDSTONE_ORE_CLUSTER.get(),
                NidavellirBlocks.NIDAVELLIR_SOFT_STONE_LAPIS_ORE_CLUSTER.get(),
                NidavellirBlocks.NIDAVELLIR_SOFT_STONE_AQUAMARINE_ORE_CLUSTER.get(),
                NidavellirBlocks.NIDAVELLIR_SOFT_STONE_OPAL_ORE_CLUSTER.get(),
                NidavellirBlocks.NIDAVELLIR_SOFT_STONE_RUBY_ORE_CLUSTER.get(),

                NidavellirBlocks.NIDAVELLIR_HARD_STONE.get(),
                NidavellirBlocks.NIDAVELLIR_HARD_STONE_STAIRS.get(),
                NidavellirBlocks.NIDAVELLIR_HARD_STONE_SLAB.get(),
                NidavellirBlocks.NIDAVELLIR_HARD_STONE_PRESSURE_PLATE.get(),
                NidavellirBlocks.NIDAVELLIR_HARD_STONE_BUTTON.get(),
                NidavellirBlocks.NIDAVELLIR_HARD_STONE_WALL.get(),
                NidavellirBlocks.NIDAVELLIR_HARD_SMOOTH_STONE.get(),
                NidavellirBlocks.NIDAVELLIR_HARD_COBBLESTONE.get(),
                NidavellirBlocks.NIDAVELLIR_HARD_COBBLESTONE_STAIRS.get(),
                NidavellirBlocks.NIDAVELLIR_HARD_COBBLESTONE_SLAB.get(),
                NidavellirBlocks.NIDAVELLIR_HARD_COBBLESTONE_WALL.get(),
                NidavellirBlocks.NIDAVELLIR_HARD_COBBLESTONE_MOSSY.get(),
                NidavellirBlocks.NIDAVELLIR_HARD_STONE_BRICKS.get(),
                NidavellirBlocks.NIDAVELLIR_HARD_STONE_BRICKS_STAIRS.get(),
                NidavellirBlocks.NIDAVELLIR_HARD_STONE_BRICKS_SLAB.get(),
                NidavellirBlocks.NIDAVELLIR_HARD_STONE_BRICKS_WALL.get(),
                NidavellirBlocks.NIDAVELLIR_HARD_STONE_BRICKS_MOSSY.get(),
                NidavellirBlocks.NIDAVELLIR_HARD_STONE_BRICKS_CRACKED.get(),
                NidavellirBlocks.NIDAVELLIR_HARD_STONE_BRICKS_CHISELED.get(),

                NidavellirBlocks.NIDAVELLIR_HARD_STONE_IRON_ORE.get(),
                NidavellirBlocks.NIDAVELLIR_HARD_STONE_GOLD_ORE.get(),
                NidavellirBlocks.NIDAVELLIR_HARD_STONE_COPPER_ORE.get(),
                NidavellirBlocks.NIDAVELLIR_HARD_STONE_TIN_ORE.get(),
                NidavellirBlocks.NIDAVELLIR_HARD_STONE_ZINC_ORE.get(),
                NidavellirBlocks.NIDAVELLIR_HARD_STONE_COAL_ORE.get(),

                NidavellirBlocks.NIDAVELLIR_HARD_STONE_IRON_ORE_CLUSTER.get(),
                NidavellirBlocks.NIDAVELLIR_HARD_STONE_GOLD_ORE_CLUSTER.get(),
                NidavellirBlocks.NIDAVELLIR_HARD_STONE_COPPER_ORE_CLUSTER.get(),
                NidavellirBlocks.NIDAVELLIR_HARD_STONE_TIN_ORE_CLUSTER.get(),
                NidavellirBlocks.NIDAVELLIR_HARD_STONE_ZINC_ORE_CLUSTER.get(),
                NidavellirBlocks.NIDAVELLIR_HARD_STONE_COAL_ORE_CLUSTER.get(),

                NidavellirBlocks.NIDAVELLIR_CRIMSON_STONE.get(),
                NidavellirBlocks.NIDAVELLIR_CRIMSON_STONE_STAIRS.get(),
                NidavellirBlocks.NIDAVELLIR_CRIMSON_STONE_SLAB.get(),
                NidavellirBlocks.NIDAVELLIR_CRIMSON_STONE_PRESSURE_PLATE.get(),
                NidavellirBlocks.NIDAVELLIR_CRIMSON_STONE_BUTTON.get(),
                NidavellirBlocks.NIDAVELLIR_CRIMSON_STONE_WALL.get(),
                NidavellirBlocks.NIDAVELLIR_CRIMSON_SMOOTH_STONE.get(),
                NidavellirBlocks.NIDAVELLIR_CRIMSON_COBBLESTONE.get(),
                NidavellirBlocks.NIDAVELLIR_CRIMSON_COBBLESTONE_STAIRS.get(),
                NidavellirBlocks.NIDAVELLIR_CRIMSON_COBBLESTONE_SLAB.get(),
                NidavellirBlocks.NIDAVELLIR_CRIMSON_COBBLESTONE_WALL.get(),
                NidavellirBlocks.NIDAVELLIR_CRIMSON_COBBLESTONE_MOSSY.get(),
                NidavellirBlocks.NIDAVELLIR_CRIMSON_STONE_BRICKS.get(),
                NidavellirBlocks.NIDAVELLIR_CRIMSON_STONE_BRICKS_STAIRS.get(),
                NidavellirBlocks.NIDAVELLIR_CRIMSON_STONE_BRICKS_SLAB.get(),
                NidavellirBlocks.NIDAVELLIR_CRIMSON_STONE_BRICKS_WALL.get(),
                NidavellirBlocks.NIDAVELLIR_CRIMSON_STONE_BRICKS_MOSSY.get(),
                NidavellirBlocks.NIDAVELLIR_CRIMSON_STONE_BRICKS_CRACKED.get(),
                NidavellirBlocks.NIDAVELLIR_CRIMSON_STONE_BRICKS_CHISELED.get(),

                NidavellirBlocks.NIDAVELLIR_CRIMSON_STONE_IRON_ORE.get(),
                NidavellirBlocks.NIDAVELLIR_CRIMSON_STONE_GOLD_ORE.get(),
                NidavellirBlocks.NIDAVELLIR_CRIMSON_STONE_COPPER_ORE.get(),
                NidavellirBlocks.NIDAVELLIR_CRIMSON_STONE_TIN_ORE.get(),
                NidavellirBlocks.NIDAVELLIR_CRIMSON_STONE_ZINC_ORE.get(),
                NidavellirBlocks.NIDAVELLIR_CRIMSON_STONE_COAL_ORE.get(),

                NidavellirBlocks.NIDAVELLIR_CRIMSON_STONE_IRON_ORE_CLUSTER.get(),
                NidavellirBlocks.NIDAVELLIR_CRIMSON_STONE_GOLD_ORE_CLUSTER.get(),
                NidavellirBlocks.NIDAVELLIR_CRIMSON_STONE_COPPER_ORE_CLUSTER.get(),
                NidavellirBlocks.NIDAVELLIR_CRIMSON_STONE_TIN_ORE_CLUSTER.get(),
                NidavellirBlocks.NIDAVELLIR_CRIMSON_STONE_ZINC_ORE_CLUSTER.get(),
                NidavellirBlocks.NIDAVELLIR_CRIMSON_STONE_COAL_ORE_CLUSTER.get()
        );

        this.tag(BlockTags.NEEDS_DIAMOND_TOOL).add(
                NidavellirBlocks.NIDAVELLIR_HARD_STONE_DIAMOND_ORE.get(),
                NidavellirBlocks.NIDAVELLIR_HARD_STONE_EMERALD_ORE.get(),
                NidavellirBlocks.NIDAVELLIR_HARD_STONE_REDSTONE_ORE.get(),
                NidavellirBlocks.NIDAVELLIR_HARD_STONE_LAPIS_ORE.get(),
                NidavellirBlocks.NIDAVELLIR_HARD_STONE_AQUAMARINE_ORE.get(),
                NidavellirBlocks.NIDAVELLIR_HARD_STONE_OPAL_ORE.get(),
                NidavellirBlocks.NIDAVELLIR_HARD_STONE_RUBY_ORE.get(),
                NidavellirBlocks.NIDAVELLIR_HARD_STONE_DIAMOND_ORE_CLUSTER.get(),
                NidavellirBlocks.NIDAVELLIR_HARD_STONE_EMERALD_ORE_CLUSTER.get(),
                NidavellirBlocks.NIDAVELLIR_HARD_STONE_REDSTONE_ORE_CLUSTER.get(),
                NidavellirBlocks.NIDAVELLIR_HARD_STONE_LAPIS_ORE_CLUSTER.get(),
                NidavellirBlocks.NIDAVELLIR_HARD_STONE_AQUAMARINE_ORE_CLUSTER.get(),
                NidavellirBlocks.NIDAVELLIR_HARD_STONE_OPAL_ORE_CLUSTER.get(),
                NidavellirBlocks.NIDAVELLIR_HARD_STONE_RUBY_ORE_CLUSTER.get(),

                NidavellirBlocks.NIDAVELLIR_CRIMSON_STONE_DIAMOND_ORE.get(),
                NidavellirBlocks.NIDAVELLIR_CRIMSON_STONE_EMERALD_ORE.get(),
                NidavellirBlocks.NIDAVELLIR_CRIMSON_STONE_REDSTONE_ORE.get(),
                NidavellirBlocks.NIDAVELLIR_CRIMSON_STONE_LAPIS_ORE.get(),
                NidavellirBlocks.NIDAVELLIR_CRIMSON_STONE_AQUAMARINE_ORE.get(),
                NidavellirBlocks.NIDAVELLIR_CRIMSON_STONE_OPAL_ORE.get(),
                NidavellirBlocks.NIDAVELLIR_CRIMSON_STONE_RUBY_ORE.get(),
                NidavellirBlocks.NIDAVELLIR_CRIMSON_STONE_DIAMOND_ORE_CLUSTER.get(),
                NidavellirBlocks.NIDAVELLIR_CRIMSON_STONE_EMERALD_ORE_CLUSTER.get(),
                NidavellirBlocks.NIDAVELLIR_CRIMSON_STONE_REDSTONE_ORE_CLUSTER.get(),
                NidavellirBlocks.NIDAVELLIR_CRIMSON_STONE_LAPIS_ORE_CLUSTER.get(),
                NidavellirBlocks.NIDAVELLIR_CRIMSON_STONE_AQUAMARINE_ORE_CLUSTER.get(),
                NidavellirBlocks.NIDAVELLIR_CRIMSON_STONE_OPAL_ORE_CLUSTER.get(),
                NidavellirBlocks.NIDAVELLIR_CRIMSON_STONE_RUBY_ORE_CLUSTER.get(),

                NidavellirBlocks.NIDAVELLIR_ENHANCED_STONE.get(),
                NidavellirBlocks.NIDAVELLIR_ENHANCED_STONE_STAIRS.get(),
                NidavellirBlocks.NIDAVELLIR_ENHANCED_STONE_SLAB.get(),
                NidavellirBlocks.NIDAVELLIR_ENHANCED_STONE_PRESSURE_PLATE.get(),
                NidavellirBlocks.NIDAVELLIR_ENHANCED_STONE_BUTTON.get(),
                NidavellirBlocks.NIDAVELLIR_ENHANCED_STONE_WALL.get(),
                NidavellirBlocks.NIDAVELLIR_ENHANCED_SMOOTH_STONE.get(),
                NidavellirBlocks.NIDAVELLIR_ENHANCED_COBBLESTONE.get(),
                NidavellirBlocks.NIDAVELLIR_ENHANCED_COBBLESTONE_STAIRS.get(),
                NidavellirBlocks.NIDAVELLIR_ENHANCED_COBBLESTONE_SLAB.get(),
                NidavellirBlocks.NIDAVELLIR_ENHANCED_COBBLESTONE_WALL.get(),
                NidavellirBlocks.NIDAVELLIR_ENHANCED_COBBLESTONE_MOSSY.get(),
                NidavellirBlocks.NIDAVELLIR_ENHANCED_STONE_BRICKS.get(),
                NidavellirBlocks.NIDAVELLIR_ENHANCED_STONE_BRICKS_STAIRS.get(),
                NidavellirBlocks.NIDAVELLIR_ENHANCED_STONE_BRICKS_SLAB.get(),
                NidavellirBlocks.NIDAVELLIR_ENHANCED_STONE_BRICKS_WALL.get(),
                NidavellirBlocks.NIDAVELLIR_ENHANCED_STONE_BRICKS_MOSSY.get(),
                NidavellirBlocks.NIDAVELLIR_ENHANCED_STONE_BRICKS_CRACKED.get(),
                NidavellirBlocks.NIDAVELLIR_ENHANCED_STONE_BRICKS_CHISELED.get(),

                NidavellirBlocks.NIDAVELLIR_ENHANCED_STONE_IRON_ORE.get(),
                NidavellirBlocks.NIDAVELLIR_ENHANCED_STONE_GOLD_ORE.get(),
                NidavellirBlocks.NIDAVELLIR_ENHANCED_STONE_COPPER_ORE.get(),
                NidavellirBlocks.NIDAVELLIR_ENHANCED_STONE_TIN_ORE.get(),
                NidavellirBlocks.NIDAVELLIR_ENHANCED_STONE_ZINC_ORE.get(),
                NidavellirBlocks.NIDAVELLIR_ENHANCED_STONE_COAL_ORE.get(),

                NidavellirBlocks.NIDAVELLIR_ENHANCED_STONE_IRON_ORE_CLUSTER.get(),
                NidavellirBlocks.NIDAVELLIR_ENHANCED_STONE_GOLD_ORE_CLUSTER.get(),
                NidavellirBlocks.NIDAVELLIR_ENHANCED_STONE_COPPER_ORE_CLUSTER.get(),
                NidavellirBlocks.NIDAVELLIR_ENHANCED_STONE_TIN_ORE_CLUSTER.get(),
                NidavellirBlocks.NIDAVELLIR_ENHANCED_STONE_ZINC_ORE_CLUSTER.get(),
                NidavellirBlocks.NIDAVELLIR_ENHANCED_STONE_COAL_ORE_CLUSTER.get(),

                NidavellirBlocks.NIDAVELLIR_DEEPSLATE_STONE.get(),
                NidavellirBlocks.NIDAVELLIR_DEEPSLATE_STONE_STAIRS.get(),
                NidavellirBlocks.NIDAVELLIR_DEEPSLATE_STONE_SLAB.get(),
                NidavellirBlocks.NIDAVELLIR_DEEPSLATE_STONE_PRESSURE_PLATE.get(),
                NidavellirBlocks.NIDAVELLIR_DEEPSLATE_STONE_BUTTON.get(),
                NidavellirBlocks.NIDAVELLIR_DEEPSLATE_STONE_WALL.get(),
                NidavellirBlocks.NIDAVELLIR_DEEPSLATE_SMOOTH_STONE.get(),
                NidavellirBlocks.NIDAVELLIR_DEEPSLATE_COBBLESTONE.get(),
                NidavellirBlocks.NIDAVELLIR_DEEPSLATE_COBBLESTONE_STAIRS.get(),
                NidavellirBlocks.NIDAVELLIR_DEEPSLATE_COBBLESTONE_SLAB.get(),
                NidavellirBlocks.NIDAVELLIR_DEEPSLATE_COBBLESTONE_WALL.get(),
                NidavellirBlocks.NIDAVELLIR_DEEPSLATE_COBBLESTONE_MOSSY.get(),
                NidavellirBlocks.NIDAVELLIR_DEEPSLATE_STONE_BRICKS.get(),
                NidavellirBlocks.NIDAVELLIR_DEEPSLATE_STONE_BRICKS_STAIRS.get(),
                NidavellirBlocks.NIDAVELLIR_DEEPSLATE_STONE_BRICKS_SLAB.get(),
                NidavellirBlocks.NIDAVELLIR_DEEPSLATE_STONE_BRICKS_WALL.get(),
                NidavellirBlocks.NIDAVELLIR_DEEPSLATE_STONE_BRICKS_MOSSY.get(),
                NidavellirBlocks.NIDAVELLIR_DEEPSLATE_STONE_BRICKS_CRACKED.get(),
                NidavellirBlocks.NIDAVELLIR_DEEPSLATE_STONE_BRICKS_CHISELED.get(),

                NidavellirBlocks.NIDAVELLIR_DEEPSLATE_STONE_IRON_ORE.get(),
                NidavellirBlocks.NIDAVELLIR_DEEPSLATE_STONE_GOLD_ORE.get(),
                NidavellirBlocks.NIDAVELLIR_DEEPSLATE_STONE_COPPER_ORE.get(),
                NidavellirBlocks.NIDAVELLIR_DEEPSLATE_STONE_TIN_ORE.get(),
                NidavellirBlocks.NIDAVELLIR_DEEPSLATE_STONE_ZINC_ORE.get(),
                NidavellirBlocks.NIDAVELLIR_DEEPSLATE_STONE_COAL_ORE.get(),

                NidavellirBlocks.NIDAVELLIR_DEEPSLATE_STONE_IRON_ORE_CLUSTER.get(),
                NidavellirBlocks.NIDAVELLIR_DEEPSLATE_STONE_GOLD_ORE_CLUSTER.get(),
                NidavellirBlocks.NIDAVELLIR_DEEPSLATE_STONE_COPPER_ORE_CLUSTER.get(),
                NidavellirBlocks.NIDAVELLIR_DEEPSLATE_STONE_TIN_ORE_CLUSTER.get(),
                NidavellirBlocks.NIDAVELLIR_DEEPSLATE_STONE_ZINC_ORE_CLUSTER.get(),
                NidavellirBlocks.NIDAVELLIR_DEEPSLATE_STONE_COAL_ORE_CLUSTER.get(),

                UnderworldBlocks.TARTARUS_STONE.get(),
                UnderworldBlocks.TARTARUS_STONE_STAIRS.get(),
                UnderworldBlocks.TARTARUS_STONE_SLAB.get(),
                UnderworldBlocks.TARTARUS_STONE_PRESSURE_PLATE.get(),
                UnderworldBlocks.TARTARUS_STONE_BUTTON.get(),
                UnderworldBlocks.TARTARUS_STONE_WALL.get(),
                UnderworldBlocks.TARTARUS_STONE_SMOOTH_STONE.get(),
                UnderworldBlocks.TARTARUS_STONE_COBBLESTONE.get(),
                UnderworldBlocks.TARTARUS_STONE_COBBLESTONE_STAIRS.get(),
                UnderworldBlocks.TARTARUS_STONE_COBBLESTONE_SLAB.get(),
                UnderworldBlocks.TARTARUS_STONE_COBBLESTONE_WALL.get(),
                UnderworldBlocks.TARTARUS_STONE_COBBLESTONE_MOSSY.get(),
                UnderworldBlocks.TARTARUS_STONE_BRICKS.get(),
                UnderworldBlocks.TARTARUS_STONE_BRICKS_STAIRS.get(),
                UnderworldBlocks.TARTARUS_STONE_BRICKS_SLAB.get(),
                UnderworldBlocks.TARTARUS_STONE_BRICKS_WALL.get(),
                UnderworldBlocks.TARTARUS_STONE_BRICKS_MOSSY.get(),
                UnderworldBlocks.TARTARUS_STONE_BRICKS_CRACKED.get(),
                UnderworldBlocks.TARTARUS_STONE_BRICKS_CHISELED.get()
        );

        this.tag(ModTags.Blocks.NEEDS_NETHERITE_TOOL).add(
                NidavellirBlocks.NIDAVELLIR_ENHANCED_STONE_DIAMOND_ORE.get(),
                NidavellirBlocks.NIDAVELLIR_ENHANCED_STONE_EMERALD_ORE.get(),
                NidavellirBlocks.NIDAVELLIR_ENHANCED_STONE_REDSTONE_ORE.get(),
                NidavellirBlocks.NIDAVELLIR_ENHANCED_STONE_LAPIS_ORE.get(),
                NidavellirBlocks.NIDAVELLIR_ENHANCED_STONE_AQUAMARINE_ORE.get(),
                NidavellirBlocks.NIDAVELLIR_ENHANCED_STONE_OPAL_ORE.get(),
                NidavellirBlocks.NIDAVELLIR_ENHANCED_STONE_RUBY_ORE.get(),
                NidavellirBlocks.NIDAVELLIR_ENHANCED_STONE_DIAMOND_ORE_CLUSTER.get(),
                NidavellirBlocks.NIDAVELLIR_ENHANCED_STONE_EMERALD_ORE_CLUSTER.get(),
                NidavellirBlocks.NIDAVELLIR_ENHANCED_STONE_REDSTONE_ORE_CLUSTER.get(),
                NidavellirBlocks.NIDAVELLIR_ENHANCED_STONE_LAPIS_ORE_CLUSTER.get(),
                NidavellirBlocks.NIDAVELLIR_ENHANCED_STONE_AQUAMARINE_ORE_CLUSTER.get(),
                NidavellirBlocks.NIDAVELLIR_ENHANCED_STONE_OPAL_ORE_CLUSTER.get(),
                NidavellirBlocks.NIDAVELLIR_ENHANCED_STONE_RUBY_ORE_CLUSTER.get(),

                NidavellirBlocks.NIDAVELLIR_DEEPSLATE_STONE_DIAMOND_ORE.get(),
                NidavellirBlocks.NIDAVELLIR_DEEPSLATE_STONE_EMERALD_ORE.get(),
                NidavellirBlocks.NIDAVELLIR_DEEPSLATE_STONE_REDSTONE_ORE.get(),
                NidavellirBlocks.NIDAVELLIR_DEEPSLATE_STONE_LAPIS_ORE.get(),
                NidavellirBlocks.NIDAVELLIR_DEEPSLATE_STONE_AQUAMARINE_ORE.get(),
                NidavellirBlocks.NIDAVELLIR_DEEPSLATE_STONE_OPAL_ORE.get(),
                NidavellirBlocks.NIDAVELLIR_DEEPSLATE_STONE_RUBY_ORE.get(),
                NidavellirBlocks.NIDAVELLIR_DEEPSLATE_STONE_DIAMOND_ORE_CLUSTER.get(),
                NidavellirBlocks.NIDAVELLIR_DEEPSLATE_STONE_EMERALD_ORE_CLUSTER.get(),
                NidavellirBlocks.NIDAVELLIR_DEEPSLATE_STONE_REDSTONE_ORE_CLUSTER.get(),
                NidavellirBlocks.NIDAVELLIR_DEEPSLATE_STONE_LAPIS_ORE_CLUSTER.get(),
                NidavellirBlocks.NIDAVELLIR_DEEPSLATE_STONE_AQUAMARINE_ORE_CLUSTER.get(),
                NidavellirBlocks.NIDAVELLIR_DEEPSLATE_STONE_OPAL_ORE_CLUSTER.get(),
                NidavellirBlocks.NIDAVELLIR_DEEPSLATE_STONE_RUBY_ORE_CLUSTER.get()
        );

//        this.tag(ModTags.Blocks.NEEDS_NETHER_STEEL_TOOL).add(
//
//        );

        this.tag(ModTags.Blocks.PAXEL_MINEABLE).addTags(
                BlockTags.MINEABLE_WITH_PICKAXE,
                BlockTags.MINEABLE_WITH_SHOVEL,
                BlockTags.MINEABLE_WITH_AXE
        );

        this.tag(BlockTags.FENCES).add(
                UnderworldBlocks.ELDER_WOOD_PLANKS_FENCE.get(),
                UnderworldBlocks.OLIVE_PLANKS_FENCE.get(),
                UnderworldBlocks.MYRRH_PLANKS_FENCE.get(),
                UnderworldBlocks.LAUREL_PLANKS_FENCE.get(),
                UnderworldBlocks.CYPRESS_PLANKS_FENCE.get()
        );
//                .add(ModBlocks.CRIMSON_STONE_FENCE.get())

        this.tag(BlockTags.FENCE_GATES).add(
                UnderworldBlocks.ELDER_WOOD_PLANKS_FENCE_GATE.get(),
                UnderworldBlocks.OLIVE_PLANKS_FENCE_GATE.get(),
                UnderworldBlocks.MYRRH_PLANKS_FENCE_GATE.get(),
                UnderworldBlocks.LAUREL_PLANKS_FENCE_GATE.get(),
                UnderworldBlocks.CYPRESS_PLANKS_FENCE_GATE.get()
        );

        this.tag(BlockTags.WALLS).add(
                NidavellirBlocks.NIDAVELLIR_SOFT_STONE_WALL.get(),
                NidavellirBlocks.NIDAVELLIR_SOFT_COBBLESTONE_WALL.get(),
                NidavellirBlocks.NIDAVELLIR_SOFT_STONE_BRICKS_WALL.get(),
                NidavellirBlocks.NIDAVELLIR_HARD_STONE_WALL.get(),
                NidavellirBlocks.NIDAVELLIR_HARD_COBBLESTONE_WALL.get(),
                NidavellirBlocks.NIDAVELLIR_HARD_STONE_BRICKS_WALL.get(),
                NidavellirBlocks.NIDAVELLIR_ENHANCED_STONE_WALL.get(),
                NidavellirBlocks.NIDAVELLIR_ENHANCED_COBBLESTONE_WALL.get(),
                NidavellirBlocks.NIDAVELLIR_ENHANCED_STONE_BRICKS_WALL.get(),
                NidavellirBlocks.NIDAVELLIR_DEEPSLATE_STONE_WALL.get(),
                NidavellirBlocks.NIDAVELLIR_DEEPSLATE_COBBLESTONE_WALL.get(),
                NidavellirBlocks.NIDAVELLIR_DEEPSLATE_STONE_BRICKS_WALL.get(),
                NidavellirBlocks.NIDAVELLIR_CRIMSON_STONE_WALL.get(),
                NidavellirBlocks.NIDAVELLIR_CRIMSON_COBBLESTONE_WALL.get(),
                NidavellirBlocks.NIDAVELLIR_CRIMSON_STONE_BRICKS_WALL.get(),
                UnderworldBlocks.TARTARUS_STONE_WALL.get(),
                UnderworldBlocks.TARTARUS_STONE_COBBLESTONE_WALL.get(),
                UnderworldBlocks.TARTARUS_STONE_BRICKS_WALL.get()
        );

        this.tag(BlockTags.LOGS_THAT_BURN).add(
                UnderworldBlocks.ELDER_WOOD_LOG.get(),
                UnderworldBlocks.ELDER_WOOD.get(),
                UnderworldBlocks.STRIPPED_ELDER_WOOD_LOG.get(),
                UnderworldBlocks.STRIPPED_ELDER_WOOD.get(),
                UnderworldBlocks.OLIVE_LOG.get(),
                UnderworldBlocks.OLIVE_WOOD.get(),
                UnderworldBlocks.STRIPPED_OLIVE_LOG.get(),
                UnderworldBlocks.STRIPPED_OLIVE_WOOD.get(),
                UnderworldBlocks.MYRRH_LOG.get(),
                UnderworldBlocks.MYRRH_WOOD.get(),
                UnderworldBlocks.STRIPPED_MYRRH_LOG.get(),
                UnderworldBlocks.STRIPPED_MYRRH_WOOD.get(),
                UnderworldBlocks.LAUREL_LOG.get(),
                UnderworldBlocks.LAUREL_WOOD.get(),
                UnderworldBlocks.STRIPPED_LAUREL_LOG.get(),
                UnderworldBlocks.STRIPPED_LAUREL_WOOD.get(),
                UnderworldBlocks.CYPRESS_LOG.get(),
                UnderworldBlocks.CYPRESS_WOOD.get(),
                UnderworldBlocks.STRIPPED_CYPRESS_LOG.get(),
                UnderworldBlocks.STRIPPED_CYPRESS_WOOD.get(),
                AlfheimrBlocks.BLACK_BIRCH_LOG.get(),
                AlfheimrBlocks.BLACK_BIRCH_WOOD.get(),
                AlfheimrBlocks.STRIPPED_BLACK_BIRCH_LOG.get(),
                AlfheimrBlocks.STRIPPED_BLACK_BIRCH_WOOD.get(),
                AlfheimrBlocks.WHITE_OAK_LOG.get(),
                AlfheimrBlocks.WHITE_OAK_WOOD.get(),
                AlfheimrBlocks.STRIPPED_WHITE_OAK_LOG.get(),
                AlfheimrBlocks.STRIPPED_WHITE_OAK_WOOD.get(),
                AlfheimrBlocks.BUR_OAK_LOG.get(),
                AlfheimrBlocks.BUR_OAK_WOOD.get(),
                AlfheimrBlocks.STRIPPED_BUR_OAK_LOG.get(),
                AlfheimrBlocks.STRIPPED_BUR_OAK_WOOD.get(),
                AlfheimrBlocks.BLOOD_CHERRY_LOG.get(),
                AlfheimrBlocks.BLOOD_CHERRY_WOOD.get(),
                AlfheimrBlocks.STRIPPED_BLOOD_CHERRY_LOG.get(),
                AlfheimrBlocks.STRIPPED_BLOOD_CHERRY_WOOD.get(),
                AlfheimrBlocks.SACRED_TREE_LOG.get(),
                AlfheimrBlocks.SACRED_TREE_WOOD.get(),
                AlfheimrBlocks.STRIPPED_SACRED_TREE_LOG.get(),
                AlfheimrBlocks.STRIPPED_SACRED_TREE_WOOD.get(),
                AlfheimrBlocks.WILLOW_LOG.get(),
                AlfheimrBlocks.WILLOW_WOOD.get(),
                AlfheimrBlocks.STRIPPED_WILLOW_LOG.get(),
                AlfheimrBlocks.STRIPPED_WILLOW_WOOD.get(),
                AlfheimrBlocks.DEADWOOD_LOG.get(),
                AlfheimrBlocks.DEADWOOD_WOOD.get(),
                AlfheimrBlocks.STRIPPED_DEADWOOD_LOG.get(),
                AlfheimrBlocks.STRIPPED_DEADWOOD_WOOD.get(),
                AlfheimrBlocks.EBONY_KINGSWOOD_LOG.get(),
                AlfheimrBlocks.EBONY_KINGSWOOD_WOOD.get(),
                AlfheimrBlocks.STRIPPED_EBONY_KINGSWOOD_LOG.get(),
                AlfheimrBlocks.STRIPPED_EBONY_KINGSWOOD_WOOD.get(),
                AlfheimrBlocks.IVORY_KINGSWOOD_LOG.get(),
                AlfheimrBlocks.IVORY_KINGSWOOD_WOOD.get(),
                AlfheimrBlocks.STRIPPED_IVORY_KINGSWOOD_LOG.get(),
                AlfheimrBlocks.STRIPPED_IVORY_KINGSWOOD_WOOD.get(),
                AlfheimrBlocks.WEAVER_LOG.get(),
                AlfheimrBlocks.WEAVER_WOOD.get(),
                AlfheimrBlocks.STRIPPED_WEAVER_LOG.get(),
                AlfheimrBlocks.STRIPPED_WEAVER_WOOD.get()
        );

        this.tag(BlockTags.PLANKS).add(
                UnderworldBlocks.ELDER_WOOD_PLANKS.get(),
                UnderworldBlocks.OLIVE_PLANKS.get(),
                UnderworldBlocks.MYRRH_PLANKS.get(),
                UnderworldBlocks.LAUREL_PLANKS.get(),
                UnderworldBlocks.CYPRESS_PLANKS.get(),
                AlfheimrBlocks.BLACK_BIRCH_PLANKS.get(),
                AlfheimrBlocks.WHITE_OAK_PLANKS.get(),
                AlfheimrBlocks.BUR_OAK_PLANKS.get(),
                AlfheimrBlocks.BLOOD_CHERRY_PLANKS.get(),
                AlfheimrBlocks.SACRED_TREE_PLANKS.get(),
                AlfheimrBlocks.WILLOW_PLANKS.get(),
                AlfheimrBlocks.DEADWOOD_PLANKS.get(),
                AlfheimrBlocks.EBONY_KINGSWOOD_PLANKS.get(),
                AlfheimrBlocks.IVORY_KINGSWOOD_PLANKS.get(),
                AlfheimrBlocks.WEAVER_PLANKS.get()
        );

        this.tag(BlockTags.WOODEN_DOORS).add(
                UnderworldBlocks.ELDER_WOOD_PLANKS_DOOR.get(),
                UnderworldBlocks.OLIVE_PLANKS_DOOR.get(),
                UnderworldBlocks.MYRRH_PLANKS_DOOR.get(),
                UnderworldBlocks.LAUREL_PLANKS_DOOR.get(),
                UnderworldBlocks.CYPRESS_PLANKS_DOOR.get(),
                AlfheimrBlocks.BLACK_BIRCH_PLANKS_DOOR.get(),
                AlfheimrBlocks.WHITE_OAK_PLANKS_DOOR.get(),
                AlfheimrBlocks.BUR_OAK_PLANKS_DOOR.get(),
                AlfheimrBlocks.BLOOD_CHERRY_PLANKS_DOOR.get(),
                AlfheimrBlocks.SACRED_TREE_PLANKS_DOOR.get(),
                AlfheimrBlocks.WILLOW_PLANKS_DOOR.get(),
                AlfheimrBlocks.DEADWOOD_PLANKS_DOOR.get(),
                AlfheimrBlocks.EBONY_KINGSWOOD_PLANKS_DOOR.get(),
                AlfheimrBlocks.IVORY_KINGSWOOD_PLANKS_DOOR.get(),
                AlfheimrBlocks.WEAVER_PLANKS_DOOR.get()
        );

        this.tag(BlockTags.WOODEN_FENCES).add(
                UnderworldBlocks.ELDER_WOOD_PLANKS_FENCE.get(),
                UnderworldBlocks.OLIVE_PLANKS_FENCE.get(),
                UnderworldBlocks.MYRRH_PLANKS_FENCE.get(),
                UnderworldBlocks.LAUREL_PLANKS_FENCE.get(),
                UnderworldBlocks.CYPRESS_PLANKS_FENCE.get(),
                AlfheimrBlocks.BLACK_BIRCH_PLANKS_FENCE.get(),
                AlfheimrBlocks.WHITE_OAK_PLANKS_FENCE.get(),
                AlfheimrBlocks.BUR_OAK_PLANKS_FENCE.get(),
                AlfheimrBlocks.BLOOD_CHERRY_PLANKS_FENCE.get(),
                AlfheimrBlocks.SACRED_TREE_PLANKS_FENCE.get(),
                AlfheimrBlocks.WILLOW_PLANKS_FENCE.get(),
                AlfheimrBlocks.DEADWOOD_PLANKS_FENCE.get(),
                AlfheimrBlocks.EBONY_KINGSWOOD_PLANKS_FENCE.get(),
                AlfheimrBlocks.IVORY_KINGSWOOD_PLANKS_FENCE.get(),
                AlfheimrBlocks.WEAVER_PLANKS_FENCE.get()
        );

        this.tag(BlockTags.WOODEN_BUTTONS).add(
                UnderworldBlocks.ELDER_WOOD_PLANKS_BUTTON.get(),
                UnderworldBlocks.OLIVE_PLANKS_BUTTON.get(),
                UnderworldBlocks.MYRRH_PLANKS_BUTTON.get(),
                UnderworldBlocks.LAUREL_PLANKS_BUTTON.get(),
                UnderworldBlocks.CYPRESS_PLANKS_BUTTON.get(),
                AlfheimrBlocks.BLACK_BIRCH_PLANKS_BUTTON.get(),
                AlfheimrBlocks.WHITE_OAK_PLANKS_BUTTON.get(),
                AlfheimrBlocks.BUR_OAK_PLANKS_BUTTON.get(),
                AlfheimrBlocks.BLOOD_CHERRY_PLANKS_BUTTON.get(),
                AlfheimrBlocks.SACRED_TREE_PLANKS_BUTTON.get(),
                AlfheimrBlocks.WILLOW_PLANKS_BUTTON.get(),
                AlfheimrBlocks.DEADWOOD_PLANKS_BUTTON.get(),
                AlfheimrBlocks.EBONY_KINGSWOOD_PLANKS_BUTTON.get(),
                AlfheimrBlocks.IVORY_KINGSWOOD_PLANKS_BUTTON.get(),
                AlfheimrBlocks.WEAVER_PLANKS_BUTTON.get()
        );

        this.tag(BlockTags.WOODEN_SLABS).add(
                UnderworldBlocks.ELDER_WOOD_PLANKS_SLAB.get(),
                UnderworldBlocks.OLIVE_PLANKS_SLAB.get(),
                UnderworldBlocks.MYRRH_PLANKS_SLAB.get(),
                UnderworldBlocks.LAUREL_PLANKS_SLAB.get(),
                UnderworldBlocks.CYPRESS_PLANKS_SLAB.get(),
                AlfheimrBlocks.BLACK_BIRCH_PLANKS_SLAB.get(),
                AlfheimrBlocks.WHITE_OAK_PLANKS_SLAB.get(),
                AlfheimrBlocks.BUR_OAK_PLANKS_SLAB.get(),
                AlfheimrBlocks.BLOOD_CHERRY_PLANKS_SLAB.get(),
                AlfheimrBlocks.SACRED_TREE_PLANKS_SLAB.get(),
                AlfheimrBlocks.WILLOW_PLANKS_SLAB.get(),
                AlfheimrBlocks.DEADWOOD_PLANKS_SLAB.get(),
                AlfheimrBlocks.EBONY_KINGSWOOD_PLANKS_SLAB.get(),
                AlfheimrBlocks.IVORY_KINGSWOOD_PLANKS_SLAB.get(),
                AlfheimrBlocks.WEAVER_PLANKS_SLAB.get()
        );

        this.tag(BlockTags.WOODEN_STAIRS).add(
                UnderworldBlocks.ELDER_WOOD_PLANKS_STAIRS.get(),
                UnderworldBlocks.OLIVE_PLANKS_STAIRS.get(),
                UnderworldBlocks.MYRRH_PLANKS_STAIRS.get(),
                UnderworldBlocks.LAUREL_PLANKS_STAIRS.get(),
                UnderworldBlocks.CYPRESS_PLANKS_STAIRS.get(),
                AlfheimrBlocks.BLACK_BIRCH_PLANKS_STAIRS.get(),
                AlfheimrBlocks.WHITE_OAK_PLANKS_STAIRS.get(),
                AlfheimrBlocks.BUR_OAK_PLANKS_STAIRS.get(),
                AlfheimrBlocks.BLOOD_CHERRY_PLANKS_STAIRS.get(),
                AlfheimrBlocks.SACRED_TREE_PLANKS_STAIRS.get(),
                AlfheimrBlocks.WILLOW_PLANKS_STAIRS.get(),
                AlfheimrBlocks.DEADWOOD_PLANKS_STAIRS.get(),
                AlfheimrBlocks.EBONY_KINGSWOOD_PLANKS_STAIRS.get(),
                AlfheimrBlocks.IVORY_KINGSWOOD_PLANKS_STAIRS.get(),
                AlfheimrBlocks.WEAVER_PLANKS_STAIRS.get()
        );

        this.tag(BlockTags.WOODEN_PRESSURE_PLATES).add(
                UnderworldBlocks.ELDER_WOOD_PLANKS_PRESSURE_PLATE.get(),
                UnderworldBlocks.OLIVE_PLANKS_PRESSURE_PLATE.get(),
                UnderworldBlocks.MYRRH_PLANKS_PRESSURE_PLATE.get(),
                UnderworldBlocks.LAUREL_PLANKS_PRESSURE_PLATE.get(),
                UnderworldBlocks.CYPRESS_PLANKS_PRESSURE_PLATE.get(),
                AlfheimrBlocks.BLACK_BIRCH_PLANKS_PRESSURE_PLATE.get(),
                AlfheimrBlocks.WHITE_OAK_PLANKS_PRESSURE_PLATE.get(),
                AlfheimrBlocks.BUR_OAK_PLANKS_PRESSURE_PLATE.get(),
                AlfheimrBlocks.BLOOD_CHERRY_PLANKS_PRESSURE_PLATE.get(),
                AlfheimrBlocks.SACRED_TREE_PLANKS_PRESSURE_PLATE.get(),
                AlfheimrBlocks.WILLOW_PLANKS_PRESSURE_PLATE.get(),
                AlfheimrBlocks.DEADWOOD_PLANKS_PRESSURE_PLATE.get(),
                AlfheimrBlocks.EBONY_KINGSWOOD_PLANKS_PRESSURE_PLATE.get(),
                AlfheimrBlocks.IVORY_KINGSWOOD_PLANKS_PRESSURE_PLATE.get(),
                AlfheimrBlocks.WEAVER_PLANKS_PRESSURE_PLATE.get()
        );

        this.tag(BlockTags.WOODEN_TRAPDOORS).add(
                UnderworldBlocks.ELDER_WOOD_PLANKS_TRAPDOOR.get(),
                UnderworldBlocks.OLIVE_PLANKS_TRAPDOOR.get(),
                UnderworldBlocks.MYRRH_PLANKS_TRAPDOOR.get(),
                UnderworldBlocks.LAUREL_PLANKS_TRAPDOOR.get(),
                UnderworldBlocks.CYPRESS_PLANKS_TRAPDOOR.get(),
                AlfheimrBlocks.BLACK_BIRCH_PLANKS_TRAPDOOR.get(),
                AlfheimrBlocks.WHITE_OAK_PLANKS_TRAPDOOR.get(),
                AlfheimrBlocks.BUR_OAK_PLANKS_TRAPDOOR.get(),
                AlfheimrBlocks.BLOOD_CHERRY_PLANKS_TRAPDOOR.get(),
                AlfheimrBlocks.SACRED_TREE_PLANKS_TRAPDOOR.get(),
                AlfheimrBlocks.WILLOW_PLANKS_TRAPDOOR.get(),
                AlfheimrBlocks.DEADWOOD_PLANKS_TRAPDOOR.get(),
                AlfheimrBlocks.EBONY_KINGSWOOD_PLANKS_TRAPDOOR.get(),
                AlfheimrBlocks.IVORY_KINGSWOOD_PLANKS_TRAPDOOR.get(),
                AlfheimrBlocks.WEAVER_PLANKS_TRAPDOOR.get()
        );

        this.tag(ModTags.Blocks.ELDER_WOOD).add(
                UnderworldBlocks.ELDER_WOOD_LOG.get(),
                UnderworldBlocks.ELDER_WOOD.get(),
                UnderworldBlocks.STRIPPED_ELDER_WOOD_LOG.get(),
                UnderworldBlocks.STRIPPED_ELDER_WOOD.get(),
                UnderworldBlocks.ELDER_WOOD_LEAVES.get(),
                UnderworldBlocks.ELDER_WOOD_PLANKS.get(),
                UnderworldBlocks.ELDER_WOOD_PLANKS_SLAB.get(),
                UnderworldBlocks.ELDER_WOOD_PLANKS_STAIRS.get(),
                UnderworldBlocks.ELDER_WOOD_PLANKS_PRESSURE_PLATE.get(),
                UnderworldBlocks.ELDER_WOOD_PLANKS_DOOR.get(),
                UnderworldBlocks.ELDER_WOOD_PLANKS_TRAPDOOR.get(),
                UnderworldBlocks.ELDER_WOOD_PLANKS_FENCE.get(),
                UnderworldBlocks.ELDER_WOOD_PLANKS_FENCE_GATE.get(),
                UnderworldBlocks.ELDER_WOOD_PLANKS_BUTTON.get()
        );

        this.tag(ModTags.Blocks.ELDER_WOOD_LOGS).add(
                UnderworldBlocks.ELDER_WOOD_LOG.get(),
                UnderworldBlocks.ELDER_WOOD.get(),
                UnderworldBlocks.STRIPPED_ELDER_WOOD_LOG.get(),
                UnderworldBlocks.STRIPPED_ELDER_WOOD.get()
        );

        this.tag(ModTags.Blocks.ELDER_WOOD_STRIPPED_LOGS).add(
                UnderworldBlocks.STRIPPED_ELDER_WOOD_LOG.get(),
                UnderworldBlocks.STRIPPED_ELDER_WOOD.get()
        );

        this.tag(ModTags.Blocks.OLIVE_WOOD).add(
                UnderworldBlocks.OLIVE_LOG.get(),
                UnderworldBlocks.OLIVE_WOOD.get(),
                UnderworldBlocks.STRIPPED_OLIVE_LOG.get(),
                UnderworldBlocks.STRIPPED_OLIVE_WOOD.get(),
                UnderworldBlocks.OLIVE_LEAVES.get(),
                UnderworldBlocks.OLIVE_PLANKS.get(),
                UnderworldBlocks.OLIVE_PLANKS_SLAB.get(),
                UnderworldBlocks.OLIVE_PLANKS_STAIRS.get(),
                UnderworldBlocks.OLIVE_PLANKS_PRESSURE_PLATE.get(),
                UnderworldBlocks.OLIVE_PLANKS_DOOR.get(),
                UnderworldBlocks.OLIVE_PLANKS_TRAPDOOR.get(),
                UnderworldBlocks.OLIVE_PLANKS_FENCE.get(),
                UnderworldBlocks.OLIVE_PLANKS_FENCE_GATE.get(),
                UnderworldBlocks.OLIVE_PLANKS_BUTTON.get()
        );

        this.tag(ModTags.Blocks.OLIVE_LOGS).add(
                UnderworldBlocks.OLIVE_LOG.get(),
                UnderworldBlocks.OLIVE_WOOD.get(),
                UnderworldBlocks.STRIPPED_OLIVE_LOG.get(),
                UnderworldBlocks.STRIPPED_OLIVE_WOOD.get()
        );

        this.tag(ModTags.Blocks.OLIVE_STRIPPED_LOGS).add(
                UnderworldBlocks.STRIPPED_OLIVE_LOG.get(),
                UnderworldBlocks.STRIPPED_OLIVE_WOOD.get()
        );

        this.tag(ModTags.Blocks.MYRRH_WOOD).add(
                UnderworldBlocks.MYRRH_LOG.get(),
                UnderworldBlocks.MYRRH_WOOD.get(),
                UnderworldBlocks.STRIPPED_MYRRH_LOG.get(),
                UnderworldBlocks.STRIPPED_MYRRH_WOOD.get(),
                UnderworldBlocks.MYRRH_LEAVES.get(),
                UnderworldBlocks.MYRRH_PLANKS.get(),
                UnderworldBlocks.MYRRH_PLANKS_SLAB.get(),
                UnderworldBlocks.MYRRH_PLANKS_STAIRS.get(),
                UnderworldBlocks.MYRRH_PLANKS_PRESSURE_PLATE.get(),
                UnderworldBlocks.MYRRH_PLANKS_DOOR.get(),
                UnderworldBlocks.MYRRH_PLANKS_TRAPDOOR.get(),
                UnderworldBlocks.MYRRH_PLANKS_FENCE.get(),
                UnderworldBlocks.MYRRH_PLANKS_FENCE_GATE.get(),
                UnderworldBlocks.MYRRH_PLANKS_BUTTON.get()
        );

        this.tag(ModTags.Blocks.MYRRH_LOGS).add(
                UnderworldBlocks.MYRRH_LOG.get(),
                UnderworldBlocks.MYRRH_WOOD.get(),
                UnderworldBlocks.STRIPPED_MYRRH_LOG.get(),
                UnderworldBlocks.STRIPPED_MYRRH_WOOD.get()
        );

        this.tag(ModTags.Blocks.MYRRH_STRIPPED_LOGS).add(
                UnderworldBlocks.STRIPPED_MYRRH_LOG.get(),
                UnderworldBlocks.STRIPPED_MYRRH_WOOD.get()
        );

        this.tag(ModTags.Blocks.LAUREL_WOOD).add(
                UnderworldBlocks.LAUREL_LOG.get(),
                UnderworldBlocks.LAUREL_WOOD.get(),
                UnderworldBlocks.STRIPPED_LAUREL_LOG.get(),
                UnderworldBlocks.STRIPPED_LAUREL_WOOD.get(),
                UnderworldBlocks.LAUREL_LEAVES.get(),
                UnderworldBlocks.LAUREL_PLANKS.get(),
                UnderworldBlocks.LAUREL_PLANKS_SLAB.get(),
                UnderworldBlocks.LAUREL_PLANKS_STAIRS.get(),
                UnderworldBlocks.LAUREL_PLANKS_PRESSURE_PLATE.get(),
                UnderworldBlocks.LAUREL_PLANKS_DOOR.get(),
                UnderworldBlocks.LAUREL_PLANKS_TRAPDOOR.get(),
                UnderworldBlocks.LAUREL_PLANKS_FENCE.get(),
                UnderworldBlocks.LAUREL_PLANKS_FENCE_GATE.get(),
                UnderworldBlocks.LAUREL_PLANKS_BUTTON.get()
        );

        this.tag(ModTags.Blocks.LAUREL_LOGS).add(
                UnderworldBlocks.LAUREL_LOG.get(),
                UnderworldBlocks.LAUREL_WOOD.get(),
                UnderworldBlocks.STRIPPED_LAUREL_LOG.get(),
                UnderworldBlocks.STRIPPED_LAUREL_WOOD.get()
        );

        this.tag(ModTags.Blocks.LAUREL_STRIPPED_LOGS).add(
                UnderworldBlocks.STRIPPED_LAUREL_LOG.get(),
                UnderworldBlocks.STRIPPED_LAUREL_WOOD.get()
        );

        this.tag(ModTags.Blocks.CYPRESS_WOOD).add(
                UnderworldBlocks.CYPRESS_LOG.get(),
                UnderworldBlocks.CYPRESS_WOOD.get(),
                UnderworldBlocks.STRIPPED_CYPRESS_LOG.get(),
                UnderworldBlocks.STRIPPED_CYPRESS_WOOD.get(),
                UnderworldBlocks.CYPRESS_LEAVES.get(),
                UnderworldBlocks.CYPRESS_PLANKS.get(),
                UnderworldBlocks.CYPRESS_PLANKS_SLAB.get(),
                UnderworldBlocks.CYPRESS_PLANKS_STAIRS.get(),
                UnderworldBlocks.CYPRESS_PLANKS_PRESSURE_PLATE.get(),
                UnderworldBlocks.CYPRESS_PLANKS_DOOR.get(),
                UnderworldBlocks.CYPRESS_PLANKS_TRAPDOOR.get(),
                UnderworldBlocks.CYPRESS_PLANKS_FENCE.get(),
                UnderworldBlocks.CYPRESS_PLANKS_FENCE_GATE.get(),
                UnderworldBlocks.CYPRESS_PLANKS_BUTTON.get()
        );

        this.tag(ModTags.Blocks.CYPRESS_LOGS).add(
                UnderworldBlocks.CYPRESS_LOG.get(),
                UnderworldBlocks.CYPRESS_WOOD.get(),
                UnderworldBlocks.STRIPPED_CYPRESS_LOG.get(),
                UnderworldBlocks.STRIPPED_CYPRESS_WOOD.get()
        );

        this.tag(ModTags.Blocks.CYPRESS_STRIPPED_LOGS).add(
                UnderworldBlocks.STRIPPED_CYPRESS_LOG.get(),
                UnderworldBlocks.STRIPPED_CYPRESS_WOOD.get()
        );

        this.tag(ModTags.Blocks.BLACK_BIRCH_WOOD).add(
                AlfheimrBlocks.BLACK_BIRCH_LOG.get(),
                AlfheimrBlocks.BLACK_BIRCH_WOOD.get(),
                AlfheimrBlocks.STRIPPED_BLACK_BIRCH_LOG.get(),
                AlfheimrBlocks.STRIPPED_BLACK_BIRCH_WOOD.get(),
                AlfheimrBlocks.BLACK_BIRCH_LEAVES.get(),
                AlfheimrBlocks.BLACK_BIRCH_PLANKS.get(),
                AlfheimrBlocks.BLACK_BIRCH_PLANKS_SLAB.get(),
                AlfheimrBlocks.BLACK_BIRCH_PLANKS_STAIRS.get(),
                AlfheimrBlocks.BLACK_BIRCH_PLANKS_PRESSURE_PLATE.get(),
                AlfheimrBlocks.BLACK_BIRCH_PLANKS_DOOR.get(),
                AlfheimrBlocks.BLACK_BIRCH_PLANKS_TRAPDOOR.get(),
                AlfheimrBlocks.BLACK_BIRCH_PLANKS_FENCE.get(),
                AlfheimrBlocks.BLACK_BIRCH_PLANKS_FENCE_GATE.get(),
                AlfheimrBlocks.BLACK_BIRCH_PLANKS_BUTTON.get()
        );

        this.tag(ModTags.Blocks.BLACK_BIRCH_LOGS).add(
                AlfheimrBlocks.BLACK_BIRCH_LOG.get(),
                AlfheimrBlocks.BLACK_BIRCH_WOOD.get(),
                AlfheimrBlocks.STRIPPED_BLACK_BIRCH_LOG.get(),
                AlfheimrBlocks.STRIPPED_BLACK_BIRCH_WOOD.get()
        );

        this.tag(ModTags.Blocks.BLACK_BIRCH_STRIPPED_LOGS).add(
                AlfheimrBlocks.STRIPPED_BLACK_BIRCH_LOG.get(),
                AlfheimrBlocks.STRIPPED_BLACK_BIRCH_WOOD.get()
        );

        this.tag(ModTags.Blocks.WHITE_OAK_WOOD).add(
                AlfheimrBlocks.WHITE_OAK_LOG.get(),
                AlfheimrBlocks.WHITE_OAK_WOOD.get(),
                AlfheimrBlocks.STRIPPED_WHITE_OAK_LOG.get(),
                AlfheimrBlocks.STRIPPED_WHITE_OAK_WOOD.get(),
                AlfheimrBlocks.WHITE_OAK_LEAVES.get(),
                AlfheimrBlocks.WHITE_OAK_PLANKS.get(),
                AlfheimrBlocks.WHITE_OAK_PLANKS_SLAB.get(),
                AlfheimrBlocks.WHITE_OAK_PLANKS_STAIRS.get(),
                AlfheimrBlocks.WHITE_OAK_PLANKS_PRESSURE_PLATE.get(),
                AlfheimrBlocks.WHITE_OAK_PLANKS_DOOR.get(),
                AlfheimrBlocks.WHITE_OAK_PLANKS_TRAPDOOR.get(),
                AlfheimrBlocks.WHITE_OAK_PLANKS_FENCE.get(),
                AlfheimrBlocks.WHITE_OAK_PLANKS_FENCE_GATE.get(),
                AlfheimrBlocks.WHITE_OAK_PLANKS_BUTTON.get()
        );

        this.tag(ModTags.Blocks.WHITE_OAK_LOGS).add(
                AlfheimrBlocks.WHITE_OAK_LOG.get(),
                AlfheimrBlocks.WHITE_OAK_WOOD.get(),
                AlfheimrBlocks.STRIPPED_WHITE_OAK_LOG.get(),
                AlfheimrBlocks.STRIPPED_WHITE_OAK_WOOD.get()
        );

        this.tag(ModTags.Blocks.WHITE_OAK_STRIPPED_LOGS).add(
                AlfheimrBlocks.STRIPPED_WHITE_OAK_LOG.get(),
                AlfheimrBlocks.STRIPPED_WHITE_OAK_WOOD.get()
        );

        this.tag(ModTags.Blocks.BUR_OAK_WOOD).add(
                AlfheimrBlocks.BUR_OAK_LOG.get(),
                AlfheimrBlocks.BUR_OAK_WOOD.get(),
                AlfheimrBlocks.STRIPPED_BUR_OAK_LOG.get(),
                AlfheimrBlocks.STRIPPED_BUR_OAK_WOOD.get(),
                AlfheimrBlocks.BUR_OAK_LEAVES.get(),
                AlfheimrBlocks.BUR_OAK_PLANKS.get(),
                AlfheimrBlocks.BUR_OAK_PLANKS_SLAB.get(),
                AlfheimrBlocks.BUR_OAK_PLANKS_STAIRS.get(),
                AlfheimrBlocks.BUR_OAK_PLANKS_PRESSURE_PLATE.get(),
                AlfheimrBlocks.BUR_OAK_PLANKS_DOOR.get(),
                AlfheimrBlocks.BUR_OAK_PLANKS_TRAPDOOR.get(),
                AlfheimrBlocks.BUR_OAK_PLANKS_FENCE.get(),
                AlfheimrBlocks.BUR_OAK_PLANKS_FENCE_GATE.get(),
                AlfheimrBlocks.BUR_OAK_PLANKS_BUTTON.get()
        );

        this.tag(ModTags.Blocks.BUR_OAK_LOGS).add(
                AlfheimrBlocks.BUR_OAK_LOG.get(),
                AlfheimrBlocks.BUR_OAK_WOOD.get(),
                AlfheimrBlocks.STRIPPED_BUR_OAK_LOG.get(),
                AlfheimrBlocks.STRIPPED_BUR_OAK_WOOD.get()
        );

        this.tag(ModTags.Blocks.BUR_OAK_STRIPPED_LOGS).add(
                AlfheimrBlocks.STRIPPED_BUR_OAK_LOG.get(),
                AlfheimrBlocks.STRIPPED_BUR_OAK_WOOD.get()
        );

        this.tag(ModTags.Blocks.BLOOD_CHERRY_WOOD).add(
                AlfheimrBlocks.BLOOD_CHERRY_LOG.get(),
                AlfheimrBlocks.BLOOD_CHERRY_WOOD.get(),
                AlfheimrBlocks.STRIPPED_BLOOD_CHERRY_LOG.get(),
                AlfheimrBlocks.STRIPPED_BLOOD_CHERRY_WOOD.get(),
                AlfheimrBlocks.BLOOD_CHERRY_LEAVES.get(),
                AlfheimrBlocks.BLOOD_CHERRY_PLANKS.get(),
                AlfheimrBlocks.BLOOD_CHERRY_PLANKS_SLAB.get(),
                AlfheimrBlocks.BLOOD_CHERRY_PLANKS_STAIRS.get(),
                AlfheimrBlocks.BLOOD_CHERRY_PLANKS_PRESSURE_PLATE.get(),
                AlfheimrBlocks.BLOOD_CHERRY_PLANKS_DOOR.get(),
                AlfheimrBlocks.BLOOD_CHERRY_PLANKS_TRAPDOOR.get(),
                AlfheimrBlocks.BLOOD_CHERRY_PLANKS_FENCE.get(),
                AlfheimrBlocks.BLOOD_CHERRY_PLANKS_FENCE_GATE.get(),
                AlfheimrBlocks.BLOOD_CHERRY_PLANKS_BUTTON.get()
        );

        this.tag(ModTags.Blocks.BLOOD_CHERRY_LOGS).add(
                AlfheimrBlocks.BLOOD_CHERRY_LOG.get(),
                AlfheimrBlocks.BLOOD_CHERRY_WOOD.get(),
                AlfheimrBlocks.STRIPPED_BLOOD_CHERRY_LOG.get(),
                AlfheimrBlocks.STRIPPED_BLOOD_CHERRY_WOOD.get()
        );

        this.tag(ModTags.Blocks.BLOOD_CHERRY_STRIPPED_LOGS).add(
                AlfheimrBlocks.STRIPPED_BLOOD_CHERRY_LOG.get(),
                AlfheimrBlocks.STRIPPED_BLOOD_CHERRY_WOOD.get()
        );

        this.tag(ModTags.Blocks.SACRED_TREE_WOOD).add(
                AlfheimrBlocks.SACRED_TREE_LOG.get(),
                AlfheimrBlocks.SACRED_TREE_WOOD.get(),
                AlfheimrBlocks.STRIPPED_SACRED_TREE_LOG.get(),
                AlfheimrBlocks.STRIPPED_SACRED_TREE_WOOD.get(),
                AlfheimrBlocks.SACRED_TREE_LEAVES.get(),
                AlfheimrBlocks.SACRED_TREE_PLANKS.get(),
                AlfheimrBlocks.SACRED_TREE_PLANKS_SLAB.get(),
                AlfheimrBlocks.SACRED_TREE_PLANKS_STAIRS.get(),
                AlfheimrBlocks.SACRED_TREE_PLANKS_PRESSURE_PLATE.get(),
                AlfheimrBlocks.SACRED_TREE_PLANKS_DOOR.get(),
                AlfheimrBlocks.SACRED_TREE_PLANKS_TRAPDOOR.get(),
                AlfheimrBlocks.SACRED_TREE_PLANKS_FENCE.get(),
                AlfheimrBlocks.SACRED_TREE_PLANKS_FENCE_GATE.get(),
                AlfheimrBlocks.SACRED_TREE_PLANKS_BUTTON.get()
        );

        this.tag(ModTags.Blocks.SACRED_TREE_LOGS).add(
                AlfheimrBlocks.SACRED_TREE_LOG.get(),
                AlfheimrBlocks.SACRED_TREE_WOOD.get(),
                AlfheimrBlocks.STRIPPED_SACRED_TREE_LOG.get(),
                AlfheimrBlocks.STRIPPED_SACRED_TREE_WOOD.get()
        );

        this.tag(ModTags.Blocks.SACRED_TREE_STRIPPED_LOGS).add(
                AlfheimrBlocks.STRIPPED_SACRED_TREE_LOG.get(),
                AlfheimrBlocks.STRIPPED_SACRED_TREE_WOOD.get()
        );

        this.tag(ModTags.Blocks.WILLOW_WOOD).add(
                AlfheimrBlocks.WILLOW_LOG.get(),
                AlfheimrBlocks.WILLOW_WOOD.get(),
                AlfheimrBlocks.STRIPPED_WILLOW_LOG.get(),
                AlfheimrBlocks.STRIPPED_WILLOW_WOOD.get(),
                AlfheimrBlocks.WILLOW_LEAVES.get(),
                AlfheimrBlocks.WILLOW_PLANKS.get(),
                AlfheimrBlocks.WILLOW_PLANKS_SLAB.get(),
                AlfheimrBlocks.WILLOW_PLANKS_STAIRS.get(),
                AlfheimrBlocks.WILLOW_PLANKS_PRESSURE_PLATE.get(),
                AlfheimrBlocks.WILLOW_PLANKS_DOOR.get(),
                AlfheimrBlocks.WILLOW_PLANKS_TRAPDOOR.get(),
                AlfheimrBlocks.WILLOW_PLANKS_FENCE.get(),
                AlfheimrBlocks.WILLOW_PLANKS_FENCE_GATE.get(),
                AlfheimrBlocks.WILLOW_PLANKS_BUTTON.get()
        );

        this.tag(ModTags.Blocks.WILLOW_LOGS).add(
                AlfheimrBlocks.WILLOW_LOG.get(),
                AlfheimrBlocks.WILLOW_WOOD.get(),
                AlfheimrBlocks.STRIPPED_WILLOW_LOG.get(),
                AlfheimrBlocks.STRIPPED_WILLOW_WOOD.get()
        );

        this.tag(ModTags.Blocks.WILLOW_STRIPPED_LOGS).add(
                AlfheimrBlocks.STRIPPED_WILLOW_LOG.get(),
                AlfheimrBlocks.STRIPPED_WILLOW_WOOD.get()
        );

        this.tag(ModTags.Blocks.DEADWOOD_WOOD).add(
                AlfheimrBlocks.DEADWOOD_LOG.get(),
                AlfheimrBlocks.DEADWOOD_WOOD.get(),
                AlfheimrBlocks.STRIPPED_DEADWOOD_LOG.get(),
                AlfheimrBlocks.STRIPPED_DEADWOOD_WOOD.get(),
                AlfheimrBlocks.DEADWOOD_LEAVES.get(),
                AlfheimrBlocks.DEADWOOD_PLANKS.get(),
                AlfheimrBlocks.DEADWOOD_PLANKS_SLAB.get(),
                AlfheimrBlocks.DEADWOOD_PLANKS_STAIRS.get(),
                AlfheimrBlocks.DEADWOOD_PLANKS_PRESSURE_PLATE.get(),
                AlfheimrBlocks.DEADWOOD_PLANKS_DOOR.get(),
                AlfheimrBlocks.DEADWOOD_PLANKS_TRAPDOOR.get(),
                AlfheimrBlocks.DEADWOOD_PLANKS_FENCE.get(),
                AlfheimrBlocks.DEADWOOD_PLANKS_FENCE_GATE.get(),
                AlfheimrBlocks.DEADWOOD_PLANKS_BUTTON.get()
        );

        this.tag(ModTags.Blocks.DEADWOOD_LOGS).add(
                AlfheimrBlocks.DEADWOOD_LOG.get(),
                AlfheimrBlocks.DEADWOOD_WOOD.get(),
                AlfheimrBlocks.STRIPPED_DEADWOOD_LOG.get(),
                AlfheimrBlocks.STRIPPED_DEADWOOD_WOOD.get()
        );

        this.tag(ModTags.Blocks.DEADWOOD_STRIPPED_LOGS).add(
                AlfheimrBlocks.STRIPPED_DEADWOOD_LOG.get(),
                AlfheimrBlocks.STRIPPED_DEADWOOD_WOOD.get()
        );

        this.tag(ModTags.Blocks.EBONY_KINGSWOOD_WOOD).add(
                AlfheimrBlocks.EBONY_KINGSWOOD_LOG.get(),
                AlfheimrBlocks.EBONY_KINGSWOOD_WOOD.get(),
                AlfheimrBlocks.STRIPPED_EBONY_KINGSWOOD_LOG.get(),
                AlfheimrBlocks.STRIPPED_EBONY_KINGSWOOD_WOOD.get(),
                AlfheimrBlocks.EBONY_KINGSWOOD_LEAVES.get(),
                AlfheimrBlocks.EBONY_KINGSWOOD_PLANKS.get(),
                AlfheimrBlocks.EBONY_KINGSWOOD_PLANKS_SLAB.get(),
                AlfheimrBlocks.EBONY_KINGSWOOD_PLANKS_STAIRS.get(),
                AlfheimrBlocks.EBONY_KINGSWOOD_PLANKS_PRESSURE_PLATE.get(),
                AlfheimrBlocks.EBONY_KINGSWOOD_PLANKS_DOOR.get(),
                AlfheimrBlocks.EBONY_KINGSWOOD_PLANKS_TRAPDOOR.get(),
                AlfheimrBlocks.EBONY_KINGSWOOD_PLANKS_FENCE.get(),
                AlfheimrBlocks.EBONY_KINGSWOOD_PLANKS_FENCE_GATE.get(),
                AlfheimrBlocks.EBONY_KINGSWOOD_PLANKS_BUTTON.get()
        );

        this.tag(ModTags.Blocks.EBONY_KINGSWOOD_LOGS).add(
                AlfheimrBlocks.EBONY_KINGSWOOD_LOG.get(),
                AlfheimrBlocks.EBONY_KINGSWOOD_WOOD.get(),
                AlfheimrBlocks.STRIPPED_EBONY_KINGSWOOD_LOG.get(),
                AlfheimrBlocks.STRIPPED_EBONY_KINGSWOOD_WOOD.get()
        );

        this.tag(ModTags.Blocks.EBONY_KINGSWOOD_STRIPPED_LOGS).add(
                AlfheimrBlocks.STRIPPED_EBONY_KINGSWOOD_LOG.get(),
                AlfheimrBlocks.STRIPPED_EBONY_KINGSWOOD_WOOD.get()
        );

        this.tag(ModTags.Blocks.IVORY_KINGSWOOD_WOOD).add(
                AlfheimrBlocks.IVORY_KINGSWOOD_LOG.get(),
                AlfheimrBlocks.IVORY_KINGSWOOD_WOOD.get(),
                AlfheimrBlocks.STRIPPED_IVORY_KINGSWOOD_LOG.get(),
                AlfheimrBlocks.STRIPPED_IVORY_KINGSWOOD_WOOD.get(),
                AlfheimrBlocks.IVORY_KINGSWOOD_LEAVES.get(),
                AlfheimrBlocks.IVORY_KINGSWOOD_PLANKS.get(),
                AlfheimrBlocks.IVORY_KINGSWOOD_PLANKS_SLAB.get(),
                AlfheimrBlocks.IVORY_KINGSWOOD_PLANKS_STAIRS.get(),
                AlfheimrBlocks.IVORY_KINGSWOOD_PLANKS_PRESSURE_PLATE.get(),
                AlfheimrBlocks.IVORY_KINGSWOOD_PLANKS_DOOR.get(),
                AlfheimrBlocks.IVORY_KINGSWOOD_PLANKS_TRAPDOOR.get(),
                AlfheimrBlocks.IVORY_KINGSWOOD_PLANKS_FENCE.get(),
                AlfheimrBlocks.IVORY_KINGSWOOD_PLANKS_FENCE_GATE.get(),
                AlfheimrBlocks.IVORY_KINGSWOOD_PLANKS_BUTTON.get()
        );

        this.tag(ModTags.Blocks.IVORY_KINGSWOOD_LOGS).add(
                AlfheimrBlocks.IVORY_KINGSWOOD_LOG.get(),
                AlfheimrBlocks.IVORY_KINGSWOOD_WOOD.get(),
                AlfheimrBlocks.STRIPPED_IVORY_KINGSWOOD_LOG.get(),
                AlfheimrBlocks.STRIPPED_IVORY_KINGSWOOD_WOOD.get()
        );

        this.tag(ModTags.Blocks.IVORY_KINGSWOOD_STRIPPED_LOGS).add(
                AlfheimrBlocks.STRIPPED_IVORY_KINGSWOOD_LOG.get(),
                AlfheimrBlocks.STRIPPED_IVORY_KINGSWOOD_WOOD.get()
        );

        this.tag(ModTags.Blocks.WEAVER_WOOD).add(
                AlfheimrBlocks.WEAVER_LOG.get(),
                AlfheimrBlocks.WEAVER_WOOD.get(),
                AlfheimrBlocks.STRIPPED_WEAVER_LOG.get(),
                AlfheimrBlocks.STRIPPED_WEAVER_WOOD.get(),
                AlfheimrBlocks.WEAVER_LEAVES.get(),
                AlfheimrBlocks.WEAVER_PLANKS.get(),
                AlfheimrBlocks.WEAVER_PLANKS_SLAB.get(),
                AlfheimrBlocks.WEAVER_PLANKS_STAIRS.get(),
                AlfheimrBlocks.WEAVER_PLANKS_PRESSURE_PLATE.get(),
                AlfheimrBlocks.WEAVER_PLANKS_DOOR.get(),
                AlfheimrBlocks.WEAVER_PLANKS_TRAPDOOR.get(),
                AlfheimrBlocks.WEAVER_PLANKS_FENCE.get(),
                AlfheimrBlocks.WEAVER_PLANKS_FENCE_GATE.get(),
                AlfheimrBlocks.WEAVER_PLANKS_BUTTON.get()
        );

        this.tag(ModTags.Blocks.WEAVER_LOGS).add(
                AlfheimrBlocks.WEAVER_LOG.get(),
                AlfheimrBlocks.WEAVER_WOOD.get(),
                AlfheimrBlocks.STRIPPED_WEAVER_LOG.get(),
                AlfheimrBlocks.STRIPPED_WEAVER_WOOD.get()
        );

        this.tag(ModTags.Blocks.WEAVER_STRIPPED_LOGS).add(
                AlfheimrBlocks.STRIPPED_WEAVER_LOG.get(),
                AlfheimrBlocks.STRIPPED_WEAVER_WOOD.get()
        );

        this.tag(ModTags.Blocks.MUSHROOMS).add(
                Blocks.BROWN_MUSHROOM,
                Blocks.RED_MUSHROOM,
                AlfheimrBlocks.POINT_MUSHROOM_BLOCK.get(),
                AlfheimrBlocks.WITCHES_MUSHROOM_BLOCK.get(),
                AlfheimrBlocks.ROYAL_BLUE_MUSHROOM_BLOCK.get(),
                AlfheimrBlocks.SHORT_TOP_MUSHROOM_BLOCK.get(),
                AlfheimrBlocks.SPECTRAL_MUSHROOM_BLOCK.get(),
                AlfheimrBlocks.SHADE_MUSHROOM_BLOCK.get(),
                AlfheimrBlocks.CAP_MUSHROOM_BLOCK.get()
        );
    }

    @Override
    public String getName() {
        return "Block Tags";
    }
}
