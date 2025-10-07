package com.demo.Static;

public class staticEx {
    public static void main(String[] args) {
        Employee.companyName="Ascendion";
        Employee employee1=null; //new Employee();
        employee1.employeename="John";
        Employee employee2=new Employee();
        //employee2.employeename="Rambo";

        System.out.println(Employee.companyName);
        System.out.println(Employee.employeename);
        System.out.println(employee2.employeename);
    }
}
class Employee
{
    static String companyName;
    static String employeename;
}
