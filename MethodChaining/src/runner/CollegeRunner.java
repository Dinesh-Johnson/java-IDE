package runner;

import com.xworz.method.chaining.College;

public class CollegeRunner {
    public static void main(String[] args) {

        College c1=new College();
        System.out.println();
        c1.enrollStudent();
        System.out.println();
        College.exam();
        System.out.println();
    }
}
