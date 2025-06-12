package com.xworkz.inerfaces.subclass;

import com.xworkz.inerfaces.interfaces.ReportGenerator;
import com.xworkz.inerfaces.interfaces.StudentOperations;
import com.xworkz.inerfaces.state.Student;

public class StudentManagerimpl implements StudentOperations, ReportGenerator {
    Student[] students=new Student[10];
    int count=0;

    @Override
    public void generateReport() {
        for (int i = 0; i < count; i++) {
            if (students[i]!=null && students[i].marks>=40){
                System.out.println("Passed: " + students[i]);
            }
            else {
                System.err.println("Failed: " + students[i]);
            }
        }

    }

    @Override
    public void addStudent(Student s) {
        if (count<students.length){
            students[count]=s;
            count++;
        }

    }

    @Override
    public void viewStudents() {
        for (int i = 0; i < count; i++) {
            System.out.println(students[i]);

        }

    }

    @Override
    public void updateStudent(int rollNumber, Student updatedStudent) {
        for (int i = 0; i < count; i++) {
            if (students[i].rollNumber==rollNumber){
                students[i].name =updatedStudent.name;
                students[i].course=updatedStudent.course;
                students[i].marks=updatedStudent.marks;
            }

        }

    }

    @Override
    public void deleteStudent(int rollNumber) {
        for (int i = 0; i < count; i++) {
            if (students[i].rollNumber==rollNumber){
                students[i]=null;

            }

        }

    }
}
