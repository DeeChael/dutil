package net.deechael.dutil.gson;

import com.google.gson.JsonArray;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import net.deechael.dutil.builder.BaseBuilder;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Objects;
import java.util.function.Predicate;

public class JABuilder<T> implements BaseBuilder<JsonArray, T> {

    private final T returner;
    private final JsonArray jsonArray = new JsonArray();

    public JABuilder(T t) {
        this.returner = t;
    }

    public JABuilder<T> string(String value) {
        return this.string(value, value);
    }

    public JABuilder<T> string(String value, String defaultValue) {
        return this.string(value, Objects::nonNull, defaultValue);
    }

    public JABuilder<T> string(String value, Predicate<String> predicate, String defaultValue) {
        if (!predicate.test(value))
            value = defaultValue;
        this.jsonArray.add(value);
        return this;
    }

    public JABuilder<T> number(Number value) {
        return this.number(value, value);
    }

    public JABuilder<T> number(Number value, Number defaultValue) {
        return this.number(value, Objects::nonNull, defaultValue);
    }

    public JABuilder<T> number(Number value, Predicate<Number> predicate, Number defaultValue) {
        if (!predicate.test(value))
            value = defaultValue;
        this.jsonArray.add(value);
        return this;
    }

    public JABuilder<T> bool(Boolean value) {
        return this.bool(value, value);
    }

    public JABuilder<T> bool(Boolean value, Boolean defaultValue) {
        return this.bool(value, Objects::nonNull, defaultValue);
    }

    public JABuilder<T> bool(Boolean value, Predicate<Boolean> predicate, Boolean defaultValue) {
        if (!predicate.test(value))
            value = defaultValue;
        this.jsonArray.add(value);
        return this;
    }

    public JABuilder<T> character(Character value) {
        return this.character(value, value);
    }

    public JABuilder<T> character(Character value, Character defaultValue) {
        return this.character(value, Objects::nonNull, defaultValue);
    }

    public JABuilder<T> character(Character value, Predicate<Character> predicate, Character defaultValue) {
        if (!predicate.test(value))
            value = defaultValue;
        this.jsonArray.add(value);
        return this;
    }

    public JABuilder<T> nullValue(String key) {
        this.jsonArray.add(JsonNull.INSTANCE);
        return this;
    }

    public JABuilder<T> primitive(JsonPrimitive value) {
        return this.primitive(value, value);
    }

    public JABuilder<T> primitive(JsonPrimitive value, JsonPrimitive defaultValue) {
        return this.primitive(value, Objects::nonNull, defaultValue);
    }

    public JABuilder<T> primitive(JsonPrimitive value, Predicate<JsonPrimitive> predicate, JsonPrimitive defaultValue) {
        if (!predicate.test(value))
            value = defaultValue;
        this.jsonArray.add(value);
        return this;
    }

    public JABuilder<T> object(JsonObject value) {
        return this.object(value, value);
    }

    public JABuilder<T> object(JsonObject value, JsonObject defaultValue) {
        return this.object(value, Objects::nonNull, defaultValue);
    }

    public JABuilder<T> object(JsonObject value, Predicate<JsonObject> predicate, JsonObject defaultValue) {
        if (!predicate.test(value))
            value = defaultValue;
        this.jsonArray.add(value);
        return this;
    }

    public JOBuilder<JABuilder<T>> object() {
        JOBuilder<JABuilder<T>> builder = new JOBuilder<>(this);
        this.jsonArray.add(builder.build());
        return builder;
    }

    public JABuilder<T> array(JsonArray value) {
        return this.array(value, value);
    }

    public JABuilder<T> array(JsonArray value, JsonArray defaultValue) {
        return this.array(value, Objects::nonNull, defaultValue);
    }

    public JABuilder<T> array(JsonArray value, Predicate<JsonArray> predicate, JsonArray defaultValue) {
        if (!predicate.test(value))
            value = defaultValue;
        this.jsonArray.add(value);
        return this;
    }

    public JABuilder<JABuilder<T>> array() {
        JABuilder<JABuilder<T>> builder = new JABuilder<>(this);
        this.jsonArray.add(builder.build());
        return builder;
    }

    @Override
    public @Nullable T done() {
        return this.returner;
    }

    @Override
    public @NotNull JsonArray build() {
        return this.jsonArray;
    }

}
