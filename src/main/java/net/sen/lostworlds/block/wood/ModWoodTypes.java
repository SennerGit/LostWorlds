package net.sen.lostworlds.block.wood;

import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.sen.lostworlds.LostWorldsApi;
import net.sen.lostworlds.block.ModBlockSetType;

public class ModWoodTypes {
    public static final WoodType ELDER_WOOD = registerWoodType("elder_wood", ModBlockSetType.ELDER_WOOD);
    public static final WoodType OLIVE = registerWoodType("olive", ModBlockSetType.OLIVE);
    public static final WoodType MYRRH = registerWoodType("myrrh", ModBlockSetType.MYRRH);
    public static final WoodType LAUREL = registerWoodType("laurel", ModBlockSetType.LAUREL);
    public static final WoodType CYPRESS = registerWoodType("cypress", ModBlockSetType.CYPRESS);

    private static WoodType registerWoodType(String name, BlockSetType blockSetType) {
        return WoodType.register(new WoodType(LostWorldsApi.MODID + ":" + name, blockSetType));
    }
}
