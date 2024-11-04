package com.pluralsight.Interfaces;

public class Eagle extends Bird implements Flyable{
    @Override
public void fly() {
        System.out.println("The eagle is flying");
    }
}