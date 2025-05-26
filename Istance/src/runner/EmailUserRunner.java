package runner;

import com.xworkz.instance.EmailUser;

public class EmailUserRunner {
    public static void main(String[] args) {

        EmailUser mailID=new EmailUser("danealdinesh@gmail.com","1234");
        System.out.println();

        EmailUser mailID1=new EmailUser("danealdinesh@gmail.com");
        System.out.println();
    }
}
