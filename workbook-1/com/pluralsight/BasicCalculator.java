package com.pluralsight;

import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number: ");
        float num1 = scanner.nextFloat();
        scanner.nextLine();

        System.out.print("Enter second number: ");
        float num2 = scanner.nextFloat();
        scanner.nextLine();

        System.out.println
        ("How would you like to calculate these numbers? Enter 'add = A' or 'subtract = B' or 'multiply = M' or 'divide = D:' ");

        String operation = scanner.nextLine();

        switch (operation) {
            case "A":
            System.out.printf("Your answer is " + (num1 + num2));
               break;
            case "S" :
            System.out.printf("Your answer is " + (num1 - num2));
                break;
            case "D" :
            System.out.printf("Your answer is " + (num1 / num2));
                break;
            case "M" :
            System.out.printf("Your answer is " + (num1 * num2));
                break;
        }
        scanner.close();
    }
}