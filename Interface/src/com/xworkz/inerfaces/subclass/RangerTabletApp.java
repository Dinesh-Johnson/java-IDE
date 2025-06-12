package com.xworkz.inerfaces.subclass;

import com.xworkz.inerfaces.interfaces.WildlifeTracker;

public class RangerTabletApp implements WildlifeTracker {
    String[] species = new String[10];
    String[] location = new String[10];
    String[] time = new String[10];
    int index = 0;

    public boolean addSighting(String sp, String loc, String tm) {
        if (index < species.length) {
            species[index] = sp;
            location[index] = loc;
            time[index] = tm;
            index++;
            return true;
        }
        return false;
    }

    public boolean viewSighting(String sp) {
        for (int i = 0; i < index; i++) {
            if (species[i] != null && species[i] == sp) {
                System.out.println(sp + " seen at " + location[i] + " on " + time[i]);
                return true;
            }
        }
        return false;
    }

    public boolean updateSighting(String sp, String newLoc, String newTime) {
        for (int i = 0; i < index; i++) {
            if (species[i] != null && species[i] == sp) {
                location[i] = newLoc;
                time[i] = newTime;
                System.out.println("-----Sighting Updated-----");
                return true;
            }
        }
        return false;
    }

    public boolean deleteSighting(String sp) {
        for (int i = 0; i < index; i++) {
            if (species[i] != null && species[i] == sp) {
                species[i] = null;
                location[i] = null;
                time[i] = null;
                System.out.println("-----Sighting Deleted-----");
                return true;
            }
        }
        return false;
    }

    public void printAllSightings() {
        for (int i = 0; i < index; i++) {
            if (species[i] != null) {
                System.out.println(species[i] + " - " + location[i] + " - " + time[i]);
            }
        }
    }
}
