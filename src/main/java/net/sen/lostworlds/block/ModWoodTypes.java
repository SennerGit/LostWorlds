package net.sen.lostworlds.block;

import net.minecraft.world.level.block.state.properties.WoodType;
import net.sen.lostworlds.LostWorlds;

public class ModWoodTypes {
    public static final WoodType ELDER_WOOD = WoodType.register(new WoodType(LostWorlds.MODID + ":elder_wood", ModBlockSetType.ELDER_WOOD));
    public static final WoodType OLIVE = WoodType.register(new WoodType(LostWorlds.MODID + ":olive", ModBlockSetType.OLIVE));
    public static final WoodType MYRRH = WoodType.register(new WoodType(LostWorlds.MODID + ":myrrh", ModBlockSetType.MYRRH));
    public static final WoodType LAUREL = WoodType.register(new WoodType(LostWorlds.MODID + ":laurel", ModBlockSetType.LAUREL));
    public static final WoodType CYPRESS = WoodType.register(new WoodType(LostWorlds.MODID + ":cypress", ModBlockSetType.LAUREL));
}
