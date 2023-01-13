package net.deechael.dutil;

public final class Preconditions {

    public static void checkNull(Object object) {
        checkNull(object, "Object is null");
    }

    public static void checkNull(Object object, String message) {
        if (object == null)
            throw new RuntimeException(message);
    }

    public static <T> void checkArrayNull(T[] array) {
        checkArrayNull(array, "Array or element is null");
    }

    public static <T> void checkArrayNull(T[] array, String message) {
        checkNull(array, message);
        for (T t : array)
            checkNull(t, message);
    }

    public static void checkEmpty(String string) {
        checkEmpty(string, "String is empty");
    }

    public static void checkEmpty(String string, String message) {
        checkNull(string);
        if (string.isEmpty())
            throw new RuntimeException(message);
    }

    public static void checkBlank(String string) {
        checkBlank(string, "String is empty");
    }

    public static void checkBlank(String string, String message) {
        checkNull(string);
        if (StrUtil.isBlank(string))
            throw new RuntimeException(message);
    }

    private Preconditions() {
    }

}
