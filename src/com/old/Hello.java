package com.old;

public class Hello {
    public static void main(String[] args) {
        // System.out.println("Hello Java");
        // System.out.println(1010101123);

        int myFirstNumber = 147;
        // System.out.println(myFirstNumber);

        int mySecondNumber;
        mySecondNumber = 11;
        // System.out.println(mySecondNumber);

        int myThirdNumber;
        myThirdNumber = 12;

        int sum;
        sum = myFirstNumber + mySecondNumber + myThirdNumber;
        // System.out.println(myFirstNumber + mySecondNumber);
        System.out.println(sum);
    
        // System.out.println(addition(2,3));
        // System.out.println(Sub.sub(5,3));

        System.out.println(addWoo("sanket"));

    }

    private static String  addWoo(String string) {
        return string;
    }

    public static int addition(int a, int b) {
        return a + b;

    }
}
