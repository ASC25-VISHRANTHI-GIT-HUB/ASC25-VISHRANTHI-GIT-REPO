package com.demo.funda;

public class WrapperTypes {
    public static void main(String[] args) {
        float floatPrimitive = 10.5f;
        Float floatObj = Float.valueOf(floatPrimitive);
        System.out.println("Float value: "+floatObj);

        float nanValue = 0.0f / 0.0f;
        Float nanObj= Float.valueOf(nanValue);

        System.out.println("isNaN: "+floatObj.isNaN());
        System.out.println("isNaN (NaN value)"+nanObj.isNaN());
        //other methods
        System.out.println("isInfinite: "+floatObj.isInfinite());
        System.out.println("toString: "+floatObj+" Float");
        System.out.println("hashCode: "+floatObj.hashCode());
        System.out.println("compare To (with 10.5f): "+floatObj.compareTo(10.5f));
        System.out.println("compare To (with 20.5f): "+floatObj.compareTo(20.5f));
        System.out.println("compare To (with 5.5f): "+floatObj.compareTo(5.5f));
        System.out.println("Equals (with 10.5f): "+floatObj.equals(10.5f));

        //find the difference between two float values
        Float anotherFloatObj=Float.valueOf(20.5f);
        System.out.println("compare To (with 10.5f): "+floatObj.compareTo(10.5f));
    }
}
