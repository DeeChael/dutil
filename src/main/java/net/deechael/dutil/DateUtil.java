package net.deechael.dutil;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public final class DateUtil {

    public static final String yyyy_MM_dd_HH_mm_ss = "yyyy-MM-dd HH:mm:ss";

    public static SimpleDateFormat format(String format) {
        return new SimpleDateFormat(format);
    }

    public static Date parse(String format, String date) {
        try {
            return new SimpleDateFormat(format).parse(date);
        } catch (ParseException e) {
            return new Date();
        }
    }

    public static Date now() {
        return new Date();
    }

    public static String format(String format, Date date) {
        return new SimpleDateFormat(format).format(date);
    }

    private DateUtil() {
    }

}
