package runner;

import com.xworkz.polymophsim.Events;

public class EventsRunner {

    public static void main(String[] args) {

        Events.event();
        System.out.println();

        Events.event("Wedding");
        System.out.println();

        Events.event("Wedding",12,9);
        System.out.println();
    }
}
