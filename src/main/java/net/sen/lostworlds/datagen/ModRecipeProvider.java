package net.sen.lostworlds.datagen;

import net.minecraft.advancements.critereon.ItemPredicate;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.AbstractCookingRecipe;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;
import net.sen.lostworlds.LostWorlds;
import net.sen.lostworlds.LostWorldsConstants;
import net.sen.lostworlds.block.ModBlocks;
import net.sen.lostworlds.datagen.custom.AlloySmelterRecipeBuilder;
import net.sen.lostworlds.item.ModItems;
import net.sen.lostworlds.util.ModTags;

import javax.annotation.Nullable;
import java.util.List;
import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    private List<ItemLike> CRIMSON_STEEL_SMELTABLES = List.of(ModItems.RAW_NETHER_STEEL.get(), ModBlocks.NETHER_STEEL_ORE.get(), ModBlocks.DEEPSLATE_NETHER_STEEL_ORE.get());
    private List<ItemLike> ZINC_SMELTABLES = List.of(ModItems.RAW_ZINC.get(), ModBlocks.ZINC_ORE.get(), ModBlocks.DEEPSLATE_ZINC_ORE.get());
    private List<ItemLike> TIN_SMELTABLES = List.of(ModItems.RAW_TIN.get(), ModBlocks.TIN_ORE.get(), ModBlocks.DEEPSLATE_TIN_ORE.get());
    private List<ItemLike> ORICHALCUM_SMELTABLES = List.of(ModItems.RAW_ORICHALCUM.get(), ModBlocks.ORICHALCUM_ORE.get(), ModBlocks.DEEPSLATE_ORICHALCUM_ORE.get());

    public ModRecipeProvider(PackOutput pOutput) {
        super(pOutput);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> pWriter) {
        createOreRecipes(pWriter, "nether_steel", CRIMSON_STEEL_SMELTABLES, ModItems.NETHER_STEEL_INGOT.get(), ModBlocks.NETHER_STEEL_BLOCK.get(), ModItems.RAW_NETHER_STEEL.get(), ModBlocks.RAW_NETHER_STEEL_BLOCK.get(), ModItems.NETHER_STEEL_NUGGET.get());
        createTools(pWriter, "nether_steel", ModItems.NETHER_STEEL_INGOT.get(),
                ModItems.NETHER_STEEL_PICKAXE.get(), ModItems.NETHER_STEEL_SHOVEL.get(), ModItems.NETHER_STEEL_AXE.get(), ModItems.NETHER_STEEL_SWORD.get(), ModItems.NETHER_STEEL_HOE.get(),
                ModItems.NETHER_STEEL_HELMET.get(), ModItems.NETHER_STEEL_CHESTPLATE.get(), ModItems.NETHER_STEEL_LEGGINGS.get(), ModItems.NETHER_STEEL_BOOTS.get());

        createOreRecipes(pWriter, "zinc", ZINC_SMELTABLES, ModItems.ZINC_INGOT.get(), ModBlocks.ZINC_BLOCK.get(), ModItems.RAW_ZINC.get(), ModBlocks.RAW_ZINC_BLOCK.get(), ModItems.ZINC_NUGGET.get());
        createTools(pWriter, "zinc", ModItems.ZINC_INGOT.get(),
                ModItems.ZINC_PICKAXE.get(), ModItems.ZINC_SHOVEL.get(), ModItems.ZINC_AXE.get(), ModItems.ZINC_SWORD.get(), ModItems.ZINC_HOE.get(),
                ModItems.ZINC_HELMET.get(), ModItems.ZINC_CHESTPLATE.get(), ModItems.ZINC_LEGGINGS.get(), ModItems.ZINC_BOOTS.get());

        createOreRecipes(pWriter, "tin", TIN_SMELTABLES, ModItems.TIN_INGOT.get(), ModBlocks.TIN_BLOCK.get(), ModItems.RAW_TIN.get(), ModBlocks.RAW_TIN_BLOCK.get(), ModItems.TIN_NUGGET.get());
        createTools(pWriter, "tin", ModItems.TIN_INGOT.get(),
                ModItems.TIN_PICKAXE.get(), ModItems.TIN_SHOVEL.get(), ModItems.TIN_AXE.get(), ModItems.TIN_SWORD.get(), ModItems.TIN_HOE.get(),
                ModItems.TIN_HELMET.get(), ModItems.TIN_CHESTPLATE.get(), ModItems.TIN_LEGGINGS.get(), ModItems.TIN_BOOTS.get());

        createOreRecipes(pWriter, "orichalcum", ORICHALCUM_SMELTABLES, ModItems.ORICHALCUM_INGOT.get(), ModBlocks.ORICHALCUM_BLOCK.get(), ModItems.RAW_ORICHALCUM.get(), ModBlocks.RAW_ORICHALCUM_BLOCK.get(), ModItems.ORICHALCUM_NUGGET.get());
        createTools(pWriter, "orichalcum", ModItems.ORICHALCUM_INGOT.get(),
                ModItems.ORICHALCUM_PICKAXE.get(), ModItems.ORICHALCUM_SHOVEL.get(), ModItems.ORICHALCUM_AXE.get(), ModItems.ORICHALCUM_SWORD.get(), ModItems.ORICHALCUM_HOE.get(),
                ModItems.ORICHALCUM_HELMET.get(), ModItems.ORICHALCUM_CHESTPLATE.get(), ModItems.ORICHALCUM_LEGGINGS.get(), ModItems.ORICHALCUM_BOOTS.get());

        createAlloyRecipes(pWriter, "brass", Items.COPPER_INGOT, ModItems.ZINC_INGOT.get(), ModItems.BRASS_INGOT.get(), ModBlocks.BRASS_BLOCK.get(), ModItems.BRASS_NUGGET.get());
        createTools(pWriter, "brass", ModItems.BRASS_INGOT.get(),
                ModItems.BRASS_PICKAXE.get(), ModItems.BRASS_SHOVEL.get(), ModItems.BRASS_AXE.get(), ModItems.BRASS_SWORD.get(), ModItems.BRASS_HOE.get(),
                ModItems.BRASS_HELMET.get(), ModItems.BRASS_CHESTPLATE.get(), ModItems.BRASS_LEGGINGS.get(), ModItems.BRASS_BOOTS.get());

        createAlloyRecipes(pWriter, "bronze", Items.COPPER_INGOT, ModItems.TIN_INGOT.get(), ModItems.BRONZE_INGOT.get(), ModBlocks.BRONZE_BLOCK.get(), ModItems.BRONZE_NUGGET.get());
        createTools(pWriter, "bronze", ModItems.BRONZE_INGOT.get(),
                ModItems.BRONZE_PICKAXE.get(), ModItems.BRONZE_SHOVEL.get(), ModItems.BRONZE_AXE.get(), ModItems.BRONZE_SWORD.get(), ModItems.BRONZE_HOE.get(),
                ModItems.BRONZE_HELMET.get(), ModItems.BRONZE_CHESTPLATE.get(), ModItems.BRONZE_LEGGINGS.get(), ModItems.BRONZE_BOOTS.get());

        nineBlockStorageRecipesForMetals(pWriter, ModItems.CRIMSON_DIAMOND.get(), ModBlocks.CRIMSON_DIAMOND_BLOCK.get());

//        createStoneGeoRecipes(pWriter,
//                ModBlocks.CRIMSON_STONE.get(),
//                ModBlocks.CRIMSON_STONE_STAIRS.get(),
//                ModBlocks.CRIMSON_STONE_SLAB.get(),
//                ModBlocks.CRIMSON_COBBLESTONE.get(),
//                ModBlocks.CRIMSON_COBBLESTONE_STAIRS.get(),
//                ModBlocks.CRIMSON_COBBLESTONE_SLAB.get(),
//                ModBlocks.CRIMSON_STONE_BRICKS.get(),
//                ModBlocks.CRIMSON_STONE_BRICK_STAIRS.get(),
//                ModBlocks.CRIMSON_STONE_BRICK_SLAB.get(),
//                ModBlocks.CRIMSON_STONE_BUTTON.get(),
//                ModBlocks.CRIMSON_STONE_PRESSURE_PLATE.get()
//                ModBlocks.CRIMSON_STONE_WALL.get()
//        );

        createStoneGeoRecipes(pWriter,
                ModBlocks.NIDAVELLIR_SOFT_STONE.get(),
                ModBlocks.NIDAVELLIR_SOFT_STONE_STAIRS.get(),
                ModBlocks.NIDAVELLIR_SOFT_STONE_SLAB.get(),
                ModBlocks.NIDAVELLIR_SOFT_COBBLESTONE.get(),
                ModBlocks.NIDAVELLIR_SOFT_COBBLESTONE_STAIRS.get(),
                ModBlocks.NIDAVELLIR_SOFT_COBBLESTONE_SLAB.get(),
                ModBlocks.NIDAVELLIR_SOFT_STONE_BRICKS.get(),
                ModBlocks.NIDAVELLIR_SOFT_STONE_BRICKS_STAIRS.get(),
                ModBlocks.NIDAVELLIR_SOFT_STONE_BRICKS_SLAB.get(),
                ModBlocks.NIDAVELLIR_SOFT_STONE_BUTTON.get(),
                ModBlocks.NIDAVELLIR_SOFT_STONE_PRESSURE_PLATE.get(),
                ModBlocks.NIDAVELLIR_SOFT_STONE_WALL.get(),
                ModBlocks.NIDAVELLIR_SOFT_COBBLESTONE_WALL.get(),
                ModBlocks.NIDAVELLIR_SOFT_STONE_BRICKS_WALL.get()
        );

        createBlastingRecipes(pWriter, ModBlocks.NIDAVELLIR_SOFT_STONE_IRON_ORE.get(), Items.IRON_INGOT);
        createBlastingRecipes(pWriter, ModBlocks.NIDAVELLIR_SOFT_STONE_GOLD_ORE.get(), Items.GOLD_INGOT);
        createBlastingRecipes(pWriter, ModBlocks.NIDAVELLIR_SOFT_STONE_COPPER_ORE.get(), Items.COPPER_INGOT);
        createBlastingRecipes(pWriter, ModBlocks.NIDAVELLIR_SOFT_STONE_TIN_ORE.get(), ModItems.TIN_INGOT.get());
        createBlastingRecipes(pWriter, ModBlocks.NIDAVELLIR_SOFT_STONE_ZINC_ORE.get(), ModItems.ZINC_INGOT.get());
        createBlastingRecipes(pWriter, ModBlocks.NIDAVELLIR_SOFT_STONE_DIAMOND_ORE.get(), Items.DIAMOND);
        createBlastingRecipes(pWriter, ModBlocks.NIDAVELLIR_SOFT_STONE_EMERALD_ORE.get(), Items.EMERALD);
        createBlastingRecipes(pWriter, ModBlocks.NIDAVELLIR_SOFT_STONE_COAL_ORE.get(), Items.COAL);
        createBlastingRecipes(pWriter, ModBlocks.NIDAVELLIR_SOFT_STONE_REDSTONE_ORE.get(), Items.REDSTONE);
        createBlastingRecipes(pWriter, ModBlocks.NIDAVELLIR_SOFT_STONE_LAPIS_ORE.get(), Items.LAPIS_LAZULI);

        createBlastingRecipes(pWriter, ModBlocks.NIDAVELLIR_SOFT_STONE_IRON_ORE_CLUSTER.get(), Items.IRON_INGOT);
        createBlastingRecipes(pWriter, ModBlocks.NIDAVELLIR_SOFT_STONE_GOLD_ORE_CLUSTER.get(), Items.GOLD_INGOT);
        createBlastingRecipes(pWriter, ModBlocks.NIDAVELLIR_SOFT_STONE_COPPER_ORE_CLUSTER.get(), Items.COPPER_INGOT);
        createBlastingRecipes(pWriter, ModBlocks.NIDAVELLIR_SOFT_STONE_TIN_ORE_CLUSTER.get(), ModItems.TIN_INGOT.get());
        createBlastingRecipes(pWriter, ModBlocks.NIDAVELLIR_SOFT_STONE_ZINC_ORE_CLUSTER.get(), ModItems.ZINC_INGOT.get());
        createBlastingRecipes(pWriter, ModBlocks.NIDAVELLIR_SOFT_STONE_DIAMOND_ORE_CLUSTER.get(), Items.DIAMOND);
        createBlastingRecipes(pWriter, ModBlocks.NIDAVELLIR_SOFT_STONE_EMERALD_ORE_CLUSTER.get(), Items.EMERALD);
        createBlastingRecipes(pWriter, ModBlocks.NIDAVELLIR_SOFT_STONE_COAL_ORE_CLUSTER.get(), Items.COAL);
        createBlastingRecipes(pWriter, ModBlocks.NIDAVELLIR_SOFT_STONE_REDSTONE_ORE_CLUSTER.get(), Items.REDSTONE);
        createBlastingRecipes(pWriter, ModBlocks.NIDAVELLIR_SOFT_STONE_LAPIS_ORE_CLUSTER.get(), Items.LAPIS_LAZULI);

        createStoneGeoRecipes(pWriter,
                ModBlocks.NIDAVELLIR_HARD_STONE.get(),
                ModBlocks.NIDAVELLIR_HARD_STONE_STAIRS.get(),
                ModBlocks.NIDAVELLIR_HARD_STONE_SLAB.get(),
                ModBlocks.NIDAVELLIR_HARD_COBBLESTONE.get(),
                ModBlocks.NIDAVELLIR_HARD_COBBLESTONE_STAIRS.get(),
                ModBlocks.NIDAVELLIR_HARD_COBBLESTONE_SLAB.get(),
                ModBlocks.NIDAVELLIR_HARD_STONE_BRICKS.get(),
                ModBlocks.NIDAVELLIR_HARD_STONE_BRICKS_STAIRS.get(),
                ModBlocks.NIDAVELLIR_HARD_STONE_BRICKS_SLAB.get(),
                ModBlocks.NIDAVELLIR_HARD_STONE_BUTTON.get(),
                ModBlocks.NIDAVELLIR_HARD_STONE_PRESSURE_PLATE.get(),
                ModBlocks.NIDAVELLIR_HARD_STONE_WALL.get(),
                ModBlocks.NIDAVELLIR_HARD_COBBLESTONE_WALL.get(),
                ModBlocks.NIDAVELLIR_HARD_STONE_BRICKS_WALL.get()
        );

        createBlastingRecipes(pWriter, ModBlocks.NIDAVELLIR_HARD_STONE_IRON_ORE.get(), Items.IRON_INGOT);
        createBlastingRecipes(pWriter, ModBlocks.NIDAVELLIR_HARD_STONE_GOLD_ORE.get(), Items.GOLD_INGOT);
        createBlastingRecipes(pWriter, ModBlocks.NIDAVELLIR_HARD_STONE_COPPER_ORE.get(), Items.COPPER_INGOT);
        createBlastingRecipes(pWriter, ModBlocks.NIDAVELLIR_HARD_STONE_TIN_ORE.get(), ModItems.TIN_INGOT.get());
        createBlastingRecipes(pWriter, ModBlocks.NIDAVELLIR_HARD_STONE_ZINC_ORE.get(), ModItems.ZINC_INGOT.get());
        createBlastingRecipes(pWriter, ModBlocks.NIDAVELLIR_HARD_STONE_DIAMOND_ORE.get(), Items.DIAMOND);
        createBlastingRecipes(pWriter, ModBlocks.NIDAVELLIR_HARD_STONE_EMERALD_ORE.get(), Items.EMERALD);
        createBlastingRecipes(pWriter, ModBlocks.NIDAVELLIR_HARD_STONE_COAL_ORE.get(), Items.COAL);
        createBlastingRecipes(pWriter, ModBlocks.NIDAVELLIR_HARD_STONE_REDSTONE_ORE.get(), Items.REDSTONE);
        createBlastingRecipes(pWriter, ModBlocks.NIDAVELLIR_HARD_STONE_LAPIS_ORE.get(), Items.LAPIS_LAZULI);

        createBlastingRecipes(pWriter, ModBlocks.NIDAVELLIR_HARD_STONE_IRON_ORE_CLUSTER.get(), Items.IRON_INGOT);
        createBlastingRecipes(pWriter, ModBlocks.NIDAVELLIR_HARD_STONE_GOLD_ORE_CLUSTER.get(), Items.GOLD_INGOT);
        createBlastingRecipes(pWriter, ModBlocks.NIDAVELLIR_HARD_STONE_COPPER_ORE_CLUSTER.get(), Items.COPPER_INGOT);
        createBlastingRecipes(pWriter, ModBlocks.NIDAVELLIR_HARD_STONE_TIN_ORE_CLUSTER.get(), ModItems.TIN_INGOT.get());
        createBlastingRecipes(pWriter, ModBlocks.NIDAVELLIR_HARD_STONE_ZINC_ORE_CLUSTER.get(), ModItems.ZINC_INGOT.get());
        createBlastingRecipes(pWriter, ModBlocks.NIDAVELLIR_HARD_STONE_DIAMOND_ORE_CLUSTER.get(), Items.DIAMOND);
        createBlastingRecipes(pWriter, ModBlocks.NIDAVELLIR_HARD_STONE_EMERALD_ORE_CLUSTER.get(), Items.EMERALD);
        createBlastingRecipes(pWriter, ModBlocks.NIDAVELLIR_HARD_STONE_COAL_ORE_CLUSTER.get(), Items.COAL);
        createBlastingRecipes(pWriter, ModBlocks.NIDAVELLIR_HARD_STONE_REDSTONE_ORE_CLUSTER.get(), Items.REDSTONE);
        createBlastingRecipes(pWriter, ModBlocks.NIDAVELLIR_HARD_STONE_LAPIS_ORE_CLUSTER.get(), Items.LAPIS_LAZULI);

        createStoneGeoRecipes(pWriter,
                ModBlocks.NIDAVELLIR_ENHANCED_STONE.get(),
                ModBlocks.NIDAVELLIR_ENHANCED_STONE_STAIRS.get(),
                ModBlocks.NIDAVELLIR_ENHANCED_STONE_SLAB.get(),
                ModBlocks.NIDAVELLIR_ENHANCED_COBBLESTONE.get(),
                ModBlocks.NIDAVELLIR_ENHANCED_COBBLESTONE_STAIRS.get(),
                ModBlocks.NIDAVELLIR_ENHANCED_COBBLESTONE_SLAB.get(),
                ModBlocks.NIDAVELLIR_ENHANCED_STONE_BRICKS.get(),
                ModBlocks.NIDAVELLIR_ENHANCED_STONE_BRICKS_STAIRS.get(),
                ModBlocks.NIDAVELLIR_ENHANCED_STONE_BRICKS_SLAB.get(),
                ModBlocks.NIDAVELLIR_ENHANCED_STONE_BUTTON.get(),
                ModBlocks.NIDAVELLIR_ENHANCED_STONE_PRESSURE_PLATE.get(),
                ModBlocks.NIDAVELLIR_ENHANCED_STONE_WALL.get(),
                ModBlocks.NIDAVELLIR_ENHANCED_COBBLESTONE_WALL.get(),
                ModBlocks.NIDAVELLIR_ENHANCED_STONE_BRICKS_WALL.get()
        );

        createBlastingRecipes(pWriter, ModBlocks.NIDAVELLIR_ENHANCED_STONE_IRON_ORE.get(), Items.IRON_INGOT);
        createBlastingRecipes(pWriter, ModBlocks.NIDAVELLIR_ENHANCED_STONE_GOLD_ORE.get(), Items.GOLD_INGOT);
        createBlastingRecipes(pWriter, ModBlocks.NIDAVELLIR_ENHANCED_STONE_COPPER_ORE.get(), Items.COPPER_INGOT);
        createBlastingRecipes(pWriter, ModBlocks.NIDAVELLIR_ENHANCED_STONE_TIN_ORE.get(), ModItems.TIN_INGOT.get());
        createBlastingRecipes(pWriter, ModBlocks.NIDAVELLIR_ENHANCED_STONE_ZINC_ORE.get(), ModItems.ZINC_INGOT.get());
        createBlastingRecipes(pWriter, ModBlocks.NIDAVELLIR_ENHANCED_STONE_DIAMOND_ORE.get(), Items.DIAMOND);
        createBlastingRecipes(pWriter, ModBlocks.NIDAVELLIR_ENHANCED_STONE_EMERALD_ORE.get(), Items.EMERALD);
        createBlastingRecipes(pWriter, ModBlocks.NIDAVELLIR_ENHANCED_STONE_COAL_ORE.get(), Items.COAL);
        createBlastingRecipes(pWriter, ModBlocks.NIDAVELLIR_ENHANCED_STONE_REDSTONE_ORE.get(), Items.REDSTONE);
        createBlastingRecipes(pWriter, ModBlocks.NIDAVELLIR_ENHANCED_STONE_LAPIS_ORE.get(), Items.LAPIS_LAZULI);

        createBlastingRecipes(pWriter, ModBlocks.NIDAVELLIR_ENHANCED_STONE_IRON_ORE_CLUSTER.get(), Items.IRON_INGOT);
        createBlastingRecipes(pWriter, ModBlocks.NIDAVELLIR_ENHANCED_STONE_GOLD_ORE_CLUSTER.get(), Items.GOLD_INGOT);
        createBlastingRecipes(pWriter, ModBlocks.NIDAVELLIR_ENHANCED_STONE_COPPER_ORE_CLUSTER.get(), Items.COPPER_INGOT);
        createBlastingRecipes(pWriter, ModBlocks.NIDAVELLIR_ENHANCED_STONE_TIN_ORE_CLUSTER.get(), ModItems.TIN_INGOT.get());
        createBlastingRecipes(pWriter, ModBlocks.NIDAVELLIR_ENHANCED_STONE_ZINC_ORE_CLUSTER.get(), ModItems.ZINC_INGOT.get());
        createBlastingRecipes(pWriter, ModBlocks.NIDAVELLIR_ENHANCED_STONE_DIAMOND_ORE_CLUSTER.get(), Items.DIAMOND);
        createBlastingRecipes(pWriter, ModBlocks.NIDAVELLIR_ENHANCED_STONE_EMERALD_ORE_CLUSTER.get(), Items.EMERALD);
        createBlastingRecipes(pWriter, ModBlocks.NIDAVELLIR_ENHANCED_STONE_COAL_ORE_CLUSTER.get(), Items.COAL);
        createBlastingRecipes(pWriter, ModBlocks.NIDAVELLIR_ENHANCED_STONE_REDSTONE_ORE_CLUSTER.get(), Items.REDSTONE);
        createBlastingRecipes(pWriter, ModBlocks.NIDAVELLIR_ENHANCED_STONE_LAPIS_ORE_CLUSTER.get(), Items.LAPIS_LAZULI);

        createStoneGeoRecipes(pWriter,
                ModBlocks.NIDAVELLIR_DEEPSLATE_STONE.get(),
                ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_STAIRS.get(),
                ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_SLAB.get(),
                ModBlocks.NIDAVELLIR_DEEPSLATE_COBBLESTONE.get(),
                ModBlocks.NIDAVELLIR_DEEPSLATE_COBBLESTONE_STAIRS.get(),
                ModBlocks.NIDAVELLIR_DEEPSLATE_COBBLESTONE_SLAB.get(),
                ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_BRICKS.get(),
                ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_BRICKS_STAIRS.get(),
                ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_BRICKS_SLAB.get(),
                ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_BUTTON.get(),
                ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_PRESSURE_PLATE.get(),
                ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_WALL.get(),
                ModBlocks.NIDAVELLIR_DEEPSLATE_COBBLESTONE_WALL.get(),
                ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_BRICKS_WALL.get()
        );

        createBlastingRecipes(pWriter, ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_IRON_ORE.get(), Items.IRON_INGOT);
        createBlastingRecipes(pWriter, ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_GOLD_ORE.get(), Items.GOLD_INGOT);
        createBlastingRecipes(pWriter, ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_COPPER_ORE.get(), Items.COPPER_INGOT);
        createBlastingRecipes(pWriter, ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_TIN_ORE.get(), ModItems.TIN_INGOT.get());
        createBlastingRecipes(pWriter, ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_ZINC_ORE.get(), ModItems.ZINC_INGOT.get());
        createBlastingRecipes(pWriter, ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_DIAMOND_ORE.get(), Items.DIAMOND);
        createBlastingRecipes(pWriter, ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_EMERALD_ORE.get(), Items.EMERALD);
        createBlastingRecipes(pWriter, ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_COAL_ORE.get(), Items.COAL);
        createBlastingRecipes(pWriter, ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_REDSTONE_ORE.get(), Items.REDSTONE);
        createBlastingRecipes(pWriter, ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_LAPIS_ORE.get(), Items.LAPIS_LAZULI);

        createBlastingRecipes(pWriter, ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_IRON_ORE_CLUSTER.get(), Items.IRON_INGOT);
        createBlastingRecipes(pWriter, ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_GOLD_ORE_CLUSTER.get(), Items.GOLD_INGOT);
        createBlastingRecipes(pWriter, ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_COPPER_ORE_CLUSTER.get(), Items.COPPER_INGOT);
        createBlastingRecipes(pWriter, ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_TIN_ORE_CLUSTER.get(), ModItems.TIN_INGOT.get());
        createBlastingRecipes(pWriter, ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_ZINC_ORE_CLUSTER.get(), ModItems.ZINC_INGOT.get());
        createBlastingRecipes(pWriter, ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_DIAMOND_ORE_CLUSTER.get(), Items.DIAMOND);
        createBlastingRecipes(pWriter, ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_EMERALD_ORE_CLUSTER.get(), Items.EMERALD);
        createBlastingRecipes(pWriter, ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_COAL_ORE_CLUSTER.get(), Items.COAL);
        createBlastingRecipes(pWriter, ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_REDSTONE_ORE_CLUSTER.get(), Items.REDSTONE);
        createBlastingRecipes(pWriter, ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_LAPIS_ORE_CLUSTER.get(), Items.LAPIS_LAZULI);

        createStoneGeoRecipes(pWriter,
                ModBlocks.NIDAVELLIR_CRIMSON_STONE.get(),
                ModBlocks.NIDAVELLIR_CRIMSON_STONE_STAIRS.get(),
                ModBlocks.NIDAVELLIR_CRIMSON_STONE_SLAB.get(),
                ModBlocks.NIDAVELLIR_CRIMSON_COBBLESTONE.get(),
                ModBlocks.NIDAVELLIR_CRIMSON_COBBLESTONE_STAIRS.get(),
                ModBlocks.NIDAVELLIR_CRIMSON_COBBLESTONE_SLAB.get(),
                ModBlocks.NIDAVELLIR_CRIMSON_STONE_BRICKS.get(),
                ModBlocks.NIDAVELLIR_CRIMSON_STONE_BRICKS_STAIRS.get(),
                ModBlocks.NIDAVELLIR_CRIMSON_STONE_BRICKS_SLAB.get(),
                ModBlocks.NIDAVELLIR_CRIMSON_STONE_BUTTON.get(),
                ModBlocks.NIDAVELLIR_CRIMSON_STONE_PRESSURE_PLATE.get(),
                ModBlocks.NIDAVELLIR_CRIMSON_STONE_WALL.get(),
                ModBlocks.NIDAVELLIR_CRIMSON_COBBLESTONE_WALL.get(),
                ModBlocks.NIDAVELLIR_CRIMSON_STONE_BRICKS_WALL.get()
        );

        createBlastingRecipes(pWriter, ModBlocks.NIDAVELLIR_CRIMSON_STONE_IRON_ORE.get(), Items.IRON_INGOT);
        createBlastingRecipes(pWriter, ModBlocks.NIDAVELLIR_CRIMSON_STONE_GOLD_ORE.get(), Items.GOLD_INGOT);
        createBlastingRecipes(pWriter, ModBlocks.NIDAVELLIR_CRIMSON_STONE_COPPER_ORE.get(), Items.COPPER_INGOT);
        createBlastingRecipes(pWriter, ModBlocks.NIDAVELLIR_CRIMSON_STONE_TIN_ORE.get(), ModItems.TIN_INGOT.get());
        createBlastingRecipes(pWriter, ModBlocks.NIDAVELLIR_CRIMSON_STONE_ZINC_ORE.get(), ModItems.ZINC_INGOT.get());
        createBlastingRecipes(pWriter, ModBlocks.NIDAVELLIR_CRIMSON_STONE_DIAMOND_ORE.get(), Items.DIAMOND);
        createBlastingRecipes(pWriter, ModBlocks.NIDAVELLIR_CRIMSON_STONE_EMERALD_ORE.get(), Items.EMERALD);
        createBlastingRecipes(pWriter, ModBlocks.NIDAVELLIR_CRIMSON_STONE_COAL_ORE.get(), Items.COAL);
        createBlastingRecipes(pWriter, ModBlocks.NIDAVELLIR_CRIMSON_STONE_REDSTONE_ORE.get(), Items.REDSTONE);
        createBlastingRecipes(pWriter, ModBlocks.NIDAVELLIR_CRIMSON_STONE_LAPIS_ORE.get(), Items.LAPIS_LAZULI);

        createBlastingRecipes(pWriter, ModBlocks.NIDAVELLIR_CRIMSON_STONE_IRON_ORE_CLUSTER.get(), Items.IRON_INGOT);
        createBlastingRecipes(pWriter, ModBlocks.NIDAVELLIR_CRIMSON_STONE_GOLD_ORE_CLUSTER.get(), Items.GOLD_INGOT);
        createBlastingRecipes(pWriter, ModBlocks.NIDAVELLIR_CRIMSON_STONE_COPPER_ORE_CLUSTER.get(), Items.COPPER_INGOT);
        createBlastingRecipes(pWriter, ModBlocks.NIDAVELLIR_CRIMSON_STONE_TIN_ORE_CLUSTER.get(), ModItems.TIN_INGOT.get());
        createBlastingRecipes(pWriter, ModBlocks.NIDAVELLIR_CRIMSON_STONE_ZINC_ORE_CLUSTER.get(), ModItems.ZINC_INGOT.get());
        createBlastingRecipes(pWriter, ModBlocks.NIDAVELLIR_CRIMSON_STONE_DIAMOND_ORE_CLUSTER.get(), Items.DIAMOND);
        createBlastingRecipes(pWriter, ModBlocks.NIDAVELLIR_CRIMSON_STONE_EMERALD_ORE_CLUSTER.get(), Items.EMERALD);
        createBlastingRecipes(pWriter, ModBlocks.NIDAVELLIR_CRIMSON_STONE_COAL_ORE_CLUSTER.get(), Items.COAL);
        createBlastingRecipes(pWriter, ModBlocks.NIDAVELLIR_CRIMSON_STONE_REDSTONE_ORE_CLUSTER.get(), Items.REDSTONE);
        createBlastingRecipes(pWriter, ModBlocks.NIDAVELLIR_CRIMSON_STONE_LAPIS_ORE_CLUSTER.get(), Items.LAPIS_LAZULI);

        createStoneGeoRecipes(pWriter,
                ModBlocks.TARTARUS_STONE.get(),
                ModBlocks.TARTARUS_STONE_STAIRS.get(),
                ModBlocks.TARTARUS_STONE_SLAB.get(),
                ModBlocks.TARTARUS_STONE_COBBLESTONE.get(),
                ModBlocks.TARTARUS_STONE_COBBLESTONE_STAIRS.get(),
                ModBlocks.TARTARUS_STONE_COBBLESTONE_SLAB.get(),
                ModBlocks.TARTARUS_STONE_BRICKS.get(),
                ModBlocks.TARTARUS_STONE_BRICKS_STAIRS.get(),
                ModBlocks.TARTARUS_STONE_BRICKS_SLAB.get(),
                ModBlocks.TARTARUS_STONE_BUTTON.get(),
                ModBlocks.TARTARUS_STONE_PRESSURE_PLATE.get(),
                ModBlocks.TARTARUS_STONE_WALL.get(),
                ModBlocks.TARTARUS_STONE_COBBLESTONE_WALL.get(),
                ModBlocks.TARTARUS_STONE_BRICKS_WALL.get()
        );

        /*
         * WOOD TYPES
         */
        //Elder Wood
        createWoodRecipes(pWriter, "elder_wood", ModTags.Blocks.ELDER_WOOD_LOGS, ModTags.Blocks.ELDER_WOOD_STRIPPED_LOGS, ModBlocks.ELDER_WOOD_PLANKS.get(),
                ModBlocks.ELDER_WOOD_PLANKS_STAIRS.get(), ModBlocks.ELDER_WOOD_PLANKS_SLAB.get(), ModBlocks.ELDER_WOOD_PLANKS_FENCE.get(),
                ModBlocks.ELDER_WOOD_PLANKS_FENCE_GATE.get(), ModBlocks.ELDER_WOOD_PLANKS_DOOR.get(), ModBlocks.ELDER_WOOD_PLANKS_TRAPDOOR.get(),
                ModBlocks.ELDER_WOOD_PLANKS_PRESSURE_PLATE.get(), ModBlocks.ELDER_WOOD_PLANKS_BUTTON.get(), ModItems.ELDER_WOOD_SIGN.get(), ModItems.ELDER_WOOD_HANGING_SIGN.get());
        //Olive
        createWoodRecipes(pWriter, "olive", ModTags.Blocks.OLIVE_LOGS, ModTags.Blocks.OLIVE_STRIPPED_LOGS, ModBlocks.OLIVE_PLANKS.get(),
                ModBlocks.OLIVE_PLANKS_STAIRS.get(), ModBlocks.OLIVE_PLANKS_SLAB.get(), ModBlocks.OLIVE_PLANKS_FENCE.get(),
                ModBlocks.OLIVE_PLANKS_FENCE_GATE.get(), ModBlocks.OLIVE_PLANKS_DOOR.get(), ModBlocks.OLIVE_PLANKS_TRAPDOOR.get(),
                ModBlocks.OLIVE_PLANKS_PRESSURE_PLATE.get(), ModBlocks.OLIVE_PLANKS_BUTTON.get(), ModItems.OLIVE_SIGN.get(), ModItems.OLIVE_HANGING_SIGN.get());
        //Myrrh
        createWoodRecipes(pWriter, "myrrh", ModTags.Blocks.MYRRH_LOGS, ModTags.Blocks.MYRRH_STRIPPED_LOGS, ModBlocks.MYRRH_PLANKS.get(),
                ModBlocks.MYRRH_PLANKS_STAIRS.get(), ModBlocks.MYRRH_PLANKS_SLAB.get(), ModBlocks.MYRRH_PLANKS_FENCE.get(),
                ModBlocks.MYRRH_PLANKS_FENCE_GATE.get(), ModBlocks.MYRRH_PLANKS_DOOR.get(), ModBlocks.MYRRH_PLANKS_TRAPDOOR.get(),
                ModBlocks.MYRRH_PLANKS_PRESSURE_PLATE.get(), ModBlocks.MYRRH_PLANKS_BUTTON.get(), ModItems.MYRRH_SIGN.get(), ModItems.MYRRH_HANGING_SIGN.get());
        //Laurel
        createWoodRecipes(pWriter, "laurel", ModTags.Blocks.LAUREL_LOGS, ModTags.Blocks.LAUREL_STRIPPED_LOGS, ModBlocks.LAUREL_PLANKS.get(),
                ModBlocks.LAUREL_PLANKS_STAIRS.get(), ModBlocks.LAUREL_PLANKS_SLAB.get(), ModBlocks.LAUREL_PLANKS_FENCE.get(),
                ModBlocks.LAUREL_PLANKS_FENCE_GATE.get(), ModBlocks.LAUREL_PLANKS_DOOR.get(), ModBlocks.LAUREL_PLANKS_TRAPDOOR.get(),
                ModBlocks.LAUREL_PLANKS_PRESSURE_PLATE.get(), ModBlocks.LAUREL_PLANKS_BUTTON.get(), ModItems.LAUREL_SIGN.get(), ModItems.LAUREL_HANGING_SIGN.get());
        //Cypress
        createWoodRecipes(pWriter, "cypress", ModTags.Blocks.CYPRESS_LOGS, ModTags.Blocks.CYPRESS_STRIPPED_LOGS, ModBlocks.CYPRESS_PLANKS.get(),
                ModBlocks.CYPRESS_PLANKS_STAIRS.get(), ModBlocks.CYPRESS_PLANKS_SLAB.get(), ModBlocks.CYPRESS_PLANKS_FENCE.get(),
                ModBlocks.CYPRESS_PLANKS_FENCE_GATE.get(), ModBlocks.CYPRESS_PLANKS_DOOR.get(), ModBlocks.CYPRESS_PLANKS_TRAPDOOR.get(),
                ModBlocks.CYPRESS_PLANKS_PRESSURE_PLATE.get(), ModBlocks.CYPRESS_PLANKS_BUTTON.get(), ModItems.CYPRESS_SIGN.get(), ModItems.CYPRESS_HANGING_SIGN.get());

        /*
        COOKING
         */
        createSmokingRecipes(pWriter, ModItems.CLOWNFISH.get(), ModItems.COOKED_CLOWNFISH.get());
        createSmokingRecipes(pWriter, ModItems.RAW_TUNA.get(), ModItems.COOKED_TUNA.get());
        createSmokingRecipes(pWriter, ModItems.TANG_FISH.get(), ModItems.COOKED_TANG_FISH.get());

        /*
        SMELTING
         */
//        createSmeltingRecipes(pWriter, ModBlocks.NIDAVELLIR_SOFT_COBBLESTONE.get(), ModBlocks.NIDAVELLIR_SOFT_STONE.get());
//        createSmeltingRecipes(pWriter, ModBlocks.NIDAVELLIR_HARD_COBBLESTONE.get(), ModBlocks.NIDAVELLIR_HARD_STONE.get());
//        createSmeltingRecipes(pWriter, ModBlocks.NIDAVELLIR_ENHANCED_COBBLESTONE.get(), ModBlocks.NIDAVELLIR_ENHANCED_STONE.get());
//        createSmeltingRecipes(pWriter, ModBlocks.NIDAVELLIR_DEEPSLATE_COBBLESTONE.get(), ModBlocks.NIDAVELLIR_DEEPSLATE_STONE.get());
//        createSmeltingRecipes(pWriter, ModBlocks.NIDAVELLIR_CRIMSON_COBBLESTONE.get(), ModBlocks.NIDAVELLIR_CRIMSON_STONE.get());

        /*
        CRAFTING
         */
        //Portal Core
        craftPortalCore(pWriter, ModItems.BASIC_PORTAL_CORE.get(), Items.ENDER_EYE, Items.BLAZE_POWDER);
        
        //Portal Activator
        craftPortalActivator(pWriter, ModItems.BASIC_PORTAL_ACTIVATOR.get(), ModItems.BASIC_PORTAL_CORE.get());
        
        //Portal Frames
        craftPortalFrame(pWriter, ModBlocks.UNDERWORLD_PORTAL_FRAME.get(), ModItems.BASIC_PORTAL_CORE.get(), Blocks.OBSIDIAN, ModItems.POMEGRANATE.get());
        craftPortalFrame(pWriter, ModBlocks.ALFHEIMR_PORTAL_FRAME.get(), ModItems.BASIC_PORTAL_CORE.get(), ItemTags.LOGS, Items.ENDER_PEARL);
        craftPortalFrame(pWriter, ModBlocks.NIDAVELLIR_PORTAL_FRAME.get(), ModItems.BASIC_PORTAL_CORE.get(), Blocks.OBSIDIAN, ItemTags.STONE_BRICKS);
        craftPortalFrame(pWriter, ModBlocks.ATLANTIS_PORTAL_FRAME.get(), ModItems.BASIC_PORTAL_CORE.get(), Blocks.LAPIS_BLOCK, Items.WATER_BUCKET);
        craftPortalFrame(pWriter, ModBlocks.SKYOPIA_PORTAL_FRAME.get(), ModItems.BASIC_PORTAL_CORE.get(), Blocks.OBSIDIAN, Items.FEATHER);
    }

    private void createBlastingRecipes(Consumer<FinishedRecipe> pWriter, Block pIngredient, Item pResult) {
        SimpleCookingRecipeBuilder.generic(Ingredient.of(pIngredient), RecipeCategory.BUILDING_BLOCKS, pResult, 0.25f, 200, RecipeSerializer.SMELTING_RECIPE)
                .group(null)
                .unlockedBy(getHasName(pIngredient), has(pIngredient))
                .save(pWriter, LostWorldsConstants.MODID + ":" + getItemName(pResult) + "_" + "smelting_from" + "_" + getItemName(pIngredient));

        SimpleCookingRecipeBuilder.generic(Ingredient.of(pIngredient), RecipeCategory.BUILDING_BLOCKS, pResult, 0.25f, 100, RecipeSerializer.BLASTING_RECIPE)
                .group(null)
                .unlockedBy(getHasName(pIngredient), has(pIngredient))
                .save(pWriter, LostWorldsConstants.MODID + ":" + getItemName(pResult) + "_" + "blasting_from" + "_" + getItemName(pIngredient));
    }

    private void createAlloyRecipes(Consumer<FinishedRecipe> pWriter, String brass, Item ingredient1, Item ingredient2, Item outPutItem, Block block, Item nugget) {
        createAlloy(pWriter, ingredient1, ingredient2, outPutItem, 1);
        nineBlockStorageRecipesForMetals(pWriter, outPutItem, block);
        nineBlockStorageRecipesForMetals(pWriter, nugget, outPutItem);
    }

    private void createAlloy(Consumer<FinishedRecipe> pWriter, Item ingredient1, Item ingredient2, Item outPutItem, int count) {
        new AlloySmelterRecipeBuilder(ingredient1, ingredient2, outPutItem, count)
                .unlockedBy("has_brass_alloy_base", has(ingredient1)).save(pWriter);
    }

    private static void createWoodRecipes(Consumer<FinishedRecipe> pWriter, String pName, TagKey<Block> pLog, TagKey<Block> pStrippedLog, Block pPlank,Block pStair, Block pSlab, Block pFence,
                                          Block pGate, Block pDoor, Block pTrap, Block pPlate, Block pButton, ItemLike pSign, ItemLike pHangingSign) {
        //Planks
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, pPlank, 4)
                .requires(ModTags.getItemTag(pLog)).unlockedBy("has_" + pName, inventoryTrigger(ItemPredicate.Builder.item().of(ModTags.getItemTag(pLog)).build()))
                .save(pWriter);

        //Stairs
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, pStair, 4)
                .pattern("A  ")
                .pattern("AA ")
                .pattern("AAA")
                .define('A', pPlank)
                .unlockedBy("has_" + pName, inventoryTrigger(ItemPredicate.Builder.item().of(pPlank).build()))
                .save(pWriter);

        //Slab
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, pSlab, 6)
                .pattern("AAA")
                .define('A', pPlank)
                .unlockedBy("has_" + pName, inventoryTrigger(ItemPredicate.Builder.item().of(pPlank).build()))
                .save(pWriter);

        //Fence
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, pFence, 3)
                .pattern("ABA")
                .pattern("ABA")
                .define('A', pPlank)
                .define('B', Items.STICK)
                .unlockedBy("has_" + pName, inventoryTrigger(ItemPredicate.Builder.item().of(pPlank).build()))
                .save(pWriter);

        //Gate
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, pGate, 1)
                .pattern("ABA")
                .pattern("ABA")
                .define('A', Items.STICK)
                .define('B', pPlank)
                .unlockedBy("has_" + pName, inventoryTrigger(ItemPredicate.Builder.item().of(pPlank).build()))
                .save(pWriter);

        //Door
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, pDoor, 3)
                .pattern("AA")
                .pattern("AA")
                .pattern("AA")
                .define('A', pPlank)
                .unlockedBy("has_" + pName, inventoryTrigger(ItemPredicate.Builder.item().of(pPlank).build()))
                .save(pWriter);

        //Trapdoor
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, pTrap, 2)
                .pattern("AAA")
                .pattern("AAA")
                .define('A', pPlank)
                .unlockedBy("has_" + pName, inventoryTrigger(ItemPredicate.Builder.item().of(pPlank).build()))
                .save(pWriter);

        //Pressureplate
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, pPlate, 1)
                .pattern("AA")
                .define('A', pPlank)
                .unlockedBy("has_" + pName, inventoryTrigger(ItemPredicate.Builder.item().of(pPlank).build()))
                .save(pWriter);

        //Button
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, pButton, 1)
                .requires(pPlank)
                .unlockedBy("has_" + pName, inventoryTrigger(ItemPredicate.Builder.item().of(pPlank).build()))
                .save(pWriter);

        //Sign
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, pSign, 3)
                .pattern("AAA")
                .pattern("AAA")
                .pattern(" B ")
                .define('A', pPlank)
                .define('B', Items.STICK)
                .unlockedBy("has_" + pName, inventoryTrigger(ItemPredicate.Builder.item().of(pPlank).build()))
                .save(pWriter);

        //Hanging Sign
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, pHangingSign, 6)
                .pattern("B B")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModTags.getItemTag(pStrippedLog))
                .define('B', Blocks.CHAIN)
                .unlockedBy("has_" + pName, inventoryTrigger(ItemPredicate.Builder.item().of(pPlank).build()))
                .save(pWriter);
    }

    private static void createStoneGeoRecipes(Consumer<FinishedRecipe> pWriter, Block stone, Block stone_stairs, Block stone_slab,
                                              Block cobble, Block cobble_stairs, Block cobble_slab, Block bricks, Block brick_stairs,
                                              Block brick_slab, Block button, Block pressure_plate,
                                              Block wall, Block cobble_wall, Block stone_wall) {
        String name = stone.getName().toString();

        createStoneRecipes(pWriter, name, stone, stone_stairs, stone_slab);
        createStoneRecipes(pWriter, name + "_cobble", cobble, cobble_stairs, cobble_slab);
        createStoneRecipes(pWriter, name + "_bricks", bricks, brick_stairs, brick_slab);

        createWallRecipe(pWriter, stone, wall);
        createWallRecipe(pWriter, cobble, cobble_wall);
        createWallRecipe(pWriter, bricks, stone_wall);

        oreSmelting(pWriter, cobble, RecipeCategory.MISC, stone, 0, 200, name);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, bricks, 4)
                .pattern("AA")
                .pattern("AA")
                .define('A', stone)
                .unlockedBy("has_" + name, inventoryTrigger(ItemPredicate.Builder.item().of(stone).build()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, button)
                .requires(stone)
                .unlockedBy("has_" + name, inventoryTrigger(ItemPredicate.Builder.item().of(stone).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, pressure_plate)
                .pattern("AA")
                .define('A', stone)
                .unlockedBy("has_" + name, inventoryTrigger(ItemPredicate.Builder.item().of(stone).build()))
                .save(pWriter);
    }

    private static void createWallRecipe(Consumer<FinishedRecipe> pWriter, Block stone, Block wall) {
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, wall, 6)
                .pattern("AAA")
                .pattern("AAA")
                .define('A', stone)
                .unlockedBy(stone.getName().toString() + "_to_" + wall.getName().toString(), inventoryTrigger(ItemPredicate.Builder.item().of(stone).build()))
                .save(pWriter);
    }

    private static void createStoneRecipes(Consumer<FinishedRecipe> pWriter, String name, Block sStone, Block sStairs, Block sSlab) {
        //slab(pWriter, RecipeCategory.BUILDING_BLOCKS, sSlab, sStone);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, sStairs, 4)
                .pattern("A  ")
                .pattern("AA ")
                .pattern("AAA")
                .define('A', sStone)
                .unlockedBy("has_" + name, inventoryTrigger(ItemPredicate.Builder.item().of(sStone).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, sSlab, 3)
                .pattern("AAA")
                .define('A', sStone)
                .unlockedBy("has_" + name, inventoryTrigger(ItemPredicate.Builder.item().of(sStone).build()))
                .save(pWriter);
    }

    private static void createOreRecipes(Consumer<FinishedRecipe> pWriter, String name, List<ItemLike> cookingIngredients, Item ingot, Block ingot_block, Item raw, Block raw_block, Item nugget) {
        nineBlockStorageRecipesForMetals(pWriter, ingot, ingot_block);
        nineBlockStorageRecipesForMetals(pWriter, raw, raw_block);
        nineBlockStorageRecipesForMetals(pWriter, nugget, ingot);

        oreSmelting(pWriter, cookingIngredients, RecipeCategory.MISC, ingot, 0.25f, 200, name);
        oreBlasting(pWriter, cookingIngredients, RecipeCategory.MISC, ingot, 0.25f, 100, name);
    }

    private static void createTools(Consumer<FinishedRecipe> pWriter, String name, Item ingot,
                                    Item pickaxe, Item shovel, Item axe, Item sword, Item hoe,
                                    Item helmet, Item chestplate, Item leggings, Item boots) {
        //Pickaxe
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, pickaxe)
                .pattern("AAA")
                .pattern(" S ")
                .pattern(" S ")
                .define('A', ingot)
                .define('S', Items.STICK)
                .unlockedBy("has_" + name, inventoryTrigger(ItemPredicate.Builder.item().of(pickaxe).build()))
                .save(pWriter);

        //Shovel
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, shovel)
                .pattern("A")
                .pattern("S")
                .pattern("S")
                .define('A', ingot)
                .define('S', Items.STICK)
                .unlockedBy("has_" + name, inventoryTrigger(ItemPredicate.Builder.item().of(shovel).build()))
                .save(pWriter);

        //Axe
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, axe)
                .pattern("AA")
                .pattern("AS")
                .pattern(" S")
                .define('A', ingot)
                .define('S', Items.STICK)
                .unlockedBy("has_" + name, inventoryTrigger(ItemPredicate.Builder.item().of(axe).build()))
                .save(pWriter);

        //Sword
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, sword)
                .pattern("A")
                .pattern("A")
                .pattern("S")
                .define('A', ingot)
                .define('S', Items.STICK)
                .unlockedBy("has_" + name, inventoryTrigger(ItemPredicate.Builder.item().of(sword).build()))
                .save(pWriter);

        //Hoe
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, hoe)
                .pattern("AA")
                .pattern(" S")
                .pattern(" S")
                .define('A', ingot)
                .define('S', Items.STICK)
                .unlockedBy("has_" + name, inventoryTrigger(ItemPredicate.Builder.item().of(hoe).build()))
                .save(pWriter);

        //Helmet
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, helmet)
                .pattern("AAA")
                .pattern("A A")
                .define('A', ingot)
                .unlockedBy("has_" + name, inventoryTrigger(ItemPredicate.Builder.item().of(helmet).build()))
                .save(pWriter);

        //Chestplate
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, chestplate)
                .pattern("A A")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ingot)
                .unlockedBy("has_" + name, inventoryTrigger(ItemPredicate.Builder.item().of(chestplate).build()))
                .save(pWriter);

        //Leggings
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, leggings)
                .pattern("AAA")
                .pattern("A A")
                .pattern("A A")
                .define('A', ingot)
                .unlockedBy("has_" + name, inventoryTrigger(ItemPredicate.Builder.item().of(leggings).build()))
                .save(pWriter);

        //Boots
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, boots)
                .pattern("A A")
                .pattern("A A")
                .define('A', ingot)
                .unlockedBy("has_" + name, inventoryTrigger(ItemPredicate.Builder.item().of(boots).build()))
                .save(pWriter);
    }

    /**
     * This function simplifies crafting the portal frames.
     * @param pWriter Connect recipe to writer
     * @param pResult What portal frame is this making?
     * @param pFrame What block is the frame of this portal block.
     * @param pEssence What block/item is the essence of the dimension we want to access.
     */
    protected static void craftPortalFrame(Consumer<FinishedRecipe> pWriter, ItemLike pResult, ItemLike pPortalCore, ItemLike pFrame, ItemLike pEssence) {
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, pResult)
                .pattern("FSF")
                .pattern("SES")
                .pattern("FSF")
                .define('E', pPortalCore)
                .define('F', pFrame)
                .define('S', pEssence)
                .unlockedBy("has_" + getItemName(pPortalCore), inventoryTrigger(ItemPredicate.Builder.item().of(pResult).build()))
                .save(pWriter);
    }

    /**
     * This function simplifies crafting the portal activator.
     * @param pWriter Connect recipe to writer
     * @param pResult What tier is the portal activator that this is making?
     * @param pPortalCore What core tier is this portal activator.
     */
    protected static void craftPortalActivator(Consumer<FinishedRecipe> pWriter, ItemLike pResult, ItemLike pPortalCore) {
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, pResult)
                .pattern("E")
                .pattern("F")
                .pattern("F")
                .define('E', pPortalCore)
                .define('F', Items.BLAZE_ROD)
                .unlockedBy("has_" + getItemName(pPortalCore), inventoryTrigger(ItemPredicate.Builder.item().of(pResult).build()))
                .save(pWriter);
    }

    /**
     * This function simplifies crafting the portal core.
     * @param pWriter Connect recipe to writer
     * @param pResult What tier for the portal core is this making?
     * @param pPortalCore The core ingredient that defines the tier of the core.
     * @param pPortalEssence The essence to upgrade the tier of the core.
     */
    protected static void craftPortalCore(Consumer<FinishedRecipe> pWriter, ItemLike pResult, ItemLike pPortalCore, ItemLike pPortalEssence) {
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, pResult)
                .pattern("FFF")
                .pattern("FEF")
                .pattern("FFF")
                .define('E', pPortalCore)
                .define('F', pPortalEssence)
                .unlockedBy("has_" + getItemName(pPortalCore), inventoryTrigger(ItemPredicate.Builder.item().of(pResult).build()))
                .save(pWriter);
    }

    /**
     * This function simplifies crafting the portal core.
     * @param pWriter Connect recipe to writer
     * @param pResult What tier for the portal core is this making?
     * @param pPortalCore The core ingredient that defines the tier of the core.
     * @param pPortalEssence The essence to upgrade the tier of the core.
     */
    protected static void craftPortalCore(Consumer<FinishedRecipe> pWriter, ItemLike pResult, ItemLike pPortalCore, TagKey<Item> pPortalEssence) {
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, pResult)
                .pattern("FFF")
                .pattern("FEF")
                .pattern("FFF")
                .define('E', pPortalCore)
                .define('F', pPortalEssence)
                .unlockedBy("has_" + getItemName(pPortalCore), inventoryTrigger(ItemPredicate.Builder.item().of(pResult).build()))
                .save(pWriter);
    }

    /**
     * This function simplifies crafting the portal frames.
     * @param pWriter Connect recipe to writer
     * @param pResult What portal frame is this making?
     * @param pFrame What block is the frame of this portal block.
     * @param pEssence What block/item is the essence of the dimension we want to access.
     */
    protected static void craftPortalFrame(Consumer<FinishedRecipe> pWriter, ItemLike pResult, ItemLike pPortalCore, TagKey<Item> pFrame, ItemLike pEssence) {
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, pResult)
                .pattern("FSF")
                .pattern("SES")
                .pattern("FSF")
                .define('E', pPortalCore)
                .define('F', pFrame)
                .define('S', pEssence)
                .unlockedBy("has_" + getItemName(pPortalCore), inventoryTrigger(ItemPredicate.Builder.item().of(pResult).build()))
                .save(pWriter);
    }

    /**
     * This function simplifies crafting the portal frames.
     * @param pWriter Connect recipe to writer
     * @param pResult What portal frame is this making?
     * @param pFrame What block is the frame of this portal block.
     * @param pEssence What block/item is the essence of the dimension we want to access.
     */
    protected static void craftPortalFrame(Consumer<FinishedRecipe> pWriter, ItemLike pResult, ItemLike pPortalCore, ItemLike pFrame, TagKey<Item> pEssence) {
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, pResult)
                .pattern("FSF")
                .pattern("SES")
                .pattern("FSF")
                .define('E', pPortalCore)
                .define('F', pFrame)
                .define('S', pEssence)
                .unlockedBy("has_" + getItemName(pPortalCore), inventoryTrigger(ItemPredicate.Builder.item().of(pResult).build()))
                .save(pWriter);
    }

    /**
     * This function simplifies crafting the portal frames.
     * @param pWriter Connect recipe to writer
     * @param pResult What portal frame is this making?
     * @param pFrame What block is the frame of this portal block.
     * @param pEssence What block/item is the essence of the dimension we want to access.
     */
    protected static void craftPortalFrame(Consumer<FinishedRecipe> pWriter, ItemLike pResult, ItemLike pPortalCore, TagKey<Item> pFrame, TagKey<Item> pEssence) {
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, pResult)
                .pattern("FSF")
                .pattern("SES")
                .pattern("FSF")
                .define('E', pPortalCore)
                .define('F', pFrame)
                .define('S', pEssence)
                .unlockedBy("has_" + getItemName(pPortalCore), inventoryTrigger(ItemPredicate.Builder.item().of(pResult).build()))
                .save(pWriter);
    }

    protected static void nineBlockStorageRecipesForMetals(Consumer<FinishedRecipe> pWriter, Item item, Block block) {
        nineBlockStorageRecipes(pWriter, RecipeCategory.MISC, item, RecipeCategory.MISC, block,
                LostWorldsConstants.MODID + ":" + getItemName(item) + "_from_block", null,
                LostWorldsConstants.MODID + ":" + getItemName(block), null);
    }

    protected static void nineBlockStorageRecipesForMetals(Consumer<FinishedRecipe> pWriter, Item item, Item outputItem) {
        nineBlockStorageRecipes(pWriter, RecipeCategory.MISC, item, RecipeCategory.MISC, outputItem,
                LostWorldsConstants.MODID + ":" + getItemName(item), null,
                LostWorldsConstants.MODID + ":" + getItemName(outputItem) + "_from_nugget", null);
    }

    protected static void oreSmelting(Consumer<FinishedRecipe> pFinishedRecipeConsumer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult,
                                      float pExperience, int pCookingTIme, String pGroup) {
        oreCooking(pFinishedRecipeConsumer, RecipeSerializer.SMELTING_RECIPE, pIngredients, pCategory, pResult,
                pExperience, pCookingTIme, pGroup, "_from_smelting");
    }

    protected static void oreSmelting(Consumer<FinishedRecipe> pFinishedRecipeConsumer, ItemLike pIngredients, RecipeCategory pCategory, ItemLike pResult,
                                      float pExperience, int pCookingTIme, String pGroup) {
        oreCooking(pFinishedRecipeConsumer, RecipeSerializer.SMELTING_RECIPE, pIngredients, pCategory, pResult,
                pExperience, pCookingTIme, pGroup, "_from_smelting");
    }

    protected static void oreBlasting(Consumer<FinishedRecipe> pFinishedRecipeConsumer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult,
                                      float pExperience, int pCookingTime, String pGroup) {
        oreCooking(pFinishedRecipeConsumer, RecipeSerializer.BLASTING_RECIPE, pIngredients, pCategory, pResult,
                pExperience, pCookingTime, pGroup, "_from_blasting");
    }

    protected static void oreCooking(Consumer<FinishedRecipe> pFinishedRecipeConsumer, RecipeSerializer<? extends AbstractCookingRecipe> pCookingSerializer,
                                     List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime,
                                     String pGroup, String pRecipeName) {
        for(ItemLike itemlike : pIngredients) {
            SimpleCookingRecipeBuilder.generic(Ingredient.of(itemlike), pCategory, pResult, pExperience, pCookingTime,
                    pCookingSerializer).group(pGroup).unlockedBy(getHasName(itemlike), has(itemlike))
                    .save(pFinishedRecipeConsumer, LostWorldsConstants.MODID + ":" + getItemName(pResult) + pRecipeName + "_" + getItemName(itemlike));
        }

    }

    private static void createSmokingRecipes(Consumer<FinishedRecipe> pWriter, Item pIngredient, Item pResult) {
        SimpleCookingRecipeBuilder.generic(Ingredient.of(pIngredient), RecipeCategory.FOOD, pResult, 0.25f, 200, RecipeSerializer.SMOKING_RECIPE)
                .group(null)
                .unlockedBy(getHasName(pIngredient), has(pIngredient))
                .save(pWriter, LostWorldsConstants.MODID + ":" + getItemName(pResult) + "_" + "cooked_from" + "_" + getItemName(pIngredient));
    }

    private static void createSmeltingRecipes(Consumer<FinishedRecipe> pWriter, ItemLike pIngredient, ItemLike pResult) {
        SimpleCookingRecipeBuilder.generic(Ingredient.of(pIngredient), RecipeCategory.BUILDING_BLOCKS, pResult, 0.25f, 200, RecipeSerializer.SMELTING_RECIPE)
                .group(null)
                .unlockedBy(getHasName(pIngredient), has(pIngredient))
                .save(pWriter, LostWorldsConstants.MODID + ":" + getItemName(pResult) + "_" + "smelting_from" + "_" + getItemName(pIngredient));
    }

    protected static void oreCooking(Consumer<FinishedRecipe> pFinishedRecipeConsumer, RecipeSerializer<? extends AbstractCookingRecipe> pCookingSerializer,
                                     ItemLike pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime,
                                     String pGroup, String pRecipeName) {

        SimpleCookingRecipeBuilder.generic(Ingredient.of(pIngredients), pCategory, pResult, pExperience, pCookingTime,
                    pCookingSerializer).group(pGroup).unlockedBy(getHasName(pIngredients), has(pIngredients))
                    .save(pFinishedRecipeConsumer, LostWorldsConstants.MODID + ":" + getItemName(pResult) + pRecipeName + "_" + getItemName(pIngredients));
    }
}
