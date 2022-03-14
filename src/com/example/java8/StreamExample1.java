package com.example.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample1
{
    public static void main(String[] args) {

        String[] fruits = {"Apple", "Orange", "Banana", "Blueberry"};

        for(String fruit: fruits) {
            System.out.println(fruit);
        }
        Arrays.stream(fruits).forEach(str -> System.out.println(str));

        List<String> fruitList = Arrays.asList(fruits);
        System.out.println(fruitList.stream().count());
        fruitList.parallelStream()
                .map(name -> name.toUpperCase())
                .forEach(name -> System.out.println(name));


        System.out.println("\n----\n");

        List<String> filteredList = fruitList.stream().filter(f -> f.startsWith("B"))
                .peek(f -> System.out.println("Filtered: " + f))
                .map(String::toUpperCase)
                .peek(f -> System.out.println("Mapped: " + f))
                .collect(Collectors.toList());

        System.out.println(filteredList);


    }
}
