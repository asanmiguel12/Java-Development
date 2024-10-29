package com.pluralsight.Vehicles;

public class Car extends Vehicle{
    public Car (String model) {
        System.out.println("Supercar");
        super("Red", 3, 3, 3);
    }
}
