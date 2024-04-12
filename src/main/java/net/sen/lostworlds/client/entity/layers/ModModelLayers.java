package net.sen.lostworlds.client.entity.layers;

import net.minecraft.client.model.geom.ModelLayerLocation;
import net.sen.lostworlds.LostWorldsApi;
import net.sen.lostworlds.entity.*;

public class ModModelLayers {
    public static final ModelLayerLocation RHINO_LAYER = createModelLayerLocation(ModEntities.RHINO_ID + "_layer");
    public static final ModelLayerLocation HELLHOUND_LAYER = createModelLayerLocation(UnderworldEntities.HELLHOUND_ID + "_layer");
    public static final ModelLayerLocation SHADOWHOUND_LAYER = createModelLayerLocation(UnderworldEntities.SHADOWHOUND_ID + "_layer");
    public static final ModelLayerLocation SPECTRALHOUND_LAYER = createModelLayerLocation(UnderworldEntities.SPECTRALHOUND_ID + "_layer");
    public static final ModelLayerLocation DWARVES_LAYER = createModelLayerLocation(NidavellirEntities.DWARVES_ID + "_layer");
    public static final ModelLayerLocation VAMPIRE_BAT_LAYER = createModelLayerLocation(NidavellirEntities.VAMPIRE_BAT_ID + "_layer");
    public static final ModelLayerLocation CAVE_MOLE_LAYER = createModelLayerLocation(NidavellirEntities.CAVE_MOLE_ID + "_layer");
    public static final ModelLayerLocation ELVES_LAYER = createModelLayerLocation(AlfheimrEntities.ELVES_ID + "_layer");
    public static final ModelLayerLocation SHARK_LAYER = createModelLayerLocation(AtlantisEntities.SHARK_ID + "_layer");
    public static final ModelLayerLocation MORAY_EELS_LAYER = createModelLayerLocation(AtlantisEntities.MORAY_EELS_ID + "_layer");
    public static final ModelLayerLocation ELECTRIC_EELS_LAYER = createModelLayerLocation(AtlantisEntities.ELECTRIC_EELS_ID + "_layer");
    public static final ModelLayerLocation JELLYFISH_LAYER = createModelLayerLocation(AtlantisEntities.JELLYFISH_ID + "_layer");
    public static final ModelLayerLocation GIANT_SQUID_LAYER = createModelLayerLocation(AtlantisEntities.GIANT_SQUID_ID + "_layer");
    public static final ModelLayerLocation RAY_LAYER = createModelLayerLocation(AtlantisEntities.RAY_ID + "_layer");
    public static final ModelLayerLocation GIANT_OCTOPUS_LAYER = createModelLayerLocation(AtlantisEntities.GIANT_OCTOPUS_ID + "_layer");
    public static final ModelLayerLocation NUDIBRANCH_SLUG_LAYER = createModelLayerLocation(AtlantisEntities.NUDIBRANCH_SLUG_ID + "_layer");
    public static final ModelLayerLocation GREAT_WHITE_LAYER = createModelLayerLocation(AtlantisEntities.GREAT_WHITE_ID + "_layer");
    public static final ModelLayerLocation ANGLER_FISH_LAYER = createModelLayerLocation(AtlantisEntities.ANGLER_FISH_ID + "_layer");
    public static final ModelLayerLocation SEAHORSE_LAYER = createModelLayerLocation(AtlantisEntities.SEAHORSE_ID + "_layer");
    public static final ModelLayerLocation CLOWNFISH_LAYER = createModelLayerLocation(AtlantisEntities.CLOWNFISH_ID + "_layer");
    public static final ModelLayerLocation ATLANTIAN_GURDIAN_LAYER = createModelLayerLocation(AtlantisEntities.ATLANTIAN_GURDIAN_ID + "_layer");
    public static final ModelLayerLocation SIREN_LAYER = createModelLayerLocation(AtlantisEntities.SIREN_ID + "_layer");
    public static final ModelLayerLocation MERFOLK_LAYER = createModelLayerLocation(AtlantisEntities.MERFOLK_ID + "_layer");
    public static final ModelLayerLocation ATLANTIAN_LAYER = createModelLayerLocation(AtlantisEntities.ATLANTIAN_ID + "_layer");
    public static final ModelLayerLocation TUNA_LAYER = createModelLayerLocation(AtlantisEntities.TUNA_ID + "_layer");
    public static final ModelLayerLocation TANG_FISH_LAYER = createModelLayerLocation(AtlantisEntities.TANG_FISH_ID + "_layer");

    public static final ModelLayerLocation MAGICAL_GORGAN_PROJECTILE_LAYER = createModelLayerLocation("magical_gorgan_projectile_layer");

    private static ModelLayerLocation createModelLayerLocation(String id) {
        return new ModelLayerLocation(LostWorldsApi.modLoc(id), id);
    }
}
