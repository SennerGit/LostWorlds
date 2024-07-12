package net.sen.lostworlds.util.registry;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.FlowerPotBlock;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.sen.lostworlds.registry.blocks.AlfheimrBlocks;
import net.sen.lostworlds.registry.blocks.UnderworldBlocks;

public class ModFlowerPots {
    public static void setup(final FMLCommonSetupEvent event) {
        event.enqueueWork(() -> {
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(UnderworldBlocks.IRIS_FLOWER.getId(), UnderworldBlocks.POTTED_IRIS_FLOWER);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(AlfheimrBlocks.DARK_BLOOM_FLOWER.getId(), AlfheimrBlocks.POTTED_DARK_BLOOM_FLOWER);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(AlfheimrBlocks.DREAD_NIGHT_FLOWER.getId(), AlfheimrBlocks.POTTED_DREAD_NIGIHT_FLOWER);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(AlfheimrBlocks.BLACK_LOTUS_FLOWER.getId(), AlfheimrBlocks.POTTED_BLACK_LOTUS_FLOWER);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(AlfheimrBlocks.NIGHT_ROSE_FLOWER.getId(), AlfheimrBlocks.POTTED_NIGHT_ROSE_FLOWER);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(AlfheimrBlocks.AQUA_ROSE_FLOWER.getId(), AlfheimrBlocks.POTTED_AQUA_ROSE_FLOWER);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(AlfheimrBlocks.MOON_FLOWER.getId(), AlfheimrBlocks.POTTED_MOON_FLOWER);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(AlfheimrBlocks.CATHERINE_FLOWER.getId(), AlfheimrBlocks.POTTED_CATHERINE_FLOWER);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(AlfheimrBlocks.TAINTED_ROSE_FLOWER.getId(), AlfheimrBlocks.POTTED_TAINTED_ROSE_FLOWER);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(AlfheimrBlocks.CINNAMON_ROSE_FLOWER.getId(), AlfheimrBlocks.POTTED_CINNAMON_ROSE_FLOWER);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(AlfheimrBlocks.BUTTERFLY_FLOWER.getId(), AlfheimrBlocks.POTTED_BUTTERFLY_FLOWER);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(AlfheimrBlocks.GAIA_TULIP_FLOWER.getId(), AlfheimrBlocks.POTTED_GAIA_TULIP_FLOWER);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(AlfheimrBlocks.BEARDED_IRIS_FLOWER.getId(), AlfheimrBlocks.POTTED_BEARDED_IRIS_FLOWER);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(AlfheimrBlocks.CORNFLOWER_FLOWER.getId(), AlfheimrBlocks.POTTED_CORNFLOWER_FLOWER);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(AlfheimrBlocks.MORNING_GLORY_FLOWER.getId(), AlfheimrBlocks.POTTED_MORNING_GLORY_FLOWER);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(AlfheimrBlocks.GEORGIA_BLUE_FLOWER.getId(), AlfheimrBlocks.POTTED_GEORGIA_BLUE_FLOWER);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(AlfheimrBlocks.BLUE_POPPY_FLOWER.getId(), AlfheimrBlocks.POTTED_BLUE_POPPY_FLOWER);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(AlfheimrBlocks.TULIP_FLOWER.getId(), AlfheimrBlocks.POTTED_TULIP_FLOWER);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(AlfheimrBlocks.CARNATION_FLOWER.getId(), AlfheimrBlocks.POTTED_CARNATION_FLOWER);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(AlfheimrBlocks.LADYS_MANTLE_FLOWER.getId(), AlfheimrBlocks.POTTED_LADYS_MANTLE_FLOWER);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(AlfheimrBlocks.GREEN_ROSE_FLOWER.getId(), AlfheimrBlocks.POTTED_GREEN_ROSE_FLOWER);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(AlfheimrBlocks.CLEMATIS_FLOWER.getId(), AlfheimrBlocks.POTTED_CLEMATIS_FLOWER);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(AlfheimrBlocks.BLUE_STAR_FLOWER.getId(), AlfheimrBlocks.POTTED_BLUE_STAR_FLOWER);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(AlfheimrBlocks.SALVIA_FLOWER.getId(), AlfheimrBlocks.POTTED_SALVIA_FLOWER);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(AlfheimrBlocks.FALSE_INDIGO_FLOWER.getId(), AlfheimrBlocks.POTTED_FALSE_INDIGO_FLOWER);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(AlfheimrBlocks.WHITE_SAGE_FLOWER.getId(), AlfheimrBlocks.POTTED_WHITE_SAGE_FLOWER);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(AlfheimrBlocks.SILVER_SCHEHERAZADE_FLOWER.getId(), AlfheimrBlocks.POTTED_SILVER_SCHEHERAZADE_FLOWER);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(AlfheimrBlocks.SILVER_SPRING_FLOWER.getId(), AlfheimrBlocks.POTTED_SILVER_SPRING_FLOWER);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(AlfheimrBlocks.SILVER_SHADOWS_FLOWER.getId(), AlfheimrBlocks.POTTED_SILVER_SHADOWS_FLOWER);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(AlfheimrBlocks.GREEN_BALL_FLOWER.getId(), AlfheimrBlocks.POTTED_GREEN_BALL_FLOWER);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(AlfheimrBlocks.LIME_DAHLIA_FLOWER.getId(), AlfheimrBlocks.POTTED_LIME_DAHLIA_FLOWER);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(AlfheimrBlocks.HYDRANGEA_FLOWER.getId(), AlfheimrBlocks.POTTED_HYDRANGEA_FLOWER);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(AlfheimrBlocks.ZINNIA_FLOWER.getId(), AlfheimrBlocks.POTTED_ZINNIA_FLOWER);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(AlfheimrBlocks.BUTTERFLY_CANDY_FLOWER.getId(), AlfheimrBlocks.POTTED_BUTTERFLY_CANDY_FLOWER);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(AlfheimrBlocks.CABARET_FLOWER.getId(), AlfheimrBlocks.POTTED_CABARET_FLOWER);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(AlfheimrBlocks.DIANTHUS_FLOWER.getId(), AlfheimrBlocks.POTTED_DIANTHUS_FLOWER);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(AlfheimrBlocks.TITAN_CRANBERRY_VINCA_FLOWER.getId(), AlfheimrBlocks.POTTED_TITAN_CRANBERRY_VINCA_FLOWER);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(AlfheimrBlocks.ORANGE_ZINNIA_FLOWER.getId(), AlfheimrBlocks.POTTED_ORANGE_ZINNIA_FLOWER);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(AlfheimrBlocks.BEGONIA_FLOWER.getId(), AlfheimrBlocks.POTTED_BEGONIA_FLOWER);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(AlfheimrBlocks.CROWN_IMPERIAL_FLOWER.getId(), AlfheimrBlocks.POTTED_CROWN_IMPERIAL_FLOWER);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(AlfheimrBlocks.ORIENTAL_POPPY_FLOWER.getId(), AlfheimrBlocks.POTTED_ORIENTAL_POPPY_FLOWER);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(AlfheimrBlocks.AZALEA_FLOWER.getId(), AlfheimrBlocks.POTTED_AZALEA_FLOWER);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(AlfheimrBlocks.PINK_DELIGHT_FLOWER.getId(), AlfheimrBlocks.POTTED_PINK_DELIGHT_FLOWER);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(AlfheimrBlocks.CHRYSANTHEMUM_FLOWER.getId(), AlfheimrBlocks.POTTED_CHRYSANTHEMUM_FLOWER);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(AlfheimrBlocks.HIBISCUS_FLOWER.getId(), AlfheimrBlocks.POTTED_HIBISCUS_FLOWER);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(AlfheimrBlocks.CARDINAL_FLOWER.getId(), AlfheimrBlocks.POTTED_CARDINAL_FLOWER);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(AlfheimrBlocks.GERBERA_FLOWER.getId(), AlfheimrBlocks.POTTED_GERBERA_FLOWER);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(AlfheimrBlocks.RED_TULIP_FLOWER.getId(), AlfheimrBlocks.POTTED_RED_TULIP_FLOWER);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(AlfheimrBlocks.FREESIA_FLOWER.getId(), AlfheimrBlocks.POTTED_FREESIA_FLOWER);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(AlfheimrBlocks.GARDENIAS_FLOWER.getId(), AlfheimrBlocks.POTTED_GARDENIAS_FLOWER);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(AlfheimrBlocks.STAR_JASMINE_FLOWER.getId(), AlfheimrBlocks.POTTED_STAR_JASMINE_FLOWER);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(AlfheimrBlocks.WHITE_WARATAH_FLOWER.getId(), AlfheimrBlocks.POTTED_WHITE_WARATAH_FLOWER);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(AlfheimrBlocks.FLANNEL_FLOWER.getId(), AlfheimrBlocks.POTTED_FLANNEL_FLOWER);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(AlfheimrBlocks.BEARS_EARS_FLOWER.getId(), AlfheimrBlocks.POTTED_BEARS_EARS_FLOWER);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(AlfheimrBlocks.BIDENS_FLOWER.getId(), AlfheimrBlocks.POTTED_BIDENS_FLOWER);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(AlfheimrBlocks.BLANKET_FLOWER.getId(), AlfheimrBlocks.POTTED_BLANKET_FLOWER);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(AlfheimrBlocks.BULBINE_FLOWER.getId(), AlfheimrBlocks.POTTED_BULBINE_FLOWER);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(AlfheimrBlocks.SILVER_BRUNIA_FLOWER.getId(), AlfheimrBlocks.POTTED_SILVER_BRUNIA_FLOWER);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(AlfheimrBlocks.GRAY_ROSES_FLOWER.getId(), AlfheimrBlocks.POTTED_GRAY_ROSES_FLOWER);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(AlfheimrBlocks.MOON_CARROT_FLOWER.getId(), AlfheimrBlocks.POTTED_MOON_CARROT_FLOWER);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(AlfheimrBlocks.SILVER_BABY_FLOWER.getId(), AlfheimrBlocks.POTTED_SILVER_BABY_FLOWER);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(AlfheimrBlocks.LAVENDER_FLOWER.getId(), AlfheimrBlocks.POTTED_LAVENDER_FLOWER);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(AlfheimrBlocks.BELLFLOWER_FLOWER.getId(), AlfheimrBlocks.POTTED_BELLFLOWER_FLOWER);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(AlfheimrBlocks.LILAC_FLOWER.getId(), AlfheimrBlocks.POTTED_LILAC_FLOWER);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(AlfheimrBlocks.SWEET_PEA_FLOWER.getId(), AlfheimrBlocks.POTTED_SWEET_PEA_FLOWER);

            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(AlfheimrBlocks.POINT_MUSHROOM_BLOCK.getId(), AlfheimrBlocks.POTTED_POINT_MUSHROOM_BLOCK);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(AlfheimrBlocks.WITCHES_MUSHROOM_BLOCK.getId(), AlfheimrBlocks.POTTED_WITCHES_MUSHROOM_BLOCK);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(AlfheimrBlocks.ROYAL_BLUE_MUSHROOM_BLOCK.getId(), AlfheimrBlocks.POTTED_ROYAL_BLUE_MUSHROOM_BLOCK);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(AlfheimrBlocks.SHORT_TOP_MUSHROOM_BLOCK.getId(), AlfheimrBlocks.POTTED_SHORT_TOP_MUSHROOM_BLOCK);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(AlfheimrBlocks.SPECTRAL_MUSHROOM_BLOCK.getId(), AlfheimrBlocks.POTTED_SPECTRAL_MUSHROOM_BLOCK);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(AlfheimrBlocks.SHADE_MUSHROOM_BLOCK.getId(), AlfheimrBlocks.POTTED_SHADE_MUSHROOM_BLOCK);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(AlfheimrBlocks.CAP_MUSHROOM_BLOCK.getId(), AlfheimrBlocks.POTTED_CAP_MUSHROOM_BLOCK);
        });
    }
}
