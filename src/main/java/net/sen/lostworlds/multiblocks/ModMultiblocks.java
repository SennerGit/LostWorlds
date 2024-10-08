package net.sen.lostworlds.multiblocks;

import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Blocks;

import net.sen.lostworlds.api.LostWorldsApi;
import net.sen.lostworlds.registry.blocks.AlfheimrBlocks;
import net.sen.lostworlds.network.InternalHooks;

public final class ModMultiblocks {
    public static final IMultiblock DRUID_RITUAL = InternalHooks.INSTANCE.get().createMultiblock(
            LostWorldsApi.modLoc("druid_ritual"),
            new String[][] {
                    {"G G", "   ", "G G"},
                    {"C C", "   ", "C C"},
                    {"C C", " 0 ", "C C"},
                    {"CCC", "CCC", "CCC"}
            },
            'C', Matcher.tag(Blocks.STONE, BlockTags.BASE_STONE_OVERWORLD),
            'G', Blocks.GOLD_BLOCK,
            '0', AlfheimrBlocks.DRUID_RITUAL_STONE.get(),
            ' ', Matcher.any()
    );
}
