package com.old;

public class BarkingDog {

    public static void main(String[] args) {
    System.out.println(shouldWakeUp(true, 0));
        
    }
    public static boolean shouldWakeUp(boolean isBarking, int hourOfDay){

        if (hourOfDay < 0 || hourOfDay > 23){
            return false;
        }
        if (hourOfDay < 8 || hourOfDay > 22){
            if (isBarking){

            return true;
            }
        }
        
    return false;
    }
    
}

