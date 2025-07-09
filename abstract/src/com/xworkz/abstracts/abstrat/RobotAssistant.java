package com.xworkz.abstracts.abstrat;

public abstract class RobotAssistant {
    public String model;
    public String languageSupport;
    public int batteryLife;


    public RobotAssistant(String model) {
        this.model = model;
    }

    public RobotAssistant(String model, String languageSupport) {
        this.model = model;
        this.languageSupport = languageSupport;
    }

    public RobotAssistant(String model, String languageSupport, int batteryLife) {
        this.model = model;
        this.languageSupport = languageSupport;
        this.batteryLife = batteryLife;
    }


    public void display() {
        System.out.println("Model: " + model);
        System.out.println("Language Support: " + languageSupport);
        System.out.println("Battery Life: " + batteryLife + " hours");
    }
}
