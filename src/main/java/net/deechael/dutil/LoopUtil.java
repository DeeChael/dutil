package net.deechael.dutil;

import java.util.Iterator;

public final class LoopUtil {

    public static void range(int range, Looper function) {
        for (int i = 0; i < range; i++)
            if (!function.acceptCatch(i))
                break;
    }

    public static <T> void foreach(T[] ts, BiLooper<T> function) {
        for (int i = 0; i < ts.length; i++)
            if (!function.acceptCatch(i, ts[i]))
                break;
    }

    public static <T> void foreach(Iterable<T> ts, BiLooper<T> function) {
        Iterator<T> iterator = ts.iterator();
        int index = 0;
        while (iterator.hasNext()) {
            if (!function.acceptCatch(index, iterator.next()))
                break;
            index++;
        }
    }

    private LoopUtil() {
    }

    @FunctionalInterface
    public static interface Looper {

        void accept(int i);

        default boolean acceptCatch(int i) {
            try {
                accept(i);
                return true;
            } catch (LoopException e) {
                return false;
            }
        }

        default void cancel() {
            throw new LoopException();
        }

    }

    @FunctionalInterface
    public static interface BiLooper<T> {

        void accept(int i, T t);

        default boolean acceptCatch(int i, T t) {
            try {
                accept(i, t);
                return true;
            } catch (LoopException e) {
                return false;
            }
        }

        default void cancel() {
            throw new LoopException();
        }

    }

    private final static class LoopException extends RuntimeException {
    }

}
