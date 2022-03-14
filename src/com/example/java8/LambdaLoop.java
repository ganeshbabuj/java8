package com.example.java8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LambdaLoop{

    public static void main(String[] args) {

        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("Banana");

        // Simple loop
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        fruits.forEach(System.out::println);

        // lambda expression
        fruits.forEach(fruit -> System.out.println(fruit));

        Map<String, String> fruitColorMap = new HashMap<>();
        fruitColorMap.put("Apple", "Red");
        fruitColorMap.put("Orange", "Orange");
        fruitColorMap.put("Banana", "Banana");

        // Simple loop
        for (Map.Entry<String, String> entry : fruitColorMap.entrySet()) {
            String fruit = entry.getKey();
            String color = entry.getValue();
            System.out.println(fruit + ": " + color);
        }
        // lambda expression
        fruitColorMap.forEach( (fruit, color) -> System.out.println(fruit + ": " + color) );

    }

}