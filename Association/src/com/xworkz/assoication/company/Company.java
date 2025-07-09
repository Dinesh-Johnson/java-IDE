package com.xworkz.assoication.company;

public class Company {
    String name;
    Department[] departments = new Department[3];
    int deptCount = 0;

    public Company(String name) {
        this.name = name;
    }

    public void addDepartment(Department d) {
        departments[deptCount++] = d;
    }

    public void showAllProjects() {
        System.out.println("Company: " + name);
        for (int i = 0; i < deptCount; i++) {
            departments[i].showDepartmentProjects();
        }
    }
}
