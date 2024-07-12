package net.sen.lostworlds.registry;

import net.minecraft.core.registries.Registries;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.alchemy.Potion;
import net.minecraft.world.item.alchemy.Potions;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.common.brewing.BrewingRecipe;
import net.neoforged.neoforge.common.brewing.BrewingRecipeRegistry;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.sen.lostworlds.api.LostWorldsApi;
import net.sen.lostworlds.util.tools.MinecraftMaths;
import net.sen.lostworlds.effect.ModEffects;

public class ModPotions {
    public static final DeferredRegister<Potion> POTIONS =
            DeferredRegister.create(Registries.POTION, LostWorldsApi.MODID);

    public static final DeferredHolder<Potion, Potion> DROWSY_POTION = POTIONS.register(nameId("drowsy_potion"),
            () -> new Potion(new MobEffectInstance(ModEffects.DROWSY_EFFECT, MinecraftMaths.secondsInTicks(10), 0)));

    public static void register(IEventBus eventBus) {
        POTIONS.register(eventBus);
    }

//    public static void recipe(FMLCommonSetupEvent event) {
//        event.enqueueWork(() -> {
//            BrewingRecipeRegistry.addRecipe(new BetterBrewingRecipe(Potions.AWKWARD.value(), Items.SLIME_BALL, ModPotions.DROWSY_POTION.get()));
//        });
//    }

    public static String nameId(String name) {
        return LostWorldsApi.MODID + "." + name;
    }
}
