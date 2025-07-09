package com.xworkz.assoication.things;

public class University {

    String name;
    Department[] departments = new Department[5];
    int deptCount = 0;

    public University(String name) {
        this.name = name;
    }

    public void addDepartment(Department d) {
        departments[deptCount++] = d;
    }

    public void showDepartments() {
        System.out.println("University: " + name);
        for (int i = 0; i < deptCount; i++) {
            departments[i].showProfessors();
        }
    }
}
