package net.deechael.dutil;

import org.jetbrains.annotations.NotNull;

public final class StrUtil {

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

    public static int count(@NotNull String string, @NotNull String keyword) {
        Preconditions.checkNull(string);
        Preconditions.checkNull(keyword);
        return (string.length() - string.replace(keyword, "").length()) / keyword.length();
    }

    private StrUtil() {
    }

}
