///*
//Taken from Applied Energistics
//https://github.com/AppliedEnergistics/Applied-Energistics-2/blob/main/src/main/java/appeng/recipes/transform/TransformRecipeBuilder.java#L12
// */
//
//package net.sen.lostworlds.recipe.transform;
//
//import net.minecraft.core.NonNullList;
//import net.minecraft.core.RegistryAccess;
//import net.minecraft.resources.ResourceLocation;
//import net.minecraft.world.Container;
//import net.minecraft.world.item.ItemStack;
//import net.minecraft.world.item.crafting.Ingredient;
//import net.minecraft.world.item.crafting.Recipe;
//import net.minecraft.world.item.crafting.RecipeSerializer;
//import net.minecraft.world.item.crafting.RecipeType;
//import net.minecraft.world.level.Level;
//
//public class TransformRecipe implements Recipe<Container> {
////    public static final ResourceLocation TYPE_ID = AppEng.makeId("transform");
////    public static final RecipeType<TransformRecipe> TYPE = InitRecipeTypes.register(TYPE_ID.toString());
//
//    private final ResourceLocation id;
//    public final NonNullList<Ingredient> ingredients;
//    public final ItemStack output;
//    public final TransformCircumstance circumstance;
//
//    public TransformRecipe(ResourceLocation id, NonNullList<Ingredient> ingredients, ItemStack output,
//                           TransformCircumstance circumstance) {
//        this.id = id;
//        this.ingredients = ingredients;
//        this.output = output;
//        this.circumstance = circumstance;
//    }
//
//    @Override
//    public NonNullList<Ingredient> getIngredients() {
//        return ingredients;
//    }
//
//    @Override
//    public boolean matches(Container container, Level level) {
//        return false;
//    }
//
//    @Override
//    public ItemStack assemble(Container pContainer, RegistryAccess pRegistryAccess) {
//        return null;
//    }
//
////    @Override
////    public ItemStack assemble(Container container, RegistryAccess registryAccess) {
////        ItemStack result = getResultItem(registryAccess).copy();
////        if (AEItems.QUANTUM_ENTANGLED_SINGULARITY.isSameAs(result) && result.getCount() > 1) {
////            QuantumBridgeBlockEntity.assignFrequency(result);
////        }
////        return result;
////    }
//
//    @Override
//    public boolean canCraftInDimensions(int width, int height) {
//        return false;
//    }
//
//    @Override
//    public ItemStack getResultItem(RegistryAccess registryAccess) {
//        return getResultItem();
//    }
//
//    public ItemStack getResultItem() {
//        return output;
//    }
//
//    @Override
//    public ResourceLocation getId() {
//        return id;
//    }
//
//    @Override
//    public RecipeSerializer<?> getSerializer() {
//        return TransformRecipeSerializer.INSTANCE;
//    }
//
//    @Override
//    public RecipeType<?> getType() {
//        return null;
//    }
//
////    @Override
////    public RecipeType<?> getType() {
////        return TYPE;
////    }
//
//    @Override
//    public boolean isSpecial() {
//        return true;
//    }
//}