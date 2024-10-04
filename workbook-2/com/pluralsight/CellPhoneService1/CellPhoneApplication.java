package com.pluralsight.CellPhoneService1;

import java.util.Scanner;

public class CellPhoneApplication {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("What is your serial number: ");
        int serialNumber1 = scanner.nextInt();
        scanner.nextLine();
        System.out.println("What is your phone model: ");
        String model1 = scanner.nextLine();
        System.out.println("Who is your carrier: ");
        String carrier1 = scanner.nextLine();
        System.out.println("What is your phone number: ");
        String phoneNumber1 = scanner.nextLine();
        System.out.println("Who is the owner: ");
        String owner1 = scanner.nextLine();
        System.out.println("What number would you like to dial?");
        String dial1 = scanner.nextLine();

        CellPhone cellphone1 = new CellPhone(serialNumber1, model1, carrier1, phoneNumber1, owner1, dial1 );

        System.out.println("What is your serial number: ");
        int serialNumber2 = scanner.nextInt();
        scanner.nextLine();
        System.out.println("What is your phone model: ");
        String model2 = scanner.nextLine();
        System.out.println("Who is your carrier: ");
        String carrier2 = scanner.nextLine();
        System.out.println("What is your phone number: ");
        String phoneNumber2 = scanner.nextLine();
        System.out.println("Who is the owner: ");
        String owner2 = scanner.nextLine();
        System.out.println("What number would you like to dial?");
        String dial2 = scanner.nextLine();

        CellPhone cellphone2 = new CellPhone(serialNumber2, model2, carrier2,phoneNumber2, owner2, dial2);

        System.out.println("Serial Number: " + cellphone1.getSerialNumber() +
                "\nPhone model: " + cellphone1.getModel() +
                "\nCarrier: " + cellphone1.getCarrier() +
                "\nPhoneNumber:" + cellphone1.getPhoneNumber() +
                "\nOwner:" + cellphone1.getOwner() +
                "\n" + owner1 + "'s phone is" + cellphone1.getDial());

        System.out.println("Serial Number: " + cellphone2.getSerialNumber() +
                "\nPhone model: " + cellphone2.getModel() +
                "\nCarrier: " + cellphone2.getCarrier() +
                "\nPhoneNumber" + cellphone2.getPhoneNumber() +
                "\nOwner:" + cellphone2.getOwner() +
                "\n" + owner2 + "'s phone is calling:" + cellphone2.getDial());


        cellphone1.dial( cellphone2.getPhoneNumber() );
        cellphone2.dial( cellphone1.getPhoneNumber() );

        display(cellphone1);
        display(cellphone2);

        CellPhone phone = new CellPhone(serialNumber1,model1, carrier1, phoneNumber1, owner1, dial1);

        phone.setSerialNumber(serialNumber1);
        phone.setModel(model1);
        phone.setCarrier(carrier1);
        phone.setPhoneNumber(phoneNumber1);
        phone.setOwner(owner1);


    } public static void display(CellPhone phone) {
        System.out.println("Displaying phone details:");
        System.out.println("Serial Number: " + phone.getSerialNumber());
        System.out.println("Model: " + phone.getModel());
        System.out.println("Carrier: " + phone.getCarrier());
        System.out.println("Phone Number: " + phone.getPhoneNumber());
        System.out.println("Owner: " + phone.getOwner());
        System.out.println();

    }
}



