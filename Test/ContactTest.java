package Test;

import org.junit.jupiter.api.Test;

import Contact.Contact;
import Contact.ContactService;

import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;

public class ContactTest {
	@DisplayName("contact ID length test")
	@Test
	void testIDLength() {
		
		Contact contact = new Contact("meow", "reow", "777", "333 blv");
			if (contact.getID().length() > 10) {
				fail("Contact ID > 10 characters");
		}
		
	}
	
	@DisplayName("first name test")
	@Test
	void testFirstNameLength() {
		
		Contact contact = new Contact("meowmeowmeowmeowmeowmeowmeow", "reow", "777", "333 blv");
			if (contact.getFirstName().length() > 10) {
				fail("First name > 10 characters");
		}
		
	}
	
	@DisplayName("last name length test")
	@Test
	void testLastNameLength() {
		
		Contact contact = new Contact("meow", "reowreowreowreowreowreowroew", "777", "333 blv");
			if (contact.getLastName().length() > 10) {
				fail("last name > 10 characters");
		}
		
	}
	
	@DisplayName("number length test")
	@Test
	void testNumberLength() {
		
		Contact contact = new Contact("meow", "reow", "777777777777777777777", "333 blv");
			if (contact.getNumber().length() != 10) {
				fail("number != 10 characters");
		}
		
	}
	
	@DisplayName("address length test")
	@Test
	void testAddressLength() {
		
		Contact contact = new Contact("meow", "reow", "777", "333 blv so err what do i do now that jutil isnt working helppls im sorry");
			if (contact.getAddress().length() > 30) {
				fail("address > 30 characters");
		}
		
	}
	
	@DisplayName("first name null test")
	@Test
	void testFirstNameNull() {
		
		Contact contact = new Contact(null, "reow", "777", "333 blv");
			assertNotNull(contact.getFirstName(), "First name is null");
		
	}
	
	@DisplayName("last name null test")
	@Test
	void testLastNameNull() {
		
		Contact contact = new Contact("mewo", null, "777", "333 blv");
			assertNotNull(contact.getLastName(), "last name is null");
		
	}
	
	@DisplayName("number null test")
	@Test
	void testNumberNull() {
		
		Contact contact = new Contact("meow", "reow", null, "333 blv");
			assertNotNull(contact.getNumber(), "number is null");
		
	}
	
	@DisplayName("address null test")
	@Test
	void testAddressNull() {
		
		Contact contact = new Contact("meow", "reow", "777", null);
			assertNotNull(contact.getAddress(), "address is null");
		
	}

}