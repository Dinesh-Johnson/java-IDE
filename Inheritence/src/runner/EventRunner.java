package runner;

import com.xworkz.inheritence.Event;

public class EventRunner {

    public static void main(String[] args) {
        new Event();
        System.out.println("Event Runner");

        new Event("Marriage");
        System.out.println();

        new Event(12,9,2025);
        System.out.println();

        Event e = new Event();
       e.occation = "Birthday";
       e.display();
    }
}
