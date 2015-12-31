package com.jpsappclub.exampleapp;

/**
 * Created by Michelle on 12/31/15.
 */
public class Color {
    public static Color redColor = new Color(255, 0, 0);
    public static Color greenColor = new Color(0, 255, 0);
    public static Color blueColor = new Color(0, 0, 255);
    public static Color yellowColor = new Color(255, 255, 0);
    public static Color cyanColor = new Color(0, 255, 255);
    public static Color pinkColor = new Color(255, 0, 255);

    private int red = 0;
    private int green = 0;
    private int blue = 0;

    public Color(int red, int green, int blue) {
        this.red = red;
        this.green = green;
        this.blue = blue;
    }

    public int getRed() {
        return red;
    }

    public int getGreen() {
        return green;
    }

    public int getBlue() {
        return blue;
    }
}
