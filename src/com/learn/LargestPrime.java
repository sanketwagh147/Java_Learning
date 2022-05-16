package com.learn;
public class LargestPrime {


    public static void main(String[] args) {
        
        System.out.println(getLargestPrime(19));
    }


    public static int getLargestPrime(int number){
        if (number < 2){
            return -1;
        } else {
            int divisor = 2;
            while (divisor <  number){
                if (number % divisor !=0){
                    divisor ++;
                } else {
                    number = number / divisor;
                    divisor = 2; 
                }
            }
            return number;
        }
    }
    
}
