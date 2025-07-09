package com.xworkz.abstracts.child;

public class UserInformation {

    private String name;
    private int mobile;

    public void setMobile(int mobile) {
        this.mobile = mobile;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMobile() {
        return mobile;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "UserDeatils{" +
                "name='" + name + '\'' +
                ", mobile=" + mobile +
                '}';
    }
}
