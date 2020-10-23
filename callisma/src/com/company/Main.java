package com.company;

import sun.security.x509.IssuerAlternativeNameExtension;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Employee employee = new Employee("saltuk","it",101010000);

        employee.showInfos();

        Manager manager=new Manager("asdad","asdasdsaf",123123123,54,"patron");

       /* manager.showInfos();
        manager.raiseSalary(131);*/
        System.out.println(manager);

        System.out.println();

        Employee employee1=new Manager("saltukyasr","IT",23333,23,"sda");
        employee1.showInfos();
    }
}
