package runner;

import com.xworkz.instance.Instance;

public class InstanceRunner {

    public static void main(String[] args) {

        Instance instance=new Instance();
        System.out.println("Name :"+instance.name);
        System.out.println("Age :"+instance.age);
    }
}
