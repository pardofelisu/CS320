//tashi anderson

package Contact;

import java.util.ArrayList;

public class ContactService{
	//Array list will hold contacts
	int counter = 0;//counter for loops
	
	public ArrayList<Contact> contactList = new ArrayList<Contact>();
	
	public void addContact(String firstName, String lastName, String number, String address) {//adds and assigns contacts
		Contact contact = new Contact(firstName, lastName, number, address);
		contactList.add(contact);
	}
	
	//returns contact
	public Contact getContact(String contactID) {
		Contact contact = new Contact(null, null, null, null);
		for (int counter = 0; counter < contactList.size(); counter++) {
			if (contactList.get(counter).getID().contentEquals(contactID)) {
				contact = contactList.get(counter);
				
			}
		}
		return contact;
	}
	//delete contact
	public void deleteContact(String contactID) {
		//Contact contact = new Contact(null, null, null, null);
		for (int counter = 0; counter < contactList.size(); counter++) {
			if (contactList.get(counter).getID().contentEquals(contactID)) {
					contactList.remove(counter);
				break;
				
			}
		}
		
	}
	// update first name
		public void updateFirstName(String updatedString, String contactID) {
			for (int counter = 0; counter < contactList.size(); counter++) {
				if (contactList.get(counter).getID().equals(contactID)) {
						contactList.get(counter).setFirstName(updatedString);
					break;
				}
			
			}
		}

		// update last name
		public void updateLastName(String updatedString, String contactID) {
			for (int counter = 0; counter < contactList.size(); counter++) {
				if (contactList.get(counter).getID().equals(contactID)) {
						contactList.get(counter).setLastName(updatedString);
					break;
				}
				
			}
		}

		// update phone number
		public void updateNumber(String updatedString, String contactID) {
			for (int counter = 0; counter < contactList.size(); counter++) {
				if (contactList.get(counter).getID().equals(contactID)) {
						contactList.get(counter).setNumber(updatedString);
					break;
				
				}
			}
		}

		// update address
		public void updateAddress(String updatedString, String contactID) {
			for (int counter = 0; counter < contactList.size(); counter++) {
				if (contactList.get(counter).getID().equals(contactID)) {
						contactList.get(counter).setAddress(updatedString);
					break;
				
				
				}
			}
		}
	
	
}