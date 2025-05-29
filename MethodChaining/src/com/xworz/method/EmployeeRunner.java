package com.xworz.method;

public class EmployeeRunner {
    public static void main(String[] args) {

        Employee e1=new Engineer();
        e1.employee("Dinesh",1);
        e1.work();

        Employee e2=new Manager();
        e2.employee("Johnson",2);
        e2.work();
    }
}
