package net.sen.lostworlds;

import net.minecraft.resources.ResourceLocation;
import net.sen.lostworlds.multiblocks.IMultiblock;

import java.util.HashMap;
import java.util.Map;

public class LostWorldsApi {
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

    public static final Map<ResourceLocation, IMultiblock> MULTIBLOCKS = new HashMap<>();

    private static final IInternalHooks INSTANCE;

    static {
        try {
            INSTANCE = (IInternalHooks) Class.forName("net.sen.lostworlds.InternalHooks").getConstructor().newInstance();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static IInternalHooks instance() {
        return LostWorldsApi.INSTANCE;
    }

    public interface IInternalHooks {
        IMultiblock createMultiblock(ResourceLocation name, String[][] pattern, Object... rawMatchers);
    }
}
