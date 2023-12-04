package net.sen.lostworlds.util.tools;

public class MinecraftMaths {
    public static int secondsInTicks(int seconds) {
        return seconds * 20;
    }

    public static final float QuarterPi = ((float)Math.PI / 4F);

    public static final float StartingAngle = 0.0174532925F;
    public static final float ThreeStartingAngle = StartingAngle * 3;
    public static final float EightStartingAngle = StartingAngle * 8;

    public static float rad(final double deg) {
        return (float) Math.toRadians(deg);
    }
    public static float randomFloat(float min, float max) {
        double d = Math.random() * (max-min) + min;
        return (float) d;
    }
}
