package com.pluralsight.Vehicles;

public class Hovercraft extends Vehicle {
    private int hoverHeight;
    public Hovercraft (int hoverHeight){
        super("Red", 3, 3, 3);
        this.hoverHeight = hoverHeight;
    }
}
