package net.sen.lostworlds.entity.variant;

import java.util.Arrays;
import java.util.Comparator;

public enum HellhoundVariant {
    DEFAULT(0),
    WHITE(1);

    private static  final HellhoundVariant[] BY_ID = Arrays.stream(values()).sorted(Comparator
            .comparingInt(HellhoundVariant::getId)).toArray(HellhoundVariant[]::new);

    private final int id;

    HellhoundVariant(int id) {
        this.id = id;
    }

    public int getId() {
        return this.id;
    }

    public static HellhoundVariant byId(int id) {
        return BY_ID[id % BY_ID.length];
    }
}
