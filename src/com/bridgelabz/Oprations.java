package com.bridgelabz;

import java.util.*;
import java.util.stream.Collectors;


public class Oprations implements AddressBookInterFace {
    static ArrayList<String> contactsDetails = new ArrayList();

    //static HashMap<String, Object> AddressBook = new HashMap<>();
    static Scanner scanner = new Scanner(System.in);
    static Contacts contacts = new Contacts();
    static int counter;


    static HashMap<String, ArrayList<Contacts>> hashmap = new HashMap<>();

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    /*
    method For Adding Multiple Address Book.
     */
    public void AddressBook(Oprations oprations) {
        int ans;
        do {
            System.out.println("Enter Name For Address Book");
            String AddressBookName = scanner.next();
            contactsDetails.add(AddressBookName);
            // addressBookSystem.MenuOption(addressBookSystem,contactsDetails);
            if (hashmap.containsKey(AddressBookName)) {
                System.out.println("The AddressBook already contains");
                break;
            } else {
                ArrayList<Contacts> contactDetails = new ArrayList<>();
                oprations.MenuOption(oprations, contactDetails);
                hashmap.put(AddressBookName, contactDetails);
            }
            System.out.println("AddressBook Added" + hashmap + " ");
            System.out.println("Do You Want To Continue in AddressBook the Press 1 ");
            ans = scanner.nextInt();
        } while (ans == 1);
    }

    public void displayAddressBook() {
        System.out.println("AddressBooks Are:" + hashmap + " ");
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


    public static ArrayList<Contacts> addDetails(ArrayList<Contacts> contactDetails) {


        Contacts info = new Contacts();
        if (contactDetails.size() == 0) {
            System.out.println("Enter first name: ");
            info.setFirstName(scanner.next());
            System.out.println("Enter last name: ");
            info.setLastName(scanner.next());
            System.out.println("Enter address: ");
            info.setAddress(scanner.next());
            System.out.println("Enter city name: ");
            info.setCity(scanner.next());
            System.out.println("Enter state name: ");
            info.setState(scanner.next());
            System.out.println("Enter zip code: ");
            info.setZipCode(scanner.next());
            System.out.println("Enter contact no.: ");
            info.setContactNo(scanner.next());
            System.out.println("Enter email: ");
            info.setEmail(scanner.next());
            contactDetails.add(info);
            System.out.println("Contact details added!");
            return contactDetails;
        } else {
            System.out.println("Enter First Name");
            String firstname = scanner.next();
            /*
            For searching the duplicate names in arraylist
             */
            for (Contacts contact : contactDetails) {
                /*
                checking the duplicate name.
                 */
                if (contact.getFirstName().equals(firstname)) {
                    System.out.print("Name already present\n");
                } else {
                    info.setFirstName(firstname);
                    System.out.println("Enter last name: ");
                    info.setLastName(scanner.next());
                    System.out.println("Enter address: ");
                    info.setAddress(scanner.next());
                    System.out.println("Enter city name: ");
                    info.setCity(scanner.next());
                    System.out.println("Enter state name: ");
                    info.setState(scanner.next());
                    System.out.println("Enter zip code: ");
                    info.setZipCode(scanner.next());
                    System.out.println("Enter contact no.: ");
                    info.setContactNo(scanner.next());
                    System.out.println("Enter email: ");
                    info.setEmail(scanner.next());
                    contactDetails.add(info);
                    System.out.println("Contact details added!");
                    return contactDetails;
                }
            }
        }
        return contactDetails;

                Contacts info = new Contacts();
                System.out.println("Enter first name: ");
                info.setFirstName(scanner.next());
                System.out.println("Enter last name: ");
                info.setLastName(scanner.next());
                System.out.println("Enter address: ");
                info.setAddress(scanner.next());
                System.out.println("Enter city name: ");
                info.setCity(scanner.next());
                System.out.println("Enter state name: ");
                info.setState(scanner.next());
                System.out.println("Enter zip code: ");
                info.setZipCode(scanner.next());
                System.out.println("Enter contact no.: ");
                info.setContactNo(scanner.next());
                System.out.println("Enter email: ");
                info.setEmail(scanner.next());
                contactDetails.add(info);
                System.out.println("Contact details added!");
                 return contactDetails;

    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    /*
    Displaying All Content From ArrayList.
     */
    public void displayContacts(ArrayList<Contacts> contactDetails) {
        for (Contacts contactsDetail : contactDetails) {
            System.out.println("-----------------------***************************-----------------------------------");
            System.out.print(contactsDetail + " ");
        }
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        /*
        Method For Modifying Person Details .
         */
    public void editDetails(ArrayList<Contacts> contactDetails) {
        System.out.println("Enter First Name for which you want to modify info: ");
        String searchFirstName = scanner.next();
        /*  Iterate to search for first name */
        for (Contacts contact : contactDetails) {
            /*  compare first name
             *   if matches display menu for edit
             *   else display no record found message
             */
            if (contact.getFirstName().equals(searchFirstName)) {
                System.out.println("Enter the number to edit respective info: ");
                System.out.println("1. First Name \n2. Last Name \n3. Address \n4. City " + "\n5. State \n6. Zip Code \n7. Contact No \n8. Email");
                int index = scanner.nextInt();
                System.out.println("Enter value to update: ");
                switch (index) {
                    case 1:
                        String updatedFirstName = scanner.next();
                        contact.setFirstName(updatedFirstName);
                        break;
                    case 2:
                        String updatedLastName = scanner.next();
                        contact.setLastName(updatedLastName);
                        break;
                    case 3:
                        String updatedAddress = scanner.next();
                        contact.setAddress(updatedAddress);
                        break;
                    case 4:
                        String updatedCity = scanner.next();
                        contact.setCity(updatedCity);
                        break;
                    case 5:
                        String updatedState = scanner.next();
                        contact.setState(updatedState);
                        break;
                    case 6:
                        String updatedZipCode = scanner.next();
                        contact.setZipCode(updatedZipCode);
                        break;
                    case 7:
                        String updatedContact = scanner.next();
                        contact.setContactNo(updatedContact);
                        break;
                    case 8:
                        String updatedEmail = scanner.next();
                        contact.setEmail(updatedEmail);
                        break;
                    default:
                        System.out.println("Invalid number!");
                }
                /*  Display updated contact */
                System.out.println("Details updated");
            } else {
                System.out.println("No record found!");
            }
        }
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        /*
        Delete The Person From Arraylist.
         */
    public void deleteContact(ArrayList<Contacts> contactDetails) {
        System.out.println("Enter email for which you want to delete contact: ");
        String searchEmail = scanner.next();
        Iterator<Contacts> removeContact = contactDetails.iterator();
        /*  Checking the next element where
         *   condition holds true till there is single element
         *   in the List using hasNext() method
         */
        while (removeContact.hasNext()) {
            /*  Move cursor to next element */
            Contacts nextElement = removeContact.next();
            if (nextElement.getEmail().equals(searchEmail)) {
                removeContact.remove();
                System.out.println("Contact is removed!");
                break;
            } else {
                System.out.println("Contact not found.");
            }
        }
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
   /*
   Methods For Search Person in multiple Address Book.
    */
    public List<Contacts> SearchInMultipleAddressBook(String name) {
        for (Map.Entry<String, ArrayList<Contacts>> entry : hashmap.entrySet()) {
            for (Contacts v : entry.getValue()) {
                if (v.getCity().equals(name) || v.getState().equals(name)) {
                    System.out.println("\n Record Found in=>" + entry.getKey());
                    System.out.println("\tPersons Details Are=>" + v);
                }
                else {
                    System.out.printf("No record found:");
                }
            }
        }
        return null;
    }


    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        /*
        Displaying the Menu Options Person.
         */
    public void MenuOption(Oprations oprations, ArrayList<Contacts> contactDetails) {
        System.out.println("Enter a number to perform For Persons action: ");
        int menu, ans;
        do {
            System.out.println(" \n1. Add details \n" + "2. Edit details \n" + "3. Delete details \n" + "4. Display details \n" + "5. Exit");
            System.out.println("Enter Option");
            menu = scanner.nextInt();
            switch (menu) {
                case 1 ->
                    /*  Add contact details in address book */
                        oprations.addDetails(contactDetails);
                case 2 ->
                    /*  Edit contact details in address book */
                        oprations.editDetails(contactDetails);
                case 3 ->
                    /*  Delete contact details */
                        oprations.deleteContact(contactDetails);
                case 4 ->
                    /*  Display contact details */
                        oprations.displayContacts(contactDetails);
                case 5 ->
                    /* Exiting The MenuOption */
                        System.out.println("Exit!");

                default -> System.out.println("Invalid option selected.");
            }
            System.out.println("Do You Want To continue In MenuOption ......If Yes The Press '1' ");
            ans = scanner.nextInt();
        } while (ans == 1);
    }
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public void AddressBookMenu(Oprations oprations) {
        System.out.println("Enter a number to perform AddressBook actions: ");
        int menu, ans;
        do {
            System.out.println(" \n1. Add AddressBook \n2. Display AddressBook \n3.Search In Multiple AddressBook \n4.Exit");
            System.out.println("Enter Option");
            menu = scanner.nextInt();
            switch (menu) {
                case 1:
                    AddressBook(oprations);
                    break;
                case 2:
                    displayAddressBook();
                    break;
                case 3:
                    System.out.println("Enter city name or state name to search records");
                    String name = scanner.next();
                    SearchInMultipleAddressBook(name);
                    break;
                case 4:
                    System.out.println("Exit");
                    break;
            }

            System.out.printf("Do You Want TO Continue In Address Book Menu Option if Yes Enter \t 1 For continue or Else Enter \t 2 For Exit. ");
            ans = scanner.nextInt();
        } while (ans == 1);
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


}


