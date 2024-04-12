package net.sen.lostworlds.entity.variant;

import java.util.Arrays;
import java.util.Comparator;

public enum VampireBatVariant {
    DEFAULT(0),
    WHITE(1);

    private static  final VampireBatVariant[] BY_ID = Arrays.stream(values()).sorted(Comparator
            .comparingInt(VampireBatVariant::getId)).toArray(VampireBatVariant[]::new);

    private final int id;

    VampireBatVariant(int id) {
        this.id = id;
    }

    public int getId() {
        return this.id;
    }

    public static VampireBatVariant byId(int id) {
        return BY_ID[id % BY_ID.length];
    }
}
