package com.xworkz.assoication.things;

public class Country {
    private String primeMinister;
    private String capitalName;
    private State state;


    public Country(String primeMinister, String capitalName, State state) {
        this.primeMinister = primeMinister;
        this.capitalName = capitalName;
        this.state = state;
    }

    public void setCapitalName(String capitalName) {
        this.capitalName = capitalName;
    }

    public void setPrimeMinister(String primeMinister) {
        this.primeMinister = primeMinister;
    }

    public String getCapitalName() {
        return capitalName;
    }

    public String getPrimeMinister() {
        return primeMinister;
    }

    @Override
    public String toString() {
        return "Country{" +
                "primeMinister='" + primeMinister + '\'' +
                ", capitalName='" + capitalName + '\'' +
                ", state=" + state +
                '}';
    }
}
