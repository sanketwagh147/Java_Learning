package com.inheritance;


public class Nexon extends Car {

public static void main(String[] args) {
    
    Nexon myNexon = new Nexon(30);
    myNexon.accelerate(23);
    myNexon.accelerate(35);
}
    private int roadServiceMonths;

    public Nexon(int roadServiceMonths) {
        super("Nexon", "4WD", 5, 5, 6, false);
        this.roadServiceMonths = roadServiceMonths;
    }

    public void accelerate(int rate){
        int newVelocity = getCurrentVelocity() + rate;
        if(newVelocity ==0) {
            stop();
            changeGear(1);
        } else if (newVelocity > 0 && newVelocity <=10){
            changeGear(1);
        } else if (newVelocity > 10 && newVelocity <=20){
            changeGear(2);
        } else if (newVelocity > 20 && newVelocity <=30){
            changeGear(3);
        } else{
            changeGear(4);
        }

        if (newVelocity > 0){
            changeVelocity(newVelocity, getCurrentDirection());
        }
}
}
