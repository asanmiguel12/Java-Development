package com.pluralsight.FinancialCalculators;

import java.util.Scanner;

public class CDCalculator {
        static Scanner scanner = new Scanner(System.in);
        public static void main(String[] args) {;

            System.out.println("Welcome to the Certificate of Deposit or 'CD' Calculator!\n" +
            "This calculator lets you find the future value amount of your deposit using compound daily interest. \n" +
            "Please enter the amount of your initial deposit : ");
            float deposit = scanner.nextFloat();

            System.out.println("What is your interest rate? : ");
            float rate = scanner.nextFloat();
            double ratePercent = rate/100;

            System.out.println("How many years will your CD mature by? : ");
            float years = scanner.nextFloat();
            float days = 365;
            scanner.close();

            float futureValue = (float) (deposit * (Math.pow((1 + ratePercent/days), (years * days))));
            float totalInterest = futureValue - deposit;

            System.out.println("The future value of your CD wil be $" + futureValue + "\n" +
            "Your accrued interest is $" + totalInterest);

        }
    }
