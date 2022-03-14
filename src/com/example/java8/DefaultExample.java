package com.example.java8;

import java.util.concurrent.Callable;
import java.util.concurrent.Future;

interface A {
    default void printName() {
        System.out.println("A->" + getClass().getName());
    }
    default void sayHello() {
        System.out.println("Hello from interface!");
    }
}

interface B {
    default void printName() {
        System.out.println("B->" + getClass().getName());
    }
}

interface C extends A, B {
    //Error if not overridden as both A & B has printName
    @Override
    default void printName() {
        System.out.println("C->" + getClass().getName());
    }
}

public class DefaultExample implements C {
    @Override
    public void sayHello() {
        System.out.println("Hello from Class!");
    }
    public static void main(String[] args) {
        DefaultExample de = new DefaultExample();
        de.printName();
        de.sayHello();
    }
}
