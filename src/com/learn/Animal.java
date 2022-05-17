package com.learn;

public class Animal {

    public static void main(String[] args) {
        
        Animal dog = new Animal("tommy", 12, 12, 100, 200);
        dog.eat();
    }
    private String name;
    private int brain;
    private int body;
    private int size;
    private int weight;


    public Animal(String name, int brain, int body, int size, int weight) {
        this.name = name;
        this.brain = brain;
        this.body = body;
        this.size = size;
        this.weight = weight;
    }
    

    public String getName() {
        return this.name;
    }

    public int getBrain() {
        return this.brain;
    }

    public int getBody() {
        return this.body;
    }

    public int getSize() {
        return this.size;
    }

    public int getWeight() {
        return this.weight;
    }

    public void move(){
        System.out.println(String.format("%s is moving", this.name));
    }
    public void eat(){
        System.out.println(String.format("%s is eating", this.name));
    }

}
