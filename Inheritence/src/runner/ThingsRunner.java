package runner;

import com.xworkz.inheritence.Things;

public class ThingsRunner {

    public static void main(String[] args) {

        new Things();
        System.out.println("Things Runner");

        new Things("Computer Table");
        System.out.println();

        new Things("Computer Table",1);
        System.out.println();

        Things t = new Things();
        t.object="Wooden Table";
        t.type();
    }
}
