package net.sen.lostworlds.client.util.registry;

import net.minecraft.client.gui.screens.MenuScreens;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.sen.lostworlds.screen.ModMenuTypes;
import net.sen.lostworlds.screen.alloysmelter.AlloySmelterScreen;

public class ModMenuScreenReg {
    public static void setup(final FMLClientSetupEvent event) {
        event.enqueueWork(() -> {
            MenuScreens.register(ModMenuTypes.ALLOY_SMELTER_MENU.get(), AlloySmelterScreen::new);
        });
    }
}
