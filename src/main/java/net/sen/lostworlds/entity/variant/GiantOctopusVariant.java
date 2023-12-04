package net.sen.lostworlds.entity.variant;

import java.util.Arrays;
import java.util.Comparator;

public enum GiantOctopusVariant {
    DEFAULT(0),
    WHITE(1);

    private static  final GiantOctopusVariant[] BY_ID = Arrays.stream(values()).sorted(Comparator
            .comparingInt(GiantOctopusVariant::getId)).toArray(GiantOctopusVariant[]::new);

    private final int id;

    GiantOctopusVariant(int id) {
        this.id = id;
    }

    public int getId() {
        return this.id;
    }

    public static GiantOctopusVariant byId(int id) {
        return BY_ID[id % BY_ID.length];
    }
}
