import java.util.ArrayList;
import java.util.Scanner;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

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


	public class mutipleAddressBook {
   	List<contactInfo> list = new ArrayList<contactInfo>();
    	Scanner input = new Scanner(System.in);
    	int index;
    	String firstName;
    	String name;

 		public boolean checkName() {
      	System.out.println("Enter first name");
      	firstName = input.nextLine();
      	for (index = 0; index<contacts.size(); index++) {
         	if(firstName.equals(contacts.get(index).getFirstName())) {
                System.out.println("contact available");
                return true;
            }
        	}
        			 return false;
		}
	
	public void addContact() {
				System.out.print("Enter first name: ");
            String firstName = input.nextLine();
        		System.out.print("Enter last name: ");
            String lastName = input.nextLine();
            System.out.print("Enter state: ");
            String state = input.nextLine();
            System.out.print("Enter city: ");
            String city = input.nextLine();
            System.out.print("Enter zip: ");
            String zip = input.nextLine();
            System.out.print("Enter phone number: ");
            String phoneNum = input.nextLine();
            System.out.print("Enter email ID: ");
            String emailId = input.nextLine();
            contacts.add(new ContactInfo(firstName, lastName, state, city, zip, phoneNum, emailId));
        }
    }

		 public void viewPersonWithCity() {
        System.out.println("Enter the city: " );
        String city = input.nextLine();
        System.out.println("Name of person is:" );
        List<ContactInfo> cities = contacts.stream().sorted(Comparator.comparing(contactInfo::getFirstName)).filter(contacts -> contacts.getCity().equals(city)).collect(Collectors.toList());
        }

		 public void contactSortByPersonName() {
        List<contactInfo> list = contacts.stream().sorted(Comparator.comparing(contactInfo::getFirstName)).collect(Collectors.toList());
        System.out.println(list);
    }

   	 public void contactSortByCity() {
	     List<contactInfo> list = contacts.stream().sorted(Comparator.comparing(contactInfo::getCity)).collect(Collectors.toList());
        System.out.println(list);
