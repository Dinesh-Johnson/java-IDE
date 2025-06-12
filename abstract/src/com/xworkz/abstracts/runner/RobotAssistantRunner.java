package com.xworkz.abstracts.runner;

import com.xworkz.abstracts.abstrat.RobotAssistant;
import com.xworkz.abstracts.child.DomesticBot;

public class RobotAssistantRunner {
    public static void main(String[] args) {
        DomesticBot robot= new DomesticBot("RoboCop","English,Tamil,Kannada",16);
        robot.greet();
        robot.display();
    }
}
