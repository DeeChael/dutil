package net.deechael.dutil;

import java.lang.reflect.*;

public final class ReflectionUtil {

    public static boolean isExtendedFrom(Class<?> child, Class<?> parent) {
        return parent.isAssignableFrom(child);
    }

    public static boolean isProtected(Class<?> clazz) {
        return Modifier.isProtected(clazz.getModifiers());
    }

    public static boolean isPrivate(Class<?> clazz) {
        return Modifier.isPrivate(clazz.getModifiers());
    }

    public static boolean isPublic(Class<?> clazz) {
        return Modifier.isPublic(clazz.getModifiers());
    }

    public static boolean isAbstract(Class<?> clazz) {
        return Modifier.isAbstract(clazz.getModifiers());
    }

    public static boolean isFinal(Class<?> clazz) {
        return Modifier.isFinal(clazz.getModifiers());
    }

    public static boolean isAnnotation(Class<?> clazz) {
        return clazz.isAnnotation();
    }

    public static boolean isInterface(Class<?> clazz) {
        return clazz.isInterface();
    }

    public static boolean isArray(Class<?> clazz) {
        return clazz.isArray();
    }

    public static boolean isEnum(Class<?> clazz) {
        return clazz.isEnum();
    }

    public static Class<?> getClass(String name) {
        try {
            return Class.forName(name);
        } catch (ClassNotFoundException e) {
            return null;
        }
    }

    public static Class<?> getArrayClass(Class<?> contentClass) {
        return Array.newInstance(contentClass, 0).getClass();
    }

    public static Class<?> getContentClass(Class<?> arrayClass) {
        return arrayClass.isArray() ? arrayClass.getComponentType() : null;
    }

    public static <T extends Enum<T>> T getEnumObject(Class<T> enumClass, String name) {
        return Enum.valueOf(enumClass, name);
    }

    public static <T> T newInstance(Constructor<T> constructor, Object... arguments) {
        try {
            return constructor.newInstance(arguments);
        } catch (InstantiationException | IllegalAccessException | InvocationTargetException ignored) {
        }
        return null;
    }

    public static Constructor<?> getConstructor(Class<?> clazz, Class<?>... arguments) {
        try {
            Constructor<?> constructor = clazz.getDeclaredConstructor(arguments);
            constructor.setAccessible(true);
            return constructor;
        } catch (NoSuchMethodException ignored) {
        }
        return null;
    }

    public static Field getField(Class<?> clazz, String fieldName) {
        try {
            Field field = clazz.getDeclaredField(fieldName);
            field.setAccessible(true);
            return field;
        } catch (NoSuchFieldException ignored) {
        }
        return null;
    }

    public static Method getMethod(Class<?> clazz, String methodName, Class<?>... classes) {
        try {
            Method method = clazz.getDeclaredMethod(methodName, classes);
            method.setAccessible(true);
            return method;
        } catch (NoSuchMethodException ignored) {
        }
        return null;
    }

    public static Class<?> getInnerClass(Class<?> owner, String name) {
        return getClass(owner.getName() + "$" + name);
    }

    public static Class<?> getOwnerClass(Class<?> innerClass) {
        String className = innerClass.getName();
        if (!className.contains("$")) {
            return null;
        }
        String[] split = className.split("\\$");
        return getClass(className.substring(0, split[split.length - 1].length() - 1));
    }

    public static Class<?> getOutsidestClass(Class<?> innerClass) {
        String className = innerClass.getName();
        if (!className.contains("$")) {
            return null;
        }
        return getClass(className.split("\\$")[0]);
    }

    public static boolean implemented(Class<?> clazz) {
        return clazz.getInterfaces().length > 0;
    }

    public static boolean extended(Class<?> clazz) {
        return clazz.getSuperclass() != null;
    }

    public static <T> T newInstance(Class<T> clazz) {
        for (Constructor<?> constructor : clazz.getDeclaredConstructors()) {
            if (constructor.getParameterCount() == 0) {
                try {
                    return clazz.cast(constructor.newInstance());
                } catch (InstantiationException | IllegalAccessException | InvocationTargetException ignored) {
                    return null;
                }
            }
        }
        return null;
    }

    public static Object invoke(Object object, Method method, Object... objects) {
        try {
            return method.invoke(object, objects);
        } catch (IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static Object invoke(Object object, Field field) {
        try {
            return field.get(object);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }

    private ReflectionUtil() {
    }

}
