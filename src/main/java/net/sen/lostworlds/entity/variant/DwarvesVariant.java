package net.sen.lostworlds.entity.variant;

import java.util.Arrays;
import java.util.Comparator;

public enum DwarvesVariant {
    DEFAULT(0);

    private static  final DwarvesVariant[] BY_ID = Arrays.stream(values()).sorted(Comparator
            .comparingInt(DwarvesVariant::getId)).toArray(DwarvesVariant[]::new);

    private final int id;

    DwarvesVariant(int id) {
        this.id = id;
    }

    public int getId() {
        return this.id;
    }

    public static DwarvesVariant byId(int id) {
        return BY_ID[id % BY_ID.length];
    }
}
