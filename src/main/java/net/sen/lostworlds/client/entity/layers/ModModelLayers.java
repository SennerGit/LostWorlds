package net.sen.lostworlds.client.entity.layers;

import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.resources.ResourceLocation;
import net.sen.lostworlds.LostWorlds;
import net.sen.lostworlds.LostWorldsConstants;

public class ModModelLayers {
    public static final ModelLayerLocation RHINO_LAYER = createModelLayerLocation("rhino_layer");
    public static final ModelLayerLocation DWARVES_LAYER = createModelLayerLocation("dwarves_layer");
    public static final ModelLayerLocation ELVES_LAYER = createModelLayerLocation("elves_layer");
    public static final ModelLayerLocation SHARK_LAYER = createModelLayerLocation("shark_layer");
    public static final ModelLayerLocation MORAY_EELS_LAYER = createModelLayerLocation("moray_eels_layer");
    public static final ModelLayerLocation ELECTRIC_EELS_LAYER = createModelLayerLocation("electric_eels_layer");
    public static final ModelLayerLocation JELLYFISH_LAYER = createModelLayerLocation("jellyfish_layer");
    public static final ModelLayerLocation GIANT_SQUID_LAYER = createModelLayerLocation("giant_squid_layer");
    public static final ModelLayerLocation RAY_LAYER = createModelLayerLocation("ray_layer");
    public static final ModelLayerLocation GIANT_OCTOPUS_LAYER = createModelLayerLocation("giant_octopus_layer");
    public static final ModelLayerLocation NUDIBRANCH_SLUG_LAYER = createModelLayerLocation("nudibranch_slug_layer");
    public static final ModelLayerLocation GREAT_WHITE_LAYER = createModelLayerLocation("great_white_layer");
    public static final ModelLayerLocation ANGLER_FISH_LAYER = createModelLayerLocation("angler_fish_layer");
    public static final ModelLayerLocation BIOLUMINESCENT_PLANKTON_LAYER = createModelLayerLocation("bioluminescent_plankton_layer");
    public static final ModelLayerLocation SEAHORSE_LAYER = createModelLayerLocation("seahorse_layer");
    public static final ModelLayerLocation CLOWNFISH_LAYER = createModelLayerLocation("clownfish_layer");
    public static final ModelLayerLocation ATLANTIAN_GURDIAN_LAYER = createModelLayerLocation("atlantian_gurdian_layer");
    public static final ModelLayerLocation SIREN_LAYER = createModelLayerLocation("siren_layer");
    public static final ModelLayerLocation MERFOLK_LAYER = createModelLayerLocation("merfolk_layer");
    public static final ModelLayerLocation ATLANTIAN_LAYER = createModelLayerLocation("atlantian_layer");
    public static final ModelLayerLocation TUNA_LAYER = createModelLayerLocation("tuna_layer");
    public static final ModelLayerLocation TANG_FISH_LAYER = createModelLayerLocation("tang_fish_layer");

    public static final ModelLayerLocation MAGICAL_GORGAN_PROJECTILE_LAYER = createModelLayerLocation("magical_gorgan_projectile_layer");

    private static ModelLayerLocation createModelLayerLocation(String id) {
        return new ModelLayerLocation(LostWorldsConstants.modLoc(id), id);
    }
}
