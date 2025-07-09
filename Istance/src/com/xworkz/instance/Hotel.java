package com.xworkz.instance;

public class Hotel {

    public String name = "Tribbiani Hotel";
    public int room;
    public String type;
    public int night_rate=3500;

    public Hotel(){
        System.out.println("Welcom to the Hotel");
    }
    public Hotel(int room,String type){
        System.out.println("Room Number :"+room+" - "+type);
        this.room=room;
        this.type=type;
    }
    public Hotel(int room,String typer,int night_rate){
        this.room=room;
        this.type=type;
        this.night_rate=night_rate;
    }


}
