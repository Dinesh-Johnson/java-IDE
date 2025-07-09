package com.xworz.method;

public class Fan {
    String deviceName;
    boolean powerStatus;

    public void togglePower() {
        if (!powerStatus) {
            powerStatus = true;
            System.out.println(deviceName + " is ON");
        } else {
            powerStatus = false;
            System.out.println(deviceName + " is OFF");
        }
    }
}
