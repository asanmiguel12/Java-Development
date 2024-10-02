package com.pluralsight;

import java.util.Scanner;

public class FullNameParser {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Welcome All!");
        String [] nameSplit = input("whole name").split("\\s");

        String fName = "";
        String mname = "(none)";
        String lname = "";

        if(nameSplit.length >= 3) {
         fName = nameSplit[0];
         mname = nameSplit[1];
         lname = nameSplit[2];
            System.out.println("First Name: " + fName +
                    "\nMiddle Name: " + mname +
                    "\nLast Name: " + lname);
        } else {
            fName = nameSplit[0];
            lname = nameSplit[1];
            System.out.println("First Name: " + fName +
                    "\nLast Name: " + lname);
        }
    }
    public static String input(String message) {
        System.out.println("Please Enter Your " + message);
        return scanner.nextLine();
    }

}




