package net.deechael.dutil;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class IOUtil {

    public static void delete(File file) {
        if (!file.exists())
            return;
        if (file.isDirectory()) {
            deleteDirectory(file);
        } else {
            file.delete();
        }
    }

    public static void deleteDirectory(File directory) {
        if (!directory.exists())
            return;
        if (!directory.isDirectory())
            return;
        for (File file : listFiles(directory))
            delete(file);
        directory.delete();
    }

    public static void copyFile(File original, File destination) {
        if (!original.exists())
            return;
        try {
            if (original.isDirectory())
                copyDirectory(original, destination);
            else
                copy(new FileInputStream(original), new FileOutputStream(destination));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public static void copyDirectory(File original, File destination) {
        if (!original.exists())
            return;
        if (!original.isDirectory())
            return;
        if (!destination.exists())
            destination.mkdirs();
        for (File file : listFiles(original)) {
            copyFile(file, new File(destination, file.getPath().substring(original.getPath().length() + 1)));
        }
    }

    public static void copy(InputStream inputStream, OutputStream outputStream) {
        byte[] buffer = new byte[2048];
        int length;
        try {
            while ((length = inputStream.read(buffer)) != -1)
                outputStream.write(buffer, 0, length);
            inputStream.close();
            outputStream.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void createFile(File file, boolean isFile) {
        if (file.exists() && file.isFile() && isFile) return;
        if (isFile) {
            try {
                if (file.getParentFile() != null)
                    if (!file.getParentFile().exists())
                        file.getParentFile().mkdirs();
                file.createNewFile();
            } catch (IOException ignored) {
            }
        } else
            file.mkdirs();
    }

    public static List<File> listFiles(File directory) {
        List<File> files = new ArrayList<>();
        if (directory.exists() && directory.isDirectory()) {
            File[] listed = directory.listFiles();
            if (listed != null)
                if (listed.length > 0)
                    files.addAll(Arrays.asList(listed));
        }
        return files;
    }


    public static <T> byte[] toBytes(T object) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            objectOutputStream.writeObject(object);
            objectOutputStream.flush();
            byte[] bytes = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            objectOutputStream.close();
            return bytes;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static <T> T toObject(byte[] bytes, Class<T> clazz) {
        try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bytes);
            ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
            Object object = objectInputStream.readObject();
            byteArrayInputStream.close();
            objectInputStream.close();
            return (T) object;
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    private IOUtil() {
    }

}
