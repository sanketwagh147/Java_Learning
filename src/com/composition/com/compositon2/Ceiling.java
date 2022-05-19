package com.composition.com.compositon2;

public class Ceiling {

    private int paintedColor;
    private int height;


    public Ceiling(int paintedColor, int height) {
        this.paintedColor = paintedColor;
        this.height = height;
    }

    public int getPaintedColor() {
        return this.paintedColor;
    }

    public int getHeight() {
        return this.height;
    }

}
