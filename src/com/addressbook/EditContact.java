package com.addressbook;

import java.util.ArrayList;
import java.util.Scanner;

public class EditContact {
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
        EditContact obj = new EditContact();
        System.out.println("Press 1 to Add Contact /n Press 2 To edit Contact");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        System.out.println("press 1 to add /n press 2 to edit "+choice);
        switch (choice){
            case 1:
                System.out.println("To add a contact: ");
                System.out.println(" Enter the Number of Contacts ");
                int number = scanner.nextInt();
                for (int i = 1 ; i<=number; i++){
                    obj.addContactDetails();
                    obj.printContactDetails();
                }
            case 2:
                System.out.println("To Edit a Contact :");
                System.out.println(" Enter the Number of Contacts ");
                int input = scanner.nextInt();
                for (int i = 1 ; i<=input; i++) {
                    obj.addContactDetails();
                    obj.printContactDetails();
                    System.out.println("Enter the First Name :");
                    String firstName = scanner.next();
                    for (AddressBookMain contacts: obj.listOfContacts) {
                        if (contacts.getFirstName().equals(firstName)){
                            obj.listOfContacts.remove(contacts);
                            System.out.println("edit the "+firstName+"contact details");
                            obj.addContactDetails();
                            obj.printContactDetails();
                            break;
                        }else {
                            System.out.println("Contact Details Not Found ");
                        }
                    }
                }
        }
    }
}

