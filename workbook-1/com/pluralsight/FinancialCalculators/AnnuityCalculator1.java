package com.pluralsight.FinancialCalculators;

import java.util.Scanner;

public class AnnuityCalculator1 {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Welcome to the Annuity Calculator!\n" +
                "Please enter your principal value: ");
        double pv = scanner.nextDouble();

        System.out.println("Please enter your interest rate");
        double i = scanner.nextDouble()/100;

        System.out.println("Please enter the number of years to pay out");
        double y = scanner.nextDouble()*365;

        double a = pv * (Math.pow((1+ i), y)) ;
        System.out.println("Your total annuity per year" + "i s : $" + a);


    }
}


