package com.example.practice;

public class SimpleApp1 {

    // Using Class
    private WelcomeGreeter welcomeGreeter = new WelcomeGreeter();
    private HelloGreeter helloGreeter = new HelloGreeter();

    // Using Interface
    private Greeter greeter = new HelloGreeter();

    private void greet() {
        greeter.greet();
    }

    public static void main(String[] args) {
        SimpleApp1 simpleApp = new SimpleApp1();
        simpleApp.greet();
    }

}