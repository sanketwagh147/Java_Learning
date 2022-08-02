package com.old;

public class IsPerfectNumber {

    public static void main(String[] args) {
        System.out.println(isPerfectNumber(6)); 

    }
    

    public static boolean isPerfectNumber(int number){

        if (number < 1){
            return false;
        }else{
            int sumFactors = 0;
            for (int i=1; i<= number /2; i++){
                if (number % i == 0){
                    sumFactors += i;

                }
            }
            if (sumFactors == number){
                return true;
            }else{
                return false;
            }
        }

    }
}
