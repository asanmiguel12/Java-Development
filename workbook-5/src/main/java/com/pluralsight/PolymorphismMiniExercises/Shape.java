package com.pluralsight.PolymorphismMiniExercises;

public class Shape {
    private String color;


    public void calculateArea () {
        System.out.println("Old");
    }

    public void calculateCircumference () {
        System.out.println("Old");
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
