package net.sen.lostworlds.datagen;

import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.common.data.SoundDefinitionsProvider;
import net.sen.lostworlds.LostWorldsApi;
import net.sen.lostworlds.sound.ModSounds;

public class ModSoundProvider extends SoundDefinitionsProvider {
    /**
     * Creates a new instance of this data provider.
     *
     * @param output The {@linkplain PackOutput} instance provided by the data generator.
     * @param helper The existing file helper provided by the event you are initializing this provider in.
     */
    protected ModSoundProvider(PackOutput output, ExistingFileHelper helper) {
        super(output, LostWorldsApi.MODID, helper);
    }

    @Override
    public void registerSounds() {
        this.add(ModSounds.MAGICAL_DOWSING_ROD_FOUND_ORE, definition()
                .subtitle("sounds.lostworlds.magical_dowsing_rod_found_ore")
                .with(
                        sound(ModSounds.MAGICAL_DOWSING_ROD_FOUND_ORE.getId())
                ));
        this.add(ModSounds.CRIMSON_DIAMOND_LAMP_BREAK, definition()
                .subtitle("sounds.lostworlds.crimson_diamond_lamp_break")
                .with(
                        sound(ModSounds.CRIMSON_DIAMOND_LAMP_BREAK.getId())
                ));
        this.add(ModSounds.CRIMSON_DIAMOND_LAMP_STEP, definition()
                .subtitle("sounds.lostworlds.crimson_diamond_lamp_step")
                .with(
                        sound(ModSounds.CRIMSON_DIAMOND_LAMP_STEP.getId())
                ));
        this.add(ModSounds.CRIMSON_DIAMOND_LAMP_FALL, definition()
                .subtitle("sounds.lostworlds.crimson_diamond_lamp_fall")
                .with(
                        sound(ModSounds.CRIMSON_DIAMOND_LAMP_FALL.getId())
                ));
        this.add(ModSounds.CRIMSON_DIAMOND_LAMP_PLACE, definition()
                .subtitle("sounds.lostworlds.crimson_diamond_lamp_place")
                .with(
                        sound(ModSounds.CRIMSON_DIAMOND_LAMP_PLACE.getId())
                ));
        this.add(ModSounds.CRIMSON_DIAMOND_LAMP_HIT, definition()
                .subtitle("sounds.lostworlds.crimson_diamond_lamp_hit")
                .with(
                        sound(ModSounds.CRIMSON_DIAMOND_LAMP_HIT.getId())
                ));
        this.add(ModSounds.BAR_BRAWL, definition()
                .subtitle("lostworlds:bar_brawl")
                .with(
                        sound(ModSounds.BAR_BRAWL.getId())
                                .stream()
                ));
    }
}
