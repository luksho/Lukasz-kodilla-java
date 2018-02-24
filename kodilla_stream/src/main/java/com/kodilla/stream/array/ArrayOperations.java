package com.kodilla.stream.array;

import java.util.stream.IntStream;

public interface ArrayOperations {
    static double getAverage(int[] number) {
        IntStream.range(0, number.length)
                .map(n -> number[n])
                .forEach(System.out::println);

        double average = IntStream.range(0,number.length)
                .map(n -> number[n])
                .average().getAsDouble();
        return average;

    }
}

