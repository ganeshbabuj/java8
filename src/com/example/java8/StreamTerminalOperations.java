package com.example.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTerminalOperations {

    public static void main(String[] args) {

        String[] fruits = {"Apple", "Orange", "Banana", "Blueberry"};

        Arrays.stream(fruits).forEach(System.out::println);
        Arrays.stream(fruits).forEachOrdered(System.out::println);

        List<String> collect = Arrays.stream(fruits).map(String::toUpperCase).collect(Collectors.toList());

        Map<Character, List<String>> groupingByFirstChar =  Arrays.stream(fruits)
                .collect(Collectors.groupingBy(
                        s -> s.charAt(0)
                ));
        System.out.println(groupingByFirstChar);

        String fruitsCsv = Arrays.stream(fruits)
                .map(String::toLowerCase)
                .collect(Collectors.joining(","));

        System.out.println(fruitsCsv);

        // initial value = 0 & Binary Operator to add two number
        int sum = Stream.of(2, 6, 19, 4, 30, -3).reduce(0, (e1, e2) -> e1 + e2);
        System.out.println("sum: " + sum);

    }
}
