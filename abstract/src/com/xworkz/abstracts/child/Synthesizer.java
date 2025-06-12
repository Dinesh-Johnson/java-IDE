package com.xworkz.abstracts.child;

import com.xworkz.abstracts.abstrat.VirtualInstrument;

public class Synthesizer extends VirtualInstrument {

    public Synthesizer(String instrumentType, String soundBank, int latency) {
        super(instrumentType, soundBank, latency);
    }

    @Override
    public void playNote() {
        System.out.println("Playing note using " + soundBank + " with " + latency + "ms latency.");
    }

    public void displayInfo() {
        System.out.println("Instrument Type: " + instrumentType);
        System.out.println("Sound Bank: " + soundBank);
        System.out.println("Latency: " + latency + "ms");
    }
}
