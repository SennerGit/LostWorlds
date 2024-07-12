package net.sen.lostworlds.registry.blocks;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.sen.lostworlds.api.LostWorldsApi;
import net.sen.lostworlds.block.custom.ModRedStoneOreBlock;
import net.sen.lostworlds.block.portal.NidavellirPortalBlock;
import net.sen.lostworlds.registry.items.ModItems;

import java.util.function.Supplier;

public class NidavellirBlocks {
    public static final DeferredRegister.Blocks NIDAVELLIR_BLOCKS = DeferredRegister.createBlocks(LostWorldsApi.MODID);

    /*
    MULTI BLOCK
     */
    /*
    STONE
     */
    //Soft Stone
    public static final DeferredBlock<Block> NIDAVELLIR_SOFT_STONE = registerBlock("nidavellir_soft_stone", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE)));
    public static final DeferredBlock<StairBlock> NIDAVELLIR_SOFT_STONE_STAIRS = registerBlock("nidavellir_soft_stone_stairs", () -> new StairBlock(NIDAVELLIR_SOFT_STONE.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_STAIRS).requiresCorrectToolForDrops()));
    public static final DeferredBlock<SlabBlock> NIDAVELLIR_SOFT_STONE_SLAB = registerBlock("nidavellir_soft_stone_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_SLAB).requiresCorrectToolForDrops()));
    public static final DeferredBlock<PressurePlateBlock> NIDAVELLIR_SOFT_STONE_PRESSURE_PLATE = registerBlock("nidavellir_soft_stone_pressure_plate", () -> new PressurePlateBlock(BlockSetType.STONE, BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_STAIRS).requiresCorrectToolForDrops()));
    public static final DeferredBlock<ButtonBlock> NIDAVELLIR_SOFT_STONE_BUTTON = registerBlock("nidavellir_soft_stone_button", () -> new ButtonBlock(BlockSetType.STONE, 10, BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BUTTON).requiresCorrectToolForDrops()));
    public static final DeferredBlock<WallBlock> NIDAVELLIR_SOFT_STONE_WALL = registerBlock("nidavellir_soft_stone_wall", () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BRICK_WALL).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> NIDAVELLIR_SOFT_SMOOTH_STONE = registerBlock("nidavellir_soft_smooth_stone", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BRICK_WALL).requiresCorrectToolForDrops()));

    public static final DeferredBlock<Block> NIDAVELLIR_SOFT_COBBLESTONE = registerBlock("nidavellir_soft_cobblestone", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE)));
    public static final DeferredBlock<StairBlock> NIDAVELLIR_SOFT_COBBLESTONE_STAIRS = registerBlock("nidavellir_soft_cobblestone_stairs", () -> new StairBlock(NIDAVELLIR_SOFT_COBBLESTONE.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_STAIRS).requiresCorrectToolForDrops()));
    public static final DeferredBlock<SlabBlock> NIDAVELLIR_SOFT_COBBLESTONE_SLAB = registerBlock("nidavellir_soft_cobblestone_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_SLAB).requiresCorrectToolForDrops()));
    public static final DeferredBlock<WallBlock> NIDAVELLIR_SOFT_COBBLESTONE_WALL = registerBlock("nidavellir_soft_cobblestone_wall", () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BRICK_WALL).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> NIDAVELLIR_SOFT_COBBLESTONE_MOSSY = registerBlock("nidavellir_soft_cobblestone_mossy", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BRICK_WALL).requiresCorrectToolForDrops()));

    public static final DeferredBlock<Block> NIDAVELLIR_SOFT_STONE_BRICKS = registerBlock("nidavellir_soft_stone_bricks", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BRICKS).requiresCorrectToolForDrops()));
    public static final DeferredBlock<StairBlock> NIDAVELLIR_SOFT_STONE_BRICKS_STAIRS = registerBlock("nidavellir_soft_stone_bricks_stairs", () -> new StairBlock(NIDAVELLIR_SOFT_STONE_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_STAIRS).requiresCorrectToolForDrops()));
    public static final DeferredBlock<SlabBlock> NIDAVELLIR_SOFT_STONE_BRICKS_SLAB = registerBlock("nidavellir_soft_stone_bricks_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_SLAB).requiresCorrectToolForDrops()));
    public static final DeferredBlock<WallBlock> NIDAVELLIR_SOFT_STONE_BRICKS_WALL = registerBlock("nidavellir_soft_stone_bricks_wall", () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BRICK_WALL).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> NIDAVELLIR_SOFT_STONE_BRICKS_MOSSY = registerBlock("nidavellir_soft_stone_bricks_mossy", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BRICK_WALL).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> NIDAVELLIR_SOFT_STONE_BRICKS_CRACKED = registerBlock("nidavellir_soft_stone_bricks_cracked", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BRICK_WALL).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> NIDAVELLIR_SOFT_STONE_BRICKS_CHISELED = registerBlock("nidavellir_soft_stone_bricks_chiseled", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BRICK_WALL).requiresCorrectToolForDrops()));

    public static final DeferredBlock<Block> NIDAVELLIR_SOFT_STONE_IRON_ORE = registerBlock("nidavellir_soft_stone_iron_ore", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> NIDAVELLIR_SOFT_STONE_GOLD_ORE = registerBlock("nidavellir_soft_stone_gold_ore", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> NIDAVELLIR_SOFT_STONE_COPPER_ORE = registerBlock("nidavellir_soft_stone_copper_ore", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> NIDAVELLIR_SOFT_STONE_TIN_ORE = registerBlock("nidavellir_soft_stone_tin_ore", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> NIDAVELLIR_SOFT_STONE_ZINC_ORE = registerBlock("nidavellir_soft_stone_zinc_ore", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> NIDAVELLIR_SOFT_STONE_DIAMOND_ORE = registerBlock("nidavellir_soft_stone_diamond_ore", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> NIDAVELLIR_SOFT_STONE_EMERALD_ORE = registerBlock("nidavellir_soft_stone_emerald_ore", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> NIDAVELLIR_SOFT_STONE_COAL_ORE = registerBlock("nidavellir_soft_stone_coal_ore", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> NIDAVELLIR_SOFT_STONE_REDSTONE_ORE = registerBlock("nidavellir_soft_stone_redstone_ore", () -> new ModRedStoneOreBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.REDSTONE_ORE).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> NIDAVELLIR_SOFT_STONE_LAPIS_ORE = registerBlock("nidavellir_soft_stone_lapis_ore", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> NIDAVELLIR_SOFT_STONE_AQUAMARINE_ORE = registerBlock("nidavellir_soft_stone_aquamarine_ore", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> NIDAVELLIR_SOFT_STONE_OPAL_ORE = registerBlock("nidavellir_soft_stone_opal_ore", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> NIDAVELLIR_SOFT_STONE_RUBY_ORE = registerBlock("nidavellir_soft_stone_ruby_ore", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE).requiresCorrectToolForDrops()));

    public static final DeferredBlock<Block> NIDAVELLIR_SOFT_STONE_IRON_ORE_CLUSTER = registerBlock("nidavellir_soft_stone_iron_ore_cluster", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> NIDAVELLIR_SOFT_STONE_GOLD_ORE_CLUSTER = registerBlock("nidavellir_soft_stone_gold_ore_cluster", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> NIDAVELLIR_SOFT_STONE_COPPER_ORE_CLUSTER = registerBlock("nidavellir_soft_stone_copper_ore_cluster", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> NIDAVELLIR_SOFT_STONE_TIN_ORE_CLUSTER = registerBlock("nidavellir_soft_stone_tin_ore_cluster", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> NIDAVELLIR_SOFT_STONE_ZINC_ORE_CLUSTER = registerBlock("nidavellir_soft_stone_zinc_ore_cluster", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> NIDAVELLIR_SOFT_STONE_DIAMOND_ORE_CLUSTER = registerBlock("nidavellir_soft_stone_diamond_ore_cluster", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> NIDAVELLIR_SOFT_STONE_EMERALD_ORE_CLUSTER = registerBlock("nidavellir_soft_stone_emerald_ore_cluster", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> NIDAVELLIR_SOFT_STONE_COAL_ORE_CLUSTER = registerBlock("nidavellir_soft_stone_coal_ore_cluster", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> NIDAVELLIR_SOFT_STONE_REDSTONE_ORE_CLUSTER = registerBlock("nidavellir_soft_stone_redstone_ore_cluster", () -> new ModRedStoneOreBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.REDSTONE_ORE).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> NIDAVELLIR_SOFT_STONE_LAPIS_ORE_CLUSTER = registerBlock("nidavellir_soft_stone_lapis_ore_cluster", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> NIDAVELLIR_SOFT_STONE_AQUAMARINE_ORE_CLUSTER = registerBlock("nidavellir_soft_stone_aquamarine_ore_cluster", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> NIDAVELLIR_SOFT_STONE_OPAL_ORE_CLUSTER = registerBlock("nidavellir_soft_stone_opal_ore_cluster", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> NIDAVELLIR_SOFT_STONE_RUBY_ORE_CLUSTER = registerBlock("nidavellir_soft_stone_ruby_ore_cluster", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE).requiresCorrectToolForDrops()));

    //Hard Stone
    public static final DeferredBlock<Block> NIDAVELLIR_HARD_STONE = registerBlock("nidavellir_hard_stone", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE)));
    public static final DeferredBlock<StairBlock> NIDAVELLIR_HARD_STONE_STAIRS = registerBlock("nidavellir_hard_stone_stairs", () -> new StairBlock(NIDAVELLIR_HARD_STONE.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_STAIRS).requiresCorrectToolForDrops()));
    public static final DeferredBlock<SlabBlock> NIDAVELLIR_HARD_STONE_SLAB = registerBlock("nidavellir_hard_stone_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_SLAB).requiresCorrectToolForDrops()));
    public static final DeferredBlock<PressurePlateBlock> NIDAVELLIR_HARD_STONE_PRESSURE_PLATE = registerBlock("nidavellir_hard_stone_pressure_plate", () -> new PressurePlateBlock(BlockSetType.STONE, BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_STAIRS).requiresCorrectToolForDrops()));
    public static final DeferredBlock<ButtonBlock> NIDAVELLIR_HARD_STONE_BUTTON = registerBlock("nidavellir_hard_stone_button", () -> new ButtonBlock(BlockSetType.STONE, 10, BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BUTTON).requiresCorrectToolForDrops()));
    public static final DeferredBlock<WallBlock> NIDAVELLIR_HARD_STONE_WALL = registerBlock("nidavellir_hard_stone_wall", () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BRICK_WALL).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> NIDAVELLIR_HARD_SMOOTH_STONE = registerBlock("nidavellir_hard_smooth_stone", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BRICK_WALL).requiresCorrectToolForDrops()));

    public static final DeferredBlock<Block> NIDAVELLIR_HARD_COBBLESTONE = registerBlock("nidavellir_hard_cobblestone", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE)));
    public static final DeferredBlock<StairBlock> NIDAVELLIR_HARD_COBBLESTONE_STAIRS = registerBlock("nidavellir_hard_cobblestone_stairs", () -> new StairBlock(NIDAVELLIR_HARD_COBBLESTONE.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_STAIRS).requiresCorrectToolForDrops()));
    public static final DeferredBlock<SlabBlock> NIDAVELLIR_HARD_COBBLESTONE_SLAB = registerBlock("nidavellir_hard_cobblestone_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_SLAB).requiresCorrectToolForDrops()));
    public static final DeferredBlock<WallBlock> NIDAVELLIR_HARD_COBBLESTONE_WALL = registerBlock("nidavellir_hard_cobblestone_wall", () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BRICK_WALL).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> NIDAVELLIR_HARD_COBBLESTONE_MOSSY = registerBlock("nidavellir_hard_cobblestone_mossy", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BRICK_WALL).requiresCorrectToolForDrops()));

    public static final DeferredBlock<Block> NIDAVELLIR_HARD_STONE_BRICKS = registerBlock("nidavellir_hard_stone_bricks", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BRICKS).requiresCorrectToolForDrops()));
    public static final DeferredBlock<StairBlock> NIDAVELLIR_HARD_STONE_BRICKS_STAIRS = registerBlock("nidavellir_hard_stone_bricks_stairs", () -> new StairBlock(NIDAVELLIR_HARD_STONE_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_STAIRS).requiresCorrectToolForDrops()));
    public static final DeferredBlock<SlabBlock> NIDAVELLIR_HARD_STONE_BRICKS_SLAB = registerBlock("nidavellir_hard_stone_bricks_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_SLAB).requiresCorrectToolForDrops()));
    public static final DeferredBlock<WallBlock> NIDAVELLIR_HARD_STONE_BRICKS_WALL = registerBlock("nidavellir_hard_stone_bricks_wall", () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BRICK_WALL).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> NIDAVELLIR_HARD_STONE_BRICKS_MOSSY = registerBlock("nidavellir_hard_stone_bricks_mossy", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BRICK_WALL).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> NIDAVELLIR_HARD_STONE_BRICKS_CRACKED = registerBlock("nidavellir_hard_stone_bricks_cracked", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BRICK_WALL).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> NIDAVELLIR_HARD_STONE_BRICKS_CHISELED = registerBlock("nidavellir_hard_stone_bricks_chiseled", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BRICK_WALL).requiresCorrectToolForDrops()));

    public static final DeferredBlock<Block> NIDAVELLIR_HARD_STONE_IRON_ORE = registerBlock("nidavellir_hard_stone_iron_ore", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> NIDAVELLIR_HARD_STONE_GOLD_ORE = registerBlock("nidavellir_hard_stone_gold_ore", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> NIDAVELLIR_HARD_STONE_COPPER_ORE = registerBlock("nidavellir_hard_stone_copper_ore", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> NIDAVELLIR_HARD_STONE_TIN_ORE = registerBlock("nidavellir_hard_stone_tin_ore", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> NIDAVELLIR_HARD_STONE_ZINC_ORE = registerBlock("nidavellir_hard_stone_zinc_ore", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> NIDAVELLIR_HARD_STONE_DIAMOND_ORE = registerBlock("nidavellir_hard_stone_diamond_ore", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> NIDAVELLIR_HARD_STONE_EMERALD_ORE = registerBlock("nidavellir_hard_stone_emerald_ore", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> NIDAVELLIR_HARD_STONE_COAL_ORE = registerBlock("nidavellir_hard_stone_coal_ore", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> NIDAVELLIR_HARD_STONE_REDSTONE_ORE = registerBlock("nidavellir_hard_stone_redstone_ore", () -> new ModRedStoneOreBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.REDSTONE_ORE).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> NIDAVELLIR_HARD_STONE_LAPIS_ORE = registerBlock("nidavellir_hard_stone_lapis_ore", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> NIDAVELLIR_HARD_STONE_AQUAMARINE_ORE = registerBlock("nidavellir_hard_stone_aquamarine_ore", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> NIDAVELLIR_HARD_STONE_OPAL_ORE = registerBlock("nidavellir_hard_stone_opal_ore", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> NIDAVELLIR_HARD_STONE_RUBY_ORE = registerBlock("nidavellir_hard_stone_ruby_ore", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE).requiresCorrectToolForDrops()));

    public static final DeferredBlock<Block> NIDAVELLIR_HARD_STONE_IRON_ORE_CLUSTER = registerBlock("nidavellir_hard_stone_iron_ore_cluster", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> NIDAVELLIR_HARD_STONE_GOLD_ORE_CLUSTER = registerBlock("nidavellir_hard_stone_gold_ore_cluster", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> NIDAVELLIR_HARD_STONE_COPPER_ORE_CLUSTER = registerBlock("nidavellir_hard_stone_copper_ore_cluster", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> NIDAVELLIR_HARD_STONE_TIN_ORE_CLUSTER = registerBlock("nidavellir_hard_stone_tin_ore_cluster", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> NIDAVELLIR_HARD_STONE_ZINC_ORE_CLUSTER = registerBlock("nidavellir_hard_stone_zinc_ore_cluster", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> NIDAVELLIR_HARD_STONE_DIAMOND_ORE_CLUSTER = registerBlock("nidavellir_hard_stone_diamond_ore_cluster", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> NIDAVELLIR_HARD_STONE_EMERALD_ORE_CLUSTER = registerBlock("nidavellir_hard_stone_emerald_ore_cluster", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> NIDAVELLIR_HARD_STONE_COAL_ORE_CLUSTER = registerBlock("nidavellir_hard_stone_coal_ore_cluster", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> NIDAVELLIR_HARD_STONE_REDSTONE_ORE_CLUSTER = registerBlock("nidavellir_hard_stone_redstone_ore_cluster", () -> new ModRedStoneOreBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.REDSTONE_ORE).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> NIDAVELLIR_HARD_STONE_LAPIS_ORE_CLUSTER = registerBlock("nidavellir_hard_stone_lapis_ore_cluster", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> NIDAVELLIR_HARD_STONE_AQUAMARINE_ORE_CLUSTER = registerBlock("nidavellir_hard_stone_aquamarine_ore_cluster", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> NIDAVELLIR_HARD_STONE_OPAL_ORE_CLUSTER = registerBlock("nidavellir_hard_stone_opal_ore_cluster", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> NIDAVELLIR_HARD_STONE_RUBY_ORE_CLUSTER = registerBlock("nidavellir_hard_stone_ruby_ore_cluster", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE).requiresCorrectToolForDrops()));

    //Enhanced Stone
    public static final DeferredBlock<Block> NIDAVELLIR_ENHANCED_STONE = registerBlock("nidavellir_enhanced_stone", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE)));
    public static final DeferredBlock<StairBlock> NIDAVELLIR_ENHANCED_STONE_STAIRS = registerBlock("nidavellir_enhanced_stone_stairs", () -> new StairBlock(NIDAVELLIR_ENHANCED_STONE.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_STAIRS).requiresCorrectToolForDrops()));
    public static final DeferredBlock<SlabBlock> NIDAVELLIR_ENHANCED_STONE_SLAB = registerBlock("nidavellir_enhanced_stone_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_SLAB).requiresCorrectToolForDrops()));
    public static final DeferredBlock<PressurePlateBlock> NIDAVELLIR_ENHANCED_STONE_PRESSURE_PLATE = NIDAVELLIR_BLOCKS.register("nidavellir_enhanced_stone_pressure_plate", () -> new PressurePlateBlock(BlockSetType.STONE, BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_STAIRS).requiresCorrectToolForDrops()));
    public static final DeferredBlock<ButtonBlock> NIDAVELLIR_ENHANCED_STONE_BUTTON = registerBlock("nidavellir_enhanced_stone_button", () -> new ButtonBlock(BlockSetType.STONE, 10, BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BUTTON).requiresCorrectToolForDrops()));
    public static final DeferredBlock<WallBlock> NIDAVELLIR_ENHANCED_STONE_WALL = registerBlock("nidavellir_enhanced_stone_wall", () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BRICK_WALL).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> NIDAVELLIR_ENHANCED_SMOOTH_STONE = registerBlock("nidavellir_enhanced_smooth_stone", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BRICK_WALL).requiresCorrectToolForDrops()));

    public static final DeferredBlock<Block> NIDAVELLIR_ENHANCED_COBBLESTONE = registerBlock("nidavellir_enhanced_cobblestone", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE)));
    public static final DeferredBlock<StairBlock> NIDAVELLIR_ENHANCED_COBBLESTONE_STAIRS = registerBlock("nidavellir_enhanced_cobblestone_stairs", () -> new StairBlock(NIDAVELLIR_ENHANCED_COBBLESTONE.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_STAIRS).requiresCorrectToolForDrops()));
    public static final DeferredBlock<SlabBlock> NIDAVELLIR_ENHANCED_COBBLESTONE_SLAB = registerBlock("nidavellir_enhanced_cobblestone_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_SLAB).requiresCorrectToolForDrops()));
    public static final DeferredBlock<WallBlock> NIDAVELLIR_ENHANCED_COBBLESTONE_WALL = registerBlock("nidavellir_enhanced_cobblestone_wall", () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BRICK_WALL).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> NIDAVELLIR_ENHANCED_COBBLESTONE_MOSSY = registerBlock("nidavellir_enhanced_cobblestone_mossy", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BRICK_WALL).requiresCorrectToolForDrops()));

    public static final DeferredBlock<Block> NIDAVELLIR_ENHANCED_STONE_BRICKS = registerBlock("nidavellir_enhanced_stone_bricks", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BRICKS).requiresCorrectToolForDrops()));
    public static final DeferredBlock<StairBlock> NIDAVELLIR_ENHANCED_STONE_BRICKS_STAIRS = registerBlock("nidavellir_enhanced_stone_bricks_stairs", () -> new StairBlock(NIDAVELLIR_ENHANCED_STONE_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_STAIRS).requiresCorrectToolForDrops()));
    public static final DeferredBlock<SlabBlock> NIDAVELLIR_ENHANCED_STONE_BRICKS_SLAB = registerBlock("nidavellir_enhanced_stone_bricks_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_SLAB).requiresCorrectToolForDrops()));
    public static final DeferredBlock<WallBlock> NIDAVELLIR_ENHANCED_STONE_BRICKS_WALL = registerBlock("nidavellir_enhanced_stone_bricks_wall", () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BRICK_WALL).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> NIDAVELLIR_ENHANCED_STONE_BRICKS_MOSSY = registerBlock("nidavellir_enhanced_stone_bricks_mossy", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BRICK_WALL).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> NIDAVELLIR_ENHANCED_STONE_BRICKS_CRACKED = registerBlock("nidavellir_enhanced_stone_bricks_cracked", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BRICK_WALL).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> NIDAVELLIR_ENHANCED_STONE_BRICKS_CHISELED = registerBlock("nidavellir_enhanced_stone_bricks_chiseled", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BRICK_WALL).requiresCorrectToolForDrops()));

    public static final DeferredBlock<Block> NIDAVELLIR_ENHANCED_STONE_IRON_ORE = registerBlock("nidavellir_enhanced_stone_iron_ore", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> NIDAVELLIR_ENHANCED_STONE_GOLD_ORE = registerBlock("nidavellir_enhanced_stone_gold_ore", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> NIDAVELLIR_ENHANCED_STONE_COPPER_ORE = registerBlock("nidavellir_enhanced_stone_copper_ore", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> NIDAVELLIR_ENHANCED_STONE_TIN_ORE = registerBlock("nidavellir_enhanced_stone_tin_ore", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> NIDAVELLIR_ENHANCED_STONE_ZINC_ORE = registerBlock("nidavellir_enhanced_stone_zinc_ore", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> NIDAVELLIR_ENHANCED_STONE_DIAMOND_ORE = registerBlock("nidavellir_enhanced_stone_diamond_ore", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> NIDAVELLIR_ENHANCED_STONE_EMERALD_ORE = registerBlock("nidavellir_enhanced_stone_emerald_ore", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> NIDAVELLIR_ENHANCED_STONE_COAL_ORE = registerBlock("nidavellir_enhanced_stone_coal_ore", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> NIDAVELLIR_ENHANCED_STONE_REDSTONE_ORE = registerBlock("nidavellir_enhanced_stone_redstone_ore", () -> new ModRedStoneOreBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.REDSTONE_ORE).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> NIDAVELLIR_ENHANCED_STONE_LAPIS_ORE = registerBlock("nidavellir_enhanced_stone_lapis_ore", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> NIDAVELLIR_ENHANCED_STONE_AQUAMARINE_ORE = registerBlock("nidavellir_enhanced_stone_aquamarine_ore", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> NIDAVELLIR_ENHANCED_STONE_OPAL_ORE = registerBlock("nidavellir_enhanced_stone_opal_ore", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> NIDAVELLIR_ENHANCED_STONE_RUBY_ORE = registerBlock("nidavellir_enhanced_stone_ruby_ore", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE).requiresCorrectToolForDrops()));

    public static final DeferredBlock<Block> NIDAVELLIR_ENHANCED_STONE_IRON_ORE_CLUSTER = registerBlock("nidavellir_enhanced_stone_iron_ore_cluster", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> NIDAVELLIR_ENHANCED_STONE_GOLD_ORE_CLUSTER = registerBlock("nidavellir_enhanced_stone_gold_ore_cluster", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> NIDAVELLIR_ENHANCED_STONE_COPPER_ORE_CLUSTER = registerBlock("nidavellir_enhanced_stone_copper_ore_cluster", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> NIDAVELLIR_ENHANCED_STONE_TIN_ORE_CLUSTER = registerBlock("nidavellir_enhanced_stone_tin_ore_cluster", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> NIDAVELLIR_ENHANCED_STONE_ZINC_ORE_CLUSTER = registerBlock("nidavellir_enhanced_stone_zinc_ore_cluster", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> NIDAVELLIR_ENHANCED_STONE_DIAMOND_ORE_CLUSTER = registerBlock("nidavellir_enhanced_stone_diamond_ore_cluster", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> NIDAVELLIR_ENHANCED_STONE_EMERALD_ORE_CLUSTER = registerBlock("nidavellir_enhanced_stone_emerald_ore_cluster", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> NIDAVELLIR_ENHANCED_STONE_COAL_ORE_CLUSTER = registerBlock("nidavellir_enhanced_stone_coal_ore_cluster", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> NIDAVELLIR_ENHANCED_STONE_REDSTONE_ORE_CLUSTER = registerBlock("nidavellir_enhanced_stone_redstone_ore_cluster", () -> new ModRedStoneOreBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.REDSTONE_ORE).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> NIDAVELLIR_ENHANCED_STONE_LAPIS_ORE_CLUSTER = registerBlock("nidavellir_enhanced_stone_lapis_ore_cluster", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> NIDAVELLIR_ENHANCED_STONE_AQUAMARINE_ORE_CLUSTER = registerBlock("nidavellir_enhanced_stone_aquamarine_ore_cluster", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> NIDAVELLIR_ENHANCED_STONE_OPAL_ORE_CLUSTER = registerBlock("nidavellir_enhanced_stone_opal_ore_cluster", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> NIDAVELLIR_ENHANCED_STONE_RUBY_ORE_CLUSTER = registerBlock("nidavellir_enhanced_stone_ruby_ore_cluster", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE).requiresCorrectToolForDrops()));

    //Deepslate Stone
    public static final DeferredBlock<Block> NIDAVELLIR_DEEPSLATE_STONE = registerBlock("nidavellir_deepslate_stone", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE)));
    public static final DeferredBlock<StairBlock> NIDAVELLIR_DEEPSLATE_STONE_STAIRS = registerBlock("nidavellir_deepslate_stone_stairs", () -> new StairBlock(NIDAVELLIR_DEEPSLATE_STONE.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_STAIRS).requiresCorrectToolForDrops()));
    public static final DeferredBlock<SlabBlock> NIDAVELLIR_DEEPSLATE_STONE_SLAB = registerBlock("nidavellir_deepslate_stone_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_SLAB).requiresCorrectToolForDrops()));
    public static final DeferredBlock<PressurePlateBlock> NIDAVELLIR_DEEPSLATE_STONE_PRESSURE_PLATE = registerBlock("nidavellir_deepslate_stone_pressure_plate", () -> new PressurePlateBlock(BlockSetType.STONE, BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_STAIRS).requiresCorrectToolForDrops()));
    public static final DeferredBlock<ButtonBlock> NIDAVELLIR_DEEPSLATE_STONE_BUTTON = registerBlock("nidavellir_deepslate_stone_button", () -> new ButtonBlock(BlockSetType.STONE, 10, BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BUTTON).requiresCorrectToolForDrops()));
    public static final DeferredBlock<WallBlock> NIDAVELLIR_DEEPSLATE_STONE_WALL = registerBlock("nidavellir_deepslate_stone_wall", () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BRICK_WALL).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> NIDAVELLIR_DEEPSLATE_SMOOTH_STONE = registerBlock("nidavellir_deepslate_smooth_stone", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BRICK_WALL).requiresCorrectToolForDrops()));

    public static final DeferredBlock<Block> NIDAVELLIR_DEEPSLATE_COBBLESTONE = registerBlock("nidavellir_deepslate_cobblestone", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE)));
    public static final DeferredBlock<StairBlock> NIDAVELLIR_DEEPSLATE_COBBLESTONE_STAIRS = registerBlock("nidavellir_deepslate_cobblestone_stairs", () -> new StairBlock(NIDAVELLIR_DEEPSLATE_COBBLESTONE.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_STAIRS).requiresCorrectToolForDrops()));
    public static final DeferredBlock<SlabBlock> NIDAVELLIR_DEEPSLATE_COBBLESTONE_SLAB = registerBlock("nidavellir_deepslate_cobblestone_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_SLAB).requiresCorrectToolForDrops()));
    public static final DeferredBlock<WallBlock> NIDAVELLIR_DEEPSLATE_COBBLESTONE_WALL = registerBlock("nidavellir_deepslate_cobblestone_wall", () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BRICK_WALL).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> NIDAVELLIR_DEEPSLATE_COBBLESTONE_MOSSY = registerBlock("nidavellir_deepslate_cobblestone_mossy", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BRICK_WALL).requiresCorrectToolForDrops()));

    public static final DeferredBlock<Block> NIDAVELLIR_DEEPSLATE_STONE_BRICKS = registerBlock("nidavellir_deepslate_stone_bricks", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BRICKS).requiresCorrectToolForDrops()));
    public static final DeferredBlock<StairBlock> NIDAVELLIR_DEEPSLATE_STONE_BRICKS_STAIRS = registerBlock("nidavellir_deepslate_stone_bricks_stairs", () -> new StairBlock(NIDAVELLIR_DEEPSLATE_STONE_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_STAIRS).requiresCorrectToolForDrops()));
    public static final DeferredBlock<SlabBlock> NIDAVELLIR_DEEPSLATE_STONE_BRICKS_SLAB = registerBlock("nidavellir_deepslate_stone_bricks_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_SLAB).requiresCorrectToolForDrops()));
    public static final DeferredBlock<WallBlock> NIDAVELLIR_DEEPSLATE_STONE_BRICKS_WALL = registerBlock("nidavellir_deepslate_stone_bricks_wall", () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BRICK_WALL).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> NIDAVELLIR_DEEPSLATE_STONE_BRICKS_MOSSY = registerBlock("nidavellir_deepslate_stone_bricks_mossy", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BRICK_WALL).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> NIDAVELLIR_DEEPSLATE_STONE_BRICKS_CRACKED = registerBlock("nidavellir_deepslate_stone_bricks_cracked", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BRICK_WALL).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> NIDAVELLIR_DEEPSLATE_STONE_BRICKS_CHISELED = registerBlock("nidavellir_deepslate_stone_bricks_chiseled", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BRICK_WALL).requiresCorrectToolForDrops()));

    public static final DeferredBlock<Block> NIDAVELLIR_DEEPSLATE_STONE_IRON_ORE = registerBlock("nidavellir_deepslate_stone_iron_ore", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> NIDAVELLIR_DEEPSLATE_STONE_GOLD_ORE = registerBlock("nidavellir_deepslate_stone_gold_ore", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> NIDAVELLIR_DEEPSLATE_STONE_COPPER_ORE = registerBlock("nidavellir_deepslate_stone_copper_ore", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> NIDAVELLIR_DEEPSLATE_STONE_TIN_ORE = registerBlock("nidavellir_deepslate_stone_tin_ore", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> NIDAVELLIR_DEEPSLATE_STONE_ZINC_ORE = registerBlock("nidavellir_deepslate_stone_zinc_ore", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> NIDAVELLIR_DEEPSLATE_STONE_DIAMOND_ORE = registerBlock("nidavellir_deepslate_stone_diamond_ore", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> NIDAVELLIR_DEEPSLATE_STONE_EMERALD_ORE = registerBlock("nidavellir_deepslate_stone_emerald_ore", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> NIDAVELLIR_DEEPSLATE_STONE_COAL_ORE = registerBlock("nidavellir_deepslate_stone_coal_ore", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> NIDAVELLIR_DEEPSLATE_STONE_REDSTONE_ORE = registerBlock("nidavellir_deepslate_stone_redstone_ore", () -> new ModRedStoneOreBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.REDSTONE_ORE).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> NIDAVELLIR_DEEPSLATE_STONE_LAPIS_ORE = registerBlock("nidavellir_deepslate_stone_lapis_ore", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> NIDAVELLIR_DEEPSLATE_STONE_AQUAMARINE_ORE = registerBlock("nidavellir_deepslate_stone_aquamarine_ore", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> NIDAVELLIR_DEEPSLATE_STONE_OPAL_ORE = registerBlock("nidavellir_deepslate_stone_opal_ore", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> NIDAVELLIR_DEEPSLATE_STONE_RUBY_ORE = registerBlock("nidavellir_deepslate_stone_ruby_ore", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE).requiresCorrectToolForDrops()));

    public static final DeferredBlock<Block> NIDAVELLIR_DEEPSLATE_STONE_IRON_ORE_CLUSTER = registerBlock("nidavellir_deepslate_stone_iron_ore_cluster", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> NIDAVELLIR_DEEPSLATE_STONE_GOLD_ORE_CLUSTER = registerBlock("nidavellir_deepslate_stone_gold_ore_cluster", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> NIDAVELLIR_DEEPSLATE_STONE_COPPER_ORE_CLUSTER = registerBlock("nidavellir_deepslate_stone_copper_ore_cluster", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> NIDAVELLIR_DEEPSLATE_STONE_TIN_ORE_CLUSTER = registerBlock("nidavellir_deepslate_stone_tin_ore_cluster", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> NIDAVELLIR_DEEPSLATE_STONE_ZINC_ORE_CLUSTER = registerBlock("nidavellir_deepslate_stone_zinc_ore_cluster", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> NIDAVELLIR_DEEPSLATE_STONE_DIAMOND_ORE_CLUSTER = registerBlock("nidavellir_deepslate_stone_diamond_ore_cluster", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> NIDAVELLIR_DEEPSLATE_STONE_EMERALD_ORE_CLUSTER = registerBlock("nidavellir_deepslate_stone_emerald_ore_cluster", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> NIDAVELLIR_DEEPSLATE_STONE_COAL_ORE_CLUSTER = registerBlock("nidavellir_deepslate_stone_coal_ore_cluster", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> NIDAVELLIR_DEEPSLATE_STONE_REDSTONE_ORE_CLUSTER = registerBlock("nidavellir_deepslate_stone_redstone_ore_cluster", () -> new ModRedStoneOreBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.REDSTONE_ORE).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> NIDAVELLIR_DEEPSLATE_STONE_LAPIS_ORE_CLUSTER = registerBlock("nidavellir_deepslate_stone_lapis_ore_cluster", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> NIDAVELLIR_DEEPSLATE_STONE_AQUAMARINE_ORE_CLUSTER = registerBlock("nidavellir_deepslate_stone_aquamarine_ore_cluster", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> NIDAVELLIR_DEEPSLATE_STONE_OPAL_ORE_CLUSTER = registerBlock("nidavellir_deepslate_stone_opal_ore_cluster", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> NIDAVELLIR_DEEPSLATE_STONE_RUBY_ORE_CLUSTER = registerBlock("nidavellir_deepslate_stone_ruby_ore_cluster", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE).requiresCorrectToolForDrops()));

    //Crimson Stone
    public static final DeferredBlock<Block> NIDAVELLIR_CRIMSON_STONE = registerBlock("nidavellir_crimson_stone", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE)));
    public static final DeferredBlock<StairBlock> NIDAVELLIR_CRIMSON_STONE_STAIRS = registerBlock("nidavellir_crimson_stone_stairs", () -> new StairBlock(NIDAVELLIR_CRIMSON_STONE.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_STAIRS).requiresCorrectToolForDrops()));
    public static final DeferredBlock<SlabBlock> NIDAVELLIR_CRIMSON_STONE_SLAB = registerBlock("nidavellir_crimson_stone_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_SLAB).requiresCorrectToolForDrops()));
    public static final DeferredBlock<PressurePlateBlock> NIDAVELLIR_CRIMSON_STONE_PRESSURE_PLATE = registerBlock("nidavellir_crimson_stone_pressure_plate", () -> new PressurePlateBlock(BlockSetType.STONE, BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_STAIRS).requiresCorrectToolForDrops()));
    public static final DeferredBlock<ButtonBlock> NIDAVELLIR_CRIMSON_STONE_BUTTON = registerBlock("nidavellir_crimson_stone_button", () -> new ButtonBlock(BlockSetType.STONE, 10, BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BUTTON).requiresCorrectToolForDrops()));
    public static final DeferredBlock<WallBlock> NIDAVELLIR_CRIMSON_STONE_WALL = registerBlock("nidavellir_crimson_stone_wall", () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BRICK_WALL).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> NIDAVELLIR_CRIMSON_SMOOTH_STONE = registerBlock("nidavellir_crimson_smooth_stone", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BRICK_WALL).requiresCorrectToolForDrops()));

    public static final DeferredBlock<Block> NIDAVELLIR_CRIMSON_COBBLESTONE = registerBlock("nidavellir_crimson_cobblestone", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE)));
    public static final DeferredBlock<StairBlock> NIDAVELLIR_CRIMSON_COBBLESTONE_STAIRS = registerBlock("nidavellir_crimson_cobblestone_stairs", () -> new StairBlock(NIDAVELLIR_CRIMSON_COBBLESTONE.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_STAIRS).requiresCorrectToolForDrops()));
    public static final DeferredBlock<SlabBlock> NIDAVELLIR_CRIMSON_COBBLESTONE_SLAB = registerBlock("nidavellir_crimson_cobblestone_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_SLAB).requiresCorrectToolForDrops()));
    public static final DeferredBlock<WallBlock> NIDAVELLIR_CRIMSON_COBBLESTONE_WALL = registerBlock("nidavellir_crimson_cobblestone_wall", () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BRICK_WALL).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> NIDAVELLIR_CRIMSON_COBBLESTONE_MOSSY = registerBlock("nidavellir_crimson_cobblestone_mossy", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BRICK_WALL).requiresCorrectToolForDrops()));

    public static final DeferredBlock<Block> NIDAVELLIR_CRIMSON_STONE_BRICKS = registerBlock("nidavellir_crimson_stone_bricks", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BRICKS).requiresCorrectToolForDrops()));
    public static final DeferredBlock<StairBlock> NIDAVELLIR_CRIMSON_STONE_BRICKS_STAIRS = registerBlock("nidavellir_crimson_stone_bricks_stairs", () -> new StairBlock(NIDAVELLIR_CRIMSON_STONE_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_STAIRS).requiresCorrectToolForDrops()));
    public static final DeferredBlock<SlabBlock> NIDAVELLIR_CRIMSON_STONE_BRICKS_SLAB = registerBlock("nidavellir_crimson_stone_bricks_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_SLAB).requiresCorrectToolForDrops()));
    public static final DeferredBlock<WallBlock> NIDAVELLIR_CRIMSON_STONE_BRICKS_WALL = registerBlock("nidavellir_crimson_stone_bricks_wall", () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BRICK_WALL).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> NIDAVELLIR_CRIMSON_STONE_BRICKS_MOSSY = registerBlock("nidavellir_crimson_stone_bricks_mossy", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BRICK_WALL).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> NIDAVELLIR_CRIMSON_STONE_BRICKS_CRACKED = registerBlock("nidavellir_crimson_stone_bricks_cracked", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BRICK_WALL).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> NIDAVELLIR_CRIMSON_STONE_BRICKS_CHISELED = registerBlock("nidavellir_crimson_stone_bricks_chiseled", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BRICK_WALL).requiresCorrectToolForDrops()));

    public static final DeferredBlock<Block> NIDAVELLIR_CRIMSON_STONE_IRON_ORE = registerBlock("nidavellir_crimson_stone_iron_ore", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> NIDAVELLIR_CRIMSON_STONE_GOLD_ORE = registerBlock("nidavellir_crimson_stone_gold_ore", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> NIDAVELLIR_CRIMSON_STONE_COPPER_ORE = registerBlock("nidavellir_crimson_stone_copper_ore", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> NIDAVELLIR_CRIMSON_STONE_TIN_ORE = registerBlock("nidavellir_crimson_stone_tin_ore", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> NIDAVELLIR_CRIMSON_STONE_ZINC_ORE = registerBlock("nidavellir_crimson_stone_zinc_ore", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> NIDAVELLIR_CRIMSON_STONE_DIAMOND_ORE = registerBlock("nidavellir_crimson_stone_diamond_ore", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> NIDAVELLIR_CRIMSON_STONE_EMERALD_ORE = registerBlock("nidavellir_crimson_stone_emerald_ore", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> NIDAVELLIR_CRIMSON_STONE_COAL_ORE = registerBlock("nidavellir_crimson_stone_coal_ore", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> NIDAVELLIR_CRIMSON_STONE_REDSTONE_ORE = registerBlock("nidavellir_crimson_stone_redstone_ore", () -> new ModRedStoneOreBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.REDSTONE_ORE).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> NIDAVELLIR_CRIMSON_STONE_LAPIS_ORE = registerBlock("nidavellir_crimson_stone_lapis_ore", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> NIDAVELLIR_CRIMSON_STONE_AQUAMARINE_ORE = registerBlock("nidavellir_crimson_stone_aquamarine_ore", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> NIDAVELLIR_CRIMSON_STONE_OPAL_ORE = registerBlock("nidavellir_crimson_stone_opal_ore", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> NIDAVELLIR_CRIMSON_STONE_RUBY_ORE = registerBlock("nidavellir_crimson_stone_ruby_ore", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE).requiresCorrectToolForDrops()));

    public static final DeferredBlock<Block> NIDAVELLIR_CRIMSON_STONE_IRON_ORE_CLUSTER = registerBlock("nidavellir_crimson_stone_iron_ore_cluster", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> NIDAVELLIR_CRIMSON_STONE_GOLD_ORE_CLUSTER = registerBlock("nidavellir_crimson_stone_gold_ore_cluster", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> NIDAVELLIR_CRIMSON_STONE_COPPER_ORE_CLUSTER = registerBlock("nidavellir_crimson_stone_copper_ore_cluster", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> NIDAVELLIR_CRIMSON_STONE_TIN_ORE_CLUSTER = registerBlock("nidavellir_crimson_stone_tin_ore_cluster", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> NIDAVELLIR_CRIMSON_STONE_ZINC_ORE_CLUSTER = registerBlock("nidavellir_crimson_stone_zinc_ore_cluster", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> NIDAVELLIR_CRIMSON_STONE_DIAMOND_ORE_CLUSTER = registerBlock("nidavellir_crimson_stone_diamond_ore_cluster", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> NIDAVELLIR_CRIMSON_STONE_EMERALD_ORE_CLUSTER = registerBlock("nidavellir_crimson_stone_emerald_ore_cluster", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> NIDAVELLIR_CRIMSON_STONE_COAL_ORE_CLUSTER = registerBlock("nidavellir_crimson_stone_coal_ore_cluster", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> NIDAVELLIR_CRIMSON_STONE_REDSTONE_ORE_CLUSTER = registerBlock("nidavellir_crimson_stone_redstone_ore_cluster", () -> new ModRedStoneOreBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.REDSTONE_ORE).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> NIDAVELLIR_CRIMSON_STONE_LAPIS_ORE_CLUSTER = registerBlock("nidavellir_crimson_stone_lapis_ore_cluster", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> NIDAVELLIR_CRIMSON_STONE_AQUAMARINE_ORE_CLUSTER = registerBlock("nidavellir_crimson_stone_aquamarine_ore_cluster", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> NIDAVELLIR_CRIMSON_STONE_OPAL_ORE_CLUSTER = registerBlock("nidavellir_crimson_stone_opal_ore_cluster", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> NIDAVELLIR_CRIMSON_STONE_RUBY_ORE_CLUSTER = registerBlock("nidavellir_crimson_stone_ruby_ore_cluster", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE).requiresCorrectToolForDrops()));

    /*
     * WOOD TYPES
     */
    /*
    Metals
     */
    /*
     *Mushroom
     */
    /*
     FLOWERS
     */
    /*
    CROPS
     */
    /*
    FLUIDS
     */
    /*
     * WORLD BLOCKS
     */
    /*
    DIMENSIONAL BLOCKS
     */
    public static final DeferredBlock<Block> NIDAVELLIR_PORTAL_FRAME = registerBlock("nidavellir_portal_frame", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE)));
    public static final DeferredBlock<Block> NIDAVELLIR_PORTAL = registerBlock("nidavellir_portal", NidavellirPortalBlock::new);

    private static <T extends Block> DeferredBlock<T> registerBlock(String name, Supplier<T> block) {
        DeferredBlock<T> toReturn = NIDAVELLIR_BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> DeferredItem<Item> registerBlockItem(String name, DeferredBlock<T> block) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus){
        NIDAVELLIR_BLOCKS.register(eventBus);
    }
}
