package net.sen.lostworlds.block.wood;

import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.sen.lostworlds.api.LostWorldsApi;
import net.sen.lostworlds.block.ModBlockSetType;

public class ModWoodTypes {
    public static final WoodType ELDER_WOOD = registerWoodType("elder_wood", ModBlockSetType.ELDER_WOOD);
    public static final WoodType OLIVE = registerWoodType("olive", ModBlockSetType.OLIVE);
    public static final WoodType MYRRH = registerWoodType("myrrh", ModBlockSetType.MYRRH);
    public static final WoodType LAUREL = registerWoodType("laurel", ModBlockSetType.LAUREL);
    public static final WoodType CYPRESS = registerWoodType("cypress", ModBlockSetType.CYPRESS);
    public static final WoodType BLACK_BIRCH = registerWoodType("black_birch", ModBlockSetType.BLACK_BIRCH);
    public static final WoodType WHITE_OAK = registerWoodType("white_oak", ModBlockSetType.WHITE_OAK);
    public static final WoodType BUR_OAK = registerWoodType("bur_oak", ModBlockSetType.BUR_OAK);
    public static final WoodType BLOOD_CHERRY = registerWoodType("blood_cherry", ModBlockSetType.BLOOD_CHERRY);
    public static final WoodType SACRED_TREE = registerWoodType("sacred_tree", ModBlockSetType.SACRED_TREE);
    public static final WoodType WILLOW = registerWoodType("willow", ModBlockSetType.WILLOW);
    public static final WoodType DEADWOOD = registerWoodType("deadwood", ModBlockSetType.DEADWOOD);
    public static final WoodType EBONY_KINGSWOOD = registerWoodType("ebony_kingswood", ModBlockSetType.EBONY_KINGSWOOD);
    public static final WoodType IVORY_KINGSWOOD = registerWoodType("ivory_kingswood", ModBlockSetType.IVORY_KINGSWOOD);
    public static final WoodType WEAVER = registerWoodType("weaver", ModBlockSetType.WEAVER);

    private static WoodType registerWoodType(String name, BlockSetType blockSetType) {
        return WoodType.register(new WoodType(LostWorldsApi.MODID + ":" + name, blockSetType));
    }
}
