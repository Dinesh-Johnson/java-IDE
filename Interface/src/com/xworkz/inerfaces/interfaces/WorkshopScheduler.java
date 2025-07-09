package com.xworkz.inerfaces.interfaces;

public interface WorkshopScheduler {

    boolean addWorkshop(String title, String trainer, String date);
    boolean viewWorkshop(String title);
    boolean updateWorkshop(String title, String newTrainer, String newDate);
    boolean deleteWorkshop(String title);
    void printAllWorkshops();
}
