package net.sen.lostworlds;

import com.mojang.datafixers.kinds.IdF;
import net.minecraft.resources.ResourceLocation;
import net.sen.lostworlds.multiblocks.IMultiblock;
import net.sen.lostworlds.multiblocks.Multiblock;

public class InternalHooks implements LostWorldsApi.IInternalHooks{
    @Override
    public IMultiblock createMultiblock(ResourceLocation name, String[][] pattern, Object... rawMatchers) {
        return new Multiblock(name, pattern, rawMatchers);
    }
}
