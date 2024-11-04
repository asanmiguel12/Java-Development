package com.pluralsight.Interfaces;

public class Bird extends Animal implements Flyable{

    @Override
    public void fly() {
        System.out.println("Flap flap");

    }

    @Override
    public void glide() {
        System.out.println("Whooooshh");
    }

    @Override
    public void eat() {
        System.out.println("Peck peck peck");
    }

    @Override
    public void breathe() {
        System.out.println("Chirp chirp");

    }
}
