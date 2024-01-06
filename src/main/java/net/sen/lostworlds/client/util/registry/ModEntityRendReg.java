package net.sen.lostworlds.client.util.registry;

import net.minecraft.client.renderer.entity.EntityRenderers;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.sen.lostworlds.client.entity.renderer.*;
import net.sen.lostworlds.entity.ModEntities;

public class ModEntityRendReg {
    public static void setup(final FMLClientSetupEvent event) {
        event.enqueueWork(() -> {
            //Mobs
            EntityRenderers.register(ModEntities.RHINO.get(), RhinoRenderer::new);
            EntityRenderers.register(ModEntities.DWARVES.get(), DwarvesRenderer::new);
            EntityRenderers.register(ModEntities.ELVES.get(), ElvesRenderer::new);
            EntityRenderers.register(ModEntities.SHARK.get(), SharkRenderer::new);
            EntityRenderers.register(ModEntities.MORAY_EELS.get(), MorayEelsRenderer::new);
            EntityRenderers.register(ModEntities.ELECTRIC_EELS.get(), ElectricEelsRenderer::new);
            EntityRenderers.register(ModEntities.JELLYFISH.get(), JellyfishRenderer::new);
            EntityRenderers.register(ModEntities.GIANT_SQUID.get(), GiantSquidRenderer::new);
            EntityRenderers.register(ModEntities.RAY.get(), RayRenderer::new);
            EntityRenderers.register(ModEntities.GIANT_OCTOPUS.get(), GiantOctopusRenderer::new);
            EntityRenderers.register(ModEntities.NUDIBRANCH_SLUG.get(), NudibranchSlugRenderer::new);
            EntityRenderers.register(ModEntities.GREAT_WHITE.get(), GreatWhiteRenderer::new);
            EntityRenderers.register(ModEntities.ANGLER_FISH.get(), AnglerFishRenderer::new);
            EntityRenderers.register(ModEntities.SEAHORSE.get(), SeahorseRenderer::new);
            EntityRenderers.register(ModEntities.CLOWNFISH.get(), ClownfishRenderer::new);
            EntityRenderers.register(ModEntities.TUNA.get(), TunaRenderer::new);
            EntityRenderers.register(ModEntities.TANG_FISH.get(), TangFishRenderer::new);
            EntityRenderers.register(ModEntities.ATLANTIAN_GURDIAN.get(), AtlantianGurdianRenderer::new);
            EntityRenderers.register(ModEntities.SIREN.get(), SirenRenderer::new);
            EntityRenderers.register(ModEntities.MERFOLK.get(), MerfolkRenderer::new);
            EntityRenderers.register(ModEntities.ATLANTIAN.get(), AtlantianRenderer::new);
        });
    }
}
