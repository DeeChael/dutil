package net.deechael.dutil;

import org.jetbrains.annotations.NotNull;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class StrUtil {

    public static boolean containsIgnoreCase(String owner, String child) {
        return owner.toLowerCase().contains(child.toLowerCase());
    }

    public static String insert(String original, String inner, int index) {
        return original.substring(0, index) + inner + original.substring(index + 1);
    }

    public static String safePattern(String string) {
        String[] keywords = new String[]{"*", ".", "?", "+", "$", "^", "[", "]", "(", ")", "{", "}", "|", "\"", "/"};
        for (String keyword : keywords) {
            string = string.replace(keyword, "\\" + keyword);
        }
        return string;
    }

    public static String unsafePattern(String string) {
        String[] keywords = new String[]{"*", ".", "?", "+", "$", "^", "[", "]", "(", ")", "{", "}", "|", "\"", "/"};
        for (String keyword : keywords) {
            string = string.replace("\\" + keyword, keyword);
        }
        return string;
    }

    public static String[] split(String original, String regex, int times) {
        if (times == 1 || times == 0)
            return new String[]{original};
        if (times < 0)
            return original.split(regex);
        return Pattern.compile(regex).split(original, times + 1);
    }

    public static String[] rsplit(String original, String regex, int times) {
        if (times == 0)
            return new String[]{original};
        if (times < 0)
            return original.split(regex);
        Matcher matcher = Pattern.compile(regex).matcher(original);
        List<String> originals = Arrays.asList(original.split(regex));
        List<String> groups = new ArrayList<>();
        while (matcher.find())
            groups.add(matcher.group());
        int groupCount = groups.size();
        if (groupCount <= times)
            return original.split(regex);
        List<String> stringList = new ArrayList<>();
        StringBuilder first = new StringBuilder(originals.get(0));
        for (int i = 0; i < (groupCount - times); i++)
            first.append(groups.get(i)).append(originals.get(i + 1));
        stringList.add(first.toString());
        for (int i = originals.size() - times; i < originals.size(); i++) {
            stringList.add(originals.get(i));
        }
        return stringList.toArray(new String[0]);
    }

    public static String capitalize(String string) {
        if (string.length() < 1)
            return string;
        return String.valueOf(string.charAt(0)).toUpperCase() + lsub(string, 1);
    }

    public static String sub(String string, int start, int end) {
        if (start >= end)
            throw new RuntimeException("Range out of bound");
        return lsub(rsub(string, end), start);
    }

    public static String lsub(String string, int start) {
        return string.substring(start);
    }

    public static String rsub(String string, int length) {
        return string.substring(0, string.length() - length);
    }

    public static boolean in(String string, String in) {
        return string.contains(in);
    }

    public static boolean notIn(String string, String in) {
        return !string.contains(in);
    }

    public static boolean isBlank(@NotNull String string) {
        Preconditions.checkNull(string);
        return indexOfNonWhitespace(string) == string.length();
    }

    public static int indexOfNonWhitespace(@NotNull String string) {
        Preconditions.checkNull(string);
        int length = 0;
        for (char c : string.toCharArray())
            if (!Character.isWhitespace(c))
                length += 1;
        return length;
    }

    public static String multiply(String string, int times) {
        if (times == 0)
            return "";
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < Math.abs(times); i++)
            builder.append(string);
        return times > 0 ? builder.toString() : builder.reverse().toString();
    }

    public static List<String> divide(String string, int times) {
        if (times <= 1 || string.length() < times)
            return Collections.singletonList(string);
        List<String> strings = new ArrayList<>();
        int size = NumberUtil.digitDivide(string.length(), times);
        int parts = NumberUtil.digitDivide(string.length(), size);
        for (int i = 0; i < parts; i++)
            strings.add(string.substring(i * size, Math.min((i + 1) * size, string.length())));
        return strings;
    }

    public static List<String> lengthDivide(String string, int length) {
        if (string.length() <= length)
            return Collections.singletonList(string);
        List<String> strings = new ArrayList<>();
        int parts = NumberUtil.digitDivide(string.length(), length);
        for (int i = 0; i < parts; i++)
            strings.add(string.substring(i * length, Math.min((i + 1) * length, string.length())));
        return strings;
    }

    public static boolean isFullOfSpace(String string) {
        for (char c : string.toCharArray())
            if (!Character.isWhitespace(c))
                return false;
        return true;
    }

    public static int count(@NotNull String string, @NotNull String keyword) {
        Preconditions.checkNull(string);
        Preconditions.checkNull(keyword);
        return (string.length() - string.replace(keyword, "").length()) / keyword.length();
    }

    public static boolean isInteger(String string) {
        try {
            Integer.parseInt(string);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static boolean isLong(String string) {
        try {
            Long.parseLong(string);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static boolean isFloat(String string) {
        try {
            Float.parseFloat(string);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static boolean isDouble(String string) {
        try {
            Double.parseDouble(string);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static boolean isBoolean(String string) {
        return Objects.equals(string, "true") || Objects.equals(string, "false");
    }

    private StrUtil() {
    }

}
