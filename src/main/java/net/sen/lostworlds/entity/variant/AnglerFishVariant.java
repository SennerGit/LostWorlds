package net.sen.lostworlds.entity.variant;

import java.util.Arrays;
import java.util.Comparator;

public enum AnglerFishVariant {
    DEFAULT(0);

    private static  final AnglerFishVariant[] BY_ID = Arrays.stream(values()).sorted(Comparator
            .comparingInt(AnglerFishVariant::getId)).toArray(AnglerFishVariant[]::new);

    private final int id;

    AnglerFishVariant(int id) {
        this.id = id;
    }

    public int getId() {
        return this.id;
    }

    public static AnglerFishVariant byId(int id) {
        return BY_ID[id % BY_ID.length];
    }
}
