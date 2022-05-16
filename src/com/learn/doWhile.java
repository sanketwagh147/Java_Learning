package com.learn;
public class doWhile {

    public static void main(String[] args) {
        // testDoWhile(1);
        // System.out.println(sumFirstAndLastDigit(0));
        // System.out.println(getEvenDigitSum(121));
        // System.out.println( hasSharedDigit(10, 23));
        System.out.println(isValid(224));
        
    }

    public static void testDoWhile(int number){

        while (number < 5){
            number++;
            if (number == 3) {
                continue;
            }else{
                System.out.println(number);
               
            }
        }
    }

    public static int sumFirstAndLastDigit(int number){

            if (number >= 0) return -1;
            else{
                int lastNumber = number % 10;
                while (number >= 10){
                    number /=10;
                }
                return number + lastNumber;
            }
            
    }

    public static int getEvenDigitSum(int number){
        if (number >= 0) return -1;
        else{
            int evenSum = 0;
            while (number > 0){
                int lastNumber = number % 10;
                number /= 10;
                if (lastNumber % 2 == 0) evenSum+=lastNumber;

            }
        return evenSum;
        }
    }

    public static boolean hasSharedDigit(int num1, int num2){

        if (!(num1 >= 10) || !(num1 <=99) || !(num2 >= 10) || !(num2 <=99) ){
            return false;
        }else{
            int leftA = num1 / 10;
            int rightA = num1 % 10;
            int leftB = num2 / 10;
            int rightB = num2 % 10;

            if ((leftA == leftB) || (leftA == rightB) || (rightA == leftB ) || (rightA == rightB)){
                return true;
            }
            return false;
            
        }
    }

    public static boolean hasSameLastDigit(int a, int b , int c){
        if (isValid(a) && isValid(b) && isValid(c)){
            int lastA = a % 10;
            int lastB = b % 10;
            int lastC = c % 10;

            if ((lastA == lastB) || (lastB == lastC) || (lastC == lastA)){
            return true;
            }
        }

        return false;
        }



    public static boolean isValid(int number){
        if (!(number >= 10) || !(number <= 1000)){
            return false;
        }
        return true;
    }
    
}
