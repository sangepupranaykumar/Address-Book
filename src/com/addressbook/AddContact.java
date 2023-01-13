package com.addressbook;

import java.util.ArrayList;
import java.util.Scanner;

public class AddContact {
    AddressBookMain details = new AddressBookMain();
    ArrayList<AddressBookMain> listOfContacts = new ArrayList<>();
    public void addContactDetails(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the First name :");
        details.setFirstName(scanner.next());
        System.out.println("Enter the Last name :");
        details.setLastName(scanner.next());
        System.out.println("Enter the Address :");
        details.setAddress(scanner.next());
        System.out.println("Enter the City :");
        details.setCity(scanner.next());
        System.out.println("Enter the State :");
        details.setState(scanner.next());
        System.out.println("Enter the Zip :");
        details.setZip(scanner.next());
        System.out.println("Enter the Mobile Number :");
        details.setPhoneNumber(scanner.next());
        System.out.println("Enter the Email :");
        details.setEmail(scanner.next());
        AddressBookMain contacts = new AddressBookMain(details.getFirstName(), details.getLastName(),details.getAddress(),details.getCity(),details.getState(),details.getZip(),details.getPhoneNumber(),details.getEmail());
        listOfContacts.add(contacts);
    }
    public void printContactDetails(){
        System.out.println(listOfContacts);
    }

    public static void main(String[] args) {
        AddContact obj= new AddContact();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Number of Contacts");
        int number = scanner.nextInt();
        for (int i = 1; i<=number; i++){
            obj.addContactDetails();
        }
        obj.printContactDetails();
    }
}
