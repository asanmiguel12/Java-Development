package com.pluralsight;

import java.sql.*;
import java.util.Scanner;

public class Mod3Copy {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws SQLException {

        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/northwind", "root", "");


        // execute query
        String query = "SELECT productid, productname FROM products WHERE productid = ?";
        PreparedStatement statement = connection.prepareStatement(query);
        System.out.println("Please Enter The Product Id To Search");

        String id = scanner.nextLine();
        statement.setString(1, id);


        // process results
        ResultSet rs = statement.executeQuery();
        while(rs.next()) {
                System.out.println(rs.getInt(1) + " : " + rs.getString(2));
        }
        connection.close();
    }
}
