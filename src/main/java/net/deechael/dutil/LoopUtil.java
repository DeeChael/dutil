package net.deechael.dutil;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public final class LoopUtil {

    public static void range(int range, Consumer<Integer> function) {
        for (int i = 0; i < range; i++)
            function.accept(i);
    }

    public static <T> void foreach(T[] ts, BiConsumer<Integer, T> function) {
        for (int i = 0; i < ts.length; i++)
            function.accept(i, ts[i]);
    }

    private LoopUtil() {
    }

}
