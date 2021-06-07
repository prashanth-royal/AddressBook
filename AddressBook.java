
import java.util.List;
import java.util.Scanner;

public class AddressBook {
		Scanner input = new Scanner(System.in);

		Contact createContact() {
			Person p = new Person();
        	System.out.print("Enter First Name: ");
        	String firstName = input.next();
        	System.out.print("Enter Last Name: ");
        	String lastName = input.next();
        	System.out.print("Enter Address: ");
        	String address = input.next();
        	System.out.print("Enter City: ");
        	String city = input.next();
        	System.out.print("Enter State: ");
        	String state = input.next();
        	System.out.print("Enter Zip: ");
        	int zip = input.nextInt();
        	System.out.print("Enter Phone Number: ");
        	String phoneNum = input.next();
        	p.createContact(firstName,lastName,address,city,state,zip,phoneNum);
        	return p;
			}
}

