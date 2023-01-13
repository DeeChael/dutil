package net.deechael.dutil.gson;

import com.google.gson.JsonArray;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import net.deechael.dutil.Preconditions;
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
        Preconditions.checkNull(key);
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
        Preconditions.checkNull(key);
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
        Preconditions.checkNull(key);
        if (!predicate.test(value))
            value = defaultValue;
        this.jsonObject.addProperty(key, value);
        return this;
    }
    public JOBuilder<T> character(String key, Character value) {
        return this.character(key, value, value);
    }

    public JOBuilder<T> character(String key, Character value, Character defaultValue) {
        return this.character(key, value, Objects::nonNull, defaultValue);
    }

    public JOBuilder<T> character(String key, Character value, Predicate<Character> predicate, Character defaultValue) {
        Preconditions.checkNull(key);
        if (!predicate.test(value))
            value = defaultValue;
        this.jsonObject.addProperty(key, value);
        return this;
    }

    public JOBuilder<T> nullValue(String key) {
        Preconditions.checkNull(key);
        this.jsonObject.add(key, JsonNull.INSTANCE);
        return this;
    }

    public JOBuilder<T> primitive(String key, JsonPrimitive value) {
        return this.primitive(key, value, value);
    }

    public JOBuilder<T> primitive(String key, JsonPrimitive value, JsonPrimitive defaultValue) {
        return this.primitive(key, value, Objects::nonNull, defaultValue);
    }

    public JOBuilder<T> primitive(String key, JsonPrimitive value, Predicate<JsonPrimitive> predicate, JsonPrimitive defaultValue) {
        Preconditions.checkNull(key);
        if (!predicate.test(value))
            value = defaultValue;
        this.jsonObject.add(key, value);
        return this;
    }

    public JOBuilder<T> object(String key, JsonObject value) {
        return this.object(key, value, value);
    }

    public JOBuilder<T> object(String key, JsonObject value, JsonObject defaultValue) {
        return this.object(key, value, Objects::nonNull, defaultValue);
    }

    public JOBuilder<T> object(String key, JsonObject value, Predicate<JsonObject> predicate, JsonObject defaultValue) {
        Preconditions.checkNull(key);
        if (!predicate.test(value))
            value = defaultValue;
        this.jsonObject.add(key, value);
        return this;
    }

    public JOBuilder<JOBuilder<T>> object(String key) {
        Preconditions.checkNull(key);
        JOBuilder<JOBuilder<T>> builder = new JOBuilder<>(this);
        this.jsonObject.add(key, builder.build());
        return builder;
    }

    public JOBuilder<T> array(String key, JsonArray value) {
        return this.array(key, value, value);
    }

    public JOBuilder<T> array(String key, JsonArray value, JsonArray defaultValue) {
        return this.array(key, value, Objects::nonNull, defaultValue);
    }

    public JOBuilder<T> array(String key, JsonArray value, Predicate<JsonArray> predicate, JsonArray defaultValue) {
        Preconditions.checkNull(key);
        if (!predicate.test(value))
            value = defaultValue;
        this.jsonObject.add(key, value);
        return this;
    }

    public JABuilder<JOBuilder<T>> array(String key) {
        Preconditions.checkNull(key);
        JABuilder<JOBuilder<T>> builder = new JABuilder<>(this);
        this.jsonObject.add(key, builder.build());
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
