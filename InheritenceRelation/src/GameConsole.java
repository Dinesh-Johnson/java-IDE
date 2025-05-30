public class GameConsole {
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

    String name;
    int featureFlags;//
    public static int VR = 1<<0;
    public static int FOUR_K =1<<1;
    public static int Online_Play = 1<<2;
    //int features = vR | onlinePlay;

    public GameConsole(String name,int featureFlags){
        this.featureFlags=featureFlags;
        this.name=name;
    }
    public void showFeatures(){
        System.out.println(name+" Features:");
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
