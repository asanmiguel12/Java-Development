package com.pluralsight.NorthwindShippers;

import javax.sql.DataSource;
import java.sql.*;
import java.util.Scanner;

public class ShippersDAO {
    private DataSource dataSource;
    private static Scanner scanner = new Scanner(System.in);

    public ShippersDAO (DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public void insertIntoDirectShippers(DataSource dataSource) {

        //prompt user for what they would like to insert
        System.out.println("Please Enter The Name Of The Shipper You Want To Add: ");
        String shipperNameInput = scanner.nextLine();

        System.out.println("Please Enter The Phone Number Of The Shipper You Want To Add: ");
        String shipperPhoneInput = scanner.nextLine();


            // Create the connection and prepared statement
        try (Connection connection = dataSource.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(
                             "INSERT INTO shippers (companyname, phone) VALUES (?, ?);",
                     Statement.RETURN_GENERATED_KEYS);
        ) {
            // set the parameter
            preparedStatement.setString(1, shipperNameInput);
            preparedStatement.setString(2, shipperPhoneInput);
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
    public static void updateShipperRecord(DataSource dataSource) {

        //prompt user for what they would like to update
        System.out.println("Please Enter The Phone Number Of The Shipper You Want To Update: ");
        String shipperPhoneChoice = scanner.nextLine();

        System.out.println("Phone Number Selected: " + shipperPhoneChoice + "\n" +
                "Please Enter The New Phone Number: " );

        String shipperNewPhoneInput = scanner.nextLine();

        // Create the connection and prepared statement
        try (Connection connection = dataSource.getConnection();
             PreparedStatement preparedStatement =
                     connection.prepareStatement(
                             "UPDATE shippers SET phone = ? " +
                                     "WHERE phone = ?",
                             Statement.RETURN_GENERATED_KEYS);
        ) {
            // Set two parameters in the preparedStatement
            preparedStatement.setString(1, shipperNewPhoneInput);
            preparedStatement.setString(2, shipperPhoneChoice);

            // Execute the preparedStatement
            int rows = preparedStatement.executeUpdate();

            // Display the number of rows that were updated
            System.out.printf("Rows updated %d\n", rows);
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void deleteShipperRecord(DataSource dataSource) {

        //prompt user for what shipper they would like to delete
        System.out.println("Please Enter The Shipper Id Of The Shipper You Want To Delete: ");
        String shipperIdDeleteChoice= scanner.nextLine();

            // Create the connection and prepared statement
        try (Connection connection = dataSource.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(
                             "DELETE FROM shippers WHERE shipperid = ?",
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
}
