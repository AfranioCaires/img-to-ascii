package com.asciiimg.service;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.FileWriter;
import java.io.IOException;

public class GetASCII {
    public static void createASCIIFile(BufferedImage img, double densityLevel){
        img = Grayscale.convertToGrayscale(img);

        try {
            FileWriter imgASCII = new FileWriter("img-ASCII.txt");
            for(int y = 0; y < img.getHeight(); y++){
                for (int x = 0; x < img.getWidth(); x++) {
                    var color = new Color(img.getRGB(x, y)).getRed();
                    imgASCII.write(MapPixelASCII.mapPixelToAscii(color, densityLevel));
                }
                imgASCII.write('\n');
            }
            imgASCII.close();
            System.out.println("File saved successfully !");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
