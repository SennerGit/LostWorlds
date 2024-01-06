package net.sen.lostworlds.villager.custom.dwarven;

import net.minecraft.world.entity.VariantHolder;
import net.minecraft.world.entity.npc.VillagerData;
import net.minecraft.world.entity.npc.VillagerType;

public interface DwarvenVillagerDataHolder extends VariantHolder<DwarvenVillagerType> {
    DwarvenVillagerData getDwarvenVillagerData();

    void setDwarvenVillagerData(DwarvenVillagerData pData);

    default DwarvenVillagerType getVariant() {
        return this.getDwarvenVillagerData().getType();
    }

    default void setVariant(DwarvenVillagerType pVariant) {
        this.setDwarvenVillagerData(this.getDwarvenVillagerData().setType(pVariant));
    }
}