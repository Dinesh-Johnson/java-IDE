package com.xworkz.assoication.things;

public class Department {
    String name;
    Professor[] professors = new Professor[5];
    int professorCount = 0;

    public Department(String name) {
        this.name = name;
    }

    public void addProfessor(Professor p) {
        professors[professorCount] = p;
        professorCount++;
    }

    public void showProfessors() {
        System.out.println("Department: " + name);
        for (int i = 0; i < professorCount; i++) {
            System.out.println(" - " + professors[i]);
        }
    }
}
