package com.xworkz.instance;

public class Team {

    public void win(){
        win("CSK",18);
        System.out.println("These are the Winning Team");
    }
    public void win(String name,int wins){
        team("Chennai Super Kings");
        System.out.println("The Team wins -"+name+" "+wins+" wins");
    }
    public static void team(String name){
        System.out.println("The successful IPL team is :"+name);

    }
}
