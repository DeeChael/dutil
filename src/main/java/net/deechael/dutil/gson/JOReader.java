package net.deechael.dutil.gson;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import net.deechael.dutil.Preconditions;
import org.jetbrains.annotations.NotNull;

import java.util.function.Predicate;

public class JOReader {

    private final JsonObject jsonObject;

    public JOReader(JsonObject object) {
        Preconditions.checkNull(object);
        this.jsonObject = object;
    }

    public String string(String path) {
        Preconditions.checkNull(path);
        if (!jsonObject.has(path))
            throw new JsonParseException("Not exists");
        if (!jsonObject.get(path).isJsonPrimitive())
            throw new JsonParseException("Not exists");
        if (!jsonObject.getAsJsonPrimitive(path).isString())
            throw new JsonParseException("Not exists");
        return jsonObject.get(path).getAsString();
    }

    public Number number(String path) {
        Preconditions.checkNull(path);
        if (!jsonObject.has(path))
            throw new JsonParseException("Not exists");
        if (!jsonObject.get(path).isJsonPrimitive())
            throw new JsonParseException("Not exists");
        if (!jsonObject.getAsJsonPrimitive(path).isNumber())
            throw new JsonParseException("Not exists");
        return jsonObject.get(path).getAsNumber();
    }

    public byte byteNumber(String path) {
        Preconditions.checkNull(path);
        if (!jsonObject.has(path))
            throw new JsonParseException("Not exists");
        if (!jsonObject.get(path).isJsonPrimitive())
            throw new JsonParseException("Not exists");
        if (!jsonObject.getAsJsonPrimitive(path).isNumber())
            throw new JsonParseException("Not exists");
        return jsonObject.get(path).getAsByte();
    }

    public short shortNumber(String path) {
        Preconditions.checkNull(path);
        if (!jsonObject.has(path))
            throw new JsonParseException("Not exists");
        if (!jsonObject.get(path).isJsonPrimitive())
            throw new JsonParseException("Not exists");
        if (!jsonObject.getAsJsonPrimitive(path).isNumber())
            throw new JsonParseException("Not exists");
        return jsonObject.get(path).getAsShort();
    }

    public int intNumber(String path) {
        Preconditions.checkNull(path);
        if (!jsonObject.has(path))
            throw new JsonParseException("Not exists");
        if (!jsonObject.get(path).isJsonPrimitive())
            throw new JsonParseException("Not exists");
        if (!jsonObject.getAsJsonPrimitive(path).isNumber())
            throw new JsonParseException("Not exists");
        return jsonObject.get(path).getAsInt();
    }

    public long longNumber(String path) {
        Preconditions.checkNull(path);
        if (!jsonObject.has(path))
            throw new JsonParseException("Not exists");
        if (!jsonObject.get(path).isJsonPrimitive())
            throw new JsonParseException("Not exists");
        if (!jsonObject.getAsJsonPrimitive(path).isNumber())
            throw new JsonParseException("Not exists");
        return jsonObject.get(path).getAsLong();
    }

    public float floatNumber(String path) {
        Preconditions.checkNull(path);
        if (!jsonObject.has(path))
            throw new JsonParseException("Not exists");
        if (!jsonObject.get(path).isJsonPrimitive())
            throw new JsonParseException("Not exists");
        if (!jsonObject.getAsJsonPrimitive(path).isNumber())
            throw new JsonParseException("Not exists");
        return jsonObject.get(path).getAsFloat();
    }

    public double doubleNumber(String path) {
        Preconditions.checkNull(path);
        if (!jsonObject.has(path))
            throw new JsonParseException("Not exists");
        if (!jsonObject.get(path).isJsonPrimitive())
            throw new JsonParseException("Not exists");
        if (!jsonObject.getAsJsonPrimitive(path).isNumber())
            throw new JsonParseException("Not exists");
        return jsonObject.get(path).getAsDouble();
    }

    public boolean bool(String path) {
        Preconditions.checkNull(path);
        if (!jsonObject.has(path))
            throw new JsonParseException("Not exists");
        if (!jsonObject.get(path).isJsonPrimitive())
            throw new JsonParseException("Not exists");
        if (!jsonObject.getAsJsonPrimitive(path).isBoolean())
            throw new JsonParseException("Not exists");
        return jsonObject.get(path).getAsBoolean();
    }

    public JOReader object(String path) {
        Preconditions.checkNull(path);
        if (!jsonObject.has(path))
            throw new JsonParseException("Not exists");
        if (!jsonObject.get(path).isJsonObject())
            throw new JsonParseException("Not exists");
        return new JOReader(this.jsonObject.getAsJsonObject(path));
    }

    public JAReader array(String path) {
        Preconditions.checkNull(path);
        if (!jsonObject.has(path))
            throw new JsonParseException("Not exists");
        if (!jsonObject.get(path).isJsonArray())
            throw new JsonParseException("Not exists");
        return new JAReader(this.jsonObject.getAsJsonArray(path));
    }

    public String string(String path, Predicate<String> predicate) {
        Preconditions.checkNull(path);
        if (!jsonObject.has(path))
            throw new JsonParseException("Not exists");
        if (!jsonObject.get(path).isJsonPrimitive())
            throw new JsonParseException("Not exists");
        if (!jsonObject.getAsJsonPrimitive(path).isString())
            throw new JsonParseException("Not exists");
        String value = jsonObject.get(path).getAsString();
        if (!predicate.test(value))
            throw new JsonParseException("Not exists");
        return value;
    }

    public Number number(String path, Predicate<Number> predicate) {
        Preconditions.checkNull(path);
        if (!jsonObject.has(path))
            throw new JsonParseException("Not exists");
        if (!jsonObject.get(path).isJsonPrimitive())
            throw new JsonParseException("Not exists");
        if (!jsonObject.getAsJsonPrimitive(path).isNumber())
            throw new JsonParseException("Not exists");
        Number value = jsonObject.get(path).getAsNumber();
        if (!predicate.test(value))
            throw new JsonParseException("Not exists");
        return value;
    }

    public byte byteNumber(String path, Predicate<Byte> predicate) {
        Preconditions.checkNull(path);
        if (!jsonObject.has(path))
            throw new JsonParseException("Not exists");
        if (!jsonObject.get(path).isJsonPrimitive())
            throw new JsonParseException("Not exists");
        if (!jsonObject.getAsJsonPrimitive(path).isNumber())
            throw new JsonParseException("Not exists");
        byte value = jsonObject.get(path).getAsByte();
        if (!predicate.test(value))
            throw new JsonParseException("Not exists");
        return value;
    }

    public short shortNumber(String path, Predicate<Short> predicate) {
        Preconditions.checkNull(path);
        if (!jsonObject.has(path))
            throw new JsonParseException("Not exists");
        if (!jsonObject.get(path).isJsonPrimitive())
            throw new JsonParseException("Not exists");
        if (!jsonObject.getAsJsonPrimitive(path).isNumber())
            throw new JsonParseException("Not exists");
        short value = jsonObject.get(path).getAsShort();
        if (!predicate.test(value))
            throw new JsonParseException("Not exists");
        return value;
    }

    public int intNumber(String path, Predicate<Integer> predicate) {
        Preconditions.checkNull(path);
        if (!jsonObject.has(path))
            throw new JsonParseException("Not exists");
        if (!jsonObject.get(path).isJsonPrimitive())
            throw new JsonParseException("Not exists");
        if (!jsonObject.getAsJsonPrimitive(path).isNumber())
            throw new JsonParseException("Not exists");
        int value = jsonObject.get(path).getAsInt();
        if (!predicate.test(value))
            throw new JsonParseException("Not exists");
        return value;
    }

    public long longNumber(String path, Predicate<Long> predicate) {
        Preconditions.checkNull(path);
        if (!jsonObject.has(path))
            throw new JsonParseException("Not exists");
        if (!jsonObject.get(path).isJsonPrimitive())
            throw new JsonParseException("Not exists");
        if (!jsonObject.getAsJsonPrimitive(path).isNumber())
            throw new JsonParseException("Not exists");
        long value = jsonObject.get(path).getAsLong();
        if (!predicate.test(value))
            throw new JsonParseException("Not exists");
        return value;
    }

    public float floatNumber(String path, Predicate<Float> predicate) {
        Preconditions.checkNull(path);
        if (!jsonObject.has(path))
            throw new JsonParseException("Not exists");
        if (!jsonObject.get(path).isJsonPrimitive())
            throw new JsonParseException("Not exists");
        if (!jsonObject.getAsJsonPrimitive(path).isNumber())
            throw new JsonParseException("Not exists");
        float value = jsonObject.get(path).getAsFloat();
        if (!predicate.test(value))
            throw new JsonParseException("Not exists");
        return value;
    }

    public double doubleNumber(String path, Predicate<Double> predicate) {
        Preconditions.checkNull(path);
        if (!jsonObject.has(path))
            throw new JsonParseException("Not exists");
        if (!jsonObject.get(path).isJsonPrimitive())
            throw new JsonParseException("Not exists");
        if (!jsonObject.getAsJsonPrimitive(path).isNumber())
            throw new JsonParseException("Not exists");
        double value = jsonObject.get(path).getAsDouble();
        if (!predicate.test(value))
            throw new JsonParseException("Not exists");
        return value;
    }

    public boolean bool(String path, Predicate<Boolean> predicate) {
        Preconditions.checkNull(path);
        if (!jsonObject.has(path))
            throw new JsonParseException("Not exists");
        if (!jsonObject.get(path).isJsonPrimitive())
            throw new JsonParseException("Not exists");
        if (!jsonObject.getAsJsonPrimitive(path).isBoolean())
            throw new JsonParseException("Not exists");
        boolean value = jsonObject.get(path).getAsBoolean();
        if (!predicate.test(value))
            throw new JsonParseException("Not exists");
        return value;
    }

    public JOReader object(String path, Predicate<JOReader> predicate) {
        Preconditions.checkNull(path);
        if (!jsonObject.has(path))
            throw new JsonParseException("Not exists");
        if (!jsonObject.get(path).isJsonObject())
            throw new JsonParseException("Not exists");
        JOReader value = new JOReader(this.jsonObject.getAsJsonObject(path));
        if (!predicate.test(value))
            throw new JsonParseException("Not exists");
        return value;
    }

    public JAReader array(String path, Predicate<JAReader> predicate) {
        Preconditions.checkNull(path);
        if (!jsonObject.has(path))
            throw new JsonParseException("Not exists");
        if (!jsonObject.get(path).isJsonArray())
            throw new JsonParseException("Not exists");
        JAReader value = new JAReader(this.jsonObject.getAsJsonArray(path));
        if (!predicate.test(value))
            throw new JsonParseException("Not exists");
        return value;
    }

    public String string(String path, @NotNull String defaultValue) {
        Preconditions.checkNull(path);
        Preconditions.checkNull(defaultValue);
        if (!jsonObject.has(path))
            return defaultValue;
        if (!jsonObject.get(path).isJsonPrimitive())
            return defaultValue;
        if (!jsonObject.getAsJsonPrimitive(path).isString())
            return defaultValue;
        return jsonObject.get(path).getAsString();
    }

    public Number number(String path, @NotNull Number defaultValue) {
        Preconditions.checkNull(path);
        Preconditions.checkNull(defaultValue);
        if (!jsonObject.has(path))
            return defaultValue;
        if (!jsonObject.get(path).isJsonPrimitive())
            return defaultValue;
        if (!jsonObject.getAsJsonPrimitive(path).isNumber())
            return defaultValue;
        return jsonObject.get(path).getAsNumber();
    }

    public byte byteNumber(String path, byte defaultValue) {
        Preconditions.checkNull(path);
        if (!jsonObject.has(path))
            return defaultValue;
        if (!jsonObject.get(path).isJsonPrimitive())
            return defaultValue;
        if (!jsonObject.getAsJsonPrimitive(path).isNumber())
            return defaultValue;
        return jsonObject.get(path).getAsByte();
    }

    public short shortNumber(String path, short defaultValue) {
        Preconditions.checkNull(path);
        if (!jsonObject.has(path))
            return defaultValue;
        if (!jsonObject.get(path).isJsonPrimitive())
            return defaultValue;
        if (!jsonObject.getAsJsonPrimitive(path).isNumber())
            return defaultValue;
        return jsonObject.get(path).getAsShort();
    }

    public int intNumber(String path, int defaultValue) {
        Preconditions.checkNull(path);
        if (!jsonObject.has(path))
            return defaultValue;
        if (!jsonObject.get(path).isJsonPrimitive())
            return defaultValue;
        if (!jsonObject.getAsJsonPrimitive(path).isNumber())
            return defaultValue;
        return jsonObject.get(path).getAsInt();
    }

    public long longNumber(String path, long defaultValue) {
        Preconditions.checkNull(path);
        if (!jsonObject.has(path))
            return defaultValue;
        if (!jsonObject.get(path).isJsonPrimitive())
            return defaultValue;
        if (!jsonObject.getAsJsonPrimitive(path).isNumber())
            return defaultValue;
        return jsonObject.get(path).getAsLong();
    }

    public float floatNumber(String path, float defaultValue) {
        Preconditions.checkNull(path);
        if (!jsonObject.has(path))
            return defaultValue;
        if (!jsonObject.get(path).isJsonPrimitive())
            return defaultValue;
        if (!jsonObject.getAsJsonPrimitive(path).isNumber())
            return defaultValue;
        return jsonObject.get(path).getAsFloat();
    }

    public double doubleNumber(String path, double defaultValue) {
        Preconditions.checkNull(path);
        if (!jsonObject.has(path))
            return defaultValue;
        if (!jsonObject.get(path).isJsonPrimitive())
            return defaultValue;
        if (!jsonObject.getAsJsonPrimitive(path).isNumber())
            return defaultValue;
        return jsonObject.get(path).getAsDouble();
    }

    public boolean bool(String path, boolean defaultValue) {
        Preconditions.checkNull(path);
        if (!jsonObject.has(path))
            return defaultValue;
        if (!jsonObject.get(path).isJsonPrimitive())
            return defaultValue;
        if (!jsonObject.getAsJsonPrimitive(path).isBoolean())
            return defaultValue;
        return jsonObject.get(path).getAsBoolean();
    }

    public JOReader object(String path, @NotNull JsonObject defaultValue) {
        Preconditions.checkNull(path);
        Preconditions.checkNull(defaultValue);
        if (!jsonObject.has(path))
            return new JOReader(defaultValue);
        if (!jsonObject.get(path).isJsonObject())
            return new JOReader(defaultValue);
        return new JOReader(this.jsonObject.getAsJsonObject(path));
    }

    public JAReader array(String path, @NotNull JsonArray defaultValue) {
        Preconditions.checkNull(path);
        Preconditions.checkNull(defaultValue);
        if (!jsonObject.has(path))
            return new JAReader(defaultValue);
        if (!jsonObject.get(path).isJsonArray())
            return new JAReader(defaultValue);
        return new JAReader(this.jsonObject.getAsJsonArray(path));
    }

    public String string(String path, Predicate<String> predicate, @NotNull String defaultValue) {
        Preconditions.checkNull(path);
        Preconditions.checkNull(defaultValue);
        if (!jsonObject.has(path))
            return defaultValue;
        if (!jsonObject.get(path).isJsonPrimitive())
            return defaultValue;
        if (!jsonObject.getAsJsonPrimitive(path).isString())
            return defaultValue;
        String value = jsonObject.get(path).getAsString();
        if (!predicate.test(value))
            return defaultValue;
        return value;
    }

    public Number number(String path, Predicate<Number> predicate, @NotNull Number defaultValue) {
        Preconditions.checkNull(path);
        Preconditions.checkNull(defaultValue);
        if (!jsonObject.has(path))
            return defaultValue;
        if (!jsonObject.get(path).isJsonPrimitive())
            return defaultValue;
        if (!jsonObject.getAsJsonPrimitive(path).isNumber())
            return defaultValue;
        Number value = jsonObject.get(path).getAsNumber();
        if (!predicate.test(value))
            return defaultValue;
        return value;
    }

    public byte byteNumber(String path, Predicate<Byte> predicate, byte defaultValue) {
        Preconditions.checkNull(path);
        if (!jsonObject.has(path))
            return defaultValue;
        if (!jsonObject.get(path).isJsonPrimitive())
            return defaultValue;
        if (!jsonObject.getAsJsonPrimitive(path).isNumber())
            return defaultValue;
        byte value = jsonObject.get(path).getAsByte();
        if (!predicate.test(value))
            return defaultValue;
        return value;
    }

    public short shortNumber(String path, Predicate<Short> predicate, short defaultValue) {
        Preconditions.checkNull(path);
        if (!jsonObject.has(path))
            return defaultValue;
        if (!jsonObject.get(path).isJsonPrimitive())
            return defaultValue;
        if (!jsonObject.getAsJsonPrimitive(path).isNumber())
            return defaultValue;
        short value = jsonObject.get(path).getAsShort();
        if (!predicate.test(value))
            return defaultValue;
        return value;
    }

    public int intNumber(String path, Predicate<Integer> predicate, int defaultValue) {
        Preconditions.checkNull(path);
        if (!jsonObject.has(path))
            return defaultValue;
        if (!jsonObject.get(path).isJsonPrimitive())
            return defaultValue;
        if (!jsonObject.getAsJsonPrimitive(path).isNumber())
            return defaultValue;
        int value = jsonObject.get(path).getAsInt();
        if (!predicate.test(value))
            return defaultValue;
        return value;
    }

    public long longNumber(String path, Predicate<Long> predicate, long defaultValue) {
        Preconditions.checkNull(path);
        if (!jsonObject.has(path))
            return defaultValue;
        if (!jsonObject.get(path).isJsonPrimitive())
            return defaultValue;
        if (!jsonObject.getAsJsonPrimitive(path).isNumber())
            return defaultValue;
        long value = jsonObject.get(path).getAsLong();
        if (!predicate.test(value))
            return defaultValue;
        return value;
    }

    public float floatNumber(String path, Predicate<Float> predicate, float defaultValue) {
        Preconditions.checkNull(path);
        if (!jsonObject.has(path))
            return defaultValue;
        if (!jsonObject.get(path).isJsonPrimitive())
            return defaultValue;
        if (!jsonObject.getAsJsonPrimitive(path).isNumber())
            return defaultValue;
        float value = jsonObject.get(path).getAsFloat();
        if (!predicate.test(value))
            return defaultValue;
        return value;
    }

    public double doubleNumber(String path, Predicate<Double> predicate, double defaultValue) {
        Preconditions.checkNull(path);
        if (!jsonObject.has(path))
            return defaultValue;
        if (!jsonObject.get(path).isJsonPrimitive())
            return defaultValue;
        if (!jsonObject.getAsJsonPrimitive(path).isNumber())
            return defaultValue;
        double value = jsonObject.get(path).getAsDouble();
        if (!predicate.test(value))
            return defaultValue;
        return value;
    }

    public boolean bool(String path, Predicate<Boolean> predicate, boolean defaultValue) {
        Preconditions.checkNull(path);
        if (!jsonObject.has(path))
            return defaultValue;
        if (!jsonObject.get(path).isJsonPrimitive())
            return defaultValue;
        if (!jsonObject.getAsJsonPrimitive(path).isBoolean())
            return defaultValue;
        boolean value = jsonObject.get(path).getAsBoolean();
        if (!predicate.test(value))
            return defaultValue;
        return value;
    }

    public JOReader object(String path, Predicate<JOReader> predicate, @NotNull JsonObject defaultValue) {
        Preconditions.checkNull(path);
        Preconditions.checkNull(defaultValue);
        if (!jsonObject.has(path))
            return new JOReader(defaultValue);
        if (!jsonObject.get(path).isJsonObject())
            return new JOReader(defaultValue);
        JOReader value = new JOReader(this.jsonObject.getAsJsonObject(path));
        if (!predicate.test(value))
            return new JOReader(defaultValue);
        return value;
    }

    public JAReader array(String path, Predicate<JAReader> predicate, @NotNull JsonArray defaultValue) {
        Preconditions.checkNull(path);
        Preconditions.checkNull(defaultValue);
        if (!jsonObject.has(path))
            return new JAReader(defaultValue);
        if (!jsonObject.get(path).isJsonArray())
            return new JAReader(defaultValue);
        JAReader value = new JAReader(this.jsonObject.getAsJsonArray(path));
        if (!predicate.test(value))
            return new JAReader(defaultValue);
        return value;
    }

    @NotNull
    public JsonObject original() {
        return this.jsonObject;
    }

}
