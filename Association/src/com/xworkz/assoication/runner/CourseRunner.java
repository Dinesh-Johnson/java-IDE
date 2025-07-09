package com.xworkz.assoication.runner;

import com.xworkz.assoication.things.Course;
import com.xworkz.assoication.things.Students;


public class CourseRunner {
    public static void main(String[] args) {

        Students student1 = new Students("Dinesh", new Course[2], 0);
        Students student2 = new Students("Anita", new Course[2], 0);

        Course course1 = new Course("Java", new Students[2], 0);
        Course course2 = new Course("Python", new Students[2], 0);

        student1.courses[0] = course1;
        student1.courses[1] = course2;
        student1.count = 2;


        student2.courses[0] = course1;
        student2.count = 1;


        course1.students[0] = student1;
        course1.students[1] = student2;
        course1.count = 2;


        course2.students[0] = student1;
        course2.count = 1;

        student1.showCourses();
        student2.showCourses();
        course1.showStudents();
        course2.showStudents();
    }
}
