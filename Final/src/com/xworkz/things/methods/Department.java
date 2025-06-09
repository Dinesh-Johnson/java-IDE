package com.xworkz.things.methods;

public class Department {
public final Employee emp;

    public Department(Employee emp) {

        this.emp = emp;

    }

    public void showEmployee() {

        System.out.println(emp);
    }

    public static void main(String[] args) {
        Employee e = new Employee(101);
        Department d = new Department(e);
        d.showEmployee();
    }
}