package com.pluralsight.PolymorphismMiniExercises;

public class Main {
    public static void main(String[] args) {


        Shape s1 = new Shape();
        Shape s2 = new Square();
        Shape s3 = new Circle();

        ((Square)s2).setSideSize(5);



        s3.calculateCircumference();
        s2.calculateArea();
        s1.getColor();
        s1.calculateCircumference();
        System.out.println(((Square)s2).getSideSize());
    }
}