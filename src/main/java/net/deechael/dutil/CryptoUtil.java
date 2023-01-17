package net.deechael.dutil;

import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public final class CryptoUtil {

    public static String toMD5(String textToEncryption) {
        byte[] digest;
        try {
            MessageDigest md5 = MessageDigest.getInstance("md5");
            digest = md5.digest(textToEncryption.getBytes(StandardCharsets.UTF_8));
            return (new BigInteger(1, digest)).toString(16);
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    public static String toSHA1(String textToEncryption) {
        try {
            MessageDigest md = MessageDigest.getInstance("SHA1");
            md.update(textToEncryption.getBytes());
            StringBuilder buf = new StringBuilder();
            byte[] bits = md.digest();
            String string = null;
            for (int bit : bits) {
                int a = bit;
                if (a < 0)
                    a += 256;
                if (a < 16)
                    buf.append("0");
                buf.append(Integer.toHexString(a));
                string = buf.toString();
            }
            return string;
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    public static String toSHA256(String textToEncryption) {
        MessageDigest messageDigest;
        try {
            messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update(textToEncryption.getBytes(StandardCharsets.UTF_8));
            byte[] bytes = messageDigest.digest();
            StringBuilder stringBuffer = new StringBuilder();
            String temp;
            String encodeStr = "";
            for (byte aByte : bytes) {
                temp = Integer.toHexString(aByte & 0xFF);
                if (temp.length() == 1)
                    stringBuffer.append("0");
                stringBuffer.append(temp);
                encodeStr = stringBuffer.toString();
            }
            return encodeStr;
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    private CryptoUtil() {
    }

}
