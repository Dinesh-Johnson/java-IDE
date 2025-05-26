package runner;

import com.xworkz.instance.Football;

public class FootbalLRunner {
    public static void main(String[] args) {

        Football winner = new Football(547);
        System.out.println("Club Name :"+winner.clubName);



        System.out.println("************");
        System.out.println("The Pichchi Award Winner");
        System.out.println("************");
        System.out.println(winner.playerName+" - "+winner.goals+"  Goals");

    }
}
