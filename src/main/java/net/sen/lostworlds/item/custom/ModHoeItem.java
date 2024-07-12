package net.sen.lostworlds.item.custom;

import net.minecraft.world.item.HoeItem;
import net.minecraft.world.item.Item;
import net.sen.lostworlds.registry.items.ModToolTiers;

public class ModHoeItem extends HoeItem {
    public ModHoeItem(ModToolTiers modToolTiers, Item.Properties attributes) {
        super(modToolTiers, attributes);
    }
}
