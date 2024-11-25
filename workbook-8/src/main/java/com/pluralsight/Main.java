package com.pluralsight;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import static com.pluralsight.DatabaseMiniExercises.displayAllVehicles;
import static com.pluralsight.DisplayHomeScreen.displayHomeScreen;

public class Main {
    public static void main(String[] args) throws SQLException {
        Connection connectionNw = DriverManager.getConnection("jdbc:mysql://localhost:3306/northwind", args[0], args[1]);
        displayHomeScreen(connectionNw);
    }
}
