package net.sen.lostworlds.entity.variant;

import java.util.Arrays;
import java.util.Comparator;

public enum SharkVariant {
    DEFAULT(0);

    private static  final SharkVariant[] BY_ID = Arrays.stream(values()).sorted(Comparator
            .comparingInt(SharkVariant::getId)).toArray(SharkVariant[]::new);

    private final int id;

    SharkVariant(int id) {
        this.id = id;
    }

    public int getId() {
        return this.id;
    }

    public static SharkVariant byId(int id) {
        return BY_ID[id % BY_ID.length];
    }
}
