package com.example.java8;

import java.util.stream.IntStream;

public class ParallelStreamExample {

    public static void main(String[] args) {

        System.out.println("Sequential Stream");
        IntStream range1 = IntStream.rangeClosed(1, 3);
        range1.forEach(e -> System.out.println(e + ": " + Thread.currentThread().getName()));

        System.out.println("Parallel Stream");
        IntStream range2 = IntStream.rangeClosed(1, 3);
        range2.parallel().forEach(e -> System.out.println(e + ": " + Thread.currentThread().getName()));

    }
}
