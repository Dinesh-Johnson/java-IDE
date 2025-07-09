package com.xworkz.assoication.things;

public class Project {
    String name;
    int duriation;

    public Project(String name, int duriation) {
        this.name = name;
        this.duriation = duriation;
    }

    @Override
    public String toString() {
        return "Project{" +
                "name='" + name + '\'' +
                ", duriation in Months=" + duriation +
                '}';
    }
}
