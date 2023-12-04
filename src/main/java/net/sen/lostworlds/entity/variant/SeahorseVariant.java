package net.sen.lostworlds.entity.variant;

import java.util.Arrays;
import java.util.Comparator;

public enum SeahorseVariant {
    DEFAULT(0),
    WHITE(1);

    private static  final SeahorseVariant[] BY_ID = Arrays.stream(values()).sorted(Comparator
            .comparingInt(SeahorseVariant::getId)).toArray(SeahorseVariant[]::new);

    private final int id;

    SeahorseVariant(int id) {
        this.id = id;
    }

    public int getId() {
        return this.id;
    }

    public static SeahorseVariant byId(int id) {
        return BY_ID[id % BY_ID.length];
    }
}
