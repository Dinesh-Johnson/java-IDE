package com.xworkz.booking.assignment;

import com.xworkz.booking.constants.Role;

public class RoleRunner {
    public static void main(String[] args){
        checkAccess(Role.MANAGER);
    }

    public static void checkAccess(Role role){

        if (role == Role.ADMIN || role == Role.MANAGER){
            System.out.println("Access Granted");
        }
        else{
            System.out.println("Access Denied");
        }
    }
}
