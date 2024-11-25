package com.pluralsight;

import java.sql.*;
import java.util.Scanner;

public class DisplayAllsFormatted {
    static Scanner scanner = new Scanner(System.in);

    public static void displayAllProductsFormatted() {

        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/northwind", "root", "");
             Statement statement = connection.createStatement();
        ) {

            // execute query
            String query = "SELECT * FROM products";
            ResultSet rs = statement.executeQuery(query);

            // process results
            while (rs.next()) {
                System.out.println("Product Id: " + rs.getString("ProductId") + "\n" +
                        "Name:      " + rs.getString("ProductName") + "\n" +
                        "Price:     " + rs.getString("UnitPrice") + "\n" +
                        "Stock:     " + rs.getString("UnitsInStock") + "\n" +
                        "------------------------");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void displayAllCustomersFormatted()  {

        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/northwind", "root", "");
             Statement statement = connection.createStatement();
        ) {

            // execute query
            String query = "SELECT * FROM customers ORDER BY country";
            ResultSet rs = statement.executeQuery(query);

            // process results
            while (rs.next()) {
                System.out.println("Company Name: " + rs.getString("CompanyName") + "\n" +
                        "Customer Id:      " + rs.getString("CustomerId") + "\n" +
                        "Phone:     " + rs.getInt("Phone") + "\n" +
                        "Country:     " + rs.getString("Country") + "\n" +
                        "------------------------");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    public static void displayAllCategoriesFormatted ()  {

        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/northwind", "root", "");
             Statement statement = connection.createStatement();
        ) {

            // execute query
            String query = "SELECT * FROM categories ORDER BY categoryid";
            ResultSet rs = statement.executeQuery(query);

            // process results
            while (rs.next()) {
                System.out.println("Category Name: " + rs.getString("CategoryName") + "\n" +
                        "Category Id:      " + rs.getString("CategoryId") + "\n" +
                        "Description:     " + rs.getString("Description") + "\n" +
                        "------------------------");
            }
            System.out.println("Would You Like To View The Products Of A Specific Category Id? (Y/N)");
            String viewChoice = scanner.nextLine();
            if (viewChoice.equalsIgnoreCase("Y")) {
                System.out.println("Please Enter The Category Id To Search: ");

                String categoryIdChoice = scanner.nextLine();
                String query2 = "SELECT northwind.categories.categoryid, products.productid, productname, unitsinstock, unitprice " +
                        "FROM northwind.categories " +
                        "JOIN northwind.products " +
                        "ON products.categoryid = categories.categoryid " +
                        "WHERE categories.categoryid = ?";
                PreparedStatement statement2 = connection.prepareStatement(query2);

                statement2.setString(1, categoryIdChoice);
                ResultSet rs2 = statement2.executeQuery();

                while (rs2.next()) {
                    System.out.println("Category Id: " + rs2.getString("CategoryId")+ "\n" +
                            "Product Id: " + rs2.getString("ProductId") + "\n" +
                            "Product Name: " + rs2.getString("ProductName") + "\n" +
                            "Unit Price: " + rs2.getString("UnitPrice") + "\n" +
                            "Units In Stock: " + rs2.getInt("UnitsInStock") + "\n" +
                            "------------------------");

                }
            }
            if (viewChoice.equalsIgnoreCase("N")) {
                System.out.println("BYE");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}