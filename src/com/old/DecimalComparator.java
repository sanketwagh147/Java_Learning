package com.old;

public class DecimalComparator {
    public static void main(String[] args) {
        System.out.println(areEqualByThreeDecimalPlaces(3.1756, 3.175));
    }
    

    public static boolean areEqualByThreeDecimalPlaces(double numOne, double numTwo) {

    // DecimalFormat df = new DecimalFormat("#.000");
    int mulNumOne = (int)(numOne * 1000);
    int mulNumTwo = (int)(numTwo * 1000);

// 
    // String numOneStr =df.format(numOne);
    // String numTwoStr =df.format(numTwo);
    if (mulNumOne == mulNumTwo) {
        return true;
    }
    return false;

    }


}
