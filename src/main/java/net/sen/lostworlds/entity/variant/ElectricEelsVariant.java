package net.sen.lostworlds.entity.variant;

import java.util.Arrays;
import java.util.Comparator;

public enum ElectricEelsVariant {
    DEFAULT(0),
    WHITE(1);

    private static  final ElectricEelsVariant[] BY_ID = Arrays.stream(values()).sorted(Comparator
            .comparingInt(ElectricEelsVariant::getId)).toArray(ElectricEelsVariant[]::new);

    private final int id;

    ElectricEelsVariant(int id) {
        this.id = id;
    }

    public int getId() {
        return this.id;
    }

    public static ElectricEelsVariant byId(int id) {
        return BY_ID[id % BY_ID.length];
    }
}
