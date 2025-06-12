package com.xworkz.abstracts.abstrat;

public abstract class MuseumArtifact {

    public String origin;
    public int age;
    public String material;

    public MuseumArtifact(String origin, int age, String material) {
        this.origin = origin;
        this.age = age;
        this.material = material;
    }

    @Override
    public String toString() {
        return "MuseumArtifact{" +
                "origin='" + origin + '\'' +
                ", age=" + age +
                ", material='" + material + '\'' +
                '}';
    }
    public abstract void showHistoricalRelevance();
}
