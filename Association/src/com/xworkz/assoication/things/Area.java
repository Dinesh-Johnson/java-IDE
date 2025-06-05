package com.xworkz.assoication.things;

public class Area {
    private String landmark;
    private int pincode;

    public Area(String landmark, int pincode) {
        this.landmark = landmark;
        this.pincode = pincode;
    }

    public void setLandmark(String landmark) {
        this.landmark = landmark;
    }

    public void setPincode(int pincode) {
        this.pincode = pincode;
    }

    public int getPincode() {
        return pincode;
    }

    public String getLandmark() {
        return landmark;
    }

    @Override
    public String toString() {
        return "Area{" +
                "landmark='" + landmark + '\'' +
                ", pincode=" + pincode +
                '}';
    }
}
