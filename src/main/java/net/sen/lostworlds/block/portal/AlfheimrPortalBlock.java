package net.sen.lostworlds.block.portal;

import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import net.minecraft.BlockUtil;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.resources.ResourceKey;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.util.RandomSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityDimensions;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.*;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.border.WorldBorder;
import net.minecraft.world.level.dimension.DimensionType;
import net.minecraft.world.level.portal.DimensionTransition;
import net.minecraft.world.level.portal.PortalShape;
import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.level.BlockEvent;
import net.sen.lostworlds.registry.blocks.AlfheimrBlocks;
import net.sen.lostworlds.util.ModTags;
import net.sen.lostworlds.worldgen.dimension.ModDimensions;
import org.slf4j.Logger;

import javax.annotation.Nullable;

import java.util.Optional;

public class AlfheimrPortalBlock extends ModPortalBlock {
    public static final MapCodec<AlfheimrPortalBlock> CODEC = simpleCodec(AlfheimrPortalBlock::new);
    private static final Logger LOGGER = LogUtils.getLogger();

    @Override
    public MapCodec<? extends Block> codec() {
        return CODEC;
    }

    public AlfheimrPortalBlock(BlockBehaviour.Properties properties) {
        super(properties);
        this.registerDefaultState(stateDefinition.any().setValue(AXIS, Direction.Axis.X));
    }

    public AlfheimrPortalBlock() {
        this.registerDefaultState(stateDefinition.any().setValue(AXIS, Direction.Axis.X));
    }

    @Override
    public VoxelShape getShape(BlockState pState, BlockGetter pLevel, BlockPos pPos, CollisionContext pContext) {
        switch ((Direction.Axis) pState.getValue(AXIS)) {
            case Z:
                return Z_AABB;
            case X:
            default:
                return X_AABB;
        }
    }

    @Override
    public BlockState updateShape(BlockState stateIn, Direction facing, BlockState facingState, LevelAccessor level, BlockPos currentPos, BlockPos facingPos) {
        Direction.Axis direction$axis = facing.getAxis();
        Direction.Axis direction$axis1 = stateIn.getValue(AXIS);
        boolean flag = direction$axis1 != direction$axis && direction$axis.isHorizontal();
        return !flag && !facingState.is(this) && !new PortalShape(level, currentPos, direction$axis1).isComplete()
                ? Blocks.AIR.defaultBlockState()
                : super.updateShape(stateIn, facing, facingState, level, currentPos, facingPos);
    }

    @Override
    public void entityInside(BlockState state, Level level, BlockPos pos, Entity entity) {
        if (entity.canUsePortal(false)) {
            entity.setAsInsidePortal(this, pos);
        }
    }

    @Override
    public int getPortalTransitionTime(ServerLevel level, Entity entity) {
        return entity instanceof Player player
                ? Math.max(
                        1,
                level.getGameRules()
                        .getInt(
                                player.getAbilities().invulnerable
                                ? GameRules.RULE_PLAYERS_NETHER_PORTAL_CREATIVE_DELAY
                                : GameRules.RULE_PLAYERS_NETHER_PORTAL_DEFAULT_DELAY
                        )
        )
        : 0;
    }

    @org.jetbrains.annotations.Nullable
    @Override
    public DimensionTransition getPortalDestination(ServerLevel level, Entity entity, BlockPos pos) {
        ResourceKey<Level> resourceKey = level.dimension() == ModDimensions.ALFHEIMR_LEVEL_KEY ? Level.OVERWORLD : ModDimensions.ALFHEIMR_LEVEL_KEY;
        ServerLevel serverLevel = level.getServer().getLevel(resourceKey);
        if (serverLevel == null) {
            return null;
        } else {
            boolean flag = serverLevel.dimension() == ModDimensions.ALFHEIMR_LEVEL_KEY;
            WorldBorder worldBorder = serverLevel.getWorldBorder();
            double d0 = DimensionType.getTeleportationScale(level.dimensionType(), serverLevel.dimensionType());
            BlockPos blockPos = worldBorder.clampToBounds(entity.getX() * d0, entity.getY(), entity.getZ() * d0);
            return this.getExitPortal(serverLevel, entity, pos, blockPos, flag, worldBorder);
        }
    }

    @Nullable
    private DimensionTransition getExitPortal(ServerLevel level, Entity entity, BlockPos startPos, BlockPos endPos, boolean flag, WorldBorder worldBorder) {
        Optional<BlockPos> optional = level.getPortalForcer().findClosestPortalPosition(endPos, flag, worldBorder);
        BlockUtil.FoundRectangle blockutil$foundrectangle;
        DimensionTransition.PostDimensionTransition dimensiontransition$postdimensiontransition;
        if (optional.isPresent()) {
            BlockPos blockPos = optional.get();
            BlockState blockState = level.getBlockState(blockPos);
            blockutil$foundrectangle = BlockUtil.getLargestRectangleAround(
                    blockPos,
                    blockState.getValue(BlockStateProperties.HORIZONTAL_AXIS),
                    21,
                    Direction.Axis.Y,
                    21,
                    pos -> level.getBlockState(pos) == blockState
            );
            dimensiontransition$postdimensiontransition = DimensionTransition.PLAY_PORTAL_SOUND.then(pos -> pos.placePortalTicket(blockPos));
        } else {
            Direction.Axis direction$axis = entity.level().getBlockState(startPos).getOptionalValue(AXIS).orElse(Direction.Axis.X);
            Optional<BlockUtil.FoundRectangle> optional1 = level.getPortalForcer().createPortal(endPos, direction$axis);
            if (optional1.isEmpty()) {
                LOGGER.error("Unable to create a portal, likely target out of worldborder");
                return null;
            }

            blockutil$foundrectangle = optional1.get();
            dimensiontransition$postdimensiontransition = DimensionTransition.PLAY_PORTAL_SOUND.then(DimensionTransition.PLACE_PORTAL_TICKET);
        }

        return getDimensionTransitionFromExit(entity, startPos, blockutil$foundrectangle, level, dimensiontransition$postdimensiontransition);
    }

    private DimensionTransition getDimensionTransitionFromExit(Entity entity, BlockPos blockPos, BlockUtil.FoundRectangle foundrectangle, ServerLevel level, DimensionTransition.PostDimensionTransition dimensiontransition$postdimensiontransition) {
        BlockState blockState = entity.level().getBlockState(blockPos);
        Direction.Axis direction$axis;
        Vec3 vec3;
        if (blockState.hasProperty(BlockStateProperties.HORIZONTAL_AXIS)) {
            direction$axis = blockState.getValue(BlockStateProperties.HORIZONTAL_AXIS);
            BlockUtil.FoundRectangle blockutil$foundrectangle = BlockUtil.getLargestRectangleAround(
                    blockPos,
                    direction$axis,
                    21,
                    Direction.Axis.Y,
                    21,
                    pos -> entity.level().getBlockState(pos) == blockState
            );
            vec3 = entity.getRelativePortalPosition(direction$axis, blockutil$foundrectangle);
        } else {
            direction$axis = Direction.Axis.X;
            vec3 = new Vec3(0.5, 0.0, 0.0);
        }

        return createDimensionTransition(level, foundrectangle, direction$axis, vec3, entity, entity.getDeltaMovement(), entity.getYRot(), entity.getXRot(), dimensiontransition$postdimensiontransition);
    }

    private DimensionTransition createDimensionTransition(ServerLevel level, BlockUtil.FoundRectangle foundrectangle, Direction.Axis axis, Vec3 vec3P, Entity entity, Vec3 deltaMovement, float yRot, float xRot, DimensionTransition.PostDimensionTransition dimensiontransition$postdimensiontransition) {
        BlockPos blockPos = foundrectangle.minCorner;
        BlockState blockState = level.getBlockState(blockPos);
        Direction.Axis direction$axis = blockState.getOptionalValue(BlockStateProperties.HORIZONTAL_AXIS).orElse(Direction.Axis.X);
        double d0 = (double) foundrectangle.axis1Size;
        double d1 = (double) foundrectangle.axis2Size;
        EntityDimensions entityDimensions = entity.getDimensions(entity.getPose());
        int i = axis == direction$axis ? 0 : 90;
        Vec3 vec3 = axis == direction$axis ? deltaMovement : new Vec3(deltaMovement.z, deltaMovement.y, -deltaMovement.x);
        double d2 = (double) entityDimensions.width() / 2.0 + (d0 - (double) entityDimensions.width()) * vec3P.x();
        double d3 = (d1 - (double) entityDimensions.height()) * vec3P.y();
        double d4 = 0.5 + vec3P.z();
        boolean flag = direction$axis == Direction.Axis.X;
        Vec3 vec31 = new Vec3((double) blockPos.getX() + (flag ? d2 : d4), (double) blockPos.getY() + d3, (double) blockPos.getZ() + (flag ? d4 : d2));
        Vec3 vec32 = PortalShape.findCollisionFreePosition(vec31, level, entity, entityDimensions);
        return new DimensionTransition(level, vec32, vec3, yRot + (float)  i, xRot, dimensiontransition$postdimensiontransition);
    }

    @Override
    public Transition getLocalTransition() {
        return Transition.CONFUSION;
    }

    @Override
    public void animateTick(BlockState state, Level level, BlockPos pos, RandomSource random) {
        if (random.nextInt(100) == 0) {
            level.playLocalSound(
                    (double) pos.getX() + 0.5D,
                    (double) pos.getY() + 0.5D,
                    (double) pos.getZ() + 0.5D,
                    SoundEvents.PORTAL_AMBIENT,
                    SoundSource.BLOCKS,
                    0.5F,
                    random.nextFloat() * 0.4F + 0.8F,
                    false
            );
        }

        for (int i = 0; i < 4; ++i) {
            double x = (double) pos.getX() + random.nextDouble();
            double y = (double) pos.getY() + random.nextDouble();
            double z = (double) pos.getZ() + random.nextDouble();
            double xSpeed = ((double) random.nextFloat() - 0.5D) * 0.5D;
            double ySpeed = ((double) random.nextFloat() - 0.5D) * 0.5D;
            double zSpeed = ((double) random.nextFloat() - 0.5D) * 0.5D;
            int j = random.nextInt(2) * 2 - 1;
            if (!level.getBlockState(pos.west()).is(this) && !level.getBlockState(pos.east()).is(this)) {
                x = (double) pos.getX() + 0.5D + 0.25D * (double) j;
                xSpeed = random.nextFloat() * 2.0F * (float) j;
            } else {
                z = (double) pos.getZ() + 0.5D + 0.25D * (double) j;
                zSpeed = random.nextFloat() * 2.0F * (float) j;
            }

            level.addParticle(ParticleTypes.PORTAL, x, y, z, xSpeed, ySpeed, zSpeed);
        }

    }

    @Override
    public ItemStack getCloneItemStack(LevelReader level, BlockPos pos, BlockState state) {
        return ItemStack.EMPTY;
    }

    @Override
    public BlockState rotate(BlockState state, Rotation rot) {
        switch (rot) {
            case COUNTERCLOCKWISE_90:
            case CLOCKWISE_90:
                switch (state.getValue(AXIS)) {
                    case Z:
                        return state.setValue(AXIS, Direction.Axis.X);
                    case X:
                        return state.setValue(AXIS, Direction.Axis.Z);
                    default:
                        return state;
                }
            default:
                return state;
        }
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(AXIS);
    }

    /*
    Data for the activator
     */
    public boolean trySpawnPortal(LevelAccessor level, BlockPos pos) {
        AlfheimrPortalBlock.AlfheimrPortalShape size = this.isPortal(level, pos);
        if (size != null && !onTrySpawnPortal(level, pos, size)) {
            size.createPortalBlocks();
            return true;
        } else {
            return false;
        }
    }

    public static boolean onTrySpawnPortal(LevelAccessor world, BlockPos pos, AlfheimrPortalBlock.AlfheimrPortalShape size) {
        return NeoForge.EVENT_BUS.post(new BlockEvent.PortalSpawnEvent(world, pos, world.getBlockState(pos), size)).isCanceled();
    }

    @Nullable
    public AlfheimrPortalBlock.AlfheimrPortalShape isPortal(LevelAccessor level, BlockPos pos) {
        AlfheimrPortalBlock.AlfheimrPortalShape AlfheimrPortalBlock$size = new AlfheimrPortalBlock.AlfheimrPortalShape(level, pos, Direction.Axis.X);
        if (AlfheimrPortalBlock$size.isValid() && AlfheimrPortalBlock$size.numPortalBlocks == 0) {
            return AlfheimrPortalBlock$size;
        } else {
            AlfheimrPortalBlock.AlfheimrPortalShape AlfheimrPortalBlock$size1 = new AlfheimrPortalBlock.AlfheimrPortalShape(level, pos, Direction.Axis.Z);
            return AlfheimrPortalBlock$size1.isValid() && AlfheimrPortalBlock$size1.numPortalBlocks == 0 ? AlfheimrPortalBlock$size1 : null;
        }
    }

    public static class AlfheimrPortalShape extends PortalShape {
        private static final int MIN_WIDTH = 1;
        public static final int MAX_WIDTH = 21;
        private static final int MIN_HEIGHT = 2;
        public static final int MAX_HEIGHT = 21;
        private static final StatePredicate FRAME = (state, getter, pos) -> state.is(ModTags.Blocks.SKYOPIA_PORTAL_FRAME_BLOCKS);
        private final LevelAccessor level;
        private final Direction.Axis axis;
        private final Direction rightDir;
        private int numPortalBlocks;
        private BlockPos bottomLeft;
        private int height;
        private final int width;

        public AlfheimrPortalShape(LevelAccessor level, BlockPos bottomLeftPos, Direction.Axis axis) {
            super(level, bottomLeftPos, axis);
            this.level = level;
            this.axis = axis;
            this.rightDir = axis == Direction.Axis.X ? Direction.WEST : Direction.SOUTH;
            this.bottomLeft = this.calculateBottomLeft(bottomLeftPos);
            if (this.bottomLeft == null) {
                this.bottomLeft = bottomLeftPos;
                this.width = 1;
                this.height = 1;
            } else {
                this.width = this.calculateWidth();
                if (this.width > 0) {
                    this.height = this.calculateHeight();
                }
            }

        }

        @Nullable
        private BlockPos calculateBottomLeft(BlockPos pos) {
            for (int i = Math.max(this.level.getMinBuildHeight(), pos.getY() - MAX_HEIGHT); pos.getY() > i && isEmpty(this.level.getBlockState(pos.below())); pos = pos.below()) {
            }

            Direction direction = this.rightDir.getOpposite();
            int j = this.getDistanceUntilEdgeAboveFrame(pos, direction) - 1;
            return j < 0 ? null : pos.relative(direction, j);
        }

        private int calculateWidth() {
            int i = this.getDistanceUntilEdgeAboveFrame(this.bottomLeft, this.rightDir);
            return i >= MIN_WIDTH && i <= MAX_WIDTH ? i : 0;
        }

        private int getDistanceUntilEdgeAboveFrame(BlockPos pos, Direction direction) {
            BlockPos.MutableBlockPos mutablePos = new BlockPos.MutableBlockPos();

            for (int i = 0; i <= MAX_WIDTH; ++i) {
                mutablePos.set(pos).move(direction, i);
                BlockState blockstate = this.level.getBlockState(mutablePos);
                if (!isEmpty(blockstate)) {
                    if (FRAME.test(blockstate, this.level, mutablePos)) {
                        return i;
                    }
                    break;
                }

                BlockState blockstate1 = this.level.getBlockState(mutablePos.move(Direction.DOWN));
                if (!FRAME.test(blockstate1, this.level, mutablePos)) {
                    break;
                }
            }

            return 0;
        }

        private int calculateHeight() {
            BlockPos.MutableBlockPos mutablePos = new BlockPos.MutableBlockPos();
            int i = this.getDistanceUntilTop(mutablePos);
            return i >= MIN_HEIGHT && i <= MAX_HEIGHT && this.hasTopFrame(mutablePos, i) ? i : 0;
        }

        private boolean hasTopFrame(BlockPos.MutableBlockPos pos, int height) {
            for (int i = 0; i < this.width; ++i) {
                BlockPos.MutableBlockPos mutablePos = pos.set(this.bottomLeft).move(Direction.UP, height).move(this.rightDir, i);
                if (!FRAME.test(this.level.getBlockState(mutablePos), this.level, mutablePos)) {
                    return false;
                }
            }

            return true;
        }

        private int getDistanceUntilTop(BlockPos.MutableBlockPos pos) {
            for (int i = 0; i < MAX_HEIGHT; ++i) {
                pos.set(this.bottomLeft).move(Direction.UP, i).move(this.rightDir, -1);
                if (!FRAME.test(this.level.getBlockState(pos), this.level, pos)) {
                    return i;
                }

                pos.set(this.bottomLeft).move(Direction.UP, i).move(this.rightDir, this.width);
                if (!FRAME.test(this.level.getBlockState(pos), this.level, pos)) {
                    return i;
                }

                for (int j = 0; j < this.width; ++j) {
                    pos.set(this.bottomLeft).move(Direction.UP, i).move(this.rightDir, j);
                    BlockState blockstate = this.level.getBlockState(pos);
                    if (!isEmpty(blockstate)) {
                        return i;
                    }

                    if (blockstate.is(Blocks.NETHER_PORTAL)) {
                        ++this.numPortalBlocks;
                    }
                }
            }

            return MAX_HEIGHT;
        }

        private static boolean isEmpty(BlockState state) {
            return state.isAir() || state.is(AlfheimrBlocks.ALFHEIMR_PORTAL.get());
        }

        public boolean isValid() {
            return this.bottomLeft != null && this.width >= MIN_WIDTH && this.width <= MAX_WIDTH && this.height >= MIN_HEIGHT && this.height <= MAX_HEIGHT;
        }

        public void createPortalBlocks() {
            BlockState blockstate = AlfheimrBlocks.ALFHEIMR_PORTAL.get().defaultBlockState().setValue(NetherPortalBlock.AXIS, this.axis);
            BlockPos.betweenClosed(this.bottomLeft, this.bottomLeft.relative(Direction.UP, this.height - 1).relative(this.rightDir, this.width - 1)).forEach(pos -> this.level.setBlock(pos, blockstate, 18));
        }

        public boolean isComplete() {
            return this.isValid() && this.numPortalBlocks == this.width * this.height;
        }
    }
}