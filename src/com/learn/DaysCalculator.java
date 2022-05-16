package com.learn;
public class DaysCalculator {

    public static void main(String[] args) {
        
        printYearsAndDays(-525600);
        printYearsAndDays(1051200);
        printYearsAndDays(561600);
    }

    public static void printYearsAndDays(long minutes){
        if (minutes < 0 ) {
            System.out.println("Invalid Value");
        }else{
        int hours = (int)(minutes / 60);
        int days = (int)(hours/24);
        int years = (int)(days/365);
        int remainingDays = days %  365;

        String res = String.format("%s min = %s y and %s d", minutes, years, remainingDays);

        System.out.println(res);
        }
        
    }
    
}
