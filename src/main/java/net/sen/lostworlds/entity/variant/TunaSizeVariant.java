package net.sen.lostworlds.entity.variant;

import java.util.Arrays;
import java.util.Comparator;

public enum TunaSizeVariant {
    TINY(0),

    SMALL(1),

    MID(2),

    LARGE(3),

    GIANT(4);

    private static  final TunaSizeVariant[] BY_ID = Arrays.stream(TunaSizeVariant.values()).sorted(Comparator
            .comparingInt(TunaSizeVariant::getId)).toArray(TunaSizeVariant[]::new);

    private final int id;

    TunaSizeVariant(int id) {
        this.id = id;
    }

    public int getId() {
        return this.id;
    }

    public static TunaSizeVariant byId(int id) {
        return BY_ID[id % BY_ID.length];
    }
}
