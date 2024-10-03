package com.pluralsight.CellPhoneService1;

import java.util.Scanner;

public class CellPhoneApplication {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("What is your serial number: ");
        int serialNumber = scanner.nextInt();
        scanner.nextLine();
        System.out.println("What is your phone model: ");
        String model = scanner.nextLine();
        System.out.println("What is your carrier: ");
        String carrier = scanner.nextLine();
        System.out.println("What is your phone number: ");
        String phoneNumber = scanner.nextLine();
        System.out.println("Who is the owner: ");
        String owner = scanner.nextLine();

        CellPhone cellphone2 = new CellPhone(serialNumber, model, carrier, phoneNumber, owner);
        cellphone2.setSerialNumber(serialNumber);
        cellphone2.setModel(model);
        cellphone2.setCarrier(carrier);
        cellphone2.setPhoneNumber(phoneNumber);
        cellphone2.setOwner(owner);

        System.out.println("Serial Number: " + cellphone2.getSerialNumber() +
                "\nPhone model: " + cellphone2.getModel() +
                "\nCarrier: " + cellphone2.getCarrier() +
                "\nPhoneNumber" + cellphone2.getPhoneNumber() +
                "\nOwner" + cellphone2.getOwner());


    }
}




