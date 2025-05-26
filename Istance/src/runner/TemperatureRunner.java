package runner;

import com.xworkz.instance.Temperature;

public class TemperatureRunner {
    public static void main(String[] args) {

        Temperature temp=new Temperature(40);
        System.out.println();

        Temperature temp2= new Temperature(89.6,40.0);
        System.out.println();
    }
}
