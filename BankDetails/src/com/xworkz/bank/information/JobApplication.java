package com.xworkz.bank.information;

public class JobApplication {

    public static String application(){
        System.out.println("Job Recuirement");
        return "Game Developer";
    }
    public static int application(int experience){
        System.out.println("Experince");
        return experience;
    }
    public static String application(int experience,String[] skills){
        for (int i = 0; i < skills.length; i++) {
            System.out.println("The Skills are :"+skills[i]+" with the experience of :"+experience);

        }
        return "skills";
    }
    public static String application(int experience,String location){
        System.out.println("Company Location");
        return location;
    }
    public static String application(int experience,String location,double packages){
        System.out.println("Candidate Exoerience :"+experience+"- years");
        System.out.println("Job Location :"+location);
        System.out.println("Salary Packages"+packages+"- per Month");
        return "";
    }
    public static String application(boolean jobOpenings,String Location) {
        if (jobOpenings == true) {
            System.out.println("We Accept Job Openings");
        }
        return "";
    }
    public static String application(String description,String[] skills){
        System.out.println("The Job Description :"+description);
        for (int j = 0; j < skills.length; j++) {
            System.out.println("The Skills are :"+skills[j]);

        }
        return "";
    }

}
