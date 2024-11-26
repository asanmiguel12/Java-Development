package com.pluralsight.Northwind;

import org.apache.commons.dbcp2.BasicDataSource;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        BasicDataSource bds = new BasicDataSource();
        bds.setUrl("jdbc:mysql://localhost:3306/northwind");
        bds.setUsername(args[0]);
        bds.setPassword(args[1]);

        ProductDataManager productDataManager = new ProductDataManager(bds);

        System.out.println(productDataManager.getAllProducts());
        //displayHomeScreen();
    }
}
