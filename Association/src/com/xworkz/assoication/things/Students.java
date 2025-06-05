package com.xworkz.assoication.things;

import java.util.Arrays;

public class Students {
    String name;
    public Course[] courses;
    public int count;

    public Students(String name, Course[] courses, int count) {
        this.name = name;
        this.courses = courses;
        this.count = count;
    }

    public void showCourses() {
        System.out.println("Student Name: " + name);
        System.out.println("Enrolled Courses:");
        for (int i = 0; i < count; i++) {
            System.out.println("- " + courses[i].coursename);
        }
    }

    @Override
    public String toString() {
        return "Students{" +
                "courses=" + Arrays.toString(courses) +
                ", name='" + name + '\'' +
                '}';
    }
}
