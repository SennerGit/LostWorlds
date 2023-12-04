package net.sen.lostworlds.entity.variant;

import java.util.Arrays;
import java.util.Comparator;

public enum BioluminescentPlanktonVariant {
    DEFAULT(0),
    WHITE(1);

    private static  final BioluminescentPlanktonVariant[] BY_ID = Arrays.stream(values()).sorted(Comparator
            .comparingInt(BioluminescentPlanktonVariant::getId)).toArray(BioluminescentPlanktonVariant[]::new);

    private final int id;

    BioluminescentPlanktonVariant(int id) {
        this.id = id;
    }

    public int getId() {
        return this.id;
    }

    public static BioluminescentPlanktonVariant byId(int id) {
        return BY_ID[id % BY_ID.length];
    }
}
