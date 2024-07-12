package net.sen.lostworlds.block.portal;

import net.minecraft.core.Direction;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Portal;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.level.material.PushReaction;
import net.minecraft.world.phys.shapes.VoxelShape;

public abstract class ModPortalBlock extends Block implements Portal {
    public static final EnumProperty<Direction.Axis> AXIS = BlockStateProperties.HORIZONTAL_AXIS;
    public static final int AABB_OFFSET = 2;
    public static final VoxelShape X_AABB = Block.box(0.0D, 0.0D, 6.0D, 16.0D, 16.0D, 10.0D);
    public static final VoxelShape Z_AABB = Block.box(6.0D, 0.0D, 0.0D, 10.0D, 16.0D, 16.0D);

    public ModPortalBlock(BlockBehaviour.Properties properties) {
        super(properties);
    }

    public ModPortalBlock() {
        super(Properties.of()
                .pushReaction(PushReaction.BLOCK)
                .strength(-1f)
                .noOcclusion()
                .noCollission()
                .lightLevel((state) -> 10)
                .noLootTable());
    }
}
