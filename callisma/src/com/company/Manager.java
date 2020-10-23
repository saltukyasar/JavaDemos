package com.company;

public class Manager extends Employee{
    private int num_of_employee;
    private String position;
    public Manager(String name, String department, int salary,int num_of_employee,String position) {
        super(name,department,salary);
        this.num_of_employee=num_of_employee;
        this.position=position;
    }
    public void raiseSalary(int amount){
        System.out.println("calisanlara " + amount + " tl zam yapıldi");
    }


    @Override
    public void showInfos() {
        super.showInfos();

        System.out.println("sorumlu kisi sayisi " + this.num_of_employee);
        System.out.println("position " + this.position);
    }

    @Override
    public String toString() {
        return "Manager{}";
    }
}
