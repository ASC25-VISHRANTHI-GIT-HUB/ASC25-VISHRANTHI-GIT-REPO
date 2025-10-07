package com.demo.packages.p2;
import com.demo.packages.p1.p1c1;
import com.demo.packages.p1.p1c3;

public class p2c3 extends p1c3{
    public static void main(String[] args) {
        p1c3 p1c3=new p1c3();
        p1c3.testAccess();
    }
    public void testAccess()
    {
        p1c1 p1c1 = new p1c1();
//        System.out.println(p1c1.privateVar);
//        p1c1.privateMethod();
//        System.out.println(p1c1.packagePrivateVar);
//        p1c1.packagePrivateMethod();
//        System.out.println(p1c1.protectedVar+" By object P1C1");
//        p1c1.protectedMethod();
        System.out.println(protectedVar + "By inheritence");
        protectedMethod();
    }
}
