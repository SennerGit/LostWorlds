package net.sen.lostworlds.worldgen.portal;

import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectMaps;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import net.minecraft.BlockUtil;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.TicketType;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.Mth;
import net.minecraft.util.RandomSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.ai.village.poi.PoiManager;
import net.minecraft.world.entity.ai.village.poi.PoiRecord;
import net.minecraft.world.level.ChunkPos;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.border.WorldBorder;
import net.minecraft.world.level.chunk.LevelChunk;
import net.minecraft.world.level.dimension.DimensionType;
import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraft.world.level.portal.PortalInfo;
import net.minecraft.world.level.portal.PortalShape;
import net.minecraft.world.phys.Vec3;
import net.minecraftforge.common.util.ITeleporter;
import net.minecraftforge.registries.ForgeRegistries;
import net.sen.lostworlds.Config;
import net.sen.lostworlds.LostWorlds;
import net.sen.lostworlds.LostWorldsApi;
import net.sen.lostworlds.block.AlfheimrBlocks;
import net.sen.lostworlds.block.portal.AlfheimrPortalBlock;
import net.sen.lostworlds.worldgen.dimension.ModDimensions;

import javax.annotation.Nullable;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class AlfheimrTeleporter implements ITeleporter {
    protected final ServerLevel level;
    private final BlockState frame = !ForgeRegistries.BLOCKS.containsKey(ResourceLocation.tryParse(Config.Common.return_alfheimr_portal_frame_block_id.get())) ? Blocks.STONE_BRICKS.defaultBlockState() : ForgeRegistries.BLOCKS.getValue(ResourceLocation.tryParse(Config.Common.return_alfheimr_portal_frame_block_id.get())).defaultBlockState();
    private static Block PORTAL_WALL_BLOCK  = AlfheimrBlocks.ALFHEIMR_PORTAL_FRAME.get();
    private static Block PORTAL_BLOCK  = AlfheimrBlocks.ALFHEIMR_PORTAL.get();

    /**
     * Stores successful portal placement locations for rapid lookup.
     */

    private final Long2ObjectMap<PortalPosition> destinationCoordinateCache = new Long2ObjectOpenHashMap<>(4096);

    static final record PortalPosition(BlockPos pos, long lastUpdateTime) {
        public PortalPosition touch(long time) {
            return new PortalPosition(this.pos, time);
        }
    }

    public AlfheimrTeleporter(ServerLevel level) {
        this.level = level;
    }

    public Optional<BlockUtil.FoundRectangle> getExistingPortal(BlockPos pos) {
        PoiManager poiManager = this.level.getPoiManager();
        poiManager.ensureLoadedAndValid(this.level, pos, 64);
        Optional<PoiRecord> optional = poiManager.getInSquare((poiType) ->
                poiType.is(ModPortals.ALFHEIMR_PORTAL_POI.getKey()), pos, 64, PoiManager.Occupancy.ANY).sorted(Comparator.<PoiRecord>comparingDouble((poi) ->
                poi.getPos().distSqr(pos)).thenComparingInt((poi) ->
                poi.getPos().getY())).filter((poi) ->
                this.level.getBlockState(poi.getPos()).hasProperty(BlockStateProperties.HORIZONTAL_AXIS)).findFirst();
        return optional.map((poi) -> {
            BlockPos blockpos = poi.getPos();
            this.level.getChunkSource().addRegionTicket(TicketType.PORTAL, new ChunkPos(blockpos), 3, blockpos);
            BlockState blockstate = this.level.getBlockState(blockpos);
            return BlockUtil.getLargestRectangleAround(blockpos, blockstate.getValue(BlockStateProperties.HORIZONTAL_AXIS), 21, Direction.Axis.Y, 21, (blockPos) ->
                    this.level.getBlockState(blockPos) == blockstate);
        });
    }

//    public Optional<BlockUtil.FoundRectangle> makePortal(BlockPos pos, Direction.Axis axis) {
//        Direction direction = Direction.get(Direction.AxisDirection.POSITIVE, axis);
//        double d0 = -1.0D;
//        BlockPos blockpos = null;
//        double d1 = -1.0D;
//        BlockPos blockpos1 = null;
//        WorldBorder worldborder = this.level.getWorldBorder();
//        int i = Math.min(this.level.getMaxBuildHeight(), this.level.getMinBuildHeight() + this.level.getLogicalHeight()) - 1;
//        BlockPos.MutableBlockPos blockpos$mutableblockpos = pos.mutable();
//
//        for(BlockPos.MutableBlockPos checkPos : BlockPos.spiralAround(pos, 16, Direction.EAST, Direction.SOUTH)) {
//            int validStartHeight = Math.min(i, this.level.getHeight(Heightmap.Types.MOTION_BLOCKING, checkPos.getX(), checkPos.getZ()));
//            if (worldborder.isWithinBounds(checkPos) && worldborder.isWithinBounds(checkPos.move(direction, 1))) {
//                checkPos.move(direction.getOpposite(), 1);
//
//                for(int l = validStartHeight; l >= this.level.getMinBuildHeight(); --l) {
//                    checkPos.setY(l);
//                    if (this.canPortalReplaceBlock(checkPos)) {
//                        int i1;
//                        for(i1 = l; l > this.level.getMinBuildHeight() && this.canPortalReplaceBlock(checkPos.move(Direction.DOWN)); --l) {
//                        }
//
//                        if (l + 4 <= i) {
//                            int j1 = i1 - l;
//                            if (j1 <= 0 || j1 >= 3) {
//                                checkPos.setY(l);
//                                if (this.canHostFrame(checkPos, blockpos$mutableblockpos, direction, 0)) {
//                                    double d2 = pos.distSqr(checkPos);
//                                    if (this.canHostFrame(checkPos, blockpos$mutableblockpos, direction, -1) && this.canHostFrame(checkPos, blockpos$mutableblockpos, direction, 1) && (d0 == -1.0D || d0 > d2)) {
//                                        d0 = d2;
//                                        blockpos = checkPos.immutable();
//                                    }
//
//                                    if (d0 == -1.0D && (d1 == -1.0D || d1 > d2)) {
//                                        d1 = d2;
//                                        blockpos1 = checkPos.immutable();
//                                    }
//                                }
//                            }
//                        }
//                    }
//                }
//            }
//        }
//
//        if (d0 == -1.0D && d1 != -1.0D) {
//            blockpos = blockpos1;
//            d0 = d1;
//        }
//
//        if (d0 == -1.0D) {
//            int k1 = Math.max(this.level.getMinBuildHeight() + 1, 70);
//            int i2 = i - 9;
//            if (i2 < k1) {
//                return Optional.empty();
//            }
//
//            blockpos = (new BlockPos(pos.getX(), Mth.clamp(pos.getY(), k1, i2), pos.getZ())).immutable();
//            Direction direction1 = direction.getClockWise();
//            if (!worldborder.isWithinBounds(blockpos)) {
//                return Optional.empty();
//            }
//
//            for(int i3 = -1; i3 < 2; ++i3) {
//                for(int j3 = 0; j3 < 2; ++j3) {
//                    for(int k3 = -1; k3 < 3; ++k3) {
//                        BlockState blockstate1 = k3 < 0 ? this.frame : Blocks.AIR.defaultBlockState();
//                        blockpos$mutableblockpos.setWithOffset(blockpos, j3 * direction.getStepX() + i3 * direction1.getStepX(), k3, j3 * direction.getStepZ() + i3 * direction1.getStepZ());
//                        this.level.setBlockAndUpdate(blockpos$mutableblockpos, blockstate1);
//                    }
//                }
//            }
//        }
//
//        for(int l1 = -1; l1 < 3; ++l1) {
//            for(int j2 = -1; j2 < 4; ++j2) {
//                if (l1 == -1 || l1 == 2 || j2 == -1 || j2 == 3) {
//                    blockpos$mutableblockpos.setWithOffset(blockpos, l1 * direction.getStepX(), j2, l1 * direction.getStepZ());
//                    this.level.setBlock(blockpos$mutableblockpos, this.frame, 3);
//                }
//            }
//        }
//
//        BlockState blockstate = TELEPORTER_BLOCK.defaultBlockState().setValue(AlfheimrPortalBlock.AXIS, axis);
//
//        for(int k2 = 0; k2 < 2; ++k2) {
//            for(int l2 = 0; l2 < 3; ++l2) {
//                blockpos$mutableblockpos.setWithOffset(blockpos, k2 * direction.getStepX(), l2, k2 * direction.getStepZ());
//                this.level.setBlock(blockpos$mutableblockpos, blockstate, 18);
//            }
//        }
//
//        return Optional.of(new BlockUtil.FoundRectangle(blockpos.immutable(), 2, 3));
//    }

//    private boolean canPortalReplaceBlock(BlockPos.MutableBlockPos pos) {
//        BlockState blockstate = this.level.getBlockState(pos);
//        return blockstate.canBeReplaced() && blockstate.getFluidState().isEmpty();
//    }
//
//    private boolean canHostFrame(BlockPos originalPos, BlockPos.MutableBlockPos offsetPos, Direction direction, int offsetScale) {
//        Direction checkDir = direction.getClockWise();
//
//        for(int i = -1; i < 3; ++i) {
//            for(int j = -1; j < 4; ++j) {
//                offsetPos.setWithOffset(originalPos, direction.getStepX() * i + checkDir.getStepX() * offsetScale, j, direction.getStepZ() * i + checkDir.getStepZ() * offsetScale);
//                if (j < 0 && !this.level.getBlockState(offsetPos).isSolid()) {
//                    return false;
//                }
//
//                if (j >= 0 && !this.canPortalReplaceBlock(offsetPos)) {
//                    return false;
//                }
//            }
//        }
//
//        return true;
//    }

    @Nullable
    @Override
    public PortalInfo getPortalInfo(Entity entity, ServerLevel level, Function<ServerLevel, PortalInfo> defaultPortalInfo) {
        long startTime = System.currentTimeMillis();
        PortalInfo portalInfo = placeInExistingPortal(entity);

        if (portalInfo == null) {
            makePortal(entity);

            long finishTime = System.currentTimeMillis();
            LostWorlds.LOGGER.debug("It took {} seconds for AlfheimrTeleporter.placeInPortal to complete", (finishTime - startTime) / 1000.0F);

            return placeInExistingPortal(entity);
        } else {
            long finishTime = System.currentTimeMillis();
            LostWorlds.LOGGER.debug("It took {} seconds for AlfheimrTeleporter.placeInPortal to complete", (finishTime - startTime) / 1000.0F);

            return portalInfo;
        }
//        boolean destinationIsUG = level.dimension() == ModDimensions.ALFHEIMR_LEVEL_KEY;
//        if (entity.level().dimension() != ModDimensions.ALFHEIMR_LEVEL_KEY && !destinationIsUG) {
//            return null;
//        } else {
//            WorldBorder border = level.getWorldBorder();
//            double coordinateDifference = DimensionType.getTeleportationScale(entity.level().dimensionType(), level.dimensionType());
//            BlockPos pos = border.clampToBounds(entity.getX() * coordinateDifference, entity.getY(), entity.getZ() * coordinateDifference);
//            return this.getOrMakePortal(entity, pos).map((result) -> {
//                BlockState blockstate = entity.level().getBlockState(entity.portalEntrancePos);
//                Direction.Axis axis;
//                Vec3 vector3d;
//                if (blockstate.hasProperty(BlockStateProperties.HORIZONTAL_AXIS)) {
//                    axis = blockstate.getValue(BlockStateProperties.HORIZONTAL_AXIS);
//                    BlockUtil.FoundRectangle rectangle = BlockUtil.getLargestRectangleAround(entity.portalEntrancePos, axis, 21, Direction.Axis.Y, 21, blockPos -> entity.level().getBlockState(blockPos) == blockstate);
//                    vector3d = PortalShape.getRelativePosition(rectangle, axis, entity.position(), entity.getDimensions(entity.getPose()));
//                } else {
//                    axis = Direction.Axis.X;
//                    vector3d = new Vec3(0.5D, 0.0D, 0.0D);
//                }
//
//                return PortalShape.createPortalInfo(level, result, axis, vector3d, entity, entity.getDeltaMovement(), entity.getYRot(), entity.getXRot());
//            }).orElse(null);
//        }
    }

//    protected Optional<BlockUtil.FoundRectangle> getOrMakePortal(Entity entity, BlockPos pos) {
//        Optional<BlockUtil.FoundRectangle> existingPortal = this.getExistingPortal(pos);
//        if (existingPortal.isPresent()) {
//            return existingPortal;
//        } else {
//            Direction.Axis portalAxis = this.level.getBlockState(entity.portalEntrancePos).getOptionalValue(AlfheimrPortalBlock.AXIS).orElse(Direction.Axis.X);
//            return this.makePortal(pos, portalAxis);
//        }
//    }

    public PortalInfo placeInExistingPortal(Entity entity) {
        int searchArea = 148;
        double closestPortalDistance = -1D;
        int foundX = 0;
        int foundY = 0;
        int foundZ = 0;
        int entityX = Mth.floor(entity.getOnPos().getX());
        int entityZ = Mth.floor(entity.getOnPos().getZ());
        BlockPos blockpos = BlockPos.ZERO;
        boolean notInCache = true;

        long queryPos = ChunkPos.asLong(entityX, entityZ);

        if (destinationCoordinateCache.containsKey(queryPos)) {
            PortalPosition portal = destinationCoordinateCache.get(queryPos);
            closestPortalDistance = 0.0D;
            blockpos = portal.pos;
            destinationCoordinateCache.put(queryPos, portal.touch(level.getGameTime()));
            notInCache = false;
        } else {
            BlockPos.MutableBlockPos mutablePos = new BlockPos.MutableBlockPos();

            for (int x = entityX - searchArea; x <= entityX + searchArea; x++) {
                double distX = x + 0.5D - entity.getOnPos().getX();

                for (int z = entityZ - searchArea; z <= entityZ + searchArea; z++) {
                    double distZ = z + 0.5D - entity.getOnPos().getZ();

                    for (int y = level.getMaxBuildHeight() - 1; y >= 0; y--) {
                        mutablePos.set(x, y, z);
                        if (level.getBlockState(mutablePos).getBlock() == PORTAL_BLOCK) {
                            mutablePos.move(Direction.DOWN);
                            while (level.getBlockState(mutablePos).getBlock() == PORTAL_BLOCK) {
                                --y;
                                mutablePos.move(Direction.DOWN);
                            }

                            double distY = y + 0.5D - mutablePos.getY();
                            double distance = distX * distX + distY * distY + distZ * distZ;
                            if (closestPortalDistance < 0.0D || distance < closestPortalDistance) {
                                closestPortalDistance = distance;
                                foundX = x;
                                foundY = y;
                                foundZ = z;
                            }
                        }
                    }
                }
            }
        }

        if (closestPortalDistance >= 0.0D) {
            if (notInCache) {
                this.destinationCoordinateCache.put(queryPos, new PortalPosition(blockpos, this.level.getGameTime()));
            }

            double newLocX = foundX + 0.5D;
            double newLocY = foundY + 0.5D;
            double newLocZ = foundZ + 0.5D;

            BlockPos pos = new BlockPos(foundX, foundY, foundZ);

            if (level.getBlockState(pos.west()).getBlock() == PORTAL_BLOCK) newLocX -= 0.5D;
            if (level.getBlockState(pos.east()).getBlock() == PORTAL_BLOCK) newLocX += 0.5D;
            if (level.getBlockState(pos.north()).getBlock() == PORTAL_BLOCK) newLocZ -= 0.5D;
            if (level.getBlockState(pos.south()).getBlock() == PORTAL_BLOCK) newLocZ += 0.5D;

            return new PortalInfo(new Vec3(newLocX, newLocY + 2, newLocZ), Vec3.ZERO, entity.getYRot(), entity.getXRot());
        } else {
            return null;
        }
    }

    public boolean makePortal(Entity entity) {
        int searchArea = 16;
        double closestSpot = -1D;
        int entityX = Mth.floor(entity.getX());
        int entityY = Mth.floor(entity.getY());
        int entityZ = Mth.floor(entity.getZ());
        int foundX = entityX;
        int foundY = entityY;
        int foundZ = entityZ;

        for (int x = entityX - searchArea; x <= entityX + searchArea; x++) {
            double distX = (x + 0.5D) - entity.getX();
            nextCoords:
            for (int z = entityZ - searchArea; z <= entityZ + searchArea; z++) {
                double distZ = (z + 0.5D) - entity.getZ();

                // Find topmost solid block at this x,z location
                int y = level.getMaxBuildHeight() - 1;
                BlockPos pos = new BlockPos(x, y, z);
                for (; y >= 63 - 1 && (level.getBlockState(pos).getBlock() == Blocks.AIR ||
                        !getValidBuildBlocks().contains(level.getBlockState(pos))); pos = pos.below()) {
                    y = pos.getY();
                }
                // Only generate portal between sea level and sea level + 20
                if (y > 63 + 20 || y < 63) {
                    continue;
                }

                BlockPos tryPos = new BlockPos(x, y, z);
                if (getValidBuildBlocks().contains(level.getBlockState(tryPos))) {
                    for (int xOffset = -2; xOffset <= 2; xOffset++) {
                        for (int zOffset = -2; zOffset <= 2; zOffset++) {
                            int otherY = level.getMaxBuildHeight() - 1;
                            BlockPos pos1 = new BlockPos(x + xOffset, otherY, z + zOffset);
                            BlockPos pos2 = tryPos.mutable();
                            for (; otherY >= 63 && (level.getBlockState(pos1).getBlock() == Blocks.AIR ||
                                    !level.getBlockState(pos2).isAir()); pos1 = pos1.below()) {
                                otherY = pos1.getY();
                            }
                            if (Math.abs(y - otherY) >= 3) {
                                continue nextCoords;
                            }

                            //if (!getValidBuildBlocks().contains(level.getBlock(x + xOffset, otherY, z + zOffset))) {
                            //    continue nextCoords;
                            //}
                        }
                    }

                    double distY = (y + 0.5D) - entity.getY();
                    double distance = distX * distX + distY * distY + distZ * distZ;
                    if (closestSpot < 0.0D || distance < closestSpot) {
                        closestSpot = distance;
                        foundX = x;
                        foundY = y;
                        foundZ = z;
                    }
                }
            }
        }

        int worldSpawnX = Mth.floor(foundX);//TODO + ((RandomSource.create()).nextBoolean() ? 3 : -3);
        int worldSpawnZ = Mth.floor(foundZ);//TODO + ((RandomSource.create()).nextBoolean() ? 3 : -3);
        int worldSpawnY = getTerrainHeightAt(worldSpawnX, worldSpawnZ);//level.getHeightValue(worldSpawnX, worldSpawnZ) - 2;

        // Max distance to search in every direction for the nearest landmass to build a bridge to
        int SEARCH_FOR_LAND_DISTANCE_MAX = 200;

        // If we can't find a spot (e.g. we're in the middle of the ocean),
        // just put the portal at sea level
        if (closestSpot < 0.0D) {
            // Perhaps this was the culprit
            RandomSource r = RandomSource.create();
            foundX += r.nextInt(16) - 8;
            foundZ += r.nextInt(16) - 8;

            foundY = worldSpawnY - 2;
            boolean foundLand = false;

            for (int dist = 1; !foundLand && dist < SEARCH_FOR_LAND_DISTANCE_MAX; dist++) {
                for (Direction dir : Direction.Plane.HORIZONTAL) {
                    BlockPos pos = new BlockPos(worldSpawnX, worldSpawnY, worldSpawnZ).relative(dir, 3 + dist);
                    BlockState state = level.getBlockState(pos);
                    if (getValidBuildBlocks().contains(state)) {
                        foundLand = true;
                        BlockPos buildpos = new BlockPos(worldSpawnX, worldSpawnY + 1, worldSpawnZ).relative(dir, 3);
                        while (!buildpos.equals(pos.above())) {
//                            BlockState blockstate = TELEPORTER_BLOCK.defaultBlockState();
                            BlockState blockstate = Blocks.STONE_BRICKS.defaultBlockState();
                            level.setBlockAndUpdate(buildpos, blockstate);
                            level.setBlockAndUpdate(buildpos.relative(dir.getClockWise()), blockstate);
                            level.setBlockAndUpdate(buildpos.relative(dir.getCounterClockWise()), blockstate);
                            buildpos = buildpos.relative(dir);
                        }

                        BlockPos stairPosMid = new BlockPos(pos.getX(), worldSpawnY + 1, worldSpawnZ);
                        placeStairs(stairPosMid, dir.getOpposite());
                        generateBorder(worldSpawnX, worldSpawnY + 1, worldSpawnZ);
                        break;
                    }
                }
            }
        }

        buildTeleporterAt(worldSpawnX, worldSpawnY + 1, worldSpawnZ);

        return true;
    }

    private void placeStairs(BlockPos pos, Direction dir) {
        if (dir == Direction.EAST || dir == Direction.WEST) {
            BlockPos stairPosLeft = pos.offset(0, 0, -1);
            BlockPos stairPosMid = pos;
            BlockPos stairPosRight = pos.offset(0, 0, 1);

            BlockState thatchStairState = Blocks.STONE_BRICK_STAIRS.defaultBlockState().setValue(StairBlock.FACING, dir);

            level.setBlockAndUpdate(stairPosLeft, thatchStairState);
            level.setBlockAndUpdate(stairPosMid, thatchStairState);
            level.setBlockAndUpdate(stairPosRight, thatchStairState);
        } else if (dir == Direction.NORTH || dir == Direction.SOUTH) {
            BlockPos stairPosLeft = pos.offset(-1, 0, 0);
            BlockPos stairPosMid = pos;
            BlockPos stairPosRight = pos.offset(1, 0, 0);

            BlockState thatchStairState = Blocks.STONE_BRICK_STAIRS.defaultBlockState().setValue(StairBlock.FACING, dir);

            level.setBlockAndUpdate(stairPosLeft, thatchStairState);
            level.setBlockAndUpdate(stairPosMid, thatchStairState);
            level.setBlockAndUpdate(stairPosRight, thatchStairState);
        }
    }

    private void generateBorder(int x, int y, int z) {
        for (int zOffset = -4; zOffset <= 4; zOffset++) {
            for (int xOffset = -4; xOffset <= 4; xOffset++) {
                boolean isWall = xOffset < -2 || xOffset > 2 || zOffset < -2 || zOffset > 2;
                if (isWall) {
                    BlockPos thatchPos = new BlockPos(x + xOffset, y, z + zOffset);
                    level.setBlockAndUpdate(thatchPos, Blocks.STONE_BRICKS.defaultBlockState());
                }
            }
        }
    }

//    @Override
//    public boolean playTeleportSound(ServerPlayer player, ServerLevel sourceWorld, ServerLevel destWorld) {
//        return false;
//    }

    public int getTerrainHeightAt(int x, int z) {
        LevelChunk chunk2 = level.getChunk(x >> 4, z >> 4);
        int worldSpawnY = chunk2.getHeight(Heightmap.Types.WORLD_SURFACE, x & 15, z & 15);

        for (int y = worldSpawnY; y > 0; y--) {
            BlockState state = level.getBlockState(new BlockPos(x, y, z));

            //TODO [1.17]: Confirm that these tags are going to work with modded blocks
            if (state.is(BlockTags.DIRT) || state.is(BlockTags.SAND) || state.is(Blocks.WATER) || state.is(BlockTags.BASE_STONE_OVERWORLD)) {
                return y;
            }
        }
        return 0;
    }

    public void buildTeleporterAt(int x, int y, int z) {
        y = Math.max(y, 9);

        for (int yOffset = 4; yOffset >= -7; yOffset--) {
            for (int zOffset = -2; zOffset <= 2; zOffset++) {
                for (int xOffset = -2; xOffset <= 2; xOffset++) {
                    int blockX = x + xOffset;
                    int blockY = y + yOffset;
                    int blockZ = z + zOffset;
                    BlockPos pos = new BlockPos(blockX, blockY, blockZ);

                    if (yOffset == -7) {
                        // Set bottom of portal to be solid
                        level.setBlockAndUpdate(pos, PORTAL_WALL_BLOCK.defaultBlockState());
                    } else if (yOffset > 0) {
                        // Set 4 blocks above portal to air
                        level.setBlockAndUpdate(pos, Blocks.AIR.defaultBlockState());
                    } else {
                        boolean isWall = xOffset == -2 || xOffset == 2 || zOffset == -2 || zOffset == 2;
                        if (isWall) {
                            // Set walls around portal
                            level.setBlockAndUpdate(pos, PORTAL_WALL_BLOCK.defaultBlockState());
                        } else {
                            // Set inside of portal
                            boolean isTeleportBlock = yOffset <= -5;
                            if (isTeleportBlock) {
                                level.setBlockAndUpdate(pos, PORTAL_BLOCK.defaultBlockState());
                            } else {
                                level.setBlockAndUpdate(pos, PORTAL_BLOCK.defaultBlockState());
                            }
                        }
                    }

                    boolean isCorner = (xOffset == -2 || xOffset == 2) && (zOffset == -2 || zOffset == 2);
                    if (yOffset == 0 && isCorner) {
//                        level.setBlock(pos.above(), TropicraftBlocks.TIKI_TORCH.get().defaultBlockState().setValue(TikiTorchBlock.SECTION, TikiTorchBlock.TorchSection.LOWER), 3);
//                        level.setBlock(pos.above(2), TropicraftBlocks.TIKI_TORCH.get().defaultBlockState().setValue(TikiTorchBlock.SECTION, TikiTorchBlock.TorchSection.MIDDLE), 3);
//                        level.setBlock(pos.above(3), TropicraftBlocks.TIKI_TORCH.get().defaultBlockState().setValue(TikiTorchBlock.SECTION, TikiTorchBlock.TorchSection.UPPER), 3);
                    }
                }
            }
        }
    }

    public void tick(long worldTime) {
        if (worldTime % 100L == 0L) {
            this.pruneCoordinateCache(worldTime);
        }
    }

    private void pruneCoordinateCache(long gameTime) {
        long sinceTime = gameTime - 300L;

        ObjectIterator<Long2ObjectMap.Entry<PortalPosition>> iterator = Long2ObjectMaps.fastIterator(this.destinationCoordinateCache);
        while (iterator.hasNext()) {
            Long2ObjectMap.Entry<PortalPosition> entry = iterator.next();
            PortalPosition position = entry.getValue();
            if (position.lastUpdateTime < sinceTime) {
                ChunkPos columnPos = new ChunkPos(entry.getLongKey());
                DimensionType dimension = this.level.getLevel().dimensionType();
                LostWorlds.LOGGER.debug("Removing tropics portal ticket for {}:{}", dimension, columnPos);
                this.level.getChunkSource().addRegionTicket(TicketType.PORTAL, columnPos, 3, position.pos);
                iterator.remove();
            }
        }
    }

    private List<BlockState> getValidBuildBlocks() {
        return Arrays.asList(
                Blocks.SAND.defaultBlockState(),
                Blocks.GRASS.defaultBlockState(),
                Blocks.DIRT.defaultBlockState()
        );
    }
}