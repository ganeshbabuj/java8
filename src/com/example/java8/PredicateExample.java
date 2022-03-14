package com.example.java8;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class PredicateExample {

    public static void main(String[] args) {

        Predicate<Integer> isEven = (i) -> {return i % 2 == 0;};

        Predicate<Integer> isNegative = i -> i < 0;

        System.out.println(isEven.and(isNegative).test(10));
        System.out.println(isEven.and(isNegative).test(-6));
        System.out.println(isEven.or(isNegative).test(-3));
        System.out.println(isEven.and(isNegative.negate()).test(4));

        System.out.println("---");
        BiPredicate<Integer, Character> isAdultFemale = (age, gender) ->  age >= 18 && gender == 'F';
        System.out.println(isAdultFemale.test(10, 'F'));
        System.out.println(isAdultFemale.test(19, 'F'));

    }
}
