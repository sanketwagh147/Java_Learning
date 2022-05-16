package com.learn;
public class IsPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(-1221));
        
    }

    public static boolean isPalindrome(int number){

        int originalNumber = number;
        int reverse =0;
        int remainder = 0;

        while (number != 0){
            remainder = number % 10 ;
            reverse = (reverse* 10) + remainder;

            number /= 10;

        }
        if (reverse == originalNumber) return true;
        return false;
    }
    
}
