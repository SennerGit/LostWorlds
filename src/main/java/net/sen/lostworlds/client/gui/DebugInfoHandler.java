package net.sen.lostworlds.client.gui;


import net.neoforged.api.distmarker.Dist;
import net.neoforged.api.distmarker.OnlyIn;
import net.neoforged.neoforge.common.NeoForge;

@OnlyIn(Dist.CLIENT)
public class DebugInfoHandler {

    public static void init() {
        NeoForge.EVENT_BUS.register(new DebugInfoHandler());
    }
}
