package net.sen.lostworlds.effect;

import net.minecraft.core.Holder;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.sen.lostworlds.api.LostWorldsApi;

public class ModEffects {
    public static final DeferredRegister<MobEffect> MOB_EFFECTS =
            DeferredRegister.create(Registries.MOB_EFFECT, LostWorldsApi.MODID);

    public static final DeferredHolder<MobEffect, MobEffect> DROWSY_EFFECT = createMobEffect("drowsy_effect", MobEffectCategory.NEUTRAL, 0x36ebeb, Attributes.MOVEMENT_SPEED,-0.25f, AttributeModifier.Operation.ADD_MULTIPLIED_TOTAL);

    public static DeferredHolder<MobEffect, MobEffect> createMobEffect(String name, MobEffectCategory mobEffectCategory, int colour, Holder<Attribute> attribute, double effect, AttributeModifier.Operation operation) {
        return MOB_EFFECTS.register(name,
                () -> new DrowsyEffect(mobEffectCategory, colour)
                        .addAttributeModifier(
                                attribute,
                                LostWorldsApi.modLoc(name),
                                effect,
                                operation
                        ));
    }

    public static void register(IEventBus eventBus) {
        MOB_EFFECTS.register(eventBus);
    }
}
