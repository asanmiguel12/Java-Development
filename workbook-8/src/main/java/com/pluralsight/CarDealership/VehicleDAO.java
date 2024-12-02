package com.pluralsight.CarDealership;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class VehicleDAO {
    static Scanner scanner = new Scanner(System.in);

    public static void deleteVehicle(DataSource dataSource) {

        //prompt user for what shipper they would like to delete
        System.out.println("Please Enter The Vehicle VIN Of The Vehicle You Want To Delete: ");
        String shipperIdDeleteChoice= scanner.nextLine();

        // Create the connection and prepared statement
        try (Connection connection = dataSource.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(
                     "DELETE FROM vehicles WHERE vin = ?",
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
