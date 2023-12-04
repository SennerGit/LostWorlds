package net.sen.lostworlds.entity.variant;

import java.util.Arrays;
import java.util.Comparator;

public enum SirenVariant {
    DEFAULT(0);

    private static  final SirenVariant[] BY_ID = Arrays.stream(values()).sorted(Comparator
            .comparingInt(SirenVariant::getId)).toArray(SirenVariant[]::new);

    private final int id;

    SirenVariant(int id) {
        this.id = id;
    }

    public int getId() {
        return this.id;
    }

    public static SirenVariant byId(int id) {
        return BY_ID[id % BY_ID.length];
    }
}
