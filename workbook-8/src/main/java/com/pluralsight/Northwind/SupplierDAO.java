package com.pluralsight.Northwind;

import javax.sql.DataSource;
import java.sql.*;
import java.util.Scanner;

public class SupplierDAO {
    private DataSource dataSource;
    private static Scanner scanner = new Scanner(System.in);

    public SupplierDAO(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public static int updateSupplierMenu() {
        String content = """
                What Column Of Suppliers Do You Want To Update?
                  1) Company Name
                  2) Contact Name
                  3) City
                  0) Exit
                Select an option:""";
        System.out.println(content);
        int choice = scanner.nextInt();
        scanner.nextLine();
        return choice;
    }

    public void updateSupplierContact() {

        //prompt user for what they would like to insert
        System.out.println("Please Enter The Contact Name Of The Supplier You Want To Update: ");
        String supplierContactChoice = scanner.nextLine();

        System.out.println("Company Name Selected: " + supplierContactChoice + "\n" +
                "Please Enter The New Contact Name: ");

        String newSupplierContact = scanner.nextLine();

        // Create the connection and prepared statement
        try (Connection connection = dataSource.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(
                     "UPDATE suppliers SET contactname = ? " +
                             "WHERE contactname = ?;",
                     Statement.RETURN_GENERATED_KEYS);
        ) {
            // set the parameter
            preparedStatement.setString(1, supplierContactChoice);
            preparedStatement.setString(2, newSupplierContact);
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
            scanner.close();
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void updateSupplierCompany() {

        //prompt user for what they would like to insert
        System.out.println("Please Enter The Company Name Of The Supplier You Want To Update: ");
        String supplierCompanyChoice = scanner.nextLine();

        System.out.println("Company Name Selected: " + supplierCompanyChoice + "\n" +
                "Please Enter The New Company Name: " );

        String newSupplierCompany = scanner.nextLine();

        // Create the connection and prepared statement
        try (Connection connection = dataSource.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(
                     "UPDATE suppliers SET companyname = ? " +
                             "WHERE companyname = ?;",
                     Statement.RETURN_GENERATED_KEYS);
        ) {
            // set the parameter
            preparedStatement.setString(1, supplierCompanyChoice);
            preparedStatement.setString(2, newSupplierCompany);
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
            scanner.close();
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void updateSupplierCity() {

        //prompt user for what they would like to insert
        System.out.println("Please Enter The City Of The Supplier You Want To Update: ");
        String supplierCityChoice = scanner.nextLine();

        System.out.println("City Selected: " + supplierCityChoice + "\n" +
                "Please Enter The New City: " );

        String newSupplierCity = scanner.nextLine();

        // Create the connection and prepared statement
        try (Connection connection = dataSource.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(
                     "UPDATE suppliers SET companyname = ? " +
                             "WHERE companyname = ?;",
                     Statement.RETURN_GENERATED_KEYS);
        ) {
            // set the parameter
            preparedStatement.setString(1, supplierCityChoice);
            preparedStatement.setString(2, newSupplierCity);
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
            scanner.close();
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
