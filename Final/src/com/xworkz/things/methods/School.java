package com.xworkz.things.methods;

public class School {
public final Student student;

    public School(Student s) {
         this.student = s;
    }

    public void showStudent() {

        System.out.println(student);
    }

    public static void main(String[] args) {
        Student s = new Student("Dinesh");
        School sch = new School(s);
        sch.showStudent();
    }
}