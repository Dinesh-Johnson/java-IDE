package com.xworkz.booking.assignment;

import com.xworkz.booking.constants.SubscriptionPlan;

public class SubscriptionPlanRunner {
    public static void main(String[] args) {
        SubscriptionPlan plan = SubscriptionPlan.PREMIUM;

        if(plan == SubscriptionPlan.FREE) {
            System.out.println("FREE: Basic features");
        }
        else if(plan == SubscriptionPlan.BASIC) {
            System.out.println("BASIC: More features");
        }
        else if(plan == SubscriptionPlan.PREMIUM) {
            System.out.println("PREMIUM: All features");
        }
    }
}
