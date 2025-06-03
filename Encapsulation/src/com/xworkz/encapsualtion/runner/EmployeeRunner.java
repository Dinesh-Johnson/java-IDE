package com.xworkz.encapsualtion.runner;

import com.xworkz.encapsualtion.things.Employee;

public class EmployeeRunner {
    public static void main(String[] args) {

        Employee employee=new Employee();
        employee.setEmpName("Dinesh");
        employee.setEmpId(522245);
        employee.setSalary(20000.00);
        System.out.println("Employe ID :"+employee.getEmpId());
        System.out.println("Employee Name :"+employee.getEmpName());
        System.out.println("Salary :"+employee.getSalary());
    }
}
