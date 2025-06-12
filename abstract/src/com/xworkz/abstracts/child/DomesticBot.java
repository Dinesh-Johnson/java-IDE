package com.xworkz.abstracts.child;

import com.xworkz.abstracts.abstrat.RobotAssistant;

public class DomesticBot extends RobotAssistant {

    public DomesticBot(String model, String languageSupport, int batteryLife) {
        super(model, languageSupport, batteryLife);
    }

    public void greet() {
        System.out.println("Hello! This is Domestic Assistant.");
    }
}
