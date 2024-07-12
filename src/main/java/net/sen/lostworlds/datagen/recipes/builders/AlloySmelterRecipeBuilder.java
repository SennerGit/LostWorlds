//package net.sen.lostworlds.datagen.recipes.builders;
//
//import com.google.gson.JsonArray;
//import com.google.gson.JsonObject;
//import net.minecraft.advancements.*;
//import net.minecraft.advancements.critereon.RecipeUnlockedTrigger;
//import net.minecraft.core.registries.BuiltInRegistries;
//import net.minecraft.core.registries.Registries;
//import net.minecraft.data.recipes.RecipeBuilder;
//import net.minecraft.data.recipes.RecipeOutput;
//import net.minecraft.resources.ResourceLocation;
//import net.minecraft.world.item.Item;
//import net.minecraft.world.item.crafting.Ingredient;
//import net.minecraft.world.item.crafting.RecipeSerializer;
//import net.minecraft.world.level.ItemLike;
//import net.neoforged.neoforge.registries.NeoForgeRegistries;
//import net.sen.lostworlds.api.LostWorldsApi;
//import net.sen.lostworlds.datagen.ModAdvancementsProvider;
//
//import javax.annotation.Nullable;
//import java.util.function.Consumer;
//
//public class AlloySmelterRecipeBuilder implements RecipeBuilder {
//    private final Item result;
//    private final Ingredient ingredient1;
//    private final Ingredient ingredient2;
//    private final int count;
//    private final Advancement.Builder advancement = Advancement.Builder.advancement();
//
//    public AlloySmelterRecipeBuilder(ItemLike ingredient1, ItemLike ingredient2, ItemLike result, int count) {
//        this.ingredient1 = Ingredient.of(ingredient1);
//        this.ingredient2 = Ingredient.of(ingredient2);
//        this.result = result.asItem();
//        this.count = count;
//    }
//
//    @Override
//    public RecipeBuilder unlockedBy(String pCriterionName, Criterion<?> pCriterion) {
//        this.advancement.addCriterion(pCriterionName, pCriterion);
//        return this;
//    }
//
//    @Override
//    public RecipeBuilder group(@Nullable String pGroupName) {
//        return this;
//    }
//
//    @Override
//    public Item getResult() {
//        return result;
//    }
//
//    @Override
//    public void save(RecipeOutput recipeOutput, ResourceLocation pRecipeId) {
////        this.advancement.parent(ModAdvancementsProvider.BaseAdvancements))
////                .addCriterion("has_the_recipe", RecipeUnlockedTrigger.unlocked(pRecipeId))
////                .rewards(AdvancementRewards.Builder.recipe(pRecipeId)).requirements(AdvancementRequirements.Strategy.OR);
//
////        recipeOutput.accept(new Result(pRecipeId, this.result, this.count, this.ingredient1, this.ingredient2,
////                this.advancement, LostWorldsApi.customLoc(pRecipeId.getNamespace(), "recipes/"
////                + pRecipeId.getPath())));
//
//    }
//
////    public static class Result implements RecipeOutput {
////        private final ResourceLocation id;
////        private final Item result;
////        private final Ingredient ingredient1;
////        private final Ingredient ingredient2;
////        private final int count;
////        private final Advancement.Builder advancement;
////        private final ResourceLocation advancementId;
////
////        public Result(ResourceLocation pId, Item pResult, int pCount, Ingredient ingredient1, Ingredient ingredient2, Advancement.Builder pAdvancement,
////                      ResourceLocation pAdvancementId) {
////            this.id = pId;
////            this.result = pResult;
////            this.count = pCount;
////            this.ingredient1 = ingredient1;
////            this.ingredient2 = ingredient2;
////            this.advancement = pAdvancement;
////            this.advancementId = pAdvancementId;
////        }
////
////        @Override
////        public void serializeRecipeData(JsonObject pJson) {
////            JsonArray jsonarray = new JsonArray();
////            jsonarray.add(ingredient1.toJson());
////            jsonarray.add(ingredient2.toJson());
////
////            pJson.add("ingredients", jsonarray);
////            JsonObject jsonobject = new JsonObject();
////            jsonobject.addProperty("item", Registries.ITEM.getKey(this.result).toString());
////            if (this.count > 1) {
////                jsonobject.addProperty("count", this.count);
////            }
////
////            pJson.add("output", jsonobject);
////        }
////
////        @Override
////        public ResourceLocation getId() {
////            return LostWorldsApi.modLoc(
////                    BuiltInRegistries.ITEM.getKey(this.result).getPath() + "_from_alloy_smelter"
////            );
////        }
////
////        @Override
////        public RecipeSerializer<?> getType() {
////            return AlloySmelterRecipe.AlloySmithSerializer.INSTANCE;
////        }
////
////        @javax.annotation.Nullable
////        public JsonObject serializeAdvancement() {
////            return this.advancement.serializeToJson();
////        }
////
////        @javax.annotation.Nullable
////        public ResourceLocation getAdvancementId() {
////            return this.advancementId;
////        }
////    }
//}
