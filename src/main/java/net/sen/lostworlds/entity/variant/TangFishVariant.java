package net.sen.lostworlds.entity.variant;

import java.util.Arrays;
import java.util.Comparator;

public enum TangFishVariant {
    BLUE(0),

    BLACK(1),

    BROWN(2),

    ACHILLES(3);

    private static  final TangFishVariant[] BY_ID = Arrays.stream(TangFishVariant.values()).sorted(Comparator
            .comparingInt(TangFishVariant::getId)).toArray(TangFishVariant[]::new);

    private final int id;

    TangFishVariant(int id) {
        this.id = id;
    }

    public int getId() {
        return this.id;
    }

    public static TangFishVariant byId(int id) {
        return BY_ID[id % BY_ID.length];
    }
}
