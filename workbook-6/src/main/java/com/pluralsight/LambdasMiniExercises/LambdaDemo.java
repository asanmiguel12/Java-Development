package com.pluralsight.LambdasMiniExercises;

public class LambdaDemo {
    public static void main(String[] args) {
        UnaryOperator squared = (a) -> System.out.println(Math.pow(a, 2));
        squared.apply(12);

        TriFunction average = (a, b, c) -> System.out.println((a + b + c ) / 3 );
        average.calculate(12, 12, 12);

        Printer printString = a -> System.out.println(a);
        printString.print("Hola");

        Predicate<String> trueORFalse = t -> true;
        System.out.println(trueORFalse.test("What"));

        Predicate<String> isEmpty = t -> Boolean.parseBoolean(true ? " " : "sjklfs");

        Predicate<String>
    }
}