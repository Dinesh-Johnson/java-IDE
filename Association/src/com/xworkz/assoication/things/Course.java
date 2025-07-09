package com.xworkz.assoication.things;

import java.util.Arrays;

public class Course {
    String coursename;
    public Students[] students;
    public int count;

    public Course(String coursename, Students[] students, int count) {
        this.coursename = coursename;
        this.students = students;
        this.count = count;
    }

    public void showStudents() {
        System.out.println("Course Name: " + coursename);
        System.out.println("Enrolled Students:");
        for (int i = 0; i < count; i++) {
            System.out.println("- " + students[i].name);
        }
    }
}
