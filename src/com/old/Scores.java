package com.old;

class Scores {

    public static void main(String[] args) {

    //main method where the code block starts executing
    System.out.println("started exection");
    // System.out.println(displayHighScorePosition("sanket", 1));
    displayHighScorePosition("sanket", 1);
    displayHighScorePosition("suoyo", 3);
    displayHighScorePosition("vishal", 5);
    displayHighScorePosition("sdf", 5);

    System.out.println(calculateHighScorePosition(1500));
    System.out.println(calculateHighScorePosition(900));
    System.out.println(calculateHighScorePosition(400));
    System.out.println(calculateHighScorePosition(50));

    }


    // Defining methods

    public static void displayHighScorePosition(String name, int position){
        System.out.println(String.format("%s managed to get into position %d", name, position));
    }

    public static int calculateHighScorePosition(int score){

        if (score > 1000){
            return 1;
        }else if ((score >500) && (score < 1000)){
            return 2;
        }else if ((score > 100) && (score < 500)){
            return 3;
        }else{
            return 4;
            
        }
    }
    
}
