public class VipCustomer {

    public static void main(String[] args) {
        
    }
    String name;
    String emailAddress;
    double CreditLimit;
    
    public VipCustomer(){
        this("default", "default email", "0.0");

    }

    public VipCustomer(String name, String emailAddress, double creditLimit){
        this.name = name;
        this.emailAddress = emailAddress;
        this.CreditLimit = creditLimit;

    }

    public VipCustomer(String string, String string2, String string3) {
    }
}
