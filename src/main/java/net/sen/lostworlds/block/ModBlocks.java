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

    public static final RegistryObject<Block> NIDAVELLIR_SOFT_STONE_IRON_ORE = registerBlock("nidavellir_soft_stone_iron_ore", () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_ORE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> NIDAVELLIR_SOFT_STONE_GOLD_ORE = registerBlock("nidavellir_soft_stone_gold_ore", () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_ORE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> NIDAVELLIR_SOFT_STONE_COPPER_ORE = registerBlock("nidavellir_soft_stone_copper_ore", () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_ORE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> NIDAVELLIR_SOFT_STONE_TIN_ORE = registerBlock("nidavellir_soft_stone_tin_ore", () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_ORE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> NIDAVELLIR_SOFT_STONE_ZINC_ORE = registerBlock("nidavellir_soft_stone_zinc_ore", () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_ORE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> NIDAVELLIR_SOFT_STONE_DIAMOND_ORE = registerBlock("nidavellir_soft_stone_diamond_ore", () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_ORE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> NIDAVELLIR_SOFT_STONE_EMERALD_ORE = registerBlock("nidavellir_soft_stone_emerald_ore", () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_ORE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> NIDAVELLIR_SOFT_STONE_COAL_ORE = registerBlock("nidavellir_soft_stone_coal_ore", () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_ORE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> NIDAVELLIR_SOFT_STONE_REDSTONE_ORE = registerBlock("nidavellir_soft_stone_redstone_ore", () -> new ModRedStoneOreBlock(BlockBehaviour.Properties.copy(Blocks.REDSTONE_ORE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> NIDAVELLIR_SOFT_STONE_LAPIS_ORE = registerBlock("nidavellir_soft_stone_lapis_ore", () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_ORE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> NIDAVELLIR_SOFT_STONE_AQUAMARINE_ORE = registerBlock("nidavellir_soft_stone_aquamarine_ore", () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_ORE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> NIDAVELLIR_SOFT_STONE_OPAL_ORE = registerBlock("nidavellir_soft_stone_opal_ore", () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_ORE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> NIDAVELLIR_SOFT_STONE_RUBY_ORE = registerBlock("nidavellir_soft_stone_ruby_ore", () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_ORE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> NIDAVELLIR_SOFT_STONE_IRON_ORE_CLUSTER = registerBlock("nidavellir_soft_stone_iron_ore_cluster", () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_ORE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> NIDAVELLIR_SOFT_STONE_GOLD_ORE_CLUSTER = registerBlock("nidavellir_soft_stone_gold_ore_cluster", () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_ORE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> NIDAVELLIR_SOFT_STONE_COPPER_ORE_CLUSTER = registerBlock("nidavellir_soft_stone_copper_ore_cluster", () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_ORE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> NIDAVELLIR_SOFT_STONE_TIN_ORE_CLUSTER = registerBlock("nidavellir_soft_stone_tin_ore_cluster", () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_ORE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> NIDAVELLIR_SOFT_STONE_ZINC_ORE_CLUSTER = registerBlock("nidavellir_soft_stone_zinc_ore_cluster", () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_ORE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> NIDAVELLIR_SOFT_STONE_DIAMOND_ORE_CLUSTER = registerBlock("nidavellir_soft_stone_diamond_ore_cluster", () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_ORE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> NIDAVELLIR_SOFT_STONE_EMERALD_ORE_CLUSTER = registerBlock("nidavellir_soft_stone_emerald_ore_cluster", () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_ORE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> NIDAVELLIR_SOFT_STONE_COAL_ORE_CLUSTER = registerBlock("nidavellir_soft_stone_coal_ore_cluster", () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_ORE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> NIDAVELLIR_SOFT_STONE_REDSTONE_ORE_CLUSTER = registerBlock("nidavellir_soft_stone_redstone_ore_cluster", () -> new ModRedStoneOreBlock(BlockBehaviour.Properties.copy(Blocks.REDSTONE_ORE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> NIDAVELLIR_SOFT_STONE_LAPIS_ORE_CLUSTER = registerBlock("nidavellir_soft_stone_lapis_ore_cluster", () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_ORE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> NIDAVELLIR_SOFT_STONE_AQUAMARINE_ORE_CLUSTER = registerBlock("nidavellir_soft_stone_aquamarine_ore_cluster", () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_ORE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> NIDAVELLIR_SOFT_STONE_OPAL_ORE_CLUSTER = registerBlock("nidavellir_soft_stone_opal_ore_cluster", () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_ORE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> NIDAVELLIR_SOFT_STONE_RUBY_ORE_CLUSTER = registerBlock("nidavellir_soft_stone_ruby_ore_cluster", () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_ORE).requiresCorrectToolForDrops()));

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

    public static final RegistryObject<Block> NIDAVELLIR_HARD_STONE_IRON_ORE = registerBlock("nidavellir_hard_stone_iron_ore", () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_ORE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> NIDAVELLIR_HARD_STONE_GOLD_ORE = registerBlock("nidavellir_hard_stone_gold_ore", () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_ORE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> NIDAVELLIR_HARD_STONE_COPPER_ORE = registerBlock("nidavellir_hard_stone_copper_ore", () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_ORE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> NIDAVELLIR_HARD_STONE_TIN_ORE = registerBlock("nidavellir_hard_stone_tin_ore", () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_ORE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> NIDAVELLIR_HARD_STONE_ZINC_ORE = registerBlock("nidavellir_hard_stone_zinc_ore", () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_ORE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> NIDAVELLIR_HARD_STONE_DIAMOND_ORE = registerBlock("nidavellir_hard_stone_diamond_ore", () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_ORE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> NIDAVELLIR_HARD_STONE_EMERALD_ORE = registerBlock("nidavellir_hard_stone_emerald_ore", () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_ORE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> NIDAVELLIR_HARD_STONE_COAL_ORE = registerBlock("nidavellir_hard_stone_coal_ore", () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_ORE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> NIDAVELLIR_HARD_STONE_REDSTONE_ORE = registerBlock("nidavellir_hard_stone_redstone_ore", () -> new ModRedStoneOreBlock(BlockBehaviour.Properties.copy(Blocks.REDSTONE_ORE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> NIDAVELLIR_HARD_STONE_LAPIS_ORE = registerBlock("nidavellir_hard_stone_lapis_ore", () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_ORE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> NIDAVELLIR_HARD_STONE_AQUAMARINE_ORE = registerBlock("nidavellir_hard_stone_aquamarine_ore", () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_ORE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> NIDAVELLIR_HARD_STONE_OPAL_ORE = registerBlock("nidavellir_hard_stone_opal_ore", () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_ORE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> NIDAVELLIR_HARD_STONE_RUBY_ORE = registerBlock("nidavellir_hard_stone_ruby_ore", () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_ORE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> NIDAVELLIR_HARD_STONE_IRON_ORE_CLUSTER = registerBlock("nidavellir_hard_stone_iron_ore_cluster", () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_ORE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> NIDAVELLIR_HARD_STONE_GOLD_ORE_CLUSTER = registerBlock("nidavellir_hard_stone_gold_ore_cluster", () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_ORE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> NIDAVELLIR_HARD_STONE_COPPER_ORE_CLUSTER = registerBlock("nidavellir_hard_stone_copper_ore_cluster", () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_ORE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> NIDAVELLIR_HARD_STONE_TIN_ORE_CLUSTER = registerBlock("nidavellir_hard_stone_tin_ore_cluster", () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_ORE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> NIDAVELLIR_HARD_STONE_ZINC_ORE_CLUSTER = registerBlock("nidavellir_hard_stone_zinc_ore_cluster", () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_ORE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> NIDAVELLIR_HARD_STONE_DIAMOND_ORE_CLUSTER = registerBlock("nidavellir_hard_stone_diamond_ore_cluster", () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_ORE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> NIDAVELLIR_HARD_STONE_EMERALD_ORE_CLUSTER = registerBlock("nidavellir_hard_stone_emerald_ore_cluster", () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_ORE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> NIDAVELLIR_HARD_STONE_COAL_ORE_CLUSTER = registerBlock("nidavellir_hard_stone_coal_ore_cluster", () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_ORE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> NIDAVELLIR_HARD_STONE_REDSTONE_ORE_CLUSTER = registerBlock("nidavellir_hard_stone_redstone_ore_cluster", () -> new ModRedStoneOreBlock(BlockBehaviour.Properties.copy(Blocks.REDSTONE_ORE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> NIDAVELLIR_HARD_STONE_LAPIS_ORE_CLUSTER = registerBlock("nidavellir_hard_stone_lapis_ore_cluster", () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_ORE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> NIDAVELLIR_HARD_STONE_AQUAMARINE_ORE_CLUSTER = registerBlock("nidavellir_hard_stone_aquamarine_ore_cluster", () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_ORE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> NIDAVELLIR_HARD_STONE_OPAL_ORE_CLUSTER = registerBlock("nidavellir_hard_stone_opal_ore_cluster", () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_ORE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> NIDAVELLIR_HARD_STONE_RUBY_ORE_CLUSTER = registerBlock("nidavellir_hard_stone_ruby_ore_cluster", () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_ORE).requiresCorrectToolForDrops()));

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

    public static final RegistryObject<Block> NIDAVELLIR_ENHANCED_STONE_IRON_ORE = registerBlock("nidavellir_enhanced_stone_iron_ore", () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_ORE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> NIDAVELLIR_ENHANCED_STONE_GOLD_ORE = registerBlock("nidavellir_enhanced_stone_gold_ore", () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_ORE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> NIDAVELLIR_ENHANCED_STONE_COPPER_ORE = registerBlock("nidavellir_enhanced_stone_copper_ore", () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_ORE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> NIDAVELLIR_ENHANCED_STONE_TIN_ORE = registerBlock("nidavellir_enhanced_stone_tin_ore", () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_ORE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> NIDAVELLIR_ENHANCED_STONE_ZINC_ORE = registerBlock("nidavellir_enhanced_stone_zinc_ore", () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_ORE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> NIDAVELLIR_ENHANCED_STONE_DIAMOND_ORE = registerBlock("nidavellir_enhanced_stone_diamond_ore", () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_ORE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> NIDAVELLIR_ENHANCED_STONE_EMERALD_ORE = registerBlock("nidavellir_enhanced_stone_emerald_ore", () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_ORE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> NIDAVELLIR_ENHANCED_STONE_COAL_ORE = registerBlock("nidavellir_enhanced_stone_coal_ore", () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_ORE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> NIDAVELLIR_ENHANCED_STONE_REDSTONE_ORE = registerBlock("nidavellir_enhanced_stone_redstone_ore", () -> new ModRedStoneOreBlock(BlockBehaviour.Properties.copy(Blocks.REDSTONE_ORE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> NIDAVELLIR_ENHANCED_STONE_LAPIS_ORE = registerBlock("nidavellir_enhanced_stone_lapis_ore", () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_ORE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> NIDAVELLIR_ENHANCED_STONE_AQUAMARINE_ORE = registerBlock("nidavellir_enhanced_stone_aquamarine_ore", () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_ORE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> NIDAVELLIR_ENHANCED_STONE_OPAL_ORE = registerBlock("nidavellir_enhanced_stone_opal_ore", () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_ORE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> NIDAVELLIR_ENHANCED_STONE_RUBY_ORE = registerBlock("nidavellir_enhanced_stone_ruby_ore", () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_ORE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> NIDAVELLIR_ENHANCED_STONE_IRON_ORE_CLUSTER = registerBlock("nidavellir_enhanced_stone_iron_ore_cluster", () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_ORE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> NIDAVELLIR_ENHANCED_STONE_GOLD_ORE_CLUSTER = registerBlock("nidavellir_enhanced_stone_gold_ore_cluster", () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_ORE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> NIDAVELLIR_ENHANCED_STONE_COPPER_ORE_CLUSTER = registerBlock("nidavellir_enhanced_stone_copper_ore_cluster", () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_ORE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> NIDAVELLIR_ENHANCED_STONE_TIN_ORE_CLUSTER = registerBlock("nidavellir_enhanced_stone_tin_ore_cluster", () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_ORE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> NIDAVELLIR_ENHANCED_STONE_ZINC_ORE_CLUSTER = registerBlock("nidavellir_enhanced_stone_zinc_ore_cluster", () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_ORE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> NIDAVELLIR_ENHANCED_STONE_DIAMOND_ORE_CLUSTER = registerBlock("nidavellir_enhanced_stone_diamond_ore_cluster", () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_ORE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> NIDAVELLIR_ENHANCED_STONE_EMERALD_ORE_CLUSTER = registerBlock("nidavellir_enhanced_stone_emerald_ore_cluster", () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_ORE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> NIDAVELLIR_ENHANCED_STONE_COAL_ORE_CLUSTER = registerBlock("nidavellir_enhanced_stone_coal_ore_cluster", () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_ORE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> NIDAVELLIR_ENHANCED_STONE_REDSTONE_ORE_CLUSTER = registerBlock("nidavellir_enhanced_stone_redstone_ore_cluster", () -> new ModRedStoneOreBlock(BlockBehaviour.Properties.copy(Blocks.REDSTONE_ORE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> NIDAVELLIR_ENHANCED_STONE_LAPIS_ORE_CLUSTER = registerBlock("nidavellir_enhanced_stone_lapis_ore_cluster", () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_ORE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> NIDAVELLIR_ENHANCED_STONE_AQUAMARINE_ORE_CLUSTER = registerBlock("nidavellir_enhanced_stone_aquamarine_ore_cluster", () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_ORE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> NIDAVELLIR_ENHANCED_STONE_OPAL_ORE_CLUSTER = registerBlock("nidavellir_enhanced_stone_opal_ore_cluster", () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_ORE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> NIDAVELLIR_ENHANCED_STONE_RUBY_ORE_CLUSTER = registerBlock("nidavellir_enhanced_stone_ruby_ore_cluster", () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_ORE).requiresCorrectToolForDrops()));

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

    public static final RegistryObject<Block> NIDAVELLIR_DEEPSLATE_STONE_IRON_ORE = registerBlock("nidavellir_deepslate_stone_iron_ore", () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_ORE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> NIDAVELLIR_DEEPSLATE_STONE_GOLD_ORE = registerBlock("nidavellir_deepslate_stone_gold_ore", () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_ORE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> NIDAVELLIR_DEEPSLATE_STONE_COPPER_ORE = registerBlock("nidavellir_deepslate_stone_copper_ore", () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_ORE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> NIDAVELLIR_DEEPSLATE_STONE_TIN_ORE = registerBlock("nidavellir_deepslate_stone_tin_ore", () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_ORE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> NIDAVELLIR_DEEPSLATE_STONE_ZINC_ORE = registerBlock("nidavellir_deepslate_stone_zinc_ore", () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_ORE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> NIDAVELLIR_DEEPSLATE_STONE_DIAMOND_ORE = registerBlock("nidavellir_deepslate_stone_diamond_ore", () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_ORE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> NIDAVELLIR_DEEPSLATE_STONE_EMERALD_ORE = registerBlock("nidavellir_deepslate_stone_emerald_ore", () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_ORE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> NIDAVELLIR_DEEPSLATE_STONE_COAL_ORE = registerBlock("nidavellir_deepslate_stone_coal_ore", () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_ORE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> NIDAVELLIR_DEEPSLATE_STONE_REDSTONE_ORE = registerBlock("nidavellir_deepslate_stone_redstone_ore", () -> new ModRedStoneOreBlock(BlockBehaviour.Properties.copy(Blocks.REDSTONE_ORE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> NIDAVELLIR_DEEPSLATE_STONE_LAPIS_ORE = registerBlock("nidavellir_deepslate_stone_lapis_ore", () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_ORE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> NIDAVELLIR_DEEPSLATE_STONE_AQUAMARINE_ORE = registerBlock("nidavellir_deepslate_stone_aquamarine_ore", () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_ORE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> NIDAVELLIR_DEEPSLATE_STONE_OPAL_ORE = registerBlock("nidavellir_deepslate_stone_opal_ore", () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_ORE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> NIDAVELLIR_DEEPSLATE_STONE_RUBY_ORE = registerBlock("nidavellir_deepslate_stone_ruby_ore", () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_ORE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> NIDAVELLIR_DEEPSLATE_STONE_IRON_ORE_CLUSTER = registerBlock("nidavellir_deepslate_stone_iron_ore_cluster", () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_ORE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> NIDAVELLIR_DEEPSLATE_STONE_GOLD_ORE_CLUSTER = registerBlock("nidavellir_deepslate_stone_gold_ore_cluster", () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_ORE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> NIDAVELLIR_DEEPSLATE_STONE_COPPER_ORE_CLUSTER = registerBlock("nidavellir_deepslate_stone_copper_ore_cluster", () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_ORE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> NIDAVELLIR_DEEPSLATE_STONE_TIN_ORE_CLUSTER = registerBlock("nidavellir_deepslate_stone_tin_ore_cluster", () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_ORE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> NIDAVELLIR_DEEPSLATE_STONE_ZINC_ORE_CLUSTER = registerBlock("nidavellir_deepslate_stone_zinc_ore_cluster", () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_ORE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> NIDAVELLIR_DEEPSLATE_STONE_DIAMOND_ORE_CLUSTER = registerBlock("nidavellir_deepslate_stone_diamond_ore_cluster", () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_ORE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> NIDAVELLIR_DEEPSLATE_STONE_EMERALD_ORE_CLUSTER = registerBlock("nidavellir_deepslate_stone_emerald_ore_cluster", () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_ORE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> NIDAVELLIR_DEEPSLATE_STONE_COAL_ORE_CLUSTER = registerBlock("nidavellir_deepslate_stone_coal_ore_cluster", () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_ORE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> NIDAVELLIR_DEEPSLATE_STONE_REDSTONE_ORE_CLUSTER = registerBlock("nidavellir_deepslate_stone_redstone_ore_cluster", () -> new ModRedStoneOreBlock(BlockBehaviour.Properties.copy(Blocks.REDSTONE_ORE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> NIDAVELLIR_DEEPSLATE_STONE_LAPIS_ORE_CLUSTER = registerBlock("nidavellir_deepslate_stone_lapis_ore_cluster", () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_ORE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> NIDAVELLIR_DEEPSLATE_STONE_AQUAMARINE_ORE_CLUSTER = registerBlock("nidavellir_deepslate_stone_aquamarine_ore_cluster", () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_ORE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> NIDAVELLIR_DEEPSLATE_STONE_OPAL_ORE_CLUSTER = registerBlock("nidavellir_deepslate_stone_opal_ore_cluster", () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_ORE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> NIDAVELLIR_DEEPSLATE_STONE_RUBY_ORE_CLUSTER = registerBlock("nidavellir_deepslate_stone_ruby_ore_cluster", () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_ORE).requiresCorrectToolForDrops()));

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

    public static final RegistryObject<Block> NIDAVELLIR_CRIMSON_STONE_IRON_ORE = registerBlock("nidavellir_crimson_stone_iron_ore", () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_ORE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> NIDAVELLIR_CRIMSON_STONE_GOLD_ORE = registerBlock("nidavellir_crimson_stone_gold_ore", () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_ORE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> NIDAVELLIR_CRIMSON_STONE_COPPER_ORE = registerBlock("nidavellir_crimson_stone_copper_ore", () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_ORE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> NIDAVELLIR_CRIMSON_STONE_TIN_ORE = registerBlock("nidavellir_crimson_stone_tin_ore", () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_ORE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> NIDAVELLIR_CRIMSON_STONE_ZINC_ORE = registerBlock("nidavellir_crimson_stone_zinc_ore", () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_ORE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> NIDAVELLIR_CRIMSON_STONE_DIAMOND_ORE = registerBlock("nidavellir_crimson_stone_diamond_ore", () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_ORE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> NIDAVELLIR_CRIMSON_STONE_EMERALD_ORE = registerBlock("nidavellir_crimson_stone_emerald_ore", () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_ORE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> NIDAVELLIR_CRIMSON_STONE_COAL_ORE = registerBlock("nidavellir_crimson_stone_coal_ore", () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_ORE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> NIDAVELLIR_CRIMSON_STONE_REDSTONE_ORE = registerBlock("nidavellir_crimson_stone_redstone_ore", () -> new ModRedStoneOreBlock(BlockBehaviour.Properties.copy(Blocks.REDSTONE_ORE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> NIDAVELLIR_CRIMSON_STONE_LAPIS_ORE = registerBlock("nidavellir_crimson_stone_lapis_ore", () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_ORE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> NIDAVELLIR_CRIMSON_STONE_AQUAMARINE_ORE = registerBlock("nidavellir_crimson_stone_aquamarine_ore", () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_ORE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> NIDAVELLIR_CRIMSON_STONE_OPAL_ORE = registerBlock("nidavellir_crimson_stone_opal_ore", () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_ORE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> NIDAVELLIR_CRIMSON_STONE_RUBY_ORE = registerBlock("nidavellir_crimson_stone_ruby_ore", () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_ORE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> NIDAVELLIR_CRIMSON_STONE_IRON_ORE_CLUSTER = registerBlock("nidavellir_crimson_stone_iron_ore_cluster", () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_ORE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> NIDAVELLIR_CRIMSON_STONE_GOLD_ORE_CLUSTER = registerBlock("nidavellir_crimson_stone_gold_ore_cluster", () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_ORE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> NIDAVELLIR_CRIMSON_STONE_COPPER_ORE_CLUSTER = registerBlock("nidavellir_crimson_stone_copper_ore_cluster", () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_ORE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> NIDAVELLIR_CRIMSON_STONE_TIN_ORE_CLUSTER = registerBlock("nidavellir_crimson_stone_tin_ore_cluster", () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_ORE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> NIDAVELLIR_CRIMSON_STONE_ZINC_ORE_CLUSTER = registerBlock("nidavellir_crimson_stone_zinc_ore_cluster", () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_ORE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> NIDAVELLIR_CRIMSON_STONE_DIAMOND_ORE_CLUSTER = registerBlock("nidavellir_crimson_stone_diamond_ore_cluster", () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_ORE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> NIDAVELLIR_CRIMSON_STONE_EMERALD_ORE_CLUSTER = registerBlock("nidavellir_crimson_stone_emerald_ore_cluster", () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_ORE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> NIDAVELLIR_CRIMSON_STONE_COAL_ORE_CLUSTER = registerBlock("nidavellir_crimson_stone_coal_ore_cluster", () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_ORE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> NIDAVELLIR_CRIMSON_STONE_REDSTONE_ORE_CLUSTER = registerBlock("nidavellir_crimson_stone_redstone_ore_cluster", () -> new ModRedStoneOreBlock(BlockBehaviour.Properties.copy(Blocks.REDSTONE_ORE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> NIDAVELLIR_CRIMSON_STONE_LAPIS_ORE_CLUSTER = registerBlock("nidavellir_crimson_stone_lapis_ore_cluster", () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_ORE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> NIDAVELLIR_CRIMSON_STONE_AQUAMARINE_ORE_CLUSTER = registerBlock("nidavellir_crimson_stone_aquamarine_ore_cluster", () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_ORE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> NIDAVELLIR_CRIMSON_STONE_OPAL_ORE_CLUSTER = registerBlock("nidavellir_crimson_stone_opal_ore_cluster", () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_ORE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> NIDAVELLIR_CRIMSON_STONE_RUBY_ORE_CLUSTER = registerBlock("nidavellir_crimson_stone_ruby_ore_cluster", () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_ORE).requiresCorrectToolForDrops()));

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
     *Plants
     */
    public static final RegistryObject<Block> ALFHEIMR_MAGIC_GRASS = registerBlock("alfheimr_magic_grass", () -> new AlfheimrGrassBlock(BlockBehaviour.Properties.copy(Blocks.GRASS)));

    public static final RegistryObject<Block> IRIS_FLOWER = registerBlock("iris_flower", () -> new FlowerBlock(() -> MobEffects.MOVEMENT_SPEED, 1, BlockBehaviour.Properties.copy(Blocks.DANDELION)));
    public static final RegistryObject<Block> POTTED_IRIS_FLOWER = BLOCKS.register("potted_iris_flower", () -> new FlowerPotBlock((() -> (FlowerPotBlock) Blocks.FLOWER_POT), IRIS_FLOWER, BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION)));

    //Alfheimr
    //Black
//    public static final RegistryObject<Block> _FLOWER = registerBlock("_flower", () -> new FlowerBlock(() -> MobEffects.MOVEMENT_SPEED, 1, BlockBehaviour.Properties.copy(Blocks.DANDELION)));
//    public static final RegistryObject<Block> POTTED__FLOWER = BLOCKS.register("potted__flower", () -> new FlowerPotBlock((() -> (FlowerPotBlock) Blocks.FLOWER_POT), _FLOWER, BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION)));
    public static final RegistryObject<Block> DARK_BLOOM_FLOWER = registerBlock("dark_bloom_flower", () -> new FlowerBlock(() -> MobEffects.MOVEMENT_SPEED, 1, BlockBehaviour.Properties.copy(Blocks.DANDELION)));
    public static final RegistryObject<Block> POTTED_DARK_BLOOM_FLOWER = BLOCKS.register("potted_dark_bloom_flower", () -> new FlowerPotBlock((() -> (FlowerPotBlock) Blocks.FLOWER_POT), DARK_BLOOM_FLOWER, BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION)));
    public static final RegistryObject<Block> DREAD_NIGHT_FLOWER = registerBlock("dread_night_flower", () -> new FlowerBlock(() -> MobEffects.MOVEMENT_SPEED, 1, BlockBehaviour.Properties.copy(Blocks.DANDELION)));
    public static final RegistryObject<Block> POTTED_DREAD_NIGIHT_FLOWER = BLOCKS.register("potted_dread_night_flower", () -> new FlowerPotBlock((() -> (FlowerPotBlock) Blocks.FLOWER_POT), DREAD_NIGHT_FLOWER, BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION)));
    public static final RegistryObject<Block> BLACK_LOTUS_FLOWER = registerBlock("black_lotus_flower", () -> new FlowerBlock(() -> MobEffects.MOVEMENT_SPEED, 1, BlockBehaviour.Properties.copy(Blocks.DANDELION)));
    public static final RegistryObject<Block> POTTED_BLACK_LOTUS_FLOWER = BLOCKS.register("potted_black_lotus_flower", () -> new FlowerPotBlock((() -> (FlowerPotBlock) Blocks.FLOWER_POT), BLACK_LOTUS_FLOWER, BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION)));
    public static final RegistryObject<Block> NIGHT_ROSE_FLOWER = registerBlock("night_rose_flower", () -> new FlowerBlock(() -> MobEffects.MOVEMENT_SPEED, 1, BlockBehaviour.Properties.copy(Blocks.DANDELION)));
    public static final RegistryObject<Block> POTTED_NIGHT_ROSE_FLOWER = BLOCKS.register("potted_night_rose_flower", () -> new FlowerPotBlock((() -> (FlowerPotBlock) Blocks.FLOWER_POT), NIGHT_ROSE_FLOWER, BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION)));

    //Blue
//    public static final RegistryObject<Block> _FLOWER = registerBlock("_flower", () -> new FlowerBlock(() -> MobEffects.MOVEMENT_SPEED, 1, BlockBehaviour.Properties.copy(Blocks.DANDELION)));
//    public static final RegistryObject<Block> POTTED__FLOWER = BLOCKS.register("potted__flower", () -> new FlowerPotBlock((() -> (FlowerPotBlock) Blocks.FLOWER_POT), _FLOWER, BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION)));
    public static final RegistryObject<Block> AQUA_ROSE_FLOWER = registerBlock("aqua_rose_flower", () -> new FlowerBlock(() -> MobEffects.MOVEMENT_SPEED, 1, BlockBehaviour.Properties.copy(Blocks.DANDELION)));
    public static final RegistryObject<Block> POTTED_AQUA_ROSE_FLOWER = BLOCKS.register("potted_aqua_rose_flower", () -> new FlowerPotBlock((() -> (FlowerPotBlock) Blocks.FLOWER_POT), AQUA_ROSE_FLOWER, BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION)));
    public static final RegistryObject<Block> MOON_FLOWER = registerBlock("moon_flower", () -> new FlowerBlock(() -> MobEffects.MOVEMENT_SPEED, 1, BlockBehaviour.Properties.copy(Blocks.DANDELION)));
    public static final RegistryObject<Block> POTTED_MOON_FLOWER = BLOCKS.register("potted_moon_flower", () -> new FlowerPotBlock((() -> (FlowerPotBlock) Blocks.FLOWER_POT), MOON_FLOWER, BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION)));
    public static final RegistryObject<Block> CATHERINE_FLOWER = registerBlock("catherine_flower", () -> new FlowerBlock(() -> MobEffects.MOVEMENT_SPEED, 1, BlockBehaviour.Properties.copy(Blocks.DANDELION)));
    public static final RegistryObject<Block> POTTED_CATHERINE_FLOWER = BLOCKS.register("potted_catherine_flower", () -> new FlowerPotBlock((() -> (FlowerPotBlock) Blocks.FLOWER_POT), CATHERINE_FLOWER, BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION)));
    public static final RegistryObject<Block> TAINTED_ROSE_FLOWER = registerBlock("tainted_rose_flower", () -> new FlowerBlock(() -> MobEffects.MOVEMENT_SPEED, 1, BlockBehaviour.Properties.copy(Blocks.DANDELION)));
    public static final RegistryObject<Block> POTTED_TAINTED_ROSE_FLOWER = BLOCKS.register("potted_tainted_rose_flower", () -> new FlowerPotBlock((() -> (FlowerPotBlock) Blocks.FLOWER_POT), TAINTED_ROSE_FLOWER, BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION)));

    //Brown
//    public static final RegistryObject<Block> _FLOWER = registerBlock("_flower", () -> new FlowerBlock(() -> MobEffects.MOVEMENT_SPEED, 1, BlockBehaviour.Properties.copy(Blocks.DANDELION)));
//    public static final RegistryObject<Block> POTTED__FLOWER = BLOCKS.register("potted__flower", () -> new FlowerPotBlock((() -> (FlowerPotBlock) Blocks.FLOWER_POT), _FLOWER, BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION)));
    public static final RegistryObject<Block> CINNAMON_ROSE_FLOWER = registerBlock("cinnamon_rose_flower", () -> new FlowerBlock(() -> MobEffects.MOVEMENT_SPEED, 1, BlockBehaviour.Properties.copy(Blocks.DANDELION)));
    public static final RegistryObject<Block> POTTED_CINNAMON_ROSE_FLOWER = BLOCKS.register("potted_cinnamon_rose_flower", () -> new FlowerPotBlock((() -> (FlowerPotBlock) Blocks.FLOWER_POT), CINNAMON_ROSE_FLOWER, BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION)));
    public static final RegistryObject<Block> BUTTERFLY_FLOWER = registerBlock("butterfly_flower", () -> new FlowerBlock(() -> MobEffects.MOVEMENT_SPEED, 1, BlockBehaviour.Properties.copy(Blocks.DANDELION)));
    public static final RegistryObject<Block> POTTED_BUTTERFLY_FLOWER = BLOCKS.register("potted_butterfly_flower", () -> new FlowerPotBlock((() -> (FlowerPotBlock) Blocks.FLOWER_POT), BUTTERFLY_FLOWER, BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION)));
    public static final RegistryObject<Block> GAIA_TULIP_FLOWER = registerBlock("gaia_tulip_flower", () -> new FlowerBlock(() -> MobEffects.MOVEMENT_SPEED, 1, BlockBehaviour.Properties.copy(Blocks.DANDELION)));
    public static final RegistryObject<Block> POTTED_GAIA_TULIP_FLOWER = BLOCKS.register("potted_gaia_tulip_flower", () -> new FlowerPotBlock((() -> (FlowerPotBlock) Blocks.FLOWER_POT), GAIA_TULIP_FLOWER, BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION)));
    public static final RegistryObject<Block> BEARDED_IRIS_FLOWER = registerBlock("bearded_iris_flower", () -> new FlowerBlock(() -> MobEffects.MOVEMENT_SPEED, 1, BlockBehaviour.Properties.copy(Blocks.DANDELION)));
    public static final RegistryObject<Block> POTTED_BEARDED_IRIS_FLOWER = BLOCKS.register("potted_bearded_iris_flower", () -> new FlowerPotBlock((() -> (FlowerPotBlock) Blocks.FLOWER_POT), BEARDED_IRIS_FLOWER, BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION)));

    //Cyan
//    public static final RegistryObject<Block> _FLOWER = registerBlock("_flower", () -> new FlowerBlock(() -> MobEffects.MOVEMENT_SPEED, 1, BlockBehaviour.Properties.copy(Blocks.DANDELION)));
//    public static final RegistryObject<Block> POTTED__FLOWER = BLOCKS.register("potted__flower", () -> new FlowerPotBlock((() -> (FlowerPotBlock) Blocks.FLOWER_POT), _FLOWER, BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION)));
    public static final RegistryObject<Block> CORNFLOWER_FLOWER = registerBlock("cornflower_flower", () -> new FlowerBlock(() -> MobEffects.MOVEMENT_SPEED, 1, BlockBehaviour.Properties.copy(Blocks.DANDELION)));
    public static final RegistryObject<Block> POTTED_CORNFLOWER_FLOWER = BLOCKS.register("potted_cornflower_flower", () -> new FlowerPotBlock((() -> (FlowerPotBlock) Blocks.FLOWER_POT), CORNFLOWER_FLOWER, BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION)));
    public static final RegistryObject<Block> MORNING_GLORY_FLOWER = registerBlock("morning_glory_flower", () -> new FlowerBlock(() -> MobEffects.MOVEMENT_SPEED, 1, BlockBehaviour.Properties.copy(Blocks.DANDELION)));
    public static final RegistryObject<Block> POTTED_MORNING_GLORY_FLOWER = BLOCKS.register("potted_morning_glory_flower", () -> new FlowerPotBlock((() -> (FlowerPotBlock) Blocks.FLOWER_POT), MORNING_GLORY_FLOWER, BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION)));
    public static final RegistryObject<Block> GEORGIA_BLUE_FLOWER = registerBlock("georgia_blue_flower", () -> new FlowerBlock(() -> MobEffects.MOVEMENT_SPEED, 1, BlockBehaviour.Properties.copy(Blocks.DANDELION)));
    public static final RegistryObject<Block> POTTED_GEORGIA_BLUE_FLOWER = BLOCKS.register("potted_georgia_blue_flower", () -> new FlowerPotBlock((() -> (FlowerPotBlock) Blocks.FLOWER_POT), GEORGIA_BLUE_FLOWER, BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION)));
    public static final RegistryObject<Block> BLUE_POPPY_FLOWER = registerBlock("blue_poppy_flower", () -> new FlowerBlock(() -> MobEffects.MOVEMENT_SPEED, 1, BlockBehaviour.Properties.copy(Blocks.DANDELION)));
    public static final RegistryObject<Block> POTTED_BLUE_POPPY_FLOWER = BLOCKS.register("potted_blue_poppy_flower", () -> new FlowerPotBlock((() -> (FlowerPotBlock) Blocks.FLOWER_POT), BLUE_POPPY_FLOWER, BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION)));

    //Green
//    public static final RegistryObject<Block> _FLOWER = registerBlock("_flower", () -> new FlowerBlock(() -> MobEffects.MOVEMENT_SPEED, 1, BlockBehaviour.Properties.copy(Blocks.DANDELION)));
//    public static final RegistryObject<Block> POTTED__FLOWER = BLOCKS.register("potted__flower", () -> new FlowerPotBlock((() -> (FlowerPotBlock) Blocks.FLOWER_POT), _FLOWER, BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION)));
    public static final RegistryObject<Block> TULIP_FLOWER = registerBlock("tulip_flower", () -> new FlowerBlock(() -> MobEffects.MOVEMENT_SPEED, 1, BlockBehaviour.Properties.copy(Blocks.DANDELION)));
    public static final RegistryObject<Block> POTTED_TULIP_FLOWER = BLOCKS.register("potted_tulip_flower", () -> new FlowerPotBlock((() -> (FlowerPotBlock) Blocks.FLOWER_POT), TULIP_FLOWER, BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION)));
    public static final RegistryObject<Block> CARNATION_FLOWER = registerBlock("carnation_flower", () -> new FlowerBlock(() -> MobEffects.MOVEMENT_SPEED, 1, BlockBehaviour.Properties.copy(Blocks.DANDELION)));
    public static final RegistryObject<Block> POTTED_CARNATION_FLOWER = BLOCKS.register("potted_carnation_flower", () -> new FlowerPotBlock((() -> (FlowerPotBlock) Blocks.FLOWER_POT), CARNATION_FLOWER, BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION)));
    public static final RegistryObject<Block> LADYS_MANTLE_FLOWER = registerBlock("ladys_mantle_flower", () -> new FlowerBlock(() -> MobEffects.MOVEMENT_SPEED, 1, BlockBehaviour.Properties.copy(Blocks.DANDELION)));
    public static final RegistryObject<Block> POTTED_LADYS_MANTLE_FLOWER = BLOCKS.register("potted_ladys_mantle_flower", () -> new FlowerPotBlock((() -> (FlowerPotBlock) Blocks.FLOWER_POT), LADYS_MANTLE_FLOWER, BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION)));
    public static final RegistryObject<Block> GREEN_ROSE_FLOWER = registerBlock("green_rose_flower", () -> new FlowerBlock(() -> MobEffects.MOVEMENT_SPEED, 1, BlockBehaviour.Properties.copy(Blocks.DANDELION)));
    public static final RegistryObject<Block> POTTED_GREEN_ROSE_FLOWER = BLOCKS.register("potted_green_rose_flower", () -> new FlowerPotBlock((() -> (FlowerPotBlock) Blocks.FLOWER_POT), GREEN_ROSE_FLOWER, BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION)));

    //Light Blue
//    public static final RegistryObject<Block> _FLOWER = registerBlock("_flower", () -> new FlowerBlock(() -> MobEffects.MOVEMENT_SPEED, 1, BlockBehaviour.Properties.copy(Blocks.DANDELION)));
//    public static final RegistryObject<Block> POTTED__FLOWER = BLOCKS.register("potted__flower", () -> new FlowerPotBlock((() -> (FlowerPotBlock) Blocks.FLOWER_POT), _FLOWER, BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION)));
    public static final RegistryObject<Block> CLEMATIS_FLOWER = registerBlock("clematis_flower", () -> new FlowerBlock(() -> MobEffects.MOVEMENT_SPEED, 1, BlockBehaviour.Properties.copy(Blocks.DANDELION)));
    public static final RegistryObject<Block> POTTED_CLEMATIS_FLOWER = BLOCKS.register("potted_clematis_flower", () -> new FlowerPotBlock((() -> (FlowerPotBlock) Blocks.FLOWER_POT), CLEMATIS_FLOWER, BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION)));
    public static final RegistryObject<Block> BLUE_STAR_FLOWER = registerBlock("blue_star_flower", () -> new FlowerBlock(() -> MobEffects.MOVEMENT_SPEED, 1, BlockBehaviour.Properties.copy(Blocks.DANDELION)));
    public static final RegistryObject<Block> POTTED_BLUE_STAR_FLOWER = BLOCKS.register("potted_blue_star_flower", () -> new FlowerPotBlock((() -> (FlowerPotBlock) Blocks.FLOWER_POT), BLUE_STAR_FLOWER, BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION)));
    public static final RegistryObject<Block> SALVIA_FLOWER = registerBlock("salvia_flower", () -> new FlowerBlock(() -> MobEffects.MOVEMENT_SPEED, 1, BlockBehaviour.Properties.copy(Blocks.DANDELION)));
    public static final RegistryObject<Block> POTTED_SALVIA_FLOWER = BLOCKS.register("potted_salvia_flower", () -> new FlowerPotBlock((() -> (FlowerPotBlock) Blocks.FLOWER_POT), SALVIA_FLOWER, BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION)));
    public static final RegistryObject<Block> FALSE_INDIGO_FLOWER = registerBlock("false_indigo_flower", () -> new FlowerBlock(() -> MobEffects.MOVEMENT_SPEED, 1, BlockBehaviour.Properties.copy(Blocks.DANDELION)));
    public static final RegistryObject<Block> POTTED_FALSE_INDIGO_FLOWER = BLOCKS.register("potted_false_indigo_flower", () -> new FlowerPotBlock((() -> (FlowerPotBlock) Blocks.FLOWER_POT), FALSE_INDIGO_FLOWER, BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION)));

    //Light Gray
//    public static final RegistryObject<Block> _FLOWER = registerBlock("_flower", () -> new FlowerBlock(() -> MobEffects.MOVEMENT_SPEED, 1, BlockBehaviour.Properties.copy(Blocks.DANDELION)));
//    public static final RegistryObject<Block> POTTED__FLOWER = BLOCKS.register("potted__flower", () -> new FlowerPotBlock((() -> (FlowerPotBlock) Blocks.FLOWER_POT), _FLOWER, BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION)));
    public static final RegistryObject<Block> WHITE_SAGE_FLOWER = registerBlock("white_sage_flower", () -> new FlowerBlock(() -> MobEffects.MOVEMENT_SPEED, 1, BlockBehaviour.Properties.copy(Blocks.DANDELION)));
    public static final RegistryObject<Block> POTTED_WHITE_SAGE_FLOWER = BLOCKS.register("potted_white_sage_flower", () -> new FlowerPotBlock((() -> (FlowerPotBlock) Blocks.FLOWER_POT), WHITE_SAGE_FLOWER, BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION)));
    public static final RegistryObject<Block> SILVER_SCHEHERAZADE_FLOWER = registerBlock("silver_scheherazade_flower", () -> new FlowerBlock(() -> MobEffects.MOVEMENT_SPEED, 1, BlockBehaviour.Properties.copy(Blocks.DANDELION)));
    public static final RegistryObject<Block> POTTED_SILVER_SCHEHERAZADE_FLOWER = BLOCKS.register("potted_silver_scheherazade_flower", () -> new FlowerPotBlock((() -> (FlowerPotBlock) Blocks.FLOWER_POT), SILVER_SCHEHERAZADE_FLOWER, BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION)));
    public static final RegistryObject<Block> SILVER_SPRING_FLOWER = registerBlock("silver_spring_flower", () -> new FlowerBlock(() -> MobEffects.MOVEMENT_SPEED, 1, BlockBehaviour.Properties.copy(Blocks.DANDELION)));
    public static final RegistryObject<Block> POTTED_SILVER_SPRING_FLOWER = BLOCKS.register("potted_silver_spring_flower", () -> new FlowerPotBlock((() -> (FlowerPotBlock) Blocks.FLOWER_POT), SILVER_SPRING_FLOWER, BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION)));
    public static final RegistryObject<Block> SILVER_SHADOWS_FLOWER = registerBlock("silver_shadows_flower", () -> new FlowerBlock(() -> MobEffects.MOVEMENT_SPEED, 1, BlockBehaviour.Properties.copy(Blocks.DANDELION)));
    public static final RegistryObject<Block> POTTED_SILVER_SHADOWS_FLOWER = BLOCKS.register("potted_silver_shadows_flower", () -> new FlowerPotBlock((() -> (FlowerPotBlock) Blocks.FLOWER_POT), SILVER_SHADOWS_FLOWER, BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION)));

    //Lime
//    public static final RegistryObject<Block> _FLOWER = registerBlock("_flower", () -> new FlowerBlock(() -> MobEffects.MOVEMENT_SPEED, 1, BlockBehaviour.Properties.copy(Blocks.DANDELION)));
//    public static final RegistryObject<Block> POTTED__FLOWER = BLOCKS.register("potted__flower", () -> new FlowerPotBlock((() -> (FlowerPotBlock) Blocks.FLOWER_POT), _FLOWER, BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION)));
    public static final RegistryObject<Block> GREEN_BALL_FLOWER = registerBlock("green_ball_flower", () -> new FlowerBlock(() -> MobEffects.MOVEMENT_SPEED, 1, BlockBehaviour.Properties.copy(Blocks.DANDELION)));
    public static final RegistryObject<Block> POTTED_GREEN_BALL_FLOWER = BLOCKS.register("potted_green_ball_flower", () -> new FlowerPotBlock((() -> (FlowerPotBlock) Blocks.FLOWER_POT), GREEN_BALL_FLOWER, BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION)));
    public static final RegistryObject<Block> LIME_DAHLIA_FLOWER = registerBlock("lime_dahlia_flower", () -> new FlowerBlock(() -> MobEffects.MOVEMENT_SPEED, 1, BlockBehaviour.Properties.copy(Blocks.DANDELION)));
    public static final RegistryObject<Block> POTTED_LIME_DAHLIA_FLOWER = BLOCKS.register("potted_lime_dahlia_flower", () -> new FlowerPotBlock((() -> (FlowerPotBlock) Blocks.FLOWER_POT), LIME_DAHLIA_FLOWER, BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION)));
    public static final RegistryObject<Block> HYDRANGEA_FLOWER = registerBlock("hydrangea_flower", () -> new FlowerBlock(() -> MobEffects.MOVEMENT_SPEED, 1, BlockBehaviour.Properties.copy(Blocks.DANDELION)));
    public static final RegistryObject<Block> POTTED_HYDRANGEA_FLOWER = BLOCKS.register("potted_hydrangea_flower", () -> new FlowerPotBlock((() -> (FlowerPotBlock) Blocks.FLOWER_POT), HYDRANGEA_FLOWER, BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION)));
    public static final RegistryObject<Block> ZINNIA_FLOWER = registerBlock("zinnia_flower", () -> new FlowerBlock(() -> MobEffects.MOVEMENT_SPEED, 1, BlockBehaviour.Properties.copy(Blocks.DANDELION)));
    public static final RegistryObject<Block> POTTED_ZINNIA_FLOWER = BLOCKS.register("potted_zinnia_flower", () -> new FlowerPotBlock((() -> (FlowerPotBlock) Blocks.FLOWER_POT), ZINNIA_FLOWER, BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION)));

    //Magenta
//    public static final RegistryObject<Block> _FLOWER = registerBlock("_flower", () -> new FlowerBlock(() -> MobEffects.MOVEMENT_SPEED, 1, BlockBehaviour.Properties.copy(Blocks.DANDELION)));
//    public static final RegistryObject<Block> POTTED__FLOWER = BLOCKS.register("potted__flower", () -> new FlowerPotBlock((() -> (FlowerPotBlock) Blocks.FLOWER_POT), _FLOWER, BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION)));
    public static final RegistryObject<Block> BUTTERFLY_CANDY_FLOWER = registerBlock("butterfly_candy_flower", () -> new FlowerBlock(() -> MobEffects.MOVEMENT_SPEED, 1, BlockBehaviour.Properties.copy(Blocks.DANDELION)));
    public static final RegistryObject<Block> POTTED_BUTTERFLY_CANDY_FLOWER = BLOCKS.register("potted_butterfly_candy_flower", () -> new FlowerPotBlock((() -> (FlowerPotBlock) Blocks.FLOWER_POT), BUTTERFLY_CANDY_FLOWER, BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION)));
    public static final RegistryObject<Block> CABARET_FLOWER = registerBlock("cabaret_flower", () -> new FlowerBlock(() -> MobEffects.MOVEMENT_SPEED, 1, BlockBehaviour.Properties.copy(Blocks.DANDELION)));
    public static final RegistryObject<Block> POTTED_CABARET_FLOWER = BLOCKS.register("potted_cabaret_flower", () -> new FlowerPotBlock((() -> (FlowerPotBlock) Blocks.FLOWER_POT), CABARET_FLOWER, BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION)));
    public static final RegistryObject<Block> DIANTHUS_FLOWER = registerBlock("dianthus_flower", () -> new FlowerBlock(() -> MobEffects.MOVEMENT_SPEED, 1, BlockBehaviour.Properties.copy(Blocks.DANDELION)));
    public static final RegistryObject<Block> POTTED_DIANTHUS_FLOWER = BLOCKS.register("potted_dianthus_flower", () -> new FlowerPotBlock((() -> (FlowerPotBlock) Blocks.FLOWER_POT), DIANTHUS_FLOWER, BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION)));
    public static final RegistryObject<Block> TITAN_CRANBERRY_VINCA_FLOWER = registerBlock("titan_cranberry_vinca_flower", () -> new FlowerBlock(() -> MobEffects.MOVEMENT_SPEED, 1, BlockBehaviour.Properties.copy(Blocks.DANDELION)));
    public static final RegistryObject<Block> POTTED_TITAN_CRANBERRY_VINCA_FLOWER = BLOCKS.register("potted_titan_cranberry_vinca_flower", () -> new FlowerPotBlock((() -> (FlowerPotBlock) Blocks.FLOWER_POT), TITAN_CRANBERRY_VINCA_FLOWER, BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION)));

    //Orange
//    public static final RegistryObject<Block> _FLOWER = registerBlock("_flower", () -> new FlowerBlock(() -> MobEffects.MOVEMENT_SPEED, 1, BlockBehaviour.Properties.copy(Blocks.DANDELION)));
//    public static final RegistryObject<Block> POTTED__FLOWER = BLOCKS.register("potted__flower", () -> new FlowerPotBlock((() -> (FlowerPotBlock) Blocks.FLOWER_POT), _FLOWER, BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION)));
    public static final RegistryObject<Block> ORANGE_ZINNIA_FLOWER = registerBlock("orange_zinnia_flower", () -> new FlowerBlock(() -> MobEffects.MOVEMENT_SPEED, 1, BlockBehaviour.Properties.copy(Blocks.DANDELION)));
    public static final RegistryObject<Block> POTTED_ORANGE_ZINNIA_FLOWER = BLOCKS.register("potted_orange_zinnia_flower", () -> new FlowerPotBlock((() -> (FlowerPotBlock) Blocks.FLOWER_POT), ORANGE_ZINNIA_FLOWER, BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION)));
    public static final RegistryObject<Block> BEGONIA_FLOWER = registerBlock("begonia_flower", () -> new FlowerBlock(() -> MobEffects.MOVEMENT_SPEED, 1, BlockBehaviour.Properties.copy(Blocks.DANDELION)));
    public static final RegistryObject<Block> POTTED_BEGONIA_FLOWER = BLOCKS.register("potted_begonia_flower", () -> new FlowerPotBlock((() -> (FlowerPotBlock) Blocks.FLOWER_POT), BEGONIA_FLOWER, BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION)));
    public static final RegistryObject<Block> CROWN_IMPERIAL_FLOWER = registerBlock("crown_imperial_flower", () -> new FlowerBlock(() -> MobEffects.MOVEMENT_SPEED, 1, BlockBehaviour.Properties.copy(Blocks.DANDELION)));
    public static final RegistryObject<Block> POTTED_CROWN_IMPERIAL_FLOWER = BLOCKS.register("potted_crown_imperial_flower", () -> new FlowerPotBlock((() -> (FlowerPotBlock) Blocks.FLOWER_POT), CROWN_IMPERIAL_FLOWER, BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION)));
    public static final RegistryObject<Block> ORIENTAL_POPPY_FLOWER = registerBlock("oriental_poppy_flower", () -> new FlowerBlock(() -> MobEffects.MOVEMENT_SPEED, 1, BlockBehaviour.Properties.copy(Blocks.DANDELION)));
    public static final RegistryObject<Block> POTTED_ORIENTAL_POPPY_FLOWER = BLOCKS.register("potted_oriental_poppy_flower", () -> new FlowerPotBlock((() -> (FlowerPotBlock) Blocks.FLOWER_POT), ORIENTAL_POPPY_FLOWER, BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION)));

    //Pink
//    public static final RegistryObject<Block> _FLOWER = registerBlock("_flower", () -> new FlowerBlock(() -> MobEffects.MOVEMENT_SPEED, 1, BlockBehaviour.Properties.copy(Blocks.DANDELION)));
//    public static final RegistryObject<Block> POTTED__FLOWER = BLOCKS.register("potted__flower", () -> new FlowerPotBlock((() -> (FlowerPotBlock) Blocks.FLOWER_POT), _FLOWER, BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION)));
    public static final RegistryObject<Block> AZALEA_FLOWER = registerBlock("azalea_flower", () -> new FlowerBlock(() -> MobEffects.MOVEMENT_SPEED, 1, BlockBehaviour.Properties.copy(Blocks.DANDELION)));
    public static final RegistryObject<Block> POTTED_AZALEA_FLOWER = BLOCKS.register("potted_azalea_flower", () -> new FlowerPotBlock((() -> (FlowerPotBlock) Blocks.FLOWER_POT), AZALEA_FLOWER, BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION)));
    public static final RegistryObject<Block> PINK_DELIGHT_FLOWER = registerBlock("pink_delight_flower", () -> new FlowerBlock(() -> MobEffects.MOVEMENT_SPEED, 1, BlockBehaviour.Properties.copy(Blocks.DANDELION)));
    public static final RegistryObject<Block> POTTED_PINK_DELIGHT_FLOWER = BLOCKS.register("potted_pink_delight_flower", () -> new FlowerPotBlock((() -> (FlowerPotBlock) Blocks.FLOWER_POT), PINK_DELIGHT_FLOWER, BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION)));
    public static final RegistryObject<Block> CHRYSANTHEMUM_FLOWER = registerBlock("chrysanthemum_flower", () -> new FlowerBlock(() -> MobEffects.MOVEMENT_SPEED, 1, BlockBehaviour.Properties.copy(Blocks.DANDELION)));
    public static final RegistryObject<Block> POTTED_CHRYSANTHEMUM_FLOWER = BLOCKS.register("potted_chrysanthemum_flower", () -> new FlowerPotBlock((() -> (FlowerPotBlock) Blocks.FLOWER_POT), CHRYSANTHEMUM_FLOWER, BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION)));
    public static final RegistryObject<Block> HIBISCUS_FLOWER = registerBlock("hibiscus_flower", () -> new FlowerBlock(() -> MobEffects.MOVEMENT_SPEED, 1, BlockBehaviour.Properties.copy(Blocks.DANDELION)));
    public static final RegistryObject<Block> POTTED_HIBISCUS_FLOWER = BLOCKS.register("potted_hibiscus_flower", () -> new FlowerPotBlock((() -> (FlowerPotBlock) Blocks.FLOWER_POT), HIBISCUS_FLOWER, BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION)));

    //Red
//    public static final RegistryObject<Block> _FLOWER = registerBlock("_flower", () -> new FlowerBlock(() -> MobEffects.MOVEMENT_SPEED, 1, BlockBehaviour.Properties.copy(Blocks.DANDELION)));
//    public static final RegistryObject<Block> POTTED__FLOWER = BLOCKS.register("potted__flower", () -> new FlowerPotBlock((() -> (FlowerPotBlock) Blocks.FLOWER_POT), _FLOWER, BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION)));
    public static final RegistryObject<Block> CARDINAL_FLOWER = registerBlock("cardinal_flower_flower", () -> new FlowerBlock(() -> MobEffects.MOVEMENT_SPEED, 1, BlockBehaviour.Properties.copy(Blocks.DANDELION)));
    public static final RegistryObject<Block> POTTED_CARDINAL_FLOWER = BLOCKS.register("potted_cardinal_flower_flower", () -> new FlowerPotBlock((() -> (FlowerPotBlock) Blocks.FLOWER_POT), CARDINAL_FLOWER, BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION)));
    public static final RegistryObject<Block> GERBERA_FLOWER = registerBlock("gerbera_flower", () -> new FlowerBlock(() -> MobEffects.MOVEMENT_SPEED, 1, BlockBehaviour.Properties.copy(Blocks.DANDELION)));
    public static final RegistryObject<Block> POTTED_GERBERA_FLOWER = BLOCKS.register("potted_gerbera_flower", () -> new FlowerPotBlock((() -> (FlowerPotBlock) Blocks.FLOWER_POT), GERBERA_FLOWER, BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION)));
    public static final RegistryObject<Block> RED_TULIP_FLOWER = registerBlock("red_tulip_flower", () -> new FlowerBlock(() -> MobEffects.MOVEMENT_SPEED, 1, BlockBehaviour.Properties.copy(Blocks.DANDELION)));
    public static final RegistryObject<Block> POTTED_RED_TULIP_FLOWER = BLOCKS.register("potted_red_tulip_flower", () -> new FlowerPotBlock((() -> (FlowerPotBlock) Blocks.FLOWER_POT), RED_TULIP_FLOWER, BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION)));
    public static final RegistryObject<Block> FREESIA_FLOWER = registerBlock("freesia_flower", () -> new FlowerBlock(() -> MobEffects.MOVEMENT_SPEED, 1, BlockBehaviour.Properties.copy(Blocks.DANDELION)));
    public static final RegistryObject<Block> POTTED_FREESIA_FLOWER = BLOCKS.register("potted_freesia_flower", () -> new FlowerPotBlock((() -> (FlowerPotBlock) Blocks.FLOWER_POT), FREESIA_FLOWER, BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION)));

    //White
//    public static final RegistryObject<Block> _FLOWER = registerBlock("_flower", () -> new FlowerBlock(() -> MobEffects.MOVEMENT_SPEED, 1, BlockBehaviour.Properties.copy(Blocks.DANDELION)));
//    public static final RegistryObject<Block> POTTED__FLOWER = BLOCKS.register("potted__flower", () -> new FlowerPotBlock((() -> (FlowerPotBlock) Blocks.FLOWER_POT), _FLOWER, BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION)));
    public static final RegistryObject<Block> GARDENIAS_FLOWER = registerBlock("gardenias_flower", () -> new FlowerBlock(() -> MobEffects.MOVEMENT_SPEED, 1, BlockBehaviour.Properties.copy(Blocks.DANDELION)));
    public static final RegistryObject<Block> POTTED_GARDENIAS_FLOWER = BLOCKS.register("potted_gardenias_flower", () -> new FlowerPotBlock((() -> (FlowerPotBlock) Blocks.FLOWER_POT), GARDENIAS_FLOWER, BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION)));
    public static final RegistryObject<Block> STAR_JASMINE_FLOWER = registerBlock("star_jasmine_flower", () -> new FlowerBlock(() -> MobEffects.MOVEMENT_SPEED, 1, BlockBehaviour.Properties.copy(Blocks.DANDELION)));
    public static final RegistryObject<Block> POTTED_STAR_JASMINE_FLOWER = BLOCKS.register("potted_star_jasmine_flower", () -> new FlowerPotBlock((() -> (FlowerPotBlock) Blocks.FLOWER_POT), STAR_JASMINE_FLOWER, BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION)));
    public static final RegistryObject<Block> WHITE_WARATAH_FLOWER = registerBlock("white_waratah_flower", () -> new FlowerBlock(() -> MobEffects.MOVEMENT_SPEED, 1, BlockBehaviour.Properties.copy(Blocks.DANDELION)));
    public static final RegistryObject<Block> POTTED_WHITE_WARATAH_FLOWER = BLOCKS.register("potted_white_waratah_flower", () -> new FlowerPotBlock((() -> (FlowerPotBlock) Blocks.FLOWER_POT), WHITE_WARATAH_FLOWER, BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION)));
    public static final RegistryObject<Block> FLANNEL_FLOWER = registerBlock("flannel_flower", () -> new FlowerBlock(() -> MobEffects.MOVEMENT_SPEED, 1, BlockBehaviour.Properties.copy(Blocks.DANDELION)));
    public static final RegistryObject<Block> POTTED_FLANNEL_FLOWER = BLOCKS.register("potted_flannel_flower", () -> new FlowerPotBlock((() -> (FlowerPotBlock) Blocks.FLOWER_POT), FLANNEL_FLOWER, BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION)));

    //Yellow
//    public static final RegistryObject<Block> _FLOWER = registerBlock("_flower", () -> new FlowerBlock(() -> MobEffects.MOVEMENT_SPEED, 1, BlockBehaviour.Properties.copy(Blocks.DANDELION)));
//    public static final RegistryObject<Block> POTTED__FLOWER = BLOCKS.register("potted__flower", () -> new FlowerPotBlock((() -> (FlowerPotBlock) Blocks.FLOWER_POT), _FLOWER, BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION)));
    public static final RegistryObject<Block> BEARS_EARS_FLOWER = registerBlock("bears_ears_flower", () -> new FlowerBlock(() -> MobEffects.MOVEMENT_SPEED, 1, BlockBehaviour.Properties.copy(Blocks.DANDELION)));
    public static final RegistryObject<Block> POTTED_BEARS_EARS_FLOWER = BLOCKS.register("potted_bears_ears_flower", () -> new FlowerPotBlock((() -> (FlowerPotBlock) Blocks.FLOWER_POT), BEARS_EARS_FLOWER, BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION)));
    public static final RegistryObject<Block> BIDENS_FLOWER = registerBlock("bidens_flower", () -> new FlowerBlock(() -> MobEffects.MOVEMENT_SPEED, 1, BlockBehaviour.Properties.copy(Blocks.DANDELION)));
    public static final RegistryObject<Block> POTTED_BIDENS_FLOWER = BLOCKS.register("potted_bidens_flower", () -> new FlowerPotBlock((() -> (FlowerPotBlock) Blocks.FLOWER_POT), BIDENS_FLOWER, BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION)));
    public static final RegistryObject<Block> BLANKET_FLOWER = registerBlock("blanket_flower", () -> new FlowerBlock(() -> MobEffects.MOVEMENT_SPEED, 1, BlockBehaviour.Properties.copy(Blocks.DANDELION)));
    public static final RegistryObject<Block> POTTED_BLANKET_FLOWER = BLOCKS.register("potted_blanket_flower", () -> new FlowerPotBlock((() -> (FlowerPotBlock) Blocks.FLOWER_POT), BLANKET_FLOWER, BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION)));
    public static final RegistryObject<Block> BULBINE_FLOWER = registerBlock("bulbine_flower", () -> new FlowerBlock(() -> MobEffects.MOVEMENT_SPEED, 1, BlockBehaviour.Properties.copy(Blocks.DANDELION)));
    public static final RegistryObject<Block> POTTED_BULBINE_FLOWER = BLOCKS.register("potted_bulbine_flower", () -> new FlowerPotBlock((() -> (FlowerPotBlock) Blocks.FLOWER_POT), BULBINE_FLOWER, BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION)));

    //Gray
//    public static final RegistryObject<Block> _FLOWER = registerBlock("_flower", () -> new FlowerBlock(() -> MobEffects.MOVEMENT_SPEED, 1, BlockBehaviour.Properties.copy(Blocks.DANDELION)));
//    public static final RegistryObject<Block> POTTED__FLOWER = BLOCKS.register("potted__flower", () -> new FlowerPotBlock((() -> (FlowerPotBlock) Blocks.FLOWER_POT), _FLOWER, BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION)));
    public static final RegistryObject<Block> SILVER_BRUNIA_FLOWER = registerBlock("silver_brunia_flower", () -> new FlowerBlock(() -> MobEffects.MOVEMENT_SPEED, 1, BlockBehaviour.Properties.copy(Blocks.DANDELION)));
    public static final RegistryObject<Block> POTTED_SILVER_BRUNIA_FLOWER = BLOCKS.register("potted_silver_brunia_flower", () -> new FlowerPotBlock((() -> (FlowerPotBlock) Blocks.FLOWER_POT), SILVER_BRUNIA_FLOWER, BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION)));
    public static final RegistryObject<Block> GRAY_ROSES_FLOWER = registerBlock("gray_roses_flower", () -> new FlowerBlock(() -> MobEffects.MOVEMENT_SPEED, 1, BlockBehaviour.Properties.copy(Blocks.DANDELION)));
    public static final RegistryObject<Block> POTTED_GRAY_ROSES_FLOWER = BLOCKS.register("potted_gray_roses_flower", () -> new FlowerPotBlock((() -> (FlowerPotBlock) Blocks.FLOWER_POT), GRAY_ROSES_FLOWER, BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION)));
    public static final RegistryObject<Block> MOON_CARROT_FLOWER = registerBlock("moon_carrot_flower", () -> new FlowerBlock(() -> MobEffects.MOVEMENT_SPEED, 1, BlockBehaviour.Properties.copy(Blocks.DANDELION)));
    public static final RegistryObject<Block> POTTED_MOON_CARROT_FLOWER = BLOCKS.register("potted_moon_carrot_flower", () -> new FlowerPotBlock((() -> (FlowerPotBlock) Blocks.FLOWER_POT), MOON_CARROT_FLOWER, BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION)));
    public static final RegistryObject<Block> SILVER_BABY_FLOWER = registerBlock("silver_baby_flower", () -> new FlowerBlock(() -> MobEffects.MOVEMENT_SPEED, 1, BlockBehaviour.Properties.copy(Blocks.DANDELION)));
    public static final RegistryObject<Block> POTTED_SILVER_BABY_FLOWER = BLOCKS.register("potted_silver_baby_flower", () -> new FlowerPotBlock((() -> (FlowerPotBlock) Blocks.FLOWER_POT), SILVER_BABY_FLOWER, BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION)));

    //Purple
//    public static final RegistryObject<Block> _FLOWER = registerBlock("_flower", () -> new FlowerBlock(() -> MobEffects.MOVEMENT_SPEED, 1, BlockBehaviour.Properties.copy(Blocks.DANDELION)));
//    public static final RegistryObject<Block> POTTED__FLOWER = BLOCKS.register("potted__flower", () -> new FlowerPotBlock((() -> (FlowerPotBlock) Blocks.FLOWER_POT), _FLOWER, BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION)));
    public static final RegistryObject<Block> LAVENDER_FLOWER = registerBlock("lavender_flower", () -> new FlowerBlock(() -> MobEffects.MOVEMENT_SPEED, 1, BlockBehaviour.Properties.copy(Blocks.DANDELION)));
    public static final RegistryObject<Block> POTTED_LAVENDER_FLOWER = BLOCKS.register("potted_lavender_flower", () -> new FlowerPotBlock((() -> (FlowerPotBlock) Blocks.FLOWER_POT), LAVENDER_FLOWER, BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION)));
    public static final RegistryObject<Block> BELLFLOWER_FLOWER = registerBlock("bellflower_flower", () -> new FlowerBlock(() -> MobEffects.MOVEMENT_SPEED, 1, BlockBehaviour.Properties.copy(Blocks.DANDELION)));
    public static final RegistryObject<Block> POTTED_BELLFLOWER_FLOWER = BLOCKS.register("potted_bellflower_flower", () -> new FlowerPotBlock((() -> (FlowerPotBlock) Blocks.FLOWER_POT), BELLFLOWER_FLOWER, BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION)));
    public static final RegistryObject<Block> LILAC_FLOWER = registerBlock("lilac_flower", () -> new FlowerBlock(() -> MobEffects.MOVEMENT_SPEED, 1, BlockBehaviour.Properties.copy(Blocks.DANDELION)));
    public static final RegistryObject<Block> POTTED_LILAC_FLOWER = BLOCKS.register("potted_lilac_flower", () -> new FlowerPotBlock((() -> (FlowerPotBlock) Blocks.FLOWER_POT), LILAC_FLOWER, BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION)));
    public static final RegistryObject<Block> SWEET_PEA_FLOWER = registerBlock("sweet_pea_flower", () -> new FlowerBlock(() -> MobEffects.MOVEMENT_SPEED, 1, BlockBehaviour.Properties.copy(Blocks.DANDELION)));
    public static final RegistryObject<Block> POTTED_SWEET_PEA_FLOWER = BLOCKS.register("potted_sweet_pea_flower", () -> new FlowerPotBlock((() -> (FlowerPotBlock) Blocks.FLOWER_POT), SWEET_PEA_FLOWER, BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION)));

    /*
    FLUIDS
     */
    public static final RegistryObject<LiquidBlock> STYX_WATER_BLOCK = BLOCKS.register("styx_water_block", () -> new LiquidBlock(ModFluids.SOURCE_STYX_WATER, BlockBehaviour.Properties.copy(Blocks.WATER).noLootTable()));

    /*
    CROPS
     */
    public static final RegistryObject<Block> POMEGRANATE_CROP_BLOCK = BLOCKS.register("pomegranate_crop_block", () -> new PomegranateCropBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT).noCollission().noOcclusion()));

    public static final RegistryObject<Block> DURUM_WHEAT_CROP_BLOCK = BLOCKS.register("durum_wheat_crop_block", () -> new DurumWheatCropBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT).noCollission().noOcclusion()));
    public static final RegistryObject<Block> TOMATO_CROP_BLOCK = BLOCKS.register("tomato_crop_block", () -> new TomatoCropBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT).noCollission().noOcclusion()));
    public static final RegistryObject<Block> WILD_ONION_CROP_BLOCK = BLOCKS.register("wild_onion_crop_block", () -> new OnionCropBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT).noCollission().noOcclusion(), 0));
    public static final RegistryObject<Block> STAGE_1_ONION_CROP_BLOCK = BLOCKS.register("stage_1_onion_crop_block", () -> new OnionCropBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT).noCollission().noOcclusion(), 1));
    public static final RegistryObject<Block> STAGE_2_ONION_CROP_BLOCK = BLOCKS.register("stage_2_onion_crop_block", () -> new OnionCropBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT).noCollission().noOcclusion(), 2));
    public static final RegistryObject<Block> STAGE_3_ONION_CROP_BLOCK = BLOCKS.register("stage_3_onion_crop_block", () -> new OnionCropBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT).noCollission().noOcclusion(), 3));
    public static final RegistryObject<Block> ONION_CROP_BLOCK = BLOCKS.register("onion_crop_block", () -> new OnionCropBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT).noCollission().noOcclusion(), 4));
    public static final RegistryObject<Block> DRAGON_FRUIT_CROP_BLOCK = BLOCKS.register("dragon_fruit_crop_block", () -> new DragonFruitCropBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT).noCollission().noOcclusion()));
    public static final RegistryObject<Block> CHILLI_CROP_BLOCK = BLOCKS.register("chilli_crop_block", () -> new ChilliCropBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT).noCollission().noOcclusion()));

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
