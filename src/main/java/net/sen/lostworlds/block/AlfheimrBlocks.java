package net.sen.lostworlds.block;

import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.FlowerBlock;
import net.minecraft.world.level.block.FlowerPotBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.sen.lostworlds.LostWorldsApi;
import net.sen.lostworlds.block.crops.*;
import net.sen.lostworlds.block.custom.*;
import net.sen.lostworlds.block.portal.AlfheimrPortalBlock;
import net.sen.lostworlds.item.ModItems;

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
