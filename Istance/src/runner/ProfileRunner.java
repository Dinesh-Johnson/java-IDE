package runner;

import com.xworkz.instance.Profile;

public class ProfileRunner {

    public static void main(String[] args) {

        Profile bio = new Profile();

        bio.name="Dinesh";
        bio.age=28;
        bio.mobile=787783543;
        bio.address="Bangalore";
        bio.college="Anna university";
        bio.graduate=true;

        String[] sub = bio.subjects;
        for (int i = 0; i < sub.length; i++) {
            System.out.println("Subject :"+sub[i]);

        }
        System.out.println();

        System.out.println("Name :"+bio.name);
        System.out.println("Age :"+bio.age);
        System.out.println("Mobile :"+bio.mobile);
        System.out.println("Address :"+bio.address);
        System.out.println("College :"+bio.college);

        System.out.println("************");

        if (bio.graduate == true) {
            System.out.println("He is graduated");
        }
        else {
            System.out.println("Not Graduated");
        }
        System.out.println("************");
    }
}
