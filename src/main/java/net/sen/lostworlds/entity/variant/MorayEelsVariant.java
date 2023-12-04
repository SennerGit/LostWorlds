package net.sen.lostworlds.entity.variant;

import java.util.Arrays;
import java.util.Comparator;

public enum MorayEelsVariant {
    DEFAULT(0),
    WHITE(1);

    private static  final MorayEelsVariant[] BY_ID = Arrays.stream(values()).sorted(Comparator
            .comparingInt(MorayEelsVariant::getId)).toArray(MorayEelsVariant[]::new);

    private final int id;

    MorayEelsVariant(int id) {
        this.id = id;
    }

    public int getId() {
        return this.id;
    }

    public static MorayEelsVariant byId(int id) {
        return BY_ID[id % BY_ID.length];
    }
}
