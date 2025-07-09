package com.xworkz.assoication.runner;

import com.xworkz.assoication.things.Company;
import com.xworkz.assoication.things.Project;

public class CompanyRunner {
    public static void main(String[] args) {

        Project p1= new Project("Telecom Towers",1);
        Project p2=new Project("Commercial Building",10);


        Project[] projects=new Project[2];
        projects[0]=p1;
        projects[1]=p2;

        Company company= new Company("JD Constructions",projects,2);

        company.showProjects();
        System.out.println(projects.toString());
    }
}
