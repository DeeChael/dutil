package net.deechael.dutil;

import java.util.ArrayList;
import java.util.List;

public final class CollectionUtil {

    public static <T> List<T> ofList(Iterable<T> iterable) {
        List<T> list = new ArrayList<>();
        for (T t : iterable)
            list.add(t);
        return list;
    }

    public static <T> T choice(Iterable<T> iterable) {
        List<T> t = ofList(iterable);
        return t.get(NumberUtil.random(t.size() - 1));
    }

    private CollectionUtil() {
    }

}
