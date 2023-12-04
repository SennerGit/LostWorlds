package net.sen.lostworlds.entity.variant;

import java.util.Arrays;
import java.util.Comparator;

public enum GreatWhiteVariant {
    DEFAULT(0),
    WHITE(1);

    private static  final GreatWhiteVariant[] BY_ID = Arrays.stream(values()).sorted(Comparator
            .comparingInt(GreatWhiteVariant::getId)).toArray(GreatWhiteVariant[]::new);

    private final int id;

    GreatWhiteVariant(int id) {
        this.id = id;
    }

    public int getId() {
        return this.id;
    }

    public static GreatWhiteVariant byId(int id) {
        return BY_ID[id % BY_ID.length];
    }
}
