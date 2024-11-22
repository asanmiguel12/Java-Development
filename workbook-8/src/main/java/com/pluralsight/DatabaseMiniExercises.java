package com.pluralsight;

import java.sql.*;
import java.util.Scanner;

public class DatabaseMiniExercises {
    public static void main(String[] args) throws SQLException {
        displayAllVehicles();
        searchVehicles();
    }

    public static void displayAllVehicles() throws SQLException {

        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/CarDealershipDatabase", "root", "");
        Statement statement = connection.createStatement();

        // execute query
        String query = "SELECT * FROM Vehicles";
        ResultSet rs = statement.executeQuery(query);

        // process results
        while (rs.next()) {
            System.out.println("Make: " + rs.getString("Make") + "\n" +
                    "Model: " + rs.getString("Model") + "\n" +
                    "VIN: " + rs.getString("VIN") + "\n" +
                    "Dealership_Id: " + rs.getString("Dealership_Id") + "\n" +
                    "------------------------");
        }
    }

    static Scanner scanner = new Scanner(System.in);
    public static void searchVehicles () throws SQLException {
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/CarDealershipDatabase", "root", "");
        String queryMake = "SELECT make, model, vin  FROM Vehicles WHERE Make = ?";
        PreparedStatement statementMake = connection.prepareStatement(queryMake);
        String queryModel = "SELECT make, model, vin  FROM Vehicles WHERE Model = ?";
        PreparedStatement statementModel = connection.prepareStatement(queryModel);
        System.out.println("Please Choose How You Would Like To Search For A Vehicle" + "\n" +
                "1) Make" + "\n" +
                "2) Model");

        int choice = scanner.nextInt();
        scanner.nextLine();

      if (choice == 1) {
          System.out.println("Please Enter Make Of Vehicle To Search");
          String userMake = scanner.nextLine();
          statementMake.setString(1, userMake);

          ResultSet rs = statementMake.executeQuery();
          while(rs.next()) {
              System.out.println("Make " + rs.getString("Model") + "\n" +
                      "Model: " + rs.getString("Model") + "\n" +
                      "VIN: " + rs.getString("VIN"));
          }
          connection.close();
      }

    }

    public static void tryCatchEstablishConnection (String [] args) {
        try(Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/northwind", args[0], args[1]);
        )
        {


      } catch(SQLException e) {
        System.out.println(e.getMessage());
    }

    }
}