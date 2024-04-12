package net.sen.lostworlds;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.common.ForgeConfigSpec.ConfigValue;
import net.minecraftforge.registries.ForgeRegistries;
import net.sen.lostworlds.block.ModBlocks;
import net.sen.lostworlds.util.ModTags;
import org.apache.commons.lang3.tuple.Pair;

public class Config {
    public static class Common {
        public static ConfigValue<String> return_underworld_portal_frame_block_id;
        public static ConfigValue<String> return_nidavellir_portal_frame_block_id;
        public static ConfigValue<String> return_alfheimr_portal_frame_block_id;
        public static ConfigValue<String> return_atlantis_portal_frame_block_id;
        public static ConfigValue<String> return_skyopia_portal_frame_block_id;
        public static ConfigValue<String> return_mystic_gateways_portal_frame_block_id;

        public Common(ForgeConfigSpec.Builder builder) {
            return_underworld_portal_frame_block_id = builder
                    .comment("""
							Determines what block the game will generate Underworld return portals out of
							Use the block tag lostworlds:portal_frame_blocks to determine what blocks portals can be built with
							If value entered here is not a valid block it will default to generating minecraft:stone_bricks""")
                    .translation("lostworlds.config.return_underworld_portal_frame_block_id")
                    .define("Return Portal Frame Block ID", ForgeRegistries.BLOCKS.getKey(Blocks.STONE).toString());

            return_nidavellir_portal_frame_block_id = builder
                    .comment("""
							Determines what block the game will generate Nidavellir return portals out of
							Use the block tag lostworlds:portal_frame_blocks to determine what blocks portals can be built with
							If value entered here is not a valid block it will default to generating minecraft:stone_bricks""")
                    .translation("lostworlds.config.return_nidavellir_portal_frame_block_id")
                    .define("Return Portal Frame Block ID", ForgeRegistries.BLOCKS.getKey(Blocks.STONE).toString());

            return_alfheimr_portal_frame_block_id = builder
                    .comment("""
							Determines what block the game will generate Alfheimr return portals out of
							Use the block tag lostworlds:portal_frame_blocks to determine what blocks portals can be built with
							If value entered here is not a valid block it will default to generating minecraft:stone_bricks""")
                    .translation("lostworlds.config.return_alfheimr_portal_frame_block_id")
                    .define("Return Portal Frame Block ID", ForgeRegistries.BLOCKS.getKey(Blocks.STONE).toString());

            return_atlantis_portal_frame_block_id = builder
                    .comment("""
							Determines what block the game will generate Alfheimr return portals out of
							Use the block tag lostworlds:portal_frame_blocks to determine what blocks portals can be built with
							If value entered here is not a valid block it will default to generating minecraft:stone_bricks""")
                    .translation("lostworlds.config.return_atlantis_portal_frame_block_id")
                    .define("Return Portal Frame Block ID", ForgeRegistries.BLOCKS.getKey(Blocks.STONE).toString());

            return_skyopia_portal_frame_block_id = builder
                    .comment("""
							Determines what block the game will generate Alfheimr return portals out of
							Use the block tag lostworlds:portal_frame_blocks to determine what blocks portals can be built with
							If value entered here is not a valid block it will default to generating minecraft:stone_bricks""")
                    .translation("lostworlds.config.return_skyopia_portal_frame_block_id")
                    .define("Return Portal Frame Block ID", ForgeRegistries.BLOCKS.getKey(Blocks.STONE).toString());

            return_mystic_gateways_portal_frame_block_id = builder
                    .comment("""
							Determines what block the game will generate Alfheimr return portals out of
							Use the block tag lostworlds:portal_frame_blocks to determine what blocks portals can be built with
							If value entered here is not a valid block it will default to generating minecraft:stone_bricks""")
                    .translation("lostworlds.config.return_skyopia_portal_frame_block_id")
                    .define("Return Portal Frame Block ID", ForgeRegistries.BLOCKS.getKey(Blocks.STONE).toString());

            builder.build();
        }
    }

    static final ForgeConfigSpec COMMON_SPEC;
    public static final Common COMMON;

    static {
        final Pair<Config.Common, ForgeConfigSpec> specPair = new ForgeConfigSpec.Builder().configure(Config.Common::new);
        COMMON_SPEC = specPair.getRight();
        COMMON = specPair.getLeft();
    }
}
