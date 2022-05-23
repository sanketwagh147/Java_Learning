package mobile_phones;

public class Contact {

    private String name;
    private String phoneNumber;


    public  Contact(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return this.name;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }
     
    public static Contact createContact(String name, String phoneNumber) {
        return new Contact(name, phoneNumber);
    }

    private int findContact(Contact contact) {
        return this.myContacts.indexOf(contact);

    }

    private int findContact(String contactName){
        for (int i = 0; i < this.myContacts.size(); i ++) {
            Contact contact = this.myContacts.get(i);
            if (contact.getName().equals(contactName)){
                return i;
            }

        }
        return -1;
    }

    public boolean updateContact(Contact oldContact, Contact newContact) {
        int foundPosition = findContact(oldContact);
        if (foundPosition <0 )  {
            System.out.println(oldContact.getName() + " , was not found.");
            return false;
        }
        this.myContacts.set(foundPosition, newContact);
        System.out.println(oldContact.getName() + ", was replace with " + newContact.getName());
        return true;
    }

    public String queryContact(String contact){
        if (findContact(contact) >=0 ){
            return contact.getName();
        }
        return null;
    }

    public boolean removeContact(Contact contact) {
        int foundPosition = findContact(contact);
        if (foundPosition <0 )  {
            System.out.println(contact.getName() + " , was not found.");
            return false;
        }
        this.myContacts.remove(foundPosition);
        System.out.println(contact.getName() + ", was removed");

        
    }

    

    
}
