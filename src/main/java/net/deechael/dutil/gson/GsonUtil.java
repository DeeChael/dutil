package net.deechael.dutil.gson;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.stream.JsonReader;

import java.io.Reader;

public final class GsonUtil {
    
    public static boolean isJsonObject(String string) {
        try {
            JsonParser.parseString(string).getAsJsonObject();
            return true;
        } catch (Exception ignored) {
        }
        return false;
    }

    public static boolean isJsonObject(Reader reader) {
        try {
            JsonParser.parseReader(reader).getAsJsonObject();
            return true;
        } catch (Exception ignored) {
        }
        return false;
    }

    public static boolean isJsonObject(JsonReader jsonReader) {
        try {
            JsonParser.parseReader(jsonReader).getAsJsonObject();
            return true;
        } catch (Exception ignored) {
        }
        return false;
    }

    public static boolean isJsonArray(String string) {
        try {
            JsonParser.parseString(string).getAsJsonArray();
            return true;
        } catch (Exception ignored) {
        }
        return false;
    }

    public static boolean isJsonArray(Reader reader) {
        try {
            JsonParser.parseReader(reader).getAsJsonArray();
            return true;
        } catch (Exception ignored) {
        }
        return false;
    }

    public static boolean isJsonArray(JsonReader jsonReader) {
        try {
            JsonParser.parseReader(jsonReader).getAsJsonArray();
            return true;
        } catch (Exception ignored) {
        }
        return false;
    }

    public static JsonObject getJsonObject(String string) {
        if (isJsonObject(string))
            return JsonParser.parseString(string).getAsJsonObject();
        return new JsonObject();
    }

    public static JsonArray getJsonArray(String string) {
        if (isJsonArray(string))
            return JsonParser.parseString(string).getAsJsonArray();
        return new JsonArray();
    }

    private GsonUtil() {
    }

}
