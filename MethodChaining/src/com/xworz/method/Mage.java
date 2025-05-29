package com.xworz.method;

public class Mage extends Character{

    // 7. Create a class Character with health and level. Derive Mage and Warrior from Character. Then create a class BattleMage that inherits from both Mage and Warrior.
    //Simulate a duel and demonstrate the hybrid inheritance model

    public void player2(int health,int level){
        System.out.println("Mage");
        System.out.println("Health :"+health);
        System.out.println("Level :"+level);
        System.out.println();
        this.health=health;
        this.level=level;
    }
}
