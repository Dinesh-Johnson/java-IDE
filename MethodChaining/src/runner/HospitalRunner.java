package runner;

import com.xworz.method.Hospital;

public class HospitalRunner {
    public static void main(String[] args) {

        Hospital h1=new Hospital();
        h1.admit();
        Hospital.discharge(30);
    }
}
