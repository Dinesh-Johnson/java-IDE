package com.xworkz.inerfaces.interfaces;

import com.xworkz.inerfaces.state.Student;

public interface StudentOperations {
    void addStudent(Student s);
    void viewStudents();
    void updateStudent(int rollNumber, Student updatedStudent);
    void deleteStudent(int rollNumber);
}
