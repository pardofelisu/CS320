//Tashi Anderson
//ContactService milestone

package Contact;

public class Contact{
	private String contactID;
	private String firstName;
	private String lastName;
	private String number;
	private String address;
	
	//Various validations for string lengths !> 10 or null
	
	public Contact(String firstName, String lastName, String number, String address) {
		// TODO Auto-generated constructor stub
	}

	@SuppressWarnings("unused")
	private final boolean validID(String contactID) {//???
		if(contactID == null || contactID.length() > 10) {
			System.out.println("Invalid ID");
			return false;
		}
		return true;
	}
	
	private final boolean validFirstName(String firstName) {
		if(firstName == null || firstName.length() > 10) {
			System.out.println("Invalid first name");
			return false;
		}
		return true;
	}
	
	private final boolean validLastName(String lastName) {
		if(lastName == null || lastName.length() > 10) {
			System.out.println("Invalid last name");
			return false;
		}
		return true;
	}
	
	//validates the phone number to be exactly 10 digits and not null
	private final boolean validNumber(String number) {
		if(number == null || number.length() != 10) {
			System.out.println("Invalid phone number");
			return false;
		}
		return true;
	}
	
	//validates address to not be > 30 characters and is not null
	private final boolean validAddress(String address) {
		if(address == null || address.length() > 10) {
			System.out.println("Invalid address");
			return false;
		}
		return true;
	}
	
	//public Contact(String contactID, String firstName, String lastName, String number, String address) {
		
	//}
	//getter that returns contact ID, cannot be updated
	public String getID() {
		return contactID;
	}
	//getters
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	public String getNumber() {
		return number;
	}
	public String getAddress() {
		return address;
	}
	
	//setters
	public void setFirstName(String firstName) {
		validFirstName(this.firstName = firstName);
	}
	
	public void setLastName(String lastName) {
		validLastName(this.lastName = lastName);
	}
	
	public void setNumber(String number) {
		validNumber(this.number = number);
}
	
	public void setAddress(String address) {
		validAddress(this.address = address);
	
}	
}
	


