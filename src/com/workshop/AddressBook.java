package com.workshop;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {
    ArrayList<Contact> contactDetail = new ArrayList<>();
    Scanner scan = new Scanner(System.in);
    public void addDetails(){
        Contact info = new Contact();
        System.out.println("Enter first name");
        info.setFirstName(scan.next());
        System.out.println("Enter last name");
        info.setLastName(scan.next());
        System.out.println("Enter Address Details");
        info.setAddress(scan.next());
        System.out.println("Enter Phone No:");
        info.setPhoneNo(scan.next());

        contactDetail.add(info);
    }

    public void display(){
        for(Contact conDet : contactDetail) {
            System.out.println(conDet);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AddressBook addressBook = new AddressBook();
        int choice;
        do {
            System.out.println("Enter your choice");
            System.out.println("1.Add Details \n2. Display Details \n3.Exit");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Add Details");
                    addressBook.addDetails();
                    break;

                case 2:
                    System.out.println("Display Details");
                    addressBook.display();
                    break;
                case 3:
                    System.out.println("Exit");
                    break;
                default:
                    System.out.println("Invalid Entry");
                    break;
            }
        }
        while (choice != 3);

    }
}
