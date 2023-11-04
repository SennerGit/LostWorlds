package net.sen.lostworlds.sound;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraftforge.common.util.ForgeSoundType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.sen.lostworlds.LostWorlds;

public class ModSounds {
    public static final DeferredRegister<SoundEvent> SOUND_EVENTS = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, LostWorlds.MODID);

    public static final RegistryObject<SoundEvent> MAGICAL_DOWSING_ROD_FOUND_ORE = registerSoundEvent("magical_dowsing_rod_found_ore");
    public static final RegistryObject<SoundEvent> CRIMSON_DIAMOND_LAMP_BREAK = registerSoundEvent("crimson_diamond_lamp_break");
    public static final RegistryObject<SoundEvent> CRIMSON_DIAMOND_LAMP_STEP = registerSoundEvent("crimson_diamond_lamp_step");
    public static final RegistryObject<SoundEvent> CRIMSON_DIAMOND_LAMP_PLACE = registerSoundEvent("crimson_diamond_lamp_place");
    public static final RegistryObject<SoundEvent> CRIMSON_DIAMOND_LAMP_HIT = registerSoundEvent("crimson_diamond_lamp_hit");
    public static final RegistryObject<SoundEvent> CRIMSON_DIAMOND_LAMP_FALL = registerSoundEvent("crimson_diamond_lamp_fall");

    public static final RegistryObject<SoundEvent> BAR_BRAWL = registerSoundEvent("bar_brawl");

    public static final ForgeSoundType CRIMSON_DIAMOND_LAMP_SOUNDS = new ForgeSoundType(1f, 1f,
            ModSounds.CRIMSON_DIAMOND_LAMP_BREAK, ModSounds.CRIMSON_DIAMOND_LAMP_STEP, ModSounds.CRIMSON_DIAMOND_LAMP_PLACE,
            ModSounds.CRIMSON_DIAMOND_LAMP_HIT, ModSounds.CRIMSON_DIAMOND_LAMP_FALL);

    private static RegistryObject<SoundEvent> registerSoundEvent(String name) {
        ResourceLocation id = new ResourceLocation(LostWorlds.MODID, name);
        return SOUND_EVENTS.register(name, () -> SoundEvent.createVariableRangeEvent(id));
    }

    public static void register(IEventBus eventBus) {
        SOUND_EVENTS.register(eventBus);
    }
}
