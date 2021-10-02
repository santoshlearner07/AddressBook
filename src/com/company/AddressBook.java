package com.company;

import java.util.Scanner;

/*
Creating Address book
 */
public class AddressBook {
    private final String firstName;
    private final String lastName;
    private final String address;
    private final String city;
    private final String state;
    private final String zip;
    private final String phoneNumber;
    private final String eMail;


    public AddressBook() {//String firstName, String lastName, String address, String city,
        Scanner sc = new Scanner(System.in);//String state, String zip, String phoneNumber, String eMail) {
        System.out.println("Enter your Firstname :- ");
        this.firstName = sc.next();

        System.out.println("Enter your Lastname :- ");
        this.lastName = sc.next();

        System.out.println("Enter your Address :- ");
        this.address = sc.next();

        System.out.println("Enter your City :- ");
        this.city = sc.next();

        System.out.println("Enter your State :- ");
        this.state = sc.next();

        System.out.println("Enter your ZIP :- ");
        this.zip = sc.next();

        System.out.println("Enter your PhoneNumber :- ");
        this.phoneNumber = sc.next();

        System.out.println("Enter your Email :- ");
        this.eMail = sc.next();
    }

    public String strString() {
        return "\nfirstName:- " + firstName + "\nlastName:- " + lastName + "\naddress:- " + address + "\ncity:- " + city
                + "\nstate:- " + state + "\nzip:- " + zip + "\nphoneNumber:- " + phoneNumber + "\neMail:- " + eMail;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of entries you want to add :- ");
        int changeEntry = sc.nextInt();
        String list[] = new String[changeEntry];
        for (int i=0; i<changeEntry; i++) {
            System.out.println("Enter the contact detail:- " + (i+1));
            AddressBook book = new AddressBook();
            String contactDetail = book.strString();
            list[i]=contactDetail;
        }
        for (int j=0; j<changeEntry; j++) {
            System.out.println(list[j]);
        }
    }
}
