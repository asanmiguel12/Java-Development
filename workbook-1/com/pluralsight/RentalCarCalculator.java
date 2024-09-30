package com.pluralsight;

import java.util.Scanner;

public class RentalCarCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What date will you pick up your vehicle? (MM/DD/YY) : ");
        String date = scanner.nextLine();
        float carprice = 29.99f;
        System.out.println("How many days will you need your vehicle for? : ");
        int numberOfDays = scanner.nextInt();
        scanner.nextLine();
        float totalprice = carprice * numberOfDays;

        System.out.println("Do you need a GPS for $2.95/day? (yes/no) : ");
        String gps = scanner.nextLine();
        float gpsChoice = 2.95f;

        System.out.println("Do you need an electronic toll tag for $3.95/day? (yes/no) : ");
        String tollTag = scanner.nextLine();
        float tollTagChoice = 3.95f;

        System.out.println("Would you like to have roadside assistance for $3.95/day (yes/no) : ");
        String roadside = scanner.nextLine();
        float roadsideChoice = 3.95f;

        if (gps.equals("yes")) {
            totalprice = totalprice + (gpsChoice * numberOfDays);
        }
        if (tollTag.equals("yes")) {
            totalprice = totalprice + (tollTagChoice * numberOfDays);
        }
        if (roadside.equals("yes")) {
            totalprice = totalprice + (roadsideChoice * numberOfDays);
        }

        System.out.println("What is your current age?");
        int age = scanner.nextInt();

        if (age <= 25) {
            totalprice += (totalprice * .30f);
        }

        System.out.println("Your total cost is $" + totalprice);

    }
}

