package net.sen.lostworlds.client;

import net.neoforged.api.distmarker.Dist;
import net.neoforged.api.distmarker.OnlyIn;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.sen.lostworlds.client.util.registry.*;
import net.sen.lostworlds.registry.items.ModItemProperties;

@OnlyIn(Dist.CLIENT)
public class LostWorldsClient {
    public static void initClientEvents(IEventBus eventBus) {
        eventBus.addListener(LostWorldsClient::clientSetup);
    }

    public static void clientSetup(FMLClientSetupEvent event) {
        event.enqueueWork(() -> {
            ModWoodTypesReg.setup(event);
            ModItemProperties.addCustomItemProperties();
            ModItemBlockRendReg.setup(event);
//            ModMenuScreenReg.setup(event);
            ModEntityRendReg.setup(event);
            ModEntityRendProjReg.setup(event);
            ClientHandler.init(event);
        });
    }
}
