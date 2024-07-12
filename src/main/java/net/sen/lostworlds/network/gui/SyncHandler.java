package net.sen.lostworlds.network.gui;

import net.minecraft.network.protocol.common.custom.CustomPacketPayload;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerPlayer;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.entity.player.PlayerEvent;
import net.neoforged.neoforge.event.tick.EntityTickEvent;
import net.neoforged.neoforge.network.registration.NetworkRegistry;
import net.neoforged.neoforge.registries.NeoForgeRegistries;
import net.sen.lostworlds.api.LostWorldsApi;
import net.sen.lostworlds.network.MessageMagicTypeSync;
import net.sen.lostworlds.magic.MagicElementTypeEnum;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class SyncHandler {
    private static final String PROTOCOL_VERSION = Integer.toString(1);
//    public static final CustomPacketPayload CHANNEL = NetworkRegistry.isModdedPayload().ChannelBuilder
//            .named(new ResourceLocation(LostWorldsApi.MODID, "sync"))
//            .clientAcceptedVersions(s -> true)
//            .serverAcceptedVersions(s -> true)
//            .networkProtocolVersion(() -> PROTOCOL_VERSION)
//            .simpleChannel();

    public static void init()
    {
//        CHANNEL.registerMessage(1, MessageMagicTypeSync.class, MessageMagicTypeSync::encode, MessageMagicTypeSync::decode, MessageMagicTypeSync::handle);

        NeoForge.EVENT_BUS.register(new SyncHandler());
    }

    /*
     * Sync Magic Type
     */
    private static final Map<UUID, MagicElementTypeEnum[]> lastMagicElementEnum = new HashMap<>();

    @SubscribeEvent
    public void onLivingTickEvent(EntityTickEvent event)
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
