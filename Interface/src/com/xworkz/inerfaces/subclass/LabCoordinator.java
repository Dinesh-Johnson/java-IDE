package com.xworkz.inerfaces.subclass;

import com.xworkz.inerfaces.interfaces.WorkshopScheduler;

public class LabCoordinator implements WorkshopScheduler {
    String[] titles = new String[6];
    String[] trainers = new String[6];
    String[] dates = new String[6];
    int index = 0;

    public boolean addWorkshop(String title, String trainer, String date) {
        if (index < titles.length) {
            titles[index] = title;
            trainers[index] = trainer;
            dates[index] = date;
            index++;
            return true;
        }
        return false;
    }

    public boolean viewWorkshop(String title) {
        for (int i = 0; i < index; i++) {
            if (titles[i] != null && titles[i] == title) {
                System.out.println(title + " by " + trainers[i] + " on " + dates[i]);
                return true;
            }
        }
        return false;
    }

    public boolean updateWorkshop(String title, String newTrainer, String newDate) {
        for (int i = 0; i < index; i++) {
            if (titles[i] != null && titles[i] == title) {
                trainers[i] = newTrainer;
                dates[i] = newDate;
                return true;
            }
        }
        return false;
    }

    public boolean deleteWorkshop(String title) {
        for (int i = 0; i < index; i++) {
            if (titles[i] != null && titles[i] == title) {
                titles[i] = null;
                trainers[i] = null;
                dates[i] = null;
                return true;
            }
        }
        return false;
    }

    public void printAllWorkshops() {
        for (int i = 0; i < index; i++) {
            if (titles[i] != null) {
                System.out.println(titles[i] + " - " + trainers[i] + " - " + dates[i]);
            }
        }
        System.out.println("Remaining Workshops:");
    }
}
