package net.sen.lostworlds;

import net.minecraft.core.Registry;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.registries.RegistryBuilder;
import net.sen.lostworlds.api.ILostWorldsApi;
import net.sen.lostworlds.multiblocks.IMultiblock;;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class LostWorldsApi implements ILostWorldsApi {
    // Define mod id in a common place for everything to reference
    public static final LostWorldsApi INSTANCE = new LostWorldsApi();
    public static final LostWorldsApi INTERNAL_INSTANCE = new LostWorldsApi();

    public static final String MODID = "lostworlds";

    public static ResourceLocation modLoc(String name) {
        return new ResourceLocation(MODID, name);
    }
    public static ResourceLocation entityRendererLoc(String entityFolder, String entityName) {
        return new ResourceLocation(MODID, "textures/entity/" + entityFolder + "/" + entityName + ".png");
    }
    public static ResourceLocation entityRendererLoc(String name) {
        return new ResourceLocation(MODID, "textures/entity/" + name + "/" + name + ".png");
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


//    static {
//        try {
//            INSTANCE = (IInternalHooks) Class.forName("net.sen.lostworlds.network.InternalHooks").getConstructor().newInstance();
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        }
//    }


}
