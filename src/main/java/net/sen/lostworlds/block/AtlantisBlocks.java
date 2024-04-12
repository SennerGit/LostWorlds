package net.sen.lostworlds.block;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.sen.lostworlds.LostWorldsApi;
import net.sen.lostworlds.block.custom.WaterRemoverBlock;
import net.sen.lostworlds.block.portal.AtlantisPortalBlock;
import net.sen.lostworlds.item.ModItems;
import net.sen.lostworlds.sound.ModSounds;

import java.util.function.Supplier;

public class AtlantisBlocks {
    public static final DeferredRegister<Block> ATLANTIS_BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, LostWorldsApi.MODID);

    /*
    UNIQUE
     */
    public static final RegistryObject<Block> ATLANTAS_WATER_REMOVER_BLOCK = registerBlock("atlantas_water_remover_block", () -> new WaterRemoverBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_BLUE).sound(ModSounds.CRIMSON_DIAMOND_LAMP_SOUNDS).lightLevel(state -> state.getValue(WaterRemoverBlock.LIT) ? 15 : 0)));

    /*
    MULTI BLOCK
     */
    /*
    STONE
     */
    /*
     * WOOD TYPES
     */
    /*
    Metals
     */
    /*
     *Mushroom
     */
    /*
     FLOWERS
     */
    /*
    CROPS
     */
    /*
    FLUIDS
     */
    /*
     * WORLD BLOCKS
     */
    /*
    DIMENSIONAL BLOCKS
     */
    public static final RegistryObject<Block> ATLANTIS_PORTAL_FRAME = registerBlock("atlantis_portal_frame", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> ATLANTIS_PORTAL = registerBlock("atlantis_portal", AtlantisPortalBlock::new);

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = ATLANTIS_BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block>RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus){
        ATLANTIS_BLOCKS.register(eventBus);
    }
}
