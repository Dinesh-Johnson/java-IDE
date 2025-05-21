package com.xworkz.event.creator;

public class EventCreatorRunner {

    public static void main(String[] args) {

        EventCreator.createEvent("Engagement");
        System.out.println();

        EventCreator.createEvent("Engagement",500);
        System.out.println();

        EventCreator.createEvent("Enagagemnt","Namakkal","12/09/2025");
    }
}
