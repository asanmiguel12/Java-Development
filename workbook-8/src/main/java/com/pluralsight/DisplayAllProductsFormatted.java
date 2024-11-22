package com.pluralsight;

import java.sql.*;

public class DisplayAllProductsFormatted {

    public static void main(String[] args) throws SQLException {
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/northwind", "root", "");

        Statement statement = connection.createStatement();

        // execute query
        String query = "SELECT * FROM products";
        ResultSet rs = statement.executeQuery(query);

        // process results
        while(rs.next()) {
            System.out.println("Product Id: " + rs.getString("ProductId") + "\n" +
                    "Name:      " + rs.getString("ProductName") + "\n" +
                    "Price:     " + rs.getString("UnitPrice") + "\n" +
                    "Stock:     " + rs.getString("UnitsInStock") + "\n" +
                    "------------------------");
        }
        connection.close();
    }
}
