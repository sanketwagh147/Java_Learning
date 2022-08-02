package com.old;

public class PlayingCat {
    public static void main(String[] args) {
        
    }

    public static boolean isCatPlaying(boolean isSummer, int temperature){ 

            if (!(temperature >=25) && !(temperature <=45)){
                return false;
            }
            if (isSummer){
                if (temperature >= 25 && temperature <= 45){
                    return true;
                }else{
                    return false; }
            }else{
                if (temperature >= 25 && temperature <= 35){
                    return true;
                }else{
                    return false;
                }

            }

        }

    }
    

