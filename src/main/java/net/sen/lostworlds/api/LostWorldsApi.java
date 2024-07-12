package net.sen.lostworlds.api;

import net.minecraft.resources.ResourceLocation;

import java.util.Locale;

public class LostWorldsApi implements ILostWorldsApi {
    // Define mod id in a common place for everything to reference
    public static final LostWorldsApi INSTANCE = new LostWorldsApi();
    public static final LostWorldsApi INTERNAL_INSTANCE = new LostWorldsApi();

    public static final String MODID = "lostworlds";

    public static ResourceLocation modLoc(String name) {
        return ResourceLocation.fromNamespaceAndPath(MODID, name.toLowerCase(Locale.ROOT));
    }
    public static ResourceLocation entityRendererLoc(String entityFolder, String entityName) {
        return modLoc("textures/entity/" + entityFolder + "/" + entityName + ".png");
    }
    public static ResourceLocation entityRendererLoc(String name) {
        return modLoc("textures/entity/" + name + "/" + name + ".png");
    }

    public static ResourceLocation mcLoc(String name) {
        return ResourceLocation.withDefaultNamespace(name);
    }

    public static ResourceLocation customLoc(String namespace, String location) {
        return ResourceLocation.fromNamespaceAndPath(namespace, location);
    }

    public static ResourceLocation neoforgeLoc(String name) {
        return ResourceLocation.fromNamespaceAndPath("neoforge", name);
    }


//    static {
//        try {
//            INSTANCE = (IInternalHooks) Class.forName("net.sen.lostworlds.network.InternalHooks").getConstructor().newInstance();
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        }
//    }


}
