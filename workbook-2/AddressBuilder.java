package com.pluralsight;


import java.util.Scanner;

public class AddressBuilder {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Welcome to my Address Builder!");
        StringBuilder billaddress = new StringBuilder();
        StringBuilder shipaddress = new StringBuilder();

        String name = input("Full Name: ");
        String street = input("Billing Street: ");
        String city = input("Billing City: ");
        String state = input("Billing State: ");
        String zip = input("Billing Zip: ");
        String shipStreet = input("Shipping Street: ");
        String shipCity = input("Shipping City: ");
        String shipState = input("Shipping State: ");
        String shipZip = input("Shipping Zip: ");

        billaddress.append(name).append("\n");
        billaddress.append(street).append("\n");
        billaddress.append(city).append(", ");
        billaddress.append(state).append(" ");
        billaddress.append(zip);
        shipaddress.append(shipStreet).append("\n");
        shipaddress.append(shipCity).append(", ");
        shipaddress.append(shipState).append(" ");
        shipaddress.append(shipZip);

        String fullbilladdress = billaddress.toString();
        String fullshipaddress = shipaddress.toString();
        System.out.println("Billing Address: \n" +
                fullbilladdress + "\nShipping Address: \n" +
                fullshipaddress);
    }

    public static String input(String message) {
        System.out.println("\nPlease Enter " + message);
        return scanner.nextLine();

    }
}

