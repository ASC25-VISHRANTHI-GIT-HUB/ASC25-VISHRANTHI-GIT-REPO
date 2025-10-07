package com.demo.packages.p1;

public class p1c2 {
    public static void main(String[] args) {
        p1c1 p1c1 = new p1c1();
//        System.out.println(p1c1.privateVar);
//        p1c1.privateMethod();
        System.out.println(p1c1.packagePrivateVar);
        p1c1.packagePrivateMethod();
        System.out.println(p1c1.protectedVar);
        p1c1.protectedMethod();
    }
}
