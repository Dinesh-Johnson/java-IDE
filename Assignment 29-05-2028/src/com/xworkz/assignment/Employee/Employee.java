package com.xworkz.assignment.Employee;

public class Employee {
    //2. Use of super keyword
    //Create a class Employee with a constructor initializing name and salary.
    // Create a subclass Manager that adds a department.
    // Use super to call the parent constructor and display all details.

    String name;
    int salary;

    public Employee(String name,int salary){
        this.name=name;
        this.salary=salary;
    }
}
