package com.xworkz.inerfaces.subclass;

import com.xworkz.inerfaces.interfaces.FlightRouteService;

public class SkyFleetOperator implements FlightRouteService {

    String[] routeCodes = new String[10];
    int[] distances = new int[10];
    String[] checkpoints = new String[10];
    int index = 0;

    public boolean addRoute(String code, int distance, String checkpoint) {
        if (index < routeCodes.length) {
            routeCodes[index] = code;
            distances[index] = distance;
            checkpoints[index] = checkpoint;
            index++;
            return true;
        }
        return false;
    }

    public boolean viewRoute(String code) {
        for (int i = 0; i < index; i++) {
            if (routeCodes[i] != null && routeCodes[i] == code) {
                System.out.println(code + " - " + distances[i] + "km - " + checkpoints[i]);
                return true;
            }
        }
        return false;
    }

    public boolean updateRoute(String code, int newDistance, String newCheckpoint) {
        for (int i = 0; i < index; i++) {
            if (routeCodes[i] != null && routeCodes[i] == code) {
                distances[i] = newDistance;
                checkpoints[i] = newCheckpoint;
                System.out.println("-----ROUTE UPDATED-----");
                return true;
            }
        }
        return false;
    }

    public boolean deleteRoute(String code) {
        for (int i = 0; i < index; i++) {
            if (routeCodes[i] != null && routeCodes[i] == code) {
                routeCodes[i] = null;
                distances[i] = 0;
                checkpoints[i] = null;
                System.out.println("-----ROUTE DELETED-----");
                return true;
            }
        }
        return false;
    }

    public void printAllRoutes() {
        for (int i = 0; i < index; i++) {
            if (routeCodes[i] != null) {
                System.out.println(routeCodes[i] + " - " + distances[i] + "km - " + checkpoints[i]);
            }
        }
    }
}
