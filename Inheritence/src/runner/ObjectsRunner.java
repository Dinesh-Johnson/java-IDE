package runner;

import com.xworkz.inheritence.Objects;

public class ObjectsRunner {

    public static void main(String[] args) {
        new Objects();
        System.out.println("Objects Runner");

        new Objects("Desktops");
        System.out.println();

        String[] objectNames={"Moniter","Mouse","Keybords","processor"};
        new Objects(objectNames,1);
        System.out.println();

        Objects o = new Objects();
        o.thing="Electronics";
        o.type();
    }
}
