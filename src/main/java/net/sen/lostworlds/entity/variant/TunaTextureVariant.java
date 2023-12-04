package net.sen.lostworlds.entity.variant;

import java.util.Arrays;
import java.util.Comparator;

public enum TunaTextureVariant {
    DEFAULT(0);

    private static  final TunaTextureVariant[] BY_ID = Arrays.stream(TunaTextureVariant.values()).sorted(Comparator
            .comparingInt(TunaTextureVariant::getId)).toArray(TunaTextureVariant[]::new);

    private final int id;

    TunaTextureVariant(int id) {
        this.id = id;
    }

    public int getId() {
        return this.id;
    }

    public static TunaTextureVariant byId(int id) {
        return BY_ID[id % BY_ID.length];
    }
}
