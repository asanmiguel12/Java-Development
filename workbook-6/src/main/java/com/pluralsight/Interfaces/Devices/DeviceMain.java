package com.pluralsight.Interfaces.Devices;

public class DeviceMain {
    public static void main(String[] args) {
        Portable laptop = new Laptop();

        laptop.turnOn();
        laptop.charge();

        Stationary tv = new TV();
        tv.turnOn();
    }
}
