package com.learn;
public class MegaBytesConverter {

    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(5000);
    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes){
        if (kiloBytes < 0){
            System.out.println("Invalid Value");

    }else{
            int megaBytes = (int)Math.floor(kiloBytes/1024);
            long remainingKb = kiloBytes % 1024;
            System.out.println(kiloBytes +" KB = " +  megaBytes + " MB and " + remainingKb + " KB");
        }
    
}
}
