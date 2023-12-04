package net.sen.lostworlds.entity.variant;

import java.util.Arrays;
import java.util.Comparator;

public enum MerfolkVariant {
    DEFAULT(0),
    WHITE(1);

    private static  final MerfolkVariant[] BY_ID = Arrays.stream(values()).sorted(Comparator
            .comparingInt(MerfolkVariant::getId)).toArray(MerfolkVariant[]::new);

    private final int id;

    MerfolkVariant(int id) {
        this.id = id;
    }

    public int getId() {
        return this.id;
    }

    public static MerfolkVariant byId(int id) {
        return BY_ID[id % BY_ID.length];
    }
}
