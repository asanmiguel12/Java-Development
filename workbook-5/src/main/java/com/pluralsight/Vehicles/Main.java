package com.pluralsight.Vehicles;

public class Main {
    public static void main(String[] args) {
        Moped slowRide = new Moped(5);
        slowRide.setColor("Red");
        slowRide.setFuelCapacity(5);
        slowRide.wheelie();


        Car bessie = new Car("Coupe");
        bessie.setCargoCapacity(20);

        System.out.println(slowRide.getColor());
        System.out.println(slowRide.getNumberOfPassengers());

    }
}
