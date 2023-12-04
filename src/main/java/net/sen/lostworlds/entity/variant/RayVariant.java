package net.sen.lostworlds.entity.variant;

import java.util.Arrays;
import java.util.Comparator;

public enum RayVariant {
    DEFAULT(0);

    private static  final RayVariant[] BY_ID = Arrays.stream(values()).sorted(Comparator
            .comparingInt(RayVariant::getId)).toArray(RayVariant[]::new);

    private final int id;

    RayVariant(int id) {
        this.id = id;
    }

    public int getId() {
        return this.id;
    }

    public static RayVariant byId(int id) {
        return BY_ID[id % BY_ID.length];
    }
}
