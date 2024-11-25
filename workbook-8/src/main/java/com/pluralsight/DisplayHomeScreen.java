package com.pluralsight;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import static com.pluralsight.DisplayAllsFormatted.*;

public class DisplayHomeScreen {
    static Scanner scanner = new Scanner(System.in);

    public static void displayHomeScreen(Connection connection) throws SQLException {

        System.out.println("Please Choose How You Would Like To Search For A Product" + "\n" +
                "1) Display All Products" + "\n" +
                "2) Dislplay All Customers" + "\n" +
                "3) Display All Categories" + "\n" +
                "0) Exit");

        int choice = scanner.nextInt();
        scanner.nextLine();

        switch (choice) {
            case 1:
                displayAllProductsFormatted();
                break;
            case 2:
                displayAllCustomersFormatted();
                break;
            case 3:
                displayAllCategoriesFormatted();
                break;


        }
    }
}