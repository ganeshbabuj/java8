package com.example.java8;

import java.util.function.BiFunction;
import java.util.function.Function;

public class FunctionExample {

    public static void main(String[] args) {

        Function<String, String> toUpper = (name) -> name.toUpperCase();

        Function<String, String> prefixHello = (name) -> "Hello " + name;

        System.out.println(toUpper.apply("World"));

        System.out.println(toUpper.apply("World"));
        System.out.println(prefixHello.apply("WORLD"));
        System.out.println("---");
        System.out.println(toUpper.andThen(prefixHello).apply("World"));
        System.out.println(toUpper.compose(prefixHello).apply("World"));

        Function<String, String> identityFunction = Function.identity();
        System.out.println(identityFunction.apply("World"));

        BiFunction<Integer, Double, Double> yearlyInterest = (p, r) -> p * r / 100;
        Double interest = yearlyInterest.apply(1000, 4.0);
        System.out.println(interest);

    }
}
