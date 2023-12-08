package net.sen.lostworlds.client.util.registry;

import net.minecraft.client.renderer.Sheets;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.sen.lostworlds.block.ModWoodTypes;

public class ModWoodTypesReg {
    public static void setup(final FMLClientSetupEvent event) {
        event.enqueueWork(() -> {
            Sheets.addWoodType(ModWoodTypes.ELDER_WOOD);
            Sheets.addWoodType(ModWoodTypes.OLIVE);
            Sheets.addWoodType(ModWoodTypes.MYRRH);
            Sheets.addWoodType(ModWoodTypes.LAUREL);
            Sheets.addWoodType(ModWoodTypes.CYPRESS);
        });
    }
}
