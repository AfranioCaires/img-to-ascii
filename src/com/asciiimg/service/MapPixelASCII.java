package com.asciiimg.service;


public class MapPixelASCII {
    private static final char[] ASCII_CHARS = {
            '@', '#', 'S', '%', '?', '*', '+', ';', ':', ',', '.',
            '8', 'O', '&', 'o', '!', '~', '-', '=', '_', '1', 'i',
            'l', '|', '/', '\\', '(', ')', '[', ']', '{', '}', '0',
            '9', 'A', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'j',
            'k', 'm', 'n', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w',
            'x', 'y', 'z', '<', '>', '^', '`'
    };

    public static char mapPixelToAscii(int gray, double densityLevel ) {
        if (densityLevel < 0.1 || densityLevel > 1.0) {
            throw new IllegalArgumentException("Density level must be between 0.1 and 1.0");
        }
        int index = (int) (gray / 255.0 * (ASCII_CHARS.length - 1));
        return ASCII_CHARS[(int)(densityLevel * index)];
    }
}
