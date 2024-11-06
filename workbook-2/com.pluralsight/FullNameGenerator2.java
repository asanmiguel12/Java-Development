package com.pluralsight;

import java.util.Scanner;

public class FullNameGenerator2 {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Welcome All!");
        System.out.println("Please choose a format to enter your name: \n" +
                "Option 1 : First, Last \n" +
                "Option 2 : First, Middle, Last \n" +
                "Enter 1 or 2 : ");
        String nameTypeOption = scanner.nextLine();
        String fName = input("First Name : ").trim();
        String lName = input("Last Name : ").trim();

        if (nameTypeOption.equals("1")) {
            String wholeName = fName + " " + lName;
            System.out.println("Hello! " + wholeName);
        } else {
            String mName = input("Middle Name : ").trim();
            String wholeName = fName + " " + mName + " " + lName;
            System.out.println("Hello! " + wholeName);

        }
    }
    public static String input(String message) {
        System.out.println("Please Enter Your " + message);
        return scanner.nextLine();
    }

}


