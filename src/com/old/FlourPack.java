package com.old;

public class FlourPack {

    public static void main(String[] args) {
        System.out.println(canPack(1, 0, 5));
        

    }
    
    public static boolean canPack(int bigCount, int smallCount, int goal){
        if (bigCount < 0 || smallCount < 0 || goal < 0){
            return false;

        } else {

            if ((goal) > ((bigCount *5) + smallCount)){
                return false;
            }

            if ((goal % 5 ) > smallCount){
                return false;

            }
        return true;

            
        }
    }
}
