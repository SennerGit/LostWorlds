/*
Code from:
https://github.com/Ellpeck/NaturesAura/blob/main/src/main/java/de/ellpeck/naturesaura/blocks/tiles/ITickableBlockEntity.java#L7
 */
package net.sen.lostworlds.block.tile;

import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityTicker;
import net.minecraft.world.level.block.entity.BlockEntityType;

public interface ITickableBlockEntity {
    void tick();

    static <E extends BlockEntity, A extends BlockEntity> BlockEntityTicker<A> createTickerHelper(BlockEntityType<A> actual, BlockEntityType<E> expected) {
        return expected == actual ? (l, p, s, e) -> ((ITickableBlockEntity) e).tick() : null;
    }
}
