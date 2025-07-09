public class ConsoleRunner {
    public static void main(String[] args) {


        int allFeatures=GameConsole.VR | GameConsole.FOUR_K |GameConsole.Online_Play;
        int basicFeatures = GameConsole.FOUR_K;

        Playstation ps5=new Playstation(allFeatures);
        Xbox xbox=new Xbox(basicFeatures);

        ps5.showFeatures();
        System.out.println();
        xbox.showFeatures();

    }
}
