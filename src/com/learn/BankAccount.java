package com.learn;
public class BankAccount {

    public static void main(String[] args) {
        
        /*
        BankAccount sanket = new BankAccount();
        sanket.setBalance(100);
        sanket.setAccountNumber(2008123);
        sanket.setEmail("test@eami.com");
        sanket.setCustomerName("sanket Wagh");
        sanket.setPhoneNumber("97621511814");
        System.out.println(sanket.getBalance());
        System.out.println(sanket.getEmail());
        System.out.println(sanket.getPhoneNumber());
        System.out.println(sanket.getAccountNumber());
        System.out.println(sanket.getCustomerName());
        sanket.depositFunds(1000);
        System.out.println(sanket.getBalance());
        sanket.withdrawFunds(1);
        System.out.println(sanket.getBalance());

        BankAccount vishal = new BankAccount(123, 10, "vishal", "vish@t.com", "9762");

        System.out.println(vishal.getAccountNumber());        
        System.out.println(vishal.getCustomerName());        
        System.out.println(vishal.getEmail());        
        BankAccount suyog = new BankAccount();
        suyog.getCustomerName();
        suyog.getAccountNumber();
        suyog.getPhoneNumber();
        System.out.println(suyog.getAccountNumber());
        System.out.println(suyog.getPhoneNumber());
        */
    }


    private int accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public BankAccount(){
        this(0000, 1.0, "def name", "def email", "def phone");  // sets defaul values if parameters are not mentioned
        System.out.println("Initializing constructors");

    }
    public BankAccount(int accountNumber, double balance, String customerName, String customerEmail, String customerPhoneNumber){
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = customerEmail;
        this.phoneNumber = customerPhoneNumber;

    }

    public void setAccountNumber(int accountNumber){
        this.accountNumber = accountNumber;
    }

    public int getAccountNumber(){
        return accountNumber;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }

    public double getBalance(){
        return balance;
    }

    public void setCustomerName(String customerName){
        this. customerName = customerName;
    }

    public String getCustomerName(){
        return customerName;
    }


    public void setEmail(String email){
        this.email = email;
    }

    public String getEmail(){
        return email;
    }

    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber(){
        return phoneNumber;
    }

    public void depositFunds(double amount){
        balance += amount;
    }
    public void withdrawFunds(double amount){
        if (balance >= amount){
        balance -= amount;
        } else {
        System.out.println("Insufficient Balance");
        }
    }
    
}
