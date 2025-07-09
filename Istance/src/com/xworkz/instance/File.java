package com.xworkz.instance;

public class File {

    public int bytes;
    public int kilobytes;

    public File(int bytes){
        System.out.println("Bytes :"+bytes);
        this.bytes=bytes;
    }
    public File(int kilobytes,int bytes){
        this.bytes=kilobytes*1024;
        System.out.println("Converted Bytes: " + this.bytes);
    }
}
