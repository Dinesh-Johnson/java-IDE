package com.xworkz.abstracts.runner;

import com.xworkz.abstracts.abstrat.Employee;
import com.xworkz.abstracts.child.FullTimeEmployee;

public class EmployeeRunner {
    public static void main(String[] args) {

        Employee employee=new FullTimeEmployee();
        employee.workHours();
        System.out.println("-----------");
        employee.calculateSalary();

    }
}
