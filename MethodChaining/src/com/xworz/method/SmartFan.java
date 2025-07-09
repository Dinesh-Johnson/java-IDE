package com.xworz.method;

public class SmartFan extends Fan{
    int speed;

    public void setSpeed(int speed){
        this.speed= speed;
        System.out.println(deviceName+" speed set it to "+speed);
    }
}
