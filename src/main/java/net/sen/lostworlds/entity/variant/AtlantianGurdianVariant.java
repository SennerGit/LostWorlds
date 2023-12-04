package net.sen.lostworlds.entity.variant;

import java.util.Arrays;
import java.util.Comparator;

public enum AtlantianGurdianVariant {
    DEFAULT(0),
    WHITE(1);

    private static  final AtlantianGurdianVariant[] BY_ID = Arrays.stream(values()).sorted(Comparator
            .comparingInt(AtlantianGurdianVariant::getId)).toArray(AtlantianGurdianVariant[]::new);

    private final int id;

    AtlantianGurdianVariant(int id) {
        this.id = id;
    }

    public int getId() {
        return this.id;
    }

    public static AtlantianGurdianVariant byId(int id) {
        return BY_ID[id % BY_ID.length];
    }
}
