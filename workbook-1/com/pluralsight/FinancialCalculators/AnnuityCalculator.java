package com.pluralsight.FinancialCalculators;

import java.util.Scanner;

public class AnnuityCalculator {
        static Scanner scanner = new Scanner(System.in);
        public static void main(String[] args) {
            System.out.println("Welcome to the Annuity Calculator!\n" +
            "Please enter your desired monthly annuity payout value: ");
            double a = scanner.nextDouble();

            System.out.println("Please enter your interest rate");
            double i = scanner.nextDouble()/100/12;

            System.out.println("Please enter the number of years to pay out");
            double y = scanner.nextDouble()*12;

            double pv = a * (1 - Math.pow((1 + i), -y)) / i ;
            System.out.println("Your present value for this annuity is : $" + pv);


        }
}
