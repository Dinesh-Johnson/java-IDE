package runner;

import com.xworkz.polymophsim.MusicalInstrument;

public class MusicalInstrumentsRunner {

    public static void main(String[] args) {

        MusicalInstrument m1 = new MusicalInstrument();

        m1.music();
        System.out.println();

        String[] instrument={"Guitar","Piano","Violin"};
        m1.music(instrument,1);
    }
}
