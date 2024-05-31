package com.asciiimg.main;


import com.asciiimg.service.GetASCII;
import com.asciiimg.service.ImageFile;

public class Main {
    public static void main(String[] args) {

//      SET YOUR IMAGE SIZE HERE
        int width = 0;
        int height = 0;

        var img = ImageFile.getImage("C:\\Users\\Pichau\\Pictures\\in.jpg", 736, 736);
        GetASCII.createASCIIFile(img, 0.1);
    }
}