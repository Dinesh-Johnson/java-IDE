package com.xworkz.assignment.Employee;

public class Manager extends Employee{

    String department;

    public Manager(String name,int salary,String department){
        super(name,salary);
        this.department=department;
    }
    public void getDetails(){
        System.out.println("Name :"+name);
        System.out.println("Department :"+department);
        System.out.println("Salary :"+salary);
    }
}
