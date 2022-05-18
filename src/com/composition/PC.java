package com.composition;

public class PC {
    private Case theCase;
    private Monitor monitor;
    private Motherboard motherboard;



    public PC(Case theCase, Monitor monitor, Motherboard motherboard) {
        this.theCase = theCase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }



    public void powerUp() {
        getTheCase().pressPowerButton();
        drawLogo();
    }

    private void drawLogo() {
        monitor.drawPixelAt(1200, 780, "greeen");
    }


    private Case getTheCase() {
        return this.theCase;
    }

    public Monitor getMonitor() {
        return this.monitor;
    }

    private Motherboard getMotherboard() {
        return this.motherboard;
    }
    
}
