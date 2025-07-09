package com.xworkz.abstracts.child;

import com.xworkz.abstracts.abstrat.Person;

public class Student extends Person {


    public Student(String name, int age) {
        super(name, age);
    }

    @Override
    public void display() {
        System.out.println("Name :"+name);
        System.out.println("Age :"+age );
    }
}
