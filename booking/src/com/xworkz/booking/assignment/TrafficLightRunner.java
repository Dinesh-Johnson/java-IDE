package com.xworkz.booking.assignment;

import com.xworkz.booking.constants.TrafficLight;

public class TrafficLightRunner {
    public static void main(String[] args) {
        TrafficLight light = TrafficLight.RED;

        if (light == TrafficLight.RED) {
            System.out.println("Stop");
        } else if (light == TrafficLight.YELLOW) {
            System.out.println("Ready");
        } else if (light == TrafficLight.GREEN) {
            System.out.println("Go");
        }
    }

}
