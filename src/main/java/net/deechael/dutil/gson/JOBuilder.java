package net.deechael.dutil.gson;

import com.google.gson.JsonObject;
import net.deechael.dutil.builder.BaseBuilder;
import org.jetbrains.annotations.NotNull;

import java.util.Objects;
import java.util.function.Predicate;

public class JOBuilder<T> implements BaseBuilder<JsonObject, T> {

    private final T returner;
    private final JsonObject jsonObject = new JsonObject();

    public JOBuilder(T t) {
        this.returner = t;
    }

    public JOBuilder<T> string(String key, String value) {
        return this.string(key, value, value);
    }

    public JOBuilder<T> string(String key, String value, String defaultValue) {
        return this.string(key, value, Objects::nonNull, defaultValue);
    }

    public JOBuilder<T> string(String key, String value, Predicate<String> predicate, String defaultValue) {
        if (!predicate.test(value))
            value = defaultValue;
        this.jsonObject.addProperty(key, value);
        return this;
    }

    public JOBuilder<T> number(String key, Number value) {
        return this.number(key, value, value);
    }

    public JOBuilder<T> number(String key, Number value, Number defaultValue) {
        return this.number(key, value, Objects::nonNull, defaultValue);
    }

    public JOBuilder<T> number(String key, Number value, Predicate<Number> predicate, Number defaultValue) {
        if (!predicate.test(value))
            value = defaultValue;
        this.jsonObject.addProperty(key, value);
        return this;
    }

    public JOBuilder<T> bool(String key, Boolean value) {
        return this.bool(key, value, value);
    }

    public JOBuilder<T> bool(String key, Boolean value, Boolean defaultValue) {
        return this.bool(key, value, Objects::nonNull, defaultValue);
    }

    public JOBuilder<T> bool(String key, Boolean value, Predicate<Boolean> predicate, Boolean defaultValue) {
        if (!predicate.test(value))
            value = defaultValue;
        this.jsonObject.addProperty(key, value);
        return this;
    }

    public JOBuilder<T> object(String key, JsonObject value) {
        return this.object(key, value, value);
    }

    public JOBuilder<T> object(String key, JsonObject value, JsonObject defaultValue) {
        return this.object(key, value, Objects::nonNull, defaultValue);
    }

    public JOBuilder<T> object(String key, JsonObject value, Predicate<JsonObject> predicate, JsonObject defaultValue) {
        if (!predicate.test(value))
            value = defaultValue;
        this.jsonObject.add(key, value);
        return this;
    }

    public JOBuilder<JOBuilder<T>> object(String key) {
        JOBuilder<JOBuilder<T>> builder = new JOBuilder<>(this);
        this.jsonObject.add(key, builder.jsonObject);
        return builder;
    }

    @Override
    public T done() {
        return this.returner;
    }

    @Override
    public @NotNull JsonObject build() {
        return this.jsonObject;
    }

    public static JOBuilder<?> of() {
        return new JOBuilder<>(null);
    }

}
