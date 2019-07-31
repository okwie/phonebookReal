package PhoneBook;

public class Address {
	
	//add data fields
	private String street;
	private String city;
	private String state;
	private String zipcode;
	//add default constructor
	public Address() {
		
	}
	//add parameterized constructor
	public Address(String street, String city, String state, String zipcode) {
		this.street=street;
		this.city=city;
		this.state=state;
		this.zipcode=zipcode;
	}
	//create getter
	public String getStreet() {
		return this.street;
	}
	//create setter
	public void setStreet(String street) {
		this.street=street;
	}
	//continue getters and setters for all the parameters
	public String getCity() {
		return this.city;
	}
	public void setCity(String city) {
		this.city=city;
	}
	public String getState() {
		return this.state;
	}
	public void setState(String state) {
		this.state=state;
	}
	public String getZipcode() {
		return this.zipcode;
	}
	public void setZipcode(String zipcode) {
		this.zipcode=zipcode;
	}
	
	

}
