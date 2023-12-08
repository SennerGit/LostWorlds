package net.sen.lostworlds.block;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.sen.lostworlds.LostWorlds;
import net.sen.lostworlds.LostWorldsConstants;
import net.sen.lostworlds.block.custom.tileentity.WaterRemoverBlockTileEntity;

import java.util.Set;

public class ModTileEntityTypes {
    public static final DeferredRegister<BlockEntityType<?>> TILE_ENTITIES =
            DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, LostWorldsConstants.MODID);

    public static final RegistryObject<BlockEntityType<WaterRemoverBlockTileEntity>> WATER_REMOVER_BLOCK_TILE_ENTITY =
            TILE_ENTITIES.register("water_remover_block_tile_entity", () -> new BlockEntityType<>(WaterRemoverBlockTileEntity::new, Set.of(ModBlocks.ATLANTAS_WATER_REMOVER_BLOCK.get()), null));

    public static void register(IEventBus eventBus) {
        TILE_ENTITIES.register(eventBus);
    }
}
