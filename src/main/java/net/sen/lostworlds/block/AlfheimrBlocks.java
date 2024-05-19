package net.sen.lostworlds.block;

import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.sen.lostworlds.LostWorldsApi;
import net.sen.lostworlds.block.crops.*;
import net.sen.lostworlds.block.custom.*;
import net.sen.lostworlds.block.portal.AlfheimrPortalBlock;
import net.sen.lostworlds.block.wood.*;
import net.sen.lostworlds.item.ModItems;
import net.sen.lostworlds.worldgen.tree.*;

import java.util.function.Supplier;

public class AlfheimrBlocks {
    public static final DeferredRegister<Block> ALFHEIMR_BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, LostWorldsApi.MODID);

    /*
    MULTI BLOCK
     */
    //Druid Ritual
    public static final RegistryObject<Block> DRUID_RITUAL_STONE = registerBlock("druid_ritual_stone", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));

    /*
    STONE
     */
    /*
     * WOOD TYPES
     */
    //Black Birch
    public static final RegistryObject<Block> BLACK_BIRCH_LOG = registerBlock("black_birch_log", () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)));
    public static final RegistryObject<Block> BLACK_BIRCH_WOOD = registerBlock("black_birch_wood", () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)));
    public static final RegistryObject<Block> STRIPPED_BLACK_BIRCH_LOG = registerBlock("stripped_black_birch_log", () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_LOG)));
    public static final RegistryObject<Block> STRIPPED_BLACK_BIRCH_WOOD = registerBlock("stripped_black_birch_wood", () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD)));
    public static final RegistryObject<Block> BLACK_BIRCH_LEAVES = registerBlock("black_birch_leaves", () -> new ModFlammableLeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)));
    public static final RegistryObject<Block> BLACK_BIRCH_SAPLING = registerBlock("black_birch_sapling", () -> new ModSaplingBlock(new BlackBirchTreeGrower(), BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING), Blocks.DIRT, Blocks.GRASS_BLOCK, Blocks.STONE));
    public static final RegistryObject<Block> BLACK_BIRCH_PLANKS = registerBlock("black_birch_planks", () -> new ModFlammableBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> BLACK_BIRCH_PLANKS_SLAB = registerBlock("black_birch_planks_slab", () -> new ModFlammableSlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB)));
    public static final RegistryObject<Block> BLACK_BIRCH_PLANKS_STAIRS = registerBlock("black_birch_planks_stairs", () -> new ModFlammableStairBlock(() -> AlfheimrBlocks.BLACK_BIRCH_PLANKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS)));
    public static final RegistryObject<Block> BLACK_BIRCH_PLANKS_PRESSURE_PLATE = registerBlock("black_birch_planks_pressure_plate", () -> new ModFlammablePressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, BlockBehaviour.Properties.copy(Blocks.OAK_PRESSURE_PLATE), ModBlockSetType.BLACK_BIRCH));
    public static final RegistryObject<Block> BLACK_BIRCH_PLANKS_DOOR = registerBlock("black_birch_planks_door", () -> new ModFlammableDoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_DOOR), ModBlockSetType.BLACK_BIRCH));
    public static final RegistryObject<Block> BLACK_BIRCH_PLANKS_TRAPDOOR = registerBlock("black_birch_planks_trapdoor", () -> new ModFlammableTrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_TRAPDOOR), ModBlockSetType.BLACK_BIRCH));
    public static final RegistryObject<Block> BLACK_BIRCH_PLANKS_FENCE = registerBlock("black_birch_planks_fence", () -> new ModFlammableFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE)));
    public static final RegistryObject<Block> BLACK_BIRCH_PLANKS_FENCE_GATE = registerBlock("black_birch_planks_fence_gate", () -> new ModFlammableFenceGateBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE_GATE), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE));
    public static final RegistryObject<Block> BLACK_BIRCH_PLANKS_BUTTON = registerBlock("black_birch_planks_button", () -> new ModFlammableButtonBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_SIGN), ModBlockSetType.BLACK_BIRCH, 10, false));
    public static final RegistryObject<Block> BLACK_BIRCH_PLANKS_SIGN = ALFHEIMR_BLOCKS.register("black_birch_planks_sign", () -> new ModStandingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SIGN), ModWoodTypes.BLACK_BIRCH));
    public static final RegistryObject<Block> BLACK_BIRCH_PLANKS_WALL_SIGN = ALFHEIMR_BLOCKS.register("black_birch_planks_wall_sign", () -> new ModWallSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_SIGN), ModWoodTypes.BLACK_BIRCH));
    public static final RegistryObject<Block> BLACK_BIRCH_PLANKS_HANGING_SIGN = ALFHEIMR_BLOCKS.register("black_birch_planks_hanging_sign", () -> new ModHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_HANGING_SIGN), ModWoodTypes.BLACK_BIRCH));
    public static final RegistryObject<Block> BLACK_BIRCH_PLANKS_WALL_HANGING_SIGN = ALFHEIMR_BLOCKS.register("black_birch_planks_wall_hanging_sign", () -> new ModWallHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_HANGING_SIGN), ModWoodTypes.BLACK_BIRCH));

    //White Oak
    public static final RegistryObject<Block> WHITE_OAK_LOG = registerBlock("white_oak_log", () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)));
    public static final RegistryObject<Block> WHITE_OAK_WOOD = registerBlock("white_oak_wood", () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)));
    public static final RegistryObject<Block> STRIPPED_WHITE_OAK_LOG = registerBlock("stripped_white_oak_log", () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_LOG)));
    public static final RegistryObject<Block> STRIPPED_WHITE_OAK_WOOD = registerBlock("stripped_white_oak_wood", () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD)));
    public static final RegistryObject<Block> WHITE_OAK_LEAVES = registerBlock("white_oak_leaves", () -> new ModFlammableLeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)));
    public static final RegistryObject<Block> WHITE_OAK_SAPLING = registerBlock("white_oak_sapling", () -> new ModSaplingBlock(new WhiteOakTreeGrower(), BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING), Blocks.DIRT, Blocks.GRASS_BLOCK, Blocks.STONE));
    public static final RegistryObject<Block> WHITE_OAK_PLANKS = registerBlock("white_oak_planks", () -> new ModFlammableBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> WHITE_OAK_PLANKS_SLAB = registerBlock("white_oak_planks_slab", () -> new ModFlammableSlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB)));
    public static final RegistryObject<Block> WHITE_OAK_PLANKS_STAIRS = registerBlock("white_oak_planks_stairs", () -> new ModFlammableStairBlock(() -> AlfheimrBlocks.WHITE_OAK_PLANKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS)));
    public static final RegistryObject<Block> WHITE_OAK_PLANKS_PRESSURE_PLATE = registerBlock("white_oak_planks_pressure_plate", () -> new ModFlammablePressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, BlockBehaviour.Properties.copy(Blocks.OAK_PRESSURE_PLATE), ModBlockSetType.WHITE_OAK));
    public static final RegistryObject<Block> WHITE_OAK_PLANKS_DOOR = registerBlock("white_oak_planks_door", () -> new ModFlammableDoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_DOOR), ModBlockSetType.WHITE_OAK));
    public static final RegistryObject<Block> WHITE_OAK_PLANKS_TRAPDOOR = registerBlock("white_oak_planks_trapdoor", () -> new ModFlammableTrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_TRAPDOOR), ModBlockSetType.WHITE_OAK));
    public static final RegistryObject<Block> WHITE_OAK_PLANKS_FENCE = registerBlock("white_oak_planks_fence", () -> new ModFlammableFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE)));
    public static final RegistryObject<Block> WHITE_OAK_PLANKS_FENCE_GATE = registerBlock("white_oak_planks_fence_gate", () -> new ModFlammableFenceGateBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE_GATE), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE));
    public static final RegistryObject<Block> WHITE_OAK_PLANKS_BUTTON = registerBlock("white_oak_planks_button", () -> new ModFlammableButtonBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_SIGN), ModBlockSetType.WHITE_OAK, 10, false));
    public static final RegistryObject<Block> WHITE_OAK_PLANKS_SIGN = ALFHEIMR_BLOCKS.register("white_oak_planks_sign", () -> new ModStandingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SIGN), ModWoodTypes.WHITE_OAK));
    public static final RegistryObject<Block> WHITE_OAK_PLANKS_WALL_SIGN = ALFHEIMR_BLOCKS.register("white_oak_planks_wall_sign", () -> new ModWallSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_SIGN), ModWoodTypes.WHITE_OAK));
    public static final RegistryObject<Block> WHITE_OAK_PLANKS_HANGING_SIGN = ALFHEIMR_BLOCKS.register("white_oak_planks_hanging_sign", () -> new ModHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_HANGING_SIGN), ModWoodTypes.WHITE_OAK));
    public static final RegistryObject<Block> WHITE_OAK_PLANKS_WALL_HANGING_SIGN = ALFHEIMR_BLOCKS.register("white_oak_planks_wall_hanging_sign", () -> new ModWallHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_HANGING_SIGN), ModWoodTypes.WHITE_OAK));

    //Bur Oak
    public static final RegistryObject<Block> BUR_OAK_LOG = registerBlock("bur_oak_log", () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)));
    public static final RegistryObject<Block> BUR_OAK_WOOD = registerBlock("bur_oak_wood", () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)));
    public static final RegistryObject<Block> STRIPPED_BUR_OAK_LOG = registerBlock("stripped_bur_oak_log", () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_LOG)));
    public static final RegistryObject<Block> STRIPPED_BUR_OAK_WOOD = registerBlock("stripped_bur_oak_wood", () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD)));
    public static final RegistryObject<Block> BUR_OAK_LEAVES = registerBlock("bur_oak_leaves", () -> new ModFlammableLeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)));
    public static final RegistryObject<Block> BUR_OAK_SAPLING = registerBlock("bur_oak_sapling", () -> new ModSaplingBlock(new BurOakTreeGrower(), BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING), Blocks.DIRT, Blocks.GRASS_BLOCK, Blocks.STONE));
    public static final RegistryObject<Block> BUR_OAK_PLANKS = registerBlock("bur_oak_planks", () -> new ModFlammableBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> BUR_OAK_PLANKS_SLAB = registerBlock("bur_oak_planks_slab", () -> new ModFlammableSlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB)));
    public static final RegistryObject<Block> BUR_OAK_PLANKS_STAIRS = registerBlock("bur_oak_planks_stairs", () -> new ModFlammableStairBlock(() -> AlfheimrBlocks.BUR_OAK_PLANKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS)));
    public static final RegistryObject<Block> BUR_OAK_PLANKS_PRESSURE_PLATE = registerBlock("bur_oak_planks_pressure_plate", () -> new ModFlammablePressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, BlockBehaviour.Properties.copy(Blocks.OAK_PRESSURE_PLATE), ModBlockSetType.BUR_OAK));
    public static final RegistryObject<Block> BUR_OAK_PLANKS_DOOR = registerBlock("bur_oak_planks_door", () -> new ModFlammableDoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_DOOR), ModBlockSetType.BUR_OAK));
    public static final RegistryObject<Block> BUR_OAK_PLANKS_TRAPDOOR = registerBlock("bur_oak_planks_trapdoor", () -> new ModFlammableTrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_TRAPDOOR), ModBlockSetType.BUR_OAK));
    public static final RegistryObject<Block> BUR_OAK_PLANKS_FENCE = registerBlock("bur_oak_planks_fence", () -> new ModFlammableFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE)));
    public static final RegistryObject<Block> BUR_OAK_PLANKS_FENCE_GATE = registerBlock("bur_oak_planks_fence_gate", () -> new ModFlammableFenceGateBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE_GATE), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE));
    public static final RegistryObject<Block> BUR_OAK_PLANKS_BUTTON = registerBlock("bur_oak_planks_button", () -> new ModFlammableButtonBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_SIGN), ModBlockSetType.BUR_OAK, 10, false));
    public static final RegistryObject<Block> BUR_OAK_PLANKS_SIGN = ALFHEIMR_BLOCKS.register("bur_oak_planks_sign", () -> new ModStandingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SIGN), ModWoodTypes.BUR_OAK));
    public static final RegistryObject<Block> BUR_OAK_PLANKS_WALL_SIGN = ALFHEIMR_BLOCKS.register("bur_oak_planks_wall_sign", () -> new ModWallSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_SIGN), ModWoodTypes.BUR_OAK));
    public static final RegistryObject<Block> BUR_OAK_PLANKS_HANGING_SIGN = ALFHEIMR_BLOCKS.register("bur_oak_planks_hanging_sign", () -> new ModHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_HANGING_SIGN), ModWoodTypes.BUR_OAK));
    public static final RegistryObject<Block> BUR_OAK_PLANKS_WALL_HANGING_SIGN = ALFHEIMR_BLOCKS.register("bur_oak_planks_wall_hanging_sign", () -> new ModWallHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_HANGING_SIGN), ModWoodTypes.BUR_OAK));

    //Blood Cherry
    public static final RegistryObject<Block> BLOOD_CHERRY_LOG = registerBlock("blood_cherry_log", () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)));
    public static final RegistryObject<Block> BLOOD_CHERRY_WOOD = registerBlock("blood_cherry_wood", () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)));
    public static final RegistryObject<Block> STRIPPED_BLOOD_CHERRY_LOG = registerBlock("stripped_blood_cherry_log", () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_LOG)));
    public static final RegistryObject<Block> STRIPPED_BLOOD_CHERRY_WOOD = registerBlock("stripped_blood_cherry_wood", () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD)));
    public static final RegistryObject<Block> BLOOD_CHERRY_LEAVES = registerBlock("blood_cherry_leaves", () -> new ModFlammableLeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)));
    public static final RegistryObject<Block> BLOOD_CHERRY_SAPLING = registerBlock("blood_cherry_sapling", () -> new ModSaplingBlock(new BloodCherryTreeGrower(), BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING), Blocks.DIRT, Blocks.GRASS_BLOCK, Blocks.STONE));
    public static final RegistryObject<Block> BLOOD_CHERRY_PLANKS = registerBlock("blood_cherry_planks", () -> new ModFlammableBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> BLOOD_CHERRY_PLANKS_SLAB = registerBlock("blood_cherry_planks_slab", () -> new ModFlammableSlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB)));
    public static final RegistryObject<Block> BLOOD_CHERRY_PLANKS_STAIRS = registerBlock("blood_cherry_planks_stairs", () -> new ModFlammableStairBlock(() -> AlfheimrBlocks.BLOOD_CHERRY_PLANKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS)));
    public static final RegistryObject<Block> BLOOD_CHERRY_PLANKS_PRESSURE_PLATE = registerBlock("blood_cherry_planks_pressure_plate", () -> new ModFlammablePressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, BlockBehaviour.Properties.copy(Blocks.OAK_PRESSURE_PLATE), ModBlockSetType.BLOOD_CHERRY));
    public static final RegistryObject<Block> BLOOD_CHERRY_PLANKS_DOOR = registerBlock("blood_cherry_planks_door", () -> new ModFlammableDoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_DOOR), ModBlockSetType.BLOOD_CHERRY));
    public static final RegistryObject<Block> BLOOD_CHERRY_PLANKS_TRAPDOOR = registerBlock("blood_cherry_planks_trapdoor", () -> new ModFlammableTrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_TRAPDOOR), ModBlockSetType.BLOOD_CHERRY));
    public static final RegistryObject<Block> BLOOD_CHERRY_PLANKS_FENCE = registerBlock("blood_cherry_planks_fence", () -> new ModFlammableFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE)));
    public static final RegistryObject<Block> BLOOD_CHERRY_PLANKS_FENCE_GATE = registerBlock("blood_cherry_planks_fence_gate", () -> new ModFlammableFenceGateBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE_GATE), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE));
    public static final RegistryObject<Block> BLOOD_CHERRY_PLANKS_BUTTON = registerBlock("blood_cherry_planks_button", () -> new ModFlammableButtonBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_SIGN), ModBlockSetType.BLOOD_CHERRY, 10, false));
    public static final RegistryObject<Block> BLOOD_CHERRY_PLANKS_SIGN = ALFHEIMR_BLOCKS.register("blood_cherry_planks_sign", () -> new ModStandingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SIGN), ModWoodTypes.BLOOD_CHERRY));
    public static final RegistryObject<Block> BLOOD_CHERRY_PLANKS_WALL_SIGN = ALFHEIMR_BLOCKS.register("blood_cherry_planks_wall_sign", () -> new ModWallSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_SIGN), ModWoodTypes.BLOOD_CHERRY));
    public static final RegistryObject<Block> BLOOD_CHERRY_PLANKS_HANGING_SIGN = ALFHEIMR_BLOCKS.register("blood_cherry_planks_hanging_sign", () -> new ModHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_HANGING_SIGN), ModWoodTypes.BLOOD_CHERRY));
    public static final RegistryObject<Block> BLOOD_CHERRY_PLANKS_WALL_HANGING_SIGN = ALFHEIMR_BLOCKS.register("blood_cherry_planks_wall_hanging_sign", () -> new ModWallHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_HANGING_SIGN), ModWoodTypes.BLOOD_CHERRY));

    //Sacred Tree
    public static final RegistryObject<Block> SACRED_TREE_LOG = registerBlock("sacred_tree_log", () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)));
    public static final RegistryObject<Block> SACRED_TREE_WOOD = registerBlock("sacred_tree_wood", () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)));
    public static final RegistryObject<Block> STRIPPED_SACRED_TREE_LOG = registerBlock("stripped_sacred_tree_log", () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_LOG)));
    public static final RegistryObject<Block> STRIPPED_SACRED_TREE_WOOD = registerBlock("stripped_sacred_tree_wood", () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD)));
    public static final RegistryObject<Block> SACRED_TREE_LEAVES = registerBlock("sacred_tree_leaves", () -> new ModFlammableLeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)));
    public static final RegistryObject<Block> SACRED_TREE_SAPLING = registerBlock("sacred_tree_sapling", () -> new ModSaplingBlock(new SacredTreeTreeGrower(), BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING), Blocks.DIRT, Blocks.GRASS_BLOCK, Blocks.STONE));
    public static final RegistryObject<Block> SACRED_TREE_PLANKS = registerBlock("sacred_tree_planks", () -> new ModFlammableBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> SACRED_TREE_PLANKS_SLAB = registerBlock("sacred_tree_planks_slab", () -> new ModFlammableSlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB)));
    public static final RegistryObject<Block> SACRED_TREE_PLANKS_STAIRS = registerBlock("sacred_tree_planks_stairs", () -> new ModFlammableStairBlock(() -> AlfheimrBlocks.SACRED_TREE_PLANKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS)));
    public static final RegistryObject<Block> SACRED_TREE_PLANKS_PRESSURE_PLATE = registerBlock("sacred_tree_planks_pressure_plate", () -> new ModFlammablePressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, BlockBehaviour.Properties.copy(Blocks.OAK_PRESSURE_PLATE), ModBlockSetType.SACRED_TREE));
    public static final RegistryObject<Block> SACRED_TREE_PLANKS_DOOR = registerBlock("sacred_tree_planks_door", () -> new ModFlammableDoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_DOOR), ModBlockSetType.SACRED_TREE));
    public static final RegistryObject<Block> SACRED_TREE_PLANKS_TRAPDOOR = registerBlock("sacred_tree_planks_trapdoor", () -> new ModFlammableTrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_TRAPDOOR), ModBlockSetType.SACRED_TREE));
    public static final RegistryObject<Block> SACRED_TREE_PLANKS_FENCE = registerBlock("sacred_tree_planks_fence", () -> new ModFlammableFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE)));
    public static final RegistryObject<Block> SACRED_TREE_PLANKS_FENCE_GATE = registerBlock("sacred_tree_planks_fence_gate", () -> new ModFlammableFenceGateBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE_GATE), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE));
    public static final RegistryObject<Block> SACRED_TREE_PLANKS_BUTTON = registerBlock("sacred_tree_planks_button", () -> new ModFlammableButtonBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_SIGN), ModBlockSetType.SACRED_TREE, 10, false));
    public static final RegistryObject<Block> SACRED_TREE_PLANKS_SIGN = ALFHEIMR_BLOCKS.register("sacred_tree_planks_sign", () -> new ModStandingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SIGN), ModWoodTypes.SACRED_TREE));
    public static final RegistryObject<Block> SACRED_TREE_PLANKS_WALL_SIGN = ALFHEIMR_BLOCKS.register("sacred_tree_planks_wall_sign", () -> new ModWallSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_SIGN), ModWoodTypes.SACRED_TREE));
    public static final RegistryObject<Block> SACRED_TREE_PLANKS_HANGING_SIGN = ALFHEIMR_BLOCKS.register("sacred_tree_planks_hanging_sign", () -> new ModHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_HANGING_SIGN), ModWoodTypes.SACRED_TREE));
    public static final RegistryObject<Block> SACRED_TREE_PLANKS_WALL_HANGING_SIGN = ALFHEIMR_BLOCKS.register("sacred_tree_planks_wall_hanging_sign", () -> new ModWallHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_HANGING_SIGN), ModWoodTypes.SACRED_TREE));

    //Willow
    public static final RegistryObject<Block> WILLOW_LOG = registerBlock("willow_log", () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)));
    public static final RegistryObject<Block> WILLOW_WOOD = registerBlock("willow_wood", () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)));
    public static final RegistryObject<Block> STRIPPED_WILLOW_LOG = registerBlock("stripped_willow_log", () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_LOG)));
    public static final RegistryObject<Block> STRIPPED_WILLOW_WOOD = registerBlock("stripped_willow_wood", () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD)));
    public static final RegistryObject<Block> WILLOW_LEAVES = registerBlock("willow_leaves", () -> new ModFlammableLeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)));
    public static final RegistryObject<Block> WILLOW_SAPLING = registerBlock("willow_sapling", () -> new ModSaplingBlock(new WillowTreeGrower(), BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING), Blocks.DIRT, Blocks.GRASS_BLOCK, Blocks.STONE));
    public static final RegistryObject<Block> WILLOW_PLANKS = registerBlock("willow_planks", () -> new ModFlammableBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> WILLOW_PLANKS_SLAB = registerBlock("willow_planks_slab", () -> new ModFlammableSlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB)));
    public static final RegistryObject<Block> WILLOW_PLANKS_STAIRS = registerBlock("willow_planks_stairs", () -> new ModFlammableStairBlock(() -> AlfheimrBlocks.WILLOW_PLANKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS)));
    public static final RegistryObject<Block> WILLOW_PLANKS_PRESSURE_PLATE = registerBlock("willow_planks_pressure_plate", () -> new ModFlammablePressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, BlockBehaviour.Properties.copy(Blocks.OAK_PRESSURE_PLATE), ModBlockSetType.WILLOW));
    public static final RegistryObject<Block> WILLOW_PLANKS_DOOR = registerBlock("willow_planks_door", () -> new ModFlammableDoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_DOOR), ModBlockSetType.WILLOW));
    public static final RegistryObject<Block> WILLOW_PLANKS_TRAPDOOR = registerBlock("willow_planks_trapdoor", () -> new ModFlammableTrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_TRAPDOOR), ModBlockSetType.WILLOW));
    public static final RegistryObject<Block> WILLOW_PLANKS_FENCE = registerBlock("willow_planks_fence", () -> new ModFlammableFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE)));
    public static final RegistryObject<Block> WILLOW_PLANKS_FENCE_GATE = registerBlock("willow_planks_fence_gate", () -> new ModFlammableFenceGateBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE_GATE), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE));
    public static final RegistryObject<Block> WILLOW_PLANKS_BUTTON = registerBlock("willow_planks_button", () -> new ModFlammableButtonBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_SIGN), ModBlockSetType.WILLOW, 10, false));
    public static final RegistryObject<Block> WILLOW_PLANKS_SIGN = ALFHEIMR_BLOCKS.register("willow_planks_sign", () -> new ModStandingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SIGN), ModWoodTypes.WILLOW));
    public static final RegistryObject<Block> WILLOW_PLANKS_WALL_SIGN = ALFHEIMR_BLOCKS.register("willow_planks_wall_sign", () -> new ModWallSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_SIGN), ModWoodTypes.WILLOW));
    public static final RegistryObject<Block> WILLOW_PLANKS_HANGING_SIGN = ALFHEIMR_BLOCKS.register("willow_planks_hanging_sign", () -> new ModHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_HANGING_SIGN), ModWoodTypes.WILLOW));
    public static final RegistryObject<Block> WILLOW_PLANKS_WALL_HANGING_SIGN = ALFHEIMR_BLOCKS.register("willow_planks_wall_hanging_sign", () -> new ModWallHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_HANGING_SIGN), ModWoodTypes.WILLOW));

    //Deadwood
    public static final RegistryObject<Block> DEADWOOD_LOG = registerBlock("deadwood_log", () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)));
    public static final RegistryObject<Block> DEADWOOD_WOOD = registerBlock("deadwood_wood", () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)));
    public static final RegistryObject<Block> STRIPPED_DEADWOOD_LOG = registerBlock("stripped_deadwood_log", () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_LOG)));
    public static final RegistryObject<Block> STRIPPED_DEADWOOD_WOOD = registerBlock("stripped_deadwood_wood", () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD)));
    public static final RegistryObject<Block> DEADWOOD_LEAVES = registerBlock("deadwood_leaves", () -> new ModFlammableLeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)));
    public static final RegistryObject<Block> DEADWOOD_SAPLING = registerBlock("deadwood_sapling", () -> new ModSaplingBlock(new DeadwoodTreeGrower(), BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING), Blocks.DIRT, Blocks.GRASS_BLOCK, Blocks.STONE));
    public static final RegistryObject<Block> DEADWOOD_PLANKS = registerBlock("deadwood_planks", () -> new ModFlammableBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> DEADWOOD_PLANKS_SLAB = registerBlock("deadwood_planks_slab", () -> new ModFlammableSlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB)));
    public static final RegistryObject<Block> DEADWOOD_PLANKS_STAIRS = registerBlock("deadwood_planks_stairs", () -> new ModFlammableStairBlock(() -> AlfheimrBlocks.DEADWOOD_PLANKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS)));
    public static final RegistryObject<Block> DEADWOOD_PLANKS_PRESSURE_PLATE = registerBlock("deadwood_planks_pressure_plate", () -> new ModFlammablePressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, BlockBehaviour.Properties.copy(Blocks.OAK_PRESSURE_PLATE), ModBlockSetType.DEADWOOD));
    public static final RegistryObject<Block> DEADWOOD_PLANKS_DOOR = registerBlock("deadwood_planks_door", () -> new ModFlammableDoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_DOOR), ModBlockSetType.DEADWOOD));
    public static final RegistryObject<Block> DEADWOOD_PLANKS_TRAPDOOR = registerBlock("deadwood_planks_trapdoor", () -> new ModFlammableTrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_TRAPDOOR), ModBlockSetType.DEADWOOD));
    public static final RegistryObject<Block> DEADWOOD_PLANKS_FENCE = registerBlock("deadwood_planks_fence", () -> new ModFlammableFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE)));
    public static final RegistryObject<Block> DEADWOOD_PLANKS_FENCE_GATE = registerBlock("deadwood_planks_fence_gate", () -> new ModFlammableFenceGateBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE_GATE), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE));
    public static final RegistryObject<Block> DEADWOOD_PLANKS_BUTTON = registerBlock("deadwood_planks_button", () -> new ModFlammableButtonBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_SIGN), ModBlockSetType.DEADWOOD, 10, false));
    public static final RegistryObject<Block> DEADWOOD_PLANKS_SIGN = ALFHEIMR_BLOCKS.register("deadwood_planks_sign", () -> new ModStandingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SIGN), ModWoodTypes.DEADWOOD));
    public static final RegistryObject<Block> DEADWOOD_PLANKS_WALL_SIGN = ALFHEIMR_BLOCKS.register("deadwood_planks_wall_sign", () -> new ModWallSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_SIGN), ModWoodTypes.DEADWOOD));
    public static final RegistryObject<Block> DEADWOOD_PLANKS_HANGING_SIGN = ALFHEIMR_BLOCKS.register("deadwood_planks_hanging_sign", () -> new ModHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_HANGING_SIGN), ModWoodTypes.DEADWOOD));
    public static final RegistryObject<Block> DEADWOOD_PLANKS_WALL_HANGING_SIGN = ALFHEIMR_BLOCKS.register("deadwood_planks_wall_hanging_sign", () -> new ModWallHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_HANGING_SIGN), ModWoodTypes.DEADWOOD));

    //Ebony Kingswood
    public static final RegistryObject<Block> EBONY_KINGSWOOD_LOG = registerBlock("ebony_kingswood_log", () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)));
    public static final RegistryObject<Block> EBONY_KINGSWOOD_WOOD = registerBlock("ebony_kingswood_wood", () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)));
    public static final RegistryObject<Block> STRIPPED_EBONY_KINGSWOOD_LOG = registerBlock("stripped_ebony_kingswood_log", () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_LOG)));
    public static final RegistryObject<Block> STRIPPED_EBONY_KINGSWOOD_WOOD = registerBlock("stripped_ebony_kingswood_wood", () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD)));
    public static final RegistryObject<Block> EBONY_KINGSWOOD_LEAVES = registerBlock("ebony_kingswood_leaves", () -> new ModFlammableLeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)));
    public static final RegistryObject<Block> EBONY_KINGSWOOD_SAPLING = registerBlock("ebony_kingswood_sapling", () -> new ModSaplingBlock(new EbonyKingswoodTreeGrower(), BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING), Blocks.DIRT, Blocks.GRASS_BLOCK, Blocks.STONE));
    public static final RegistryObject<Block> EBONY_KINGSWOOD_PLANKS = registerBlock("ebony_kingswood_planks", () -> new ModFlammableBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> EBONY_KINGSWOOD_PLANKS_SLAB = registerBlock("ebony_kingswood_planks_slab", () -> new ModFlammableSlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB)));
    public static final RegistryObject<Block> EBONY_KINGSWOOD_PLANKS_STAIRS = registerBlock("ebony_kingswood_planks_stairs", () -> new ModFlammableStairBlock(() -> AlfheimrBlocks.EBONY_KINGSWOOD_PLANKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS)));
    public static final RegistryObject<Block> EBONY_KINGSWOOD_PLANKS_PRESSURE_PLATE = registerBlock("ebony_kingswood_planks_pressure_plate", () -> new ModFlammablePressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, BlockBehaviour.Properties.copy(Blocks.OAK_PRESSURE_PLATE), ModBlockSetType.EBONY_KINGSWOOD));
    public static final RegistryObject<Block> EBONY_KINGSWOOD_PLANKS_DOOR = registerBlock("ebony_kingswood_planks_door", () -> new ModFlammableDoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_DOOR), ModBlockSetType.EBONY_KINGSWOOD));
    public static final RegistryObject<Block> EBONY_KINGSWOOD_PLANKS_TRAPDOOR = registerBlock("ebony_kingswood_planks_trapdoor", () -> new ModFlammableTrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_TRAPDOOR), ModBlockSetType.EBONY_KINGSWOOD));
    public static final RegistryObject<Block> EBONY_KINGSWOOD_PLANKS_FENCE = registerBlock("ebony_kingswood_planks_fence", () -> new ModFlammableFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE)));
    public static final RegistryObject<Block> EBONY_KINGSWOOD_PLANKS_FENCE_GATE = registerBlock("ebony_kingswood_planks_fence_gate", () -> new ModFlammableFenceGateBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE_GATE), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE));
    public static final RegistryObject<Block> EBONY_KINGSWOOD_PLANKS_BUTTON = registerBlock("ebony_kingswood_planks_button", () -> new ModFlammableButtonBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_SIGN), ModBlockSetType.EBONY_KINGSWOOD, 10, false));
    public static final RegistryObject<Block> EBONY_KINGSWOOD_PLANKS_SIGN = ALFHEIMR_BLOCKS.register("ebony_kingswood_planks_sign", () -> new ModStandingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SIGN), ModWoodTypes.EBONY_KINGSWOOD));
    public static final RegistryObject<Block> EBONY_KINGSWOOD_PLANKS_WALL_SIGN = ALFHEIMR_BLOCKS.register("ebony_kingswood_planks_wall_sign", () -> new ModWallSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_SIGN), ModWoodTypes.EBONY_KINGSWOOD));
    public static final RegistryObject<Block> EBONY_KINGSWOOD_PLANKS_HANGING_SIGN = ALFHEIMR_BLOCKS.register("ebony_kingswood_planks_hanging_sign", () -> new ModHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_HANGING_SIGN), ModWoodTypes.EBONY_KINGSWOOD));
    public static final RegistryObject<Block> EBONY_KINGSWOOD_PLANKS_WALL_HANGING_SIGN = ALFHEIMR_BLOCKS.register("ebony_kingswood_planks_wall_hanging_sign", () -> new ModWallHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_HANGING_SIGN), ModWoodTypes.EBONY_KINGSWOOD));

    //Ivory Kingswood
    public static final RegistryObject<Block> IVORY_KINGSWOOD_LOG = registerBlock("ivory_kingswood_log", () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)));
    public static final RegistryObject<Block> IVORY_KINGSWOOD_WOOD = registerBlock("ivory_kingswood_wood", () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)));
    public static final RegistryObject<Block> STRIPPED_IVORY_KINGSWOOD_LOG = registerBlock("stripped_ivory_kingswood_log", () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_LOG)));
    public static final RegistryObject<Block> STRIPPED_IVORY_KINGSWOOD_WOOD = registerBlock("stripped_ivory_kingswood_wood", () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD)));
    public static final RegistryObject<Block> IVORY_KINGSWOOD_LEAVES = registerBlock("ivory_kingswood_leaves", () -> new ModFlammableLeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)));
    public static final RegistryObject<Block> IVORY_KINGSWOOD_SAPLING = registerBlock("ivory_kingswood_sapling", () -> new ModSaplingBlock(new IvoryKingswoodTreeGrower(), BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING), Blocks.DIRT, Blocks.GRASS_BLOCK, Blocks.STONE));
    public static final RegistryObject<Block> IVORY_KINGSWOOD_PLANKS = registerBlock("ivory_kingswood_planks", () -> new ModFlammableBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> IVORY_KINGSWOOD_PLANKS_SLAB = registerBlock("ivory_kingswood_planks_slab", () -> new ModFlammableSlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB)));
    public static final RegistryObject<Block> IVORY_KINGSWOOD_PLANKS_STAIRS = registerBlock("ivory_kingswood_planks_stairs", () -> new ModFlammableStairBlock(() -> AlfheimrBlocks.IVORY_KINGSWOOD_PLANKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS)));
    public static final RegistryObject<Block> IVORY_KINGSWOOD_PLANKS_PRESSURE_PLATE = registerBlock("ivory_kingswood_planks_pressure_plate", () -> new ModFlammablePressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, BlockBehaviour.Properties.copy(Blocks.OAK_PRESSURE_PLATE), ModBlockSetType.IVORY_KINGSWOOD));
    public static final RegistryObject<Block> IVORY_KINGSWOOD_PLANKS_DOOR = registerBlock("ivory_kingswood_planks_door", () -> new ModFlammableDoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_DOOR), ModBlockSetType.IVORY_KINGSWOOD));
    public static final RegistryObject<Block> IVORY_KINGSWOOD_PLANKS_TRAPDOOR = registerBlock("ivory_kingswood_planks_trapdoor", () -> new ModFlammableTrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_TRAPDOOR), ModBlockSetType.IVORY_KINGSWOOD));
    public static final RegistryObject<Block> IVORY_KINGSWOOD_PLANKS_FENCE = registerBlock("ivory_kingswood_planks_fence", () -> new ModFlammableFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE)));
    public static final RegistryObject<Block> IVORY_KINGSWOOD_PLANKS_FENCE_GATE = registerBlock("ivory_kingswood_planks_fence_gate", () -> new ModFlammableFenceGateBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE_GATE), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE));
    public static final RegistryObject<Block> IVORY_KINGSWOOD_PLANKS_BUTTON = registerBlock("ivory_kingswood_planks_button", () -> new ModFlammableButtonBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_SIGN), ModBlockSetType.IVORY_KINGSWOOD, 10, false));
    public static final RegistryObject<Block> IVORY_KINGSWOOD_PLANKS_SIGN =  ALFHEIMR_BLOCKS.register("ivory_kingswood_planks_sign", () -> new ModStandingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SIGN), ModWoodTypes.IVORY_KINGSWOOD));
    public static final RegistryObject<Block> IVORY_KINGSWOOD_PLANKS_WALL_SIGN = ALFHEIMR_BLOCKS.register("ivory_kingswood_planks_wall_sign", () -> new ModWallSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_SIGN), ModWoodTypes.IVORY_KINGSWOOD));
    public static final RegistryObject<Block> IVORY_KINGSWOOD_PLANKS_HANGING_SIGN = ALFHEIMR_BLOCKS.register("ivory_kingswood_planks_hanging_sign", () -> new ModHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_HANGING_SIGN), ModWoodTypes.IVORY_KINGSWOOD));
    public static final RegistryObject<Block> IVORY_KINGSWOOD_PLANKS_WALL_HANGING_SIGN = ALFHEIMR_BLOCKS.register("ivory_kingswood_planks_wall_hanging_sign", () -> new ModWallHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_HANGING_SIGN), ModWoodTypes.IVORY_KINGSWOOD));

    //Weaver
    public static final RegistryObject<Block> WEAVER_LOG = registerBlock("weaver_log", () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)));
    public static final RegistryObject<Block> WEAVER_WOOD = registerBlock("weaver_wood", () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)));
    public static final RegistryObject<Block> STRIPPED_WEAVER_LOG = registerBlock("stripped_weaver_log", () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_LOG)));
    public static final RegistryObject<Block> STRIPPED_WEAVER_WOOD = registerBlock("stripped_weaver_wood", () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD)));
    public static final RegistryObject<Block> WEAVER_LEAVES = registerBlock("weaver_leaves", () -> new ModFlammableLeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)));
    public static final RegistryObject<Block> WEAVER_SAPLING = registerBlock("weaver_sapling", () -> new ModSaplingBlock(new WeaverTreeGrower(), BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING), Blocks.DIRT, Blocks.GRASS_BLOCK, Blocks.STONE));
    public static final RegistryObject<Block> WEAVER_PLANKS = registerBlock("weaver_planks", () -> new ModFlammableBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> WEAVER_PLANKS_SLAB = registerBlock("weaver_planks_slab", () -> new ModFlammableSlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB)));
    public static final RegistryObject<Block> WEAVER_PLANKS_STAIRS = registerBlock("weaver_planks_stairs", () -> new ModFlammableStairBlock(() -> AlfheimrBlocks.WEAVER_PLANKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS)));
    public static final RegistryObject<Block> WEAVER_PLANKS_PRESSURE_PLATE = registerBlock("weaver_planks_pressure_plate", () -> new ModFlammablePressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, BlockBehaviour.Properties.copy(Blocks.OAK_PRESSURE_PLATE), ModBlockSetType.WEAVER));
    public static final RegistryObject<Block> WEAVER_PLANKS_DOOR = registerBlock("weaver_planks_door", () -> new ModFlammableDoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_DOOR), ModBlockSetType.WEAVER));
    public static final RegistryObject<Block> WEAVER_PLANKS_TRAPDOOR = registerBlock("weaver_planks_trapdoor", () -> new ModFlammableTrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_TRAPDOOR), ModBlockSetType.WEAVER));
    public static final RegistryObject<Block> WEAVER_PLANKS_FENCE = registerBlock("weaver_planks_fence", () -> new ModFlammableFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE)));
    public static final RegistryObject<Block> WEAVER_PLANKS_FENCE_GATE = registerBlock("weaver_planks_fence_gate", () -> new ModFlammableFenceGateBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE_GATE), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE));
    public static final RegistryObject<Block> WEAVER_PLANKS_BUTTON = registerBlock("weaver_planks_button", () -> new ModFlammableButtonBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_SIGN), ModBlockSetType.WEAVER, 10, false));
    public static final RegistryObject<Block> WEAVER_PLANKS_SIGN = ALFHEIMR_BLOCKS.register("weaver_planks_sign", () -> new ModStandingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SIGN), ModWoodTypes.WEAVER));
    public static final RegistryObject<Block> WEAVER_PLANKS_WALL_SIGN = ALFHEIMR_BLOCKS.register("weaver_planks_wall_sign", () -> new ModWallSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_SIGN), ModWoodTypes.WEAVER));
    public static final RegistryObject<Block> WEAVER_PLANKS_HANGING_SIGN = ALFHEIMR_BLOCKS.register("weaver_planks_hanging_sign", () -> new ModHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_HANGING_SIGN), ModWoodTypes.WEAVER));
    public static final RegistryObject<Block> WEAVER_PLANKS_WALL_HANGING_SIGN = ALFHEIMR_BLOCKS.register("weaver_planks_wall_hanging_sign", () -> new ModWallHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_HANGING_SIGN), ModWoodTypes.WEAVER));

    //example
//    public static final RegistryObject<Block> WHITE_OAK_LOG = registerBlock("white_oak_log", () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)));
//    public static final RegistryObject<Block> WHITE_OAK_WOOD = registerBlock("white_oak_wood", () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)));
//    public static final RegistryObject<Block> STRIPPED_WHITE_OAK_LOG = registerBlock("stripped_white_oak_log", () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_LOG)));
//    public static final RegistryObject<Block> STRIPPED_WHITE_OAK_WOOD = registerBlock("stripped_white_oak_wood", () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD)));
//    public static final RegistryObject<Block> WHITE_OAK_LEAVES = registerBlock("white_oak_leaves", () -> new ModFlammableLeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)));
//    public static final RegistryObject<Block> WHITE_OAK_SAPLING = registerBlock("white_oak_sapling", () -> new ModSaplingBlock(new CypressTreeGrower(), BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING), Blocks.DIRT, Blocks.GRASS_BLOCK, Blocks.STONE));
//    public static final RegistryObject<Block> WHITE_OAK_PLANKS = registerBlock("white_oak_planks", () -> new ModFlammableBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
//    public static final RegistryObject<Block> WHITE_OAK_PLANKS_SLAB = registerBlock("white_oak_planks_slab", () -> new ModFlammableSlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB)));
//    public static final RegistryObject<Block> WHITE_OAK_PLANKS_STAIRS = registerBlock("white_oak_planks_stairs", () -> new ModFlammableStairBlock(() -> AlfheimrBlocks.WHITE_OAK_PLANKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS)));
//    public static final RegistryObject<Block> WHITE_OAK_PLANKS_PRESSURE_PLATE = registerBlock("white_oak_planks_pressure_plate", () -> new ModFlammablePressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, BlockBehaviour.Properties.copy(Blocks.OAK_PRESSURE_PLATE), ModBlockSetType.WHITE_OAK));
//    public static final RegistryObject<Block> WHITE_OAK_PLANKS_DOOR = registerBlock("white_oak_planks_door", () -> new ModFlammableDoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_DOOR), ModBlockSetType.WHITE_OAK));
//    public static final RegistryObject<Block> WHITE_OAK_PLANKS_TRAPDOOR = registerBlock("white_oak_planks_trapdoor", () -> new ModFlammableTrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_TRAPDOOR), ModBlockSetType.WHITE_OAK));
//    public static final RegistryObject<Block> WHITE_OAK_PLANKS_FENCE = registerBlock("white_oak_planks_fence", () -> new ModFlammableFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE)));
//    public static final RegistryObject<Block> WHITE_OAK_PLANKS_FENCE_GATE = registerBlock("white_oak_planks_fence_gate", () -> new ModFlammableFenceGateBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE_GATE), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE));
//    public static final RegistryObject<Block> WHITE_OAK_PLANKS_BUTTON = registerBlock("white_oak_planks_button", () -> new ModFlammableButtonBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_SIGN), ModBlockSetType.WHITE_OAK, 10, false));
//    public static final RegistryObject<Block> WHITE_OAK_PLANKS_SIGN = register("white_oak_planks_sign", () -> new ModStandingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SIGN), ModWoodTypes.WHITE_OAK));
//    public static final RegistryObject<Block> WHITE_OAK_PLANKS_WALL_SIGN = register("white_oak_planks_wall_sign", () -> new ModWallSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_SIGN), ModWoodTypes.WHITE_OAK));
//    public static final RegistryObject<Block> WHITE_OAK_PLANKS_HANGING_SIGN = register("white_oak_planks_hanging_sign", () -> new ModHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_HANGING_SIGN), ModWoodTypes.WHITE_OAK));
//    public static final RegistryObject<Block> WHITE_OAK_PLANKS_WALL_HANGING_SIGN = register("white_oak_planks_wall_hanging_sign", () -> new ModWallHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_HANGING_SIGN), ModWoodTypes.WHITE_OAK));

    /*
    Metals
     */
    /*
     *Mushroom
     */
    public static final RegistryObject<Block> POINT_MUSHROOM_BLOCK = registerBlock("point_mushroom_block", () -> new FlowerBlock(() -> MobEffects.MOVEMENT_SPEED, 1, BlockBehaviour.Properties.copy(Blocks.BROWN_MUSHROOM_BLOCK).noCollission().noOcclusion()));
    public static final RegistryObject<Block> POTTED_POINT_MUSHROOM_BLOCK = registerBlock("potted_point_mushroom_block", () -> new FlowerPotBlock((() -> (FlowerPotBlock) Blocks.FLOWER_POT), POINT_MUSHROOM_BLOCK, BlockBehaviour.Properties.copy(Blocks.BROWN_MUSHROOM_BLOCK)));
    public static final RegistryObject<Block> TOP_POINT_MUSHROOM_BLOCK = registerBlock("top_point_mushroom_block", () -> new Block(BlockBehaviour.Properties.copy(Blocks.MUSHROOM_STEM)));
    public static final RegistryObject<Block> POINT_MUSHROOM_STEM_BLOCK = registerBlock("point_mushroom_stem_block", () -> new Block(BlockBehaviour.Properties.copy(Blocks.MUSHROOM_STEM)));

    public static final RegistryObject<Block> WITCHES_MUSHROOM_BLOCK = registerBlock("witches_mushroom_block", () -> new FlowerBlock(() -> MobEffects.MOVEMENT_SPEED, 1, BlockBehaviour.Properties.copy(Blocks.BROWN_MUSHROOM_BLOCK).noCollission().noOcclusion()));
    public static final RegistryObject<Block> POTTED_WITCHES_MUSHROOM_BLOCK = registerBlock("potted_witches_mushroom_block", () -> new FlowerPotBlock((() -> (FlowerPotBlock) Blocks.FLOWER_POT), WITCHES_MUSHROOM_BLOCK, BlockBehaviour.Properties.copy(Blocks.BROWN_MUSHROOM_BLOCK)));
    public static final RegistryObject<Block> TOP_WITCHES_MUSHROOM_BLOCK = registerBlock("top_witches_mushroom_block", () -> new Block(BlockBehaviour.Properties.copy(Blocks.MUSHROOM_STEM)));
    public static final RegistryObject<Block> WITCHES_MUSHROOM_STEM_BLOCK = registerBlock("witches_mushroom_stem_block", () -> new Block(BlockBehaviour.Properties.copy(Blocks.MUSHROOM_STEM)));

    public static final RegistryObject<Block> ROYAL_BLUE_MUSHROOM_BLOCK = registerBlock("royal_blue_mushroom_block", () -> new FlowerBlock(() -> MobEffects.MOVEMENT_SPEED, 1, BlockBehaviour.Properties.copy(Blocks.BROWN_MUSHROOM_BLOCK).noCollission().noOcclusion()));
    public static final RegistryObject<Block> POTTED_ROYAL_BLUE_MUSHROOM_BLOCK = registerBlock("potted_royal_blue_mushroom_block", () -> new FlowerPotBlock((() -> (FlowerPotBlock) Blocks.FLOWER_POT), ROYAL_BLUE_MUSHROOM_BLOCK, BlockBehaviour.Properties.copy(Blocks.BROWN_MUSHROOM_BLOCK)));
    public static final RegistryObject<Block> TOP_ROYAL_BLUE_MUSHROOM_BLOCK = registerBlock("top_royal_blue_mushroom_block", () -> new Block(BlockBehaviour.Properties.copy(Blocks.MUSHROOM_STEM)));
    public static final RegistryObject<Block> ROYAL_BLUE_MUSHROOM_STEM_BLOCK = registerBlock("royal_blue_mushroom_stem_block", () -> new Block(BlockBehaviour.Properties.copy(Blocks.MUSHROOM_STEM)));
    public static final RegistryObject<Block> ROYAL_BLUE_MUSHROOM_GLOW_BLOCK = registerBlock("royal_blue_mushroom_glow_block", () -> new Block(BlockBehaviour.Properties.copy(Blocks.MUSHROOM_STEM).lightLevel((p_50755_) -> { return 7; })));

    public static final RegistryObject<Block> SHORT_TOP_MUSHROOM_BLOCK = registerBlock("short_top_mushroom_block", () -> new FlowerBlock(() -> MobEffects.MOVEMENT_SPEED, 1, BlockBehaviour.Properties.copy(Blocks.BROWN_MUSHROOM_BLOCK).noCollission().noOcclusion()));
    public static final RegistryObject<Block> POTTED_SHORT_TOP_MUSHROOM_BLOCK = registerBlock("potted_short_top_mushroom_block", () -> new FlowerPotBlock((() -> (FlowerPotBlock) Blocks.FLOWER_POT), SHORT_TOP_MUSHROOM_BLOCK, BlockBehaviour.Properties.copy(Blocks.BROWN_MUSHROOM_BLOCK)));
    public static final RegistryObject<Block> TOP_SHORT_TOP_MUSHROOM_BLOCK = registerBlock("top_short_top_mushroom_block", () -> new Block(BlockBehaviour.Properties.copy(Blocks.MUSHROOM_STEM)));
    public static final RegistryObject<Block> SHORT_TOP_MUSHROOM_STEM_BLOCK = registerBlock("short_top_mushroom_stem_block", () -> new Block(BlockBehaviour.Properties.copy(Blocks.MUSHROOM_STEM)));

    public static final RegistryObject<Block> SPECTRAL_MUSHROOM_BLOCK = registerBlock("spectral_mushroom_block", () -> new FlowerBlock(() -> MobEffects.MOVEMENT_SPEED, 1, BlockBehaviour.Properties.copy(Blocks.BROWN_MUSHROOM_BLOCK).noCollission().noOcclusion()));
    public static final RegistryObject<Block> POTTED_SPECTRAL_MUSHROOM_BLOCK = registerBlock("potted_spectral_mushroom_block", () -> new FlowerPotBlock((() -> (FlowerPotBlock) Blocks.FLOWER_POT), SPECTRAL_MUSHROOM_BLOCK, BlockBehaviour.Properties.copy(Blocks.BROWN_MUSHROOM_BLOCK)));
    public static final RegistryObject<Block> TOP_SPECTRAL_MUSHROOM_BLOCK = registerBlock("top_spectral_mushroom_block", () -> new Block(BlockBehaviour.Properties.copy(Blocks.MUSHROOM_STEM)));
    public static final RegistryObject<Block> SPECTRAL_MUSHROOM_STEM_BLOCK = registerBlock("spectral_mushroom_stem_block", () -> new Block(BlockBehaviour.Properties.copy(Blocks.MUSHROOM_STEM)));

    public static final RegistryObject<Block> SHADE_MUSHROOM_BLOCK = registerBlock("shade_mushroom_block", () -> new FlowerBlock(() -> MobEffects.MOVEMENT_SPEED, 1, BlockBehaviour.Properties.copy(Blocks.BROWN_MUSHROOM_BLOCK)));
    public static final RegistryObject<Block> POTTED_SHADE_MUSHROOM_BLOCK = registerBlock("potted_shade_mushroom_block", () -> new FlowerPotBlock((() -> (FlowerPotBlock) Blocks.FLOWER_POT), SHADE_MUSHROOM_BLOCK, BlockBehaviour.Properties.copy(Blocks.BROWN_MUSHROOM_BLOCK)));
    public static final RegistryObject<Block> SHADE_MUSHROOM_VINE_BLOCK = registerBlock("shade_mushroom_vine_block", () -> new Block(BlockBehaviour.Properties.copy(Blocks.VINE)));

    public static final RegistryObject<Block> CAP_MUSHROOM_BLOCK = registerBlock("cap_mushroom_block", () -> new FlowerBlock(() -> MobEffects.MOVEMENT_SPEED, 1, BlockBehaviour.Properties.copy(Blocks.BROWN_MUSHROOM_BLOCK)));
    public static final RegistryObject<Block> POTTED_CAP_MUSHROOM_BLOCK = registerBlock("potted_cap_mushroom_block", () -> new FlowerPotBlock((() -> (FlowerPotBlock) Blocks.FLOWER_POT), CAP_MUSHROOM_BLOCK, BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION)));
    public static final RegistryObject<Block> CAP_MUSHROOM_VINE_BLOCK = registerBlock("cap_mushroom_vine_block", () -> new Block(BlockBehaviour.Properties.copy(Blocks.VINE)));

    /*
     FLOWERS
     */
    //Black
//    public static final RegistryObject<Block> _FLOWER = registerBlock("_flower", () -> new FlowerBlock(() -> MobEffects.MOVEMENT_SPEED, 1, BlockBehaviour.Properties.copy(Blocks.DANDELION)));
//    public static final RegistryObject<Block> POTTED__FLOWER = BLOCKS.register("potted__flower", () -> new FlowerPotBlock((() -> (FlowerPotBlock) Blocks.FLOWER_POT), _FLOWER, BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION)));
    public static final RegistryObject<Block> DARK_BLOOM_FLOWER = registerBlock("dark_bloom_flower", () -> new FlowerBlock(() -> MobEffects.MOVEMENT_SPEED, 1, BlockBehaviour.Properties.copy(Blocks.DANDELION)));
    public static final RegistryObject<Block> POTTED_DARK_BLOOM_FLOWER = ALFHEIMR_BLOCKS.register("potted_dark_bloom_flower", () -> new FlowerPotBlock((() -> (FlowerPotBlock) Blocks.FLOWER_POT), DARK_BLOOM_FLOWER, BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION)));
    public static final RegistryObject<Block> DREAD_NIGHT_FLOWER = registerBlock("dread_night_flower", () -> new FlowerBlock(() -> MobEffects.MOVEMENT_SPEED, 1, BlockBehaviour.Properties.copy(Blocks.DANDELION)));
    public static final RegistryObject<Block> POTTED_DREAD_NIGIHT_FLOWER = ALFHEIMR_BLOCKS.register("potted_dread_night_flower", () -> new FlowerPotBlock((() -> (FlowerPotBlock) Blocks.FLOWER_POT), DREAD_NIGHT_FLOWER, BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION)));
    public static final RegistryObject<Block> BLACK_LOTUS_FLOWER = registerBlock("black_lotus_flower", () -> new FlowerBlock(() -> MobEffects.MOVEMENT_SPEED, 1, BlockBehaviour.Properties.copy(Blocks.DANDELION)));
    public static final RegistryObject<Block> POTTED_BLACK_LOTUS_FLOWER = ALFHEIMR_BLOCKS.register("potted_black_lotus_flower", () -> new FlowerPotBlock((() -> (FlowerPotBlock) Blocks.FLOWER_POT), BLACK_LOTUS_FLOWER, BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION)));
    public static final RegistryObject<Block> NIGHT_ROSE_FLOWER = registerBlock("night_rose_flower", () -> new FlowerBlock(() -> MobEffects.MOVEMENT_SPEED, 1, BlockBehaviour.Properties.copy(Blocks.DANDELION)));
    public static final RegistryObject<Block> POTTED_NIGHT_ROSE_FLOWER = ALFHEIMR_BLOCKS.register("potted_night_rose_flower", () -> new FlowerPotBlock((() -> (FlowerPotBlock) Blocks.FLOWER_POT), NIGHT_ROSE_FLOWER, BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION)));

    //Blue
//    public static final RegistryObject<Block> _FLOWER = registerBlock("_flower", () -> new FlowerBlock(() -> MobEffects.MOVEMENT_SPEED, 1, BlockBehaviour.Properties.copy(Blocks.DANDELION)));
//    public static final RegistryObject<Block> POTTED__FLOWER = BLOCKS.register("potted__flower", () -> new FlowerPotBlock((() -> (FlowerPotBlock) Blocks.FLOWER_POT), _FLOWER, BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION)));
    public static final RegistryObject<Block> AQUA_ROSE_FLOWER = registerBlock("aqua_rose_flower", () -> new FlowerBlock(() -> MobEffects.MOVEMENT_SPEED, 1, BlockBehaviour.Properties.copy(Blocks.DANDELION)));
    public static final RegistryObject<Block> POTTED_AQUA_ROSE_FLOWER = ALFHEIMR_BLOCKS.register("potted_aqua_rose_flower", () -> new FlowerPotBlock((() -> (FlowerPotBlock) Blocks.FLOWER_POT), AQUA_ROSE_FLOWER, BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION)));
    public static final RegistryObject<Block> MOON_FLOWER = registerBlock("moon_flower", () -> new FlowerBlock(() -> MobEffects.MOVEMENT_SPEED, 1, BlockBehaviour.Properties.copy(Blocks.DANDELION)));
    public static final RegistryObject<Block> POTTED_MOON_FLOWER = ALFHEIMR_BLOCKS.register("potted_moon_flower", () -> new FlowerPotBlock((() -> (FlowerPotBlock) Blocks.FLOWER_POT), MOON_FLOWER, BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION)));
    public static final RegistryObject<Block> CATHERINE_FLOWER = registerBlock("catherine_flower", () -> new FlowerBlock(() -> MobEffects.MOVEMENT_SPEED, 1, BlockBehaviour.Properties.copy(Blocks.DANDELION)));
    public static final RegistryObject<Block> POTTED_CATHERINE_FLOWER = ALFHEIMR_BLOCKS.register("potted_catherine_flower", () -> new FlowerPotBlock((() -> (FlowerPotBlock) Blocks.FLOWER_POT), CATHERINE_FLOWER, BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION)));
    public static final RegistryObject<Block> TAINTED_ROSE_FLOWER = registerBlock("tainted_rose_flower", () -> new FlowerBlock(() -> MobEffects.MOVEMENT_SPEED, 1, BlockBehaviour.Properties.copy(Blocks.DANDELION)));
    public static final RegistryObject<Block> POTTED_TAINTED_ROSE_FLOWER = ALFHEIMR_BLOCKS.register("potted_tainted_rose_flower", () -> new FlowerPotBlock((() -> (FlowerPotBlock) Blocks.FLOWER_POT), TAINTED_ROSE_FLOWER, BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION)));

    //Brown
//    public static final RegistryObject<Block> _FLOWER = registerBlock("_flower", () -> new FlowerBlock(() -> MobEffects.MOVEMENT_SPEED, 1, BlockBehaviour.Properties.copy(Blocks.DANDELION)));
//    public static final RegistryObject<Block> POTTED__FLOWER = BLOCKS.register("potted__flower", () -> new FlowerPotBlock((() -> (FlowerPotBlock) Blocks.FLOWER_POT), _FLOWER, BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION)));
    public static final RegistryObject<Block> CINNAMON_ROSE_FLOWER = registerBlock("cinnamon_rose_flower", () -> new FlowerBlock(() -> MobEffects.MOVEMENT_SPEED, 1, BlockBehaviour.Properties.copy(Blocks.DANDELION)));
    public static final RegistryObject<Block> POTTED_CINNAMON_ROSE_FLOWER = ALFHEIMR_BLOCKS.register("potted_cinnamon_rose_flower", () -> new FlowerPotBlock((() -> (FlowerPotBlock) Blocks.FLOWER_POT), CINNAMON_ROSE_FLOWER, BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION)));
    public static final RegistryObject<Block> BUTTERFLY_FLOWER = registerBlock("butterfly_flower", () -> new FlowerBlock(() -> MobEffects.MOVEMENT_SPEED, 1, BlockBehaviour.Properties.copy(Blocks.DANDELION)));
    public static final RegistryObject<Block> POTTED_BUTTERFLY_FLOWER = ALFHEIMR_BLOCKS.register("potted_butterfly_flower", () -> new FlowerPotBlock((() -> (FlowerPotBlock) Blocks.FLOWER_POT), BUTTERFLY_FLOWER, BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION)));
    public static final RegistryObject<Block> GAIA_TULIP_FLOWER = registerBlock("gaia_tulip_flower", () -> new FlowerBlock(() -> MobEffects.MOVEMENT_SPEED, 1, BlockBehaviour.Properties.copy(Blocks.DANDELION)));
    public static final RegistryObject<Block> POTTED_GAIA_TULIP_FLOWER = ALFHEIMR_BLOCKS.register("potted_gaia_tulip_flower", () -> new FlowerPotBlock((() -> (FlowerPotBlock) Blocks.FLOWER_POT), GAIA_TULIP_FLOWER, BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION)));
    public static final RegistryObject<Block> BEARDED_IRIS_FLOWER = registerBlock("bearded_iris_flower", () -> new FlowerBlock(() -> MobEffects.MOVEMENT_SPEED, 1, BlockBehaviour.Properties.copy(Blocks.DANDELION)));
    public static final RegistryObject<Block> POTTED_BEARDED_IRIS_FLOWER = ALFHEIMR_BLOCKS.register("potted_bearded_iris_flower", () -> new FlowerPotBlock((() -> (FlowerPotBlock) Blocks.FLOWER_POT), BEARDED_IRIS_FLOWER, BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION)));

    //Cyan
//    public static final RegistryObject<Block> _FLOWER = registerBlock("_flower", () -> new FlowerBlock(() -> MobEffects.MOVEMENT_SPEED, 1, BlockBehaviour.Properties.copy(Blocks.DANDELION)));
//    public static final RegistryObject<Block> POTTED__FLOWER = BLOCKS.register("potted__flower", () -> new FlowerPotBlock((() -> (FlowerPotBlock) Blocks.FLOWER_POT), _FLOWER, BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION)));
    public static final RegistryObject<Block> CORNFLOWER_FLOWER = registerBlock("cornflower_flower", () -> new FlowerBlock(() -> MobEffects.MOVEMENT_SPEED, 1, BlockBehaviour.Properties.copy(Blocks.DANDELION)));
    public static final RegistryObject<Block> POTTED_CORNFLOWER_FLOWER = ALFHEIMR_BLOCKS.register("potted_cornflower_flower", () -> new FlowerPotBlock((() -> (FlowerPotBlock) Blocks.FLOWER_POT), CORNFLOWER_FLOWER, BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION)));
    public static final RegistryObject<Block> MORNING_GLORY_FLOWER = registerBlock("morning_glory_flower", () -> new FlowerBlock(() -> MobEffects.MOVEMENT_SPEED, 1, BlockBehaviour.Properties.copy(Blocks.DANDELION)));
    public static final RegistryObject<Block> POTTED_MORNING_GLORY_FLOWER = ALFHEIMR_BLOCKS.register("potted_morning_glory_flower", () -> new FlowerPotBlock((() -> (FlowerPotBlock) Blocks.FLOWER_POT), MORNING_GLORY_FLOWER, BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION)));
    public static final RegistryObject<Block> GEORGIA_BLUE_FLOWER = registerBlock("georgia_blue_flower", () -> new FlowerBlock(() -> MobEffects.MOVEMENT_SPEED, 1, BlockBehaviour.Properties.copy(Blocks.DANDELION)));
    public static final RegistryObject<Block> POTTED_GEORGIA_BLUE_FLOWER = ALFHEIMR_BLOCKS.register("potted_georgia_blue_flower", () -> new FlowerPotBlock((() -> (FlowerPotBlock) Blocks.FLOWER_POT), GEORGIA_BLUE_FLOWER, BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION)));
    public static final RegistryObject<Block> BLUE_POPPY_FLOWER = registerBlock("blue_poppy_flower", () -> new FlowerBlock(() -> MobEffects.MOVEMENT_SPEED, 1, BlockBehaviour.Properties.copy(Blocks.DANDELION)));
    public static final RegistryObject<Block> POTTED_BLUE_POPPY_FLOWER = ALFHEIMR_BLOCKS.register("potted_blue_poppy_flower", () -> new FlowerPotBlock((() -> (FlowerPotBlock) Blocks.FLOWER_POT), BLUE_POPPY_FLOWER, BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION)));

    //Green
//    public static final RegistryObject<Block> _FLOWER = registerBlock("_flower", () -> new FlowerBlock(() -> MobEffects.MOVEMENT_SPEED, 1, BlockBehaviour.Properties.copy(Blocks.DANDELION)));
//    public static final RegistryObject<Block> POTTED__FLOWER = BLOCKS.register("potted__flower", () -> new FlowerPotBlock((() -> (FlowerPotBlock) Blocks.FLOWER_POT), _FLOWER, BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION)));
    public static final RegistryObject<Block> TULIP_FLOWER = registerBlock("tulip_flower", () -> new FlowerBlock(() -> MobEffects.MOVEMENT_SPEED, 1, BlockBehaviour.Properties.copy(Blocks.DANDELION)));
    public static final RegistryObject<Block> POTTED_TULIP_FLOWER = ALFHEIMR_BLOCKS.register("potted_tulip_flower", () -> new FlowerPotBlock((() -> (FlowerPotBlock) Blocks.FLOWER_POT), TULIP_FLOWER, BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION)));
    public static final RegistryObject<Block> CARNATION_FLOWER = registerBlock("carnation_flower", () -> new FlowerBlock(() -> MobEffects.MOVEMENT_SPEED, 1, BlockBehaviour.Properties.copy(Blocks.DANDELION)));
    public static final RegistryObject<Block> POTTED_CARNATION_FLOWER = ALFHEIMR_BLOCKS.register("potted_carnation_flower", () -> new FlowerPotBlock((() -> (FlowerPotBlock) Blocks.FLOWER_POT), CARNATION_FLOWER, BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION)));
    public static final RegistryObject<Block> LADYS_MANTLE_FLOWER = registerBlock("ladys_mantle_flower", () -> new FlowerBlock(() -> MobEffects.MOVEMENT_SPEED, 1, BlockBehaviour.Properties.copy(Blocks.DANDELION)));
    public static final RegistryObject<Block> POTTED_LADYS_MANTLE_FLOWER = ALFHEIMR_BLOCKS.register("potted_ladys_mantle_flower", () -> new FlowerPotBlock((() -> (FlowerPotBlock) Blocks.FLOWER_POT), LADYS_MANTLE_FLOWER, BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION)));
    public static final RegistryObject<Block> GREEN_ROSE_FLOWER = registerBlock("green_rose_flower", () -> new FlowerBlock(() -> MobEffects.MOVEMENT_SPEED, 1, BlockBehaviour.Properties.copy(Blocks.DANDELION)));
    public static final RegistryObject<Block> POTTED_GREEN_ROSE_FLOWER = ALFHEIMR_BLOCKS.register("potted_green_rose_flower", () -> new FlowerPotBlock((() -> (FlowerPotBlock) Blocks.FLOWER_POT), GREEN_ROSE_FLOWER, BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION)));

    //Light Blue
//    public static final RegistryObject<Block> _FLOWER = registerBlock("_flower", () -> new FlowerBlock(() -> MobEffects.MOVEMENT_SPEED, 1, BlockBehaviour.Properties.copy(Blocks.DANDELION)));
//    public static final RegistryObject<Block> POTTED__FLOWER = BLOCKS.register("potted__flower", () -> new FlowerPotBlock((() -> (FlowerPotBlock) Blocks.FLOWER_POT), _FLOWER, BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION)));
    public static final RegistryObject<Block> CLEMATIS_FLOWER = registerBlock("clematis_flower", () -> new FlowerBlock(() -> MobEffects.MOVEMENT_SPEED, 1, BlockBehaviour.Properties.copy(Blocks.DANDELION)));
    public static final RegistryObject<Block> POTTED_CLEMATIS_FLOWER = ALFHEIMR_BLOCKS.register("potted_clematis_flower", () -> new FlowerPotBlock((() -> (FlowerPotBlock) Blocks.FLOWER_POT), CLEMATIS_FLOWER, BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION)));
    public static final RegistryObject<Block> BLUE_STAR_FLOWER = registerBlock("blue_star_flower", () -> new FlowerBlock(() -> MobEffects.MOVEMENT_SPEED, 1, BlockBehaviour.Properties.copy(Blocks.DANDELION)));
    public static final RegistryObject<Block> POTTED_BLUE_STAR_FLOWER = ALFHEIMR_BLOCKS.register("potted_blue_star_flower", () -> new FlowerPotBlock((() -> (FlowerPotBlock) Blocks.FLOWER_POT), BLUE_STAR_FLOWER, BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION)));
    public static final RegistryObject<Block> SALVIA_FLOWER = registerBlock("salvia_flower", () -> new FlowerBlock(() -> MobEffects.MOVEMENT_SPEED, 1, BlockBehaviour.Properties.copy(Blocks.DANDELION)));
    public static final RegistryObject<Block> POTTED_SALVIA_FLOWER = ALFHEIMR_BLOCKS.register("potted_salvia_flower", () -> new FlowerPotBlock((() -> (FlowerPotBlock) Blocks.FLOWER_POT), SALVIA_FLOWER, BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION)));
    public static final RegistryObject<Block> FALSE_INDIGO_FLOWER = registerBlock("false_indigo_flower", () -> new FlowerBlock(() -> MobEffects.MOVEMENT_SPEED, 1, BlockBehaviour.Properties.copy(Blocks.DANDELION)));
    public static final RegistryObject<Block> POTTED_FALSE_INDIGO_FLOWER = ALFHEIMR_BLOCKS.register("potted_false_indigo_flower", () -> new FlowerPotBlock((() -> (FlowerPotBlock) Blocks.FLOWER_POT), FALSE_INDIGO_FLOWER, BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION)));

    //Light Gray
//    public static final RegistryObject<Block> _FLOWER = registerBlock("_flower", () -> new FlowerBlock(() -> MobEffects.MOVEMENT_SPEED, 1, BlockBehaviour.Properties.copy(Blocks.DANDELION)));
//    public static final RegistryObject<Block> POTTED__FLOWER = BLOCKS.register("potted__flower", () -> new FlowerPotBlock((() -> (FlowerPotBlock) Blocks.FLOWER_POT), _FLOWER, BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION)));
    public static final RegistryObject<Block> WHITE_SAGE_FLOWER = registerBlock("white_sage_flower", () -> new FlowerBlock(() -> MobEffects.MOVEMENT_SPEED, 1, BlockBehaviour.Properties.copy(Blocks.DANDELION)));
    public static final RegistryObject<Block> POTTED_WHITE_SAGE_FLOWER = ALFHEIMR_BLOCKS.register("potted_white_sage_flower", () -> new FlowerPotBlock((() -> (FlowerPotBlock) Blocks.FLOWER_POT), WHITE_SAGE_FLOWER, BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION)));
    public static final RegistryObject<Block> SILVER_SCHEHERAZADE_FLOWER = registerBlock("silver_scheherazade_flower", () -> new FlowerBlock(() -> MobEffects.MOVEMENT_SPEED, 1, BlockBehaviour.Properties.copy(Blocks.DANDELION)));
    public static final RegistryObject<Block> POTTED_SILVER_SCHEHERAZADE_FLOWER = ALFHEIMR_BLOCKS.register("potted_silver_scheherazade_flower", () -> new FlowerPotBlock((() -> (FlowerPotBlock) Blocks.FLOWER_POT), SILVER_SCHEHERAZADE_FLOWER, BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION)));
    public static final RegistryObject<Block> SILVER_SPRING_FLOWER = registerBlock("silver_spring_flower", () -> new FlowerBlock(() -> MobEffects.MOVEMENT_SPEED, 1, BlockBehaviour.Properties.copy(Blocks.DANDELION)));
    public static final RegistryObject<Block> POTTED_SILVER_SPRING_FLOWER = ALFHEIMR_BLOCKS.register("potted_silver_spring_flower", () -> new FlowerPotBlock((() -> (FlowerPotBlock) Blocks.FLOWER_POT), SILVER_SPRING_FLOWER, BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION)));
    public static final RegistryObject<Block> SILVER_SHADOWS_FLOWER = registerBlock("silver_shadows_flower", () -> new FlowerBlock(() -> MobEffects.MOVEMENT_SPEED, 1, BlockBehaviour.Properties.copy(Blocks.DANDELION)));
    public static final RegistryObject<Block> POTTED_SILVER_SHADOWS_FLOWER = ALFHEIMR_BLOCKS.register("potted_silver_shadows_flower", () -> new FlowerPotBlock((() -> (FlowerPotBlock) Blocks.FLOWER_POT), SILVER_SHADOWS_FLOWER, BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION)));

    //Lime
//    public static final RegistryObject<Block> _FLOWER = registerBlock("_flower", () -> new FlowerBlock(() -> MobEffects.MOVEMENT_SPEED, 1, BlockBehaviour.Properties.copy(Blocks.DANDELION)));
//    public static final RegistryObject<Block> POTTED__FLOWER = BLOCKS.register("potted__flower", () -> new FlowerPotBlock((() -> (FlowerPotBlock) Blocks.FLOWER_POT), _FLOWER, BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION)));
    public static final RegistryObject<Block> GREEN_BALL_FLOWER = registerBlock("green_ball_flower", () -> new FlowerBlock(() -> MobEffects.MOVEMENT_SPEED, 1, BlockBehaviour.Properties.copy(Blocks.DANDELION)));
    public static final RegistryObject<Block> POTTED_GREEN_BALL_FLOWER = ALFHEIMR_BLOCKS.register("potted_green_ball_flower", () -> new FlowerPotBlock((() -> (FlowerPotBlock) Blocks.FLOWER_POT), GREEN_BALL_FLOWER, BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION)));
    public static final RegistryObject<Block> LIME_DAHLIA_FLOWER = registerBlock("lime_dahlia_flower", () -> new FlowerBlock(() -> MobEffects.MOVEMENT_SPEED, 1, BlockBehaviour.Properties.copy(Blocks.DANDELION)));
    public static final RegistryObject<Block> POTTED_LIME_DAHLIA_FLOWER = ALFHEIMR_BLOCKS.register("potted_lime_dahlia_flower", () -> new FlowerPotBlock((() -> (FlowerPotBlock) Blocks.FLOWER_POT), LIME_DAHLIA_FLOWER, BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION)));
    public static final RegistryObject<Block> HYDRANGEA_FLOWER = registerBlock("hydrangea_flower", () -> new FlowerBlock(() -> MobEffects.MOVEMENT_SPEED, 1, BlockBehaviour.Properties.copy(Blocks.DANDELION)));
    public static final RegistryObject<Block> POTTED_HYDRANGEA_FLOWER = ALFHEIMR_BLOCKS.register("potted_hydrangea_flower", () -> new FlowerPotBlock((() -> (FlowerPotBlock) Blocks.FLOWER_POT), HYDRANGEA_FLOWER, BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION)));
    public static final RegistryObject<Block> ZINNIA_FLOWER = registerBlock("zinnia_flower", () -> new FlowerBlock(() -> MobEffects.MOVEMENT_SPEED, 1, BlockBehaviour.Properties.copy(Blocks.DANDELION)));
    public static final RegistryObject<Block> POTTED_ZINNIA_FLOWER = ALFHEIMR_BLOCKS.register("potted_zinnia_flower", () -> new FlowerPotBlock((() -> (FlowerPotBlock) Blocks.FLOWER_POT), ZINNIA_FLOWER, BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION)));

    //Magenta
//    public static final RegistryObject<Block> _FLOWER = registerBlock("_flower", () -> new FlowerBlock(() -> MobEffects.MOVEMENT_SPEED, 1, BlockBehaviour.Properties.copy(Blocks.DANDELION)));
//    public static final RegistryObject<Block> POTTED__FLOWER = BLOCKS.register("potted__flower", () -> new FlowerPotBlock((() -> (FlowerPotBlock) Blocks.FLOWER_POT), _FLOWER, BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION)));
    public static final RegistryObject<Block> BUTTERFLY_CANDY_FLOWER = registerBlock("butterfly_candy_flower", () -> new FlowerBlock(() -> MobEffects.MOVEMENT_SPEED, 1, BlockBehaviour.Properties.copy(Blocks.DANDELION)));
    public static final RegistryObject<Block> POTTED_BUTTERFLY_CANDY_FLOWER = ALFHEIMR_BLOCKS.register("potted_butterfly_candy_flower", () -> new FlowerPotBlock((() -> (FlowerPotBlock) Blocks.FLOWER_POT), BUTTERFLY_CANDY_FLOWER, BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION)));
    public static final RegistryObject<Block> CABARET_FLOWER = registerBlock("cabaret_flower", () -> new FlowerBlock(() -> MobEffects.MOVEMENT_SPEED, 1, BlockBehaviour.Properties.copy(Blocks.DANDELION)));
    public static final RegistryObject<Block> POTTED_CABARET_FLOWER = ALFHEIMR_BLOCKS.register("potted_cabaret_flower", () -> new FlowerPotBlock((() -> (FlowerPotBlock) Blocks.FLOWER_POT), CABARET_FLOWER, BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION)));
    public static final RegistryObject<Block> DIANTHUS_FLOWER = registerBlock("dianthus_flower", () -> new FlowerBlock(() -> MobEffects.MOVEMENT_SPEED, 1, BlockBehaviour.Properties.copy(Blocks.DANDELION)));
    public static final RegistryObject<Block> POTTED_DIANTHUS_FLOWER = ALFHEIMR_BLOCKS.register("potted_dianthus_flower", () -> new FlowerPotBlock((() -> (FlowerPotBlock) Blocks.FLOWER_POT), DIANTHUS_FLOWER, BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION)));
    public static final RegistryObject<Block> TITAN_CRANBERRY_VINCA_FLOWER = registerBlock("titan_cranberry_vinca_flower", () -> new FlowerBlock(() -> MobEffects.MOVEMENT_SPEED, 1, BlockBehaviour.Properties.copy(Blocks.DANDELION)));
    public static final RegistryObject<Block> POTTED_TITAN_CRANBERRY_VINCA_FLOWER = ALFHEIMR_BLOCKS.register("potted_titan_cranberry_vinca_flower", () -> new FlowerPotBlock((() -> (FlowerPotBlock) Blocks.FLOWER_POT), TITAN_CRANBERRY_VINCA_FLOWER, BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION)));

    //Orange
//    public static final RegistryObject<Block> _FLOWER = registerBlock("_flower", () -> new FlowerBlock(() -> MobEffects.MOVEMENT_SPEED, 1, BlockBehaviour.Properties.copy(Blocks.DANDELION)));
//    public static final RegistryObject<Block> POTTED__FLOWER = BLOCKS.register("potted__flower", () -> new FlowerPotBlock((() -> (FlowerPotBlock) Blocks.FLOWER_POT), _FLOWER, BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION)));
    public static final RegistryObject<Block> ORANGE_ZINNIA_FLOWER = registerBlock("orange_zinnia_flower", () -> new FlowerBlock(() -> MobEffects.MOVEMENT_SPEED, 1, BlockBehaviour.Properties.copy(Blocks.DANDELION)));
    public static final RegistryObject<Block> POTTED_ORANGE_ZINNIA_FLOWER = ALFHEIMR_BLOCKS.register("potted_orange_zinnia_flower", () -> new FlowerPotBlock((() -> (FlowerPotBlock) Blocks.FLOWER_POT), ORANGE_ZINNIA_FLOWER, BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION)));
    public static final RegistryObject<Block> BEGONIA_FLOWER = registerBlock("begonia_flower", () -> new FlowerBlock(() -> MobEffects.MOVEMENT_SPEED, 1, BlockBehaviour.Properties.copy(Blocks.DANDELION)));
    public static final RegistryObject<Block> POTTED_BEGONIA_FLOWER = ALFHEIMR_BLOCKS.register("potted_begonia_flower", () -> new FlowerPotBlock((() -> (FlowerPotBlock) Blocks.FLOWER_POT), BEGONIA_FLOWER, BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION)));
    public static final RegistryObject<Block> CROWN_IMPERIAL_FLOWER = registerBlock("crown_imperial_flower", () -> new FlowerBlock(() -> MobEffects.MOVEMENT_SPEED, 1, BlockBehaviour.Properties.copy(Blocks.DANDELION)));
    public static final RegistryObject<Block> POTTED_CROWN_IMPERIAL_FLOWER = ALFHEIMR_BLOCKS.register("potted_crown_imperial_flower", () -> new FlowerPotBlock((() -> (FlowerPotBlock) Blocks.FLOWER_POT), CROWN_IMPERIAL_FLOWER, BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION)));
    public static final RegistryObject<Block> ORIENTAL_POPPY_FLOWER = registerBlock("oriental_poppy_flower", () -> new FlowerBlock(() -> MobEffects.MOVEMENT_SPEED, 1, BlockBehaviour.Properties.copy(Blocks.DANDELION)));
    public static final RegistryObject<Block> POTTED_ORIENTAL_POPPY_FLOWER = ALFHEIMR_BLOCKS.register("potted_oriental_poppy_flower", () -> new FlowerPotBlock((() -> (FlowerPotBlock) Blocks.FLOWER_POT), ORIENTAL_POPPY_FLOWER, BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION)));

    //Pink
//    public static final RegistryObject<Block> _FLOWER = registerBlock("_flower", () -> new FlowerBlock(() -> MobEffects.MOVEMENT_SPEED, 1, BlockBehaviour.Properties.copy(Blocks.DANDELION)));
//    public static final RegistryObject<Block> POTTED__FLOWER = BLOCKS.register("potted__flower", () -> new FlowerPotBlock((() -> (FlowerPotBlock) Blocks.FLOWER_POT), _FLOWER, BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION)));
    public static final RegistryObject<Block> AZALEA_FLOWER = registerBlock("azalea_flower", () -> new FlowerBlock(() -> MobEffects.MOVEMENT_SPEED, 1, BlockBehaviour.Properties.copy(Blocks.DANDELION)));
    public static final RegistryObject<Block> POTTED_AZALEA_FLOWER = ALFHEIMR_BLOCKS.register("potted_azalea_flower", () -> new FlowerPotBlock((() -> (FlowerPotBlock) Blocks.FLOWER_POT), AZALEA_FLOWER, BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION)));
    public static final RegistryObject<Block> PINK_DELIGHT_FLOWER = registerBlock("pink_delight_flower", () -> new FlowerBlock(() -> MobEffects.MOVEMENT_SPEED, 1, BlockBehaviour.Properties.copy(Blocks.DANDELION)));
    public static final RegistryObject<Block> POTTED_PINK_DELIGHT_FLOWER = ALFHEIMR_BLOCKS.register("potted_pink_delight_flower", () -> new FlowerPotBlock((() -> (FlowerPotBlock) Blocks.FLOWER_POT), PINK_DELIGHT_FLOWER, BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION)));
    public static final RegistryObject<Block> CHRYSANTHEMUM_FLOWER = registerBlock("chrysanthemum_flower", () -> new FlowerBlock(() -> MobEffects.MOVEMENT_SPEED, 1, BlockBehaviour.Properties.copy(Blocks.DANDELION)));
    public static final RegistryObject<Block> POTTED_CHRYSANTHEMUM_FLOWER = ALFHEIMR_BLOCKS.register("potted_chrysanthemum_flower", () -> new FlowerPotBlock((() -> (FlowerPotBlock) Blocks.FLOWER_POT), CHRYSANTHEMUM_FLOWER, BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION)));
    public static final RegistryObject<Block> HIBISCUS_FLOWER = registerBlock("hibiscus_flower", () -> new FlowerBlock(() -> MobEffects.MOVEMENT_SPEED, 1, BlockBehaviour.Properties.copy(Blocks.DANDELION)));
    public static final RegistryObject<Block> POTTED_HIBISCUS_FLOWER = ALFHEIMR_BLOCKS.register("potted_hibiscus_flower", () -> new FlowerPotBlock((() -> (FlowerPotBlock) Blocks.FLOWER_POT), HIBISCUS_FLOWER, BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION)));

    //Red
//    public static final RegistryObject<Block> _FLOWER = registerBlock("_flower", () -> new FlowerBlock(() -> MobEffects.MOVEMENT_SPEED, 1, BlockBehaviour.Properties.copy(Blocks.DANDELION)));
//    public static final RegistryObject<Block> POTTED__FLOWER = BLOCKS.register("potted__flower", () -> new FlowerPotBlock((() -> (FlowerPotBlock) Blocks.FLOWER_POT), _FLOWER, BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION)));
    public static final RegistryObject<Block> CARDINAL_FLOWER = registerBlock("cardinal_flower_flower", () -> new FlowerBlock(() -> MobEffects.MOVEMENT_SPEED, 1, BlockBehaviour.Properties.copy(Blocks.DANDELION)));
    public static final RegistryObject<Block> POTTED_CARDINAL_FLOWER = ALFHEIMR_BLOCKS.register("potted_cardinal_flower_flower", () -> new FlowerPotBlock((() -> (FlowerPotBlock) Blocks.FLOWER_POT), CARDINAL_FLOWER, BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION)));
    public static final RegistryObject<Block> GERBERA_FLOWER = registerBlock("gerbera_flower", () -> new FlowerBlock(() -> MobEffects.MOVEMENT_SPEED, 1, BlockBehaviour.Properties.copy(Blocks.DANDELION)));
    public static final RegistryObject<Block> POTTED_GERBERA_FLOWER = ALFHEIMR_BLOCKS.register("potted_gerbera_flower", () -> new FlowerPotBlock((() -> (FlowerPotBlock) Blocks.FLOWER_POT), GERBERA_FLOWER, BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION)));
    public static final RegistryObject<Block> RED_TULIP_FLOWER = registerBlock("red_tulip_flower", () -> new FlowerBlock(() -> MobEffects.MOVEMENT_SPEED, 1, BlockBehaviour.Properties.copy(Blocks.DANDELION)));
    public static final RegistryObject<Block> POTTED_RED_TULIP_FLOWER = ALFHEIMR_BLOCKS.register("potted_red_tulip_flower", () -> new FlowerPotBlock((() -> (FlowerPotBlock) Blocks.FLOWER_POT), RED_TULIP_FLOWER, BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION)));
    public static final RegistryObject<Block> FREESIA_FLOWER = registerBlock("freesia_flower", () -> new FlowerBlock(() -> MobEffects.MOVEMENT_SPEED, 1, BlockBehaviour.Properties.copy(Blocks.DANDELION)));
    public static final RegistryObject<Block> POTTED_FREESIA_FLOWER = ALFHEIMR_BLOCKS.register("potted_freesia_flower", () -> new FlowerPotBlock((() -> (FlowerPotBlock) Blocks.FLOWER_POT), FREESIA_FLOWER, BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION)));

    //White
//    public static final RegistryObject<Block> _FLOWER = registerBlock("_flower", () -> new FlowerBlock(() -> MobEffects.MOVEMENT_SPEED, 1, BlockBehaviour.Properties.copy(Blocks.DANDELION)));
//    public static final RegistryObject<Block> POTTED__FLOWER = BLOCKS.register("potted__flower", () -> new FlowerPotBlock((() -> (FlowerPotBlock) Blocks.FLOWER_POT), _FLOWER, BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION)));
    public static final RegistryObject<Block> GARDENIAS_FLOWER = registerBlock("gardenias_flower", () -> new FlowerBlock(() -> MobEffects.MOVEMENT_SPEED, 1, BlockBehaviour.Properties.copy(Blocks.DANDELION)));
    public static final RegistryObject<Block> POTTED_GARDENIAS_FLOWER = ALFHEIMR_BLOCKS.register("potted_gardenias_flower", () -> new FlowerPotBlock((() -> (FlowerPotBlock) Blocks.FLOWER_POT), GARDENIAS_FLOWER, BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION)));
    public static final RegistryObject<Block> STAR_JASMINE_FLOWER = registerBlock("star_jasmine_flower", () -> new FlowerBlock(() -> MobEffects.MOVEMENT_SPEED, 1, BlockBehaviour.Properties.copy(Blocks.DANDELION)));
    public static final RegistryObject<Block> POTTED_STAR_JASMINE_FLOWER = ALFHEIMR_BLOCKS.register("potted_star_jasmine_flower", () -> new FlowerPotBlock((() -> (FlowerPotBlock) Blocks.FLOWER_POT), STAR_JASMINE_FLOWER, BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION)));
    public static final RegistryObject<Block> WHITE_WARATAH_FLOWER = registerBlock("white_waratah_flower", () -> new FlowerBlock(() -> MobEffects.MOVEMENT_SPEED, 1, BlockBehaviour.Properties.copy(Blocks.DANDELION)));
    public static final RegistryObject<Block> POTTED_WHITE_WARATAH_FLOWER = ALFHEIMR_BLOCKS.register("potted_white_waratah_flower", () -> new FlowerPotBlock((() -> (FlowerPotBlock) Blocks.FLOWER_POT), WHITE_WARATAH_FLOWER, BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION)));
    public static final RegistryObject<Block> FLANNEL_FLOWER = registerBlock("flannel_flower", () -> new FlowerBlock(() -> MobEffects.MOVEMENT_SPEED, 1, BlockBehaviour.Properties.copy(Blocks.DANDELION)));
    public static final RegistryObject<Block> POTTED_FLANNEL_FLOWER = ALFHEIMR_BLOCKS.register("potted_flannel_flower", () -> new FlowerPotBlock((() -> (FlowerPotBlock) Blocks.FLOWER_POT), FLANNEL_FLOWER, BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION)));

    //Yellow
//    public static final RegistryObject<Block> _FLOWER = registerBlock("_flower", () -> new FlowerBlock(() -> MobEffects.MOVEMENT_SPEED, 1, BlockBehaviour.Properties.copy(Blocks.DANDELION)));
//    public static final RegistryObject<Block> POTTED__FLOWER = BLOCKS.register("potted__flower", () -> new FlowerPotBlock((() -> (FlowerPotBlock) Blocks.FLOWER_POT), _FLOWER, BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION)));
    public static final RegistryObject<Block> BEARS_EARS_FLOWER = registerBlock("bears_ears_flower", () -> new FlowerBlock(() -> MobEffects.MOVEMENT_SPEED, 1, BlockBehaviour.Properties.copy(Blocks.DANDELION)));
    public static final RegistryObject<Block> POTTED_BEARS_EARS_FLOWER = ALFHEIMR_BLOCKS.register("potted_bears_ears_flower", () -> new FlowerPotBlock((() -> (FlowerPotBlock) Blocks.FLOWER_POT), BEARS_EARS_FLOWER, BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION)));
    public static final RegistryObject<Block> BIDENS_FLOWER = registerBlock("bidens_flower", () -> new FlowerBlock(() -> MobEffects.MOVEMENT_SPEED, 1, BlockBehaviour.Properties.copy(Blocks.DANDELION)));
    public static final RegistryObject<Block> POTTED_BIDENS_FLOWER = ALFHEIMR_BLOCKS.register("potted_bidens_flower", () -> new FlowerPotBlock((() -> (FlowerPotBlock) Blocks.FLOWER_POT), BIDENS_FLOWER, BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION)));
    public static final RegistryObject<Block> BLANKET_FLOWER = registerBlock("blanket_flower", () -> new FlowerBlock(() -> MobEffects.MOVEMENT_SPEED, 1, BlockBehaviour.Properties.copy(Blocks.DANDELION)));
    public static final RegistryObject<Block> POTTED_BLANKET_FLOWER = ALFHEIMR_BLOCKS.register("potted_blanket_flower", () -> new FlowerPotBlock((() -> (FlowerPotBlock) Blocks.FLOWER_POT), BLANKET_FLOWER, BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION)));
    public static final RegistryObject<Block> BULBINE_FLOWER = registerBlock("bulbine_flower", () -> new FlowerBlock(() -> MobEffects.MOVEMENT_SPEED, 1, BlockBehaviour.Properties.copy(Blocks.DANDELION)));
    public static final RegistryObject<Block> POTTED_BULBINE_FLOWER = ALFHEIMR_BLOCKS.register("potted_bulbine_flower", () -> new FlowerPotBlock((() -> (FlowerPotBlock) Blocks.FLOWER_POT), BULBINE_FLOWER, BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION)));

    //Gray
//    public static final RegistryObject<Block> _FLOWER = registerBlock("_flower", () -> new FlowerBlock(() -> MobEffects.MOVEMENT_SPEED, 1, BlockBehaviour.Properties.copy(Blocks.DANDELION)));
//    public static final RegistryObject<Block> POTTED__FLOWER = BLOCKS.register("potted__flower", () -> new FlowerPotBlock((() -> (FlowerPotBlock) Blocks.FLOWER_POT), _FLOWER, BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION)));
    public static final RegistryObject<Block> SILVER_BRUNIA_FLOWER = registerBlock("silver_brunia_flower", () -> new FlowerBlock(() -> MobEffects.MOVEMENT_SPEED, 1, BlockBehaviour.Properties.copy(Blocks.DANDELION)));
    public static final RegistryObject<Block> POTTED_SILVER_BRUNIA_FLOWER = ALFHEIMR_BLOCKS.register("potted_silver_brunia_flower", () -> new FlowerPotBlock((() -> (FlowerPotBlock) Blocks.FLOWER_POT), SILVER_BRUNIA_FLOWER, BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION)));
    public static final RegistryObject<Block> GRAY_ROSES_FLOWER = registerBlock("gray_roses_flower", () -> new FlowerBlock(() -> MobEffects.MOVEMENT_SPEED, 1, BlockBehaviour.Properties.copy(Blocks.DANDELION)));
    public static final RegistryObject<Block> POTTED_GRAY_ROSES_FLOWER = ALFHEIMR_BLOCKS.register("potted_gray_roses_flower", () -> new FlowerPotBlock((() -> (FlowerPotBlock) Blocks.FLOWER_POT), GRAY_ROSES_FLOWER, BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION)));
    public static final RegistryObject<Block> MOON_CARROT_FLOWER = registerBlock("moon_carrot_flower", () -> new FlowerBlock(() -> MobEffects.MOVEMENT_SPEED, 1, BlockBehaviour.Properties.copy(Blocks.DANDELION)));
    public static final RegistryObject<Block> POTTED_MOON_CARROT_FLOWER = ALFHEIMR_BLOCKS.register("potted_moon_carrot_flower", () -> new FlowerPotBlock((() -> (FlowerPotBlock) Blocks.FLOWER_POT), MOON_CARROT_FLOWER, BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION)));
    public static final RegistryObject<Block> SILVER_BABY_FLOWER = registerBlock("silver_baby_flower", () -> new FlowerBlock(() -> MobEffects.MOVEMENT_SPEED, 1, BlockBehaviour.Properties.copy(Blocks.DANDELION)));
    public static final RegistryObject<Block> POTTED_SILVER_BABY_FLOWER = ALFHEIMR_BLOCKS.register("potted_silver_baby_flower", () -> new FlowerPotBlock((() -> (FlowerPotBlock) Blocks.FLOWER_POT), SILVER_BABY_FLOWER, BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION)));

    //Purple
//    public static final RegistryObject<Block> _FLOWER = registerBlock("_flower", () -> new FlowerBlock(() -> MobEffects.MOVEMENT_SPEED, 1, BlockBehaviour.Properties.copy(Blocks.DANDELION)));
//    public static final RegistryObject<Block> POTTED__FLOWER = BLOCKS.register("potted__flower", () -> new FlowerPotBlock((() -> (FlowerPotBlock) Blocks.FLOWER_POT), _FLOWER, BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION)));
    public static final RegistryObject<Block> LAVENDER_FLOWER = registerBlock("lavender_flower", () -> new FlowerBlock(() -> MobEffects.MOVEMENT_SPEED, 1, BlockBehaviour.Properties.copy(Blocks.DANDELION)));
    public static final RegistryObject<Block> POTTED_LAVENDER_FLOWER = ALFHEIMR_BLOCKS.register("potted_lavender_flower", () -> new FlowerPotBlock((() -> (FlowerPotBlock) Blocks.FLOWER_POT), LAVENDER_FLOWER, BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION)));
    public static final RegistryObject<Block> BELLFLOWER_FLOWER = registerBlock("bellflower_flower", () -> new FlowerBlock(() -> MobEffects.MOVEMENT_SPEED, 1, BlockBehaviour.Properties.copy(Blocks.DANDELION)));
    public static final RegistryObject<Block> POTTED_BELLFLOWER_FLOWER = ALFHEIMR_BLOCKS.register("potted_bellflower_flower", () -> new FlowerPotBlock((() -> (FlowerPotBlock) Blocks.FLOWER_POT), BELLFLOWER_FLOWER, BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION)));
    public static final RegistryObject<Block> LILAC_FLOWER = registerBlock("lilac_flower", () -> new FlowerBlock(() -> MobEffects.MOVEMENT_SPEED, 1, BlockBehaviour.Properties.copy(Blocks.DANDELION)));
    public static final RegistryObject<Block> POTTED_LILAC_FLOWER = ALFHEIMR_BLOCKS.register("potted_lilac_flower", () -> new FlowerPotBlock((() -> (FlowerPotBlock) Blocks.FLOWER_POT), LILAC_FLOWER, BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION)));
    public static final RegistryObject<Block> SWEET_PEA_FLOWER = registerBlock("sweet_pea_flower", () -> new FlowerBlock(() -> MobEffects.MOVEMENT_SPEED, 1, BlockBehaviour.Properties.copy(Blocks.DANDELION)));
    public static final RegistryObject<Block> POTTED_SWEET_PEA_FLOWER = ALFHEIMR_BLOCKS.register("potted_sweet_pea_flower", () -> new FlowerPotBlock((() -> (FlowerPotBlock) Blocks.FLOWER_POT), SWEET_PEA_FLOWER, BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION)));

    /*
    CROPS
     */
    public static final RegistryObject<Block> DURUM_WHEAT_CROP_BLOCK = ALFHEIMR_BLOCKS.register("durum_wheat_crop_block", () -> new DurumWheatCropBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT).noCollission().noOcclusion()));
    public static final RegistryObject<Block> TOMATO_CROP_BLOCK = ALFHEIMR_BLOCKS.register("tomato_crop_block", () -> new TomatoCropBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT).noCollission().noOcclusion()));
    public static final RegistryObject<Block> WILD_ONION_CROP_BLOCK = ALFHEIMR_BLOCKS.register("wild_onion_crop_block", () -> new OnionCropBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT).noCollission().noOcclusion(), 0));
    public static final RegistryObject<Block> STAGE_1_ONION_CROP_BLOCK = ALFHEIMR_BLOCKS.register("stage_1_onion_crop_block", () -> new OnionCropBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT).noCollission().noOcclusion(), 1));
    public static final RegistryObject<Block> STAGE_2_ONION_CROP_BLOCK = ALFHEIMR_BLOCKS.register("stage_2_onion_crop_block", () -> new OnionCropBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT).noCollission().noOcclusion(), 2));
    public static final RegistryObject<Block> STAGE_3_ONION_CROP_BLOCK = ALFHEIMR_BLOCKS.register("stage_3_onion_crop_block", () -> new OnionCropBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT).noCollission().noOcclusion(), 3));
    public static final RegistryObject<Block> ONION_CROP_BLOCK = ALFHEIMR_BLOCKS.register("onion_crop_block", () -> new OnionCropBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT).noCollission().noOcclusion(), 4));
    public static final RegistryObject<Block> DRAGON_FRUIT_CROP_BLOCK = ALFHEIMR_BLOCKS.register("dragon_fruit_crop_block", () -> new DragonFruitCropBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT).noCollission().noOcclusion()));
    public static final RegistryObject<Block> CHILLI_CROP_BLOCK = ALFHEIMR_BLOCKS.register("chilli_crop_block", () -> new ChilliCropBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT).noCollission().noOcclusion()));

    /*
    FLUIDS
     */
    /*
     * WORLD BLOCKS
     */
    public static final RegistryObject<Block> ALFHEIMR_MAGIC_GRASS = registerBlock("alfheimr_magic_grass", () -> new AlfheimrGrassBlock(BlockBehaviour.Properties.copy(Blocks.GRASS)));

    /*
    DIMENSIONAL BLOCKS
     */
    public static final RegistryObject<Block> ALFHEIMR_PORTAL_FRAME = registerBlock("alfheimr_portal_frame", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> ALFHEIMR_PORTAL = registerBlock("alfheimr_portal", AlfheimrPortalBlock::new);

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = ALFHEIMR_BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus){
        ALFHEIMR_BLOCKS.register(eventBus);
    }
}
