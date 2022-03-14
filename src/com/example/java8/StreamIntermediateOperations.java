package com.example.java8;

import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamIntermediateOperations {

    public static void main(String[] args) {

        String[] fruits = {"Apple", "Orange", "Banana", "Blueberry"};
        // Note: forEach is terminal operation
        Arrays.stream(fruits).filter(s -> s.startsWith("B")).map(String::toUpperCase).forEach(System.out::println);

        Arrays.stream(fruits).map(String::toUpperCase).forEach(System.out::println);

        Arrays.stream(fruits).mapToInt(String::length).forEach(System.out::println);
        Arrays.stream(fruits).sorted().forEach(System.out::println);

        System.out.println("---------");
        String[][] fruitBuckets = {{"Apple", "Apricots"}, {"Orange", "Olives"}, {"Banana", "Blueberry"}};
        Arrays.stream(fruitBuckets).flatMap(Arrays::stream).forEach(System.out::println);


    }
}
