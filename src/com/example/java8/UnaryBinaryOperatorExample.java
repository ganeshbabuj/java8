package com.example.java8;

import java.util.Comparator;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class UnaryBinaryOperatorExample {

    public static void main(String[] args) {

        //Function<String, String> greetingFunction = s -> "Hello " + s;

        UnaryOperator<String> greeting = s -> "Hello " + s;

        System.out.println(greeting.apply("World"));

        BinaryOperator<Integer> multiplication = (a, b) -> a*b;
        System.out.println(multiplication.apply(10,6));

        Comparator<Integer> comparator = (a, b) -> a.compareTo(b);
        BinaryOperator<Integer> maxBy = BinaryOperator.maxBy(comparator);
        System.out.println("Max: " + maxBy.apply(2, 9));

        BinaryOperator<Integer> minBy = BinaryOperator.minBy(comparator);
        System.out.println("Min: " + minBy.apply(5, 8));

    }
}
