package com.xworz.method.chaining;

public class SocialMedia {

    public SocialMedia(){
        this("emailid@gmail.com");
        System.out.println("..Social Media Log in..");
        System.out.println("*******************");
    }
    public SocialMedia(String userID){
        System.out.println("Username/mail :"+userID);
        System.out.println();
    }
    public void post(){
        post("Love");
        System.out.println("Create a Post");
        System.out.println();
    }
    public void post(String reactions){
        System.out.println("Notification");
        System.out.println("Your has react with :"+reactions);
        System.out.println();
    }
    public static void friends(){
        friends("Memes",16000);
        System.out.println("Profile Details");
        System.out.println();
    }
    public static void friends(String pageName,int followers){
        System.out.println("Page name :"+pageName);
        System.out.println("Followers :"+followers+"--Followers");
    }
}
