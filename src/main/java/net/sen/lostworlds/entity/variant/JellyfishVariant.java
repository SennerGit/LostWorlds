package net.sen.lostworlds.entity.variant;

import java.util.Arrays;
import java.util.Comparator;

public enum JellyfishVariant {
    DEFAULT(0);

    private static  final JellyfishVariant[] BY_ID = Arrays.stream(values()).sorted(Comparator
            .comparingInt(JellyfishVariant::getId)).toArray(JellyfishVariant[]::new);

    private final int id;

    JellyfishVariant(int id) {
        this.id = id;
    }

    public int getId() {
        return this.id;
    }

    public static JellyfishVariant byId(int id) {
        return BY_ID[id % BY_ID.length];
    }
}
