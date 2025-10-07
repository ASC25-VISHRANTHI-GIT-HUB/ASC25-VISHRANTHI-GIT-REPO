package com.exercise.lab2;

public class WelcomeMethod {
    public static String welcomeMessage(String name) {
        return "Hello " + name + ", Welcome to Java World!";
    }

    public static void main(String[] args) {
        String name = "Vishranthi";
        String message = welcomeMessage(name);
        System.out.println(message);
    }

}
