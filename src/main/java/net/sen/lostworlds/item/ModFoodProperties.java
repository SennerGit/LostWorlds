package net.sen.lostworlds.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoodProperties {
    public static final FoodProperties CRIMSON_APPLE = new FoodProperties.Builder()
            .nutrition(4)
            .saturationMod(0.3f)
            .effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 200), 0.1f)
            .build();

    public static final FoodProperties POMEGRANATE = new FoodProperties.Builder()
            .nutrition(4)
            .saturationMod(0.3f)
            .build();

    public static final FoodProperties OLIVE = new FoodProperties.Builder()
            .nutrition(4)
            .saturationMod(0.3f)
            .build();
}
