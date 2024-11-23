package com.pluralsight.Streams;

import java.util.List;
import java.util.stream.Collectors;

public class StreamExample {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);

        List<Double> numbersStreamed = numbers.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> Math.pow(n, 2))
                .toList();

      System.out.println(numbersStreamed);


    }
}
