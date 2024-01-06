package net.sen.lostworlds.util.registry;

import net.minecraft.world.level.block.ComposterBlock;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.sen.lostworlds.block.ModBlocks;
import net.sen.lostworlds.item.ModItems;

public class ModCompostables {
    public static void setup(final FMLCommonSetupEvent event) {
        event.enqueueWork(() -> {
            ComposterBlock.COMPOSTABLES.put(ModItems.CRIMSON_APPLE.get(), 0.35f);
            ComposterBlock.COMPOSTABLES.put(ModItems.POMEGRANATE.get(), 0.35f);
            ComposterBlock.COMPOSTABLES.put(ModItems.OLIVE.get(), 0.35f);
            ComposterBlock.COMPOSTABLES.put(ModItems.DURUM_WHEAT.get(), 0.35f);
            ComposterBlock.COMPOSTABLES.put(ModItems.TOMATO.get(), 0.35f);
            ComposterBlock.COMPOSTABLES.put(ModItems.WILD_ONION.get(), 0.35f);
            ComposterBlock.COMPOSTABLES.put(ModItems.ONION_STAGE_1.get(), 0.35f);
            ComposterBlock.COMPOSTABLES.put(ModItems.ONION_STAGE_2.get(), 0.35f);
            ComposterBlock.COMPOSTABLES.put(ModItems.ONION_STAGE_3.get(), 0.35f);
            ComposterBlock.COMPOSTABLES.put(ModItems.ONION.get(), 0.35f);
            ComposterBlock.COMPOSTABLES.put(ModItems.DRAGON_FRUIT.get(), 0.35f);
            ComposterBlock.COMPOSTABLES.put(ModItems.CHILLI.get(), 0.35f);

            ComposterBlock.COMPOSTABLES.put(ModBlocks.POINT_MUSHROOM_BLOCK.get(), 0.35f);
            ComposterBlock.COMPOSTABLES.put(ModBlocks.WITCHES_MUSHROOM_BLOCK.get(), 0.35f);
            ComposterBlock.COMPOSTABLES.put(ModBlocks.ROYAL_BLUE_MUSHROOM_BLOCK.get(), 0.35f);
            ComposterBlock.COMPOSTABLES.put(ModBlocks.SHORT_TOP_MUSHROOM_BLOCK.get(), 0.35f);
            ComposterBlock.COMPOSTABLES.put(ModBlocks.SPECTRAL_MUSHROOM_BLOCK.get(), 0.35f);
            ComposterBlock.COMPOSTABLES.put(ModBlocks.SHADE_MUSHROOM_BLOCK.get(), 0.35f);
            ComposterBlock.COMPOSTABLES.put(ModBlocks.CAP_MUSHROOM_BLOCK.get(), 0.35f);

            ComposterBlock.COMPOSTABLES.put(ModItems.POMEGRANATE_SEEDS.get(), 0.20f);
            ComposterBlock.COMPOSTABLES.put(ModItems.DURUM_WHEAT_SEEDS.get(), 0.20f);
            ComposterBlock.COMPOSTABLES.put(ModItems.TOMATO_SEEDS.get(), 0.20f);
            ComposterBlock.COMPOSTABLES.put(ModItems.DRAGON_FRUIT_SEEDS.get(), 0.20f);
            ComposterBlock.COMPOSTABLES.put(ModItems.CHILLI_SEEDS.get(), 0.20f);
        });
    }
}
