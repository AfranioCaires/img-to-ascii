package com.asciiimg.service;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ImageFile {
    public static BufferedImage getImage(String path, int width, int height) {

        try {
            File file = new File(path);
            new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
            BufferedImage image;
            image = ImageIO.read(file);

            System.out.println("Image loaded.");
            return image;

        } catch (IOException e) {
            System.out.println("Something went wrong...");
            throw new RuntimeException(e);
        }
    }
}

