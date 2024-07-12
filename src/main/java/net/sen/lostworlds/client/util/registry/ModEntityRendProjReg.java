package net.sen.lostworlds.client.util.registry;

import net.minecraft.client.renderer.entity.EntityRenderers;
import net.minecraft.client.renderer.entity.ThrownItemRenderer;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.sen.lostworlds.client.entity.renderer.MagicGorganProjectileRenderer;
import net.sen.lostworlds.entity.ModEntities;

public class ModEntityRendProjReg {
    public static void setup(final FMLClientSetupEvent event) {
        event.enqueueWork(() -> {
            //Projectiles
            EntityRenderers.register(ModEntities.DICE_PROJECTILE.get(), ThrownItemRenderer::new);
            EntityRenderers.register(ModEntities.MAGIC_GORGAN_PROJECTILE.get(), MagicGorganProjectileRenderer::new);
        });
    }
}
