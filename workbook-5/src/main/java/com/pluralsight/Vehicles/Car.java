package com.pluralsight.Vehicles;

public class Car extends Vehicle{
    public Car (String color, int numberOfPassengers, int cargoCapacity, int fuelCapacity) {
        System.out.println("Supercar");
        super(color, numberOfPassengers, cargoCapacity, fuelCapacity);
    }
}
