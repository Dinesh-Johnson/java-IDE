package com.xworkz.assoication.things;

public class Company {

    String name;
    Project[] projects;
    int count;

    public Company(String name, Project[] projects, int count) {
        this.name = name;
        this.projects = projects;
        this.count = count;
    }

    public void showProjects(){
        System.out.println(name+" pvt Ltd.");
        System.out.println("..The Projects are..");
        for (int i = 0; i < count; i++) {
            System.out.println(" -"+projects[i]);
        }
    }
}
