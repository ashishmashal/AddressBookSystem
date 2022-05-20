package com.bridgelabz;

import java.util.ArrayList;
import java.util.List;

public interface AddressBookInterFace {
    public void AddressBook(Oprations oprations);

    public void displayAddressBook();

    public ArrayList<Contacts> addDetails(ArrayList<Contacts> contactDetails);

    public void displayContacts(ArrayList<Contacts> contactDetails);

    public void editDetails(ArrayList<Contacts> contactDetails);

    public void deleteContact(ArrayList<Contacts> contactDetails);

    public void MenuOption(Oprations oprations, ArrayList<Contacts> contactDetails);

    public void AddressBookMenu(Oprations oprations);

    public List<Contacts> SearchInMultipleAddressBook(String name);
}
