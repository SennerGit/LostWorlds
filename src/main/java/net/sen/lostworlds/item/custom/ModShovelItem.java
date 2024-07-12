package net.sen.lostworlds.item.custom;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.ShovelItem;
import net.sen.lostworlds.registry.items.ModToolTiers;

public class ModShovelItem extends ShovelItem {
    public ModShovelItem(ModToolTiers modToolTiers, Item.Properties attributes) {
        super(modToolTiers, attributes);
    }
}
