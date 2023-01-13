package com.addressbook;

import java.util.ArrayList;
import java.util.Scanner;

public class AddMultipleAddressBook {
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
    public void addMultipleAddress(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of Address book");
        int book = scanner.nextInt();
        for (int i=1;i<=book;i++){
            System.out.println("Enter the number of persons");
            int number = scanner.nextInt();
            for (int j=1;j<=number;j++){
                addContactDetails();
                printContactDetails();
            }
        }
    }

    public static void main(String[] args) {
        AddMultipleAddressBook obj = new AddMultipleAddressBook();
        obj.addMultipleAddress();
    }
}
