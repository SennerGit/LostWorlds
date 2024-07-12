package net.sen.lostworlds.event;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.Event;
import net.sen.lostworlds.magic.MagicProperties;

public class MagicValueEvent extends Event {
    public MagicValueEvent(Player player, ItemStack itemStack, MagicProperties magicProperties) {
        this.player = player;
        this.itemStack = itemStack;
        this.magicProperties = magicProperties;
    }

    public final Player player;
    public final ItemStack itemStack;
    public MagicProperties magicProperties;
}
