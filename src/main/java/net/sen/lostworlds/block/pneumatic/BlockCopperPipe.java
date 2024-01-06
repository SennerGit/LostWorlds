//package net.sen.lostworlds.block.pneumatic;
//
//import net.minecraft.world.level.block.state.properties.BooleanProperty;
//
//import javax.annotation.ParametersAreNonnullByDefault;
//
//import static net.minecraft.world.level.block.state.properties.BlockStateProperties.*;
//
//@ParametersAreNonnullByDefault
//public class BlockCopperPipe extends PneumaticBlock {
//    public static final BooleanProperty[] SIDES_CONNECTED = new BooleanProperty[] {DOWN, UP, NORTH, SOUTH, WEST, EAST};
//
//    public BlockCopperPipe(Properties pProperties) {
//        super(pProperties);
//        registerDefaultState(getStateDefinition().any()
//                .setValue(DOWN, Boolean.FALSE)
//                .setValue(UP, Boolean.FALSE)
//                .setValue(NORTH, Boolean.FALSE)
//                .setValue(SOUTH, Boolean.FALSE)
//                .setValue(WEST, Boolean.FALSE)
//                .setValue(EAST, Boolean.FALSE)
//        );
//    }
//}
