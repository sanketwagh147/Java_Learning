import java.util.Scanner;

import com.sanket.Contact;
import com.sanket.MobilePhone;

public class App {
    private static final String CONTACT_NOT_FOUND = "Contact not found";
    private static final String ENTER_EXISTING_CONTACT_NAME = "Enter existing contact name";
    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone("9762151814");

    public static void main(String[] args){
        boolean quit = false;
        startPhone();
        printActions();
        while (!quit){
            System.out.println("\n Enter action (6 to show available actions");
            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action){
                case 0:System.out.println("\n Shutting down..");
                    quit = true;
                    break;

                case 1:
                    mobilePhone.printContacts();
                    break;
                
                case 2:
                    addNewContact();
                    break;
                
                case 3:
                    updateContact();
                    break;

                case 4:
                    removeContact();
                    break;
                
                case 5:
                    queryContact();
                    break;
                
                case 6:
                    printActions();
                    break;
                default:
                    break;

            }

        }
    }

    private static void addNewContact(){
        System.out.println("Enter new contact name:");
        String name = scanner.nextLine();
        System.out.println("Enter phone number: "); 
        String phone = scanner.nextLine();
        Contact newContact = Contact.createContact(name, phone);
        if(mobilePhone.addNewContact(newContact)){
            System.out.println("New contact added: name = " + name + " ,phone= " + phone);
        }else{
            System.out.println("Cannot add, " + name + " already on file");
        }
    }

    private static void updateContact(){
        System.out.println(ENTER_EXISTING_CONTACT_NAME);
        String name = scanner.nextLine();
        Contact existingContactRecord =  mobilePhone.queryContact(name);
        if (existingContactRecord == null ){
            System.out.println(CONTACT_NOT_FOUND);
            return;
        }
        System.out.println("Enter new contact name: ");
        String newName = scanner.nextLine();
        System.out.println("Enter new contact phone number: ");
        String newNumber = scanner.nextLine();
        Contact newContact = Contact.createContact(newName, newNumber);
        if ( mobilePhone.updateContact(existingContactRecord, newContact) ){
            System.out.println("Successfully updated record");
        } else {
            System.out.println("Error updating recording");
        }
    }
    private static void removeContact(){
        System.out.println(ENTER_EXISTING_CONTACT_NAME);
        String name = scanner.nextLine();
        Contact existingContactRecord =  mobilePhone.queryContact(name);
        if (existingContactRecord == null ){
            System.out.println(CONTACT_NOT_FOUND);
            return;
        }
        if (mobilePhone.removeContact(existingContactRecord)){
            System.out.println("Successfully deleted");
        } else {
            System.out.println("Error deleting record");
        }
    }

    private static void queryContact(){
        System.out.println(ENTER_EXISTING_CONTACT_NAME);
        String name = scanner.nextLine();
        Contact existingContactRecord =  mobilePhone.queryContact(name);
        if (existingContactRecord == null ){
            System.out.println(CONTACT_NOT_FOUND);
            return;
        }
        System.out.println("Name: " + existingContactRecord.getName() + " Phone Number is " + existingContactRecord.getPhoneNumber());
        if (mobilePhone.removeContact(existingContactRecord)){
            System.out.println("Successfully deleted");
        } else {
            System.out.println("Error deleting record");
        }
    }

    private static void startPhone(){
        System.out.println("Starting phone...");
    }

    private static void printActions(){
        System.out.println("\nAvailable Options:\nPress");
        System.out.println("0 - to shutdown\n"+
                            "1 - to print contacts\n" +
                            "2 - to add new contacts\n" +
                            "3 - to update existing contacts\n" +
                            "4 - to remove existing contacts\n" + 
                            "5 - to query if existing contacts exists\n" +
                            "6 - to print a list of available actions \n");
        System.out.println("Choose your action");
    }
}
