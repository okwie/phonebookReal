package PhoneBook;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Application {
	static Scanner in = new Scanner(System.in);
	public static int currentInt = 20;
	public static Person [] source = new Person [currentInt] ;
	
	public static Person [] addLine(Person e) {
		source[currentInt]=source[source.length+1];
		currentInt++;
		return source;
	}
	public static int currentEntry = 0;
	public static Person[] add(Person e) {
		source[currentEntry]=e;
		currentEntry++;
		return source;
	}
	public static void display() {
		
		
	}
	public static void main(String[] args) throws IOException {
			main();
		}
	public static void main() throws IOException {
			System.out.println("\nEnter an option:" + "\n1. Add contact\n2. Delete contact\n3. Search by first name\n4. Search by full name \n"+
			"5. Search by city\n6. Update contact phone number\n7. Search by phone number\n8. Display contacts\n9. Exit");
				String options = in.nextLine();
				switch(options) {
				
				case "1":
					addContact();
					main();
					break;
				case "2":
					deleteContact();
					main();
					break;
				case "3":
					searchBy();
					main();
					break;
				case "7":
					searchByPhone();
					main();
					break;
				case "5":
					searchByCity();
					main();
					break;
				case "6":
					updateNumber();
					main();
					break;
				case "4":
					searchByFull();
					main();
					break;
				case "8":
					displayContacts();
					main();
				case "9":
					break;
					
				default: 
					System.out.println("Not a valid option, please try again.");
					main();
			}
	}
	public static void displayContacts() {
		
		//Arrays.sort(source);
		for (Person array : source) 
			try
			{
				if (array!=null) {
					System.out.println(array);
				}
				else {
					break;
				}
			}
		catch (NullPointerException e) {
		
		}
			
		}
	public static void addContact() throws IOException
		{
			System.out.println("Add entry: ");
			String input = in.nextLine();
			
			String[] splitted = input.split(", ");
			String street = splitted[1];
			String city = splitted[2];
			String state = splitted[3];
			String zip = splitted[4];
			String phoneNumber = splitted[5];
			String name = splitted[0];
			String[] fullName= name.split(" ");
			String firstName= fullName[0];
			String lastName= fullName[fullName.length - 1];
			
			Address address = new Address(street, city, state, zip);
			Person contact = new Person(firstName, lastName, phoneNumber, address);
			Person e = contact;
			
			source = add(e);
			System.out.println(e.getFirstName()+" "+e.getLastName()+" has been added to your contacts!");
		}
	
	public static void searchBy() throws IOException {
		System.out.println("Enter First Name:");
		String input = in.nextLine();
		for ( Person array : source) {
			try {
				if (array.getFirstName().equals(input))
					System.out.print(array.toString() + "\n");	
				}
			catch (NullPointerException e) {
				break;
			}
		}	
	}
	public static void searchByPhone() throws IOException {
		System.out.println("Enter Phone:");
		String input = in.nextLine();
		for (Person array : source) {
			try {
				if(array.getPhoneNumber().equals(input))
					System.out.println("Here are your results for " + array.getPhoneNumber());
				System.out.print(array+"\n");
				}
			catch (NullPointerException e) {
				break;
			}
		}
	}
	public static void searchByCity() throws IOException {
		System.out.println("Enter City:");
		String input = in.nextLine();
		for (Person array : source) {
			try {
				if (array.getAddress().getCity().equals(input))
					System.out.print(array.toString() + "\n");	
				}
			catch (NullPointerException e) {
				break;
			}
		}
	}
	public static void updateNumber() throws IOException {
		System.out.print("Enter current phone number of contact to update:\n");
		String first = in.nextLine();
		for (Person array: source) {
			if (array.getPhoneNumber().equals(first)) {
				System.out.println("Enter new phone number: ");
				String number = in.nextLine();
				array.setPhoneNumber(number);
				System.out.println(array);
				break;
			}
		}	
	}
	public static void deleteContact() throws IOException {
		System.out.print("Enter phone number of contact to delete:\n");
		String first = in.nextLine();		
		for (Person array: source) {
			if (array.getPhoneNumber().equals(first)) {
				for (int i = 0; i < source.length; i++) {
					if (source[i]==array) {
						for (int j = i; j < source.length - 1; j++) {
							source[j]=source[j +1];
						}
					}
				}
				System.out.println("Deleted " + array.getFirstName() + " " + array.getLastName() + ".");
					break;
			}
		}	
	}
	public static void searchByFull() throws IOException {
		System.out.println("Enter Full Name:");
		String input = in.nextLine();
		String[] input1 = input.split(" ");
		String firstName= input1[0];
		String lastName= input1[input1.length - 1];
		for ( Person array : source) {
			try {
				if (array.getFirstName().equals(firstName)&&array.getLastName().equals(lastName))
					System.out.print(array + "\n");	
				}
			catch (NullPointerException e) {
				break;
			}
		}	
	}
}




