package com.pluralsight.Streams;

import java.util.List;

public class IntermediateOperationsExample {
    public static void main(String[] args) {
        List<String> groceries = List.of("Eggs", "Milk", "Detergent", "Toothpaste", "Paper");

        List<String> groceriesLessThan6Capitalized = groceries.stream()
                .filter(g -> g.toUpperCase().length() < 5)
                .toList();
        System.out.println(groceriesLessThan6Capitalized);
    }
}
