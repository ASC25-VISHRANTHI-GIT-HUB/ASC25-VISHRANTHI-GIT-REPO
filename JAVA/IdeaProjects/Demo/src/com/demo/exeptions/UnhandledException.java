package com.demo.exeptions;

public class UnhandledException {
    public static void main(String[] args) {
        int result=0;
        try {
            int i = 100;
            System.out.println("divide by zero");
            result = i / 0;
        } catch (Exception exception) {
            System.out.println("Exception Occured : "+exception);
        }System.out.println("abruptly terminated, so this does not execute");
        System.out.println(result);
    }

}
