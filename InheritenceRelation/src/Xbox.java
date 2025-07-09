public class Xbox extends GameConsole{
    public Xbox(int featureFlags){
        super("Xbox",featureFlags);
    }

    @Override
    public void showFeatures(){
        System.out.println("X-box Features:");
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
