package com.pluralsight.Northwind;

import java.sql.*;

public class DataBaseWithTryCatch {

    public static void main(String[] args) {

        try(Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/northwind", args[0], args[1]);
            PreparedStatement statement = connection.prepareStatement("SELECT productname FROM products");
            ResultSet rs = statement.executeQuery()
        ) {

            // process results
            while (rs.next()) {
                System.out.println(rs.getString("ProductName"));
            }

        } catch(SQLException e) {
            System.out.println(e.getMessage());

        }
    }
}
