package net.sen.lostworlds.entity.variant;

import java.util.Arrays;
import java.util.Comparator;

public enum ElvesVariant {
    DEFAULT(0);

    private static  final ElvesVariant[] BY_ID = Arrays.stream(values()).sorted(Comparator
            .comparingInt(ElvesVariant::getId)).toArray(ElvesVariant[]::new);

    private final int id;

    ElvesVariant(int id) {
        this.id = id;
    }

    public int getId() {
        return this.id;
    }

    public static ElvesVariant byId(int id) {
        return BY_ID[id % BY_ID.length];
    }
}
