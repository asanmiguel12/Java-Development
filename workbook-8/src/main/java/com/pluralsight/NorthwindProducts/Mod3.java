package com.pluralsight.NorthwindProducts;

import java.sql.*;

public class Mod3 {
    public static void main(String[] args) throws SQLException {

        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/northwind", "root", "");

        Statement statement = connection.createStatement();

        // execute query
        String query = "SELECT productname FROM products";
        ResultSet rs = statement.executeQuery(query);

        // process results
        while(rs.next()) {
            System.out.println(rs.getString("productname"));
        }
        connection.close();
    }
}
