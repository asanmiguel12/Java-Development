package com.pluralsight;

import java.sql.*;
import java.util.Scanner;

public class DatabaseMiniExercises {
    public static void main(String[] args) throws SQLException {
        searchProducts();
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

          ResultSet rsMake = statementMake.executeQuery();
          while (rsMake.next()) {
              System.out.println("Make " + rsMake.getString("Model") + "\n" +
                      "Model: " + rsMake.getString("Model") + "\n" +
                      "VIN: " + rsMake.getString("VIN"));
          }
      }
          if (choice == 2) {
              System.out.println("Please Enter Model Of Vehicle To Search");
              String userModel = scanner.nextLine();

              statementMake.setString(1, userModel);

              ResultSet rsModel = statementModel.executeQuery();
              while(rsModel.next()) {
                  System.out.println("Make " + rsModel.getString("Model") + "\n" +
                          "Model: " + rsModel.getString("Model") + "\n" +
                          "VIN: " + rsModel.getString("VIN"));

          }
          connection.close();
      }
    }

    public static void searchProducts () throws SQLException {
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/northwind", "root", "");
        String queryProductName = "SELECT ProductName, ProductId, UnitPrice FROM Products WHERE ProductName = ?";
        PreparedStatement statementProductName = connection.prepareStatement(queryProductName);
        String queryProductId = "SELECT ProductName, ProductId, UnitPrice FROM Products WHERE ProductId = ?";
        PreparedStatement statementProductId = connection.prepareStatement(queryProductId);

        System.out.println("Please Choose How You Would Like To Search For A Product" + "\n" +
                "1) Name" + "\n" +
                "2) Id");

        int choice = scanner.nextInt();
        scanner.nextLine();

        if (choice == 1) {
            System.out.println("Please Enter The Name Of The Product To Search");
            String userMake = scanner.nextLine();

            statementProductName.setString(1, userMake);

            ResultSet rsMake = statementProductName.executeQuery();
            while (rsMake.next()) {
                System.out.println("ProductId: " + rsMake.getString("ProductId") + "\n" +
                        "ProductName: " + rsMake.getString("ProductName") + "\n" +
                        "UnitPrice: " + rsMake.getString("UnitPrice"));
            }
        }
        if (choice == 2) {
            System.out.println("Please Enter Id Of The Product To Search");
            String userModel = scanner.nextLine();

            statementProductId.setString(1, userModel);

            ResultSet rsModel = statementProductId.executeQuery();
            while (rsModel.next()) {
                System.out.println("ProductId: " + rsModel.getString("ProductId") + "\n" +
                        "ProductName: " + rsModel.getString("ProductName") + "\n" +
                        "UnitPrice: " + rsModel.getString("UnitPrice"));

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