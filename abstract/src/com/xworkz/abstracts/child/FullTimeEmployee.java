package com.xworkz.abstracts.child;

import com.xworkz.abstracts.abstrat.Employee;

public class FullTimeEmployee extends Employee {

    @Override
    public void calculateSalary() {
        System.out.println("Salary is Rs.50000");
    }
}
