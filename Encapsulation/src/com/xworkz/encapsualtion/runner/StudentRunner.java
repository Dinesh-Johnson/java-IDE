package com.xworkz.encapsualtion.runner;

import com.xworkz.encapsualtion.things.Student;

public class StudentRunner {
    public static void main(String[] args) {

        Student student= new Student();
        student.setName("Dinesh");
        student.setRollNumber(1114563);
        System.out.println("Student Name :"+student.getName());
        System.out.println("Roll no. :"+student.getRollNumber());
    }
}
