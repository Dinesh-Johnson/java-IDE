package com.xworkz.assoication.company;

public class Employee {
    String employeeName;
    Project projects[]=new Project[3];
    int projectCount;

    public Employee(String employeeName) {
        this.employeeName = employeeName;
    }

    public void addProject(Project project){
        projects[projectCount]=project;
        projectCount++;
    }
    public void showProjects(){
        System.out.println("Employee Name :"+ employeeName);
        for (int i = 0; i < projectCount; i++) {
            System.out.println(" "+projects[i]);
        }
    }
}
