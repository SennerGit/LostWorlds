package net.sen.lostworlds.entity;

import net.minecraft.core.registries.Registries;
import net.minecraft.world.entity.*;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.sen.lostworlds.api.LostWorldsApi;
import net.sen.lostworlds.entity.projectile.*;
import net.sen.lostworlds.entity.mob.*;

public class ModEntities {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(Registries.ENTITY_TYPE, LostWorldsApi.MODID);

    public static final String RHINO_ID = "rhino";
    public static final DeferredHolder<EntityType<?>, EntityType<RhinoEntity>> RHINO =
            ENTITY_TYPES.register(RHINO_ID,
                    () -> EntityType.Builder.of(RhinoEntity::new, MobCategory.CREATURE)
                        .sized(2.5f, 2.5f).build(RHINO_ID)
            );

    /*
    PROJECTILES
     */
    private static final String DICE_PROJECTILE_ID = "dice_projectile";
    public static final DeferredHolder<EntityType<?>, EntityType<DiceProjectileEntity>> DICE_PROJECTILE =
            ENTITY_TYPES.register(DICE_PROJECTILE_ID,
                    () -> EntityType.Builder.<DiceProjectileEntity>of(DiceProjectileEntity::new, MobCategory.MISC)
                            .sized(0.5f, 0.5f)
                            .clientTrackingRange(4)
                            .updateInterval(20)
//                            .setCustomClientFactory((spawnEntity, level) -> new DiceProjectileEntity(level))
                            .build(DICE_PROJECTILE_ID)
            );

    private static final String MAGIC_GORGAN_PROJECTILE_ID = "magic_gorgan_projectile";
    public static final DeferredHolder<EntityType<?>, EntityType<MagicGorganProjectileEntity>> MAGIC_GORGAN_PROJECTILE =
            ENTITY_TYPES.register(MAGIC_GORGAN_PROJECTILE_ID,
                    () -> EntityType.Builder.<MagicGorganProjectileEntity>of(MagicGorganProjectileEntity::new, MobCategory.MISC)
                            .sized(0.5f, 0.5f)
                            .clientTrackingRange(4)
                            .updateInterval(20)
                            .build(MAGIC_GORGAN_PROJECTILE_ID)
            );

    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
}
