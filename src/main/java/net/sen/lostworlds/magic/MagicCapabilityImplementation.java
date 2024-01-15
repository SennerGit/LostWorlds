package net.sen.lostworlds.magic;

import net.minecraft.nbt.CompoundTag;
import net.minecraft.nbt.Tag;
import net.minecraftforge.common.util.INBTSerializable;

import java.util.ArrayList;
import java.util.List;

public class MagicCapabilityImplementation implements IMagicCapability {
    MagicProperties magicProperties;

    public MagicCapabilityImplementation(MagicProperties magicProperties) {
        this.magicProperties = magicProperties;
    }

    @Override
    public void setMagicProperties(MagicProperties magicProperties) {
        this.magicProperties = magicProperties;
    }

    @Override
    public CompoundTag serializeNBT() {
        final CompoundTag tag = new CompoundTag();

        tag.putString("magic_properties", magicProperties.getName());
        return tag;
    }

    @Override
    public void deserializeNBT(CompoundTag nbt) {
        this.magicProperties = ModMagicProperties.MAGIC_PROPERTIES.get(nbt.getString("magic_properties"));
    }
}
