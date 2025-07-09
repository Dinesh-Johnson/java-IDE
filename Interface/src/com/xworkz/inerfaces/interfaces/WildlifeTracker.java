package com.xworkz.inerfaces.interfaces;

public interface WildlifeTracker {

    public boolean addSighting(String species, String location, String time);
    public boolean viewSighting(String species);
    public boolean updateSighting(String species, String newLocation, String newTime);
    public boolean deleteSighting(String species);
    public void printAllSightings();
}