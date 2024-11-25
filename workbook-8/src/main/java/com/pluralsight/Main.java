package com.pluralsight;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import static com.pluralsight.DisplayHomeScreen.displayHomeScreen;

public class Main {
    public static void main(String[] args) throws SQLException {
        displayHomeScreen();
    }
}
