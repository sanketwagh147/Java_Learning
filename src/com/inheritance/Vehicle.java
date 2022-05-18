package com.inheritance;

public class Vehicle {

    private String name;
    private String size ;

    private int currentVelocity;
    private int currentDirection;
    

    public Vehicle(String name, String size) {
        this.name = name;
        this.size = size;
        this.currentDirection = 0;
        this.currentDirection = 0;
    }

    public void steer(int direction){
        this.currentDirection += direction;
        System.out.println("Vehicle.steer() called , vehicle steering in " + currentDirection);
    }


    public void move(int velocity, int direction){
        currentVelocity = velocity;
        currentDirection = direction;
        System.out.println("Vehicle.move() called , vehicle moving in " + currentDirection + " with velocity of " + currentVelocity);
    }


    public String getName() {
        return this.name;
    }

    public String getSize() {
        return this.size;
    }

    public int getCurrentVelocity() {
        return this.currentVelocity;
    }

    public int getCurrentDirection() {
        return this.currentDirection;
    }
        
    public void stop(){
        this.currentDirection = 0;
    }
    
}
