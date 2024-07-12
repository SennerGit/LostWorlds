package net.sen.lostworlds.block.entity;

import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.sen.lostworlds.api.LostWorldsApi;
import net.sen.lostworlds.registry.blocks.ModBlocks;
import net.sen.lostworlds.registry.blocks.UnderworldBlocks;

public class ModBlockEntities {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES =
            DeferredRegister.create(Registries.BLOCK_ENTITY_TYPE, LostWorldsApi.MODID);

//    public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<AlloySmelterBlockEntity>> ALLOY_SMELTER_BLOCK_ENTITY =
//            BLOCK_ENTITIES.register("alloy_smelter_block_entity", () -> BlockEntityType.Builder.of(
//                    AlloySmelterBlockEntity::new, ModBlocks.ALLOY_SMELTER.get()).build(null));

    public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<MysticGatewayControllerBlockEntity>> MYSTIC_GATEWAY_CONTROLLER_BLOCK_ENTITY =
            BLOCK_ENTITIES.register("mystic_gateway_controller_block_entity", () -> BlockEntityType.Builder.of(
                    MysticGatewayControllerBlockEntity::new, ModBlocks.MYSTIC_GATEWAYS_PORTAL_CONTROLLER.get()).build(null));

//    public static final DeferredHolder<BlockEntityType<AlloySmelterBlockEntity>> ALLOY_SMELTER_BLOCK_ENTITY =
//            registerBlockEntity(
//                    "alloy_smelter_block_entity",
//                    AlloySmelterBlockEntity::new,
//                    ModBlocks.ALLOY_SMELTER.get()
//    );

//    public static final DeferredHolder<BlockEntityType<MysticGatewayControllerBlockEntity>> MYSTIC_GATEWAY_CONTROLLER_BLOCK_ENTITY =
//            registerBlockEntity(
//                    "mystic_gateway_controller_block_entity",
//                    MysticGatewayControllerBlockEntity::new,
//                    ModBlocks.MYSTIC_GATEWAYS_PORTAL_CONTROLLER.get()
//            );

    public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<ModSignBlockEntity>> MOD_SIGN =
            BLOCK_ENTITIES.register(
                    "mod_sign", () -> BlockEntityType.Builder.of(
                    ModSignBlockEntity::new,
                    UnderworldBlocks.ELDER_WOOD_PLANKS_SIGN.get(),
                    UnderworldBlocks.ELDER_WOOD_PLANKS_WALL_SIGN.get(),
                    UnderworldBlocks.CYPRESS_PLANKS_SIGN.get(),
                    UnderworldBlocks.CYPRESS_PLANKS_WALL_SIGN.get(),
                    UnderworldBlocks.LAUREL_PLANKS_SIGN.get(),
                    UnderworldBlocks.LAUREL_PLANKS_WALL_SIGN.get(),
                    UnderworldBlocks.OLIVE_PLANKS_SIGN.get(),
                    UnderworldBlocks.OLIVE_PLANKS_WALL_SIGN.get(),
                    UnderworldBlocks.MYRRH_PLANKS_SIGN.get(),
                    UnderworldBlocks.MYRRH_PLANKS_WALL_SIGN.get()
            ).build(null));

    public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<ModHangingSignBlockEntity>> MOD_HANGING_SIGN =
            BLOCK_ENTITIES.register(
                    "mod_hanging_sign", () -> BlockEntityType.Builder.of(
                    ModHangingSignBlockEntity::new,
                    UnderworldBlocks.ELDER_WOOD_PLANKS_HANGING_SIGN.get(),
                    UnderworldBlocks.ELDER_WOOD_PLANKS_WALL_HANGING_SIGN.get(),
                    UnderworldBlocks.CYPRESS_PLANKS_HANGING_SIGN.get(),
                    UnderworldBlocks.CYPRESS_PLANKS_WALL_HANGING_SIGN.get(),
                    UnderworldBlocks.LAUREL_PLANKS_HANGING_SIGN.get(),
                    UnderworldBlocks.LAUREL_PLANKS_WALL_HANGING_SIGN.get(),
                    UnderworldBlocks.OLIVE_PLANKS_HANGING_SIGN.get(),
                    UnderworldBlocks.OLIVE_PLANKS_WALL_HANGING_SIGN.get(),
                    UnderworldBlocks.MYRRH_PLANKS_HANGING_SIGN.get(),
                    UnderworldBlocks.MYRRH_PLANKS_WALL_HANGING_SIGN.get()
            ).build(null));

//    public static final DeferredHolder<BlockEntityType<ModSignBlockEntity>> MOD_SIGN =
//            registerBlockEntity(
//                    "mod_sign",
//                    ModSignBlockEntity::new,
//                    UnderworldBlocks.ELDER_WOOD_PLANKS_SIGN.get(),
//                    UnderworldBlocks.ELDER_WOOD_PLANKS_WALL_SIGN.get(),
//                    UnderworldBlocks.CYPRESS_PLANKS_SIGN.get(),
//                    UnderworldBlocks.CYPRESS_PLANKS_WALL_SIGN.get(),
//                    UnderworldBlocks.LAUREL_PLANKS_SIGN.get(),
//                    UnderworldBlocks.LAUREL_PLANKS_WALL_SIGN.get(),
//                    UnderworldBlocks.OLIVE_PLANKS_SIGN.get(),
//                    UnderworldBlocks.OLIVE_PLANKS_WALL_SIGN.get(),
//                    UnderworldBlocks.MYRRH_PLANKS_SIGN.get(),
//                    UnderworldBlocks.MYRRH_PLANKS_WALL_SIGN.get()
//            );

//    public static final DeferredHolder<BlockEntityType<ModHangingSignBlockEntity>> MOD_HANGING_SIGN =
//            registerBlockEntity(
//                    "mod_hanging_sign",
//                    ModHangingSignBlockEntity::new,
//                    UnderworldBlocks.ELDER_WOOD_PLANKS_HANGING_SIGN.get(),
//                    UnderworldBlocks.ELDER_WOOD_PLANKS_WALL_HANGING_SIGN.get(),
//                    UnderworldBlocks.CYPRESS_PLANKS_HANGING_SIGN.get(),
//                    UnderworldBlocks.CYPRESS_PLANKS_WALL_HANGING_SIGN.get(),
//                    UnderworldBlocks.LAUREL_PLANKS_HANGING_SIGN.get(),
//                    UnderworldBlocks.LAUREL_PLANKS_WALL_HANGING_SIGN.get(),
//                    UnderworldBlocks.OLIVE_PLANKS_HANGING_SIGN.get(),
//                    UnderworldBlocks.OLIVE_PLANKS_WALL_HANGING_SIGN.get(),
//                    UnderworldBlocks.MYRRH_PLANKS_HANGING_SIGN.get(),
//                    UnderworldBlocks.MYRRH_PLANKS_WALL_HANGING_SIGN.get()
//            );

    private static <T extends  BlockEntity> DeferredHolder<BlockEntityType<?>, BlockEntityType<T>> registerBlockEntity(String name, BlockEntityType.BlockEntitySupplier<T> factory, Block... blocks) {
        DeferredHolder<BlockEntityType<?>, BlockEntityType<T>> toReturn = BLOCK_ENTITIES.register(
                name, () -> BlockEntityType.Builder.of(
                        factory,
                        blocks
                )
                .build(
                        null
                )
        );

        return toReturn;
    }

    public static void register(IEventBus eventBus) {
        BLOCK_ENTITIES.register(eventBus);
    }
}
