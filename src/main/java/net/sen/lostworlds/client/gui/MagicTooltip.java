package net.sen.lostworlds.client.gui;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.tooltip.TooltipComponent;
import net.minecraft.world.item.ItemStack;
import net.sen.lostworlds.magic.MagicElementTypeEnum;
import net.sen.lostworlds.magic.MagicProperties;

import java.util.List;

public class MagicTooltip implements TooltipComponent {
    private ItemStack itemStack;
    private MagicProperties magicProperties;
    List<MagicElementTypeEnum> magicElementTypes;

    public MagicTooltip(ItemStack itemStack, MagicProperties magicProperties, Player player) {
        this.itemStack = itemStack;
        this.magicProperties = magicProperties;

        magicElementTypes = magicProperties.getMagicElementTypeEnum();
    }

    public ItemStack getItemStack() {
        return itemStack;
    }

    public MagicProperties getMagicProperties() {
        return magicProperties;
    }

    public List<MagicElementTypeEnum> getMagicElementTypes() {
        return magicElementTypes;
    }

    public boolean shouldRenderMagicIcons()
    {
        return magicElementTypes.size() > 0;
    }
}
