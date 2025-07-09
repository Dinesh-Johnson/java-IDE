package com.xworkz.inerfaces.runner;

import com.xworkz.inerfaces.state.Student;
import com.xworkz.inerfaces.subclass.StudentManagerimpl;

public class StudentRunner {
    public static void main(String[] args) {
        StudentManagerimpl manager = new StudentManagerimpl();

        Student s1 = new Student(1201, "Dinesh", "Java", 72);
        Student s2 = new Student(1202, "Aishwarya", "Python", 65);
        Student s3 = new Student(1203, "Kiran", "C++", 38);
        manager.addStudent(s1);
        manager.addStudent(s2);
        manager.addStudent(s3);
        System.out.println("All Students:");
        manager.viewStudents();

        Student updated = new Student(102, "Lakshmi", "Python Advanced", 75);
        manager.updateStudent(102, updated);
        manager.viewStudents();

        manager.deleteStudent(103);

        System.out.println("After Deletion:");
        manager.viewStudents();

        System.out.println("Report:");
        manager.generateReport();
    }
}
