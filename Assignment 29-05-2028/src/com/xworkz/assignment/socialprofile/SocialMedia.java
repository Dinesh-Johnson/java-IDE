package com.xworkz.assignment.socialprofile;

public class SocialMedia {
    //10.Create a SocialProfile class with followers and posts. Add methods to follow/unfollow and add post.

    int followers;
    int posts;

    public void follow(){
        followers++;
    }
    public void unfollow(){
        if(followers>0) {
            followers--;
        }
    }
    public void addPost() {
        posts++;
    }
    public void showProfile() {
        System.out.println("Followers: " + followers + ", Posts: " + posts);
    }
}
