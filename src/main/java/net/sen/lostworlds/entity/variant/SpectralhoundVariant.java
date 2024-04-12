package net.sen.lostworlds.entity.variant;

import java.util.Arrays;
import java.util.Comparator;

public enum SpectralhoundVariant {
    DEFAULT(0),
    WHITE(1);

    private static  final SpectralhoundVariant[] BY_ID = Arrays.stream(values()).sorted(Comparator
            .comparingInt(SpectralhoundVariant::getId)).toArray(SpectralhoundVariant[]::new);

    private final int id;

    SpectralhoundVariant(int id) {
        this.id = id;
    }

    public int getId() {
        return this.id;
    }

    public static SpectralhoundVariant byId(int id) {
        return BY_ID[id % BY_ID.length];
    }
}
