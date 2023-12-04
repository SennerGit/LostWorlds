package net.sen.lostworlds.entity.variant;

import java.util.Arrays;
import java.util.Comparator;

public enum GiantSquidVariant {
    DEFAULT(0);

    private static  final GiantSquidVariant[] BY_ID = Arrays.stream(values()).sorted(Comparator
            .comparingInt(GiantSquidVariant::getId)).toArray(GiantSquidVariant[]::new);

    private final int id;

    GiantSquidVariant(int id) {
        this.id = id;
    }

    public int getId() {
        return this.id;
    }

    public static GiantSquidVariant byId(int id) {
        return BY_ID[id % BY_ID.length];
    }
}
