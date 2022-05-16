package com.learn;
class ifthen {
    public static void main(String[] args) {

        boolean isBool = true;

        if (isBool)
            System.out.println("hello");
        System.out.println("hello");

        int a = 11;
        int b = 12;
        if (a == 10 && b == 11){
            System.out.println("a is 10");
            System.out.println("a is 10");
        }else {

            System.out.println("test");
        }

        if (a != 10) {
            System.out.println("sldjfalsdj");
        }
        int c = 13;
        int d = 15;

        if ((c == 12 || d == 15)){
            System.out.println("or cond");
        }

        if (c == 12){
            System.out.println("tes");
        }

        boolean isCar = false;

        if (isCar = true){
            System.out.println("is car");
            System.out.println(isCar);
        }

        boolean one = false;
        // TERNERY OPERATOR
        int ternerCondition = one ? 1:2;

        System.out.println(ternerCondition);


    }

}
