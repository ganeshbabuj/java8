package com.example.java8;

public class EffectivelyFinal {

    static int version = 2;
    public static void main(String[] args) {
        int a = 5, b = 10, count = 0;
        count = a + 1;
        version = b + 1;
        Runnable runnable = () -> {
            // No error a is effectively final
            System.out.println(a);
            // No error version is member variable
            System.out.println(version);
            // Compilation error as count has been modified
            //System.out.println(count);
            // Compilation error as b is being modified
            //b = a - 2;
            //System.out.println(b);
        };

    }
}
