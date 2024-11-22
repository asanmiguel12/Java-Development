package com.pluralsight.Interfaces.Devices;

public class Portable extends Device implements Charge{
    @Override
    public void charge() {

    }

    @Override
    public void turnOn() {
        super.turnOn();
    }

    @Override
    public void turnOff() {
        super.turnOff();
    }
}
