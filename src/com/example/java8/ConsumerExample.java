package com.example.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        Consumer<String> display = s -> System.out.println(s);
        Consumer<String> toUpper = s -> System.out.println(s.toUpperCase());

        display.accept("Hello");
        toUpper.accept("Hello");

        System.out.println("---");
        display.andThen(toUpper).andThen(display).accept("Hello");

        BiConsumer<Integer, Integer> add = (a, b) -> {
            System.out.println("Addition : " + (a + b));
        };
        BiConsumer<Integer, Integer> subtract = (a, b) -> {
            System.out.println("Subtraction : "  + (a - b));
        };
        BiConsumer<Integer, Integer> multiply = (a, b) -> {
            System.out.println("Multiplication : "  + (a * b));
        };
        add.andThen(subtract).andThen(multiply).accept(8, 6);
    }
}
