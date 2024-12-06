package com.pluralsight.CarDealership;

import com.pluralsight.CarDealershipAbstract.Dealership;
import com.pluralsight.CarDealershipAbstract.DealershipFileManager;

import java.io.IOException;
import java.util.Scanner;

import static com.pluralsight.CarDealership.VehiclesDataManager.displayAllVehicles;

public class UI {
    static Scanner scanner = new Scanner(System.in);

    public void display() {
        System.out.println("Welcome To The Dealership Inventory Archives");

        System.out.println("How would you like to search this inventory?" + "\n" +
                "1) Vehicles By Price" + "\n" +
                "2) Vehicles By Make" + "\n" +
                "3) Vehicles By Model" + "\n" +
                "4) All Vehicles" + "\n" +
                "5) Add Vehicle To Inventory" + "\n" +
                "6) Remove Vehicle From Inventory ");

        int userInput = scanner.nextInt();
        switch (userInput) {
            case 1 -> displayAllVehicles();
            case 2 -> displayAllVehicles();


        }
    }
}
