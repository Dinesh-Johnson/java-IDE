package com.xworkz.test;

public class CommandLine {


    public static void main(String[] args) {
        int[] line={1,2,3};
        String command ="Command line Arguments";
        System.out.println(command);

        for (int i = 0; i < line.length; i++) {
            System.out.print(" "+line[i]);
        }

    }
}
