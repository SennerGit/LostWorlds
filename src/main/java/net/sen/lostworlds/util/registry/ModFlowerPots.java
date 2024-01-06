package net.sen.lostworlds.util.registry;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.FlowerPotBlock;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.sen.lostworlds.block.ModBlocks;

public class ModFlowerPots {
    public static void setup(final FMLCommonSetupEvent event) {
        event.enqueueWork(() -> {
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.IRIS_FLOWER.getId(), ModBlocks.POTTED_IRIS_FLOWER);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.DARK_BLOOM_FLOWER.getId(), ModBlocks.POTTED_DARK_BLOOM_FLOWER);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.DREAD_NIGHT_FLOWER.getId(), ModBlocks.POTTED_DREAD_NIGIHT_FLOWER);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.BLACK_LOTUS_FLOWER.getId(), ModBlocks.POTTED_BLACK_LOTUS_FLOWER);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.NIGHT_ROSE_FLOWER.getId(), ModBlocks.POTTED_NIGHT_ROSE_FLOWER);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.AQUA_ROSE_FLOWER.getId(), ModBlocks.POTTED_AQUA_ROSE_FLOWER);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.MOON_FLOWER.getId(), ModBlocks.POTTED_MOON_FLOWER);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.CATHERINE_FLOWER.getId(), ModBlocks.POTTED_CATHERINE_FLOWER);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.TAINTED_ROSE_FLOWER.getId(), ModBlocks.POTTED_TAINTED_ROSE_FLOWER);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.CINNAMON_ROSE_FLOWER.getId(), ModBlocks.POTTED_CINNAMON_ROSE_FLOWER);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.BUTTERFLY_FLOWER.getId(), ModBlocks.POTTED_BUTTERFLY_FLOWER);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.GAIA_TULIP_FLOWER.getId(), ModBlocks.POTTED_GAIA_TULIP_FLOWER);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.BEARDED_IRIS_FLOWER.getId(), ModBlocks.POTTED_BEARDED_IRIS_FLOWER);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.CORNFLOWER_FLOWER.getId(), ModBlocks.POTTED_CORNFLOWER_FLOWER);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.MORNING_GLORY_FLOWER.getId(), ModBlocks.POTTED_MORNING_GLORY_FLOWER);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.GEORGIA_BLUE_FLOWER.getId(), ModBlocks.POTTED_GEORGIA_BLUE_FLOWER);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.BLUE_POPPY_FLOWER.getId(), ModBlocks.POTTED_BLUE_POPPY_FLOWER);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.TULIP_FLOWER.getId(), ModBlocks.POTTED_TULIP_FLOWER);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.CARNATION_FLOWER.getId(), ModBlocks.POTTED_CARNATION_FLOWER);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.LADYS_MANTLE_FLOWER.getId(), ModBlocks.POTTED_LADYS_MANTLE_FLOWER);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.GREEN_ROSE_FLOWER.getId(), ModBlocks.POTTED_GREEN_ROSE_FLOWER);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.CLEMATIS_FLOWER.getId(), ModBlocks.POTTED_CLEMATIS_FLOWER);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.BLUE_STAR_FLOWER.getId(), ModBlocks.POTTED_BLUE_STAR_FLOWER);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.SALVIA_FLOWER.getId(), ModBlocks.POTTED_SALVIA_FLOWER);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.FALSE_INDIGO_FLOWER.getId(), ModBlocks.POTTED_FALSE_INDIGO_FLOWER);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.WHITE_SAGE_FLOWER.getId(), ModBlocks.POTTED_WHITE_SAGE_FLOWER);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.SILVER_SCHEHERAZADE_FLOWER.getId(), ModBlocks.POTTED_SILVER_SCHEHERAZADE_FLOWER);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.SILVER_SPRING_FLOWER.getId(), ModBlocks.POTTED_SILVER_SPRING_FLOWER);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.SILVER_SHADOWS_FLOWER.getId(), ModBlocks.POTTED_SILVER_SHADOWS_FLOWER);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.GREEN_BALL_FLOWER.getId(), ModBlocks.POTTED_GREEN_BALL_FLOWER);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.LIME_DAHLIA_FLOWER.getId(), ModBlocks.POTTED_LIME_DAHLIA_FLOWER);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.HYDRANGEA_FLOWER.getId(), ModBlocks.POTTED_HYDRANGEA_FLOWER);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.ZINNIA_FLOWER.getId(), ModBlocks.POTTED_ZINNIA_FLOWER);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.BUTTERFLY_CANDY_FLOWER.getId(), ModBlocks.POTTED_BUTTERFLY_CANDY_FLOWER);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.CABARET_FLOWER.getId(), ModBlocks.POTTED_CABARET_FLOWER);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.DIANTHUS_FLOWER.getId(), ModBlocks.POTTED_DIANTHUS_FLOWER);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.TITAN_CRANBERRY_VINCA_FLOWER.getId(), ModBlocks.POTTED_TITAN_CRANBERRY_VINCA_FLOWER);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.ORANGE_ZINNIA_FLOWER.getId(), ModBlocks.POTTED_ORANGE_ZINNIA_FLOWER);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.BEGONIA_FLOWER.getId(), ModBlocks.POTTED_BEGONIA_FLOWER);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.CROWN_IMPERIAL_FLOWER.getId(), ModBlocks.POTTED_CROWN_IMPERIAL_FLOWER);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.ORIENTAL_POPPY_FLOWER.getId(), ModBlocks.POTTED_ORIENTAL_POPPY_FLOWER);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.AZALEA_FLOWER.getId(), ModBlocks.POTTED_AZALEA_FLOWER);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.PINK_DELIGHT_FLOWER.getId(), ModBlocks.POTTED_PINK_DELIGHT_FLOWER);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.CHRYSANTHEMUM_FLOWER.getId(), ModBlocks.POTTED_CHRYSANTHEMUM_FLOWER);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.HIBISCUS_FLOWER.getId(), ModBlocks.POTTED_HIBISCUS_FLOWER);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.CARDINAL_FLOWER.getId(), ModBlocks.POTTED_CARDINAL_FLOWER);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.GERBERA_FLOWER.getId(), ModBlocks.POTTED_GERBERA_FLOWER);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.RED_TULIP_FLOWER.getId(), ModBlocks.POTTED_RED_TULIP_FLOWER);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.FREESIA_FLOWER.getId(), ModBlocks.POTTED_FREESIA_FLOWER);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.GARDENIAS_FLOWER.getId(), ModBlocks.POTTED_GARDENIAS_FLOWER);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.STAR_JASMINE_FLOWER.getId(), ModBlocks.POTTED_STAR_JASMINE_FLOWER);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.WHITE_WARATAH_FLOWER.getId(), ModBlocks.POTTED_WHITE_WARATAH_FLOWER);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.FLANNEL_FLOWER.getId(), ModBlocks.POTTED_FLANNEL_FLOWER);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.BEARS_EARS_FLOWER.getId(), ModBlocks.POTTED_BEARS_EARS_FLOWER);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.BIDENS_FLOWER.getId(), ModBlocks.POTTED_BIDENS_FLOWER);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.BLANKET_FLOWER.getId(), ModBlocks.POTTED_BLANKET_FLOWER);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.BULBINE_FLOWER.getId(), ModBlocks.POTTED_BULBINE_FLOWER);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.SILVER_BRUNIA_FLOWER.getId(), ModBlocks.POTTED_SILVER_BRUNIA_FLOWER);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.GRAY_ROSES_FLOWER.getId(), ModBlocks.POTTED_GRAY_ROSES_FLOWER);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.MOON_CARROT_FLOWER.getId(), ModBlocks.POTTED_MOON_CARROT_FLOWER);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.SILVER_BABY_FLOWER.getId(), ModBlocks.POTTED_SILVER_BABY_FLOWER);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.LAVENDER_FLOWER.getId(), ModBlocks.POTTED_LAVENDER_FLOWER);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.BELLFLOWER_FLOWER.getId(), ModBlocks.POTTED_BELLFLOWER_FLOWER);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.LILAC_FLOWER.getId(), ModBlocks.POTTED_LILAC_FLOWER);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.SWEET_PEA_FLOWER.getId(), ModBlocks.POTTED_SWEET_PEA_FLOWER);

            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.POINT_MUSHROOM_BLOCK.getId(), ModBlocks.POTTED_POINT_MUSHROOM_BLOCK);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.WITCHES_MUSHROOM_BLOCK.getId(), ModBlocks.POTTED_WITCHES_MUSHROOM_BLOCK);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.ROYAL_BLUE_MUSHROOM_BLOCK.getId(), ModBlocks.POTTED_ROYAL_BLUE_MUSHROOM_BLOCK);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.SHORT_TOP_MUSHROOM_BLOCK.getId(), ModBlocks.POTTED_SHORT_TOP_MUSHROOM_BLOCK);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.SPECTRAL_MUSHROOM_BLOCK.getId(), ModBlocks.POTTED_SPECTRAL_MUSHROOM_BLOCK);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.SHADE_MUSHROOM_BLOCK.getId(), ModBlocks.POTTED_SHADE_MUSHROOM_BLOCK);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.CAP_MUSHROOM_BLOCK.getId(), ModBlocks.POTTED_CAP_MUSHROOM_BLOCK);
        });
    }
}
