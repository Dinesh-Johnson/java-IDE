package runner;

import com.xworz.method.PetClinic;

public class PetClinicRunner {
    public static void main(String[] args) {

        PetClinic p1=new PetClinic();
        p1.registerPet("Billy",11);
        p1.diagnose();
        PetClinic.updateRecords("Toothache");
    }
}
