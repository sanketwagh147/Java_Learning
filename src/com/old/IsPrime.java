package com.old;


public class IsPrime {

    public static void main(String[] args) {

        int counter = 0;
        for (int i=10; i<=50; i++){
            if (isPrime(i)){
                System.out.println(i + " is a Prime Number!");
                counter++;
            }
            if (counter ==30){
                
                break;
            }

        }
    }

    public static boolean isPrime(int num){

        if (num == 1){
            return false;
        }
        for (int i=2; i<= num/2; i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }
    
}
