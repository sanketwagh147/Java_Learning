package com.learn;

public class GermanShepherd extends Dog{

    public static void main(String[] args) {
        
        GermanShepherd gerShe = new GermanShepherd("tommy", 1 , 1, 12, "black");
        System.out.println(gerShe.getFurColor());
        System.out.println(gerShe.getWeight());
        System.out.println(gerShe.getTail());
        gerShe.eat();
        gerShe.run();
        System.out.println(gerShe.addString("a", "b"));
    }


    private String furColor;
    private String b;
    private String b2;

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


    @Override
    public void run(){
        super.run();
        System.out.println("Running a t speed of German Shepherd");
    }

    @Override
    public String addString(String a, String b){
        String ret = super.addString(a, b);
        System.out.println("add string");

        return a + b + ret + furColor;
        

    }
    




    
}
