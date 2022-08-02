package com.old;

public class forLoops {
    public static void main(String[] args) {
        for (int i=8; i>=2; i--){
            System.out.println(calcInterest(10000, i));
        }
    }

    public static double calcInterest(double amount, double interest){
        return (amount * (interest/100));
    }
    
}
