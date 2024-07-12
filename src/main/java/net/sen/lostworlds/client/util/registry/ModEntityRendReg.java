package net.sen.lostworlds.client.util.registry;

import net.minecraft.client.renderer.entity.EntityRenderers;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.sen.lostworlds.client.entity.renderer.*;
import net.sen.lostworlds.entity.*;

public class ModEntityRendReg {
    public static void setup(final FMLClientSetupEvent event) {
        event.enqueueWork(() -> {
            //Mobs
            EntityRenderers.register(ModEntities.RHINO.get(), RhinoRenderer::new);
            EntityRenderers.register(UnderworldEntities.HELLHOUND.get(), HellhoundRenderer::new);
            EntityRenderers.register(UnderworldEntities.SHADOWHOUND.get(), ShadowhoundRenderer::new);
            EntityRenderers.register(UnderworldEntities.SPECTRALHOUND.get(), SpectralhoundRenderer::new);
            EntityRenderers.register(NidavellirEntities.DWARVES.get(), DwarvesRenderer::new);
            EntityRenderers.register(NidavellirEntities.VAMPIRE_BAT.get(), VampireBatRenderer::new);
            EntityRenderers.register(NidavellirEntities.CAVE_MOLE.get(), CaveMoleRenderer::new);
            EntityRenderers.register(AlfheimrEntities.ELVES.get(), ElvesRenderer::new);
            EntityRenderers.register(AtlantisEntities.SHARK.get(), SharkRenderer::new);
            EntityRenderers.register(AtlantisEntities.MORAY_EELS.get(), MorayEelsRenderer::new);
            EntityRenderers.register(AtlantisEntities.ELECTRIC_EELS.get(), ElectricEelsRenderer::new);
            EntityRenderers.register(AtlantisEntities.JELLYFISH.get(), JellyfishRenderer::new);
            EntityRenderers.register(AtlantisEntities.GIANT_SQUID.get(), GiantSquidRenderer::new);
            EntityRenderers.register(AtlantisEntities.RAY.get(), RayRenderer::new);
            EntityRenderers.register(AtlantisEntities.GIANT_OCTOPUS.get(), GiantOctopusRenderer::new);
            EntityRenderers.register(AtlantisEntities.NUDIBRANCH_SLUG.get(), NudibranchSlugRenderer::new);
            EntityRenderers.register(AtlantisEntities.GREAT_WHITE.get(), GreatWhiteRenderer::new);
            EntityRenderers.register(AtlantisEntities.ANGLER_FISH.get(), AnglerFishRenderer::new);
            EntityRenderers.register(AtlantisEntities.SEAHORSE.get(), SeahorseRenderer::new);
            EntityRenderers.register(AtlantisEntities.CLOWNFISH.get(), ClownfishRenderer::new);
            EntityRenderers.register(AtlantisEntities.TUNA.get(), TunaRenderer::new);
            EntityRenderers.register(AtlantisEntities.TANG_FISH.get(), TangFishRenderer::new);
            EntityRenderers.register(AtlantisEntities.ATLANTIAN_GURDIAN.get(), AtlantianGurdianRenderer::new);
            EntityRenderers.register(AtlantisEntities.SIREN.get(), SirenRenderer::new);
            EntityRenderers.register(AtlantisEntities.MERFOLK.get(), MerfolkRenderer::new);
            EntityRenderers.register(AtlantisEntities.ATLANTIAN.get(), AtlantianRenderer::new);
        });
    }
}
