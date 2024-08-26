package Test;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;//cannot get junit to work on pc or virtual lab :(

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.AfterEach;

import Contact.Contact;
import Contact.ContactService;

import org.junit.jupiter.api.Order;

public class ContactServiceTest{

@DisplayName("Test addContact")
@Test
void testAddContact() {
	ContactService test = new ContactService();
	
	service.addContact("meow", "meyouw", "5555555555", "44 meow lane");
	service.displayContactList();
	assertNotNull(service.getContact("0"), "Contact was not added correctly.");
}

@DisplayName("Test new first name")
@Test
void testUpdateFirstName() {
	ContactService test = new ContactService();
	
	service.addContact("meow", "meyouw", "5555555555", "44 meow lane");
	service.updateFirstName("Bark", "33");
	service.displayContactList();
	assertEquals("Bark", service.getContact("33").getFirstName(), "First name was not updated.");
}

@DisplayName("Test new last name")
@Test
void testUpdateLastName() {
	ContactService test = new ContactService();
	
	service.addContact("meow", "meyouw", "5555555555", "44 meow lane");
	service.updateLastName("Bark", "33");
	service.displayContactList();
	assertEquals("Bark", service.getContact("33").getLastName(), "Last name was not updated.");
}

@DisplayName("Test new address")
@Test
void testUpdateAddress() {
	ContactService test = new ContactService();
	
	service.addContact("meow", "meyouw", "5555555555", "44 meow lane");
	service.updateAddress("Bark", "33");
	service.displayContactList();
	assertEquals("Bark", service.getContact("33").getAddress(), "Address was not updated.");
}

@DisplayName("Test new number")
@Test
void testUpdateNumber() {
	ContactService test = new ContactService();
	
	service.addContact("meow", "meyouw", "5555555555", "44 meow lane");
	service.updateNumber("5555555555", "33");
	service.displayContactList();
	assertEquals("5555555555", service.getContact("33").getNumber(), "Number was not updated.");
}

@DisplayName("Test contact deletion")
@Test
void testDeleteContact() {
	ContactService test = new ContactService();
	
	service.addContact("meow", "meyouw", "5555555555", "44 meow lane");
	ArrayList<Contact> contactListEmpty = new ArrayList<Contact>();
	service.deleteContact("33");
	service.displayContactList();
	assertEquals(service.contactList, contactListEmpty, "Contact not deleted");
}
}