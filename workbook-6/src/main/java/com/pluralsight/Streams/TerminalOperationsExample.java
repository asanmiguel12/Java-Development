package com.pluralsight.Streams;

import java.util.List;

public class TerminalOperationsExample {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);

        System.out.println( numbers.stream().filter(n -> n % 2 == 0).count() );

        //To List
        List<Integer> evenNumbers = numbers.stream()
                .filter(n -> n % 2 == 0)
                .toList();

        System.out.println(evenNumbers.size());

    }
}
