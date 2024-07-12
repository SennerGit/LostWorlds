package net.sen.lostworlds.compat;

import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.sen.lostworlds.datagen.tag.ModItemTagGenerator;

public interface ICompat {
    void setup(FMLCommonSetupEvent event);

    void setupClient();

    void addItemTags(ModItemTagGenerator provider);
}
