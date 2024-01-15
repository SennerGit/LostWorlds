package net.sen.lostworlds.network.gui;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerPlayer;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.living.LivingEvent.LivingTickEvent;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.network.NetworkRegistry;
import net.minecraftforge.network.simple.SimpleChannel;
import net.sen.lostworlds.LostWorldsApi;
import net.sen.lostworlds.network.MessageMagicTypeSync;
import net.sen.lostworlds.magic.MagicElementTypeEnum;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class SyncHandler {
    private static final String PROTOCOL_VERSION = Integer.toString(1);
    public static final SimpleChannel CHANNEL = NetworkRegistry.ChannelBuilder
            .named(new ResourceLocation(LostWorldsApi.MODID, "sync"))
            .clientAcceptedVersions(s -> true)
            .serverAcceptedVersions(s -> true)
            .networkProtocolVersion(() -> PROTOCOL_VERSION)
            .simpleChannel();

    public static void init()
    {
        CHANNEL.registerMessage(1, MessageMagicTypeSync.class, MessageMagicTypeSync::encode, MessageMagicTypeSync::decode, MessageMagicTypeSync::handle);

        MinecraftForge.EVENT_BUS.register(new SyncHandler());
    }

    /*
     * Sync Magic Type
     */
    private static final Map<UUID, MagicElementTypeEnum[]> lastMagicElementEnum = new HashMap<>();

    @SubscribeEvent
    public void onLivingTickEvent(LivingTickEvent event)
    {
        if (!(event.getEntity() instanceof ServerPlayer))
            return;

        ServerPlayer player = (ServerPlayer) event.getEntity();
        MagicElementTypeEnum[] lastElementLevel = lastMagicElementEnum.get(player.getUUID());

        for (MagicElementTypeEnum elementType : lastElementLevel) {
//            if (elementType == null || lastElementLevel != player.getFoodData().getSaturationLevel())
//            {
//                Object msg = new MessageMagicTypeSync(player.getFoodData().getSaturationLevel());
//                CHANNEL.sendTo(msg, player.connection.connection, NetworkDirection.PLAY_TO_CLIENT);
//                lastSaturationLevels.put(player.getUUID(), player.getFoodData().getSaturationLevel());
//            }
        }
    }

    @SubscribeEvent
    public void onPlayerLoggedIn(PlayerEvent.PlayerLoggedInEvent event)
    {
        if (!(event.getEntity() instanceof ServerPlayer))
            return;

        lastMagicElementEnum.remove(event.getEntity().getUUID());
    }
}
