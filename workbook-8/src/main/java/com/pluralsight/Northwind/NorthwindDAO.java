package com.pluralsight.Northwind;

import javax.sql.DataSource;
import java.sql.*;
import java.util.Scanner;

public class NorthwindDAO {
    private DataSource dataSource;
    private static Scanner scanner = new Scanner(System.in);

    public NorthwindDAO(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public void insertIntoCategories(DataSource dataSource) {

        //prompt user for what they would like to insert
        System.out.println("Please Enter The Name Of The Category You Want To Add: ");
        String categoryNameInput = scanner.nextLine();

        System.out.println("Please Enter The Description Of The Category You Want To Add: ");
        String categoryDescriptionInput = scanner.nextLine();


        // Create the connection and prepared statement
        try (Connection connection = dataSource.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(
                     "INSERT INTO categories (categoryname, description) VALUES (?, ?);",
                     Statement.RETURN_GENERATED_KEYS);
        ) {
            // set the parameter
            preparedStatement.setString(1, categoryNameInput);
            preparedStatement.setString(2, categoryDescriptionInput);
            // execute the query
            int rows = preparedStatement.executeUpdate();
            // confirm the update
            System.out.printf("Rows updated %d\n", rows);

            // Get the result containing primary key(s)
            try (ResultSet keys = preparedStatement.getGeneratedKeys()
            ) {
                // Iterate through the primary keys that were generated
                while (keys.next()) {
                    System.out.printf("%d key was added\n",
                            keys.getLong(1));
                }
            }
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void updateProductPrice(DataSource dataSource) {

        //prompt user for what they would like to update
        System.out.println("Please Enter The Product Id Of The Product Price You Want To Update: ");
        String productIdChoice = scanner.nextLine();

        System.out.println("Product Id Selected: " + productIdChoice + "\n" +
                "Please Enter The New Product Price: " );

        String newProductPriceInput = scanner.nextLine();

        // Create the connection and prepared statement
        try (Connection connection = dataSource.getConnection();
             PreparedStatement preparedStatement =
                     connection.prepareStatement(
                             "UPDATE product SET unitprice = ? " +
                                     "WHERE prouctid = ?",
                             Statement.RETURN_GENERATED_KEYS);
        ) {
            // Set two parameters in the preparedStatement
            preparedStatement.setString(1, newProductPriceInput);
            preparedStatement.setString(2, productIdChoice);

            // Execute the preparedStatement
            int rows = preparedStatement.executeUpdate();

            // Display the number of rows that were updated
            System.out.printf("Rows updated %d\n", rows);
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void updateProductQuantityPerUnit(DataSource dataSource) {

        //prompt user for what they would like to update
        System.out.println("Please Enter The Product Id Of The Product Quantity Per Unit You Want To Update: ");
        String productIdChoice = scanner.nextLine();

        System.out.println("Product Id Selected: " + productIdChoice + "\n" +
                "Please Enter The New Quantity Per Unit: " );

        String newQuantityInput = scanner.nextLine();

        // Create the connection and prepared statement
        try (Connection connection = dataSource.getConnection();
             PreparedStatement preparedStatement =
                     connection.prepareStatement(
                             "UPDATE product SET quantityperunit = ? " +
                                     "WHERE prouctid = ?",
                             Statement.RETURN_GENERATED_KEYS);
        ) {
            // Set two parameters in the preparedStatement
            preparedStatement.setString(1, newQuantityInput);
            preparedStatement.setString(2, productIdChoice);

            // Execute the preparedStatement
            int rows = preparedStatement.executeUpdate();

            // Display the number of rows that were updated
            System.out.printf("Rows updated %d\n", rows);
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void deleteCategory(DataSource dataSource) {

        //prompt user for what shipper they would like to delete
        System.out.println("Please Enter The Category Id Of The Category You Want To Delete: ");
        String shipperIdDeleteChoice= scanner.nextLine();

        // Create the connection and prepared statement
        try (Connection connection = dataSource.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(
                     "DELETE FROM categories WHERE categoryid = ?",
                     Statement.RETURN_GENERATED_KEYS);
        ) {
            // Set parameters in the preparedStatement
            preparedStatement.setString(1, shipperIdDeleteChoice);
            // Execute the preparedStatement
            int rows = preparedStatement.executeUpdate();
            // Display the number of rows that were updated
            System.out.printf("Rows deleted %d\n", rows);
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void insertIntoSuppliers(DataSource dataSource) {

        //prompt user for what they would like to insert
        System.out.println("Please Enter The Company Name Of The Supplier You Want To Add: ");
        String supplierCompanyNameInput = scanner.nextLine();

        System.out.println("Please Enter The Contact Name Of The Supplier You Want To Add: ");
        String supplierContactNameInput = scanner.nextLine();


        // Create the connection and prepared statement
        try (Connection connection = dataSource.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(
                     "INSERT INTO suppliers (companyname, contactname) VALUES (?, ?);",
                     Statement.RETURN_GENERATED_KEYS);
        ) {
            // set the parameter
            preparedStatement.setString(1, supplierCompanyNameInput);
            preparedStatement.setString(2, supplierContactNameInput);
            // execute the query
            int rows = preparedStatement.executeUpdate();
            // confirm the update
            System.out.printf("Rows updated %d\n", rows);

            // Get the result containing primary key(s)
            try (ResultSet keys = preparedStatement.getGeneratedKeys()
            ) {
                // Iterate through the primary keys that were generated
                while (keys.next()) {
                    System.out.printf("%d key was added\n",
                            keys.getLong(1));
                }
            }
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void deleteProduct(DataSource dataSource) {

        //prompt user for what shipper they would like to delete
        System.out.println("Please Enter The Product Id Of The Product You Want To Delete: ");
        String productIdDeleteChoice = scanner.nextLine();

        // Create the connection and prepared statement
        try (Connection connection = dataSource.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(
                     "DELETE FROM products WHERE productid = ?",
                     Statement.RETURN_GENERATED_KEYS);
        ) {
            // Set parameters in the preparedStatement
            preparedStatement.setString(1, productIdDeleteChoice);
            // Execute the preparedStatement
            int rows = preparedStatement.executeUpdate();
            // Display the number of rows that were updated
            System.out.printf("Rows deleted %d\n", rows);
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
