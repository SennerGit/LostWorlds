//package net.sen.lostworlds.multiblocks.druid_ritual;
//
//import net.minecraft.core.BlockPos;
//import net.minecraft.core.particles.ParticleTypes;
//import net.minecraft.server.level.ServerLevel;
//import net.minecraft.world.entity.player.Player;
//import net.minecraft.world.item.ItemStack;
//import net.minecraft.world.level.Level;
//
//public class CraftDruidRitual extends DruidRitual{
//    public CraftDruidRitual(DruidRitual recipe) {
//        super(recipe);
//    }
//
//    @Override
//    public void finish(Level level, BlockPos goldenBowlPosition, GoldenSacrificialBowlBlockEntity blockEntity, Player castingPlayer, ItemStack activationItem) {
//        super.finish(level, goldenBowlPosition, blockEntity, castingPlayer, activationItem);
//
//
//        activationItem.shrink(1); //remove activation item.
//
//        ((ServerLevel) level).sendParticles(ParticleTypes.LARGE_SMOKE, goldenBowlPosition.getX() + 0.5,
//                goldenBowlPosition.getY() + 0.5, goldenBowlPosition.getZ() + 0.5, 1, 0, 0, 0, 0);
//
//        ItemStack result = this.recipe.getResultItem(level.registryAccess()).copy();
//        this.dropResult(level, goldenBowlPosition, blockEntity, castingPlayer, result);
//    }
//}
