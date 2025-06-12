package com.xworkz.inerfaces.state;

public class Course {
    public String title;
    public double fee;

    public Course(String title, double fee) {
        this.title = title;
        this.fee = fee;
    }

    public void displayDetails(){
        System.out.println(title+" : $"+fee);
    }
}
