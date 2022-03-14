package com.example.java8;

import java.util.Optional;

public class OptionalExample {

    public static void main(String[] args) {

        // Create
        Optional<String> opt1 = Optional.empty();
        Optional<String> opt2 = Optional.of("Hello!");
        Optional<String> opt3 = Optional.ofNullable(null);

        // Get the value
        //System.out.println(opt2.get());
        //Throws NoSuchElementException
        System.out.println(opt1.get());
        System.out.println(opt3.get());

        //Optional<String> opt5 = Optional.of(null);

        // Check if present
        System.out.println(opt1.isPresent());
        System.out.println(opt2.isPresent());
        System.out.println(opt3.isPresent());

        // Replacing null check with Optional
        String greeting = "Hello World!";
        if(greeting != null) {
            System.out.println(greeting.toUpperCase());
        }

        Optional<String> opt4 = Optional.of("Hello World!");
        opt4.ifPresent(s -> System.out.println(s.toUpperCase()));


    }
}
