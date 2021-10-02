package com.company;

/*
Creating Address book
 */
public class AddressBook {
    public final String firstName;
    public final String lastName;
    public final String address;
    public final String city;
    public final String state;
    public final String zip;
    public final String phoneNumber;
    public final String eMail;


    public AddressBook(String firstName, String lastName, String address, String city,
                       String state, String zip, String phoneNumber, String eMail) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.phoneNumber = phoneNumber;
        this.eMail = eMail;
    }

    public String strString() {
        return "\nfirstName:- " + firstName + "\nlastName:- " + lastName + "\naddress:- " + address+ "\ncity:- " + city
                + "\nstate:- " + state+"\nzip:- " + zip+"\nphoneNumber:- " + phoneNumber+"\neMail:- " + eMail;
    }

    public static void main(String[] args) {
        AddressBook object = new AddressBook("Santosh ", "N ", "Krantinagar", " Pune ", "Maharashtra ",
                "411014 ", "7020126000 ", "san@.gmail.com");
        System.out.println(object.strString());
    }
}
