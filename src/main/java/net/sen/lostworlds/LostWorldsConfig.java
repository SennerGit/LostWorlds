package net.sen.lostworlds;

import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.common.ForgeConfigSpec.ConfigValue;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraft.world.level.Level;
import net.sen.lostworlds.worldgen.dimension.AlfheimrDimension;
import net.sen.lostworlds.worldgen.dimension.ModDimensions;
import org.apache.commons.lang3.tuple.Pair;

public class LostWorldsConfig {
    public static class Server {
        public Server(ForgeConfigSpec.Builder builder) {
        }
    }

    public static class Common {
        public final ConfigValue<Boolean> enable_alfheimr_dimension;
        public final ConfigValue<Boolean> enable_underworld_dimension;
        public final ConfigValue<Boolean> enable_nidavellir_dimension;
        public final ConfigValue<Boolean> enable_atlantis_dimension;
        public final ConfigValue<Boolean> enable_skyopia_dimension;

        public Common(ForgeConfigSpec.Builder builder) {
            builder.push("enable_dimensions");
            enable_alfheimr_dimension = builder
                    .comment("Enables the teleportation into the Alfheimr Dimension")
                    .translation("config.lostworlds.common.enable_dimensions.enable_alfheimr_dimension")
                    .define("Enables the Alfheimr Dimension", true);
            enable_underworld_dimension = builder
                    .comment("Enables the teleportation into the Underworld Dimension")
                    .translation("config.lostworlds.common.enable_dimensions.enable_underworld_dimension")
                    .define("Enables the Underworld Dimension", true);
            enable_nidavellir_dimension = builder
                    .comment("Enables the teleportation into the Nidavellir Dimension")
                    .translation("config.lostworlds.common.enable_dimensions.enable_nidavellir_dimension")
                    .define("Enables the Nidavellir Dimension", true);
            enable_atlantis_dimension = builder
                    .comment("Enables the teleportation into the Atlantis Dimension")
                    .translation("config.lostworlds.common.enable_dimensions.enable_atlantis_dimension")
                    .define("Enables the Atlantis Dimension", true);
            enable_skyopia_dimension = builder
                    .comment("Enables the teleportation into the Skyopia Dimension")
                    .translation("config.lostworlds.common.enable_dimensions.enable_skyopia_dimension")
                    .define("Enables the Skyopia Dimension", true);
            builder.pop();

            builder.build();
        }
    }

    public static class Client {
        public Client(ForgeConfigSpec.Builder builder) {
            builder.build();
        }
    }

    static final ForgeConfigSpec SERVER_SPEC;
    public static final Server SERVER;

    static final ForgeConfigSpec COMMON_SPEC;
    public static final Common COMMON;

    static final ForgeConfigSpec CLIENT_SPEC;
    public static final Client CLIENT;

    static {
        final Pair<Server, ForgeConfigSpec> serverSpecPair  = new ForgeConfigSpec.Builder().configure(LostWorldsConfig.Server::new);
        SERVER_SPEC = serverSpecPair.getRight();
        SERVER = serverSpecPair.getLeft();

        final Pair<Common, ForgeConfigSpec> commonSpecPair  = new ForgeConfigSpec.Builder().configure(LostWorldsConfig.Common::new);
        COMMON_SPEC = commonSpecPair.getRight();
        COMMON = commonSpecPair.getLeft();

        final Pair<Client, ForgeConfigSpec> clientSpecPair  = new ForgeConfigSpec.Builder().configure(LostWorldsConfig.Client::new);
        CLIENT_SPEC = clientSpecPair.getRight();
        CLIENT = clientSpecPair.getLeft();
    }
}