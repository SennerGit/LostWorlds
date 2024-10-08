///*
//Taken from Applied Energistics
//https://github.com/AppliedEnergistics/Applied-Energistics-2/blob/main/src/main/java/appeng/recipes/transform/TransformRecipeBuilder.java#L12
// */
//
//package net.sen.lostworlds.recipe.transform;
//
//import java.util.List;
//import java.util.function.Consumer;
//import java.util.stream.Stream;
//
//import com.google.gson.JsonArray;
//import com.google.gson.JsonObject;
//
//import net.minecraft.data.recipes.RecipeOutput;
//import net.minecraft.world.item.crafting.Recipe;
//import org.jetbrains.annotations.NotNull;
//import org.jetbrains.annotations.Nullable;
//
//import net.minecraft.core.registries.BuiltInRegistries;
//import net.minecraft.data.recipes.FinishedRecipe;
//import net.minecraft.resources.ResourceLocation;
//import net.minecraft.world.item.crafting.Ingredient;
//import net.minecraft.world.item.crafting.RecipeSerializer;
//import net.minecraft.world.level.ItemLike;
//
//public class TransformRecipeBuilder {
//    public static void transform(Consumer<RecipeOutput> consumer, ResourceLocation id, ItemLike output, int count,
//                                 TransformCircumstance circumstance, ItemLike... inputs) {
//        consumer.accept(new RecipeOutput(id, Stream.of(inputs).map(Ingredient::of).toList(), output, count, circumstance));
//    }
//
//    public static void transform(Consumer<RecipeOutput> consumer, ResourceLocation id, ItemLike output, int count,
//                                 TransformCircumstance circumstance, Ingredient... inputs) {
//        consumer.accept(new Result(id, List.of(inputs), output, count, circumstance));
//    }
//
//    record Result(ResourceLocation id, List<Ingredient> ingredients, ItemLike output, int count,
//                  TransformCircumstance circumstance) implements FinishedRecipe {
//
//        @Override
//        public void serializeRecipeData(@NotNull JsonObject json) {
//            JsonObject stackObj = new JsonObject();
//            stackObj.addProperty("item", BuiltInRegistries.ITEM.getKey(output.asItem()).toString());
//            if (count > 1) {
//                stackObj.addProperty("count", count);
//            }
//            json.add("result", stackObj);
//
//            JsonArray inputs = new JsonArray();
//            ingredients.forEach(ingredient -> inputs.add(ingredient.toJson()));
//            json.add("ingredients", inputs);
//            json.add("circumstance", circumstance.toJson());
//        }
//
//        @Override
//        public ResourceLocation getId() {
//            return id;
//        }
//
//        @Override
//        public RecipeSerializer<?> getType() {
//            return TransformRecipeSerializer.INSTANCE;
//        }
//
//        @Nullable
//        @Override
//        public JsonObject serializeAdvancement() {
//            return null;
//        }
//
//        @Nullable
//        @Override
//        public ResourceLocation getAdvancementId() {
//            return null;
//        }
//    }
//}
