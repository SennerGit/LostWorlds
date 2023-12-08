package net.sen.lostworlds.util.registry;

import net.minecraft.world.level.block.ComposterBlock;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.sen.lostworlds.item.ModItems;

public class ModCompostables {
    public static void setup(final FMLCommonSetupEvent event) {
        event.enqueueWork(() -> {
            ComposterBlock.COMPOSTABLES.put(ModItems.CRIMSON_APPLE.get(), 0.35f);
            ComposterBlock.COMPOSTABLES.put(ModItems.POMEGRANATE.get(), 0.35f);
            ComposterBlock.COMPOSTABLES.put(ModItems.OLIVE.get(), 0.35f);

            ComposterBlock.COMPOSTABLES.put(ModItems.POMEGRANATE_SEEDS.get(), 0.20f);
        });
    }
}
