package com.xworz.method;

public class Character {
   // 7. Create a class Character with health and level. Derive Mage and Warrior from Character. Then create a class BattleMage that inherits from both Mage and Warrior.
    //Simulate a duel and demonstrate the hybrid inheritance model

    int health;
    int level;

    public void Warrior(int health,int level){
        System.out.println("***Battle Begins***");
        this.health=health;
        this.level=level;
    }
}
