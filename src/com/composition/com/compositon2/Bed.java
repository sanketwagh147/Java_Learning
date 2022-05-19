package com.composition.com.compositon2;

public class Bed {
    private String style;
    private int pillows;
    private int height;
    private int quilt;
    private int sheets;


    public Bed(String style, int pillows, int height, int quilt, int sheets) {
        this.style = style;
        this.pillows = pillows;
        this.height = height;
        this.quilt = quilt;
        this.sheets = sheets;
    }


    public void make() {
        System.out.println("bed is being made");
    }


    public String getStyle() {
        return this.style;
    }

    public int getPillows() {
        return this.pillows;
    }

    public int getHeight() {
        return this.height;
    }

    public int getQuilt() {
        return this.quilt;
    }

    public int getSheets() {
        return this.sheets;
    }

}
