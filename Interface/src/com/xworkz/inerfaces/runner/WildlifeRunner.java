package com.xworkz.inerfaces.runner;

import com.xworkz.inerfaces.subclass.RangerTabletApp;

public class WildlifeRunner {
    public static void main(String[] args) {

        RangerTabletApp app = new RangerTabletApp();
        app.addSighting("Elephant", "Forest Zone A", "9:00 AM");
        app.addSighting("Tiger", "Zone B", "10:15 AM");
        app.printAllSightings();
        app.updateSighting("Tiger", "Zone C", "10:30 AM");
        app.viewSighting("Tiger");
        app.deleteSighting("Elephant");
        app.printAllSightings();
    }
}
