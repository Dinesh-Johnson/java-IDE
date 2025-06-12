package com.xworkz.inerfaces.runner;

import com.xworkz.inerfaces.subclass.LabCoordinator;

public class WorkshopRunner {
    public static void main(String[] args) {

        LabCoordinator coordinator = new LabCoordinator();
        coordinator.addWorkshop("AI Workshop", "Ravi", "01-07-2025");
        coordinator.addWorkshop("Robot Control", "Meena", "05-07-2025");
        coordinator.printAllWorkshops();

        coordinator.updateWorkshop("Robot Control", "Kiran", "06-07-2025");
        coordinator.viewWorkshop("Robot Control");
        coordinator.deleteWorkshop("AI Workshop");
        coordinator.printAllWorkshops();
    }
}
