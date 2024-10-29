package com.pluralsight.Vehicles;

public class Main {
    public static void main(String[] args) {
        Moped slowRide = new Moped();
        slowRide.setColor("Red");
        slowRide.setFuelCapacity(5);
        slowRide.wheelie();
        slowRide.setNumberOfPassengers(4);

        System.out.println(slowRide.getColor());
        System.out.println(slowRide.getNumberOfPassengers());

    }
}
