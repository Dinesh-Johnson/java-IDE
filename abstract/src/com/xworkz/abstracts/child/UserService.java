package com.xworkz.abstracts.child;

import com.xworkz.abstracts.abstrat.UserDetails;

public class UserService extends UserDetails {

    UserInformation[] userarray= new UserInformation[3];
    int index=0;

    @Override
    public boolean showUser(UserInformation userDeatils) {
        System.out.println("User Details :"+userDeatils);
        if (index < userarray.length) {
            System.out.println("Array has Storage to store");
            userarray[index]=userDeatils;
            index++;
        }else{
            System.err.println("Arrays do not have a Storage");
        }
        return true;
    }
}
