package com.xworkz.abstracts.runner;

import com.xworkz.abstracts.child.Synthesizer;

public class VirtualInstrumentRunner {
    public static void main(String[] args) {

        Synthesizer synthesizer=new Synthesizer("Guitar","Pad",20);
        synthesizer.displayInfo();
        synthesizer.playNote();
    }
}
