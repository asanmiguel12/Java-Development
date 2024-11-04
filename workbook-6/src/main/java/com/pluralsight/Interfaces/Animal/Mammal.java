package com.pluralsight.Interfaces.Animal;

public class Mammal extends Animal{

    @Override
    public void eat() {
        System.out.println("Chomp chomp");
    }

    @Override
    public void breathe() {
        System.out.println("Huff puff");

    }
}
