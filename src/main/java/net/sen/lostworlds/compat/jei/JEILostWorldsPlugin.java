package net.sen.lostworlds.compat.jei;

import mezz.jei.api.IModPlugin;
import mezz.jei.api.JeiPlugin;
import mezz.jei.api.registration.IGuiHandlerRegistration;
import mezz.jei.api.registration.IRecipeCategoryRegistration;
import mezz.jei.api.registration.IRecipeRegistration;
import net.minecraft.client.Minecraft;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.crafting.RecipeManager;
import net.sen.lostworlds.LostWorldsApi;
import net.sen.lostworlds.compat.jei.AlloySmelterRecipeCategory;
import net.sen.lostworlds.recipe.AlloySmelterRecipe;
import net.sen.lostworlds.screen.alloysmelter.AlloySmelterScreen;

import java.util.List;

@JeiPlugin
public class JEILostWorldsPlugin implements IModPlugin {
    @Override
    public ResourceLocation getPluginUid() {
        return new ResourceLocation(LostWorldsApi.MODID, "jei_plugin");
    }

    @Override
    public void registerCategories(IRecipeCategoryRegistration registration) {
        registration.addRecipeCategories(new AlloySmelterRecipeCategory(
                registration.getJeiHelpers().getGuiHelper()
        ));
    }

    @Override
    public void registerRecipes(IRecipeRegistration registration) {
        RecipeManager recipeManager = Minecraft.getInstance().level.getRecipeManager();
        List<AlloySmelterRecipe> alloySmelterRecipes = recipeManager.getAllRecipesFor(AlloySmelterRecipe.Type.INSTANCE);
        registration.addRecipes(AlloySmelterRecipeCategory.ALLOY_SMELTER_RECIPE_RECIPE_TYPE, alloySmelterRecipes);
    }

    @Override
    public void registerGuiHandlers(IGuiHandlerRegistration registration) {
        registration.addRecipeClickArea(AlloySmelterScreen.class, 79, 35, 23, 16,
                AlloySmelterRecipeCategory.ALLOY_SMELTER_RECIPE_RECIPE_TYPE);
    }
}
