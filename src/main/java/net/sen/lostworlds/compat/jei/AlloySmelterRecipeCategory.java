package net.sen.lostworlds.compat.jei;

import mezz.jei.api.constants.VanillaTypes;
import mezz.jei.api.gui.builder.IRecipeLayoutBuilder;
import mezz.jei.api.gui.drawable.IDrawable;
import mezz.jei.api.helpers.IGuiHelper;
import mezz.jei.api.recipe.IFocusGroup;
import mezz.jei.api.recipe.RecipeIngredientRole;
import mezz.jei.api.recipe.RecipeType;
import mezz.jei.api.recipe.category.IRecipeCategory;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.Recipe;
import net.sen.lostworlds.LostWorlds;
import net.sen.lostworlds.LostWorldsConstants;
import net.sen.lostworlds.block.ModBlocks;
import net.sen.lostworlds.block.entity.AlloySmelterBlockEntity;
import net.sen.lostworlds.recipe.AlloySmelterRecipe;
import net.sen.lostworlds.util.tools.SlotsVector;

public class AlloySmelterRecipeCategory implements IRecipeCategory<AlloySmelterRecipe> {
    public static final ResourceLocation UID = LostWorldsConstants.modLoc("alloy_smelter");
    public static final ResourceLocation TEXTURE = LostWorldsConstants.modLoc(
            "textures/gui/container/alloy_smelter_gui.png");

    private static final SlotsVector INPUT_1_SLOT = AlloySmelterBlockEntity.INPUT_1_SLOT;
    private static final SlotsVector INPUT_2_SLOT = AlloySmelterBlockEntity.INPUT_2_SLOT;
    private static final SlotsVector FUEL_SLOT = AlloySmelterBlockEntity.FUEL_SLOT;
    private static final SlotsVector OUTPUT_SLOT = AlloySmelterBlockEntity.OUTPUT_SLOT;

    public static final RecipeType<AlloySmelterRecipe> ALLOY_SMELTER_RECIPE_RECIPE_TYPE =
            new RecipeType<>(UID, AlloySmelterRecipe.class);

    private final IDrawable background;
    private final IDrawable icon;

    public AlloySmelterRecipeCategory(IGuiHelper helper) {
        this.background = helper.createDrawable(TEXTURE, 0, 0, 176, 85);
        this.icon = helper.createDrawableIngredient(VanillaTypes.ITEM_STACK, new ItemStack(ModBlocks.ALLOY_SMELTER.get()));
    }

    @Override
    public RecipeType<AlloySmelterRecipe> getRecipeType() {
        return ALLOY_SMELTER_RECIPE_RECIPE_TYPE;
    }

    @Override
    public Component getTitle() {
        return Component.literal("Alloy Smelter");
    }

    @Override
    public IDrawable getBackground() {
        return this.background;
    }

    @Override
    public IDrawable getIcon() {
        return this.icon;
    }

    @Override
    public void setRecipe(IRecipeLayoutBuilder builder, AlloySmelterRecipe recipe, IFocusGroup focuses) {
        builder.addSlot(RecipeIngredientRole.INPUT, INPUT_1_SLOT.getPosX(), INPUT_1_SLOT.getPosY()).addIngredients(recipe.getIngredients().get(0));
        builder.addSlot(RecipeIngredientRole.INPUT, INPUT_2_SLOT.getPosX(), INPUT_2_SLOT.getPosY()).addIngredients(recipe.getIngredients().get(1));
//        builder.addSlot(RecipeIngredientRole.CATALYST, FUEL_SLOT.getPosX(), FUEL_SLOT.getPosY());
        builder.addSlot(RecipeIngredientRole.OUTPUT, OUTPUT_SLOT.getPosX(), OUTPUT_SLOT.getPosY()).addItemStack(recipe.getResultItem(null));
    }
}
