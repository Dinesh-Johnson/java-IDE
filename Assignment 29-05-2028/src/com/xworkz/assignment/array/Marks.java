package com.xworkz.assignment.array;

public class Marks {
    public static void main(String[] args) {
        int[] marks = {75,88,37,55,66};

        int max = marks[0];
        int min = marks[0];
        int sum = 0;

        for (int i = 0; i < marks.length; i++) {
            if (marks[i] > max) max = marks[i];
            if (marks[i] < min) min = marks[i];
            sum += marks[i];
        }

        double avg = (double) sum / marks.length;
        System.out.println("Highest: " + max + ", Lowest: " + min + ", Average: " + avg);
    }
}
