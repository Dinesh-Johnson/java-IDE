package com.xworkz.inerfaces.runner;

import com.xworkz.inerfaces.state.Course;
import com.xworkz.inerfaces.subclass.LiveCourse;

public class CourseRunner {
    public static void main(String[] args) {
        Course c1 = new Course("Java Basics", 2000);
        LiveCourse c2 = new LiveCourse("Spring Boot", 3500, 4);

        c1.displayDetails();
        c2.displayDetails();
    }
}
