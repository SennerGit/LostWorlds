package net.sen.lostworlds.block;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.sen.lostworlds.LostWorldsApi;
import net.sen.lostworlds.block.portal.SkyopiaPortalBlock;
import net.sen.lostworlds.item.ModItems;

import java.util.function.Supplier;

public class SkyopiaBlocks {
    public static final DeferredRegister<Block> SKYOPIA_BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, LostWorldsApi.MODID);

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
    public static final RegistryObject<Block> SKYOPIA_PORTAL_FRAME = registerBlock("skyopia_portal_frame", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> SKYOPIA_PORTAL = registerBlock("skyopia_portal", SkyopiaPortalBlock::new);

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = SKYOPIA_BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block>RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus){
        SKYOPIA_BLOCKS.register(eventBus);
    }
}
