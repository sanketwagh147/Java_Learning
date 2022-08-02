package com.old;

public class AreaCalculator {

    public static void main(String[] args) {
        System.out.println(area(5.0));
        System.out.println(area(-1));
        System.out.println(area(5.0, 4.0));
        System.out.println(area(-1.0, 4.0));

    }
    
    public static double area(double radius){
        if (radius < 0) return -1.0;
        return radius * radius * Math.PI;
        }
    public static double area(double length, double width){
        if (length < 0 || width <0 ) return -1.0;
        return length * width;
        }

    public static double calcFeetAndInchesToCentimeters(double feet , double inches) {
         if (!(feet >= 0) || !(inches >= 0) || !(inches <= 12)){
            return -1;
        } else {
            return (feet * 12 * 2.54) + (inches * 2.54);
            
        }
    
    }
        
    }

