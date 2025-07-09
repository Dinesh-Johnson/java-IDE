package com.xworkz.assoication.runner;

import com.xworkz.assoication.things.Department;
import com.xworkz.assoication.things.Professor;
import com.xworkz.assoication.things.University;

public class UniversityRunner {
    public static void main(String[] args) {

        University university= new University("Institute of Technology");

        Department cs = new Department("Computer Science");
        cs.addProfessor(new Professor("Mr.Dinesh"));
        cs.addProfessor(new Professor("Mr.Devi"));

        Department ce = new Department("Civil Enginerring");
        ce.addProfessor(new Professor("Mrs.Devi"));
        ce.addProfessor(new Professor("Mr.Danieal"));

        university.addDepartment(cs);
        university.addDepartment(ce);

        university.showDepartments();
    }
}
