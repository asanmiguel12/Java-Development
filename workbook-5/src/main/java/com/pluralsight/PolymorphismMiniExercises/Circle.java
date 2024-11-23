package com.pluralsight.PolymorphismMiniExercises;

public class Circle extends Shape{
    private double radius;

@Override
    public void calculateCircumference() {
        System.out.println(2 * Math.PI * getRadius());
    }
@Override
    public void calculateArea() {
        System.out.println(Math.pow(Math.PI*getRadius(), 2));

    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
