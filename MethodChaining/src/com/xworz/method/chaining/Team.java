package com.xworz.method.chaining;

public class Team {

    public Team(){
        this("IPL");
        System.out.println("INDIAN PREMIERE LEAGUE");
    }
    public Team(String sortForm){
        this.win("Mumbai Indians",18);
        System.out.println();
    }

    public void win(){
        win("CSK",18);
        team("Mumbai indians");
        System.out.println("These are the Team");
    }
    public void win(String name,int wins){
        team("Chennai Super Kings");
        System.out.println("The com.xworz.method.chaining.Team wins -"+name+" "+wins+" wins");
    }
    public static void team(String name){
        System.out.println("The successful IPL team is :"+name);

    }
}
