package net.sen.lostworlds.entity;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.sen.lostworlds.LostWorlds;
import net.sen.lostworlds.entity.custom.DiceProjectileEntity;
import net.sen.lostworlds.entity.custom.MagicGorganProjectileEntity;
import net.sen.lostworlds.entity.custom.RhinoEntity;

public class ModEntities {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, LostWorlds.MODID);

    public static final RegistryObject<EntityType<RhinoEntity>> RHINO =
            ENTITY_TYPES.register("rhino",
                    () -> EntityType.Builder.of(RhinoEntity::new, MobCategory.CREATURE)
                        .sized(2.5f, 2.5f).build("rhino")
            );

    public static final RegistryObject<EntityType<DiceProjectileEntity>> DICE_PROJECTILE =
            ENTITY_TYPES.register("dice_projectile",
                    () -> EntityType.Builder.<DiceProjectileEntity>of(DiceProjectileEntity::new, MobCategory.MISC)
                            .sized(0.5f, 0.5f)
                            .clientTrackingRange(4)
                            .updateInterval(20)
                            .setCustomClientFactory((spawnEntity, level) -> new DiceProjectileEntity(level))
                            .build("dice_projectile")
            );

    public static final RegistryObject<EntityType<MagicGorganProjectileEntity>> MAGIC_GORGAN_PROJECTILE =
            ENTITY_TYPES.register("magic_gorgan_projectile",
                    () -> EntityType.Builder.<MagicGorganProjectileEntity>of(MagicGorganProjectileEntity::new, MobCategory.MISC)
                            .sized(0.5f, 0.5f)
                            .clientTrackingRange(4)
                            .updateInterval(20)
                            .build("magic_gorgan_projectile")
            );

    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
}
