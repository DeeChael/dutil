package net.deechael.dutil.gson;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import net.deechael.dutil.Preconditions;
import org.jetbrains.annotations.NotNull;

public class JOReader {

    private final JsonObject jsonObject;

    public JOReader(JsonObject object) {
        Preconditions.checkNull(object);
        this.jsonObject = object;
    }

    public String string(String path) {
        Preconditions.checkNull(path);
        if (!jsonObject.has(path))
            throw new RuntimeException("Not exists");
        if (!jsonObject.get(path).isJsonPrimitive())
            throw new RuntimeException("Not exists");
        if (!jsonObject.getAsJsonPrimitive(path).isString())
            throw new RuntimeException("Not exists");
        return jsonObject.get(path).getAsString();
    }

    public Number number(String path) {
        Preconditions.checkNull(path);
        if (!jsonObject.has(path))
            throw new RuntimeException("Not exists");
        if (!jsonObject.get(path).isJsonPrimitive())
            throw new RuntimeException("Not exists");
        if (!jsonObject.getAsJsonPrimitive(path).isNumber())
            throw new RuntimeException("Not exists");
        return jsonObject.get(path).getAsNumber();
    }

    public short byteNumber(String path) {
        Preconditions.checkNull(path);
        if (!jsonObject.has(path))
            throw new RuntimeException("Not exists");
        if (!jsonObject.get(path).isJsonPrimitive())
            throw new RuntimeException("Not exists");
        if (!jsonObject.getAsJsonPrimitive(path).isNumber())
            throw new RuntimeException("Not exists");
        return jsonObject.get(path).getAsByte();
    }

    public short shortNumber(String path) {
        Preconditions.checkNull(path);
        if (!jsonObject.has(path))
            throw new RuntimeException("Not exists");
        if (!jsonObject.get(path).isJsonPrimitive())
            throw new RuntimeException("Not exists");
        if (!jsonObject.getAsJsonPrimitive(path).isNumber())
            throw new RuntimeException("Not exists");
        return jsonObject.get(path).getAsShort();
    }

    public int intNumber(String path) {
        Preconditions.checkNull(path);
        if (!jsonObject.has(path))
            throw new RuntimeException("Not exists");
        if (!jsonObject.get(path).isJsonPrimitive())
            throw new RuntimeException("Not exists");
        if (!jsonObject.getAsJsonPrimitive(path).isNumber())
            throw new RuntimeException("Not exists");
        return jsonObject.get(path).getAsInt();
    }

    public long longNumber(String path) {
        Preconditions.checkNull(path);
        if (!jsonObject.has(path))
            throw new RuntimeException("Not exists");
        if (!jsonObject.get(path).isJsonPrimitive())
            throw new RuntimeException("Not exists");
        if (!jsonObject.getAsJsonPrimitive(path).isNumber())
            throw new RuntimeException("Not exists");
        return jsonObject.get(path).getAsLong();
    }

    public float floatNumber(String path) {
        Preconditions.checkNull(path);
        if (!jsonObject.has(path))
            throw new RuntimeException("Not exists");
        if (!jsonObject.get(path).isJsonPrimitive())
            throw new RuntimeException("Not exists");
        if (!jsonObject.getAsJsonPrimitive(path).isNumber())
            throw new RuntimeException("Not exists");
        return jsonObject.get(path).getAsFloat();
    }

    public double doubleNumber(String path) {
        Preconditions.checkNull(path);
        if (!jsonObject.has(path))
            throw new RuntimeException("Not exists");
        if (!jsonObject.get(path).isJsonPrimitive())
            throw new RuntimeException("Not exists");
        if (!jsonObject.getAsJsonPrimitive(path).isNumber())
            throw new RuntimeException("Not exists");
        return jsonObject.get(path).getAsDouble();
    }

    public boolean bool(String path) {
        Preconditions.checkNull(path);
        if (!jsonObject.has(path))
            throw new RuntimeException("Not exists");
        if (!jsonObject.get(path).isJsonPrimitive())
            throw new RuntimeException("Not exists");
        if (!jsonObject.getAsJsonPrimitive(path).isBoolean())
            throw new RuntimeException("Not exists");
        return jsonObject.get(path).getAsBoolean();
    }

    public JOReader object(String path) {
        Preconditions.checkNull(path);
        if (!jsonObject.has(path))
            throw new RuntimeException("Not exists");
        if (!jsonObject.get(path).isJsonObject())
            throw new RuntimeException("Not exists");
        return new JOReader(this.jsonObject.getAsJsonObject(path));
    }

    public JAReader array(String path) {
        Preconditions.checkNull(path);
        if (!jsonObject.has(path))
            throw new RuntimeException("Not exists");
        if (!jsonObject.get(path).isJsonArray())
            throw new RuntimeException("Not exists");
        return new JAReader(this.jsonObject.getAsJsonArray(path));
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

    public short byteNumber(String path, short defaultValue) {
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

    @NotNull
    public JsonObject original() {
        return this.jsonObject;
    }

}
