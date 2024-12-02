package com.pluralsight.CarDealership;

import com.pluralsight.CarDealershipAbstract.Dealership;
import com.pluralsight.CarDealershipAbstract.DealershipFileManager;

import java.io.IOException;
import java.util.Scanner;

public class UI {
    static Scanner scanner = new Scanner(System.in);

    public void display() {
        try {
            System.out.println("Welcome To The Dealership Inventory Archives");

            System.out.println("How would you like to search this inventory?" + "\n" +
                    "1) Vehicles By Price" + "\n" +
                    "2) Vehicles By Make" + "\n" +
                    "3) Vehicles By Model" + "\n" +
                    "6) All Vehicles" + "\n" +
                    "7) Add Vehicle To Inventory" + "\n" +
                    "8) Remove Vehicle From Inventory ");

            int userInput = scanner.nextInt();
            switch (userInput) {
                case 1:
                    dealershipFileManager.getDealership();
                    processGetByPriceRequest();
                    break;
                case 2:
                    dealershipFileManager.getDealership();
                    processGetByMakeModelRequest();
                    break;
                case 3:
                    dealershipFileManager.getDealership();
                    processGetByColorRequest();
                    break;
                case 4:
                    dealershipFileManager.getDealership();
                    processGetByMileageRequest();
                    break;
                case 5:
                    dealershipFileManager.getDealership();
                    processGetByYearRequest();
                    break;
                case 6:
                    dealershipFileManager.getDealership();
                    processGetAllVehiclesRequest();
                    break;
                case 7:
                    dealershipFileManager.getDealership();
                    dealership.getAllVehicles();
                    break;
                case 8:
                    dealershipFileManager.getDealership();
                    processAddVehicleRequest();
                    break;
                case 9:
                    dealershipFileManager.getDealership();
                    processRemoveVehicleRequest();
                    break;

            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
