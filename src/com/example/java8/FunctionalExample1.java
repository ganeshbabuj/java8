package com.example.java8;

import java.util.Arrays;

public class FunctionalExample1 {

    public static void main(String[] args) {

        int[] arr = new int[] {10, 38, 8, 70, 25};

        // Imperative
        int max1 = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max1) {
                max1 = arr[i];
            }
        }
        System.out.println("max1: " + max1);


        // Declarative
        int max2 = Arrays.stream(arr).max().getAsInt();
        System.out.println("max2: " + max2);

    }
}
