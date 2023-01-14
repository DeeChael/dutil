package net.deechael.dutil;

import java.util.ArrayList;
import java.util.List;

public final class ListUtil {

    public static <T> List<T> clean(List<T> original) {
        List<T> list = new ArrayList<>();
        for (T t : original) {
            if (null == t)
                continue;
            list.add(t);
        }
        return list;
    }

    public static <T> List<T> removeDuplicated(List<T> original) {
        List<T> list = new ArrayList<>();
        for (T t : original) {
            if (list.contains(t))
                continue;
            list.add(t);
        }
        return list;
    }

    private ListUtil() {
    }

}
