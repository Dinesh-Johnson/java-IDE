package com.xworkz.inerfaces.interfaces;

public interface FlightRouteService {

    public boolean addRoute(String code, int distance, String checkpoint);
    public boolean viewRoute(String code);
    public boolean updateRoute(String code, int newDistance, String newCheckpoint);
    public boolean deleteRoute(String code);
    public void printAllRoutes();
}
