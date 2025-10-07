package com.demo.exeptions;

public class HandledException {
    int result;
    public static void main(String[] args){
        HandledException obj1 = new HandledException();
        obj1.test();
    }

    private void test(){
        try{
            int i=100;
            System.out.println("divide by zero");
            result = i/0;
        }catch(Exception exception){
            System.out.println("Exception occured: "+exception);
        }

        System.out.println("abruptly terminated, so this does not execute");
        System.out.println(result);
    }
}