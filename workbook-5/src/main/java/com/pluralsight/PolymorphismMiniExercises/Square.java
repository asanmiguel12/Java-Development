package com.pluralsight.PolymorphismMiniExercises;

public class Square extends Shape {
    private double sideSize;

@Override
    public void calculateArea () {
        System.out.println(Math.pow(sideSize, 2));

    }

    public double getSideSize() {
        return sideSize;
    }

    public void setSideSize(double sideSize) {
        this.sideSize = sideSize;
    }
}
