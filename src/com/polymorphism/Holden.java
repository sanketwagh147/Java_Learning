package com.polymorphism;

public class Holden extends Car{

    public Holden(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String accelerate() {
        return this.getClass().getSimpleName() + " is accelerating";
    }

    @Override
    public String brake() {
        return this.getClass().getSimpleName() + " is braking";
    }

    @Override
    public String startEngine() {
        return this.getClass().getSimpleName() + " engine is starting";
    }





    
}