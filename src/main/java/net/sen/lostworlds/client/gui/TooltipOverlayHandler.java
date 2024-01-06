package net.sen.lostworlds.client.gui;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.common.MinecraftForge;

@OnlyIn(Dist.CLIENT)
public class TooltipOverlayHandler {

    public static void init() {
        MinecraftForge.EVENT_BUS.register(new TooltipOverlayHandler());
    }
}
