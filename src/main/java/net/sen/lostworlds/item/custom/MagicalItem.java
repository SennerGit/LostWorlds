package net.sen.lostworlds.item.custom;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.sen.lostworlds.magic.MagicProperties;
import org.jetbrains.annotations.Nullable;

public class MagicalItem extends Item {
    @Nullable
    private final MagicProperties magicProperties;

    public MagicalItem(Properties pProperties, @Nullable MagicProperties magicProperties) {
        super(pProperties);
        this.magicProperties = magicProperties;
    }

    public MagicProperties getMagicProperties() {
        return magicProperties;
    }
}
