package com.composition;

public class Main {

    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions(20, 20, 5);
        Case theCase = new Case("220B", "Dell", "240", dimensions);

        Monitor theMonitor = new Monitor("27 inch", "Acer", 27, new Resolution(480, 720));

        Motherboard newMotherboard = new Motherboard("model", "Asus", 5, 6, "version 1");

        PC thePc = new PC(theCase, theMonitor, newMotherboard);
        System.out.println(thePc.getMonitor().getModel());

        thePc.powerUp();
    }
    
}
