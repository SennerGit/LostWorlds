package net.sen.lostworlds.util;

import net.minecraft.resources.ResourceLocation;

public class guiObj {
    private final ResourceLocation RESOURCE_LOCATION;
    private final int ICON_U;
    private final int ICON_V;

    public guiObj(ResourceLocation resourceLocation, int iconU, int iconV) {
        this.RESOURCE_LOCATION = resourceLocation;
        this.ICON_U = iconU;
        this.ICON_V = iconV;
    }

    public ResourceLocation getResourceLocation() {
        return RESOURCE_LOCATION;
    }

    public int getIconU() {
        return ICON_U;
    }

    public int getIconV() {
        return ICON_V;
    }
}
