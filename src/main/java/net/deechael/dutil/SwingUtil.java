package net.deechael.dutil;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public final class SwingUtil {

    public static Color[] gradient(Color from, Color to, int amount) {
        List<Color> colors = new ArrayList<>();
        for (int i = 0; i < amount; i++) {
            float ratio = (float) i / (float) amount;
            int red = (int) (to.getRed() * ratio + from.getRed() * (1 - ratio));
            int green = (int) (to.getGreen() * ratio +
                    from.getGreen() * (1 - ratio));
            int blue = (int) (to.getBlue() * ratio +
                    from.getBlue() * (1 - ratio));
            colors.add(new Color(red, green, blue));
        }
        return colors.toArray(new Color[0]);
    }

    public static Toolkit toolkit() {
        return Toolkit.getDefaultToolkit();
    }

    public static Point center() {
        Dimension dimension = toolkit().getScreenSize();
        return new Point(dimension.width / 2, dimension.height / 2);
    }

    public static Point center(Dimension size) {
        return center(size.width, size.height);
    }

    public static Point center(int width, int height) {
        Dimension dimension = toolkit().getScreenSize();
        return new Point((dimension.width - width) / 2, (dimension.height - height) / 2);
    }

    public static ImageIcon imageIcon(Image image, int width, int height) {
        if (width <= 0 || height <= 0)
            throw new RuntimeException("Size cannot be lower than 0");
        ImageIcon icon = new ImageIcon();
        icon.setImage(image.getScaledInstance(width, height, Image.SCALE_DEFAULT));
        return icon;
    }

    private SwingUtil() {
    }

}
