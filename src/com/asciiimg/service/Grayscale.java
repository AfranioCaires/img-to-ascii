package com.asciiimg.service;

import java.awt.Color;
import java.awt.image.BufferedImage;

public class Grayscale {
    public static BufferedImage convertToGrayscale(BufferedImage original) {
        BufferedImage grayscale = new BufferedImage(original.getWidth(), original.getHeight(), BufferedImage.TYPE_BYTE_GRAY);
        for (int i = 0; i < original.getWidth(); i++) {
            for (int j = 0; j < original.getHeight(); j++) {
                Color c = new Color(original.getRGB(i, j));
                int gray = (int)(c.getRed() * 0.299 + c.getGreen() * 0.587 + c.getBlue() * 0.114);
                Color newColor = new Color(gray, gray, gray);
                grayscale.setRGB(i, j, newColor.getRGB());
            }
        }
        return grayscale;
    }
}
