public class Playstation extends GameConsole{
    //1. Gaming Console Feature System
    //Scenario:
    //A game company has different consoles like PlayStation and Xbox. They share base functionality, but each has unique features.
    //
    //Concepts tested:
    //
    //GameConsole is a base class with a featureFlags integer (bitwise flags: VR Support, 4K Output, Online Play).
    //
    //PlayStation and Xbox are subclasses that override showFeatures().
    //
    //Constructor chaining initializes shared fields like console name.
    //
    //You must use bitwise operations to check if features are enabled (if (featureFlags & VR) != 0).
    public Playstation(int featureFlags){
        super("Playstation",featureFlags);
    }

    @Override
    public void showFeatures(){
        System.out.println("PS5 Features:");
        if ((featureFlags & VR) !=0){
            System.out.println("VR Enabled");
        }
        if ((featureFlags & FOUR_K) !=0){
            System.out.println("4k Enabled");
        }
        if ((featureFlags & Online_Play) !=0){
            System.out.println("Online Play Enabled");
        }
    }
}
