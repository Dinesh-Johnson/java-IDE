package com.xworz.method;

public class Warrior extends Character{

    public void player(int health,int level){
        System.out.println("Warrior");
        System.out.println("Health :"+health);
        System.out.println("Level :"+level);
        System.out.println();
        this.health=health;
        this.level=level;
    }
}
