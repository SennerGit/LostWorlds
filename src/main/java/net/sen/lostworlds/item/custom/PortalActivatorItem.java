package net.sen.lostworlds.item.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.sen.lostworlds.block.*;
import net.sen.lostworlds.block.portal.*;
import net.sen.lostworlds.worldgen.dimension.ModDimensions;

public class PortalActivatorItem extends Item {
    private static int level;

    public PortalActivatorItem(int level) {
        super(new Properties()
                .stacksTo(1)
                .durability(16)
        );

        this.level = level;
    }

    @Override
    public InteractionResult useOn(UseOnContext pContext) {
        if (pContext.getPlayer() != null) {
            if (pContext.getPlayer().level().dimension() == Level.OVERWORLD) {
                for (Direction direction : Direction.Plane.VERTICAL) {
                    BlockPos framePos = pContext.getClickedPos().relative(direction);
                    if (this.level >= 0) {
                        if (((UnderworldPortalBlock) UnderworldBlocks.UNDERWORLD_PORTAL.get()).trySpawnPortal(pContext.getLevel(), framePos)) {
                            pContext.getLevel().playSound(pContext.getPlayer(), framePos, SoundEvents.PORTAL_TRIGGER, SoundSource.BLOCKS, 1, 1);
                            pContext.getItemInHand().hurtAndBreak(1, pContext.getPlayer(),
                                    player -> player.broadcastBreakEvent(player.getUsedItemHand()));
                            return InteractionResult.CONSUME;
                        } else if (((NidavellirPortalBlock) NidavellirBlocks.NIDAVELLIR_PORTAL.get()).trySpawnPortal(pContext.getLevel(), framePos)) {
                            pContext.getLevel().playSound(pContext.getPlayer(), framePos, SoundEvents.PORTAL_TRIGGER, SoundSource.BLOCKS, 1, 1);
                            pContext.getItemInHand().hurtAndBreak(1, pContext.getPlayer(),
                                    player -> player.broadcastBreakEvent(player.getUsedItemHand()));
                            return InteractionResult.CONSUME;
                        } else if (((AlfheimrPortalBlock) AlfheimrBlocks.ALFHEIMR_PORTAL.get()).trySpawnPortal(pContext.getLevel(), framePos)) {
                            pContext.getLevel().playSound(pContext.getPlayer(), framePos, SoundEvents.PORTAL_TRIGGER, SoundSource.BLOCKS, 1, 1);
                            pContext.getItemInHand().hurtAndBreak(1, pContext.getPlayer(),
                                    player -> player.broadcastBreakEvent(player.getUsedItemHand()));
                            return InteractionResult.CONSUME;
                        } else if (((AtlantisPortalBlock) AtlantisBlocks.ATLANTIS_PORTAL.get()).trySpawnPortal(pContext.getLevel(), framePos)) {
                            pContext.getLevel().playSound(pContext.getPlayer(), framePos, SoundEvents.PORTAL_TRIGGER, SoundSource.BLOCKS, 1, 1);
                            pContext.getItemInHand().hurtAndBreak(1, pContext.getPlayer(),
                                    player -> player.broadcastBreakEvent(player.getUsedItemHand()));
                            return InteractionResult.CONSUME;
                        } else if (((SkyopiaPortalBlock) SkyopiaBlocks.SKYOPIA_PORTAL.get()).trySpawnPortal(pContext.getLevel(), framePos)) {
                            pContext.getLevel().playSound(pContext.getPlayer(), framePos, SoundEvents.PORTAL_TRIGGER, SoundSource.BLOCKS, 1, 1);
                            pContext.getItemInHand().hurtAndBreak(1, pContext.getPlayer(),
                                    player -> player.broadcastBreakEvent(player.getUsedItemHand()));
                            return InteractionResult.CONSUME;
                        }
                    } else {
                        return InteractionResult.FAIL;
                    }
                }
            }
            else {
                if (this.level >= 0) {
                    if (pContext.getPlayer().level().dimension() == ModDimensions.UNDERWORLD_LEVEL_KEY) {
                        for (Direction direction : Direction.Plane.VERTICAL) {
                            BlockPos framePos = pContext.getClickedPos().relative(direction);
                            if (((UnderworldPortalBlock) UnderworldBlocks.UNDERWORLD_PORTAL.get()).trySpawnPortal(pContext.getLevel(), framePos)) {
                                pContext.getLevel().playSound(pContext.getPlayer(), framePos, SoundEvents.PORTAL_TRIGGER, SoundSource.BLOCKS, 1, 1);
                                pContext.getItemInHand().hurtAndBreak(1, pContext.getPlayer(),
                                        player -> player.broadcastBreakEvent(player.getUsedItemHand()));
                                return InteractionResult.CONSUME;
                            } else {
                                return InteractionResult.FAIL;
                            }
                        }
                    }

                    if (pContext.getPlayer().level().dimension() == ModDimensions.NIDAVELLIR_LEVEL_KEY) {
                        for (Direction direction : Direction.Plane.VERTICAL) {
                            BlockPos framePos = pContext.getClickedPos().relative(direction);
                            if (((NidavellirPortalBlock) NidavellirBlocks.NIDAVELLIR_PORTAL.get()).trySpawnPortal(pContext.getLevel(), framePos)) {
                                pContext.getLevel().playSound(pContext.getPlayer(), framePos, SoundEvents.PORTAL_TRIGGER, SoundSource.BLOCKS, 1, 1);
                                pContext.getItemInHand().hurtAndBreak(1, pContext.getPlayer(),
                                        player -> player.broadcastBreakEvent(player.getUsedItemHand()));
                                return InteractionResult.CONSUME;
                            } else {
                                return InteractionResult.FAIL;
                            }
                        }
                    }

                    if (pContext.getPlayer().level().dimension() == ModDimensions.ALFHEIMR_LEVEL_KEY) {
                        for (Direction direction : Direction.Plane.VERTICAL) {
                            BlockPos framePos = pContext.getClickedPos().relative(direction);
                            if (((AlfheimrPortalBlock) AlfheimrBlocks.ALFHEIMR_PORTAL.get()).trySpawnPortal(pContext.getLevel(), framePos)) {
                                pContext.getLevel().playSound(pContext.getPlayer(), framePos, SoundEvents.PORTAL_TRIGGER, SoundSource.BLOCKS, 1, 1);
                                pContext.getItemInHand().hurtAndBreak(1, pContext.getPlayer(),
                                        player -> player.broadcastBreakEvent(player.getUsedItemHand()));
                                return InteractionResult.CONSUME;
                            } else {
                                return InteractionResult.FAIL;
                            }
                        }
                    }

                    if (pContext.getPlayer().level().dimension() == ModDimensions.ATLANTIS_LEVEL_KEY) {
                        for (Direction direction : Direction.Plane.VERTICAL) {
                            BlockPos framePos = pContext.getClickedPos().relative(direction);
                            if (((AlfheimrPortalBlock) AtlantisBlocks.ATLANTIS_PORTAL.get()).trySpawnPortal(pContext.getLevel(), framePos)) {
                                pContext.getLevel().playSound(pContext.getPlayer(), framePos, SoundEvents.PORTAL_TRIGGER, SoundSource.BLOCKS, 1, 1);
                                pContext.getItemInHand().hurtAndBreak(1, pContext.getPlayer(),
                                        player -> player.broadcastBreakEvent(player.getUsedItemHand()));
                                return InteractionResult.CONSUME;
                            } else {
                                return InteractionResult.FAIL;
                            }
                        }
                    }

                    if (pContext.getPlayer().level().dimension() == ModDimensions.SKYOPIA_LEVEL_KEY) {
                        for (Direction direction : Direction.Plane.VERTICAL) {
                            BlockPos framePos = pContext.getClickedPos().relative(direction);
                            if (((AlfheimrPortalBlock) SkyopiaBlocks.SKYOPIA_PORTAL.get()).trySpawnPortal(pContext.getLevel(), framePos)) {
                                pContext.getLevel().playSound(pContext.getPlayer(), framePos, SoundEvents.PORTAL_TRIGGER, SoundSource.BLOCKS, 1, 1);
                                pContext.getItemInHand().hurtAndBreak(1, pContext.getPlayer(),
                                        player -> player.broadcastBreakEvent(player.getUsedItemHand()));
                                return InteractionResult.CONSUME;
                            } else {
                                return InteractionResult.FAIL;
                            }
                        }
                    }
                }
            }
//            if (pContext.getPlayer().level().dimension() == ModDimensions.UNDERWORLD_LEVEL_KEY || pContext.getPlayer().level().dimension() == Level.OVERWORLD) {
//                for (Direction direction : Direction.Plane.VERTICAL) {
//                    BlockPos framePos = pContext.getClickedPos().relative(direction);
//                    if (((UnderworldPortalBlock) ModBlocks.UNDERWORLD_PORTAL.get()).trySpawnPortal(pContext.getLevel(), framePos)) {
//                        pContext.getLevel().playSound(pContext.getPlayer(), framePos, SoundEvents.PORTAL_TRIGGER, SoundSource.BLOCKS, 1, 1);
//                        return InteractionResult.CONSUME;
//                    } else {
//                        return InteractionResult.FAIL;
//                    }
//                }
//            }
//
//            if (pContext.getPlayer().level().dimension() == ModDimensions.NIDAVELLIR_LEVEL_KEY || pContext.getPlayer().level().dimension() == Level.OVERWORLD) {
//                for (Direction direction : Direction.Plane.VERTICAL) {
//                    BlockPos framePos = pContext.getClickedPos().relative(direction);
//                    if (((UnderworldPortalBlock) ModBlocks.NIDAVELLIR_PORTAL.get()).trySpawnPortal(pContext.getLevel(), framePos)) {
//                        pContext.getLevel().playSound(pContext.getPlayer(), framePos, SoundEvents.PORTAL_TRIGGER, SoundSource.BLOCKS, 1, 1);
//                        return InteractionResult.CONSUME;
//                    } else {
//                        return InteractionResult.FAIL;
//                    }
//                }
//            }
//
//            if (pContext.getPlayer().level().dimension() == ModDimensions.ALFHEIMR_LEVEL_KEY || pContext.getPlayer().level().dimension() == Level.OVERWORLD) {
//                for (Direction direction : Direction.Plane.VERTICAL) {
//                    BlockPos framePos = pContext.getClickedPos().relative(direction);
//                    if (((UnderworldPortalBlock) ModBlocks.ALFHEIMR_PORTAL.get()).trySpawnPortal(pContext.getLevel(), framePos)) {
//                        pContext.getLevel().playSound(pContext.getPlayer(), framePos, SoundEvents.PORTAL_TRIGGER, SoundSource.BLOCKS, 1, 1);
//                        return InteractionResult.CONSUME;
//                    } else {
//                        return InteractionResult.FAIL;
//                    }
//                }
//            }
        }

        return InteractionResult.FAIL;
    }
}