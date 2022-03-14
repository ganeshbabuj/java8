package com.example.practice;

public class SimpleApp2 {

    // Using Interface
    // What if we remove this dependency. Decide later at compile or run-time
    // private Greeter greeter = new HelloGreeter();
    private Greeter greeter;

    private void greet() {
        greeter.greet();
    }

    public SimpleApp2(Greeter greeter) {
        this.greeter = greeter;
    }

    public static void main(String[] args) {
        SimpleApp2 simpleApp = new SimpleApp2(new HelloGreeter());
        simpleApp.greet();
    }

}
