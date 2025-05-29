package com.xworz.method;

public class BattleMage extends Character{

    // 7. Create a class Character with health and level. Derive Mage and Warrior from Character. Then create a class BattleMage that inherits from both Mage and Warrior.
    //Simulate a duel and demonstrate the hybrid inheritance model
    Mage mage =new Mage();
    Warrior warrior=new Warrior();

    public void battle(){
        mage.player2(150,100);
        warrior.player(300,150);
        System.out.println("Health :"+mage.health);
    }
}
