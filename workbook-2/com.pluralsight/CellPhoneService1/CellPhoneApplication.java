package com.pluralsight.CellPhoneService1;

import java.util.Scanner;

public class CellPhoneApplication {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        CellPhone cellPhone1 = makePhone();
        CellPhone cellPhone2 = makePhone();
        CellPhone cellPhone3 = new CellPhone(1212,"iPhone","Verizon", "121212","Adrian");

        display(cellPhone1);
        display(cellPhone2);
        display(cellPhone3);

        cellPhone1.dial(cellPhone2.getPhoneNumber());
        cellPhone2.dial(cellPhone1.getPhoneNumber());

        cellPhone1.dial(cellPhone3); //call using overload parameter

    }
    //method to get phone info
    public static CellPhone makePhone() {
        CellPhone cp = new CellPhone();

        System.out.println("What is your serial number: ");
        int serialNumber = scanner.nextInt();
        scanner.nextLine();
        cp.setSerialNumber(serialNumber);

        System.out.println("What model is the phone?");
        String model = scanner.nextLine();
        cp.setModel(model);

        System.out.println("Who is the carrier?");
        String carrier = scanner.nextLine();
        cp.setCarrier(carrier);

        System.out.println("What is the phone number?");
        String phoneNumber = scanner.nextLine();
        cp.setPhoneNumber(phoneNumber);

        System.out.println("Who is the owner of the phone?");
        String owner = scanner.nextLine();
        cp.setOwner(owner);

        return cp;
    }

    public static void display(CellPhone phone) {
        System.out.println("Phone details");
        System.out.println("Serial Number: " + phone.getSerialNumber());
        System.out.println("Model: " + phone.getModel());
        System.out.println("Carrier: " + phone.getCarrier());
        System.out.println("Phone Number: " + phone.getPhoneNumber());
        System.out.println("Owner: " + phone.getOwner());

    }
}





