package com.pluralsight.NorthwindShippers;

import org.apache.commons.dbcp2.BasicDataSource;


public class Main {
    public static void main(String[] args) {
        BasicDataSource bds = new BasicDataSource();
        bds.setUrl("jdbc:mysql://localhost:3306/northwind");
        bds.setUsername(args[0]);
        bds.setPassword(args[1]);


        ShippersDataManager shippersDataManager = new ShippersDataManager(bds);
        ShippersDAO.deleteShipperRecord(bds);
    }
}