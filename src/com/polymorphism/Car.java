package com.polymorphism;

public class Car {

    public static void main(String[] args) {
        Mitsubishi mit = new Mitsubishi(20, "testMit");
        System.out.println(mit.accelerate());
        Holden  hol = new Holden(20, "testMit");
        System.out.println(hol.accelerate());
    }

    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;



    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
        this.engine = true;
        this.wheels = 4;
    }

    public String startEngine() {
        return "Engine is Starting";

    }

    public String accelerate() {
        return "Car is accelerating";

    }

    public String brake() {
        return "Car is breaking";
    }
    

    public int getCylinders() {
        return this.cylinders;
    }

    public String getName() {
        return this.name;
    }

    
}
