package com.pluralsight.Vehicles;


public class Moped extends Vehicle{
    public Moped (int handlebarWidth) {
        super("Red", 3, 3, 3);
    }
public void wheelie() {
    System.out.println("Moped is doing wheelie");
}
}
