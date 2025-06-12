package com.xworkz.abstracts.abstrat;

public abstract class DeliveryDrone {
    public int altitudeRange;
    public double loadCapacity;

    public DeliveryDrone(int altitudeRange) {
        this.altitudeRange = altitudeRange;
    }

    public DeliveryDrone(int altitudeRange, double loadCapacity) {
        this.altitudeRange = altitudeRange;
        this.loadCapacity = loadCapacity;
    }
    public abstract void displaySpec();
}
