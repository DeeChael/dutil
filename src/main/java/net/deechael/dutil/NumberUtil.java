package net.deechael.dutil;

import java.util.Random;

public final class NumberUtil {

    public static int square(int num) {
        return num * num;
    }

    public static long square(long num) {
        return num * num;
    }

    public static float square(float num) {
        return num * num;
    }

    public static double square(double num) {
        return num * num;
    }

    public static int digitDivide(int total, int divider) {
        return total % divider == 0 ? total / divider : total / divider + 1;
    }

    public static int random(int max) {
        return new Random().nextInt(max + 1);
    }

    public static int random(int min, int max) {
        return new Random().nextInt(max - min + 1) + min;
    }

    private NumberUtil() {
    }

}
