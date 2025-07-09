package runner;

import com.xworkz.bank.information.JobApplication;

public class JobApplicationRunner {
    public static void main(String[] args) {

        String appName=JobApplication.application();
        System.out.println();

        int exp=JobApplication.application(3);
        System.out.println();

        String skill[]={"Java","HTML","Application Developing "};
        String skillName=JobApplication.application(3,skill);
        System.out.println();

        String apps=JobApplication.application(3,"Bangalore");
        System.out.println();

        String pack=JobApplication.application(3,"Bangalore",35000.00);
        System.out.println();

        String openings=JobApplication.application(true,"Bangalore");
        System.out.println();

        String skills[]={"Java","HTML","Application Developing"};
        String descriptions=JobApplication.application("Andriod Gaming Developer",skills);
        System.out.println();
    }
}
