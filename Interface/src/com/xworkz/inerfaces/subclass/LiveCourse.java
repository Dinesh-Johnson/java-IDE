package com.xworkz.inerfaces.subclass;

import com.xworkz.inerfaces.state.Course;

public class LiveCourse extends Course {
    public int durationInWeeks;


    public LiveCourse(String title, double fee,int durationInWeeks) {
        super(title, fee);
        this.durationInWeeks=durationInWeeks;
    }

    @Override
    public void displayDetails(){
        System.out.println(title + ": $" + fee + " - " + durationInWeeks + " weeks");
    }
}
