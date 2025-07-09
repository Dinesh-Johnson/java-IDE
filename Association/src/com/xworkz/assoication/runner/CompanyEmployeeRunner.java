package com.xworkz.assoication.runner;

import com.xworkz.assoication.company.Company;
import com.xworkz.assoication.company.Department;
import com.xworkz.assoication.company.Employee;
import com.xworkz.assoication.company.Project;

public class CompanyEmployeeRunner {
    public static void main(String[] args) {
        Company comp = new Company("TechCorp");

        Department dev = new Department("Development");
        Employee e1 = new Employee("Dinesh");
        e1.addProject(new Project("Website"));
        e1.addProject(new Project("App"));

        Employee e2 = new Employee("Anusha");
        e2.addProject(new Project("Software Development"));

        Department hr = new Department("HR");
        Employee e3 = new Employee("Anne");
        e3.addProject(new Project("Cybersecurity"));
        dev.addEmployee(e1);
        dev.addEmployee(e2);
        System.out.println();

        hr.addEmployee(e3);
        System.out.println();

        comp.addDepartment(dev);
        comp.addDepartment(hr);

        comp.showAllProjects();
    }

}
