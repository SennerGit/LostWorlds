package net.sen.lostworlds.command;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.context.CommandContext;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.Commands;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerPlayer;
import net.sen.lostworlds.LostWorldsApi;

public class ReturnHomeCommand {
    public ReturnHomeCommand(CommandDispatcher<CommandSourceStack> dispatcher) {
        dispatcher.register(Commands.literal("home").then(Commands.literal("return").executes(this::execute)));
    }

    private int execute(CommandContext<CommandSourceStack> context) {
        ServerPlayer player = context.getSource().getPlayer();
        boolean hasHomepos = player.getPersistentData().getIntArray(LostWorldsApi.MODID + ".homepos").length != 0;

        if (hasHomepos) {
            int[] playerPos = player.getPersistentData().getIntArray(LostWorldsApi.MODID + ".homepos");
            player.teleportTo(playerPos[0], playerPos[1], playerPos[2]);

            context.getSource().sendSuccess(() -> Component.literal("Player Returned Home!"), false);
            return 1;
        }
        else {
            context.getSource().sendFailure(Component.literal("No home position has been set!"));
            return -1;
        }
    }
}
