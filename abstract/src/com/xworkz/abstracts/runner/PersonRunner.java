package com.xworkz.abstracts.runner;

import com.xworkz.abstracts.abstrat.Person;
import com.xworkz.abstracts.child.Student;

public class PersonRunner {

    public static void main(String[] args) {

        Person person=new Student("Dinesh",28);
        person.display();
    }
}
