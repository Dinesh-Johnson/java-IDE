package com.xworkz.abstracts.abstrat;

public abstract class VirtualInstrument {
    public String instrumentType;
    public String soundBank;
    public int latency;

    public VirtualInstrument(String instrumentType) {
        this.instrumentType = instrumentType;
    }

    public VirtualInstrument(String instrumentType, String soundBank) {
        this.instrumentType = instrumentType;
        this.soundBank = soundBank;
    }

    public VirtualInstrument(String instrumentType, String soundBank, int latency) {
        this.instrumentType = instrumentType;
        this.soundBank = soundBank;
        this.latency = latency;
    }

    public abstract void playNote();
}
