package net.sen.lostworlds.entity.variant;

import java.util.Arrays;
import java.util.Comparator;

public enum AtlantianVariant {
    DEFAULT(0),
    WHITE(1);

    private static  final AtlantianVariant[] BY_ID = Arrays.stream(values()).sorted(Comparator
            .comparingInt(AtlantianVariant::getId)).toArray(AtlantianVariant[]::new);

    private final int id;

    AtlantianVariant(int id) {
        this.id = id;
    }

    public int getId() {
        return this.id;
    }

    public static AtlantianVariant byId(int id) {
        return BY_ID[id % BY_ID.length];
    }
}
