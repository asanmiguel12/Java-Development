package com.pluralsight.CarDealership;

import org.apache.commons.dbcp2.BasicDataSource;

import static com.pluralsight.CarDealership.VehiclesDataManager.displayVehiclesByMake;

public class Main {
    public static void main(String[] args) {
        BasicDataSource bds = new BasicDataSource();
        bds.setUrl("jdbc:mysql://localhost:3306/CarDealerShipDatabase");
        bds.setUsername(args[0]);
        bds.setPassword(args[1]);

        displayVehiclesByMake();
    }
}
