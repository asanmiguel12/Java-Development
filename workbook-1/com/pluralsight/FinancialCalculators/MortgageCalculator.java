package com.pluralsight.FinancialCalculators;

import java.util.Scanner;

public class MortgageCalculator {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("What is the price of your home? : ");
        float cost = scanner.nextFloat();

        System.out.println("What is your loan term length? : ");
        int years = scanner.nextInt();
        float length = years * 12;

        System.out.println("What is your interest rate? : ");
        float interestRate = scanner.nextFloat();
        float monthlyInterest = interestRate/100/12;
        scanner.close();

        float monthlyPayment = (float) (cost * (((monthlyInterest * (Math.pow(1 + monthlyInterest, length))) / ((Math.pow((1 + monthlyInterest), length)) - 1))));
        float totalInterest = (monthlyPayment * length) - cost;

        System.out.println("Your loan of $" + cost + " is $"  + monthlyPayment + " per month\n" +
                "Your total interest is $" + totalInterest);


        }
    }