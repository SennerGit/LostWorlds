//package net.sen.lostworlds.block.pneumatic;
//
//import net.minecraft.core.BlockPos;
//import net.minecraft.world.entity.LivingEntity;
//import net.minecraft.world.item.ItemStack;
//import net.minecraft.world.level.Level;
//import net.minecraft.world.level.block.Block;
//import net.minecraft.world.level.block.EntityBlock;
//import net.minecraft.world.level.block.entity.BlockEntity;
//import net.minecraft.world.level.block.state.BlockState;
//import org.jetbrains.annotations.Nullable;
//
//import javax.annotation.ParametersAreNonnullByDefault;
//
//@ParametersAreNonnullByDefault
//public class PneumaticBlock extends Block implements EntityBlock {
//    public PneumaticBlock(Properties pProperties) {
//        super(pProperties);
//    }
//
//    @Override
//    public void setPlacedBy(Level pLevel, BlockPos pPos, BlockState pState, @Nullable LivingEntity pPlacer, ItemStack pStack) {
//        super.setPlacedBy(pLevel, pPos, pState, pPlacer, pStack);
//        if (pLevel.getBlockEntity(pPos) instanceof TilePneumaticDevice device) {
//
//        }
//    }
//
//    @Nullable
//    @Override
//    public BlockEntity newBlockEntity(BlockPos pPos, BlockState pState) {
//        return null;
//    }
//}
