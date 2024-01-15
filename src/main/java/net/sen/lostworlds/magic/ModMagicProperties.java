package net.sen.lostworlds.magic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ModMagicProperties {
    public static final Map<String, MagicProperties> MAGIC_PROPERTIES = new HashMap<>();

    public static final MagicProperties PORTAL_CORE = register(new MagicProperties.Builder("portal_core")
            .addMagicType(MagicElementTypeEnum.ENDER)
            .addMagicType(MagicElementTypeEnum.RAW)
            .build());

//    public static final MagicProperties PORTAL_CORE = new MagicProperties.Builder("portal_core")
//            .addMagicType(MagicElementTypeEnum.ENDER)
//            .addMagicType(MagicElementTypeEnum.RAW)
//            .build();

    private static MagicProperties register(MagicProperties magicProperties) {
        MAGIC_PROPERTIES.put(magicProperties.getName(), magicProperties);
        return magicProperties;
    }
}
