package com.xworkz.abstracts.runner;

import com.xworkz.abstracts.child.Sculpture;

public class MuseumRunner {
    public static void main(String[] args) {

        Sculpture sculpture=new Sculpture("India",300,"Stone");
        sculpture.showHistoricalRelevance();
        System.out.println(sculpture);
    }
}
