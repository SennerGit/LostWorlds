package net.sen.lostworlds.client.util.registry;

import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.sen.lostworlds.fluid.ModFluids;

public class ModItemBlockRendReg {
    public static void setup(final FMLClientSetupEvent event) {
        event.enqueueWork(() -> {
            ItemBlockRenderTypes.setRenderLayer(ModFluids.STYX_SOURCE.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModFluids.STYX_FLOWING.get(), RenderType.translucent());
        });
    }
}
