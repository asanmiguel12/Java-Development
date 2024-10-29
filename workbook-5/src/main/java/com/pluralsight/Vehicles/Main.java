package com.pluralsight.Vehicles;

public class Main {
    public static void main(String[] args) {
        Moped slowRide = new Moped(5);
        slowRide.setColor("Red");
        slowRide.setFuelCapacity(5);
        slowRide.wheelie();


        Car bessie = new Car("Red", 3, 3, 3);


        System.out.println(slowRide.getColor());
        System.out.println(slowRide.getNumberOfPassengers());
        System.out.println(bessie.getCargoCapacity());

    }
}
