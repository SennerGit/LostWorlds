package net.sen.lostworlds.entity.variant;

import java.util.Arrays;
import java.util.Comparator;

public enum NudibranchSlugVariant {
    DEFAULT(0),
    WHITE(1);

    private static  final NudibranchSlugVariant[] BY_ID = Arrays.stream(values()).sorted(Comparator
            .comparingInt(NudibranchSlugVariant::getId)).toArray(NudibranchSlugVariant[]::new);

    private final int id;

    NudibranchSlugVariant(int id) {
        this.id = id;
    }

    public int getId() {
        return this.id;
    }

    public static NudibranchSlugVariant byId(int id) {
        return BY_ID[id % BY_ID.length];
    }
}
