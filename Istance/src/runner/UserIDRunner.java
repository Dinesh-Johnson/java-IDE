package runner;

import com.xworkz.instance.UserID;

public class UserIDRunner {

    public static void main(String[] args) {

        UserID user1= new UserID("JD_Bing","PaSsWoRd");
        System.out.println("Username: " + user1.username);
        System.out.println("Password: " + user1.password);
        System.out.println();

        UserID user2= new UserID("JD_Bing","PaSsWoRd","dinesh.xworz@gmail.com");
        System.out.println("Username: " + user2.username);
        System.out.println("Password: " + user2.password);
        System.out.println("Email: " + user2.email); // will be null
        System.out.println();

        UserID user3= new UserID("JD_Bing","PaSsWoRd","dinesh.xworz@gmail.com",859746998);
        System.out.println("Username: " + user3.username);
        System.out.println("Password: " + user3.password);
        System.out.println("Email: " + user3.email); // will be null
        System.out.println("Phone: " + user3.phoneNumber); // will be 0
        System.out.println();
    }
}
