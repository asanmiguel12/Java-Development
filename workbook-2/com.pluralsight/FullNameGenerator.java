package com.pluralsight.workbook2;

import java.util.Scanner;

public class FullNameGenerator {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Welcome!");
        String fName = input("first name : ").trim();
        String mName = input("middle name : ").trim();
        String lName = input("last name : ").trim();
        String fullName = fName + " " + mName + " " + lName;
        String formattedName = fullName.substring(0,1).toUpperCase() + fullName.substring(1);
        scanner.close();

        System.out.println("Hello! " + formattedName );
    }
    public static String input(String message) {
        System.out.println("Please enter your " + message);
        return scanner.nextLine();
    }
}
