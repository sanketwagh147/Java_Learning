package com.learn;
import java.io.PrintStream;

public class VipCustomer {

    /**
     *
     */
    private static final PrintStream OUT = System.out;

    public static void main(String[] args) {

        VipCustomer sanket = new VipCustomer();
        OUT.println(sanket.getName());
        OUT.println(sanket.getCreditLimit());
        OUT.println(sanket.getEmailAddress());

        VipCustomer vishal = new VipCustomer("vishal", 12312);
        OUT.println(vishal.getName());
        OUT.println(vishal.getCreditLimit());
        OUT.println(vishal.getEmailAddress());

        VipCustomer suyog = new VipCustomer("Suyog", 19312123, "su@gmail.com");
        OUT.println(suyog.getName());
        OUT.println(suyog.getCreditLimit());
        OUT.println(suyog.getEmailAddress());
        
    }
    private String name;
    private String emailAddress;
    private double creditLimit;

    
    
    public VipCustomer(){
        this("default", 0.0, "default email");
    }

    public VipCustomer(String name,  double creditLimit){
        this(name, creditLimit, "unkown@gmail.com");
        

    }

    public VipCustomer(String name, double creditLimit, String emailAddress) {
        this.name = name;
        this.emailAddress = emailAddress;
        this.creditLimit = creditLimit;
    }


    /**
     * @return String return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @return String return the emailAddress
     */
    public String getEmailAddress() {
        return emailAddress;
    }


    /**
     * @return double return the CreditLimit
     */
    public double getCreditLimit() {
        return creditLimit;
    }


}
