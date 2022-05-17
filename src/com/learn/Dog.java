package com.learn;

public class Dog extends Animal {

    public static void main(String[] args) {
        Dog max = new Dog("max",11, 10, 2, 49);
        max.eat();
        max.move();
    }


    // Dog characteristics or fields
    private int eyes;
    private int tail;
    private int teeth;
    private String coat;

    public Dog(String name, int brain, int body, int size, int weight){
        super(name, brain, body, size, weight);  // Base info inheritted from animal
    }
    
}