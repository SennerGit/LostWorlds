package net.sen.lostworlds.network;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.LazyLoadedValue;
import net.sen.lostworlds.api.ILostWorldsApi;
import net.sen.lostworlds.multiblocks.IMultiblock;
import net.sen.lostworlds.multiblocks.Multiblock;
import org.apache.logging.log4j.LogManager;

import java.util.HashMap;
import java.util.Map;

public interface IInternalHooks {

    Map<ResourceLocation, IMultiblock> MULTIBLOCKS = new HashMap<>();

    LazyLoadedValue<IInternalHooks> INSTANCE = new LazyLoadedValue<>(
        () -> {
            try {
                return  (IInternalHooks) Class.forName("net.sen.lostworlds.network.InternalHooks").getConstructor().newInstance();
            } catch (Exception e) {
                LogManager.getLogger().warn("Unable to find InternalHooks, using a dummy instance instead...");
                return new IInternalHooks() {
                    @Override
                    public IMultiblock createMultiblock(ResourceLocation name, String[][] pattern, Object... rawMatchers) {
                        return new Multiblock(name, pattern, rawMatchers);
                    }
                };
            }
        }
    );

    IMultiblock createMultiblock(ResourceLocation name, String[][] pattern, Object... rawMatchers);
}
