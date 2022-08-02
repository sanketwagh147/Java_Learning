package com.old;

public class SwitchStatements {

    public static void main(String[] args) {
        char switchValue = 'j';
        // String str = 'hello this is great"';

        // switch(switchValue){
        //     case 1: System.out.println("is 1");
        //     break;
        //     case 2: System.out.println("is 2");
        //     break;
        //     case 3: case 4: case 5: System.out.println("is 345");
        //     break;
        //     default: System.out.println("is default");
        // }
        switch(switchValue){
            case 'a': System.out.println("is a");
            break;
            case 'b': System.out.println("is b");
            break;
            case 'd': case 'e': case 'f': System.out.println("is def");
            break;
            case 'g': case 'h': case 'i': System.out.println("is ghi");
            break;
            case 'j': case 'k': case 'l': System.out.println("is jkl");
            break;
            default: System.out.println("is default");
        }
    }
    
}
