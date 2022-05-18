package com.learn;

public class GermanShepherd extends Dog{

    public static void main(String[] args) {
        
        GermanShepherd gerShe = new GermanShepherd("tommy", 1 , 1, 12, "black");
        System.out.println(gerShe.getFurColor());
        System.out.println(gerShe.getWeight());
        System.out.println(gerShe.getTail());
        gerShe.eat();
    }


    private String furColor;

    public GermanShepherd(String name, int brain, int body, int size, String furColor){
        super(name, brain, body, size, 100, 11, "black");
        this.furColor = furColor;
    }


    public String getFurColor() {
        return this.furColor;
    }


    @Override
    public void eat() {
        // super.eat(int teeth);
        System.out.println("German Shepherd is eating with" + "teeth" + this.getTeeth());
    }

    




    
}
