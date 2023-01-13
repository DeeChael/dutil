package net.deechael.dutil;

import org.jetbrains.annotations.NotNull;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public final class MapUtil {

    @NotNull
    public static <K, V> Map<K, V> copyHash(@NotNull Map<K, V> map) {
        Preconditions.checkNull(map);
        return new HashMap<>(map);
    }

    @NotNull
    public static <K, V> Map<K, V> copyLinked(@NotNull Map<K, V> map) {
        Preconditions.checkNull(map);
        return new LinkedHashMap<>(map);
    }

    @NotNull
    public static <K, V> Map<K, V> asHash(@NotNull Iterable<Entry<K, V>> iterable) {
        Preconditions.checkNull(iterable);
        Map<K, V> map = new HashMap<>();
        for (Entry<K, V> entry : iterable)
            map.put(entry.getKey(), entry.getValue());
        return map;
    }

    @NotNull
    public static <K, V> Map<K, V> asLinked(@NotNull Iterable<Entry<K, V>> iterable) {
        Preconditions.checkNull(iterable);
        Map<K, V> map = new LinkedHashMap<>();
        for (Entry<K, V> entry : iterable)
            map.put(entry.getKey(), entry.getValue());
        return map;
    }

    private MapUtil() {
    }

}
