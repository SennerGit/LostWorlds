package net.sen.lostworlds.network;

import net.minecraft.network.FriendlyByteBuf;
import net.minecraftforge.network.NetworkEvent;
import net.sen.lostworlds.magic.MagicElementTypeEnum;

import java.util.function.Supplier;

public class MessageMagicTypeSync {
    MagicElementTypeEnum[] magicElements;

    public MessageMagicTypeSync(MagicElementTypeEnum... magicElements) {
        this.magicElements = magicElements;
    }

    public static void encode(MessageMagicTypeSync pkt, FriendlyByteBuf buf) {
        buf.writeVarInt(pkt.magicElements.length);
        
        for (MagicElementTypeEnum element : pkt.magicElements)
            buf.writeEnum(element);
    }

    public static MessageMagicTypeSync decode(FriendlyByteBuf buf) {
        MagicElementTypeEnum magicElementEnum = buf.readEnum(MagicElementTypeEnum.class);
        return new MessageMagicTypeSync(magicElementEnum);
    }

    public static void handle(final MessageMagicTypeSync message, Supplier<NetworkEvent.Context> context) {
//        context.get().enqueueWork(() -> {
//            NetworkHelper.getSidedPlayer(context.get()).get
//        });

        context.get().setPacketHandled(true);
    }
}
