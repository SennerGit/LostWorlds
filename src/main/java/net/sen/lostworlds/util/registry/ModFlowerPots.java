package net.sen.lostworlds.util.registry;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.FlowerPotBlock;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.sen.lostworlds.block.ModBlocks;

public class ModFlowerPots {
    public static void setup(final FMLCommonSetupEvent event) {
        event.enqueueWork(() -> {
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.IRIS_FLOWER.getId(), ModBlocks.POTTED_IRIS_FLOWER);
        });
    }
}
