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

    public static final FoodProperties DURUM_WHEAT = new FoodProperties.Builder()
            .nutrition(4)
            .saturationMod(0.3f)
            .build();

    public static final FoodProperties TOMATO = new FoodProperties.Builder()
            .nutrition(4)
            .saturationMod(0.3f)
            .build();

    public static final FoodProperties WILD_ONION = new FoodProperties.Builder()
            .nutrition(4)
            .saturationMod(0.3f)
            .build();

    public static final FoodProperties ONION_STAGE_1 = new FoodProperties.Builder()
            .nutrition(4)
            .saturationMod(0.3f)
            .build();

    public static final FoodProperties ONION_STAGE_2 = new FoodProperties.Builder()
            .nutrition(4)
            .saturationMod(0.3f)
            .build();

    public static final FoodProperties ONION_STAGE_3 = new FoodProperties.Builder()
            .nutrition(4)
            .saturationMod(0.3f)
            .build();

    public static final FoodProperties ONION = new FoodProperties.Builder()
            .nutrition(4)
            .saturationMod(0.3f)
            .build();

    public static final FoodProperties DRAGON_FRUIT = new FoodProperties.Builder()
            .nutrition(4)
            .saturationMod(0.3f)
            .build();

    public static final FoodProperties CHILLI = new FoodProperties.Builder()
            .nutrition(4)
            .saturationMod(0.3f)
            .build();
}
