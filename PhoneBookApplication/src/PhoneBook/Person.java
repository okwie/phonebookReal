package PhoneBook;

public class Person {
	//add data fields
	private String firstName;
	private String lastName;
	private String phoneNumber;
	private Address address;
	//add default constructor
	public Person() {
		
	}
	//parameterized constructor
	public Person(String firstName, String lastName, String phoneNumber, Address address) {
		this.firstName= firstName;
		this.lastName=lastName;
		this.phoneNumber=phoneNumber;
		this.address=address;
		
	}
	//getters & setters
	public String getFirstName() {
		return this.firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return this.lastName;
	}
	public void setLastName(String lastName) {
		this.lastName=lastName;
	}
	public String getPhoneNumber() {
		return this.phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber=phoneNumber;
	}
	public Address getAddress() {
		return this.address;
	}
	public void setAddress(Address address) {
		this.address=address;
	}
	
	public String toString() {
		return "First Name: " + this.firstName +"\nLast Name:  "+this.lastName+"\nPhone Number:  "+this.phoneNumber + "\nStreet: "+this.address.getStreet()
		+ "\nCity: " + this.address.getCity() + "\nState: "+ this.address.getState()+ "\nZipcode: "+ this.address.getZipcode(); 
	}
	
}
