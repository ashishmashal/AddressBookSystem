package com.bridgelabz;

import java.util.ArrayList;
import java.util.List;

 interface AddressBookInterFace {
     void AddressBook(Operations oprations);

     void displayAddressBook();

     ArrayList<Contacts> addDetails(ArrayList<Contacts> contactDetails);

     void displayContacts(ArrayList<Contacts> contactDetails);

     void editDetails(ArrayList<Contacts> contactDetails);

     void deleteContact(ArrayList<Contacts> contactDetails);

     void MenuOption(Operations oprations, ArrayList<Contacts> contactDetails);

     void AddressBookMenu(Operations oprations);

     List<Contacts> SearchInMultipleAddressBook(String name);

     void searchByCityOrState(ArrayList<Contacts> contactDetails);

     public  List<Contacts> CountPersonFromSameCityOrState(String name);
}
