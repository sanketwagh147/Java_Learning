package com.old;

public class SumDigits {

    public static void main(String[] args) {
        
        System.out.println(sumDigits(1));

    }

    public static int sumDigits(int number){
        if (number <= 10) return -1;
        else{
            int sum = 0;

            while (number > 0){
                int digit = number % 10;
                sum += digit;

                number /= 10;
            }
        return sum;


        

        }
    }
    
}
