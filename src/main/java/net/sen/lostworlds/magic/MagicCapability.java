package net.sen.lostworlds.magic;

import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.CapabilityManager;
import net.minecraftforge.common.capabilities.CapabilityToken;
import net.minecraftforge.common.capabilities.RegisterCapabilitiesEvent;

public class MagicCapability {
    public static final Capability<IMagicCapability> INSTANCE = CapabilityManager.get(new CapabilityToken<>() {});

    public static void register(RegisterCapabilitiesEvent event) {
        event.register(IMagicCapability.class);
    }

    private MagicCapability() {
    }
}
