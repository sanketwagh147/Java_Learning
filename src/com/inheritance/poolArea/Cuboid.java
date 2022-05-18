package com.inheritance.poolArea;

public class Cuboid extends Rectangle {


    public static void main(String[] args) {
        
        Rectangle rectangle = new Rectangle(5, 10);
        System.out.println(rectangle.getWidth());
        System.out.println(rectangle.getLength());
        System.out.println(rectangle.getArea());
    }


    private double height;

    public Cuboid(double length, double width, double height) {
        super(length, width);
        if (height < 0) height =0;
        this.height = height;
    }

    public double getHeight() {
        return this.height;
    }

    public double getVolume() {
        return getArea() * getHeight();
    }



    
}
