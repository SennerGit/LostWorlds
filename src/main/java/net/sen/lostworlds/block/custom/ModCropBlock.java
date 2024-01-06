package net.sen.lostworlds.block.custom;

import net.minecraft.world.level.block.CropBlock;
import net.minecraft.world.level.block.state.properties.IntegerProperty;

public class ModCropBlock extends CropBlock {
    public ModCropBlock(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public IntegerProperty getAgeProperty() {
        return AGE;
    }
}
