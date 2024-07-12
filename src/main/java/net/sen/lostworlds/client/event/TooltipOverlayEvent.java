package net.sen.lostworlds.client.event;

import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.Event;
import net.neoforged.bus.api.ICancellableEvent;
import net.sen.lostworlds.magic.MagicProperties;

public class TooltipOverlayEvent extends Event implements ICancellableEvent {
    /**
     * If cancelled, will stop all rendering from happening.
     */
    public static class Pre extends TooltipOverlayEvent
    {
        public Pre(ItemStack itemStack, MagicProperties magicProperties)
        {
            super(itemStack, magicProperties);
        }
    }

    /**
     * If cancelled, will reserve space for the food values, but will not
     * render them.
     */
    public static class Render extends TooltipOverlayEvent
    {
        public Render(ItemStack itemStack, int x, int y, GuiGraphics guiGraphics, MagicProperties magicProperties)
        {
            super(itemStack, magicProperties);
            this.guiGraphics = guiGraphics;
            this.x = x;
            this.y = y;
        }

        public int x;
        public int y;
        public GuiGraphics guiGraphics;
    }

    private TooltipOverlayEvent(ItemStack itemStack, MagicProperties magicProperties)
    {
        this.itemStack = itemStack;
        this.magicProperties = magicProperties;
    }

    public final ItemStack itemStack;
    public final MagicProperties magicProperties;

    @Override
    public boolean isCanceled() {
        return true;
    }
}
