package com.learn;

public class Dog extends Animal {



    public static void main(String[] args) {
        Dog max = new Dog("max",11, 10, 2, 49, 2, "brown");
        Dog sweetly = new Dog("sweets", 1, 1, 10, 2, 2, "brown");
        sweetly.eat();
        sweetly.bark();
        
        max.eat();
        max.move();
    }

    // Dog characteristics or fields
    private int eyes;
    private int tail;
    private int teeth;
    private String coat;

    public Dog(String name,  int size, int weight, int eyes, int tail, int teeth, String coat){
        super(name,1, size, weight, teeth);  // Base info inherited from animal
        this.eyes = eyes;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }
    
    
    public int getEyes() {
        return this.eyes;
    }

    public int getTail() {
        return this.tail;
    }

    public int getTeeth() {
        return this.teeth;
    }

    public String getCoat() {
        return this.coat;

    }

    private void bark(){
        System.out.println("bark bark");
    }

    

}