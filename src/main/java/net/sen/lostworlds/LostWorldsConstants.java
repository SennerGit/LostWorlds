package net.sen.lostworlds;

import net.minecraft.resources.ResourceLocation;

public class LostWorldsConstants {
    // Define mod id in a common place for everything to reference
    public static final String MODID = "lostworlds";

    public static ResourceLocation modLoc(String name) {
        return new ResourceLocation(MODID, name);
    }

    public static ResourceLocation mcLoc(String name) {
        return new ResourceLocation(name);
    }

    public static ResourceLocation customLoc(String namespace, String location) {
        return new ResourceLocation(namespace, location);
    }

    public static ResourceLocation forgeLoc(String name) {
        return new ResourceLocation("forge", name);
    }
}
