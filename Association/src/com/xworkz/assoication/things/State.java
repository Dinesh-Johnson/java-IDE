package com.xworkz.assoication.things;

public class State {
    private String stateName;
    private String capitalName;
    private City city;

    public State(String stateName, String capitalName, City city) {
        this.stateName = stateName;
        this.capitalName = capitalName;
        this.city = city;
    }

    public void setCapitalName(String capitalName) {
        this.capitalName = capitalName;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }

    public String getCapitalName() {
        return capitalName;
    }

    public String getStateName() {
        return stateName;
    }

    @Override
    public String toString() {
        return "State{" +
                "stateName='" + stateName + '\'' +
                ", capitalName='" + capitalName + '\'' +
                ", city=" + city +
                '}';
    }
}
