package com.demo.funda;

public class DatatypeEx {

    public static void main(String[] args)
    {
        System.out.println("Primitive Data Types in Java");
        System.out.println("1. byte");
        System.out.println("2. short");
        System.out.println("3. int");
        System.out.println("4. long");
        System.out.println("5. float");
        System.out.println("6. double");
        System.out.println("7. char");
        System.out.println("8. boolean");

        System.out.println("Size of Primitive Data Types");
        System.out.println("1. byte "+Byte.BYTES +"bytes");
        System.out.println("2. short "+Short.BYTES+"bytes");
        System.out.println("3. int "+Integer.BYTES+"bytes");
        System.out.println("4. long "+Long.BYTES+"bytes");
        System.out.println("5. float "+Float.BYTES+"bytes");
        System.out.println("6. double "+Double.BYTES+"bytes");
        System.out.println("7. char "+Character.BYTES+"bytes");

        //assign default values
        byte b=0;
        short s=0;
        int i=0;
        long l=0L;
        float f= 0.0f;
        double d=0.0d;
        char c= '\u0000';
        boolean bool =false;

        System.out.println("\n Default Values:");
        System.out.println("byte "+b);
        System.out.println("short "+s);
        System.out.println("int "+i);
        System.out.println("long "+l);
        System.out.println("float "+f);
        System.out.println("double "+d);
        System.out.println("char "+c);
        System.out.println("boolean "+bool);

        System.out.println("\n Max and Min Values");
        System.out.println("byte"+Byte.MIN_VALUE+"to"+Byte.MAX_VALUE +"bytes");
        System.out.println("short"+Short.MIN_VALUE+"to"+Short.MAX_VALUE+"bytes");
        System.out.println("int"+Integer.MIN_VALUE+"to"+Integer.MAX_VALUE+"bytes");
        System.out.println("long"+Long.MIN_VALUE+"to"+Long.MAX_VALUE+"bytes");
        System.out.println("float"+Float.MIN_VALUE+"to"+Float.MAX_VALUE+"bytes");
        System.out.println("double"+Double.MIN_VALUE+"to"+Double.MAX_VALUE+"bytes");
        System.out.println("char"+(int)Character.MIN_VALUE+"to"+(int)Character.MAX_VALUE+"bytes");
    }
}