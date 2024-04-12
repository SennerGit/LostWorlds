package net.sen.lostworlds.entity.variant;

import java.util.Arrays;
import java.util.Comparator;

public enum ShadowhoundVariant {
    DEFAULT(0),
    WHITE(1);

    private static  final ShadowhoundVariant[] BY_ID = Arrays.stream(values()).sorted(Comparator
            .comparingInt(ShadowhoundVariant::getId)).toArray(ShadowhoundVariant[]::new);

    private final int id;

    ShadowhoundVariant(int id) {
        this.id = id;
    }

    public int getId() {
        return this.id;
    }

    public static ShadowhoundVariant byId(int id) {
        return BY_ID[id % BY_ID.length];
    }
}
