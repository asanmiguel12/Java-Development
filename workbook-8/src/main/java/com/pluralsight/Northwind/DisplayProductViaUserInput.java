package com.pluralsight.Northwind;

import java.sql.*;
import java.util.Scanner;

public class DisplayProductViaUserInput {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws SQLException {

        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/northwind", "root", "");

        // execute query
        String query = "SELECT productid, productname FROM products WHERE productid = ?";
        PreparedStatement statement = connection.prepareStatement(query);

        // get user input
        System.out.println("Please Enter The Product Id To Search");
        String id = scanner.nextLine();

        // set prepared statement to wanted param index with user input
        statement.setString(1, id);

        // process results
        ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                System.out.printf("""
                        Product Id: %d --- Product Name: %s
                        """, rs.getInt(1), rs.getString(2));

                // In Java, %d is a format specifier used with the printf() and format() methods to represent an integer (decimal) value.
                // d - integer s - string
        }
        connection.close();
    }
}
