package net.sen.lostworlds.datagen.recipes;

import net.minecraft.advancements.critereon.ItemPredicate;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.tags.FluidTags;
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
import net.neoforged.neoforge.common.conditions.IConditionBuilder;
import net.sen.lostworlds.api.LostWorldsApi;
import net.sen.lostworlds.registry.items.AlfheimrItems;
import net.sen.lostworlds.registry.items.AtlantisItems;
import net.sen.lostworlds.registry.items.ModItems;
import net.sen.lostworlds.registry.items.UnderworldItems;
import net.sen.lostworlds.recipe.transform.TransformCircumstance;
import net.sen.lostworlds.registry.blocks.*;
import net.sen.lostworlds.util.ModTags;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    private List<ItemLike> ZINC_SMELTABLES = List.of(ModItems.RAW_ZINC.get(), ModBlocks.ZINC_ORE.get(), ModBlocks.DEEPSLATE_ZINC_ORE.get());
    private List<ItemLike> TIN_SMELTABLES = List.of(ModItems.RAW_TIN.get(), ModBlocks.TIN_ORE.get(), ModBlocks.DEEPSLATE_TIN_ORE.get());
    private List<ItemLike> ORICHALCUM_SMELTABLES = List.of(UnderworldItems.RAW_ORICHALCUM.get(), UnderworldBlocks.ORICHALCUM_ORE.get(), UnderworldBlocks.DEEPSLATE_ORICHALCUM_ORE.get());

    public ModRecipeProvider(PackOutput pOutput, CompletableFuture<HolderLookup.Provider> registries) {
        super(pOutput, registries);
    }

    @Override
    protected void buildRecipes(RecipeOutput pRecipeOutput) {
        miscRecipes(pRecipeOutput);
        stoneRecipes(pRecipeOutput);
        foodRecipes(pRecipeOutput);
        metalRecipes(pRecipeOutput);
        woodRecipes(pRecipeOutput);
//        alloyRecipes(pRecipeOutput);
        flowerRecipes(pRecipeOutput);
        transformRecipes(pRecipeOutput);
    }

    public void miscRecipes(RecipeOutput pRecipeOutput) {
        //Portal Core
        craftPortalCore(pRecipeOutput, ModItems.BASIC_PORTAL_CORE.get(), Items.ENDER_EYE, Items.BLAZE_POWDER);

        //Portal Activator
        craftPortalActivator(pRecipeOutput, ModItems.BASIC_PORTAL_ACTIVATOR.get(), ModItems.BASIC_PORTAL_CORE.get());

        //Portal Frames
        craftPortalFrame(pRecipeOutput, UnderworldBlocks.UNDERWORLD_PORTAL_FRAME.get(), ModItems.BASIC_PORTAL_CORE.get(), Blocks.OBSIDIAN, UnderworldItems.POMEGRANATE.get());
        craftPortalFrame(pRecipeOutput, AlfheimrBlocks.ALFHEIMR_PORTAL_FRAME.get(), ModItems.BASIC_PORTAL_CORE.get(), ItemTags.LOGS, Items.ENDER_PEARL);
        craftPortalFrame(pRecipeOutput, NidavellirBlocks.NIDAVELLIR_PORTAL_FRAME.get(), ModItems.BASIC_PORTAL_CORE.get(), Blocks.OBSIDIAN, ItemTags.STONE_BRICKS);
        craftPortalFrame(pRecipeOutput, AtlantisBlocks.ATLANTIS_PORTAL_FRAME.get(), ModItems.BASIC_PORTAL_CORE.get(), Blocks.LAPIS_BLOCK, Items.WATER_BUCKET);
        craftPortalFrame(pRecipeOutput, SkyopiaBlocks.SKYOPIA_PORTAL_FRAME.get(), ModItems.BASIC_PORTAL_CORE.get(), Blocks.OBSIDIAN, Items.FEATHER);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Blocks.COBBLESTONE, 1)
                .pattern("AA")
                .pattern("AA")
                .define('A', ModBlocks.ROCK_DECOR.get())
                .unlockedBy("has_" + BuiltInRegistries.BLOCK.getKey(ModBlocks.ROCK_DECOR.get()).getNamespace(),
                        inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.ROCK_DECOR.get()).build()))
                .save(pRecipeOutput);
    }
    public void stoneRecipes(RecipeOutput pRecipeOutput) {
        createStoneGeoRecipes(pRecipeOutput,
                NidavellirBlocks.NIDAVELLIR_SOFT_STONE.get(),
                NidavellirBlocks.NIDAVELLIR_SOFT_STONE_STAIRS.get(),
                NidavellirBlocks.NIDAVELLIR_SOFT_STONE_SLAB.get(),
                NidavellirBlocks.NIDAVELLIR_SOFT_COBBLESTONE.get(),
                NidavellirBlocks.NIDAVELLIR_SOFT_COBBLESTONE_STAIRS.get(),
                NidavellirBlocks.NIDAVELLIR_SOFT_COBBLESTONE_SLAB.get(),
                NidavellirBlocks.NIDAVELLIR_SOFT_STONE_BRICKS.get(),
                NidavellirBlocks.NIDAVELLIR_SOFT_STONE_BRICKS_STAIRS.get(),
                NidavellirBlocks.NIDAVELLIR_SOFT_STONE_BRICKS_SLAB.get(),
                NidavellirBlocks.NIDAVELLIR_SOFT_STONE_BUTTON.get(),
                NidavellirBlocks.NIDAVELLIR_SOFT_STONE_PRESSURE_PLATE.get(),
                NidavellirBlocks.NIDAVELLIR_SOFT_STONE_WALL.get(),
                NidavellirBlocks.NIDAVELLIR_SOFT_COBBLESTONE_WALL.get(),
                NidavellirBlocks.NIDAVELLIR_SOFT_STONE_BRICKS_WALL.get()
        );

        createStoneGeoRecipes(pRecipeOutput,
                NidavellirBlocks.NIDAVELLIR_HARD_STONE.get(),
                NidavellirBlocks.NIDAVELLIR_HARD_STONE_STAIRS.get(),
                NidavellirBlocks.NIDAVELLIR_HARD_STONE_SLAB.get(),
                NidavellirBlocks.NIDAVELLIR_HARD_COBBLESTONE.get(),
                NidavellirBlocks.NIDAVELLIR_HARD_COBBLESTONE_STAIRS.get(),
                NidavellirBlocks.NIDAVELLIR_HARD_COBBLESTONE_SLAB.get(),
                NidavellirBlocks.NIDAVELLIR_HARD_STONE_BRICKS.get(),
                NidavellirBlocks.NIDAVELLIR_HARD_STONE_BRICKS_STAIRS.get(),
                NidavellirBlocks.NIDAVELLIR_HARD_STONE_BRICKS_SLAB.get(),
                NidavellirBlocks.NIDAVELLIR_HARD_STONE_BUTTON.get(),
                NidavellirBlocks.NIDAVELLIR_HARD_STONE_PRESSURE_PLATE.get(),
                NidavellirBlocks.NIDAVELLIR_HARD_STONE_WALL.get(),
                NidavellirBlocks.NIDAVELLIR_HARD_COBBLESTONE_WALL.get(),
                NidavellirBlocks.NIDAVELLIR_HARD_STONE_BRICKS_WALL.get()
        );

        createStoneGeoRecipes(pRecipeOutput,
                NidavellirBlocks.NIDAVELLIR_ENHANCED_STONE.get(),
                NidavellirBlocks.NIDAVELLIR_ENHANCED_STONE_STAIRS.get(),
                NidavellirBlocks.NIDAVELLIR_ENHANCED_STONE_SLAB.get(),
                NidavellirBlocks.NIDAVELLIR_ENHANCED_COBBLESTONE.get(),
                NidavellirBlocks.NIDAVELLIR_ENHANCED_COBBLESTONE_STAIRS.get(),
                NidavellirBlocks.NIDAVELLIR_ENHANCED_COBBLESTONE_SLAB.get(),
                NidavellirBlocks.NIDAVELLIR_ENHANCED_STONE_BRICKS.get(),
                NidavellirBlocks.NIDAVELLIR_ENHANCED_STONE_BRICKS_STAIRS.get(),
                NidavellirBlocks.NIDAVELLIR_ENHANCED_STONE_BRICKS_SLAB.get(),
                NidavellirBlocks.NIDAVELLIR_ENHANCED_STONE_BUTTON.get(),
                NidavellirBlocks.NIDAVELLIR_ENHANCED_STONE_PRESSURE_PLATE.get(),
                NidavellirBlocks.NIDAVELLIR_ENHANCED_STONE_WALL.get(),
                NidavellirBlocks.NIDAVELLIR_ENHANCED_COBBLESTONE_WALL.get(),
                NidavellirBlocks.NIDAVELLIR_ENHANCED_STONE_BRICKS_WALL.get()
        );

        createStoneGeoRecipes(pRecipeOutput,
                NidavellirBlocks.NIDAVELLIR_DEEPSLATE_STONE.get(),
                NidavellirBlocks.NIDAVELLIR_DEEPSLATE_STONE_STAIRS.get(),
                NidavellirBlocks.NIDAVELLIR_DEEPSLATE_STONE_SLAB.get(),
                NidavellirBlocks.NIDAVELLIR_DEEPSLATE_COBBLESTONE.get(),
                NidavellirBlocks.NIDAVELLIR_DEEPSLATE_COBBLESTONE_STAIRS.get(),
                NidavellirBlocks.NIDAVELLIR_DEEPSLATE_COBBLESTONE_SLAB.get(),
                NidavellirBlocks.NIDAVELLIR_DEEPSLATE_STONE_BRICKS.get(),
                NidavellirBlocks.NIDAVELLIR_DEEPSLATE_STONE_BRICKS_STAIRS.get(),
                NidavellirBlocks.NIDAVELLIR_DEEPSLATE_STONE_BRICKS_SLAB.get(),
                NidavellirBlocks.NIDAVELLIR_DEEPSLATE_STONE_BUTTON.get(),
                NidavellirBlocks.NIDAVELLIR_DEEPSLATE_STONE_PRESSURE_PLATE.get(),
                NidavellirBlocks.NIDAVELLIR_DEEPSLATE_STONE_WALL.get(),
                NidavellirBlocks.NIDAVELLIR_DEEPSLATE_COBBLESTONE_WALL.get(),
                NidavellirBlocks.NIDAVELLIR_DEEPSLATE_STONE_BRICKS_WALL.get()
        );

        createStoneGeoRecipes(pRecipeOutput,
                NidavellirBlocks.NIDAVELLIR_CRIMSON_STONE.get(),
                NidavellirBlocks.NIDAVELLIR_CRIMSON_STONE_STAIRS.get(),
                NidavellirBlocks.NIDAVELLIR_CRIMSON_STONE_SLAB.get(),
                NidavellirBlocks.NIDAVELLIR_CRIMSON_COBBLESTONE.get(),
                NidavellirBlocks.NIDAVELLIR_CRIMSON_COBBLESTONE_STAIRS.get(),
                NidavellirBlocks.NIDAVELLIR_CRIMSON_COBBLESTONE_SLAB.get(),
                NidavellirBlocks.NIDAVELLIR_CRIMSON_STONE_BRICKS.get(),
                NidavellirBlocks.NIDAVELLIR_CRIMSON_STONE_BRICKS_STAIRS.get(),
                NidavellirBlocks.NIDAVELLIR_CRIMSON_STONE_BRICKS_SLAB.get(),
                NidavellirBlocks.NIDAVELLIR_CRIMSON_STONE_BUTTON.get(),
                NidavellirBlocks.NIDAVELLIR_CRIMSON_STONE_PRESSURE_PLATE.get(),
                NidavellirBlocks.NIDAVELLIR_CRIMSON_STONE_WALL.get(),
                NidavellirBlocks.NIDAVELLIR_CRIMSON_COBBLESTONE_WALL.get(),
                NidavellirBlocks.NIDAVELLIR_CRIMSON_STONE_BRICKS_WALL.get()
        );

        createStoneGeoRecipes(pRecipeOutput,
                UnderworldBlocks.TARTARUS_STONE.get(),
                UnderworldBlocks.TARTARUS_STONE_STAIRS.get(),
                UnderworldBlocks.TARTARUS_STONE_SLAB.get(),
                UnderworldBlocks.TARTARUS_STONE_COBBLESTONE.get(),
                UnderworldBlocks.TARTARUS_STONE_COBBLESTONE_STAIRS.get(),
                UnderworldBlocks.TARTARUS_STONE_COBBLESTONE_SLAB.get(),
                UnderworldBlocks.TARTARUS_STONE_BRICKS.get(),
                UnderworldBlocks.TARTARUS_STONE_BRICKS_STAIRS.get(),
                UnderworldBlocks.TARTARUS_STONE_BRICKS_SLAB.get(),
                UnderworldBlocks.TARTARUS_STONE_BUTTON.get(),
                UnderworldBlocks.TARTARUS_STONE_PRESSURE_PLATE.get(),
                UnderworldBlocks.TARTARUS_STONE_WALL.get(),
                UnderworldBlocks.TARTARUS_STONE_COBBLESTONE_WALL.get(),
                UnderworldBlocks.TARTARUS_STONE_BRICKS_WALL.get()
        );
    }
    public void foodRecipes(RecipeOutput pRecipeOutput) {
        /*
        COOKING
         */
//        createSmokingRecipes(pRecipeOutput, AtlantisItems.CLOWNFISH.get(), AtlantisItems.COOKED_CLOWNFISH.get());
//        createSmokingRecipes(pRecipeOutput, AtlantisItems.RAW_TUNA.get(), AtlantisItems.COOKED_TUNA.get());
//        createSmokingRecipes(pRecipeOutput, AtlantisItems.TANG_FISH.get(), AtlantisItems.COOKED_TANG_FISH.get());

        //Tag Crafting
        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, Items.MUSHROOM_STEW)
                .requires(Items.BOWL)
                .requires(ModTags.getItemTag(ModTags.Blocks.MUSHROOMS))
                .requires(ModTags.getItemTag(ModTags.Blocks.MUSHROOMS))
                .unlockedBy("has_" + ModTags.Items.MUSHROOMS, inventoryTrigger(ItemPredicate.Builder.item().of(ModTags.Items.MUSHROOMS).build()))
                .save(pRecipeOutput);
    }
    public void metalRecipes(RecipeOutput pRecipeOutput) {
//        createBlastingRecipes(pRecipeOutput, NidavellirBlocks.NIDAVELLIR_SOFT_STONE_IRON_ORE.get(), Items.IRON_INGOT);
//        createBlastingRecipes(pRecipeOutput, NidavellirBlocks.NIDAVELLIR_SOFT_STONE_GOLD_ORE.get(), Items.GOLD_INGOT);
//        createBlastingRecipes(pRecipeOutput, NidavellirBlocks.NIDAVELLIR_SOFT_STONE_COPPER_ORE.get(), Items.COPPER_INGOT);
//        createBlastingRecipes(pRecipeOutput, NidavellirBlocks.NIDAVELLIR_SOFT_STONE_TIN_ORE.get(), ModItems.TIN_INGOT.get());
//        createBlastingRecipes(pRecipeOutput, NidavellirBlocks.NIDAVELLIR_SOFT_STONE_ZINC_ORE.get(), ModItems.ZINC_INGOT.get());
//        createBlastingRecipes(pRecipeOutput, NidavellirBlocks.NIDAVELLIR_SOFT_STONE_DIAMOND_ORE.get(), Items.DIAMOND);
//        createBlastingRecipes(pRecipeOutput, NidavellirBlocks.NIDAVELLIR_SOFT_STONE_EMERALD_ORE.get(), Items.EMERALD);
//        createBlastingRecipes(pRecipeOutput, NidavellirBlocks.NIDAVELLIR_SOFT_STONE_COAL_ORE.get(), Items.COAL);
//        createBlastingRecipes(pRecipeOutput, NidavellirBlocks.NIDAVELLIR_SOFT_STONE_REDSTONE_ORE.get(), Items.REDSTONE);
//        createBlastingRecipes(pRecipeOutput, NidavellirBlocks.NIDAVELLIR_SOFT_STONE_LAPIS_ORE.get(), Items.LAPIS_LAZULI);
//        createBlastingRecipes(pRecipeOutput, NidavellirBlocks.NIDAVELLIR_SOFT_STONE_AQUAMARINE_ORE.get(), Items.LAPIS_LAZULI);
//        createBlastingRecipes(pRecipeOutput, NidavellirBlocks.NIDAVELLIR_SOFT_STONE_OPAL_ORE.get(), Items.LAPIS_LAZULI);
//        createBlastingRecipes(pRecipeOutput, NidavellirBlocks.NIDAVELLIR_SOFT_STONE_RUBY_ORE.get(), Items.LAPIS_LAZULI);
//
//        createBlastingRecipes(pRecipeOutput, NidavellirBlocks.NIDAVELLIR_SOFT_STONE_IRON_ORE_CLUSTER.get(), Items.IRON_INGOT);
//        createBlastingRecipes(pRecipeOutput, NidavellirBlocks.NIDAVELLIR_SOFT_STONE_GOLD_ORE_CLUSTER.get(), Items.GOLD_INGOT);
//        createBlastingRecipes(pRecipeOutput, NidavellirBlocks.NIDAVELLIR_SOFT_STONE_COPPER_ORE_CLUSTER.get(), Items.COPPER_INGOT);
//        createBlastingRecipes(pRecipeOutput, NidavellirBlocks.NIDAVELLIR_SOFT_STONE_TIN_ORE_CLUSTER.get(), ModItems.TIN_INGOT.get());
//        createBlastingRecipes(pRecipeOutput, NidavellirBlocks.NIDAVELLIR_SOFT_STONE_ZINC_ORE_CLUSTER.get(), ModItems.ZINC_INGOT.get());
//        createBlastingRecipes(pRecipeOutput, NidavellirBlocks.NIDAVELLIR_SOFT_STONE_DIAMOND_ORE_CLUSTER.get(), Items.DIAMOND);
//        createBlastingRecipes(pRecipeOutput, NidavellirBlocks.NIDAVELLIR_SOFT_STONE_EMERALD_ORE_CLUSTER.get(), Items.EMERALD);
//        createBlastingRecipes(pRecipeOutput, NidavellirBlocks.NIDAVELLIR_SOFT_STONE_COAL_ORE_CLUSTER.get(), Items.COAL);
//        createBlastingRecipes(pRecipeOutput, NidavellirBlocks.NIDAVELLIR_SOFT_STONE_REDSTONE_ORE_CLUSTER.get(), Items.REDSTONE);
//        createBlastingRecipes(pRecipeOutput, NidavellirBlocks.NIDAVELLIR_SOFT_STONE_LAPIS_ORE_CLUSTER.get(), Items.LAPIS_LAZULI);
//        createBlastingRecipes(pRecipeOutput, NidavellirBlocks.NIDAVELLIR_SOFT_STONE_AQUAMARINE_ORE_CLUSTER.get(), Items.LAPIS_LAZULI);
//        createBlastingRecipes(pRecipeOutput, NidavellirBlocks.NIDAVELLIR_SOFT_STONE_OPAL_ORE_CLUSTER.get(), Items.LAPIS_LAZULI);
//        createBlastingRecipes(pRecipeOutput, NidavellirBlocks.NIDAVELLIR_SOFT_STONE_RUBY_ORE_CLUSTER.get(), Items.LAPIS_LAZULI);
//
//        createBlastingRecipes(pRecipeOutput, NidavellirBlocks.NIDAVELLIR_HARD_STONE_IRON_ORE.get(), Items.IRON_INGOT);
//        createBlastingRecipes(pRecipeOutput, NidavellirBlocks.NIDAVELLIR_HARD_STONE_GOLD_ORE.get(), Items.GOLD_INGOT);
//        createBlastingRecipes(pRecipeOutput, NidavellirBlocks.NIDAVELLIR_HARD_STONE_COPPER_ORE.get(), Items.COPPER_INGOT);
//        createBlastingRecipes(pRecipeOutput, NidavellirBlocks.NIDAVELLIR_HARD_STONE_TIN_ORE.get(), ModItems.TIN_INGOT.get());
//        createBlastingRecipes(pRecipeOutput, NidavellirBlocks.NIDAVELLIR_HARD_STONE_ZINC_ORE.get(), ModItems.ZINC_INGOT.get());
//        createBlastingRecipes(pRecipeOutput, NidavellirBlocks.NIDAVELLIR_HARD_STONE_DIAMOND_ORE.get(), Items.DIAMOND);
//        createBlastingRecipes(pRecipeOutput, NidavellirBlocks.NIDAVELLIR_HARD_STONE_EMERALD_ORE.get(), Items.EMERALD);
//        createBlastingRecipes(pRecipeOutput, NidavellirBlocks.NIDAVELLIR_HARD_STONE_COAL_ORE.get(), Items.COAL);
//        createBlastingRecipes(pRecipeOutput, NidavellirBlocks.NIDAVELLIR_HARD_STONE_REDSTONE_ORE.get(), Items.REDSTONE);
//        createBlastingRecipes(pRecipeOutput, NidavellirBlocks.NIDAVELLIR_HARD_STONE_LAPIS_ORE.get(), Items.LAPIS_LAZULI);
//        createBlastingRecipes(pRecipeOutput, NidavellirBlocks.NIDAVELLIR_HARD_STONE_AQUAMARINE_ORE.get(), Items.LAPIS_LAZULI);
//        createBlastingRecipes(pRecipeOutput, NidavellirBlocks.NIDAVELLIR_HARD_STONE_OPAL_ORE.get(), Items.LAPIS_LAZULI);
//        createBlastingRecipes(pRecipeOutput, NidavellirBlocks.NIDAVELLIR_HARD_STONE_RUBY_ORE.get(), Items.LAPIS_LAZULI);
//
//        createBlastingRecipes(pRecipeOutput, NidavellirBlocks.NIDAVELLIR_HARD_STONE_IRON_ORE_CLUSTER.get(), Items.IRON_INGOT);
//        createBlastingRecipes(pRecipeOutput, NidavellirBlocks.NIDAVELLIR_HARD_STONE_GOLD_ORE_CLUSTER.get(), Items.GOLD_INGOT);
//        createBlastingRecipes(pRecipeOutput, NidavellirBlocks.NIDAVELLIR_HARD_STONE_COPPER_ORE_CLUSTER.get(), Items.COPPER_INGOT);
//        createBlastingRecipes(pRecipeOutput, NidavellirBlocks.NIDAVELLIR_HARD_STONE_TIN_ORE_CLUSTER.get(), ModItems.TIN_INGOT.get());
//        createBlastingRecipes(pRecipeOutput, NidavellirBlocks.NIDAVELLIR_HARD_STONE_ZINC_ORE_CLUSTER.get(), ModItems.ZINC_INGOT.get());
//        createBlastingRecipes(pRecipeOutput, NidavellirBlocks.NIDAVELLIR_HARD_STONE_DIAMOND_ORE_CLUSTER.get(), Items.DIAMOND);
//        createBlastingRecipes(pRecipeOutput, NidavellirBlocks.NIDAVELLIR_HARD_STONE_EMERALD_ORE_CLUSTER.get(), Items.EMERALD);
//        createBlastingRecipes(pRecipeOutput, NidavellirBlocks.NIDAVELLIR_HARD_STONE_COAL_ORE_CLUSTER.get(), Items.COAL);
//        createBlastingRecipes(pRecipeOutput, NidavellirBlocks.NIDAVELLIR_HARD_STONE_REDSTONE_ORE_CLUSTER.get(), Items.REDSTONE);
//        createBlastingRecipes(pRecipeOutput, NidavellirBlocks.NIDAVELLIR_HARD_STONE_LAPIS_ORE_CLUSTER.get(), Items.LAPIS_LAZULI);
//        createBlastingRecipes(pRecipeOutput, NidavellirBlocks.NIDAVELLIR_HARD_STONE_AQUAMARINE_ORE_CLUSTER.get(), Items.LAPIS_LAZULI);
//        createBlastingRecipes(pRecipeOutput, NidavellirBlocks.NIDAVELLIR_HARD_STONE_OPAL_ORE_CLUSTER.get(), Items.LAPIS_LAZULI);
//        createBlastingRecipes(pRecipeOutput, NidavellirBlocks.NIDAVELLIR_HARD_STONE_RUBY_ORE_CLUSTER.get(), Items.LAPIS_LAZULI);
//
//        createBlastingRecipes(pRecipeOutput, NidavellirBlocks.NIDAVELLIR_ENHANCED_STONE_IRON_ORE.get(), Items.IRON_INGOT);
//        createBlastingRecipes(pRecipeOutput, NidavellirBlocks.NIDAVELLIR_ENHANCED_STONE_GOLD_ORE.get(), Items.GOLD_INGOT);
//        createBlastingRecipes(pRecipeOutput, NidavellirBlocks.NIDAVELLIR_ENHANCED_STONE_COPPER_ORE.get(), Items.COPPER_INGOT);
//        createBlastingRecipes(pRecipeOutput, NidavellirBlocks.NIDAVELLIR_ENHANCED_STONE_TIN_ORE.get(), ModItems.TIN_INGOT.get());
//        createBlastingRecipes(pRecipeOutput, NidavellirBlocks.NIDAVELLIR_ENHANCED_STONE_ZINC_ORE.get(), ModItems.ZINC_INGOT.get());
//        createBlastingRecipes(pRecipeOutput, NidavellirBlocks.NIDAVELLIR_ENHANCED_STONE_DIAMOND_ORE.get(), Items.DIAMOND);
//        createBlastingRecipes(pRecipeOutput, NidavellirBlocks.NIDAVELLIR_ENHANCED_STONE_EMERALD_ORE.get(), Items.EMERALD);
//        createBlastingRecipes(pRecipeOutput, NidavellirBlocks.NIDAVELLIR_ENHANCED_STONE_COAL_ORE.get(), Items.COAL);
//        createBlastingRecipes(pRecipeOutput, NidavellirBlocks.NIDAVELLIR_ENHANCED_STONE_REDSTONE_ORE.get(), Items.REDSTONE);
//        createBlastingRecipes(pRecipeOutput, NidavellirBlocks.NIDAVELLIR_ENHANCED_STONE_LAPIS_ORE.get(), Items.LAPIS_LAZULI);
//        createBlastingRecipes(pRecipeOutput, NidavellirBlocks.NIDAVELLIR_ENHANCED_STONE_AQUAMARINE_ORE.get(), Items.LAPIS_LAZULI);
//        createBlastingRecipes(pRecipeOutput, NidavellirBlocks.NIDAVELLIR_ENHANCED_STONE_OPAL_ORE.get(), Items.LAPIS_LAZULI);
//        createBlastingRecipes(pRecipeOutput, NidavellirBlocks.NIDAVELLIR_ENHANCED_STONE_RUBY_ORE.get(), Items.LAPIS_LAZULI);
//
//        createBlastingRecipes(pRecipeOutput, NidavellirBlocks.NIDAVELLIR_ENHANCED_STONE_IRON_ORE_CLUSTER.get(), Items.IRON_INGOT);
//        createBlastingRecipes(pRecipeOutput, NidavellirBlocks.NIDAVELLIR_ENHANCED_STONE_GOLD_ORE_CLUSTER.get(), Items.GOLD_INGOT);
//        createBlastingRecipes(pRecipeOutput, NidavellirBlocks.NIDAVELLIR_ENHANCED_STONE_COPPER_ORE_CLUSTER.get(), Items.COPPER_INGOT);
//        createBlastingRecipes(pRecipeOutput, NidavellirBlocks.NIDAVELLIR_ENHANCED_STONE_TIN_ORE_CLUSTER.get(), ModItems.TIN_INGOT.get());
//        createBlastingRecipes(pRecipeOutput, NidavellirBlocks.NIDAVELLIR_ENHANCED_STONE_ZINC_ORE_CLUSTER.get(), ModItems.ZINC_INGOT.get());
//        createBlastingRecipes(pRecipeOutput, NidavellirBlocks.NIDAVELLIR_ENHANCED_STONE_DIAMOND_ORE_CLUSTER.get(), Items.DIAMOND);
//        createBlastingRecipes(pRecipeOutput, NidavellirBlocks.NIDAVELLIR_ENHANCED_STONE_EMERALD_ORE_CLUSTER.get(), Items.EMERALD);
//        createBlastingRecipes(pRecipeOutput, NidavellirBlocks.NIDAVELLIR_ENHANCED_STONE_COAL_ORE_CLUSTER.get(), Items.COAL);
//        createBlastingRecipes(pRecipeOutput, NidavellirBlocks.NIDAVELLIR_ENHANCED_STONE_REDSTONE_ORE_CLUSTER.get(), Items.REDSTONE);
//        createBlastingRecipes(pRecipeOutput, NidavellirBlocks.NIDAVELLIR_ENHANCED_STONE_LAPIS_ORE_CLUSTER.get(), Items.LAPIS_LAZULI);
//        createBlastingRecipes(pRecipeOutput, NidavellirBlocks.NIDAVELLIR_ENHANCED_STONE_AQUAMARINE_ORE_CLUSTER.get(), Items.LAPIS_LAZULI);
//        createBlastingRecipes(pRecipeOutput, NidavellirBlocks.NIDAVELLIR_ENHANCED_STONE_OPAL_ORE_CLUSTER.get(), Items.LAPIS_LAZULI);
//        createBlastingRecipes(pRecipeOutput, NidavellirBlocks.NIDAVELLIR_ENHANCED_STONE_RUBY_ORE_CLUSTER.get(), Items.LAPIS_LAZULI);
//
//        createBlastingRecipes(pRecipeOutput, NidavellirBlocks.NIDAVELLIR_DEEPSLATE_STONE_IRON_ORE.get(), Items.IRON_INGOT);
//        createBlastingRecipes(pRecipeOutput, NidavellirBlocks.NIDAVELLIR_DEEPSLATE_STONE_GOLD_ORE.get(), Items.GOLD_INGOT);
//        createBlastingRecipes(pRecipeOutput, NidavellirBlocks.NIDAVELLIR_DEEPSLATE_STONE_COPPER_ORE.get(), Items.COPPER_INGOT);
//        createBlastingRecipes(pRecipeOutput, NidavellirBlocks.NIDAVELLIR_DEEPSLATE_STONE_TIN_ORE.get(), ModItems.TIN_INGOT.get());
//        createBlastingRecipes(pRecipeOutput, NidavellirBlocks.NIDAVELLIR_DEEPSLATE_STONE_ZINC_ORE.get(), ModItems.ZINC_INGOT.get());
//        createBlastingRecipes(pRecipeOutput, NidavellirBlocks.NIDAVELLIR_DEEPSLATE_STONE_DIAMOND_ORE.get(), Items.DIAMOND);
//        createBlastingRecipes(pRecipeOutput, NidavellirBlocks.NIDAVELLIR_DEEPSLATE_STONE_EMERALD_ORE.get(), Items.EMERALD);
//        createBlastingRecipes(pRecipeOutput, NidavellirBlocks.NIDAVELLIR_DEEPSLATE_STONE_COAL_ORE.get(), Items.COAL);
//        createBlastingRecipes(pRecipeOutput, NidavellirBlocks.NIDAVELLIR_DEEPSLATE_STONE_REDSTONE_ORE.get(), Items.REDSTONE);
//        createBlastingRecipes(pRecipeOutput, NidavellirBlocks.NIDAVELLIR_DEEPSLATE_STONE_LAPIS_ORE.get(), Items.LAPIS_LAZULI);
//        createBlastingRecipes(pRecipeOutput, NidavellirBlocks.NIDAVELLIR_DEEPSLATE_STONE_AQUAMARINE_ORE.get(), Items.LAPIS_LAZULI);
//        createBlastingRecipes(pRecipeOutput, NidavellirBlocks.NIDAVELLIR_DEEPSLATE_STONE_OPAL_ORE.get(), Items.LAPIS_LAZULI);
//        createBlastingRecipes(pRecipeOutput, NidavellirBlocks.NIDAVELLIR_DEEPSLATE_STONE_RUBY_ORE.get(), Items.LAPIS_LAZULI);
//
//        createBlastingRecipes(pRecipeOutput, NidavellirBlocks.NIDAVELLIR_DEEPSLATE_STONE_IRON_ORE_CLUSTER.get(), Items.IRON_INGOT);
//        createBlastingRecipes(pRecipeOutput, NidavellirBlocks.NIDAVELLIR_DEEPSLATE_STONE_GOLD_ORE_CLUSTER.get(), Items.GOLD_INGOT);
//        createBlastingRecipes(pRecipeOutput, NidavellirBlocks.NIDAVELLIR_DEEPSLATE_STONE_COPPER_ORE_CLUSTER.get(), Items.COPPER_INGOT);
//        createBlastingRecipes(pRecipeOutput, NidavellirBlocks.NIDAVELLIR_DEEPSLATE_STONE_TIN_ORE_CLUSTER.get(), ModItems.TIN_INGOT.get());
//        createBlastingRecipes(pRecipeOutput, NidavellirBlocks.NIDAVELLIR_DEEPSLATE_STONE_ZINC_ORE_CLUSTER.get(), ModItems.ZINC_INGOT.get());
//        createBlastingRecipes(pRecipeOutput, NidavellirBlocks.NIDAVELLIR_DEEPSLATE_STONE_DIAMOND_ORE_CLUSTER.get(), Items.DIAMOND);
//        createBlastingRecipes(pRecipeOutput, NidavellirBlocks.NIDAVELLIR_DEEPSLATE_STONE_EMERALD_ORE_CLUSTER.get(), Items.EMERALD);
//        createBlastingRecipes(pRecipeOutput, NidavellirBlocks.NIDAVELLIR_DEEPSLATE_STONE_COAL_ORE_CLUSTER.get(), Items.COAL);
//        createBlastingRecipes(pRecipeOutput, NidavellirBlocks.NIDAVELLIR_DEEPSLATE_STONE_REDSTONE_ORE_CLUSTER.get(), Items.REDSTONE);
//        createBlastingRecipes(pRecipeOutput, NidavellirBlocks.NIDAVELLIR_DEEPSLATE_STONE_LAPIS_ORE_CLUSTER.get(), Items.LAPIS_LAZULI);
//        createBlastingRecipes(pRecipeOutput, NidavellirBlocks.NIDAVELLIR_DEEPSLATE_STONE_AQUAMARINE_ORE_CLUSTER.get(), Items.LAPIS_LAZULI);
//        createBlastingRecipes(pRecipeOutput, NidavellirBlocks.NIDAVELLIR_DEEPSLATE_STONE_OPAL_ORE_CLUSTER.get(), Items.LAPIS_LAZULI);
//        createBlastingRecipes(pRecipeOutput, NidavellirBlocks.NIDAVELLIR_DEEPSLATE_STONE_RUBY_ORE_CLUSTER.get(), Items.LAPIS_LAZULI);
//
//        createBlastingRecipes(pRecipeOutput, NidavellirBlocks.NIDAVELLIR_CRIMSON_STONE_IRON_ORE.get(), Items.IRON_INGOT);
//        createBlastingRecipes(pRecipeOutput, NidavellirBlocks.NIDAVELLIR_CRIMSON_STONE_GOLD_ORE.get(), Items.GOLD_INGOT);
//        createBlastingRecipes(pRecipeOutput, NidavellirBlocks.NIDAVELLIR_CRIMSON_STONE_COPPER_ORE.get(), Items.COPPER_INGOT);
//        createBlastingRecipes(pRecipeOutput, NidavellirBlocks.NIDAVELLIR_CRIMSON_STONE_TIN_ORE.get(), ModItems.TIN_INGOT.get());
//        createBlastingRecipes(pRecipeOutput, NidavellirBlocks.NIDAVELLIR_CRIMSON_STONE_ZINC_ORE.get(), ModItems.ZINC_INGOT.get());
//        createBlastingRecipes(pRecipeOutput, NidavellirBlocks.NIDAVELLIR_CRIMSON_STONE_DIAMOND_ORE.get(), Items.DIAMOND);
//        createBlastingRecipes(pRecipeOutput, NidavellirBlocks.NIDAVELLIR_CRIMSON_STONE_EMERALD_ORE.get(), Items.EMERALD);
//        createBlastingRecipes(pRecipeOutput, NidavellirBlocks.NIDAVELLIR_CRIMSON_STONE_COAL_ORE.get(), Items.COAL);
//        createBlastingRecipes(pRecipeOutput, NidavellirBlocks.NIDAVELLIR_CRIMSON_STONE_REDSTONE_ORE.get(), Items.REDSTONE);
//        createBlastingRecipes(pRecipeOutput, NidavellirBlocks.NIDAVELLIR_CRIMSON_STONE_LAPIS_ORE.get(), Items.LAPIS_LAZULI);
//        createBlastingRecipes(pRecipeOutput, NidavellirBlocks.NIDAVELLIR_CRIMSON_STONE_AQUAMARINE_ORE.get(), Items.LAPIS_LAZULI);
//        createBlastingRecipes(pRecipeOutput, NidavellirBlocks.NIDAVELLIR_CRIMSON_STONE_OPAL_ORE.get(), Items.LAPIS_LAZULI);
//        createBlastingRecipes(pRecipeOutput, NidavellirBlocks.NIDAVELLIR_CRIMSON_STONE_RUBY_ORE.get(), Items.LAPIS_LAZULI);
//
//        createBlastingRecipes(pRecipeOutput, NidavellirBlocks.NIDAVELLIR_CRIMSON_STONE_IRON_ORE_CLUSTER.get(), Items.IRON_INGOT);
//        createBlastingRecipes(pRecipeOutput, NidavellirBlocks.NIDAVELLIR_CRIMSON_STONE_GOLD_ORE_CLUSTER.get(), Items.GOLD_INGOT);
//        createBlastingRecipes(pRecipeOutput, NidavellirBlocks.NIDAVELLIR_CRIMSON_STONE_COPPER_ORE_CLUSTER.get(), Items.COPPER_INGOT);
//        createBlastingRecipes(pRecipeOutput, NidavellirBlocks.NIDAVELLIR_CRIMSON_STONE_TIN_ORE_CLUSTER.get(), ModItems.TIN_INGOT.get());
//        createBlastingRecipes(pRecipeOutput, NidavellirBlocks.NIDAVELLIR_CRIMSON_STONE_ZINC_ORE_CLUSTER.get(), ModItems.ZINC_INGOT.get());
//        createBlastingRecipes(pRecipeOutput, NidavellirBlocks.NIDAVELLIR_CRIMSON_STONE_DIAMOND_ORE_CLUSTER.get(), Items.DIAMOND);
//        createBlastingRecipes(pRecipeOutput, NidavellirBlocks.NIDAVELLIR_CRIMSON_STONE_EMERALD_ORE_CLUSTER.get(), Items.EMERALD);
//        createBlastingRecipes(pRecipeOutput, NidavellirBlocks.NIDAVELLIR_CRIMSON_STONE_COAL_ORE_CLUSTER.get(), Items.COAL);
//        createBlastingRecipes(pRecipeOutput, NidavellirBlocks.NIDAVELLIR_CRIMSON_STONE_REDSTONE_ORE_CLUSTER.get(), Items.REDSTONE);
//        createBlastingRecipes(pRecipeOutput, NidavellirBlocks.NIDAVELLIR_CRIMSON_STONE_LAPIS_ORE_CLUSTER.get(), Items.LAPIS_LAZULI);
//        createBlastingRecipes(pRecipeOutput, NidavellirBlocks.NIDAVELLIR_CRIMSON_STONE_AQUAMARINE_ORE_CLUSTER.get(), Items.LAPIS_LAZULI);
//        createBlastingRecipes(pRecipeOutput, NidavellirBlocks.NIDAVELLIR_CRIMSON_STONE_OPAL_ORE_CLUSTER.get(), Items.LAPIS_LAZULI);
//        createBlastingRecipes(pRecipeOutput, NidavellirBlocks.NIDAVELLIR_CRIMSON_STONE_RUBY_ORE_CLUSTER.get(), Items.LAPIS_LAZULI);
        
        createOreRecipes(pRecipeOutput, "zinc", ZINC_SMELTABLES, ModItems.ZINC_INGOT.get(), ModBlocks.ZINC_BLOCK.get(), ModItems.RAW_ZINC.get(), ModBlocks.RAW_ZINC_BLOCK.get(), ModItems.ZINC_NUGGET.get());
        createTools(pRecipeOutput, "zinc", ModItems.ZINC_INGOT.get(),
                ModItems.ZINC_PICKAXE.get(), ModItems.ZINC_SHOVEL.get(), ModItems.ZINC_AXE.get(), ModItems.ZINC_SWORD.get(), ModItems.ZINC_HOE.get(),
                ModItems.ZINC_HELMET.get(), ModItems.ZINC_CHESTPLATE.get(), ModItems.ZINC_LEGGINGS.get(), ModItems.ZINC_BOOTS.get());

        createOreRecipes(pRecipeOutput, "tin", TIN_SMELTABLES, ModItems.TIN_INGOT.get(), ModBlocks.TIN_BLOCK.get(), ModItems.RAW_TIN.get(), ModBlocks.RAW_TIN_BLOCK.get(), ModItems.TIN_NUGGET.get());
        createTools(pRecipeOutput, "tin", ModItems.TIN_INGOT.get(),
                ModItems.TIN_PICKAXE.get(), ModItems.TIN_SHOVEL.get(), ModItems.TIN_AXE.get(), ModItems.TIN_SWORD.get(), ModItems.TIN_HOE.get(),
                ModItems.TIN_HELMET.get(), ModItems.TIN_CHESTPLATE.get(), ModItems.TIN_LEGGINGS.get(), ModItems.TIN_BOOTS.get());

        createOreRecipes(pRecipeOutput, "orichalcum", ORICHALCUM_SMELTABLES, UnderworldItems.ORICHALCUM_INGOT.get(), UnderworldBlocks.ORICHALCUM_BLOCK.get(), UnderworldItems.RAW_ORICHALCUM.get(), UnderworldBlocks.RAW_ORICHALCUM_BLOCK.get(), UnderworldItems.ORICHALCUM_NUGGET.get());
        createTools(pRecipeOutput, "orichalcum", UnderworldItems.ORICHALCUM_INGOT.get(),
                UnderworldItems.ORICHALCUM_PICKAXE.get(), UnderworldItems.ORICHALCUM_SHOVEL.get(), UnderworldItems.ORICHALCUM_AXE.get(), UnderworldItems.ORICHALCUM_SWORD.get(), UnderworldItems.ORICHALCUM_HOE.get(),
                UnderworldItems.ORICHALCUM_HELMET.get(), UnderworldItems.ORICHALCUM_CHESTPLATE.get(), UnderworldItems.ORICHALCUM_LEGGINGS.get(), UnderworldItems.ORICHALCUM_BOOTS.get());

        createTools(pRecipeOutput, "brass", ModItems.BRASS_INGOT.get(),
                ModItems.BRASS_PICKAXE.get(), ModItems.BRASS_SHOVEL.get(), ModItems.BRASS_AXE.get(), ModItems.BRASS_SWORD.get(), ModItems.BRASS_HOE.get(),
                ModItems.BRASS_HELMET.get(), ModItems.BRASS_CHESTPLATE.get(), ModItems.BRASS_LEGGINGS.get(), ModItems.BRASS_BOOTS.get());

        createTools(pRecipeOutput, "bronze", ModItems.BRONZE_INGOT.get(),
                ModItems.BRONZE_PICKAXE.get(), ModItems.BRONZE_SHOVEL.get(), ModItems.BRONZE_AXE.get(), ModItems.BRONZE_SWORD.get(), ModItems.BRONZE_HOE.get(),
                ModItems.BRONZE_HELMET.get(), ModItems.BRONZE_CHESTPLATE.get(), ModItems.BRONZE_LEGGINGS.get(), ModItems.BRONZE_BOOTS.get());
    }
    public void woodRecipes(RecipeOutput pRecipeOutput) {
        /*
         * WOOD TYPES
         */
        //Elder Wood
        createWoodRecipes(pRecipeOutput, "elder_wood", ModTags.Blocks.ELDER_WOOD_LOGS, ModTags.Blocks.ELDER_WOOD_STRIPPED_LOGS, UnderworldBlocks.ELDER_WOOD_PLANKS.get(),
                UnderworldBlocks.ELDER_WOOD_PLANKS_STAIRS.get(), UnderworldBlocks.ELDER_WOOD_PLANKS_SLAB.get(), UnderworldBlocks.ELDER_WOOD_PLANKS_FENCE.get(),
                UnderworldBlocks.ELDER_WOOD_PLANKS_FENCE_GATE.get(), UnderworldBlocks.ELDER_WOOD_PLANKS_DOOR.get(), UnderworldBlocks.ELDER_WOOD_PLANKS_TRAPDOOR.get(),
                UnderworldBlocks.ELDER_WOOD_PLANKS_PRESSURE_PLATE.get(), UnderworldBlocks.ELDER_WOOD_PLANKS_BUTTON.get(), UnderworldItems.ELDER_WOOD_SIGN.get(), UnderworldItems.ELDER_WOOD_HANGING_SIGN.get());

        //Olive
        createWoodRecipes(pRecipeOutput, "olive", ModTags.Blocks.OLIVE_LOGS, ModTags.Blocks.OLIVE_STRIPPED_LOGS, UnderworldBlocks.OLIVE_PLANKS.get(),
                UnderworldBlocks.OLIVE_PLANKS_STAIRS.get(), UnderworldBlocks.OLIVE_PLANKS_SLAB.get(), UnderworldBlocks.OLIVE_PLANKS_FENCE.get(),
                UnderworldBlocks.OLIVE_PLANKS_FENCE_GATE.get(), UnderworldBlocks.OLIVE_PLANKS_DOOR.get(), UnderworldBlocks.OLIVE_PLANKS_TRAPDOOR.get(),
                UnderworldBlocks.OLIVE_PLANKS_PRESSURE_PLATE.get(), UnderworldBlocks.OLIVE_PLANKS_BUTTON.get(), UnderworldItems.OLIVE_SIGN.get(), UnderworldItems.OLIVE_HANGING_SIGN.get());

        //Myrrh
        createWoodRecipes(pRecipeOutput, "myrrh", ModTags.Blocks.MYRRH_LOGS, ModTags.Blocks.MYRRH_STRIPPED_LOGS, UnderworldBlocks.MYRRH_PLANKS.get(),
                UnderworldBlocks.MYRRH_PLANKS_STAIRS.get(), UnderworldBlocks.MYRRH_PLANKS_SLAB.get(), UnderworldBlocks.MYRRH_PLANKS_FENCE.get(),
                UnderworldBlocks.MYRRH_PLANKS_FENCE_GATE.get(), UnderworldBlocks.MYRRH_PLANKS_DOOR.get(), UnderworldBlocks.MYRRH_PLANKS_TRAPDOOR.get(),
                UnderworldBlocks.MYRRH_PLANKS_PRESSURE_PLATE.get(), UnderworldBlocks.MYRRH_PLANKS_BUTTON.get(), UnderworldItems.MYRRH_SIGN.get(), UnderworldItems.MYRRH_HANGING_SIGN.get());

        //Laurel
        createWoodRecipes(pRecipeOutput, "laurel", ModTags.Blocks.LAUREL_LOGS, ModTags.Blocks.LAUREL_STRIPPED_LOGS, UnderworldBlocks.LAUREL_PLANKS.get(),
                UnderworldBlocks.LAUREL_PLANKS_STAIRS.get(), UnderworldBlocks.LAUREL_PLANKS_SLAB.get(), UnderworldBlocks.LAUREL_PLANKS_FENCE.get(),
                UnderworldBlocks.LAUREL_PLANKS_FENCE_GATE.get(), UnderworldBlocks.LAUREL_PLANKS_DOOR.get(), UnderworldBlocks.LAUREL_PLANKS_TRAPDOOR.get(),
                UnderworldBlocks.LAUREL_PLANKS_PRESSURE_PLATE.get(), UnderworldBlocks.LAUREL_PLANKS_BUTTON.get(), UnderworldItems.LAUREL_SIGN.get(), UnderworldItems.LAUREL_HANGING_SIGN.get());

        //Cypress
        createWoodRecipes(pRecipeOutput, "cypress", ModTags.Blocks.CYPRESS_LOGS, ModTags.Blocks.CYPRESS_STRIPPED_LOGS, UnderworldBlocks.CYPRESS_PLANKS.get(),
                UnderworldBlocks.CYPRESS_PLANKS_STAIRS.get(), UnderworldBlocks.CYPRESS_PLANKS_SLAB.get(), UnderworldBlocks.CYPRESS_PLANKS_FENCE.get(),
                UnderworldBlocks.CYPRESS_PLANKS_FENCE_GATE.get(), UnderworldBlocks.CYPRESS_PLANKS_DOOR.get(), UnderworldBlocks.CYPRESS_PLANKS_TRAPDOOR.get(),
                UnderworldBlocks.CYPRESS_PLANKS_PRESSURE_PLATE.get(), UnderworldBlocks.CYPRESS_PLANKS_BUTTON.get(), UnderworldItems.CYPRESS_SIGN.get(), UnderworldItems.CYPRESS_HANGING_SIGN.get());

        //Black Birch
        createWoodRecipes(pRecipeOutput, "black_birch", ModTags.Blocks.BLACK_BIRCH_LOGS, ModTags.Blocks.BLACK_BIRCH_STRIPPED_LOGS, AlfheimrBlocks.BLACK_BIRCH_PLANKS.get(),
                AlfheimrBlocks.BLACK_BIRCH_PLANKS_STAIRS.get(), AlfheimrBlocks.BLACK_BIRCH_PLANKS_SLAB.get(), AlfheimrBlocks.BLACK_BIRCH_PLANKS_FENCE.get(),
                AlfheimrBlocks.BLACK_BIRCH_PLANKS_FENCE_GATE.get(), AlfheimrBlocks.BLACK_BIRCH_PLANKS_DOOR.get(), AlfheimrBlocks.BLACK_BIRCH_PLANKS_TRAPDOOR.get(),
                AlfheimrBlocks.BLACK_BIRCH_PLANKS_PRESSURE_PLATE.get(), AlfheimrBlocks.BLACK_BIRCH_PLANKS_BUTTON.get(), AlfheimrItems.BLACK_BIRCH_SIGN.get(), AlfheimrItems.BLACK_BIRCH_HANGING_SIGN.get());

        //White Oak
        createWoodRecipes(pRecipeOutput, "white_oak", ModTags.Blocks.WHITE_OAK_LOGS, ModTags.Blocks.WHITE_OAK_STRIPPED_LOGS, AlfheimrBlocks.WHITE_OAK_PLANKS.get(),
                AlfheimrBlocks.WHITE_OAK_PLANKS_STAIRS.get(), AlfheimrBlocks.WHITE_OAK_PLANKS_SLAB.get(), AlfheimrBlocks.WHITE_OAK_PLANKS_FENCE.get(),
                AlfheimrBlocks.WHITE_OAK_PLANKS_FENCE_GATE.get(), AlfheimrBlocks.WHITE_OAK_PLANKS_DOOR.get(), AlfheimrBlocks.WHITE_OAK_PLANKS_TRAPDOOR.get(),
                AlfheimrBlocks.WHITE_OAK_PLANKS_PRESSURE_PLATE.get(), AlfheimrBlocks.WHITE_OAK_PLANKS_BUTTON.get(), AlfheimrItems.WHITE_OAK_SIGN.get(), AlfheimrItems.WHITE_OAK_HANGING_SIGN.get());

        //Bur Oak
        createWoodRecipes(pRecipeOutput, "bur_oak", ModTags.Blocks.BUR_OAK_LOGS, ModTags.Blocks.BUR_OAK_STRIPPED_LOGS, AlfheimrBlocks.BUR_OAK_PLANKS.get(),
                AlfheimrBlocks.BUR_OAK_PLANKS_STAIRS.get(), AlfheimrBlocks.BUR_OAK_PLANKS_SLAB.get(), AlfheimrBlocks.BUR_OAK_PLANKS_FENCE.get(),
                AlfheimrBlocks.BUR_OAK_PLANKS_FENCE_GATE.get(), AlfheimrBlocks.BUR_OAK_PLANKS_DOOR.get(), AlfheimrBlocks.BUR_OAK_PLANKS_TRAPDOOR.get(),
                AlfheimrBlocks.BUR_OAK_PLANKS_PRESSURE_PLATE.get(), AlfheimrBlocks.BUR_OAK_PLANKS_BUTTON.get(), AlfheimrItems.BUR_OAK_SIGN.get(), AlfheimrItems.BUR_OAK_HANGING_SIGN.get());

        //Blood Cherry
        createWoodRecipes(pRecipeOutput, "blood_cherry", ModTags.Blocks.BLOOD_CHERRY_LOGS, ModTags.Blocks.BLOOD_CHERRY_STRIPPED_LOGS, AlfheimrBlocks.BLOOD_CHERRY_PLANKS.get(),
                AlfheimrBlocks.BLOOD_CHERRY_PLANKS_STAIRS.get(), AlfheimrBlocks.BLOOD_CHERRY_PLANKS_SLAB.get(), AlfheimrBlocks.BLOOD_CHERRY_PLANKS_FENCE.get(),
                AlfheimrBlocks.BLOOD_CHERRY_PLANKS_FENCE_GATE.get(), AlfheimrBlocks.BLOOD_CHERRY_PLANKS_DOOR.get(), AlfheimrBlocks.BLOOD_CHERRY_PLANKS_TRAPDOOR.get(),
                AlfheimrBlocks.BLOOD_CHERRY_PLANKS_PRESSURE_PLATE.get(), AlfheimrBlocks.BLOOD_CHERRY_PLANKS_BUTTON.get(), AlfheimrItems.BLOOD_CHERRY_SIGN.get(), AlfheimrItems.BLOOD_CHERRY_HANGING_SIGN.get());

        //Sacred Tree
        createWoodRecipes(pRecipeOutput, "sacred_tree", ModTags.Blocks.SACRED_TREE_LOGS, ModTags.Blocks.SACRED_TREE_STRIPPED_LOGS, AlfheimrBlocks.SACRED_TREE_PLANKS.get(),
                AlfheimrBlocks.SACRED_TREE_PLANKS_STAIRS.get(), AlfheimrBlocks.SACRED_TREE_PLANKS_SLAB.get(), AlfheimrBlocks.SACRED_TREE_PLANKS_FENCE.get(),
                AlfheimrBlocks.SACRED_TREE_PLANKS_FENCE_GATE.get(), AlfheimrBlocks.SACRED_TREE_PLANKS_DOOR.get(), AlfheimrBlocks.SACRED_TREE_PLANKS_TRAPDOOR.get(),
                AlfheimrBlocks.SACRED_TREE_PLANKS_PRESSURE_PLATE.get(), AlfheimrBlocks.SACRED_TREE_PLANKS_BUTTON.get(), AlfheimrItems.SACRED_TREE_SIGN.get(), AlfheimrItems.SACRED_TREE_HANGING_SIGN.get());

        //Willow
        createWoodRecipes(pRecipeOutput, "willow", ModTags.Blocks.WILLOW_LOGS, ModTags.Blocks.WILLOW_STRIPPED_LOGS, AlfheimrBlocks.WILLOW_PLANKS.get(),
                AlfheimrBlocks.WILLOW_PLANKS_STAIRS.get(), AlfheimrBlocks.WILLOW_PLANKS_SLAB.get(), AlfheimrBlocks.WILLOW_PLANKS_FENCE.get(),
                AlfheimrBlocks.WILLOW_PLANKS_FENCE_GATE.get(), AlfheimrBlocks.WILLOW_PLANKS_DOOR.get(), AlfheimrBlocks.WILLOW_PLANKS_TRAPDOOR.get(),
                AlfheimrBlocks.WILLOW_PLANKS_PRESSURE_PLATE.get(), AlfheimrBlocks.WILLOW_PLANKS_BUTTON.get(), AlfheimrItems.WILLOW_SIGN.get(), AlfheimrItems.WILLOW_HANGING_SIGN.get());

        //Deadwood
        createWoodRecipes(pRecipeOutput, "deadwood", ModTags.Blocks.DEADWOOD_LOGS, ModTags.Blocks.DEADWOOD_STRIPPED_LOGS, AlfheimrBlocks.DEADWOOD_PLANKS.get(),
                AlfheimrBlocks.DEADWOOD_PLANKS_STAIRS.get(), AlfheimrBlocks.DEADWOOD_PLANKS_SLAB.get(), AlfheimrBlocks.DEADWOOD_PLANKS_FENCE.get(),
                AlfheimrBlocks.DEADWOOD_PLANKS_FENCE_GATE.get(), AlfheimrBlocks.DEADWOOD_PLANKS_DOOR.get(), AlfheimrBlocks.DEADWOOD_PLANKS_TRAPDOOR.get(),
                AlfheimrBlocks.DEADWOOD_PLANKS_PRESSURE_PLATE.get(), AlfheimrBlocks.DEADWOOD_PLANKS_BUTTON.get(), AlfheimrItems.DEADWOOD_SIGN.get(), AlfheimrItems.DEADWOOD_HANGING_SIGN.get());

        //Ebony Kingswood
        createWoodRecipes(pRecipeOutput, "ebony_kingswood", ModTags.Blocks.EBONY_KINGSWOOD_LOGS, ModTags.Blocks.EBONY_KINGSWOOD_STRIPPED_LOGS, AlfheimrBlocks.EBONY_KINGSWOOD_PLANKS.get(),
                AlfheimrBlocks.EBONY_KINGSWOOD_PLANKS_STAIRS.get(), AlfheimrBlocks.EBONY_KINGSWOOD_PLANKS_SLAB.get(), AlfheimrBlocks.EBONY_KINGSWOOD_PLANKS_FENCE.get(),
                AlfheimrBlocks.EBONY_KINGSWOOD_PLANKS_FENCE_GATE.get(), AlfheimrBlocks.EBONY_KINGSWOOD_PLANKS_DOOR.get(), AlfheimrBlocks.EBONY_KINGSWOOD_PLANKS_TRAPDOOR.get(),
                AlfheimrBlocks.EBONY_KINGSWOOD_PLANKS_PRESSURE_PLATE.get(), AlfheimrBlocks.EBONY_KINGSWOOD_PLANKS_BUTTON.get(), AlfheimrItems.EBONY_KINGSWOOD_SIGN.get(), AlfheimrItems.EBONY_KINGSWOOD_HANGING_SIGN.get());

        //Ivory Kingswood
        createWoodRecipes(pRecipeOutput, "ivory_kingswood", ModTags.Blocks.IVORY_KINGSWOOD_LOGS, ModTags.Blocks.IVORY_KINGSWOOD_STRIPPED_LOGS, AlfheimrBlocks.IVORY_KINGSWOOD_PLANKS.get(),
                AlfheimrBlocks.IVORY_KINGSWOOD_PLANKS_STAIRS.get(), AlfheimrBlocks.IVORY_KINGSWOOD_PLANKS_SLAB.get(), AlfheimrBlocks.IVORY_KINGSWOOD_PLANKS_FENCE.get(),
                AlfheimrBlocks.IVORY_KINGSWOOD_PLANKS_FENCE_GATE.get(), AlfheimrBlocks.IVORY_KINGSWOOD_PLANKS_DOOR.get(), AlfheimrBlocks.IVORY_KINGSWOOD_PLANKS_TRAPDOOR.get(),
                AlfheimrBlocks.IVORY_KINGSWOOD_PLANKS_PRESSURE_PLATE.get(), AlfheimrBlocks.IVORY_KINGSWOOD_PLANKS_BUTTON.get(), AlfheimrItems.IVORY_KINGSWOOD_SIGN.get(), AlfheimrItems.IVORY_KINGSWOOD_HANGING_SIGN.get());

        //Weaver
        createWoodRecipes(pRecipeOutput, "weaver", ModTags.Blocks.WEAVER_LOGS, ModTags.Blocks.WEAVER_STRIPPED_LOGS, AlfheimrBlocks.WEAVER_PLANKS.get(),
                AlfheimrBlocks.WEAVER_PLANKS_STAIRS.get(), AlfheimrBlocks.WEAVER_PLANKS_SLAB.get(), AlfheimrBlocks.WEAVER_PLANKS_FENCE.get(),
                AlfheimrBlocks.WEAVER_PLANKS_FENCE_GATE.get(), AlfheimrBlocks.WEAVER_PLANKS_DOOR.get(), AlfheimrBlocks.WEAVER_PLANKS_TRAPDOOR.get(),
                AlfheimrBlocks.WEAVER_PLANKS_PRESSURE_PLATE.get(), AlfheimrBlocks.WEAVER_PLANKS_BUTTON.get(), AlfheimrItems.WEAVER_SIGN.get(), AlfheimrItems.WEAVER_HANGING_SIGN.get());
    }
//    public void alloyRecipes(RecipeOutput pRecipeOutput) {
//        createAlloyRecipes(pRecipeOutput, "brass", Items.COPPER_INGOT, ModItems.ZINC_INGOT.get(), ModItems.BRASS_INGOT.get(), ModBlocks.BRASS_BLOCK.get(), ModItems.BRASS_NUGGET.get());
//        createAlloyRecipes(pRecipeOutput, "bronze", Items.COPPER_INGOT, ModItems.TIN_INGOT.get(), ModItems.BRONZE_INGOT.get(), ModBlocks.BRONZE_BLOCK.get(), ModItems.BRONZE_NUGGET.get());
//    }
    public void flowerRecipes(RecipeOutput pRecipeOutput) {
        //Black
        makeFlower(pRecipeOutput, AlfheimrBlocks.DARK_BLOOM_FLOWER, Items.BLACK_DYE);
        makeFlower(pRecipeOutput, AlfheimrBlocks.DREAD_NIGHT_FLOWER, Items.BLACK_DYE);
        makeFlower(pRecipeOutput, AlfheimrBlocks.BLACK_LOTUS_FLOWER, Items.BLACK_DYE);
        makeFlower(pRecipeOutput, AlfheimrBlocks.NIGHT_ROSE_FLOWER, Items.BLACK_DYE);

        //Blue
        makeFlower(pRecipeOutput, AlfheimrBlocks.AQUA_ROSE_FLOWER, Items.BLUE_DYE);
        makeFlower(pRecipeOutput, AlfheimrBlocks.MOON_FLOWER, Items.BLUE_DYE);
        makeFlower(pRecipeOutput, AlfheimrBlocks.CATHERINE_FLOWER, Items.BLUE_DYE);
        makeFlower(pRecipeOutput, AlfheimrBlocks.TAINTED_ROSE_FLOWER, Items.BLUE_DYE);

        //Brown
        makeFlower(pRecipeOutput, AlfheimrBlocks.CINNAMON_ROSE_FLOWER, Items.BROWN_DYE);
        makeFlower(pRecipeOutput, AlfheimrBlocks.BUTTERFLY_FLOWER, Items.BROWN_DYE);
        makeFlower(pRecipeOutput, AlfheimrBlocks.GAIA_TULIP_FLOWER, Items.BROWN_DYE);
        makeFlower(pRecipeOutput, AlfheimrBlocks.BEARDED_IRIS_FLOWER, Items.BROWN_DYE);

        //Cyan
        makeFlower(pRecipeOutput, AlfheimrBlocks.CORNFLOWER_FLOWER, Items.CYAN_DYE);
        makeFlower(pRecipeOutput, AlfheimrBlocks.MORNING_GLORY_FLOWER, Items.CYAN_DYE);
        makeFlower(pRecipeOutput, AlfheimrBlocks.GEORGIA_BLUE_FLOWER, Items.CYAN_DYE);
        makeFlower(pRecipeOutput, AlfheimrBlocks.BLUE_POPPY_FLOWER, Items.CYAN_DYE);

        //Green
        makeFlower(pRecipeOutput, AlfheimrBlocks.TULIP_FLOWER, Items.GREEN_DYE);
        makeFlower(pRecipeOutput, AlfheimrBlocks.CARNATION_FLOWER, Items.GREEN_DYE);
        makeFlower(pRecipeOutput, AlfheimrBlocks.LADYS_MANTLE_FLOWER, Items.GREEN_DYE);
        makeFlower(pRecipeOutput, AlfheimrBlocks.GREEN_ROSE_FLOWER, Items.GREEN_DYE);

        //Light Blue
        makeFlower(pRecipeOutput, AlfheimrBlocks.CLEMATIS_FLOWER, Items.LIGHT_BLUE_DYE);
        makeFlower(pRecipeOutput, AlfheimrBlocks.BLUE_STAR_FLOWER, Items.LIGHT_BLUE_DYE);
        makeFlower(pRecipeOutput, AlfheimrBlocks.SALVIA_FLOWER, Items.LIGHT_BLUE_DYE);
        makeFlower(pRecipeOutput, AlfheimrBlocks.FALSE_INDIGO_FLOWER, Items.LIGHT_BLUE_DYE);

        //Light Gray
        makeFlower(pRecipeOutput, AlfheimrBlocks.WHITE_SAGE_FLOWER, Items.LIGHT_GRAY_DYE);
        makeFlower(pRecipeOutput, AlfheimrBlocks.SILVER_SCHEHERAZADE_FLOWER, Items.LIGHT_GRAY_DYE);
        makeFlower(pRecipeOutput, AlfheimrBlocks.SILVER_SPRING_FLOWER, Items.LIGHT_GRAY_DYE);
        makeFlower(pRecipeOutput, AlfheimrBlocks.SILVER_SHADOWS_FLOWER, Items.LIGHT_GRAY_DYE);

        //Lime
        makeFlower(pRecipeOutput, AlfheimrBlocks.GREEN_BALL_FLOWER, Items.LIME_DYE);
        makeFlower(pRecipeOutput, AlfheimrBlocks.LIME_DAHLIA_FLOWER, Items.LIME_DYE);
        makeFlower(pRecipeOutput, AlfheimrBlocks.HYDRANGEA_FLOWER, Items.LIME_DYE);
        makeFlower(pRecipeOutput, AlfheimrBlocks.ZINNIA_FLOWER, Items.LIME_DYE);

        //Magenta
        makeFlower(pRecipeOutput, AlfheimrBlocks.BUTTERFLY_CANDY_FLOWER, Items.MAGENTA_DYE);
        makeFlower(pRecipeOutput, AlfheimrBlocks.CABARET_FLOWER, Items.MAGENTA_DYE);
        makeFlower(pRecipeOutput, AlfheimrBlocks.DIANTHUS_FLOWER, Items.MAGENTA_DYE);
        makeFlower(pRecipeOutput, AlfheimrBlocks.TITAN_CRANBERRY_VINCA_FLOWER, Items.MAGENTA_DYE);

        //Orange
        makeFlower(pRecipeOutput, AlfheimrBlocks.ORANGE_ZINNIA_FLOWER, Items.ORANGE_DYE);
        makeFlower(pRecipeOutput, AlfheimrBlocks.BEGONIA_FLOWER, Items.ORANGE_DYE);
        makeFlower(pRecipeOutput, AlfheimrBlocks.CROWN_IMPERIAL_FLOWER, Items.ORANGE_DYE);
        makeFlower(pRecipeOutput, AlfheimrBlocks.ORIENTAL_POPPY_FLOWER, Items.ORANGE_DYE);

        //Pink
        makeFlower(pRecipeOutput, AlfheimrBlocks.AZALEA_FLOWER, Items.PINK_DYE);
        makeFlower(pRecipeOutput, AlfheimrBlocks.PINK_DELIGHT_FLOWER, Items.PINK_DYE);
        makeFlower(pRecipeOutput, AlfheimrBlocks.CHRYSANTHEMUM_FLOWER, Items.PINK_DYE);
        makeFlower(pRecipeOutput, AlfheimrBlocks.HIBISCUS_FLOWER, Items.PINK_DYE);

        //Red
        makeFlower(pRecipeOutput, AlfheimrBlocks.CARDINAL_FLOWER, Items.RED_DYE);
        makeFlower(pRecipeOutput, AlfheimrBlocks.GERBERA_FLOWER, Items.RED_DYE);
        makeFlower(pRecipeOutput, AlfheimrBlocks.RED_TULIP_FLOWER, Items.RED_DYE);
        makeFlower(pRecipeOutput, AlfheimrBlocks.FREESIA_FLOWER, Items.RED_DYE);

        //White
        makeFlower(pRecipeOutput, AlfheimrBlocks.GARDENIAS_FLOWER, Items.WHITE_DYE);
        makeFlower(pRecipeOutput, AlfheimrBlocks.STAR_JASMINE_FLOWER, Items.WHITE_DYE);
        makeFlower(pRecipeOutput, AlfheimrBlocks.WHITE_WARATAH_FLOWER, Items.WHITE_DYE);
        makeFlower(pRecipeOutput, AlfheimrBlocks.FLANNEL_FLOWER, Items.WHITE_DYE);

        //Yellow
        makeFlower(pRecipeOutput, AlfheimrBlocks.BEARS_EARS_FLOWER, Items.YELLOW_DYE);
        makeFlower(pRecipeOutput, AlfheimrBlocks.BIDENS_FLOWER, Items.YELLOW_DYE);
        makeFlower(pRecipeOutput, AlfheimrBlocks.BLANKET_FLOWER, Items.YELLOW_DYE);
        makeFlower(pRecipeOutput, AlfheimrBlocks.BULBINE_FLOWER, Items.YELLOW_DYE);

        //Gray
        makeFlower(pRecipeOutput, AlfheimrBlocks.SILVER_BRUNIA_FLOWER, Items.GRAY_DYE);
        makeFlower(pRecipeOutput, AlfheimrBlocks.GRAY_ROSES_FLOWER, Items.GRAY_DYE);
        makeFlower(pRecipeOutput, AlfheimrBlocks.MOON_CARROT_FLOWER, Items.GRAY_DYE);
        makeFlower(pRecipeOutput, AlfheimrBlocks.SILVER_BABY_FLOWER, Items.GRAY_DYE);

        //Purple
        makeFlower(pRecipeOutput, AlfheimrBlocks.LAVENDER_FLOWER, Items.PURPLE_DYE);
        makeFlower(pRecipeOutput, AlfheimrBlocks.BELLFLOWER_FLOWER, Items.PURPLE_DYE);
        makeFlower(pRecipeOutput, AlfheimrBlocks.LILAC_FLOWER, Items.PURPLE_DYE);
        makeFlower(pRecipeOutput, AlfheimrBlocks.SWEET_PEA_FLOWER, Items.PURPLE_DYE);
    }
    public void transformRecipes(RecipeOutput pRecipeOutput) {
        TransformCircumstance water = TransformCircumstance.fluid(FluidTags.WATER);
    }

    private void makeFlower(RecipeOutput pRecipeOutput, Supplier<Block> flower, Item petal) {
        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, petal)
                .requires(flower.get())
                .unlockedBy("has_" + flower.get().getName(), inventoryTrigger(ItemPredicate.Builder.item().of(flower.get()).build()))
                .save(pRecipeOutput, LostWorldsApi.MODID + ":" + getItemName(petal) + "_from_" + getItemName(flower.get()));
    }

//    private void createBlastingRecipes(RecipeOutput pRecipeOutput, Block pIngredient, Item pResult) {
//        SimpleCookingRecipeBuilder.generic(Ingredient.of(pIngredient), RecipeCategory.BUILDING_BLOCKS, pResult, 0.25f, 200, RecipeSerializer.SMELTING_RECIPE)
//                .group(null)
//                .unlockedBy(getHasName(pIngredient), has(pIngredient))
//                .save(pRecipeOutput, LostWorldsApi.MODID + ":" + getItemName(pResult) + "_" + "smelting_from" + "_" + getItemName(pIngredient));
//
//        SimpleCookingRecipeBuilder.generic(Ingredient.of(pIngredient), RecipeCategory.BUILDING_BLOCKS, pResult, 0.25f, 100, RecipeSerializer.BLASTING_RECIPE)
//                .group(null)
//                .unlockedBy(getHasName(pIngredient), has(pIngredient))
//                .save(pRecipeOutput, LostWorldsApi.MODID + ":" + getItemName(pResult) + "_" + "blasting_from" + "_" + getItemName(pIngredient));
//    }

//    private void createAlloyRecipes(RecipeOutput pRecipeOutput, String brass, Item ingredient1, Item ingredient2, Item outPutItem, Block block, Item nugget) {
//        createAlloy(pRecipeOutput, ingredient1, ingredient2, outPutItem, 1);
//        nineBlockStorageRecipesForMetals(pRecipeOutput, outPutItem, block);
//        nineBlockStorageRecipesForMetals(pRecipeOutput, nugget, outPutItem);
//    }

//    private void createAlloy(RecipeOutput pRecipeOutput, Item ingredient1, Item ingredient2, Item outPutItem, int count) {
//        new AlloySmelterRecipeBuilder(ingredient1, ingredient2, outPutItem, count)
//                .unlockedBy("has_brass_alloy_base", has(ingredient1)).save(pRecipeOutput);
//    }

    private static void createWoodRecipes(RecipeOutput pRecipeOutput, String pName, TagKey<Block> pLog, TagKey<Block> pStrippedLog, Block pPlank,Block pStair, Block pSlab, Block pFence,
                                          Block pGate, Block pDoor, Block pTrap, Block pPlate, Block pButton, ItemLike pSign, ItemLike pHangingSign) {
        //Planks
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, pPlank, 4)
                .requires(ModTags.getItemTag(pLog)).unlockedBy("has_" + pName, inventoryTrigger(ItemPredicate.Builder.item().of(ModTags.getItemTag(pLog)).build()))
                .save(pRecipeOutput);

        //Stairs
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, pStair, 4)
                .pattern("A  ")
                .pattern("AA ")
                .pattern("AAA")
                .define('A', pPlank)
                .unlockedBy("has_" + pName, inventoryTrigger(ItemPredicate.Builder.item().of(pPlank).build()))
                .save(pRecipeOutput);

        //Slab
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, pSlab, 6)
                .pattern("AAA")
                .define('A', pPlank)
                .unlockedBy("has_" + pName, inventoryTrigger(ItemPredicate.Builder.item().of(pPlank).build()))
                .save(pRecipeOutput);

        //Fence
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, pFence, 3)
                .pattern("ABA")
                .pattern("ABA")
                .define('A', pPlank)
                .define('B', Items.STICK)
                .unlockedBy("has_" + pName, inventoryTrigger(ItemPredicate.Builder.item().of(pPlank).build()))
                .save(pRecipeOutput);

        //Gate
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, pGate, 1)
                .pattern("ABA")
                .pattern("ABA")
                .define('A', Items.STICK)
                .define('B', pPlank)
                .unlockedBy("has_" + pName, inventoryTrigger(ItemPredicate.Builder.item().of(pPlank).build()))
                .save(pRecipeOutput);

        //Door
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, pDoor, 3)
                .pattern("AA")
                .pattern("AA")
                .pattern("AA")
                .define('A', pPlank)
                .unlockedBy("has_" + pName, inventoryTrigger(ItemPredicate.Builder.item().of(pPlank).build()))
                .save(pRecipeOutput);

        //Trapdoor
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, pTrap, 2)
                .pattern("AAA")
                .pattern("AAA")
                .define('A', pPlank)
                .unlockedBy("has_" + pName, inventoryTrigger(ItemPredicate.Builder.item().of(pPlank).build()))
                .save(pRecipeOutput);

        //Pressureplate
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, pPlate, 1)
                .pattern("AA")
                .define('A', pPlank)
                .unlockedBy("has_" + pName, inventoryTrigger(ItemPredicate.Builder.item().of(pPlank).build()))
                .save(pRecipeOutput);

        //Button
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, pButton, 1)
                .requires(pPlank)
                .unlockedBy("has_" + pName, inventoryTrigger(ItemPredicate.Builder.item().of(pPlank).build()))
                .save(pRecipeOutput);

        //Sign
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, pSign, 3)
                .pattern("AAA")
                .pattern("AAA")
                .pattern(" B ")
                .define('A', pPlank)
                .define('B', Items.STICK)
                .unlockedBy("has_" + pName, inventoryTrigger(ItemPredicate.Builder.item().of(pPlank).build()))
                .save(pRecipeOutput);

        //Hanging Sign
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, pHangingSign, 6)
                .pattern("B B")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModTags.getItemTag(pStrippedLog))
                .define('B', Blocks.CHAIN)
                .unlockedBy("has_" + pName, inventoryTrigger(ItemPredicate.Builder.item().of(pPlank).build()))
                .save(pRecipeOutput);
    }

    private static void createStoneGeoRecipes(RecipeOutput pRecipeOutput, Block stone, Block stone_stairs, Block stone_slab,
                                              Block cobble, Block cobble_stairs, Block cobble_slab, Block bricks, Block brick_stairs,
                                              Block brick_slab, Block button, Block pressure_plate,
                                              Block wall, Block cobble_wall, Block stone_wall) {
        String name = stone.getName().toString();

        createStoneRecipes(pRecipeOutput, name, stone, stone_stairs, stone_slab);
        createStoneRecipes(pRecipeOutput, name + "_cobble", cobble, cobble_stairs, cobble_slab);
        createStoneRecipes(pRecipeOutput, name + "_bricks", bricks, brick_stairs, brick_slab);

        createWallRecipe(pRecipeOutput, stone, wall);
        createWallRecipe(pRecipeOutput, cobble, cobble_wall);
        createWallRecipe(pRecipeOutput, bricks, stone_wall);

//        oreSmelting(pRecipeOutput, cobble, RecipeCategory.MISC, stone, 0, 200, name);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, bricks, 4)
                .pattern("AA")
                .pattern("AA")
                .define('A', stone)
                .unlockedBy("has_" + name, inventoryTrigger(ItemPredicate.Builder.item().of(stone).build()))
                .save(pRecipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, button)
                .requires(stone)
                .unlockedBy("has_" + name, inventoryTrigger(ItemPredicate.Builder.item().of(stone).build()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, pressure_plate)
                .pattern("AA")
                .define('A', stone)
                .unlockedBy("has_" + name, inventoryTrigger(ItemPredicate.Builder.item().of(stone).build()))
                .save(pRecipeOutput);
    }

    private static void createWallRecipe(RecipeOutput pRecipeOutput, Block stone, Block wall) {
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, wall, 6)
                .pattern("AAA")
                .pattern("AAA")
                .define('A', stone)
                .unlockedBy(stone.getName().toString() + "_to_" + wall.getName().toString(), inventoryTrigger(ItemPredicate.Builder.item().of(stone).build()))
                .save(pRecipeOutput);
    }

    private static void createStoneRecipes(RecipeOutput pRecipeOutput, String name, Block sStone, Block sStairs, Block sSlab) {
        //slab(pRecipeOutput, RecipeCategory.BUILDING_BLOCKS, sSlab, sStone);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, sStairs, 4)
                .pattern("A  ")
                .pattern("AA ")
                .pattern("AAA")
                .define('A', sStone)
                .unlockedBy("has_" + name, inventoryTrigger(ItemPredicate.Builder.item().of(sStone).build()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, sSlab, 3)
                .pattern("AAA")
                .define('A', sStone)
                .unlockedBy("has_" + name, inventoryTrigger(ItemPredicate.Builder.item().of(sStone).build()))
                .save(pRecipeOutput);
    }

    private static void createOreRecipes(RecipeOutput pRecipeOutput, String name, List<ItemLike> cookingIngredients, Item ingot, Block ingot_block, Item raw, Block raw_block, Item nugget) {
//        nineBlockStorageRecipesForMetals(pRecipeOutput, ingot, ingot_block);
//        nineBlockStorageRecipesForMetals(pRecipeOutput, raw, raw_block);
//        nineBlockStorageRecipesForMetals(pRecipeOutput, nugget, ingot);

        oreSmelting(pRecipeOutput, cookingIngredients, RecipeCategory.MISC, ingot, 0.25f, 200, name);
        oreBlasting(pRecipeOutput, cookingIngredients, RecipeCategory.MISC, ingot, 0.25f, 100, name);
    }

    private static void createTools(RecipeOutput pRecipeOutput, String name, Item ingot,
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
                .save(pRecipeOutput);

        //Shovel
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, shovel)
                .pattern("A")
                .pattern("S")
                .pattern("S")
                .define('A', ingot)
                .define('S', Items.STICK)
                .unlockedBy("has_" + name, inventoryTrigger(ItemPredicate.Builder.item().of(shovel).build()))
                .save(pRecipeOutput);

        //Axe
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, axe)
                .pattern("AA")
                .pattern("AS")
                .pattern(" S")
                .define('A', ingot)
                .define('S', Items.STICK)
                .unlockedBy("has_" + name, inventoryTrigger(ItemPredicate.Builder.item().of(axe).build()))
                .save(pRecipeOutput);

        //Sword
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, sword)
                .pattern("A")
                .pattern("A")
                .pattern("S")
                .define('A', ingot)
                .define('S', Items.STICK)
                .unlockedBy("has_" + name, inventoryTrigger(ItemPredicate.Builder.item().of(sword).build()))
                .save(pRecipeOutput);

        //Hoe
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, hoe)
                .pattern("AA")
                .pattern(" S")
                .pattern(" S")
                .define('A', ingot)
                .define('S', Items.STICK)
                .unlockedBy("has_" + name, inventoryTrigger(ItemPredicate.Builder.item().of(hoe).build()))
                .save(pRecipeOutput);

        //Helmet
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, helmet)
                .pattern("AAA")
                .pattern("A A")
                .define('A', ingot)
                .unlockedBy("has_" + name, inventoryTrigger(ItemPredicate.Builder.item().of(helmet).build()))
                .save(pRecipeOutput);

        //Chestplate
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, chestplate)
                .pattern("A A")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ingot)
                .unlockedBy("has_" + name, inventoryTrigger(ItemPredicate.Builder.item().of(chestplate).build()))
                .save(pRecipeOutput);

        //Leggings
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, leggings)
                .pattern("AAA")
                .pattern("A A")
                .pattern("A A")
                .define('A', ingot)
                .unlockedBy("has_" + name, inventoryTrigger(ItemPredicate.Builder.item().of(leggings).build()))
                .save(pRecipeOutput);

        //Boots
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, boots)
                .pattern("A A")
                .pattern("A A")
                .define('A', ingot)
                .unlockedBy("has_" + name, inventoryTrigger(ItemPredicate.Builder.item().of(boots).build()))
                .save(pRecipeOutput);
    }

    /**
     * This function simplifies crafting the portal frames.
     * @param pRecipeOutput Connect recipe to writer
     * @param pResult What portal frame is this making?
     * @param pFrame What block is the frame of this portal block.
     * @param pEssence What block/item is the essence of the dimension we want to access.
     */
    protected static void craftPortalFrame(RecipeOutput pRecipeOutput, ItemLike pResult, ItemLike pPortalCore, ItemLike pFrame, ItemLike pEssence) {
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, pResult)
                .pattern("FSF")
                .pattern("SES")
                .pattern("FSF")
                .define('E', pPortalCore)
                .define('F', pFrame)
                .define('S', pEssence)
                .unlockedBy("has_" + getItemName(pPortalCore), inventoryTrigger(ItemPredicate.Builder.item().of(pResult).build()))
                .save(pRecipeOutput);
    }

    /**
     * This function simplifies crafting the portal activator.
     * @param pRecipeOutput Connect recipe to writer
     * @param pResult What tier is the portal activator that this is making?
     * @param pPortalCore What core tier is this portal activator.
     */
    protected static void craftPortalActivator(RecipeOutput pRecipeOutput, ItemLike pResult, ItemLike pPortalCore) {
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, pResult)
                .pattern("E")
                .pattern("F")
                .pattern("F")
                .define('E', pPortalCore)
                .define('F', Items.BLAZE_ROD)
                .unlockedBy("has_" + getItemName(pPortalCore), inventoryTrigger(ItemPredicate.Builder.item().of(pResult).build()))
                .save(pRecipeOutput);
    }

    /**
     * This function simplifies crafting the portal core.
     * @param pRecipeOutput Connect recipe to writer
     * @param pResult What tier for the portal core is this making?
     * @param pPortalCore The core ingredient that defines the tier of the core.
     * @param pPortalEssence The essence to upgrade the tier of the core.
     */
    protected static void craftPortalCore(RecipeOutput pRecipeOutput, ItemLike pResult, ItemLike pPortalCore, ItemLike pPortalEssence) {
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, pResult)
                .pattern("FFF")
                .pattern("FEF")
                .pattern("FFF")
                .define('E', pPortalCore)
                .define('F', pPortalEssence)
                .unlockedBy("has_" + getItemName(pPortalCore), inventoryTrigger(ItemPredicate.Builder.item().of(pResult).build()))
                .save(pRecipeOutput);
    }

    /**
     * This function simplifies crafting the portal core.
     * @param pRecipeOutput Connect recipe to writer
     * @param pResult What tier for the portal core is this making?
     * @param pPortalCore The core ingredient that defines the tier of the core.
     * @param pPortalEssence The essence to upgrade the tier of the core.
     */
    protected static void craftPortalCore(RecipeOutput pRecipeOutput, ItemLike pResult, ItemLike pPortalCore, TagKey<Item> pPortalEssence) {
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, pResult)
                .pattern("FFF")
                .pattern("FEF")
                .pattern("FFF")
                .define('E', pPortalCore)
                .define('F', pPortalEssence)
                .unlockedBy("has_" + getItemName(pPortalCore), inventoryTrigger(ItemPredicate.Builder.item().of(pResult).build()))
                .save(pRecipeOutput);
    }

    /**
     * This function simplifies crafting the portal frames.
     * @param pRecipeOutput Connect recipe to writer
     * @param pResult What portal frame is this making?
     * @param pFrame What block is the frame of this portal block.
     * @param pEssence What block/item is the essence of the dimension we want to access.
     */
    protected static void craftPortalFrame(RecipeOutput pRecipeOutput, ItemLike pResult, ItemLike pPortalCore, TagKey<Item> pFrame, ItemLike pEssence) {
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, pResult)
                .pattern("FSF")
                .pattern("SES")
                .pattern("FSF")
                .define('E', pPortalCore)
                .define('F', pFrame)
                .define('S', pEssence)
                .unlockedBy("has_" + getItemName(pPortalCore), inventoryTrigger(ItemPredicate.Builder.item().of(pResult).build()))
                .save(pRecipeOutput);
    }

    /**
     * This function simplifies crafting the portal frames.
     * @param pRecipeOutput Connect recipe to writer
     * @param pResult What portal frame is this making?
     * @param pFrame What block is the frame of this portal block.
     * @param pEssence What block/item is the essence of the dimension we want to access.
     */
    protected static void craftPortalFrame(RecipeOutput pRecipeOutput, ItemLike pResult, ItemLike pPortalCore, ItemLike pFrame, TagKey<Item> pEssence) {
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, pResult)
                .pattern("FSF")
                .pattern("SES")
                .pattern("FSF")
                .define('E', pPortalCore)
                .define('F', pFrame)
                .define('S', pEssence)
                .unlockedBy("has_" + getItemName(pPortalCore), inventoryTrigger(ItemPredicate.Builder.item().of(pResult).build()))
                .save(pRecipeOutput);
    }

    /**
     * This function simplifies crafting the portal frames.
     * @param pRecipeOutput Connect recipe to writer
     * @param pResult What portal frame is this making?
     * @param pFrame What block is the frame of this portal block.
     * @param pEssence What block/item is the essence of the dimension we want to access.
     */
//    protected static void craftPortalFrame(RecipeOutput pRecipeOutput, ItemLike pResult, ItemLike pPortalCore, TagKey<Item> pFrame, TagKey<Item> pEssence) {
//        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, pResult)
//                .pattern("FSF")
//                .pattern("SES")
//                .pattern("FSF")
//                .define('E', pPortalCore)
//                .define('F', pFrame)
//                .define('S', pEssence)
//                .unlockedBy("has_" + getItemName(pPortalCore), inventoryTrigger(ItemPredicate.Builder.item().of(pResult).build()))
//                .save(pRecipeOutput);
//    }
//
//    protected static void nineBlockStorageRecipesForMetals(RecipeOutput pRecipeOutput, Item item, Block block) {
//        nineBlockStorageRecipes(pRecipeOutput, RecipeCategory.MISC, item, RecipeCategory.MISC, block,
//                LostWorldsApi.MODID + ":" + getItemName(item) + "_from_block", null,
//                LostWorldsApi.MODID + ":" + getItemName(block), null);
//    }
//
//    protected static void nineBlockStorageRecipesForMetals(RecipeOutput pRecipeOutput, Item item, Item outputItem) {
//        nineBlockStorageRecipes(pRecipeOutput, RecipeCategory.MISC, item, RecipeCategory.MISC, outputItem,
//                LostWorldsApi.MODID + ":" + getItemName(item), null,
//                LostWorldsApi.MODID + ":" + getItemName(outputItem) + "_from_nugget", null);
//    }
//
//    protected static void oreSmelting(Consumer<FinishedRecipe> pFinishedRecipeConsumer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult,
//                                      float pExperience, int pCookingTIme, String pGroup) {
//        oreCooking(pFinishedRecipeConsumer, RecipeSerializer.SMELTING_RECIPE, pIngredients, pCategory, pResult,
//                pExperience, pCookingTIme, pGroup, "_from_smelting");
//    }
//
//    protected static void oreSmelting(Consumer<FinishedRecipe> pFinishedRecipeConsumer, ItemLike pIngredients, RecipeCategory pCategory, ItemLike pResult,
//                                      float pExperience, int pCookingTIme, String pGroup) {
//        oreCooking(pFinishedRecipeConsumer, RecipeSerializer.SMELTING_RECIPE, pIngredients, pCategory, pResult,
//                pExperience, pCookingTIme, pGroup, "_from_smelting");
//    }
//
//    protected static void oreBlasting(Consumer<FinishedRecipe> pFinishedRecipeConsumer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult,
//                                      float pExperience, int pCookingTime, String pGroup) {
//        oreCooking(pFinishedRecipeConsumer, RecipeSerializer.BLASTING_RECIPE, pIngredients, pCategory, pResult,
//                pExperience, pCookingTime, pGroup, "_from_blasting");
//    }
//
//    protected static <T extends AbstractCookingRecipe> void oreCooking(Consumer<FinishedRecipe> pFinishedRecipeConsumer, RecipeSerializer<? extends AbstractCookingRecipe> pCookingSerializer,
//                                     List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime,
//                                     String pGroup, String pRecipeName) {
//        for(ItemLike itemlike : pIngredients) {
//            SimpleCookingRecipeBuilder.generic(Ingredient.of(itemlike), pCategory, pResult, pExperience, pCookingTime,
//                    pCookingSerializer).group(pGroup).unlockedBy(getHasName(itemlike), has(itemlike))
//                    .save(pFinishedRecipeConsumer, LostWorldsApi.MODID + ":" + getItemName(pResult) + pRecipeName + "_" + getItemName(itemlike));
//        }
//
//    }
//
//    private static void createSmokingRecipes(RecipeOutput pRecipeOutput, Item pIngredient, Item pResult) {
//        SimpleCookingRecipeBuilder.generic(Ingredient.of(pIngredient), RecipeCategory.FOOD, pResult, 0.25f, 200, RecipeSerializer.SMOKING_RECIPE)
//                .group(null)
//                .unlockedBy(getHasName(pIngredient), has(pIngredient))
//                .save(pRecipeOutput, LostWorldsApi.MODID + ":" + getItemName(pResult) + "_" + "cooked_from" + "_" + getItemName(pIngredient));
//    }
//
//    private static void createSmeltingRecipes(RecipeOutput pRecipeOutput, ItemLike pIngredient, ItemLike pResult) {
//        SimpleCookingRecipeBuilder.generic(Ingredient.of(pIngredient), RecipeCategory.BUILDING_BLOCKS, pResult, 0.25f, 200, RecipeSerializer.SMELTING_RECIPE)
//                .group(null)
//                .unlockedBy(getHasName(pIngredient), has(pIngredient))
//                .save(pRecipeOutput, LostWorldsApi.MODID + ":" + getItemName(pResult) + "_" + "smelting_from" + "_" + getItemName(pIngredient));
//    }
//
//    protected static void oreCooking(Consumer<FinishedRecipe> pFinishedRecipeConsumer, RecipeSerializer<? extends AbstractCookingRecipe> pCookingSerializer,
//                                     ItemLike pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime,
//                                     String pGroup, String pRecipeName) {
//
//        SimpleCookingRecipeBuilder.generic(Ingredient.of(pIngredients), pCategory, pResult, pExperience, pCookingTime,
//                    pCookingSerializer).group(pGroup).unlockedBy(getHasName(pIngredients), has(pIngredients))
//                    .save(pFinishedRecipeConsumer, LostWorldsApi.MODID + ":" + getItemName(pResult) + pRecipeName + "_" + getItemName(pIngredients));
//    }
}
