package net.sen.lostworlds.recipe;

import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.sen.lostworlds.LostWorlds;

public class ModRecipes {
    public static final DeferredRegister<RecipeSerializer<?>> RECIPE_SERIALIZERS =
            DeferredRegister.create(ForgeRegistries.RECIPE_SERIALIZERS, LostWorlds.MODID);

    public static final RegistryObject<RecipeSerializer<AlloySmelterRecipe>> ALLOY_SMELTER_SERIALIZER =
            RECIPE_SERIALIZERS.register("alloy_smelter_serializer",
                    () -> AlloySmelterRecipe.AlloySmithSerializer.INSTANCE);

    public static void register(IEventBus eventBus) {
        RECIPE_SERIALIZERS.register(eventBus);
    }
}
