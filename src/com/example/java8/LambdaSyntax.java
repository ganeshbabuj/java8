package com.example.java8;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.IntBinaryOperator;

public class LambdaSyntax {

    public static void main(String[] args) {

        // No arguments, single statement
        Runnable runnable1 = () -> System.out.println("Hello World!");

        // Single argument, single statement
        Consumer<String> consumer1 = name -> System.out.println("Hello " + name);

        // With data types and return
        IntBinaryOperator intBinaryOperator1 = (int a, int b) -> a * b;

        // Set of statements
        IntBinaryOperator intBinaryOperator2 = (a, b) -> {
            int sum = a * b;
            return sum;
        };

    }
}
