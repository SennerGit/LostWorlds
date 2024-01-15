package net.sen.lostworlds.magic;

import net.minecraft.nbt.CompoundTag;
import net.minecraftforge.common.capabilities.AutoRegisterCapability;
import net.minecraftforge.common.util.INBTSerializable;

@AutoRegisterCapability
public interface IMagicCapability extends INBTSerializable<CompoundTag> {
    void setMagicProperties(MagicProperties magicProperties);
}
