package com.inheritance.cylinder;



public class Cylinder extends Circle {

    public static void main(String[] args) {
        
        Circle circle = new Circle(3.75);
        System.out.println(circle.getRadius());
        System.out.println(circle.getArea());

        Cylinder cylinder = new Cylinder(5.55, 7.25);
        System.out.println(cylinder.getRadius());
        System.out.println(cylinder.getHeight());
        System.out.println(cylinder.getArea());
        System.out.println(cylinder.getVolume());
    }

    private double height;


    public Cylinder(double radius, double height) {
        super(radius);
        if (height < 0) height = 0;
        this.height = height;
    }


    public double getHeight() {
        return this.height;
    }

    public double getVolume(){
        return getArea() * getHeight();
    }



    
}
