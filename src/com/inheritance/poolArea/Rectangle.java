package com.inheritance.poolArea;



public class Rectangle {

    private double length;
    private double width;

    public Rectangle(double width, double length) {

        if (length <  0) length =0;
        this.length = length;
        if (width <  0) width = 0;
        this.width = width;
    }


    public double getLength() {
        return this.length;
    }

    public double getWidth() {
        return this.width;
    }

    public double getArea(){
        return length * width;
    }


}