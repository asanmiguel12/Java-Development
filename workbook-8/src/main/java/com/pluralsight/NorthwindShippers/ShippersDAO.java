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

    public static void insertIntoDirectShippers(DataSource dataSource) {

        //prompt user for what they would like to insert
        System.out.println("Please Enter The Name Of The Shipper You Want To Add: ");
        String shipperNameInput = scanner.nextLine();

        System.out.println("Please Enter The Phone Number Of The Shipper You Want To Add: i.e(123-456-7899)");
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
}
