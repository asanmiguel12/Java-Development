package com.pluralsight;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class TheatreReservations {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Welcome to Theatre Reservations");
        String name = input("your : (LastName, FirstName)").trim();
        String date = input("(Date) of reservation (MM/dd/yyyy): ");
        String tickets = input("# of tickets(s) : ");
        DateTimeFormatter formatter;
        formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        LocalDate date1 = LocalDate.parse(date, formatter);
        int tickets1 = Integer.parseInt(tickets);

        if (tickets1 == 1) {
            System.out.println(tickets1 + " ticket reserved for " + date1 + "under " + name);
        }
            System.out.println(tickets1 + " tickets reserved for " + date1 + "under " + name);
        }


    public static String input(String message) {
        System.out.println("Please enter" + message);
        return scanner.nextLine();
    }
}
