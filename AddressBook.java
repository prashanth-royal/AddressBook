import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {
    static ArrayList<contactInfo> user = new ArrayList<contactInfo>();
    int flag = 0;

    public static void addContact() {
        contactInfo c1 = new contactInfo();
        c1.getInput();
        user.add(c1);
        System.out.println(user);
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Address Book");

        AddressBook.addContact();

    }


	public class contactInfo {
		public String firstName;
		public String lastName;
		public String state;
		public String city;
		public String zip;
		public String phoneNum;
		public String emailId;
		String inputFirstName, inputLastName, inputState, inputCity, inputZip, inputPhoneNum, inputEmailId;

    public void getInput() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter First Name");
        inputFirstName = scan.next();

        System.out.println("Enter Last Name");
        inputLastName = scan.next();

        System.out.println("City");
        inputState = scan.next();

        System.out.println("State");
        inputCity = scan.next();

        System.out.println("Zip");
        inputZip = scan.next();

        System.out.println("Phone Number");
        inputPhoneNum = scan.next();

        System.out.println("EmailId");
        inputEmailId = scan.next();


    }

    @Override
    public String toString() {
        return "AddressBook{" +
                "FirstName='" + inputFirstName + 
                ", LastName='" + inputLastName + 
                ", City='" + inputCity +
                ", State='" + inputState +
                ", Zip='" + inputZip + 
                ", PhoneNum='" + inputPhoneNum + 
                ", EmailId='" + inputEmailId + 
                "}";
    }

    contactInfo() {
        System.out.println("Welcome to Address Book");
    }

    contactInfo(String firstName, String lastName, String state, String city, String zip, String phoneNum, String emailId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.city = state;
        this.state = city;
        this.zip = zip;
        this.phoneNum = phoneNum;
        this.emailId = emailId;
    	}
	}
}
