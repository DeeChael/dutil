package net.deechael.dutil;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class ArrayUtil {

    public static <T> T[] clean(T[] ts) {
        Preconditions.checkNull(ts);
        List<T> list = new ArrayList<>();
        for (T t : ts) {
            if (null == t)
                continue;
            list.add(t);
        }
        return (T[]) list.toArray();
    }

    public static <T> T[] removeDuplicated(T[] ts) {
        Preconditions.checkNull(ts);
        List<T> list = new ArrayList<>();
        for (T t : ts) {
            if (list.contains(t))
                continue;
            list.add(t);
        }
        return (T[]) list.toArray();
    }

    public static <T> boolean contains(T[] array, T item) {
        if (item == null && array.length - clean(array).length > 0)
            return true;
        if (item == null)
            return false;
        for (T t : clean(array))
            if (t.equals(item))
                return true;
        return false;
    }

    @NotNull
    public static <T> List<T> toList(T[] array, boolean mutable) {
        Preconditions.checkNull(array);
        List<T> list = Arrays.asList(array);
        if (!mutable)
            return list;
        return new ArrayList<>(list);
    }

    public static char @NotNull [] primitive2Class(Character[] array) {
        Preconditions.checkArrayNull(array);
        char[] newArray = new char[array.length];
        for (int i = 0; i < array.length; i++)
            newArray[i] = array[i];
        return newArray;
    }

    @NotNull
    public static Character[] class2Primitive(char[] array) {
        Preconditions.checkNull(array);
        Character[] newArray = new Character[array.length];
        for (int i = 0; i < array.length; i++)
            newArray[i] = array[i];
        return newArray;
    }

    public static boolean @NotNull [] primitive2Class(Boolean[] array) {
        Preconditions.checkArrayNull(array);
        boolean[] newArray = new boolean[array.length];
        for (int i = 0; i < array.length; i++)
            newArray[i] = array[i];
        return newArray;
    }

    @NotNull
    public static Boolean[] class2Primitive(boolean[] array) {
        Preconditions.checkNull(array);
        Boolean[] newArray = new Boolean[array.length];
        for (int i = 0; i < array.length; i++)
            newArray[i] = array[i];
        return newArray;
    }

    public static byte @NotNull [] primitive2Class(Byte[] array) {
        Preconditions.checkArrayNull(array);
        byte[] newArray = new byte[array.length];
        for (int i = 0; i < array.length; i++)
            newArray[i] = array[i];
        return newArray;
    }

    @NotNull
    public static Byte[] class2Primitive(byte[] array) {
        Preconditions.checkNull(array);
        Byte[] newArray = new Byte[array.length];
        for (int i = 0; i < array.length; i++)
            newArray[i] = array[i];
        return newArray;
    }

    public static short @NotNull [] primitive2Class(Short[] array) {
        Preconditions.checkArrayNull(array);
        short[] newArray = new short[array.length];
        for (int i = 0; i < array.length; i++)
            newArray[i] = array[i];
        return newArray;
    }

    @NotNull
    public static Short[] class2Primitive(short[] array) {
        Preconditions.checkNull(array);
        Short[] newArray = new Short[array.length];
        for (int i = 0; i < array.length; i++)
            newArray[i] = array[i];
        return newArray;
    }

    public static int @NotNull [] primitive2Class(Integer[] array) {
        Preconditions.checkArrayNull(array);
        int[] newArray = new int[array.length];
        for (int i = 0; i < array.length; i++)
            newArray[i] = array[i];
        return newArray;
    }

    @NotNull
    public static Integer[] class2Primitive(int[] array) {
        Preconditions.checkNull(array);
        Integer[] newArray = new Integer[array.length];
        for (int i = 0; i < array.length; i++)
            newArray[i] = array[i];
        return newArray;
    }

    public static long @NotNull [] primitive2Class(Long[] array) {
        Preconditions.checkArrayNull(array);
        long[] newArray = new long[array.length];
        for (int i = 0; i < array.length; i++)
            newArray[i] = array[i];
        return newArray;
    }

    @NotNull
    public static Long[] class2Primitive(long[] array) {
        Preconditions.checkNull(array);
        Long[] newArray = new Long[array.length];
        for (int i = 0; i < array.length; i++)
            newArray[i] = array[i];
        return newArray;
    }

    public static float @NotNull [] primitive2Class(Float[] array) {
        Preconditions.checkArrayNull(array);
        float[] newArray = new float[array.length];
        for (int i = 0; i < array.length; i++)
            newArray[i] = array[i];
        return newArray;
    }

    @NotNull
    public static Float[] class2Primitive(float[] array) {
        Preconditions.checkNull(array);
        Float[] newArray = new Float[array.length];
        for (int i = 0; i < array.length; i++)
            newArray[i] = array[i];
        return newArray;
    }

    public static double[] primitive2Class(Double[] array) {
        Preconditions.checkArrayNull(array);
        double[] newArray = new double[array.length];
        for (int i = 0; i < array.length; i++)
            newArray[i] = array[i];
        return newArray;
    }

    @NotNull
    public static Double[] class2Primitive(double[] array) {
        Preconditions.checkNull(array);
        Double[] newArray = new Double[array.length];
        for (int i = 0; i < array.length; i++)
            newArray[i] = array[i];
        return newArray;
    }

    private ArrayUtil() {
    }

}
