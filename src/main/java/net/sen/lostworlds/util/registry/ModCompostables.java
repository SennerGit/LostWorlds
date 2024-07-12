package net.sen.lostworlds.util.registry;

import net.minecraft.world.level.block.ComposterBlock;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.sen.lostworlds.registry.blocks.AlfheimrBlocks;
import net.sen.lostworlds.registry.items.AlfheimrItems;
import net.sen.lostworlds.registry.items.UnderworldItems;

public class ModCompostables {
    public static void setup(final FMLCommonSetupEvent event) {
        event.enqueueWork(() -> {
            ComposterBlock.COMPOSTABLES.put(UnderworldItems.POMEGRANATE.get(), 0.35f);
            ComposterBlock.COMPOSTABLES.put(UnderworldItems.OLIVE.get(), 0.35f);
            ComposterBlock.COMPOSTABLES.put(AlfheimrItems.DURUM_WHEAT.get(), 0.35f);
            ComposterBlock.COMPOSTABLES.put(AlfheimrItems.TOMATO.get(), 0.35f);
            ComposterBlock.COMPOSTABLES.put(AlfheimrItems.WILD_ONION.get(), 0.35f);
            ComposterBlock.COMPOSTABLES.put(AlfheimrItems.ONION_STAGE_1.get(), 0.35f);
            ComposterBlock.COMPOSTABLES.put(AlfheimrItems.ONION_STAGE_2.get(), 0.35f);
            ComposterBlock.COMPOSTABLES.put(AlfheimrItems.ONION_STAGE_3.get(), 0.35f);
            ComposterBlock.COMPOSTABLES.put(AlfheimrItems.ONION.get(), 0.35f);
            ComposterBlock.COMPOSTABLES.put(AlfheimrItems.DRAGON_FRUIT.get(), 0.35f);
            ComposterBlock.COMPOSTABLES.put(AlfheimrItems.CHILLI.get(), 0.35f);

            ComposterBlock.COMPOSTABLES.put(AlfheimrBlocks.POINT_MUSHROOM_BLOCK.get(), 0.35f);
            ComposterBlock.COMPOSTABLES.put(AlfheimrBlocks.WITCHES_MUSHROOM_BLOCK.get(), 0.35f);
            ComposterBlock.COMPOSTABLES.put(AlfheimrBlocks.ROYAL_BLUE_MUSHROOM_BLOCK.get(), 0.35f);
            ComposterBlock.COMPOSTABLES.put(AlfheimrBlocks.SHORT_TOP_MUSHROOM_BLOCK.get(), 0.35f);
            ComposterBlock.COMPOSTABLES.put(AlfheimrBlocks.SPECTRAL_MUSHROOM_BLOCK.get(), 0.35f);
            ComposterBlock.COMPOSTABLES.put(AlfheimrBlocks.SHADE_MUSHROOM_BLOCK.get(), 0.35f);
            ComposterBlock.COMPOSTABLES.put(AlfheimrBlocks.CAP_MUSHROOM_BLOCK.get(), 0.35f);

            ComposterBlock.COMPOSTABLES.put(UnderworldItems.POMEGRANATE_SEEDS.get(), 0.20f);
            ComposterBlock.COMPOSTABLES.put(AlfheimrItems.DURUM_WHEAT_SEEDS.get(), 0.20f);
            ComposterBlock.COMPOSTABLES.put(AlfheimrItems.TOMATO_SEEDS.get(), 0.20f);
            ComposterBlock.COMPOSTABLES.put(AlfheimrItems.DRAGON_FRUIT_SEEDS.get(), 0.20f);
            ComposterBlock.COMPOSTABLES.put(AlfheimrItems.CHILLI_SEEDS.get(), 0.20f);
        });
    }
}
