import java.util.ArrayList;
import java.util.Scanner;

	public class contactInfo {
		public String firstName;
		public String lastName;
		public String state;
		public String city;
		public String zip;
		public String phoneNum;
		public String emailId;
		String inputFirstName, inputLastName, inputState, inputCity, inputZip, inputPhoneNum, inputEmailId;

		   public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to Address Book");

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
    contactInfo(String firstName, String lastName, String state, String city, String zip, String phoneNum, String emailId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.city = state;
        this.state = city;
        this.zip = zip;
        this.phoneNum = phoneNum;
        this.emailId = emailId;
  	}
		public class AddressBookSystem {
    static ArrayList<contactInfo> user = new ArrayList<contactInfo>();
    public static void addContact() {
        contactInfo c1 = new contactInfo();
        c1.getInput();
        user.add(c1);
        System.out.println(user);
    }
    public static void chooseOption() {
        Scanner scan = new Scanner(System.in);
        System.out.println("choose option \n 1:add contact \n 2:edit contact \n 3:delete contact" );
        int option = scan.nextInt();
        switch (option) {
            case 1:
                AddressBookSystem.addContact();
                System.out.println("If you want to continue then press 1 or press 2 if you want to quit");
                int num = scan.nextInt();
                if (num == 1) {
                    chooseOption();
                } else {
                  break;
                }
            case 2:
                editContact();
	               break;

                  default:
                System.out.println("choose option 1 or 2");
                system.chooseOption();
                break;
        }

    }
    public static void editContact() {

        Scanner scan = new Scanner(System.in);
        System.out.println("2");
        System.out.println("Enter name of contact to edit");
        String userName = scan.next();
        int count = 0;
        for (int i = 0; i < user.size(); i++) {
            if (user.get(i).inputFirstName.equalsIgnoreCase(userName)) {
                count++;
                System.out.println("contact selected");
                System.out.println("what you want to edit in contact \n 1.firstName \n 2.lastName \n 3.state\n 4.city\n 5.zip \n 6.phoneNum \n 7.emailId" );
                int option = scan.nextInt();
                switch (option) {
                    case 1:
                        System.out.println("Enter First Name");
                        String name = scan.next();
                        user.get(i).inputFirstName = name;
                        System.out.println("Updated First Name is");
                        System.out.println(user);
                        break;
                    case 2:
                        System.out.println("Enter Last Name");
                        name = scan.next();
                        user.get(i).inputLastName = name;
                        System.out.println("Updated Last Name is");
                        System.out.println(user);
                        break;
                    case 3:
                        System.out.println("Enter State");
                        name = scan.next();
                        user.get(i).inputState = name;
                        System.out.println("Updated State is");
                        System.out.println(user);
                        break;
                    case 4:
                        System.out.println("Enter City");
                        name = scan.next();
                        user.get(i).inputCity = name;
                        System.out.println("Updated City is");
                        System.out.println(user);
                        break;
                    case 5:
                        System.out.println("Enter Zip");
                        name = scan.next();
                        user.get(i).inputZip = name;
                        System.out.println("Updated Zip is");
                        System.out.println(user);
                        break;
                    case 6:
                        System.out.println("Enter Phone Num");
                        name = scan.next();
                        user.get(i).inputPhoneNum = name;
                        System.out.println("Updated Number is");
                        System.out.println(user);
                        break;
                    case 7:
                        System.out.println("Enter EmailId");
                        name = scan.next();
                        user.get(i).inputEmailId = name;
                        System.out.println("Updated EmailId is");
                        System.out.println(user);
                        break;
                    default:
                        System.out.println("select any option from 1 to 7");
                        break;
                }
            }
        }
        if (count == 0) {
            System.out.println("No Contact");
	}
 public static void addMultipleContact() {
        int count = 0;
        String temp[] = new String[dictionary.size()];
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter name for dictionary");
        String inputDictionary = scan.next();
        for (String s : dictionary.keySet()) {
            temp[count] = s;
            count++;
        }
        for (int i = 0; i < count; i++) {
            if (temp[i].equalsIgnoreCase(inputDictionary)) {
                //System.out.println("1");
                System.out.println("contact already exit please select another");
                addMultipleContact();
            }
        }
        AddressBookSystem.chooseOption();
        dictionary.put(inputDictionary, user);
        System.out.println(dictionary);
    }

    public static void getUserDictionary() {
        Scanner scan = new Scanner(System.in);
        System.out.println(" to add another contact select 1 and select 0 to quit");
        int choice = scan.nextInt();
        if (choice == 1) {
            AddressBookSystem.addMultipleContact();
            user.clear();
            getUserDictionary();
        } else {
            System.out.println("Quit");
        }
   }
}
}
