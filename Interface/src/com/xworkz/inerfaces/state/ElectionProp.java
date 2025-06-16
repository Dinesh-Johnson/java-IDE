package com.xworkz.inerfaces.state;

public class ElectionProp {

    private String username;
    private String email;
    private long contactNumber;
    private String education;
    private int age;
    private String dOB;
    private String fatherName;
    private String motherName;
    private String Address;

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public void setContactNumber(long contactNumber) {
        this.contactNumber = contactNumber;
    }

    public void setdOB(String dOB) {
        this.dOB = dOB;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public void setMotherName(String motherName) {
        this.motherName = motherName;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public String getEducation() {
        return education;
    }

    public String getUsername() {
        return username;
    }

    public long getContactNumber() {
        return contactNumber;
    }

    public String getAddress() {
        return Address;
    }

    public String getdOB() {
        return dOB;
    }

    public String getFatherName() {
        return fatherName;
    }

    public String getMotherName() {
        return motherName;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "ElectionProp{" +
                "username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", contactNumber=" + contactNumber +
                ", education='" + education + '\'' +
                ", dOB='" + dOB + '\'' +
                ", fatherName='" + fatherName + '\'' +
                ", motherName='" + motherName + '\'' +
                ", Address='" + Address + '\'' +
                '}';
    }
}

