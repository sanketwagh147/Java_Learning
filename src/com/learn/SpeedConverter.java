package com.learn;
public class SpeedConverter {
    public static void main(String[] args) {
        
        // System.out.println(toMilesPerHour(25.42));
        printConversion(75.114);
    }

    public static long toMilesPerHour(double kilometersPerHour){
        long milesPerHour = -1;
        if (kilometersPerHour >= 0){
            milesPerHour = Math.round((1/1.609) * (kilometersPerHour));
        }
        return milesPerHour;
    }

    public static void printConversion(double kilometersPerHour){
        if (kilometersPerHour < 0){
            System.out.println("Invalid Value");
        }else{
            long milesPerHour = Math.round(((1/1.609) * kilometersPerHour));
            System.out.println(kilometersPerHour +" km/h = " +  milesPerHour + " mi/h");
        }
    }
    
}
