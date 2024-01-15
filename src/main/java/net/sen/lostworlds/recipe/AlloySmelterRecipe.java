package net.sen.lostworlds.recipe;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import net.minecraft.core.NonNullList;
import net.minecraft.core.RegistryAccess;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.GsonHelper;
import net.minecraft.world.SimpleContainer;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.*;
import net.minecraft.world.level.Level;
import net.sen.lostworlds.LostWorldsApi;
import net.sen.lostworlds.block.entity.AlloySmelterBlockEntity;
import net.sen.lostworlds.util.tools.SlotsVector;

public class AlloySmelterRecipe implements Recipe<SimpleContainer> {
    private final ResourceLocation id;
    private NonNullList<Ingredient> ingredients;
    private final ItemStack result;
    private final float experience;
    private final int cookingTime;

    private static final SlotsVector INPUT_1_SLOT = AlloySmelterBlockEntity.INPUT_1_SLOT;
    private static final SlotsVector INPUT_2_SLOT = AlloySmelterBlockEntity.INPUT_2_SLOT;
    private static final SlotsVector FUEL_SLOT = AlloySmelterBlockEntity.FUEL_SLOT;
    private static final SlotsVector OUTPUT_SLOT = AlloySmelterBlockEntity.OUTPUT_SLOT;

    public AlloySmelterRecipe(ResourceLocation id, Ingredient ingredient_1, Ingredient ingredient_2, ItemStack result, float experience, int cookingTime) {
        NonNullList<Ingredient> newList = null;

        newList.add(ingredient_1);
        newList.add(ingredient_2);

        this.id = id;
        this.ingredients = newList;
        this.result = result;
        this.experience = experience;
        this.cookingTime = cookingTime;
    }

    private AlloySmelterRecipe(ResourceLocation id, NonNullList<Ingredient> ingredients, ItemStack result, float experience, int cookingTime) {
        this.id = id;
        this.ingredients = ingredients;
        this.result = result;
        this.experience = experience;
        this.cookingTime = cookingTime;
    }

    @Override
    public boolean matches(SimpleContainer pContainer, Level pLevel) {

        if (pLevel.isClientSide()) {
            return false;
        }

        boolean ingredient1_slot1 = ingredients.get(INPUT_1_SLOT.getSlotId()).test(pContainer.getItem(INPUT_1_SLOT.getSlotId()));
        boolean ingredient2_slot2 = ingredients.get(INPUT_2_SLOT.getSlotId()).test(pContainer.getItem(INPUT_2_SLOT.getSlotId()));

        boolean ingredient1_slot2 = ingredients.get(INPUT_1_SLOT.getSlotId()).test(pContainer.getItem(INPUT_2_SLOT.getSlotId()));
        boolean ingredient2_slot1 = ingredients.get(INPUT_2_SLOT.getSlotId()).test(pContainer.getItem(INPUT_1_SLOT.getSlotId()));

        return ingredient1_slot1 && ingredient2_slot2 || ingredient1_slot2 && ingredient2_slot1;
    }

    @Override
    public ItemStack assemble(SimpleContainer pContainer, RegistryAccess pRegistryAccess) {
        return result.copy();
    }

    @Override
    public boolean canCraftInDimensions(int pWidth, int pHeight) {
        return true;
    }

    @Override
    public ItemStack getResultItem(RegistryAccess pRegistryAccess) {
        return result.copy();
    }

    @Override
    public NonNullList<Ingredient> getIngredients() {
        return this.ingredients;
    }

    public float getExperience() {
        return this.experience;
    }

    public int getCookingTime() {
        return this.cookingTime;
    }

    @Override
    public ResourceLocation getId() {
        return id;
    }

    @Override
    public RecipeSerializer<?> getSerializer() {
        return AlloySmithSerializer.INSTANCE;
    }

    @Override
    public RecipeType<?> getType() {
        return Type.INSTANCE;
    }

    public static class Type implements RecipeType<AlloySmelterRecipe> {
        private Type() { }
        public static final Type INSTANCE = new Type();
        public static final String ID = "alloy_smelter";
    }

    public static class AlloySmithSerializer implements RecipeSerializer<AlloySmelterRecipe> {
        public static final AlloySmithSerializer INSTANCE = new AlloySmithSerializer(200);
        private final int defaultCookingTime;

        public AlloySmithSerializer(int defaultCookingTime) {
            this.defaultCookingTime = defaultCookingTime;
        }
        public static final ResourceLocation ID =
                LostWorldsApi.modLoc("alloy_smelter");

        @Override
        public AlloySmelterRecipe fromJson(ResourceLocation id, JsonObject json) {
            ItemStack output = ShapedRecipe.itemStackFromJson(GsonHelper.getAsJsonObject(json, "output"));

            JsonArray ingredients = GsonHelper.getAsJsonArray(json, "ingredients");
            NonNullList<Ingredient> inputs = NonNullList.withSize(2, Ingredient.EMPTY);

            float experience = GsonHelper.getAsFloat(json, "experiance", 0.0f);
            int cookingTime = GsonHelper.getAsInt(json, "cooking_time", this.defaultCookingTime);

            for (int i = 0; i < inputs.size(); i++) {
                inputs.set(i, Ingredient.fromJson(ingredients.get(i)));
            }

            return new AlloySmelterRecipe(id, inputs, output, experience, cookingTime);
        }

        @Override
        public AlloySmelterRecipe fromNetwork(ResourceLocation id, FriendlyByteBuf buf) {
            NonNullList<Ingredient> inputs = NonNullList.withSize(buf.readInt(), Ingredient.EMPTY);

            for (int i = 0; i < inputs.size(); i++) {
                inputs.set(i, Ingredient.fromNetwork(buf));
            }

            ItemStack output = buf.readItem();
            float experience = buf.readFloat();
            int cookingTime = buf.readVarInt();

            return new AlloySmelterRecipe(id, inputs, output, experience, cookingTime);
        }

        @Override
        public void toNetwork(FriendlyByteBuf buf, AlloySmelterRecipe recipe) {
            buf.writeInt(recipe.getIngredients().size());

            for (Ingredient ing : recipe.getIngredients()) {
                ing.toNetwork(buf);
            }
            buf.writeFloat(recipe.experience);
            buf.writeVarInt(recipe.cookingTime);

            buf.writeItemStack(recipe.getResultItem(null), false);
        }
    }
}
