package com.xworkz.polymophsim;

public class MusicalInstrument {

    public void music(){
        System.out.println("Musical Instruments");
    }
    public void music(String[] name,int a){
        for (int i = 0; i < name.length; i++) {
            System.out.println("Instrument Name : "+name[i]+"_"+a);
        }
    }

}
