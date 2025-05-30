package com.xworkz.inheritence;

public class Webiste {

    public String name;
    private String userName;
    String password;
    protected int page;

    public void getAccess(){
        System.out.println(name);
        System.out.println(userName);
        System.out.println(password);
        System.out.println(page);
    }


}
