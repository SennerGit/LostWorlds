package net.sen.lostworlds.network;

import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.network.NetworkRegistry;
import net.minecraftforge.network.simple.SimpleChannel;
import net.sen.lostworlds.LostWorlds;
import net.sen.lostworlds.LostWorldsApi;

import java.util.function.Function;

public class LostWorldsPackets {
    public static final SimpleChannel CHANNEL = NetworkRegistry.newSimpleChannel(
            new ResourceLocation(LostWorldsApi.MODID, "main"),
            LostWorlds::getCompatVersion,
            LostWorlds::isCompatibleVersion,
            LostWorlds::isCompatibleVersion
    );

    private static int nextMessageId = 0;

    private static int nextMessageId() {
        return nextMessageId++;
    }

    public static void init() {

    }
}
