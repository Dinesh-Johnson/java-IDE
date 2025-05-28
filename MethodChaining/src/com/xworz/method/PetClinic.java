package com.xworz.method;

public class PetClinic {
    public PetClinic() {
        this("Cat");
        System.out.println("All Pets clinic");
        System.out.println();
    }

    public PetClinic(String animal){
        registerPet("Neko",10);
        System.out.println("Treating: " + animal);
        System.out.println();
    }

    public void registerPet(String name,int age){
        diagnose();
        System.out.println("...Pet registered...");
        System.out.println("Pet Name :"+name+"-");
        System.out.println("Age :"+age);
        System.out.println();
    }

    public void diagnose(){
        System.out.println("Diagnosing pet...");
        updateRecords("healthy");
        System.out.println();
    }

    public static void updateRecords(String state){
        System.out.println("...Updating records...");
        System.out.println(state);
        notifyOwner("notified");
        System.out.println();
    }

    public static void notifyOwner(String notify){
        System.out.println("Owner "+notify);
    }
}

