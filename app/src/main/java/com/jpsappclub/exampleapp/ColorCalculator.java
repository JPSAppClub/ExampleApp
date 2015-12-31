package com.jpsappclub.exampleapp;

import java.util.ArrayList;

/**
 * Created by Michelle on 12/31/15.
 */
public class ColorCalculator {
    public static Color addColors(ArrayList<Color> colors) {
        int redValue = 0;
        int greenValue = 0;
        int blueValue = 0;
        for (int c = 0; c < colors.size(); c++) {
            final Color color = colors.get(c);
            redValue += color.getRed();
            greenValue += color.getGreen();
            blueValue += color.getBlue();
        }

        redValue /= colors.size();
        greenValue /= colors.size();
        blueValue /= colors.size();
        return new Color(redValue, greenValue, blueValue);
    }
}
