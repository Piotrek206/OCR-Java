package com.input.lookup;

import java.io.File;

import com.input.lookup.common.ImageBinaryGrey;

public class OCRTest {

    static public void main(String[] args) {
        OCR l = new OCR(0.50f);

        // will go to com/input/lookup/fonts folder and load all font
        // familys (here is only font_1 and font_2 family in this library)
        l.loadFontsDirectory(OCRTest.class, new File("fonts"));

        // example how to load only one family
        // "com/input/lookup/fonts/font_1"
        l.loadFont(OCRTest.class, new File("fonts", "font_1"));

        String str = "";

        // recognize using all familys set
        str = l.recognize(Capture.load(OCRTest.class, "szeryfowe.jpg"));
        System.out.println(str);

        // recognize using only one family set
        str = l.recognize(Capture.load(OCRTest.class, "bezszefyfowe.jpg"), "font_1");
        System.out.println(str);

    }
}
