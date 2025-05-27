package com.xworkz.instance;

public class SoundLevel {
    private int db;

    public SoundLevel(int db) {
        this.db = db;
        System.out.println("dB: " + db);
    }

    public SoundLevel(String loudness,int db) {
        if (db == 60) {
            System.out.println("Loud");
        } else if (db<50&& db>=10) {
            System.out.println("Quiet");
        } else if (db==50) {
            System.out.println("moderate");
        }
        System.out.println("Converted dB: " + db);
    }
}
