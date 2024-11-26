package com.pluralsight.Northwind;

import org.apache.commons.dbcp2.BasicDataSource;

public class Main {

    public static void main(String[] args) {

        BasicDataSource bds = new BasicDataSource();
        bds.setUrl("jdbc:mysql://localhost:3306/northwind");
        bds.setUsername(args[0]);
        bds.setPassword(args[1]);

        NorthwindDAO northwindDAO = new NorthwindDAO(bds);


        SupplierDAO supplierDAO = new SupplierDAO(bds);
        int userChoice = supplierDAO.updateSupplierMenu();

        if (userChoice == 1) {
            supplierDAO.updateSupplierCompany();
        } if (userChoice == 2) {
            supplierDAO.updateSupplierContact();
        } if (userChoice == 3) {
            supplierDAO.updateSupplierCity();
        } if (userChoice == 0) {
            System.out.println("BYE");
            System.exit(0);
        }
    }
}