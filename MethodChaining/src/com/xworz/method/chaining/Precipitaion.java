package com.xworz.method.chaining;

public class Precipitaion {
    public Precipitaion() {
        this("Rain",2);
        System.out.println("Default precipitation");
    }

    public Precipitaion(String type,int cm) {
        this("Bangalore");
        System.out.println("Precipitation type: " + type+"-"+cm+"cm");
    }
    public Precipitaion(String location){
        System.out.println("Location :"+location);
    }

    public void start() {
        measure(2);
        System.out.println("Starting precipitation..");
    }

    public void measure(int cm) {
        System.out.println("Measuring precipitation..."+cm+"cm");
        analyze();
        System.out.println();
    }

    public static void analyze() {
        System.out.println("Analyzing precipitation...");
        report("Heavy Rainfall");
        System.out.println();
    }

    public static void report(String reporting) {
        System.out.println("Reporting data :"+reporting);
    }
}
