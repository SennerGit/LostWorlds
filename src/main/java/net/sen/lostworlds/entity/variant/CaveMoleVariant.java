package net.sen.lostworlds.entity.variant;

import java.util.Arrays;
import java.util.Comparator;

public enum CaveMoleVariant {
    DEFAULT(0),
    WHITE(1);

    private static  final CaveMoleVariant[] BY_ID = Arrays.stream(values()).sorted(Comparator
            .comparingInt(CaveMoleVariant::getId)).toArray(CaveMoleVariant[]::new);

    private final int id;

    CaveMoleVariant(int id) {
        this.id = id;
    }

    public int getId() {
        return this.id;
    }

    public static CaveMoleVariant byId(int id) {
        return BY_ID[id % BY_ID.length];
    }
}
