package com.xworz.method;

public class FanRunner {
    public static void main(String[] args) {

        SmartFan f=new SmartFan();
        System.out.println();
        f.deviceName="Ceiling Fan";
        System.out.println();
        f.togglePower();
        System.out.println();
        f.setSpeed(3);
    }
}
