package com.xworkz.assignment.shopping;

public class WaterTank {
    //Create a WaterTank class with capacity and currentLevel. Write methods to fill and empty tank.

    int capacity;
    int currentLevel;

    public WaterTank(int capacity){
        this.capacity=capacity;
        this.currentLevel=0;
    }
    public void fill(int amount) {
        currentLevel = currentLevel + amount;
        if (currentLevel > capacity) {
            currentLevel = capacity;
        }
    }
    public void empty(int amount) {
        currentLevel = currentLevel - amount;
        if (currentLevel < 0) {
            currentLevel = 0;
        }
    }
    public int getCurrentLevel() {
        return currentLevel;
    }

}
