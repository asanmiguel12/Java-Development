package com.pluralsight.Streams;

import java.util.List;
import java.util.stream.Stream;

public class LoopToForEachExample {
    public static void main(String[] args) {
        List<String> groceries = List.of("Eggs", "Milk", "Detergent", "Toothpaste", "Paper");

        Stream<String> groceryList = groceries.stream();
                groceryList.forEach(g -> System.out.println(g));

        System.out.println(groceries.toString());

    }
}
