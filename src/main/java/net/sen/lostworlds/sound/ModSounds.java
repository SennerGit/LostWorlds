package net.sen.lostworlds.sound;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.level.block.SoundType;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.common.util.DeferredSoundType;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.sen.lostworlds.api.LostWorldsApi;

public class ModSounds {
    public static final DeferredRegister<SoundEvent> SOUND_EVENTS = DeferredRegister.create(Registries.SOUND_EVENT, LostWorldsApi.MODID);

    public static final DeferredHolder<SoundEvent, SoundEvent> MAGICAL_DOWSING_ROD_FOUND_ORE = registerSoundEvent("magical_dowsing_rod_found_ore");
    public static final DeferredHolder<SoundEvent, SoundEvent> CRIMSON_DIAMOND_LAMP_BREAK = registerSoundEvent("crimson_diamond_lamp_break");
    public static final DeferredHolder<SoundEvent, SoundEvent> CRIMSON_DIAMOND_LAMP_STEP = registerSoundEvent("crimson_diamond_lamp_step");
    public static final DeferredHolder<SoundEvent, SoundEvent> CRIMSON_DIAMOND_LAMP_PLACE = registerSoundEvent("crimson_diamond_lamp_place");
    public static final DeferredHolder<SoundEvent, SoundEvent> CRIMSON_DIAMOND_LAMP_HIT = registerSoundEvent("crimson_diamond_lamp_hit");
    public static final DeferredHolder<SoundEvent, SoundEvent> CRIMSON_DIAMOND_LAMP_FALL = registerSoundEvent("crimson_diamond_lamp_fall");

    public static final DeferredHolder<SoundEvent, SoundEvent> BAR_BRAWL = registerSoundEvent("bar_brawl");

    public static final SoundType CRIMSON_DIAMOND_LAMP_SOUNDS = new DeferredSoundType(1f, 1f,
            ModSounds.CRIMSON_DIAMOND_LAMP_BREAK, ModSounds.CRIMSON_DIAMOND_LAMP_STEP, ModSounds.CRIMSON_DIAMOND_LAMP_PLACE,
            ModSounds.CRIMSON_DIAMOND_LAMP_HIT, ModSounds.CRIMSON_DIAMOND_LAMP_FALL);

    private static DeferredHolder<SoundEvent, SoundEvent> registerSoundEvent(String name) {
        ResourceLocation id = LostWorldsApi.modLoc(name);
        return SOUND_EVENTS.register(name, () -> SoundEvent.createVariableRangeEvent(id));
    }

    public static void register(IEventBus eventBus) {
        SOUND_EVENTS.register(eventBus);
    }
}
