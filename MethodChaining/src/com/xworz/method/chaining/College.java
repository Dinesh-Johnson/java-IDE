package com.xworz.method.chaining;

public class College {

    public College() {
        this("Civil Engineering");
        System.out.println("Government college");
    }

    public College(String dept) {
        System.out.println("Department: " + dept);
    }

    public void enrollStudent() {
        attendClass(100);
        System.out.println("Student enrolled...");
    }

    public void attendClass(int attendenance) {
        System.out.println("Attending class :"+attendenance+"%");
        exam();
    }

    public static void exam() {
        System.out.println("..Evaluating exam...");
        results("All clear");
    }

    public static void results(String result) {
        System.out.println("Results published");
        System.out.println(result);
    }
}
