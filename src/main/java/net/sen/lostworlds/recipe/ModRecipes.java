package net.sen.lostworlds.recipe;

import net.minecraft.world.item.crafting.Recipe;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.sen.lostworlds.LostWorlds;
import net.sen.lostworlds.LostWorldsConstants;
//import net.sen.lostworlds.multiblocks.druid_ritual.DruidRitualRecipe;

public class ModRecipes {
    public static final DeferredRegister<RecipeType<?>> RECIPE_TYPES = DeferredRegister.create(
            ForgeRegistries.RECIPE_TYPES, LostWorldsConstants.MODID);
    public static final DeferredRegister<RecipeSerializer<?>> RECIPE_SERIALIZERS =
            DeferredRegister.create(ForgeRegistries.RECIPE_SERIALIZERS, LostWorldsConstants.MODID);

    public static final RegistryObject<RecipeSerializer<AlloySmelterRecipe>> ALLOY_SMELTER_SERIALIZER =
            RECIPE_SERIALIZERS.register("alloy_smelter_serializer",
                    () -> AlloySmelterRecipe.AlloySmithSerializer.INSTANCE);

//    public static final RegistryObject<RecipeType<DruidRitualRecipe>> DRUID_RITUAL_TYPE = registerRecipeType("druid_ritual_type");

    public static void register(IEventBus eventBus) {
        RECIPE_SERIALIZERS.register(eventBus);
        RECIPE_TYPES.register(eventBus);
    }

    static <T extends Recipe<?>> RegistryObject<RecipeType<T>> registerRecipeType(final String id) {
        return RECIPE_TYPES.register(id, () -> new RecipeType<T>() {
            public String toString() {
                return id;
            }
        });
    }
}
