package com.example.java8;

import java.time.LocalDateTime;
import java.util.function.Supplier;

public class SupplierExample {

    public static void main(String[] args) {

        Supplier<LocalDateTime> currentTimeSupplier = () -> LocalDateTime.now();
        LocalDateTime time = currentTimeSupplier.get();
        System.out.println(time);

    }
}
