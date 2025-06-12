package com.xworkz.abstracts.child;

import com.xworkz.abstracts.abstrat.MuseumArtifact;

public class Sculpture extends MuseumArtifact {


    public Sculpture(String origin, int age, String material) {
        super(origin, age, material);
    }

    @Override
    public void showHistoricalRelevance() {
        System.out.println("Museum Artifact Sculpture");
    }
}
