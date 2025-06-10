package com.xworkz.booking.assignment;

import com.xworkz.booking.constants.Subject;

public class SubjectRunner {
    public static void main(String[] args) {
        Subject subject = Subject.PHYSICS;
        String professor;

        if(subject == Subject.MATH) {
            professor = "Dr. Smith";
        }
        else if(subject == Subject.PHYSICS) {
            professor = "Prof. Johnson";
        }
        else {
            professor = "Dr. Williams";
        }

        System.out.println(subject + " professor: " + professor);
    }
}
