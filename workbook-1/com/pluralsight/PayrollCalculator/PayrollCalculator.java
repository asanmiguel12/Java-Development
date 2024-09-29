package com.pluralsight;

import java.util.Scanner;

public class PayrollCalculator {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = scanner.nextLine();

        System.out.println("Enter hours worked: ");
        double hours = scanner.nextDouble();
        double overtime = hours * 1.5;

        System.out.println("Enter your payrate");
        double payrate = scanner.nextDouble();

        if (hours > 40) {
            System.out.println(name + ", you have earned $" + (hours * overtime));
        } else {
            System.out.println(name + ", you have earned $" + (hours * payrate));
        }
    }
}
