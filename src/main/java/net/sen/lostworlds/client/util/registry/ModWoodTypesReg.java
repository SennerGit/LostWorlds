package net.sen.lostworlds.client.util.registry;

import net.minecraft.client.renderer.Sheets;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.sen.lostworlds.block.wood.ModWoodTypes;

public class ModWoodTypesReg {
    public static void setup(final FMLClientSetupEvent event) {
        event.enqueueWork(() -> {
            Sheets.addWoodType(ModWoodTypes.ELDER_WOOD);
            Sheets.addWoodType(ModWoodTypes.OLIVE);
            Sheets.addWoodType(ModWoodTypes.MYRRH);
            Sheets.addWoodType(ModWoodTypes.LAUREL);
            Sheets.addWoodType(ModWoodTypes.CYPRESS);
            Sheets.addWoodType(ModWoodTypes.BLACK_BIRCH);
            Sheets.addWoodType(ModWoodTypes.BUR_OAK);
            Sheets.addWoodType(ModWoodTypes.BLOOD_CHERRY);
            Sheets.addWoodType(ModWoodTypes.SACRED_TREE);
            Sheets.addWoodType(ModWoodTypes.WILLOW);
            Sheets.addWoodType(ModWoodTypes.DEADWOOD);
            Sheets.addWoodType(ModWoodTypes.EBONY_KINGSWOOD);
            Sheets.addWoodType(ModWoodTypes.IVORY_KINGSWOOD);
            Sheets.addWoodType(ModWoodTypes.WEAVER);
        });
    }
}
