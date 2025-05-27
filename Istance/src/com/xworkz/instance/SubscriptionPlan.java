package com.xworkz.instance;

public class SubscriptionPlan {
    String planName;
    int duration;

    public SubscriptionPlan(String planName) {
        this.planName = planName;
        this.duration = 30;
        System.out.println("Plan: " + planName + ", Duration: " + duration + " days");
    }

    public SubscriptionPlan(String planName, int duration) {
        this.planName = planName;
        this.duration = duration;
        System.out.println("Plan: " + planName + ", Duration: " + duration + " days");
    }
}
