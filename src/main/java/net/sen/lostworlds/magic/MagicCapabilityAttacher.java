package net.sen.lostworlds.magic;

import net.minecraft.core.Direction;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.ICapabilityProvider;
import net.minecraftforge.common.util.INBTSerializable;
import net.minecraftforge.common.util.LazyOptional;
import net.minecraftforge.event.AttachCapabilitiesEvent;
import net.sen.lostworlds.LostWorldsApi;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class MagicCapabilityAttacher {
    private static class MagicCapabilityProvider implements ICapabilityProvider, INBTSerializable<CompoundTag> {
        public static final ResourceLocation IDENTIFIER = LostWorldsApi.modLoc("magic_capability");
        public MagicProperties magicProperties;
        public final IMagicCapability backend = new MagicCapabilityImplementation(this.magicProperties);
        public final LazyOptional<IMagicCapability> optionalData = LazyOptional.of(() -> backend);

        @NotNull
        @Override
        public <T> LazyOptional<T> getCapability(@NotNull Capability<T> cap, @Nullable Direction side) {
            return MagicCapability.INSTANCE.orEmpty(cap, this.optionalData);
        }

        void invalidate() {
            this.optionalData.invalidate();
        }

        @Override
        public CompoundTag serializeNBT() {
            return this.backend.serializeNBT();
        }

        @Override
        public void deserializeNBT(CompoundTag nbt) {
            this.backend.deserializeNBT(nbt);
        }

        MagicCapabilityProvider(MagicProperties magicProperties) {
            this.magicProperties = magicProperties;
        }
    }

    public static void attach(final AttachCapabilitiesEvent<Item> event, MagicProperties magicProperties) {
        final MagicCapabilityProvider provider = new MagicCapabilityProvider(magicProperties);

        event.addCapability(MagicCapabilityProvider.IDENTIFIER, provider);
    }

    private MagicCapabilityAttacher() {
    }
}
