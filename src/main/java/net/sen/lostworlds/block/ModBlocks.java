package net.sen.lostworlds.block;

import net.minecraft.sounds.SoundEvents;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.material.MapColor;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.sen.lostworlds.LostWorlds;
import net.sen.lostworlds.LostWorldsConstants;
import net.sen.lostworlds.block.custom.*;
import net.sen.lostworlds.block.portal.*;
import net.sen.lostworlds.fluid.ModFluids;
import net.sen.lostworlds.item.ModItems;
import net.sen.lostworlds.sound.ModSounds;
import net.sen.lostworlds.worldgen.tree.*;

import java.util.function.Supplier;

public class ModBlocks {
    //https://en.wikipedia.org/wiki/List_of_fictional_elements,_materials,_isotopes_and_subatomic_particles

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, LostWorldsConstants.MODID);

    /*
    *   Custom Blocks
    */
    public static final RegistryObject<Block> SOUND_BLOCK = registerBlock("sound_block", () -> new SoundBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> ALLOY_SMELTER = registerBlock("alloy_smelter", () -> new AlloySmelterBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).noOcclusion().requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> DICE_BLOCK = BLOCKS.register("dice_block", () -> new DiceBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).noLootTable()));

    public static final RegistryObject<Block> UNDERWORLD_PORTAL = BLOCKS.register("underworld_portal", UnderworldPortalBlock::new);
    public static final RegistryObject<Block> NIDAVELLIR_PORTAL = registerBlock("nidavellir_portal", NidavellirPortalBlock::new);
    public static final RegistryObject<Block> ALFHEIMR_PORTAL = registerBlock("alfheimr_portal", AlfheimrPortalBlock::new);
    public static final RegistryObject<Block> ATLANTIS_PORTAL = registerBlock("atlantis_portal", AtlantisPortalBlock::new);
    public static final RegistryObject<Block> SKYOPIA_PORTAL = registerBlock("skyopia_portal", SkyopiaPortalBlock::new);

    /*
     * NIDAVELLIR STONE GEO
     */
    //Soft Stone
    public static final RegistryObject<Block> NIDAVELLIR_SOFT_STONE = registerBlock("nidavellir_soft_stone", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> NIDAVELLIR_SOFT_STONE_STAIRS = registerBlock("nidavellir_soft_stone_stairs", () -> new StairBlock(() -> ModBlocks.CRIMSON_STONE.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE_STAIRS).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> NIDAVELLIR_SOFT_STONE_SLAB = registerBlock("nidavellir_soft_stone_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE_SLAB).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> NIDAVELLIR_SOFT_STONE_PRESSURE_PLATE = registerBlock("nidavellir_soft_stone_pressure_plate", () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, BlockBehaviour.Properties.copy(Blocks.STONE_STAIRS).requiresCorrectToolForDrops(), BlockSetType.STONE));
    public static final RegistryObject<Block> NIDAVELLIR_SOFT_STONE_BUTTON = registerBlock("nidavellir_soft_stone_button", () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BUTTON).requiresCorrectToolForDrops(), BlockSetType.STONE, 10, false));
    public static final RegistryObject<Block> NIDAVELLIR_SOFT_STONE_WALL = registerBlock("nidavellir_soft_stone_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_WALL).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> NIDAVELLIR_SOFT_SMOOTH_STONE = registerBlock("nidavellir_soft_smooth_stone", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_WALL).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> NIDAVELLIR_SOFT_COBBLESTONE = registerBlock("nidavellir_soft_cobblestone", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> NIDAVELLIR_SOFT_COBBLESTONE_STAIRS = registerBlock("nidavellir_soft_cobblestone_stairs", () -> new StairBlock(() -> ModBlocks.CRIMSON_STONE.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE_STAIRS).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> NIDAVELLIR_SOFT_COBBLESTONE_SLAB = registerBlock("nidavellir_soft_cobblestone_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE_SLAB).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> NIDAVELLIR_SOFT_COBBLESTONE_WALL = registerBlock("nidavellir_soft_cobblestone_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_WALL).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> NIDAVELLIR_SOFT_COBBLESTONE_MOSSY = registerBlock("nidavellir_soft_cobblestone_mossy", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_WALL).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> NIDAVELLIR_SOFT_STONE_BRICKS = registerBlock("nidavellir_soft_stone_bricks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> NIDAVELLIR_SOFT_STONE_BRICKS_STAIRS = registerBlock("nidavellir_soft_stone_bricks_stairs", () -> new StairBlock(() -> ModBlocks.CRIMSON_STONE.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE_STAIRS).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> NIDAVELLIR_SOFT_STONE_BRICKS_SLAB = registerBlock("nidavellir_soft_stone_bricks_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE_SLAB).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> NIDAVELLIR_SOFT_STONE_BRICKS_WALL = registerBlock("nidavellir_soft_stone_bricks_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_WALL).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> NIDAVELLIR_SOFT_STONE_BRICKS_MOSSY = registerBlock("nidavellir_soft_stone_bricks_mossy", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_WALL).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> NIDAVELLIR_SOFT_STONE_BRICKS_CRACKED = registerBlock("nidavellir_soft_stone_bricks_cracked", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_WALL).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> NIDAVELLIR_SOFT_STONE_BRICKS_CHISELED = registerBlock("nidavellir_soft_stone_bricks_chiseled", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_WALL).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> NIDAVELLIR_SOFT_STONE_IRON_ORE = registerBlock("nidavellir_soft_stone_iron_ore", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_WALL).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> NIDAVELLIR_SOFT_STONE_GOLD_ORE = registerBlock("nidavellir_soft_stone_gold_ore", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_WALL).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> NIDAVELLIR_SOFT_STONE_COPPER_ORE = registerBlock("nidavellir_soft_stone_copper_ore", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_WALL).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> NIDAVELLIR_SOFT_STONE_TIN_ORE = registerBlock("nidavellir_soft_stone_tin_ore", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_WALL).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> NIDAVELLIR_SOFT_STONE_ZINC_ORE = registerBlock("nidavellir_soft_stone_zinc_ore", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_WALL).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> NIDAVELLIR_SOFT_STONE_DIAMOND_ORE = registerBlock("nidavellir_soft_stone_diamond_ore", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_WALL).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> NIDAVELLIR_SOFT_STONE_EMERALD_ORE = registerBlock("nidavellir_soft_stone_emerald_ore", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_WALL).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> NIDAVELLIR_SOFT_STONE_COAL_ORE = registerBlock("nidavellir_soft_stone_coal_ore", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_WALL).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> NIDAVELLIR_SOFT_STONE_REDSTONE_ORE = registerBlock("nidavellir_soft_stone_redstone_ore", () -> new ModRedStoneOreBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_WALL).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> NIDAVELLIR_SOFT_STONE_LAPIS_ORE = registerBlock("nidavellir_soft_stone_lapis_ore", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_WALL).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> NIDAVELLIR_SOFT_STONE_IRON_ORE_CLUSTER = registerBlock("nidavellir_soft_stone_iron_ore_cluster", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_WALL).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> NIDAVELLIR_SOFT_STONE_GOLD_ORE_CLUSTER = registerBlock("nidavellir_soft_stone_gold_ore_cluster", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_WALL).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> NIDAVELLIR_SOFT_STONE_COPPER_ORE_CLUSTER = registerBlock("nidavellir_soft_stone_copper_ore_cluster", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_WALL).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> NIDAVELLIR_SOFT_STONE_TIN_ORE_CLUSTER = registerBlock("nidavellir_soft_stone_tin_ore_cluster", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_WALL).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> NIDAVELLIR_SOFT_STONE_ZINC_ORE_CLUSTER = registerBlock("nidavellir_soft_stone_zinc_ore_cluster", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_WALL).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> NIDAVELLIR_SOFT_STONE_DIAMOND_ORE_CLUSTER = registerBlock("nidavellir_soft_stone_diamond_ore_cluster", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_WALL).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> NIDAVELLIR_SOFT_STONE_EMERALD_ORE_CLUSTER = registerBlock("nidavellir_soft_stone_emerald_ore_cluster", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_WALL).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> NIDAVELLIR_SOFT_STONE_COAL_ORE_CLUSTER = registerBlock("nidavellir_soft_stone_coal_ore_cluster", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_WALL).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> NIDAVELLIR_SOFT_STONE_REDSTONE_ORE_CLUSTER = registerBlock("nidavellir_soft_stone_redstone_ore_cluster", () -> new ModRedStoneOreBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_WALL).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> NIDAVELLIR_SOFT_STONE_LAPIS_ORE_CLUSTER = registerBlock("nidavellir_soft_stone_lapis_ore_cluster", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_WALL).requiresCorrectToolForDrops()));

    //Hard Stone
    public static final RegistryObject<Block> NIDAVELLIR_HARD_STONE = registerBlock("nidavellir_hard_stone", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> NIDAVELLIR_HARD_STONE_STAIRS = registerBlock("nidavellir_hard_stone_stairs", () -> new StairBlock(() -> ModBlocks.CRIMSON_STONE.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE_STAIRS).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> NIDAVELLIR_HARD_STONE_SLAB = registerBlock("nidavellir_hard_stone_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE_SLAB).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> NIDAVELLIR_HARD_STONE_PRESSURE_PLATE = registerBlock("nidavellir_hard_stone_pressure_plate", () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, BlockBehaviour.Properties.copy(Blocks.STONE_STAIRS).requiresCorrectToolForDrops(), BlockSetType.STONE));
    public static final RegistryObject<Block> NIDAVELLIR_HARD_STONE_BUTTON = registerBlock("nidavellir_hard_stone_button", () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BUTTON).requiresCorrectToolForDrops(), BlockSetType.STONE, 10, false));
    public static final RegistryObject<Block> NIDAVELLIR_HARD_STONE_WALL = registerBlock("nidavellir_hard_stone_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_WALL).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> NIDAVELLIR_HARD_SMOOTH_STONE = registerBlock("nidavellir_hard_smooth_stone", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_WALL).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> NIDAVELLIR_HARD_COBBLESTONE = registerBlock("nidavellir_hard_cobblestone", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> NIDAVELLIR_HARD_COBBLESTONE_STAIRS = registerBlock("nidavellir_hard_cobblestone_stairs", () -> new StairBlock(() -> ModBlocks.CRIMSON_STONE.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE_STAIRS).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> NIDAVELLIR_HARD_COBBLESTONE_SLAB = registerBlock("nidavellir_hard_cobblestone_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE_SLAB).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> NIDAVELLIR_HARD_COBBLESTONE_WALL = registerBlock("nidavellir_hard_cobblestone_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_WALL).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> NIDAVELLIR_HARD_COBBLESTONE_MOSSY = registerBlock("nidavellir_hard_cobblestone_mossy", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_WALL).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> NIDAVELLIR_HARD_STONE_BRICKS = registerBlock("nidavellir_hard_stone_bricks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> NIDAVELLIR_HARD_STONE_BRICKS_STAIRS = registerBlock("nidavellir_hard_stone_bricks_stairs", () -> new StairBlock(() -> ModBlocks.CRIMSON_STONE.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE_STAIRS).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> NIDAVELLIR_HARD_STONE_BRICKS_SLAB = registerBlock("nidavellir_hard_stone_bricks_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE_SLAB).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> NIDAVELLIR_HARD_STONE_BRICKS_WALL = registerBlock("nidavellir_hard_stone_bricks_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_WALL).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> NIDAVELLIR_HARD_STONE_BRICKS_MOSSY = registerBlock("nidavellir_hard_stone_bricks_mossy", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_WALL).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> NIDAVELLIR_HARD_STONE_BRICKS_CRACKED = registerBlock("nidavellir_hard_stone_bricks_cracked", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_WALL).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> NIDAVELLIR_HARD_STONE_BRICKS_CHISELED = registerBlock("nidavellir_hard_stone_bricks_chiseled", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_WALL).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> NIDAVELLIR_HARD_STONE_IRON_ORE = registerBlock("nidavellir_hard_stone_iron_ore", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_WALL).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> NIDAVELLIR_HARD_STONE_GOLD_ORE = registerBlock("nidavellir_hard_stone_gold_ore", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_WALL).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> NIDAVELLIR_HARD_STONE_COPPER_ORE = registerBlock("nidavellir_hard_stone_copper_ore", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_WALL).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> NIDAVELLIR_HARD_STONE_TIN_ORE = registerBlock("nidavellir_hard_stone_tin_ore", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_WALL).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> NIDAVELLIR_HARD_STONE_ZINC_ORE = registerBlock("nidavellir_hard_stone_zinc_ore", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_WALL).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> NIDAVELLIR_HARD_STONE_DIAMOND_ORE = registerBlock("nidavellir_hard_stone_diamond_ore", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_WALL).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> NIDAVELLIR_HARD_STONE_EMERALD_ORE = registerBlock("nidavellir_hard_stone_emerald_ore", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_WALL).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> NIDAVELLIR_HARD_STONE_COAL_ORE = registerBlock("nidavellir_hard_stone_coal_ore", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_WALL).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> NIDAVELLIR_HARD_STONE_REDSTONE_ORE = registerBlock("nidavellir_hard_stone_redstone_ore", () -> new ModRedStoneOreBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_WALL).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> NIDAVELLIR_HARD_STONE_LAPIS_ORE = registerBlock("nidavellir_hard_stone_lapis_ore", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_WALL).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> NIDAVELLIR_HARD_STONE_IRON_ORE_CLUSTER = registerBlock("nidavellir_hard_stone_iron_ore_cluster", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_WALL).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> NIDAVELLIR_HARD_STONE_GOLD_ORE_CLUSTER = registerBlock("nidavellir_hard_stone_gold_ore_cluster", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_WALL).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> NIDAVELLIR_HARD_STONE_COPPER_ORE_CLUSTER = registerBlock("nidavellir_hard_stone_copper_ore_cluster", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_WALL).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> NIDAVELLIR_HARD_STONE_TIN_ORE_CLUSTER = registerBlock("nidavellir_hard_stone_tin_ore_cluster", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_WALL).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> NIDAVELLIR_HARD_STONE_ZINC_ORE_CLUSTER = registerBlock("nidavellir_hard_stone_zinc_ore_cluster", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_WALL).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> NIDAVELLIR_HARD_STONE_DIAMOND_ORE_CLUSTER = registerBlock("nidavellir_hard_stone_diamond_ore_cluster", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_WALL).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> NIDAVELLIR_HARD_STONE_EMERALD_ORE_CLUSTER = registerBlock("nidavellir_hard_stone_emerald_ore_cluster", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_WALL).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> NIDAVELLIR_HARD_STONE_COAL_ORE_CLUSTER = registerBlock("nidavellir_hard_stone_coal_ore_cluster", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_WALL).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> NIDAVELLIR_HARD_STONE_REDSTONE_ORE_CLUSTER = registerBlock("nidavellir_hard_stone_redstone_ore_cluster", () -> new ModRedStoneOreBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_WALL).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> NIDAVELLIR_HARD_STONE_LAPIS_ORE_CLUSTER = registerBlock("nidavellir_hard_stone_lapis_ore_cluster", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_WALL).requiresCorrectToolForDrops()));

    //Enhanced Stone
    public static final RegistryObject<Block> NIDAVELLIR_ENHANCED_STONE = registerBlock("nidavellir_enhanced_stone", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> NIDAVELLIR_ENHANCED_STONE_STAIRS = registerBlock("nidavellir_enhanced_stone_stairs", () -> new StairBlock(() -> ModBlocks.CRIMSON_STONE.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE_STAIRS).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> NIDAVELLIR_ENHANCED_STONE_SLAB = registerBlock("nidavellir_enhanced_stone_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE_SLAB).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> NIDAVELLIR_ENHANCED_STONE_PRESSURE_PLATE = registerBlock("nidavellir_enhanced_stone_pressure_plate", () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, BlockBehaviour.Properties.copy(Blocks.STONE_STAIRS).requiresCorrectToolForDrops(), BlockSetType.STONE));
    public static final RegistryObject<Block> NIDAVELLIR_ENHANCED_STONE_BUTTON = registerBlock("nidavellir_enhanced_stone_button", () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BUTTON).requiresCorrectToolForDrops(), BlockSetType.STONE, 10, false));
    public static final RegistryObject<Block> NIDAVELLIR_ENHANCED_STONE_WALL = registerBlock("nidavellir_enhanced_stone_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_WALL).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> NIDAVELLIR_ENHANCED_SMOOTH_STONE = registerBlock("nidavellir_enhanced_smooth_stone", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_WALL).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> NIDAVELLIR_ENHANCED_COBBLESTONE = registerBlock("nidavellir_enhanced_cobblestone", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> NIDAVELLIR_ENHANCED_COBBLESTONE_STAIRS = registerBlock("nidavellir_enhanced_cobblestone_stairs", () -> new StairBlock(() -> ModBlocks.CRIMSON_STONE.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE_STAIRS).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> NIDAVELLIR_ENHANCED_COBBLESTONE_SLAB = registerBlock("nidavellir_enhanced_cobblestone_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE_SLAB).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> NIDAVELLIR_ENHANCED_COBBLESTONE_WALL = registerBlock("nidavellir_enhanced_cobblestone_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_WALL).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> NIDAVELLIR_ENHANCED_COBBLESTONE_MOSSY = registerBlock("nidavellir_enhanced_cobblestone_mossy", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_WALL).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> NIDAVELLIR_ENHANCED_STONE_BRICKS = registerBlock("nidavellir_enhanced_stone_bricks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> NIDAVELLIR_ENHANCED_STONE_BRICKS_STAIRS = registerBlock("nidavellir_enhanced_stone_bricks_stairs", () -> new StairBlock(() -> ModBlocks.CRIMSON_STONE.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE_STAIRS).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> NIDAVELLIR_ENHANCED_STONE_BRICKS_SLAB = registerBlock("nidavellir_enhanced_stone_bricks_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE_SLAB).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> NIDAVELLIR_ENHANCED_STONE_BRICKS_WALL = registerBlock("nidavellir_enhanced_stone_bricks_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_WALL).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> NIDAVELLIR_ENHANCED_STONE_BRICKS_MOSSY = registerBlock("nidavellir_enhanced_stone_bricks_mossy", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_WALL).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> NIDAVELLIR_ENHANCED_STONE_BRICKS_CRACKED = registerBlock("nidavellir_enhanced_stone_bricks_cracked", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_WALL).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> NIDAVELLIR_ENHANCED_STONE_BRICKS_CHISELED = registerBlock("nidavellir_enhanced_stone_bricks_chiseled", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_WALL).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> NIDAVELLIR_ENHANCED_STONE_IRON_ORE = registerBlock("nidavellir_enhanced_stone_iron_ore", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_WALL).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> NIDAVELLIR_ENHANCED_STONE_GOLD_ORE = registerBlock("nidavellir_enhanced_stone_gold_ore", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_WALL).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> NIDAVELLIR_ENHANCED_STONE_COPPER_ORE = registerBlock("nidavellir_enhanced_stone_copper_ore", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_WALL).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> NIDAVELLIR_ENHANCED_STONE_TIN_ORE = registerBlock("nidavellir_enhanced_stone_tin_ore", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_WALL).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> NIDAVELLIR_ENHANCED_STONE_ZINC_ORE = registerBlock("nidavellir_enhanced_stone_zinc_ore", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_WALL).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> NIDAVELLIR_ENHANCED_STONE_DIAMOND_ORE = registerBlock("nidavellir_enhanced_stone_diamond_ore", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_WALL).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> NIDAVELLIR_ENHANCED_STONE_EMERALD_ORE = registerBlock("nidavellir_enhanced_stone_emerald_ore", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_WALL).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> NIDAVELLIR_ENHANCED_STONE_COAL_ORE = registerBlock("nidavellir_enhanced_stone_coal_ore", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_WALL).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> NIDAVELLIR_ENHANCED_STONE_REDSTONE_ORE = registerBlock("nidavellir_enhanced_stone_redstone_ore", () -> new ModRedStoneOreBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_WALL).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> NIDAVELLIR_ENHANCED_STONE_LAPIS_ORE = registerBlock("nidavellir_enhanced_stone_lapis_ore", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_WALL).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> NIDAVELLIR_ENHANCED_STONE_IRON_ORE_CLUSTER = registerBlock("nidavellir_enhanced_stone_iron_ore_cluster", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_WALL).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> NIDAVELLIR_ENHANCED_STONE_GOLD_ORE_CLUSTER = registerBlock("nidavellir_enhanced_stone_gold_ore_cluster", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_WALL).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> NIDAVELLIR_ENHANCED_STONE_COPPER_ORE_CLUSTER = registerBlock("nidavellir_enhanced_stone_copper_ore_cluster", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_WALL).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> NIDAVELLIR_ENHANCED_STONE_TIN_ORE_CLUSTER = registerBlock("nidavellir_enhanced_stone_tin_ore_cluster", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_WALL).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> NIDAVELLIR_ENHANCED_STONE_ZINC_ORE_CLUSTER = registerBlock("nidavellir_enhanced_stone_zinc_ore_cluster", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_WALL).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> NIDAVELLIR_ENHANCED_STONE_DIAMOND_ORE_CLUSTER = registerBlock("nidavellir_enhanced_stone_diamond_ore_cluster", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_WALL).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> NIDAVELLIR_ENHANCED_STONE_EMERALD_ORE_CLUSTER = registerBlock("nidavellir_enhanced_stone_emerald_ore_cluster", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_WALL).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> NIDAVELLIR_ENHANCED_STONE_COAL_ORE_CLUSTER = registerBlock("nidavellir_enhanced_stone_coal_ore_cluster", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_WALL).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> NIDAVELLIR_ENHANCED_STONE_REDSTONE_ORE_CLUSTER = registerBlock("nidavellir_enhanced_stone_redstone_ore_cluster", () -> new ModRedStoneOreBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_WALL).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> NIDAVELLIR_ENHANCED_STONE_LAPIS_ORE_CLUSTER = registerBlock("nidavellir_enhanced_stone_lapis_ore_cluster", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_WALL).requiresCorrectToolForDrops()));

    //Tartarus Stone
    public static final RegistryObject<Block> TARTARUS_STONE = registerBlock("tartarus_stone", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> TARTARUS_STONE_STAIRS = registerBlock("tartarus_stone_stairs", () -> new StairBlock(() -> ModBlocks.CRIMSON_STONE.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE_STAIRS).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> TARTARUS_STONE_SLAB = registerBlock("tartarus_stone_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE_SLAB).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> TARTARUS_STONE_PRESSURE_PLATE = registerBlock("tartarus_stone_pressure_plate", () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, BlockBehaviour.Properties.copy(Blocks.STONE_STAIRS).requiresCorrectToolForDrops(), BlockSetType.STONE));
    public static final RegistryObject<Block> TARTARUS_STONE_BUTTON = registerBlock("tartarus_stone_button", () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BUTTON).requiresCorrectToolForDrops(), BlockSetType.STONE, 10, false));
    public static final RegistryObject<Block> TARTARUS_STONE_WALL = registerBlock("tartarus_stone_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_WALL).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> TARTARUS_STONE_SMOOTH_STONE = registerBlock("tartarus_stone_smooth_stone", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_WALL).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> TARTARUS_STONE_COBBLESTONE = registerBlock("tartarus_stone_cobblestone", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> TARTARUS_STONE_COBBLESTONE_STAIRS = registerBlock("tartarus_stone_cobblestone_stairs", () -> new StairBlock(() -> ModBlocks.CRIMSON_STONE.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE_STAIRS).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> TARTARUS_STONE_COBBLESTONE_SLAB = registerBlock("tartarus_stone_cobblestone_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE_SLAB).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> TARTARUS_STONE_COBBLESTONE_WALL = registerBlock("tartarus_stone_cobblestone_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_WALL).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> TARTARUS_STONE_COBBLESTONE_MOSSY = registerBlock("tartarus_stone_cobblestone_mossy", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_WALL).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> TARTARUS_STONE_BRICKS = registerBlock("tartarus_stone_bricks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> TARTARUS_STONE_BRICKS_STAIRS = registerBlock("tartarus_stone_bricks_stairs", () -> new StairBlock(() -> ModBlocks.CRIMSON_STONE.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE_STAIRS).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> TARTARUS_STONE_BRICKS_SLAB = registerBlock("tartarus_stone_bricks_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE_SLAB).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> TARTARUS_STONE_BRICKS_WALL = registerBlock("tartarus_stone_bricks_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_WALL).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> TARTARUS_STONE_BRICKS_MOSSY = registerBlock("tartarus_stone_bricks_mossy", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_WALL).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> TARTARUS_STONE_BRICKS_CRACKED = registerBlock("tartarus_stone_bricks_cracked", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_WALL).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> TARTARUS_STONE_BRICKS_CHISELED = registerBlock("tartarus_stone_bricks_chiseled", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_WALL).requiresCorrectToolForDrops()));

    //Deepslate Stone
    public static final RegistryObject<Block> NIDAVELLIR_DEEPSLATE_STONE = registerBlock("nidavellir_deepslate_stone", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> NIDAVELLIR_DEEPSLATE_STONE_STAIRS = registerBlock("nidavellir_deepslate_stone_stairs", () -> new StairBlock(() -> ModBlocks.CRIMSON_STONE.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE_STAIRS).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> NIDAVELLIR_DEEPSLATE_STONE_SLAB = registerBlock("nidavellir_deepslate_stone_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE_SLAB).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> NIDAVELLIR_DEEPSLATE_STONE_PRESSURE_PLATE = registerBlock("nidavellir_deepslate_stone_pressure_plate", () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, BlockBehaviour.Properties.copy(Blocks.STONE_STAIRS).requiresCorrectToolForDrops(), BlockSetType.STONE));
    public static final RegistryObject<Block> NIDAVELLIR_DEEPSLATE_STONE_BUTTON = registerBlock("nidavellir_deepslate_stone_button", () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BUTTON).requiresCorrectToolForDrops(), BlockSetType.STONE, 10, false));
    public static final RegistryObject<Block> NIDAVELLIR_DEEPSLATE_STONE_WALL = registerBlock("nidavellir_deepslate_stone_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_WALL).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> NIDAVELLIR_DEEPSLATE_SMOOTH_STONE = registerBlock("nidavellir_deepslate_smooth_stone", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_WALL).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> NIDAVELLIR_DEEPSLATE_COBBLESTONE = registerBlock("nidavellir_deepslate_cobblestone", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> NIDAVELLIR_DEEPSLATE_COBBLESTONE_STAIRS = registerBlock("nidavellir_deepslate_cobblestone_stairs", () -> new StairBlock(() -> ModBlocks.CRIMSON_STONE.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE_STAIRS).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> NIDAVELLIR_DEEPSLATE_COBBLESTONE_SLAB = registerBlock("nidavellir_deepslate_cobblestone_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE_SLAB).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> NIDAVELLIR_DEEPSLATE_COBBLESTONE_WALL = registerBlock("nidavellir_deepslate_cobblestone_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_WALL).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> NIDAVELLIR_DEEPSLATE_COBBLESTONE_MOSSY = registerBlock("nidavellir_deepslate_cobblestone_mossy", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_WALL).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> NIDAVELLIR_DEEPSLATE_STONE_BRICKS = registerBlock("nidavellir_deepslate_stone_bricks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> NIDAVELLIR_DEEPSLATE_STONE_BRICKS_STAIRS = registerBlock("nidavellir_deepslate_stone_bricks_stairs", () -> new StairBlock(() -> ModBlocks.CRIMSON_STONE.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE_STAIRS).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> NIDAVELLIR_DEEPSLATE_STONE_BRICKS_SLAB = registerBlock("nidavellir_deepslate_stone_bricks_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE_SLAB).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> NIDAVELLIR_DEEPSLATE_STONE_BRICKS_WALL = registerBlock("nidavellir_deepslate_stone_bricks_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_WALL).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> NIDAVELLIR_DEEPSLATE_STONE_BRICKS_MOSSY = registerBlock("nidavellir_deepslate_stone_bricks_mossy", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_WALL).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> NIDAVELLIR_DEEPSLATE_STONE_BRICKS_CRACKED = registerBlock("nidavellir_deepslate_stone_bricks_cracked", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_WALL).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> NIDAVELLIR_DEEPSLATE_STONE_BRICKS_CHISELED = registerBlock("nidavellir_deepslate_stone_bricks_chiseled", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_WALL).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> NIDAVELLIR_DEEPSLATE_STONE_IRON_ORE = registerBlock("nidavellir_deepslate_stone_iron_ore", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_WALL).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> NIDAVELLIR_DEEPSLATE_STONE_GOLD_ORE = registerBlock("nidavellir_deepslate_stone_gold_ore", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_WALL).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> NIDAVELLIR_DEEPSLATE_STONE_COPPER_ORE = registerBlock("nidavellir_deepslate_stone_copper_ore", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_WALL).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> NIDAVELLIR_DEEPSLATE_STONE_TIN_ORE = registerBlock("nidavellir_deepslate_stone_tin_ore", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_WALL).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> NIDAVELLIR_DEEPSLATE_STONE_ZINC_ORE = registerBlock("nidavellir_deepslate_stone_zinc_ore", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_WALL).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> NIDAVELLIR_DEEPSLATE_STONE_DIAMOND_ORE = registerBlock("nidavellir_deepslate_stone_diamond_ore", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_WALL).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> NIDAVELLIR_DEEPSLATE_STONE_EMERALD_ORE = registerBlock("nidavellir_deepslate_stone_emerald_ore", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_WALL).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> NIDAVELLIR_DEEPSLATE_STONE_COAL_ORE = registerBlock("nidavellir_deepslate_stone_coal_ore", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_WALL).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> NIDAVELLIR_DEEPSLATE_STONE_REDSTONE_ORE = registerBlock("nidavellir_deepslate_stone_redstone_ore", () -> new ModRedStoneOreBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_WALL).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> NIDAVELLIR_DEEPSLATE_STONE_LAPIS_ORE = registerBlock("nidavellir_deepslate_stone_lapis_ore", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_WALL).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> NIDAVELLIR_DEEPSLATE_STONE_IRON_ORE_CLUSTER = registerBlock("nidavellir_deepslate_stone_iron_ore_cluster", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_WALL).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> NIDAVELLIR_DEEPSLATE_STONE_GOLD_ORE_CLUSTER = registerBlock("nidavellir_deepslate_stone_gold_ore_cluster", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_WALL).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> NIDAVELLIR_DEEPSLATE_STONE_COPPER_ORE_CLUSTER = registerBlock("nidavellir_deepslate_stone_copper_ore_cluster", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_WALL).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> NIDAVELLIR_DEEPSLATE_STONE_TIN_ORE_CLUSTER = registerBlock("nidavellir_deepslate_stone_tin_ore_cluster", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_WALL).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> NIDAVELLIR_DEEPSLATE_STONE_ZINC_ORE_CLUSTER = registerBlock("nidavellir_deepslate_stone_zinc_ore_cluster", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_WALL).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> NIDAVELLIR_DEEPSLATE_STONE_DIAMOND_ORE_CLUSTER = registerBlock("nidavellir_deepslate_stone_diamond_ore_cluster", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_WALL).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> NIDAVELLIR_DEEPSLATE_STONE_EMERALD_ORE_CLUSTER = registerBlock("nidavellir_deepslate_stone_emerald_ore_cluster", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_WALL).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> NIDAVELLIR_DEEPSLATE_STONE_COAL_ORE_CLUSTER = registerBlock("nidavellir_deepslate_stone_coal_ore_cluster", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_WALL).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> NIDAVELLIR_DEEPSLATE_STONE_REDSTONE_ORE_CLUSTER = registerBlock("nidavellir_deepslate_stone_redstone_ore_cluster", () -> new ModRedStoneOreBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_WALL).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> NIDAVELLIR_DEEPSLATE_STONE_LAPIS_ORE_CLUSTER = registerBlock("nidavellir_deepslate_stone_lapis_ore_cluster", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_WALL).requiresCorrectToolForDrops()));

    //Crimson Stone
    public static final RegistryObject<Block> NIDAVELLIR_CRIMSON_STONE = registerBlock("nidavellir_crimson_stone", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> NIDAVELLIR_CRIMSON_STONE_STAIRS = registerBlock("nidavellir_crimson_stone_stairs", () -> new StairBlock(() -> ModBlocks.CRIMSON_STONE.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE_STAIRS).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> NIDAVELLIR_CRIMSON_STONE_SLAB = registerBlock("nidavellir_crimson_stone_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE_SLAB).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> NIDAVELLIR_CRIMSON_STONE_PRESSURE_PLATE = registerBlock("nidavellir_crimson_stone_pressure_plate", () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, BlockBehaviour.Properties.copy(Blocks.STONE_STAIRS).requiresCorrectToolForDrops(), BlockSetType.STONE));
    public static final RegistryObject<Block> NIDAVELLIR_CRIMSON_STONE_BUTTON = registerBlock("nidavellir_crimson_stone_button", () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BUTTON).requiresCorrectToolForDrops(), BlockSetType.STONE, 10, false));
    public static final RegistryObject<Block> NIDAVELLIR_CRIMSON_STONE_WALL = registerBlock("nidavellir_crimson_stone_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_WALL).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> NIDAVELLIR_CRIMSON_SMOOTH_STONE = registerBlock("nidavellir_crimson_smooth_stone", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_WALL).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> NIDAVELLIR_CRIMSON_COBBLESTONE = registerBlock("nidavellir_crimson_cobblestone", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> NIDAVELLIR_CRIMSON_COBBLESTONE_STAIRS = registerBlock("nidavellir_crimson_cobblestone_stairs", () -> new StairBlock(() -> ModBlocks.CRIMSON_STONE.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE_STAIRS).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> NIDAVELLIR_CRIMSON_COBBLESTONE_SLAB = registerBlock("nidavellir_crimson_cobblestone_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE_SLAB).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> NIDAVELLIR_CRIMSON_COBBLESTONE_WALL = registerBlock("nidavellir_crimson_cobblestone_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_WALL).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> NIDAVELLIR_CRIMSON_COBBLESTONE_MOSSY = registerBlock("nidavellir_crimson_cobblestone_mossy", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_WALL).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> NIDAVELLIR_CRIMSON_STONE_BRICKS = registerBlock("nidavellir_crimson_stone_bricks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> NIDAVELLIR_CRIMSON_STONE_BRICKS_STAIRS = registerBlock("nidavellir_crimson_stone_bricks_stairs", () -> new StairBlock(() -> ModBlocks.CRIMSON_STONE.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE_STAIRS).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> NIDAVELLIR_CRIMSON_STONE_BRICKS_SLAB = registerBlock("nidavellir_crimson_stone_bricks_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE_SLAB).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> NIDAVELLIR_CRIMSON_STONE_BRICKS_WALL = registerBlock("nidavellir_crimson_stone_bricks_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_WALL).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> NIDAVELLIR_CRIMSON_STONE_BRICKS_MOSSY = registerBlock("nidavellir_crimson_stone_bricks_mossy", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_WALL).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> NIDAVELLIR_CRIMSON_STONE_BRICKS_CRACKED = registerBlock("nidavellir_crimson_stone_bricks_cracked", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_WALL).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> NIDAVELLIR_CRIMSON_STONE_BRICKS_CHISELED = registerBlock("nidavellir_crimson_stone_bricks_chiseled", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_WALL).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> NIDAVELLIR_CRIMSON_STONE_IRON_ORE = registerBlock("nidavellir_crimson_stone_iron_ore", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_WALL).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> NIDAVELLIR_CRIMSON_STONE_GOLD_ORE = registerBlock("nidavellir_crimson_stone_gold_ore", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_WALL).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> NIDAVELLIR_CRIMSON_STONE_COPPER_ORE = registerBlock("nidavellir_crimson_stone_copper_ore", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_WALL).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> NIDAVELLIR_CRIMSON_STONE_TIN_ORE = registerBlock("nidavellir_crimson_stone_tin_ore", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_WALL).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> NIDAVELLIR_CRIMSON_STONE_ZINC_ORE = registerBlock("nidavellir_crimson_stone_zinc_ore", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_WALL).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> NIDAVELLIR_CRIMSON_STONE_DIAMOND_ORE = registerBlock("nidavellir_crimson_stone_diamond_ore", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_WALL).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> NIDAVELLIR_CRIMSON_STONE_EMERALD_ORE = registerBlock("nidavellir_crimson_stone_emerald_ore", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_WALL).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> NIDAVELLIR_CRIMSON_STONE_COAL_ORE = registerBlock("nidavellir_crimson_stone_coal_ore", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_WALL).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> NIDAVELLIR_CRIMSON_STONE_REDSTONE_ORE = registerBlock("nidavellir_crimson_stone_redstone_ore", () -> new ModRedStoneOreBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_WALL).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> NIDAVELLIR_CRIMSON_STONE_LAPIS_ORE = registerBlock("nidavellir_crimson_stone_lapis_ore", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_WALL).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> NIDAVELLIR_CRIMSON_STONE_IRON_ORE_CLUSTER = registerBlock("nidavellir_crimson_stone_iron_ore_cluster", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_WALL).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> NIDAVELLIR_CRIMSON_STONE_GOLD_ORE_CLUSTER = registerBlock("nidavellir_crimson_stone_gold_ore_cluster", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_WALL).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> NIDAVELLIR_CRIMSON_STONE_COPPER_ORE_CLUSTER = registerBlock("nidavellir_crimson_stone_copper_ore_cluster", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_WALL).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> NIDAVELLIR_CRIMSON_STONE_TIN_ORE_CLUSTER = registerBlock("nidavellir_crimson_stone_tin_ore_cluster", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_WALL).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> NIDAVELLIR_CRIMSON_STONE_ZINC_ORE_CLUSTER = registerBlock("nidavellir_crimson_stone_zinc_ore_cluster", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_WALL).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> NIDAVELLIR_CRIMSON_STONE_DIAMOND_ORE_CLUSTER = registerBlock("nidavellir_crimson_stone_diamond_ore_cluster", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_WALL).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> NIDAVELLIR_CRIMSON_STONE_EMERALD_ORE_CLUSTER = registerBlock("nidavellir_crimson_stone_emerald_ore_cluster", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_WALL).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> NIDAVELLIR_CRIMSON_STONE_COAL_ORE_CLUSTER = registerBlock("nidavellir_crimson_stone_coal_ore_cluster", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_WALL).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> NIDAVELLIR_CRIMSON_STONE_REDSTONE_ORE_CLUSTER = registerBlock("nidavellir_crimson_stone_redstone_ore_cluster", () -> new ModRedStoneOreBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_WALL).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> NIDAVELLIR_CRIMSON_STONE_LAPIS_ORE_CLUSTER = registerBlock("nidavellir_crimson_stone_lapis_ore_cluster", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_WALL).requiresCorrectToolForDrops()));

    /*
     * WOOD TYPES
     */
    //Elder Wood
    public static final RegistryObject<Block> ELDER_WOOD_LOG = registerBlock("elder_wood_log", () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)));
    public static final RegistryObject<Block> ELDER_WOOD = registerBlock("elder_wood", () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)));
    public static final RegistryObject<Block> STRIPPED_ELDER_WOOD_LOG = registerBlock("stripped_elder_wood_log", () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_LOG)));
    public static final RegistryObject<Block> STRIPPED_ELDER_WOOD = registerBlock("stripped_elder_wood", () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD)));
    public static final RegistryObject<Block> ELDER_WOOD_LEAVES = registerBlock("elder_wood_leaves", () -> new ModFlammableLeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)));
    public static final RegistryObject<Block> ELDER_WOOD_SAPLING = registerBlock("elder_wood_sapling", () -> new ModSaplingBlock(new ElderWoodTreeGrower(), BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING), Blocks.DIRT, Blocks.GRASS_BLOCK, Blocks.STONE));
    public static final RegistryObject<Block> ELDER_WOOD_PLANKS = registerBlock("elder_wood_planks", () -> new ModFlammableBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> ELDER_WOOD_PLANKS_SLAB = registerBlock("elder_wood_planks_slab", () -> new ModFlammableSlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB)));
    public static final RegistryObject<Block> ELDER_WOOD_PLANKS_STAIRS = registerBlock("elder_wood_planks_stairs", () -> new ModFlammableStairBlock(() -> ModBlocks.ELDER_WOOD_PLANKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS)));
    public static final RegistryObject<Block> ELDER_WOOD_PLANKS_PRESSURE_PLATE = registerBlock("elder_wood_planks_pressure_plate", () -> new ModFlammablePressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, BlockBehaviour.Properties.copy(Blocks.OAK_PRESSURE_PLATE), ModBlockSetType.ELDER_WOOD));
    public static final RegistryObject<Block> ELDER_WOOD_PLANKS_DOOR = registerBlock("elder_wood_planks_door", () -> new ModFlammableDoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_DOOR), ModBlockSetType.ELDER_WOOD));
    public static final RegistryObject<Block> ELDER_WOOD_PLANKS_TRAPDOOR = registerBlock("elder_wood_planks_trapdoor", () -> new ModFlammableTrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_TRAPDOOR), ModBlockSetType.ELDER_WOOD));
    public static final RegistryObject<Block> ELDER_WOOD_PLANKS_FENCE = registerBlock("elder_wood_planks_fence", () -> new ModFlammableFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE)));
    public static final RegistryObject<Block> ELDER_WOOD_PLANKS_FENCE_GATE = registerBlock("elder_wood_planks_fence_gate", () -> new ModFlammableFenceGateBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE_GATE), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE));
    public static final RegistryObject<Block> ELDER_WOOD_PLANKS_BUTTON = registerBlock("elder_wood_planks_button", () -> new ModFlammableButtonBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_SIGN), ModBlockSetType.ELDER_WOOD, 10, false));
    public static final RegistryObject<Block> ELDER_WOOD_PLANKS_SIGN = BLOCKS.register("elder_wood_planks_sign", () -> new ModStandingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SIGN), ModWoodTypes.ELDER_WOOD));
    public static final RegistryObject<Block> ELDER_WOOD_PLANKS_WALL_SIGN = BLOCKS.register("elder_wood_planks_wall_sign", () -> new ModWallSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_SIGN), ModWoodTypes.ELDER_WOOD));
    public static final RegistryObject<Block> ELDER_WOOD_PLANKS_HANGING_SIGN = BLOCKS.register("elder_wood_planks_hanging_sign", () -> new ModHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_HANGING_SIGN), ModWoodTypes.ELDER_WOOD));
    public static final RegistryObject<Block> ELDER_WOOD_PLANKS_WALL_HANGING_SIGN = BLOCKS.register("elder_wood_planks_wall_hanging_sign", () -> new ModWallHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_HANGING_SIGN), ModWoodTypes.ELDER_WOOD));

    //Olive
    public static final RegistryObject<Block> OLIVE_LOG = registerBlock("olive_log", () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)));
    public static final RegistryObject<Block> OLIVE_WOOD = registerBlock("olive_wood", () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)));
    public static final RegistryObject<Block> STRIPPED_OLIVE_LOG = registerBlock("stripped_olive_log", () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_LOG)));
    public static final RegistryObject<Block> STRIPPED_OLIVE_WOOD = registerBlock("stripped_olive_wood", () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD)));
    public static final RegistryObject<Block> OLIVE_LEAVES = registerBlock("olive_leaves", () -> new ModFlammableLeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)));
    public static final RegistryObject<Block> OLIVE_SAPLING = registerBlock("olive_sapling", () -> new ModSaplingBlock(new OliveTreeGrower(), BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING), Blocks.DIRT, Blocks.GRASS_BLOCK, Blocks.STONE));
    public static final RegistryObject<Block> OLIVE_PLANKS = registerBlock("olive_planks", () -> new ModFlammableBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> OLIVE_PLANKS_SLAB = registerBlock("olive_planks_slab", () -> new ModFlammableSlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB)));
    public static final RegistryObject<Block> OLIVE_PLANKS_STAIRS = registerBlock("olive_planks_stairs", () -> new ModFlammableStairBlock(() -> ModBlocks.OLIVE_PLANKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS)));
    public static final RegistryObject<Block> OLIVE_PLANKS_PRESSURE_PLATE = registerBlock("olive_planks_pressure_plate", () -> new ModFlammablePressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, BlockBehaviour.Properties.copy(Blocks.OAK_PRESSURE_PLATE), ModBlockSetType.OLIVE));
    public static final RegistryObject<Block> OLIVE_PLANKS_DOOR = registerBlock("olive_planks_door", () -> new ModFlammableDoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_DOOR), ModBlockSetType.OLIVE));
    public static final RegistryObject<Block> OLIVE_PLANKS_TRAPDOOR = registerBlock("olive_planks_trapdoor", () -> new ModFlammableTrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_TRAPDOOR), ModBlockSetType.OLIVE));
    public static final RegistryObject<Block> OLIVE_PLANKS_FENCE = registerBlock("olive_planks_fence", () -> new ModFlammableFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE)));
    public static final RegistryObject<Block> OLIVE_PLANKS_FENCE_GATE = registerBlock("olive_planks_fence_gate", () -> new ModFlammableFenceGateBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE_GATE), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE));
    public static final RegistryObject<Block> OLIVE_PLANKS_BUTTON = registerBlock("olive_planks_button", () -> new ModFlammableButtonBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_SIGN), ModBlockSetType.OLIVE, 10, false));
    public static final RegistryObject<Block> OLIVE_PLANKS_SIGN = BLOCKS.register("olive_planks_sign", () -> new ModStandingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SIGN), ModWoodTypes.OLIVE));
    public static final RegistryObject<Block> OLIVE_PLANKS_WALL_SIGN = BLOCKS.register("olive_planks_wall_sign", () -> new ModWallSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_SIGN), ModWoodTypes.OLIVE));
    public static final RegistryObject<Block> OLIVE_PLANKS_HANGING_SIGN = BLOCKS.register("olive_planks_hanging_sign", () -> new ModHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_HANGING_SIGN), ModWoodTypes.OLIVE));
    public static final RegistryObject<Block> OLIVE_PLANKS_WALL_HANGING_SIGN = BLOCKS.register("olive_planks_wall_hanging_sign", () -> new ModWallHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_HANGING_SIGN), ModWoodTypes.OLIVE));

    //Myrrh
    public static final RegistryObject<Block> MYRRH_LOG = registerBlock("myrrh_log", () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)));
    public static final RegistryObject<Block> MYRRH_WOOD = registerBlock("myrrh_wood", () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)));
    public static final RegistryObject<Block> STRIPPED_MYRRH_LOG = registerBlock("stripped_myrrh_log", () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_LOG)));
    public static final RegistryObject<Block> STRIPPED_MYRRH_WOOD = registerBlock("stripped_myrrh_wood", () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD)));
    public static final RegistryObject<Block> MYRRH_LEAVES = registerBlock("myrrh_leaves", () -> new ModFlammableLeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)));
    public static final RegistryObject<Block> MYRRH_SAPLING = registerBlock("myrrh_sapling", () -> new ModSaplingBlock(new MyrrhTreeGrower(), BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING), Blocks.DIRT, Blocks.GRASS_BLOCK, Blocks.STONE));
    public static final RegistryObject<Block> MYRRH_PLANKS = registerBlock("myrrh_planks", () -> new ModFlammableBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> MYRRH_PLANKS_SLAB = registerBlock("myrrh_planks_slab", () -> new ModFlammableSlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB)));
    public static final RegistryObject<Block> MYRRH_PLANKS_STAIRS = registerBlock("myrrh_planks_stairs", () -> new ModFlammableStairBlock(() -> ModBlocks.MYRRH_PLANKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS)));
    public static final RegistryObject<Block> MYRRH_PLANKS_PRESSURE_PLATE = registerBlock("myrrh_planks_pressure_plate", () -> new ModFlammablePressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, BlockBehaviour.Properties.copy(Blocks.OAK_PRESSURE_PLATE), ModBlockSetType.MYRRH));
    public static final RegistryObject<Block> MYRRH_PLANKS_DOOR = registerBlock("myrrh_planks_door", () -> new ModFlammableDoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_DOOR), ModBlockSetType.MYRRH));
    public static final RegistryObject<Block> MYRRH_PLANKS_TRAPDOOR = registerBlock("myrrh_planks_trapdoor", () -> new ModFlammableTrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_TRAPDOOR), ModBlockSetType.MYRRH));
    public static final RegistryObject<Block> MYRRH_PLANKS_FENCE = registerBlock("myrrh_planks_fence", () -> new ModFlammableFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE)));
    public static final RegistryObject<Block> MYRRH_PLANKS_FENCE_GATE = registerBlock("myrrh_planks_fence_gate", () -> new ModFlammableFenceGateBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE_GATE), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE));
    public static final RegistryObject<Block> MYRRH_PLANKS_BUTTON = registerBlock("myrrh_planks_button", () -> new ModFlammableButtonBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_SIGN), ModBlockSetType.MYRRH, 10, false));
    public static final RegistryObject<Block> MYRRH_PLANKS_SIGN = BLOCKS.register("myrrh_planks_sign", () -> new ModStandingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SIGN), ModWoodTypes.MYRRH));
    public static final RegistryObject<Block> MYRRH_PLANKS_WALL_SIGN = BLOCKS.register("myrrh_planks_wall_sign", () -> new ModWallSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_SIGN), ModWoodTypes.MYRRH));
    public static final RegistryObject<Block> MYRRH_PLANKS_HANGING_SIGN = BLOCKS.register("myrrh_planks_hanging_sign", () -> new ModHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_HANGING_SIGN), ModWoodTypes.MYRRH));
    public static final RegistryObject<Block> MYRRH_PLANKS_WALL_HANGING_SIGN = BLOCKS.register("myrrh_planks_wall_hanging_sign", () -> new ModWallHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_HANGING_SIGN), ModWoodTypes.MYRRH));

    //Laurel
    public static final RegistryObject<Block> LAUREL_LOG = registerBlock("laurel_log", () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)));
    public static final RegistryObject<Block> LAUREL_WOOD = registerBlock("laurel_wood", () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)));
    public static final RegistryObject<Block> STRIPPED_LAUREL_LOG = registerBlock("stripped_laurel_log", () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_LOG)));
    public static final RegistryObject<Block> STRIPPED_LAUREL_WOOD = registerBlock("stripped_laurel_wood", () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD)));
    public static final RegistryObject<Block> LAUREL_LEAVES = registerBlock("laurel_leaves", () -> new ModFlammableLeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)));
    public static final RegistryObject<Block> LAUREL_SAPLING = registerBlock("laurel_sapling", () -> new ModSaplingBlock(new LaurelTreeGrower(), BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING), Blocks.DIRT, Blocks.GRASS_BLOCK, Blocks.STONE));
    public static final RegistryObject<Block> LAUREL_PLANKS = registerBlock("laurel_planks", () -> new ModFlammableBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> LAUREL_PLANKS_SLAB = registerBlock("laurel_planks_slab", () -> new ModFlammableSlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB)));
    public static final RegistryObject<Block> LAUREL_PLANKS_STAIRS = registerBlock("laurel_planks_stairs", () -> new ModFlammableStairBlock(() -> ModBlocks.LAUREL_PLANKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS)));
    public static final RegistryObject<Block> LAUREL_PLANKS_PRESSURE_PLATE = registerBlock("laurel_planks_pressure_plate", () -> new ModFlammablePressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, BlockBehaviour.Properties.copy(Blocks.OAK_PRESSURE_PLATE), ModBlockSetType.LAUREL));
    public static final RegistryObject<Block> LAUREL_PLANKS_DOOR = registerBlock("laurel_planks_door", () -> new ModFlammableDoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_DOOR), ModBlockSetType.LAUREL));
    public static final RegistryObject<Block> LAUREL_PLANKS_TRAPDOOR = registerBlock("laurel_planks_trapdoor", () -> new ModFlammableTrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_TRAPDOOR), ModBlockSetType.LAUREL));
    public static final RegistryObject<Block> LAUREL_PLANKS_FENCE = registerBlock("laurel_planks_fence", () -> new ModFlammableFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE)));
    public static final RegistryObject<Block> LAUREL_PLANKS_FENCE_GATE = registerBlock("laurel_planks_fence_gate", () -> new ModFlammableFenceGateBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE_GATE), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE));
    public static final RegistryObject<Block> LAUREL_PLANKS_BUTTON = registerBlock("laurel_planks_button", () -> new ModFlammableButtonBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_SIGN), ModBlockSetType.LAUREL, 10, false));
    public static final RegistryObject<Block> LAUREL_PLANKS_SIGN = BLOCKS.register("laurel_planks_sign", () -> new ModStandingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SIGN), ModWoodTypes.LAUREL));
    public static final RegistryObject<Block> LAUREL_PLANKS_WALL_SIGN = BLOCKS.register("laurel_planks_wall_sign", () -> new ModWallSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_SIGN), ModWoodTypes.LAUREL));
    public static final RegistryObject<Block> LAUREL_PLANKS_HANGING_SIGN = BLOCKS.register("laurel_planks_hanging_sign", () -> new ModHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_HANGING_SIGN), ModWoodTypes.LAUREL));
    public static final RegistryObject<Block> LAUREL_PLANKS_WALL_HANGING_SIGN = BLOCKS.register("laurel_planks_wall_hanging_sign", () -> new ModWallHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_HANGING_SIGN), ModWoodTypes.LAUREL));

    //Cypress
    public static final RegistryObject<Block> CYPRESS_LOG = registerBlock("cypress_log", () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)));
    public static final RegistryObject<Block> CYPRESS_WOOD = registerBlock("cypress_wood", () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)));
    public static final RegistryObject<Block> STRIPPED_CYPRESS_LOG = registerBlock("stripped_cypress_log", () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_LOG)));
    public static final RegistryObject<Block> STRIPPED_CYPRESS_WOOD = registerBlock("stripped_cypress_wood", () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD)));
    public static final RegistryObject<Block> CYPRESS_LEAVES = registerBlock("cypress_leaves", () -> new ModFlammableLeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)));
    public static final RegistryObject<Block> CYPRESS_SAPLING = registerBlock("cypress_sapling", () -> new ModSaplingBlock(new CypressTreeGrower(), BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING), Blocks.DIRT, Blocks.GRASS_BLOCK, Blocks.STONE));
    public static final RegistryObject<Block> CYPRESS_PLANKS = registerBlock("cypress_planks", () -> new ModFlammableBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> CYPRESS_PLANKS_SLAB = registerBlock("cypress_planks_slab", () -> new ModFlammableSlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB)));
    public static final RegistryObject<Block> CYPRESS_PLANKS_STAIRS = registerBlock("cypress_planks_stairs", () -> new ModFlammableStairBlock(() -> ModBlocks.CYPRESS_PLANKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS)));
    public static final RegistryObject<Block> CYPRESS_PLANKS_PRESSURE_PLATE = registerBlock("cypress_planks_pressure_plate", () -> new ModFlammablePressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, BlockBehaviour.Properties.copy(Blocks.OAK_PRESSURE_PLATE), ModBlockSetType.CYPRESS));
    public static final RegistryObject<Block> CYPRESS_PLANKS_DOOR = registerBlock("cypress_planks_door", () -> new ModFlammableDoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_DOOR), ModBlockSetType.CYPRESS));
    public static final RegistryObject<Block> CYPRESS_PLANKS_TRAPDOOR = registerBlock("cypress_planks_trapdoor", () -> new ModFlammableTrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_TRAPDOOR), ModBlockSetType.CYPRESS));
    public static final RegistryObject<Block> CYPRESS_PLANKS_FENCE = registerBlock("cypress_planks_fence", () -> new ModFlammableFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE)));
    public static final RegistryObject<Block> CYPRESS_PLANKS_FENCE_GATE = registerBlock("cypress_planks_fence_gate", () -> new ModFlammableFenceGateBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE_GATE), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE));
    public static final RegistryObject<Block> CYPRESS_PLANKS_BUTTON = registerBlock("cypress_planks_button", () -> new ModFlammableButtonBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_SIGN), ModBlockSetType.CYPRESS, 10, false));
    public static final RegistryObject<Block> CYPRESS_PLANKS_SIGN = BLOCKS.register("cypress_planks_sign", () -> new ModStandingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SIGN), ModWoodTypes.CYPRESS));
    public static final RegistryObject<Block> CYPRESS_PLANKS_WALL_SIGN = BLOCKS.register("cypress_planks_wall_sign", () -> new ModWallSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_SIGN), ModWoodTypes.CYPRESS));
    public static final RegistryObject<Block> CYPRESS_PLANKS_HANGING_SIGN = BLOCKS.register("cypress_planks_hanging_sign", () -> new ModHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_HANGING_SIGN), ModWoodTypes.CYPRESS));
    public static final RegistryObject<Block> CYPRESS_PLANKS_WALL_HANGING_SIGN = BLOCKS.register("cypress_planks_wall_hanging_sign", () -> new ModWallHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_HANGING_SIGN), ModWoodTypes.CYPRESS));

    /*
    *   Crimson Dimension
    */
    //Crimson Diamond
    public static final RegistryObject<Block> CRIMSON_DIAMOND_BLOCK = registerBlock("crimson_diamond_block", () -> new Block(BlockBehaviour.Properties.copy(Blocks.DIAMOND_BLOCK).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> CRIMSON_DIAMOND_LAMP = registerBlock("crimson_diamond_lamp", () -> new CrimsonDiamondLampBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_BLUE).sound(ModSounds.CRIMSON_DIAMOND_LAMP_SOUNDS).lightLevel(state -> state.getValue(CrimsonDiamondLampBlock.LIT) ? 15 : 0)));

    //Nether Steel
    public static final RegistryObject<Block> NETHER_STEEL_BLOCK = registerBlock("nether_steel_block", () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> RAW_NETHER_STEEL_BLOCK = registerBlock("raw_nether_steel_block", () -> new Block(BlockBehaviour.Properties.copy(Blocks.RAW_IRON_BLOCK).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> NETHER_STEEL_ORE = registerBlock("nether_steel_ore", () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.IRON_ORE).requiresCorrectToolForDrops(), UniformInt.of(2, 5)));
    public static final RegistryObject<Block> DEEPSLATE_NETHER_STEEL_ORE = registerBlock("deepslate_nether_steel_ore", () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_IRON_ORE).requiresCorrectToolForDrops(), UniformInt.of(3, 7)));


    //Crimson Stone
    public static final RegistryObject<Block> CRIMSON_STONE = registerBlock("crimson_stone", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> CRIMSON_STONE_STAIRS = registerBlock("crimson_stone_stairs", () -> new StairBlock(() -> ModBlocks.CRIMSON_STONE.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE_STAIRS).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> CRIMSON_STONE_SLAB = registerBlock("crimson_stone_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE_SLAB).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> CRIMSON_STONE_PRESSURE_PLATE = registerBlock("crimson_stone_pressure_plate", () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, BlockBehaviour.Properties.copy(Blocks.STONE_STAIRS).requiresCorrectToolForDrops(), BlockSetType.STONE));
    public static final RegistryObject<Block> CRIMSON_STONE_BUTTON = registerBlock("crimson_stone_button", () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BUTTON).requiresCorrectToolForDrops(), BlockSetType.STONE, 10, false));

    public static final RegistryObject<Block> CRIMSON_STONE_FENCE = registerBlock("crimson_stone_fence", () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.NETHER_BRICK_FENCE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> CRIMSON_STONE_FENCE_GATE = registerBlock("crimson_stone_fence_gate", () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.WARPED_FENCE_GATE).requiresCorrectToolForDrops(), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE));
    public static final RegistryObject<Block> CRIMSON_STONE_WALL = registerBlock("crimson_stone_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_WALL).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> CRIMSON_STONE_DOOR = registerBlock("crimson_stone_door", () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_WALL).requiresCorrectToolForDrops(), BlockSetType.STONE));
    public static final RegistryObject<Block> CRIMSON_STONE_TRAPDOOR = registerBlock("crimson_stone_trapdoor", () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_WALL).requiresCorrectToolForDrops(), BlockSetType.STONE));

    public static final RegistryObject<Block> CRIMSON_COBBLESTONE = registerBlock("crimson_cobblestone", () -> new Block(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> CRIMSON_COBBLESTONE_STAIRS = registerBlock("crimson_cobblestone_stairs", () -> new StairBlock(() -> ModBlocks.CRIMSON_COBBLESTONE.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.COBBLESTONE_STAIRS).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> CRIMSON_COBBLESTONE_SLAB = registerBlock("crimson_cobblestone_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE_SLAB).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> CRIMSON_STONE_BRICKS = registerBlock("crimson_stone_bricks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> CRIMSON_STONE_BRICK_STAIRS = registerBlock("crimson_stone_brick_stairs", () -> new StairBlock(() -> ModBlocks.CRIMSON_STONE_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_STAIRS).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> CRIMSON_STONE_BRICK_SLAB = registerBlock("crimson_stone_brick_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_SLAB).requiresCorrectToolForDrops()));

    /*
     * Atlantas Blocks
     */
    public static final RegistryObject<Block> ATLANTAS_WATER_REMOVER_BLOCK = registerBlock("atlantas_water_remover_block", () -> new WaterRemoverBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_BLUE).sound(ModSounds.CRIMSON_DIAMOND_LAMP_SOUNDS).lightLevel(state -> state.getValue(WaterRemoverBlock.LIT) ? 15 : 0)));

    /*
     * World Metals
     */
    //Zinc
    //https://en.wikipedia.org/wiki/Zinc
    public static final RegistryObject<Block> ZINC_BLOCK = registerBlock("zinc_block", () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> RAW_ZINC_BLOCK = registerBlock("raw_zinc_block", () -> new Block(BlockBehaviour.Properties.copy(Blocks.RAW_IRON_BLOCK).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> ZINC_ORE = registerBlock("zinc_ore", () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.IRON_ORE).requiresCorrectToolForDrops(), UniformInt.of(2, 5)));
    public static final RegistryObject<Block> DEEPSLATE_ZINC_ORE = registerBlock("deepslate_zinc_ore", () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_IRON_ORE).requiresCorrectToolForDrops(), UniformInt.of(3, 7)));

    //Tin
    //https://en.wikipedia.org/wiki/Tin
    public static final RegistryObject<Block> TIN_BLOCK = registerBlock("tin_block", () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> RAW_TIN_BLOCK = registerBlock("raw_tin_block", () -> new Block(BlockBehaviour.Properties.copy(Blocks.RAW_IRON_BLOCK).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> TIN_ORE = registerBlock("tin_ore", () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.IRON_ORE).requiresCorrectToolForDrops(), UniformInt.of(2, 5)));
    public static final RegistryObject<Block> DEEPSLATE_TIN_ORE = registerBlock("deepslate_tin_ore", () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_IRON_ORE).requiresCorrectToolForDrops(), UniformInt.of(3, 7)));

    /*
     * World Crystals
     */
    //Aurichalcite
    //https://en.wikipedia.org/wiki/Aurichalcite
    public static final RegistryObject<Block> AURICHALCITE_BLOCK = registerBlock("aurichalcite_block", () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.IRON_ORE).requiresCorrectToolForDrops(), UniformInt.of(2, 5)));

    /*
     * World Alloys
     */
    //Brass
    //https://en.wikipedia.org/wiki/Brass
    public static final RegistryObject<Block> BRASS_BLOCK = registerBlock("brass_block", () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.IRON_ORE).requiresCorrectToolForDrops(), UniformInt.of(2, 5)));

    //Bronze
    //https://en.wikipedia.org/wiki/Bronze
    public static final RegistryObject<Block> BRONZE_BLOCK = registerBlock("bronze_block", () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.IRON_ORE).requiresCorrectToolForDrops(), UniformInt.of(2, 5)));

    /*
     *   Greek Myth Metals
     */
    //Orichalcum
    //https://en.wikipedia.org/wiki/Orichalcum
    public static final RegistryObject<Block> ORICHALCUM_BLOCK = registerBlock("orichalcum_block", () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> RAW_ORICHALCUM_BLOCK = registerBlock("raw_orichalcum_block", () -> new Block(BlockBehaviour.Properties.copy(Blocks.RAW_IRON_BLOCK).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> ORICHALCUM_ORE = registerBlock("orichalcum_ore", () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.IRON_ORE).requiresCorrectToolForDrops(), UniformInt.of(2, 5)));
    public static final RegistryObject<Block> DEEPSLATE_ORICHALCUM_ORE = registerBlock("deepslate_orichalcum_ore", () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_IRON_ORE).requiresCorrectToolForDrops(), UniformInt.of(3, 7)));

    //Adamant
    //https://en.wikipedia.org/wiki/Adamant
    public static final RegistryObject<Block> ADAMANT_BLOCK = registerBlock("adamant_block", () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> ADAMANT_ORE = registerBlock("adamant_ore", () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.IRON_ORE).requiresCorrectToolForDrops(), UniformInt.of(2, 5)));
    public static final RegistryObject<Block> DEEPSLATE_ADAMANT_ORE = registerBlock("deepslate_adamant_ore", () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_IRON_ORE).requiresCorrectToolForDrops(), UniformInt.of(3, 7)));

    /*
     *Plants
     */
    public static final RegistryObject<Block> POMEGRANATE_CROP_BLOCK = BLOCKS.register("pomegranate_crop_block", () -> new PomegranateCropBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT).noCollission().noOcclusion()));
    public static final RegistryObject<Block> IRIS_FLOWER = registerBlock("iris_flower", () -> new FlowerBlock(() -> MobEffects.MOVEMENT_SPEED, 1, BlockBehaviour.Properties.copy(Blocks.DANDELION)));
    public static final RegistryObject<Block> POTTED_IRIS_FLOWER = BLOCKS.register("potted_iris_flower", () -> new FlowerPotBlock((() -> (FlowerPotBlock) Blocks.FLOWER_POT), IRIS_FLOWER, BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION)));
    public static final RegistryObject<LiquidBlock> STYX_WATER_BLOCK = BLOCKS.register("styx_water_block", () -> new LiquidBlock(ModFluids.SOURCE_STYX_WATER, BlockBehaviour.Properties.copy(Blocks.WATER).noLootTable()));

    /*
     * WORLD BLOCKS
    */
    //Underworld
//    public static final RegistryObject<Block> UNDERWORLD_GRASS_BLOCK = registerBlock("underworld_grass_block", () -> new Block(BlockBehaviour.Properties.copy(Blocks.GRASS_BLOCK).noOcclusion()));
    public static final RegistryObject<Block> UNDERWORLD_DIRT = registerBlock("underworld_dirt_block", () -> new Block(BlockBehaviour.Properties.copy(Blocks.DIRT)));

    /*
    DIMENSIONAL BLOCKS
     */
    public static final RegistryObject<Block> UNDERWORLD_PORTAL_FRAME = registerBlock("underworld_portal_frame", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> NIDAVELLIR_PORTAL_FRAME = registerBlock("nidavellir_portal_frame", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> ALFHEIMR_PORTAL_FRAME = registerBlock("alfheimr_portal_frame", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> ATLANTIS_PORTAL_FRAME = registerBlock("atlantis_portal_frame", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> SKYOPIA_PORTAL_FRAME = registerBlock("skyopia_portal_frame", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block>RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }
    public static void register(IEventBus eventBus){
        BLOCKS.register(eventBus);
    }
}
