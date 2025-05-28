package runner;

import com.xworz.method.Precipitaion;

public class PrecipitationRunner {
    public static void main(String[] args) {

        Precipitaion p1=new Precipitaion();
        p1.measure(2);
        Precipitaion.analyze();
        Precipitaion.report("Heavy Rainfall");
    }
}
