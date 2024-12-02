package com.pluralsight.CarDealership;

import java.sql.*;
import java.util.Scanner;

public class VehiclesDataManager {
    static Scanner scanner = new Scanner(System.in);


    public static void displayAllVehicles() {

        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/CarDealerShipDatabase", "root", "");
             Statement statement = connection.createStatement();
        ) {
            // execute query
            String query = "SELECT * FROM vehicles";
            try (ResultSet rs = statement.executeQuery(query);
            ) {

                // process results
                while (rs.next()) {
                    System.out.println("Make: " + rs.getString("Make") + "\n" +
                            "Model: " + rs.getString("Model") + "\n" +
                            "VIN: " + rs.getString("VIN") + "\n" +
                            "------------------------");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    public static void displayVehiclesByMake() {
        System.out.println("Please Enter The Make Of The Vehicle You Want To Search: ");
        String userMakeInput = scanner.nextLine();

        String queryVehicleMake = "SELECT * FROM vehicles WHERE make = ?";

        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/CarDealerShipDatabase", "root", "");
             PreparedStatement preparedStatement = connection.prepareStatement(queryVehicleMake);
        ) {
            // set params with user input
            preparedStatement.setString(1, userMakeInput);

            // execute query
            try (ResultSet rs = preparedStatement.executeQuery();
            ) {

                // process results
                while (rs.next()) {
                    System.out.println("Make: " + rs.getString("Make") + "\n" +
                            "Model: " + rs.getString("Model") + "\n" +
                            "VIN: " + rs.getString("VIN") + "\n" +
                            "------------------------");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void displayVehiclesByModel() {
        System.out.println("Please Enter The Model Of The Vehicle You Want To Search: ");
        String userModelInput = scanner.nextLine();

        String queryVehicleMake = "SELECT * FROM vehicles WHERE model = ?";

        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/CarDealerShipDatabase", "root", "");
             PreparedStatement preparedStatement = connection.prepareStatement(queryVehicleMake);
        ) {
            // set params with user input
            preparedStatement.setString(1, userModelInput);

            // execute query
            try (ResultSet rs = preparedStatement.executeQuery();
            ) {

                // process results
                while (rs.next()) {
                    System.out.println("Make: " + rs.getString("Make") + "\n" +
                            "Model: " + rs.getString("Model") + "\n" +
                            "VIN: " + rs.getString("VIN") + "\n" +
                            "------------------------");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
