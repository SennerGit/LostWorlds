package net.sen.lostworlds.registry.blocks;

import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.sen.lostworlds.api.LostWorldsApi;
import net.sen.lostworlds.block.ModBlockSetType;
import net.sen.lostworlds.block.crops.*;
import net.sen.lostworlds.block.custom.*;
import net.sen.lostworlds.block.portal.AlfheimrPortalBlock;
import net.sen.lostworlds.block.wood.*;
import net.sen.lostworlds.registry.items.ModItems;
import net.sen.lostworlds.worldgen.tree.*;

import java.util.function.Supplier;

public class AlfheimrBlocks {
    public static final DeferredRegister.Blocks ALFHEIMR_BLOCKS = DeferredRegister.createBlocks(LostWorldsApi.MODID);

    /*
    MULTI BLOCK
     */
    //Druid Ritual
    public static final DeferredBlock<Block> DRUID_RITUAL_STONE = registerBlock("druid_ritual_stone", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE)));

    /*
    STONE
     */
    /*
     * WOOD TYPES
     */
    //Black Birch
    public static final DeferredBlock<RotatedPillarBlock> BLACK_BIRCH_LOG = registerBlock("black_birch_log", () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LOG)));
    public static final DeferredBlock<RotatedPillarBlock> BLACK_BIRCH_WOOD = registerBlock("black_birch_wood", () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WOOD)));
    public static final DeferredBlock<RotatedPillarBlock> STRIPPED_BLACK_BIRCH_LOG = registerBlock("stripped_black_birch_log", () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_OAK_LOG)));
    public static final DeferredBlock<RotatedPillarBlock> STRIPPED_BLACK_BIRCH_WOOD = registerBlock("stripped_black_birch_wood", () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_OAK_WOOD)));
    public static final DeferredBlock<Block> BLACK_BIRCH_LEAVES = registerBlock("black_birch_leaves", () -> new ModFlammableLeavesBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LEAVES)));
    public static final DeferredBlock<SaplingBlock> BLACK_BIRCH_SAPLING = registerBlock("black_birch_sapling", () -> new ModSaplingBlock(ModTreeGrower.BLACK_BIRCH_TREE, true, Blocks.DIRT, Blocks.GRASS_BLOCK, Blocks.STONE));
    public static final DeferredBlock<Block> BLACK_BIRCH_PLANKS = registerBlock("black_birch_planks", () -> new ModFlammableBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS)));
    public static final DeferredBlock<SlabBlock> BLACK_BIRCH_PLANKS_SLAB = registerBlock("black_birch_planks_slab", () -> new ModFlammableSlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SLAB)));
    public static final DeferredBlock<StairBlock> BLACK_BIRCH_PLANKS_STAIRS = registerBlock("black_birch_planks_stairs", () -> new ModFlammableStairBlock(AlfheimrBlocks.BLACK_BIRCH_PLANKS.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_STAIRS)));
    public static final DeferredBlock<PressurePlateBlock> BLACK_BIRCH_PLANKS_PRESSURE_PLATE = registerBlock("black_birch_planks_pressure_plate", () -> new ModFlammablePressurePlateBlock(ModBlockSetType.BLACK_BIRCH, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PRESSURE_PLATE)));
    public static final DeferredBlock<DoorBlock> BLACK_BIRCH_PLANKS_DOOR = registerBlock("black_birch_planks_door", () -> new ModFlammableDoorBlock(ModBlockSetType.BLACK_BIRCH, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_DOOR)));
    public static final DeferredBlock<TrapDoorBlock> BLACK_BIRCH_PLANKS_TRAPDOOR = registerBlock("black_birch_planks_trapdoor", () -> new ModFlammableTrapDoorBlock(ModBlockSetType.BLACK_BIRCH, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_TRAPDOOR)));
    public static final DeferredBlock<FenceBlock> BLACK_BIRCH_PLANKS_FENCE = registerBlock("black_birch_planks_fence", () -> new ModFlammableFenceBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_FENCE)));
    public static final DeferredBlock<FenceGateBlock> BLACK_BIRCH_PLANKS_FENCE_GATE = registerBlock("black_birch_planks_fence_gate", () -> new ModFlammableFenceGateBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_FENCE_GATE), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE));
    public static final DeferredBlock<ButtonBlock> BLACK_BIRCH_PLANKS_BUTTON = registerBlock("black_birch_planks_button", () -> new ModFlammableButtonBlock(ModBlockSetType.BLACK_BIRCH, 10, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WALL_SIGN)));
    public static final DeferredBlock<StandingSignBlock> BLACK_BIRCH_PLANKS_SIGN = ALFHEIMR_BLOCKS.register("black_birch_planks_sign", () -> new ModStandingSignBlock(ModWoodTypes.BLACK_BIRCH, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SIGN)));
    public static final DeferredBlock<WallSignBlock> BLACK_BIRCH_PLANKS_WALL_SIGN = ALFHEIMR_BLOCKS.register("black_birch_planks_wall_sign", () -> new ModWallSignBlock(ModWoodTypes.BLACK_BIRCH, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WALL_SIGN)));
    public static final DeferredBlock<CeilingHangingSignBlock> BLACK_BIRCH_PLANKS_HANGING_SIGN = ALFHEIMR_BLOCKS.register("black_birch_planks_hanging_sign", () -> new ModHangingSignBlock(ModWoodTypes.BLACK_BIRCH, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_HANGING_SIGN)));
    public static final DeferredBlock<WallHangingSignBlock> BLACK_BIRCH_PLANKS_WALL_HANGING_SIGN = ALFHEIMR_BLOCKS.register("black_birch_planks_wall_hanging_sign", () -> new ModWallHangingSignBlock(ModWoodTypes.BLACK_BIRCH, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WALL_HANGING_SIGN)));

    //White Oak
    public static final DeferredBlock<RotatedPillarBlock> WHITE_OAK_LOG = registerBlock("white_oak_log", () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LOG)));
    public static final DeferredBlock<RotatedPillarBlock> WHITE_OAK_WOOD = registerBlock("white_oak_wood", () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WOOD)));
    public static final DeferredBlock<RotatedPillarBlock> STRIPPED_WHITE_OAK_LOG = registerBlock("stripped_white_oak_log", () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_OAK_LOG)));
    public static final DeferredBlock<RotatedPillarBlock> STRIPPED_WHITE_OAK_WOOD = registerBlock("stripped_white_oak_wood", () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_OAK_WOOD)));
    public static final DeferredBlock<Block> WHITE_OAK_LEAVES = registerBlock("white_oak_leaves", () -> new ModFlammableLeavesBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LEAVES)));
    public static final DeferredBlock<SaplingBlock> WHITE_OAK_SAPLING = registerBlock("white_oak_sapling", () -> new ModSaplingBlock(ModTreeGrower.WHITE_OAK_TREE, true, Blocks.DIRT, Blocks.GRASS_BLOCK, Blocks.STONE));
    public static final DeferredBlock<Block> WHITE_OAK_PLANKS = registerBlock("white_oak_planks", () -> new ModFlammableBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS)));
    public static final DeferredBlock<SlabBlock> WHITE_OAK_PLANKS_SLAB = registerBlock("white_oak_planks_slab", () -> new ModFlammableSlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SLAB)));
    public static final DeferredBlock<StairBlock> WHITE_OAK_PLANKS_STAIRS = registerBlock("white_oak_planks_stairs", () -> new ModFlammableStairBlock(AlfheimrBlocks.WHITE_OAK_PLANKS.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_STAIRS)));
    public static final DeferredBlock<PressurePlateBlock> WHITE_OAK_PLANKS_PRESSURE_PLATE = registerBlock("white_oak_planks_pressure_plate", () -> new ModFlammablePressurePlateBlock(ModBlockSetType.WHITE_OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PRESSURE_PLATE)));
    public static final DeferredBlock<DoorBlock> WHITE_OAK_PLANKS_DOOR = registerBlock("white_oak_planks_door", () -> new ModFlammableDoorBlock(ModBlockSetType.WHITE_OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_DOOR)));
    public static final DeferredBlock<TrapDoorBlock> WHITE_OAK_PLANKS_TRAPDOOR = registerBlock("white_oak_planks_trapdoor", () -> new ModFlammableTrapDoorBlock(ModBlockSetType.WHITE_OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_TRAPDOOR)));
    public static final DeferredBlock<FenceBlock> WHITE_OAK_PLANKS_FENCE = registerBlock("white_oak_planks_fence", () -> new ModFlammableFenceBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_FENCE)));
    public static final DeferredBlock<FenceGateBlock> WHITE_OAK_PLANKS_FENCE_GATE = registerBlock("white_oak_planks_fence_gate", () -> new ModFlammableFenceGateBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_FENCE_GATE), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE));
    public static final DeferredBlock<ButtonBlock> WHITE_OAK_PLANKS_BUTTON = registerBlock("white_oak_planks_button", () -> new ModFlammableButtonBlock(ModBlockSetType.WHITE_OAK, 10, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WALL_SIGN)));
    public static final DeferredBlock<StandingSignBlock> WHITE_OAK_PLANKS_SIGN = ALFHEIMR_BLOCKS.register("white_oak_planks_sign", () -> new ModStandingSignBlock(ModWoodTypes.WHITE_OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SIGN)));
    public static final DeferredBlock<WallSignBlock> WHITE_OAK_PLANKS_WALL_SIGN = ALFHEIMR_BLOCKS.register("white_oak_planks_wall_sign", () -> new ModWallSignBlock(ModWoodTypes.WHITE_OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WALL_SIGN)));
    public static final DeferredBlock<CeilingHangingSignBlock> WHITE_OAK_PLANKS_HANGING_SIGN = ALFHEIMR_BLOCKS.register("white_oak_planks_hanging_sign", () -> new ModHangingSignBlock(ModWoodTypes.WHITE_OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_HANGING_SIGN)));
    public static final DeferredBlock<WallHangingSignBlock> WHITE_OAK_PLANKS_WALL_HANGING_SIGN = ALFHEIMR_BLOCKS.register("white_oak_planks_wall_hanging_sign", () -> new ModWallHangingSignBlock(ModWoodTypes.WHITE_OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WALL_HANGING_SIGN)));

    //Bur Oak
    public static final DeferredBlock<RotatedPillarBlock> BUR_OAK_LOG = registerBlock("bur_oak_log", () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LOG)));
    public static final DeferredBlock<RotatedPillarBlock> BUR_OAK_WOOD = registerBlock("bur_oak_wood", () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WOOD)));
    public static final DeferredBlock<RotatedPillarBlock> STRIPPED_BUR_OAK_LOG = registerBlock("stripped_bur_oak_log", () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_OAK_LOG)));
    public static final DeferredBlock<RotatedPillarBlock> STRIPPED_BUR_OAK_WOOD = registerBlock("stripped_bur_oak_wood", () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_OAK_WOOD)));
    public static final DeferredBlock<Block> BUR_OAK_LEAVES = registerBlock("bur_oak_leaves", () -> new ModFlammableLeavesBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LEAVES)));
    public static final DeferredBlock<SaplingBlock> BUR_OAK_SAPLING = registerBlock("bur_oak_sapling", () -> new ModSaplingBlock(ModTreeGrower.BUR_OAK_TREE, true, Blocks.DIRT, Blocks.GRASS_BLOCK, Blocks.STONE));
    public static final DeferredBlock<Block> BUR_OAK_PLANKS = registerBlock("bur_oak_planks", () -> new ModFlammableBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS)));
    public static final DeferredBlock<SlabBlock> BUR_OAK_PLANKS_SLAB = registerBlock("bur_oak_planks_slab", () -> new ModFlammableSlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SLAB)));
    public static final DeferredBlock<StairBlock> BUR_OAK_PLANKS_STAIRS = registerBlock("bur_oak_planks_stairs", () -> new ModFlammableStairBlock(AlfheimrBlocks.BUR_OAK_PLANKS.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_STAIRS)));
    public static final DeferredBlock<PressurePlateBlock> BUR_OAK_PLANKS_PRESSURE_PLATE = registerBlock("bur_oak_planks_pressure_plate", () -> new ModFlammablePressurePlateBlock(ModBlockSetType.BUR_OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PRESSURE_PLATE)));
    public static final DeferredBlock<DoorBlock> BUR_OAK_PLANKS_DOOR = registerBlock("bur_oak_planks_door", () -> new ModFlammableDoorBlock(ModBlockSetType.BUR_OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_DOOR)));
    public static final DeferredBlock<TrapDoorBlock> BUR_OAK_PLANKS_TRAPDOOR = registerBlock("bur_oak_planks_trapdoor", () -> new ModFlammableTrapDoorBlock(ModBlockSetType.BUR_OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_TRAPDOOR)));
    public static final DeferredBlock<FenceBlock> BUR_OAK_PLANKS_FENCE = registerBlock("bur_oak_planks_fence", () -> new ModFlammableFenceBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_FENCE)));
    public static final DeferredBlock<FenceGateBlock> BUR_OAK_PLANKS_FENCE_GATE = registerBlock("bur_oak_planks_fence_gate", () -> new ModFlammableFenceGateBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_FENCE_GATE), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE));
    public static final DeferredBlock<ButtonBlock> BUR_OAK_PLANKS_BUTTON = registerBlock("bur_oak_planks_button", () -> new ModFlammableButtonBlock(ModBlockSetType.BUR_OAK, 10, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WALL_SIGN)));
    public static final DeferredBlock<StandingSignBlock> BUR_OAK_PLANKS_SIGN = ALFHEIMR_BLOCKS.register("bur_oak_planks_sign", () -> new ModStandingSignBlock(ModWoodTypes.BUR_OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SIGN)));
    public static final DeferredBlock<WallSignBlock> BUR_OAK_PLANKS_WALL_SIGN = ALFHEIMR_BLOCKS.register("bur_oak_planks_wall_sign", () -> new ModWallSignBlock(ModWoodTypes.BUR_OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WALL_SIGN)));
    public static final DeferredBlock<CeilingHangingSignBlock> BUR_OAK_PLANKS_HANGING_SIGN = ALFHEIMR_BLOCKS.register("bur_oak_planks_hanging_sign", () -> new ModHangingSignBlock(ModWoodTypes.BUR_OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_HANGING_SIGN)));
    public static final DeferredBlock<WallHangingSignBlock> BUR_OAK_PLANKS_WALL_HANGING_SIGN = ALFHEIMR_BLOCKS.register("bur_oak_planks_wall_hanging_sign", () -> new ModWallHangingSignBlock(ModWoodTypes.BUR_OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WALL_HANGING_SIGN)));

    //Blood Cherry
    public static final DeferredBlock<RotatedPillarBlock> BLOOD_CHERRY_LOG = registerBlock("blood_cherry_log", () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LOG)));
    public static final DeferredBlock<RotatedPillarBlock> BLOOD_CHERRY_WOOD = registerBlock("blood_cherry_wood", () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WOOD)));
    public static final DeferredBlock<RotatedPillarBlock> STRIPPED_BLOOD_CHERRY_LOG = registerBlock("stripped_blood_cherry_log", () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_OAK_LOG)));
    public static final DeferredBlock<RotatedPillarBlock> STRIPPED_BLOOD_CHERRY_WOOD = registerBlock("stripped_blood_cherry_wood", () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_OAK_WOOD)));
    public static final DeferredBlock<Block> BLOOD_CHERRY_LEAVES = registerBlock("blood_cherry_leaves", () -> new ModFlammableLeavesBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LEAVES)));
    public static final DeferredBlock<SaplingBlock> BLOOD_CHERRY_SAPLING = registerBlock("blood_cherry_sapling", () -> new ModSaplingBlock(ModTreeGrower.BLOOD_CHERRY_TREE, true, Blocks.DIRT, Blocks.GRASS_BLOCK, Blocks.STONE));
    public static final DeferredBlock<Block> BLOOD_CHERRY_PLANKS = registerBlock("blood_cherry_planks", () -> new ModFlammableBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS)));
    public static final DeferredBlock<SlabBlock> BLOOD_CHERRY_PLANKS_SLAB = registerBlock("blood_cherry_planks_slab", () -> new ModFlammableSlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SLAB)));
    public static final DeferredBlock<StairBlock> BLOOD_CHERRY_PLANKS_STAIRS = registerBlock("blood_cherry_planks_stairs", () -> new ModFlammableStairBlock(AlfheimrBlocks.BLOOD_CHERRY_PLANKS.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_STAIRS)));
    public static final DeferredBlock<PressurePlateBlock> BLOOD_CHERRY_PLANKS_PRESSURE_PLATE = registerBlock("blood_cherry_planks_pressure_plate", () -> new ModFlammablePressurePlateBlock(ModBlockSetType.BLOOD_CHERRY, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PRESSURE_PLATE)));
    public static final DeferredBlock<DoorBlock> BLOOD_CHERRY_PLANKS_DOOR = registerBlock("blood_cherry_planks_door", () -> new ModFlammableDoorBlock(ModBlockSetType.BLOOD_CHERRY, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_DOOR)));
    public static final DeferredBlock<TrapDoorBlock> BLOOD_CHERRY_PLANKS_TRAPDOOR = registerBlock("blood_cherry_planks_trapdoor", () -> new ModFlammableTrapDoorBlock(ModBlockSetType.BLOOD_CHERRY, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_TRAPDOOR)));
    public static final DeferredBlock<FenceBlock> BLOOD_CHERRY_PLANKS_FENCE = registerBlock("blood_cherry_planks_fence", () -> new ModFlammableFenceBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_FENCE)));
    public static final DeferredBlock<FenceGateBlock> BLOOD_CHERRY_PLANKS_FENCE_GATE = registerBlock("blood_cherry_planks_fence_gate", () -> new ModFlammableFenceGateBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_FENCE_GATE), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE));
    public static final DeferredBlock<ButtonBlock> BLOOD_CHERRY_PLANKS_BUTTON = registerBlock("blood_cherry_planks_button", () -> new ModFlammableButtonBlock(ModBlockSetType.BLOOD_CHERRY, 10, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WALL_SIGN)));
    public static final DeferredBlock<StandingSignBlock> BLOOD_CHERRY_PLANKS_SIGN = ALFHEIMR_BLOCKS.register("blood_cherry_planks_sign", () -> new ModStandingSignBlock(ModWoodTypes.BLOOD_CHERRY, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SIGN)));
    public static final DeferredBlock<WallSignBlock> BLOOD_CHERRY_PLANKS_WALL_SIGN = ALFHEIMR_BLOCKS.register("blood_cherry_planks_wall_sign", () -> new ModWallSignBlock(ModWoodTypes.BLOOD_CHERRY, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WALL_SIGN)));
    public static final DeferredBlock<CeilingHangingSignBlock> BLOOD_CHERRY_PLANKS_HANGING_SIGN = ALFHEIMR_BLOCKS.register("blood_cherry_planks_hanging_sign", () -> new ModHangingSignBlock(ModWoodTypes.BLOOD_CHERRY, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_HANGING_SIGN)));
    public static final DeferredBlock<WallHangingSignBlock> BLOOD_CHERRY_PLANKS_WALL_HANGING_SIGN = ALFHEIMR_BLOCKS.register("blood_cherry_planks_wall_hanging_sign", () -> new ModWallHangingSignBlock(ModWoodTypes.BLOOD_CHERRY, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WALL_HANGING_SIGN)));

    //Sacred Tree
    public static final DeferredBlock<RotatedPillarBlock> SACRED_TREE_LOG = registerBlock("sacred_tree_log", () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LOG)));
    public static final DeferredBlock<RotatedPillarBlock> SACRED_TREE_WOOD = registerBlock("sacred_tree_wood", () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WOOD)));
    public static final DeferredBlock<RotatedPillarBlock> STRIPPED_SACRED_TREE_LOG = registerBlock("stripped_sacred_tree_log", () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_OAK_LOG)));
    public static final DeferredBlock<RotatedPillarBlock> STRIPPED_SACRED_TREE_WOOD = registerBlock("stripped_sacred_tree_wood", () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_OAK_WOOD)));
    public static final DeferredBlock<Block> SACRED_TREE_LEAVES = registerBlock("sacred_tree_leaves", () -> new ModFlammableLeavesBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LEAVES)));
    public static final DeferredBlock<SaplingBlock> SACRED_TREE_SAPLING = registerBlock("sacred_tree_sapling", () -> new ModSaplingBlock(ModTreeGrower.SACRED_TREE, true, Blocks.DIRT, Blocks.GRASS_BLOCK, Blocks.STONE));
    public static final DeferredBlock<Block> SACRED_TREE_PLANKS = registerBlock("sacred_tree_planks", () -> new ModFlammableBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS)));
    public static final DeferredBlock<SlabBlock> SACRED_TREE_PLANKS_SLAB = registerBlock("sacred_tree_planks_slab", () -> new ModFlammableSlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SLAB)));
    public static final DeferredBlock<StairBlock> SACRED_TREE_PLANKS_STAIRS = registerBlock("sacred_tree_planks_stairs", () -> new ModFlammableStairBlock(AlfheimrBlocks.SACRED_TREE_PLANKS.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_STAIRS)));
    public static final DeferredBlock<PressurePlateBlock> SACRED_TREE_PLANKS_PRESSURE_PLATE = registerBlock("sacred_tree_planks_pressure_plate", () -> new ModFlammablePressurePlateBlock(ModBlockSetType.SACRED_TREE, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PRESSURE_PLATE)));
    public static final DeferredBlock<DoorBlock> SACRED_TREE_PLANKS_DOOR = registerBlock("sacred_tree_planks_door", () -> new ModFlammableDoorBlock(ModBlockSetType.SACRED_TREE, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_DOOR)));
    public static final DeferredBlock<TrapDoorBlock> SACRED_TREE_PLANKS_TRAPDOOR = registerBlock("sacred_tree_planks_trapdoor", () -> new ModFlammableTrapDoorBlock(ModBlockSetType.SACRED_TREE, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_TRAPDOOR)));
    public static final DeferredBlock<FenceBlock> SACRED_TREE_PLANKS_FENCE = registerBlock("sacred_tree_planks_fence", () -> new ModFlammableFenceBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_FENCE)));
    public static final DeferredBlock<FenceGateBlock> SACRED_TREE_PLANKS_FENCE_GATE = registerBlock("sacred_tree_planks_fence_gate", () -> new ModFlammableFenceGateBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_FENCE_GATE), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE));
    public static final DeferredBlock<ButtonBlock> SACRED_TREE_PLANKS_BUTTON = registerBlock("sacred_tree_planks_button", () -> new ModFlammableButtonBlock(ModBlockSetType.SACRED_TREE, 10, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WALL_SIGN)));
    public static final DeferredBlock<StandingSignBlock> SACRED_TREE_PLANKS_SIGN = ALFHEIMR_BLOCKS.register("sacred_tree_planks_sign", () -> new ModStandingSignBlock(ModWoodTypes.SACRED_TREE, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SIGN)));
    public static final DeferredBlock<WallSignBlock> SACRED_TREE_PLANKS_WALL_SIGN = ALFHEIMR_BLOCKS.register("sacred_tree_planks_wall_sign", () -> new ModWallSignBlock(ModWoodTypes.SACRED_TREE, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WALL_SIGN)));
    public static final DeferredBlock<CeilingHangingSignBlock> SACRED_TREE_PLANKS_HANGING_SIGN = ALFHEIMR_BLOCKS.register("sacred_tree_planks_hanging_sign", () -> new ModHangingSignBlock(ModWoodTypes.SACRED_TREE, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_HANGING_SIGN)));
    public static final DeferredBlock<WallHangingSignBlock> SACRED_TREE_PLANKS_WALL_HANGING_SIGN = ALFHEIMR_BLOCKS.register("sacred_tree_planks_wall_hanging_sign", () -> new ModWallHangingSignBlock(ModWoodTypes.SACRED_TREE, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WALL_HANGING_SIGN)));

    //Willow
    public static final DeferredBlock<RotatedPillarBlock> WILLOW_LOG = registerBlock("willow_log", () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LOG)));
    public static final DeferredBlock<RotatedPillarBlock> WILLOW_WOOD = registerBlock("willow_wood", () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WOOD)));
    public static final DeferredBlock<RotatedPillarBlock> STRIPPED_WILLOW_LOG = registerBlock("stripped_willow_log", () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_OAK_LOG)));
    public static final DeferredBlock<RotatedPillarBlock> STRIPPED_WILLOW_WOOD = registerBlock("stripped_willow_wood", () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_OAK_WOOD)));
    public static final DeferredBlock<Block> WILLOW_LEAVES = registerBlock("willow_leaves", () -> new ModFlammableLeavesBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LEAVES)));
    public static final DeferredBlock<SaplingBlock> WILLOW_SAPLING = registerBlock("willow_sapling", () -> new ModSaplingBlock(ModTreeGrower.WILLOW_TREE, true, Blocks.DIRT, Blocks.GRASS_BLOCK, Blocks.STONE));
    public static final DeferredBlock<Block> WILLOW_PLANKS = registerBlock("willow_planks", () -> new ModFlammableBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS)));
    public static final DeferredBlock<SlabBlock> WILLOW_PLANKS_SLAB = registerBlock("willow_planks_slab", () -> new ModFlammableSlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SLAB)));
    public static final DeferredBlock<StairBlock> WILLOW_PLANKS_STAIRS = registerBlock("willow_planks_stairs", () -> new ModFlammableStairBlock(AlfheimrBlocks.WILLOW_PLANKS.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_STAIRS)));
    public static final DeferredBlock<PressurePlateBlock> WILLOW_PLANKS_PRESSURE_PLATE = registerBlock("willow_planks_pressure_plate", () -> new ModFlammablePressurePlateBlock(ModBlockSetType.WILLOW, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PRESSURE_PLATE)));
    public static final DeferredBlock<DoorBlock> WILLOW_PLANKS_DOOR = registerBlock("willow_planks_door", () -> new ModFlammableDoorBlock(ModBlockSetType.WILLOW, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_DOOR)));
    public static final DeferredBlock<TrapDoorBlock> WILLOW_PLANKS_TRAPDOOR = registerBlock("willow_planks_trapdoor", () -> new ModFlammableTrapDoorBlock(ModBlockSetType.WILLOW, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_TRAPDOOR)));
    public static final DeferredBlock<FenceBlock> WILLOW_PLANKS_FENCE = registerBlock("willow_planks_fence", () -> new ModFlammableFenceBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_FENCE)));
    public static final DeferredBlock<FenceGateBlock> WILLOW_PLANKS_FENCE_GATE = registerBlock("willow_planks_fence_gate", () -> new ModFlammableFenceGateBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_FENCE_GATE), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE));
    public static final DeferredBlock<ButtonBlock> WILLOW_PLANKS_BUTTON = registerBlock("willow_planks_button", () -> new ModFlammableButtonBlock(ModBlockSetType.WILLOW, 10, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WALL_SIGN)));
    public static final DeferredBlock<StandingSignBlock> WILLOW_PLANKS_SIGN = ALFHEIMR_BLOCKS.register("willow_planks_sign", () -> new ModStandingSignBlock(ModWoodTypes.WILLOW, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SIGN)));
    public static final DeferredBlock<WallSignBlock> WILLOW_PLANKS_WALL_SIGN = ALFHEIMR_BLOCKS.register("willow_planks_wall_sign", () -> new ModWallSignBlock(ModWoodTypes.WILLOW, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WALL_SIGN)));
    public static final DeferredBlock<CeilingHangingSignBlock> WILLOW_PLANKS_HANGING_SIGN = ALFHEIMR_BLOCKS.register("willow_planks_hanging_sign", () -> new ModHangingSignBlock(ModWoodTypes.WILLOW, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_HANGING_SIGN)));
    public static final DeferredBlock<WallHangingSignBlock> WILLOW_PLANKS_WALL_HANGING_SIGN = ALFHEIMR_BLOCKS.register("willow_planks_wall_hanging_sign", () -> new ModWallHangingSignBlock(ModWoodTypes.WILLOW, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WALL_HANGING_SIGN)));

    //Deadwood
    public static final DeferredBlock<RotatedPillarBlock> DEADWOOD_LOG = registerBlock("deadwood_log", () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LOG)));
    public static final DeferredBlock<RotatedPillarBlock> DEADWOOD_WOOD = registerBlock("deadwood_wood", () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WOOD)));
    public static final DeferredBlock<RotatedPillarBlock> STRIPPED_DEADWOOD_LOG = registerBlock("stripped_deadwood_log", () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_OAK_LOG)));
    public static final DeferredBlock<RotatedPillarBlock> STRIPPED_DEADWOOD_WOOD = registerBlock("stripped_deadwood_wood", () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_OAK_WOOD)));
    public static final DeferredBlock<Block> DEADWOOD_LEAVES = registerBlock("deadwood_leaves", () -> new ModFlammableLeavesBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LEAVES)));
    public static final DeferredBlock<SaplingBlock> DEADWOOD_SAPLING = registerBlock("deadwood_sapling", () -> new ModSaplingBlock(ModTreeGrower.DEADWOOD_TREE, true, Blocks.DIRT, Blocks.GRASS_BLOCK, Blocks.STONE));
    public static final DeferredBlock<Block> DEADWOOD_PLANKS = registerBlock("deadwood_planks", () -> new ModFlammableBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS)));
    public static final DeferredBlock<SlabBlock> DEADWOOD_PLANKS_SLAB = registerBlock("deadwood_planks_slab", () -> new ModFlammableSlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SLAB)));
    public static final DeferredBlock<StairBlock> DEADWOOD_PLANKS_STAIRS = registerBlock("deadwood_planks_stairs", () -> new ModFlammableStairBlock(AlfheimrBlocks.DEADWOOD_PLANKS.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_STAIRS)));
    public static final DeferredBlock<PressurePlateBlock> DEADWOOD_PLANKS_PRESSURE_PLATE = registerBlock("deadwood_planks_pressure_plate", () -> new ModFlammablePressurePlateBlock(ModBlockSetType.DEADWOOD, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PRESSURE_PLATE)));
    public static final DeferredBlock<DoorBlock> DEADWOOD_PLANKS_DOOR = registerBlock("deadwood_planks_door", () -> new ModFlammableDoorBlock(ModBlockSetType.DEADWOOD, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_DOOR)));
    public static final DeferredBlock<TrapDoorBlock> DEADWOOD_PLANKS_TRAPDOOR = registerBlock("deadwood_planks_trapdoor", () -> new ModFlammableTrapDoorBlock(ModBlockSetType.DEADWOOD, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_TRAPDOOR)));
    public static final DeferredBlock<FenceBlock> DEADWOOD_PLANKS_FENCE = registerBlock("deadwood_planks_fence", () -> new ModFlammableFenceBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_FENCE)));
    public static final DeferredBlock<FenceGateBlock> DEADWOOD_PLANKS_FENCE_GATE = registerBlock("deadwood_planks_fence_gate", () -> new ModFlammableFenceGateBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_FENCE_GATE), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE));
    public static final DeferredBlock<ButtonBlock> DEADWOOD_PLANKS_BUTTON = registerBlock("deadwood_planks_button", () -> new ModFlammableButtonBlock(ModBlockSetType.DEADWOOD, 10, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WALL_SIGN)));
    public static final DeferredBlock<StandingSignBlock> DEADWOOD_PLANKS_SIGN = ALFHEIMR_BLOCKS.register("deadwood_planks_sign", () -> new ModStandingSignBlock(ModWoodTypes.DEADWOOD, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SIGN)));
    public static final DeferredBlock<WallSignBlock> DEADWOOD_PLANKS_WALL_SIGN = ALFHEIMR_BLOCKS.register("deadwood_planks_wall_sign", () -> new ModWallSignBlock(ModWoodTypes.DEADWOOD, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WALL_SIGN)));
    public static final DeferredBlock<CeilingHangingSignBlock> DEADWOOD_PLANKS_HANGING_SIGN = ALFHEIMR_BLOCKS.register("deadwood_planks_hanging_sign", () -> new ModHangingSignBlock(ModWoodTypes.DEADWOOD, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_HANGING_SIGN)));
    public static final DeferredBlock<WallHangingSignBlock> DEADWOOD_PLANKS_WALL_HANGING_SIGN = ALFHEIMR_BLOCKS.register("deadwood_planks_wall_hanging_sign", () -> new ModWallHangingSignBlock(ModWoodTypes.DEADWOOD, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WALL_HANGING_SIGN)));

    //Ebony Kingswood
    public static final DeferredBlock<RotatedPillarBlock> EBONY_KINGSWOOD_LOG = registerBlock("ebony_kingswood_log", () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LOG)));
    public static final DeferredBlock<RotatedPillarBlock> EBONY_KINGSWOOD_WOOD = registerBlock("ebony_kingswood_wood", () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WOOD)));
    public static final DeferredBlock<RotatedPillarBlock> STRIPPED_EBONY_KINGSWOOD_LOG = registerBlock("stripped_ebony_kingswood_log", () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_OAK_LOG)));
    public static final DeferredBlock<RotatedPillarBlock> STRIPPED_EBONY_KINGSWOOD_WOOD = registerBlock("stripped_ebony_kingswood_wood", () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_OAK_WOOD)));
    public static final DeferredBlock<Block> EBONY_KINGSWOOD_LEAVES = registerBlock("ebony_kingswood_leaves", () -> new ModFlammableLeavesBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LEAVES)));
    public static final DeferredBlock<SaplingBlock> EBONY_KINGSWOOD_SAPLING = registerBlock("ebony_kingswood_sapling", () -> new ModSaplingBlock(ModTreeGrower.EBONY_KINGSWOOD_TREE, true, Blocks.DIRT, Blocks.GRASS_BLOCK, Blocks.STONE));
    public static final DeferredBlock<Block> EBONY_KINGSWOOD_PLANKS = registerBlock("ebony_kingswood_planks", () -> new ModFlammableBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS)));
    public static final DeferredBlock<SlabBlock> EBONY_KINGSWOOD_PLANKS_SLAB = registerBlock("ebony_kingswood_planks_slab", () -> new ModFlammableSlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SLAB)));
    public static final DeferredBlock<StairBlock> EBONY_KINGSWOOD_PLANKS_STAIRS = registerBlock("ebony_kingswood_planks_stairs", () -> new ModFlammableStairBlock(AlfheimrBlocks.EBONY_KINGSWOOD_PLANKS.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_STAIRS)));
    public static final DeferredBlock<PressurePlateBlock> EBONY_KINGSWOOD_PLANKS_PRESSURE_PLATE = registerBlock("ebony_kingswood_planks_pressure_plate", () -> new ModFlammablePressurePlateBlock(ModBlockSetType.EBONY_KINGSWOOD, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PRESSURE_PLATE)));
    public static final DeferredBlock<DoorBlock> EBONY_KINGSWOOD_PLANKS_DOOR = registerBlock("ebony_kingswood_planks_door", () -> new ModFlammableDoorBlock(ModBlockSetType.EBONY_KINGSWOOD, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_DOOR)));
    public static final DeferredBlock<TrapDoorBlock> EBONY_KINGSWOOD_PLANKS_TRAPDOOR = registerBlock("ebony_kingswood_planks_trapdoor", () -> new ModFlammableTrapDoorBlock(ModBlockSetType.EBONY_KINGSWOOD, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_TRAPDOOR)));
    public static final DeferredBlock<FenceBlock> EBONY_KINGSWOOD_PLANKS_FENCE = registerBlock("ebony_kingswood_planks_fence", () -> new ModFlammableFenceBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_FENCE)));
    public static final DeferredBlock<FenceGateBlock> EBONY_KINGSWOOD_PLANKS_FENCE_GATE = registerBlock("ebony_kingswood_planks_fence_gate", () -> new ModFlammableFenceGateBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_FENCE_GATE), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE));
    public static final DeferredBlock<ButtonBlock> EBONY_KINGSWOOD_PLANKS_BUTTON = registerBlock("ebony_kingswood_planks_button", () -> new ModFlammableButtonBlock(ModBlockSetType.EBONY_KINGSWOOD, 10, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WALL_SIGN)));
    public static final DeferredBlock<StandingSignBlock> EBONY_KINGSWOOD_PLANKS_SIGN = ALFHEIMR_BLOCKS.register("ebony_kingswood_planks_sign", () -> new ModStandingSignBlock(ModWoodTypes.EBONY_KINGSWOOD, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SIGN)));
    public static final DeferredBlock<WallSignBlock> EBONY_KINGSWOOD_PLANKS_WALL_SIGN = ALFHEIMR_BLOCKS.register("ebony_kingswood_planks_wall_sign", () -> new ModWallSignBlock(ModWoodTypes.EBONY_KINGSWOOD, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WALL_SIGN)));
    public static final DeferredBlock<CeilingHangingSignBlock> EBONY_KINGSWOOD_PLANKS_HANGING_SIGN = ALFHEIMR_BLOCKS.register("ebony_kingswood_planks_hanging_sign", () -> new ModHangingSignBlock(ModWoodTypes.EBONY_KINGSWOOD, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_HANGING_SIGN)));
    public static final DeferredBlock<WallHangingSignBlock> EBONY_KINGSWOOD_PLANKS_WALL_HANGING_SIGN = ALFHEIMR_BLOCKS.register("ebony_kingswood_planks_wall_hanging_sign", () -> new ModWallHangingSignBlock(ModWoodTypes.EBONY_KINGSWOOD, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WALL_HANGING_SIGN)));

    //Ivory Kingswood
    public static final DeferredBlock<RotatedPillarBlock> IVORY_KINGSWOOD_LOG = registerBlock("ivory_kingswood_log", () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LOG)));
    public static final DeferredBlock<RotatedPillarBlock> IVORY_KINGSWOOD_WOOD = registerBlock("ivory_kingswood_wood", () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WOOD)));
    public static final DeferredBlock<RotatedPillarBlock> STRIPPED_IVORY_KINGSWOOD_LOG = registerBlock("stripped_ivory_kingswood_log", () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_OAK_LOG)));
    public static final DeferredBlock<RotatedPillarBlock> STRIPPED_IVORY_KINGSWOOD_WOOD = registerBlock("stripped_ivory_kingswood_wood", () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_OAK_WOOD)));
    public static final DeferredBlock<Block> IVORY_KINGSWOOD_LEAVES = registerBlock("ivory_kingswood_leaves", () -> new ModFlammableLeavesBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LEAVES)));
    public static final DeferredBlock<SaplingBlock> IVORY_KINGSWOOD_SAPLING = registerBlock("ivory_kingswood_sapling", () -> new ModSaplingBlock(ModTreeGrower.IVORY_KINGSWOOD_TREE, true, Blocks.DIRT, Blocks.GRASS_BLOCK, Blocks.STONE));
    public static final DeferredBlock<Block> IVORY_KINGSWOOD_PLANKS = registerBlock("ivory_kingswood_planks", () -> new ModFlammableBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS)));
    public static final DeferredBlock<SlabBlock> IVORY_KINGSWOOD_PLANKS_SLAB = registerBlock("ivory_kingswood_planks_slab", () -> new ModFlammableSlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SLAB)));
    public static final DeferredBlock<StairBlock> IVORY_KINGSWOOD_PLANKS_STAIRS = registerBlock("ivory_kingswood_planks_stairs", () -> new ModFlammableStairBlock(AlfheimrBlocks.IVORY_KINGSWOOD_PLANKS.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_STAIRS)));
    public static final DeferredBlock<PressurePlateBlock> IVORY_KINGSWOOD_PLANKS_PRESSURE_PLATE = registerBlock("ivory_kingswood_planks_pressure_plate", () -> new ModFlammablePressurePlateBlock(ModBlockSetType.IVORY_KINGSWOOD, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PRESSURE_PLATE)));
    public static final DeferredBlock<DoorBlock> IVORY_KINGSWOOD_PLANKS_DOOR = registerBlock("ivory_kingswood_planks_door", () -> new ModFlammableDoorBlock(ModBlockSetType.IVORY_KINGSWOOD, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_DOOR)));
    public static final DeferredBlock<TrapDoorBlock> IVORY_KINGSWOOD_PLANKS_TRAPDOOR = registerBlock("ivory_kingswood_planks_trapdoor", () -> new ModFlammableTrapDoorBlock(ModBlockSetType.IVORY_KINGSWOOD, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_TRAPDOOR)));
    public static final DeferredBlock<FenceBlock> IVORY_KINGSWOOD_PLANKS_FENCE = registerBlock("ivory_kingswood_planks_fence", () -> new ModFlammableFenceBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_FENCE)));
    public static final DeferredBlock<FenceGateBlock> IVORY_KINGSWOOD_PLANKS_FENCE_GATE = registerBlock("ivory_kingswood_planks_fence_gate", () -> new ModFlammableFenceGateBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_FENCE_GATE), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE));
    public static final DeferredBlock<ButtonBlock> IVORY_KINGSWOOD_PLANKS_BUTTON = registerBlock("ivory_kingswood_planks_button", () -> new ModFlammableButtonBlock(ModBlockSetType.IVORY_KINGSWOOD, 10, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WALL_SIGN)));
    public static final DeferredBlock<StandingSignBlock> IVORY_KINGSWOOD_PLANKS_SIGN =  ALFHEIMR_BLOCKS.register("ivory_kingswood_planks_sign", () -> new ModStandingSignBlock(ModWoodTypes.IVORY_KINGSWOOD, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SIGN)));
    public static final DeferredBlock<WallSignBlock> IVORY_KINGSWOOD_PLANKS_WALL_SIGN = ALFHEIMR_BLOCKS.register("ivory_kingswood_planks_wall_sign", () -> new ModWallSignBlock(ModWoodTypes.IVORY_KINGSWOOD, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WALL_SIGN)));
    public static final DeferredBlock<CeilingHangingSignBlock> IVORY_KINGSWOOD_PLANKS_HANGING_SIGN = ALFHEIMR_BLOCKS.register("ivory_kingswood_planks_hanging_sign", () -> new ModHangingSignBlock(ModWoodTypes.IVORY_KINGSWOOD, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_HANGING_SIGN)));
    public static final DeferredBlock<WallHangingSignBlock> IVORY_KINGSWOOD_PLANKS_WALL_HANGING_SIGN = ALFHEIMR_BLOCKS.register("ivory_kingswood_planks_wall_hanging_sign", () -> new ModWallHangingSignBlock(ModWoodTypes.IVORY_KINGSWOOD, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WALL_HANGING_SIGN)));

    //Weaver
    public static final DeferredBlock<RotatedPillarBlock> WEAVER_LOG = registerBlock("weaver_log", () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LOG)));
    public static final DeferredBlock<RotatedPillarBlock> WEAVER_WOOD = registerBlock("weaver_wood", () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WOOD)));
    public static final DeferredBlock<RotatedPillarBlock> STRIPPED_WEAVER_LOG = registerBlock("stripped_weaver_log", () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_OAK_LOG)));
    public static final DeferredBlock<RotatedPillarBlock> STRIPPED_WEAVER_WOOD = registerBlock("stripped_weaver_wood", () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_OAK_WOOD)));
    public static final DeferredBlock<Block> WEAVER_LEAVES = registerBlock("weaver_leaves", () -> new ModFlammableLeavesBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LEAVES)));
    public static final DeferredBlock<SaplingBlock> WEAVER_SAPLING = registerBlock("weaver_sapling", () -> new ModSaplingBlock(ModTreeGrower.WEAVER_TREE, true, Blocks.DIRT, Blocks.GRASS_BLOCK, Blocks.STONE));
    public static final DeferredBlock<Block> WEAVER_PLANKS = registerBlock("weaver_planks", () -> new ModFlammableBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS)));
    public static final DeferredBlock<SlabBlock> WEAVER_PLANKS_SLAB = registerBlock("weaver_planks_slab", () -> new ModFlammableSlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SLAB)));
    public static final DeferredBlock<StairBlock> WEAVER_PLANKS_STAIRS = registerBlock("weaver_planks_stairs", () -> new ModFlammableStairBlock(AlfheimrBlocks.WEAVER_PLANKS.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_STAIRS)));
    public static final DeferredBlock<PressurePlateBlock> WEAVER_PLANKS_PRESSURE_PLATE = registerBlock("weaver_planks_pressure_plate", () -> new ModFlammablePressurePlateBlock(ModBlockSetType.WEAVER, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PRESSURE_PLATE)));
    public static final DeferredBlock<DoorBlock> WEAVER_PLANKS_DOOR = registerBlock("weaver_planks_door", () -> new ModFlammableDoorBlock(ModBlockSetType.WEAVER, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_DOOR)));
    public static final DeferredBlock<TrapDoorBlock> WEAVER_PLANKS_TRAPDOOR = registerBlock("weaver_planks_trapdoor", () -> new ModFlammableTrapDoorBlock(ModBlockSetType.WEAVER, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_TRAPDOOR)));
    public static final DeferredBlock<FenceBlock> WEAVER_PLANKS_FENCE = registerBlock("weaver_planks_fence", () -> new ModFlammableFenceBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_FENCE)));
    public static final DeferredBlock<FenceGateBlock> WEAVER_PLANKS_FENCE_GATE = registerBlock("weaver_planks_fence_gate", () -> new ModFlammableFenceGateBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_FENCE_GATE), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE));
    public static final DeferredBlock<ButtonBlock> WEAVER_PLANKS_BUTTON = registerBlock("weaver_planks_button", () -> new ModFlammableButtonBlock(ModBlockSetType.WEAVER, 10, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WALL_SIGN)));
    public static final DeferredBlock<StandingSignBlock> WEAVER_PLANKS_SIGN = ALFHEIMR_BLOCKS.register("weaver_planks_sign", () -> new ModStandingSignBlock(ModWoodTypes.WEAVER, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SIGN)));
    public static final DeferredBlock<WallSignBlock> WEAVER_PLANKS_WALL_SIGN = ALFHEIMR_BLOCKS.register("weaver_planks_wall_sign", () -> new ModWallSignBlock(ModWoodTypes.WEAVER, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WALL_SIGN)));
    public static final DeferredBlock<CeilingHangingSignBlock> WEAVER_PLANKS_HANGING_SIGN = ALFHEIMR_BLOCKS.register("weaver_planks_hanging_sign", () -> new ModHangingSignBlock(ModWoodTypes.WEAVER, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_HANGING_SIGN)));
    public static final DeferredBlock<WallHangingSignBlock> WEAVER_PLANKS_WALL_HANGING_SIGN = ALFHEIMR_BLOCKS.register("weaver_planks_wall_hanging_sign", () -> new ModWallHangingSignBlock(ModWoodTypes.WEAVER, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WALL_HANGING_SIGN)));

    /*
    Metals
     */
    /*
     *Mushroom
     */
    public static final DeferredBlock<Block> POINT_MUSHROOM_BLOCK = registerBlock("point_mushroom_block", () -> new ModFlowerBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BROWN_MUSHROOM_BLOCK).noCollission().noOcclusion()));
    public static final DeferredBlock<FlowerPotBlock> POTTED_POINT_MUSHROOM_BLOCK = registerBlock("potted_point_mushroom_block", () -> new FlowerPotBlock((() -> (FlowerPotBlock) Blocks.FLOWER_POT), POINT_MUSHROOM_BLOCK, BlockBehaviour.Properties.ofFullCopy(Blocks.BROWN_MUSHROOM_BLOCK)));
    public static final DeferredBlock<Block> TOP_POINT_MUSHROOM_BLOCK = registerBlock("top_point_mushroom_block", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.MUSHROOM_STEM)));
    public static final DeferredBlock<Block> POINT_MUSHROOM_STEM_BLOCK = registerBlock("point_mushroom_stem_block", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.MUSHROOM_STEM)));

    public static final DeferredBlock<Block> WITCHES_MUSHROOM_BLOCK = registerBlock("witches_mushroom_block", () -> new ModFlowerBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BROWN_MUSHROOM_BLOCK).noCollission().noOcclusion()));
    public static final DeferredBlock<FlowerPotBlock> POTTED_WITCHES_MUSHROOM_BLOCK = registerBlock("potted_witches_mushroom_block", () -> new FlowerPotBlock((() -> (FlowerPotBlock) Blocks.FLOWER_POT), WITCHES_MUSHROOM_BLOCK, BlockBehaviour.Properties.ofFullCopy(Blocks.BROWN_MUSHROOM_BLOCK)));
    public static final DeferredBlock<Block> TOP_WITCHES_MUSHROOM_BLOCK = registerBlock("top_witches_mushroom_block", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.MUSHROOM_STEM)));
    public static final DeferredBlock<Block> WITCHES_MUSHROOM_STEM_BLOCK = registerBlock("witches_mushroom_stem_block", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.MUSHROOM_STEM)));

    public static final DeferredBlock<Block> ROYAL_BLUE_MUSHROOM_BLOCK = registerBlock("royal_blue_mushroom_block", () -> new ModFlowerBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BROWN_MUSHROOM_BLOCK).noCollission().noOcclusion()));
    public static final DeferredBlock<FlowerPotBlock> POTTED_ROYAL_BLUE_MUSHROOM_BLOCK = registerBlock("potted_royal_blue_mushroom_block", () -> new FlowerPotBlock((() -> (FlowerPotBlock) Blocks.FLOWER_POT), ROYAL_BLUE_MUSHROOM_BLOCK, BlockBehaviour.Properties.ofFullCopy(Blocks.BROWN_MUSHROOM_BLOCK)));
    public static final DeferredBlock<Block> TOP_ROYAL_BLUE_MUSHROOM_BLOCK = registerBlock("top_royal_blue_mushroom_block", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.MUSHROOM_STEM)));
    public static final DeferredBlock<Block> ROYAL_BLUE_MUSHROOM_STEM_BLOCK = registerBlock("royal_blue_mushroom_stem_block", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.MUSHROOM_STEM)));
    public static final DeferredBlock<Block> ROYAL_BLUE_MUSHROOM_GLOW_BLOCK = registerBlock("royal_blue_mushroom_glow_block", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.MUSHROOM_STEM).lightLevel((p_50755_) -> { return 7; })));

    public static final DeferredBlock<Block> SHORT_TOP_MUSHROOM_BLOCK = registerBlock("short_top_mushroom_block", () -> new ModFlowerBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BROWN_MUSHROOM_BLOCK).noCollission().noOcclusion()));
    public static final DeferredBlock<FlowerPotBlock> POTTED_SHORT_TOP_MUSHROOM_BLOCK = registerBlock("potted_short_top_mushroom_block", () -> new FlowerPotBlock((() -> (FlowerPotBlock) Blocks.FLOWER_POT), SHORT_TOP_MUSHROOM_BLOCK, BlockBehaviour.Properties.ofFullCopy(Blocks.BROWN_MUSHROOM_BLOCK)));
    public static final DeferredBlock<Block> TOP_SHORT_TOP_MUSHROOM_BLOCK = registerBlock("top_short_top_mushroom_block", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.MUSHROOM_STEM)));
    public static final DeferredBlock<Block> SHORT_TOP_MUSHROOM_STEM_BLOCK = registerBlock("short_top_mushroom_stem_block", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.MUSHROOM_STEM)));

    public static final DeferredBlock<Block> SPECTRAL_MUSHROOM_BLOCK = registerBlock("spectral_mushroom_block", () -> new ModFlowerBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BROWN_MUSHROOM_BLOCK).noCollission().noOcclusion()));
    public static final DeferredBlock<FlowerPotBlock> POTTED_SPECTRAL_MUSHROOM_BLOCK = registerBlock("potted_spectral_mushroom_block", () -> new FlowerPotBlock((() -> (FlowerPotBlock) Blocks.FLOWER_POT), SPECTRAL_MUSHROOM_BLOCK, BlockBehaviour.Properties.ofFullCopy(Blocks.BROWN_MUSHROOM_BLOCK)));
    public static final DeferredBlock<Block> TOP_SPECTRAL_MUSHROOM_BLOCK = registerBlock("top_spectral_mushroom_block", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.MUSHROOM_STEM)));
    public static final DeferredBlock<Block> SPECTRAL_MUSHROOM_STEM_BLOCK = registerBlock("spectral_mushroom_stem_block", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.MUSHROOM_STEM)));

    public static final DeferredBlock<Block> SHADE_MUSHROOM_BLOCK = registerBlock("shade_mushroom_block", () -> new ModFlowerBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BROWN_MUSHROOM_BLOCK)));
    public static final DeferredBlock<FlowerPotBlock> POTTED_SHADE_MUSHROOM_BLOCK = registerBlock("potted_shade_mushroom_block", () -> new FlowerPotBlock((() -> (FlowerPotBlock) Blocks.FLOWER_POT), SHADE_MUSHROOM_BLOCK, BlockBehaviour.Properties.ofFullCopy(Blocks.BROWN_MUSHROOM_BLOCK)));
    public static final DeferredBlock<Block> SHADE_MUSHROOM_VINE_BLOCK = registerBlock("shade_mushroom_vine_block", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.VINE)));

    public static final DeferredBlock<Block> CAP_MUSHROOM_BLOCK = registerBlock("cap_mushroom_block", () -> new ModFlowerBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BROWN_MUSHROOM_BLOCK)));
    public static final DeferredBlock<FlowerPotBlock> POTTED_CAP_MUSHROOM_BLOCK = registerBlock("potted_cap_mushroom_block", () -> new FlowerPotBlock((() -> (FlowerPotBlock) Blocks.FLOWER_POT), CAP_MUSHROOM_BLOCK, BlockBehaviour.Properties.ofFullCopy(Blocks.POTTED_DANDELION)));
    public static final DeferredBlock<Block> CAP_MUSHROOM_VINE_BLOCK = registerBlock("cap_mushroom_vine_block", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.VINE)));

    /*
     FLOWERS
     */
    //Black
//    public static final DeferredBlock<Block> _FLOWER = registerBlock("_flower", () -> new ModFlowerBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DANDELION)));
//    public static final DeferredBlock<FlowerPotBlock> POTTED__FLOWER = BLOCKS.register("potted__flower", () -> new FlowerPotBlock((() -> (FlowerPotBlock) Blocks.FLOWER_POT), _FLOWER, BlockBehaviour.Properties.ofFullCopy(Blocks.POTTED_DANDELION)));
    public static final DeferredBlock<Block> DARK_BLOOM_FLOWER = registerBlock("dark_bloom_flower", () -> new ModFlowerBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DANDELION)));
    public static final DeferredBlock<FlowerPotBlock> POTTED_DARK_BLOOM_FLOWER = ALFHEIMR_BLOCKS.register("potted_dark_bloom_flower", () -> new FlowerPotBlock((() -> (FlowerPotBlock) Blocks.FLOWER_POT), DARK_BLOOM_FLOWER, BlockBehaviour.Properties.ofFullCopy(Blocks.POTTED_DANDELION)));
    public static final DeferredBlock<Block> DREAD_NIGHT_FLOWER = registerBlock("dread_night_flower", () -> new ModFlowerBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DANDELION)));
    public static final DeferredBlock<FlowerPotBlock> POTTED_DREAD_NIGIHT_FLOWER = ALFHEIMR_BLOCKS.register("potted_dread_night_flower", () -> new FlowerPotBlock((() -> (FlowerPotBlock) Blocks.FLOWER_POT), DREAD_NIGHT_FLOWER, BlockBehaviour.Properties.ofFullCopy(Blocks.POTTED_DANDELION)));
    public static final DeferredBlock<Block> BLACK_LOTUS_FLOWER = registerBlock("black_lotus_flower", () -> new ModFlowerBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DANDELION)));
    public static final DeferredBlock<FlowerPotBlock> POTTED_BLACK_LOTUS_FLOWER = ALFHEIMR_BLOCKS.register("potted_black_lotus_flower", () -> new FlowerPotBlock((() -> (FlowerPotBlock) Blocks.FLOWER_POT), BLACK_LOTUS_FLOWER, BlockBehaviour.Properties.ofFullCopy(Blocks.POTTED_DANDELION)));
    public static final DeferredBlock<Block> NIGHT_ROSE_FLOWER = registerBlock("night_rose_flower", () -> new ModFlowerBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DANDELION)));
    public static final DeferredBlock<FlowerPotBlock> POTTED_NIGHT_ROSE_FLOWER = ALFHEIMR_BLOCKS.register("potted_night_rose_flower", () -> new FlowerPotBlock((() -> (FlowerPotBlock) Blocks.FLOWER_POT), NIGHT_ROSE_FLOWER, BlockBehaviour.Properties.ofFullCopy(Blocks.POTTED_DANDELION)));

    //Blue
//    public static final DeferredBlock<Block> _FLOWER = registerBlock("_flower", () -> new ModFlowerBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DANDELION)));
//    public static final DeferredBlock<FlowerPotBlock> POTTED__FLOWER = BLOCKS.register("potted__flower", () -> new FlowerPotBlock((() -> (FlowerPotBlock) Blocks.FLOWER_POT), _FLOWER, BlockBehaviour.Properties.ofFullCopy(Blocks.POTTED_DANDELION)));
    public static final DeferredBlock<Block> AQUA_ROSE_FLOWER = registerBlock("aqua_rose_flower", () -> new ModFlowerBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DANDELION)));
    public static final DeferredBlock<FlowerPotBlock> POTTED_AQUA_ROSE_FLOWER = ALFHEIMR_BLOCKS.register("potted_aqua_rose_flower", () -> new FlowerPotBlock((() -> (FlowerPotBlock) Blocks.FLOWER_POT), AQUA_ROSE_FLOWER, BlockBehaviour.Properties.ofFullCopy(Blocks.POTTED_DANDELION)));
    public static final DeferredBlock<Block> MOON_FLOWER = registerBlock("moon_flower", () -> new ModFlowerBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DANDELION)));
    public static final DeferredBlock<FlowerPotBlock> POTTED_MOON_FLOWER = ALFHEIMR_BLOCKS.register("potted_moon_flower", () -> new FlowerPotBlock((() -> (FlowerPotBlock) Blocks.FLOWER_POT), MOON_FLOWER, BlockBehaviour.Properties.ofFullCopy(Blocks.POTTED_DANDELION)));
    public static final DeferredBlock<Block> CATHERINE_FLOWER = registerBlock("catherine_flower", () -> new ModFlowerBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DANDELION)));
    public static final DeferredBlock<FlowerPotBlock> POTTED_CATHERINE_FLOWER = ALFHEIMR_BLOCKS.register("potted_catherine_flower", () -> new FlowerPotBlock((() -> (FlowerPotBlock) Blocks.FLOWER_POT), CATHERINE_FLOWER, BlockBehaviour.Properties.ofFullCopy(Blocks.POTTED_DANDELION)));
    public static final DeferredBlock<Block> TAINTED_ROSE_FLOWER = registerBlock("tainted_rose_flower", () -> new ModFlowerBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DANDELION)));
    public static final DeferredBlock<FlowerPotBlock> POTTED_TAINTED_ROSE_FLOWER = ALFHEIMR_BLOCKS.register("potted_tainted_rose_flower", () -> new FlowerPotBlock((() -> (FlowerPotBlock) Blocks.FLOWER_POT), TAINTED_ROSE_FLOWER, BlockBehaviour.Properties.ofFullCopy(Blocks.POTTED_DANDELION)));

    //Brown
//    public static final DeferredBlock<Block> _FLOWER = registerBlock("_flower", () -> new ModFlowerBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DANDELION)));
//    public static final DeferredBlock<FlowerPotBlock> POTTED__FLOWER = BLOCKS.register("potted__flower", () -> new FlowerPotBlock((() -> (FlowerPotBlock) Blocks.FLOWER_POT), _FLOWER, BlockBehaviour.Properties.ofFullCopy(Blocks.POTTED_DANDELION)));
    public static final DeferredBlock<Block> CINNAMON_ROSE_FLOWER = registerBlock("cinnamon_rose_flower", () -> new ModFlowerBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DANDELION)));
    public static final DeferredBlock<FlowerPotBlock> POTTED_CINNAMON_ROSE_FLOWER = ALFHEIMR_BLOCKS.register("potted_cinnamon_rose_flower", () -> new FlowerPotBlock((() -> (FlowerPotBlock) Blocks.FLOWER_POT), CINNAMON_ROSE_FLOWER, BlockBehaviour.Properties.ofFullCopy(Blocks.POTTED_DANDELION)));
    public static final DeferredBlock<Block> BUTTERFLY_FLOWER = registerBlock("butterfly_flower", () -> new ModFlowerBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DANDELION)));
    public static final DeferredBlock<FlowerPotBlock> POTTED_BUTTERFLY_FLOWER = ALFHEIMR_BLOCKS.register("potted_butterfly_flower", () -> new FlowerPotBlock((() -> (FlowerPotBlock) Blocks.FLOWER_POT), BUTTERFLY_FLOWER, BlockBehaviour.Properties.ofFullCopy(Blocks.POTTED_DANDELION)));
    public static final DeferredBlock<Block> GAIA_TULIP_FLOWER = registerBlock("gaia_tulip_flower", () -> new ModFlowerBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DANDELION)));
    public static final DeferredBlock<FlowerPotBlock> POTTED_GAIA_TULIP_FLOWER = ALFHEIMR_BLOCKS.register("potted_gaia_tulip_flower", () -> new FlowerPotBlock((() -> (FlowerPotBlock) Blocks.FLOWER_POT), GAIA_TULIP_FLOWER, BlockBehaviour.Properties.ofFullCopy(Blocks.POTTED_DANDELION)));
    public static final DeferredBlock<Block> BEARDED_IRIS_FLOWER = registerBlock("bearded_iris_flower", () -> new ModFlowerBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DANDELION)));
    public static final DeferredBlock<FlowerPotBlock> POTTED_BEARDED_IRIS_FLOWER = ALFHEIMR_BLOCKS.register("potted_bearded_iris_flower", () -> new FlowerPotBlock((() -> (FlowerPotBlock) Blocks.FLOWER_POT), BEARDED_IRIS_FLOWER, BlockBehaviour.Properties.ofFullCopy(Blocks.POTTED_DANDELION)));

    //Cyan
//    public static final DeferredBlock<Block> _FLOWER = registerBlock("_flower", () -> new ModFlowerBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DANDELION)));
//    public static final DeferredBlock<FlowerPotBlock> POTTED__FLOWER = BLOCKS.register("potted__flower", () -> new FlowerPotBlock((() -> (FlowerPotBlock) Blocks.FLOWER_POT), _FLOWER, BlockBehaviour.Properties.ofFullCopy(Blocks.POTTED_DANDELION)));
    public static final DeferredBlock<Block> CORNFLOWER_FLOWER = registerBlock("cornflower_flower", () -> new ModFlowerBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DANDELION)));
    public static final DeferredBlock<FlowerPotBlock> POTTED_CORNFLOWER_FLOWER = ALFHEIMR_BLOCKS.register("potted_cornflower_flower", () -> new FlowerPotBlock((() -> (FlowerPotBlock) Blocks.FLOWER_POT), CORNFLOWER_FLOWER, BlockBehaviour.Properties.ofFullCopy(Blocks.POTTED_DANDELION)));
    public static final DeferredBlock<Block> MORNING_GLORY_FLOWER = registerBlock("morning_glory_flower", () -> new ModFlowerBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DANDELION)));
    public static final DeferredBlock<FlowerPotBlock> POTTED_MORNING_GLORY_FLOWER = ALFHEIMR_BLOCKS.register("potted_morning_glory_flower", () -> new FlowerPotBlock((() -> (FlowerPotBlock) Blocks.FLOWER_POT), MORNING_GLORY_FLOWER, BlockBehaviour.Properties.ofFullCopy(Blocks.POTTED_DANDELION)));
    public static final DeferredBlock<Block> GEORGIA_BLUE_FLOWER = registerBlock("georgia_blue_flower", () -> new ModFlowerBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DANDELION)));
    public static final DeferredBlock<FlowerPotBlock> POTTED_GEORGIA_BLUE_FLOWER = ALFHEIMR_BLOCKS.register("potted_georgia_blue_flower", () -> new FlowerPotBlock((() -> (FlowerPotBlock) Blocks.FLOWER_POT), GEORGIA_BLUE_FLOWER, BlockBehaviour.Properties.ofFullCopy(Blocks.POTTED_DANDELION)));
    public static final DeferredBlock<Block> BLUE_POPPY_FLOWER = registerBlock("blue_poppy_flower", () -> new ModFlowerBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DANDELION)));
    public static final DeferredBlock<FlowerPotBlock> POTTED_BLUE_POPPY_FLOWER = ALFHEIMR_BLOCKS.register("potted_blue_poppy_flower", () -> new FlowerPotBlock((() -> (FlowerPotBlock) Blocks.FLOWER_POT), BLUE_POPPY_FLOWER, BlockBehaviour.Properties.ofFullCopy(Blocks.POTTED_DANDELION)));

    //Green
//    public static final DeferredBlock<Block> _FLOWER = registerBlock("_flower", () -> new ModFlowerBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DANDELION)));
//    public static final DeferredBlock<FlowerPotBlock> POTTED__FLOWER = BLOCKS.register("potted__flower", () -> new FlowerPotBlock((() -> (FlowerPotBlock) Blocks.FLOWER_POT), _FLOWER, BlockBehaviour.Properties.ofFullCopy(Blocks.POTTED_DANDELION)));
    public static final DeferredBlock<Block> TULIP_FLOWER = registerBlock("tulip_flower", () -> new ModFlowerBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DANDELION)));
    public static final DeferredBlock<FlowerPotBlock> POTTED_TULIP_FLOWER = ALFHEIMR_BLOCKS.register("potted_tulip_flower", () -> new FlowerPotBlock((() -> (FlowerPotBlock) Blocks.FLOWER_POT), TULIP_FLOWER, BlockBehaviour.Properties.ofFullCopy(Blocks.POTTED_DANDELION)));
    public static final DeferredBlock<Block> CARNATION_FLOWER = registerBlock("carnation_flower", () -> new ModFlowerBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DANDELION)));
    public static final DeferredBlock<FlowerPotBlock> POTTED_CARNATION_FLOWER = ALFHEIMR_BLOCKS.register("potted_carnation_flower", () -> new FlowerPotBlock((() -> (FlowerPotBlock) Blocks.FLOWER_POT), CARNATION_FLOWER, BlockBehaviour.Properties.ofFullCopy(Blocks.POTTED_DANDELION)));
    public static final DeferredBlock<Block> LADYS_MANTLE_FLOWER = registerBlock("ladys_mantle_flower", () -> new ModFlowerBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DANDELION)));
    public static final DeferredBlock<FlowerPotBlock> POTTED_LADYS_MANTLE_FLOWER = ALFHEIMR_BLOCKS.register("potted_ladys_mantle_flower", () -> new FlowerPotBlock((() -> (FlowerPotBlock) Blocks.FLOWER_POT), LADYS_MANTLE_FLOWER, BlockBehaviour.Properties.ofFullCopy(Blocks.POTTED_DANDELION)));
    public static final DeferredBlock<Block> GREEN_ROSE_FLOWER = registerBlock("green_rose_flower", () -> new ModFlowerBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DANDELION)));
    public static final DeferredBlock<FlowerPotBlock> POTTED_GREEN_ROSE_FLOWER = ALFHEIMR_BLOCKS.register("potted_green_rose_flower", () -> new FlowerPotBlock((() -> (FlowerPotBlock) Blocks.FLOWER_POT), GREEN_ROSE_FLOWER, BlockBehaviour.Properties.ofFullCopy(Blocks.POTTED_DANDELION)));

    //Light Blue
//    public static final DeferredBlock<Block> _FLOWER = registerBlock("_flower", () -> new ModFlowerBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DANDELION)));
//    public static final DeferredBlock<FlowerPotBlock> POTTED__FLOWER = BLOCKS.register("potted__flower", () -> new FlowerPotBlock((() -> (FlowerPotBlock) Blocks.FLOWER_POT), _FLOWER, BlockBehaviour.Properties.ofFullCopy(Blocks.POTTED_DANDELION)));
    public static final DeferredBlock<Block> CLEMATIS_FLOWER = registerBlock("clematis_flower", () -> new ModFlowerBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DANDELION)));
    public static final DeferredBlock<FlowerPotBlock> POTTED_CLEMATIS_FLOWER = ALFHEIMR_BLOCKS.register("potted_clematis_flower", () -> new FlowerPotBlock((() -> (FlowerPotBlock) Blocks.FLOWER_POT), CLEMATIS_FLOWER, BlockBehaviour.Properties.ofFullCopy(Blocks.POTTED_DANDELION)));
    public static final DeferredBlock<Block> BLUE_STAR_FLOWER = registerBlock("blue_star_flower", () -> new ModFlowerBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DANDELION)));
    public static final DeferredBlock<FlowerPotBlock> POTTED_BLUE_STAR_FLOWER = ALFHEIMR_BLOCKS.register("potted_blue_star_flower", () -> new FlowerPotBlock((() -> (FlowerPotBlock) Blocks.FLOWER_POT), BLUE_STAR_FLOWER, BlockBehaviour.Properties.ofFullCopy(Blocks.POTTED_DANDELION)));
    public static final DeferredBlock<Block> SALVIA_FLOWER = registerBlock("salvia_flower", () -> new ModFlowerBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DANDELION)));
    public static final DeferredBlock<FlowerPotBlock> POTTED_SALVIA_FLOWER = ALFHEIMR_BLOCKS.register("potted_salvia_flower", () -> new FlowerPotBlock((() -> (FlowerPotBlock) Blocks.FLOWER_POT), SALVIA_FLOWER, BlockBehaviour.Properties.ofFullCopy(Blocks.POTTED_DANDELION)));
    public static final DeferredBlock<Block> FALSE_INDIGO_FLOWER = registerBlock("false_indigo_flower", () -> new ModFlowerBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DANDELION)));
    public static final DeferredBlock<FlowerPotBlock> POTTED_FALSE_INDIGO_FLOWER = ALFHEIMR_BLOCKS.register("potted_false_indigo_flower", () -> new FlowerPotBlock((() -> (FlowerPotBlock) Blocks.FLOWER_POT), FALSE_INDIGO_FLOWER, BlockBehaviour.Properties.ofFullCopy(Blocks.POTTED_DANDELION)));

    //Light Gray
//    public static final DeferredBlock<Block> _FLOWER = registerBlock("_flower", () -> new ModFlowerBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DANDELION)));
//    public static final DeferredBlock<FlowerPotBlock> POTTED__FLOWER = BLOCKS.register("potted__flower", () -> new FlowerPotBlock((() -> (FlowerPotBlock) Blocks.FLOWER_POT), _FLOWER, BlockBehaviour.Properties.ofFullCopy(Blocks.POTTED_DANDELION)));
    public static final DeferredBlock<Block> WHITE_SAGE_FLOWER = registerBlock("white_sage_flower", () -> new ModFlowerBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DANDELION)));
    public static final DeferredBlock<FlowerPotBlock> POTTED_WHITE_SAGE_FLOWER = ALFHEIMR_BLOCKS.register("potted_white_sage_flower", () -> new FlowerPotBlock((() -> (FlowerPotBlock) Blocks.FLOWER_POT), WHITE_SAGE_FLOWER, BlockBehaviour.Properties.ofFullCopy(Blocks.POTTED_DANDELION)));
    public static final DeferredBlock<Block> SILVER_SCHEHERAZADE_FLOWER = registerBlock("silver_scheherazade_flower", () -> new ModFlowerBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DANDELION)));
    public static final DeferredBlock<FlowerPotBlock> POTTED_SILVER_SCHEHERAZADE_FLOWER = ALFHEIMR_BLOCKS.register("potted_silver_scheherazade_flower", () -> new FlowerPotBlock((() -> (FlowerPotBlock) Blocks.FLOWER_POT), SILVER_SCHEHERAZADE_FLOWER, BlockBehaviour.Properties.ofFullCopy(Blocks.POTTED_DANDELION)));
    public static final DeferredBlock<Block> SILVER_SPRING_FLOWER = registerBlock("silver_spring_flower", () -> new ModFlowerBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DANDELION)));
    public static final DeferredBlock<FlowerPotBlock> POTTED_SILVER_SPRING_FLOWER = ALFHEIMR_BLOCKS.register("potted_silver_spring_flower", () -> new FlowerPotBlock((() -> (FlowerPotBlock) Blocks.FLOWER_POT), SILVER_SPRING_FLOWER, BlockBehaviour.Properties.ofFullCopy(Blocks.POTTED_DANDELION)));
    public static final DeferredBlock<Block> SILVER_SHADOWS_FLOWER = registerBlock("silver_shadows_flower", () -> new ModFlowerBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DANDELION)));
    public static final DeferredBlock<FlowerPotBlock> POTTED_SILVER_SHADOWS_FLOWER = ALFHEIMR_BLOCKS.register("potted_silver_shadows_flower", () -> new FlowerPotBlock((() -> (FlowerPotBlock) Blocks.FLOWER_POT), SILVER_SHADOWS_FLOWER, BlockBehaviour.Properties.ofFullCopy(Blocks.POTTED_DANDELION)));

    //Lime
//    public static final DeferredBlock<Block> _FLOWER = registerBlock("_flower", () -> new ModFlowerBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DANDELION)));
//    public static final DeferredBlock<FlowerPotBlock> POTTED__FLOWER = BLOCKS.register("potted__flower", () -> new FlowerPotBlock((() -> (FlowerPotBlock) Blocks.FLOWER_POT), _FLOWER, BlockBehaviour.Properties.ofFullCopy(Blocks.POTTED_DANDELION)));
    public static final DeferredBlock<Block> GREEN_BALL_FLOWER = registerBlock("green_ball_flower", () -> new ModFlowerBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DANDELION)));
    public static final DeferredBlock<FlowerPotBlock> POTTED_GREEN_BALL_FLOWER = ALFHEIMR_BLOCKS.register("potted_green_ball_flower", () -> new FlowerPotBlock((() -> (FlowerPotBlock) Blocks.FLOWER_POT), GREEN_BALL_FLOWER, BlockBehaviour.Properties.ofFullCopy(Blocks.POTTED_DANDELION)));
    public static final DeferredBlock<Block> LIME_DAHLIA_FLOWER = registerBlock("lime_dahlia_flower", () -> new ModFlowerBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DANDELION)));
    public static final DeferredBlock<FlowerPotBlock> POTTED_LIME_DAHLIA_FLOWER = ALFHEIMR_BLOCKS.register("potted_lime_dahlia_flower", () -> new FlowerPotBlock((() -> (FlowerPotBlock) Blocks.FLOWER_POT), LIME_DAHLIA_FLOWER, BlockBehaviour.Properties.ofFullCopy(Blocks.POTTED_DANDELION)));
    public static final DeferredBlock<Block> HYDRANGEA_FLOWER = registerBlock("hydrangea_flower", () -> new ModFlowerBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DANDELION)));
    public static final DeferredBlock<FlowerPotBlock> POTTED_HYDRANGEA_FLOWER = ALFHEIMR_BLOCKS.register("potted_hydrangea_flower", () -> new FlowerPotBlock((() -> (FlowerPotBlock) Blocks.FLOWER_POT), HYDRANGEA_FLOWER, BlockBehaviour.Properties.ofFullCopy(Blocks.POTTED_DANDELION)));
    public static final DeferredBlock<Block> ZINNIA_FLOWER = registerBlock("zinnia_flower", () -> new ModFlowerBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DANDELION)));
    public static final DeferredBlock<FlowerPotBlock> POTTED_ZINNIA_FLOWER = ALFHEIMR_BLOCKS.register("potted_zinnia_flower", () -> new FlowerPotBlock((() -> (FlowerPotBlock) Blocks.FLOWER_POT), ZINNIA_FLOWER, BlockBehaviour.Properties.ofFullCopy(Blocks.POTTED_DANDELION)));

    //Magenta
//    public static final DeferredBlock<Block> _FLOWER = registerBlock("_flower", () -> new ModFlowerBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DANDELION)));
//    public static final DeferredBlock<FlowerPotBlock> POTTED__FLOWER = BLOCKS.register("potted__flower", () -> new FlowerPotBlock((() -> (FlowerPotBlock) Blocks.FLOWER_POT), _FLOWER, BlockBehaviour.Properties.ofFullCopy(Blocks.POTTED_DANDELION)));
    public static final DeferredBlock<Block> BUTTERFLY_CANDY_FLOWER = registerBlock("butterfly_candy_flower", () -> new ModFlowerBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DANDELION)));
    public static final DeferredBlock<FlowerPotBlock> POTTED_BUTTERFLY_CANDY_FLOWER = ALFHEIMR_BLOCKS.register("potted_butterfly_candy_flower", () -> new FlowerPotBlock((() -> (FlowerPotBlock) Blocks.FLOWER_POT), BUTTERFLY_CANDY_FLOWER, BlockBehaviour.Properties.ofFullCopy(Blocks.POTTED_DANDELION)));
    public static final DeferredBlock<Block> CABARET_FLOWER = registerBlock("cabaret_flower", () -> new ModFlowerBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DANDELION)));
    public static final DeferredBlock<FlowerPotBlock> POTTED_CABARET_FLOWER = ALFHEIMR_BLOCKS.register("potted_cabaret_flower", () -> new FlowerPotBlock((() -> (FlowerPotBlock) Blocks.FLOWER_POT), CABARET_FLOWER, BlockBehaviour.Properties.ofFullCopy(Blocks.POTTED_DANDELION)));
    public static final DeferredBlock<Block> DIANTHUS_FLOWER = registerBlock("dianthus_flower", () -> new ModFlowerBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DANDELION)));
    public static final DeferredBlock<FlowerPotBlock> POTTED_DIANTHUS_FLOWER = ALFHEIMR_BLOCKS.register("potted_dianthus_flower", () -> new FlowerPotBlock((() -> (FlowerPotBlock) Blocks.FLOWER_POT), DIANTHUS_FLOWER, BlockBehaviour.Properties.ofFullCopy(Blocks.POTTED_DANDELION)));
    public static final DeferredBlock<Block> TITAN_CRANBERRY_VINCA_FLOWER = registerBlock("titan_cranberry_vinca_flower", () -> new ModFlowerBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DANDELION)));
    public static final DeferredBlock<FlowerPotBlock> POTTED_TITAN_CRANBERRY_VINCA_FLOWER = ALFHEIMR_BLOCKS.register("potted_titan_cranberry_vinca_flower", () -> new FlowerPotBlock((() -> (FlowerPotBlock) Blocks.FLOWER_POT), TITAN_CRANBERRY_VINCA_FLOWER, BlockBehaviour.Properties.ofFullCopy(Blocks.POTTED_DANDELION)));

    //Orange
//    public static final DeferredBlock<Block> _FLOWER = registerBlock("_flower", () -> new ModFlowerBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DANDELION)));
//    public static final DeferredBlock<FlowerPotBlock> POTTED__FLOWER = BLOCKS.register("potted__flower", () -> new FlowerPotBlock((() -> (FlowerPotBlock) Blocks.FLOWER_POT), _FLOWER, BlockBehaviour.Properties.ofFullCopy(Blocks.POTTED_DANDELION)));
    public static final DeferredBlock<Block> ORANGE_ZINNIA_FLOWER = registerBlock("orange_zinnia_flower", () -> new ModFlowerBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DANDELION)));
    public static final DeferredBlock<FlowerPotBlock> POTTED_ORANGE_ZINNIA_FLOWER = ALFHEIMR_BLOCKS.register("potted_orange_zinnia_flower", () -> new FlowerPotBlock((() -> (FlowerPotBlock) Blocks.FLOWER_POT), ORANGE_ZINNIA_FLOWER, BlockBehaviour.Properties.ofFullCopy(Blocks.POTTED_DANDELION)));
    public static final DeferredBlock<Block> BEGONIA_FLOWER = registerBlock("begonia_flower", () -> new ModFlowerBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DANDELION)));
    public static final DeferredBlock<FlowerPotBlock> POTTED_BEGONIA_FLOWER = ALFHEIMR_BLOCKS.register("potted_begonia_flower", () -> new FlowerPotBlock((() -> (FlowerPotBlock) Blocks.FLOWER_POT), BEGONIA_FLOWER, BlockBehaviour.Properties.ofFullCopy(Blocks.POTTED_DANDELION)));
    public static final DeferredBlock<Block> CROWN_IMPERIAL_FLOWER = registerBlock("crown_imperial_flower", () -> new ModFlowerBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DANDELION)));
    public static final DeferredBlock<FlowerPotBlock> POTTED_CROWN_IMPERIAL_FLOWER = ALFHEIMR_BLOCKS.register("potted_crown_imperial_flower", () -> new FlowerPotBlock((() -> (FlowerPotBlock) Blocks.FLOWER_POT), CROWN_IMPERIAL_FLOWER, BlockBehaviour.Properties.ofFullCopy(Blocks.POTTED_DANDELION)));
    public static final DeferredBlock<Block> ORIENTAL_POPPY_FLOWER = registerBlock("oriental_poppy_flower", () -> new ModFlowerBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DANDELION)));
    public static final DeferredBlock<FlowerPotBlock> POTTED_ORIENTAL_POPPY_FLOWER = ALFHEIMR_BLOCKS.register("potted_oriental_poppy_flower", () -> new FlowerPotBlock((() -> (FlowerPotBlock) Blocks.FLOWER_POT), ORIENTAL_POPPY_FLOWER, BlockBehaviour.Properties.ofFullCopy(Blocks.POTTED_DANDELION)));

    //Pink
//    public static final DeferredBlock<Block> _FLOWER = registerBlock("_flower", () -> new ModFlowerBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DANDELION)));
//    public static final DeferredBlock<FlowerPotBlock> POTTED__FLOWER = BLOCKS.register("potted__flower", () -> new FlowerPotBlock((() -> (FlowerPotBlock) Blocks.FLOWER_POT), _FLOWER, BlockBehaviour.Properties.ofFullCopy(Blocks.POTTED_DANDELION)));
    public static final DeferredBlock<Block> AZALEA_FLOWER = registerBlock("azalea_flower", () -> new ModFlowerBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DANDELION)));
    public static final DeferredBlock<FlowerPotBlock> POTTED_AZALEA_FLOWER = ALFHEIMR_BLOCKS.register("potted_azalea_flower", () -> new FlowerPotBlock((() -> (FlowerPotBlock) Blocks.FLOWER_POT), AZALEA_FLOWER, BlockBehaviour.Properties.ofFullCopy(Blocks.POTTED_DANDELION)));
    public static final DeferredBlock<Block> PINK_DELIGHT_FLOWER = registerBlock("pink_delight_flower", () -> new ModFlowerBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DANDELION)));
    public static final DeferredBlock<FlowerPotBlock> POTTED_PINK_DELIGHT_FLOWER = ALFHEIMR_BLOCKS.register("potted_pink_delight_flower", () -> new FlowerPotBlock((() -> (FlowerPotBlock) Blocks.FLOWER_POT), PINK_DELIGHT_FLOWER, BlockBehaviour.Properties.ofFullCopy(Blocks.POTTED_DANDELION)));
    public static final DeferredBlock<Block> CHRYSANTHEMUM_FLOWER = registerBlock("chrysanthemum_flower", () -> new ModFlowerBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DANDELION)));
    public static final DeferredBlock<FlowerPotBlock> POTTED_CHRYSANTHEMUM_FLOWER = ALFHEIMR_BLOCKS.register("potted_chrysanthemum_flower", () -> new FlowerPotBlock((() -> (FlowerPotBlock) Blocks.FLOWER_POT), CHRYSANTHEMUM_FLOWER, BlockBehaviour.Properties.ofFullCopy(Blocks.POTTED_DANDELION)));
    public static final DeferredBlock<Block> HIBISCUS_FLOWER = registerBlock("hibiscus_flower", () -> new ModFlowerBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DANDELION)));
    public static final DeferredBlock<FlowerPotBlock> POTTED_HIBISCUS_FLOWER = ALFHEIMR_BLOCKS.register("potted_hibiscus_flower", () -> new FlowerPotBlock((() -> (FlowerPotBlock) Blocks.FLOWER_POT), HIBISCUS_FLOWER, BlockBehaviour.Properties.ofFullCopy(Blocks.POTTED_DANDELION)));

    //Red
//    public static final DeferredBlock<Block> _FLOWER = registerBlock("_flower", () -> new ModFlowerBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DANDELION)));
//    public static final DeferredBlock<FlowerPotBlock> POTTED__FLOWER = BLOCKS.register("potted__flower", () -> new FlowerPotBlock((() -> (FlowerPotBlock) Blocks.FLOWER_POT), _FLOWER, BlockBehaviour.Properties.ofFullCopy(Blocks.POTTED_DANDELION)));
    public static final DeferredBlock<Block> CARDINAL_FLOWER = registerBlock("cardinal_flower_flower", () -> new ModFlowerBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DANDELION)));
    public static final DeferredBlock<FlowerPotBlock> POTTED_CARDINAL_FLOWER = ALFHEIMR_BLOCKS.register("potted_cardinal_flower_flower", () -> new FlowerPotBlock((() -> (FlowerPotBlock) Blocks.FLOWER_POT), CARDINAL_FLOWER, BlockBehaviour.Properties.ofFullCopy(Blocks.POTTED_DANDELION)));
    public static final DeferredBlock<Block> GERBERA_FLOWER = registerBlock("gerbera_flower", () -> new ModFlowerBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DANDELION)));
    public static final DeferredBlock<FlowerPotBlock> POTTED_GERBERA_FLOWER = ALFHEIMR_BLOCKS.register("potted_gerbera_flower", () -> new FlowerPotBlock((() -> (FlowerPotBlock) Blocks.FLOWER_POT), GERBERA_FLOWER, BlockBehaviour.Properties.ofFullCopy(Blocks.POTTED_DANDELION)));
    public static final DeferredBlock<Block> RED_TULIP_FLOWER = registerBlock("red_tulip_flower", () -> new ModFlowerBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DANDELION)));
    public static final DeferredBlock<FlowerPotBlock> POTTED_RED_TULIP_FLOWER = ALFHEIMR_BLOCKS.register("potted_red_tulip_flower", () -> new FlowerPotBlock((() -> (FlowerPotBlock) Blocks.FLOWER_POT), RED_TULIP_FLOWER, BlockBehaviour.Properties.ofFullCopy(Blocks.POTTED_DANDELION)));
    public static final DeferredBlock<Block> FREESIA_FLOWER = registerBlock("freesia_flower", () -> new ModFlowerBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DANDELION)));
    public static final DeferredBlock<FlowerPotBlock> POTTED_FREESIA_FLOWER = ALFHEIMR_BLOCKS.register("potted_freesia_flower", () -> new FlowerPotBlock((() -> (FlowerPotBlock) Blocks.FLOWER_POT), FREESIA_FLOWER, BlockBehaviour.Properties.ofFullCopy(Blocks.POTTED_DANDELION)));

    //White
//    public static final DeferredBlock<Block> _FLOWER = registerBlock("_flower", () -> new ModFlowerBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DANDELION)));
//    public static final DeferredBlock<FlowerPotBlock> POTTED__FLOWER = BLOCKS.register("potted__flower", () -> new FlowerPotBlock((() -> (FlowerPotBlock) Blocks.FLOWER_POT), _FLOWER, BlockBehaviour.Properties.ofFullCopy(Blocks.POTTED_DANDELION)));
    public static final DeferredBlock<Block> GARDENIAS_FLOWER = registerBlock("gardenias_flower", () -> new ModFlowerBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DANDELION)));
    public static final DeferredBlock<FlowerPotBlock> POTTED_GARDENIAS_FLOWER = ALFHEIMR_BLOCKS.register("potted_gardenias_flower", () -> new FlowerPotBlock((() -> (FlowerPotBlock) Blocks.FLOWER_POT), GARDENIAS_FLOWER, BlockBehaviour.Properties.ofFullCopy(Blocks.POTTED_DANDELION)));
    public static final DeferredBlock<Block> STAR_JASMINE_FLOWER = registerBlock("star_jasmine_flower", () -> new ModFlowerBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DANDELION)));
    public static final DeferredBlock<FlowerPotBlock> POTTED_STAR_JASMINE_FLOWER = ALFHEIMR_BLOCKS.register("potted_star_jasmine_flower", () -> new FlowerPotBlock((() -> (FlowerPotBlock) Blocks.FLOWER_POT), STAR_JASMINE_FLOWER, BlockBehaviour.Properties.ofFullCopy(Blocks.POTTED_DANDELION)));
    public static final DeferredBlock<Block> WHITE_WARATAH_FLOWER = registerBlock("white_waratah_flower", () -> new ModFlowerBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DANDELION)));
    public static final DeferredBlock<FlowerPotBlock> POTTED_WHITE_WARATAH_FLOWER = ALFHEIMR_BLOCKS.register("potted_white_waratah_flower", () -> new FlowerPotBlock((() -> (FlowerPotBlock) Blocks.FLOWER_POT), WHITE_WARATAH_FLOWER, BlockBehaviour.Properties.ofFullCopy(Blocks.POTTED_DANDELION)));
    public static final DeferredBlock<Block> FLANNEL_FLOWER = registerBlock("flannel_flower", () -> new ModFlowerBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DANDELION)));
    public static final DeferredBlock<FlowerPotBlock> POTTED_FLANNEL_FLOWER = ALFHEIMR_BLOCKS.register("potted_flannel_flower", () -> new FlowerPotBlock((() -> (FlowerPotBlock) Blocks.FLOWER_POT), FLANNEL_FLOWER, BlockBehaviour.Properties.ofFullCopy(Blocks.POTTED_DANDELION)));

    //Yellow
//    public static final DeferredBlock<Block> _FLOWER = registerBlock("_flower", () -> new ModFlowerBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DANDELION)));
//    public static final DeferredBlock<FlowerPotBlock> POTTED__FLOWER = BLOCKS.register("potted__flower", () -> new FlowerPotBlock((() -> (FlowerPotBlock) Blocks.FLOWER_POT), _FLOWER, BlockBehaviour.Properties.ofFullCopy(Blocks.POTTED_DANDELION)));
    public static final DeferredBlock<Block> BEARS_EARS_FLOWER = registerBlock("bears_ears_flower", () -> new ModFlowerBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DANDELION)));
    public static final DeferredBlock<FlowerPotBlock> POTTED_BEARS_EARS_FLOWER = ALFHEIMR_BLOCKS.register("potted_bears_ears_flower", () -> new FlowerPotBlock((() -> (FlowerPotBlock) Blocks.FLOWER_POT), BEARS_EARS_FLOWER, BlockBehaviour.Properties.ofFullCopy(Blocks.POTTED_DANDELION)));
    public static final DeferredBlock<Block> BIDENS_FLOWER = registerBlock("bidens_flower", () -> new ModFlowerBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DANDELION)));
    public static final DeferredBlock<FlowerPotBlock> POTTED_BIDENS_FLOWER = ALFHEIMR_BLOCKS.register("potted_bidens_flower", () -> new FlowerPotBlock((() -> (FlowerPotBlock) Blocks.FLOWER_POT), BIDENS_FLOWER, BlockBehaviour.Properties.ofFullCopy(Blocks.POTTED_DANDELION)));
    public static final DeferredBlock<Block> BLANKET_FLOWER = registerBlock("blanket_flower", () -> new ModFlowerBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DANDELION)));
    public static final DeferredBlock<FlowerPotBlock> POTTED_BLANKET_FLOWER = ALFHEIMR_BLOCKS.register("potted_blanket_flower", () -> new FlowerPotBlock((() -> (FlowerPotBlock) Blocks.FLOWER_POT), BLANKET_FLOWER, BlockBehaviour.Properties.ofFullCopy(Blocks.POTTED_DANDELION)));
    public static final DeferredBlock<Block> BULBINE_FLOWER = registerBlock("bulbine_flower", () -> new ModFlowerBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DANDELION)));
    public static final DeferredBlock<FlowerPotBlock> POTTED_BULBINE_FLOWER = ALFHEIMR_BLOCKS.register("potted_bulbine_flower", () -> new FlowerPotBlock((() -> (FlowerPotBlock) Blocks.FLOWER_POT), BULBINE_FLOWER, BlockBehaviour.Properties.ofFullCopy(Blocks.POTTED_DANDELION)));

    //Gray
//    public static final DeferredBlock<Block> _FLOWER = registerBlock("_flower", () -> new ModFlowerBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DANDELION)));
//    public static final DeferredBlock<FlowerPotBlock> POTTED__FLOWER = BLOCKS.register("potted__flower", () -> new FlowerPotBlock((() -> (FlowerPotBlock) Blocks.FLOWER_POT), _FLOWER, BlockBehaviour.Properties.ofFullCopy(Blocks.POTTED_DANDELION)));
    public static final DeferredBlock<Block> SILVER_BRUNIA_FLOWER = registerBlock("silver_brunia_flower", () -> new ModFlowerBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DANDELION)));
    public static final DeferredBlock<FlowerPotBlock> POTTED_SILVER_BRUNIA_FLOWER = ALFHEIMR_BLOCKS.register("potted_silver_brunia_flower", () -> new FlowerPotBlock((() -> (FlowerPotBlock) Blocks.FLOWER_POT), SILVER_BRUNIA_FLOWER, BlockBehaviour.Properties.ofFullCopy(Blocks.POTTED_DANDELION)));
    public static final DeferredBlock<Block> GRAY_ROSES_FLOWER = registerBlock("gray_roses_flower", () -> new ModFlowerBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DANDELION)));
    public static final DeferredBlock<FlowerPotBlock> POTTED_GRAY_ROSES_FLOWER = ALFHEIMR_BLOCKS.register("potted_gray_roses_flower", () -> new FlowerPotBlock((() -> (FlowerPotBlock) Blocks.FLOWER_POT), GRAY_ROSES_FLOWER, BlockBehaviour.Properties.ofFullCopy(Blocks.POTTED_DANDELION)));
    public static final DeferredBlock<Block> MOON_CARROT_FLOWER = registerBlock("moon_carrot_flower", () -> new ModFlowerBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DANDELION)));
    public static final DeferredBlock<FlowerPotBlock> POTTED_MOON_CARROT_FLOWER = ALFHEIMR_BLOCKS.register("potted_moon_carrot_flower", () -> new FlowerPotBlock((() -> (FlowerPotBlock) Blocks.FLOWER_POT), MOON_CARROT_FLOWER, BlockBehaviour.Properties.ofFullCopy(Blocks.POTTED_DANDELION)));
    public static final DeferredBlock<Block> SILVER_BABY_FLOWER = registerBlock("silver_baby_flower", () -> new ModFlowerBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DANDELION)));
    public static final DeferredBlock<FlowerPotBlock> POTTED_SILVER_BABY_FLOWER = ALFHEIMR_BLOCKS.register("potted_silver_baby_flower", () -> new FlowerPotBlock((() -> (FlowerPotBlock) Blocks.FLOWER_POT), SILVER_BABY_FLOWER, BlockBehaviour.Properties.ofFullCopy(Blocks.POTTED_DANDELION)));

    //Purple
//    public static final DeferredBlock<Block> _FLOWER = registerBlock("_flower", () -> new ModFlowerBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DANDELION)));
//    public static final DeferredBlock<FlowerPotBlock> POTTED__FLOWER = BLOCKS.register("potted__flower", () -> new FlowerPotBlock((() -> (FlowerPotBlock) Blocks.FLOWER_POT), _FLOWER, BlockBehaviour.Properties.ofFullCopy(Blocks.POTTED_DANDELION)));
    public static final DeferredBlock<Block> LAVENDER_FLOWER = registerBlock("lavender_flower", () -> new ModFlowerBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DANDELION)));
    public static final DeferredBlock<FlowerPotBlock> POTTED_LAVENDER_FLOWER = ALFHEIMR_BLOCKS.register("potted_lavender_flower", () -> new FlowerPotBlock((() -> (FlowerPotBlock) Blocks.FLOWER_POT), LAVENDER_FLOWER, BlockBehaviour.Properties.ofFullCopy(Blocks.POTTED_DANDELION)));
    public static final DeferredBlock<Block> BELLFLOWER_FLOWER = registerBlock("bellflower_flower", () -> new ModFlowerBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DANDELION)));
    public static final DeferredBlock<FlowerPotBlock> POTTED_BELLFLOWER_FLOWER = ALFHEIMR_BLOCKS.register("potted_bellflower_flower", () -> new FlowerPotBlock((() -> (FlowerPotBlock) Blocks.FLOWER_POT), BELLFLOWER_FLOWER, BlockBehaviour.Properties.ofFullCopy(Blocks.POTTED_DANDELION)));
    public static final DeferredBlock<Block> LILAC_FLOWER = registerBlock("lilac_flower", () -> new ModFlowerBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DANDELION)));
    public static final DeferredBlock<FlowerPotBlock> POTTED_LILAC_FLOWER = ALFHEIMR_BLOCKS.register("potted_lilac_flower", () -> new FlowerPotBlock((() -> (FlowerPotBlock) Blocks.FLOWER_POT), LILAC_FLOWER, BlockBehaviour.Properties.ofFullCopy(Blocks.POTTED_DANDELION)));
    public static final DeferredBlock<Block> SWEET_PEA_FLOWER = registerBlock("sweet_pea_flower", () -> new ModFlowerBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DANDELION)));
    public static final DeferredBlock<FlowerPotBlock> POTTED_SWEET_PEA_FLOWER = ALFHEIMR_BLOCKS.register("potted_sweet_pea_flower", () -> new FlowerPotBlock((() -> (FlowerPotBlock) Blocks.FLOWER_POT), SWEET_PEA_FLOWER, BlockBehaviour.Properties.ofFullCopy(Blocks.POTTED_DANDELION)));

    /*
    CROPS
     */
    public static final DeferredBlock<CropBlock> DURUM_WHEAT_CROP_BLOCK = ALFHEIMR_BLOCKS.register("durum_wheat_crop_block", () -> new DurumWheatCropBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.WHEAT).noCollission().noOcclusion()));
    public static final DeferredBlock<CropBlock> TOMATO_CROP_BLOCK = ALFHEIMR_BLOCKS.register("tomato_crop_block", () -> new TomatoCropBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.WHEAT).noCollission().noOcclusion()));
    public static final DeferredBlock<CropBlock> WILD_ONION_CROP_BLOCK = ALFHEIMR_BLOCKS.register("wild_onion_crop_block", () -> new OnionCropBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.WHEAT).noCollission().noOcclusion(), 0));
    public static final DeferredBlock<CropBlock> STAGE_1_ONION_CROP_BLOCK = ALFHEIMR_BLOCKS.register("stage_1_onion_crop_block", () -> new OnionCropBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.WHEAT).noCollission().noOcclusion(), 1));
    public static final DeferredBlock<CropBlock> STAGE_2_ONION_CROP_BLOCK = ALFHEIMR_BLOCKS.register("stage_2_onion_crop_block", () -> new OnionCropBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.WHEAT).noCollission().noOcclusion(), 2));
    public static final DeferredBlock<CropBlock> STAGE_3_ONION_CROP_BLOCK = ALFHEIMR_BLOCKS.register("stage_3_onion_crop_block", () -> new OnionCropBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.WHEAT).noCollission().noOcclusion(), 3));
    public static final DeferredBlock<CropBlock> ONION_CROP_BLOCK = ALFHEIMR_BLOCKS.register("onion_crop_block", () -> new OnionCropBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.WHEAT).noCollission().noOcclusion(), 4));
    public static final DeferredBlock<CropBlock> DRAGON_FRUIT_CROP_BLOCK = ALFHEIMR_BLOCKS.register("dragon_fruit_crop_block", () -> new DragonFruitCropBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.WHEAT).noCollission().noOcclusion()));
    public static final DeferredBlock<CropBlock> CHILLI_CROP_BLOCK = ALFHEIMR_BLOCKS.register("chilli_crop_block", () -> new ChilliCropBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.WHEAT).noCollission().noOcclusion()));

    /*
    FLUIDS
     */
    /*
     * WORLD BLOCKS
     */
    public static final DeferredBlock<Block> ALFHEIMR_MAGIC_GRASS = registerBlock("alfheimr_magic_grass", () -> new AlfheimrGrassBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.TALL_GRASS)));

    /*
    DIMENSIONAL BLOCKS
     */
    public static final DeferredBlock<Block> ALFHEIMR_PORTAL_FRAME = registerBlock("alfheimr_portal_frame", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE)));
    public static final DeferredBlock<Block> ALFHEIMR_PORTAL = registerBlock("alfheimr_portal", AlfheimrPortalBlock::new);

    private static <T extends Block> DeferredBlock<T> registerBlock(String name, Supplier<T> block) {
        DeferredBlock<T> toReturn = ALFHEIMR_BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> DeferredItem<Item> registerBlockItem(String name, DeferredBlock<T> block) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus){
        ALFHEIMR_BLOCKS.register(eventBus);
    }
}
