package net.deechael.dutil.gson;

import com.google.gson.JsonObject;

public class JOReader {

    private final JsonObject jsonObject;

    public JOReader(JsonObject object) {
        this.jsonObject = object;
    }

    public String string(String path) {
        if (!jsonObject.has(path))
            return null;
        if (!jsonObject.get(path).isJsonPrimitive())
            return null;
        if (!jsonObject.getAsJsonPrimitive(path).isString())
            return null;
        return jsonObject.get(path).getAsString();
    }

    public int integer(String path) {
        if (!jsonObject.has(path))
            return 0;
        if (!jsonObject.get(path).isJsonPrimitive())
            return 0;
        if (!jsonObject.getAsJsonPrimitive(path).isNumber())
            return 0;
        return jsonObject.get(path).getAsInt();
    }

    public long longInteger(String path) {
        if (!jsonObject.has(path))
            return 0;
        if (!jsonObject.get(path).isJsonPrimitive())
            return 0;
        if (!jsonObject.getAsJsonPrimitive(path).isNumber())
            return 0;
        return jsonObject.get(path).getAsLong();
    }

    public JsonObject original() {
        return this.jsonObject;
    }

}
