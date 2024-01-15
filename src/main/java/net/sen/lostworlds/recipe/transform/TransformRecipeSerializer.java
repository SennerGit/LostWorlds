/*
Taken from Applied Energistics
https://github.com/AppliedEnergistics/Applied-Energistics-2/blob/main/src/main/java/appeng/recipes/transform/TransformRecipeBuilder.java#L12
 */

package net.sen.lostworlds.recipe.transform;

import com.google.gson.JsonObject;

import org.jetbrains.annotations.Nullable;

import net.minecraft.core.NonNullList;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.FluidTags;
import net.minecraft.util.GsonHelper;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.item.crafting.ShapedRecipe;

public class TransformRecipeSerializer implements RecipeSerializer<TransformRecipe> {

    public static final TransformRecipeSerializer INSTANCE = new TransformRecipeSerializer();

    private TransformRecipeSerializer() {
    }

    @Override
    public TransformRecipe fromJson(ResourceLocation recipeId, JsonObject json) {
        NonNullList<Ingredient> ingredients = NonNullList.create();
        GsonHelper.getAsJsonArray(json, "ingredients")
                .forEach(ingredient -> ingredients.add(Ingredient.fromJson(ingredient)));

        ItemStack result = ShapedRecipe.itemStackFromJson(GsonHelper.getAsJsonObject(json, "result"));
        TransformCircumstance circumstance = json.has("circumstance")
                ? TransformCircumstance.fromJson(GsonHelper.getAsJsonObject(json, "circumstance"))
                : TransformCircumstance.fluid(FluidTags.WATER);
        return new TransformRecipe(recipeId, ingredients, result, circumstance);
    }

    @Nullable
    @Override
    public TransformRecipe fromNetwork(ResourceLocation recipeId, FriendlyByteBuf buffer) {
        ItemStack output = buffer.readItem();

        int size = buffer.readByte();
        NonNullList<Ingredient> ingredients = NonNullList.create();
        for (int i = 0; i < size; i++) {
            ingredients.add(Ingredient.fromNetwork(buffer));
        }
        TransformCircumstance circumstance = TransformCircumstance.fromNetwork(buffer);

        return new TransformRecipe(recipeId, ingredients, output, circumstance);
    }

    @Override
    public void toNetwork(FriendlyByteBuf buffer, TransformRecipe recipe) {
        buffer.writeItem(recipe.output);
        buffer.writeByte(recipe.ingredients.size());
        recipe.ingredients.forEach(ingredient -> ingredient.toNetwork(buffer));
        recipe.circumstance.toNetwork(buffer);
    }
}