package com.demo.packages.p1;

public class p1c1 {

    private String privateVar = "private var";
    private void privateMethod(){
        System.out.println("Private Method!");
    }

    String packagePrivateVar = "package private var";
    void packagePrivateMethod(){
        System.out.println("Package Private Method!");
    }

    protected String protectedVar="protected var";
    protected void protectedMethod()
    {
        System.out.println("Protected Method");
    }

    public static void main(String[] args) {
        p1c1 p1c1 = new p1c1();
        System.out.println(p1c1.privateVar);
        p1c1.privateMethod();
        System.out.println(p1c1.packagePrivateVar);
        p1c1.packagePrivateMethod();
        System.out.println(p1c1.protectedVar);
        p1c1.protectedMethod();
    }
}
