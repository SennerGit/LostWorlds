package net.sen.lostworlds.entity.variant;

import java.util.Arrays;
import java.util.Comparator;

public enum ClownfishVariant{

    DEFAULT(0),

    BLUE(1),

    BLACK_AND_WHITE(2),

    NAKED(3),

    PLATINUM(4);

    private static  final ClownfishVariant[] BY_ID = Arrays.stream(ClownfishVariant.values()).sorted(Comparator
            .comparingInt(ClownfishVariant::getId)).toArray(ClownfishVariant[]::new);

    private final int id;

    ClownfishVariant(int id) {
        this.id = id;
    }

    public int getId() {
        return this.id;
    }

    public static ClownfishVariant byId(int id) {
        return BY_ID[id % BY_ID.length];
    }
}
