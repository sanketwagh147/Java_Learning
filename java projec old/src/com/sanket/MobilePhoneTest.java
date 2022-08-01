package com.sanket;

import org.junit.Test;

public class MobilePhoneTest {
    MobilePhone mp = new MobilePhone("9762151814");
    @Test
    public void testAddNewContact() {
        Contact contact = new Contact("sukanya", "8885674018");
        System.out.println("hola");
        mp.addNewContact(contact);

        
        
        
        
    }
}
