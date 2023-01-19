package net.deechael.dutil.gson;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import net.deechael.dutil.Preconditions;
import org.jetbrains.annotations.NotNull;

import java.util.function.Predicate;

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
            throw new JsonParseException("Out of bound");
        JsonElement element = jsonArray.get(index);
        if (!element.isJsonPrimitive())
            throw new JsonParseException("Not exists");
        if (!element.getAsJsonPrimitive().isString())
            throw new JsonParseException("Not exists");
        return element.getAsString();
    }

    public Number number(int index) {
        if (!in(index))
            throw new JsonParseException("Out of bound");
        JsonElement element = jsonArray.get(index);
        if (!element.isJsonPrimitive())
            throw new JsonParseException("Not exists");
        if (!element.getAsJsonPrimitive().isNumber())
            throw new JsonParseException("Not exists");
        return element.getAsNumber();
    }

    public byte byteNumber(int index) {
        if (!in(index))
            throw new JsonParseException("Out of bound");
        JsonElement element = jsonArray.get(index);
        if (!element.isJsonPrimitive())
            throw new JsonParseException("Not exists");
        if (!element.getAsJsonPrimitive().isNumber())
            throw new JsonParseException("Not exists");
        return element.getAsByte();
    }

    public short shortNumber(int index) {
        if (!in(index))
            throw new JsonParseException("Out of bound");
        JsonElement element = jsonArray.get(index);
        if (!element.isJsonPrimitive())
            throw new JsonParseException("Not exists");
        if (!element.getAsJsonPrimitive().isNumber())
            throw new JsonParseException("Not exists");
        return element.getAsShort();
    }

    public int intNumber(int index) {
        if (!in(index))
            throw new JsonParseException("Out of bound");
        JsonElement element = jsonArray.get(index);
        if (!element.isJsonPrimitive())
            throw new JsonParseException("Not exists");
        if (!element.getAsJsonPrimitive().isNumber())
            throw new JsonParseException("Not exists");
        return element.getAsInt();
    }

    public long longNumber(int index) {
        if (!in(index))
            throw new JsonParseException("Out of bound");
        JsonElement element = jsonArray.get(index);
        if (!element.isJsonPrimitive())
            throw new JsonParseException("Not exists");
        if (!element.getAsJsonPrimitive().isNumber())
            throw new JsonParseException("Not exists");
        return element.getAsLong();
    }

    public float floatNumber(int index) {
        if (!in(index))
            throw new JsonParseException("Out of bound");
        JsonElement element = jsonArray.get(index);
        if (!element.isJsonPrimitive())
            throw new JsonParseException("Not exists");
        if (!element.getAsJsonPrimitive().isNumber())
            throw new JsonParseException("Not exists");
        return element.getAsFloat();
    }

    public double doubleNumber(int index) {
        if (!in(index))
            throw new JsonParseException("Out of bound");
        JsonElement element = jsonArray.get(index);
        if (!element.isJsonPrimitive())
            throw new JsonParseException("Not exists");
        if (!element.getAsJsonPrimitive().isNumber())
            throw new JsonParseException("Not exists");
        return element.getAsDouble();
    }

    public boolean bool(int index) {
        if (!in(index))
            throw new JsonParseException("Out of bound");
        JsonElement element = jsonArray.get(index);
        if (!element.isJsonPrimitive())
            throw new JsonParseException("Not exists");
        if (!element.getAsJsonPrimitive().isBoolean())
            throw new JsonParseException("Not exists");
        return element.getAsBoolean();
    }

    public JOReader object(int index) {
        if (!in(index))
            throw new JsonParseException("Out of bound");
        JsonElement element = jsonArray.get(index);
        if (!element.isJsonObject())
            throw new JsonParseException("Not exists");
        return new JOReader(element.getAsJsonObject());
    }

    public JAReader array(int index) {
        if (!in(index))
            throw new JsonParseException("Out of bound");
        JsonElement element = jsonArray.get(index);
        if (!element.isJsonArray())
            throw new JsonParseException("Not exists");
        return new JAReader(element.getAsJsonArray());
    }

    public String string(int index, Predicate<String> predicate) {
        if (!in(index))
            throw new JsonParseException("Out of bound");
        JsonElement element = jsonArray.get(index);
        if (!element.isJsonPrimitive())
            throw new JsonParseException("Not exists");
        if (!element.getAsJsonPrimitive().isString())
            throw new JsonParseException("Not exists");
        String value = element.getAsString();
        if (!predicate.test(value))
            throw new JsonParseException("Not exists");
        return value;
    }

    public Number number(int index, Predicate<Number> predicate) {
        if (!in(index))
            throw new JsonParseException("Out of bound");
        JsonElement element = jsonArray.get(index);
        if (!element.isJsonPrimitive())
            throw new JsonParseException("Not exists");
        if (!element.getAsJsonPrimitive().isNumber())
            throw new JsonParseException("Not exists");
        Number value = element.getAsNumber();
        if (!predicate.test(value))
            throw new JsonParseException("Not exists");
        return value;
    }

    public byte byteNumber(int index, Predicate<Byte> predicate) {
        if (!in(index))
            throw new JsonParseException("Out of bound");
        JsonElement element = jsonArray.get(index);
        if (!element.isJsonPrimitive())
            throw new JsonParseException("Not exists");
        if (!element.getAsJsonPrimitive().isNumber())
            throw new JsonParseException("Not exists");
        byte value = element.getAsByte();
        if (!predicate.test(value))
            throw new JsonParseException("Not exists");
        return value;
    }

    public short shortNumber(int index, Predicate<Short> predicate) {
        if (!in(index))
            throw new JsonParseException("Out of bound");
        JsonElement element = jsonArray.get(index);
        if (!element.isJsonPrimitive())
            throw new JsonParseException("Not exists");
        if (!element.getAsJsonPrimitive().isNumber())
            throw new JsonParseException("Not exists");
        short value = element.getAsShort();
        if (!predicate.test(value))
            throw new JsonParseException("Not exists");
        return value;
    }

    public int intNumber(int index, Predicate<Integer> predicate) {
        if (!in(index))
            throw new JsonParseException("Out of bound");
        JsonElement element = jsonArray.get(index);
        if (!element.isJsonPrimitive())
            throw new JsonParseException("Not exists");
        if (!element.getAsJsonPrimitive().isNumber())
            throw new JsonParseException("Not exists");
        int value = element.getAsInt();
        if (!predicate.test(value))
            throw new JsonParseException("Not exists");
        return value;
    }

    public long longNumber(int index, Predicate<Long> predicate) {
        if (!in(index))
            throw new JsonParseException("Out of bound");
        JsonElement element = jsonArray.get(index);
        if (!element.isJsonPrimitive())
            throw new JsonParseException("Not exists");
        if (!element.getAsJsonPrimitive().isNumber())
            throw new JsonParseException("Not exists");
        long value = element.getAsLong();
        if (!predicate.test(value))
            throw new JsonParseException("Not exists");
        return value;
    }

    public float floatNumber(int index, Predicate<Float> predicate) {
        if (!in(index))
            throw new JsonParseException("Out of bound");
        JsonElement element = jsonArray.get(index);
        if (!element.isJsonPrimitive())
            throw new JsonParseException("Not exists");
        if (!element.getAsJsonPrimitive().isNumber())
            throw new JsonParseException("Not exists");
        float value = element.getAsFloat();
        if (!predicate.test(value))
            throw new JsonParseException("Not exists");
        return value;
    }

    public double doubleNumber(int index, Predicate<Double> predicate) {
        if (!in(index))
            throw new JsonParseException("Out of bound");
        JsonElement element = jsonArray.get(index);
        if (!element.isJsonPrimitive())
            throw new JsonParseException("Not exists");
        if (!element.getAsJsonPrimitive().isNumber())
            throw new JsonParseException("Not exists");
        double value = element.getAsDouble();
        if (!predicate.test(value))
            throw new JsonParseException("Not exists");
        return value;
    }

    public boolean bool(int index, Predicate<Boolean> predicate) {
        if (!in(index))
            throw new JsonParseException("Out of bound");
        JsonElement element = jsonArray.get(index);
        if (!element.isJsonPrimitive())
            throw new JsonParseException("Not exists");
        if (!element.getAsJsonPrimitive().isBoolean())
            throw new JsonParseException("Not exists");
        boolean value = element.getAsBoolean();
        if (!predicate.test(value))
            throw new JsonParseException("Not exists");
        return value;
    }

    public JOReader object(int index, Predicate<JOReader> predicate) {
        if (!in(index))
            throw new JsonParseException("Out of bound");
        JsonElement element = jsonArray.get(index);
        if (!element.isJsonObject())
            throw new JsonParseException("Not exists");
        JOReader value = new JOReader(element.getAsJsonObject());
        if (!predicate.test(value))
            throw new JsonParseException("Not exists");
        return value;
    }

    public JAReader array(int index, Predicate<JAReader> predicate) {
        if (!in(index))
            throw new JsonParseException("Out of bound");
        JsonElement element = jsonArray.get(index);
        if (!element.isJsonArray())
            throw new JsonParseException("Not exists");
        JAReader value = new JAReader(element.getAsJsonArray());
        if (!predicate.test(value))
            throw new JsonParseException("Not exists");
        return value;
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

    public String string(int index, Predicate<String> predicate, @NotNull String defaultValue) {
        Preconditions.checkNull(defaultValue);
        if (!in(index))
            return defaultValue;
        JsonElement element = jsonArray.get(index);
        if (!element.isJsonPrimitive())
            return defaultValue;
        if (!element.getAsJsonPrimitive().isString())
            return defaultValue;
        String value = element.getAsString();
        if (!predicate.test(value))
            return defaultValue;
        return value;
    }

    public Number number(int index, Predicate<Number> predicate, @NotNull Number defaultValue) {
        Preconditions.checkNull(defaultValue);
        if (!in(index))
            return defaultValue;
        JsonElement element = jsonArray.get(index);
        if (!element.isJsonPrimitive())
            return defaultValue;
        if (!element.getAsJsonPrimitive().isNumber())
            return defaultValue;
        Number value = element.getAsNumber();
        if (!predicate.test(value))
            return defaultValue;
        return value;
    }

    public byte byteNumber(int index, Predicate<Byte> predicate, byte defaultValue) {
        if (!in(index))
            return defaultValue;
        JsonElement element = jsonArray.get(index);
        if (!element.isJsonPrimitive())
            return defaultValue;
        if (!element.getAsJsonPrimitive().isNumber())
            return defaultValue;
        byte value = element.getAsByte();
        if (!predicate.test(value))
            return defaultValue;
        return value;
    }

    public short shortNumber(int index, Predicate<Short> predicate, short defaultValue) {
        if (!in(index))
            return defaultValue;
        JsonElement element = jsonArray.get(index);
        if (!element.isJsonPrimitive())
            return defaultValue;
        if (!element.getAsJsonPrimitive().isNumber())
            return defaultValue;
        short value = element.getAsShort();
        if (!predicate.test(value))
            return defaultValue;
        return value;
    }

    public int intNumber(int index, Predicate<Integer> predicate, int defaultValue) {
        if (!in(index))
            return defaultValue;
        JsonElement element = jsonArray.get(index);
        if (!element.isJsonPrimitive())
            return defaultValue;
        if (!element.getAsJsonPrimitive().isNumber())
            return defaultValue;
        int value = element.getAsInt();
        if (!predicate.test(value))
            return defaultValue;
        return value;
    }

    public long longNumber(int index, Predicate<Long> predicate, long defaultValue) {
        if (!in(index))
            return defaultValue;
        JsonElement element = jsonArray.get(index);
        if (!element.isJsonPrimitive())
            return defaultValue;
        if (!element.getAsJsonPrimitive().isNumber())
            return defaultValue;
        long value = element.getAsLong();
        if (!predicate.test(value))
            return defaultValue;
        return value;
    }

    public float floatNumber(int index, Predicate<Float> predicate, float defaultValue) {
        if (!in(index))
            return defaultValue;
        JsonElement element = jsonArray.get(index);
        if (!element.isJsonPrimitive())
            return defaultValue;
        if (!element.getAsJsonPrimitive().isNumber())
            return defaultValue;
        float value = element.getAsFloat();
        if (!predicate.test(value))
            return defaultValue;
        return value;
    }

    public double doubleNumber(int index, Predicate<Double> predicate, double defaultValue) {
        if (!in(index))
            return defaultValue;
        JsonElement element = jsonArray.get(index);
        if (!element.isJsonPrimitive())
            return defaultValue;
        if (!element.getAsJsonPrimitive().isNumber())
            return defaultValue;
        double value = element.getAsDouble();
        if (!predicate.test(value))
            return defaultValue;
        return value;
    }

    public boolean bool(int index, Predicate<Boolean> predicate, boolean defaultValue) {
        if (!in(index))
            return defaultValue;
        JsonElement element = jsonArray.get(index);
        if (!element.isJsonPrimitive())
            return defaultValue;
        if (!element.getAsJsonPrimitive().isBoolean())
            return defaultValue;
        boolean value = element.getAsBoolean();
        if (!predicate.test(value))
            return defaultValue;
        return value;
    }

    public JOReader object(int index, Predicate<JOReader> predicate, @NotNull JsonObject defaultValue) {
        Preconditions.checkNull(defaultValue);
        if (!in(index))
            return new JOReader(defaultValue);
        JsonElement element = jsonArray.get(index);
        if (!element.isJsonObject())
            return new JOReader(defaultValue);
        JOReader value = new JOReader(element.getAsJsonObject());
        if (!predicate.test(value))
            return new JOReader(defaultValue);
        return value;
    }

    public JAReader array(int index, Predicate<JAReader> predicate, @NotNull JsonArray defaultValue) {
        Preconditions.checkNull(defaultValue);
        if (!in(index))
            return new JAReader(defaultValue);
        JsonElement element = jsonArray.get(index);
        if (!element.isJsonArray())
            return new JAReader(defaultValue);
        JAReader value = new JAReader(element.getAsJsonArray());
        if (!predicate.test(value))
            return new JAReader(defaultValue);
        return value;
    }

    @NotNull
    public JsonArray original() {
        return this.jsonArray;
    }

}
