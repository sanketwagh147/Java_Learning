package mobile_phones;

import java.util.Scanner;



public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone("9762151814 ");

    public static void main(String[] args) {
        
        boolean quit = false;
        startPhone();
        printActions();
        while (!quit) {

        }
    }

    private static void startPhone() {
        System.out.println("Starting phone....");
    }


    private static void printActions() {
        System.out.println(" \n Available actions:\n Press");
        System.out.println("0 - to shutdown\n" +
                           "1 - to print contact details\n" +
                           "2 - to add new contact details\n" +
                           "3 - to update existing contact details\n" +
                           "4 - to delete contact details\n" +
                           "5 - to query if existing contact exists\n" +
                           "6 - to print a list of available action:");
                           System.out.println("Choose your action");

    }


        


    


    
}
