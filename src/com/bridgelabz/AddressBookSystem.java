package com.bridgelabz;

import java.util.ArrayList;

class Contacts {

    private String firstName, lastName, address, city, state, zipCode, contactNo, email;
    public Contacts(String fName, String lName,
                    String addr, String cityName, String stateName,
                    String zipCodeNo, String contact, String emailAddr){
        this.firstName = fName;
        this.lastName = lName;
        this.address = addr;
        this.city = cityName;
        this.state = stateName;
        this.zipCode = zipCodeNo;
        this.contactNo = contact;
        this.email = emailAddr;
    }
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public String getEmail(){
        return email;
    }

    public String getAddress(){
        return address;
    }
    public String getCity(){
        return city;
    }
    public String getState(){
        return state;
    }
    public String getContactNo(){
        return contactNo;
    }
    public String getZipCode(){
        return zipCode;
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public void setAddress(String address){
        this.address = firstName;
    }
    public void setCity(String city){
        this.city = city;
    }
    public void setState(String state){
        this.state = state;
    }
    public void setContactNo(String contactNo){
        this.contactNo = contactNo;
    }
    public void setZipCode(String zipCode){
        this.zipCode = zipCode;
    }
}
public class AddressBookSystem {
    public static void main(String[] args) {
        System.out.println("Welcome to Address Book Program!");
        Contacts contacts = new Contacts("Ashish", "Mashal", "SB Road", "Pune", "Maharashtra","411016", "0123456789","am@gmail.com");
        System.out.println(contacts.getFirstName());
        System.out.println(contacts.getLastName());
        System.out.println(contacts.getEmail());
        System.out.println(contacts.getAddress());
        System.out.println(contacts.getCity());
        System.out.println(contacts.getState());
        System.out.println(contacts.getContactNo());
        System.out.println(contacts.getZipCode());

    }
}
