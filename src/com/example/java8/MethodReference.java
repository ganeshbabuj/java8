package com.example.java8;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;


public class MethodReference {

    public static void main(String[] args) {

        Function<Integer, String> toString = String::valueOf;
        System.out.println (toString.apply(10));

        Consumer<String> printer = System.out::println;
        printer.accept("Hello");

        Function<String, String> toUpper = String::toUpperCase;
        System.out.println(toUpper.apply("Hello"));

        Function<String, Integer> toInt = Integer::new;
        System.out.println(toInt.apply("10"));

    }
}
