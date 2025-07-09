package com.xworkz.instance;

public class Football {

    public String clubName;
    public String playerName="Mbappe";
    public int goals;

    public Football(String clubName){

        this.clubName=clubName;
    }
    public Football(String playerName,int goals){
        System.out.println(playerName+"-"+goals);
        this.playerName=playerName;
        this.goals=goals;
    }

    public Football(int goals){
        System.out.println(goals);
        this.goals=goals;
    }
}
