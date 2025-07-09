package com.xworkz.inerfaces.runner;

import com.xworkz.inerfaces.subclass.SkyFleetOperator;

public class FlightRouteRunner {
    public static void main(String[] args) {

        SkyFleetOperator operator=new SkyFleetOperator();
        operator.addRoute("AB12",345,"Checkpoint1");
        operator.addRoute("CD34",567,"Checkpoint2");
        operator.printAllRoutes();
        operator.updateRoute("CD34",567,"Checkpoint3");
        operator.viewRoute("CD34");
        operator.deleteRoute("AB12");
        operator.printAllRoutes();
    }
}
