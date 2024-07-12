package net.sen.lostworlds.registry.blocks;

import net.minecraft.sounds.SoundEvents;
import net.minecraft.util.valueproviders.UniformInt;
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
import net.sen.lostworlds.block.ModBlockSetType;
import net.sen.lostworlds.block.crops.PomegranateCropBlock;
import net.sen.lostworlds.block.custom.ModFlowerBlock;
import net.sen.lostworlds.block.custom.StyxCauldronBlock;
import net.sen.lostworlds.block.portal.UnderworldPortalBlock;
import net.sen.lostworlds.block.wood.*;
import net.sen.lostworlds.fluid.ModFluids;
import net.sen.lostworlds.registry.items.ModItems;
import net.sen.lostworlds.worldgen.tree.*;

import java.util.function.Supplier;

public class UnderworldBlocks {
    public static final DeferredRegister.Blocks UNDERWORLD_BLOCKS = DeferredRegister.createBlocks(LostWorldsApi.MODID);

    /*
    MULTI BLOCK
     */
    /*
    STONE
     */
    //Tartarus Stone
    public static final DeferredBlock<Block> TARTARUS_STONE = registerBlock("tartarus_stone", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE)));
    public static final DeferredBlock<StairBlock> TARTARUS_STONE_STAIRS = registerBlock("tartarus_stone_stairs", () -> new StairBlock(TARTARUS_STONE.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_STAIRS).requiresCorrectToolForDrops()));
    public static final DeferredBlock<SlabBlock> TARTARUS_STONE_SLAB = registerBlock("tartarus_stone_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_SLAB).requiresCorrectToolForDrops()));
    public static final DeferredBlock<PressurePlateBlock> TARTARUS_STONE_PRESSURE_PLATE = registerBlock("tartarus_stone_pressure_plate", () -> new PressurePlateBlock(BlockSetType.STONE, BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_STAIRS).requiresCorrectToolForDrops()));
    public static final DeferredBlock<ButtonBlock> TARTARUS_STONE_BUTTON = registerBlock("tartarus_stone_button", () -> new ButtonBlock(BlockSetType.STONE, 10, BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BUTTON)));
    public static final DeferredBlock<WallBlock> TARTARUS_STONE_WALL = registerBlock("tartarus_stone_wall", () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BRICK_WALL).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> TARTARUS_STONE_SMOOTH_STONE = registerBlock("tartarus_stone_smooth_stone", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BRICK_WALL).requiresCorrectToolForDrops()));

    public static final DeferredBlock<Block> TARTARUS_STONE_COBBLESTONE = registerBlock("tartarus_stone_cobblestone", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE)));
    public static final DeferredBlock<StairBlock> TARTARUS_STONE_COBBLESTONE_STAIRS = registerBlock("tartarus_stone_cobblestone_stairs", () -> new StairBlock(TARTARUS_STONE_COBBLESTONE.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_STAIRS).requiresCorrectToolForDrops()));
    public static final DeferredBlock<SlabBlock> TARTARUS_STONE_COBBLESTONE_SLAB = registerBlock("tartarus_stone_cobblestone_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_SLAB).requiresCorrectToolForDrops()));
    public static final DeferredBlock<WallBlock> TARTARUS_STONE_COBBLESTONE_WALL = registerBlock("tartarus_stone_cobblestone_wall", () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BRICK_WALL).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> TARTARUS_STONE_COBBLESTONE_MOSSY = registerBlock("tartarus_stone_cobblestone_mossy", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BRICK_WALL).requiresCorrectToolForDrops()));

    public static final DeferredBlock<Block> TARTARUS_STONE_BRICKS = registerBlock("tartarus_stone_bricks", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BRICKS).requiresCorrectToolForDrops()));
    public static final DeferredBlock<StairBlock> TARTARUS_STONE_BRICKS_STAIRS = registerBlock("tartarus_stone_bricks_stairs", () -> new StairBlock(TARTARUS_STONE_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_STAIRS).requiresCorrectToolForDrops()));
    public static final DeferredBlock<SlabBlock> TARTARUS_STONE_BRICKS_SLAB = registerBlock("tartarus_stone_bricks_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_SLAB).requiresCorrectToolForDrops()));
    public static final DeferredBlock<WallBlock> TARTARUS_STONE_BRICKS_WALL = registerBlock("tartarus_stone_bricks_wall", () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BRICK_WALL).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> TARTARUS_STONE_BRICKS_MOSSY = registerBlock("tartarus_stone_bricks_mossy", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BRICK_WALL).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> TARTARUS_STONE_BRICKS_CRACKED = registerBlock("tartarus_stone_bricks_cracked", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BRICK_WALL).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> TARTARUS_STONE_BRICKS_CHISELED = registerBlock("tartarus_stone_bricks_chiseled", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BRICK_WALL).requiresCorrectToolForDrops()));

    /*
     * WOOD TYPES
     */
    //Elder Wood
    public static final DeferredBlock<RotatedPillarBlock> ELDER_WOOD_LOG = registerBlock("elder_wood_log", () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LOG)));
    public static final DeferredBlock<RotatedPillarBlock> ELDER_WOOD = registerBlock("elder_wood", () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WOOD)));
    public static final DeferredBlock<RotatedPillarBlock> STRIPPED_ELDER_WOOD_LOG = registerBlock("stripped_elder_wood_log", () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_OAK_LOG)));
    public static final DeferredBlock<RotatedPillarBlock> STRIPPED_ELDER_WOOD = registerBlock("stripped_elder_wood", () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_OAK_WOOD)));
    public static final DeferredBlock<Block> ELDER_WOOD_LEAVES = registerBlock("elder_wood_leaves", () -> new ModFlammableLeavesBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LEAVES)));
    public static final DeferredBlock<SaplingBlock> ELDER_WOOD_SAPLING = registerBlock("elder_wood_sapling", () -> new ModSaplingBlock(ModTreeGrower.ELDER_WOOD_TREE, true, Blocks.DIRT, Blocks.GRASS_BLOCK, Blocks.STONE));
    public static final DeferredBlock<Block> ELDER_WOOD_PLANKS = registerBlock("elder_wood_planks", () -> new ModFlammableBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS)));
    public static final DeferredBlock<SlabBlock> ELDER_WOOD_PLANKS_SLAB = registerBlock("elder_wood_planks_slab", () -> new ModFlammableSlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SLAB)));
    public static final DeferredBlock<StairBlock> ELDER_WOOD_PLANKS_STAIRS = registerBlock("elder_wood_planks_stairs", () -> new ModFlammableStairBlock(UnderworldBlocks.ELDER_WOOD_PLANKS.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_STAIRS)));
    public static final DeferredBlock<PressurePlateBlock> ELDER_WOOD_PLANKS_PRESSURE_PLATE = registerBlock("elder_wood_planks_pressure_plate", () -> new ModFlammablePressurePlateBlock(ModBlockSetType.ELDER_WOOD, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PRESSURE_PLATE)));
    public static final DeferredBlock<DoorBlock> ELDER_WOOD_PLANKS_DOOR = registerBlock("elder_wood_planks_door", () -> new ModFlammableDoorBlock(ModBlockSetType.ELDER_WOOD, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_DOOR)));
    public static final DeferredBlock<TrapDoorBlock> ELDER_WOOD_PLANKS_TRAPDOOR = registerBlock("elder_wood_planks_trapdoor", () -> new ModFlammableTrapDoorBlock(ModBlockSetType.ELDER_WOOD, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_TRAPDOOR)));
    public static final DeferredBlock<FenceBlock> ELDER_WOOD_PLANKS_FENCE = registerBlock("elder_wood_planks_fence", () -> new ModFlammableFenceBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_FENCE)));
    public static final DeferredBlock<FenceGateBlock> ELDER_WOOD_PLANKS_FENCE_GATE = registerBlock("elder_wood_planks_fence_gate", () -> new ModFlammableFenceGateBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_FENCE_GATE), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE));
    public static final DeferredBlock<ButtonBlock> ELDER_WOOD_PLANKS_BUTTON = registerBlock("elder_wood_planks_button", () -> new ModFlammableButtonBlock(ModBlockSetType.ELDER_WOOD, 10, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WALL_SIGN)));
    public static final DeferredBlock<StandingSignBlock> ELDER_WOOD_PLANKS_SIGN = UNDERWORLD_BLOCKS.register("elder_wood_planks_sign", () -> new ModStandingSignBlock(ModWoodTypes.ELDER_WOOD, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SIGN)));
    public static final DeferredBlock<WallSignBlock> ELDER_WOOD_PLANKS_WALL_SIGN = UNDERWORLD_BLOCKS.register("elder_wood_planks_wall_sign", () -> new ModWallSignBlock(ModWoodTypes.ELDER_WOOD, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WALL_SIGN)));
    public static final DeferredBlock<CeilingHangingSignBlock> ELDER_WOOD_PLANKS_HANGING_SIGN = UNDERWORLD_BLOCKS.register("elder_wood_planks_hanging_sign", () -> new ModHangingSignBlock(ModWoodTypes.ELDER_WOOD, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_HANGING_SIGN)));
    public static final DeferredBlock<WallHangingSignBlock> ELDER_WOOD_PLANKS_WALL_HANGING_SIGN = UNDERWORLD_BLOCKS.register("elder_wood_planks_wall_hanging_sign", () -> new ModWallHangingSignBlock(ModWoodTypes.ELDER_WOOD, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WALL_HANGING_SIGN)));

    //Olive
    public static final DeferredBlock<RotatedPillarBlock> OLIVE_LOG = registerBlock("olive_log", () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LOG)));
    public static final DeferredBlock<RotatedPillarBlock> OLIVE_WOOD = registerBlock("olive_wood", () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WOOD)));
    public static final DeferredBlock<RotatedPillarBlock> STRIPPED_OLIVE_LOG = registerBlock("stripped_olive_log", () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_OAK_LOG)));
    public static final DeferredBlock<RotatedPillarBlock> STRIPPED_OLIVE_WOOD = registerBlock("stripped_olive_wood", () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_OAK_WOOD)));
    public static final DeferredBlock<Block> OLIVE_LEAVES = registerBlock("olive_leaves", () -> new ModFlammableLeavesBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LEAVES)));
    public static final DeferredBlock<SaplingBlock> OLIVE_SAPLING = registerBlock("olive_sapling", () -> new ModSaplingBlock(ModTreeGrower.OLIVE_TREE, true, Blocks.DIRT, Blocks.GRASS_BLOCK, Blocks.STONE));
    public static final DeferredBlock<Block> OLIVE_PLANKS = registerBlock("olive_planks", () -> new ModFlammableBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS)));
    public static final DeferredBlock<SlabBlock> OLIVE_PLANKS_SLAB = registerBlock("olive_planks_slab", () -> new ModFlammableSlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SLAB)));
    public static final DeferredBlock<StairBlock> OLIVE_PLANKS_STAIRS = registerBlock("olive_planks_stairs", () -> new ModFlammableStairBlock(UnderworldBlocks.OLIVE_PLANKS.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_STAIRS)));
    public static final DeferredBlock<PressurePlateBlock> OLIVE_PLANKS_PRESSURE_PLATE = registerBlock("olive_planks_pressure_plate", () -> new ModFlammablePressurePlateBlock(ModBlockSetType.OLIVE, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PRESSURE_PLATE)));
    public static final DeferredBlock<DoorBlock> OLIVE_PLANKS_DOOR = registerBlock("olive_planks_door", () -> new ModFlammableDoorBlock(ModBlockSetType.OLIVE, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_DOOR)));
    public static final DeferredBlock<TrapDoorBlock> OLIVE_PLANKS_TRAPDOOR = registerBlock("olive_planks_trapdoor", () -> new ModFlammableTrapDoorBlock(ModBlockSetType.OLIVE, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_TRAPDOOR)));
    public static final DeferredBlock<FenceBlock> OLIVE_PLANKS_FENCE = registerBlock("olive_planks_fence", () -> new ModFlammableFenceBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_FENCE)));
    public static final DeferredBlock<FenceGateBlock> OLIVE_PLANKS_FENCE_GATE = registerBlock("olive_planks_fence_gate", () -> new ModFlammableFenceGateBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_FENCE_GATE), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE));
    public static final DeferredBlock<ButtonBlock> OLIVE_PLANKS_BUTTON = registerBlock("olive_planks_button", () -> new ModFlammableButtonBlock(ModBlockSetType.OLIVE, 10, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WALL_SIGN)));
    public static final DeferredBlock<StandingSignBlock> OLIVE_PLANKS_SIGN = UNDERWORLD_BLOCKS.register("olive_planks_sign", () -> new ModStandingSignBlock(ModWoodTypes.OLIVE, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SIGN)));
    public static final DeferredBlock<WallSignBlock> OLIVE_PLANKS_WALL_SIGN = UNDERWORLD_BLOCKS.register("olive_planks_wall_sign", () -> new ModWallSignBlock(ModWoodTypes.OLIVE, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WALL_SIGN)));
    public static final DeferredBlock<CeilingHangingSignBlock> OLIVE_PLANKS_HANGING_SIGN = UNDERWORLD_BLOCKS.register("olive_planks_hanging_sign", () -> new ModHangingSignBlock(ModWoodTypes.OLIVE, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_HANGING_SIGN)));
    public static final DeferredBlock<WallHangingSignBlock> OLIVE_PLANKS_WALL_HANGING_SIGN = UNDERWORLD_BLOCKS.register("olive_planks_wall_hanging_sign", () -> new ModWallHangingSignBlock(ModWoodTypes.OLIVE, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WALL_HANGING_SIGN)));

    //Myrrh
    public static final DeferredBlock<RotatedPillarBlock> MYRRH_LOG = registerBlock("myrrh_log", () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LOG)));
    public static final DeferredBlock<RotatedPillarBlock> MYRRH_WOOD = registerBlock("myrrh_wood", () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WOOD)));
    public static final DeferredBlock<RotatedPillarBlock> STRIPPED_MYRRH_LOG = registerBlock("stripped_myrrh_log", () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_OAK_LOG)));
    public static final DeferredBlock<RotatedPillarBlock> STRIPPED_MYRRH_WOOD = registerBlock("stripped_myrrh_wood", () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_OAK_WOOD)));
    public static final DeferredBlock<Block> MYRRH_LEAVES = registerBlock("myrrh_leaves", () -> new ModFlammableLeavesBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LEAVES)));
    public static final DeferredBlock<SaplingBlock> MYRRH_SAPLING = registerBlock("myrrh_sapling", () -> new ModSaplingBlock(ModTreeGrower.MYRRH_TREE, true, Blocks.DIRT, Blocks.GRASS_BLOCK, Blocks.STONE));
    public static final DeferredBlock<Block> MYRRH_PLANKS = registerBlock("myrrh_planks", () -> new ModFlammableBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS)));
    public static final DeferredBlock<SlabBlock> MYRRH_PLANKS_SLAB = registerBlock("myrrh_planks_slab", () -> new ModFlammableSlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SLAB)));
    public static final DeferredBlock<StairBlock> MYRRH_PLANKS_STAIRS = registerBlock("myrrh_planks_stairs", () -> new ModFlammableStairBlock(UnderworldBlocks.MYRRH_PLANKS.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_STAIRS)));
    public static final DeferredBlock<PressurePlateBlock> MYRRH_PLANKS_PRESSURE_PLATE = registerBlock("myrrh_planks_pressure_plate", () -> new ModFlammablePressurePlateBlock(ModBlockSetType.MYRRH, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PRESSURE_PLATE)));
    public static final DeferredBlock<DoorBlock> MYRRH_PLANKS_DOOR = registerBlock("myrrh_planks_door", () -> new ModFlammableDoorBlock(ModBlockSetType.MYRRH, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_DOOR)));
    public static final DeferredBlock<TrapDoorBlock> MYRRH_PLANKS_TRAPDOOR = registerBlock("myrrh_planks_trapdoor", () -> new ModFlammableTrapDoorBlock(ModBlockSetType.MYRRH, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_TRAPDOOR)));
    public static final DeferredBlock<FenceBlock> MYRRH_PLANKS_FENCE = registerBlock("myrrh_planks_fence", () -> new ModFlammableFenceBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_FENCE)));
    public static final DeferredBlock<FenceGateBlock> MYRRH_PLANKS_FENCE_GATE = registerBlock("myrrh_planks_fence_gate", () -> new ModFlammableFenceGateBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_FENCE_GATE), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE));
    public static final DeferredBlock<ButtonBlock> MYRRH_PLANKS_BUTTON = registerBlock("myrrh_planks_button", () -> new ModFlammableButtonBlock(ModBlockSetType.MYRRH, 10, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WALL_SIGN)));
    public static final DeferredBlock<StandingSignBlock> MYRRH_PLANKS_SIGN = UNDERWORLD_BLOCKS.register("myrrh_planks_sign", () -> new ModStandingSignBlock(ModWoodTypes.MYRRH, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SIGN)));
    public static final DeferredBlock<WallSignBlock> MYRRH_PLANKS_WALL_SIGN = UNDERWORLD_BLOCKS.register("myrrh_planks_wall_sign", () -> new ModWallSignBlock(ModWoodTypes.MYRRH, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WALL_SIGN)));
    public static final DeferredBlock<CeilingHangingSignBlock> MYRRH_PLANKS_HANGING_SIGN = UNDERWORLD_BLOCKS.register("myrrh_planks_hanging_sign", () -> new ModHangingSignBlock(ModWoodTypes.MYRRH, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_HANGING_SIGN)));
    public static final DeferredBlock<WallHangingSignBlock> MYRRH_PLANKS_WALL_HANGING_SIGN = UNDERWORLD_BLOCKS.register("myrrh_planks_wall_hanging_sign", () -> new ModWallHangingSignBlock(ModWoodTypes.MYRRH, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WALL_HANGING_SIGN)));

    //Laurel
    public static final DeferredBlock<RotatedPillarBlock> LAUREL_LOG = registerBlock("laurel_log", () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LOG)));
    public static final DeferredBlock<RotatedPillarBlock> LAUREL_WOOD = registerBlock("laurel_wood", () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WOOD)));
    public static final DeferredBlock<RotatedPillarBlock> STRIPPED_LAUREL_LOG = registerBlock("stripped_laurel_log", () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_OAK_LOG)));
    public static final DeferredBlock<RotatedPillarBlock> STRIPPED_LAUREL_WOOD = registerBlock("stripped_laurel_wood", () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_OAK_WOOD)));
    public static final DeferredBlock<Block> LAUREL_LEAVES = registerBlock("laurel_leaves", () -> new ModFlammableLeavesBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LEAVES)));
    public static final DeferredBlock<SaplingBlock> LAUREL_SAPLING = registerBlock("laurel_sapling", () -> new ModSaplingBlock(ModTreeGrower.LAUREL_TREE, true, Blocks.DIRT, Blocks.GRASS_BLOCK, Blocks.STONE));
    public static final DeferredBlock<Block> LAUREL_PLANKS = registerBlock("laurel_planks", () -> new ModFlammableBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS)));
    public static final DeferredBlock<SlabBlock> LAUREL_PLANKS_SLAB = registerBlock("laurel_planks_slab", () -> new ModFlammableSlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SLAB)));
    public static final DeferredBlock<StairBlock> LAUREL_PLANKS_STAIRS = registerBlock("laurel_planks_stairs", () -> new ModFlammableStairBlock(UnderworldBlocks.LAUREL_PLANKS.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_STAIRS)));
    public static final DeferredBlock<PressurePlateBlock> LAUREL_PLANKS_PRESSURE_PLATE = registerBlock("laurel_planks_pressure_plate", () -> new ModFlammablePressurePlateBlock(ModBlockSetType.LAUREL, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PRESSURE_PLATE)));
    public static final DeferredBlock<DoorBlock> LAUREL_PLANKS_DOOR = registerBlock("laurel_planks_door", () -> new ModFlammableDoorBlock(ModBlockSetType.LAUREL, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_DOOR)));
    public static final DeferredBlock<TrapDoorBlock> LAUREL_PLANKS_TRAPDOOR = registerBlock("laurel_planks_trapdoor", () -> new ModFlammableTrapDoorBlock(ModBlockSetType.LAUREL, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_TRAPDOOR)));
    public static final DeferredBlock<FenceBlock> LAUREL_PLANKS_FENCE = registerBlock("laurel_planks_fence", () -> new ModFlammableFenceBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_FENCE)));
    public static final DeferredBlock<FenceGateBlock> LAUREL_PLANKS_FENCE_GATE = registerBlock("laurel_planks_fence_gate", () -> new ModFlammableFenceGateBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_FENCE_GATE), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE));
    public static final DeferredBlock<ButtonBlock> LAUREL_PLANKS_BUTTON = registerBlock("laurel_planks_button", () -> new ModFlammableButtonBlock(ModBlockSetType.LAUREL, 10, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WALL_SIGN)));
    public static final DeferredBlock<StandingSignBlock> LAUREL_PLANKS_SIGN = UNDERWORLD_BLOCKS.register("laurel_planks_sign", () -> new ModStandingSignBlock(ModWoodTypes.LAUREL, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SIGN)));
    public static final DeferredBlock<WallSignBlock> LAUREL_PLANKS_WALL_SIGN = UNDERWORLD_BLOCKS.register("laurel_planks_wall_sign", () -> new ModWallSignBlock(ModWoodTypes.LAUREL, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WALL_SIGN)));
    public static final DeferredBlock<CeilingHangingSignBlock> LAUREL_PLANKS_HANGING_SIGN = UNDERWORLD_BLOCKS.register("laurel_planks_hanging_sign", () -> new ModHangingSignBlock(ModWoodTypes.LAUREL, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_HANGING_SIGN)));
    public static final DeferredBlock<WallHangingSignBlock> LAUREL_PLANKS_WALL_HANGING_SIGN = UNDERWORLD_BLOCKS.register("laurel_planks_wall_hanging_sign", () -> new ModWallHangingSignBlock(ModWoodTypes.LAUREL, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WALL_HANGING_SIGN)));

    //Cypress
    public static final DeferredBlock<RotatedPillarBlock> CYPRESS_LOG = registerBlock("cypress_log", () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LOG)));
    public static final DeferredBlock<RotatedPillarBlock> CYPRESS_WOOD = registerBlock("cypress_wood", () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WOOD)));
    public static final DeferredBlock<RotatedPillarBlock> STRIPPED_CYPRESS_LOG = registerBlock("stripped_cypress_log", () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_OAK_LOG)));
    public static final DeferredBlock<RotatedPillarBlock> STRIPPED_CYPRESS_WOOD = registerBlock("stripped_cypress_wood", () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_OAK_WOOD)));
    public static final DeferredBlock<Block> CYPRESS_LEAVES = registerBlock("cypress_leaves", () -> new ModFlammableLeavesBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LEAVES)));
    public static final DeferredBlock<SaplingBlock> CYPRESS_SAPLING = registerBlock("cypress_sapling", () -> new ModSaplingBlock(ModTreeGrower.CYPRESS_TREE, true, Blocks.DIRT, Blocks.GRASS_BLOCK, Blocks.STONE));
    public static final DeferredBlock<Block> CYPRESS_PLANKS = registerBlock("cypress_planks", () -> new ModFlammableBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS)));
    public static final DeferredBlock<SlabBlock> CYPRESS_PLANKS_SLAB = registerBlock("cypress_planks_slab", () -> new ModFlammableSlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SLAB)));
    public static final DeferredBlock<StairBlock> CYPRESS_PLANKS_STAIRS = registerBlock("cypress_planks_stairs", () -> new ModFlammableStairBlock(UnderworldBlocks.CYPRESS_PLANKS.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_STAIRS)));
    public static final DeferredBlock<PressurePlateBlock> CYPRESS_PLANKS_PRESSURE_PLATE = registerBlock("cypress_planks_pressure_plate", () -> new ModFlammablePressurePlateBlock(ModBlockSetType.CYPRESS, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PRESSURE_PLATE)));
    public static final DeferredBlock<DoorBlock> CYPRESS_PLANKS_DOOR = registerBlock("cypress_planks_door", () -> new ModFlammableDoorBlock(ModBlockSetType.CYPRESS, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_DOOR)));
    public static final DeferredBlock<TrapDoorBlock> CYPRESS_PLANKS_TRAPDOOR = registerBlock("cypress_planks_trapdoor", () -> new ModFlammableTrapDoorBlock(ModBlockSetType.CYPRESS, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_TRAPDOOR)));
    public static final DeferredBlock<FenceBlock> CYPRESS_PLANKS_FENCE = registerBlock("cypress_planks_fence", () -> new ModFlammableFenceBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_FENCE)));
    public static final DeferredBlock<FenceGateBlock> CYPRESS_PLANKS_FENCE_GATE = registerBlock("cypress_planks_fence_gate", () -> new ModFlammableFenceGateBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_FENCE_GATE), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE));
    public static final DeferredBlock<ButtonBlock> CYPRESS_PLANKS_BUTTON = registerBlock("cypress_planks_button", () -> new ModFlammableButtonBlock(ModBlockSetType.CYPRESS, 10, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WALL_SIGN)));
    public static final DeferredBlock<StandingSignBlock> CYPRESS_PLANKS_SIGN = UNDERWORLD_BLOCKS.register("cypress_planks_sign", () -> new ModStandingSignBlock(ModWoodTypes.CYPRESS, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SIGN)));
    public static final DeferredBlock<WallSignBlock> CYPRESS_PLANKS_WALL_SIGN = UNDERWORLD_BLOCKS.register("cypress_planks_wall_sign", () -> new ModWallSignBlock(ModWoodTypes.CYPRESS, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WALL_SIGN)));
    public static final DeferredBlock<CeilingHangingSignBlock> CYPRESS_PLANKS_HANGING_SIGN = UNDERWORLD_BLOCKS.register("cypress_planks_hanging_sign", () -> new ModHangingSignBlock(ModWoodTypes.CYPRESS, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_HANGING_SIGN)));
    public static final DeferredBlock<WallHangingSignBlock> CYPRESS_PLANKS_WALL_HANGING_SIGN = UNDERWORLD_BLOCKS.register("cypress_planks_wall_hanging_sign", () -> new ModWallHangingSignBlock(ModWoodTypes.CYPRESS, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WALL_HANGING_SIGN)));

    /*
    Metals
     */
    //Orichalcum
    //https://en.wikipedia.org/wiki/Orichalcum
    public static final DeferredBlock<Block> ORICHALCUM_BLOCK = registerBlock("orichalcum_block", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> RAW_ORICHALCUM_BLOCK = registerBlock("raw_orichalcum_block", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.RAW_IRON_BLOCK).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> ORICHALCUM_ORE = registerBlock("orichalcum_ore", () -> new DropExperienceBlock(UniformInt.of(2, 5), BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> DEEPSLATE_ORICHALCUM_ORE = registerBlock("deepslate_orichalcum_ore", () -> new DropExperienceBlock(UniformInt.of(3, 7), BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE_IRON_ORE).requiresCorrectToolForDrops()));

    //Adamant
    //https://en.wikipedia.org/wiki/Adamant
    public static final DeferredBlock<Block> ADAMANT_BLOCK = registerBlock("adamant_block", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> ADAMANT_ORE = registerBlock("adamant_ore", () -> new DropExperienceBlock(UniformInt.of(2, 5), BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> DEEPSLATE_ADAMANT_ORE = registerBlock("deepslate_adamant_ore", () -> new DropExperienceBlock(UniformInt.of(3, 7), BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE_IRON_ORE).requiresCorrectToolForDrops()));

    /*
     *Mushroom
     */
    /*
     FLOWERS
     */
    public static final DeferredBlock<Block> IRIS_FLOWER = registerBlock("iris_flower", () -> new ModFlowerBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DANDELION)));
    public static final DeferredBlock<FlowerPotBlock> POTTED_IRIS_FLOWER = UNDERWORLD_BLOCKS.register("potted_iris_flower", () -> new FlowerPotBlock((() -> (FlowerPotBlock) Blocks.FLOWER_POT), IRIS_FLOWER, BlockBehaviour.Properties.ofFullCopy(Blocks.POTTED_DANDELION)));

    /*
    CROPS
     */
    public static final DeferredBlock<Block> POMEGRANATE_CROP_BLOCK = UNDERWORLD_BLOCKS.register("pomegranate_crop_block", () -> new PomegranateCropBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.WHEAT).noCollission().noOcclusion()));

    /*
    FLUIDS
     */
    public static final DeferredBlock<LiquidBlock> STYX_WATER_BLOCK = UNDERWORLD_BLOCKS.register("styx_water_block", () -> new LiquidBlock(ModFluids.STYX_SOURCE.get(), BlockBehaviour.Properties.ofFullCopy(Blocks.WATER).noLootTable()));
    public static final DeferredBlock<Block> STYX_CAULDRON = UNDERWORLD_BLOCKS.register("styx_cauldron", () -> new StyxCauldronBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CAULDRON)));

    /*
     * WORLD BLOCKS
     */
    //    public static final DeferredBlock<Block> UNDERWORLD_GRASS_BLOCK = registerBlock("underworld_grass_block", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.GRASS_BLOCK).noOcclusion()));
    public static final DeferredBlock<Block> UNDERWORLD_DIRT = registerBlock("underworld_dirt_block", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.DIRT)));

    /*
    DIMENSIONAL BLOCKS
    */
    public static final DeferredBlock<Block> UNDERWORLD_PORTAL_FRAME = registerBlock("underworld_portal_frame", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE)));
    public static final DeferredBlock<Block> UNDERWORLD_PORTAL = registerBlock("underworld_portal", UnderworldPortalBlock::new);

    private static <T extends Block> DeferredBlock<T> registerBlock(String name, Supplier<T> block) {
        DeferredBlock<T> toReturn = UNDERWORLD_BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> DeferredItem<Item> registerBlockItem(String name, DeferredBlock<T> block) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus){
        UNDERWORLD_BLOCKS.register(eventBus);
    }
}
