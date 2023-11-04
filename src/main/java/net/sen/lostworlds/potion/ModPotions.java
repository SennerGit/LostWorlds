package net.sen.lostworlds.potion;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.alchemy.Potion;
import net.minecraft.world.item.alchemy.Potions;
import net.minecraftforge.common.brewing.BrewingRecipeRegistry;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.sen.lostworlds.LostWorlds;
import net.sen.lostworlds.util.tools.MinecraftMaths;
import net.sen.lostworlds.effect.ModEffects;

public class ModPotions {
    public static final DeferredRegister<Potion> POTIONS =
            DeferredRegister.create(ForgeRegistries.POTIONS, LostWorlds.MODID);

    public static final RegistryObject<Potion> DROWSY_POTION = POTIONS.register(nameId("drowsy_potion"),
            () -> new Potion(new MobEffectInstance(ModEffects.DROWSY_EFFECT.get(), MinecraftMaths.secondsInTicks(10), 0)));

    public static void register(IEventBus eventBus) {
        POTIONS.register(eventBus);
    }

    public static void recipe(FMLCommonSetupEvent event) {
        event.enqueueWork(() -> {
            BrewingRecipeRegistry.addRecipe(new BetterBrewingRecipe(Potions.AWKWARD, Items.SLIME_BALL, ModPotions.DROWSY_POTION.get()));
        });
    }

    public static String nameId(String name) {
        return LostWorlds.MODID + "." + name;
    }
}
