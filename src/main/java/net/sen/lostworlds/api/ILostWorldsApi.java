package net.sen.lostworlds.api;

import java.util.function.Function;
import java.util.function.Predicate;

import javax.annotation.Nonnull;

import org.apache.logging.log4j.LogManager;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.util.LazyLoadedValue;
import net.minecraft.core.NonNullList;

public interface ILostWorldsApi {
    LazyLoadedValue<ILostWorldsApi> INSTANCE = new LazyLoadedValue<>(
            () -> {
                try {
                    return (ILostWorldsApi) Class.forName("net.sen.lostworlds.api.LostWorldsApi").getDeclaredField("INSTANCE").get(null);
                } catch (ReflectiveOperationException e) {
                    LogManager.getLogger().warn("Unable to find LostWorldsApi, using a dummy instance instead...");
                    return new ILostWorldsApi() {
                    };
                }
            }
    );
}
