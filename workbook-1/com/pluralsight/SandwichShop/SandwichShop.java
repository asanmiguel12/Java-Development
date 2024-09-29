package com.pluralsight;

import java.util.Scanner;

public class SandwichShop {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("What is your sandwich size 1 for regular size or 2 for large size : ");
        String size = scanner.nextLine();
        System.out.println("Would you like your sandwich loaded? yes or no: ");
        String loaded = scanner.nextLine();
        System.out.println("How old are you: ");
        int age = scanner.nextInt();
        float price = 0.0f;

        if (size.equals("1")) {
            price = 5.45f;
            if (loaded.equals("yes")) {
                price += 1.00f;
            }
        } else if (size.equals("2")) {
            price = 8.95f;
            if (loaded.equals("yes")) {
                price += 1.75f;
            }
        }
        if (age <= 17) {
            System.out.println("Your Total is: $" + (price - (price * .1)));
        } else if (age >= 65) {
            System.out.println("Your Total is: $" + (price - (price * .2)));
        } else {
            System.out.println("Your Total is: $" + price);
        }
    }
}

