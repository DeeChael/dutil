package net.deechael.dutil.gson;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import net.deechael.dutil.Preconditions;
import org.jetbrains.annotations.NotNull;

public class JAReader {

    private final JsonArray jsonArray;

    public JAReader(JsonArray array) {
        Preconditions.checkNull(array);
        this.jsonArray = array;
    }

    private boolean in(int index) {
        return index >= 0 && index < jsonArray.size();
    }

    public String string(int index) {
        if (!in(index))
            throw new RuntimeException("Out of bound");
        JsonElement element = jsonArray.get(index);
        if (!element.isJsonPrimitive())
            throw new RuntimeException("Not exists");
        if (!element.getAsJsonPrimitive().isString())
            throw new RuntimeException("Not exists");
        return element.getAsString();
    }

    public Number number(int index) {
        if (!in(index))
            throw new RuntimeException("Out of bound");
        JsonElement element = jsonArray.get(index);
        if (!element.isJsonPrimitive())
            throw new RuntimeException("Not exists");
        if (!element.getAsJsonPrimitive().isNumber())
            throw new RuntimeException("Not exists");
        return element.getAsNumber();
    }

    public byte byteNumber(int index) {
        if (!in(index))
            throw new RuntimeException("Out of bound");
        JsonElement element = jsonArray.get(index);
        if (!element.isJsonPrimitive())
            throw new RuntimeException("Not exists");
        if (!element.getAsJsonPrimitive().isNumber())
            throw new RuntimeException("Not exists");
        return element.getAsByte();
    }

    public short shortNumber(int index) {
        if (!in(index))
            throw new RuntimeException("Out of bound");
        JsonElement element = jsonArray.get(index);
        if (!element.isJsonPrimitive())
            throw new RuntimeException("Not exists");
        if (!element.getAsJsonPrimitive().isNumber())
            throw new RuntimeException("Not exists");
        return element.getAsShort();
    }

    public int intNumber(int index) {
        if (!in(index))
            throw new RuntimeException("Out of bound");
        JsonElement element = jsonArray.get(index);
        if (!element.isJsonPrimitive())
            throw new RuntimeException("Not exists");
        if (!element.getAsJsonPrimitive().isNumber())
            throw new RuntimeException("Not exists");
        return element.getAsInt();
    }

    public long longNumber(int index) {
        if (!in(index))
            throw new RuntimeException("Out of bound");
        JsonElement element = jsonArray.get(index);
        if (!element.isJsonPrimitive())
            throw new RuntimeException("Not exists");
        if (!element.getAsJsonPrimitive().isNumber())
            throw new RuntimeException("Not exists");
        return element.getAsLong();
    }

    public float floatNumber(int index) {
        if (!in(index))
            throw new RuntimeException("Out of bound");
        JsonElement element = jsonArray.get(index);
        if (!element.isJsonPrimitive())
            throw new RuntimeException("Not exists");
        if (!element.getAsJsonPrimitive().isNumber())
            throw new RuntimeException("Not exists");
        return element.getAsFloat();
    }

    public double doubleNumber(int index) {
        if (!in(index))
            throw new RuntimeException("Out of bound");
        JsonElement element = jsonArray.get(index);
        if (!element.isJsonPrimitive())
            throw new RuntimeException("Not exists");
        if (!element.getAsJsonPrimitive().isNumber())
            throw new RuntimeException("Not exists");
        return element.getAsDouble();
    }

    public boolean bool(int index) {
        if (!in(index))
            throw new RuntimeException("Out of bound");
        JsonElement element = jsonArray.get(index);
        if (!element.isJsonPrimitive())
            throw new RuntimeException("Not exists");
        if (!element.getAsJsonPrimitive().isBoolean())
            throw new RuntimeException("Not exists");
        return element.getAsBoolean();
    }

    public JOReader object(int index) {
        if (!in(index))
            throw new RuntimeException("Out of bound");
        JsonElement element = jsonArray.get(index);
        if (!element.isJsonObject())
            throw new RuntimeException("Not exists");
        return new JOReader(element.getAsJsonObject());
    }

    public JAReader array(int index) {
        if (!in(index))
            throw new RuntimeException("Out of bound");
        JsonElement element = jsonArray.get(index);
        if (!element.isJsonArray())
            throw new RuntimeException("Not exists");
        return new JAReader(element.getAsJsonArray());
    }

    public String string(int index, @NotNull String defaultValue) {
        Preconditions.checkNull(defaultValue);
        if (!in(index))
            return defaultValue;
        JsonElement element = jsonArray.get(index);
        if (!element.isJsonPrimitive())
            return defaultValue;
        if (!element.getAsJsonPrimitive().isString())
            return defaultValue;
        return element.getAsString();
    }

    public Number number(int index, @NotNull Number defaultValue) {
        Preconditions.checkNull(defaultValue);
        if (!in(index))
            return defaultValue;
        JsonElement element = jsonArray.get(index);
        if (!element.isJsonPrimitive())
            return defaultValue;
        if (!element.getAsJsonPrimitive().isNumber())
            return defaultValue;
        return element.getAsNumber();
    }

    public byte byteNumber(int index, byte defaultValue) {
        if (!in(index))
            return defaultValue;
        JsonElement element = jsonArray.get(index);
        if (!element.isJsonPrimitive())
            return defaultValue;
        if (!element.getAsJsonPrimitive().isNumber())
            return defaultValue;
        return element.getAsByte();
    }

    public short shortNumber(int index, short defaultValue) {
        if (!in(index))
            return defaultValue;
        JsonElement element = jsonArray.get(index);
        if (!element.isJsonPrimitive())
            return defaultValue;
        if (!element.getAsJsonPrimitive().isNumber())
            return defaultValue;
        return element.getAsShort();
    }

    public int intNumber(int index, int defaultValue) {
        if (!in(index))
            return defaultValue;
        JsonElement element = jsonArray.get(index);
        if (!element.isJsonPrimitive())
            return defaultValue;
        if (!element.getAsJsonPrimitive().isNumber())
            return defaultValue;
        return element.getAsInt();
    }

    public long longNumber(int index, long defaultValue) {
        if (!in(index))
            return defaultValue;
        JsonElement element = jsonArray.get(index);
        if (!element.isJsonPrimitive())
            return defaultValue;
        if (!element.getAsJsonPrimitive().isNumber())
            return defaultValue;
        return element.getAsLong();
    }

    public float floatNumber(int index, float defaultValue) {
        if (!in(index))
            return defaultValue;
        JsonElement element = jsonArray.get(index);
        if (!element.isJsonPrimitive())
            return defaultValue;
        if (!element.getAsJsonPrimitive().isNumber())
            return defaultValue;
        return element.getAsFloat();
    }

    public double doubleNumber(int index, double defaultValue) {
        if (!in(index))
            return defaultValue;
        JsonElement element = jsonArray.get(index);
        if (!element.isJsonPrimitive())
            return defaultValue;
        if (!element.getAsJsonPrimitive().isNumber())
            return defaultValue;
        return element.getAsDouble();
    }

    public boolean bool(int index, boolean defaultValue) {
        if (!in(index))
            return defaultValue;
        JsonElement element = jsonArray.get(index);
        if (!element.isJsonPrimitive())
            return defaultValue;
        if (!element.getAsJsonPrimitive().isBoolean())
            return defaultValue;
        return element.getAsBoolean();
    }

    public JOReader object(int index, @NotNull JsonObject defaultValue) {
        Preconditions.checkNull(defaultValue);
        if (!in(index))
            return new JOReader(defaultValue);
        JsonElement element = jsonArray.get(index);
        if (!element.isJsonObject())
            return new JOReader(defaultValue);
        return new JOReader(element.getAsJsonObject());
    }

    public JAReader array(int index, @NotNull JsonArray defaultValue) {
        Preconditions.checkNull(defaultValue);
        if (!in(index))
            return new JAReader(defaultValue);
        JsonElement element = jsonArray.get(index);
        if (!element.isJsonArray())
            return new JAReader(defaultValue);
        return new JAReader(element.getAsJsonArray());
    }

    @NotNull
    public JsonArray original() {
        return this.jsonArray;
    }

}
