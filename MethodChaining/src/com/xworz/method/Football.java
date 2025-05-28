package com.xworz.method;

public class Football {

    public Football(){
        this("Real Madrid");
        System.out.println("Football Clubs");
    }
    public Football(String name){
        System.out.println("Club Name is :"+name);
    }
    public static String clubs(String player,int goals){
        System.out.println(player+"-"+goals);
        return "";
    }
    public static String clubs(String nations){
        System.out.println("Nation of the Club :"+nations);
        return clubs("Cristiano Ronaldo",350);
    }
    public void Nation(String nationalTeam){
        clubs("Benzema",300);
        System.out.println("National Team :"+nationalTeam);
    }
    public  void Nation(String playerNAme,int goals){
        Nation("Portugal");
        System.out.println(playerNAme+"-"+goals);
    }

}
