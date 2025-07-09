package com.xworkz.assoication.company;

public class Department {
    String name;
    Employee[] employees = new Employee[3];
    int empCount = 0;

    public Department(String name) {
        this.name = name;
    }

    public void addEmployee(Employee employee) {
        employees[empCount] = employee;
        empCount++;
    }

    public void showDepartmentProjects() {
        System.out.println("Department: " + name);
        for (int i = 0; i < empCount; i++) {
            employees[i].showProjects();
        }
    }
}
